/**
 */
package TDT4250.Assignment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignment.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Assignment.Specialisation#getProgramme <em>Programme</em>}</li>
 *   <li>{@link TDT4250.Assignment.Specialisation#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see TDT4250.Assignment.AssignmentPackage#getSpecialisation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MandatoryCoursesCheck'"
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TDT4250.Assignment.AssignmentPackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TDT4250.Assignment.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TDT4250.Assignment.Programme#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see TDT4250.Assignment.AssignmentPackage#getSpecialisation_Programme()
	 * @see TDT4250.Assignment.Programme#getSpecialisation
	 * @model opposite="specialisation" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link TDT4250.Assignment.Specialisation#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' reference list.
	 * The list contents are of type {@link TDT4250.Assignment.semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' reference list.
	 * @see TDT4250.Assignment.AssignmentPackage#getSpecialisation_Semester()
	 * @model
	 * @generated
	 */
	EList<semester> getSemester();

} // Specialisation
