/*
 * generated by Xtext 2.26.0
 */
package su.nsk.iae.edtl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import su.nsk.iae.edtl.parser.antlr.internal.InternalEdtlParser;
import su.nsk.iae.edtl.services.EdtlGrammarAccess;

public class EdtlParser extends AbstractAntlrParser {

	@Inject
	private EdtlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEdtlParser createParser(XtextTokenStream stream) {
		return new InternalEdtlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public EdtlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EdtlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
