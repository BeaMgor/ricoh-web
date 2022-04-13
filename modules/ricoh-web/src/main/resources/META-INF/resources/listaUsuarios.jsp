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
 
    <liferay-ui:search-container-row className="com.ricoh.business.model.Usuario" modelVar="usuario">
        <liferay-ui:search-container-column-text name="Nombre" property="nombre"/>
        <liferay-ui:search-container-column-text name="Apellidos" property="apellidos"/>
        <liferay-ui:search-container-column-text name="Correo" property="correo"/>
        <liferay-ui:search-container-column-text name="Create Date" property="createDate"/>
        <liferay-ui:search-container-column-text name="Fecha Nacimiento" property="fecha"/>
        <liferay-ui:search-container-column-jsp name="Eliminar" path="/usuarioAccionBtn.jsp"/>
    </liferay-ui:search-container-row>
 
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>