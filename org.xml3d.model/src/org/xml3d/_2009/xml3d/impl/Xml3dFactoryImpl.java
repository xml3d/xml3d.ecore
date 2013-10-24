/**
 */
package org.xml3d._2009.xml3d.impl;

import gnu.trove.list.TFloatList;
import gnu.trove.list.TIntList;
import gnu.trove.list.array.TFloatArrayList;
import gnu.trove.list.array.TIntArrayList;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.xml3d._2009.xml3d.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Xml3dFactoryImpl extends EFactoryImpl implements Xml3dFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Xml3dFactory init() {
		try {
			Xml3dFactory theXml3dFactory = (Xml3dFactory)EPackage.Registry.INSTANCE.getEFactory(Xml3dPackage.eNS_URI);
			if (theXml3dFactory != null) {
				return theXml3dFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Xml3dFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xml3dFactoryImpl() {
		super();
	}

	 protected String [] split(String value)
	 {
		 return super.split(value.trim());
	 }
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Xml3dPackage.BOOL_TYPE: return createBoolType();
			case Xml3dPackage.DATA_TYPE: return createDataType();
			case Xml3dPackage.DEFS_TYPE: return createDefsType();
			case Xml3dPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case Xml3dPackage.FLOAT2_TYPE: return createFloat2Type();
			case Xml3dPackage.FLOAT3_TYPE: return createFloat3Type();
			case Xml3dPackage.FLOAT4_TYPE: return createFloat4Type();
			case Xml3dPackage.FLOAT4X4_TYPE: return createFloat4x4Type();
			case Xml3dPackage.FLOAT_TYPE: return createFloatType();
			case Xml3dPackage.GROUP_TYPE: return createGroupType();
			case Xml3dPackage.IMG_TYPE: return createImgType();
			case Xml3dPackage.INT4_TYPE: return createInt4Type();
			case Xml3dPackage.INT_TYPE: return createIntType();
			case Xml3dPackage.LIGHT_SHADER_TYPE: return createLightShaderType();
			case Xml3dPackage.LIGHT_TYPE: return createLightType();
			case Xml3dPackage.MESH_TYPE: return createMeshType();
			case Xml3dPackage.SCRIPT_TYPE: return createScriptType();
			case Xml3dPackage.SHADER_TYPE: return createShaderType();
			case Xml3dPackage.TEXTURE_TYPE: return createTextureType();
			case Xml3dPackage.TRANSFORM_TYPE: return createTransformType();
			case Xml3dPackage.VIEW_TYPE: return createViewType();
			case Xml3dPackage.XML3D_TYPE: return createXml3dType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Xml3dPackage.FILTER_TYPES:
				return createFilterTypesFromString(eDataType, initialValue);
			case Xml3dPackage.MESH_TYPE_NAMES:
				return createMeshTypeNamesFromString(eDataType, initialValue);
			case Xml3dPackage.TEXTURE_TYPES:
				return createTextureTypesFromString(eDataType, initialValue);
			case Xml3dPackage.WRAP_TYPES:
				return createWrapTypesFromString(eDataType, initialValue);
			case Xml3dPackage.BOOLEAN_ARRAY:
				return createBooleanArrayFromString(eDataType, initialValue);
			case Xml3dPackage.CONTENT_TYPE:
				return createContentTypeFromString(eDataType, initialValue);
			case Xml3dPackage.FILTER_TYPES_OBJECT:
				return createFilterTypesObjectFromString(eDataType, initialValue);
			case Xml3dPackage.FLOAT2_ARRAY:
				return createFloat2ArrayFromString(eDataType, initialValue);
			case Xml3dPackage.FLOAT3_ARRAY:
				return createFloat3ArrayFromString(eDataType, initialValue);
			case Xml3dPackage.FLOAT4_ARRAY:
				return createFloat4ArrayFromString(eDataType, initialValue);
			case Xml3dPackage.FLOAT4X4_ARRAY:
				return createFloat4x4ArrayFromString(eDataType, initialValue);
			case Xml3dPackage.FLOAT_ARRAY:
				return createFloatArrayFromString(eDataType, initialValue);
			case Xml3dPackage.INT4_ARRAY:
				return createInt4ArrayFromString(eDataType, initialValue);
			case Xml3dPackage.INT_ARRAY:
				return createIntArrayFromString(eDataType, initialValue);
			case Xml3dPackage.MESH_TYPE_NAMES_OBJECT:
				return createMeshTypeNamesObjectFromString(eDataType, initialValue);
			case Xml3dPackage.TEXTURE_TYPES_OBJECT:
				return createTextureTypesObjectFromString(eDataType, initialValue);
			case Xml3dPackage.WRAP_TYPES_OBJECT:
				return createWrapTypesObjectFromString(eDataType, initialValue);
			case Xml3dPackage.XML3D_ROTATION:
				return createXML3DRotationFromString(eDataType, initialValue);
			case Xml3dPackage.XML3D_VEC3:
				return createXML3DVec3FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Xml3dPackage.FILTER_TYPES:
				return convertFilterTypesToString(eDataType, instanceValue);
			case Xml3dPackage.MESH_TYPE_NAMES:
				return convertMeshTypeNamesToString(eDataType, instanceValue);
			case Xml3dPackage.TEXTURE_TYPES:
				return convertTextureTypesToString(eDataType, instanceValue);
			case Xml3dPackage.WRAP_TYPES:
				return convertWrapTypesToString(eDataType, instanceValue);
			case Xml3dPackage.BOOLEAN_ARRAY:
				return convertBooleanArrayToString(eDataType, instanceValue);
			case Xml3dPackage.CONTENT_TYPE:
				return convertContentTypeToString(eDataType, instanceValue);
			case Xml3dPackage.FILTER_TYPES_OBJECT:
				return convertFilterTypesObjectToString(eDataType, instanceValue);
			case Xml3dPackage.FLOAT2_ARRAY:
				return convertFloat2ArrayToString(eDataType, instanceValue);
			case Xml3dPackage.FLOAT3_ARRAY:
				return convertFloat3ArrayToString(eDataType, instanceValue);
			case Xml3dPackage.FLOAT4_ARRAY:
				return convertFloat4ArrayToString(eDataType, instanceValue);
			case Xml3dPackage.FLOAT4X4_ARRAY:
				return convertFloat4x4ArrayToString(eDataType, instanceValue);
			case Xml3dPackage.FLOAT_ARRAY:
				return convertFloatArrayToString(eDataType, instanceValue);
			case Xml3dPackage.INT4_ARRAY:
				return convertInt4ArrayToString(eDataType, instanceValue);
			case Xml3dPackage.INT_ARRAY:
				return convertIntArrayToString(eDataType, instanceValue);
			case Xml3dPackage.MESH_TYPE_NAMES_OBJECT:
				return convertMeshTypeNamesObjectToString(eDataType, instanceValue);
			case Xml3dPackage.TEXTURE_TYPES_OBJECT:
				return convertTextureTypesObjectToString(eDataType, instanceValue);
			case Xml3dPackage.WRAP_TYPES_OBJECT:
				return convertWrapTypesObjectToString(eDataType, instanceValue);
			case Xml3dPackage.XML3D_ROTATION:
				return convertXML3DRotationToString(eDataType, instanceValue);
			case Xml3dPackage.XML3D_VEC3:
				return convertXML3DVec3ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolType createBoolType() {
		BoolTypeImpl boolType = new BoolTypeImpl();
		return boolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefsType createDefsType() {
		DefsTypeImpl defsType = new DefsTypeImpl();
		return defsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float2Type createFloat2Type() {
		Float2TypeImpl float2Type = new Float2TypeImpl();
		return float2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float3Type createFloat3Type() {
		Float3TypeImpl float3Type = new Float3TypeImpl();
		return float3Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float4Type createFloat4Type() {
		Float4TypeImpl float4Type = new Float4TypeImpl();
		return float4Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float4x4Type createFloat4x4Type() {
		Float4x4TypeImpl float4x4Type = new Float4x4TypeImpl();
		return float4x4Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatType createFloatType() {
		FloatTypeImpl floatType = new FloatTypeImpl();
		return floatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupType() {
		GroupTypeImpl groupType = new GroupTypeImpl();
		return groupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImgType createImgType() {
		ImgTypeImpl imgType = new ImgTypeImpl();
		return imgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int4Type createInt4Type() {
		Int4TypeImpl int4Type = new Int4TypeImpl();
		return int4Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntType createIntType() {
		IntTypeImpl intType = new IntTypeImpl();
		return intType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightShaderType createLightShaderType() {
		LightShaderTypeImpl lightShaderType = new LightShaderTypeImpl();
		return lightShaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightType createLightType() {
		LightTypeImpl lightType = new LightTypeImpl();
		return lightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshType createMeshType() {
		MeshTypeImpl meshType = new MeshTypeImpl();
		return meshType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType createScriptType() {
		ScriptTypeImpl scriptType = new ScriptTypeImpl();
		return scriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShaderType createShaderType() {
		ShaderTypeImpl shaderType = new ShaderTypeImpl();
		return shaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureType createTextureType() {
		TextureTypeImpl textureType = new TextureTypeImpl();
		return textureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformType createTransformType() {
		TransformTypeImpl transformType = new TransformTypeImpl();
		return transformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewType createViewType() {
		ViewTypeImpl viewType = new ViewTypeImpl();
		return viewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xml3dType createXml3dType() {
		Xml3dTypeImpl xml3dType = new Xml3dTypeImpl();
		return xml3dType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterTypes createFilterTypesFromString(EDataType eDataType, String initialValue) {
		FilterTypes result = FilterTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshTypeNames createMeshTypeNamesFromString(EDataType eDataType, String initialValue) {
		MeshTypeNames result = MeshTypeNames.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeshTypeNamesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureTypes createTextureTypesFromString(EDataType eDataType, String initialValue) {
		TextureTypes result = TextureTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapTypes createWrapTypesFromString(EDataType eDataType, String initialValue) {
		WrapTypes result = WrapTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Boolean> createBooleanArrayFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Boolean> result = new ArrayList<Boolean>();
		for (String item : split(initialValue)) {
			result.add((Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanArrayToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createContentTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterTypes createFilterTypesObjectFromString(EDataType eDataType, String initialValue) {
		return createFilterTypesFromString(Xml3dPackage.Literals.FILTER_TYPES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterTypesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFilterTypesToString(Xml3dPackage.Literals.FILTER_TYPES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public TFloatList createFloat2ArrayFromString(EDataType eDataType, String initialValue) {
		return createTFloatListFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String convertFloat2ArrayToString(EDataType eDataType, Object instanceValue) {
		return convertTFloatListToString((TFloatList) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public TFloatList createFloat3ArrayFromString(EDataType eDataType, String initialValue) {
		return createTFloatListFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String convertFloat3ArrayToString(EDataType eDataType, Object instanceValue) {
		return convertTFloatListToString((TFloatList) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public TFloatList createFloat4ArrayFromString(EDataType eDataType, String initialValue) {
		return createTFloatListFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String convertFloat4ArrayToString(EDataType eDataType, Object instanceValue) {
		return convertTFloatListToString((TFloatList) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public TFloatList createFloat4x4ArrayFromString(EDataType eDataType, String initialValue) {
		return createTFloatListFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String convertFloat4x4ArrayToString(EDataType eDataType, Object instanceValue) {
		return convertTFloatListToString((TFloatList) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public TFloatList createFloatArrayFromString(EDataType eDataType, String initialValue) {
		return createTFloatListFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String convertFloatArrayToString(EDataType eDataType, Object instanceValue) {
		return convertTFloatListToString((TFloatList)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	private TFloatList createTFloatListFromString(String initialValue) {
		if (initialValue == null) return null;
		String[] items = split(initialValue);
		TFloatList result = new TFloatArrayList(items.length);
		for(String item : items) {
			result.add(Float.parseFloat(item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	private String convertTFloatListToString(TFloatList list) {
		if (list == null) return null;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (float item : list.toArray()) {
			result.append(item);
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public TIntList createInt4ArrayFromString(EDataType eDataType, String initialValue) {
		return createTIntListFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String convertInt4ArrayToString(EDataType eDataType, Object instanceValue) {
		return convertTIntListToString((TIntList) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public TIntList createIntArrayFromString(EDataType eDataType, String initialValue) {
		return createTIntListFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	private TIntList createTIntListFromString(String initialValue) {
		if (initialValue == null) return null;
		String[] items = split(initialValue);
		TIntList result = new TIntArrayList(items.length);
		for(String item : items) {
			result.add(Integer.parseInt(item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String convertIntArrayToString(EDataType eDataType, Object instanceValue) {
		return convertTIntListToString((TIntList) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	private String convertTIntListToString(TIntList list) {
		if (list == null) return null;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (int item : list.toArray()) {
			result.append(item);
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshTypeNames createMeshTypeNamesObjectFromString(EDataType eDataType, String initialValue) {
		return createMeshTypeNamesFromString(Xml3dPackage.Literals.MESH_TYPE_NAMES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeshTypeNamesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeshTypeNamesToString(Xml3dPackage.Literals.MESH_TYPE_NAMES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureTypes createTextureTypesObjectFromString(EDataType eDataType, String initialValue) {
		return createTextureTypesFromString(Xml3dPackage.Literals.TEXTURE_TYPES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureTypesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextureTypesToString(Xml3dPackage.Literals.TEXTURE_TYPES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapTypes createWrapTypesObjectFromString(EDataType eDataType, String initialValue) {
		return createWrapTypesFromString(Xml3dPackage.Literals.WRAP_TYPES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapTypesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWrapTypesToString(Xml3dPackage.Literals.WRAP_TYPES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public TFloatList createXML3DRotationFromString(EDataType eDataType, String initialValue) {
		return createTFloatListFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String convertXML3DRotationToString(EDataType eDataType, Object instanceValue) {
		return convertTFloatListToString((TFloatList) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public TFloatList createXML3DVec3FromString(EDataType eDataType, String initialValue) {
		return createTFloatListFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String convertXML3DVec3ToString(EDataType eDataType, Object instanceValue) {
		return convertTFloatListToString((TFloatList) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xml3dPackage getXml3dPackage() {
		return (Xml3dPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Xml3dPackage getPackage() {
		return Xml3dPackage.eINSTANCE;
	}

} //Xml3dFactoryImpl
