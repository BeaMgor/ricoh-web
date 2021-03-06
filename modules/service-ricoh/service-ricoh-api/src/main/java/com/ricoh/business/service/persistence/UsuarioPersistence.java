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

package com.ricoh.business.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.ricoh.business.exception.NoSuchUsuarioException;
import com.ricoh.business.model.Usuario;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioUtil
 * @generated
 */
@ProviderType
public interface UsuarioPersistence extends BasePersistence<Usuario> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UsuarioUtil} to access the usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the usuarios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching usuarios
	 */
	public java.util.List<Usuario> findByUuid(String uuid);

	/**
	 * Returns a range of all the usuarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of matching usuarios
	 */
	public java.util.List<Usuario> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the usuarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching usuarios
	 */
	public java.util.List<Usuario> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Usuario>
			orderByComparator);

	/**
	 * Returns an ordered range of all the usuarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching usuarios
	 */
	public java.util.List<Usuario> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Usuario>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first usuario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario
	 * @throws NoSuchUsuarioException if a matching usuario could not be found
	 */
	public Usuario findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Usuario>
				orderByComparator)
		throws NoSuchUsuarioException;

	/**
	 * Returns the first usuario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	public Usuario fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Usuario>
			orderByComparator);

	/**
	 * Returns the last usuario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario
	 * @throws NoSuchUsuarioException if a matching usuario could not be found
	 */
	public Usuario findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Usuario>
				orderByComparator)
		throws NoSuchUsuarioException;

	/**
	 * Returns the last usuario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	public Usuario fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Usuario>
			orderByComparator);

	/**
	 * Returns the usuarios before and after the current usuario in the ordered set where uuid = &#63;.
	 *
	 * @param usuarioId the primary key of the current usuario
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next usuario
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	public Usuario[] findByUuid_PrevAndNext(
			long usuarioId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Usuario>
				orderByComparator)
		throws NoSuchUsuarioException;

	/**
	 * Removes all the usuarios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of usuarios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching usuarios
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the usuario where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchUsuarioException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching usuario
	 * @throws NoSuchUsuarioException if a matching usuario could not be found
	 */
	public Usuario findByUUID_G(String uuid, long groupId)
		throws NoSuchUsuarioException;

	/**
	 * Returns the usuario where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	public Usuario fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the usuario where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	public Usuario fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the usuario where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the usuario that was removed
	 */
	public Usuario removeByUUID_G(String uuid, long groupId)
		throws NoSuchUsuarioException;

	/**
	 * Returns the number of usuarios where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching usuarios
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the usuarios where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching usuarios
	 */
	public java.util.List<Usuario> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the usuarios where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of matching usuarios
	 */
	public java.util.List<Usuario> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the usuarios where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching usuarios
	 */
	public java.util.List<Usuario> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Usuario>
			orderByComparator);

	/**
	 * Returns an ordered range of all the usuarios where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching usuarios
	 */
	public java.util.List<Usuario> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Usuario>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first usuario in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario
	 * @throws NoSuchUsuarioException if a matching usuario could not be found
	 */
	public Usuario findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Usuario>
				orderByComparator)
		throws NoSuchUsuarioException;

	/**
	 * Returns the first usuario in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	public Usuario fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Usuario>
			orderByComparator);

	/**
	 * Returns the last usuario in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario
	 * @throws NoSuchUsuarioException if a matching usuario could not be found
	 */
	public Usuario findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Usuario>
				orderByComparator)
		throws NoSuchUsuarioException;

	/**
	 * Returns the last usuario in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	public Usuario fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Usuario>
			orderByComparator);

	/**
	 * Returns the usuarios before and after the current usuario in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param usuarioId the primary key of the current usuario
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next usuario
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	public Usuario[] findByUuid_C_PrevAndNext(
			long usuarioId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Usuario>
				orderByComparator)
		throws NoSuchUsuarioException;

	/**
	 * Removes all the usuarios where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of usuarios where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching usuarios
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the usuario in the entity cache if it is enabled.
	 *
	 * @param usuario the usuario
	 */
	public void cacheResult(Usuario usuario);

	/**
	 * Caches the usuarios in the entity cache if it is enabled.
	 *
	 * @param usuarios the usuarios
	 */
	public void cacheResult(java.util.List<Usuario> usuarios);

	/**
	 * Creates a new usuario with the primary key. Does not add the usuario to the database.
	 *
	 * @param usuarioId the primary key for the new usuario
	 * @return the new usuario
	 */
	public Usuario create(long usuarioId);

	/**
	 * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario that was removed
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	public Usuario remove(long usuarioId) throws NoSuchUsuarioException;

	public Usuario updateImpl(Usuario usuario);

	/**
	 * Returns the usuario with the primary key or throws a <code>NoSuchUsuarioException</code> if it could not be found.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	public Usuario findByPrimaryKey(long usuarioId)
		throws NoSuchUsuarioException;

	/**
	 * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
	 */
	public Usuario fetchByPrimaryKey(long usuarioId);

	/**
	 * Returns all the usuarios.
	 *
	 * @return the usuarios
	 */
	public java.util.List<Usuario> findAll();

	/**
	 * Returns a range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of usuarios
	 */
	public java.util.List<Usuario> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of usuarios
	 */
	public java.util.List<Usuario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Usuario>
			orderByComparator);

	/**
	 * Returns an ordered range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of usuarios
	 */
	public java.util.List<Usuario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Usuario>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the usuarios from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of usuarios.
	 *
	 * @return the number of usuarios
	 */
	public int countAll();

}