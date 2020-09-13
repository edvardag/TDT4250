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
 *   <li>{@link TDT4250.Assignment.semester#getYear <em>Year</em>}</li>
 *   <li>{@link TDT4250.Assignment.semester#getSemesterType <em>Semester Type</em>}</li>
 *   <li>{@link TDT4250.Assignment.semester#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see TDT4250.Assignment.AssignmentPackage#getsemester()
 * @model
 * @generated
 */
public interface semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(String)
	 * @see TDT4250.Assignment.AssignmentPackage#getsemester_Year()
	 * @model
	 * @generated
	 */
	String getYear();

	/**
	 * Sets the value of the '{@link TDT4250.Assignment.semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(String value);

	/**
	 * Returns the value of the '<em><b>Semester Type</b></em>' attribute.
	 * The literals are from the enumeration {@link TDT4250.Assignment.SemesterSeason}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Type</em>' attribute.
	 * @see TDT4250.Assignment.SemesterSeason
	 * @see #setSemesterType(SemesterSeason)
	 * @see TDT4250.Assignment.AssignmentPackage#getsemester_SemesterType()
	 * @model
	 * @generated
	 */
	SemesterSeason getSemesterType();

	/**
	 * Sets the value of the '{@link TDT4250.Assignment.semester#getSemesterType <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Type</em>' attribute.
	 * @see TDT4250.Assignment.SemesterSeason
	 * @see #getSemesterType()
	 * @generated
	 */
	void setSemesterType(SemesterSeason value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link TDT4250.Assignment.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see TDT4250.Assignment.AssignmentPackage#getsemester_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

} // semester
