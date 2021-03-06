/**
 */
package org.geppetto.model.datasources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.geppetto.model.datasources.CompoundQuery;
import org.geppetto.model.datasources.DatasourcesPackage;
import org.geppetto.model.datasources.Query;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.impl.CompoundQueryImpl#getQueryChain <em>Query Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundQueryImpl extends QueryImpl implements CompoundQuery
{
	/**
	 * The cached value of the '{@link #getQueryChain() <em>Query Chain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryChain()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> queryChain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundQueryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DatasourcesPackage.Literals.COMPOUND_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQueryChain()
	{
		if (queryChain == null)
		{
			queryChain = new EObjectContainmentEList<Query>(Query.class, this, DatasourcesPackage.COMPOUND_QUERY__QUERY_CHAIN);
		}
		return queryChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case DatasourcesPackage.COMPOUND_QUERY__QUERY_CHAIN:
				return ((InternalEList<?>)getQueryChain()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case DatasourcesPackage.COMPOUND_QUERY__QUERY_CHAIN:
				return getQueryChain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DatasourcesPackage.COMPOUND_QUERY__QUERY_CHAIN:
				getQueryChain().clear();
				getQueryChain().addAll((Collection<? extends Query>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case DatasourcesPackage.COMPOUND_QUERY__QUERY_CHAIN:
				getQueryChain().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case DatasourcesPackage.COMPOUND_QUERY__QUERY_CHAIN:
				return queryChain != null && !queryChain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompoundQueryImpl
