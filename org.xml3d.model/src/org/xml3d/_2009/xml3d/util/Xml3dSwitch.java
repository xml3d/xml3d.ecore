/**
 */
package org.xml3d._2009.xml3d.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xml3d._2009.xml3d.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xml3d._2009.xml3d.Xml3dPackage
 * @generated
 */
public class Xml3dSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Xml3dPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xml3dSwitch() {
		if (modelPackage == null) {
			modelPackage = Xml3dPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Xml3dPackage.BOOL_TYPE: {
				BoolType boolType = (BoolType)theEObject;
				T result = caseBoolType(boolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseXML3DDataContainer(dataType);
				if (result == null) result = caseXML3DElement(dataType);
				if (result == null) result = caseHTMLElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.DEFS_TYPE: {
				DefsType defsType = (DefsType)theEObject;
				T result = caseDefsType(defsType);
				if (result == null) result = caseXML3DElement(defsType);
				if (result == null) result = caseHTMLElement(defsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.FLOAT2_TYPE: {
				Float2Type float2Type = (Float2Type)theEObject;
				T result = caseFloat2Type(float2Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.FLOAT3_TYPE: {
				Float3Type float3Type = (Float3Type)theEObject;
				T result = caseFloat3Type(float3Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.FLOAT4_TYPE: {
				Float4Type float4Type = (Float4Type)theEObject;
				T result = caseFloat4Type(float4Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.FLOAT4X4_TYPE: {
				Float4x4Type float4x4Type = (Float4x4Type)theEObject;
				T result = caseFloat4x4Type(float4x4Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.FLOAT_TYPE: {
				FloatType floatType = (FloatType)theEObject;
				T result = caseFloatType(floatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.GROUP_TYPE: {
				GroupType groupType = (GroupType)theEObject;
				T result = caseGroupType(groupType);
				if (result == null) result = caseXML3DElement(groupType);
				if (result == null) result = caseHTMLElement(groupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.HTML_ELEMENT: {
				HTMLElement htmlElement = (HTMLElement)theEObject;
				T result = caseHTMLElement(htmlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.IMG_TYPE: {
				ImgType imgType = (ImgType)theEObject;
				T result = caseImgType(imgType);
				if (result == null) result = caseHTMLElement(imgType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.INT4_TYPE: {
				Int4Type int4Type = (Int4Type)theEObject;
				T result = caseInt4Type(int4Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.INT_TYPE: {
				IntType intType = (IntType)theEObject;
				T result = caseIntType(intType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.LIGHT_SHADER_TYPE: {
				LightShaderType lightShaderType = (LightShaderType)theEObject;
				T result = caseLightShaderType(lightShaderType);
				if (result == null) result = caseXML3DDataContainer(lightShaderType);
				if (result == null) result = caseXML3DElement(lightShaderType);
				if (result == null) result = caseHTMLElement(lightShaderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.LIGHT_TYPE: {
				LightType lightType = (LightType)theEObject;
				T result = caseLightType(lightType);
				if (result == null) result = caseXML3DElement(lightType);
				if (result == null) result = caseHTMLElement(lightType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.MESH_TYPE: {
				MeshType meshType = (MeshType)theEObject;
				T result = caseMeshType(meshType);
				if (result == null) result = caseXML3DDataContainer(meshType);
				if (result == null) result = caseXML3DElement(meshType);
				if (result == null) result = caseHTMLElement(meshType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.SCRIPT_TYPE: {
				ScriptType scriptType = (ScriptType)theEObject;
				T result = caseScriptType(scriptType);
				if (result == null) result = caseHTMLElement(scriptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.SHADER_TYPE: {
				ShaderType shaderType = (ShaderType)theEObject;
				T result = caseShaderType(shaderType);
				if (result == null) result = caseXML3DDataContainer(shaderType);
				if (result == null) result = caseXML3DElement(shaderType);
				if (result == null) result = caseHTMLElement(shaderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.TEXTURE_TYPE: {
				TextureType textureType = (TextureType)theEObject;
				T result = caseTextureType(textureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.TRANSFORM_TYPE: {
				TransformType transformType = (TransformType)theEObject;
				T result = caseTransformType(transformType);
				if (result == null) result = caseXML3DElement(transformType);
				if (result == null) result = caseHTMLElement(transformType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.VIEW_TYPE: {
				ViewType viewType = (ViewType)theEObject;
				T result = caseViewType(viewType);
				if (result == null) result = caseXML3DElement(viewType);
				if (result == null) result = caseHTMLElement(viewType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.XML3D_DATA_CONTAINER: {
				XML3DDataContainer xml3DDataContainer = (XML3DDataContainer)theEObject;
				T result = caseXML3DDataContainer(xml3DDataContainer);
				if (result == null) result = caseXML3DElement(xml3DDataContainer);
				if (result == null) result = caseHTMLElement(xml3DDataContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.XML3D_ELEMENT: {
				XML3DElement xml3DElement = (XML3DElement)theEObject;
				T result = caseXML3DElement(xml3DElement);
				if (result == null) result = caseHTMLElement(xml3DElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xml3dPackage.XML3D_TYPE: {
				Xml3dType xml3dType = (Xml3dType)theEObject;
				T result = caseXml3dType(xml3dType);
				if (result == null) result = caseXML3DElement(xml3dType);
				if (result == null) result = caseHTMLElement(xml3dType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolType(BoolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefsType(DefsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat2Type(Float2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float3 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat3Type(Float3Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float4 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat4Type(Float4Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float4x4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float4x4 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat4x4Type(Float4x4Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatType(FloatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupType(GroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLElement(HTMLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Img Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Img Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImgType(ImgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int4 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInt4Type(Int4Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntType(IntType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Shader Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Shader Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightShaderType(LightShaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightType(LightType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeshType(MeshType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptType(ScriptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shader Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shader Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShaderType(ShaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Texture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Texture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextureType(TextureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformType(TransformType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewType(ViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML3D Data Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML3D Data Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXML3DDataContainer(XML3DDataContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML3D Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML3D Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXML3DElement(XML3DElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXml3dType(Xml3dType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Xml3dSwitch
