/**
 */
package org.geppetto.model.values.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.geppetto.model.values.Dyamics;
import org.geppetto.model.values.Function;
import org.geppetto.model.values.PhysicalQuantity;
import org.geppetto.model.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dyamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.DyamicsImpl#getInitialCondition <em>Initial Condition</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.DyamicsImpl#getDynamics <em>Dynamics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DyamicsImpl extends ValueImpl implements Dyamics
{
	/**
	 * The cached value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCondition()
	 * @generated
	 * @ordered
	 */
	protected PhysicalQuantity initialCondition;

	/**
	 * The cached value of the '{@link #getDynamics() <em>Dynamics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamics()
	 * @generated
	 * @ordered
	 */
	protected Function dynamics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DyamicsImpl()
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
		return ValuesPackage.Literals.DYAMICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalQuantity getInitialCondition()
	{
		return initialCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialCondition(PhysicalQuantity newInitialCondition, NotificationChain msgs)
	{
		PhysicalQuantity oldInitialCondition = initialCondition;
		initialCondition = newInitialCondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.DYAMICS__INITIAL_CONDITION, oldInitialCondition, newInitialCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialCondition(PhysicalQuantity newInitialCondition)
	{
		if (newInitialCondition != initialCondition)
		{
			NotificationChain msgs = null;
			if (initialCondition != null)
				msgs = ((InternalEObject)initialCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.DYAMICS__INITIAL_CONDITION, null, msgs);
			if (newInitialCondition != null)
				msgs = ((InternalEObject)newInitialCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.DYAMICS__INITIAL_CONDITION, null, msgs);
			msgs = basicSetInitialCondition(newInitialCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.DYAMICS__INITIAL_CONDITION, newInitialCondition, newInitialCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getDynamics()
	{
		if (dynamics != null && dynamics.eIsProxy())
		{
			InternalEObject oldDynamics = (InternalEObject)dynamics;
			dynamics = (Function)eResolveProxy(oldDynamics);
			if (dynamics != oldDynamics)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValuesPackage.DYAMICS__DYNAMICS, oldDynamics, dynamics));
			}
		}
		return dynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetDynamics()
	{
		return dynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamics(Function newDynamics)
	{
		Function oldDynamics = dynamics;
		dynamics = newDynamics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.DYAMICS__DYNAMICS, oldDynamics, dynamics));
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
			case ValuesPackage.DYAMICS__INITIAL_CONDITION:
				return basicSetInitialCondition(null, msgs);
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
			case ValuesPackage.DYAMICS__INITIAL_CONDITION:
				return getInitialCondition();
			case ValuesPackage.DYAMICS__DYNAMICS:
				if (resolve) return getDynamics();
				return basicGetDynamics();
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
			case ValuesPackage.DYAMICS__INITIAL_CONDITION:
				setInitialCondition((PhysicalQuantity)newValue);
				return;
			case ValuesPackage.DYAMICS__DYNAMICS:
				setDynamics((Function)newValue);
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
			case ValuesPackage.DYAMICS__INITIAL_CONDITION:
				setInitialCondition((PhysicalQuantity)null);
				return;
			case ValuesPackage.DYAMICS__DYNAMICS:
				setDynamics((Function)null);
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
			case ValuesPackage.DYAMICS__INITIAL_CONDITION:
				return initialCondition != null;
			case ValuesPackage.DYAMICS__DYNAMICS:
				return dynamics != null;
		}
		return super.eIsSet(featureID);
	}

} //DyamicsImpl
