/**
 */
package org.xml3d._2009.xml3d;

import gnu.trove.list.TFloatList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float4x4 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.Float4x4Type#getValue <em>Value</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.Float4x4Type#getId <em>Id</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.Float4x4Type#getKey <em>Key</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.Float4x4Type#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getFloat4x4Type()
 * @model extendedMetaData="name='float4x4_._type' kind='simple'"
 * @generated
 */
public interface Float4x4Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(TFloatList)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getFloat4x4Type_Value()
	 * @model dataType="org.xml3d._2009.xml3d.Float4x4Array"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	TFloatList getValue();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.Float4x4Type#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TFloatList value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getFloat4x4Type_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.Float4x4Type#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #setKey(float)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getFloat4x4Type_Key()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='key'"
	 * @generated
	 */
	float getKey();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.Float4x4Type#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #getKey()
	 * @generated
	 */
	void setKey(float value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.Float4x4Type#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKey()
	 * @see #getKey()
	 * @see #setKey(float)
	 * @generated
	 */
	void unsetKey();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.Float4x4Type#getKey <em>Key</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key</em>' attribute is set.
	 * @see #unsetKey()
	 * @see #getKey()
	 * @see #setKey(float)
	 * @generated
	 */
	boolean isSetKey();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getFloat4x4Type_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.Float4x4Type#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Float4x4Type
