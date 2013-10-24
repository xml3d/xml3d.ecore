/**
 */
package org.xml3d._2009.xml3d;

import gnu.trove.list.TFloatList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.ViewType#getFieldOfView <em>Field Of View</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.ViewType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.ViewType#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getViewType()
 * @model extendedMetaData="name='ViewType' kind='elementOnly'"
 * @generated
 */
public interface ViewType extends XML3DElement {
	/**
	 * Returns the value of the '<em><b>Field Of View</b></em>' attribute.
	 * The default value is <code>"0.78539816339744828"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Of View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Of View</em>' attribute.
	 * @see #isSetFieldOfView()
	 * @see #unsetFieldOfView()
	 * @see #setFieldOfView(float)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getViewType_FieldOfView()
	 * @model default="0.78539816339744828" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='fieldOfView'"
	 * @generated
	 */
	float getFieldOfView();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.ViewType#getFieldOfView <em>Field Of View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Of View</em>' attribute.
	 * @see #isSetFieldOfView()
	 * @see #unsetFieldOfView()
	 * @see #getFieldOfView()
	 * @generated
	 */
	void setFieldOfView(float value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.ViewType#getFieldOfView <em>Field Of View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFieldOfView()
	 * @see #getFieldOfView()
	 * @see #setFieldOfView(float)
	 * @generated
	 */
	void unsetFieldOfView();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.ViewType#getFieldOfView <em>Field Of View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Field Of View</em>' attribute is set.
	 * @see #unsetFieldOfView()
	 * @see #getFieldOfView()
	 * @see #setFieldOfView(float)
	 * @generated
	 */
	boolean isSetFieldOfView();

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The default value is <code>"0 0 1 0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(TFloatList)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getViewType_Orientation()
	 * @model default="0 0 1 0" unsettable="true" dataType="org.xml3d._2009.xml3d.XML3DRotation"
	 *        extendedMetaData="kind='attribute' name='orientation'"
	 * @generated
	 */
	TFloatList getOrientation();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.ViewType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(TFloatList value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.ViewType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(TFloatList)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.ViewType#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(TFloatList)
	 * @generated
	 */
	boolean isSetOrientation();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"0 0 0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #setPosition(TFloatList)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getViewType_Position()
	 * @model default="0 0 0" unsettable="true" dataType="org.xml3d._2009.xml3d.XML3DVec3"
	 *        extendedMetaData="kind='attribute' name='position'"
	 * @generated
	 */
	TFloatList getPosition();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.ViewType#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(TFloatList value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.ViewType#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(TFloatList)
	 * @generated
	 */
	void unsetPosition();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.ViewType#getPosition <em>Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position</em>' attribute is set.
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @see #setPosition(TFloatList)
	 * @generated
	 */
	boolean isSetPosition();

} // ViewType
