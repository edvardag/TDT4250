/**
 */
package TDT4250.Assignment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignment.Programme#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Assignment.Programme#getProgrammeCode <em>Programme Code</em>}</li>
 *   <li>{@link TDT4250.Assignment.Programme#getType <em>Type</em>}</li>
 *   <li>{@link TDT4250.Assignment.Programme#getSemester <em>Semester</em>}</li>
 *   <li>{@link TDT4250.Assignment.Programme#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 *
 * @see TDT4250.Assignment.AssignmentPackage#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TotalCreditCheck'"
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TDT4250.Assignment.AssignmentPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TDT4250.Assignment.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programme Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Code</em>' attribute.
	 * @see #setProgrammeCode(String)
	 * @see TDT4250.Assignment.AssignmentPackage#getProgramme_ProgrammeCode()
	 * @model
	 * @generated
	 */
	String getProgrammeCode();

	/**
	 * Sets the value of the '{@link TDT4250.Assignment.Programme#getProgrammeCode <em>Programme Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Code</em>' attribute.
	 * @see #getProgrammeCode()
	 * @generated
	 */
	void setProgrammeCode(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link TDT4250.Assignment.ProgrammeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see TDT4250.Assignment.ProgrammeType
	 * @see #setType(ProgrammeType)
	 * @see TDT4250.Assignment.AssignmentPackage#getProgramme_Type()
	 * @model
	 * @generated
	 */
	ProgrammeType getType();

	/**
	 * Sets the value of the '{@link TDT4250.Assignment.Programme#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see TDT4250.Assignment.ProgrammeType
	 * @see #getType()
	 * @generated
	 */
	void setType(ProgrammeType value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Assignment.semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference list.
	 * @see TDT4250.Assignment.AssignmentPackage#getProgramme_Semester()
	 * @model containment="true"
	 * @generated
	 */
	EList<semester> getSemester();

	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Assignment.Specialisation}.
	 * It is bidirectional and its opposite is '{@link TDT4250.Assignment.Specialisation#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' containment reference list.
	 * @see TDT4250.Assignment.AssignmentPackage#getProgramme_Specialisation()
	 * @see TDT4250.Assignment.Specialisation#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisation();

} // Programme
