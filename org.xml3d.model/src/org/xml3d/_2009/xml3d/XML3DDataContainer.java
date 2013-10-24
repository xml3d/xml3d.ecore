/**
 */
package org.xml3d._2009.xml3d;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML3D Data Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getChildren <em>Children</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getData <em>Data</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getBool <em>Bool</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getFloat <em>Float</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getInt <em>Int</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getTexture <em>Texture</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getCompute <em>Compute</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getProto <em>Proto</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.XML3DDataContainer#getSrc <em>Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer()
 * @model abstract="true"
 *        extendedMetaData="name='XML3DDataContainer' kind='elementOnly'"
 * @generated
 */
public interface XML3DDataContainer extends XML3DElement {
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
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Children()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='children:5'"
	 * @generated
	 */
	FeatureMap getChildren();

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
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Data()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<DataType> getData();

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.BoolType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Bool()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bool' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<BoolType> getBool();

	/**
	 * Returns the value of the '<em><b>Float</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.FloatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Float()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<FloatType> getFloat();

	/**
	 * Returns the value of the '<em><b>Float2</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.Float2Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float2</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Float2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='float2' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<Float2Type> getFloat2();

	/**
	 * Returns the value of the '<em><b>Float3</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.Float3Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float3</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Float3()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='float3' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<Float3Type> getFloat3();

	/**
	 * Returns the value of the '<em><b>Float4</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.Float4Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float4</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Float4()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='float4' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<Float4Type> getFloat4();

	/**
	 * Returns the value of the '<em><b>Float4x4</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.Float4x4Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float4x4</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Float4x4()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='float4x4' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<Float4x4Type> getFloat4x4();

	/**
	 * Returns the value of the '<em><b>Int</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.IntType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Int()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='int' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<IntType> getInt();

	/**
	 * Returns the value of the '<em><b>Int4</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.Int4Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int4</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Int4()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='int4' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<Int4Type> getInt4();

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' containment reference list.
	 * The list contents are of type {@link org.xml3d._2009.xml3d.TextureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' containment reference list.
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Texture()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='texture' namespace='##targetNamespace' group='#children:5'"
	 * @generated
	 */
	EList<TextureType> getTexture();

	/**
	 * Returns the value of the '<em><b>Compute</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compute</em>' attribute.
	 * @see #isSetCompute()
	 * @see #unsetCompute()
	 * @see #setCompute(String)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Compute()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='compute'"
	 * @generated
	 */
	String getCompute();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getCompute <em>Compute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compute</em>' attribute.
	 * @see #isSetCompute()
	 * @see #unsetCompute()
	 * @see #getCompute()
	 * @generated
	 */
	void setCompute(String value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getCompute <em>Compute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompute()
	 * @see #getCompute()
	 * @see #setCompute(String)
	 * @generated
	 */
	void unsetCompute();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getCompute <em>Compute</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compute</em>' attribute is set.
	 * @see #unsetCompute()
	 * @see #getCompute()
	 * @see #setCompute(String)
	 * @generated
	 */
	boolean isSetCompute();

	/**
	 * Returns the value of the '<em><b>Proto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proto</em>' reference.
	 * @see #setProto(DataType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Proto()
	 * @model extendedMetaData="kind='attribute' name='proto'"
	 * @generated
	 */
	DataType getProto();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getProto <em>Proto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proto</em>' reference.
	 * @see #getProto()
	 * @generated
	 */
	void setProto(DataType value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(DataType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getXML3DDataContainer_Src()
	 * @model extendedMetaData="kind='attribute' name='src'"
	 * @generated
	 */
	DataType getSrc();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(DataType value);

} // XML3DDataContainer
