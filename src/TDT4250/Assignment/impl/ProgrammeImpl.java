/**
 */
package TDT4250.Assignment.impl;

import TDT4250.Assignment.AssignmentPackage;
import TDT4250.Assignment.Programme;
import TDT4250.Assignment.ProgrammeType;
import TDT4250.Assignment.Specialisation;
import TDT4250.Assignment.semester;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignment.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Assignment.impl.ProgrammeImpl#getProgrammeCode <em>Programme Code</em>}</li>
 *   <li>{@link TDT4250.Assignment.impl.ProgrammeImpl#getType <em>Type</em>}</li>
 *   <li>{@link TDT4250.Assignment.impl.ProgrammeImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link TDT4250.Assignment.impl.ProgrammeImpl#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgrammeCode() <em>Programme Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAMME_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgrammeCode() <em>Programme Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeCode()
	 * @generated
	 * @ordered
	 */
	protected String programmeCode = PROGRAMME_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ProgrammeType TYPE_EDEFAULT = ProgrammeType.BACHELOR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<semester> semester;

	/**
	 * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> specialisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentPackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProgrammeCode() {
		return programmeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeCode(String newProgrammeCode) {
		String oldProgrammeCode = programmeCode;
		programmeCode = newProgrammeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.PROGRAMME__PROGRAMME_CODE, oldProgrammeCode, programmeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ProgrammeType newType) {
		ProgrammeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.PROGRAMME__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<semester> getSemester() {
		if (semester == null) {
			semester = new EObjectContainmentEList<semester>(semester.class, this, AssignmentPackage.PROGRAMME__SEMESTER);
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialisation> getSpecialisation() {
		if (specialisation == null) {
			specialisation = new EObjectContainmentWithInverseEList<Specialisation>(Specialisation.class, this, AssignmentPackage.PROGRAMME__SPECIALISATION, AssignmentPackage.SPECIALISATION__PROGRAMME);
		}
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentPackage.PROGRAMME__SPECIALISATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecialisation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentPackage.PROGRAMME__SEMESTER:
				return ((InternalEList<?>)getSemester()).basicRemove(otherEnd, msgs);
			case AssignmentPackage.PROGRAMME__SPECIALISATION:
				return ((InternalEList<?>)getSpecialisation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignmentPackage.PROGRAMME__NAME:
				return getName();
			case AssignmentPackage.PROGRAMME__PROGRAMME_CODE:
				return getProgrammeCode();
			case AssignmentPackage.PROGRAMME__TYPE:
				return getType();
			case AssignmentPackage.PROGRAMME__SEMESTER:
				return getSemester();
			case AssignmentPackage.PROGRAMME__SPECIALISATION:
				return getSpecialisation();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssignmentPackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case AssignmentPackage.PROGRAMME__PROGRAMME_CODE:
				setProgrammeCode((String)newValue);
				return;
			case AssignmentPackage.PROGRAMME__TYPE:
				setType((ProgrammeType)newValue);
				return;
			case AssignmentPackage.PROGRAMME__SEMESTER:
				getSemester().clear();
				getSemester().addAll((Collection<? extends semester>)newValue);
				return;
			case AssignmentPackage.PROGRAMME__SPECIALISATION:
				getSpecialisation().clear();
				getSpecialisation().addAll((Collection<? extends Specialisation>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AssignmentPackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssignmentPackage.PROGRAMME__PROGRAMME_CODE:
				setProgrammeCode(PROGRAMME_CODE_EDEFAULT);
				return;
			case AssignmentPackage.PROGRAMME__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AssignmentPackage.PROGRAMME__SEMESTER:
				getSemester().clear();
				return;
			case AssignmentPackage.PROGRAMME__SPECIALISATION:
				getSpecialisation().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AssignmentPackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssignmentPackage.PROGRAMME__PROGRAMME_CODE:
				return PROGRAMME_CODE_EDEFAULT == null ? programmeCode != null : !PROGRAMME_CODE_EDEFAULT.equals(programmeCode);
			case AssignmentPackage.PROGRAMME__TYPE:
				return type != TYPE_EDEFAULT;
			case AssignmentPackage.PROGRAMME__SEMESTER:
				return semester != null && !semester.isEmpty();
			case AssignmentPackage.PROGRAMME__SPECIALISATION:
				return specialisation != null && !specialisation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", programmeCode: ");
		result.append(programmeCode);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
