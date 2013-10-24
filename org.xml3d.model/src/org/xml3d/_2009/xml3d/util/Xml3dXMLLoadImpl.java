package org.xml3d._2009.xml3d.util;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Specializes <code>XMLLoadImpl</code> to use <code>Xml3dSAXXMLHandler</code>
 * as default handler.
 * 
 * @author paka
 *
 */
public class Xml3dXMLLoadImpl extends XMLLoadImpl {

	public Xml3dXMLLoadImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected DefaultHandler makeDefaultHandler() {
		return new Xml3dSAXXMLHandler(resource, helper, options);
	}
}
