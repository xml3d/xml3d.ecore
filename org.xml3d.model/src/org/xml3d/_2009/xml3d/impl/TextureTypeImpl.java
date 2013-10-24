/**
 */
package org.xml3d._2009.xml3d.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.xml3d._2009.xml3d.FilterTypes;
import org.xml3d._2009.xml3d.ImgType;
import org.xml3d._2009.xml3d.TextureType;
import org.xml3d._2009.xml3d.TextureTypes;
import org.xml3d._2009.xml3d.WrapTypes;
import org.xml3d._2009.xml3d.Xml3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Texture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getFilterMag <em>Filter Mag</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getFilterMin <em>Filter Min</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getFilterMip <em>Filter Mip</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getWrapS <em>Wrap S</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getWrapT <em>Wrap T</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.TextureTypeImpl#getWrapU <em>Wrap U</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextureTypeImpl extends MinimalEObjectImpl.Container implements TextureType {
	/**
	 * The cached value of the '{@link #getImg() <em>Img</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImg()
	 * @generated
	 * @ordered
	 */
	protected ImgType img;

	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_COLOR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected String borderColor = BORDER_COLOR_EDEFAULT;

	/**
	 * This is true if the Border Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean borderColorESet;

	/**
	 * The default value of the '{@link #getFilterMag() <em>Filter Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterMag()
	 * @generated
	 * @ordered
	 */
	protected static final FilterTypes FILTER_MAG_EDEFAULT = FilterTypes.LINEAR;

	/**
	 * The cached value of the '{@link #getFilterMag() <em>Filter Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterMag()
	 * @generated
	 * @ordered
	 */
	protected FilterTypes filterMag = FILTER_MAG_EDEFAULT;

	/**
	 * This is true if the Filter Mag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterMagESet;

	/**
	 * The default value of the '{@link #getFilterMin() <em>Filter Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterMin()
	 * @generated
	 * @ordered
	 */
	protected static final FilterTypes FILTER_MIN_EDEFAULT = FilterTypes.LINEAR;

	/**
	 * The cached value of the '{@link #getFilterMin() <em>Filter Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterMin()
	 * @generated
	 * @ordered
	 */
	protected FilterTypes filterMin = FILTER_MIN_EDEFAULT;

	/**
	 * This is true if the Filter Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterMinESet;

	/**
	 * The default value of the '{@link #getFilterMip() <em>Filter Mip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterMip()
	 * @generated
	 * @ordered
	 */
	protected static final FilterTypes FILTER_MIP_EDEFAULT = FilterTypes.NEAREST;

	/**
	 * The cached value of the '{@link #getFilterMip() <em>Filter Mip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterMip()
	 * @generated
	 * @ordered
	 */
	protected FilterTypes filterMip = FILTER_MIP_EDEFAULT;

	/**
	 * This is true if the Filter Mip attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterMipESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final float KEY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected float key = KEY_EDEFAULT;

	/**
	 * This is true if the Key attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TextureTypes TYPE_EDEFAULT = TextureTypes._2D;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TextureTypes type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getWrapS() <em>Wrap S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapS()
	 * @generated
	 * @ordered
	 */
	protected static final WrapTypes WRAP_S_EDEFAULT = WrapTypes.CLAMP;

	/**
	 * The cached value of the '{@link #getWrapS() <em>Wrap S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapS()
	 * @generated
	 * @ordered
	 */
	protected WrapTypes wrapS = WRAP_S_EDEFAULT;

	/**
	 * This is true if the Wrap S attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrapSESet;

	/**
	 * The default value of the '{@link #getWrapT() <em>Wrap T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapT()
	 * @generated
	 * @ordered
	 */
	protected static final WrapTypes WRAP_T_EDEFAULT = WrapTypes.CLAMP;

	/**
	 * The cached value of the '{@link #getWrapT() <em>Wrap T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapT()
	 * @generated
	 * @ordered
	 */
	protected WrapTypes wrapT = WRAP_T_EDEFAULT;

	/**
	 * This is true if the Wrap T attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrapTESet;

	/**
	 * The default value of the '{@link #getWrapU() <em>Wrap U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapU()
	 * @generated
	 * @ordered
	 */
	protected static final WrapTypes WRAP_U_EDEFAULT = WrapTypes.CLAMP;

	/**
	 * The cached value of the '{@link #getWrapU() <em>Wrap U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapU()
	 * @generated
	 * @ordered
	 */
	protected WrapTypes wrapU = WRAP_U_EDEFAULT;

	/**
	 * This is true if the Wrap U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrapUESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xml3dPackage.Literals.TEXTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImgType getImg() {
		return img;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImg(ImgType newImg, NotificationChain msgs) {
		ImgType oldImg = img;
		img = newImg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__IMG, oldImg, newImg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImg(ImgType newImg) {
		if (newImg != img) {
			NotificationChain msgs = null;
			if (img != null)
				msgs = ((InternalEObject)img).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xml3dPackage.TEXTURE_TYPE__IMG, null, msgs);
			if (newImg != null)
				msgs = ((InternalEObject)newImg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xml3dPackage.TEXTURE_TYPE__IMG, null, msgs);
			msgs = basicSetImg(newImg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__IMG, newImg, newImg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderColor(String newBorderColor) {
		String oldBorderColor = borderColor;
		borderColor = newBorderColor;
		boolean oldBorderColorESet = borderColorESet;
		borderColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__BORDER_COLOR, oldBorderColor, borderColor, !oldBorderColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBorderColor() {
		String oldBorderColor = borderColor;
		boolean oldBorderColorESet = borderColorESet;
		borderColor = BORDER_COLOR_EDEFAULT;
		borderColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TEXTURE_TYPE__BORDER_COLOR, oldBorderColor, BORDER_COLOR_EDEFAULT, oldBorderColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBorderColor() {
		return borderColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterTypes getFilterMag() {
		return filterMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterMag(FilterTypes newFilterMag) {
		FilterTypes oldFilterMag = filterMag;
		filterMag = newFilterMag == null ? FILTER_MAG_EDEFAULT : newFilterMag;
		boolean oldFilterMagESet = filterMagESet;
		filterMagESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__FILTER_MAG, oldFilterMag, filterMag, !oldFilterMagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilterMag() {
		FilterTypes oldFilterMag = filterMag;
		boolean oldFilterMagESet = filterMagESet;
		filterMag = FILTER_MAG_EDEFAULT;
		filterMagESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TEXTURE_TYPE__FILTER_MAG, oldFilterMag, FILTER_MAG_EDEFAULT, oldFilterMagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilterMag() {
		return filterMagESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterTypes getFilterMin() {
		return filterMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterMin(FilterTypes newFilterMin) {
		FilterTypes oldFilterMin = filterMin;
		filterMin = newFilterMin == null ? FILTER_MIN_EDEFAULT : newFilterMin;
		boolean oldFilterMinESet = filterMinESet;
		filterMinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__FILTER_MIN, oldFilterMin, filterMin, !oldFilterMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilterMin() {
		FilterTypes oldFilterMin = filterMin;
		boolean oldFilterMinESet = filterMinESet;
		filterMin = FILTER_MIN_EDEFAULT;
		filterMinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TEXTURE_TYPE__FILTER_MIN, oldFilterMin, FILTER_MIN_EDEFAULT, oldFilterMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilterMin() {
		return filterMinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterTypes getFilterMip() {
		return filterMip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterMip(FilterTypes newFilterMip) {
		FilterTypes oldFilterMip = filterMip;
		filterMip = newFilterMip == null ? FILTER_MIP_EDEFAULT : newFilterMip;
		boolean oldFilterMipESet = filterMipESet;
		filterMipESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__FILTER_MIP, oldFilterMip, filterMip, !oldFilterMipESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilterMip() {
		FilterTypes oldFilterMip = filterMip;
		boolean oldFilterMipESet = filterMipESet;
		filterMip = FILTER_MIP_EDEFAULT;
		filterMipESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TEXTURE_TYPE__FILTER_MIP, oldFilterMip, FILTER_MIP_EDEFAULT, oldFilterMipESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilterMip() {
		return filterMipESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(float newKey) {
		float oldKey = key;
		key = newKey;
		boolean oldKeyESet = keyESet;
		keyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__KEY, oldKey, key, !oldKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKey() {
		float oldKey = key;
		boolean oldKeyESet = keyESet;
		key = KEY_EDEFAULT;
		keyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TEXTURE_TYPE__KEY, oldKey, KEY_EDEFAULT, oldKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKey() {
		return keyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TextureTypes newType) {
		TextureTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TextureTypes oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TEXTURE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapTypes getWrapS() {
		return wrapS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapS(WrapTypes newWrapS) {
		WrapTypes oldWrapS = wrapS;
		wrapS = newWrapS == null ? WRAP_S_EDEFAULT : newWrapS;
		boolean oldWrapSESet = wrapSESet;
		wrapSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__WRAP_S, oldWrapS, wrapS, !oldWrapSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrapS() {
		WrapTypes oldWrapS = wrapS;
		boolean oldWrapSESet = wrapSESet;
		wrapS = WRAP_S_EDEFAULT;
		wrapSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TEXTURE_TYPE__WRAP_S, oldWrapS, WRAP_S_EDEFAULT, oldWrapSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrapS() {
		return wrapSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapTypes getWrapT() {
		return wrapT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapT(WrapTypes newWrapT) {
		WrapTypes oldWrapT = wrapT;
		wrapT = newWrapT == null ? WRAP_T_EDEFAULT : newWrapT;
		boolean oldWrapTESet = wrapTESet;
		wrapTESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__WRAP_T, oldWrapT, wrapT, !oldWrapTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrapT() {
		WrapTypes oldWrapT = wrapT;
		boolean oldWrapTESet = wrapTESet;
		wrapT = WRAP_T_EDEFAULT;
		wrapTESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TEXTURE_TYPE__WRAP_T, oldWrapT, WRAP_T_EDEFAULT, oldWrapTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrapT() {
		return wrapTESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapTypes getWrapU() {
		return wrapU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapU(WrapTypes newWrapU) {
		WrapTypes oldWrapU = wrapU;
		wrapU = newWrapU == null ? WRAP_U_EDEFAULT : newWrapU;
		boolean oldWrapUESet = wrapUESet;
		wrapUESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.TEXTURE_TYPE__WRAP_U, oldWrapU, wrapU, !oldWrapUESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrapU() {
		WrapTypes oldWrapU = wrapU;
		boolean oldWrapUESet = wrapUESet;
		wrapU = WRAP_U_EDEFAULT;
		wrapUESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.TEXTURE_TYPE__WRAP_U, oldWrapU, WRAP_U_EDEFAULT, oldWrapUESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrapU() {
		return wrapUESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xml3dPackage.TEXTURE_TYPE__IMG:
				return basicSetImg(null, msgs);
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
			case Xml3dPackage.TEXTURE_TYPE__IMG:
				return getImg();
			case Xml3dPackage.TEXTURE_TYPE__BORDER_COLOR:
				return getBorderColor();
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MAG:
				return getFilterMag();
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MIN:
				return getFilterMin();
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MIP:
				return getFilterMip();
			case Xml3dPackage.TEXTURE_TYPE__ID:
				return getId();
			case Xml3dPackage.TEXTURE_TYPE__KEY:
				return getKey();
			case Xml3dPackage.TEXTURE_TYPE__NAME:
				return getName();
			case Xml3dPackage.TEXTURE_TYPE__TYPE:
				return getType();
			case Xml3dPackage.TEXTURE_TYPE__WRAP_S:
				return getWrapS();
			case Xml3dPackage.TEXTURE_TYPE__WRAP_T:
				return getWrapT();
			case Xml3dPackage.TEXTURE_TYPE__WRAP_U:
				return getWrapU();
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
			case Xml3dPackage.TEXTURE_TYPE__IMG:
				setImg((ImgType)newValue);
				return;
			case Xml3dPackage.TEXTURE_TYPE__BORDER_COLOR:
				setBorderColor((String)newValue);
				return;
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MAG:
				setFilterMag((FilterTypes)newValue);
				return;
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MIN:
				setFilterMin((FilterTypes)newValue);
				return;
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MIP:
				setFilterMip((FilterTypes)newValue);
				return;
			case Xml3dPackage.TEXTURE_TYPE__ID:
				setId((String)newValue);
				return;
			case Xml3dPackage.TEXTURE_TYPE__KEY:
				setKey((Float)newValue);
				return;
			case Xml3dPackage.TEXTURE_TYPE__NAME:
				setName((String)newValue);
				return;
			case Xml3dPackage.TEXTURE_TYPE__TYPE:
				setType((TextureTypes)newValue);
				return;
			case Xml3dPackage.TEXTURE_TYPE__WRAP_S:
				setWrapS((WrapTypes)newValue);
				return;
			case Xml3dPackage.TEXTURE_TYPE__WRAP_T:
				setWrapT((WrapTypes)newValue);
				return;
			case Xml3dPackage.TEXTURE_TYPE__WRAP_U:
				setWrapU((WrapTypes)newValue);
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
			case Xml3dPackage.TEXTURE_TYPE__IMG:
				setImg((ImgType)null);
				return;
			case Xml3dPackage.TEXTURE_TYPE__BORDER_COLOR:
				unsetBorderColor();
				return;
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MAG:
				unsetFilterMag();
				return;
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MIN:
				unsetFilterMin();
				return;
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MIP:
				unsetFilterMip();
				return;
			case Xml3dPackage.TEXTURE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Xml3dPackage.TEXTURE_TYPE__KEY:
				unsetKey();
				return;
			case Xml3dPackage.TEXTURE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Xml3dPackage.TEXTURE_TYPE__TYPE:
				unsetType();
				return;
			case Xml3dPackage.TEXTURE_TYPE__WRAP_S:
				unsetWrapS();
				return;
			case Xml3dPackage.TEXTURE_TYPE__WRAP_T:
				unsetWrapT();
				return;
			case Xml3dPackage.TEXTURE_TYPE__WRAP_U:
				unsetWrapU();
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
			case Xml3dPackage.TEXTURE_TYPE__IMG:
				return img != null;
			case Xml3dPackage.TEXTURE_TYPE__BORDER_COLOR:
				return isSetBorderColor();
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MAG:
				return isSetFilterMag();
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MIN:
				return isSetFilterMin();
			case Xml3dPackage.TEXTURE_TYPE__FILTER_MIP:
				return isSetFilterMip();
			case Xml3dPackage.TEXTURE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Xml3dPackage.TEXTURE_TYPE__KEY:
				return isSetKey();
			case Xml3dPackage.TEXTURE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Xml3dPackage.TEXTURE_TYPE__TYPE:
				return isSetType();
			case Xml3dPackage.TEXTURE_TYPE__WRAP_S:
				return isSetWrapS();
			case Xml3dPackage.TEXTURE_TYPE__WRAP_T:
				return isSetWrapT();
			case Xml3dPackage.TEXTURE_TYPE__WRAP_U:
				return isSetWrapU();
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
		result.append(" (borderColor: ");
		if (borderColorESet) result.append(borderColor); else result.append("<unset>");
		result.append(", filterMag: ");
		if (filterMagESet) result.append(filterMag); else result.append("<unset>");
		result.append(", filterMin: ");
		if (filterMinESet) result.append(filterMin); else result.append("<unset>");
		result.append(", filterMip: ");
		if (filterMipESet) result.append(filterMip); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", key: ");
		if (keyESet) result.append(key); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", wrapS: ");
		if (wrapSESet) result.append(wrapS); else result.append("<unset>");
		result.append(", wrapT: ");
		if (wrapTESet) result.append(wrapT); else result.append("<unset>");
		result.append(", wrapU: ");
		if (wrapUESet) result.append(wrapU); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TextureTypeImpl
