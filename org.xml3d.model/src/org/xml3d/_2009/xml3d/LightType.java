/**
 */
package org.xml3d._2009.xml3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.LightType#isGlobal <em>Global</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.LightType#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.LightType#getShader <em>Shader</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.LightType#isVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getLightType()
 * @model extendedMetaData="name='light_._type' kind='elementOnly'"
 * @generated
 */
public interface LightType extends XML3DElement {
	/**
	 * Returns the value of the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' attribute.
	 * @see #isSetGlobal()
	 * @see #unsetGlobal()
	 * @see #setGlobal(boolean)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getLightType_Global()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='global'"
	 * @generated
	 */
	boolean isGlobal();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.LightType#isGlobal <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' attribute.
	 * @see #isSetGlobal()
	 * @see #unsetGlobal()
	 * @see #isGlobal()
	 * @generated
	 */
	void setGlobal(boolean value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.LightType#isGlobal <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGlobal()
	 * @see #isGlobal()
	 * @see #setGlobal(boolean)
	 * @generated
	 */
	void unsetGlobal();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.LightType#isGlobal <em>Global</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Global</em>' attribute is set.
	 * @see #unsetGlobal()
	 * @see #isGlobal()
	 * @see #setGlobal(boolean)
	 * @generated
	 */
	boolean isSetGlobal();

	/**
	 * Returns the value of the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intensity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intensity</em>' attribute.
	 * @see #isSetIntensity()
	 * @see #unsetIntensity()
	 * @see #setIntensity(float)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getLightType_Intensity()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='intensity'"
	 * @generated
	 */
	float getIntensity();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.LightType#getIntensity <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity</em>' attribute.
	 * @see #isSetIntensity()
	 * @see #unsetIntensity()
	 * @see #getIntensity()
	 * @generated
	 */
	void setIntensity(float value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.LightType#getIntensity <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntensity()
	 * @see #getIntensity()
	 * @see #setIntensity(float)
	 * @generated
	 */
	void unsetIntensity();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.LightType#getIntensity <em>Intensity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intensity</em>' attribute is set.
	 * @see #unsetIntensity()
	 * @see #getIntensity()
	 * @see #setIntensity(float)
	 * @generated
	 */
	boolean isSetIntensity();

	/**
	 * Returns the value of the '<em><b>Shader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shader</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shader</em>' reference.
	 * @see #setShader(LightShaderType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getLightType_Shader()
	 * @model extendedMetaData="kind='attribute' name='shader'"
	 * @generated
	 */
	LightShaderType getShader();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.LightType#getShader <em>Shader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shader</em>' reference.
	 * @see #getShader()
	 * @generated
	 */
	void setShader(LightShaderType value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(boolean)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getLightType_Visible()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='visible'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.LightType#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.LightType#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.LightType#isVisible <em>Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible</em>' attribute is set.
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	boolean isSetVisible();

} // LightType
