/**
 */
package org.xml3d._2009.xml3d.impl;

import gnu.trove.list.TFloatList;
import gnu.trove.list.TIntList;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.xml3d._2009.xml3d.BoolType;
import org.xml3d._2009.xml3d.DataType;
import org.xml3d._2009.xml3d.DefsType;
import org.xml3d._2009.xml3d.DocumentRoot;
import org.xml3d._2009.xml3d.FilterTypes;
import org.xml3d._2009.xml3d.Float2Type;
import org.xml3d._2009.xml3d.Float3Type;
import org.xml3d._2009.xml3d.Float4Type;
import org.xml3d._2009.xml3d.Float4x4Type;
import org.xml3d._2009.xml3d.FloatType;
import org.xml3d._2009.xml3d.GroupType;
import org.xml3d._2009.xml3d.HTMLElement;
import org.xml3d._2009.xml3d.ImgType;
import org.xml3d._2009.xml3d.Int4Type;
import org.xml3d._2009.xml3d.IntType;
import org.xml3d._2009.xml3d.LightShaderType;
import org.xml3d._2009.xml3d.LightType;
import org.xml3d._2009.xml3d.MeshType;
import org.xml3d._2009.xml3d.MeshTypeNames;
import org.xml3d._2009.xml3d.ScriptType;
import org.xml3d._2009.xml3d.ShaderType;
import org.xml3d._2009.xml3d.TextureType;
import org.xml3d._2009.xml3d.TextureTypes;
import org.xml3d._2009.xml3d.TransformType;
import org.xml3d._2009.xml3d.ViewType;
import org.xml3d._2009.xml3d.WrapTypes;
import org.xml3d._2009.xml3d.XML3DDataContainer;
import org.xml3d._2009.xml3d.XML3DElement;
import org.xml3d._2009.xml3d.Xml3dFactory;
import org.xml3d._2009.xml3d.Xml3dPackage;
import org.xml3d._2009.xml3d.Xml3dType;

