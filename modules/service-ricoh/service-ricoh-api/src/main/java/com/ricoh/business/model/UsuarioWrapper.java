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

package com.ricoh.business.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Usuario}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Usuario
 * @generated
 */
public class UsuarioWrapper
	extends BaseModelWrapper<Usuario>
	implements ModelWrapper<Usuario>, Usuario {

	public UsuarioWrapper(Usuario usuario) {
		super(usuario);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("usuarioId", getUsuarioId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombre", getNombre());
		attributes.put("apellidos", getApellidos());
		attributes.put("correo", getCorreo());
		attributes.put("fecha", getFecha());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long usuarioId = (Long)attributes.get("usuarioId");

		if (usuarioId != null) {
			setUsuarioId(usuarioId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String apellidos = (String)attributes.get("apellidos");

		if (apellidos != null) {
			setApellidos(apellidos);
		}

		String correo = (String)attributes.get("correo");

		if (correo != null) {
			setCorreo(correo);
		}

		Date fecha = (Date)attributes.get("fecha");

		if (fecha != null) {
			setFecha(fecha);
		}
	}

	@Override
	public Usuario cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the apellidos of this usuario.
	 *
	 * @return the apellidos of this usuario
	 */
	@Override
	public String getApellidos() {
		return model.getApellidos();
	}

	/**
	 * Returns the company ID of this usuario.
	 *
	 * @return the company ID of this usuario
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the correo of this usuario.
	 *
	 * @return the correo of this usuario
	 */
	@Override
	public String getCorreo() {
		return model.getCorreo();
	}

	/**
	 * Returns the create date of this usuario.
	 *
	 * @return the create date of this usuario
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the fecha of this usuario.
	 *
	 * @return the fecha of this usuario
	 */
	@Override
	public Date getFecha() {
		return model.getFecha();
	}

	/**
	 * Returns the group ID of this usuario.
	 *
	 * @return the group ID of this usuario
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this usuario.
	 *
	 * @return the modified date of this usuario
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nombre of this usuario.
	 *
	 * @return the nombre of this usuario
	 */
	@Override
	public String getNombre() {
		return model.getNombre();
	}

	/**
	 * Returns the primary key of this usuario.
	 *
	 * @return the primary key of this usuario
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this usuario.
	 *
	 * @return the user ID of this usuario
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this usuario.
	 *
	 * @return the user name of this usuario
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this usuario.
	 *
	 * @return the user uuid of this usuario
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the usuario ID of this usuario.
	 *
	 * @return the usuario ID of this usuario
	 */
	@Override
	public long getUsuarioId() {
		return model.getUsuarioId();
	}

	/**
	 * Returns the uuid of this usuario.
	 *
	 * @return the uuid of this usuario
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the apellidos of this usuario.
	 *
	 * @param apellidos the apellidos of this usuario
	 */
	@Override
	public void setApellidos(String apellidos) {
		model.setApellidos(apellidos);
	}

	/**
	 * Sets the company ID of this usuario.
	 *
	 * @param companyId the company ID of this usuario
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the correo of this usuario.
	 *
	 * @param correo the correo of this usuario
	 */
	@Override
	public void setCorreo(String correo) {
		model.setCorreo(correo);
	}

	/**
	 * Sets the create date of this usuario.
	 *
	 * @param createDate the create date of this usuario
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the fecha of this usuario.
	 *
	 * @param fecha the fecha of this usuario
	 */
	@Override
	public void setFecha(Date fecha) {
		model.setFecha(fecha);
	}

	/**
	 * Sets the group ID of this usuario.
	 *
	 * @param groupId the group ID of this usuario
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this usuario.
	 *
	 * @param modifiedDate the modified date of this usuario
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nombre of this usuario.
	 *
	 * @param nombre the nombre of this usuario
	 */
	@Override
	public void setNombre(String nombre) {
		model.setNombre(nombre);
	}

	/**
	 * Sets the primary key of this usuario.
	 *
	 * @param primaryKey the primary key of this usuario
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this usuario.
	 *
	 * @param userId the user ID of this usuario
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this usuario.
	 *
	 * @param userName the user name of this usuario
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this usuario.
	 *
	 * @param userUuid the user uuid of this usuario
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the usuario ID of this usuario.
	 *
	 * @param usuarioId the usuario ID of this usuario
	 */
	@Override
	public void setUsuarioId(long usuarioId) {
		model.setUsuarioId(usuarioId);
	}

	/**
	 * Sets the uuid of this usuario.
	 *
	 * @param uuid the uuid of this usuario
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected UsuarioWrapper wrap(Usuario usuario) {
		return new UsuarioWrapper(usuario);
	}

}