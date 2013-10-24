/**
 */
package org.xml3d._2009.xml3d.impl;

import gnu.trove.list.TFloatList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xml3d._2009.xml3d.ViewType;
import org.xml3d._2009.xml3d.Xml3dFactory;
import org.xml3d._2009.xml3d.Xml3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.impl.ViewTypeImpl#getFieldOfView <em>Field Of View</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.ViewTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.ViewTypeImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewTypeImpl extends XML3DElementImpl implements ViewType {
	/**
	 * The default value of the '{@link #getFieldOfView() <em>Field Of View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldOfView()
	 * @generated
	 * @ordered
	 */
	protected static final float FIELD_OF_VIEW_EDEFAULT = 0.7853982F;

	/**
	 * The cached value of the '{@link #getFieldOfView() <em>Field Of View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldOfView()
	 * @generated
	 * @ordered
	 */
	protected float fieldOfView = FIELD_OF_VIEW_EDEFAULT;

	/**
	 * This is true if the Field Of View attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fieldOfViewESet;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final TFloatList ORIENTATION_EDEFAULT = (TFloatList)Xml3dFactory.eINSTANCE.createFromString(Xml3dPackage.eINSTANCE.getXML3DRotation(), "0 0 1 0");

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected TFloatList orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final TFloatList POSITION_EDEFAULT = (TFloatList)Xml3dFactory.eINSTANCE.createFromString(Xml3dPackage.eINSTANCE.getXML3DVec3(), "0 0 0");

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected TFloatList position = POSITION_EDEFAULT;

	/**
	 * This is true if the Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xml3dPackage.Literals.VIEW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFieldOfView() {
		return fieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldOfView(float newFieldOfView) {
		float oldFieldOfView = fieldOfView;
		fieldOfView = newFieldOfView;
		boolean oldFieldOfViewESet = fieldOfViewESet;
		fieldOfViewESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.VIEW_TYPE__FIELD_OF_VIEW, oldFieldOfView, fieldOfView, !oldFieldOfViewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFieldOfView() {
		float oldFieldOfView = fieldOfView;
		boolean oldFieldOfViewESet = fieldOfViewESet;
		fieldOfView = FIELD_OF_VIEW_EDEFAULT;
		fieldOfViewESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.VIEW_TYPE__FIELD_OF_VIEW, oldFieldOfView, FIELD_OF_VIEW_EDEFAULT, oldFieldOfViewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFieldOfView() {
		return fieldOfViewESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFloatList getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(TFloatList newOrientation) {
		TFloatList oldOrientation = orientation;
		orientation = newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.VIEW_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrientation() {
		TFloatList oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.VIEW_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFloatList getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(TFloatList newPosition) {
		TFloatList oldPosition = position;
		position = newPosition;
		boolean oldPositionESet = positionESet;
		positionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.VIEW_TYPE__POSITION, oldPosition, position, !oldPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPosition() {
		TFloatList oldPosition = position;
		boolean oldPositionESet = positionESet;
		position = POSITION_EDEFAULT;
		positionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.VIEW_TYPE__POSITION, oldPosition, POSITION_EDEFAULT, oldPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPosition() {
		return positionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xml3dPackage.VIEW_TYPE__FIELD_OF_VIEW:
				return getFieldOfView();
			case Xml3dPackage.VIEW_TYPE__ORIENTATION:
				return getOrientation();
			case Xml3dPackage.VIEW_TYPE__POSITION:
				return getPosition();
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
			case Xml3dPackage.VIEW_TYPE__FIELD_OF_VIEW:
				setFieldOfView((Float)newValue);
				return;
			case Xml3dPackage.VIEW_TYPE__ORIENTATION:
				setOrientation((TFloatList)newValue);
				return;
			case Xml3dPackage.VIEW_TYPE__POSITION:
				setPosition((TFloatList)newValue);
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
			case Xml3dPackage.VIEW_TYPE__FIELD_OF_VIEW:
				unsetFieldOfView();
				return;
			case Xml3dPackage.VIEW_TYPE__ORIENTATION:
				unsetOrientation();
				return;
			case Xml3dPackage.VIEW_TYPE__POSITION:
				unsetPosition();
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
			case Xml3dPackage.VIEW_TYPE__FIELD_OF_VIEW:
				return isSetFieldOfView();
			case Xml3dPackage.VIEW_TYPE__ORIENTATION:
				return isSetOrientation();
			case Xml3dPackage.VIEW_TYPE__POSITION:
				return isSetPosition();
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
		result.append(" (fieldOfView: ");
		if (fieldOfViewESet) result.append(fieldOfView); else result.append("<unset>");
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", position: ");
		if (positionESet) result.append(position); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ViewTypeImpl
