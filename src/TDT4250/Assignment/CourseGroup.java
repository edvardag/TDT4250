/**
 */
package TDT4250.Assignment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignment.CourseGroup#getCourseGroupType <em>Course Group Type</em>}</li>
 *   <li>{@link TDT4250.Assignment.CourseGroup#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see TDT4250.Assignment.AssignmentPackage#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Group Type</b></em>' attribute.
	 * The literals are from the enumeration {@link TDT4250.Assignment.CourseGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Group Type</em>' attribute.
	 * @see TDT4250.Assignment.CourseGroupType
	 * @see #setCourseGroupType(CourseGroupType)
	 * @see TDT4250.Assignment.AssignmentPackage#getCourseGroup_CourseGroupType()
	 * @model
	 * @generated
	 */
	CourseGroupType getCourseGroupType();

	/**
	 * Sets the value of the '{@link TDT4250.Assignment.CourseGroup#getCourseGroupType <em>Course Group Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Group Type</em>' attribute.
	 * @see TDT4250.Assignment.CourseGroupType
	 * @see #getCourseGroupType()
	 * @generated
	 */
	void setCourseGroupType(CourseGroupType value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link TDT4250.Assignment.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see TDT4250.Assignment.AssignmentPackage#getCourseGroup_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

} // CourseGroup
