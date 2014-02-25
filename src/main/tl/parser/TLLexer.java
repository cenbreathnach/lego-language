// $ANTLR 3.2 Sep 23, 2009 12:02:23 src/grammar/TL.g 2014-02-25 19:58:34

  package tl.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TLLexer extends Lexer {
    public static final int FUNCTION=16;
    public static final int End=27;
    public static final int LT=49;
    public static final int OParen=59;
    public static final int Assert=24;
    public static final int TERNARY=13;
    public static final int EXP_LIST=10;
    public static final int While=34;
    public static final int ID_LIST=11;
    public static final int Add=50;
    public static final int QMark=64;
    public static final int EOF=-1;
    public static final int Identifier=21;
    public static final int Int=66;
    public static final int FUNC_CALL=8;
    public static final int IF=12;
    public static final int Space=69;
    public static final int Size=25;
    public static final int Assign=62;
    public static final int CParen=60;
    public static final int Number=36;
    public static final int To=33;
    public static final int Comment=68;
    public static final int EXP=9;
    public static final int GTEquals=44;
    public static final int Print=23;
    public static final int CBrace=56;
    public static final int RETURN=5;
    public static final int Do=29;
    public static final int String=39;
    public static final int Or=40;
    public static final int Return=20;
    public static final int Move=26;
    public static final int If=28;
    public static final int Null=38;
    public static final int And=41;
    public static final int CBracket=58;
    public static final int Println=22;
    public static final int In=35;
    public static final int Bool=37;
    public static final int NEquals=43;
    public static final int Subtract=51;
    public static final int Modulus=54;
    public static final int Multiply=52;
    public static final int OBrace=55;
    public static final int NEGATE=15;
    public static final int INDEXES=17;
    public static final int Colon=65;
    public static final int Excl=47;
    public static final int Digit=67;
    public static final int LIST=18;
    public static final int For=32;
    public static final int Divide=53;
    public static final int Def=31;
    public static final int SColon=61;
    public static final int LOOKUP=19;
    public static final int OBracket=57;
    public static final int BLOCK=4;
    public static final int STATEMENTS=6;
    public static final int GT=48;
    public static final int UNARY_MIN=14;
    public static final int ASSIGNMENT=7;
    public static final int Else=30;
    public static final int Equals=42;
    public static final int Comma=63;
    public static final int Pow=46;
    public static final int LTEquals=45;

    // delegates
    // delegators

    public TLLexer() {;} 
    public TLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "src/grammar/TL.g"; }

    // $ANTLR start "Move"
    public final void mMove() throws RecognitionException {
        try {
            int _type = Move;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:192:10: ( 'move' )
            // src/grammar/TL.g:192:12: 'move'
            {
            match("move"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Move"

    // $ANTLR start "Println"
    public final void mPrintln() throws RecognitionException {
        try {
            int _type = Println;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:193:10: ( 'println' )
            // src/grammar/TL.g:193:12: 'println'
            {
            match("println"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Println"

    // $ANTLR start "Print"
    public final void mPrint() throws RecognitionException {
        try {
            int _type = Print;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:194:10: ( 'print' )
            // src/grammar/TL.g:194:12: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Print"

    // $ANTLR start "Assert"
    public final void mAssert() throws RecognitionException {
        try {
            int _type = Assert;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:195:10: ( 'assert' )
            // src/grammar/TL.g:195:12: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Assert"

    // $ANTLR start "Size"
    public final void mSize() throws RecognitionException {
        try {
            int _type = Size;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:196:10: ( 'size' )
            // src/grammar/TL.g:196:12: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Size"

    // $ANTLR start "Def"
    public final void mDef() throws RecognitionException {
        try {
            int _type = Def;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:197:10: ( 'def' )
            // src/grammar/TL.g:197:12: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Def"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:198:10: ( 'if' )
            // src/grammar/TL.g:198:12: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:199:10: ( 'else' )
            // src/grammar/TL.g:199:12: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:200:10: ( 'return' )
            // src/grammar/TL.g:200:12: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:201:10: ( 'for' )
            // src/grammar/TL.g:201:12: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:202:10: ( 'while' )
            // src/grammar/TL.g:202:12: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:203:10: ( 'to' )
            // src/grammar/TL.g:203:12: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "Do"
    public final void mDo() throws RecognitionException {
        try {
            int _type = Do;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:204:10: ( 'do' )
            // src/grammar/TL.g:204:12: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Do"

    // $ANTLR start "End"
    public final void mEnd() throws RecognitionException {
        try {
            int _type = End;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:205:10: ( 'end' )
            // src/grammar/TL.g:205:12: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "End"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:206:10: ( 'in' )
            // src/grammar/TL.g:206:12: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:207:10: ( 'null' )
            // src/grammar/TL.g:207:12: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:209:10: ( '||' )
            // src/grammar/TL.g:209:12: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:210:10: ( '&&' )
            // src/grammar/TL.g:210:12: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Equals"
    public final void mEquals() throws RecognitionException {
        try {
            int _type = Equals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:211:10: ( '==' )
            // src/grammar/TL.g:211:12: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Equals"

    // $ANTLR start "NEquals"
    public final void mNEquals() throws RecognitionException {
        try {
            int _type = NEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:212:10: ( '!=' )
            // src/grammar/TL.g:212:12: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEquals"

    // $ANTLR start "GTEquals"
    public final void mGTEquals() throws RecognitionException {
        try {
            int _type = GTEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:213:10: ( '>=' )
            // src/grammar/TL.g:213:12: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTEquals"

    // $ANTLR start "LTEquals"
    public final void mLTEquals() throws RecognitionException {
        try {
            int _type = LTEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:214:10: ( '<=' )
            // src/grammar/TL.g:214:12: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTEquals"

    // $ANTLR start "Pow"
    public final void mPow() throws RecognitionException {
        try {
            int _type = Pow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:215:10: ( '^' )
            // src/grammar/TL.g:215:12: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pow"

    // $ANTLR start "Excl"
    public final void mExcl() throws RecognitionException {
        try {
            int _type = Excl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:216:10: ( '!' )
            // src/grammar/TL.g:216:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Excl"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:217:10: ( '>' )
            // src/grammar/TL.g:217:12: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:218:10: ( '<' )
            // src/grammar/TL.g:218:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "Add"
    public final void mAdd() throws RecognitionException {
        try {
            int _type = Add;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:219:10: ( '+' )
            // src/grammar/TL.g:219:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Add"

    // $ANTLR start "Subtract"
    public final void mSubtract() throws RecognitionException {
        try {
            int _type = Subtract;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:220:10: ( '-' )
            // src/grammar/TL.g:220:12: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Subtract"

    // $ANTLR start "Multiply"
    public final void mMultiply() throws RecognitionException {
        try {
            int _type = Multiply;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:221:10: ( '*' )
            // src/grammar/TL.g:221:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Multiply"

    // $ANTLR start "Divide"
    public final void mDivide() throws RecognitionException {
        try {
            int _type = Divide;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:222:10: ( '/' )
            // src/grammar/TL.g:222:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Divide"

    // $ANTLR start "Modulus"
    public final void mModulus() throws RecognitionException {
        try {
            int _type = Modulus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:223:10: ( '%' )
            // src/grammar/TL.g:223:12: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Modulus"

    // $ANTLR start "OBrace"
    public final void mOBrace() throws RecognitionException {
        try {
            int _type = OBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:224:10: ( '{' )
            // src/grammar/TL.g:224:12: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBrace"

    // $ANTLR start "CBrace"
    public final void mCBrace() throws RecognitionException {
        try {
            int _type = CBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:225:10: ( '}' )
            // src/grammar/TL.g:225:12: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CBrace"

    // $ANTLR start "OBracket"
    public final void mOBracket() throws RecognitionException {
        try {
            int _type = OBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:226:10: ( '[' )
            // src/grammar/TL.g:226:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBracket"

    // $ANTLR start "CBracket"
    public final void mCBracket() throws RecognitionException {
        try {
            int _type = CBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:227:10: ( ']' )
            // src/grammar/TL.g:227:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CBracket"

    // $ANTLR start "OParen"
    public final void mOParen() throws RecognitionException {
        try {
            int _type = OParen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:228:10: ( '(' )
            // src/grammar/TL.g:228:12: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OParen"

    // $ANTLR start "CParen"
    public final void mCParen() throws RecognitionException {
        try {
            int _type = CParen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:229:10: ( ')' )
            // src/grammar/TL.g:229:12: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CParen"

    // $ANTLR start "SColon"
    public final void mSColon() throws RecognitionException {
        try {
            int _type = SColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:230:10: ( ';' )
            // src/grammar/TL.g:230:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SColon"

    // $ANTLR start "Assign"
    public final void mAssign() throws RecognitionException {
        try {
            int _type = Assign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:231:10: ( '=' )
            // src/grammar/TL.g:231:12: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Assign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:232:10: ( ',' )
            // src/grammar/TL.g:232:12: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "QMark"
    public final void mQMark() throws RecognitionException {
        try {
            int _type = QMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:233:10: ( '?' )
            // src/grammar/TL.g:233:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QMark"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:234:10: ( ':' )
            // src/grammar/TL.g:234:12: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:237:3: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // src/grammar/TL.g:237:6: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // src/grammar/TL.g:238:6: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:242:3: ( Int ( '.' ( Digit )* )? )
            // src/grammar/TL.g:242:6: Int ( '.' ( Digit )* )?
            {
            mInt(); 
            // src/grammar/TL.g:242:10: ( '.' ( Digit )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/grammar/TL.g:242:11: '.' ( Digit )*
                    {
                    match('.'); 
                    // src/grammar/TL.g:242:15: ( Digit )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // src/grammar/TL.g:242:15: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


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
    // $ANTLR end "Number"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:246:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
            // src/grammar/TL.g:246:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // src/grammar/TL.g:246:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/grammar/TL.g:
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:253:3: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // src/grammar/TL.g:253:6: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // src/grammar/TL.g:253:11: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }
                        else if ( (LA5_0=='\\') ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // src/grammar/TL.g:253:12: ~ ( '\"' | '\\\\' )
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
                    	case 2 :
                    	    // src/grammar/TL.g:253:29: '\\\\' ( '\\\\' | '\"' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\\' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // src/grammar/TL.g:254:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // src/grammar/TL.g:254:11: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }
                        else if ( (LA6_0=='\\') ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/grammar/TL.g:254:12: ~ ( '\\'' | '\\\\' )
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
                    	case 2 :
                    	    // src/grammar/TL.g:254:29: '\\\\' ( '\\\\' | '\\'' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\''||input.LA(1)=='\\' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;

              setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:258:3: ( '//' (~ ( '\\r' | '\\n' ) )* | '/*' ( . )* '*/' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='/') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='/') ) {
                    alt10=1;
                }
                else if ( (LA10_1=='*') ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // src/grammar/TL.g:258:6: '//' (~ ( '\\r' | '\\n' ) )*
                    {
                    match("//"); 

                    // src/grammar/TL.g:258:11: (~ ( '\\r' | '\\n' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // src/grammar/TL.g:258:11: ~ ( '\\r' | '\\n' )
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
                    	    break loop8;
                        }
                    } while (true);

                    skip();

                    }
                    break;
                case 2 :
                    // src/grammar/TL.g:259:6: '/*' ( . )* '*/'
                    {
                    match("/*"); 

                    // src/grammar/TL.g:259:11: ( . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='*') ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1=='/') ) {
                                alt9=2;
                            }
                            else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                                alt9=1;
                            }


                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // src/grammar/TL.g:259:11: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match("*/"); 

                    skip();

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comment"

    // $ANTLR start "Space"
    public final void mSpace() throws RecognitionException {
        try {
            int _type = Space;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/TL.g:263:3: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' ) )
            // src/grammar/TL.g:263:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Space"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            // src/grammar/TL.g:267:3: ( '1' .. '9' ( Digit )* | '0' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='1' && LA12_0<='9')) ) {
                alt12=1;
            }
            else if ( (LA12_0=='0') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // src/grammar/TL.g:267:6: '1' .. '9' ( Digit )*
                    {
                    matchRange('1','9'); 
                    // src/grammar/TL.g:267:15: ( Digit )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // src/grammar/TL.g:267:15: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/grammar/TL.g:268:6: '0'
                    {
                    match('0'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // src/grammar/TL.g:272:3: ( '0' .. '9' )
            // src/grammar/TL.g:272:6: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    public void mTokens() throws RecognitionException {
        // src/grammar/TL.g:1:8: ( Move | Println | Print | Assert | Size | Def | If | Else | Return | For | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | SColon | Assign | Comma | QMark | Colon | Bool | Number | Identifier | String | Comment | Space )
        int alt13=48;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // src/grammar/TL.g:1:10: Move
                {
                mMove(); 

                }
                break;
            case 2 :
                // src/grammar/TL.g:1:15: Println
                {
                mPrintln(); 

                }
                break;
            case 3 :
                // src/grammar/TL.g:1:23: Print
                {
                mPrint(); 

                }
                break;
            case 4 :
                // src/grammar/TL.g:1:29: Assert
                {
                mAssert(); 

                }
                break;
            case 5 :
                // src/grammar/TL.g:1:36: Size
                {
                mSize(); 

                }
                break;
            case 6 :
                // src/grammar/TL.g:1:41: Def
                {
                mDef(); 

                }
                break;
            case 7 :
                // src/grammar/TL.g:1:45: If
                {
                mIf(); 

                }
                break;
            case 8 :
                // src/grammar/TL.g:1:48: Else
                {
                mElse(); 

                }
                break;
            case 9 :
                // src/grammar/TL.g:1:53: Return
                {
                mReturn(); 

                }
                break;
            case 10 :
                // src/grammar/TL.g:1:60: For
                {
                mFor(); 

                }
                break;
            case 11 :
                // src/grammar/TL.g:1:64: While
                {
                mWhile(); 

                }
                break;
            case 12 :
                // src/grammar/TL.g:1:70: To
                {
                mTo(); 

                }
                break;
            case 13 :
                // src/grammar/TL.g:1:73: Do
                {
                mDo(); 

                }
                break;
            case 14 :
                // src/grammar/TL.g:1:76: End
                {
                mEnd(); 

                }
                break;
            case 15 :
                // src/grammar/TL.g:1:80: In
                {
                mIn(); 

                }
                break;
            case 16 :
                // src/grammar/TL.g:1:83: Null
                {
                mNull(); 

                }
                break;
            case 17 :
                // src/grammar/TL.g:1:88: Or
                {
                mOr(); 

                }
                break;
            case 18 :
                // src/grammar/TL.g:1:91: And
                {
                mAnd(); 

                }
                break;
            case 19 :
                // src/grammar/TL.g:1:95: Equals
                {
                mEquals(); 

                }
                break;
            case 20 :
                // src/grammar/TL.g:1:102: NEquals
                {
                mNEquals(); 

                }
                break;
            case 21 :
                // src/grammar/TL.g:1:110: GTEquals
                {
                mGTEquals(); 

                }
                break;
            case 22 :
                // src/grammar/TL.g:1:119: LTEquals
                {
                mLTEquals(); 

                }
                break;
            case 23 :
                // src/grammar/TL.g:1:128: Pow
                {
                mPow(); 

                }
                break;
            case 24 :
                // src/grammar/TL.g:1:132: Excl
                {
                mExcl(); 

                }
                break;
            case 25 :
                // src/grammar/TL.g:1:137: GT
                {
                mGT(); 

                }
                break;
            case 26 :
                // src/grammar/TL.g:1:140: LT
                {
                mLT(); 

                }
                break;
            case 27 :
                // src/grammar/TL.g:1:143: Add
                {
                mAdd(); 

                }
                break;
            case 28 :
                // src/grammar/TL.g:1:147: Subtract
                {
                mSubtract(); 

                }
                break;
            case 29 :
                // src/grammar/TL.g:1:156: Multiply
                {
                mMultiply(); 

                }
                break;
            case 30 :
                // src/grammar/TL.g:1:165: Divide
                {
                mDivide(); 

                }
                break;
            case 31 :
                // src/grammar/TL.g:1:172: Modulus
                {
                mModulus(); 

                }
                break;
            case 32 :
                // src/grammar/TL.g:1:180: OBrace
                {
                mOBrace(); 

                }
                break;
            case 33 :
                // src/grammar/TL.g:1:187: CBrace
                {
                mCBrace(); 

                }
                break;
            case 34 :
                // src/grammar/TL.g:1:194: OBracket
                {
                mOBracket(); 

                }
                break;
            case 35 :
                // src/grammar/TL.g:1:203: CBracket
                {
                mCBracket(); 

                }
                break;
            case 36 :
                // src/grammar/TL.g:1:212: OParen
                {
                mOParen(); 

                }
                break;
            case 37 :
                // src/grammar/TL.g:1:219: CParen
                {
                mCParen(); 

                }
                break;
            case 38 :
                // src/grammar/TL.g:1:226: SColon
                {
                mSColon(); 

                }
                break;
            case 39 :
                // src/grammar/TL.g:1:233: Assign
                {
                mAssign(); 

                }
                break;
            case 40 :
                // src/grammar/TL.g:1:240: Comma
                {
                mComma(); 

                }
                break;
            case 41 :
                // src/grammar/TL.g:1:246: QMark
                {
                mQMark(); 

                }
                break;
            case 42 :
                // src/grammar/TL.g:1:252: Colon
                {
                mColon(); 

                }
                break;
            case 43 :
                // src/grammar/TL.g:1:258: Bool
                {
                mBool(); 

                }
                break;
            case 44 :
                // src/grammar/TL.g:1:263: Number
                {
                mNumber(); 

                }
                break;
            case 45 :
                // src/grammar/TL.g:1:270: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 46 :
                // src/grammar/TL.g:1:281: String
                {
                mString(); 

                }
                break;
            case 47 :
                // src/grammar/TL.g:1:288: Comment
                {
                mComment(); 

                }
                break;
            case 48 :
                // src/grammar/TL.g:1:296: Space
                {
                mSpace(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\14\44\2\uffff\1\71\1\73\1\75\1\77\4\uffff\1\101\17\uffff"+
        "\5\44\1\107\1\110\1\111\6\44\1\120\2\44\12\uffff\4\44\1\127\3\uffff"+
        "\1\44\1\131\1\44\1\133\2\44\1\uffff\2\44\1\140\2\44\1\143\1\uffff"+
        "\1\144\1\uffff\1\44\1\uffff\2\44\1\150\1\151\1\uffff\1\153\1\44"+
        "\2\uffff\1\44\1\150\1\156\2\uffff\1\44\1\uffff\1\160\1\161\1\uffff"+
        "\1\162\3\uffff";
    static final String DFA13_eofS =
        "\163\uffff";
    static final String DFA13_minS =
        "\1\11\1\157\1\162\1\163\1\151\1\145\1\146\1\154\1\145\1\141\1\150"+
        "\1\157\1\165\2\uffff\4\75\4\uffff\1\52\17\uffff\1\166\1\151\1\163"+
        "\1\172\1\146\3\60\1\163\1\144\1\164\1\162\1\154\1\151\1\60\1\165"+
        "\1\154\12\uffff\1\145\1\156\2\145\1\60\3\uffff\1\145\1\60\1\165"+
        "\1\60\1\163\1\154\1\uffff\1\145\1\154\1\60\1\164\1\162\1\60\1\uffff"+
        "\1\60\1\uffff\1\162\1\uffff\2\145\2\60\1\uffff\1\60\1\164\2\uffff"+
        "\1\156\2\60\2\uffff\1\156\1\uffff\2\60\1\uffff\1\60\3\uffff";
    static final String DFA13_maxS =
        "\1\175\1\157\1\162\1\163\1\151\1\157\2\156\1\145\1\157\1\150\1\162"+
        "\1\165\2\uffff\4\75\4\uffff\1\57\17\uffff\1\166\1\151\1\163\1\172"+
        "\1\146\3\172\1\163\1\144\1\164\1\162\1\154\1\151\1\172\1\165\1\154"+
        "\12\uffff\1\145\1\156\2\145\1\172\3\uffff\1\145\1\172\1\165\1\172"+
        "\1\163\1\154\1\uffff\1\145\1\154\1\172\1\164\1\162\1\172\1\uffff"+
        "\1\172\1\uffff\1\162\1\uffff\2\145\2\172\1\uffff\1\172\1\164\2\uffff"+
        "\1\156\2\172\2\uffff\1\156\1\uffff\2\172\1\uffff\1\172\3\uffff";
    static final String DFA13_acceptS =
        "\15\uffff\1\21\1\22\4\uffff\1\27\1\33\1\34\1\35\1\uffff\1\37\1\40"+
        "\1\41\1\42\1\43\1\44\1\45\1\46\1\50\1\51\1\52\1\54\1\55\1\56\1\60"+
        "\21\uffff\1\23\1\47\1\24\1\30\1\25\1\31\1\26\1\32\1\57\1\36\5\uffff"+
        "\1\15\1\7\1\17\6\uffff\1\14\6\uffff\1\6\1\uffff\1\16\1\uffff\1\12"+
        "\4\uffff\1\1\2\uffff\1\5\1\10\3\uffff\1\53\1\20\1\uffff\1\3\2\uffff"+
        "\1\13\1\uffff\1\4\1\11\1\2";
    static final String DFA13_specialS =
        "\163\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\46\1\uffff\2\46\22\uffff\1\46\1\20\1\45\2\uffff\1\30\1\16"+
            "\1\45\1\35\1\36\1\26\1\24\1\40\1\25\1\uffff\1\27\12\43\1\42"+
            "\1\37\1\22\1\17\1\21\1\41\1\uffff\32\44\1\33\1\uffff\1\34\1"+
            "\23\1\44\1\uffff\1\3\2\44\1\5\1\7\1\11\2\44\1\6\3\44\1\1\1\14"+
            "\1\44\1\2\1\44\1\10\1\4\1\13\2\44\1\12\3\44\1\31\1\15\1\32",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53\11\uffff\1\54",
            "\1\55\7\uffff\1\56",
            "\1\57\1\uffff\1\60",
            "\1\61",
            "\1\63\15\uffff\1\62",
            "\1\64",
            "\1\65\2\uffff\1\66",
            "\1\67",
            "",
            "",
            "\1\70",
            "\1\72",
            "\1\74",
            "\1\76",
            "",
            "",
            "",
            "",
            "\1\100\4\uffff\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\1\130",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\132",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\141",
            "\1\142",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\152\16\44",
            "\1\154",
            "",
            "",
            "\1\155",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\157",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Move | Println | Print | Assert | Size | Def | If | Else | Return | For | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | SColon | Assign | Comma | QMark | Colon | Bool | Number | Identifier | String | Comment | Space );";
        }
    }
 

}