/**
 */
package TDT4250.Assignment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignment.semester#getNumber <em>Number</em>}</li>
 *   <li>{@link TDT4250.Assignment.semester#getRequiredCourses <em>Required Courses</em>}</li>
 *   <li>{@link TDT4250.Assignment.semester#getElectiveCourses <em>Elective Courses</em>}</li>
 * </ul>
 *
 * @see TDT4250.Assignment.AssignmentPackage#getsemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Minimum30creditPerSemester AllRequiredCoursesCheck'"
 * @generated
 */
public interface semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see TDT4250.Assignment.AssignmentPackage#getsemester_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link TDT4250.Assignment.semester#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Required Courses</b></em>' reference list.
	 * The list contents are of type {@link TDT4250.Assignment.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Courses</em>' reference list.
	 * @see TDT4250.Assignment.AssignmentPackage#getsemester_RequiredCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getRequiredCourses();

	/**
	 * Returns the value of the '<em><b>Elective Courses</b></em>' reference list.
	 * The list contents are of type {@link TDT4250.Assignment.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Courses</em>' reference list.
	 * @see TDT4250.Assignment.AssignmentPackage#getsemester_ElectiveCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getElectiveCourses();

} // semester
