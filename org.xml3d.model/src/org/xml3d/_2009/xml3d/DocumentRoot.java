/**
 */
package org.xml3d._2009.xml3d;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getBool <em>Bool</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getData <em>Data</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getDefs <em>Defs</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat <em>Float</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getImg <em>Img</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getInt <em>Int</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getLight <em>Light</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getLightshader <em>Lightshader</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getMesh <em>Mesh</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getScript <em>Script</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getShader <em>Shader</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getTexture <em>Texture</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getView <em>View</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DocumentRoot#getXml3d <em>Xml3d</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' containment reference.
	 * @see #setBool(BoolType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Bool()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bool' namespace='##targetNamespace'"
	 * @generated
	 */
	BoolType getBool();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getBool <em>Bool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool</em>' containment reference.
	 * @see #getBool()
	 * @generated
	 */
	void setBool(BoolType value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(DataType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Data()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	DataType getData();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataType value);

	/**
	 * Returns the value of the '<em><b>Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defs</em>' containment reference.
	 * @see #setDefs(DefsType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Defs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='defs' namespace='##targetNamespace'"
	 * @generated
	 */
	DefsType getDefs();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getDefs <em>Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defs</em>' containment reference.
	 * @see #getDefs()
	 * @generated
	 */
	void setDefs(DefsType value);

	/**
	 * Returns the value of the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' containment reference.
	 * @see #setFloat(FloatType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Float()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
	 * @generated
	 */
	FloatType getFloat();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat <em>Float</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float</em>' containment reference.
	 * @see #getFloat()
	 * @generated
	 */
	void setFloat(FloatType value);

	/**
	 * Returns the value of the '<em><b>Float2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float2</em>' containment reference.
	 * @see #setFloat2(Float2Type)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Float2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='float2' namespace='##targetNamespace'"
	 * @generated
	 */
	Float2Type getFloat2();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat2 <em>Float2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float2</em>' containment reference.
	 * @see #getFloat2()
	 * @generated
	 */
	void setFloat2(Float2Type value);

	/**
	 * Returns the value of the '<em><b>Float3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float3</em>' containment reference.
	 * @see #setFloat3(Float3Type)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Float3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='float3' namespace='##targetNamespace'"
	 * @generated
	 */
	Float3Type getFloat3();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat3 <em>Float3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float3</em>' containment reference.
	 * @see #getFloat3()
	 * @generated
	 */
	void setFloat3(Float3Type value);

	/**
	 * Returns the value of the '<em><b>Float4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float4</em>' containment reference.
	 * @see #setFloat4(Float4Type)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Float4()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='float4' namespace='##targetNamespace'"
	 * @generated
	 */
	Float4Type getFloat4();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat4 <em>Float4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float4</em>' containment reference.
	 * @see #getFloat4()
	 * @generated
	 */
	void setFloat4(Float4Type value);

	/**
	 * Returns the value of the '<em><b>Float4x4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float4x4</em>' containment reference.
	 * @see #setFloat4x4(Float4x4Type)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Float4x4()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='float4x4' namespace='##targetNamespace'"
	 * @generated
	 */
	Float4x4Type getFloat4x4();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat4x4 <em>Float4x4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float4x4</em>' containment reference.
	 * @see #getFloat4x4()
	 * @generated
	 */
	void setFloat4x4(Float4x4Type value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(GroupType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Group()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupType getGroup();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(GroupType value);

	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Img</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img</em>' containment reference.
	 * @see #setImg(ImgType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Img()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace'"
	 * @generated
	 */
	ImgType getImg();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getImg <em>Img</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Img</em>' containment reference.
	 * @see #getImg()
	 * @generated
	 */
	void setImg(ImgType value);

	/**
	 * Returns the value of the '<em><b>Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int</em>' containment reference.
	 * @see #setInt(IntType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Int()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='int' namespace='##targetNamespace'"
	 * @generated
	 */
	IntType getInt();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getInt <em>Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int</em>' containment reference.
	 * @see #getInt()
	 * @generated
	 */
	void setInt(IntType value);

	/**
	 * Returns the value of the '<em><b>Int4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int4</em>' containment reference.
	 * @see #setInt4(Int4Type)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Int4()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='int4' namespace='##targetNamespace'"
	 * @generated
	 */
	Int4Type getInt4();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getInt4 <em>Int4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int4</em>' containment reference.
	 * @see #getInt4()
	 * @generated
	 */
	void setInt4(Int4Type value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' containment reference.
	 * @see #setLight(LightType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Light()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='light' namespace='##targetNamespace'"
	 * @generated
	 */
	LightType getLight();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getLight <em>Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' containment reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(LightType value);

	/**
	 * Returns the value of the '<em><b>Lightshader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lightshader</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lightshader</em>' containment reference.
	 * @see #setLightshader(LightShaderType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Lightshader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lightshader' namespace='##targetNamespace'"
	 * @generated
	 */
	LightShaderType getLightshader();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getLightshader <em>Lightshader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lightshader</em>' containment reference.
	 * @see #getLightshader()
	 * @generated
	 */
	void setLightshader(LightShaderType value);

	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' containment reference.
	 * @see #setMesh(MeshType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Mesh()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mesh' namespace='##targetNamespace'"
	 * @generated
	 */
	MeshType getMesh();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getMesh <em>Mesh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' containment reference.
	 * @see #getMesh()
	 * @generated
	 */
	void setMesh(MeshType value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				script statements, which may include CDATA sections
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(ScriptType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Script()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace'"
	 * @generated
	 */
	ScriptType getScript();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(ScriptType value);

	/**
	 * Returns the value of the '<em><b>Shader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shader</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shader</em>' containment reference.
	 * @see #setShader(ShaderType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Shader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shader' namespace='##targetNamespace'"
	 * @generated
	 */
	ShaderType getShader();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getShader <em>Shader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shader</em>' containment reference.
	 * @see #getShader()
	 * @generated
	 */
	void setShader(ShaderType value);

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' containment reference.
	 * @see #setTexture(TextureType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Texture()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='texture' namespace='##targetNamespace'"
	 * @generated
	 */
	TextureType getTexture();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getTexture <em>Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture</em>' containment reference.
	 * @see #getTexture()
	 * @generated
	 */
	void setTexture(TextureType value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(TransformType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Transform()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformType getTransform();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(TransformType value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference.
	 * @see #setView(ViewType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_View()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='view' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewType getView();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' containment reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(ViewType value);

	/**
	 * Returns the value of the '<em><b>Xml3d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml3d</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml3d</em>' containment reference.
	 * @see #setXml3d(Xml3dType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDocumentRoot_Xml3d()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xml3d' namespace='##targetNamespace'"
	 * @generated
	 */
	Xml3dType getXml3d();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DocumentRoot#getXml3d <em>Xml3d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml3d</em>' containment reference.
	 * @see #getXml3d()
	 * @generated
	 */
	void setXml3d(Xml3dType value);

} // DocumentRoot
