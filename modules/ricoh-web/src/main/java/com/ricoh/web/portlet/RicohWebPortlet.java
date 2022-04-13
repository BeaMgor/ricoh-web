package com.ricoh.web.portlet;

import com.ricoh.business.model.Usuario;
import com.ricoh.business.service.UsuarioLocalServiceUtil;
import com.ricoh.web.constants.RicohWebPortletKeys;

import java.util.Date;
import java.util.List;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.liferay.adaptive.media.exception.AMRuntimeException.IOException;
import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.mail.internet.InternetAddress;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Beatriz Martinez
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.ricoh",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=RicohWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RicohWebPortletKeys.RICOHWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RicohWebPortlet extends MVCPortlet {
	private Log log = LogFactoryUtil.getLog(this.getClass().getName());
	
	@ProcessAction(name = "addUsuario")
	public void addUsuario(ActionRequest request, ActionResponse response) {

	ThemeDisplay themeDisplay =
	(ThemeDisplay) request.getAttribute(com.liferay.portal.kernel.util.WebKeys.THEME_DISPLAY);
	
	Long companyId = themeDisplay.getCompanyId();
	Long groupId = themeDisplay.getScopeGroupId();
	Long userId = themeDisplay.getUserId();
	User user = themeDisplay.getUser();
	String userName = user.getFirstName();
	String nombre = ParamUtil.getString(request, "nombre");
	String apellidos = ParamUtil.getString(request, "apellidos");
	String correo = ParamUtil.getString(request, "correo");
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date fecha = ParamUtil.getDate(request, "fecha", simpleDateFormat);
	Date createDate = ParamUtil.getDate(request, "createDate", simpleDateFormat);
	//creamos el usuario
	Usuario usuario = UsuarioLocalServiceUtil.createUsuario(CounterLocalServiceUtil.increment(Usuario.class.getName()));
	usuario.setNombre(nombre);
	usuario.setApellidos(apellidos);
	usuario.setCorreo(correo);
	usuario.setFecha(fecha);
	usuario.setCompanyId(companyId);
	usuario.setGroupId(groupId);
	usuario.setUserId(userId);
	usuario.setUserName(userName);
	usuario.setCreateDate(createDate);

	//Añadimos el usurio
	UsuarioLocalServiceUtil.addUsuario(usuario);
	//send email 
	SendEmail(correo);
	SessionMessages.add(request, "success");
	response.getRenderParameters().setValue("jspPage", "/listaUsuarios.jsp");

	}
	
	@ProcessAction(name = "basicFormDataWithCaptcha")
    public void basicFormDataWithCaptcha(ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {
		

        try{
            CaptchaUtil.check(actionRequest);
            log.info("CAPTCHA verification successful.");
        }catch(Exception exception) {
            if(exception instanceof CaptchaTextException) {
                SessionErrors.add(actionRequest, exception.getClass(), exception);
                log.error("CAPTCHA verification failed.");
            }
        }
    }

    @Override
    public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
        throws  IOException, PortletException {
        try {
            CaptchaUtil.serveImage(resourceRequest, resourceResponse);
        }catch(Exception exception) {
            log.error(exception.getMessage(), exception);
        }
    }

    protected boolean isCheckMethodOnProcessAction() {
        return _CHECK_METHOD_ON_PROCESS_ACTION;
    }

    private static final boolean _CHECK_METHOD_ON_PROCESS_ACTION = false;
	
    public void SendEmail (String email) {
    	
    	MailMessage mailMessage = new MailMessage();
    	mailMessage.setBody("Usuario creado");
    	mailMessage.setHTMLFormat(true);
    	try {
			mailMessage.setFrom(new InternetAddress("beatriz.mgordillo@gmail.com","Beatriz Martínez"));
			mailMessage.setTo(new InternetAddress(email));
			
			mailMessage.setSubject("Email Subject");
			MailServiceUtil.sendEmail(mailMessage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        final List<Usuario> usuarios = UsuarioLocalServiceUtil.getUsuarios(0, Integer.MAX_VALUE);
     
        renderRequest.setAttribute("usuarios", usuarios);
     
        try {
			super.render(renderRequest, renderResponse);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
    }
    @ProcessAction(name = "deleteUsuario")
    public void deleteUsuario(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException {
        @SuppressWarnings("deprecation")
		final String id = request.getParameter("idUsuario");
     
        UsuarioLocalServiceUtil.deleteUsuario(Long.valueOf(id));
    }
    
}