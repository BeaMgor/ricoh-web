<%@ include file="./init.jsp" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.taglib.search.ResultRow" %>
<%@ page import="com.ricoh.business.model.Usuario" %>
 
<%
    final ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    final Usuario usuario= (Usuario) row.getObject();
%>
 
<portlet:actionURL name="deleteUsuario" var="deleteUsuarioUrl">
	<portlet:param name="idUsuario" value="<%=String.valueOf(usuario.getUsuarioId())%>"/>
</portlet:actionURL>
<liferay-ui:icon-menu>
    <liferay-ui:icon image="delete" message="Eliminar" url="<%=deleteUsuarioUrl%>"/>
</liferay-ui:icon-menu>