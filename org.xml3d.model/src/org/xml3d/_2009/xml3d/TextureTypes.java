/**
 */
package org.xml3d._2009.xml3d;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Texture Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureTypes()
 * @model extendedMetaData="name='TextureTypes'"
 * @generated
 */
public enum TextureTypes implements Enumerator {
	/**
	 * The '<em><b>2D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2D_VALUE
	 * @generated
	 * @ordered
	 */
	_2D(0, "_2D", "2D"),

	/**
	 * The '<em><b>1D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1D_VALUE
	 * @generated
	 * @ordered
	 */
	_1D(1, "_1D", "1D"),

	/**
	 * The '<em><b>3D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3D_VALUE
	 * @generated
	 * @ordered
	 */
	_3D(2, "_3D", "3D");

	/**
	 * The '<em><b>2D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>2D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_2D
	 * @model literal="2D"
	 * @generated
	 * @ordered
	 */
	public static final int _2D_VALUE = 0;

	/**
	 * The '<em><b>1D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_1D
	 * @model literal="1D"
	 * @generated
	 * @ordered
	 */
	public static final int _1D_VALUE = 1;

	/**
	 * The '<em><b>3D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>3D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_3D
	 * @model literal="3D"
	 * @generated
	 * @ordered
	 */
	public static final int _3D_VALUE = 2;

	/**
	 * An array of all the '<em><b>Texture Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextureTypes[] VALUES_ARRAY =
		new TextureTypes[] {
			_2D,
			_1D,
			_3D,
		};

	/**
	 * A public read-only list of all the '<em><b>Texture Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TextureTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Texture Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextureTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextureTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Texture Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextureTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextureTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Texture Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextureTypes get(int value) {
		switch (value) {
			case _2D_VALUE: return _2D;
			case _1D_VALUE: return _1D;
			case _3D_VALUE: return _3D;
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
	private TextureTypes(int value, String name, String literal) {
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
	
} //TextureTypes
