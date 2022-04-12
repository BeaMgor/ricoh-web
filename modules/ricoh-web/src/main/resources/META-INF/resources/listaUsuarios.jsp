<%@page import="com.ricoh.business.model.Usuario"%>
<%@ include file="/init.jsp" %>



<jsp:useBean id="usuarios" type="java.util.List<com.ricoh.business.model.Usuario>" scope="request"/>
 
<liferay-ui:search-container emptyResultsMessage="No has creado todavía ningún usuario">
    <liferay-ui:search-container-results results="${usuarios}"/>
 
    <liferay-ui:search-container-row className="com.ricoh.business.model.Usuario" modelVar="libro">
        <liferay-ui:search-container-column-text name="Nombre" property="nombre"/>
        <liferay-ui:search-container-column-text name="Apellidos" property="apellidos"/>
        <liferay-ui:search-container-column-text name="Correo" property="correo"/>
        <liferay-ui:search-container-column-text name="Fecha Nacimiento" property="fecha"/>
       
    </liferay-ui:search-container-row>
 
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>