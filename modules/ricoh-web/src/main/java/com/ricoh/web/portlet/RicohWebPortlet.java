package com.ricoh.web.portlet;

import com.ricoh.business.model.Usuario;
import com.ricoh.business.service.UsuarioLocalServiceUtil;
import com.ricoh.web.constants.RicohWebPortletKeys;

import java.util.Date;
import java.text.SimpleDateFormat;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

/**
 * @author Beatriz Martinez
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.bea",
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

	//Añadimos el usurio
	UsuarioLocalServiceUtil.addUsuario(usuario);
	SessionMessages.add(request, "success");

	}
	
	
}