package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMathExp"
    // InternalMyDsl.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleMathExp EOF )
            // InternalMyDsl.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMyDsl.g:62:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__MathExp__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__MathExp__Group__0 )
            // InternalMyDsl.g:69:4: rule__MathExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMyDsl.g:78:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleExp EOF )
            // InternalMyDsl.g:80:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMyDsl.g:87:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Exp__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Exp__Group__0 )
            // InternalMyDsl.g:94:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleExpOp"
    // InternalMyDsl.g:103:1: entryRuleExpOp : ruleExpOp EOF ;
    public final void entryRuleExpOp() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleExpOp EOF )
            // InternalMyDsl.g:105:1: ruleExpOp EOF
            {
             before(grammarAccess.getExpOpRule()); 
            pushFollow(FOLLOW_1);
            ruleExpOp();

            state._fsp--;

             after(grammarAccess.getExpOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpOp"


    // $ANTLR start "ruleExpOp"
    // InternalMyDsl.g:112:1: ruleExpOp : ( ( rule__ExpOp__Alternatives ) ) ;
    public final void ruleExpOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ExpOp__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ExpOp__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ExpOp__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__ExpOp__Alternatives )
            {
             before(grammarAccess.getExpOpAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__ExpOp__Alternatives )
            // InternalMyDsl.g:119:4: rule__ExpOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpOp"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMyDsl.g:128:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleParenthesis EOF )
            // InternalMyDsl.g:130:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMyDsl.g:137:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Parenthesis__Group__0 )
            // InternalMyDsl.g:144:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMyDsl.g:153:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleNumber EOF )
            // InternalMyDsl.g:155:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMyDsl.g:162:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Number__ValueAssignment ) )
            // InternalMyDsl.g:168:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalMyDsl.g:169:3: ( rule__Number__ValueAssignment )
            // InternalMyDsl.g:169:4: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMyDsl.g:178:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleVariableUse EOF )
            // InternalMyDsl.g:180:1: ruleVariableUse EOF
            {
             before(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableUse();

            state._fsp--;

             after(grammarAccess.getVariableUseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMyDsl.g:187:1: ruleVariableUse : ( ( rule__VariableUse__RefAssignment ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__VariableUse__RefAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__VariableUse__RefAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__VariableUse__RefAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__VariableUse__RefAssignment )
            {
             before(grammarAccess.getVariableUseAccess().getRefAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__VariableUse__RefAssignment )
            // InternalMyDsl.g:194:4: rule__VariableUse__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "rule__ExpOp__Alternatives"
    // InternalMyDsl.g:202:1: rule__ExpOp__Alternatives : ( ( ( rule__ExpOp__Group_0__0 ) ) | ( ( rule__ExpOp__Group_1__0 ) ) | ( ( rule__ExpOp__Group_2__0 ) ) | ( ( rule__ExpOp__Group_3__0 ) ) );
    public final void rule__ExpOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( ( ( rule__ExpOp__Group_0__0 ) ) | ( ( rule__ExpOp__Group_1__0 ) ) | ( ( rule__ExpOp__Group_2__0 ) ) | ( ( rule__ExpOp__Group_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:207:2: ( ( rule__ExpOp__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:207:2: ( ( rule__ExpOp__Group_0__0 ) )
                    // InternalMyDsl.g:208:3: ( rule__ExpOp__Group_0__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_0()); 
                    // InternalMyDsl.g:209:3: ( rule__ExpOp__Group_0__0 )
                    // InternalMyDsl.g:209:4: rule__ExpOp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:213:2: ( ( rule__ExpOp__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:213:2: ( ( rule__ExpOp__Group_1__0 ) )
                    // InternalMyDsl.g:214:3: ( rule__ExpOp__Group_1__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_1()); 
                    // InternalMyDsl.g:215:3: ( rule__ExpOp__Group_1__0 )
                    // InternalMyDsl.g:215:4: rule__ExpOp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:219:2: ( ( rule__ExpOp__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:219:2: ( ( rule__ExpOp__Group_2__0 ) )
                    // InternalMyDsl.g:220:3: ( rule__ExpOp__Group_2__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_2()); 
                    // InternalMyDsl.g:221:3: ( rule__ExpOp__Group_2__0 )
                    // InternalMyDsl.g:221:4: rule__ExpOp__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:225:2: ( ( rule__ExpOp__Group_3__0 ) )
                    {
                    // InternalMyDsl.g:225:2: ( ( rule__ExpOp__Group_3__0 ) )
                    // InternalMyDsl.g:226:3: ( rule__ExpOp__Group_3__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_3()); 
                    // InternalMyDsl.g:227:3: ( rule__ExpOp__Group_3__0 )
                    // InternalMyDsl.g:227:4: rule__ExpOp__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Alternatives"


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalMyDsl.g:235:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:239:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalMyDsl.g:240:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MathExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__0"


    // $ANTLR start "rule__MathExp__Group__0__Impl"
    // InternalMyDsl.g:247:1: rule__MathExp__Group__0__Impl : ( 'var' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:251:1: ( ( 'var' ) )
            // InternalMyDsl.g:252:1: ( 'var' )
            {
            // InternalMyDsl.g:252:1: ( 'var' )
            // InternalMyDsl.g:253:2: 'var'
            {
             before(grammarAccess.getMathExpAccess().getVarKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__0__Impl"


    // $ANTLR start "rule__MathExp__Group__1"
    // InternalMyDsl.g:262:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalMyDsl.g:267:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MathExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__1"


    // $ANTLR start "rule__MathExp__Group__1__Impl"
    // InternalMyDsl.g:274:1: rule__MathExp__Group__1__Impl : ( ( rule__MathExp__NameAssignment_1 ) ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:278:1: ( ( ( rule__MathExp__NameAssignment_1 ) ) )
            // InternalMyDsl.g:279:1: ( ( rule__MathExp__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:279:1: ( ( rule__MathExp__NameAssignment_1 ) )
            // InternalMyDsl.g:280:2: ( rule__MathExp__NameAssignment_1 )
            {
             before(grammarAccess.getMathExpAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:281:2: ( rule__MathExp__NameAssignment_1 )
            // InternalMyDsl.g:281:3: rule__MathExp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__1__Impl"


    // $ANTLR start "rule__MathExp__Group__2"
    // InternalMyDsl.g:289:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl rule__MathExp__Group__3 ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:293:1: ( rule__MathExp__Group__2__Impl rule__MathExp__Group__3 )
            // InternalMyDsl.g:294:2: rule__MathExp__Group__2__Impl rule__MathExp__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MathExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__2"


    // $ANTLR start "rule__MathExp__Group__2__Impl"
    // InternalMyDsl.g:301:1: rule__MathExp__Group__2__Impl : ( '=' ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:305:1: ( ( '=' ) )
            // InternalMyDsl.g:306:1: ( '=' )
            {
            // InternalMyDsl.g:306:1: ( '=' )
            // InternalMyDsl.g:307:2: '='
            {
             before(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__2__Impl"


    // $ANTLR start "rule__MathExp__Group__3"
    // InternalMyDsl.g:316:1: rule__MathExp__Group__3 : rule__MathExp__Group__3__Impl ;
    public final void rule__MathExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:320:1: ( rule__MathExp__Group__3__Impl )
            // InternalMyDsl.g:321:2: rule__MathExp__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__3"


    // $ANTLR start "rule__MathExp__Group__3__Impl"
    // InternalMyDsl.g:327:1: rule__MathExp__Group__3__Impl : ( ( rule__MathExp__ExpAssignment_3 ) ) ;
    public final void rule__MathExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( ( rule__MathExp__ExpAssignment_3 ) ) )
            // InternalMyDsl.g:332:1: ( ( rule__MathExp__ExpAssignment_3 ) )
            {
            // InternalMyDsl.g:332:1: ( ( rule__MathExp__ExpAssignment_3 ) )
            // InternalMyDsl.g:333:2: ( rule__MathExp__ExpAssignment_3 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_3()); 
            // InternalMyDsl.g:334:2: ( rule__MathExp__ExpAssignment_3 )
            // InternalMyDsl.g:334:3: rule__MathExp__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__3__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalMyDsl.g:343:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:347:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalMyDsl.g:348:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalMyDsl.g:355:1: rule__Exp__Group__0__Impl : ( ( rule__Exp__LeftAssignment_0 ) ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:359:1: ( ( ( rule__Exp__LeftAssignment_0 ) ) )
            // InternalMyDsl.g:360:1: ( ( rule__Exp__LeftAssignment_0 ) )
            {
            // InternalMyDsl.g:360:1: ( ( rule__Exp__LeftAssignment_0 ) )
            // InternalMyDsl.g:361:2: ( rule__Exp__LeftAssignment_0 )
            {
             before(grammarAccess.getExpAccess().getLeftAssignment_0()); 
            // InternalMyDsl.g:362:2: ( rule__Exp__LeftAssignment_0 )
            // InternalMyDsl.g:362:3: rule__Exp__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalMyDsl.g:370:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:374:1: ( rule__Exp__Group__1__Impl )
            // InternalMyDsl.g:375:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalMyDsl.g:381:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )? ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:385:1: ( ( ( rule__Exp__Group_1__0 )? ) )
            // InternalMyDsl.g:386:1: ( ( rule__Exp__Group_1__0 )? )
            {
            // InternalMyDsl.g:386:1: ( ( rule__Exp__Group_1__0 )? )
            // InternalMyDsl.g:387:2: ( rule__Exp__Group_1__0 )?
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalMyDsl.g:388:2: ( rule__Exp__Group_1__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=16)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:388:3: rule__Exp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalMyDsl.g:397:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:401:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalMyDsl.g:402:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalMyDsl.g:409:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__OperatorAssignment_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:413:1: ( ( ( rule__Exp__OperatorAssignment_1_0 ) ) )
            // InternalMyDsl.g:414:1: ( ( rule__Exp__OperatorAssignment_1_0 ) )
            {
            // InternalMyDsl.g:414:1: ( ( rule__Exp__OperatorAssignment_1_0 ) )
            // InternalMyDsl.g:415:2: ( rule__Exp__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); 
            // InternalMyDsl.g:416:2: ( rule__Exp__OperatorAssignment_1_0 )
            // InternalMyDsl.g:416:3: rule__Exp__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalMyDsl.g:424:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:428:1: ( rule__Exp__Group_1__1__Impl )
            // InternalMyDsl.g:429:2: rule__Exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalMyDsl.g:435:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:439:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalMyDsl.g:440:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:440:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalMyDsl.g:441:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalMyDsl.g:442:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalMyDsl.g:442:3: rule__Exp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_0__0"
    // InternalMyDsl.g:451:1: rule__ExpOp__Group_0__0 : rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1 ;
    public final void rule__ExpOp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:455:1: ( rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1 )
            // InternalMyDsl.g:456:2: rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__ExpOp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__0"


    // $ANTLR start "rule__ExpOp__Group_0__0__Impl"
    // InternalMyDsl.g:463:1: rule__ExpOp__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:467:1: ( ( () ) )
            // InternalMyDsl.g:468:1: ( () )
            {
            // InternalMyDsl.g:468:1: ( () )
            // InternalMyDsl.g:469:2: ()
            {
             before(grammarAccess.getExpOpAccess().getPlusAction_0_0()); 
            // InternalMyDsl.g:470:2: ()
            // InternalMyDsl.g:470:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getPlusAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_0__1"
    // InternalMyDsl.g:478:1: rule__ExpOp__Group_0__1 : rule__ExpOp__Group_0__1__Impl ;
    public final void rule__ExpOp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:482:1: ( rule__ExpOp__Group_0__1__Impl )
            // InternalMyDsl.g:483:2: rule__ExpOp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__1"


    // $ANTLR start "rule__ExpOp__Group_0__1__Impl"
    // InternalMyDsl.g:489:1: rule__ExpOp__Group_0__1__Impl : ( '+' ) ;
    public final void rule__ExpOp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:493:1: ( ( '+' ) )
            // InternalMyDsl.g:494:1: ( '+' )
            {
            // InternalMyDsl.g:494:1: ( '+' )
            // InternalMyDsl.g:495:2: '+'
            {
             before(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_1__0"
    // InternalMyDsl.g:505:1: rule__ExpOp__Group_1__0 : rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1 ;
    public final void rule__ExpOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:509:1: ( rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1 )
            // InternalMyDsl.g:510:2: rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ExpOp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__0"


    // $ANTLR start "rule__ExpOp__Group_1__0__Impl"
    // InternalMyDsl.g:517:1: rule__ExpOp__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:521:1: ( ( () ) )
            // InternalMyDsl.g:522:1: ( () )
            {
            // InternalMyDsl.g:522:1: ( () )
            // InternalMyDsl.g:523:2: ()
            {
             before(grammarAccess.getExpOpAccess().getMinusAction_1_0()); 
            // InternalMyDsl.g:524:2: ()
            // InternalMyDsl.g:524:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getMinusAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_1__1"
    // InternalMyDsl.g:532:1: rule__ExpOp__Group_1__1 : rule__ExpOp__Group_1__1__Impl ;
    public final void rule__ExpOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:536:1: ( rule__ExpOp__Group_1__1__Impl )
            // InternalMyDsl.g:537:2: rule__ExpOp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__1"


    // $ANTLR start "rule__ExpOp__Group_1__1__Impl"
    // InternalMyDsl.g:543:1: rule__ExpOp__Group_1__1__Impl : ( '-' ) ;
    public final void rule__ExpOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:547:1: ( ( '-' ) )
            // InternalMyDsl.g:548:1: ( '-' )
            {
            // InternalMyDsl.g:548:1: ( '-' )
            // InternalMyDsl.g:549:2: '-'
            {
             before(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_2__0"
    // InternalMyDsl.g:559:1: rule__ExpOp__Group_2__0 : rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1 ;
    public final void rule__ExpOp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:563:1: ( rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1 )
            // InternalMyDsl.g:564:2: rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__ExpOp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__0"


    // $ANTLR start "rule__ExpOp__Group_2__0__Impl"
    // InternalMyDsl.g:571:1: rule__ExpOp__Group_2__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:575:1: ( ( () ) )
            // InternalMyDsl.g:576:1: ( () )
            {
            // InternalMyDsl.g:576:1: ( () )
            // InternalMyDsl.g:577:2: ()
            {
             before(grammarAccess.getExpOpAccess().getMultAction_2_0()); 
            // InternalMyDsl.g:578:2: ()
            // InternalMyDsl.g:578:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getMultAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_2__1"
    // InternalMyDsl.g:586:1: rule__ExpOp__Group_2__1 : rule__ExpOp__Group_2__1__Impl ;
    public final void rule__ExpOp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:590:1: ( rule__ExpOp__Group_2__1__Impl )
            // InternalMyDsl.g:591:2: rule__ExpOp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__1"


    // $ANTLR start "rule__ExpOp__Group_2__1__Impl"
    // InternalMyDsl.g:597:1: rule__ExpOp__Group_2__1__Impl : ( '*' ) ;
    public final void rule__ExpOp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:601:1: ( ( '*' ) )
            // InternalMyDsl.g:602:1: ( '*' )
            {
            // InternalMyDsl.g:602:1: ( '*' )
            // InternalMyDsl.g:603:2: '*'
            {
             before(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_3__0"
    // InternalMyDsl.g:613:1: rule__ExpOp__Group_3__0 : rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1 ;
    public final void rule__ExpOp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:617:1: ( rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1 )
            // InternalMyDsl.g:618:2: rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpOp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__0"


    // $ANTLR start "rule__ExpOp__Group_3__0__Impl"
    // InternalMyDsl.g:625:1: rule__ExpOp__Group_3__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:629:1: ( ( () ) )
            // InternalMyDsl.g:630:1: ( () )
            {
            // InternalMyDsl.g:630:1: ( () )
            // InternalMyDsl.g:631:2: ()
            {
             before(grammarAccess.getExpOpAccess().getDivAction_3_0()); 
            // InternalMyDsl.g:632:2: ()
            // InternalMyDsl.g:632:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getDivAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_3__1"
    // InternalMyDsl.g:640:1: rule__ExpOp__Group_3__1 : rule__ExpOp__Group_3__1__Impl ;
    public final void rule__ExpOp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:644:1: ( rule__ExpOp__Group_3__1__Impl )
            // InternalMyDsl.g:645:2: rule__ExpOp__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__1"


    // $ANTLR start "rule__ExpOp__Group_3__1__Impl"
    // InternalMyDsl.g:651:1: rule__ExpOp__Group_3__1__Impl : ( '/' ) ;
    public final void rule__ExpOp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:655:1: ( ( '/' ) )
            // InternalMyDsl.g:656:1: ( '/' )
            {
            // InternalMyDsl.g:656:1: ( '/' )
            // InternalMyDsl.g:657:2: '/'
            {
             before(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalMyDsl.g:667:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalMyDsl.g:672:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalMyDsl.g:679:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:683:1: ( ( '(' ) )
            // InternalMyDsl.g:684:1: ( '(' )
            {
            // InternalMyDsl.g:684:1: ( '(' )
            // InternalMyDsl.g:685:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalMyDsl.g:694:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalMyDsl.g:699:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalMyDsl.g:706:1: rule__Parenthesis__Group__1__Impl : ( ( rule__Parenthesis__ExpAssignment_1 ) ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:710:1: ( ( ( rule__Parenthesis__ExpAssignment_1 ) ) )
            // InternalMyDsl.g:711:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            {
            // InternalMyDsl.g:711:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            // InternalMyDsl.g:712:2: ( rule__Parenthesis__ExpAssignment_1 )
            {
             before(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 
            // InternalMyDsl.g:713:2: ( rule__Parenthesis__ExpAssignment_1 )
            // InternalMyDsl.g:713:3: rule__Parenthesis__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalMyDsl.g:721:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalMyDsl.g:726:2: rule__Parenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalMyDsl.g:732:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:736:1: ( ( ')' ) )
            // InternalMyDsl.g:737:1: ( ')' )
            {
            // InternalMyDsl.g:737:1: ( ')' )
            // InternalMyDsl.g:738:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__MathExp__NameAssignment_1"
    // InternalMyDsl.g:748:1: rule__MathExp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MathExp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:753:2: ( RULE_ID )
            {
            // InternalMyDsl.g:753:2: ( RULE_ID )
            // InternalMyDsl.g:754:3: RULE_ID
            {
             before(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__NameAssignment_1"


    // $ANTLR start "rule__MathExp__ExpAssignment_3"
    // InternalMyDsl.g:763:1: rule__MathExp__ExpAssignment_3 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( ( ruleExp ) )
            // InternalMyDsl.g:768:2: ( ruleExp )
            {
            // InternalMyDsl.g:768:2: ( ruleExp )
            // InternalMyDsl.g:769:3: ruleExp
            {
             before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__ExpAssignment_3"


    // $ANTLR start "rule__Exp__LeftAssignment_0"
    // InternalMyDsl.g:778:1: rule__Exp__LeftAssignment_0 : ( ruleNumber ) ;
    public final void rule__Exp__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( ( ruleNumber ) )
            // InternalMyDsl.g:783:2: ( ruleNumber )
            {
            // InternalMyDsl.g:783:2: ( ruleNumber )
            // InternalMyDsl.g:784:3: ruleNumber
            {
             before(grammarAccess.getExpAccess().getLeftNumberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getExpAccess().getLeftNumberParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__LeftAssignment_0"


    // $ANTLR start "rule__Exp__OperatorAssignment_1_0"
    // InternalMyDsl.g:793:1: rule__Exp__OperatorAssignment_1_0 : ( ruleExpOp ) ;
    public final void rule__Exp__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:797:1: ( ( ruleExpOp ) )
            // InternalMyDsl.g:798:2: ( ruleExpOp )
            {
            // InternalMyDsl.g:798:2: ( ruleExpOp )
            // InternalMyDsl.g:799:3: ruleExpOp
            {
             before(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpOp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__OperatorAssignment_1_0"


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalMyDsl.g:808:1: rule__Exp__RightAssignment_1_1 : ( ruleNumber ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( ruleNumber ) )
            // InternalMyDsl.g:813:2: ( ruleNumber )
            {
            // InternalMyDsl.g:813:2: ( ruleNumber )
            // InternalMyDsl.g:814:3: ruleNumber
            {
             before(grammarAccess.getExpAccess().getRightNumberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightNumberParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__RightAssignment_1_1"


    // $ANTLR start "rule__Parenthesis__ExpAssignment_1"
    // InternalMyDsl.g:823:1: rule__Parenthesis__ExpAssignment_1 : ( ruleExp ) ;
    public final void rule__Parenthesis__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( ( ruleExp ) )
            // InternalMyDsl.g:828:2: ( ruleExp )
            {
            // InternalMyDsl.g:828:2: ( ruleExp )
            // InternalMyDsl.g:829:3: ruleExp
            {
             before(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__ExpAssignment_1"


    // $ANTLR start "rule__Number__ValueAssignment"
    // InternalMyDsl.g:838:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:843:2: ( RULE_INT )
            {
            // InternalMyDsl.g:843:2: ( RULE_INT )
            // InternalMyDsl.g:844:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment"


    // $ANTLR start "rule__VariableUse__RefAssignment"
    // InternalMyDsl.g:853:1: rule__VariableUse__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableUse__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:857:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:858:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:858:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:859:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableUseAccess().getRefMathExpCrossReference_0()); 
            // InternalMyDsl.g:860:3: ( RULE_ID )
            // InternalMyDsl.g:861:4: RULE_ID
            {
             before(grammarAccess.getVariableUseAccess().getRefMathExpIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableUseAccess().getRefMathExpIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableUseAccess().getRefMathExpCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__RefAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}