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

package com.ricoh.business.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UsuarioLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioLocalService
 * @generated
 */
public class UsuarioLocalServiceWrapper
	implements ServiceWrapper<UsuarioLocalService>, UsuarioLocalService {

	public UsuarioLocalServiceWrapper(UsuarioLocalService usuarioLocalService) {
		_usuarioLocalService = usuarioLocalService;
	}

	@Override
	public void addNewUsuario(
		long groupId, long companyId, long userId, String userName,
		String nombre, String apellidos, String correo, java.sql.Date fecha) {

		_usuarioLocalService.addNewUsuario(
			groupId, companyId, userId, userName, nombre, apellidos, correo,
			fecha);
	}

	/**
	 * Adds the usuario to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UsuarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param usuario the usuario
	 * @return the usuario that was added
	 */
	@Override
	public com.ricoh.business.model.Usuario addUsuario(
		com.ricoh.business.model.Usuario usuario) {

		return _usuarioLocalService.addUsuario(usuario);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _usuarioLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new usuario with the primary key. Does not add the usuario to the database.
	 *
	 * @param usuarioId the primary key for the new usuario
	 * @return the new usuario
	 */
	@Override
	public com.ricoh.business.model.Usuario createUsuario(long usuarioId) {
		return _usuarioLocalService.createUsuario(usuarioId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _usuarioLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UsuarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario that was removed
	 * @throws PortalException if a usuario with the primary key could not be found
	 */
	@Override
	public com.ricoh.business.model.Usuario deleteUsuario(long usuarioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _usuarioLocalService.deleteUsuario(usuarioId);
	}

	/**
	 * Deletes the usuario from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UsuarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param usuario the usuario
	 * @return the usuario that was removed
	 */
	@Override
	public com.ricoh.business.model.Usuario deleteUsuario(
		com.ricoh.business.model.Usuario usuario) {

		return _usuarioLocalService.deleteUsuario(usuario);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _usuarioLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _usuarioLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _usuarioLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _usuarioLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ricoh.business.model.impl.UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _usuarioLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ricoh.business.model.impl.UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _usuarioLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _usuarioLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _usuarioLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.ricoh.business.model.Usuario fetchUsuario(long usuarioId) {
		return _usuarioLocalService.fetchUsuario(usuarioId);
	}

	/**
	 * Returns the usuario matching the UUID and group.
	 *
	 * @param uuid the usuario's UUID
	 * @param groupId the primary key of the group
	 * @return the matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	@Override
	public com.ricoh.business.model.Usuario fetchUsuarioByUuidAndGroupId(
		String uuid, long groupId) {

		return _usuarioLocalService.fetchUsuarioByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _usuarioLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _usuarioLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _usuarioLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _usuarioLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _usuarioLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the usuario with the primary key.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario
	 * @throws PortalException if a usuario with the primary key could not be found
	 */
	@Override
	public com.ricoh.business.model.Usuario getUsuario(long usuarioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _usuarioLocalService.getUsuario(usuarioId);
	}

	/**
	 * Returns the usuario matching the UUID and group.
	 *
	 * @param uuid the usuario's UUID
	 * @param groupId the primary key of the group
	 * @return the matching usuario
	 * @throws PortalException if a matching usuario could not be found
	 */
	@Override
	public com.ricoh.business.model.Usuario getUsuarioByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _usuarioLocalService.getUsuarioByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ricoh.business.model.impl.UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of usuarios
	 */
	@Override
	public java.util.List<com.ricoh.business.model.Usuario> getUsuarios(
		int start, int end) {

		return _usuarioLocalService.getUsuarios(start, end);
	}

	/**
	 * Returns all the usuarios matching the UUID and company.
	 *
	 * @param uuid the UUID of the usuarios
	 * @param companyId the primary key of the company
	 * @return the matching usuarios, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.ricoh.business.model.Usuario>
		getUsuariosByUuidAndCompanyId(String uuid, long companyId) {

		return _usuarioLocalService.getUsuariosByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of usuarios matching the UUID and company.
	 *
	 * @param uuid the UUID of the usuarios
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching usuarios, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.ricoh.business.model.Usuario>
		getUsuariosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.ricoh.business.model.Usuario> orderByComparator) {

		return _usuarioLocalService.getUsuariosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of usuarios.
	 *
	 * @return the number of usuarios
	 */
	@Override
	public int getUsuariosCount() {
		return _usuarioLocalService.getUsuariosCount();
	}

	/**
	 * Updates the usuario in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UsuarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param usuario the usuario
	 * @return the usuario that was updated
	 */
	@Override
	public com.ricoh.business.model.Usuario updateUsuario(
		com.ricoh.business.model.Usuario usuario) {

		return _usuarioLocalService.updateUsuario(usuario);
	}

	@Override
	public UsuarioLocalService getWrappedService() {
		return _usuarioLocalService;
	}

	@Override
	public void setWrappedService(UsuarioLocalService usuarioLocalService) {
		_usuarioLocalService = usuarioLocalService;
	}

	private UsuarioLocalService _usuarioLocalService;

}