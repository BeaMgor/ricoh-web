/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ricoh.business.service.impl;

import com.liferay.portal.aop.AopService;
import com.ricoh.business.model.Usuario;
import com.ricoh.business.model.impl.UsuarioImpl;
import com.ricoh.business.service.base.UsuarioLocalServiceBaseImpl;

import java.sql.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.ricoh.business.model.Usuario",
	service = AopService.class
)
public class UsuarioLocalServiceImpl extends UsuarioLocalServiceBaseImpl {
	
	public void addNewUsuario(long groupId, long companyId, long userId,
			String userName, String nombre, String apellidos, String correo, Date fecha
			) {
			final Usuario usuario = new UsuarioImpl();
			usuario.setUsuarioId(counterLocalService.increment());
			usuario.setGroupId(groupId);
			usuario.setCompanyId(companyId);
			usuario.setUserId(userId);
			usuario.setUserName(userName);
			usuario.setNombre(nombre);
			usuario.setApellidos(apellidos);
			usuario.setCorreo(correo);
			usuario.setFecha(fecha);

			addUsuario(usuario);
			//Cuando hagamos un build este método se generará
			
			}
	
	
}


