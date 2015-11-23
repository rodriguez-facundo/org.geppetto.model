/**
 */
package org.geppetto.model.values.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.geppetto.model.aspect.Aspect;

import org.geppetto.model.values.PointerElement;
import org.geppetto.model.values.ValuesPackage;

import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointer Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.PointerElementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.PointerElementImpl#getAspect <em>Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointerElementImpl extends MinimalEObjectImpl.Container implements PointerElement
{
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached value of the '{@link #getAspect() <em>Aspect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspect()
	 * @generated
	 * @ordered
	 */
	protected Aspect aspect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointerElementImpl()
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
		return ValuesPackage.Literals.POINTER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable()
	{
		if (variable != null && variable.eIsProxy())
		{
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValuesPackage.POINTER_ELEMENT__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable()
	{
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable)
	{
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.POINTER_ELEMENT__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect getAspect()
	{
		if (aspect != null && aspect.eIsProxy())
		{
			InternalEObject oldAspect = (InternalEObject)aspect;
			aspect = (Aspect)eResolveProxy(oldAspect);
			if (aspect != oldAspect)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValuesPackage.POINTER_ELEMENT__ASPECT, oldAspect, aspect));
			}
		}
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect basicGetAspect()
	{
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspect(Aspect newAspect)
	{
		Aspect oldAspect = aspect;
		aspect = newAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.POINTER_ELEMENT__ASPECT, oldAspect, aspect));
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
			case ValuesPackage.POINTER_ELEMENT__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case ValuesPackage.POINTER_ELEMENT__ASPECT:
				if (resolve) return getAspect();
				return basicGetAspect();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ValuesPackage.POINTER_ELEMENT__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case ValuesPackage.POINTER_ELEMENT__ASPECT:
				setAspect((Aspect)newValue);
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
			case ValuesPackage.POINTER_ELEMENT__VARIABLE:
				setVariable((Variable)null);
				return;
			case ValuesPackage.POINTER_ELEMENT__ASPECT:
				setAspect((Aspect)null);
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
			case ValuesPackage.POINTER_ELEMENT__VARIABLE:
				return variable != null;
			case ValuesPackage.POINTER_ELEMENT__ASPECT:
				return aspect != null;
		}
		return super.eIsSet(featureID);
	}

} //PointerElementImpl
