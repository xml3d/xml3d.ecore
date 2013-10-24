/**
 */
package org.xml3d._2009.xml3d;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.DefsType#getChildren <em>Children</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DefsType#getShader <em>Shader</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DefsType#getLightshader <em>Lightshader</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DefsType#getData <em>Data</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DefsType#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DefsType#getMesh <em>Mesh</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DefsType#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDefsType()
 * @model extendedMetaData="name='defs_._type' kind='elementOnly'"
 * @generated
 */
public interface DefsType extends XML3DElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' attribute list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDefsType_Children()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='children:5'"
	 * @generated
	 */
	FeatureMap getChildren();

	/**
	 * Returns the value of the '<em><b>Shader</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.ShaderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shader</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shader</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDefsType_Shader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shader' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<ShaderType> getShader();

	/**
	 * Returns the value of the '<em><b>Lightshader</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.LightShaderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lightshader</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lightshader</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDefsType_Lightshader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lightshader' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<LightShaderType> getLightshader();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDefsType_Data()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<DataType> getData();

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.TransformType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDefsType_Transform()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<TransformType> getTransform();

	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.MeshType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDefsType_Mesh()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mesh' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<MeshType> getMesh();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.ScriptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				script statements, which may include CDATA sections
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDefsType_Script()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<ScriptType> getScript();

} // DefsType
