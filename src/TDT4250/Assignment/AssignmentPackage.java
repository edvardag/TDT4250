/**
 */
package TDT4250.Assignment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see TDT4250.Assignment.AssignmentFactory
 * @model kind="package"
 * @generated
 */
public interface AssignmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Assignment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250/model/Assignment.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Assignment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssignmentPackage eINSTANCE = TDT4250.Assignment.impl.AssignmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link TDT4250.Assignment.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignment.impl.CourseImpl
	 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDIT = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Assignment.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignment.impl.ProgrammeImpl
	 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Programme Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__PROGRAMME_CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SPECIALISATION = 4;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Assignment.impl.semesterImpl <em>semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignment.impl.semesterImpl
	 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getsemester()
	 * @generated
	 */
	int SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Required Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__REQUIRED_COURSES = 1;

	/**
	 * The feature id for the '<em><b>Elective Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__ELECTIVE_COURSES = 2;

	/**
	 * The number of structural features of the '<em>semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Assignment.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignment.impl.SpecialisationImpl
	 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__PROGRAMME = 1;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SEMESTER = 2;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Assignment.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignment.impl.UniversityImpl
	 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 4;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__PROGRAMMES = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COURSES = 1;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Assignment.ProgrammeType <em>Programme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignment.ProgrammeType
	 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getProgrammeType()
	 * @generated
	 */
	int PROGRAMME_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TDT4250.Assignment.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see TDT4250.Assignment.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignment.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.Assignment.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignment.Course#getCourseCode <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Code</em>'.
	 * @see TDT4250.Assignment.Course#getCourseCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCode();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignment.Course#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see TDT4250.Assignment.Course#getCredit()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credit();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignment.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see TDT4250.Assignment.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for class '{@link TDT4250.Assignment.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see TDT4250.Assignment.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignment.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.Assignment.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignment.Programme#getProgrammeCode <em>Programme Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programme Code</em>'.
	 * @see TDT4250.Assignment.Programme#getProgrammeCode()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_ProgrammeCode();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignment.Programme#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see TDT4250.Assignment.Programme#getType()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Assignment.Programme#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semester</em>'.
	 * @see TDT4250.Assignment.Programme#getSemester()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Semester();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Assignment.Programme#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialisation</em>'.
	 * @see TDT4250.Assignment.Programme#getSpecialisation()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Specialisation();

	/**
	 * Returns the meta object for class '{@link TDT4250.Assignment.semester <em>semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>semester</em>'.
	 * @see TDT4250.Assignment.semester
	 * @generated
	 */
	EClass getsemester();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignment.semester#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see TDT4250.Assignment.semester#getNumber()
	 * @see #getsemester()
	 * @generated
	 */
	EAttribute getsemester_Number();

	/**
	 * Returns the meta object for the reference list '{@link TDT4250.Assignment.semester#getRequiredCourses <em>Required Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Courses</em>'.
	 * @see TDT4250.Assignment.semester#getRequiredCourses()
	 * @see #getsemester()
	 * @generated
	 */
	EReference getsemester_RequiredCourses();

	/**
	 * Returns the meta object for the reference list '{@link TDT4250.Assignment.semester#getElectiveCourses <em>Elective Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elective Courses</em>'.
	 * @see TDT4250.Assignment.semester#getElectiveCourses()
	 * @see #getsemester()
	 * @generated
	 */
	EReference getsemester_ElectiveCourses();

	/**
	 * Returns the meta object for class '{@link TDT4250.Assignment.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see TDT4250.Assignment.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignment.Specialisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.Assignment.Specialisation#getName()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Name();

	/**
	 * Returns the meta object for the container reference '{@link TDT4250.Assignment.Specialisation#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programme</em>'.
	 * @see TDT4250.Assignment.Specialisation#getProgramme()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Programme();

	/**
	 * Returns the meta object for the reference list '{@link TDT4250.Assignment.Specialisation#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semester</em>'.
	 * @see TDT4250.Assignment.Specialisation#getSemester()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Semester();

	/**
	 * Returns the meta object for class '{@link TDT4250.Assignment.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see TDT4250.Assignment.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Assignment.University#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see TDT4250.Assignment.University#getProgrammes()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Programmes();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Assignment.University#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see TDT4250.Assignment.University#getCourses()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Courses();

	/**
	 * Returns the meta object for enum '{@link TDT4250.Assignment.ProgrammeType <em>Programme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programme Type</em>'.
	 * @see TDT4250.Assignment.ProgrammeType
	 * @generated
	 */
	EEnum getProgrammeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssignmentFactory getAssignmentFactory();

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
		 * The meta object literal for the '{@link TDT4250.Assignment.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignment.impl.CourseImpl
		 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Course Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CODE = eINSTANCE.getCourse_CourseCode();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDIT = eINSTANCE.getCourse_Credit();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignment.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignment.impl.ProgrammeImpl
		 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Programme Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__PROGRAMME_CODE = eINSTANCE.getProgramme_ProgrammeCode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__TYPE = eINSTANCE.getProgramme_Type();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SEMESTER = eINSTANCE.getProgramme_Semester();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SPECIALISATION = eINSTANCE.getProgramme_Specialisation();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignment.impl.semesterImpl <em>semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignment.impl.semesterImpl
		 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getsemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getsemester();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__NUMBER = eINSTANCE.getsemester_Number();

		/**
		 * The meta object literal for the '<em><b>Required Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__REQUIRED_COURSES = eINSTANCE.getsemester_RequiredCourses();

		/**
		 * The meta object literal for the '<em><b>Elective Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__ELECTIVE_COURSES = eINSTANCE.getsemester_ElectiveCourses();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignment.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignment.impl.SpecialisationImpl
		 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__NAME = eINSTANCE.getSpecialisation_Name();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__PROGRAMME = eINSTANCE.getSpecialisation_Programme();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__SEMESTER = eINSTANCE.getSpecialisation_Semester();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignment.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignment.impl.UniversityImpl
		 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__PROGRAMMES = eINSTANCE.getUniversity_Programmes();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COURSES = eINSTANCE.getUniversity_Courses();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignment.ProgrammeType <em>Programme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignment.ProgrammeType
		 * @see TDT4250.Assignment.impl.AssignmentPackageImpl#getProgrammeType()
		 * @generated
		 */
		EEnum PROGRAMME_TYPE = eINSTANCE.getProgrammeType();

	}

} //AssignmentPackage
