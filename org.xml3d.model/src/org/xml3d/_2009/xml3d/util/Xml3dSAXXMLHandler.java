package org.xml3d._2009.xml3d.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;

/**
 * Overrides the <code>setValueFromId</code> method to handle URN used as
 * default XML3D shader script identifiers. (URI fragments are required by EMF
 * to identify objects in a resource).
 * 
 * @author paka
 * 
 */
public class Xml3dSAXXMLHandler extends SAXXMLHandler {

	public Xml3dSAXXMLHandler(XMLResource xmiResource, XMLHelper helper,
			Map<?, ?> options) {
		super(xmiResource, helper, options);
	}

	@Override
	protected void setValueFromId(EObject object, EReference eReference,
			String ids) {

		String[] tokens = ids.split("\\s");

		/* In case we have an URN reference, just create a proxy and don't try 
		 * to reolve it.
		 */
		if (tokens.length == 1 &&
				(tokens[0].startsWith("urn:xml3d")
						|| tokens[0].endsWith(".json"))) {
			Object oldAttributes = setAttributes(null);
			// Create a proxy in the correct way and pop it.
			//
			InternalEObject proxy = (InternalEObject) createObjectFromFeatureType(
					object, eReference);
			setAttributes(oldAttributes);
			if (proxy != null) {
				handleProxy(proxy, tokens[0]);
			}
			objects.pop();
			types.pop();
			mixedTargets.pop();
		} else {
			super.setValueFromId(object, eReference, ids);
		}
	}
}
