/**
 */
package org.xml3d._2009.xml3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light Shader Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.LightShaderType#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getLightShaderType()
 * @model extendedMetaData="name='LightShaderType' kind='elementOnly'"
 * @generated
 */
public interface LightShaderType extends XML3DDataContainer {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' reference.
	 * @see #setScript(ScriptType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getLightShaderType_Script()
	 * @model extendedMetaData="kind='attribute' name='script'"
	 * @generated
	 */
	ScriptType getScript();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.LightShaderType#getScript <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(ScriptType value);

} // LightShaderType
