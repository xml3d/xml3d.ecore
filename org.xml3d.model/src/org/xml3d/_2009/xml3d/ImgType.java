/**
 */
package org.xml3d._2009.xml3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Img Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.ImgType#getSrc <em>Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getImgType()
 * @model extendedMetaData="name='img_._type' kind='empty'"
 * @generated
 */
public interface ImgType extends HTMLElement {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getImgType_Src()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='src'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.ImgType#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

} // ImgType
