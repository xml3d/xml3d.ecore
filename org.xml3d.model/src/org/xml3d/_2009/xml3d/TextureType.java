/**
 */
package org.xml3d._2009.xml3d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Texture Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getImg <em>Img</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getFilterMag <em>Filter Mag</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getFilterMin <em>Filter Min</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getFilterMip <em>Filter Mip</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getId <em>Id</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getKey <em>Key</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getName <em>Name</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getType <em>Type</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getWrapS <em>Wrap S</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getWrapT <em>Wrap T</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.TextureType#getWrapU <em>Wrap U</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType()
 * @model extendedMetaData="name='texture_._type' kind='elementOnly'"
 * @generated
 */
public interface TextureType extends EObject {
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
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_Img()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace'"
	 * @generated
	 */
	ImgType getImg();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getImg <em>Img</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Img</em>' containment reference.
	 * @see #getImg()
	 * @generated
	 */
	void setImg(ImgType value);

	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Specifies what color to use, if wrapping mode is
	 * 						'border' and texture coordinates fall outside of
	 * 						the 0.0 to 1.0
	 * 						range.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see #isSetBorderColor()
	 * @see #unsetBorderColor()
	 * @see #setBorderColor(String)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_BorderColor()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='borderColor'"
	 * @generated
	 */
	String getBorderColor();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getBorderColor <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see #isSetBorderColor()
	 * @see #unsetBorderColor()
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(String value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getBorderColor <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBorderColor()
	 * @see #getBorderColor()
	 * @see #setBorderColor(String)
	 * @generated
	 */
	void unsetBorderColor();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TextureType#getBorderColor <em>Border Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Border Color</em>' attribute is set.
	 * @see #unsetBorderColor()
	 * @see #getBorderColor()
	 * @see #setBorderColor(String)
	 * @generated
	 */
	boolean isSetBorderColor();

	/**
	 * Returns the value of the '<em><b>Filter Mag</b></em>' attribute.
	 * The default value is <code>"linear"</code>.
	 * The literals are from the enumeration {@link org.xml3d._2009.xml3d.FilterTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Specifies how to apply the texture if the area
	 * 						to be
	 * 						textured contains more pixels than the
	 * 						texture.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Mag</em>' attribute.
	 * @see org.xml3d._2009.xml3d.FilterTypes
	 * @see #isSetFilterMag()
	 * @see #unsetFilterMag()
	 * @see #setFilterMag(FilterTypes)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_FilterMag()
	 * @model default="linear" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='filterMag'"
	 * @generated
	 */
	FilterTypes getFilterMag();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getFilterMag <em>Filter Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Mag</em>' attribute.
	 * @see org.xml3d._2009.xml3d.FilterTypes
	 * @see #isSetFilterMag()
	 * @see #unsetFilterMag()
	 * @see #getFilterMag()
	 * @generated
	 */
	void setFilterMag(FilterTypes value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getFilterMag <em>Filter Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilterMag()
	 * @see #getFilterMag()
	 * @see #setFilterMag(FilterTypes)
	 * @generated
	 */
	void unsetFilterMag();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TextureType#getFilterMag <em>Filter Mag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter Mag</em>' attribute is set.
	 * @see #unsetFilterMag()
	 * @see #getFilterMag()
	 * @see #setFilterMag(FilterTypes)
	 * @generated
	 */
	boolean isSetFilterMag();

	/**
	 * Returns the value of the '<em><b>Filter Min</b></em>' attribute.
	 * The default value is <code>"linear"</code>.
	 * The literals are from the enumeration {@link org.xml3d._2009.xml3d.FilterTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Specifies how to apply the texture if the area
	 * 						to be
	 * 						textured has fewer pixels than the
	 * 						texture.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Min</em>' attribute.
	 * @see org.xml3d._2009.xml3d.FilterTypes
	 * @see #isSetFilterMin()
	 * @see #unsetFilterMin()
	 * @see #setFilterMin(FilterTypes)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_FilterMin()
	 * @model default="linear" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='filterMin'"
	 * @generated
	 */
	FilterTypes getFilterMin();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getFilterMin <em>Filter Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Min</em>' attribute.
	 * @see org.xml3d._2009.xml3d.FilterTypes
	 * @see #isSetFilterMin()
	 * @see #unsetFilterMin()
	 * @see #getFilterMin()
	 * @generated
	 */
	void setFilterMin(FilterTypes value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getFilterMin <em>Filter Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilterMin()
	 * @see #getFilterMin()
	 * @see #setFilterMin(FilterTypes)
	 * @generated
	 */
	void unsetFilterMin();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TextureType#getFilterMin <em>Filter Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter Min</em>' attribute is set.
	 * @see #unsetFilterMin()
	 * @see #getFilterMin()
	 * @see #setFilterMin(FilterTypes)
	 * @generated
	 */
	boolean isSetFilterMin();

	/**
	 * Returns the value of the '<em><b>Filter Mip</b></em>' attribute.
	 * The default value is <code>"nearest"</code>.
	 * The literals are from the enumeration {@link org.xml3d._2009.xml3d.FilterTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Specifies what mipmap level to use, when a
	 * 						minification filter is required for the texture.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Mip</em>' attribute.
	 * @see org.xml3d._2009.xml3d.FilterTypes
	 * @see #isSetFilterMip()
	 * @see #unsetFilterMip()
	 * @see #setFilterMip(FilterTypes)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_FilterMip()
	 * @model default="nearest" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='filterMip'"
	 * @generated
	 */
	FilterTypes getFilterMip();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getFilterMip <em>Filter Mip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Mip</em>' attribute.
	 * @see org.xml3d._2009.xml3d.FilterTypes
	 * @see #isSetFilterMip()
	 * @see #unsetFilterMip()
	 * @see #getFilterMip()
	 * @generated
	 */
	void setFilterMip(FilterTypes value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getFilterMip <em>Filter Mip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilterMip()
	 * @see #getFilterMip()
	 * @see #setFilterMip(FilterTypes)
	 * @generated
	 */
	void unsetFilterMip();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TextureType#getFilterMip <em>Filter Mip</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter Mip</em>' attribute is set.
	 * @see #unsetFilterMip()
	 * @see #getFilterMip()
	 * @see #setFilterMip(FilterTypes)
	 * @generated
	 */
	boolean isSetFilterMip();

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
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getId <em>Id</em>}' attribute.
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
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_Key()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='key'"
	 * @generated
	 */
	float getKey();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getKey <em>Key</em>}' attribute.
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
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKey()
	 * @see #getKey()
	 * @see #setKey(float)
	 * @generated
	 */
	void unsetKey();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TextureType#getKey <em>Key</em>}' attribute is set.
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
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"2D"</code>.
	 * The literals are from the enumeration {@link org.xml3d._2009.xml3d.TextureTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Set the dimensions of the texture.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.xml3d._2009.xml3d.TextureTypes
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TextureTypes)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_Type()
	 * @model default="2D" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TextureTypes getType();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.xml3d._2009.xml3d.TextureTypes
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TextureTypes value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TextureTypes)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TextureType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TextureTypes)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Wrap S</b></em>' attribute.
	 * The default value is <code>"clamp"</code>.
	 * The literals are from the enumeration {@link org.xml3d._2009.xml3d.WrapTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Specifies what happens when the texture
	 * 						coordinates
	 * 						fall outside of the 0.0 to 1.0 range
	 * 						in s direction.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wrap S</em>' attribute.
	 * @see org.xml3d._2009.xml3d.WrapTypes
	 * @see #isSetWrapS()
	 * @see #unsetWrapS()
	 * @see #setWrapS(WrapTypes)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_WrapS()
	 * @model default="clamp" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='wrapS'"
	 * @generated
	 */
	WrapTypes getWrapS();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getWrapS <em>Wrap S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap S</em>' attribute.
	 * @see org.xml3d._2009.xml3d.WrapTypes
	 * @see #isSetWrapS()
	 * @see #unsetWrapS()
	 * @see #getWrapS()
	 * @generated
	 */
	void setWrapS(WrapTypes value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getWrapS <em>Wrap S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrapS()
	 * @see #getWrapS()
	 * @see #setWrapS(WrapTypes)
	 * @generated
	 */
	void unsetWrapS();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TextureType#getWrapS <em>Wrap S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrap S</em>' attribute is set.
	 * @see #unsetWrapS()
	 * @see #getWrapS()
	 * @see #setWrapS(WrapTypes)
	 * @generated
	 */
	boolean isSetWrapS();

	/**
	 * Returns the value of the '<em><b>Wrap T</b></em>' attribute.
	 * The default value is <code>"clamp"</code>.
	 * The literals are from the enumeration {@link org.xml3d._2009.xml3d.WrapTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Specifies what happens when the texture
	 * 						coordinates
	 * 						fall outside of the 0.0 to 1.0 range
	 * 						in t direction.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wrap T</em>' attribute.
	 * @see org.xml3d._2009.xml3d.WrapTypes
	 * @see #isSetWrapT()
	 * @see #unsetWrapT()
	 * @see #setWrapT(WrapTypes)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_WrapT()
	 * @model default="clamp" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='wrapT'"
	 * @generated
	 */
	WrapTypes getWrapT();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getWrapT <em>Wrap T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap T</em>' attribute.
	 * @see org.xml3d._2009.xml3d.WrapTypes
	 * @see #isSetWrapT()
	 * @see #unsetWrapT()
	 * @see #getWrapT()
	 * @generated
	 */
	void setWrapT(WrapTypes value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getWrapT <em>Wrap T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrapT()
	 * @see #getWrapT()
	 * @see #setWrapT(WrapTypes)
	 * @generated
	 */
	void unsetWrapT();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TextureType#getWrapT <em>Wrap T</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrap T</em>' attribute is set.
	 * @see #unsetWrapT()
	 * @see #getWrapT()
	 * @see #setWrapT(WrapTypes)
	 * @generated
	 */
	boolean isSetWrapT();

	/**
	 * Returns the value of the '<em><b>Wrap U</b></em>' attribute.
	 * The default value is <code>"clamp"</code>.
	 * The literals are from the enumeration {@link org.xml3d._2009.xml3d.WrapTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Specifies what happens when the texture
	 * 						coordinates
	 * 						fall outside of the 0.0 to 1.0 range
	 * 						in u direction.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wrap U</em>' attribute.
	 * @see org.xml3d._2009.xml3d.WrapTypes
	 * @see #isSetWrapU()
	 * @see #unsetWrapU()
	 * @see #setWrapU(WrapTypes)
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#getTextureType_WrapU()
	 * @model default="clamp" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='wrapU'"
	 * @generated
	 */
	WrapTypes getWrapU();

	/**
	 * Sets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getWrapU <em>Wrap U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap U</em>' attribute.
	 * @see org.xml3d._2009.xml3d.WrapTypes
	 * @see #isSetWrapU()
	 * @see #unsetWrapU()
	 * @see #getWrapU()
	 * @generated
	 */
	void setWrapU(WrapTypes value);

	/**
	 * Unsets the value of the '{@link org.xml3d._2009.xml3d.TextureType#getWrapU <em>Wrap U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrapU()
	 * @see #getWrapU()
	 * @see #setWrapU(WrapTypes)
	 * @generated
	 */
	void unsetWrapU();

	/**
	 * Returns whether the value of the '{@link org.xml3d._2009.xml3d.TextureType#getWrapU <em>Wrap U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrap U</em>' attribute is set.
	 * @see #unsetWrapU()
	 * @see #getWrapU()
	 * @see #setWrapU(WrapTypes)
	 * @generated
	 */
	boolean isSetWrapU();

} // TextureType
