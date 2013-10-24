/**
 */
package org.xml3d._2009.xml3d;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * XML3D Specification
 * <!-- end-model-doc -->
 * @see org.xml3d._2009.xml3d.Xml3dFactory
 * @model kind="package"
 * @generated
 */
public interface Xml3dPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xml3d";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xml3d.org/2009/xml3d";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_xml3d";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Xml3dPackage eINSTANCE = org.xml3d._2009.xml3d.impl.Xml3dPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.BoolTypeImpl <em>Bool Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.BoolTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getBoolType()
	 * @generated
	 */
	int BOOL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Bool Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bool Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.HTMLElementImpl <em>HTML Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.HTMLElementImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getHTMLElement()
	 * @generated
	 */
	int HTML_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__STYLE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>HTML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>HTML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.XML3DElementImpl <em>XML3D Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.XML3DElementImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getXML3DElement()
	 * @generated
	 */
	int XML3D_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_ELEMENT__CLASS = HTML_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_ELEMENT__ID = HTML_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_ELEMENT__STYLE = HTML_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_ELEMENT__ANY_ATTRIBUTE = HTML_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_ELEMENT__ANY = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML3D Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_ELEMENT_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XML3D Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_ELEMENT_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl <em>XML3D Data Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getXML3DDataContainer()
	 * @generated
	 */
	int XML3D_DATA_CONTAINER = 22;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__CLASS = XML3D_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__ID = XML3D_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__STYLE = XML3D_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__ANY_ATTRIBUTE = XML3D_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__ANY = XML3D_ELEMENT__ANY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__CHILDREN = XML3D_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__DATA = XML3D_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__BOOL = XML3D_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__FLOAT = XML3D_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Float2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__FLOAT2 = XML3D_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Float3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__FLOAT3 = XML3D_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Float4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__FLOAT4 = XML3D_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Float4x4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__FLOAT4X4 = XML3D_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__INT = XML3D_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Int4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__INT4 = XML3D_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__TEXTURE = XML3D_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Compute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__COMPUTE = XML3D_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Proto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__PROTO = XML3D_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER__SRC = XML3D_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>XML3D Data Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER_FEATURE_COUNT = XML3D_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>XML3D Data Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_DATA_CONTAINER_OPERATION_COUNT = XML3D_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.DataTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CLASS = XML3D_DATA_CONTAINER__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ID = XML3D_DATA_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__STYLE = XML3D_DATA_CONTAINER__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANY_ATTRIBUTE = XML3D_DATA_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANY = XML3D_DATA_CONTAINER__ANY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CHILDREN = XML3D_DATA_CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATA = XML3D_DATA_CONTAINER__DATA;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__BOOL = XML3D_DATA_CONTAINER__BOOL;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FLOAT = XML3D_DATA_CONTAINER__FLOAT;

	/**
	 * The feature id for the '<em><b>Float2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FLOAT2 = XML3D_DATA_CONTAINER__FLOAT2;

	/**
	 * The feature id for the '<em><b>Float3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FLOAT3 = XML3D_DATA_CONTAINER__FLOAT3;

	/**
	 * The feature id for the '<em><b>Float4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FLOAT4 = XML3D_DATA_CONTAINER__FLOAT4;

	/**
	 * The feature id for the '<em><b>Float4x4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FLOAT4X4 = XML3D_DATA_CONTAINER__FLOAT4X4;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INT = XML3D_DATA_CONTAINER__INT;

	/**
	 * The feature id for the '<em><b>Int4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INT4 = XML3D_DATA_CONTAINER__INT4;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TEXTURE = XML3D_DATA_CONTAINER__TEXTURE;

	/**
	 * The feature id for the '<em><b>Compute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__COMPUTE = XML3D_DATA_CONTAINER__COMPUTE;

	/**
	 * The feature id for the '<em><b>Proto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PROTO = XML3D_DATA_CONTAINER__PROTO;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SRC = XML3D_DATA_CONTAINER__SRC;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MAP = XML3D_DATA_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SCRIPT = XML3D_DATA_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = XML3D_DATA_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = XML3D_DATA_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.DefsTypeImpl <em>Defs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.DefsTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getDefsType()
	 * @generated
	 */
	int DEFS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__CLASS = XML3D_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__ID = XML3D_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__STYLE = XML3D_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__ANY_ATTRIBUTE = XML3D_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__ANY = XML3D_ELEMENT__ANY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__CHILDREN = XML3D_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__SHADER = XML3D_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lightshader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__LIGHTSHADER = XML3D_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__DATA = XML3D_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__TRANSFORM = XML3D_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__MESH = XML3D_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE__SCRIPT = XML3D_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Defs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE_FEATURE_COUNT = XML3D_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Defs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_TYPE_OPERATION_COUNT = XML3D_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.DocumentRootImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOL = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA = 4;

	/**
	 * The feature id for the '<em><b>Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFS = 5;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOAT = 6;

	/**
	 * The feature id for the '<em><b>Float2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOAT2 = 7;

	/**
	 * The feature id for the '<em><b>Float3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOAT3 = 8;

	/**
	 * The feature id for the '<em><b>Float4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOAT4 = 9;

	/**
	 * The feature id for the '<em><b>Float4x4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOAT4X4 = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUP = 11;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMG = 12;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INT = 13;

	/**
	 * The feature id for the '<em><b>Int4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INT4 = 14;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIGHT = 15;

	/**
	 * The feature id for the '<em><b>Lightshader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIGHTSHADER = 16;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESH = 17;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCRIPT = 18;

	/**
	 * The feature id for the '<em><b>Shader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHADER = 19;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTURE = 20;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM = 21;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIEW = 22;

	/**
	 * The feature id for the '<em><b>Xml3d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XML3D = 23;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.Float2TypeImpl <em>Float2 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.Float2TypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat2Type()
	 * @generated
	 */
	int FLOAT2_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT2_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT2_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT2_TYPE__KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT2_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Float2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT2_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Float2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT2_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.Float3TypeImpl <em>Float3 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.Float3TypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat3Type()
	 * @generated
	 */
	int FLOAT3_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT3_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT3_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT3_TYPE__KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT3_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Float3 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT3_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Float3 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT3_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.Float4TypeImpl <em>Float4 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.Float4TypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat4Type()
	 * @generated
	 */
	int FLOAT4_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4_TYPE__KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Float4 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Float4 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.Float4x4TypeImpl <em>Float4x4 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.Float4x4TypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat4x4Type()
	 * @generated
	 */
	int FLOAT4X4_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4X4_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4X4_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4X4_TYPE__KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4X4_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Float4x4 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4X4_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Float4x4 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT4X4_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.FloatTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.GroupTypeImpl <em>Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.GroupTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getGroupType()
	 * @generated
	 */
	int GROUP_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__CLASS = XML3D_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ID = XML3D_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__STYLE = XML3D_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ANY_ATTRIBUTE = XML3D_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ANY = XML3D_ELEMENT__ANY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__CHILDREN = XML3D_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__DEFS = XML3D_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__MESH = XML3D_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__GROUP = XML3D_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__VIEW = XML3D_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__LIGHT = XML3D_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__SCRIPT = XML3D_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Onclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ONCLICK = XML3D_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ondblclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ONDBLCLICK = XML3D_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ondrop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ONDROP = XML3D_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Onkeydown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ONKEYDOWN = XML3D_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Onkeypress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ONKEYPRESS = XML3D_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Onkeyup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ONKEYUP = XML3D_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Onmousedown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ONMOUSEDOWN = XML3D_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Onmousemove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ONMOUSEMOVE = XML3D_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Onmouseout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ONMOUSEOUT = XML3D_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Onmouseover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ONMOUSEOVER = XML3D_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Onmouseup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ONMOUSEUP = XML3D_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Shader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__SHADER = XML3D_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__TRANSFORM = XML3D_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__VISIBLE = XML3D_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_FEATURE_COUNT = XML3D_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_OPERATION_COUNT = XML3D_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.ImgTypeImpl <em>Img Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.ImgTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getImgType()
	 * @generated
	 */
	int IMG_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__CLASS = HTML_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__ID = HTML_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__STYLE = HTML_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__ANY_ATTRIBUTE = HTML_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__SRC = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Img Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Img Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.Int4TypeImpl <em>Int4 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.Int4TypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getInt4Type()
	 * @generated
	 */
	int INT4_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT4_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT4_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT4_TYPE__KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT4_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Int4 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT4_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Int4 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT4_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.IntTypeImpl <em>Int Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.IntTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getIntType()
	 * @generated
	 */
	int INT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE__KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Int Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Int Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.LightShaderTypeImpl <em>Light Shader Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.LightShaderTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getLightShaderType()
	 * @generated
	 */
	int LIGHT_SHADER_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__CLASS = XML3D_DATA_CONTAINER__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__ID = XML3D_DATA_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__STYLE = XML3D_DATA_CONTAINER__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__ANY_ATTRIBUTE = XML3D_DATA_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__ANY = XML3D_DATA_CONTAINER__ANY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__CHILDREN = XML3D_DATA_CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__DATA = XML3D_DATA_CONTAINER__DATA;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__BOOL = XML3D_DATA_CONTAINER__BOOL;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__FLOAT = XML3D_DATA_CONTAINER__FLOAT;

	/**
	 * The feature id for the '<em><b>Float2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__FLOAT2 = XML3D_DATA_CONTAINER__FLOAT2;

	/**
	 * The feature id for the '<em><b>Float3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__FLOAT3 = XML3D_DATA_CONTAINER__FLOAT3;

	/**
	 * The feature id for the '<em><b>Float4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__FLOAT4 = XML3D_DATA_CONTAINER__FLOAT4;

	/**
	 * The feature id for the '<em><b>Float4x4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__FLOAT4X4 = XML3D_DATA_CONTAINER__FLOAT4X4;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__INT = XML3D_DATA_CONTAINER__INT;

	/**
	 * The feature id for the '<em><b>Int4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__INT4 = XML3D_DATA_CONTAINER__INT4;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__TEXTURE = XML3D_DATA_CONTAINER__TEXTURE;

	/**
	 * The feature id for the '<em><b>Compute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__COMPUTE = XML3D_DATA_CONTAINER__COMPUTE;

	/**
	 * The feature id for the '<em><b>Proto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__PROTO = XML3D_DATA_CONTAINER__PROTO;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__SRC = XML3D_DATA_CONTAINER__SRC;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE__SCRIPT = XML3D_DATA_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Light Shader Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE_FEATURE_COUNT = XML3D_DATA_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Light Shader Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SHADER_TYPE_OPERATION_COUNT = XML3D_DATA_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.LightTypeImpl <em>Light Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.LightTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getLightType()
	 * @generated
	 */
	int LIGHT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__CLASS = XML3D_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__ID = XML3D_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__STYLE = XML3D_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__ANY_ATTRIBUTE = XML3D_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__ANY = XML3D_ELEMENT__ANY;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__GLOBAL = XML3D_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__INTENSITY = XML3D_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__SHADER = XML3D_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE__VISIBLE = XML3D_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Light Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE_FEATURE_COUNT = XML3D_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Light Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_TYPE_OPERATION_COUNT = XML3D_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.MeshTypeImpl <em>Mesh Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.MeshTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getMeshType()
	 * @generated
	 */
	int MESH_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__CLASS = XML3D_DATA_CONTAINER__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ID = XML3D_DATA_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__STYLE = XML3D_DATA_CONTAINER__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ANY_ATTRIBUTE = XML3D_DATA_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ANY = XML3D_DATA_CONTAINER__ANY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__CHILDREN = XML3D_DATA_CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__DATA = XML3D_DATA_CONTAINER__DATA;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__BOOL = XML3D_DATA_CONTAINER__BOOL;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__FLOAT = XML3D_DATA_CONTAINER__FLOAT;

	/**
	 * The feature id for the '<em><b>Float2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__FLOAT2 = XML3D_DATA_CONTAINER__FLOAT2;

	/**
	 * The feature id for the '<em><b>Float3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__FLOAT3 = XML3D_DATA_CONTAINER__FLOAT3;

	/**
	 * The feature id for the '<em><b>Float4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__FLOAT4 = XML3D_DATA_CONTAINER__FLOAT4;

	/**
	 * The feature id for the '<em><b>Float4x4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__FLOAT4X4 = XML3D_DATA_CONTAINER__FLOAT4X4;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__INT = XML3D_DATA_CONTAINER__INT;

	/**
	 * The feature id for the '<em><b>Int4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__INT4 = XML3D_DATA_CONTAINER__INT4;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__TEXTURE = XML3D_DATA_CONTAINER__TEXTURE;

	/**
	 * The feature id for the '<em><b>Compute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__COMPUTE = XML3D_DATA_CONTAINER__COMPUTE;

	/**
	 * The feature id for the '<em><b>Proto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__PROTO = XML3D_DATA_CONTAINER__PROTO;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__SRC = XML3D_DATA_CONTAINER__SRC;

	/**
	 * The feature id for the '<em><b>Onclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ONCLICK = XML3D_DATA_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ondblclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ONDBLCLICK = XML3D_DATA_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ondrop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ONDROP = XML3D_DATA_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Onkeydown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ONKEYDOWN = XML3D_DATA_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Onkeypress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ONKEYPRESS = XML3D_DATA_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Onkeyup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ONKEYUP = XML3D_DATA_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Onmousedown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ONMOUSEDOWN = XML3D_DATA_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Onmousemove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ONMOUSEMOVE = XML3D_DATA_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Onmouseout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ONMOUSEOUT = XML3D_DATA_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Onmouseover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ONMOUSEOVER = XML3D_DATA_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Onmouseup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__ONMOUSEUP = XML3D_DATA_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__TYPE = XML3D_DATA_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE__VISIBLE = XML3D_DATA_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Mesh Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE_FEATURE_COUNT = XML3D_DATA_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Mesh Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_TYPE_OPERATION_COUNT = XML3D_DATA_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.ScriptTypeImpl <em>Script Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.ScriptTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getScriptType()
	 * @generated
	 */
	int SCRIPT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__CLASS = HTML_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__ID = HTML_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__STYLE = HTML_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__ANY_ATTRIBUTE = HTML_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__MIXED = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__SRC = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE__TYPE = HTML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Script Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Script Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TYPE_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.ShaderTypeImpl <em>Shader Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.ShaderTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getShaderType()
	 * @generated
	 */
	int SHADER_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__CLASS = XML3D_DATA_CONTAINER__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__ID = XML3D_DATA_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__STYLE = XML3D_DATA_CONTAINER__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__ANY_ATTRIBUTE = XML3D_DATA_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__ANY = XML3D_DATA_CONTAINER__ANY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__CHILDREN = XML3D_DATA_CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__DATA = XML3D_DATA_CONTAINER__DATA;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__BOOL = XML3D_DATA_CONTAINER__BOOL;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__FLOAT = XML3D_DATA_CONTAINER__FLOAT;

	/**
	 * The feature id for the '<em><b>Float2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__FLOAT2 = XML3D_DATA_CONTAINER__FLOAT2;

	/**
	 * The feature id for the '<em><b>Float3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__FLOAT3 = XML3D_DATA_CONTAINER__FLOAT3;

	/**
	 * The feature id for the '<em><b>Float4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__FLOAT4 = XML3D_DATA_CONTAINER__FLOAT4;

	/**
	 * The feature id for the '<em><b>Float4x4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__FLOAT4X4 = XML3D_DATA_CONTAINER__FLOAT4X4;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__INT = XML3D_DATA_CONTAINER__INT;

	/**
	 * The feature id for the '<em><b>Int4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__INT4 = XML3D_DATA_CONTAINER__INT4;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__TEXTURE = XML3D_DATA_CONTAINER__TEXTURE;

	/**
	 * The feature id for the '<em><b>Compute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__COMPUTE = XML3D_DATA_CONTAINER__COMPUTE;

	/**
	 * The feature id for the '<em><b>Proto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__PROTO = XML3D_DATA_CONTAINER__PROTO;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__SRC = XML3D_DATA_CONTAINER__SRC;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE__SCRIPT = XML3D_DATA_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shader Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE_FEATURE_COUNT = XML3D_DATA_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shader Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_TYPE_OPERATION_COUNT = XML3D_DATA_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl <em>Texture Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.TextureTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getTextureType()
	 * @generated
	 */
	int TEXTURE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__IMG = 0;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__BORDER_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Filter Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__FILTER_MAG = 2;

	/**
	 * The feature id for the '<em><b>Filter Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__FILTER_MIN = 3;

	/**
	 * The feature id for the '<em><b>Filter Mip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__FILTER_MIP = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__KEY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Wrap S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__WRAP_S = 9;

	/**
	 * The feature id for the '<em><b>Wrap T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__WRAP_T = 10;

	/**
	 * The feature id for the '<em><b>Wrap U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE__WRAP_U = 11;

	/**
	 * The number of structural features of the '<em>Texture Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Texture Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.TransformTypeImpl <em>Transform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.TransformTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getTransformType()
	 * @generated
	 */
	int TRANSFORM_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__CLASS = XML3D_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__ID = XML3D_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__STYLE = XML3D_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__ANY_ATTRIBUTE = XML3D_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__ANY = XML3D_ELEMENT__ANY;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__CENTER = XML3D_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__ROTATION = XML3D_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__SCALE = XML3D_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__SCALE_ORIENTATION = XML3D_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__TRANSLATION = XML3D_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE_FEATURE_COUNT = XML3D_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE_OPERATION_COUNT = XML3D_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.ViewTypeImpl <em>View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.ViewTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getViewType()
	 * @generated
	 */
	int VIEW_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__CLASS = XML3D_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__ID = XML3D_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__STYLE = XML3D_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__ANY_ATTRIBUTE = XML3D_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__ANY = XML3D_ELEMENT__ANY;

	/**
	 * The feature id for the '<em><b>Field Of View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__FIELD_OF_VIEW = XML3D_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__ORIENTATION = XML3D_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__POSITION = XML3D_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE_FEATURE_COUNT = XML3D_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE_OPERATION_COUNT = XML3D_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.impl.Xml3dTypeImpl
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getXml3dType()
	 * @generated
	 */
	int XML3D_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__CLASS = XML3D_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ID = XML3D_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__STYLE = XML3D_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ANY_ATTRIBUTE = XML3D_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ANY = XML3D_ELEMENT__ANY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__CHILDREN = XML3D_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__DEFS = XML3D_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__MESH = XML3D_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__GROUP = XML3D_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__VIEW = XML3D_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__LIGHT = XML3D_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__SCRIPT = XML3D_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Active View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ACTIVE_VIEW = XML3D_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__HEIGHT = XML3D_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Onclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ONCLICK = XML3D_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ondblclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ONDBLCLICK = XML3D_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ondrop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ONDROP = XML3D_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Onkeydown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ONKEYDOWN = XML3D_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Onkeypress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ONKEYPRESS = XML3D_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Onkeyup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ONKEYUP = XML3D_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Onmousedown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ONMOUSEDOWN = XML3D_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Onmousemove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ONMOUSEMOVE = XML3D_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Onmouseout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ONMOUSEOUT = XML3D_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Onmouseover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ONMOUSEOVER = XML3D_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Onmouseup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__ONMOUSEUP = XML3D_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE__WIDTH = XML3D_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE_FEATURE_COUNT = XML3D_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML3D_TYPE_OPERATION_COUNT = XML3D_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.FilterTypes <em>Filter Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.FilterTypes
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFilterTypes()
	 * @generated
	 */
	int FILTER_TYPES = 25;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.MeshTypeNames <em>Mesh Type Names</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.MeshTypeNames
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getMeshTypeNames()
	 * @generated
	 */
	int MESH_TYPE_NAMES = 26;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.TextureTypes <em>Texture Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.TextureTypes
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getTextureTypes()
	 * @generated
	 */
	int TEXTURE_TYPES = 27;

	/**
	 * The meta object id for the '{@link org.xml3d._2009.xml3d.WrapTypes <em>Wrap Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.WrapTypes
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getWrapTypes()
	 * @generated
	 */
	int WRAP_TYPES = 28;

	/**
	 * The meta object id for the '<em>Boolean Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getBooleanArray()
	 * @generated
	 */
	int BOOLEAN_ARRAY = 29;

	/**
	 * The meta object id for the '<em>Content Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 30;

	/**
	 * The meta object id for the '<em>Filter Types Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.FilterTypes
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFilterTypesObject()
	 * @generated
	 */
	int FILTER_TYPES_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Float2 Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnu.trove.list.TFloatList
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat2Array()
	 * @generated
	 */
	int FLOAT2_ARRAY = 32;

	/**
	 * The meta object id for the '<em>Float3 Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnu.trove.list.TFloatList
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat3Array()
	 * @generated
	 */
	int FLOAT3_ARRAY = 33;

	/**
	 * The meta object id for the '<em>Float4 Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnu.trove.list.TFloatList
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat4Array()
	 * @generated
	 */
	int FLOAT4_ARRAY = 34;

	/**
	 * The meta object id for the '<em>Float4x4 Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnu.trove.list.TFloatList
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat4x4Array()
	 * @generated
	 */
	int FLOAT4X4_ARRAY = 35;

	/**
	 * The meta object id for the '<em>Float Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnu.trove.list.TFloatList
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloatArray()
	 * @generated
	 */
	int FLOAT_ARRAY = 36;

	/**
	 * The meta object id for the '<em>Int4 Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnu.trove.list.TIntList
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getInt4Array()
	 * @generated
	 */
	int INT4_ARRAY = 37;

	/**
	 * The meta object id for the '<em>Int Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnu.trove.list.TIntList
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getIntArray()
	 * @generated
	 */
	int INT_ARRAY = 38;

	/**
	 * The meta object id for the '<em>Mesh Type Names Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.MeshTypeNames
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getMeshTypeNamesObject()
	 * @generated
	 */
	int MESH_TYPE_NAMES_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Texture Types Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.TextureTypes
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getTextureTypesObject()
	 * @generated
	 */
	int TEXTURE_TYPES_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Wrap Types Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xml3d._2009.xml3d.WrapTypes
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getWrapTypesObject()
	 * @generated
	 */
	int WRAP_TYPES_OBJECT = 41;

	/**
	 * The meta object id for the '<em>XML3D Rotation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnu.trove.list.TFloatList
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getXML3DRotation()
	 * @generated
	 */
	int XML3D_ROTATION = 42;

	/**
	 * The meta object id for the '<em>XML3D Vec3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnu.trove.list.TFloatList
	 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getXML3DVec3()
	 * @generated
	 */
	int XML3D_VEC3 = 43;


	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.BoolType <em>Bool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Type</em>'.
	 * @see org.xml3d._2009.xml3d.BoolType
	 * @generated
	 */
	EClass getBoolType();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.BoolType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xml3d._2009.xml3d.BoolType#getValue()
	 * @see #getBoolType()
	 * @generated
	 */
	EAttribute getBoolType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.BoolType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xml3d._2009.xml3d.BoolType#getId()
	 * @see #getBoolType()
	 * @generated
	 */
	EAttribute getBoolType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.BoolType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xml3d._2009.xml3d.BoolType#getName()
	 * @see #getBoolType()
	 * @generated
	 */
	EAttribute getBoolType_Name();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.xml3d._2009.xml3d.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.DataType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map</em>'.
	 * @see org.xml3d._2009.xml3d.DataType#getMap()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Map();

	/**
	 * Returns the meta object for the reference '{@link org.xml3d._2009.xml3d.DataType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script</em>'.
	 * @see org.xml3d._2009.xml3d.DataType#getScript()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Script();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.DefsType <em>Defs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defs Type</em>'.
	 * @see org.xml3d._2009.xml3d.DefsType
	 * @generated
	 */
	EClass getDefsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.xml3d._2009.xml3d.DefsType#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Children</em>'.
	 * @see org.xml3d._2009.xml3d.DefsType#getChildren()
	 * @see #getDefsType()
	 * @generated
	 */
	EAttribute getDefsType_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.DefsType#getShader <em>Shader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shader</em>'.
	 * @see org.xml3d._2009.xml3d.DefsType#getShader()
	 * @see #getDefsType()
	 * @generated
	 */
	EReference getDefsType_Shader();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.DefsType#getLightshader <em>Lightshader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lightshader</em>'.
	 * @see org.xml3d._2009.xml3d.DefsType#getLightshader()
	 * @see #getDefsType()
	 * @generated
	 */
	EReference getDefsType_Lightshader();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.DefsType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.xml3d._2009.xml3d.DefsType#getData()
	 * @see #getDefsType()
	 * @generated
	 */
	EReference getDefsType_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.DefsType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform</em>'.
	 * @see org.xml3d._2009.xml3d.DefsType#getTransform()
	 * @see #getDefsType()
	 * @generated
	 */
	EReference getDefsType_Transform();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.DefsType#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mesh</em>'.
	 * @see org.xml3d._2009.xml3d.DefsType#getMesh()
	 * @see #getDefsType()
	 * @generated
	 */
	EReference getDefsType_Mesh();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.DefsType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see org.xml3d._2009.xml3d.DefsType#getScript()
	 * @see #getDefsType()
	 * @generated
	 */
	EReference getDefsType_Script();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.xml3d._2009.xml3d.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.xml3d._2009.xml3d.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.xml3d._2009.xml3d.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getBool()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Bool();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getDefs <em>Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defs</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getDefs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Defs();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getFloat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Float();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat2 <em>Float2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float2</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getFloat2()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Float2();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat3 <em>Float3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float3</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getFloat3()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Float3();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat4 <em>Float4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float4</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getFloat4()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Float4();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getFloat4x4 <em>Float4x4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float4x4</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getFloat4x4()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Float4x4();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Group();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Img</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getImg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Img();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getInt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Int();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getInt4 <em>Int4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int4</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getInt4()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Int4();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getLight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Light();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getLightshader <em>Lightshader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lightshader</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getLightshader()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Lightshader();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mesh</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getMesh()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mesh();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getScript()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Script();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getShader <em>Shader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shader</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getShader()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Shader();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Texture</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getTexture()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Texture();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getTransform()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transform();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getView()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_View();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.DocumentRoot#getXml3d <em>Xml3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml3d</em>'.
	 * @see org.xml3d._2009.xml3d.DocumentRoot#getXml3d()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Xml3d();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.Float2Type <em>Float2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float2 Type</em>'.
	 * @see org.xml3d._2009.xml3d.Float2Type
	 * @generated
	 */
	EClass getFloat2Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float2Type#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xml3d._2009.xml3d.Float2Type#getValue()
	 * @see #getFloat2Type()
	 * @generated
	 */
	EAttribute getFloat2Type_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float2Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xml3d._2009.xml3d.Float2Type#getId()
	 * @see #getFloat2Type()
	 * @generated
	 */
	EAttribute getFloat2Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float2Type#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.xml3d._2009.xml3d.Float2Type#getKey()
	 * @see #getFloat2Type()
	 * @generated
	 */
	EAttribute getFloat2Type_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float2Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xml3d._2009.xml3d.Float2Type#getName()
	 * @see #getFloat2Type()
	 * @generated
	 */
	EAttribute getFloat2Type_Name();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.Float3Type <em>Float3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float3 Type</em>'.
	 * @see org.xml3d._2009.xml3d.Float3Type
	 * @generated
	 */
	EClass getFloat3Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float3Type#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xml3d._2009.xml3d.Float3Type#getValue()
	 * @see #getFloat3Type()
	 * @generated
	 */
	EAttribute getFloat3Type_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float3Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xml3d._2009.xml3d.Float3Type#getId()
	 * @see #getFloat3Type()
	 * @generated
	 */
	EAttribute getFloat3Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float3Type#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.xml3d._2009.xml3d.Float3Type#getKey()
	 * @see #getFloat3Type()
	 * @generated
	 */
	EAttribute getFloat3Type_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float3Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xml3d._2009.xml3d.Float3Type#getName()
	 * @see #getFloat3Type()
	 * @generated
	 */
	EAttribute getFloat3Type_Name();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.Float4Type <em>Float4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float4 Type</em>'.
	 * @see org.xml3d._2009.xml3d.Float4Type
	 * @generated
	 */
	EClass getFloat4Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float4Type#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xml3d._2009.xml3d.Float4Type#getValue()
	 * @see #getFloat4Type()
	 * @generated
	 */
	EAttribute getFloat4Type_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float4Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xml3d._2009.xml3d.Float4Type#getId()
	 * @see #getFloat4Type()
	 * @generated
	 */
	EAttribute getFloat4Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float4Type#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.xml3d._2009.xml3d.Float4Type#getKey()
	 * @see #getFloat4Type()
	 * @generated
	 */
	EAttribute getFloat4Type_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float4Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xml3d._2009.xml3d.Float4Type#getName()
	 * @see #getFloat4Type()
	 * @generated
	 */
	EAttribute getFloat4Type_Name();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.Float4x4Type <em>Float4x4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float4x4 Type</em>'.
	 * @see org.xml3d._2009.xml3d.Float4x4Type
	 * @generated
	 */
	EClass getFloat4x4Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float4x4Type#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xml3d._2009.xml3d.Float4x4Type#getValue()
	 * @see #getFloat4x4Type()
	 * @generated
	 */
	EAttribute getFloat4x4Type_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float4x4Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xml3d._2009.xml3d.Float4x4Type#getId()
	 * @see #getFloat4x4Type()
	 * @generated
	 */
	EAttribute getFloat4x4Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float4x4Type#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.xml3d._2009.xml3d.Float4x4Type#getKey()
	 * @see #getFloat4x4Type()
	 * @generated
	 */
	EAttribute getFloat4x4Type_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Float4x4Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xml3d._2009.xml3d.Float4x4Type#getName()
	 * @see #getFloat4x4Type()
	 * @generated
	 */
	EAttribute getFloat4x4Type_Name();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see org.xml3d._2009.xml3d.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.FloatType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xml3d._2009.xml3d.FloatType#getValue()
	 * @see #getFloatType()
	 * @generated
	 */
	EAttribute getFloatType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.FloatType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xml3d._2009.xml3d.FloatType#getId()
	 * @see #getFloatType()
	 * @generated
	 */
	EAttribute getFloatType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.FloatType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.xml3d._2009.xml3d.FloatType#getKey()
	 * @see #getFloatType()
	 * @generated
	 */
	EAttribute getFloatType_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.FloatType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xml3d._2009.xml3d.FloatType#getName()
	 * @see #getFloatType()
	 * @generated
	 */
	EAttribute getFloatType_Name();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Type</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType
	 * @generated
	 */
	EClass getGroupType();

	/**
	 * Returns the meta object for the attribute list '{@link org.xml3d._2009.xml3d.GroupType#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Children</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getChildren()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.GroupType#getDefs <em>Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defs</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getDefs()
	 * @see #getGroupType()
	 * @generated
	 */
	EReference getGroupType_Defs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.GroupType#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mesh</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getMesh()
	 * @see #getGroupType()
	 * @generated
	 */
	EReference getGroupType_Mesh();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.GroupType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getGroup()
	 * @see #getGroupType()
	 * @generated
	 */
	EReference getGroupType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.GroupType#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getView()
	 * @see #getGroupType()
	 * @generated
	 */
	EReference getGroupType_View();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.GroupType#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Light</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getLight()
	 * @see #getGroupType()
	 * @generated
	 */
	EReference getGroupType_Light();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.GroupType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getScript()
	 * @see #getGroupType()
	 * @generated
	 */
	EReference getGroupType_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#getOnclick <em>Onclick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onclick</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getOnclick()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Onclick();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#getOndblclick <em>Ondblclick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ondblclick</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getOndblclick()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Ondblclick();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#getOndrop <em>Ondrop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ondrop</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getOndrop()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Ondrop();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#getOnkeydown <em>Onkeydown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onkeydown</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getOnkeydown()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Onkeydown();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#getOnkeypress <em>Onkeypress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onkeypress</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getOnkeypress()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Onkeypress();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#getOnkeyup <em>Onkeyup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onkeyup</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getOnkeyup()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Onkeyup();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#getOnmousedown <em>Onmousedown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmousedown</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getOnmousedown()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Onmousedown();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#getOnmousemove <em>Onmousemove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmousemove</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getOnmousemove()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Onmousemove();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#getOnmouseout <em>Onmouseout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmouseout</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getOnmouseout()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Onmouseout();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#getOnmouseover <em>Onmouseover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmouseover</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getOnmouseover()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Onmouseover();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#getOnmouseup <em>Onmouseup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmouseup</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getOnmouseup()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Onmouseup();

	/**
	 * Returns the meta object for the reference '{@link org.xml3d._2009.xml3d.GroupType#getShader <em>Shader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shader</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getShader()
	 * @see #getGroupType()
	 * @generated
	 */
	EReference getGroupType_Shader();

	/**
	 * Returns the meta object for the reference '{@link org.xml3d._2009.xml3d.GroupType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#getTransform()
	 * @see #getGroupType()
	 * @generated
	 */
	EReference getGroupType_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.GroupType#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.xml3d._2009.xml3d.GroupType#isVisible()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Visible();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.HTMLElement <em>HTML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Element</em>'.
	 * @see org.xml3d._2009.xml3d.HTMLElement
	 * @generated
	 */
	EClass getHTMLElement();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.HTMLElement#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.xml3d._2009.xml3d.HTMLElement#getClass_()
	 * @see #getHTMLElement()
	 * @generated
	 */
	EAttribute getHTMLElement_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.HTMLElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xml3d._2009.xml3d.HTMLElement#getId()
	 * @see #getHTMLElement()
	 * @generated
	 */
	EAttribute getHTMLElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.HTMLElement#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.xml3d._2009.xml3d.HTMLElement#getStyle()
	 * @see #getHTMLElement()
	 * @generated
	 */
	EAttribute getHTMLElement_Style();

	/**
	 * Returns the meta object for the attribute list '{@link org.xml3d._2009.xml3d.HTMLElement#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xml3d._2009.xml3d.HTMLElement#getAnyAttribute()
	 * @see #getHTMLElement()
	 * @generated
	 */
	EAttribute getHTMLElement_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.ImgType <em>Img Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Img Type</em>'.
	 * @see org.xml3d._2009.xml3d.ImgType
	 * @generated
	 */
	EClass getImgType();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.ImgType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.xml3d._2009.xml3d.ImgType#getSrc()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Src();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.Int4Type <em>Int4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int4 Type</em>'.
	 * @see org.xml3d._2009.xml3d.Int4Type
	 * @generated
	 */
	EClass getInt4Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Int4Type#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xml3d._2009.xml3d.Int4Type#getValue()
	 * @see #getInt4Type()
	 * @generated
	 */
	EAttribute getInt4Type_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Int4Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xml3d._2009.xml3d.Int4Type#getId()
	 * @see #getInt4Type()
	 * @generated
	 */
	EAttribute getInt4Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Int4Type#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.xml3d._2009.xml3d.Int4Type#getKey()
	 * @see #getInt4Type()
	 * @generated
	 */
	EAttribute getInt4Type_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Int4Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xml3d._2009.xml3d.Int4Type#getName()
	 * @see #getInt4Type()
	 * @generated
	 */
	EAttribute getInt4Type_Name();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.IntType <em>Int Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Type</em>'.
	 * @see org.xml3d._2009.xml3d.IntType
	 * @generated
	 */
	EClass getIntType();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.IntType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xml3d._2009.xml3d.IntType#getValue()
	 * @see #getIntType()
	 * @generated
	 */
	EAttribute getIntType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.IntType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xml3d._2009.xml3d.IntType#getId()
	 * @see #getIntType()
	 * @generated
	 */
	EAttribute getIntType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.IntType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.xml3d._2009.xml3d.IntType#getKey()
	 * @see #getIntType()
	 * @generated
	 */
	EAttribute getIntType_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.IntType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xml3d._2009.xml3d.IntType#getName()
	 * @see #getIntType()
	 * @generated
	 */
	EAttribute getIntType_Name();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.LightShaderType <em>Light Shader Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Shader Type</em>'.
	 * @see org.xml3d._2009.xml3d.LightShaderType
	 * @generated
	 */
	EClass getLightShaderType();

	/**
	 * Returns the meta object for the reference '{@link org.xml3d._2009.xml3d.LightShaderType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script</em>'.
	 * @see org.xml3d._2009.xml3d.LightShaderType#getScript()
	 * @see #getLightShaderType()
	 * @generated
	 */
	EReference getLightShaderType_Script();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.LightType <em>Light Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Type</em>'.
	 * @see org.xml3d._2009.xml3d.LightType
	 * @generated
	 */
	EClass getLightType();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.LightType#isGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global</em>'.
	 * @see org.xml3d._2009.xml3d.LightType#isGlobal()
	 * @see #getLightType()
	 * @generated
	 */
	EAttribute getLightType_Global();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.LightType#getIntensity <em>Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intensity</em>'.
	 * @see org.xml3d._2009.xml3d.LightType#getIntensity()
	 * @see #getLightType()
	 * @generated
	 */
	EAttribute getLightType_Intensity();

	/**
	 * Returns the meta object for the reference '{@link org.xml3d._2009.xml3d.LightType#getShader <em>Shader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shader</em>'.
	 * @see org.xml3d._2009.xml3d.LightType#getShader()
	 * @see #getLightType()
	 * @generated
	 */
	EReference getLightType_Shader();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.LightType#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.xml3d._2009.xml3d.LightType#isVisible()
	 * @see #getLightType()
	 * @generated
	 */
	EAttribute getLightType_Visible();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.MeshType <em>Mesh Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Type</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType
	 * @generated
	 */
	EClass getMeshType();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getOnclick <em>Onclick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onclick</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getOnclick()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Onclick();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getOndblclick <em>Ondblclick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ondblclick</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getOndblclick()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Ondblclick();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getOndrop <em>Ondrop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ondrop</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getOndrop()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Ondrop();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getOnkeydown <em>Onkeydown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onkeydown</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getOnkeydown()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Onkeydown();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getOnkeypress <em>Onkeypress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onkeypress</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getOnkeypress()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Onkeypress();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getOnkeyup <em>Onkeyup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onkeyup</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getOnkeyup()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Onkeyup();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getOnmousedown <em>Onmousedown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmousedown</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getOnmousedown()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Onmousedown();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getOnmousemove <em>Onmousemove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmousemove</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getOnmousemove()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Onmousemove();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getOnmouseout <em>Onmouseout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmouseout</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getOnmouseout()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Onmouseout();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getOnmouseover <em>Onmouseover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmouseover</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getOnmouseover()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Onmouseover();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getOnmouseup <em>Onmouseup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmouseup</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getOnmouseup()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Onmouseup();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#getType()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.MeshType#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.xml3d._2009.xml3d.MeshType#isVisible()
	 * @see #getMeshType()
	 * @generated
	 */
	EAttribute getMeshType_Visible();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Type</em>'.
	 * @see org.xml3d._2009.xml3d.ScriptType
	 * @generated
	 */
	EClass getScriptType();

	/**
	 * Returns the meta object for the attribute list '{@link org.xml3d._2009.xml3d.ScriptType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.xml3d._2009.xml3d.ScriptType#getMixed()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.ScriptType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.xml3d._2009.xml3d.ScriptType#getSrc()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.ScriptType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xml3d._2009.xml3d.ScriptType#getType()
	 * @see #getScriptType()
	 * @generated
	 */
	EAttribute getScriptType_Type();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.ShaderType <em>Shader Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shader Type</em>'.
	 * @see org.xml3d._2009.xml3d.ShaderType
	 * @generated
	 */
	EClass getShaderType();

	/**
	 * Returns the meta object for the reference '{@link org.xml3d._2009.xml3d.ShaderType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script</em>'.
	 * @see org.xml3d._2009.xml3d.ShaderType#getScript()
	 * @see #getShaderType()
	 * @generated
	 */
	EReference getShaderType_Script();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.TextureType <em>Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texture Type</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType
	 * @generated
	 */
	EClass getTextureType();

	/**
	 * Returns the meta object for the containment reference '{@link org.xml3d._2009.xml3d.TextureType#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Img</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getImg()
	 * @see #getTextureType()
	 * @generated
	 */
	EReference getTextureType_Img();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TextureType#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getBorderColor()
	 * @see #getTextureType()
	 * @generated
	 */
	EAttribute getTextureType_BorderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TextureType#getFilterMag <em>Filter Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Mag</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getFilterMag()
	 * @see #getTextureType()
	 * @generated
	 */
	EAttribute getTextureType_FilterMag();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TextureType#getFilterMin <em>Filter Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Min</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getFilterMin()
	 * @see #getTextureType()
	 * @generated
	 */
	EAttribute getTextureType_FilterMin();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TextureType#getFilterMip <em>Filter Mip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Mip</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getFilterMip()
	 * @see #getTextureType()
	 * @generated
	 */
	EAttribute getTextureType_FilterMip();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TextureType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getId()
	 * @see #getTextureType()
	 * @generated
	 */
	EAttribute getTextureType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TextureType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getKey()
	 * @see #getTextureType()
	 * @generated
	 */
	EAttribute getTextureType_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TextureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getName()
	 * @see #getTextureType()
	 * @generated
	 */
	EAttribute getTextureType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TextureType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getType()
	 * @see #getTextureType()
	 * @generated
	 */
	EAttribute getTextureType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TextureType#getWrapS <em>Wrap S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap S</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getWrapS()
	 * @see #getTextureType()
	 * @generated
	 */
	EAttribute getTextureType_WrapS();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TextureType#getWrapT <em>Wrap T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap T</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getWrapT()
	 * @see #getTextureType()
	 * @generated
	 */
	EAttribute getTextureType_WrapT();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TextureType#getWrapU <em>Wrap U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap U</em>'.
	 * @see org.xml3d._2009.xml3d.TextureType#getWrapU()
	 * @see #getTextureType()
	 * @generated
	 */
	EAttribute getTextureType_WrapU();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.TransformType <em>Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Type</em>'.
	 * @see org.xml3d._2009.xml3d.TransformType
	 * @generated
	 */
	EClass getTransformType();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TransformType#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center</em>'.
	 * @see org.xml3d._2009.xml3d.TransformType#getCenter()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_Center();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TransformType#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see org.xml3d._2009.xml3d.TransformType#getRotation()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TransformType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.xml3d._2009.xml3d.TransformType#getScale()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TransformType#getScaleOrientation <em>Scale Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Orientation</em>'.
	 * @see org.xml3d._2009.xml3d.TransformType#getScaleOrientation()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_ScaleOrientation();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.TransformType#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translation</em>'.
	 * @see org.xml3d._2009.xml3d.TransformType#getTranslation()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_Translation();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.ViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Type</em>'.
	 * @see org.xml3d._2009.xml3d.ViewType
	 * @generated
	 */
	EClass getViewType();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.ViewType#getFieldOfView <em>Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Of View</em>'.
	 * @see org.xml3d._2009.xml3d.ViewType#getFieldOfView()
	 * @see #getViewType()
	 * @generated
	 */
	EAttribute getViewType_FieldOfView();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.ViewType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.xml3d._2009.xml3d.ViewType#getOrientation()
	 * @see #getViewType()
	 * @generated
	 */
	EAttribute getViewType_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.ViewType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.xml3d._2009.xml3d.ViewType#getPosition()
	 * @see #getViewType()
	 * @generated
	 */
	EAttribute getViewType_Position();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.XML3DDataContainer <em>XML3D Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML3D Data Container</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer
	 * @generated
	 */
	EClass getXML3DDataContainer();

	/**
	 * Returns the meta object for the attribute list '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Children</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getChildren()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EAttribute getXML3DDataContainer_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getData()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getBool()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Bool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getFloat()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Float();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getFloat2 <em>Float2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float2</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getFloat2()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Float2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getFloat3 <em>Float3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float3</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getFloat3()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Float3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getFloat4 <em>Float4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float4</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getFloat4()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Float4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getFloat4x4 <em>Float4x4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float4x4</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getFloat4x4()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Float4x4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Int</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getInt()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Int();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getInt4 <em>Int4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Int4</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getInt4()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Int4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Texture</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getTexture()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Texture();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getCompute <em>Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compute</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getCompute()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EAttribute getXML3DDataContainer_Compute();

	/**
	 * Returns the meta object for the reference '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getProto <em>Proto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proto</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getProto()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Proto();

	/**
	 * Returns the meta object for the reference '{@link org.xml3d._2009.xml3d.XML3DDataContainer#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DDataContainer#getSrc()
	 * @see #getXML3DDataContainer()
	 * @generated
	 */
	EReference getXML3DDataContainer_Src();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.XML3DElement <em>XML3D Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML3D Element</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DElement
	 * @generated
	 */
	EClass getXML3DElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.xml3d._2009.xml3d.XML3DElement#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xml3d._2009.xml3d.XML3DElement#getAny()
	 * @see #getXML3DElement()
	 * @generated
	 */
	EAttribute getXML3DElement_Any();

	/**
	 * Returns the meta object for class '{@link org.xml3d._2009.xml3d.Xml3dType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType
	 * @generated
	 */
	EClass getXml3dType();

	/**
	 * Returns the meta object for the attribute list '{@link org.xml3d._2009.xml3d.Xml3dType#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Children</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getChildren()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.Xml3dType#getDefs <em>Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defs</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getDefs()
	 * @see #getXml3dType()
	 * @generated
	 */
	EReference getXml3dType_Defs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.Xml3dType#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mesh</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getMesh()
	 * @see #getXml3dType()
	 * @generated
	 */
	EReference getXml3dType_Mesh();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.Xml3dType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getGroup()
	 * @see #getXml3dType()
	 * @generated
	 */
	EReference getXml3dType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.Xml3dType#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getView()
	 * @see #getXml3dType()
	 * @generated
	 */
	EReference getXml3dType_View();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.Xml3dType#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Light</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getLight()
	 * @see #getXml3dType()
	 * @generated
	 */
	EReference getXml3dType_Light();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xml3d._2009.xml3d.Xml3dType#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getScript()
	 * @see #getXml3dType()
	 * @generated
	 */
	EReference getXml3dType_Script();

	/**
	 * Returns the meta object for the reference '{@link org.xml3d._2009.xml3d.Xml3dType#getActiveView <em>Active View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active View</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getActiveView()
	 * @see #getXml3dType()
	 * @generated
	 */
	EReference getXml3dType_ActiveView();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getHeight()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getOnclick <em>Onclick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onclick</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getOnclick()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Onclick();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getOndblclick <em>Ondblclick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ondblclick</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getOndblclick()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Ondblclick();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getOndrop <em>Ondrop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ondrop</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getOndrop()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Ondrop();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getOnkeydown <em>Onkeydown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onkeydown</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getOnkeydown()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Onkeydown();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getOnkeypress <em>Onkeypress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onkeypress</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getOnkeypress()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Onkeypress();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getOnkeyup <em>Onkeyup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onkeyup</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getOnkeyup()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Onkeyup();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getOnmousedown <em>Onmousedown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmousedown</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getOnmousedown()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Onmousedown();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getOnmousemove <em>Onmousemove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmousemove</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getOnmousemove()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Onmousemove();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getOnmouseout <em>Onmouseout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmouseout</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getOnmouseout()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Onmouseout();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getOnmouseover <em>Onmouseover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmouseover</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getOnmouseover()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Onmouseover();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getOnmouseup <em>Onmouseup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onmouseup</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getOnmouseup()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Onmouseup();

	/**
	 * Returns the meta object for the attribute '{@link org.xml3d._2009.xml3d.Xml3dType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.xml3d._2009.xml3d.Xml3dType#getWidth()
	 * @see #getXml3dType()
	 * @generated
	 */
	EAttribute getXml3dType_Width();

	/**
	 * Returns the meta object for enum '{@link org.xml3d._2009.xml3d.FilterTypes <em>Filter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Types</em>'.
	 * @see org.xml3d._2009.xml3d.FilterTypes
	 * @generated
	 */
	EEnum getFilterTypes();

	/**
	 * Returns the meta object for enum '{@link org.xml3d._2009.xml3d.MeshTypeNames <em>Mesh Type Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mesh Type Names</em>'.
	 * @see org.xml3d._2009.xml3d.MeshTypeNames
	 * @generated
	 */
	EEnum getMeshTypeNames();

	/**
	 * Returns the meta object for enum '{@link org.xml3d._2009.xml3d.TextureTypes <em>Texture Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Types</em>'.
	 * @see org.xml3d._2009.xml3d.TextureTypes
	 * @generated
	 */
	EEnum getTextureTypes();

	/**
	 * Returns the meta object for enum '{@link org.xml3d._2009.xml3d.WrapTypes <em>Wrap Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wrap Types</em>'.
	 * @see org.xml3d._2009.xml3d.WrapTypes
	 * @generated
	 */
	EEnum getWrapTypes();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Boolean Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Array</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='BooleanArray' itemType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getBooleanArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Content Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ContentType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getContentType();

	/**
	 * Returns the meta object for data type '{@link org.xml3d._2009.xml3d.FilterTypes <em>Filter Types Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Filter Types Object</em>'.
	 * @see org.xml3d._2009.xml3d.FilterTypes
	 * @model instanceClass="org.xml3d._2009.xml3d.FilterTypes"
	 *        extendedMetaData="name='FilterTypes:Object' baseType='FilterTypes'"
	 * @generated
	 */
	EDataType getFilterTypesObject();

	/**
	 * Returns the meta object for data type '{@link gnu.trove.list.TFloatList <em>Float2 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float2 Array</em>'.
	 * @see gnu.trove.list.TFloatList
	 * @model instanceClass="gnu.trove.list.TFloatList"
	 *        extendedMetaData="name='Float2Array'"
	 * @generated
	 */
	EDataType getFloat2Array();

	/**
	 * Returns the meta object for data type '{@link gnu.trove.list.TFloatList <em>Float3 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float3 Array</em>'.
	 * @see gnu.trove.list.TFloatList
	 * @model instanceClass="gnu.trove.list.TFloatList"
	 *        extendedMetaData="name='Float3Array'"
	 * @generated
	 */
	EDataType getFloat3Array();

	/**
	 * Returns the meta object for data type '{@link gnu.trove.list.TFloatList <em>Float4 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float4 Array</em>'.
	 * @see gnu.trove.list.TFloatList
	 * @model instanceClass="gnu.trove.list.TFloatList"
	 *        extendedMetaData="name='Float4Array'"
	 * @generated
	 */
	EDataType getFloat4Array();

	/**
	 * Returns the meta object for data type '{@link gnu.trove.list.TFloatList <em>Float4x4 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float4x4 Array</em>'.
	 * @see gnu.trove.list.TFloatList
	 * @model instanceClass="gnu.trove.list.TFloatList"
	 *        extendedMetaData="name='Float4x4Array'"
	 * @generated
	 */
	EDataType getFloat4x4Array();

	/**
	 * Returns the meta object for data type '{@link gnu.trove.list.TFloatList <em>Float Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float Array</em>'.
	 * @see gnu.trove.list.TFloatList
	 * @model instanceClass="gnu.trove.list.TFloatList"
	 *        extendedMetaData="name='FloatArray'"
	 * @generated
	 */
	EDataType getFloatArray();

	/**
	 * Returns the meta object for data type '{@link gnu.trove.list.TIntList <em>Int4 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int4 Array</em>'.
	 * @see gnu.trove.list.TIntList
	 * @model instanceClass="gnu.trove.list.TIntList"
	 *        extendedMetaData="name='Int4Array'"
	 * @generated
	 */
	EDataType getInt4Array();

	/**
	 * Returns the meta object for data type '{@link gnu.trove.list.TIntList <em>Int Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int Array</em>'.
	 * @see gnu.trove.list.TIntList
	 * @model instanceClass="gnu.trove.list.TIntList"
	 *        extendedMetaData="name='IntArray'"
	 * @generated
	 */
	EDataType getIntArray();

	/**
	 * Returns the meta object for data type '{@link org.xml3d._2009.xml3d.MeshTypeNames <em>Mesh Type Names Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mesh Type Names Object</em>'.
	 * @see org.xml3d._2009.xml3d.MeshTypeNames
	 * @model instanceClass="org.xml3d._2009.xml3d.MeshTypeNames"
	 *        extendedMetaData="name='MeshTypeNames:Object' baseType='MeshTypeNames'"
	 * @generated
	 */
	EDataType getMeshTypeNamesObject();

	/**
	 * Returns the meta object for data type '{@link org.xml3d._2009.xml3d.TextureTypes <em>Texture Types Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Texture Types Object</em>'.
	 * @see org.xml3d._2009.xml3d.TextureTypes
	 * @model instanceClass="org.xml3d._2009.xml3d.TextureTypes"
	 *        extendedMetaData="name='TextureTypes:Object' baseType='TextureTypes'"
	 * @generated
	 */
	EDataType getTextureTypesObject();

	/**
	 * Returns the meta object for data type '{@link org.xml3d._2009.xml3d.WrapTypes <em>Wrap Types Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wrap Types Object</em>'.
	 * @see org.xml3d._2009.xml3d.WrapTypes
	 * @model instanceClass="org.xml3d._2009.xml3d.WrapTypes"
	 *        extendedMetaData="name='WrapTypes:Object' baseType='WrapTypes'"
	 * @generated
	 */
	EDataType getWrapTypesObject();

	/**
	 * Returns the meta object for data type '{@link gnu.trove.list.TFloatList <em>XML3D Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XML3D Rotation</em>'.
	 * @see gnu.trove.list.TFloatList
	 * @model instanceClass="gnu.trove.list.TFloatList"
	 *        extendedMetaData="name='XML3DRotation'"
	 * @generated
	 */
	EDataType getXML3DRotation();

	/**
	 * Returns the meta object for data type '{@link gnu.trove.list.TFloatList <em>XML3D Vec3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XML3D Vec3</em>'.
	 * @see gnu.trove.list.TFloatList
	 * @model instanceClass="gnu.trove.list.TFloatList"
	 *        extendedMetaData="name='XML3DVec3'"
	 * @generated
	 */
	EDataType getXML3DVec3();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Xml3dFactory getXml3dFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.BoolTypeImpl <em>Bool Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.BoolTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getBoolType()
		 * @generated
		 */
		EClass BOOL_TYPE = eINSTANCE.getBoolType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_TYPE__VALUE = eINSTANCE.getBoolType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_TYPE__ID = eINSTANCE.getBoolType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_TYPE__NAME = eINSTANCE.getBoolType_Name();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.DataTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__MAP = eINSTANCE.getDataType_Map();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__SCRIPT = eINSTANCE.getDataType_Script();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.DefsTypeImpl <em>Defs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.DefsTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getDefsType()
		 * @generated
		 */
		EClass DEFS_TYPE = eINSTANCE.getDefsType();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFS_TYPE__CHILDREN = eINSTANCE.getDefsType_Children();

		/**
		 * The meta object literal for the '<em><b>Shader</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFS_TYPE__SHADER = eINSTANCE.getDefsType_Shader();

		/**
		 * The meta object literal for the '<em><b>Lightshader</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFS_TYPE__LIGHTSHADER = eINSTANCE.getDefsType_Lightshader();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFS_TYPE__DATA = eINSTANCE.getDefsType_Data();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFS_TYPE__TRANSFORM = eINSTANCE.getDefsType_Transform();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFS_TYPE__MESH = eINSTANCE.getDefsType_Mesh();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFS_TYPE__SCRIPT = eINSTANCE.getDefsType_Script();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.DocumentRootImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Bool</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOL = eINSTANCE.getDocumentRoot_Bool();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATA = eINSTANCE.getDocumentRoot_Data();

		/**
		 * The meta object literal for the '<em><b>Defs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEFS = eINSTANCE.getDocumentRoot_Defs();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLOAT = eINSTANCE.getDocumentRoot_Float();

		/**
		 * The meta object literal for the '<em><b>Float2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLOAT2 = eINSTANCE.getDocumentRoot_Float2();

		/**
		 * The meta object literal for the '<em><b>Float3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLOAT3 = eINSTANCE.getDocumentRoot_Float3();

		/**
		 * The meta object literal for the '<em><b>Float4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLOAT4 = eINSTANCE.getDocumentRoot_Float4();

		/**
		 * The meta object literal for the '<em><b>Float4x4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLOAT4X4 = eINSTANCE.getDocumentRoot_Float4x4();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GROUP = eINSTANCE.getDocumentRoot_Group();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMG = eINSTANCE.getDocumentRoot_Img();

		/**
		 * The meta object literal for the '<em><b>Int</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INT = eINSTANCE.getDocumentRoot_Int();

		/**
		 * The meta object literal for the '<em><b>Int4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INT4 = eINSTANCE.getDocumentRoot_Int4();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIGHT = eINSTANCE.getDocumentRoot_Light();

		/**
		 * The meta object literal for the '<em><b>Lightshader</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIGHTSHADER = eINSTANCE.getDocumentRoot_Lightshader();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MESH = eINSTANCE.getDocumentRoot_Mesh();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCRIPT = eINSTANCE.getDocumentRoot_Script();

		/**
		 * The meta object literal for the '<em><b>Shader</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHADER = eINSTANCE.getDocumentRoot_Shader();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEXTURE = eINSTANCE.getDocumentRoot_Texture();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORM = eINSTANCE.getDocumentRoot_Transform();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VIEW = eINSTANCE.getDocumentRoot_View();

		/**
		 * The meta object literal for the '<em><b>Xml3d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XML3D = eINSTANCE.getDocumentRoot_Xml3d();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.Float2TypeImpl <em>Float2 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.Float2TypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat2Type()
		 * @generated
		 */
		EClass FLOAT2_TYPE = eINSTANCE.getFloat2Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT2_TYPE__VALUE = eINSTANCE.getFloat2Type_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT2_TYPE__ID = eINSTANCE.getFloat2Type_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT2_TYPE__KEY = eINSTANCE.getFloat2Type_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT2_TYPE__NAME = eINSTANCE.getFloat2Type_Name();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.Float3TypeImpl <em>Float3 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.Float3TypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat3Type()
		 * @generated
		 */
		EClass FLOAT3_TYPE = eINSTANCE.getFloat3Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT3_TYPE__VALUE = eINSTANCE.getFloat3Type_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT3_TYPE__ID = eINSTANCE.getFloat3Type_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT3_TYPE__KEY = eINSTANCE.getFloat3Type_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT3_TYPE__NAME = eINSTANCE.getFloat3Type_Name();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.Float4TypeImpl <em>Float4 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.Float4TypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat4Type()
		 * @generated
		 */
		EClass FLOAT4_TYPE = eINSTANCE.getFloat4Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT4_TYPE__VALUE = eINSTANCE.getFloat4Type_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT4_TYPE__ID = eINSTANCE.getFloat4Type_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT4_TYPE__KEY = eINSTANCE.getFloat4Type_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT4_TYPE__NAME = eINSTANCE.getFloat4Type_Name();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.Float4x4TypeImpl <em>Float4x4 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.Float4x4TypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat4x4Type()
		 * @generated
		 */
		EClass FLOAT4X4_TYPE = eINSTANCE.getFloat4x4Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT4X4_TYPE__VALUE = eINSTANCE.getFloat4x4Type_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT4X4_TYPE__ID = eINSTANCE.getFloat4x4Type_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT4X4_TYPE__KEY = eINSTANCE.getFloat4x4Type_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT4X4_TYPE__NAME = eINSTANCE.getFloat4x4Type_Name();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.FloatTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloatType()
		 * @generated
		 */
		EClass FLOAT_TYPE = eINSTANCE.getFloatType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_TYPE__VALUE = eINSTANCE.getFloatType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_TYPE__ID = eINSTANCE.getFloatType_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_TYPE__KEY = eINSTANCE.getFloatType_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_TYPE__NAME = eINSTANCE.getFloatType_Name();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.GroupTypeImpl <em>Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.GroupTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getGroupType()
		 * @generated
		 */
		EClass GROUP_TYPE = eINSTANCE.getGroupType();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__CHILDREN = eINSTANCE.getGroupType_Children();

		/**
		 * The meta object literal for the '<em><b>Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE__DEFS = eINSTANCE.getGroupType_Defs();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE__MESH = eINSTANCE.getGroupType_Mesh();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE__GROUP = eINSTANCE.getGroupType_Group();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE__VIEW = eINSTANCE.getGroupType_View();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE__LIGHT = eINSTANCE.getGroupType_Light();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE__SCRIPT = eINSTANCE.getGroupType_Script();

		/**
		 * The meta object literal for the '<em><b>Onclick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__ONCLICK = eINSTANCE.getGroupType_Onclick();

		/**
		 * The meta object literal for the '<em><b>Ondblclick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__ONDBLCLICK = eINSTANCE.getGroupType_Ondblclick();

		/**
		 * The meta object literal for the '<em><b>Ondrop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__ONDROP = eINSTANCE.getGroupType_Ondrop();

		/**
		 * The meta object literal for the '<em><b>Onkeydown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__ONKEYDOWN = eINSTANCE.getGroupType_Onkeydown();

		/**
		 * The meta object literal for the '<em><b>Onkeypress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__ONKEYPRESS = eINSTANCE.getGroupType_Onkeypress();

		/**
		 * The meta object literal for the '<em><b>Onkeyup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__ONKEYUP = eINSTANCE.getGroupType_Onkeyup();

		/**
		 * The meta object literal for the '<em><b>Onmousedown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__ONMOUSEDOWN = eINSTANCE.getGroupType_Onmousedown();

		/**
		 * The meta object literal for the '<em><b>Onmousemove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__ONMOUSEMOVE = eINSTANCE.getGroupType_Onmousemove();

		/**
		 * The meta object literal for the '<em><b>Onmouseout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__ONMOUSEOUT = eINSTANCE.getGroupType_Onmouseout();

		/**
		 * The meta object literal for the '<em><b>Onmouseover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__ONMOUSEOVER = eINSTANCE.getGroupType_Onmouseover();

		/**
		 * The meta object literal for the '<em><b>Onmouseup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__ONMOUSEUP = eINSTANCE.getGroupType_Onmouseup();

		/**
		 * The meta object literal for the '<em><b>Shader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE__SHADER = eINSTANCE.getGroupType_Shader();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE__TRANSFORM = eINSTANCE.getGroupType_Transform();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__VISIBLE = eINSTANCE.getGroupType_Visible();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.HTMLElementImpl <em>HTML Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.HTMLElementImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getHTMLElement()
		 * @generated
		 */
		EClass HTML_ELEMENT = eINSTANCE.getHTMLElement();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__CLASS = eINSTANCE.getHTMLElement_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__ID = eINSTANCE.getHTMLElement_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__STYLE = eINSTANCE.getHTMLElement_Style();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__ANY_ATTRIBUTE = eINSTANCE.getHTMLElement_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.ImgTypeImpl <em>Img Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.ImgTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getImgType()
		 * @generated
		 */
		EClass IMG_TYPE = eINSTANCE.getImgType();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__SRC = eINSTANCE.getImgType_Src();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.Int4TypeImpl <em>Int4 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.Int4TypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getInt4Type()
		 * @generated
		 */
		EClass INT4_TYPE = eINSTANCE.getInt4Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT4_TYPE__VALUE = eINSTANCE.getInt4Type_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT4_TYPE__ID = eINSTANCE.getInt4Type_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT4_TYPE__KEY = eINSTANCE.getInt4Type_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT4_TYPE__NAME = eINSTANCE.getInt4Type_Name();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.IntTypeImpl <em>Int Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.IntTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getIntType()
		 * @generated
		 */
		EClass INT_TYPE = eINSTANCE.getIntType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_TYPE__VALUE = eINSTANCE.getIntType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_TYPE__ID = eINSTANCE.getIntType_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_TYPE__KEY = eINSTANCE.getIntType_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_TYPE__NAME = eINSTANCE.getIntType_Name();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.LightShaderTypeImpl <em>Light Shader Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.LightShaderTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getLightShaderType()
		 * @generated
		 */
		EClass LIGHT_SHADER_TYPE = eINSTANCE.getLightShaderType();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGHT_SHADER_TYPE__SCRIPT = eINSTANCE.getLightShaderType_Script();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.LightTypeImpl <em>Light Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.LightTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getLightType()
		 * @generated
		 */
		EClass LIGHT_TYPE = eINSTANCE.getLightType();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT_TYPE__GLOBAL = eINSTANCE.getLightType_Global();

		/**
		 * The meta object literal for the '<em><b>Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT_TYPE__INTENSITY = eINSTANCE.getLightType_Intensity();

		/**
		 * The meta object literal for the '<em><b>Shader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGHT_TYPE__SHADER = eINSTANCE.getLightType_Shader();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT_TYPE__VISIBLE = eINSTANCE.getLightType_Visible();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.MeshTypeImpl <em>Mesh Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.MeshTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getMeshType()
		 * @generated
		 */
		EClass MESH_TYPE = eINSTANCE.getMeshType();

		/**
		 * The meta object literal for the '<em><b>Onclick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__ONCLICK = eINSTANCE.getMeshType_Onclick();

		/**
		 * The meta object literal for the '<em><b>Ondblclick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__ONDBLCLICK = eINSTANCE.getMeshType_Ondblclick();

		/**
		 * The meta object literal for the '<em><b>Ondrop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__ONDROP = eINSTANCE.getMeshType_Ondrop();

		/**
		 * The meta object literal for the '<em><b>Onkeydown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__ONKEYDOWN = eINSTANCE.getMeshType_Onkeydown();

		/**
		 * The meta object literal for the '<em><b>Onkeypress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__ONKEYPRESS = eINSTANCE.getMeshType_Onkeypress();

		/**
		 * The meta object literal for the '<em><b>Onkeyup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__ONKEYUP = eINSTANCE.getMeshType_Onkeyup();

		/**
		 * The meta object literal for the '<em><b>Onmousedown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__ONMOUSEDOWN = eINSTANCE.getMeshType_Onmousedown();

		/**
		 * The meta object literal for the '<em><b>Onmousemove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__ONMOUSEMOVE = eINSTANCE.getMeshType_Onmousemove();

		/**
		 * The meta object literal for the '<em><b>Onmouseout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__ONMOUSEOUT = eINSTANCE.getMeshType_Onmouseout();

		/**
		 * The meta object literal for the '<em><b>Onmouseover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__ONMOUSEOVER = eINSTANCE.getMeshType_Onmouseover();

		/**
		 * The meta object literal for the '<em><b>Onmouseup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__ONMOUSEUP = eINSTANCE.getMeshType_Onmouseup();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__TYPE = eINSTANCE.getMeshType_Type();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_TYPE__VISIBLE = eINSTANCE.getMeshType_Visible();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.ScriptTypeImpl <em>Script Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.ScriptTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getScriptType()
		 * @generated
		 */
		EClass SCRIPT_TYPE = eINSTANCE.getScriptType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__MIXED = eINSTANCE.getScriptType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__SRC = eINSTANCE.getScriptType_Src();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TYPE__TYPE = eINSTANCE.getScriptType_Type();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.ShaderTypeImpl <em>Shader Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.ShaderTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getShaderType()
		 * @generated
		 */
		EClass SHADER_TYPE = eINSTANCE.getShaderType();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHADER_TYPE__SCRIPT = eINSTANCE.getShaderType_Script();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl <em>Texture Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.TextureTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getTextureType()
		 * @generated
		 */
		EClass TEXTURE_TYPE = eINSTANCE.getTextureType();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTURE_TYPE__IMG = eINSTANCE.getTextureType_Img();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_TYPE__BORDER_COLOR = eINSTANCE.getTextureType_BorderColor();

		/**
		 * The meta object literal for the '<em><b>Filter Mag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_TYPE__FILTER_MAG = eINSTANCE.getTextureType_FilterMag();

		/**
		 * The meta object literal for the '<em><b>Filter Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_TYPE__FILTER_MIN = eINSTANCE.getTextureType_FilterMin();

		/**
		 * The meta object literal for the '<em><b>Filter Mip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_TYPE__FILTER_MIP = eINSTANCE.getTextureType_FilterMip();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_TYPE__ID = eINSTANCE.getTextureType_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_TYPE__KEY = eINSTANCE.getTextureType_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_TYPE__NAME = eINSTANCE.getTextureType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_TYPE__TYPE = eINSTANCE.getTextureType_Type();

		/**
		 * The meta object literal for the '<em><b>Wrap S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_TYPE__WRAP_S = eINSTANCE.getTextureType_WrapS();

		/**
		 * The meta object literal for the '<em><b>Wrap T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_TYPE__WRAP_T = eINSTANCE.getTextureType_WrapT();

		/**
		 * The meta object literal for the '<em><b>Wrap U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_TYPE__WRAP_U = eINSTANCE.getTextureType_WrapU();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.TransformTypeImpl <em>Transform Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.TransformTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getTransformType()
		 * @generated
		 */
		EClass TRANSFORM_TYPE = eINSTANCE.getTransformType();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__CENTER = eINSTANCE.getTransformType_Center();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__ROTATION = eINSTANCE.getTransformType_Rotation();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__SCALE = eINSTANCE.getTransformType_Scale();

		/**
		 * The meta object literal for the '<em><b>Scale Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__SCALE_ORIENTATION = eINSTANCE.getTransformType_ScaleOrientation();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__TRANSLATION = eINSTANCE.getTransformType_Translation();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.ViewTypeImpl <em>View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.ViewTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getViewType()
		 * @generated
		 */
		EClass VIEW_TYPE = eINSTANCE.getViewType();

		/**
		 * The meta object literal for the '<em><b>Field Of View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TYPE__FIELD_OF_VIEW = eINSTANCE.getViewType_FieldOfView();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TYPE__ORIENTATION = eINSTANCE.getViewType_Orientation();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TYPE__POSITION = eINSTANCE.getViewType_Position();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl <em>XML3D Data Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getXML3DDataContainer()
		 * @generated
		 */
		EClass XML3D_DATA_CONTAINER = eINSTANCE.getXML3DDataContainer();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_DATA_CONTAINER__CHILDREN = eINSTANCE.getXML3DDataContainer_Children();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__DATA = eINSTANCE.getXML3DDataContainer_Data();

		/**
		 * The meta object literal for the '<em><b>Bool</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__BOOL = eINSTANCE.getXML3DDataContainer_Bool();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__FLOAT = eINSTANCE.getXML3DDataContainer_Float();

		/**
		 * The meta object literal for the '<em><b>Float2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__FLOAT2 = eINSTANCE.getXML3DDataContainer_Float2();

		/**
		 * The meta object literal for the '<em><b>Float3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__FLOAT3 = eINSTANCE.getXML3DDataContainer_Float3();

		/**
		 * The meta object literal for the '<em><b>Float4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__FLOAT4 = eINSTANCE.getXML3DDataContainer_Float4();

		/**
		 * The meta object literal for the '<em><b>Float4x4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__FLOAT4X4 = eINSTANCE.getXML3DDataContainer_Float4x4();

		/**
		 * The meta object literal for the '<em><b>Int</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__INT = eINSTANCE.getXML3DDataContainer_Int();

		/**
		 * The meta object literal for the '<em><b>Int4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__INT4 = eINSTANCE.getXML3DDataContainer_Int4();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__TEXTURE = eINSTANCE.getXML3DDataContainer_Texture();

		/**
		 * The meta object literal for the '<em><b>Compute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_DATA_CONTAINER__COMPUTE = eINSTANCE.getXML3DDataContainer_Compute();

		/**
		 * The meta object literal for the '<em><b>Proto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__PROTO = eINSTANCE.getXML3DDataContainer_Proto();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_DATA_CONTAINER__SRC = eINSTANCE.getXML3DDataContainer_Src();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.XML3DElementImpl <em>XML3D Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.XML3DElementImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getXML3DElement()
		 * @generated
		 */
		EClass XML3D_ELEMENT = eINSTANCE.getXML3DElement();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_ELEMENT__ANY = eINSTANCE.getXML3DElement_Any();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.impl.Xml3dTypeImpl
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getXml3dType()
		 * @generated
		 */
		EClass XML3D_TYPE = eINSTANCE.getXml3dType();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__CHILDREN = eINSTANCE.getXml3dType_Children();

		/**
		 * The meta object literal for the '<em><b>Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_TYPE__DEFS = eINSTANCE.getXml3dType_Defs();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_TYPE__MESH = eINSTANCE.getXml3dType_Mesh();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_TYPE__GROUP = eINSTANCE.getXml3dType_Group();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_TYPE__VIEW = eINSTANCE.getXml3dType_View();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_TYPE__LIGHT = eINSTANCE.getXml3dType_Light();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_TYPE__SCRIPT = eINSTANCE.getXml3dType_Script();

		/**
		 * The meta object literal for the '<em><b>Active View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML3D_TYPE__ACTIVE_VIEW = eINSTANCE.getXml3dType_ActiveView();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__HEIGHT = eINSTANCE.getXml3dType_Height();

		/**
		 * The meta object literal for the '<em><b>Onclick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__ONCLICK = eINSTANCE.getXml3dType_Onclick();

		/**
		 * The meta object literal for the '<em><b>Ondblclick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__ONDBLCLICK = eINSTANCE.getXml3dType_Ondblclick();

		/**
		 * The meta object literal for the '<em><b>Ondrop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__ONDROP = eINSTANCE.getXml3dType_Ondrop();

		/**
		 * The meta object literal for the '<em><b>Onkeydown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__ONKEYDOWN = eINSTANCE.getXml3dType_Onkeydown();

		/**
		 * The meta object literal for the '<em><b>Onkeypress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__ONKEYPRESS = eINSTANCE.getXml3dType_Onkeypress();

		/**
		 * The meta object literal for the '<em><b>Onkeyup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__ONKEYUP = eINSTANCE.getXml3dType_Onkeyup();

		/**
		 * The meta object literal for the '<em><b>Onmousedown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__ONMOUSEDOWN = eINSTANCE.getXml3dType_Onmousedown();

		/**
		 * The meta object literal for the '<em><b>Onmousemove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__ONMOUSEMOVE = eINSTANCE.getXml3dType_Onmousemove();

		/**
		 * The meta object literal for the '<em><b>Onmouseout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__ONMOUSEOUT = eINSTANCE.getXml3dType_Onmouseout();

		/**
		 * The meta object literal for the '<em><b>Onmouseover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__ONMOUSEOVER = eINSTANCE.getXml3dType_Onmouseover();

		/**
		 * The meta object literal for the '<em><b>Onmouseup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__ONMOUSEUP = eINSTANCE.getXml3dType_Onmouseup();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML3D_TYPE__WIDTH = eINSTANCE.getXml3dType_Width();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.FilterTypes <em>Filter Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.FilterTypes
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFilterTypes()
		 * @generated
		 */
		EEnum FILTER_TYPES = eINSTANCE.getFilterTypes();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.MeshTypeNames <em>Mesh Type Names</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.MeshTypeNames
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getMeshTypeNames()
		 * @generated
		 */
		EEnum MESH_TYPE_NAMES = eINSTANCE.getMeshTypeNames();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.TextureTypes <em>Texture Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.TextureTypes
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getTextureTypes()
		 * @generated
		 */
		EEnum TEXTURE_TYPES = eINSTANCE.getTextureTypes();

		/**
		 * The meta object literal for the '{@link org.xml3d._2009.xml3d.WrapTypes <em>Wrap Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.WrapTypes
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getWrapTypes()
		 * @generated
		 */
		EEnum WRAP_TYPES = eINSTANCE.getWrapTypes();

		/**
		 * The meta object literal for the '<em>Boolean Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getBooleanArray()
		 * @generated
		 */
		EDataType BOOLEAN_ARRAY = eINSTANCE.getBooleanArray();

		/**
		 * The meta object literal for the '<em>Content Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getContentType()
		 * @generated
		 */
		EDataType CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '<em>Filter Types Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.FilterTypes
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFilterTypesObject()
		 * @generated
		 */
		EDataType FILTER_TYPES_OBJECT = eINSTANCE.getFilterTypesObject();

		/**
		 * The meta object literal for the '<em>Float2 Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnu.trove.list.TFloatList
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat2Array()
		 * @generated
		 */
		EDataType FLOAT2_ARRAY = eINSTANCE.getFloat2Array();

		/**
		 * The meta object literal for the '<em>Float3 Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnu.trove.list.TFloatList
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat3Array()
		 * @generated
		 */
		EDataType FLOAT3_ARRAY = eINSTANCE.getFloat3Array();

		/**
		 * The meta object literal for the '<em>Float4 Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnu.trove.list.TFloatList
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat4Array()
		 * @generated
		 */
		EDataType FLOAT4_ARRAY = eINSTANCE.getFloat4Array();

		/**
		 * The meta object literal for the '<em>Float4x4 Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnu.trove.list.TFloatList
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloat4x4Array()
		 * @generated
		 */
		EDataType FLOAT4X4_ARRAY = eINSTANCE.getFloat4x4Array();

		/**
		 * The meta object literal for the '<em>Float Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnu.trove.list.TFloatList
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getFloatArray()
		 * @generated
		 */
		EDataType FLOAT_ARRAY = eINSTANCE.getFloatArray();

		/**
		 * The meta object literal for the '<em>Int4 Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnu.trove.list.TIntList
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getInt4Array()
		 * @generated
		 */
		EDataType INT4_ARRAY = eINSTANCE.getInt4Array();

		/**
		 * The meta object literal for the '<em>Int Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnu.trove.list.TIntList
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getIntArray()
		 * @generated
		 */
		EDataType INT_ARRAY = eINSTANCE.getIntArray();

		/**
		 * The meta object literal for the '<em>Mesh Type Names Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.MeshTypeNames
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getMeshTypeNamesObject()
		 * @generated
		 */
		EDataType MESH_TYPE_NAMES_OBJECT = eINSTANCE.getMeshTypeNamesObject();

		/**
		 * The meta object literal for the '<em>Texture Types Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.TextureTypes
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getTextureTypesObject()
		 * @generated
		 */
		EDataType TEXTURE_TYPES_OBJECT = eINSTANCE.getTextureTypesObject();

		/**
		 * The meta object literal for the '<em>Wrap Types Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xml3d._2009.xml3d.WrapTypes
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getWrapTypesObject()
		 * @generated
		 */
		EDataType WRAP_TYPES_OBJECT = eINSTANCE.getWrapTypesObject();

		/**
		 * The meta object literal for the '<em>XML3D Rotation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnu.trove.list.TFloatList
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getXML3DRotation()
		 * @generated
		 */
		EDataType XML3D_ROTATION = eINSTANCE.getXML3DRotation();

		/**
		 * The meta object literal for the '<em>XML3D Vec3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnu.trove.list.TFloatList
		 * @see org.xml3d._2009.xml3d.impl.Xml3dPackageImpl#getXML3DVec3()
		 * @generated
		 */
		EDataType XML3D_VEC3 = eINSTANCE.getXML3DVec3();

	}

} //Xml3dPackage
