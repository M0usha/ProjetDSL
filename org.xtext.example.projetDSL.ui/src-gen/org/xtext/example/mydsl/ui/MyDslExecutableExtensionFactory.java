/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.projetDSL.ui.internal.ProjetDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ProjetDSLActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ProjetDSLActivator activator = ProjetDSLActivator.getInstance();
		return activator != null ? activator.getInjector(ProjetDSLActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL) : null;
	}

}
