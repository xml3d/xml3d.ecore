/**
 */
package org.xml3d._2009.xml3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.DataType#getMap <em>Map</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.DataType#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDataType()
 * @model extendedMetaData="name='DataType' kind='elementOnly'"
 * @generated
 */
public interface DataType extends XML3DDataContainer {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' attribute.
	 * @see #isSetMap()
	 * @see #unsetMap()
	 * @see #setMap(String)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDataType_Map()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='map'"
	 * @generated
	 */
	String getMap();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DataType#getMap <em>Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' attribute.
	 * @see #isSetMap()
	 * @see #unsetMap()
	 * @see #getMap()
	 * @generated
	 */
	void setMap(String value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.DataType#getMap <em>Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMap()
	 * @see #getMap()
	 * @see #setMap(String)
	 * @generated
	 */
	void unsetMap();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.DataType#getMap <em>Map</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Map</em>' attribute is set.
	 * @see #unsetMap()
	 * @see #getMap()
	 * @see #setMap(String)
	 * @generated
	 */
	boolean isSetMap();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' reference.
	 * @see #setScript(ScriptType)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getDataType_Script()
	 * @model extendedMetaData="kind='attribute' name='script'"
	 * @generated
	 */
	ScriptType getScript();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.DataType#getScript <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(ScriptType value);

} // DataType
