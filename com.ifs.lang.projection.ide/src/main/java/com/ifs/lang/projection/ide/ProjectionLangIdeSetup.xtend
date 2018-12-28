/*
 * generated by Xtext 2.16.0
 */
package com.ifs.lang.projection.ide

import com.google.inject.Guice
import com.ifs.lang.projection.ProjectionLangRuntimeModule
import com.ifs.lang.projection.ProjectionLangStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ProjectionLangIdeSetup extends ProjectionLangStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ProjectionLangRuntimeModule, new ProjectionLangIdeModule))
	}
	
}