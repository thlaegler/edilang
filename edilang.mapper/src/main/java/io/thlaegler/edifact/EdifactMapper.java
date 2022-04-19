package io.thlaegler.edifact;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.google.inject.Injector;

import io.thlaegler.edifact.EdilangStandaloneSetup;
import io.thlaegler.edifact.edilang.EdiModel;

public class EdifactMapper {

	private final Injector runtimeInjector;

	private final Injector standaloneInjector;

	private final XtextResourceSet resourceSet;

	private final Serializer serializer;

	public EdifactMapper() {
		this.runtimeInjector = null; // Guice.createInjector(new EdifactLangRuntimeModule());
		this.standaloneInjector = new EdilangStandaloneSetup().createInjectorAndDoEMFRegistration();
		this.serializer = getInjector().getInstance(Serializer.class);
		this.resourceSet = getInjector().getInstance(XtextResourceSet.class);
		this.resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}

	public EdiModel readValue(String edifactString) {
		String resourceUri = "dummy:/example_" + System.currentTimeMillis() + ".edi";
		Resource resource = this.resourceSet.createResource(URI.createURI(resourceUri));
		InputStream in = new ByteArrayInputStream(edifactString.getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
			EdiModel model = (EdiModel) resource.getContents().get(0);
			return model;
		} catch (IOException ex) {
			System.out.println("Failed to load resource " + resourceUri + " " + ex.getMessage());
			return null;
		}
	}

	/**
	 * Convert workspace edifact file to model.
	 * 
	 * @param workspaceUri e.g.
	 *                     URI.createURI("platform:/resource/org.xtext.example.mydsl/src/example.edi")
	 * @return the parsed model
	 */
	public EdiModel readValue(URI workspaceUri) {
		Resource resource = this.resourceSet.getResource(workspaceUri, true);
		EdiModel model = (EdiModel) resource.getContents().get(0);
		return model;
	}

	public String writeValueAsString(EdiModel model) {
		return serializer.serialize(model);
	}

	private Injector getInjector() {
		return standaloneInjector != null ? standaloneInjector : runtimeInjector;
	}

}
