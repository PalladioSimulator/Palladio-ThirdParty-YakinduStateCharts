/**
 */
package org.yakindu.base.generator.generator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.yakindu.base.base.BasePackage;

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
 * @see org.yakindu.base.generator.generator.GeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.yakindu.org/base/generator/Generator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorPackage eINSTANCE = org.yakindu.base.generator.generator.impl.GeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.CodeElementImpl <em>Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.CodeElementImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getCodeElement()
	 * @generated
	 */
	int CODE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__NAME = BasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__DOCUMENTATION = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__CHILDREN = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__PARENT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT_FEATURE_COUNT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.SourceFileGenImpl <em>Source File Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.SourceFileGenImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getSourceFileGen()
	 * @generated
	 */
	int SOURCE_FILE_GEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_GEN__NAME = CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_GEN__DOCUMENTATION = CODE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_GEN__CHILDREN = CODE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_GEN__PARENT = CODE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_GEN__PACKAGE = CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_GEN__IMPORTS = CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source File Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_GEN_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.ClassGenImpl <em>Class Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.ClassGenImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getClassGen()
	 * @generated
	 */
	int CLASS_GEN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GEN__NAME = CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GEN__DOCUMENTATION = CODE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GEN__CHILDREN = CODE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GEN__PARENT = CODE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GEN__VISIBILITY = CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GEN__ABSTRACT = CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GEN__SUPER_CLASS = CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GEN__IMPLEMENTS = CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GEN__DECLARATION = CODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GEN_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.ClassDeclarationGenImpl <em>Class Declaration Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.ClassDeclarationGenImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getClassDeclarationGen()
	 * @generated
	 */
	int CLASS_DECLARATION_GEN = 3;

	/**
	 * The feature id for the '<em><b>Class Gen</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_GEN__CLASS_GEN = 0;

	/**
	 * The number of structural features of the '<em>Class Declaration Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_GEN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.InterfaceGenImpl <em>Interface Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.InterfaceGenImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getInterfaceGen()
	 * @generated
	 */
	int INTERFACE_GEN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GEN__NAME = CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GEN__DOCUMENTATION = CODE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GEN__CHILDREN = CODE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GEN__PARENT = CODE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GEN__VISIBILITY = CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GEN__SUPER_CLASS = CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GEN_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.MethodGenImpl <em>Method Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.MethodGenImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getMethodGen()
	 * @generated
	 */
	int METHOD_GEN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_GEN__NAME = CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_GEN__DOCUMENTATION = CODE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_GEN__CHILDREN = CODE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_GEN__PARENT = CODE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_GEN__VISIBILITY = CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_GEN__ABSTRACT = CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_GEN__PARAMETERS = CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_GEN__RETURN_TYPE = CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_GEN__DECLARATION = CODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Method Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_GEN_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.MethodDeclarationGenImpl <em>Method Declaration Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.MethodDeclarationGenImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getMethodDeclarationGen()
	 * @generated
	 */
	int METHOD_DECLARATION_GEN = 6;

	/**
	 * The feature id for the '<em><b>Method Gen</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_GEN__METHOD_GEN = 0;

	/**
	 * The number of structural features of the '<em>Method Declaration Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_GEN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.AccessRestrictedImpl <em>Access Restricted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.AccessRestrictedImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getAccessRestricted()
	 * @generated
	 */
	int ACCESS_RESTRICTED = 7;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RESTRICTED__VISIBILITY = 0;

	/**
	 * The number of structural features of the '<em>Access Restricted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RESTRICTED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.VariableGenImpl <em>Variable Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.VariableGenImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getVariableGen()
	 * @generated
	 */
	int VARIABLE_GEN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_GEN__NAME = CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_GEN__DOCUMENTATION = CODE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_GEN__CHILDREN = CODE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_GEN__PARENT = CODE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_GEN__VISIBILITY = CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_GEN__TYPE = CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_GEN__TYPE_SPECIFIER = CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_GEN_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.ParameterGenImpl <em>Parameter Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.ParameterGenImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getParameterGen()
	 * @generated
	 */
	int PARAMETER_GEN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GEN__NAME = CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GEN__DOCUMENTATION = CODE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GEN__CHILDREN = CODE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GEN__PARENT = CODE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GEN__TYPE = CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GEN__TYPE_SPECIFIER = CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GEN_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.AbstractableElementImpl <em>Abstractable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.AbstractableElementImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getAbstractableElement()
	 * @generated
	 */
	int ABSTRACTABLE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTABLE_ELEMENT__ABSTRACT = 0;

	/**
	 * The number of structural features of the '<em>Abstractable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.impl.ExpressionGenImpl <em>Expression Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.impl.ExpressionGenImpl
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getExpressionGen()
	 * @generated
	 */
	int EXPRESSION_GEN = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_GEN__NAME = CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_GEN__DOCUMENTATION = CODE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_GEN__CHILDREN = CODE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_GEN__PARENT = CODE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_GEN__EXPRESSION = CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_GEN_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.yakindu.base.generator.generator.VisibilityValues <em>Visibility Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yakindu.base.generator.generator.VisibilityValues
	 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getVisibilityValues()
	 * @generated
	 */
	int VISIBILITY_VALUES = 12;

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.CodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Element</em>'.
	 * @see org.yakindu.base.generator.generator.CodeElement
	 * @generated
	 */
	EClass getCodeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yakindu.base.generator.generator.CodeElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.yakindu.base.generator.generator.CodeElement#getChildren()
	 * @see #getCodeElement()
	 * @generated
	 */
	EReference getCodeElement_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.yakindu.base.generator.generator.CodeElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.yakindu.base.generator.generator.CodeElement#getParent()
	 * @see #getCodeElement()
	 * @generated
	 */
	EReference getCodeElement_Parent();

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.SourceFileGen <em>Source File Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File Gen</em>'.
	 * @see org.yakindu.base.generator.generator.SourceFileGen
	 * @generated
	 */
	EClass getSourceFileGen();

	/**
	 * Returns the meta object for the attribute '{@link org.yakindu.base.generator.generator.SourceFileGen#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.yakindu.base.generator.generator.SourceFileGen#getPackage()
	 * @see #getSourceFileGen()
	 * @generated
	 */
	EAttribute getSourceFileGen_Package();

	/**
	 * Returns the meta object for the attribute list '{@link org.yakindu.base.generator.generator.SourceFileGen#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see org.yakindu.base.generator.generator.SourceFileGen#getImports()
	 * @see #getSourceFileGen()
	 * @generated
	 */
	EAttribute getSourceFileGen_Imports();

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.ClassGen <em>Class Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Gen</em>'.
	 * @see org.yakindu.base.generator.generator.ClassGen
	 * @generated
	 */
	EClass getClassGen();

	/**
	 * Returns the meta object for the reference '{@link org.yakindu.base.generator.generator.ClassGen#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see org.yakindu.base.generator.generator.ClassGen#getSuperClass()
	 * @see #getClassGen()
	 * @generated
	 */
	EReference getClassGen_SuperClass();

	/**
	 * Returns the meta object for the reference list '{@link org.yakindu.base.generator.generator.ClassGen#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see org.yakindu.base.generator.generator.ClassGen#getImplements()
	 * @see #getClassGen()
	 * @generated
	 */
	EReference getClassGen_Implements();

	/**
	 * Returns the meta object for the containment reference '{@link org.yakindu.base.generator.generator.ClassGen#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declaration</em>'.
	 * @see org.yakindu.base.generator.generator.ClassGen#getDeclaration()
	 * @see #getClassGen()
	 * @generated
	 */
	EReference getClassGen_Declaration();

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.ClassDeclarationGen <em>Class Declaration Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Declaration Gen</em>'.
	 * @see org.yakindu.base.generator.generator.ClassDeclarationGen
	 * @generated
	 */
	EClass getClassDeclarationGen();

	/**
	 * Returns the meta object for the container reference '{@link org.yakindu.base.generator.generator.ClassDeclarationGen#getClassGen <em>Class Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class Gen</em>'.
	 * @see org.yakindu.base.generator.generator.ClassDeclarationGen#getClassGen()
	 * @see #getClassDeclarationGen()
	 * @generated
	 */
	EReference getClassDeclarationGen_ClassGen();

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.InterfaceGen <em>Interface Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Gen</em>'.
	 * @see org.yakindu.base.generator.generator.InterfaceGen
	 * @generated
	 */
	EClass getInterfaceGen();

	/**
	 * Returns the meta object for the reference '{@link org.yakindu.base.generator.generator.InterfaceGen#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see org.yakindu.base.generator.generator.InterfaceGen#getSuperClass()
	 * @see #getInterfaceGen()
	 * @generated
	 */
	EReference getInterfaceGen_SuperClass();

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.MethodGen <em>Method Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Gen</em>'.
	 * @see org.yakindu.base.generator.generator.MethodGen
	 * @generated
	 */
	EClass getMethodGen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yakindu.base.generator.generator.MethodGen#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.yakindu.base.generator.generator.MethodGen#getParameters()
	 * @see #getMethodGen()
	 * @generated
	 */
	EReference getMethodGen_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.yakindu.base.generator.generator.MethodGen#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.yakindu.base.generator.generator.MethodGen#getReturnType()
	 * @see #getMethodGen()
	 * @generated
	 */
	EReference getMethodGen_ReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link org.yakindu.base.generator.generator.MethodGen#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declaration</em>'.
	 * @see org.yakindu.base.generator.generator.MethodGen#getDeclaration()
	 * @see #getMethodGen()
	 * @generated
	 */
	EReference getMethodGen_Declaration();

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.MethodDeclarationGen <em>Method Declaration Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Declaration Gen</em>'.
	 * @see org.yakindu.base.generator.generator.MethodDeclarationGen
	 * @generated
	 */
	EClass getMethodDeclarationGen();

	/**
	 * Returns the meta object for the container reference '{@link org.yakindu.base.generator.generator.MethodDeclarationGen#getMethodGen <em>Method Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method Gen</em>'.
	 * @see org.yakindu.base.generator.generator.MethodDeclarationGen#getMethodGen()
	 * @see #getMethodDeclarationGen()
	 * @generated
	 */
	EReference getMethodDeclarationGen_MethodGen();

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.AccessRestricted <em>Access Restricted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Restricted</em>'.
	 * @see org.yakindu.base.generator.generator.AccessRestricted
	 * @generated
	 */
	EClass getAccessRestricted();

	/**
	 * Returns the meta object for the attribute '{@link org.yakindu.base.generator.generator.AccessRestricted#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.yakindu.base.generator.generator.AccessRestricted#getVisibility()
	 * @see #getAccessRestricted()
	 * @generated
	 */
	EAttribute getAccessRestricted_Visibility();

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.VariableGen <em>Variable Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Gen</em>'.
	 * @see org.yakindu.base.generator.generator.VariableGen
	 * @generated
	 */
	EClass getVariableGen();

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.ParameterGen <em>Parameter Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Gen</em>'.
	 * @see org.yakindu.base.generator.generator.ParameterGen
	 * @generated
	 */
	EClass getParameterGen();

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.AbstractableElement <em>Abstractable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstractable Element</em>'.
	 * @see org.yakindu.base.generator.generator.AbstractableElement
	 * @generated
	 */
	EClass getAbstractableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.yakindu.base.generator.generator.AbstractableElement#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.yakindu.base.generator.generator.AbstractableElement#isAbstract()
	 * @see #getAbstractableElement()
	 * @generated
	 */
	EAttribute getAbstractableElement_Abstract();

	/**
	 * Returns the meta object for class '{@link org.yakindu.base.generator.generator.ExpressionGen <em>Expression Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Gen</em>'.
	 * @see org.yakindu.base.generator.generator.ExpressionGen
	 * @generated
	 */
	EClass getExpressionGen();

	/**
	 * Returns the meta object for the containment reference '{@link org.yakindu.base.generator.generator.ExpressionGen#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.yakindu.base.generator.generator.ExpressionGen#getExpression()
	 * @see #getExpressionGen()
	 * @generated
	 */
	EReference getExpressionGen_Expression();

	/**
	 * Returns the meta object for enum '{@link org.yakindu.base.generator.generator.VisibilityValues <em>Visibility Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Values</em>'.
	 * @see org.yakindu.base.generator.generator.VisibilityValues
	 * @generated
	 */
	EEnum getVisibilityValues();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratorFactory getGeneratorFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.CodeElementImpl <em>Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.CodeElementImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getCodeElement()
		 * @generated
		 */
		EClass CODE_ELEMENT = eINSTANCE.getCodeElement();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_ELEMENT__CHILDREN = eINSTANCE.getCodeElement_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_ELEMENT__PARENT = eINSTANCE.getCodeElement_Parent();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.SourceFileGenImpl <em>Source File Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.SourceFileGenImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getSourceFileGen()
		 * @generated
		 */
		EClass SOURCE_FILE_GEN = eINSTANCE.getSourceFileGen();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE_GEN__PACKAGE = eINSTANCE.getSourceFileGen_Package();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE_GEN__IMPORTS = eINSTANCE.getSourceFileGen_Imports();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.ClassGenImpl <em>Class Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.ClassGenImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getClassGen()
		 * @generated
		 */
		EClass CLASS_GEN = eINSTANCE.getClassGen();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_GEN__SUPER_CLASS = eINSTANCE.getClassGen_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_GEN__IMPLEMENTS = eINSTANCE.getClassGen_Implements();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_GEN__DECLARATION = eINSTANCE.getClassGen_Declaration();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.ClassDeclarationGenImpl <em>Class Declaration Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.ClassDeclarationGenImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getClassDeclarationGen()
		 * @generated
		 */
		EClass CLASS_DECLARATION_GEN = eINSTANCE.getClassDeclarationGen();

		/**
		 * The meta object literal for the '<em><b>Class Gen</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION_GEN__CLASS_GEN = eINSTANCE.getClassDeclarationGen_ClassGen();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.InterfaceGenImpl <em>Interface Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.InterfaceGenImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getInterfaceGen()
		 * @generated
		 */
		EClass INTERFACE_GEN = eINSTANCE.getInterfaceGen();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_GEN__SUPER_CLASS = eINSTANCE.getInterfaceGen_SuperClass();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.MethodGenImpl <em>Method Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.MethodGenImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getMethodGen()
		 * @generated
		 */
		EClass METHOD_GEN = eINSTANCE.getMethodGen();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_GEN__PARAMETERS = eINSTANCE.getMethodGen_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_GEN__RETURN_TYPE = eINSTANCE.getMethodGen_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_GEN__DECLARATION = eINSTANCE.getMethodGen_Declaration();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.MethodDeclarationGenImpl <em>Method Declaration Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.MethodDeclarationGenImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getMethodDeclarationGen()
		 * @generated
		 */
		EClass METHOD_DECLARATION_GEN = eINSTANCE.getMethodDeclarationGen();

		/**
		 * The meta object literal for the '<em><b>Method Gen</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION_GEN__METHOD_GEN = eINSTANCE.getMethodDeclarationGen_MethodGen();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.AccessRestrictedImpl <em>Access Restricted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.AccessRestrictedImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getAccessRestricted()
		 * @generated
		 */
		EClass ACCESS_RESTRICTED = eINSTANCE.getAccessRestricted();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_RESTRICTED__VISIBILITY = eINSTANCE.getAccessRestricted_Visibility();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.VariableGenImpl <em>Variable Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.VariableGenImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getVariableGen()
		 * @generated
		 */
		EClass VARIABLE_GEN = eINSTANCE.getVariableGen();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.ParameterGenImpl <em>Parameter Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.ParameterGenImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getParameterGen()
		 * @generated
		 */
		EClass PARAMETER_GEN = eINSTANCE.getParameterGen();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.AbstractableElementImpl <em>Abstractable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.AbstractableElementImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getAbstractableElement()
		 * @generated
		 */
		EClass ABSTRACTABLE_ELEMENT = eINSTANCE.getAbstractableElement();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACTABLE_ELEMENT__ABSTRACT = eINSTANCE.getAbstractableElement_Abstract();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.impl.ExpressionGenImpl <em>Expression Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.impl.ExpressionGenImpl
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getExpressionGen()
		 * @generated
		 */
		EClass EXPRESSION_GEN = eINSTANCE.getExpressionGen();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_GEN__EXPRESSION = eINSTANCE.getExpressionGen_Expression();

		/**
		 * The meta object literal for the '{@link org.yakindu.base.generator.generator.VisibilityValues <em>Visibility Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yakindu.base.generator.generator.VisibilityValues
		 * @see org.yakindu.base.generator.generator.impl.GeneratorPackageImpl#getVisibilityValues()
		 * @generated
		 */
		EEnum VISIBILITY_VALUES = eINSTANCE.getVisibilityValues();

	}

} //GeneratorPackage