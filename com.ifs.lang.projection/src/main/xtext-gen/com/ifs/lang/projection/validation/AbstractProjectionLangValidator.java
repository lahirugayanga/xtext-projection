/*
 * generated by Xtext 2.16.0
 */
package com.ifs.lang.projection.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractProjectionLangValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.ifs.lang.projection.projectionLang.ProjectionLangPackage.eINSTANCE);
		return result;
	}
}
