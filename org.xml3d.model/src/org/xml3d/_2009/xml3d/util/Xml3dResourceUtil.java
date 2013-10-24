package org.xml3d._2009.xml3d.util;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.xml3d._2009.xml3d.Xml3dFactory;
import org.xml3d._2009.xml3d.Xml3dPackage;


public class Xml3dResourceUtil {

	public static ResourceSet createResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new Xml3dResourceFactoryImpl());

		resourceSet.getPackageRegistry().put(Xml3dPackage.eNS_URI, Xml3dPackage.eINSTANCE);
		//resourceSet.getPackageRegistry().put(null, Xml3dPackage.eINSTANCE);
		return resourceSet;
	}

	public static XMLResource createResource(URI uri) {

		Resource resource = createResourceSet().createResource(uri);
		org.xml3d._2009.xml3d.DocumentRoot documentRoot = Xml3dFactory.eINSTANCE.createDocumentRoot();
		documentRoot.getXMLNSPrefixMap().put("", Xml3dPackage.eNS_URI);
		resource.getContents().add(documentRoot);
		return (XMLResource) resource;
	}

	public static Resource loadFile(URI uri, Map<?, ?> options) throws IOException {
		Resource resource = createResourceSet().createResource(uri);
		resource.load(options);
		return resource;
	}

	public static String toString(XMLResource resource, Map<?, ?> options) throws IOException {
		StringWriter writer = new StringWriter();
		URIConverter.WriteableOutputStream uws = new URIConverter.WriteableOutputStream(writer, "UTF-8");
		resource.save(uws, null);
		return writer.toString();
	}


}
