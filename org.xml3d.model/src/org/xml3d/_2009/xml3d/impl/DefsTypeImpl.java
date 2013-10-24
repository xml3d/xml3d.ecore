/**
 */
package org.xml3d._2009.xml3d.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xml3d._2009.xml3d.DataType;
import org.xml3d._2009.xml3d.DefsType;
import org.xml3d._2009.xml3d.LightShaderType;
import org.xml3d._2009.xml3d.MeshType;
import org.xml3d._2009.xml3d.ScriptType;
import org.xml3d._2009.xml3d.ShaderType;
import org.xml3d._2009.xml3d.TransformType;
import org.xml3d._2009.xml3d.Xml3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DefsTypeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DefsTypeImpl#getShader <em>Shader</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DefsTypeImpl#getLightshader <em>Lightshader</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DefsTypeImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DefsTypeImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DefsTypeImpl#getMesh <em>Mesh</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.DefsTypeImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefsTypeImpl extends XML3DElementImpl implements DefsType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xml3dPackage.Literals.DEFS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChildren() {
		if (children == null) {
			children = new BasicFeatureMap(this, Xml3dPackage.DEFS_TYPE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShaderType> getShader() {
		return getChildren().list(Xml3dPackage.Literals.DEFS_TYPE__SHADER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LightShaderType> getLightshader() {
		return getChildren().list(Xml3dPackage.Literals.DEFS_TYPE__LIGHTSHADER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getData() {
		return getChildren().list(Xml3dPackage.Literals.DEFS_TYPE__DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformType> getTransform() {
		return getChildren().list(Xml3dPackage.Literals.DEFS_TYPE__TRANSFORM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeshType> getMesh() {
		return getChildren().list(Xml3dPackage.Literals.DEFS_TYPE__MESH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getChildren().list(Xml3dPackage.Literals.DEFS_TYPE__SCRIPT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xml3dPackage.DEFS_TYPE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.DEFS_TYPE__SHADER:
				return ((InternalEList<?>)getShader()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.DEFS_TYPE__LIGHTSHADER:
				return ((InternalEList<?>)getLightshader()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.DEFS_TYPE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.DEFS_TYPE__TRANSFORM:
				return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.DEFS_TYPE__MESH:
				return ((InternalEList<?>)getMesh()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.DEFS_TYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
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
			case Xml3dPackage.DEFS_TYPE__CHILDREN:
				if (coreType) return getChildren();
				return ((FeatureMap.Internal)getChildren()).getWrapper();
			case Xml3dPackage.DEFS_TYPE__SHADER:
				return getShader();
			case Xml3dPackage.DEFS_TYPE__LIGHTSHADER:
				return getLightshader();
			case Xml3dPackage.DEFS_TYPE__DATA:
				return getData();
			case Xml3dPackage.DEFS_TYPE__TRANSFORM:
				return getTransform();
			case Xml3dPackage.DEFS_TYPE__MESH:
				return getMesh();
			case Xml3dPackage.DEFS_TYPE__SCRIPT:
				return getScript();
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
			case Xml3dPackage.DEFS_TYPE__CHILDREN:
				((FeatureMap.Internal)getChildren()).set(newValue);
				return;
			case Xml3dPackage.DEFS_TYPE__SHADER:
				getShader().clear();
				getShader().addAll((Collection<? extends ShaderType>)newValue);
				return;
			case Xml3dPackage.DEFS_TYPE__LIGHTSHADER:
				getLightshader().clear();
				getLightshader().addAll((Collection<? extends LightShaderType>)newValue);
				return;
			case Xml3dPackage.DEFS_TYPE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends DataType>)newValue);
				return;
			case Xml3dPackage.DEFS_TYPE__TRANSFORM:
				getTransform().clear();
				getTransform().addAll((Collection<? extends TransformType>)newValue);
				return;
			case Xml3dPackage.DEFS_TYPE__MESH:
				getMesh().clear();
				getMesh().addAll((Collection<? extends MeshType>)newValue);
				return;
			case Xml3dPackage.DEFS_TYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
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
			case Xml3dPackage.DEFS_TYPE__CHILDREN:
				getChildren().clear();
				return;
			case Xml3dPackage.DEFS_TYPE__SHADER:
				getShader().clear();
				return;
			case Xml3dPackage.DEFS_TYPE__LIGHTSHADER:
				getLightshader().clear();
				return;
			case Xml3dPackage.DEFS_TYPE__DATA:
				getData().clear();
				return;
			case Xml3dPackage.DEFS_TYPE__TRANSFORM:
				getTransform().clear();
				return;
			case Xml3dPackage.DEFS_TYPE__MESH:
				getMesh().clear();
				return;
			case Xml3dPackage.DEFS_TYPE__SCRIPT:
				getScript().clear();
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
			case Xml3dPackage.DEFS_TYPE__CHILDREN:
				return children != null && !children.isEmpty();
			case Xml3dPackage.DEFS_TYPE__SHADER:
				return !getShader().isEmpty();
			case Xml3dPackage.DEFS_TYPE__LIGHTSHADER:
				return !getLightshader().isEmpty();
			case Xml3dPackage.DEFS_TYPE__DATA:
				return !getData().isEmpty();
			case Xml3dPackage.DEFS_TYPE__TRANSFORM:
				return !getTransform().isEmpty();
			case Xml3dPackage.DEFS_TYPE__MESH:
				return !getMesh().isEmpty();
			case Xml3dPackage.DEFS_TYPE__SCRIPT:
				return !getScript().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DefsTypeImpl
