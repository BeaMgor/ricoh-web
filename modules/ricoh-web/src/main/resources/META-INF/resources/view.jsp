<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="ricohweb.caption"/></b>
	<portlet:actionURL name="addUsuario" var="addUsuario"></portlet:actionURL>
	<liferay-ui:success key="success" message="Usuario creado correctamente"/>
	<liferay-ui:error key="error" message="Lo siento, el usuario noha sido registrado" />
	
	<div class="container">
		<aui:form action="<%= addUsuario %>" id="frmUser" name="<portlet:namespace" >	
		        <aui:fieldset>		
		            <aui:input name="nombre" type="text" label="Nombre" required="true" style="background: white" >
		            	<aui:validator name="maxLength">20</aui:validator>
		            </aui:input>
			    	<aui:input name="apellidos" type="text" label="Apellidos" required="true" style="background: white">
			    		<aui:validator name="maxLength">20</aui:validator>
		            </aui:input>
			    	<aui:input name="correo" type="text" label="Correo" required="true" style="background: white">
			    		<aui:validator name="email"/>
		            </aui:input>
		            <aui:input name="fecha" type="date" label="Fecha Nacimiento" required="true" style="background: white"> </aui:input>
		        </aui:fieldset>
		        <aui:button-row>
		            <aui:button type="submit"></aui:button>
		            <aui:button type="reset" value="clear"/>
		        </aui:button-row>
		</aui:form>	
	</div>	
	
</p>