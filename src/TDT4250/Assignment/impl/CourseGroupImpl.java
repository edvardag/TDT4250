/**
 */
package TDT4250.Assignment.impl;

import TDT4250.Assignment.AssignmentPackage;
import TDT4250.Assignment.Course;
import TDT4250.Assignment.CourseGroup;
import TDT4250.Assignment.CourseGroupType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignment.impl.CourseGroupImpl#getCourseGroupType <em>Course Group Type</em>}</li>
 *   <li>{@link TDT4250.Assignment.impl.CourseGroupImpl#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseGroupImpl extends MinimalEObjectImpl.Container implements CourseGroup {
	/**
	 * The default value of the '{@link #getCourseGroupType() <em>Course Group Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroupType()
	 * @generated
	 * @ordered
	 */
	protected static final CourseGroupType COURSE_GROUP_TYPE_EDEFAULT = CourseGroupType.MANDATORY;

	/**
	 * The cached value of the '{@link #getCourseGroupType() <em>Course Group Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroupType()
	 * @generated
	 * @ordered
	 */
	protected CourseGroupType courseGroupType = COURSE_GROUP_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentPackage.Literals.COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseGroupType getCourseGroupType() {
		return courseGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseGroupType(CourseGroupType newCourseGroupType) {
		CourseGroupType oldCourseGroupType = courseGroupType;
		courseGroupType = newCourseGroupType == null ? COURSE_GROUP_TYPE_EDEFAULT : newCourseGroupType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.COURSE_GROUP__COURSE_GROUP_TYPE, oldCourseGroupType, courseGroupType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, AssignmentPackage.COURSE_GROUP__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignmentPackage.COURSE_GROUP__COURSE_GROUP_TYPE:
				return getCourseGroupType();
			case AssignmentPackage.COURSE_GROUP__COURSES:
				return getCourses();
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
			case AssignmentPackage.COURSE_GROUP__COURSE_GROUP_TYPE:
				setCourseGroupType((CourseGroupType)newValue);
				return;
			case AssignmentPackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
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
			case AssignmentPackage.COURSE_GROUP__COURSE_GROUP_TYPE:
				setCourseGroupType(COURSE_GROUP_TYPE_EDEFAULT);
				return;
			case AssignmentPackage.COURSE_GROUP__COURSES:
				getCourses().clear();
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
			case AssignmentPackage.COURSE_GROUP__COURSE_GROUP_TYPE:
				return courseGroupType != COURSE_GROUP_TYPE_EDEFAULT;
			case AssignmentPackage.COURSE_GROUP__COURSES:
				return courses != null && !courses.isEmpty();
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
		result.append(" (courseGroupType: ");
		result.append(courseGroupType);
		result.append(')');
		return result.toString();
	}

} //CourseGroupImpl
