/**
 */
package org.xml3d._2009.xml3d;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mesh Type Names</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getMeshTypeNames()
 * @model extendedMetaData="name='MeshTypeNames'"
 * @generated
 */
public enum MeshTypeNames implements Enumerator {
	/**
	 * The '<em><b>Triangles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGLES_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGLES(0, "triangles", "triangles"),

	/**
	 * The '<em><b>Line Strips</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_STRIPS_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_STRIPS(1, "lineStrips", "lineStrips");

	/**
	 * The '<em><b>Triangles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Triangles</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIANGLES
	 * @model name="triangles"
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGLES_VALUE = 0;

	/**
	 * The '<em><b>Line Strips</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line Strips</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_STRIPS
	 * @model name="lineStrips"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_STRIPS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Mesh Type Names</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeshTypeNames[] VALUES_ARRAY =
		new MeshTypeNames[] {
			TRIANGLES,
			LINE_STRIPS,
		};

	/**
	 * A public read-only list of all the '<em><b>Mesh Type Names</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeshTypeNames> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mesh Type Names</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeshTypeNames get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeshTypeNames result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mesh Type Names</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeshTypeNames getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeshTypeNames result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mesh Type Names</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeshTypeNames get(int value) {
		switch (value) {
			case TRIANGLES_VALUE: return TRIANGLES;
			case LINE_STRIPS_VALUE: return LINE_STRIPS;
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
	private MeshTypeNames(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //MeshTypeNames
