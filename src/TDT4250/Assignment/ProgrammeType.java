/**
 */
package TDT4250.Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Programme Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TDT4250.Assignment.AssignmentPackage#getProgrammeType()
 * @model
 * @generated
 */
public enum ProgrammeType implements Enumerator {
	/**
	 * The '<em><b>Bachelor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR_VALUE
	 * @generated
	 * @ordered
	 */
	BACHELOR(0, "Bachelor", "Bachelor"),

	/**
	 * The '<em><b>Master2 Years</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER2_YEARS_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER2_YEARS(1, "Master2Years", "Master2Years"),

	/**
	 * The '<em><b>Master5 Years</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER5_YEARS_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER5_YEARS(2, "Master5Years", "Master5Years");

	/**
	 * The '<em><b>Bachelor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR
	 * @model name="Bachelor"
	 * @generated
	 * @ordered
	 */
	public static final int BACHELOR_VALUE = 0;

	/**
	 * The '<em><b>Master2 Years</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER2_YEARS
	 * @model name="Master2Years"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER2_YEARS_VALUE = 1;

	/**
	 * The '<em><b>Master5 Years</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER5_YEARS
	 * @model name="Master5Years"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER5_YEARS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Programme Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProgrammeType[] VALUES_ARRAY =
		new ProgrammeType[] {
			BACHELOR,
			MASTER2_YEARS,
			MASTER5_YEARS,
		};

	/**
	 * A public read-only list of all the '<em><b>Programme Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProgrammeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Programme Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgrammeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Programme Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgrammeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Programme Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammeType get(int value) {
		switch (value) {
			case BACHELOR_VALUE: return BACHELOR;
			case MASTER2_YEARS_VALUE: return MASTER2_YEARS;
			case MASTER5_YEARS_VALUE: return MASTER5_YEARS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProgrammeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ProgrammeType
