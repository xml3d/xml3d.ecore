/**
 */
package org.xml3d._2009.xml3d;

import gnu.trove.list.TFloatList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.TransformType#getCenter <em>Center</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TransformType#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TransformType#getScale <em>Scale</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TransformType#getScaleOrientation <em>Scale Orientation</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TransformType#getTranslation <em>Translation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTransformType()
 * @model extendedMetaData="name='TransformType' kind='elementOnly'"
 * @generated
 */
public interface TransformType extends XML3DElement {
	/**
	 * Returns the value of the '<em><b>Center</b></em>' attribute.
	 * The default value is <code>"0 0 0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' attribute.
	 * @see #isSetCenter()
	 * @see #unsetCenter()
	 * @see #setCenter(TFloatList)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTransformType_Center()
	 * @model default="0 0 0" unsettable="true" dataType="org.xml3d._2009.xml3d.XML3DVec3"
	 *        extendedMetaData="kind='attribute' name='center'"
	 * @generated
	 */
	TFloatList getCenter();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TransformType#getCenter <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' attribute.
	 * @see #isSetCenter()
	 * @see #unsetCenter()
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(TFloatList value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TransformType#getCenter <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCenter()
	 * @see #getCenter()
	 * @see #setCenter(TFloatList)
	 * @generated
	 */
	void unsetCenter();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TransformType#getCenter <em>Center</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Center</em>' attribute is set.
	 * @see #unsetCenter()
	 * @see #getCenter()
	 * @see #setCenter(TFloatList)
	 * @generated
	 */
	boolean isSetCenter();

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * The default value is <code>"0 0 1 0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #setRotation(TFloatList)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTransformType_Rotation()
	 * @model default="0 0 1 0" unsettable="true" dataType="org.xml3d._2009.xml3d.XML3DRotation"
	 *        extendedMetaData="kind='attribute' name='rotation'"
	 * @generated
	 */
	TFloatList getRotation();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TransformType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(TFloatList value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TransformType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotation()
	 * @see #getRotation()
	 * @see #setRotation(TFloatList)
	 * @generated
	 */
	void unsetRotation();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TransformType#getRotation <em>Rotation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotation</em>' attribute is set.
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @see #setRotation(TFloatList)
	 * @generated
	 */
	boolean isSetRotation();

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1 1 1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #setScale(TFloatList)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTransformType_Scale()
	 * @model default="1 1 1" unsettable="true" dataType="org.xml3d._2009.xml3d.XML3DVec3"
	 *        extendedMetaData="kind='attribute' name='scale'"
	 * @generated
	 */
	TFloatList getScale();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TransformType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #getScale()
	 * @generated
	 */
	void setScale(TFloatList value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TransformType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale()
	 * @see #getScale()
	 * @see #setScale(TFloatList)
	 * @generated
	 */
	void unsetScale();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TransformType#getScale <em>Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale</em>' attribute is set.
	 * @see #unsetScale()
	 * @see #getScale()
	 * @see #setScale(TFloatList)
	 * @generated
	 */
	boolean isSetScale();

	/**
	 * Returns the value of the '<em><b>Scale Orientation</b></em>' attribute.
	 * The default value is <code>"0 0 1 0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Orientation</em>' attribute.
	 * @see #isSetScaleOrientation()
	 * @see #unsetScaleOrientation()
	 * @see #setScaleOrientation(TFloatList)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTransformType_ScaleOrientation()
	 * @model default="0 0 1 0" unsettable="true" dataType="org.xml3d._2009.xml3d.XML3DRotation"
	 *        extendedMetaData="kind='attribute' name='scaleOrientation'"
	 * @generated
	 */
	TFloatList getScaleOrientation();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TransformType#getScaleOrientation <em>Scale Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Orientation</em>' attribute.
	 * @see #isSetScaleOrientation()
	 * @see #unsetScaleOrientation()
	 * @see #getScaleOrientation()
	 * @generated
	 */
	void setScaleOrientation(TFloatList value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TransformType#getScaleOrientation <em>Scale Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScaleOrientation()
	 * @see #getScaleOrientation()
	 * @see #setScaleOrientation(TFloatList)
	 * @generated
	 */
	void unsetScaleOrientation();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TransformType#getScaleOrientation <em>Scale Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale Orientation</em>' attribute is set.
	 * @see #unsetScaleOrientation()
	 * @see #getScaleOrientation()
	 * @see #setScaleOrientation(TFloatList)
	 * @generated
	 */
	boolean isSetScaleOrientation();

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' attribute.
	 * The default value is <code>"0 0 0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' attribute.
	 * @see #isSetTranslation()
	 * @see #unsetTranslation()
	 * @see #setTranslation(TFloatList)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTransformType_Translation()
	 * @model default="0 0 0" unsettable="true" dataType="org.xml3d._2009.xml3d.XML3DVec3"
	 *        extendedMetaData="kind='attribute' name='translation'"
	 * @generated
	 */
	TFloatList getTranslation();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TransformType#getTranslation <em>Translation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' attribute.
	 * @see #isSetTranslation()
	 * @see #unsetTranslation()
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(TFloatList value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TransformType#getTranslation <em>Translation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTranslation()
	 * @see #getTranslation()
	 * @see #setTranslation(TFloatList)
	 * @generated
	 */
	void unsetTranslation();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TransformType#getTranslation <em>Translation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Translation</em>' attribute is set.
	 * @see #unsetTranslation()
	 * @see #getTranslation()
	 * @see #setTranslation(TFloatList)
	 * @generated
	 */
	boolean isSetTranslation();

} // TransformType
