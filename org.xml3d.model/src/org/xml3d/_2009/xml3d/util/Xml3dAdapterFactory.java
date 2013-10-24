/**
 */
package org.xml3d._2009.xml3d.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xml3d._2009.xml3d.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xml3d._2009.xml3d.Xml3dPackage
 * @generated
 */
public class Xml3dAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Xml3dPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xml3dAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Xml3dPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Xml3dSwitch<Adapter> modelSwitch =
		new Xml3dSwitch<Adapter>() {
			@Override
			public Adapter caseBoolType(BoolType object) {
				return createBoolTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseDefsType(DefsType object) {
				return createDefsTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFloat2Type(Float2Type object) {
				return createFloat2TypeAdapter();
			}
			@Override
			public Adapter caseFloat3Type(Float3Type object) {
				return createFloat3TypeAdapter();
			}
			@Override
			public Adapter caseFloat4Type(Float4Type object) {
				return createFloat4TypeAdapter();
			}
			@Override
			public Adapter caseFloat4x4Type(Float4x4Type object) {
				return createFloat4x4TypeAdapter();
			}
			@Override
			public Adapter caseFloatType(FloatType object) {
				return createFloatTypeAdapter();
			}
			@Override
			public Adapter caseGroupType(GroupType object) {
				return createGroupTypeAdapter();
			}
			@Override
			public Adapter caseHTMLElement(HTMLElement object) {
				return createHTMLElementAdapter();
			}
			@Override
			public Adapter caseImgType(ImgType object) {
				return createImgTypeAdapter();
			}
			@Override
			public Adapter caseInt4Type(Int4Type object) {
				return createInt4TypeAdapter();
			}
			@Override
			public Adapter caseIntType(IntType object) {
				return createIntTypeAdapter();
			}
			@Override
			public Adapter caseLightShaderType(LightShaderType object) {
				return createLightShaderTypeAdapter();
			}
			@Override
			public Adapter caseLightType(LightType object) {
				return createLightTypeAdapter();
			}
			@Override
			public Adapter caseMeshType(MeshType object) {
				return createMeshTypeAdapter();
			}
			@Override
			public Adapter caseScriptType(ScriptType object) {
				return createScriptTypeAdapter();
			}
			@Override
			public Adapter caseShaderType(ShaderType object) {
				return createShaderTypeAdapter();
			}
			@Override
			public Adapter caseTextureType(TextureType object) {
				return createTextureTypeAdapter();
			}
			@Override
			public Adapter caseTransformType(TransformType object) {
				return createTransformTypeAdapter();
			}
			@Override
			public Adapter caseViewType(ViewType object) {
				return createViewTypeAdapter();
			}
			@Override
			public Adapter caseXML3DDataContainer(XML3DDataContainer object) {
				return createXML3DDataContainerAdapter();
			}
			@Override
			public Adapter caseXML3DElement(XML3DElement object) {
				return createXML3DElementAdapter();
			}
			@Override
			public Adapter caseXml3dType(Xml3dType object) {
				return createXml3dTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.BoolType <em>Bool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.BoolType
	 * @generated
	 */
	public Adapter createBoolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.DefsType <em>Defs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.DefsType
	 * @generated
	 */
	public Adapter createDefsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.Float2Type <em>Float2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.Float2Type
	 * @generated
	 */
	public Adapter createFloat2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.Float3Type <em>Float3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.Float3Type
	 * @generated
	 */
	public Adapter createFloat3TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.Float4Type <em>Float4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.Float4Type
	 * @generated
	 */
	public Adapter createFloat4TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.Float4x4Type <em>Float4x4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.Float4x4Type
	 * @generated
	 */
	public Adapter createFloat4x4TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.FloatType
	 * @generated
	 */
	public Adapter createFloatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.GroupType
	 * @generated
	 */
	public Adapter createGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.HTMLElement <em>HTML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.HTMLElement
	 * @generated
	 */
	public Adapter createHTMLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.ImgType <em>Img Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.ImgType
	 * @generated
	 */
	public Adapter createImgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.Int4Type <em>Int4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.Int4Type
	 * @generated
	 */
	public Adapter createInt4TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.IntType <em>Int Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.IntType
	 * @generated
	 */
	public Adapter createIntTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.LightShaderType <em>Light Shader Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.LightShaderType
	 * @generated
	 */
	public Adapter createLightShaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.LightType <em>Light Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.LightType
	 * @generated
	 */
	public Adapter createLightTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.MeshType <em>Mesh Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.MeshType
	 * @generated
	 */
	public Adapter createMeshTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.ScriptType
	 * @generated
	 */
	public Adapter createScriptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.ShaderType <em>Shader Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.ShaderType
	 * @generated
	 */
	public Adapter createShaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.TextureType <em>Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.TextureType
	 * @generated
	 */
	public Adapter createTextureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.TransformType <em>Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.TransformType
	 * @generated
	 */
	public Adapter createTransformTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.ViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.ViewType
	 * @generated
	 */
	public Adapter createViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.XML3DDataContainer <em>XML3D Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer
	 * @generated
	 */
	public Adapter createXML3DDataContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.XML3DElement <em>XML3D Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.XML3DElement
	 * @generated
	 */
	public Adapter createXML3DElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xml3d._2009.xml3d.Xml3dType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xml3d._2009.xml3d.Xml3dType
	 * @generated
	 */
	public Adapter createXml3dTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Xml3dAdapterFactory
