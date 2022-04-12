<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />
	<portlet:renderURL var="view">
	  <portlet:param name="mvcPath" value="/view.jsp" />
    </portlet:renderURL>
	<portlet:renderURL var="listaUsuarios">
		<portlet:param name="mvcPath" value="/listaUsuarios.jsp" />
  	</portlet:renderURL>
	 