/**
 */
package org.geppetto.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.geppetto.model.GeppettoFactory
 * @model kind="package"
 * @generated
 */
public interface GeppettoPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.geppetto.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gep";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeppettoPackage eINSTANCE = org.geppetto.model.impl.GeppettoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.GeppettoModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.GeppettoModelImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getGeppettoModel()
	 * @generated
	 */
	int GEPPETTO_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL__ASPECTS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.NodeImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_PATH = 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.GeppettoLibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.GeppettoLibraryImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getGeppettoLibrary()
	 * @generated
	 */
	int GEPPETTO_LIBRARY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY__TYPES = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY___GET_PATH = NODE___GET_PATH;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.LibraryManagerImpl <em>Library Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.LibraryManagerImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getLibraryManager()
	 * @generated
	 */
	int LIBRARY_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_MANAGER__LIBRARIES = 0;

	/**
	 * The number of structural features of the '<em>Library Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Library Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_MANAGER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.geppetto.model.GeppettoModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.geppetto.model.GeppettoModel
	 * @generated
	 */
	EClass getGeppettoModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.GeppettoModel#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.geppetto.model.GeppettoModel#getVariables()
	 * @see #getGeppettoModel()
	 * @generated
	 */
	EReference getGeppettoModel_Variables();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.GeppettoModel#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aspects</em>'.
	 * @see org.geppetto.model.GeppettoModel#getAspects()
	 * @see #getGeppettoModel()
	 * @generated
	 */
	EReference getGeppettoModel_Aspects();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.geppetto.model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.geppetto.model.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the '{@link org.geppetto.model.Node#getPath() <em>Get Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Path</em>' operation.
	 * @see org.geppetto.model.Node#getPath()
	 * @generated
	 */
	EOperation getNode__GetPath();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.GeppettoLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.geppetto.model.GeppettoLibrary
	 * @generated
	 */
	EClass getGeppettoLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.GeppettoLibrary#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.geppetto.model.GeppettoLibrary#getTypes()
	 * @see #getGeppettoLibrary()
	 * @generated
	 */
	EReference getGeppettoLibrary_Types();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.LibraryManager <em>Library Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Manager</em>'.
	 * @see org.geppetto.model.LibraryManager
	 * @generated
	 */
	EClass getLibraryManager();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.LibraryManager#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Libraries</em>'.
	 * @see org.geppetto.model.LibraryManager#getLibraries()
	 * @see #getLibraryManager()
	 * @generated
	 */
	EReference getLibraryManager_Libraries();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeppettoFactory getGeppettoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.GeppettoModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.GeppettoModelImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getGeppettoModel()
		 * @generated
		 */
		EClass GEPPETTO_MODEL = eINSTANCE.getGeppettoModel();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEPPETTO_MODEL__VARIABLES = eINSTANCE.getGeppettoModel_Variables();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEPPETTO_MODEL__ASPECTS = eINSTANCE.getGeppettoModel_Aspects();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.NodeImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Get Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_PATH = eINSTANCE.getNode__GetPath();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.GeppettoLibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.GeppettoLibraryImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getGeppettoLibrary()
		 * @generated
		 */
		EClass GEPPETTO_LIBRARY = eINSTANCE.getGeppettoLibrary();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEPPETTO_LIBRARY__TYPES = eINSTANCE.getGeppettoLibrary_Types();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.LibraryManagerImpl <em>Library Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.LibraryManagerImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getLibraryManager()
		 * @generated
		 */
		EClass LIBRARY_MANAGER = eINSTANCE.getLibraryManager();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_MANAGER__LIBRARIES = eINSTANCE.getLibraryManager_Libraries();

	}

} //GeppettoPackage
