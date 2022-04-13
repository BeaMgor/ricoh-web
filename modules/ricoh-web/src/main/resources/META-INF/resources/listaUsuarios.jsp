<%@page import="com.ricoh.business.model.Usuario"%>
<%@ include file="/init.jsp" %>


<jsp:useBean id="usuarios" type="java.util.List<com.ricoh.business.model.Usuario>" scope="request"/>
 
<nav class="navbar navbar-expand-sm navbar-dark bg-white">
	  
	  <button class="navbar-toggler" type="button" data-toggle="collapse" 
	  		  data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
	  		  aria-expanded="false" aria-label="Toggle navigation">
	          <span class="navbar-toggler-icon"></span>
	  </button>

	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	     <li class="nav-item active">
	        <a class="nav-link text-dark aling-left font-weight-bold" href="<%= view %>">Add<span class="sr-only">(current)</span></a>
	      </li>  
	      <li class="nav-item">
	        <a class="nav-link text-dark aling-left font-weight-bold" href="<%= listaUsuarios %>">Lista Usuarios</a>	       
	      </li>
	  </div>
  </nav>
  
<liferay-ui:search-container emptyResultsMessage="No has creado todavía ningún usuario">
    <liferay-ui:search-container-results results="${usuarios}"/>
    <c:set var="nombre"><liferay-ui:message key="ricohweb.nombre"/></c:set>
	<c:set var="apellidos"><liferay-ui:message key="ricohweb.apellidos"/></c:set>
	<c:set var="fechaNacimiento"><liferay-ui:message key="ricohweb.fecha"/></c:set>
	<c:set var="correo"><liferay-ui:message key="ricohweb.correo"/></c:set>
	<c:set var="fechaCrecion"><liferay-ui:message key="ricohweb.fechacreacion"/></c:set>
	<c:set var="eliminar"><liferay-ui:message key="ricohweb.eliminar"/></c:set>
 		
    <liferay-ui:search-container-row className="com.ricoh.business.model.Usuario" modelVar="usuario">
        <liferay-ui:search-container-column-text name="${nombre}" property="nombre"/>
        <liferay-ui:search-container-column-text name="${apellidos}" property="apellidos"/>
        <liferay-ui:search-container-column-text name="${correo}" property="correo"/>
        <liferay-ui:search-container-column-text name="${fechaCreacion}" property="createDate"/>
        <liferay-ui:search-container-column-text name="${fechaNacimiento}" property="fecha"/>
        <liferay-ui:search-container-column-jsp name="${eliminar}" path="/usuarioAccionBtn.jsp"/>
    </liferay-ui:search-container-row>
 
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>