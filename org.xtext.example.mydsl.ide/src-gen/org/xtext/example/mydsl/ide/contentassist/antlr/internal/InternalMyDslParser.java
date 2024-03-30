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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

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



    // $ANTLR start "entryRuleMathExpression"
    // InternalMyDsl.g:53:1: entryRuleMathExpression : ruleMathExpression EOF ;
    public final void entryRuleMathExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleMathExpression EOF )
            // InternalMyDsl.g:55:1: ruleMathExpression EOF
            {
             before(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getMathExpressionRule()); 
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
    // $ANTLR end "entryRuleMathExpression"


    // $ANTLR start "ruleMathExpression"
    // InternalMyDsl.g:62:1: ruleMathExpression : ( ( ( rule__MathExpression__ExpressionsAssignment ) ) ( ( rule__MathExpression__ExpressionsAssignment )* ) ) ;
    public final void ruleMathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( ( rule__MathExpression__ExpressionsAssignment ) ) ( ( rule__MathExpression__ExpressionsAssignment )* ) ) )
            // InternalMyDsl.g:67:2: ( ( ( rule__MathExpression__ExpressionsAssignment ) ) ( ( rule__MathExpression__ExpressionsAssignment )* ) )
            {
            // InternalMyDsl.g:67:2: ( ( ( rule__MathExpression__ExpressionsAssignment ) ) ( ( rule__MathExpression__ExpressionsAssignment )* ) )
            // InternalMyDsl.g:68:3: ( ( rule__MathExpression__ExpressionsAssignment ) ) ( ( rule__MathExpression__ExpressionsAssignment )* )
            {
            // InternalMyDsl.g:68:3: ( ( rule__MathExpression__ExpressionsAssignment ) )
            // InternalMyDsl.g:69:4: ( rule__MathExpression__ExpressionsAssignment )
            {
             before(grammarAccess.getMathExpressionAccess().getExpressionsAssignment()); 
            // InternalMyDsl.g:70:4: ( rule__MathExpression__ExpressionsAssignment )
            // InternalMyDsl.g:70:5: rule__MathExpression__ExpressionsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__MathExpression__ExpressionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMathExpressionAccess().getExpressionsAssignment()); 

            }

            // InternalMyDsl.g:73:3: ( ( rule__MathExpression__ExpressionsAssignment )* )
            // InternalMyDsl.g:74:4: ( rule__MathExpression__ExpressionsAssignment )*
            {
             before(grammarAccess.getMathExpressionAccess().getExpressionsAssignment()); 
            // InternalMyDsl.g:75:4: ( rule__MathExpression__ExpressionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:75:5: rule__MathExpression__ExpressionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MathExpression__ExpressionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMathExpressionAccess().getExpressionsAssignment()); 

            }


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
    // $ANTLR end "ruleMathExpression"


    // $ANTLR start "entryRuleMathExp"
    // InternalMyDsl.g:85:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMyDsl.g:86:1: ( ruleMathExp EOF )
            // InternalMyDsl.g:87:1: ruleMathExp EOF
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
    // InternalMyDsl.g:94:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:98:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalMyDsl.g:99:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalMyDsl.g:99:2: ( ( rule__MathExp__Group__0 ) )
            // InternalMyDsl.g:100:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalMyDsl.g:101:3: ( rule__MathExp__Group__0 )
            // InternalMyDsl.g:101:4: rule__MathExp__Group__0
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
    // InternalMyDsl.g:110:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMyDsl.g:111:1: ( ruleExp EOF )
            // InternalMyDsl.g:112:1: ruleExp EOF
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
    // InternalMyDsl.g:119:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:123:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalMyDsl.g:124:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalMyDsl.g:124:2: ( ( rule__Exp__Group__0 ) )
            // InternalMyDsl.g:125:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalMyDsl.g:126:3: ( rule__Exp__Group__0 )
            // InternalMyDsl.g:126:4: rule__Exp__Group__0
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


    // $ANTLR start "entryRuleTerm"
    // InternalMyDsl.g:135:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMyDsl.g:136:1: ( ruleTerm EOF )
            // InternalMyDsl.g:137:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMyDsl.g:144:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:148:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalMyDsl.g:149:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalMyDsl.g:149:2: ( ( rule__Term__Group__0 ) )
            // InternalMyDsl.g:150:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalMyDsl.g:151:3: ( rule__Term__Group__0 )
            // InternalMyDsl.g:151:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePrimary"
    // InternalMyDsl.g:160:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMyDsl.g:161:1: ( rulePrimary EOF )
            // InternalMyDsl.g:162:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMyDsl.g:169:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:173:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMyDsl.g:174:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMyDsl.g:174:2: ( ( rule__Primary__Alternatives ) )
            // InternalMyDsl.g:175:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMyDsl.g:176:3: ( rule__Primary__Alternatives )
            // InternalMyDsl.g:176:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleLet"
    // InternalMyDsl.g:185:1: entryRuleLet : ruleLet EOF ;
    public final void entryRuleLet() throws RecognitionException {
        try {
            // InternalMyDsl.g:186:1: ( ruleLet EOF )
            // InternalMyDsl.g:187:1: ruleLet EOF
            {
             before(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_1);
            ruleLet();

            state._fsp--;

             after(grammarAccess.getLetRule()); 
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
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalMyDsl.g:194:1: ruleLet : ( ( rule__Let__Group__0 ) ) ;
    public final void ruleLet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:2: ( ( ( rule__Let__Group__0 ) ) )
            // InternalMyDsl.g:199:2: ( ( rule__Let__Group__0 ) )
            {
            // InternalMyDsl.g:199:2: ( ( rule__Let__Group__0 ) )
            // InternalMyDsl.g:200:3: ( rule__Let__Group__0 )
            {
             before(grammarAccess.getLetAccess().getGroup()); 
            // InternalMyDsl.g:201:3: ( rule__Let__Group__0 )
            // InternalMyDsl.g:201:4: rule__Let__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getGroup()); 

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
    // $ANTLR end "ruleLet"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMyDsl.g:210:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalMyDsl.g:211:1: ( ruleVariableUse EOF )
            // InternalMyDsl.g:212:1: ruleVariableUse EOF
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
    // InternalMyDsl.g:219:1: ruleVariableUse : ( ( rule__VariableUse__Group__0 ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:2: ( ( ( rule__VariableUse__Group__0 ) ) )
            // InternalMyDsl.g:224:2: ( ( rule__VariableUse__Group__0 ) )
            {
            // InternalMyDsl.g:224:2: ( ( rule__VariableUse__Group__0 ) )
            // InternalMyDsl.g:225:3: ( rule__VariableUse__Group__0 )
            {
             before(grammarAccess.getVariableUseAccess().getGroup()); 
            // InternalMyDsl.g:226:3: ( rule__VariableUse__Group__0 )
            // InternalMyDsl.g:226:4: rule__VariableUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getGroup()); 

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


    // $ANTLR start "rule__Exp__Alternatives_1"
    // InternalMyDsl.g:234:1: rule__Exp__Alternatives_1 : ( ( ( rule__Exp__Group_1_0__0 ) ) | ( ( rule__Exp__Group_1_1__0 ) ) );
    public final void rule__Exp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:238:1: ( ( ( rule__Exp__Group_1_0__0 ) ) | ( ( rule__Exp__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:239:2: ( ( rule__Exp__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:239:2: ( ( rule__Exp__Group_1_0__0 ) )
                    // InternalMyDsl.g:240:3: ( rule__Exp__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:241:3: ( rule__Exp__Group_1_0__0 )
                    // InternalMyDsl.g:241:4: rule__Exp__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:245:2: ( ( rule__Exp__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:245:2: ( ( rule__Exp__Group_1_1__0 ) )
                    // InternalMyDsl.g:246:3: ( rule__Exp__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:247:3: ( rule__Exp__Group_1_1__0 )
                    // InternalMyDsl.g:247:4: rule__Exp__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Exp__Alternatives_1"


    // $ANTLR start "rule__Term__Alternatives_1"
    // InternalMyDsl.g:255:1: rule__Term__Alternatives_1 : ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) );
    public final void rule__Term__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:259:1: ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:260:2: ( ( rule__Term__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:260:2: ( ( rule__Term__Group_1_0__0 ) )
                    // InternalMyDsl.g:261:3: ( rule__Term__Group_1_0__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:262:3: ( rule__Term__Group_1_0__0 )
                    // InternalMyDsl.g:262:4: rule__Term__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:266:2: ( ( rule__Term__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:266:2: ( ( rule__Term__Group_1_1__0 ) )
                    // InternalMyDsl.g:267:3: ( rule__Term__Group_1_1__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:268:3: ( rule__Term__Group_1_1__0 )
                    // InternalMyDsl.g:268:4: rule__Term__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Term__Alternatives_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMyDsl.g:276:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleLet ) | ( ruleVariableUse ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:280:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleLet ) | ( ruleVariableUse ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:281:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:281:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMyDsl.g:282:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMyDsl.g:283:3: ( rule__Primary__Group_0__0 )
                    // InternalMyDsl.g:283:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:287:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:287:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMyDsl.g:288:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMyDsl.g:289:3: ( rule__Primary__Group_1__0 )
                    // InternalMyDsl.g:289:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:293:2: ( ruleLet )
                    {
                    // InternalMyDsl.g:293:2: ( ruleLet )
                    // InternalMyDsl.g:294:3: ruleLet
                    {
                     before(grammarAccess.getPrimaryAccess().getLetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLet();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getLetParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:299:2: ( ruleVariableUse )
                    {
                    // InternalMyDsl.g:299:2: ( ruleVariableUse )
                    // InternalMyDsl.g:300:3: ruleVariableUse
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableUse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalMyDsl.g:309:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:313:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalMyDsl.g:314:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:321:1: rule__MathExp__Group__0__Impl : ( 'var' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:325:1: ( ( 'var' ) )
            // InternalMyDsl.g:326:1: ( 'var' )
            {
            // InternalMyDsl.g:326:1: ( 'var' )
            // InternalMyDsl.g:327:2: 'var'
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
    // InternalMyDsl.g:336:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:340:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalMyDsl.g:341:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:348:1: rule__MathExp__Group__1__Impl : ( ( rule__MathExp__NameAssignment_1 ) ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:352:1: ( ( ( rule__MathExp__NameAssignment_1 ) ) )
            // InternalMyDsl.g:353:1: ( ( rule__MathExp__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:353:1: ( ( rule__MathExp__NameAssignment_1 ) )
            // InternalMyDsl.g:354:2: ( rule__MathExp__NameAssignment_1 )
            {
             before(grammarAccess.getMathExpAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:355:2: ( rule__MathExp__NameAssignment_1 )
            // InternalMyDsl.g:355:3: rule__MathExp__NameAssignment_1
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
    // InternalMyDsl.g:363:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl rule__MathExp__Group__3 ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:367:1: ( rule__MathExp__Group__2__Impl rule__MathExp__Group__3 )
            // InternalMyDsl.g:368:2: rule__MathExp__Group__2__Impl rule__MathExp__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:375:1: rule__MathExp__Group__2__Impl : ( '=' ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:379:1: ( ( '=' ) )
            // InternalMyDsl.g:380:1: ( '=' )
            {
            // InternalMyDsl.g:380:1: ( '=' )
            // InternalMyDsl.g:381:2: '='
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
    // InternalMyDsl.g:390:1: rule__MathExp__Group__3 : rule__MathExp__Group__3__Impl ;
    public final void rule__MathExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:394:1: ( rule__MathExp__Group__3__Impl )
            // InternalMyDsl.g:395:2: rule__MathExp__Group__3__Impl
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
    // InternalMyDsl.g:401:1: rule__MathExp__Group__3__Impl : ( ( rule__MathExp__ExpAssignment_3 ) ) ;
    public final void rule__MathExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( ( ( rule__MathExp__ExpAssignment_3 ) ) )
            // InternalMyDsl.g:406:1: ( ( rule__MathExp__ExpAssignment_3 ) )
            {
            // InternalMyDsl.g:406:1: ( ( rule__MathExp__ExpAssignment_3 ) )
            // InternalMyDsl.g:407:2: ( rule__MathExp__ExpAssignment_3 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_3()); 
            // InternalMyDsl.g:408:2: ( rule__MathExp__ExpAssignment_3 )
            // InternalMyDsl.g:408:3: rule__MathExp__ExpAssignment_3
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
    // InternalMyDsl.g:417:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:421:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalMyDsl.g:422:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:429:1: rule__Exp__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:434:1: ( ruleTerm )
            {
            // InternalMyDsl.g:434:1: ( ruleTerm )
            // InternalMyDsl.g:435:2: ruleTerm
            {
             before(grammarAccess.getExpAccess().getTermParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getExpAccess().getTermParserRuleCall_0()); 

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
    // InternalMyDsl.g:444:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( rule__Exp__Group__1__Impl )
            // InternalMyDsl.g:449:2: rule__Exp__Group__1__Impl
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
    // InternalMyDsl.g:455:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Alternatives_1 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:459:1: ( ( ( rule__Exp__Alternatives_1 )* ) )
            // InternalMyDsl.g:460:1: ( ( rule__Exp__Alternatives_1 )* )
            {
            // InternalMyDsl.g:460:1: ( ( rule__Exp__Alternatives_1 )* )
            // InternalMyDsl.g:461:2: ( rule__Exp__Alternatives_1 )*
            {
             before(grammarAccess.getExpAccess().getAlternatives_1()); 
            // InternalMyDsl.g:462:2: ( rule__Exp__Alternatives_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:462:3: rule__Exp__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Exp__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getExpAccess().getAlternatives_1()); 

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


    // $ANTLR start "rule__Exp__Group_1_0__0"
    // InternalMyDsl.g:471:1: rule__Exp__Group_1_0__0 : rule__Exp__Group_1_0__0__Impl rule__Exp__Group_1_0__1 ;
    public final void rule__Exp__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:475:1: ( rule__Exp__Group_1_0__0__Impl rule__Exp__Group_1_0__1 )
            // InternalMyDsl.g:476:2: rule__Exp__Group_1_0__0__Impl rule__Exp__Group_1_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Exp__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0__1();

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
    // $ANTLR end "rule__Exp__Group_1_0__0"


    // $ANTLR start "rule__Exp__Group_1_0__0__Impl"
    // InternalMyDsl.g:483:1: rule__Exp__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:487:1: ( ( () ) )
            // InternalMyDsl.g:488:1: ( () )
            {
            // InternalMyDsl.g:488:1: ( () )
            // InternalMyDsl.g:489:2: ()
            {
             before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0()); 
            // InternalMyDsl.g:490:2: ()
            // InternalMyDsl.g:490:3: 
            {
            }

             after(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0__1"
    // InternalMyDsl.g:498:1: rule__Exp__Group_1_0__1 : rule__Exp__Group_1_0__1__Impl rule__Exp__Group_1_0__2 ;
    public final void rule__Exp__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:502:1: ( rule__Exp__Group_1_0__1__Impl rule__Exp__Group_1_0__2 )
            // InternalMyDsl.g:503:2: rule__Exp__Group_1_0__1__Impl rule__Exp__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Exp__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0__2();

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
    // $ANTLR end "rule__Exp__Group_1_0__1"


    // $ANTLR start "rule__Exp__Group_1_0__1__Impl"
    // InternalMyDsl.g:510:1: rule__Exp__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__Exp__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( ( '+' ) )
            // InternalMyDsl.g:515:1: ( '+' )
            {
            // InternalMyDsl.g:515:1: ( '+' )
            // InternalMyDsl.g:516:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Exp__Group_1_0__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0__2"
    // InternalMyDsl.g:525:1: rule__Exp__Group_1_0__2 : rule__Exp__Group_1_0__2__Impl ;
    public final void rule__Exp__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( rule__Exp__Group_1_0__2__Impl )
            // InternalMyDsl.g:530:2: rule__Exp__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Exp__Group_1_0__2"


    // $ANTLR start "rule__Exp__Group_1_0__2__Impl"
    // InternalMyDsl.g:536:1: rule__Exp__Group_1_0__2__Impl : ( ( rule__Exp__RightAssignment_1_0_2 ) ) ;
    public final void rule__Exp__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( ( rule__Exp__RightAssignment_1_0_2 ) ) )
            // InternalMyDsl.g:541:1: ( ( rule__Exp__RightAssignment_1_0_2 ) )
            {
            // InternalMyDsl.g:541:1: ( ( rule__Exp__RightAssignment_1_0_2 ) )
            // InternalMyDsl.g:542:2: ( rule__Exp__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_0_2()); 
            // InternalMyDsl.g:543:2: ( rule__Exp__RightAssignment_1_0_2 )
            // InternalMyDsl.g:543:3: rule__Exp__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Exp__Group_1_0__2__Impl"


    // $ANTLR start "rule__Exp__Group_1_1__0"
    // InternalMyDsl.g:552:1: rule__Exp__Group_1_1__0 : rule__Exp__Group_1_1__0__Impl rule__Exp__Group_1_1__1 ;
    public final void rule__Exp__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( rule__Exp__Group_1_1__0__Impl rule__Exp__Group_1_1__1 )
            // InternalMyDsl.g:557:2: rule__Exp__Group_1_1__0__Impl rule__Exp__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_1__1();

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
    // $ANTLR end "rule__Exp__Group_1_1__0"


    // $ANTLR start "rule__Exp__Group_1_1__0__Impl"
    // InternalMyDsl.g:564:1: rule__Exp__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:568:1: ( ( () ) )
            // InternalMyDsl.g:569:1: ( () )
            {
            // InternalMyDsl.g:569:1: ( () )
            // InternalMyDsl.g:570:2: ()
            {
             before(grammarAccess.getExpAccess().getMinusLeftAction_1_1_0()); 
            // InternalMyDsl.g:571:2: ()
            // InternalMyDsl.g:571:3: 
            {
            }

             after(grammarAccess.getExpAccess().getMinusLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_1__1"
    // InternalMyDsl.g:579:1: rule__Exp__Group_1_1__1 : rule__Exp__Group_1_1__1__Impl rule__Exp__Group_1_1__2 ;
    public final void rule__Exp__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( rule__Exp__Group_1_1__1__Impl rule__Exp__Group_1_1__2 )
            // InternalMyDsl.g:584:2: rule__Exp__Group_1_1__1__Impl rule__Exp__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Exp__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_1__2();

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
    // $ANTLR end "rule__Exp__Group_1_1__1"


    // $ANTLR start "rule__Exp__Group_1_1__1__Impl"
    // InternalMyDsl.g:591:1: rule__Exp__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__Exp__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( ( '-' ) )
            // InternalMyDsl.g:596:1: ( '-' )
            {
            // InternalMyDsl.g:596:1: ( '-' )
            // InternalMyDsl.g:597:2: '-'
            {
             before(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Exp__Group_1_1__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_1__2"
    // InternalMyDsl.g:606:1: rule__Exp__Group_1_1__2 : rule__Exp__Group_1_1__2__Impl ;
    public final void rule__Exp__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( rule__Exp__Group_1_1__2__Impl )
            // InternalMyDsl.g:611:2: rule__Exp__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Exp__Group_1_1__2"


    // $ANTLR start "rule__Exp__Group_1_1__2__Impl"
    // InternalMyDsl.g:617:1: rule__Exp__Group_1_1__2__Impl : ( ( rule__Exp__RightAssignment_1_1_2 ) ) ;
    public final void rule__Exp__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( ( rule__Exp__RightAssignment_1_1_2 ) ) )
            // InternalMyDsl.g:622:1: ( ( rule__Exp__RightAssignment_1_1_2 ) )
            {
            // InternalMyDsl.g:622:1: ( ( rule__Exp__RightAssignment_1_1_2 ) )
            // InternalMyDsl.g:623:2: ( rule__Exp__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1_2()); 
            // InternalMyDsl.g:624:2: ( rule__Exp__RightAssignment_1_1_2 )
            // InternalMyDsl.g:624:3: rule__Exp__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Exp__Group_1_1__2__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalMyDsl.g:633:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalMyDsl.g:638:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

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
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalMyDsl.g:645:1: rule__Term__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:650:1: ( rulePrimary )
            {
            // InternalMyDsl.g:650:1: ( rulePrimary )
            // InternalMyDsl.g:651:2: rulePrimary
            {
             before(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalMyDsl.g:660:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( rule__Term__Group__1__Impl )
            // InternalMyDsl.g:665:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

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
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalMyDsl.g:671:1: rule__Term__Group__1__Impl : ( ( rule__Term__Alternatives_1 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( ( ( rule__Term__Alternatives_1 )* ) )
            // InternalMyDsl.g:676:1: ( ( rule__Term__Alternatives_1 )* )
            {
            // InternalMyDsl.g:676:1: ( ( rule__Term__Alternatives_1 )* )
            // InternalMyDsl.g:677:2: ( rule__Term__Alternatives_1 )*
            {
             before(grammarAccess.getTermAccess().getAlternatives_1()); 
            // InternalMyDsl.g:678:2: ( rule__Term__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=16)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:678:3: rule__Term__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Term__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0__0"
    // InternalMyDsl.g:687:1: rule__Term__Group_1_0__0 : rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 ;
    public final void rule__Term__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 )
            // InternalMyDsl.g:692:2: rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Term__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__1();

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
    // $ANTLR end "rule__Term__Group_1_0__0"


    // $ANTLR start "rule__Term__Group_1_0__0__Impl"
    // InternalMyDsl.g:699:1: rule__Term__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( ( () ) )
            // InternalMyDsl.g:704:1: ( () )
            {
            // InternalMyDsl.g:704:1: ( () )
            // InternalMyDsl.g:705:2: ()
            {
             before(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); 
            // InternalMyDsl.g:706:2: ()
            // InternalMyDsl.g:706:3: 
            {
            }

             after(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0__1"
    // InternalMyDsl.g:714:1: rule__Term__Group_1_0__1 : rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 ;
    public final void rule__Term__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 )
            // InternalMyDsl.g:719:2: rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Term__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__2();

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
    // $ANTLR end "rule__Term__Group_1_0__1"


    // $ANTLR start "rule__Term__Group_1_0__1__Impl"
    // InternalMyDsl.g:726:1: rule__Term__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Term__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( ( '*' ) )
            // InternalMyDsl.g:731:1: ( '*' )
            {
            // InternalMyDsl.g:731:1: ( '*' )
            // InternalMyDsl.g:732:2: '*'
            {
             before(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Term__Group_1_0__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0__2"
    // InternalMyDsl.g:741:1: rule__Term__Group_1_0__2 : rule__Term__Group_1_0__2__Impl ;
    public final void rule__Term__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( rule__Term__Group_1_0__2__Impl )
            // InternalMyDsl.g:746:2: rule__Term__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Term__Group_1_0__2"


    // $ANTLR start "rule__Term__Group_1_0__2__Impl"
    // InternalMyDsl.g:752:1: rule__Term__Group_1_0__2__Impl : ( ( rule__Term__RightAssignment_1_0_2 ) ) ;
    public final void rule__Term__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( ( rule__Term__RightAssignment_1_0_2 ) ) )
            // InternalMyDsl.g:757:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            {
            // InternalMyDsl.g:757:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            // InternalMyDsl.g:758:2: ( rule__Term__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); 
            // InternalMyDsl.g:759:2: ( rule__Term__RightAssignment_1_0_2 )
            // InternalMyDsl.g:759:3: rule__Term__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Term__Group_1_0__2__Impl"


    // $ANTLR start "rule__Term__Group_1_1__0"
    // InternalMyDsl.g:768:1: rule__Term__Group_1_1__0 : rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 ;
    public final void rule__Term__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 )
            // InternalMyDsl.g:773:2: rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Term__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__1();

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
    // $ANTLR end "rule__Term__Group_1_1__0"


    // $ANTLR start "rule__Term__Group_1_1__0__Impl"
    // InternalMyDsl.g:780:1: rule__Term__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( ( () ) )
            // InternalMyDsl.g:785:1: ( () )
            {
            // InternalMyDsl.g:785:1: ( () )
            // InternalMyDsl.g:786:2: ()
            {
             before(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); 
            // InternalMyDsl.g:787:2: ()
            // InternalMyDsl.g:787:3: 
            {
            }

             after(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1_1__1"
    // InternalMyDsl.g:795:1: rule__Term__Group_1_1__1 : rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 ;
    public final void rule__Term__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 )
            // InternalMyDsl.g:800:2: rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Term__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__2();

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
    // $ANTLR end "rule__Term__Group_1_1__1"


    // $ANTLR start "rule__Term__Group_1_1__1__Impl"
    // InternalMyDsl.g:807:1: rule__Term__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Term__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( ( '/' ) )
            // InternalMyDsl.g:812:1: ( '/' )
            {
            // InternalMyDsl.g:812:1: ( '/' )
            // InternalMyDsl.g:813:2: '/'
            {
             before(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Term__Group_1_1__1__Impl"


    // $ANTLR start "rule__Term__Group_1_1__2"
    // InternalMyDsl.g:822:1: rule__Term__Group_1_1__2 : rule__Term__Group_1_1__2__Impl ;
    public final void rule__Term__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( rule__Term__Group_1_1__2__Impl )
            // InternalMyDsl.g:827:2: rule__Term__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Term__Group_1_1__2"


    // $ANTLR start "rule__Term__Group_1_1__2__Impl"
    // InternalMyDsl.g:833:1: rule__Term__Group_1_1__2__Impl : ( ( rule__Term__RightAssignment_1_1_2 ) ) ;
    public final void rule__Term__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ( rule__Term__RightAssignment_1_1_2 ) ) )
            // InternalMyDsl.g:838:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            {
            // InternalMyDsl.g:838:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            // InternalMyDsl.g:839:2: ( rule__Term__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); 
            // InternalMyDsl.g:840:2: ( rule__Term__RightAssignment_1_1_2 )
            // InternalMyDsl.g:840:3: rule__Term__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Term__Group_1_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMyDsl.g:849:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMyDsl.g:854:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMyDsl.g:861:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:865:1: ( ( () ) )
            // InternalMyDsl.g:866:1: ( () )
            {
            // InternalMyDsl.g:866:1: ( () )
            // InternalMyDsl.g:867:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getMyNumberAction_0_0()); 
            // InternalMyDsl.g:868:2: ()
            // InternalMyDsl.g:868:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getMyNumberAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMyDsl.g:876:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( rule__Primary__Group_0__1__Impl )
            // InternalMyDsl.g:881:2: rule__Primary__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMyDsl.g:887:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalMyDsl.g:892:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalMyDsl.g:892:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalMyDsl.g:893:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalMyDsl.g:894:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalMyDsl.g:894:3: rule__Primary__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMyDsl.g:903:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMyDsl.g:908:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMyDsl.g:915:1: rule__Primary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:919:1: ( ( '(' ) )
            // InternalMyDsl.g:920:1: ( '(' )
            {
            // InternalMyDsl.g:920:1: ( '(' )
            // InternalMyDsl.g:921:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMyDsl.g:930:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMyDsl.g:935:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMyDsl.g:942:1: rule__Primary__Group_1__1__Impl : ( ruleExp ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( ( ruleExp ) )
            // InternalMyDsl.g:947:1: ( ruleExp )
            {
            // InternalMyDsl.g:947:1: ( ruleExp )
            // InternalMyDsl.g:948:2: ruleExp
            {
             before(grammarAccess.getPrimaryAccess().getExpParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalMyDsl.g:957:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( rule__Primary__Group_1__2__Impl )
            // InternalMyDsl.g:962:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalMyDsl.g:968:1: rule__Primary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( ')' ) )
            // InternalMyDsl.g:973:1: ( ')' )
            {
            // InternalMyDsl.g:973:1: ( ')' )
            // InternalMyDsl.g:974:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Let__Group__0"
    // InternalMyDsl.g:984:1: rule__Let__Group__0 : rule__Let__Group__0__Impl rule__Let__Group__1 ;
    public final void rule__Let__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( rule__Let__Group__0__Impl rule__Let__Group__1 )
            // InternalMyDsl.g:989:2: rule__Let__Group__0__Impl rule__Let__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Let__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__1();

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
    // $ANTLR end "rule__Let__Group__0"


    // $ANTLR start "rule__Let__Group__0__Impl"
    // InternalMyDsl.g:996:1: rule__Let__Group__0__Impl : ( () ) ;
    public final void rule__Let__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( ( () ) )
            // InternalMyDsl.g:1001:1: ( () )
            {
            // InternalMyDsl.g:1001:1: ( () )
            // InternalMyDsl.g:1002:2: ()
            {
             before(grammarAccess.getLetAccess().getLetAction_0()); 
            // InternalMyDsl.g:1003:2: ()
            // InternalMyDsl.g:1003:3: 
            {
            }

             after(grammarAccess.getLetAccess().getLetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__0__Impl"


    // $ANTLR start "rule__Let__Group__1"
    // InternalMyDsl.g:1011:1: rule__Let__Group__1 : rule__Let__Group__1__Impl rule__Let__Group__2 ;
    public final void rule__Let__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( rule__Let__Group__1__Impl rule__Let__Group__2 )
            // InternalMyDsl.g:1016:2: rule__Let__Group__1__Impl rule__Let__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Let__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__2();

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
    // $ANTLR end "rule__Let__Group__1"


    // $ANTLR start "rule__Let__Group__1__Impl"
    // InternalMyDsl.g:1023:1: rule__Let__Group__1__Impl : ( 'let' ) ;
    public final void rule__Let__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1027:1: ( ( 'let' ) )
            // InternalMyDsl.g:1028:1: ( 'let' )
            {
            // InternalMyDsl.g:1028:1: ( 'let' )
            // InternalMyDsl.g:1029:2: 'let'
            {
             before(grammarAccess.getLetAccess().getLetKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getLetKeyword_1()); 

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
    // $ANTLR end "rule__Let__Group__1__Impl"


    // $ANTLR start "rule__Let__Group__2"
    // InternalMyDsl.g:1038:1: rule__Let__Group__2 : rule__Let__Group__2__Impl rule__Let__Group__3 ;
    public final void rule__Let__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( rule__Let__Group__2__Impl rule__Let__Group__3 )
            // InternalMyDsl.g:1043:2: rule__Let__Group__2__Impl rule__Let__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Let__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__3();

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
    // $ANTLR end "rule__Let__Group__2"


    // $ANTLR start "rule__Let__Group__2__Impl"
    // InternalMyDsl.g:1050:1: rule__Let__Group__2__Impl : ( ( rule__Let__NameAssignment_2 ) ) ;
    public final void rule__Let__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( ( ( rule__Let__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1055:1: ( ( rule__Let__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1055:1: ( ( rule__Let__NameAssignment_2 ) )
            // InternalMyDsl.g:1056:2: ( rule__Let__NameAssignment_2 )
            {
             before(grammarAccess.getLetAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1057:2: ( rule__Let__NameAssignment_2 )
            // InternalMyDsl.g:1057:3: rule__Let__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Let__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Let__Group__2__Impl"


    // $ANTLR start "rule__Let__Group__3"
    // InternalMyDsl.g:1065:1: rule__Let__Group__3 : rule__Let__Group__3__Impl rule__Let__Group__4 ;
    public final void rule__Let__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( rule__Let__Group__3__Impl rule__Let__Group__4 )
            // InternalMyDsl.g:1070:2: rule__Let__Group__3__Impl rule__Let__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Let__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__4();

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
    // $ANTLR end "rule__Let__Group__3"


    // $ANTLR start "rule__Let__Group__3__Impl"
    // InternalMyDsl.g:1077:1: rule__Let__Group__3__Impl : ( '=' ) ;
    public final void rule__Let__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( ( '=' ) )
            // InternalMyDsl.g:1082:1: ( '=' )
            {
            // InternalMyDsl.g:1082:1: ( '=' )
            // InternalMyDsl.g:1083:2: '='
            {
             before(grammarAccess.getLetAccess().getEqualsSignKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__Let__Group__3__Impl"


    // $ANTLR start "rule__Let__Group__4"
    // InternalMyDsl.g:1092:1: rule__Let__Group__4 : rule__Let__Group__4__Impl rule__Let__Group__5 ;
    public final void rule__Let__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( rule__Let__Group__4__Impl rule__Let__Group__5 )
            // InternalMyDsl.g:1097:2: rule__Let__Group__4__Impl rule__Let__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Let__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__5();

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
    // $ANTLR end "rule__Let__Group__4"


    // $ANTLR start "rule__Let__Group__4__Impl"
    // InternalMyDsl.g:1104:1: rule__Let__Group__4__Impl : ( ( rule__Let__BindAssignment_4 ) ) ;
    public final void rule__Let__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( ( ( rule__Let__BindAssignment_4 ) ) )
            // InternalMyDsl.g:1109:1: ( ( rule__Let__BindAssignment_4 ) )
            {
            // InternalMyDsl.g:1109:1: ( ( rule__Let__BindAssignment_4 ) )
            // InternalMyDsl.g:1110:2: ( rule__Let__BindAssignment_4 )
            {
             before(grammarAccess.getLetAccess().getBindAssignment_4()); 
            // InternalMyDsl.g:1111:2: ( rule__Let__BindAssignment_4 )
            // InternalMyDsl.g:1111:3: rule__Let__BindAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Let__BindAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getBindAssignment_4()); 

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
    // $ANTLR end "rule__Let__Group__4__Impl"


    // $ANTLR start "rule__Let__Group__5"
    // InternalMyDsl.g:1119:1: rule__Let__Group__5 : rule__Let__Group__5__Impl rule__Let__Group__6 ;
    public final void rule__Let__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( rule__Let__Group__5__Impl rule__Let__Group__6 )
            // InternalMyDsl.g:1124:2: rule__Let__Group__5__Impl rule__Let__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Let__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__6();

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
    // $ANTLR end "rule__Let__Group__5"


    // $ANTLR start "rule__Let__Group__5__Impl"
    // InternalMyDsl.g:1131:1: rule__Let__Group__5__Impl : ( 'in' ) ;
    public final void rule__Let__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1135:1: ( ( 'in' ) )
            // InternalMyDsl.g:1136:1: ( 'in' )
            {
            // InternalMyDsl.g:1136:1: ( 'in' )
            // InternalMyDsl.g:1137:2: 'in'
            {
             before(grammarAccess.getLetAccess().getInKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getInKeyword_5()); 

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
    // $ANTLR end "rule__Let__Group__5__Impl"


    // $ANTLR start "rule__Let__Group__6"
    // InternalMyDsl.g:1146:1: rule__Let__Group__6 : rule__Let__Group__6__Impl rule__Let__Group__7 ;
    public final void rule__Let__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( rule__Let__Group__6__Impl rule__Let__Group__7 )
            // InternalMyDsl.g:1151:2: rule__Let__Group__6__Impl rule__Let__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Let__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__7();

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
    // $ANTLR end "rule__Let__Group__6"


    // $ANTLR start "rule__Let__Group__6__Impl"
    // InternalMyDsl.g:1158:1: rule__Let__Group__6__Impl : ( ( rule__Let__VarNameAssignment_6 ) ) ;
    public final void rule__Let__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( ( rule__Let__VarNameAssignment_6 ) ) )
            // InternalMyDsl.g:1163:1: ( ( rule__Let__VarNameAssignment_6 ) )
            {
            // InternalMyDsl.g:1163:1: ( ( rule__Let__VarNameAssignment_6 ) )
            // InternalMyDsl.g:1164:2: ( rule__Let__VarNameAssignment_6 )
            {
             before(grammarAccess.getLetAccess().getVarNameAssignment_6()); 
            // InternalMyDsl.g:1165:2: ( rule__Let__VarNameAssignment_6 )
            // InternalMyDsl.g:1165:3: rule__Let__VarNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Let__VarNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getVarNameAssignment_6()); 

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
    // $ANTLR end "rule__Let__Group__6__Impl"


    // $ANTLR start "rule__Let__Group__7"
    // InternalMyDsl.g:1173:1: rule__Let__Group__7 : rule__Let__Group__7__Impl ;
    public final void rule__Let__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( rule__Let__Group__7__Impl )
            // InternalMyDsl.g:1178:2: rule__Let__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group__7__Impl();

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
    // $ANTLR end "rule__Let__Group__7"


    // $ANTLR start "rule__Let__Group__7__Impl"
    // InternalMyDsl.g:1184:1: rule__Let__Group__7__Impl : ( 'end' ) ;
    public final void rule__Let__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( ( 'end' ) )
            // InternalMyDsl.g:1189:1: ( 'end' )
            {
            // InternalMyDsl.g:1189:1: ( 'end' )
            // InternalMyDsl.g:1190:2: 'end'
            {
             before(grammarAccess.getLetAccess().getEndKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getEndKeyword_7()); 

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
    // $ANTLR end "rule__Let__Group__7__Impl"


    // $ANTLR start "rule__VariableUse__Group__0"
    // InternalMyDsl.g:1200:1: rule__VariableUse__Group__0 : rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 ;
    public final void rule__VariableUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 )
            // InternalMyDsl.g:1205:2: rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VariableUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__1();

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
    // $ANTLR end "rule__VariableUse__Group__0"


    // $ANTLR start "rule__VariableUse__Group__0__Impl"
    // InternalMyDsl.g:1212:1: rule__VariableUse__Group__0__Impl : ( () ) ;
    public final void rule__VariableUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( () ) )
            // InternalMyDsl.g:1217:1: ( () )
            {
            // InternalMyDsl.g:1217:1: ( () )
            // InternalMyDsl.g:1218:2: ()
            {
             before(grammarAccess.getVariableUseAccess().getVariableUseAction_0()); 
            // InternalMyDsl.g:1219:2: ()
            // InternalMyDsl.g:1219:3: 
            {
            }

             after(grammarAccess.getVariableUseAccess().getVariableUseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__0__Impl"


    // $ANTLR start "rule__VariableUse__Group__1"
    // InternalMyDsl.g:1227:1: rule__VariableUse__Group__1 : rule__VariableUse__Group__1__Impl ;
    public final void rule__VariableUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( rule__VariableUse__Group__1__Impl )
            // InternalMyDsl.g:1232:2: rule__VariableUse__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__1__Impl();

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
    // $ANTLR end "rule__VariableUse__Group__1"


    // $ANTLR start "rule__VariableUse__Group__1__Impl"
    // InternalMyDsl.g:1238:1: rule__VariableUse__Group__1__Impl : ( ( rule__VariableUse__NameAssignment_1 ) ) ;
    public final void rule__VariableUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( ( rule__VariableUse__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1243:1: ( ( rule__VariableUse__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1243:1: ( ( rule__VariableUse__NameAssignment_1 ) )
            // InternalMyDsl.g:1244:2: ( rule__VariableUse__NameAssignment_1 )
            {
             before(grammarAccess.getVariableUseAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1245:2: ( rule__VariableUse__NameAssignment_1 )
            // InternalMyDsl.g:1245:3: rule__VariableUse__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VariableUse__Group__1__Impl"


    // $ANTLR start "rule__MathExpression__ExpressionsAssignment"
    // InternalMyDsl.g:1254:1: rule__MathExpression__ExpressionsAssignment : ( ruleMathExp ) ;
    public final void rule__MathExpression__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( ruleMathExp ) )
            // InternalMyDsl.g:1259:2: ( ruleMathExp )
            {
            // InternalMyDsl.g:1259:2: ( ruleMathExp )
            // InternalMyDsl.g:1260:3: ruleMathExp
            {
             before(grammarAccess.getMathExpressionAccess().getExpressionsMathExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpressionAccess().getExpressionsMathExpParserRuleCall_0()); 

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
    // $ANTLR end "rule__MathExpression__ExpressionsAssignment"


    // $ANTLR start "rule__MathExp__NameAssignment_1"
    // InternalMyDsl.g:1269:1: rule__MathExp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MathExp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1274:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1274:2: ( RULE_ID )
            // InternalMyDsl.g:1275:3: RULE_ID
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
    // InternalMyDsl.g:1284:1: rule__MathExp__ExpAssignment_3 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( ( ruleExp ) )
            // InternalMyDsl.g:1289:2: ( ruleExp )
            {
            // InternalMyDsl.g:1289:2: ( ruleExp )
            // InternalMyDsl.g:1290:3: ruleExp
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


    // $ANTLR start "rule__Exp__RightAssignment_1_0_2"
    // InternalMyDsl.g:1299:1: rule__Exp__RightAssignment_1_0_2 : ( ruleTerm ) ;
    public final void rule__Exp__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:1304:2: ( ruleTerm )
            {
            // InternalMyDsl.g:1304:2: ( ruleTerm )
            // InternalMyDsl.g:1305:3: ruleTerm
            {
             before(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Exp__RightAssignment_1_0_2"


    // $ANTLR start "rule__Exp__RightAssignment_1_1_2"
    // InternalMyDsl.g:1314:1: rule__Exp__RightAssignment_1_1_2 : ( ruleTerm ) ;
    public final void rule__Exp__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:1319:2: ( ruleTerm )
            {
            // InternalMyDsl.g:1319:2: ( ruleTerm )
            // InternalMyDsl.g:1320:3: ruleTerm
            {
             before(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Exp__RightAssignment_1_1_2"


    // $ANTLR start "rule__Term__RightAssignment_1_0_2"
    // InternalMyDsl.g:1329:1: rule__Term__RightAssignment_1_0_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:1334:2: ( rulePrimary )
            {
            // InternalMyDsl.g:1334:2: ( rulePrimary )
            // InternalMyDsl.g:1335:3: rulePrimary
            {
             before(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Term__RightAssignment_1_0_2"


    // $ANTLR start "rule__Term__RightAssignment_1_1_2"
    // InternalMyDsl.g:1344:1: rule__Term__RightAssignment_1_1_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:1349:2: ( rulePrimary )
            {
            // InternalMyDsl.g:1349:2: ( rulePrimary )
            // InternalMyDsl.g:1350:3: rulePrimary
            {
             before(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Term__RightAssignment_1_1_2"


    // $ANTLR start "rule__Primary__ValueAssignment_0_1"
    // InternalMyDsl.g:1359:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1364:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1364:2: ( RULE_INT )
            // InternalMyDsl.g:1365:3: RULE_INT
            {
             before(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Primary__ValueAssignment_0_1"


    // $ANTLR start "rule__Let__NameAssignment_2"
    // InternalMyDsl.g:1374:1: rule__Let__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Let__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1379:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1379:2: ( RULE_ID )
            // InternalMyDsl.g:1380:3: RULE_ID
            {
             before(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Let__NameAssignment_2"


    // $ANTLR start "rule__Let__BindAssignment_4"
    // InternalMyDsl.g:1389:1: rule__Let__BindAssignment_4 : ( ruleExp ) ;
    public final void rule__Let__BindAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( ( ruleExp ) )
            // InternalMyDsl.g:1394:2: ( ruleExp )
            {
            // InternalMyDsl.g:1394:2: ( ruleExp )
            // InternalMyDsl.g:1395:3: ruleExp
            {
             before(grammarAccess.getLetAccess().getBindExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetAccess().getBindExpParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Let__BindAssignment_4"


    // $ANTLR start "rule__Let__VarNameAssignment_6"
    // InternalMyDsl.g:1404:1: rule__Let__VarNameAssignment_6 : ( ruleExp ) ;
    public final void rule__Let__VarNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( ( ruleExp ) )
            // InternalMyDsl.g:1409:2: ( ruleExp )
            {
            // InternalMyDsl.g:1409:2: ( ruleExp )
            // InternalMyDsl.g:1410:3: ruleExp
            {
             before(grammarAccess.getLetAccess().getVarNameExpParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetAccess().getVarNameExpParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Let__VarNameAssignment_6"


    // $ANTLR start "rule__VariableUse__NameAssignment_1"
    // InternalMyDsl.g:1419:1: rule__VariableUse__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableUse__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1424:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1424:2: ( RULE_ID )
            // InternalMyDsl.g:1425:3: RULE_ID
            {
             before(grammarAccess.getVariableUseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableUseAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariableUse__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});

}