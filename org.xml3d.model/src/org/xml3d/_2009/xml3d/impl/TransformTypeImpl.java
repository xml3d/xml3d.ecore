/**
 */
package org.xml3d._2009.xml3d.impl;

import gnu.trove.list.TFloatList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xml3d._2009.xml3d.TransformType;
import org.xml3d._2009.xml3d.Xml3dFactory;
import org.xml3d._2009.xml3d.Xml3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TransformTypeImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TransformTypeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TransformTypeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TransformTypeImpl#getScaleOrientation <em>Scale Orientation</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TransformTypeImpl#getTranslation <em>Translation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformTypeImpl extends XML3DElementImpl implements TransformType {
	/**
	 * The default value of the '{@link #getCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected static final TFloatList CENTER_EDEFAULT = (TFloatList)Xml3dFactory.eINSTANCE.createFromString(Xml3dPackage.eINSTANCE.getXML3DVec3(), "0 0 0");

	/**
	 * The cached value of the '{@link #getCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected TFloatList center = CENTER_EDEFAULT;

	/**
	 * This is true if the Center attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean centerESet;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final TFloatList ROTATION_EDEFAULT = (TFloatList)Xml3dFactory.eINSTANCE.createFromString(Xml3dPackage.eINSTANCE.getXML3DRotation(), "0 0 1 0");

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected TFloatList rotation = ROTATION_EDEFAULT;

	/**
	 * This is true if the Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationESet;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final TFloatList SCALE_EDEFAULT = (TFloatList)Xml3dFactory.eINSTANCE.createFromString(Xml3dPackage.eINSTANCE.getXML3DVec3(), "1 1 1");

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected TFloatList scale = SCALE_EDEFAULT;

	/**
	 * This is true if the Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scaleESet;

	/**
	 * The default value of the '{@link #getScaleOrientation() <em>Scale Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final TFloatList SCALE_ORIENTATION_EDEFAULT = (TFloatList)Xml3dFactory.eINSTANCE.createFromString(Xml3dPackage.eINSTANCE.getXML3DRotation(), "0 0 1 0");

	/**
	 * The cached value of the '{@link #getScaleOrientation() <em>Scale Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleOrientation()
	 * @generated
	 * @ordered
	 */
	protected TFloatList scaleOrientation = SCALE_ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Scale Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scaleOrientationESet;

	/**
	 * The default value of the '{@link #getTranslation() <em>Translation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected static final TFloatList TRANSLATION_EDEFAULT = (TFloatList)Xml3dFactory.eINSTANCE.createFromString(Xml3dPackage.eINSTANCE.getXML3DVec3(), "0 0 0");

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected TFloatList translation = TRANSLATION_EDEFAULT;

	/**
	 * This is true if the Translation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean translationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xml3dPackage.Literals.TRANSFORM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFloatList getCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter(TFloatList newCenter) {
		TFloatList oldCenter = center;
		center = newCenter;
		boolean oldCenterESet = centerESet;
		centerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TRANSFORM_TYPE__CENTER, oldCenter, center, !oldCenterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCenter() {
		TFloatList oldCenter = center;
		boolean oldCenterESet = centerESet;
		center = CENTER_EDEFAULT;
		centerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TRANSFORM_TYPE__CENTER, oldCenter, CENTER_EDEFAULT, oldCenterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCenter() {
		return centerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFloatList getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(TFloatList newRotation) {
		TFloatList oldRotation = rotation;
		rotation = newRotation;
		boolean oldRotationESet = rotationESet;
		rotationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TRANSFORM_TYPE__ROTATION, oldRotation, rotation, !oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotation() {
		TFloatList oldRotation = rotation;
		boolean oldRotationESet = rotationESet;
		rotation = ROTATION_EDEFAULT;
		rotationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TRANSFORM_TYPE__ROTATION, oldRotation, ROTATION_EDEFAULT, oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotation() {
		return rotationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFloatList getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(TFloatList newScale) {
		TFloatList oldScale = scale;
		scale = newScale;
		boolean oldScaleESet = scaleESet;
		scaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TRANSFORM_TYPE__SCALE, oldScale, scale, !oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale() {
		TFloatList oldScale = scale;
		boolean oldScaleESet = scaleESet;
		scale = SCALE_EDEFAULT;
		scaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TRANSFORM_TYPE__SCALE, oldScale, SCALE_EDEFAULT, oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale() {
		return scaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFloatList getScaleOrientation() {
		return scaleOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleOrientation(TFloatList newScaleOrientation) {
		TFloatList oldScaleOrientation = scaleOrientation;
		scaleOrientation = newScaleOrientation;
		boolean oldScaleOrientationESet = scaleOrientationESet;
		scaleOrientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TRANSFORM_TYPE__SCALE_ORIENTATION, oldScaleOrientation, scaleOrientation, !oldScaleOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScaleOrientation() {
		TFloatList oldScaleOrientation = scaleOrientation;
		boolean oldScaleOrientationESet = scaleOrientationESet;
		scaleOrientation = SCALE_ORIENTATION_EDEFAULT;
		scaleOrientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TRANSFORM_TYPE__SCALE_ORIENTATION, oldScaleOrientation, SCALE_ORIENTATION_EDEFAULT, oldScaleOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScaleOrientation() {
		return scaleOrientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFloatList getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslation(TFloatList newTranslation) {
		TFloatList oldTranslation = translation;
		translation = newTranslation;
		boolean oldTranslationESet = translationESet;
		translationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TRANSFORM_TYPE__TRANSLATION, oldTranslation, translation, !oldTranslationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTranslation() {
		TFloatList oldTranslation = translation;
		boolean oldTranslationESet = translationESet;
		translation = TRANSLATION_EDEFAULT;
		translationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TRANSFORM_TYPE__TRANSLATION, oldTranslation, TRANSLATION_EDEFAULT, oldTranslationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTranslation() {
		return translationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xml3dPackage.TRANSFORM_TYPE__CENTER:
				return getCenter();
			case Xml3dPackage.TRANSFORM_TYPE__ROTATION:
				return getRotation();
			case Xml3dPackage.TRANSFORM_TYPE__SCALE:
				return getScale();
			case Xml3dPackage.TRANSFORM_TYPE__SCALE_ORIENTATION:
				return getScaleOrientation();
			case Xml3dPackage.TRANSFORM_TYPE__TRANSLATION:
				return getTranslation();
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
			case Xml3dPackage.TRANSFORM_TYPE__CENTER:
				setCenter((TFloatList)newValue);
				return;
			case Xml3dPackage.TRANSFORM_TYPE__ROTATION:
				setRotation((TFloatList)newValue);
				return;
			case Xml3dPackage.TRANSFORM_TYPE__SCALE:
				setScale((TFloatList)newValue);
				return;
			case Xml3dPackage.TRANSFORM_TYPE__SCALE_ORIENTATION:
				setScaleOrientation((TFloatList)newValue);
				return;
			case Xml3dPackage.TRANSFORM_TYPE__TRANSLATION:
				setTranslation((TFloatList)newValue);
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
			case Xml3dPackage.TRANSFORM_TYPE__CENTER:
				unsetCenter();
				return;
			case Xml3dPackage.TRANSFORM_TYPE__ROTATION:
				unsetRotation();
				return;
			case Xml3dPackage.TRANSFORM_TYPE__SCALE:
				unsetScale();
				return;
			case Xml3dPackage.TRANSFORM_TYPE__SCALE_ORIENTATION:
				unsetScaleOrientation();
				return;
			case Xml3dPackage.TRANSFORM_TYPE__TRANSLATION:
				unsetTranslation();
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
			case Xml3dPackage.TRANSFORM_TYPE__CENTER:
				return isSetCenter();
			case Xml3dPackage.TRANSFORM_TYPE__ROTATION:
				return isSetRotation();
			case Xml3dPackage.TRANSFORM_TYPE__SCALE:
				return isSetScale();
			case Xml3dPackage.TRANSFORM_TYPE__SCALE_ORIENTATION:
				return isSetScaleOrientation();
			case Xml3dPackage.TRANSFORM_TYPE__TRANSLATION:
				return isSetTranslation();
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
		result.append(" (center: ");
		if (centerESet) result.append(center); else result.append("<unset>");
		result.append(", rotation: ");
		if (rotationESet) result.append(rotation); else result.append("<unset>");
		result.append(", scale: ");
		if (scaleESet) result.append(scale); else result.append("<unset>");
		result.append(", scaleOrientation: ");
		if (scaleOrientationESet) result.append(scaleOrientation); else result.append("<unset>");
		result.append(", translation: ");
		if (translationESet) result.append(translation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TransformTypeImpl
