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

import org.xml3d._2009.xml3d.DefsType;
import org.xml3d._2009.xml3d.GroupType;
import org.xml3d._2009.xml3d.LightType;
import org.xml3d._2009.xml3d.MeshType;
import org.xml3d._2009.xml3d.ScriptType;
import org.xml3d._2009.xml3d.ViewType;
import org.xml3d._2009.xml3d.Xml3dPackage;
import org.xml3d._2009.xml3d.Xml3dType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getDefs <em>Defs</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getMesh <em>Mesh</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getView <em>View</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getLight <em>Light</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getActiveView <em>Active View</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getOndrop <em>Ondrop</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.xml3d._2009.xml3d.impl.Xml3dTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Xml3dTypeImpl extends XML3DElementImpl implements Xml3dType {
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
	 * The cached value of the '{@link #getActiveView() <em>Active View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveView()
	 * @generated
	 * @ordered
	 */
	protected ViewType activeView;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * This is true if the Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heightESet;

	/**
	 * The default value of the '{@link #getOnclick() <em>Onclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnclick()
	 * @generated
	 * @ordered
	 */
	protected static final String ONCLICK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnclick() <em>Onclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnclick()
	 * @generated
	 * @ordered
	 */
	protected String onclick = ONCLICK_EDEFAULT;

	/**
	 * The default value of the '{@link #getOndblclick() <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndblclick()
	 * @generated
	 * @ordered
	 */
	protected static final String ONDBLCLICK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOndblclick() <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndblclick()
	 * @generated
	 * @ordered
	 */
	protected String ondblclick = ONDBLCLICK_EDEFAULT;

	/**
	 * The default value of the '{@link #getOndrop() <em>Ondrop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndrop()
	 * @generated
	 * @ordered
	 */
	protected static final String ONDROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOndrop() <em>Ondrop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndrop()
	 * @generated
	 * @ordered
	 */
	protected String ondrop = ONDROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeydown() <em>Onkeydown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeydown()
	 * @generated
	 * @ordered
	 */
	protected static final String ONKEYDOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeydown() <em>Onkeydown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeydown()
	 * @generated
	 * @ordered
	 */
	protected String onkeydown = ONKEYDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeypress() <em>Onkeypress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeypress()
	 * @generated
	 * @ordered
	 */
	protected static final String ONKEYPRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeypress() <em>Onkeypress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeypress()
	 * @generated
	 * @ordered
	 */
	protected String onkeypress = ONKEYPRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeyup() <em>Onkeyup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeyup()
	 * @generated
	 * @ordered
	 */
	protected static final String ONKEYUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeyup() <em>Onkeyup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeyup()
	 * @generated
	 * @ordered
	 */
	protected String onkeyup = ONKEYUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmousedown() <em>Onmousedown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousedown()
	 * @generated
	 * @ordered
	 */
	protected static final String ONMOUSEDOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmousedown() <em>Onmousedown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousedown()
	 * @generated
	 * @ordered
	 */
	protected String onmousedown = ONMOUSEDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmousemove() <em>Onmousemove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousemove()
	 * @generated
	 * @ordered
	 */
	protected static final String ONMOUSEMOVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmousemove() <em>Onmousemove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousemove()
	 * @generated
	 * @ordered
	 */
	protected String onmousemove = ONMOUSEMOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseout() <em>Onmouseout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseout()
	 * @generated
	 * @ordered
	 */
	protected static final String ONMOUSEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseout() <em>Onmouseout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseout()
	 * @generated
	 * @ordered
	 */
	protected String onmouseout = ONMOUSEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseover() <em>Onmouseover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseover()
	 * @generated
	 * @ordered
	 */
	protected static final String ONMOUSEOVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseover() <em>Onmouseover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseover()
	 * @generated
	 * @ordered
	 */
	protected String onmouseover = ONMOUSEOVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseup() <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseup()
	 * @generated
	 * @ordered
	 */
	protected static final String ONMOUSEUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseup() <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseup()
	 * @generated
	 * @ordered
	 */
	protected String onmouseup = ONMOUSEUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * This is true if the Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Xml3dTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xml3dPackage.Literals.XML3D_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChildren() {
		if (children == null) {
			children = new BasicFeatureMap(this, Xml3dPackage.XML3D_TYPE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefsType> getDefs() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_TYPE__DEFS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeshType> getMesh() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_TYPE__MESH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupType> getGroup() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewType> getView() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_TYPE__VIEW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LightType> getLight() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_TYPE__LIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getChildren().list(Xml3dPackage.Literals.XML3D_TYPE__SCRIPT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewType getActiveView() {
		if (activeView != null && activeView.eIsProxy()) {
			InternalEObject oldActiveView = (InternalEObject)activeView;
			activeView = (ViewType)eResolveProxy(oldActiveView);
			if (activeView != oldActiveView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xml3dPackage.XML3D_TYPE__ACTIVE_VIEW, oldActiveView, activeView));
			}
		}
		return activeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewType basicGetActiveView() {
		return activeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveView(ViewType newActiveView) {
		ViewType oldActiveView = activeView;
		activeView = newActiveView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ACTIVE_VIEW, oldActiveView, activeView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		boolean oldHeightESet = heightESet;
		heightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__HEIGHT, oldHeight, height, !oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeight() {
		int oldHeight = height;
		boolean oldHeightESet = heightESet;
		height = HEIGHT_EDEFAULT;
		heightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.XML3D_TYPE__HEIGHT, oldHeight, HEIGHT_EDEFAULT, oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeight() {
		return heightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnclick() {
		return onclick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnclick(String newOnclick) {
		String oldOnclick = onclick;
		onclick = newOnclick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ONCLICK, oldOnclick, onclick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOndblclick() {
		return ondblclick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOndblclick(String newOndblclick) {
		String oldOndblclick = ondblclick;
		ondblclick = newOndblclick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ONDBLCLICK, oldOndblclick, ondblclick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOndrop() {
		return ondrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOndrop(String newOndrop) {
		String oldOndrop = ondrop;
		ondrop = newOndrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ONDROP, oldOndrop, ondrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnkeydown() {
		return onkeydown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnkeydown(String newOnkeydown) {
		String oldOnkeydown = onkeydown;
		onkeydown = newOnkeydown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ONKEYDOWN, oldOnkeydown, onkeydown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnkeypress() {
		return onkeypress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnkeypress(String newOnkeypress) {
		String oldOnkeypress = onkeypress;
		onkeypress = newOnkeypress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ONKEYPRESS, oldOnkeypress, onkeypress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnkeyup() {
		return onkeyup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnkeyup(String newOnkeyup) {
		String oldOnkeyup = onkeyup;
		onkeyup = newOnkeyup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ONKEYUP, oldOnkeyup, onkeyup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnmousedown() {
		return onmousedown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnmousedown(String newOnmousedown) {
		String oldOnmousedown = onmousedown;
		onmousedown = newOnmousedown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ONMOUSEDOWN, oldOnmousedown, onmousedown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnmousemove() {
		return onmousemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnmousemove(String newOnmousemove) {
		String oldOnmousemove = onmousemove;
		onmousemove = newOnmousemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ONMOUSEMOVE, oldOnmousemove, onmousemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnmouseout() {
		return onmouseout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnmouseout(String newOnmouseout) {
		String oldOnmouseout = onmouseout;
		onmouseout = newOnmouseout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ONMOUSEOUT, oldOnmouseout, onmouseout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnmouseover() {
		return onmouseover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnmouseover(String newOnmouseover) {
		String oldOnmouseover = onmouseover;
		onmouseover = newOnmouseover;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ONMOUSEOVER, oldOnmouseover, onmouseover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnmouseup() {
		return onmouseup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnmouseup(String newOnmouseup) {
		String oldOnmouseup = onmouseup;
		onmouseup = newOnmouseup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__ONMOUSEUP, oldOnmouseup, onmouseup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		boolean oldWidthESet = widthESet;
		widthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xml3dPackage.XML3D_TYPE__WIDTH, oldWidth, width, !oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidth() {
		int oldWidth = width;
		boolean oldWidthESet = widthESet;
		width = WIDTH_EDEFAULT;
		widthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xml3dPackage.XML3D_TYPE__WIDTH, oldWidth, WIDTH_EDEFAULT, oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidth() {
		return widthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xml3dPackage.XML3D_TYPE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_TYPE__DEFS:
				return ((InternalEList<?>)getDefs()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_TYPE__MESH:
				return ((InternalEList<?>)getMesh()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_TYPE__VIEW:
				return ((InternalEList<?>)getView()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_TYPE__LIGHT:
				return ((InternalEList<?>)getLight()).basicRemove(otherEnd, msgs);
			case Xml3dPackage.XML3D_TYPE__SCRIPT:
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
			case Xml3dPackage.XML3D_TYPE__CHILDREN:
				if (coreType) return getChildren();
				return ((FeatureMap.Internal)getChildren()).getWrapper();
			case Xml3dPackage.XML3D_TYPE__DEFS:
				return getDefs();
			case Xml3dPackage.XML3D_TYPE__MESH:
				return getMesh();
			case Xml3dPackage.XML3D_TYPE__GROUP:
				return getGroup();
			case Xml3dPackage.XML3D_TYPE__VIEW:
				return getView();
			case Xml3dPackage.XML3D_TYPE__LIGHT:
				return getLight();
			case Xml3dPackage.XML3D_TYPE__SCRIPT:
				return getScript();
			case Xml3dPackage.XML3D_TYPE__ACTIVE_VIEW:
				if (resolve) return getActiveView();
				return basicGetActiveView();
			case Xml3dPackage.XML3D_TYPE__HEIGHT:
				return getHeight();
			case Xml3dPackage.XML3D_TYPE__ONCLICK:
				return getOnclick();
			case Xml3dPackage.XML3D_TYPE__ONDBLCLICK:
				return getOndblclick();
			case Xml3dPackage.XML3D_TYPE__ONDROP:
				return getOndrop();
			case Xml3dPackage.XML3D_TYPE__ONKEYDOWN:
				return getOnkeydown();
			case Xml3dPackage.XML3D_TYPE__ONKEYPRESS:
				return getOnkeypress();
			case Xml3dPackage.XML3D_TYPE__ONKEYUP:
				return getOnkeyup();
			case Xml3dPackage.XML3D_TYPE__ONMOUSEDOWN:
				return getOnmousedown();
			case Xml3dPackage.XML3D_TYPE__ONMOUSEMOVE:
				return getOnmousemove();
			case Xml3dPackage.XML3D_TYPE__ONMOUSEOUT:
				return getOnmouseout();
			case Xml3dPackage.XML3D_TYPE__ONMOUSEOVER:
				return getOnmouseover();
			case Xml3dPackage.XML3D_TYPE__ONMOUSEUP:
				return getOnmouseup();
			case Xml3dPackage.XML3D_TYPE__WIDTH:
				return getWidth();
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
			case Xml3dPackage.XML3D_TYPE__CHILDREN:
				((FeatureMap.Internal)getChildren()).set(newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__DEFS:
				getDefs().clear();
				getDefs().addAll((Collection<? extends DefsType>)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__MESH:
				getMesh().clear();
				getMesh().addAll((Collection<? extends MeshType>)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends GroupType>)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__VIEW:
				getView().clear();
				getView().addAll((Collection<? extends ViewType>)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__LIGHT:
				getLight().clear();
				getLight().addAll((Collection<? extends LightType>)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ACTIVE_VIEW:
				setActiveView((ViewType)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ONCLICK:
				setOnclick((String)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ONDBLCLICK:
				setOndblclick((String)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ONDROP:
				setOndrop((String)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ONKEYDOWN:
				setOnkeydown((String)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ONKEYPRESS:
				setOnkeypress((String)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ONKEYUP:
				setOnkeyup((String)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ONMOUSEDOWN:
				setOnmousedown((String)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ONMOUSEMOVE:
				setOnmousemove((String)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ONMOUSEOUT:
				setOnmouseout((String)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ONMOUSEOVER:
				setOnmouseover((String)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__ONMOUSEUP:
				setOnmouseup((String)newValue);
				return;
			case Xml3dPackage.XML3D_TYPE__WIDTH:
				setWidth((Integer)newValue);
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
			case Xml3dPackage.XML3D_TYPE__CHILDREN:
				getChildren().clear();
				return;
			case Xml3dPackage.XML3D_TYPE__DEFS:
				getDefs().clear();
				return;
			case Xml3dPackage.XML3D_TYPE__MESH:
				getMesh().clear();
				return;
			case Xml3dPackage.XML3D_TYPE__GROUP:
				getGroup().clear();
				return;
			case Xml3dPackage.XML3D_TYPE__VIEW:
				getView().clear();
				return;
			case Xml3dPackage.XML3D_TYPE__LIGHT:
				getLight().clear();
				return;
			case Xml3dPackage.XML3D_TYPE__SCRIPT:
				getScript().clear();
				return;
			case Xml3dPackage.XML3D_TYPE__ACTIVE_VIEW:
				setActiveView((ViewType)null);
				return;
			case Xml3dPackage.XML3D_TYPE__HEIGHT:
				unsetHeight();
				return;
			case Xml3dPackage.XML3D_TYPE__ONCLICK:
				setOnclick(ONCLICK_EDEFAULT);
				return;
			case Xml3dPackage.XML3D_TYPE__ONDBLCLICK:
				setOndblclick(ONDBLCLICK_EDEFAULT);
				return;
			case Xml3dPackage.XML3D_TYPE__ONDROP:
				setOndrop(ONDROP_EDEFAULT);
				return;
			case Xml3dPackage.XML3D_TYPE__ONKEYDOWN:
				setOnkeydown(ONKEYDOWN_EDEFAULT);
				return;
			case Xml3dPackage.XML3D_TYPE__ONKEYPRESS:
				setOnkeypress(ONKEYPRESS_EDEFAULT);
				return;
			case Xml3dPackage.XML3D_TYPE__ONKEYUP:
				setOnkeyup(ONKEYUP_EDEFAULT);
				return;
			case Xml3dPackage.XML3D_TYPE__ONMOUSEDOWN:
				setOnmousedown(ONMOUSEDOWN_EDEFAULT);
				return;
			case Xml3dPackage.XML3D_TYPE__ONMOUSEMOVE:
				setOnmousemove(ONMOUSEMOVE_EDEFAULT);
				return;
			case Xml3dPackage.XML3D_TYPE__ONMOUSEOUT:
				setOnmouseout(ONMOUSEOUT_EDEFAULT);
				return;
			case Xml3dPackage.XML3D_TYPE__ONMOUSEOVER:
				setOnmouseover(ONMOUSEOVER_EDEFAULT);
				return;
			case Xml3dPackage.XML3D_TYPE__ONMOUSEUP:
				setOnmouseup(ONMOUSEUP_EDEFAULT);
				return;
			case Xml3dPackage.XML3D_TYPE__WIDTH:
				unsetWidth();
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
			case Xml3dPackage.XML3D_TYPE__CHILDREN:
				return children != null && !children.isEmpty();
			case Xml3dPackage.XML3D_TYPE__DEFS:
				return !getDefs().isEmpty();
			case Xml3dPackage.XML3D_TYPE__MESH:
				return !getMesh().isEmpty();
			case Xml3dPackage.XML3D_TYPE__GROUP:
				return !getGroup().isEmpty();
			case Xml3dPackage.XML3D_TYPE__VIEW:
				return !getView().isEmpty();
			case Xml3dPackage.XML3D_TYPE__LIGHT:
				return !getLight().isEmpty();
			case Xml3dPackage.XML3D_TYPE__SCRIPT:
				return !getScript().isEmpty();
			case Xml3dPackage.XML3D_TYPE__ACTIVE_VIEW:
				return activeView != null;
			case Xml3dPackage.XML3D_TYPE__HEIGHT:
				return isSetHeight();
			case Xml3dPackage.XML3D_TYPE__ONCLICK:
				return ONCLICK_EDEFAULT == null ? onclick != null : !ONCLICK_EDEFAULT.equals(onclick);
			case Xml3dPackage.XML3D_TYPE__ONDBLCLICK:
				return ONDBLCLICK_EDEFAULT == null ? ondblclick != null : !ONDBLCLICK_EDEFAULT.equals(ondblclick);
			case Xml3dPackage.XML3D_TYPE__ONDROP:
				return ONDROP_EDEFAULT == null ? ondrop != null : !ONDROP_EDEFAULT.equals(ondrop);
			case Xml3dPackage.XML3D_TYPE__ONKEYDOWN:
				return ONKEYDOWN_EDEFAULT == null ? onkeydown != null : !ONKEYDOWN_EDEFAULT.equals(onkeydown);
			case Xml3dPackage.XML3D_TYPE__ONKEYPRESS:
				return ONKEYPRESS_EDEFAULT == null ? onkeypress != null : !ONKEYPRESS_EDEFAULT.equals(onkeypress);
			case Xml3dPackage.XML3D_TYPE__ONKEYUP:
				return ONKEYUP_EDEFAULT == null ? onkeyup != null : !ONKEYUP_EDEFAULT.equals(onkeyup);
			case Xml3dPackage.XML3D_TYPE__ONMOUSEDOWN:
				return ONMOUSEDOWN_EDEFAULT == null ? onmousedown != null : !ONMOUSEDOWN_EDEFAULT.equals(onmousedown);
			case Xml3dPackage.XML3D_TYPE__ONMOUSEMOVE:
				return ONMOUSEMOVE_EDEFAULT == null ? onmousemove != null : !ONMOUSEMOVE_EDEFAULT.equals(onmousemove);
			case Xml3dPackage.XML3D_TYPE__ONMOUSEOUT:
				return ONMOUSEOUT_EDEFAULT == null ? onmouseout != null : !ONMOUSEOUT_EDEFAULT.equals(onmouseout);
			case Xml3dPackage.XML3D_TYPE__ONMOUSEOVER:
				return ONMOUSEOVER_EDEFAULT == null ? onmouseover != null : !ONMOUSEOVER_EDEFAULT.equals(onmouseover);
			case Xml3dPackage.XML3D_TYPE__ONMOUSEUP:
				return ONMOUSEUP_EDEFAULT == null ? onmouseup != null : !ONMOUSEUP_EDEFAULT.equals(onmouseup);
			case Xml3dPackage.XML3D_TYPE__WIDTH:
				return isSetWidth();
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
		result.append(", height: ");
		if (heightESet) result.append(height); else result.append("<unset>");
		result.append(", onclick: ");
		result.append(onclick);
		result.append(", ondblclick: ");
		result.append(ondblclick);
		result.append(", ondrop: ");
		result.append(ondrop);
		result.append(", onkeydown: ");
		result.append(onkeydown);
		result.append(", onkeypress: ");
		result.append(onkeypress);
		result.append(", onkeyup: ");
		result.append(onkeyup);
		result.append(", onmousedown: ");
		result.append(onmousedown);
		result.append(", onmousemove: ");
		result.append(onmousemove);
		result.append(", onmouseout: ");
		result.append(onmouseout);
		result.append(", onmouseover: ");
		result.append(onmouseover);
		result.append(", onmouseup: ");
		result.append(onmouseup);
		result.append(", width: ");
		if (widthESet) result.append(width); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //Xml3dTypeImpl
