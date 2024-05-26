/*
 * generated by Xtext 2.34.0
 */
package org.xtext.project.tdsl;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Injector;

import thymio_DSL.Thymio_DSLPackage;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class TDslStandaloneSetup extends TDslStandaloneSetupGenerated {

	public static void doSetup() {
		new TDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	public void register(Injector injector) {

        if (!EPackage.Registry.INSTANCE.containsKey(Thymio_DSLPackage.eNS_URI)) {
            EPackage.Registry.INSTANCE.put(Thymio_DSLPackage.eNS_URI, Thymio_DSLPackage.eINSTANCE);
        }
        super.register(injector);
    }
}
