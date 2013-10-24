/**
 */
package org.xml3d._2009.xml3d.util;

import gnu.trove.list.TFloatList;
import gnu.trove.list.TIntList;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.xml3d._2009.xml3d.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.xml3d._2009.xml3d.Xml3dPackage
 * @generated
 */
public class Xml3dValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Xml3dValidator INSTANCE = new Xml3dValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.xml3d._2009.xml3d";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xml3dValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Xml3dPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Xml3dPackage.BOOL_TYPE:
				return validateBoolType((BoolType)value, diagnostics, context);
			case Xml3dPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case Xml3dPackage.DEFS_TYPE:
				return validateDefsType((DefsType)value, diagnostics, context);
			case Xml3dPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Xml3dPackage.FLOAT2_TYPE:
				return validateFloat2Type((Float2Type)value, diagnostics, context);
			case Xml3dPackage.FLOAT3_TYPE:
				return validateFloat3Type((Float3Type)value, diagnostics, context);
			case Xml3dPackage.FLOAT4_TYPE:
				return validateFloat4Type((Float4Type)value, diagnostics, context);
			case Xml3dPackage.FLOAT4X4_TYPE:
				return validateFloat4x4Type((Float4x4Type)value, diagnostics, context);
			case Xml3dPackage.FLOAT_TYPE:
				return validateFloatType((FloatType)value, diagnostics, context);
			case Xml3dPackage.GROUP_TYPE:
				return validateGroupType((GroupType)value, diagnostics, context);
			case Xml3dPackage.HTML_ELEMENT:
				return validateHTMLElement((HTMLElement)value, diagnostics, context);
			case Xml3dPackage.IMG_TYPE:
				return validateImgType((ImgType)value, diagnostics, context);
			case Xml3dPackage.INT4_TYPE:
				return validateInt4Type((Int4Type)value, diagnostics, context);
			case Xml3dPackage.INT_TYPE:
				return validateIntType((IntType)value, diagnostics, context);
			case Xml3dPackage.LIGHT_SHADER_TYPE:
				return validateLightShaderType((LightShaderType)value, diagnostics, context);
			case Xml3dPackage.LIGHT_TYPE:
				return validateLightType((LightType)value, diagnostics, context);
			case Xml3dPackage.MESH_TYPE:
				return validateMeshType((MeshType)value, diagnostics, context);
			case Xml3dPackage.SCRIPT_TYPE:
				return validateScriptType((ScriptType)value, diagnostics, context);
			case Xml3dPackage.SHADER_TYPE:
				return validateShaderType((ShaderType)value, diagnostics, context);
			case Xml3dPackage.TEXTURE_TYPE:
				return validateTextureType((TextureType)value, diagnostics, context);
			case Xml3dPackage.TRANSFORM_TYPE:
				return validateTransformType((TransformType)value, diagnostics, context);
			case Xml3dPackage.VIEW_TYPE:
				return validateViewType((ViewType)value, diagnostics, context);
			case Xml3dPackage.XML3D_DATA_CONTAINER:
				return validateXML3DDataContainer((XML3DDataContainer)value, diagnostics, context);
			case Xml3dPackage.XML3D_ELEMENT:
				return validateXML3DElement((XML3DElement)value, diagnostics, context);
			case Xml3dPackage.XML3D_TYPE:
				return validateXml3dType((Xml3dType)value, diagnostics, context);
			case Xml3dPackage.FILTER_TYPES:
				return validateFilterTypes((FilterTypes)value, diagnostics, context);
			case Xml3dPackage.MESH_TYPE_NAMES:
				return validateMeshTypeNames((MeshTypeNames)value, diagnostics, context);
			case Xml3dPackage.TEXTURE_TYPES:
				return validateTextureTypes((TextureTypes)value, diagnostics, context);
			case Xml3dPackage.WRAP_TYPES:
				return validateWrapTypes((WrapTypes)value, diagnostics, context);
			case Xml3dPackage.BOOLEAN_ARRAY:
				return validateBooleanArray((List<?>)value, diagnostics, context);
			case Xml3dPackage.CONTENT_TYPE:
				return validateContentType((String)value, diagnostics, context);
			case Xml3dPackage.FILTER_TYPES_OBJECT:
				return validateFilterTypesObject((FilterTypes)value, diagnostics, context);
			case Xml3dPackage.FLOAT2_ARRAY:
				return validateFloat2Array((TFloatList)value, diagnostics, context);
			case Xml3dPackage.FLOAT3_ARRAY:
				return validateFloat3Array((TFloatList)value, diagnostics, context);
			case Xml3dPackage.FLOAT4_ARRAY:
				return validateFloat4Array((TFloatList)value, diagnostics, context);
			case Xml3dPackage.FLOAT4X4_ARRAY:
				return validateFloat4x4Array((TFloatList)value, diagnostics, context);
			case Xml3dPackage.FLOAT_ARRAY:
				return validateFloatArray((TFloatList)value, diagnostics, context);
			case Xml3dPackage.INT4_ARRAY:
				return validateInt4Array((TIntList)value, diagnostics, context);
			case Xml3dPackage.INT_ARRAY:
				return validateIntArray((TIntList)value, diagnostics, context);
			case Xml3dPackage.MESH_TYPE_NAMES_OBJECT:
				return validateMeshTypeNamesObject((MeshTypeNames)value, diagnostics, context);
			case Xml3dPackage.TEXTURE_TYPES_OBJECT:
				return validateTextureTypesObject((TextureTypes)value, diagnostics, context);
			case Xml3dPackage.WRAP_TYPES_OBJECT:
				return validateWrapTypesObject((WrapTypes)value, diagnostics, context);
			case Xml3dPackage.XML3D_ROTATION:
				return validateXML3DRotation((TFloatList)value, diagnostics, context);
			case Xml3dPackage.XML3D_VEC3:
				return validateXML3DVec3((TFloatList)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolType(BoolType boolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefsType(DefsType defsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat2Type(Float2Type float2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float2Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat3Type(Float3Type float3Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float3Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat4Type(Float4Type float4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float4Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat4x4Type(Float4x4Type float4x4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float4x4Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatType(FloatType floatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupType(GroupType groupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTMLElement(HTMLElement htmlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(htmlElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImgType(ImgType imgType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imgType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInt4Type(Int4Type int4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(int4Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntType(IntType intType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightShaderType(LightShaderType lightShaderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lightShaderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightType(LightType lightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lightType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeshType(MeshType meshType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meshType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptType(ScriptType scriptType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scriptType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShaderType(ShaderType shaderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shaderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextureType(TextureType textureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformType(TransformType transformType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewType(ViewType viewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXML3DDataContainer(XML3DDataContainer xml3DDataContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xml3DDataContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXML3DElement(XML3DElement xml3DElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xml3DElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXml3dType(Xml3dType xml3dType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xml3dType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterTypes(FilterTypes filterTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeshTypeNames(MeshTypeNames meshTypeNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextureTypes(TextureTypes textureTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapTypes(WrapTypes wrapTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanArray(List<?> booleanArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanArray_ItemType(booleanArray, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Boolean Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanArray_ItemType(List<?> booleanArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = booleanArray.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.BOOLEAN.isInstance(item)) {
				result &= xmlTypeValidator.validateBoolean((Boolean)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.BOOLEAN, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentType(String contentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterTypesObject(FilterTypes filterTypesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat2Array(TFloatList float2Array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat3Array(TFloatList float3Array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat4Array(TFloatList float4Array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat4x4Array(TFloatList float4x4Array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatArray(TFloatList floatArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInt4Array(TIntList int4Array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntArray(TIntList intArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeshTypeNamesObject(MeshTypeNames meshTypeNamesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextureTypesObject(TextureTypes textureTypesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapTypesObject(WrapTypes wrapTypesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXML3DRotation(TFloatList xml3DRotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXML3DVec3(TFloatList xml3DVec3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Xml3dValidator
