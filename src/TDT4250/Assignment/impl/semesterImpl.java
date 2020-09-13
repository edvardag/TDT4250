/**
 */
package TDT4250.Assignment.impl;

import TDT4250.Assignment.AssignmentPackage;
import TDT4250.Assignment.Course;
import TDT4250.Assignment.semester;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignment.impl.semesterImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link TDT4250.Assignment.impl.semesterImpl#getRequiredCourses <em>Required Courses</em>}</li>
 *   <li>{@link TDT4250.Assignment.impl.semesterImpl#getElectiveCourses <em>Elective Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class semesterImpl extends MinimalEObjectImpl.Container implements semester {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredCourses() <em>Required Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> requiredCourses;

	/**
	 * The cached value of the '{@link #getElectiveCourses() <em>Elective Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> electiveCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected semesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.SEMESTER__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getRequiredCourses() {
		if (requiredCourses == null) {
			requiredCourses = new EObjectResolvingEList<Course>(Course.class, this, AssignmentPackage.SEMESTER__REQUIRED_COURSES);
		}
		return requiredCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getElectiveCourses() {
		if (electiveCourses == null) {
			electiveCourses = new EObjectResolvingEList<Course>(Course.class, this, AssignmentPackage.SEMESTER__ELECTIVE_COURSES);
		}
		return electiveCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignmentPackage.SEMESTER__NUMBER:
				return getNumber();
			case AssignmentPackage.SEMESTER__REQUIRED_COURSES:
				return getRequiredCourses();
			case AssignmentPackage.SEMESTER__ELECTIVE_COURSES:
				return getElectiveCourses();
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
			case AssignmentPackage.SEMESTER__NUMBER:
				setNumber((Integer)newValue);
				return;
			case AssignmentPackage.SEMESTER__REQUIRED_COURSES:
				getRequiredCourses().clear();
				getRequiredCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case AssignmentPackage.SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				getElectiveCourses().addAll((Collection<? extends Course>)newValue);
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
			case AssignmentPackage.SEMESTER__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case AssignmentPackage.SEMESTER__REQUIRED_COURSES:
				getRequiredCourses().clear();
				return;
			case AssignmentPackage.SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
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
			case AssignmentPackage.SEMESTER__NUMBER:
				return number != NUMBER_EDEFAULT;
			case AssignmentPackage.SEMESTER__REQUIRED_COURSES:
				return requiredCourses != null && !requiredCourses.isEmpty();
			case AssignmentPackage.SEMESTER__ELECTIVE_COURSES:
				return electiveCourses != null && !electiveCourses.isEmpty();
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
		result.append(" (Number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //semesterImpl
