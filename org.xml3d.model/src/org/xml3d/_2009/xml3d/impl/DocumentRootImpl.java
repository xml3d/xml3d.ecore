/**
 */
package org.xml3d._2009.xml3d.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.xml3d._2009.xml3d.BoolType;
import org.xml3d._2009.xml3d.DataType;
import org.xml3d._2009.xml3d.DefsType;
import org.xml3d._2009.xml3d.DocumentRoot;
import org.xml3d._2009.xml3d.Float2Type;
import org.xml3d._2009.xml3d.Float3Type;
import org.xml3d._2009.xml3d.Float4Type;
import org.xml3d._2009.xml3d.Float4x4Type;
import org.xml3d._2009.xml3d.FloatType;
import org.xml3d._2009.xml3d.GroupType;
import org.xml3d._2009.xml3d.ImgType;
import org.xml3d._2009.xml3d.Int4Type;
import org.xml3d._2009.xml3d.IntType;
import org.xml3d._2009.xml3d.LightShaderType;
import org.xml3d._2009.xml3d.LightType;
import org.xml3d._2009.xml3d.MeshType;
import org.xml3d._2009.xml3d.ScriptType;
import org.xml3d._2009.xml3d.ShaderType;
import org.xml3d._2009.xml3d.TextureType;
import org.xml3d._2009.xml3d.TransformType;
import org.xml3d._2009.xml3d.ViewType;
import org.xml3d._2009.xml3d.Xml3dPackage;
import org.xml3d._2009.xml3d.Xml3dType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getDefs <em>Defs</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getLight <em>Light</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getLightshader <em>Lightshader</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getMesh <em>Mesh</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getShader <em>Shader</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getTexture <em>Texture</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getView <em>View</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl#getXml3d <em>Xml3d</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xml3dPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Xml3dPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Xml3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Xml3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolType getBool() {
		return (BoolType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__BOOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBool(BoolType newBool, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__BOOL, newBool, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBool(BoolType newBool) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__BOOL, newBool);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getData() {
		return (DataType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(DataType newData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__DATA, newData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(DataType newData) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefsType getDefs() {
		return (DefsType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__DEFS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefs(DefsType newDefs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__DEFS, newDefs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefs(DefsType newDefs) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__DEFS, newDefs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatType getFloat() {
		return (FloatType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloat(FloatType newFloat, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT, newFloat, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat(FloatType newFloat) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT, newFloat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float2Type getFloat2() {
		return (Float2Type)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloat2(Float2Type newFloat2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT2, newFloat2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat2(Float2Type newFloat2) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT2, newFloat2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float3Type getFloat3() {
		return (Float3Type)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT3, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloat3(Float3Type newFloat3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT3, newFloat3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat3(Float3Type newFloat3) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT3, newFloat3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float4Type getFloat4() {
		return (Float4Type)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT4, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloat4(Float4Type newFloat4, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT4, newFloat4, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat4(Float4Type newFloat4) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT4, newFloat4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float4x4Type getFloat4x4() {
		return (Float4x4Type)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT4X4, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloat4x4(Float4x4Type newFloat4x4, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT4X4, newFloat4x4, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat4x4(Float4x4Type newFloat4x4) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__FLOAT4X4, newFloat4x4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType getGroup() {
		return (GroupType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(GroupType newGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__GROUP, newGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(GroupType newGroup) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__GROUP, newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImgType getImg() {
		return (ImgType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__IMG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImg(ImgType newImg, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__IMG, newImg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImg(ImgType newImg) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__IMG, newImg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntType getInt() {
		return (IntType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__INT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInt(IntType newInt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__INT, newInt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt(IntType newInt) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__INT, newInt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int4Type getInt4() {
		return (Int4Type)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__INT4, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInt4(Int4Type newInt4, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__INT4, newInt4, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt4(Int4Type newInt4) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__INT4, newInt4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightType getLight() {
		return (LightType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__LIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLight(LightType newLight, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__LIGHT, newLight, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLight(LightType newLight) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__LIGHT, newLight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightShaderType getLightshader() {
		return (LightShaderType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__LIGHTSHADER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightshader(LightShaderType newLightshader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__LIGHTSHADER, newLightshader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightshader(LightShaderType newLightshader) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__LIGHTSHADER, newLightshader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshType getMesh() {
		return (MeshType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__MESH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMesh(MeshType newMesh, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__MESH, newMesh, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesh(MeshType newMesh) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__MESH, newMesh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType getScript() {
		return (ScriptType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__SCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(ScriptType newScript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__SCRIPT, newScript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(ScriptType newScript) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__SCRIPT, newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShaderType getShader() {
		return (ShaderType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__SHADER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShader(ShaderType newShader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__SHADER, newShader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShader(ShaderType newShader) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__SHADER, newShader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureType getTexture() {
		return (TextureType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__TEXTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTexture(TextureType newTexture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__TEXTURE, newTexture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexture(TextureType newTexture) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__TEXTURE, newTexture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformType getTransform() {
		return (TransformType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__TRANSFORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(TransformType newTransform, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__TRANSFORM, newTransform, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(TransformType newTransform) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__TRANSFORM, newTransform);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewType getView() {
		return (ViewType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__VIEW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetView(ViewType newView, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__VIEW, newView, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(ViewType newView) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__VIEW, newView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xml3dType getXml3d() {
		return (Xml3dType)getMixed().get(Xml3dPackage.Literals.DOCUMENT_ROOT__XML3D, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXml3d(Xml3dType newXml3d, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Xml3dPackage.Literals.DOCUMENT_ROOT__XML3D, newXml3d, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml3d(Xml3dType newXml3d) {
		((FeatureMap.Internal)getMixed()).set(Xml3dPackage.Literals.DOCUMENT_ROOT__XML3D, newXml3d);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xml3dPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__BOOL:
				return basicSetBool(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__DATA:
				return basicSetData(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__DEFS:
				return basicSetDefs(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT:
				return basicSetFloat(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT2:
				return basicSetFloat2(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT3:
				return basicSetFloat3(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT4:
				return basicSetFloat4(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT4X4:
				return basicSetFloat4x4(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__GROUP:
				return basicSetGroup(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__IMG:
				return basicSetImg(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__INT:
				return basicSetInt(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__INT4:
				return basicSetInt4(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__LIGHT:
				return basicSetLight(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__LIGHTSHADER:
				return basicSetLightshader(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__MESH:
				return basicSetMesh(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__SCRIPT:
				return basicSetScript(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__SHADER:
				return basicSetShader(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__TEXTURE:
				return basicSetTexture(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__TRANSFORM:
				return basicSetTransform(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__VIEW:
				return basicSetView(null, msgs);
			case Xml3dPackage.DOCUMENT_ROOT__XML3D:
				return basicSetXml3d(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xml3dPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Xml3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Xml3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Xml3dPackage.DOCUMENT_ROOT__BOOL:
				return getBool();
			case Xml3dPackage.DOCUMENT_ROOT__DATA:
				return getData();
			case Xml3dPackage.DOCUMENT_ROOT__DEFS:
				return getDefs();
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT:
				return getFloat();
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT2:
				return getFloat2();
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT3:
				return getFloat3();
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT4:
				return getFloat4();
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT4X4:
				return getFloat4x4();
			case Xml3dPackage.DOCUMENT_ROOT__GROUP:
				return getGroup();
			case Xml3dPackage.DOCUMENT_ROOT__IMG:
				return getImg();
			case Xml3dPackage.DOCUMENT_ROOT__INT:
				return getInt();
			case Xml3dPackage.DOCUMENT_ROOT__INT4:
				return getInt4();
			case Xml3dPackage.DOCUMENT_ROOT__LIGHT:
				return getLight();
			case Xml3dPackage.DOCUMENT_ROOT__LIGHTSHADER:
				return getLightshader();
			case Xml3dPackage.DOCUMENT_ROOT__MESH:
				return getMesh();
			case Xml3dPackage.DOCUMENT_ROOT__SCRIPT:
				return getScript();
			case Xml3dPackage.DOCUMENT_ROOT__SHADER:
				return getShader();
			case Xml3dPackage.DOCUMENT_ROOT__TEXTURE:
				return getTexture();
			case Xml3dPackage.DOCUMENT_ROOT__TRANSFORM:
				return getTransform();
			case Xml3dPackage.DOCUMENT_ROOT__VIEW:
				return getView();
			case Xml3dPackage.DOCUMENT_ROOT__XML3D:
				return getXml3d();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Xml3dPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__BOOL:
				setBool((BoolType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__DATA:
				setData((DataType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__DEFS:
				setDefs((DefsType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT:
				setFloat((FloatType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT2:
				setFloat2((Float2Type)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT3:
				setFloat3((Float3Type)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT4:
				setFloat4((Float4Type)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT4X4:
				setFloat4x4((Float4x4Type)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__GROUP:
				setGroup((GroupType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__IMG:
				setImg((ImgType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__INT:
				setInt((IntType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__INT4:
				setInt4((Int4Type)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__LIGHT:
				setLight((LightType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__LIGHTSHADER:
				setLightshader((LightShaderType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__MESH:
				setMesh((MeshType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__SCRIPT:
				setScript((ScriptType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__SHADER:
				setShader((ShaderType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__TEXTURE:
				setTexture((TextureType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform((TransformType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__VIEW:
				setView((ViewType)newValue);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__XML3D:
				setXml3d((Xml3dType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Xml3dPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Xml3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Xml3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Xml3dPackage.DOCUMENT_ROOT__BOOL:
				setBool((BoolType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__DATA:
				setData((DataType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__DEFS:
				setDefs((DefsType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT:
				setFloat((FloatType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT2:
				setFloat2((Float2Type)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT3:
				setFloat3((Float3Type)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT4:
				setFloat4((Float4Type)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT4X4:
				setFloat4x4((Float4x4Type)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__GROUP:
				setGroup((GroupType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__IMG:
				setImg((ImgType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__INT:
				setInt((IntType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__INT4:
				setInt4((Int4Type)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__LIGHT:
				setLight((LightType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__LIGHTSHADER:
				setLightshader((LightShaderType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__MESH:
				setMesh((MeshType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__SCRIPT:
				setScript((ScriptType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__SHADER:
				setShader((ShaderType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__TEXTURE:
				setTexture((TextureType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform((TransformType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__VIEW:
				setView((ViewType)null);
				return;
			case Xml3dPackage.DOCUMENT_ROOT__XML3D:
				setXml3d((Xml3dType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Xml3dPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Xml3dPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Xml3dPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Xml3dPackage.DOCUMENT_ROOT__BOOL:
				return getBool() != null;
			case Xml3dPackage.DOCUMENT_ROOT__DATA:
				return getData() != null;
			case Xml3dPackage.DOCUMENT_ROOT__DEFS:
				return getDefs() != null;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT:
				return getFloat() != null;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT2:
				return getFloat2() != null;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT3:
				return getFloat3() != null;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT4:
				return getFloat4() != null;
			case Xml3dPackage.DOCUMENT_ROOT__FLOAT4X4:
				return getFloat4x4() != null;
			case Xml3dPackage.DOCUMENT_ROOT__GROUP:
				return getGroup() != null;
			case Xml3dPackage.DOCUMENT_ROOT__IMG:
				return getImg() != null;
			case Xml3dPackage.DOCUMENT_ROOT__INT:
				return getInt() != null;
			case Xml3dPackage.DOCUMENT_ROOT__INT4:
				return getInt4() != null;
			case Xml3dPackage.DOCUMENT_ROOT__LIGHT:
				return getLight() != null;
			case Xml3dPackage.DOCUMENT_ROOT__LIGHTSHADER:
				return getLightshader() != null;
			case Xml3dPackage.DOCUMENT_ROOT__MESH:
				return getMesh() != null;
			case Xml3dPackage.DOCUMENT_ROOT__SCRIPT:
				return getScript() != null;
			case Xml3dPackage.DOCUMENT_ROOT__SHADER:
				return getShader() != null;
			case Xml3dPackage.DOCUMENT_ROOT__TEXTURE:
				return getTexture() != null;
			case Xml3dPackage.DOCUMENT_ROOT__TRANSFORM:
				return getTransform() != null;
			case Xml3dPackage.DOCUMENT_ROOT__VIEW:
				return getView() != null;
			case Xml3dPackage.DOCUMENT_ROOT__XML3D:
				return getXml3d() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
