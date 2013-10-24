/**
 */
package org.xml3d._2009.xml3d.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xml3d._2009.xml3d.BoolType;
import org.xml3d._2009.xml3d.DataType;
import org.xml3d._2009.xml3d.Float2Type;
import org.xml3d._2009.xml3d.Float3Type;
import org.xml3d._2009.xml3d.Float4Type;
import org.xml3d._2009.xml3d.Float4x4Type;
import org.xml3d._2009.xml3d.FloatType;
import org.xml3d._2009.xml3d.Int4Type;
import org.xml3d._2009.xml3d.IntType;
import org.xml3d._2009.xml3d.TextureType;
import org.xml3d._2009.xml3d.XML3DDataContainer;
import org.xml3d._2009.xml3d.Xml3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML3D Data Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getTexture <em>Texture</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getCompute <em>Compute</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getProto <em>Proto</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.XML3DDataContainerImpl#getSrc <em>Src</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class XML3DDataContainerImpl extends XML3DElementImpl implements XML3DDataContainer {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap children;

	/**
	 * The default value of the '{@link #getCompute() <em>Compute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompute()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCompute() <em>Compute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompute()
	 * @generated
	 * @ordered
	 */
	protected String compute = COMPUTE_EDEFAULT;

	/**
	 * This is true if the Compute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean computeESet;

	/**
	 * The cached value of the '{@link #getProto() <em>Proto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProto()
	 * @generated
	 * @ordered
	 */
	protected DataType proto;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected DataType src;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XML3DDataContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xml3dPackage.Literals.XML3D_DATA_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChildren() {
		if (children == null) {
			children = new BasicFeatureMap(this, Xml3dPackage.XML3D_DATA_CONTAINER__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getData() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_DATA_CONTAINER__DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolType> getBool() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_DATA_CONTAINER__BOOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FloatType> getFloat() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_DATA_CONTAINER__FLOAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float2Type> getFloat2() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_DATA_CONTAINER__FLOAT2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float3Type> getFloat3() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_DATA_CONTAINER__FLOAT3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float4Type> getFloat4() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_DATA_CONTAINER__FLOAT4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float4x4Type> getFloat4x4() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_DATA_CONTAINER__FLOAT4X4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntType> getInt() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_DATA_CONTAINER__INT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Int4Type> getInt4() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_DATA_CONTAINER__INT4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextureType> getTexture() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_DATA_CONTAINER__TEXTURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompute() {
		return compute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompute(String newCompute) {
		String oldCompute = compute;
		compute = newCompute;
		boolean oldComputeESet = computeESet;
		computeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_DATA_CONTAINER__COMPUTE, oldCompute, compute, !oldComputeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompute() {
		String oldCompute = compute;
		boolean oldComputeESet = computeESet;
		compute = COMPUTE_EDEFAULT;
		computeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.XML3D_DATA_CONTAINER__COMPUTE, oldCompute, COMPUTE_EDEFAULT, oldComputeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompute() {
		return computeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getProto() {
		if (proto != null && proto.eIsProxy()) {
			InternalEObject oldProto = (InternalEObject)proto;
			proto = (DataType)eResolveProxy(oldProto);
			if (proto != oldProto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xml3dPackage.XML3D_DATA_CONTAINER__PROTO, oldProto, proto));
			}
		}
		return proto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetProto() {
		return proto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProto(DataType newProto) {
		DataType oldProto = proto;
		proto = newProto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_DATA_CONTAINER__PROTO, oldProto, proto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject)src;
			src = (DataType)eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xml3dPackage.XML3D_DATA_CONTAINER__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(DataType newSrc) {
		DataType oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_DATA_CONTAINER__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xml3dPackage.XML3D_DATA_CONTAINER__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_DATA_CONTAINER__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_DATA_CONTAINER__BOOL:
				return ((InternalEList<?>)getBool()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT:
				return ((InternalEList<?>)getFloat()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT2:
				return ((InternalEList<?>)getFloat2()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT3:
				return ((InternalEList<?>)getFloat3()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT4:
				return ((InternalEList<?>)getFloat4()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT4X4:
				return ((InternalEList<?>)getFloat4x4()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_DATA_CONTAINER__INT:
				return ((InternalEList<?>)getInt()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_DATA_CONTAINER__INT4:
				return ((InternalEList<?>)getInt4()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_DATA_CONTAINER__TEXTURE:
				return ((InternalEList<?>)getTexture()).basicRemove(otherEnd, msgs);
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
			case Xml3dPackage.XML3D_DATA_CONTAINER__CHILDREN:
				if (coreType) return getChildren();
				return ((FeatureMap.Internal)getChildren()).getWrapper();
			case Xml3dPackage.XML3D_DATA_CONTAINER__DATA:
				return getData();
			case Xml3dPackage.XML3D_DATA_CONTAINER__BOOL:
				return getBool();
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT:
				return getFloat();
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT2:
				return getFloat2();
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT3:
				return getFloat3();
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT4:
				return getFloat4();
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT4X4:
				return getFloat4x4();
			case Xml3dPackage.XML3D_DATA_CONTAINER__INT:
				return getInt();
			case Xml3dPackage.XML3D_DATA_CONTAINER__INT4:
				return getInt4();
			case Xml3dPackage.XML3D_DATA_CONTAINER__TEXTURE:
				return getTexture();
			case Xml3dPackage.XML3D_DATA_CONTAINER__COMPUTE:
				return getCompute();
			case Xml3dPackage.XML3D_DATA_CONTAINER__PROTO:
				if (resolve) return getProto();
				return basicGetProto();
			case Xml3dPackage.XML3D_DATA_CONTAINER__SRC:
				if (resolve) return getSrc();
				return basicGetSrc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Xml3dPackage.XML3D_DATA_CONTAINER__CHILDREN:
				((FeatureMap.Internal)getChildren()).set(newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__DATA:
				getData().clear();
				getData().addAll((Collection<? extends DataType>)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__BOOL:
				getBool().clear();
				getBool().addAll((Collection<? extends BoolType>)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT:
				getFloat().clear();
				getFloat().addAll((Collection<? extends FloatType>)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT2:
				getFloat2().clear();
				getFloat2().addAll((Collection<? extends Float2Type>)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT3:
				getFloat3().clear();
				getFloat3().addAll((Collection<? extends Float3Type>)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT4:
				getFloat4().clear();
				getFloat4().addAll((Collection<? extends Float4Type>)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT4X4:
				getFloat4x4().clear();
				getFloat4x4().addAll((Collection<? extends Float4x4Type>)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__INT:
				getInt().clear();
				getInt().addAll((Collection<? extends IntType>)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__INT4:
				getInt4().clear();
				getInt4().addAll((Collection<? extends Int4Type>)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__TEXTURE:
				getTexture().clear();
				getTexture().addAll((Collection<? extends TextureType>)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__COMPUTE:
				setCompute((String)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__PROTO:
				setProto((DataType)newValue);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__SRC:
				setSrc((DataType)newValue);
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
			case Xml3dPackage.XML3D_DATA_CONTAINER__CHILDREN:
				getChildren().clear();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__DATA:
				getData().clear();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__BOOL:
				getBool().clear();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT:
				getFloat().clear();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT2:
				getFloat2().clear();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT3:
				getFloat3().clear();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT4:
				getFloat4().clear();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT4X4:
				getFloat4x4().clear();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__INT:
				getInt().clear();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__INT4:
				getInt4().clear();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__TEXTURE:
				getTexture().clear();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__COMPUTE:
				unsetCompute();
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__PROTO:
				setProto((DataType)null);
				return;
			case Xml3dPackage.XML3D_DATA_CONTAINER__SRC:
				setSrc((DataType)null);
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
			case Xml3dPackage.XML3D_DATA_CONTAINER__CHILDREN:
				return children != null && !children.isEmpty();
			case Xml3dPackage.XML3D_DATA_CONTAINER__DATA:
				return !getData().isEmpty();
			case Xml3dPackage.XML3D_DATA_CONTAINER__BOOL:
				return !getBool().isEmpty();
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT:
				return !getFloat().isEmpty();
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT2:
				return !getFloat2().isEmpty();
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT3:
				return !getFloat3().isEmpty();
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT4:
				return !getFloat4().isEmpty();
			case Xml3dPackage.XML3D_DATA_CONTAINER__FLOAT4X4:
				return !getFloat4x4().isEmpty();
			case Xml3dPackage.XML3D_DATA_CONTAINER__INT:
				return !getInt().isEmpty();
			case Xml3dPackage.XML3D_DATA_CONTAINER__INT4:
				return !getInt4().isEmpty();
			case Xml3dPackage.XML3D_DATA_CONTAINER__TEXTURE:
				return !getTexture().isEmpty();
			case Xml3dPackage.XML3D_DATA_CONTAINER__COMPUTE:
				return isSetCompute();
			case Xml3dPackage.XML3D_DATA_CONTAINER__PROTO:
				return proto != null;
			case Xml3dPackage.XML3D_DATA_CONTAINER__SRC:
				return src != null;
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
		result.append(" (children: ");
		result.append(children);
		result.append(", compute: ");
		if (computeESet) result.append(compute); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //XML3DDataContainerImpl
