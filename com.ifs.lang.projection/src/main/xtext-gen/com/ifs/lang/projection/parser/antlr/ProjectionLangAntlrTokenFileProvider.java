/*
 * generated by Xtext 2.16.0
 */
package com.ifs.lang.projection.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ProjectionLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/ifs/lang/projection/parser/antlr/internal/InternalProjectionLang.tokens");
	}
}
