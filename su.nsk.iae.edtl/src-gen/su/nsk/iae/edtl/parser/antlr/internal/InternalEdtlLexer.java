package su.nsk.iae.edtl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEdtlLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_INTERVAL=11;
    public static final int RULE_DECL_SYMB=4;
    public static final int RULE_BIT=17;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_DIRECT_SIZE_PREFIX=13;
    public static final int RULE_ID=7;
    public static final int RULE_BOOLEAN_LITERAL=8;
    public static final int RULE_DIGIT=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=19;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DIRECT_VARIABLE=6;
    public static final int RULE_DIRECT_TYPE_PREFIX=12;
    public static final int RULE_STRING=9;
    public static final int RULE_OR_OPERATOR=10;
    public static final int RULE_SL_COMMENT=20;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OCTAL_DIGIT=14;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=21;
    public static final int RULE_LETTER=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=18;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=5;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalEdtlLexer() {;} 
    public InternalEdtlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEdtlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEdtl.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:11:7: ( 'BOOL' )
            // InternalEdtl.g:11:9: 'BOOL'
            {
            match("BOOL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:12:7: ( 'INT' )
            // InternalEdtl.g:12:9: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:13:7: ( 'VAR_INPUT' )
            // InternalEdtl.g:13:9: 'VAR_INPUT'
            {
            match("VAR_INPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:14:7: ( 'INPUT_PORTS_COUNTER' )
            // InternalEdtl.g:14:9: 'INPUT_PORTS_COUNTER'
            {
            match("INPUT_PORTS_COUNTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:15:7: ( ';' )
            // InternalEdtl.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:16:7: ( 'END_VAR' )
            // InternalEdtl.g:16:9: 'END_VAR'
            {
            match("END_VAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:17:7: ( 'VAR_OUTPUT' )
            // InternalEdtl.g:17:9: 'VAR_OUTPUT'
            {
            match("VAR_OUTPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:18:7: ( 'OUTPUT_PORTS_COUNTER' )
            // InternalEdtl.g:18:9: 'OUTPUT_PORTS_COUNTER'
            {
            match("OUTPUT_PORTS_COUNTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:19:7: ( 'AT' )
            // InternalEdtl.g:19:9: 'AT'
            {
            match("AT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:20:7: ( ':' )
            // InternalEdtl.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:21:7: ( 'VAR_INIT' )
            // InternalEdtl.g:21:9: 'VAR_INIT'
            {
            match("VAR_INIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:22:7: ( 'ABBR' )
            // InternalEdtl.g:22:9: 'ABBR'
            {
            match("ABBR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:23:7: ( 'END_ABBR' )
            // InternalEdtl.g:23:9: 'END_ABBR'
            {
            match("END_ABBR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:24:7: ( 'MACROS' )
            // InternalEdtl.g:24:9: 'MACROS'
            {
            match("MACROS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:25:7: ( '(' )
            // InternalEdtl.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:26:7: ( ')' )
            // InternalEdtl.g:26:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:27:7: ( 'END_MACROS' )
            // InternalEdtl.g:27:9: 'END_MACROS'
            {
            match("END_MACROS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:28:7: ( ',' )
            // InternalEdtl.g:28:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:29:7: ( 'REQ' )
            // InternalEdtl.g:29:9: 'REQ'
            {
            match("REQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:30:7: ( 'TRIGGER' )
            // InternalEdtl.g:30:9: 'TRIGGER'
            {
            match("TRIGGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:31:7: ( 'NL:' )
            // InternalEdtl.g:31:9: 'NL:'
            {
            match("NL:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:32:7: ( 'INVARIANT' )
            // InternalEdtl.g:32:9: 'INVARIANT'
            {
            match("INVARIANT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:33:7: ( 'FINAL' )
            // InternalEdtl.g:33:9: 'FINAL'
            {
            match("FINAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:34:7: ( 'DELAY' )
            // InternalEdtl.g:34:9: 'DELAY'
            {
            match("DELAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:35:7: ( 'REACTION' )
            // InternalEdtl.g:35:9: 'REACTION'
            {
            match("REACTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:36:7: ( 'RELEASE' )
            // InternalEdtl.g:36:9: 'RELEASE'
            {
            match("RELEASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:37:7: ( 'END_REQ' )
            // InternalEdtl.g:37:9: 'END_REQ'
            {
            match("END_REQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:38:7: ( 'XOR' )
            // InternalEdtl.g:38:9: 'XOR'
            {
            match("XOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:39:7: ( '&&' )
            // InternalEdtl.g:39:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:40:7: ( 'AND' )
            // InternalEdtl.g:40:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:41:7: ( 'FE' )
            // InternalEdtl.g:41:9: 'FE'
            {
            match("FE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:42:7: ( 'RE' )
            // InternalEdtl.g:42:9: 'RE'
            {
            match("RE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:43:7: ( 'HIGH' )
            // InternalEdtl.g:43:9: 'HIGH'
            {
            match("HIGH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:44:7: ( 'LOW' )
            // InternalEdtl.g:44:9: 'LOW'
            {
            match("LOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:45:7: ( 'NOT' )
            // InternalEdtl.g:45:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:46:7: ( '!' )
            // InternalEdtl.g:46:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:47:7: ( 'TAU' )
            // InternalEdtl.g:47:9: 'TAU'
            {
            match("TAU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:48:7: ( '#T' )
            // InternalEdtl.g:48:9: '#T'
            {
            match("#T"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:49:7: ( '==' )
            // InternalEdtl.g:49:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:50:7: ( '<>' )
            // InternalEdtl.g:50:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:51:7: ( '<' )
            // InternalEdtl.g:51:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:52:7: ( '>' )
            // InternalEdtl.g:52:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:53:7: ( '<=' )
            // InternalEdtl.g:53:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:54:7: ( '>=' )
            // InternalEdtl.g:54:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "RULE_DECL_SYMB"
    public final void mRULE_DECL_SYMB() throws RecognitionException {
        try {
            int _type = RULE_DECL_SYMB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:2269:16: ( ':=' )
            // InternalEdtl.g:2269:18: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECL_SYMB"

    // $ANTLR start "RULE_OR_OPERATOR"
    public final void mRULE_OR_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OR_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:2271:18: ( ( '||' | 'OR' ) )
            // InternalEdtl.g:2271:20: ( '||' | 'OR' )
            {
            // InternalEdtl.g:2271:20: ( '||' | 'OR' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='|') ) {
                alt1=1;
            }
            else if ( (LA1_0=='O') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEdtl.g:2271:21: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2271:26: 'OR'
                    {
                    match("OR"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_OPERATOR"

    // $ANTLR start "RULE_INTERVAL"
    public final void mRULE_INTERVAL() throws RecognitionException {
        try {
            int _type = RULE_INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:2273:15: ( ( RULE_INTEGER 'd' )? ( RULE_INTEGER 'h' )? ( RULE_INTEGER 'm' )? ( RULE_INTEGER 's' )? ( RULE_INTEGER 'ms' )? )
            // InternalEdtl.g:2273:17: ( RULE_INTEGER 'd' )? ( RULE_INTEGER 'h' )? ( RULE_INTEGER 'm' )? ( RULE_INTEGER 's' )? ( RULE_INTEGER 'ms' )?
            {
            // InternalEdtl.g:2273:17: ( RULE_INTEGER 'd' )?
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalEdtl.g:2273:18: RULE_INTEGER 'd'
                    {
                    mRULE_INTEGER(); 
                    match('d'); 

                    }
                    break;

            }

            // InternalEdtl.g:2273:37: ( RULE_INTEGER 'h' )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalEdtl.g:2273:38: RULE_INTEGER 'h'
                    {
                    mRULE_INTEGER(); 
                    match('h'); 

                    }
                    break;

            }

            // InternalEdtl.g:2273:57: ( RULE_INTEGER 'm' )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalEdtl.g:2273:58: RULE_INTEGER 'm'
                    {
                    mRULE_INTEGER(); 
                    match('m'); 

                    }
                    break;

            }

            // InternalEdtl.g:2273:77: ( RULE_INTEGER 's' )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalEdtl.g:2273:78: RULE_INTEGER 's'
                    {
                    mRULE_INTEGER(); 
                    match('s'); 

                    }
                    break;

            }

            // InternalEdtl.g:2273:97: ( RULE_INTEGER 'ms' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEdtl.g:2273:98: RULE_INTEGER 'ms'
                    {
                    mRULE_INTEGER(); 
                    match("ms"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERVAL"

    // $ANTLR start "RULE_DIRECT_VARIABLE"
    public final void mRULE_DIRECT_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_DIRECT_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:2275:22: ( '%' RULE_DIRECT_TYPE_PREFIX RULE_DIRECT_SIZE_PREFIX RULE_OCTAL_DIGIT ( '.' RULE_OCTAL_DIGIT )* )
            // InternalEdtl.g:2275:24: '%' RULE_DIRECT_TYPE_PREFIX RULE_DIRECT_SIZE_PREFIX RULE_OCTAL_DIGIT ( '.' RULE_OCTAL_DIGIT )*
            {
            match('%'); 
            mRULE_DIRECT_TYPE_PREFIX(); 
            mRULE_DIRECT_SIZE_PREFIX(); 
            mRULE_OCTAL_DIGIT(); 
            // InternalEdtl.g:2275:93: ( '.' RULE_OCTAL_DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='.') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEdtl.g:2275:94: '.' RULE_OCTAL_DIGIT
            	    {
            	    match('.'); 
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECT_VARIABLE"

    // $ANTLR start "RULE_DIRECT_TYPE_PREFIX"
    public final void mRULE_DIRECT_TYPE_PREFIX() throws RecognitionException {
        try {
            // InternalEdtl.g:2277:34: ( ( 'I' | 'Q' | 'M' ) )
            // InternalEdtl.g:2277:36: ( 'I' | 'Q' | 'M' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='M'||input.LA(1)=='Q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECT_TYPE_PREFIX"

    // $ANTLR start "RULE_DIRECT_SIZE_PREFIX"
    public final void mRULE_DIRECT_SIZE_PREFIX() throws RecognitionException {
        try {
            // InternalEdtl.g:2279:34: ( ( 'X' | 'B' | 'W' | 'D' | 'L' ) )
            // InternalEdtl.g:2279:36: ( 'X' | 'B' | 'W' | 'D' | 'L' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='D'||input.LA(1)=='L'||(input.LA(1)>='W' && input.LA(1)<='X') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECT_SIZE_PREFIX"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:2281:14: ( ( RULE_DIGIT )+ )
            // InternalEdtl.g:2281:16: ( RULE_DIGIT )+
            {
            // InternalEdtl.g:2281:16: ( RULE_DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEdtl.g:2281:16: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalEdtl.g:2283:22: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // InternalEdtl.g:2283:24: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_BIT"
    public final void mRULE_BIT() throws RecognitionException {
        try {
            // InternalEdtl.g:2285:19: ( ( '0' | '1' ) )
            // InternalEdtl.g:2285:21: ( '0' | '1' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            // InternalEdtl.g:2287:27: ( '0' .. '7' )
            // InternalEdtl.g:2287:29: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalEdtl.g:2289:21: ( '0' .. '9' )
            // InternalEdtl.g:2289:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalEdtl.g:2291:25: ( ( RULE_DIGIT | 'A' .. 'F' ) )
            // InternalEdtl.g:2291:27: ( RULE_DIGIT | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_BOOLEAN_LITERAL"
    public final void mRULE_BOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:2293:22: ( ( 'TRUE' | 'FALSE' ) )
            // InternalEdtl.g:2293:24: ( 'TRUE' | 'FALSE' )
            {
            // InternalEdtl.g:2293:24: ( 'TRUE' | 'FALSE' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='T') ) {
                alt9=1;
            }
            else if ( (LA9_0=='F') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEdtl.g:2293:25: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2293:32: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_LITERAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:2295:9: ( RULE_LETTER ( RULE_LETTER | RULE_DIGIT )* )
            // InternalEdtl.g:2295:11: RULE_LETTER ( RULE_LETTER | RULE_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalEdtl.g:2295:23: ( RULE_LETTER | RULE_DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEdtl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:2297:17: ( ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' ) )
            // InternalEdtl.g:2297:19: ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' )
            {
            // InternalEdtl.g:2297:19: ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                alt13=1;
            }
            else if ( (LA13_0=='(') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEdtl.g:2297:20: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // InternalEdtl.g:2297:25: ( options {greedy=false; } : . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='*') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='/') ) {
                                alt11=2;
                            }
                            else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalEdtl.g:2297:53: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match("*/"); 


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2297:62: '(*' ( options {greedy=false; } : . )* '*)'
                    {
                    match("(*"); 

                    // InternalEdtl.g:2297:67: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='*') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1==')') ) {
                                alt12=2;
                            }
                            else if ( ((LA12_1>='\u0000' && LA12_1<='(')||(LA12_1>='*' && LA12_1<='\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalEdtl.g:2297:95: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match("*)"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:2299:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEdtl.g:2299:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEdtl.g:2299:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEdtl.g:2299:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalEdtl.g:2299:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEdtl.g:2299:41: ( '\\r' )? '\\n'
                    {
                    // InternalEdtl.g:2299:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalEdtl.g:2299:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:2301:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEdtl.g:2301:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEdtl.g:2301:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEdtl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:2303:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEdtl.g:2303:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEdtl.g:2303:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEdtl.g:2303:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEdtl.g:2303:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalEdtl.g:2303:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEdtl.g:2303:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2303:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEdtl.g:2303:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalEdtl.g:2303:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEdtl.g:2303:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    public void mTokens() throws RecognitionException {
        // InternalEdtl.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_DECL_SYMB | RULE_OR_OPERATOR | RULE_INTERVAL | RULE_DIRECT_VARIABLE | RULE_INTEGER | RULE_BOOLEAN_LITERAL | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_STRING )
        int alt21=55;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalEdtl.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // InternalEdtl.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // InternalEdtl.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // InternalEdtl.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // InternalEdtl.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // InternalEdtl.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // InternalEdtl.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // InternalEdtl.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // InternalEdtl.g:1:58: T__30
                {
                mT__30(); 

                }
                break;
            case 10 :
                // InternalEdtl.g:1:64: T__31
                {
                mT__31(); 

                }
                break;
            case 11 :
                // InternalEdtl.g:1:70: T__32
                {
                mT__32(); 

                }
                break;
            case 12 :
                // InternalEdtl.g:1:76: T__33
                {
                mT__33(); 

                }
                break;
            case 13 :
                // InternalEdtl.g:1:82: T__34
                {
                mT__34(); 

                }
                break;
            case 14 :
                // InternalEdtl.g:1:88: T__35
                {
                mT__35(); 

                }
                break;
            case 15 :
                // InternalEdtl.g:1:94: T__36
                {
                mT__36(); 

                }
                break;
            case 16 :
                // InternalEdtl.g:1:100: T__37
                {
                mT__37(); 

                }
                break;
            case 17 :
                // InternalEdtl.g:1:106: T__38
                {
                mT__38(); 

                }
                break;
            case 18 :
                // InternalEdtl.g:1:112: T__39
                {
                mT__39(); 

                }
                break;
            case 19 :
                // InternalEdtl.g:1:118: T__40
                {
                mT__40(); 

                }
                break;
            case 20 :
                // InternalEdtl.g:1:124: T__41
                {
                mT__41(); 

                }
                break;
            case 21 :
                // InternalEdtl.g:1:130: T__42
                {
                mT__42(); 

                }
                break;
            case 22 :
                // InternalEdtl.g:1:136: T__43
                {
                mT__43(); 

                }
                break;
            case 23 :
                // InternalEdtl.g:1:142: T__44
                {
                mT__44(); 

                }
                break;
            case 24 :
                // InternalEdtl.g:1:148: T__45
                {
                mT__45(); 

                }
                break;
            case 25 :
                // InternalEdtl.g:1:154: T__46
                {
                mT__46(); 

                }
                break;
            case 26 :
                // InternalEdtl.g:1:160: T__47
                {
                mT__47(); 

                }
                break;
            case 27 :
                // InternalEdtl.g:1:166: T__48
                {
                mT__48(); 

                }
                break;
            case 28 :
                // InternalEdtl.g:1:172: T__49
                {
                mT__49(); 

                }
                break;
            case 29 :
                // InternalEdtl.g:1:178: T__50
                {
                mT__50(); 

                }
                break;
            case 30 :
                // InternalEdtl.g:1:184: T__51
                {
                mT__51(); 

                }
                break;
            case 31 :
                // InternalEdtl.g:1:190: T__52
                {
                mT__52(); 

                }
                break;
            case 32 :
                // InternalEdtl.g:1:196: T__53
                {
                mT__53(); 

                }
                break;
            case 33 :
                // InternalEdtl.g:1:202: T__54
                {
                mT__54(); 

                }
                break;
            case 34 :
                // InternalEdtl.g:1:208: T__55
                {
                mT__55(); 

                }
                break;
            case 35 :
                // InternalEdtl.g:1:214: T__56
                {
                mT__56(); 

                }
                break;
            case 36 :
                // InternalEdtl.g:1:220: T__57
                {
                mT__57(); 

                }
                break;
            case 37 :
                // InternalEdtl.g:1:226: T__58
                {
                mT__58(); 

                }
                break;
            case 38 :
                // InternalEdtl.g:1:232: T__59
                {
                mT__59(); 

                }
                break;
            case 39 :
                // InternalEdtl.g:1:238: T__60
                {
                mT__60(); 

                }
                break;
            case 40 :
                // InternalEdtl.g:1:244: T__61
                {
                mT__61(); 

                }
                break;
            case 41 :
                // InternalEdtl.g:1:250: T__62
                {
                mT__62(); 

                }
                break;
            case 42 :
                // InternalEdtl.g:1:256: T__63
                {
                mT__63(); 

                }
                break;
            case 43 :
                // InternalEdtl.g:1:262: T__64
                {
                mT__64(); 

                }
                break;
            case 44 :
                // InternalEdtl.g:1:268: T__65
                {
                mT__65(); 

                }
                break;
            case 45 :
                // InternalEdtl.g:1:274: RULE_DECL_SYMB
                {
                mRULE_DECL_SYMB(); 

                }
                break;
            case 46 :
                // InternalEdtl.g:1:289: RULE_OR_OPERATOR
                {
                mRULE_OR_OPERATOR(); 

                }
                break;
            case 47 :
                // InternalEdtl.g:1:306: RULE_INTERVAL
                {
                mRULE_INTERVAL(); 

                }
                break;
            case 48 :
                // InternalEdtl.g:1:320: RULE_DIRECT_VARIABLE
                {
                mRULE_DIRECT_VARIABLE(); 

                }
                break;
            case 49 :
                // InternalEdtl.g:1:341: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 50 :
                // InternalEdtl.g:1:354: RULE_BOOLEAN_LITERAL
                {
                mRULE_BOOLEAN_LITERAL(); 

                }
                break;
            case 51 :
                // InternalEdtl.g:1:375: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 52 :
                // InternalEdtl.g:1:383: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 53 :
                // InternalEdtl.g:1:399: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // InternalEdtl.g:1:415: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 55 :
                // InternalEdtl.g:1:423: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA2_eotS =
        "\1\2\3\uffff";
    static final String DFA2_eofS =
        "\4\uffff";
    static final String DFA2_minS =
        "\2\60\2\uffff";
    static final String DFA2_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\12\1",
            "\12\1\52\uffff\1\3\3\uffff\1\2\4\uffff\1\2\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "2273:17: ( RULE_INTEGER 'd' )?";
        }
    }
    static final String DFA3_eotS =
        "\1\2\3\uffff";
    static final String DFA3_eofS =
        "\4\uffff";
    static final String DFA3_minS =
        "\2\60\2\uffff";
    static final String DFA3_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\12\1",
            "\12\1\56\uffff\1\3\4\uffff\1\2\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "2273:37: ( RULE_INTEGER 'h' )?";
        }
    }
    static final String DFA4_eotS =
        "\1\2\2\uffff\1\4\1\uffff";
    static final String DFA4_eofS =
        "\5\uffff";
    static final String DFA4_minS =
        "\2\60\1\uffff\1\163\1\uffff";
    static final String DFA4_maxS =
        "\1\71\1\163\1\uffff\1\163\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA4_specialS =
        "\5\uffff}>";
    static final String[] DFA4_transitionS = {
            "\12\1",
            "\12\1\63\uffff\1\3\5\uffff\1\2",
            "",
            "\1\2",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "2273:57: ( RULE_INTEGER 'm' )?";
        }
    }
    static final String DFA5_eotS =
        "\1\2\3\uffff";
    static final String DFA5_eofS =
        "\4\uffff";
    static final String DFA5_minS =
        "\2\60\2\uffff";
    static final String DFA5_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\1",
            "\12\1\63\uffff\1\2\5\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "2273:77: ( RULE_INTEGER 's' )?";
        }
    }
    static final String DFA21_eotS =
        "\1\35\3\37\1\uffff\3\37\1\55\1\37\1\60\2\uffff\6\37\1\uffff\2\37\3\uffff\1\77\1\101\1\uffff\1\102\6\uffff\5\37\1\33\1\113\2\37\2\uffff\1\37\2\uffff\1\122\5\37\1\131\5\37\7\uffff\1\37\1\140\5\37\1\uffff\1\37\1\147\1\37\1\151\2\37\1\uffff\2\37\1\156\1\uffff\1\157\1\37\1\uffff\2\37\1\163\1\37\1\165\1\166\1\uffff\5\37\1\u0080\1\uffff\1\37\1\uffff\3\37\1\u0085\2\uffff\3\37\1\uffff\1\u0089\2\uffff\11\37\1\uffff\4\37\1\uffff\1\u0097\1\u0085\1\u0098\1\uffff\11\37\1\u00a3\3\37\2\uffff\5\37\1\u00ac\2\37\1\u00af\1\37\1\uffff\1\37\1\u00b2\1\u00b3\3\37\1\u00b7\1\37\1\uffff\1\u00b9\1\37\1\uffff\1\37\1\u00bc\2\uffff\1\37\1\u00be\1\u00bf\1\uffff\1\37\1\uffff\2\37\1\uffff\1\37\2\uffff\1\u00c4\1\u00c5\2\37\2\uffff\17\37\1\u00d7\1\37\1\uffff\1\u00d9\1\uffff";
    static final String DFA21_eofS =
        "\u00da\uffff";
    static final String DFA21_minS =
        "\1\11\1\117\1\116\1\101\1\uffff\1\116\1\122\1\102\1\75\1\101\1\52\2\uffff\1\105\1\101\1\114\1\101\1\105\1\117\1\uffff\1\111\1\117\3\uffff\2\75\1\uffff\1\60\3\uffff\1\52\2\uffff\1\117\1\120\1\122\1\104\1\124\2\60\1\102\1\104\2\uffff\1\103\2\uffff\1\60\1\111\1\125\1\72\1\124\1\116\1\60\2\114\1\122\1\107\1\127\7\uffff\1\114\1\60\1\125\1\101\2\137\1\120\1\uffff\1\122\1\60\1\122\1\60\1\103\1\105\1\uffff\1\107\1\105\1\60\1\uffff\1\60\1\101\1\uffff\1\123\1\101\1\60\1\110\2\60\1\uffff\1\124\1\122\1\111\1\101\1\125\1\60\1\uffff\1\117\1\uffff\1\124\1\101\1\107\1\60\2\uffff\1\114\1\105\1\131\1\uffff\1\60\2\uffff\1\137\1\111\1\116\1\125\1\101\1\102\1\101\1\105\1\124\1\uffff\1\123\1\111\1\123\1\105\1\uffff\3\60\1\uffff\1\120\1\101\1\111\1\124\1\122\1\102\1\103\1\121\1\137\1\60\1\117\1\105\1\122\2\uffff\1\117\1\116\1\125\1\124\1\120\1\60\2\122\1\60\1\120\1\uffff\1\116\2\60\1\122\2\124\1\60\1\125\1\uffff\1\60\1\117\1\uffff\1\117\1\60\2\uffff\1\124\2\60\1\uffff\1\124\1\uffff\1\123\1\122\1\uffff\1\123\2\uffff\2\60\1\124\1\137\2\uffff\1\123\1\103\1\137\1\117\1\103\1\125\1\117\1\116\1\125\1\124\1\116\1\105\1\124\1\122\1\105\1\60\1\122\1\uffff\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\174\1\117\1\116\1\101\1\uffff\1\116\1\125\1\124\1\75\1\101\1\52\2\uffff\1\105\1\122\1\117\1\111\1\105\1\117\1\uffff\1\111\1\117\3\uffff\1\76\1\75\1\uffff\1\163\3\uffff\1\57\2\uffff\1\117\1\126\1\122\1\104\1\124\2\172\1\102\1\104\2\uffff\1\103\2\uffff\1\172\2\125\1\72\1\124\1\116\1\172\2\114\1\122\1\107\1\127\7\uffff\1\114\1\172\1\125\1\101\2\137\1\120\1\uffff\1\122\1\172\1\122\1\172\1\103\1\105\1\uffff\1\107\1\105\1\172\1\uffff\1\172\1\101\1\uffff\1\123\1\101\1\172\1\110\2\172\1\uffff\1\124\1\122\1\117\1\126\1\125\1\172\1\uffff\1\117\1\uffff\1\124\1\101\1\107\1\172\2\uffff\1\114\1\105\1\131\1\uffff\1\172\2\uffff\1\137\1\111\1\116\1\125\1\101\1\102\1\101\1\105\1\124\1\uffff\1\123\1\111\1\123\1\105\1\uffff\3\172\1\uffff\1\120\1\101\1\120\1\124\1\122\1\102\1\103\1\121\1\137\1\172\1\117\1\105\1\122\2\uffff\1\117\1\116\1\125\1\124\1\120\1\172\2\122\1\172\1\120\1\uffff\1\116\2\172\1\122\2\124\1\172\1\125\1\uffff\1\172\1\117\1\uffff\1\117\1\172\2\uffff\1\124\2\172\1\uffff\1\124\1\uffff\1\123\1\122\1\uffff\1\123\2\uffff\2\172\1\124\1\137\2\uffff\1\123\1\103\1\137\1\117\1\103\1\125\1\117\1\116\1\125\1\124\1\116\1\105\1\124\1\122\1\105\1\172\1\122\1\uffff\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\4\uffff\1\5\6\uffff\1\20\1\22\6\uffff\1\35\2\uffff\1\44\1\46\1\47\2\uffff\1\56\1\uffff\1\57\1\60\1\63\1\uffff\1\66\1\67\11\uffff\1\55\1\12\1\uffff\1\64\1\17\14\uffff\1\50\1\53\1\51\1\54\1\52\1\61\1\65\7\uffff\1\11\6\uffff\1\40\3\uffff\1\25\2\uffff\1\37\6\uffff\1\2\6\uffff\1\36\1\uffff\1\23\4\uffff\1\45\1\43\3\uffff\1\34\1\uffff\1\42\1\1\11\uffff\1\14\4\uffff\1\62\3\uffff\1\41\15\uffff\1\27\1\30\12\uffff\1\16\10\uffff\1\6\2\uffff\1\33\2\uffff\1\32\1\24\3\uffff\1\13\1\uffff\1\15\2\uffff\1\31\1\uffff\1\26\1\3\4\uffff\1\7\1\21\21\uffff\1\4\1\uffff\1\10";
    static final String DFA21_specialS =
        "\u00da\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\1\26\1\42\1\27\1\uffff\1\36\1\23\1\42\1\12\1\13\2\uffff\1\14\2\uffff\1\40\12\34\1\10\1\4\1\31\1\30\1\32\2\uffff\1\7\1\1\1\37\1\21\1\5\1\20\1\37\1\24\1\2\2\37\1\25\1\11\1\17\1\6\2\37\1\15\1\37\1\16\1\37\1\3\1\37\1\22\2\37\4\uffff\1\37\1\uffff\32\37\1\uffff\1\33",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "\1\46",
            "\1\50\2\uffff\1\47",
            "\1\52\13\uffff\1\53\5\uffff\1\51",
            "\1\54",
            "\1\56",
            "\1\57",
            "",
            "",
            "\1\61",
            "\1\63\20\uffff\1\62",
            "\1\64\2\uffff\1\65",
            "\1\70\3\uffff\1\67\3\uffff\1\66",
            "\1\71",
            "\1\72",
            "",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "\1\76\1\75",
            "\1\100",
            "",
            "\12\34\52\uffff\1\35\3\uffff\1\35\4\uffff\1\35\5\uffff\1\35",
            "",
            "",
            "",
            "\1\57\4\uffff\1\103",
            "",
            "",
            "\1\104",
            "\1\106\3\uffff\1\105\1\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\116",
            "",
            "",
            "\12\37\7\uffff\1\120\12\37\1\121\4\37\1\117\11\37\4\uffff\1\37\1\uffff\32\37",
            "\1\123\13\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\150",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\164",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\167",
            "\1\170",
            "\1\171\5\uffff\1\172",
            "\1\174\13\uffff\1\175\4\uffff\1\176\3\uffff\1\173",
            "\1\177",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009c\6\uffff\1\u009b",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ad",
            "\1\u00ae",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00b8",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u00bd",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00d8",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_DECL_SYMB | RULE_OR_OPERATOR | RULE_INTERVAL | RULE_DIRECT_VARIABLE | RULE_INTEGER | RULE_BOOLEAN_LITERAL | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_STRING );";
        }
    }
 

}