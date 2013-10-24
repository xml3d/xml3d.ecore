/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xml3d._2009.xml3d.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.xml3d._2009.xml3d.util.Xml3dResourceFactoryImpl
 * @generated
 */
public class Xml3dResourceImpl extends XMLResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated not
	 */
	public Xml3dResourceImpl(URI uri) {
		super(uri);
		setIntrinsicIDToEObjectMap(getIDToEObjectMap());
	}
	
	@Override
	protected XMLLoad createXMLLoad() {
		return new Xml3dXMLLoadImpl(createXMLHelper());
	}

} //Xml3dResourceImpl
