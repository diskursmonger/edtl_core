/*
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EdtlAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("su/nsk/iae/edtl/parser/antlr/internal/InternalEdtl.tokens");
	}
}
