/**
 * Copyright (c) 2018 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.model.sruntime.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yakindu.base.base.BasePackage;

import org.yakindu.base.types.TypesPackage;

import org.yakindu.sct.model.sruntime.CompositeSlot;
import org.yakindu.sct.model.sruntime.ExecutionContext;
import org.yakindu.sct.model.sruntime.ExecutionEvent;
import org.yakindu.sct.model.sruntime.ExecutionOperation;
import org.yakindu.sct.model.sruntime.ExecutionSlot;
import org.yakindu.sct.model.sruntime.ExecutionVariable;
import org.yakindu.sct.model.sruntime.ReferenceSlot;
import org.yakindu.sct.model.sruntime.SRuntimeFactory;
import org.yakindu.sct.model.sruntime.SRuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SRuntimePackageImpl extends EPackageImpl implements SRuntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.yakindu.sct.model.sruntime.SRuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SRuntimePackageImpl() {
		super(eNS_URI, SRuntimeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SRuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SRuntimePackage init() {
		if (isInited) return (SRuntimePackage)EPackage.Registry.INSTANCE.getEPackage(SRuntimePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSRuntimePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SRuntimePackageImpl theSRuntimePackage = registeredSRuntimePackage instanceof SRuntimePackageImpl ? (SRuntimePackageImpl)registeredSRuntimePackage : new SRuntimePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSRuntimePackage.createPackageContents();

		// Initialize created meta-data
		theSRuntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSRuntimePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SRuntimePackage.eNS_URI, theSRuntimePackage);
		return theSRuntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionContext() {
		return executionContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionContext_ActiveStates() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionContext_ExecutedElements() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionContext_SuspendedElements() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionContext_Snapshot() {
		return (EAttribute)executionContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionEvent() {
		return executionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionEvent_Raised() {
		return (EAttribute)executionEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionEvent_Direction() {
		return (EAttribute)executionEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionSlot() {
		return executionSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionSlot_Value() {
		return (EAttribute)executionSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionSlot_FqName() {
		return (EAttribute)executionSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionSlot_Writable() {
		return (EAttribute)executionSlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionSlot_Type() {
		return (EReference)executionSlotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionVariable() {
		return executionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeSlot() {
		return compositeSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeSlot_Slots() {
		return (EReference)compositeSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceSlot() {
		return referenceSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceSlot_Reference() {
		return (EReference)referenceSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionOperation() {
		return executionOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaObject() {
		return javaObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SRuntimeFactory getSRuntimeFactory() {
		return (SRuntimeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		executionContextEClass = createEClass(EXECUTION_CONTEXT);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__ACTIVE_STATES);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__EXECUTED_ELEMENTS);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__SUSPENDED_ELEMENTS);
		createEAttribute(executionContextEClass, EXECUTION_CONTEXT__SNAPSHOT);

		executionEventEClass = createEClass(EXECUTION_EVENT);
		createEAttribute(executionEventEClass, EXECUTION_EVENT__RAISED);
		createEAttribute(executionEventEClass, EXECUTION_EVENT__DIRECTION);

		executionSlotEClass = createEClass(EXECUTION_SLOT);
		createEAttribute(executionSlotEClass, EXECUTION_SLOT__VALUE);
		createEAttribute(executionSlotEClass, EXECUTION_SLOT__FQ_NAME);
		createEAttribute(executionSlotEClass, EXECUTION_SLOT__WRITABLE);
		createEReference(executionSlotEClass, EXECUTION_SLOT__TYPE);

		executionVariableEClass = createEClass(EXECUTION_VARIABLE);

		compositeSlotEClass = createEClass(COMPOSITE_SLOT);
		createEReference(compositeSlotEClass, COMPOSITE_SLOT__SLOTS);

		referenceSlotEClass = createEClass(REFERENCE_SLOT);
		createEReference(referenceSlotEClass, REFERENCE_SLOT__REFERENCE);

		executionOperationEClass = createEClass(EXECUTION_OPERATION);

		// Create data types
		javaObjectEDataType = createEDataType(JAVA_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		executionContextEClass.getESuperTypes().add(theBasePackage.getNamedElement());
		executionContextEClass.getESuperTypes().add(this.getCompositeSlot());
		executionEventEClass.getESuperTypes().add(this.getExecutionSlot());
		executionSlotEClass.getESuperTypes().add(theBasePackage.getNamedElement());
		executionVariableEClass.getESuperTypes().add(this.getExecutionSlot());
		compositeSlotEClass.getESuperTypes().add(this.getExecutionSlot());
		referenceSlotEClass.getESuperTypes().add(this.getCompositeSlot());
		executionOperationEClass.getESuperTypes().add(this.getExecutionVariable());

		// Initialize classes and features; add operations and parameters
		initEClass(executionContextEClass, ExecutionContext.class, "ExecutionContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionContext_ActiveStates(), theEcorePackage.getEObject(), null, "activeStates", null, 0, -1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_ExecutedElements(), theEcorePackage.getEObject(), null, "executedElements", null, 0, -1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_SuspendedElements(), theEcorePackage.getEObject(), null, "suspendedElements", null, 0, -1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionContext_Snapshot(), theEcorePackage.getEBoolean(), "snapshot", null, 0, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(executionContextEClass, this.getExecutionEvent(), "getRaisedEvents", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(executionContextEClass, this.getExecutionVariable(), "getVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "qualifiedName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(executionContextEClass, this.getExecutionEvent(), "getEvent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "qualifiedName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(executionContextEClass, this.getExecutionSlot(), "getSlot", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "qualifiedName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(executionContextEClass, this.getExecutionEvent(), "getAllEvents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(executionContextEClass, this.getExecutionVariable(), "getAllVariables", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(executionContextEClass, this.getExecutionSlot(), "getAllSlots", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(executionContextEClass, null, "addSlots", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExecutionSlot(), "result", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExecutionSlot(), "slots", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExecutionSlot(), "visited", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(executionEventEClass, ExecutionEvent.class, "ExecutionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionEvent_Raised(), theEcorePackage.getEBoolean(), "raised", null, 0, 1, ExecutionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionEvent_Direction(), theTypesPackage.getDirection(), "direction", null, 0, 1, ExecutionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionSlotEClass, ExecutionSlot.class, "ExecutionSlot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionSlot_Value(), this.getJavaObject(), "value", null, 0, 1, ExecutionSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionSlot_FqName(), theEcorePackage.getEString(), "fqName", null, 0, 1, ExecutionSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionSlot_Writable(), theEcorePackage.getEBoolean(), "writable", "true", 0, 1, ExecutionSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionSlot_Type(), theTypesPackage.getType(), null, "type", null, 0, 1, ExecutionSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionVariableEClass, ExecutionVariable.class, "ExecutionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeSlotEClass, CompositeSlot.class, "CompositeSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeSlot_Slots(), this.getExecutionSlot(), null, "slots", null, 0, -1, CompositeSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(compositeSlotEClass, this.getExecutionSlot(), "getSlots", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "doResolve", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(referenceSlotEClass, ReferenceSlot.class, "ReferenceSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceSlot_Reference(), this.getExecutionSlot(), null, "reference", null, 0, 1, ReferenceSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionOperationEClass, ExecutionOperation.class, "ExecutionOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(javaObjectEDataType, Object.class, "JavaObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SRuntimePackageImpl