import org.xml3d._2009.xml3d.util.Xml3dValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Xml3dPackageImpl extends EPackageImpl implements Xml3dPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float2TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float3TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float4TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float4x4TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imgTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass int4TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightShaderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shaderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xml3DDataContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xml3DElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xml3dTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum meshTypeNamesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wrapTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType filterTypesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float2ArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float3ArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float4ArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType float4x4ArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType int4ArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meshTypeNamesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textureTypesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wrapTypesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xml3DRotationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xml3DVec3EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.xml3d._2009.xml3d.Xml3dPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Xml3dPackageImpl() {
		super(eNS_URI, Xml3dFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Xml3dPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Xml3dPackage init() {
		if (isInited) return (Xml3dPackage)EPackage.Registry.INSTANCE.getEPackage(Xml3dPackage.eNS_URI);

		// Obtain or create and register package
		Xml3dPackageImpl theXml3dPackage = (Xml3dPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Xml3dPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Xml3dPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXml3dPackage.createPackageContents();

		// Initialize created meta-data
		theXml3dPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theXml3dPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Xml3dValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theXml3dPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Xml3dPackage.eNS_URI, theXml3dPackage);
		return theXml3dPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolType() {
		return boolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolType_Value() {
		return (EAttribute)boolTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolType_Id() {
		return (EAttribute)boolTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolType_Name() {
		return (EAttribute)boolTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Map() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Script() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefsType() {
		return defsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefsType_Children() {
		return (EAttribute)defsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefsType_Shader() {
		return (EReference)defsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefsType_Lightshader() {
		return (EReference)defsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefsType_Data() {
		return (EReference)defsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefsType_Transform() {
		return (EReference)defsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefsType_Mesh() {
		return (EReference)defsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefsType_Script() {
		return (EReference)defsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bool() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Data() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Defs() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Float() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Float2() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Float3() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Float4() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Float4x4() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Group() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Img() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Int() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Int4() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Light() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Lightshader() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mesh() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Script() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Shader() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Texture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transform() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_View() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Xml3d() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat2Type() {
		return float2TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat2Type_Value() {
		return (EAttribute)float2TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat2Type_Id() {
		return (EAttribute)float2TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat2Type_Key() {
		return (EAttribute)float2TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat2Type_Name() {
		return (EAttribute)float2TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat3Type() {
		return float3TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat3Type_Value() {
		return (EAttribute)float3TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat3Type_Id() {
		return (EAttribute)float3TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat3Type_Key() {
		return (EAttribute)float3TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat3Type_Name() {
		return (EAttribute)float3TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat4Type() {
		return float4TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat4Type_Value() {
		return (EAttribute)float4TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat4Type_Id() {
		return (EAttribute)float4TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat4Type_Key() {
		return (EAttribute)float4TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat4Type_Name() {
		return (EAttribute)float4TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat4x4Type() {
		return float4x4TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat4x4Type_Value() {
		return (EAttribute)float4x4TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat4x4Type_Id() {
		return (EAttribute)float4x4TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat4x4Type_Key() {
		return (EAttribute)float4x4TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat4x4Type_Name() {
		return (EAttribute)float4x4TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatType() {
		return floatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatType_Value() {
		return (EAttribute)floatTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatType_Id() {
		return (EAttribute)floatTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatType_Key() {
		return (EAttribute)floatTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatType_Name() {
		return (EAttribute)floatTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupType() {
		return groupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Children() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType_Defs() {
		return (EReference)groupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType_Mesh() {
		return (EReference)groupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType_Group() {
		return (EReference)groupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType_View() {
		return (EReference)groupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType_Light() {
		return (EReference)groupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType_Script() {
		return (EReference)groupTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Onclick() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Ondblclick() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Ondrop() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Onkeydown() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Onkeypress() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Onkeyup() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Onmousedown() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Onmousemove() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Onmouseout() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Onmouseover() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Onmouseup() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType_Shader() {
		return (EReference)groupTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType_Transform() {
		return (EReference)groupTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Visible() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTMLElement() {
		return htmlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTMLElement_Class() {
		return (EAttribute)htmlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTMLElement_Id() {
		return (EAttribute)htmlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTMLElement_Style() {
		return (EAttribute)htmlElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTMLElement_AnyAttribute() {
		return (EAttribute)htmlElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImgType() {
		return imgTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Src() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt4Type() {
		return int4TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt4Type_Value() {
		return (EAttribute)int4TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt4Type_Id() {
		return (EAttribute)int4TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt4Type_Key() {
		return (EAttribute)int4TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt4Type_Name() {
		return (EAttribute)int4TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntType() {
		return intTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntType_Value() {
		return (EAttribute)intTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntType_Id() {
		return (EAttribute)intTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntType_Key() {
		return (EAttribute)intTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntType_Name() {
		return (EAttribute)intTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightShaderType() {
		return lightShaderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLightShaderType_Script() {
		return (EReference)lightShaderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightType() {
		return lightTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightType_Global() {
		return (EAttribute)lightTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightType_Intensity() {
		return (EAttribute)lightTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLightType_Shader() {
		return (EReference)lightTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightType_Visible() {
		return (EAttribute)lightTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeshType() {
		return meshTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Onclick() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Ondblclick() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Ondrop() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Onkeydown() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Onkeypress() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Onkeyup() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Onmousedown() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Onmousemove() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Onmouseout() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Onmouseover() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Onmouseup() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Type() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshType_Visible() {
		return (EAttribute)meshTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptType() {
		return scriptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptType_Mixed() {
		return (EAttribute)scriptTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptType_Src() {
		return (EAttribute)scriptTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptType_Type() {
		return (EAttribute)scriptTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShaderType() {
		return shaderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShaderType_Script() {
		return (EReference)shaderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureType() {
		return textureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextureType_Img() {
		return (EReference)textureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_BorderColor() {
		return (EAttribute)textureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_FilterMag() {
		return (EAttribute)textureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_FilterMin() {
		return (EAttribute)textureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_FilterMip() {
		return (EAttribute)textureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_Id() {
		return (EAttribute)textureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_Key() {
		return (EAttribute)textureTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_Name() {
		return (EAttribute)textureTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_Type() {
		return (EAttribute)textureTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_WrapS() {
		return (EAttribute)textureTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_WrapT() {
		return (EAttribute)textureTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureType_WrapU() {
		return (EAttribute)textureTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformType() {
		return transformTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Center() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Rotation() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Scale() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_ScaleOrientation() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Translation() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewType() {
		return viewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewType_FieldOfView() {
		return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewType_Orientation() {
		return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewType_Position() {
		return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXML3DDataContainer() {
		return xml3DDataContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXML3DDataContainer_Children() {
		return (EAttribute)xml3DDataContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Data() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Bool() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Float() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Float2() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Float3() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Float4() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Float4x4() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Int() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Int4() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Texture() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXML3DDataContainer_Compute() {
		return (EAttribute)xml3DDataContainerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Proto() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXML3DDataContainer_Src() {
		return (EReference)xml3DDataContainerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXML3DElement() {
		return xml3DElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXML3DElement_Any() {
		return (EAttribute)xml3DElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXml3dType() {
		return xml3dTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Children() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXml3dType_Defs() {
		return (EReference)xml3dTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXml3dType_Mesh() {
		return (EReference)xml3dTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXml3dType_Group() {
		return (EReference)xml3dTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXml3dType_View() {
		return (EReference)xml3dTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXml3dType_Light() {
		return (EReference)xml3dTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXml3dType_Script() {
		return (EReference)xml3dTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXml3dType_ActiveView() {
		return (EReference)xml3dTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Height() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Onclick() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Ondblclick() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Ondrop() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Onkeydown() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Onkeypress() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Onkeyup() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Onmousedown() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Onmousemove() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Onmouseout() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Onmouseover() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Onmouseup() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXml3dType_Width() {
		return (EAttribute)xml3dTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterTypes() {
		return filterTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeshTypeNames() {
		return meshTypeNamesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextureTypes() {
		return textureTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWrapTypes() {
		return wrapTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanArray() {
		return booleanArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContentType() {
		return contentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFilterTypesObject() {
		return filterTypesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat2Array() {
		return float2ArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat3Array() {
		return float3ArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat4Array() {
		return float4ArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat4x4Array() {
		return float4x4ArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloatArray() {
		return floatArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInt4Array() {
		return int4ArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntArray() {
		return intArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMeshTypeNamesObject() {
		return meshTypeNamesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextureTypesObject() {
		return textureTypesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWrapTypesObject() {
		return wrapTypesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getXML3DRotation() {
		return xml3DRotationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getXML3DVec3() {
		return xml3DVec3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xml3dFactory getXml3dFactory() {
		return (Xml3dFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		boolTypeEClass = createEClass(BOOL_TYPE);
		createEAttribute(boolTypeEClass, BOOL_TYPE__VALUE);
		createEAttribute(boolTypeEClass, BOOL_TYPE__ID);
		createEAttribute(boolTypeEClass, BOOL_TYPE__NAME);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__MAP);
		createEReference(dataTypeEClass, DATA_TYPE__SCRIPT);

		defsTypeEClass = createEClass(DEFS_TYPE);
		createEAttribute(defsTypeEClass, DEFS_TYPE__CHILDREN);
		createEReference(defsTypeEClass, DEFS_TYPE__SHADER);
		createEReference(defsTypeEClass, DEFS_TYPE__LIGHTSHADER);
		createEReference(defsTypeEClass, DEFS_TYPE__DATA);
		createEReference(defsTypeEClass, DEFS_TYPE__TRANSFORM);
		createEReference(defsTypeEClass, DEFS_TYPE__MESH);
		createEReference(defsTypeEClass, DEFS_TYPE__SCRIPT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEFS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FLOAT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FLOAT2);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FLOAT3);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FLOAT4);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FLOAT4X4);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GROUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INT4);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIGHT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIGHTSHADER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MESH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCRIPT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHADER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEXTURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VIEW);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XML3D);

		float2TypeEClass = createEClass(FLOAT2_TYPE);
		createEAttribute(float2TypeEClass, FLOAT2_TYPE__VALUE);
		createEAttribute(float2TypeEClass, FLOAT2_TYPE__ID);
		createEAttribute(float2TypeEClass, FLOAT2_TYPE__KEY);
		createEAttribute(float2TypeEClass, FLOAT2_TYPE__NAME);

		float3TypeEClass = createEClass(FLOAT3_TYPE);
		createEAttribute(float3TypeEClass, FLOAT3_TYPE__VALUE);
		createEAttribute(float3TypeEClass, FLOAT3_TYPE__ID);
		createEAttribute(float3TypeEClass, FLOAT3_TYPE__KEY);
		createEAttribute(float3TypeEClass, FLOAT3_TYPE__NAME);

		float4TypeEClass = createEClass(FLOAT4_TYPE);
		createEAttribute(float4TypeEClass, FLOAT4_TYPE__VALUE);
		createEAttribute(float4TypeEClass, FLOAT4_TYPE__ID);
		createEAttribute(float4TypeEClass, FLOAT4_TYPE__KEY);
		createEAttribute(float4TypeEClass, FLOAT4_TYPE__NAME);

		float4x4TypeEClass = createEClass(FLOAT4X4_TYPE);
		createEAttribute(float4x4TypeEClass, FLOAT4X4_TYPE__VALUE);
		createEAttribute(float4x4TypeEClass, FLOAT4X4_TYPE__ID);
		createEAttribute(float4x4TypeEClass, FLOAT4X4_TYPE__KEY);
		createEAttribute(float4x4TypeEClass, FLOAT4X4_TYPE__NAME);

		floatTypeEClass = createEClass(FLOAT_TYPE);
		createEAttribute(floatTypeEClass, FLOAT_TYPE__VALUE);
		createEAttribute(floatTypeEClass, FLOAT_TYPE__ID);
		createEAttribute(floatTypeEClass, FLOAT_TYPE__KEY);
		createEAttribute(floatTypeEClass, FLOAT_TYPE__NAME);

		groupTypeEClass = createEClass(GROUP_TYPE);
		createEAttribute(groupTypeEClass, GROUP_TYPE__CHILDREN);
		createEReference(groupTypeEClass, GROUP_TYPE__DEFS);
		createEReference(groupTypeEClass, GROUP_TYPE__MESH);
		createEReference(groupTypeEClass, GROUP_TYPE__GROUP);
		createEReference(groupTypeEClass, GROUP_TYPE__VIEW);
		createEReference(groupTypeEClass, GROUP_TYPE__LIGHT);
		createEReference(groupTypeEClass, GROUP_TYPE__SCRIPT);
		createEAttribute(groupTypeEClass, GROUP_TYPE__ONCLICK);
		createEAttribute(groupTypeEClass, GROUP_TYPE__ONDBLCLICK);
		createEAttribute(groupTypeEClass, GROUP_TYPE__ONDROP);
		createEAttribute(groupTypeEClass, GROUP_TYPE__ONKEYDOWN);
		createEAttribute(groupTypeEClass, GROUP_TYPE__ONKEYPRESS);
		createEAttribute(groupTypeEClass, GROUP_TYPE__ONKEYUP);
		createEAttribute(groupTypeEClass, GROUP_TYPE__ONMOUSEDOWN);
		createEAttribute(groupTypeEClass, GROUP_TYPE__ONMOUSEMOVE);
		createEAttribute(groupTypeEClass, GROUP_TYPE__ONMOUSEOUT);
		createEAttribute(groupTypeEClass, GROUP_TYPE__ONMOUSEOVER);
		createEAttribute(groupTypeEClass, GROUP_TYPE__ONMOUSEUP);
		createEReference(groupTypeEClass, GROUP_TYPE__SHADER);
		createEReference(groupTypeEClass, GROUP_TYPE__TRANSFORM);
		createEAttribute(groupTypeEClass, GROUP_TYPE__VISIBLE);

		htmlElementEClass = createEClass(HTML_ELEMENT);
		createEAttribute(htmlElementEClass, HTML_ELEMENT__CLASS);
		createEAttribute(htmlElementEClass, HTML_ELEMENT__ID);
		createEAttribute(htmlElementEClass, HTML_ELEMENT__STYLE);
		createEAttribute(htmlElementEClass, HTML_ELEMENT__ANY_ATTRIBUTE);

		imgTypeEClass = createEClass(IMG_TYPE);
		createEAttribute(imgTypeEClass, IMG_TYPE__SRC);

		int4TypeEClass = createEClass(INT4_TYPE);
		createEAttribute(int4TypeEClass, INT4_TYPE__VALUE);
		createEAttribute(int4TypeEClass, INT4_TYPE__ID);
		createEAttribute(int4TypeEClass, INT4_TYPE__KEY);
		createEAttribute(int4TypeEClass, INT4_TYPE__NAME);

		intTypeEClass = createEClass(INT_TYPE);
		createEAttribute(intTypeEClass, INT_TYPE__VALUE);
		createEAttribute(intTypeEClass, INT_TYPE__ID);
		createEAttribute(intTypeEClass, INT_TYPE__KEY);
		createEAttribute(intTypeEClass, INT_TYPE__NAME);

		lightShaderTypeEClass = createEClass(LIGHT_SHADER_TYPE);
		createEReference(lightShaderTypeEClass, LIGHT_SHADER_TYPE__SCRIPT);

		lightTypeEClass = createEClass(LIGHT_TYPE);
		createEAttribute(lightTypeEClass, LIGHT_TYPE__GLOBAL);
		createEAttribute(lightTypeEClass, LIGHT_TYPE__INTENSITY);
		createEReference(lightTypeEClass, LIGHT_TYPE__SHADER);
		createEAttribute(lightTypeEClass, LIGHT_TYPE__VISIBLE);

		meshTypeEClass = createEClass(MESH_TYPE);
		createEAttribute(meshTypeEClass, MESH_TYPE__ONCLICK);
		createEAttribute(meshTypeEClass, MESH_TYPE__ONDBLCLICK);
		createEAttribute(meshTypeEClass, MESH_TYPE__ONDROP);
		createEAttribute(meshTypeEClass, MESH_TYPE__ONKEYDOWN);
		createEAttribute(meshTypeEClass, MESH_TYPE__ONKEYPRESS);
		createEAttribute(meshTypeEClass, MESH_TYPE__ONKEYUP);
		createEAttribute(meshTypeEClass, MESH_TYPE__ONMOUSEDOWN);
		createEAttribute(meshTypeEClass, MESH_TYPE__ONMOUSEMOVE);
		createEAttribute(meshTypeEClass, MESH_TYPE__ONMOUSEOUT);
		createEAttribute(meshTypeEClass, MESH_TYPE__ONMOUSEOVER);
		createEAttribute(meshTypeEClass, MESH_TYPE__ONMOUSEUP);
		createEAttribute(meshTypeEClass, MESH_TYPE__TYPE);
		createEAttribute(meshTypeEClass, MESH_TYPE__VISIBLE);

		scriptTypeEClass = createEClass(SCRIPT_TYPE);
		createEAttribute(scriptTypeEClass, SCRIPT_TYPE__MIXED);
		createEAttribute(scriptTypeEClass, SCRIPT_TYPE__SRC);
		createEAttribute(scriptTypeEClass, SCRIPT_TYPE__TYPE);

		shaderTypeEClass = createEClass(SHADER_TYPE);
		createEReference(shaderTypeEClass, SHADER_TYPE__SCRIPT);

		textureTypeEClass = createEClass(TEXTURE_TYPE);
		createEReference(textureTypeEClass, TEXTURE_TYPE__IMG);
		createEAttribute(textureTypeEClass, TEXTURE_TYPE__BORDER_COLOR);
		createEAttribute(textureTypeEClass, TEXTURE_TYPE__FILTER_MAG);
		createEAttribute(textureTypeEClass, TEXTURE_TYPE__FILTER_MIN);
		createEAttribute(textureTypeEClass, TEXTURE_TYPE__FILTER_MIP);
		createEAttribute(textureTypeEClass, TEXTURE_TYPE__ID);
		createEAttribute(textureTypeEClass, TEXTURE_TYPE__KEY);
		createEAttribute(textureTypeEClass, TEXTURE_TYPE__NAME);
		createEAttribute(textureTypeEClass, TEXTURE_TYPE__TYPE);
		createEAttribute(textureTypeEClass, TEXTURE_TYPE__WRAP_S);
		createEAttribute(textureTypeEClass, TEXTURE_TYPE__WRAP_T);
		createEAttribute(textureTypeEClass, TEXTURE_TYPE__WRAP_U);

		transformTypeEClass = createEClass(TRANSFORM_TYPE);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__CENTER);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__ROTATION);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__SCALE);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__SCALE_ORIENTATION);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__TRANSLATION);

		viewTypeEClass = createEClass(VIEW_TYPE);
		createEAttribute(viewTypeEClass, VIEW_TYPE__FIELD_OF_VIEW);
		createEAttribute(viewTypeEClass, VIEW_TYPE__ORIENTATION);
		createEAttribute(viewTypeEClass, VIEW_TYPE__POSITION);

		xml3DDataContainerEClass = createEClass(XML3D_DATA_CONTAINER);
		createEAttribute(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__CHILDREN);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__DATA);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__BOOL);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__FLOAT);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__FLOAT2);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__FLOAT3);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__FLOAT4);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__FLOAT4X4);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__INT);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__INT4);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__TEXTURE);
		createEAttribute(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__COMPUTE);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__PROTO);
		createEReference(xml3DDataContainerEClass, XML3D_DATA_CONTAINER__SRC);

		xml3DElementEClass = createEClass(XML3D_ELEMENT);
		createEAttribute(xml3DElementEClass, XML3D_ELEMENT__ANY);

		xml3dTypeEClass = createEClass(XML3D_TYPE);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__CHILDREN);
		createEReference(xml3dTypeEClass, XML3D_TYPE__DEFS);
		createEReference(xml3dTypeEClass, XML3D_TYPE__MESH);
		createEReference(xml3dTypeEClass, XML3D_TYPE__GROUP);
		createEReference(xml3dTypeEClass, XML3D_TYPE__VIEW);
		createEReference(xml3dTypeEClass, XML3D_TYPE__LIGHT);
		createEReference(xml3dTypeEClass, XML3D_TYPE__SCRIPT);
		createEReference(xml3dTypeEClass, XML3D_TYPE__ACTIVE_VIEW);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__HEIGHT);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__ONCLICK);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__ONDBLCLICK);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__ONDROP);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__ONKEYDOWN);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__ONKEYPRESS);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__ONKEYUP);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__ONMOUSEDOWN);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__ONMOUSEMOVE);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__ONMOUSEOUT);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__ONMOUSEOVER);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__ONMOUSEUP);
		createEAttribute(xml3dTypeEClass, XML3D_TYPE__WIDTH);

		// Create enums
		filterTypesEEnum = createEEnum(FILTER_TYPES);
		meshTypeNamesEEnum = createEEnum(MESH_TYPE_NAMES);
		textureTypesEEnum = createEEnum(TEXTURE_TYPES);
		wrapTypesEEnum = createEEnum(WRAP_TYPES);

		// Create data types
		booleanArrayEDataType = createEDataType(BOOLEAN_ARRAY);
		contentTypeEDataType = createEDataType(CONTENT_TYPE);
		filterTypesObjectEDataType = createEDataType(FILTER_TYPES_OBJECT);
		float2ArrayEDataType = createEDataType(FLOAT2_ARRAY);
		float3ArrayEDataType = createEDataType(FLOAT3_ARRAY);
		float4ArrayEDataType = createEDataType(FLOAT4_ARRAY);
		float4x4ArrayEDataType = createEDataType(FLOAT4X4_ARRAY);
		floatArrayEDataType = createEDataType(FLOAT_ARRAY);
		int4ArrayEDataType = createEDataType(INT4_ARRAY);
		intArrayEDataType = createEDataType(INT_ARRAY);
		meshTypeNamesObjectEDataType = createEDataType(MESH_TYPE_NAMES_OBJECT);
		textureTypesObjectEDataType = createEDataType(TEXTURE_TYPES_OBJECT);
		wrapTypesObjectEDataType = createEDataType(WRAP_TYPES_OBJECT);
		xml3DRotationEDataType = createEDataType(XML3D_ROTATION);
		xml3DVec3EDataType = createEDataType(XML3D_VEC3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataTypeEClass.getESuperTypes().add(this.getXML3DDataContainer());
		defsTypeEClass.getESuperTypes().add(this.getXML3DElement());
		groupTypeEClass.getESuperTypes().add(this.getXML3DElement());
		imgTypeEClass.getESuperTypes().add(this.getHTMLElement());
		lightShaderTypeEClass.getESuperTypes().add(this.getXML3DDataContainer());
		lightTypeEClass.getESuperTypes().add(this.getXML3DElement());
		meshTypeEClass.getESuperTypes().add(this.getXML3DDataContainer());
		scriptTypeEClass.getESuperTypes().add(this.getHTMLElement());
		shaderTypeEClass.getESuperTypes().add(this.getXML3DDataContainer());
		transformTypeEClass.getESuperTypes().add(this.getXML3DElement());
		viewTypeEClass.getESuperTypes().add(this.getXML3DElement());
		xml3DDataContainerEClass.getESuperTypes().add(this.getXML3DElement());
		xml3DElementEClass.getESuperTypes().add(this.getHTMLElement());
		xml3dTypeEClass.getESuperTypes().add(this.getXML3DElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(boolTypeEClass, BoolType.class, "BoolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolType_Value(), this.getBooleanArray(), "value", null, 0, 1, BoolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BoolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, BoolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Map(), theXMLTypePackage.getString(), "map", "", 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_Script(), this.getScriptType(), null, "script", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defsTypeEClass, DefsType.class, "DefsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefsType_Children(), ecorePackage.getEFeatureMapEntry(), "children", null, 0, -1, DefsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefsType_Shader(), this.getShaderType(), null, "shader", null, 0, -1, DefsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefsType_Lightshader(), this.getLightShaderType(), null, "lightshader", null, 0, -1, DefsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefsType_Data(), this.getDataType(), null, "data", null, 0, -1, DefsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefsType_Transform(), this.getTransformType(), null, "transform", null, 0, -1, DefsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefsType_Mesh(), this.getMeshType(), null, "mesh", null, 0, -1, DefsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefsType_Script(), this.getScriptType(), null, "script", null, 0, -1, DefsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Bool(), this.getBoolType(), null, "bool", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Data(), this.getDataType(), null, "data", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Defs(), this.getDefsType(), null, "defs", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Float(), this.getFloatType(), null, "float", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Float2(), this.getFloat2Type(), null, "float2", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Float3(), this.getFloat3Type(), null, "float3", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Float4(), this.getFloat4Type(), null, "float4", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Float4x4(), this.getFloat4x4Type(), null, "float4x4", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Group(), this.getGroupType(), null, "group", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Img(), this.getImgType(), null, "img", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Int(), this.getIntType(), null, "int", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Int4(), this.getInt4Type(), null, "int4", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Light(), this.getLightType(), null, "light", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Lightshader(), this.getLightShaderType(), null, "lightshader", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Mesh(), this.getMeshType(), null, "mesh", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Script(), this.getScriptType(), null, "script", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Shader(), this.getShaderType(), null, "shader", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Texture(), this.getTextureType(), null, "texture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transform(), this.getTransformType(), null, "transform", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_View(), this.getViewType(), null, "view", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Xml3d(), this.getXml3dType(), null, "xml3d", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(float2TypeEClass, Float2Type.class, "Float2Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloat2Type_Value(), this.getFloat2Array(), "value", null, 0, 1, Float2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat2Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Float2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat2Type_Key(), theXMLTypePackage.getFloat(), "key", "0.0", 0, 1, Float2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat2Type_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Float2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(float3TypeEClass, Float3Type.class, "Float3Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloat3Type_Value(), this.getFloat3Array(), "value", null, 0, 1, Float3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat3Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Float3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat3Type_Key(), theXMLTypePackage.getFloat(), "key", "0.0", 0, 1, Float3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat3Type_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Float3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(float4TypeEClass, Float4Type.class, "Float4Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloat4Type_Value(), this.getFloat4Array(), "value", null, 0, 1, Float4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat4Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Float4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat4Type_Key(), theXMLTypePackage.getFloat(), "key", "0.0", 0, 1, Float4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat4Type_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Float4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(float4x4TypeEClass, Float4x4Type.class, "Float4x4Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloat4x4Type_Value(), this.getFloat4x4Array(), "value", null, 0, 1, Float4x4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat4x4Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Float4x4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat4x4Type_Key(), theXMLTypePackage.getFloat(), "key", "0.0", 0, 1, Float4x4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat4x4Type_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Float4x4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatTypeEClass, FloatType.class, "FloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatType_Value(), this.getFloatArray(), "value", null, 0, 1, FloatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, FloatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatType_Key(), theXMLTypePackage.getFloat(), "key", "0.0", 0, 1, FloatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, FloatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupTypeEClass, GroupType.class, "GroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupType_Children(), ecorePackage.getEFeatureMapEntry(), "children", null, 0, -1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupType_Defs(), this.getDefsType(), null, "defs", null, 0, -1, GroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroupType_Mesh(), this.getMeshType(), null, "mesh", null, 0, -1, GroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroupType_Group(), this.getGroupType(), null, "group", null, 0, -1, GroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroupType_View(), this.getViewType(), null, "view", null, 0, -1, GroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroupType_Light(), this.getLightType(), null, "light", null, 0, -1, GroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroupType_Script(), this.getScriptType(), null, "script", null, 0, -1, GroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Onclick(), theXMLTypePackage.getString(), "onclick", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Ondblclick(), theXMLTypePackage.getString(), "ondblclick", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Ondrop(), theXMLTypePackage.getString(), "ondrop", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Onkeydown(), theXMLTypePackage.getString(), "onkeydown", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Onkeypress(), theXMLTypePackage.getString(), "onkeypress", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Onkeyup(), theXMLTypePackage.getString(), "onkeyup", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Onmousedown(), theXMLTypePackage.getString(), "onmousedown", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Onmousemove(), theXMLTypePackage.getString(), "onmousemove", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Onmouseout(), theXMLTypePackage.getString(), "onmouseout", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Onmouseover(), theXMLTypePackage.getString(), "onmouseover", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Onmouseup(), theXMLTypePackage.getString(), "onmouseup", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupType_Shader(), this.getShaderType(), null, "shader", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupType_Transform(), this.getXML3DElement(), null, "transform", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Visible(), theXMLTypePackage.getBoolean(), "visible", "true", 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlElementEClass, HTMLElement.class, "HTMLElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTMLElement_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, HTMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTMLElement_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, HTMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTMLElement_Style(), theXMLTypePackage.getString(), "style", "", 0, 1, HTMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTMLElement_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, HTMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imgTypeEClass, ImgType.class, "ImgType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImgType_Src(), theXMLTypePackage.getAnyURI(), "src", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(int4TypeEClass, Int4Type.class, "Int4Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInt4Type_Value(), this.getInt4Array(), "value", null, 0, 1, Int4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt4Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Int4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt4Type_Key(), theXMLTypePackage.getFloat(), "key", "0.0", 0, 1, Int4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt4Type_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Int4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intTypeEClass, IntType.class, "IntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntType_Value(), this.getIntArray(), "value", null, 0, 1, IntType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, IntType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntType_Key(), theXMLTypePackage.getFloat(), "key", "0.0", 0, 1, IntType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, IntType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lightShaderTypeEClass, LightShaderType.class, "LightShaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLightShaderType_Script(), this.getScriptType(), null, "script", null, 0, 1, LightShaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lightTypeEClass, LightType.class, "LightType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLightType_Global(), theXMLTypePackage.getBoolean(), "global", null, 0, 1, LightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLightType_Intensity(), theXMLTypePackage.getFloat(), "intensity", null, 0, 1, LightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLightType_Shader(), this.getLightShaderType(), null, "shader", null, 0, 1, LightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLightType_Visible(), theXMLTypePackage.getBoolean(), "visible", "true", 0, 1, LightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meshTypeEClass, MeshType.class, "MeshType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeshType_Onclick(), theXMLTypePackage.getString(), "onclick", null, 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Ondblclick(), theXMLTypePackage.getString(), "ondblclick", null, 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Ondrop(), theXMLTypePackage.getString(), "ondrop", null, 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Onkeydown(), theXMLTypePackage.getString(), "onkeydown", null, 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Onkeypress(), theXMLTypePackage.getString(), "onkeypress", null, 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Onkeyup(), theXMLTypePackage.getString(), "onkeyup", null, 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Onmousedown(), theXMLTypePackage.getString(), "onmousedown", null, 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Onmousemove(), theXMLTypePackage.getString(), "onmousemove", null, 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Onmouseout(), theXMLTypePackage.getString(), "onmouseout", null, 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Onmouseover(), theXMLTypePackage.getString(), "onmouseover", null, 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Onmouseup(), theXMLTypePackage.getString(), "onmouseup", null, 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Type(), this.getMeshTypeNames(), "type", "triangles", 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshType_Visible(), theXMLTypePackage.getBoolean(), "visible", "true", 0, 1, MeshType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptTypeEClass, ScriptType.class, "ScriptType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScriptType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ScriptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptType_Src(), theXMLTypePackage.getAnyURI(), "src", null, 0, 1, ScriptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptType_Type(), this.getContentType(), "type", null, 1, 1, ScriptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shaderTypeEClass, ShaderType.class, "ShaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShaderType_Script(), this.getScriptType(), null, "script", null, 0, 1, ShaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textureTypeEClass, TextureType.class, "TextureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextureType_Img(), this.getImgType(), null, "img", null, 0, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureType_BorderColor(), theXMLTypePackage.getString(), "borderColor", "", 0, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureType_FilterMag(), this.getFilterTypes(), "filterMag", "linear", 0, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureType_FilterMin(), this.getFilterTypes(), "filterMin", "linear", 0, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureType_FilterMip(), this.getFilterTypes(), "filterMip", "nearest", 0, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureType_Key(), theXMLTypePackage.getFloat(), "key", "0.0", 0, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureType_Type(), this.getTextureTypes(), "type", "2D", 0, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureType_WrapS(), this.getWrapTypes(), "wrapS", "clamp", 0, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureType_WrapT(), this.getWrapTypes(), "wrapT", "clamp", 0, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureType_WrapU(), this.getWrapTypes(), "wrapU", "clamp", 0, 1, TextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformTypeEClass, TransformType.class, "TransformType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformType_Center(), this.getXML3DVec3(), "center", "0 0 0", 0, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_Rotation(), this.getXML3DRotation(), "rotation", "0 0 1 0", 0, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_Scale(), this.getXML3DVec3(), "scale", "1 1 1", 0, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_ScaleOrientation(), this.getXML3DRotation(), "scaleOrientation", "0 0 1 0", 0, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_Translation(), this.getXML3DVec3(), "translation", "0 0 0", 0, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewTypeEClass, ViewType.class, "ViewType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewType_FieldOfView(), theXMLTypePackage.getFloat(), "fieldOfView", "0.78539816339744828", 0, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewType_Orientation(), this.getXML3DRotation(), "orientation", "0 0 1 0", 0, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewType_Position(), this.getXML3DVec3(), "position", "0 0 0", 0, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xml3DDataContainerEClass, XML3DDataContainer.class, "XML3DDataContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXML3DDataContainer_Children(), ecorePackage.getEFeatureMapEntry(), "children", null, 0, -1, XML3DDataContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Data(), this.getDataType(), null, "data", null, 0, -1, XML3DDataContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Bool(), this.getBoolType(), null, "bool", null, 0, -1, XML3DDataContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Float(), this.getFloatType(), null, "float", null, 0, -1, XML3DDataContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Float2(), this.getFloat2Type(), null, "float2", null, 0, -1, XML3DDataContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Float3(), this.getFloat3Type(), null, "float3", null, 0, -1, XML3DDataContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Float4(), this.getFloat4Type(), null, "float4", null, 0, -1, XML3DDataContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Float4x4(), this.getFloat4x4Type(), null, "float4x4", null, 0, -1, XML3DDataContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Int(), this.getIntType(), null, "int", null, 0, -1, XML3DDataContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Int4(), this.getInt4Type(), null, "int4", null, 0, -1, XML3DDataContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Texture(), this.getTextureType(), null, "texture", null, 0, -1, XML3DDataContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getXML3DDataContainer_Compute(), theXMLTypePackage.getString(), "compute", "", 0, 1, XML3DDataContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Proto(), this.getDataType(), null, "proto", null, 0, 1, XML3DDataContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXML3DDataContainer_Src(), this.getDataType(), null, "src", null, 0, 1, XML3DDataContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xml3DElementEClass, XML3DElement.class, "XML3DElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXML3DElement_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, XML3DElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xml3dTypeEClass, Xml3dType.class, "Xml3dType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXml3dType_Children(), ecorePackage.getEFeatureMapEntry(), "children", null, 0, -1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXml3dType_Defs(), this.getDefsType(), null, "defs", null, 0, -1, Xml3dType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXml3dType_Mesh(), this.getMeshType(), null, "mesh", null, 0, -1, Xml3dType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXml3dType_Group(), this.getGroupType(), null, "group", null, 0, -1, Xml3dType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXml3dType_View(), this.getViewType(), null, "view", null, 0, -1, Xml3dType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXml3dType_Light(), this.getLightType(), null, "light", null, 0, -1, Xml3dType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXml3dType_Script(), this.getScriptType(), null, "script", null, 0, -1, Xml3dType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXml3dType_ActiveView(), this.getViewType(), null, "activeView", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Height(), theXMLTypePackage.getInt(), "height", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Onclick(), theXMLTypePackage.getString(), "onclick", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Ondblclick(), theXMLTypePackage.getString(), "ondblclick", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Ondrop(), theXMLTypePackage.getString(), "ondrop", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Onkeydown(), theXMLTypePackage.getString(), "onkeydown", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Onkeypress(), theXMLTypePackage.getString(), "onkeypress", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Onkeyup(), theXMLTypePackage.getString(), "onkeyup", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Onmousedown(), theXMLTypePackage.getString(), "onmousedown", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Onmousemove(), theXMLTypePackage.getString(), "onmousemove", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Onmouseout(), theXMLTypePackage.getString(), "onmouseout", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Onmouseover(), theXMLTypePackage.getString(), "onmouseover", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Onmouseup(), theXMLTypePackage.getString(), "onmouseup", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXml3dType_Width(), theXMLTypePackage.getInt(), "width", null, 0, 1, Xml3dType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(filterTypesEEnum, FilterTypes.class, "FilterTypes");
		addEEnumLiteral(filterTypesEEnum, FilterTypes.NONE);
		addEEnumLiteral(filterTypesEEnum, FilterTypes.NEAREST);
		addEEnumLiteral(filterTypesEEnum, FilterTypes.LINEAR);

		initEEnum(meshTypeNamesEEnum, MeshTypeNames.class, "MeshTypeNames");
		addEEnumLiteral(meshTypeNamesEEnum, MeshTypeNames.TRIANGLES);
		addEEnumLiteral(meshTypeNamesEEnum, MeshTypeNames.LINE_STRIPS);

		initEEnum(textureTypesEEnum, TextureTypes.class, "TextureTypes");
		addEEnumLiteral(textureTypesEEnum, TextureTypes._2D);
		addEEnumLiteral(textureTypesEEnum, TextureTypes._1D);
		addEEnumLiteral(textureTypesEEnum, TextureTypes._3D);

		initEEnum(wrapTypesEEnum, WrapTypes.class, "WrapTypes");
		addEEnumLiteral(wrapTypesEEnum, WrapTypes.CLAMP);
		addEEnumLiteral(wrapTypesEEnum, WrapTypes.REPEAT);
		addEEnumLiteral(wrapTypesEEnum, WrapTypes.BORDER);

		// Initialize data types
		initEDataType(booleanArrayEDataType, List.class, "BooleanArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contentTypeEDataType, String.class, "ContentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(filterTypesObjectEDataType, FilterTypes.class, "FilterTypesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(float2ArrayEDataType, TFloatList.class, "Float2Array", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(float3ArrayEDataType, TFloatList.class, "Float3Array", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(float4ArrayEDataType, TFloatList.class, "Float4Array", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(float4x4ArrayEDataType, TFloatList.class, "Float4x4Array", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatArrayEDataType, TFloatList.class, "FloatArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(int4ArrayEDataType, TIntList.class, "Int4Array", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intArrayEDataType, TIntList.class, "IntArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meshTypeNamesObjectEDataType, MeshTypeNames.class, "MeshTypeNamesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textureTypesObjectEDataType, TextureTypes.class, "TextureTypesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(wrapTypesObjectEDataType, WrapTypes.class, "WrapTypesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xml3DRotationEDataType, TFloatList.class, "XML3DRotation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xml3DVec3EDataType, TFloatList.class, "XML3DVec3", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (booleanArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "BooleanArray",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#boolean"
		   });		
		addAnnotation
		  (boolTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bool_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBoolType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBoolType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getBoolType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (contentTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ContentType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (dataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDataType_Map(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "map"
		   });		
		addAnnotation
		  (getDataType_Script(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "script"
		   });		
		addAnnotation
		  (defsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "defs_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDefsType_Children(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "children:5"
		   });		
		addAnnotation
		  (getDefsType_Shader(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shader",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getDefsType_Lightshader(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lightshader",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getDefsType_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getDefsType_Transform(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transform",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getDefsType_Mesh(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mesh",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });			
		addAnnotation
		  (getDefsType_Script(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "script",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Bool(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bool",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Defs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Float(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Float2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float2",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Float3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float3",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Float4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float4",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Float4x4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float4x4",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Group(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Img(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "img",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Int(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "int",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Int4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "int4",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Light(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "light",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Lightshader(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lightshader",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Mesh(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mesh",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Script(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "script",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Shader(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shader",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Texture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "texture",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Transform(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_View(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "view",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Xml3d(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "xml3d",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (filterTypesEEnum, 
		   source, 
		   new String[] {
			 "name", "FilterTypes"
		   });		
		addAnnotation
		  (filterTypesObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "FilterTypes:Object",
			 "baseType", "FilterTypes"
		   });		
		addAnnotation
		  (float2ArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "Float2Array"
		   });		
		addAnnotation
		  (float2TypeEClass, 
		   source, 
		   new String[] {
			 "name", "float2_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloat2Type_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloat2Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getFloat2Type_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getFloat2Type_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (float3ArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "Float3Array"
		   });		
		addAnnotation
		  (float3TypeEClass, 
		   source, 
		   new String[] {
			 "name", "float3_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloat3Type_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloat3Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getFloat3Type_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getFloat3Type_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (float4ArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "Float4Array"
		   });		
		addAnnotation
		  (float4TypeEClass, 
		   source, 
		   new String[] {
			 "name", "float4_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloat4Type_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloat4Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getFloat4Type_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getFloat4Type_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (float4x4ArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "Float4x4Array"
		   });		
		addAnnotation
		  (float4x4TypeEClass, 
		   source, 
		   new String[] {
			 "name", "float4x4_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloat4x4Type_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloat4x4Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getFloat4x4Type_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getFloat4x4Type_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (floatArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "FloatArray"
		   });		
		addAnnotation
		  (floatTypeEClass, 
		   source, 
		   new String[] {
			 "name", "float_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloatType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloatType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getFloatType_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getFloatType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (groupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "group_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGroupType_Children(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "children:5"
		   });		
		addAnnotation
		  (getGroupType_Defs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defs",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getGroupType_Mesh(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mesh",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getGroupType_Group(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "group",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getGroupType_View(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "view",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getGroupType_Light(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "light",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });			
		addAnnotation
		  (getGroupType_Script(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "script",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getGroupType_Onclick(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onclick"
		   });		
		addAnnotation
		  (getGroupType_Ondblclick(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ondblclick"
		   });		
		addAnnotation
		  (getGroupType_Ondrop(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ondrop"
		   });		
		addAnnotation
		  (getGroupType_Onkeydown(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onkeydown"
		   });		
		addAnnotation
		  (getGroupType_Onkeypress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onkeypress"
		   });		
		addAnnotation
		  (getGroupType_Onkeyup(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onkeyup"
		   });		
		addAnnotation
		  (getGroupType_Onmousedown(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmousedown"
		   });		
		addAnnotation
		  (getGroupType_Onmousemove(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmousemove"
		   });		
		addAnnotation
		  (getGroupType_Onmouseout(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmouseout"
		   });		
		addAnnotation
		  (getGroupType_Onmouseover(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmouseover"
		   });		
		addAnnotation
		  (getGroupType_Onmouseup(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmouseup"
		   });		
		addAnnotation
		  (getGroupType_Shader(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shader"
		   });		
		addAnnotation
		  (getGroupType_Transform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transform"
		   });		
		addAnnotation
		  (getGroupType_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible"
		   });		
		addAnnotation
		  (htmlElementEClass, 
		   source, 
		   new String[] {
			 "name", "HTMLElement",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getHTMLElement_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getHTMLElement_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getHTMLElement_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getHTMLElement_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "skip"
		   });		
		addAnnotation
		  (imgTypeEClass, 
		   source, 
		   new String[] {
			 "name", "img_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getImgType_Src(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "src"
		   });		
		addAnnotation
		  (int4ArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "Int4Array"
		   });		
		addAnnotation
		  (int4TypeEClass, 
		   source, 
		   new String[] {
			 "name", "int4_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getInt4Type_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getInt4Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getInt4Type_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getInt4Type_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (intArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "IntArray"
		   });		
		addAnnotation
		  (intTypeEClass, 
		   source, 
		   new String[] {
			 "name", "int_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getIntType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getIntType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getIntType_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getIntType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (lightShaderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LightShaderType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getLightShaderType_Script(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "script"
		   });		
		addAnnotation
		  (lightTypeEClass, 
		   source, 
		   new String[] {
			 "name", "light_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLightType_Global(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "global"
		   });		
		addAnnotation
		  (getLightType_Intensity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "intensity"
		   });		
		addAnnotation
		  (getLightType_Shader(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shader"
		   });		
		addAnnotation
		  (getLightType_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible"
		   });		
		addAnnotation
		  (meshTypeEClass, 
		   source, 
		   new String[] {
			 "name", "mesh_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMeshType_Onclick(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onclick"
		   });		
		addAnnotation
		  (getMeshType_Ondblclick(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ondblclick"
		   });		
		addAnnotation
		  (getMeshType_Ondrop(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ondrop"
		   });		
		addAnnotation
		  (getMeshType_Onkeydown(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onkeydown"
		   });		
		addAnnotation
		  (getMeshType_Onkeypress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onkeypress"
		   });		
		addAnnotation
		  (getMeshType_Onkeyup(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onkeyup"
		   });		
		addAnnotation
		  (getMeshType_Onmousedown(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmousedown"
		   });		
		addAnnotation
		  (getMeshType_Onmousemove(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmousemove"
		   });		
		addAnnotation
		  (getMeshType_Onmouseout(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmouseout"
		   });		
		addAnnotation
		  (getMeshType_Onmouseover(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmouseover"
		   });		
		addAnnotation
		  (getMeshType_Onmouseup(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmouseup"
		   });			
		addAnnotation
		  (getMeshType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (getMeshType_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible"
		   });		
		addAnnotation
		  (meshTypeNamesEEnum, 
		   source, 
		   new String[] {
			 "name", "MeshTypeNames"
		   });		
		addAnnotation
		  (meshTypeNamesObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "MeshTypeNames:Object",
			 "baseType", "MeshTypeNames"
		   });		
		addAnnotation
		  (scriptTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ScriptType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getScriptType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getScriptType_Src(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "src"
		   });		
		addAnnotation
		  (getScriptType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (shaderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ShaderType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getShaderType_Script(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "script"
		   });		
		addAnnotation
		  (textureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "texture_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTextureType_Img(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "img",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getTextureType_BorderColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "borderColor"
		   });			
		addAnnotation
		  (getTextureType_FilterMag(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "filterMag"
		   });			
		addAnnotation
		  (getTextureType_FilterMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "filterMin"
		   });			
		addAnnotation
		  (getTextureType_FilterMip(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "filterMip"
		   });		
		addAnnotation
		  (getTextureType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getTextureType_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getTextureType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getTextureType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });			
		addAnnotation
		  (getTextureType_WrapS(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wrapS"
		   });			
		addAnnotation
		  (getTextureType_WrapT(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wrapT"
		   });			
		addAnnotation
		  (getTextureType_WrapU(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wrapU"
		   });		
		addAnnotation
		  (textureTypesEEnum, 
		   source, 
		   new String[] {
			 "name", "TextureTypes"
		   });		
		addAnnotation
		  (textureTypesObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TextureTypes:Object",
			 "baseType", "TextureTypes"
		   });		
		addAnnotation
		  (transformTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TransformType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransformType_Center(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "center"
		   });		
		addAnnotation
		  (getTransformType_Rotation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rotation"
		   });		
		addAnnotation
		  (getTransformType_Scale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scale"
		   });		
		addAnnotation
		  (getTransformType_ScaleOrientation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scaleOrientation"
		   });		
		addAnnotation
		  (getTransformType_Translation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "translation"
		   });		
		addAnnotation
		  (viewTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ViewType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getViewType_FieldOfView(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fieldOfView"
		   });		
		addAnnotation
		  (getViewType_Orientation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "orientation"
		   });		
		addAnnotation
		  (getViewType_Position(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "position"
		   });		
		addAnnotation
		  (wrapTypesEEnum, 
		   source, 
		   new String[] {
			 "name", "WrapTypes"
		   });		
		addAnnotation
		  (wrapTypesObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "WrapTypes:Object",
			 "baseType", "WrapTypes"
		   });		
		addAnnotation
		  (xml3DDataContainerEClass, 
		   source, 
		   new String[] {
			 "name", "XML3DDataContainer",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Children(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "children:5"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Bool(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bool",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Float(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Float2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float2",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Float3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float3",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Float4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float4",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Float4x4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float4x4",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Int(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "int",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Int4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "int4",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Texture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "texture",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Compute(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "compute"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Proto(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "proto"
		   });		
		addAnnotation
		  (getXML3DDataContainer_Src(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "src"
		   });		
		addAnnotation
		  (xml3DElementEClass, 
		   source, 
		   new String[] {
			 "name", "XML3DElement",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getXML3DElement_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "skip"
		   });		
		addAnnotation
		  (xml3DRotationEDataType, 
		   source, 
		   new String[] {
			 "name", "XML3DRotation"
		   });		
		addAnnotation
		  (xml3dTypeEClass, 
		   source, 
		   new String[] {
			 "name", "xml3d_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getXml3dType_Children(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "children:5"
		   });		
		addAnnotation
		  (getXml3dType_Defs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defs",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXml3dType_Mesh(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mesh",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXml3dType_Group(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "group",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXml3dType_View(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "view",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXml3dType_Light(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "light",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });			
		addAnnotation
		  (getXml3dType_Script(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "script",
			 "namespace", "##targetNamespace",
			 "group", "#children:5"
		   });		
		addAnnotation
		  (getXml3dType_ActiveView(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "activeView"
		   });		
		addAnnotation
		  (getXml3dType_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "height"
		   });		
		addAnnotation
		  (getXml3dType_Onclick(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onclick"
		   });		
		addAnnotation
		  (getXml3dType_Ondblclick(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ondblclick"
		   });		
		addAnnotation
		  (getXml3dType_Ondrop(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ondrop"
		   });		
		addAnnotation
		  (getXml3dType_Onkeydown(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onkeydown"
		   });		
		addAnnotation
		  (getXml3dType_Onkeypress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onkeypress"
		   });		
		addAnnotation
		  (getXml3dType_Onkeyup(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onkeyup"
		   });		
		addAnnotation
		  (getXml3dType_Onmousedown(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmousedown"
		   });		
		addAnnotation
		  (getXml3dType_Onmousemove(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmousemove"
		   });		
		addAnnotation
		  (getXml3dType_Onmouseout(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmouseout"
		   });		
		addAnnotation
		  (getXml3dType_Onmouseover(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmouseover"
		   });		
		addAnnotation
		  (getXml3dType_Onmouseup(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onmouseup"
		   });		
		addAnnotation
		  (getXml3dType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width"
		   });		
		addAnnotation
		  (xml3DVec3EDataType, 
		   source, 
		   new String[] {
			 "name", "XML3DVec3"
		   });
	}

} //Xml3dPackageImpl
