package org.xtext.project.tdsl.ide.contentassist.antlr.internal;

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
import org.xtext.project.tdsl.services.TDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'forward'", "'backward'", "'proximity'", "'black'", "'white'", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'light'", "'dark'", "'red'", "'green'", "'blue'", "'yellow'", "'sound1'", "'sound2'", "'sound3'", "'sound4'", "'center'", "'right'", "'left'", "'touched'", "'released'", "'->'", "'drive'", "'with'", "'speed'", "'turn'", "'stop'", "'driving'", "'turning'", "'play'", "'sound'", "'playing'", "'set'", "'bottom'", "'color'", "'to'", "'off'", "'leds'", "'top'", "'If'", "':'", "'End'", "'if'", "'On'", "'button'", "'do'", "'sensor'", "'detecting'", "'no'", "'tap'", "'clap'", "'front'", "'left/middle'", "'middle'", "'right/middle'", "'horizontal'", "'ground'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTDsl.g"; }


    	private TDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(TDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleThymioDSL"
    // InternalTDsl.g:53:1: entryRuleThymioDSL : ruleThymioDSL EOF ;
    public final void entryRuleThymioDSL() throws RecognitionException {
        try {
            // InternalTDsl.g:54:1: ( ruleThymioDSL EOF )
            // InternalTDsl.g:55:1: ruleThymioDSL EOF
            {
             before(grammarAccess.getThymioDSLRule()); 
            pushFollow(FOLLOW_1);
            ruleThymioDSL();

            state._fsp--;

             after(grammarAccess.getThymioDSLRule()); 
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
    // $ANTLR end "entryRuleThymioDSL"


    // $ANTLR start "ruleThymioDSL"
    // InternalTDsl.g:62:1: ruleThymioDSL : ( ( rule__ThymioDSL__StatementAssignment )* ) ;
    public final void ruleThymioDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:66:2: ( ( ( rule__ThymioDSL__StatementAssignment )* ) )
            // InternalTDsl.g:67:2: ( ( rule__ThymioDSL__StatementAssignment )* )
            {
            // InternalTDsl.g:67:2: ( ( rule__ThymioDSL__StatementAssignment )* )
            // InternalTDsl.g:68:3: ( rule__ThymioDSL__StatementAssignment )*
            {
             before(grammarAccess.getThymioDSLAccess().getStatementAssignment()); 
            // InternalTDsl.g:69:3: ( rule__ThymioDSL__StatementAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTDsl.g:69:4: rule__ThymioDSL__StatementAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ThymioDSL__StatementAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getThymioDSLAccess().getStatementAssignment()); 

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
    // $ANTLR end "ruleThymioDSL"


    // $ANTLR start "entryRuleStatement"
    // InternalTDsl.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalTDsl.g:79:1: ( ruleStatement EOF )
            // InternalTDsl.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTDsl.g:87:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:91:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalTDsl.g:92:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalTDsl.g:92:2: ( ( rule__Statement__Group__0 ) )
            // InternalTDsl.g:93:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalTDsl.g:94:3: ( rule__Statement__Group__0 )
            // InternalTDsl.g:94:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEvent"
    // InternalTDsl.g:103:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalTDsl.g:104:1: ( ruleEvent EOF )
            // InternalTDsl.g:105:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalTDsl.g:112:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:116:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalTDsl.g:117:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalTDsl.g:117:2: ( ( rule__Event__Alternatives ) )
            // InternalTDsl.g:118:3: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // InternalTDsl.g:119:3: ( rule__Event__Alternatives )
            // InternalTDsl.g:119:4: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAction"
    // InternalTDsl.g:128:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalTDsl.g:129:1: ( ruleAction EOF )
            // InternalTDsl.g:130:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalTDsl.g:137:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:141:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalTDsl.g:142:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalTDsl.g:142:2: ( ( rule__Action__Group__0 ) )
            // InternalTDsl.g:143:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalTDsl.g:144:3: ( rule__Action__Group__0 )
            // InternalTDsl.g:144:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleMovementAction"
    // InternalTDsl.g:153:1: entryRuleMovementAction : ruleMovementAction EOF ;
    public final void entryRuleMovementAction() throws RecognitionException {
        try {
            // InternalTDsl.g:154:1: ( ruleMovementAction EOF )
            // InternalTDsl.g:155:1: ruleMovementAction EOF
            {
             before(grammarAccess.getMovementActionRule()); 
            pushFollow(FOLLOW_1);
            ruleMovementAction();

            state._fsp--;

             after(grammarAccess.getMovementActionRule()); 
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
    // $ANTLR end "entryRuleMovementAction"


    // $ANTLR start "ruleMovementAction"
    // InternalTDsl.g:162:1: ruleMovementAction : ( ( rule__MovementAction__Alternatives ) ) ;
    public final void ruleMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:166:2: ( ( ( rule__MovementAction__Alternatives ) ) )
            // InternalTDsl.g:167:2: ( ( rule__MovementAction__Alternatives ) )
            {
            // InternalTDsl.g:167:2: ( ( rule__MovementAction__Alternatives ) )
            // InternalTDsl.g:168:3: ( rule__MovementAction__Alternatives )
            {
             before(grammarAccess.getMovementActionAccess().getAlternatives()); 
            // InternalTDsl.g:169:3: ( rule__MovementAction__Alternatives )
            // InternalTDsl.g:169:4: rule__MovementAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMovementActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMovementAction"


    // $ANTLR start "entryRuleSoundAction"
    // InternalTDsl.g:178:1: entryRuleSoundAction : ruleSoundAction EOF ;
    public final void entryRuleSoundAction() throws RecognitionException {
        try {
            // InternalTDsl.g:179:1: ( ruleSoundAction EOF )
            // InternalTDsl.g:180:1: ruleSoundAction EOF
            {
             before(grammarAccess.getSoundActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSoundAction();

            state._fsp--;

             after(grammarAccess.getSoundActionRule()); 
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
    // $ANTLR end "entryRuleSoundAction"


    // $ANTLR start "ruleSoundAction"
    // InternalTDsl.g:187:1: ruleSoundAction : ( ( rule__SoundAction__Alternatives ) ) ;
    public final void ruleSoundAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:191:2: ( ( ( rule__SoundAction__Alternatives ) ) )
            // InternalTDsl.g:192:2: ( ( rule__SoundAction__Alternatives ) )
            {
            // InternalTDsl.g:192:2: ( ( rule__SoundAction__Alternatives ) )
            // InternalTDsl.g:193:3: ( rule__SoundAction__Alternatives )
            {
             before(grammarAccess.getSoundActionAccess().getAlternatives()); 
            // InternalTDsl.g:194:3: ( rule__SoundAction__Alternatives )
            // InternalTDsl.g:194:4: rule__SoundAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SoundAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSoundActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSoundAction"


    // $ANTLR start "entryRuleColorBottomAction"
    // InternalTDsl.g:203:1: entryRuleColorBottomAction : ruleColorBottomAction EOF ;
    public final void entryRuleColorBottomAction() throws RecognitionException {
        try {
            // InternalTDsl.g:204:1: ( ruleColorBottomAction EOF )
            // InternalTDsl.g:205:1: ruleColorBottomAction EOF
            {
             before(grammarAccess.getColorBottomActionRule()); 
            pushFollow(FOLLOW_1);
            ruleColorBottomAction();

            state._fsp--;

             after(grammarAccess.getColorBottomActionRule()); 
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
    // $ANTLR end "entryRuleColorBottomAction"


    // $ANTLR start "ruleColorBottomAction"
    // InternalTDsl.g:212:1: ruleColorBottomAction : ( ( rule__ColorBottomAction__Alternatives ) ) ;
    public final void ruleColorBottomAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:216:2: ( ( ( rule__ColorBottomAction__Alternatives ) ) )
            // InternalTDsl.g:217:2: ( ( rule__ColorBottomAction__Alternatives ) )
            {
            // InternalTDsl.g:217:2: ( ( rule__ColorBottomAction__Alternatives ) )
            // InternalTDsl.g:218:3: ( rule__ColorBottomAction__Alternatives )
            {
             before(grammarAccess.getColorBottomActionAccess().getAlternatives()); 
            // InternalTDsl.g:219:3: ( rule__ColorBottomAction__Alternatives )
            // InternalTDsl.g:219:4: rule__ColorBottomAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorBottomActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColorBottomAction"


    // $ANTLR start "entryRuleColorTopAction"
    // InternalTDsl.g:228:1: entryRuleColorTopAction : ruleColorTopAction EOF ;
    public final void entryRuleColorTopAction() throws RecognitionException {
        try {
            // InternalTDsl.g:229:1: ( ruleColorTopAction EOF )
            // InternalTDsl.g:230:1: ruleColorTopAction EOF
            {
             before(grammarAccess.getColorTopActionRule()); 
            pushFollow(FOLLOW_1);
            ruleColorTopAction();

            state._fsp--;

             after(grammarAccess.getColorTopActionRule()); 
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
    // $ANTLR end "entryRuleColorTopAction"


    // $ANTLR start "ruleColorTopAction"
    // InternalTDsl.g:237:1: ruleColorTopAction : ( ( rule__ColorTopAction__Alternatives ) ) ;
    public final void ruleColorTopAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:241:2: ( ( ( rule__ColorTopAction__Alternatives ) ) )
            // InternalTDsl.g:242:2: ( ( rule__ColorTopAction__Alternatives ) )
            {
            // InternalTDsl.g:242:2: ( ( rule__ColorTopAction__Alternatives ) )
            // InternalTDsl.g:243:3: ( rule__ColorTopAction__Alternatives )
            {
             before(grammarAccess.getColorTopActionAccess().getAlternatives()); 
            // InternalTDsl.g:244:3: ( rule__ColorTopAction__Alternatives )
            // InternalTDsl.g:244:4: rule__ColorTopAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColorTopAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorTopActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColorTopAction"


    // $ANTLR start "entryRuleIfStatement"
    // InternalTDsl.g:253:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalTDsl.g:254:1: ( ruleIfStatement EOF )
            // InternalTDsl.g:255:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalTDsl.g:262:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:266:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalTDsl.g:267:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalTDsl.g:267:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalTDsl.g:268:3: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalTDsl.g:269:3: ( rule__IfStatement__Group__0 )
            // InternalTDsl.g:269:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleUpperEvent"
    // InternalTDsl.g:278:1: entryRuleUpperEvent : ruleUpperEvent EOF ;
    public final void entryRuleUpperEvent() throws RecognitionException {
        try {
            // InternalTDsl.g:279:1: ( ruleUpperEvent EOF )
            // InternalTDsl.g:280:1: ruleUpperEvent EOF
            {
             before(grammarAccess.getUpperEventRule()); 
            pushFollow(FOLLOW_1);
            ruleUpperEvent();

            state._fsp--;

             after(grammarAccess.getUpperEventRule()); 
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
    // $ANTLR end "entryRuleUpperEvent"


    // $ANTLR start "ruleUpperEvent"
    // InternalTDsl.g:287:1: ruleUpperEvent : ( ( rule__UpperEvent__Group__0 ) ) ;
    public final void ruleUpperEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:291:2: ( ( ( rule__UpperEvent__Group__0 ) ) )
            // InternalTDsl.g:292:2: ( ( rule__UpperEvent__Group__0 ) )
            {
            // InternalTDsl.g:292:2: ( ( rule__UpperEvent__Group__0 ) )
            // InternalTDsl.g:293:3: ( rule__UpperEvent__Group__0 )
            {
             before(grammarAccess.getUpperEventAccess().getGroup()); 
            // InternalTDsl.g:294:3: ( rule__UpperEvent__Group__0 )
            // InternalTDsl.g:294:4: rule__UpperEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpperEventAccess().getGroup()); 

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
    // $ANTLR end "ruleUpperEvent"


    // $ANTLR start "entryRuleProxEvent"
    // InternalTDsl.g:303:1: entryRuleProxEvent : ruleProxEvent EOF ;
    public final void entryRuleProxEvent() throws RecognitionException {
        try {
            // InternalTDsl.g:304:1: ( ruleProxEvent EOF )
            // InternalTDsl.g:305:1: ruleProxEvent EOF
            {
             before(grammarAccess.getProxEventRule()); 
            pushFollow(FOLLOW_1);
            ruleProxEvent();

            state._fsp--;

             after(grammarAccess.getProxEventRule()); 
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
    // $ANTLR end "entryRuleProxEvent"


    // $ANTLR start "ruleProxEvent"
    // InternalTDsl.g:312:1: ruleProxEvent : ( ( rule__ProxEvent__Group__0 ) ) ;
    public final void ruleProxEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:316:2: ( ( ( rule__ProxEvent__Group__0 ) ) )
            // InternalTDsl.g:317:2: ( ( rule__ProxEvent__Group__0 ) )
            {
            // InternalTDsl.g:317:2: ( ( rule__ProxEvent__Group__0 ) )
            // InternalTDsl.g:318:3: ( rule__ProxEvent__Group__0 )
            {
             before(grammarAccess.getProxEventAccess().getGroup()); 
            // InternalTDsl.g:319:3: ( rule__ProxEvent__Group__0 )
            // InternalTDsl.g:319:4: rule__ProxEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProxEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProxEventAccess().getGroup()); 

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
    // $ANTLR end "ruleProxEvent"


    // $ANTLR start "entryRuleSensor"
    // InternalTDsl.g:328:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalTDsl.g:329:1: ( ruleSensor EOF )
            // InternalTDsl.g:330:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalTDsl.g:337:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:341:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalTDsl.g:342:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalTDsl.g:342:2: ( ( rule__Sensor__Alternatives ) )
            // InternalTDsl.g:343:3: ( rule__Sensor__Alternatives )
            {
             before(grammarAccess.getSensorAccess().getAlternatives()); 
            // InternalTDsl.g:344:3: ( rule__Sensor__Alternatives )
            // InternalTDsl.g:344:4: rule__Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleTapEvent"
    // InternalTDsl.g:353:1: entryRuleTapEvent : ruleTapEvent EOF ;
    public final void entryRuleTapEvent() throws RecognitionException {
        try {
            // InternalTDsl.g:354:1: ( ruleTapEvent EOF )
            // InternalTDsl.g:355:1: ruleTapEvent EOF
            {
             before(grammarAccess.getTapEventRule()); 
            pushFollow(FOLLOW_1);
            ruleTapEvent();

            state._fsp--;

             after(grammarAccess.getTapEventRule()); 
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
    // $ANTLR end "entryRuleTapEvent"


    // $ANTLR start "ruleTapEvent"
    // InternalTDsl.g:362:1: ruleTapEvent : ( ( rule__TapEvent__Group__0 ) ) ;
    public final void ruleTapEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:366:2: ( ( ( rule__TapEvent__Group__0 ) ) )
            // InternalTDsl.g:367:2: ( ( rule__TapEvent__Group__0 ) )
            {
            // InternalTDsl.g:367:2: ( ( rule__TapEvent__Group__0 ) )
            // InternalTDsl.g:368:3: ( rule__TapEvent__Group__0 )
            {
             before(grammarAccess.getTapEventAccess().getGroup()); 
            // InternalTDsl.g:369:3: ( rule__TapEvent__Group__0 )
            // InternalTDsl.g:369:4: rule__TapEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TapEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTapEventAccess().getGroup()); 

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
    // $ANTLR end "ruleTapEvent"


    // $ANTLR start "entryRuleClapEvent"
    // InternalTDsl.g:378:1: entryRuleClapEvent : ruleClapEvent EOF ;
    public final void entryRuleClapEvent() throws RecognitionException {
        try {
            // InternalTDsl.g:379:1: ( ruleClapEvent EOF )
            // InternalTDsl.g:380:1: ruleClapEvent EOF
            {
             before(grammarAccess.getClapEventRule()); 
            pushFollow(FOLLOW_1);
            ruleClapEvent();

            state._fsp--;

             after(grammarAccess.getClapEventRule()); 
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
    // $ANTLR end "entryRuleClapEvent"


    // $ANTLR start "ruleClapEvent"
    // InternalTDsl.g:387:1: ruleClapEvent : ( ( rule__ClapEvent__Group__0 ) ) ;
    public final void ruleClapEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:391:2: ( ( ( rule__ClapEvent__Group__0 ) ) )
            // InternalTDsl.g:392:2: ( ( rule__ClapEvent__Group__0 ) )
            {
            // InternalTDsl.g:392:2: ( ( rule__ClapEvent__Group__0 ) )
            // InternalTDsl.g:393:3: ( rule__ClapEvent__Group__0 )
            {
             before(grammarAccess.getClapEventAccess().getGroup()); 
            // InternalTDsl.g:394:3: ( rule__ClapEvent__Group__0 )
            // InternalTDsl.g:394:4: rule__ClapEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClapEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClapEventAccess().getGroup()); 

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
    // $ANTLR end "ruleClapEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalTDsl.g:403:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalTDsl.g:404:1: ( ruleCondition EOF )
            // InternalTDsl.g:405:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalTDsl.g:412:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:416:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalTDsl.g:417:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalTDsl.g:417:2: ( ( rule__Condition__Group__0 ) )
            // InternalTDsl.g:418:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalTDsl.g:419:3: ( rule__Condition__Group__0 )
            // InternalTDsl.g:419:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalTDsl.g:428:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // InternalTDsl.g:429:1: ( ruleArithmeticExpression EOF )
            // InternalTDsl.g:430:1: ruleArithmeticExpression EOF
            {
             before(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionRule()); 
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
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalTDsl.g:437:1: ruleArithmeticExpression : ( ( rule__ArithmeticExpression__Group__0 ) ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:441:2: ( ( ( rule__ArithmeticExpression__Group__0 ) ) )
            // InternalTDsl.g:442:2: ( ( rule__ArithmeticExpression__Group__0 ) )
            {
            // InternalTDsl.g:442:2: ( ( rule__ArithmeticExpression__Group__0 ) )
            // InternalTDsl.g:443:3: ( rule__ArithmeticExpression__Group__0 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getGroup()); 
            // InternalTDsl.g:444:3: ( rule__ArithmeticExpression__Group__0 )
            // InternalTDsl.g:444:4: rule__ArithmeticExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalTDsl.g:453:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // InternalTDsl.g:454:1: ( ruleEIntegerObject EOF )
            // InternalTDsl.g:455:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
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
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalTDsl.g:462:1: ruleEIntegerObject : ( ( rule__EIntegerObject__Group__0 ) ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:466:2: ( ( ( rule__EIntegerObject__Group__0 ) ) )
            // InternalTDsl.g:467:2: ( ( rule__EIntegerObject__Group__0 ) )
            {
            // InternalTDsl.g:467:2: ( ( rule__EIntegerObject__Group__0 ) )
            // InternalTDsl.g:468:3: ( rule__EIntegerObject__Group__0 )
            {
             before(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            // InternalTDsl.g:469:3: ( rule__EIntegerObject__Group__0 )
            // InternalTDsl.g:469:4: rule__EIntegerObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntegerObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleColor"
    // InternalTDsl.g:478:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalTDsl.g:479:1: ( ruleColor EOF )
            // InternalTDsl.g:480:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalTDsl.g:487:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:491:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalTDsl.g:492:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalTDsl.g:492:2: ( ( rule__Color__Group__0 ) )
            // InternalTDsl.g:493:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalTDsl.g:494:3: ( rule__Color__Group__0 )
            // InternalTDsl.g:494:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleSound"
    // InternalTDsl.g:503:1: entryRuleSound : ruleSound EOF ;
    public final void entryRuleSound() throws RecognitionException {
        try {
            // InternalTDsl.g:504:1: ( ruleSound EOF )
            // InternalTDsl.g:505:1: ruleSound EOF
            {
             before(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            ruleSound();

            state._fsp--;

             after(grammarAccess.getSoundRule()); 
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
    // $ANTLR end "entryRuleSound"


    // $ANTLR start "ruleSound"
    // InternalTDsl.g:512:1: ruleSound : ( ( rule__Sound__Alternatives ) ) ;
    public final void ruleSound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:516:2: ( ( ( rule__Sound__Alternatives ) ) )
            // InternalTDsl.g:517:2: ( ( rule__Sound__Alternatives ) )
            {
            // InternalTDsl.g:517:2: ( ( rule__Sound__Alternatives ) )
            // InternalTDsl.g:518:3: ( rule__Sound__Alternatives )
            {
             before(grammarAccess.getSoundAccess().getAlternatives()); 
            // InternalTDsl.g:519:3: ( rule__Sound__Alternatives )
            // InternalTDsl.g:519:4: rule__Sound__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRuleButtons"
    // InternalTDsl.g:528:1: entryRuleButtons : ruleButtons EOF ;
    public final void entryRuleButtons() throws RecognitionException {
        try {
            // InternalTDsl.g:529:1: ( ruleButtons EOF )
            // InternalTDsl.g:530:1: ruleButtons EOF
            {
             before(grammarAccess.getButtonsRule()); 
            pushFollow(FOLLOW_1);
            ruleButtons();

            state._fsp--;

             after(grammarAccess.getButtonsRule()); 
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
    // $ANTLR end "entryRuleButtons"


    // $ANTLR start "ruleButtons"
    // InternalTDsl.g:537:1: ruleButtons : ( ( rule__Buttons__Alternatives ) ) ;
    public final void ruleButtons() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:541:2: ( ( ( rule__Buttons__Alternatives ) ) )
            // InternalTDsl.g:542:2: ( ( rule__Buttons__Alternatives ) )
            {
            // InternalTDsl.g:542:2: ( ( rule__Buttons__Alternatives ) )
            // InternalTDsl.g:543:3: ( rule__Buttons__Alternatives )
            {
             before(grammarAccess.getButtonsAccess().getAlternatives()); 
            // InternalTDsl.g:544:3: ( rule__Buttons__Alternatives )
            // InternalTDsl.g:544:4: rule__Buttons__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Buttons__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getButtonsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleButtons"


    // $ANTLR start "entryRuleState"
    // InternalTDsl.g:553:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalTDsl.g:554:1: ( ruleState EOF )
            // InternalTDsl.g:555:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalTDsl.g:562:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:566:2: ( ( ( rule__State__Alternatives ) ) )
            // InternalTDsl.g:567:2: ( ( rule__State__Alternatives ) )
            {
            // InternalTDsl.g:567:2: ( ( rule__State__Alternatives ) )
            // InternalTDsl.g:568:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalTDsl.g:569:3: ( rule__State__Alternatives )
            // InternalTDsl.g:569:4: rule__State__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleRightLeft"
    // InternalTDsl.g:578:1: entryRuleRightLeft : ruleRightLeft EOF ;
    public final void entryRuleRightLeft() throws RecognitionException {
        try {
            // InternalTDsl.g:579:1: ( ruleRightLeft EOF )
            // InternalTDsl.g:580:1: ruleRightLeft EOF
            {
             before(grammarAccess.getRightLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleRightLeft();

            state._fsp--;

             after(grammarAccess.getRightLeftRule()); 
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
    // $ANTLR end "entryRuleRightLeft"


    // $ANTLR start "ruleRightLeft"
    // InternalTDsl.g:587:1: ruleRightLeft : ( ( rule__RightLeft__Alternatives ) ) ;
    public final void ruleRightLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:591:2: ( ( ( rule__RightLeft__Alternatives ) ) )
            // InternalTDsl.g:592:2: ( ( rule__RightLeft__Alternatives ) )
            {
            // InternalTDsl.g:592:2: ( ( rule__RightLeft__Alternatives ) )
            // InternalTDsl.g:593:3: ( rule__RightLeft__Alternatives )
            {
             before(grammarAccess.getRightLeftAccess().getAlternatives()); 
            // InternalTDsl.g:594:3: ( rule__RightLeft__Alternatives )
            // InternalTDsl.g:594:4: rule__RightLeft__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RightLeft__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRightLeftAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRightLeft"


    // $ANTLR start "entryRuleHorizontalSensors"
    // InternalTDsl.g:603:1: entryRuleHorizontalSensors : ruleHorizontalSensors EOF ;
    public final void entryRuleHorizontalSensors() throws RecognitionException {
        try {
            // InternalTDsl.g:604:1: ( ruleHorizontalSensors EOF )
            // InternalTDsl.g:605:1: ruleHorizontalSensors EOF
            {
             before(grammarAccess.getHorizontalSensorsRule()); 
            pushFollow(FOLLOW_1);
            ruleHorizontalSensors();

            state._fsp--;

             after(grammarAccess.getHorizontalSensorsRule()); 
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
    // $ANTLR end "entryRuleHorizontalSensors"


    // $ANTLR start "ruleHorizontalSensors"
    // InternalTDsl.g:612:1: ruleHorizontalSensors : ( ( rule__HorizontalSensors__Alternatives ) ) ;
    public final void ruleHorizontalSensors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:616:2: ( ( ( rule__HorizontalSensors__Alternatives ) ) )
            // InternalTDsl.g:617:2: ( ( rule__HorizontalSensors__Alternatives ) )
            {
            // InternalTDsl.g:617:2: ( ( rule__HorizontalSensors__Alternatives ) )
            // InternalTDsl.g:618:3: ( rule__HorizontalSensors__Alternatives )
            {
             before(grammarAccess.getHorizontalSensorsAccess().getAlternatives()); 
            // InternalTDsl.g:619:3: ( rule__HorizontalSensors__Alternatives )
            // InternalTDsl.g:619:4: rule__HorizontalSensors__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalSensorsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHorizontalSensors"


    // $ANTLR start "rule__Statement__Alternatives_2"
    // InternalTDsl.g:627:1: rule__Statement__Alternatives_2 : ( ( ( rule__Statement__IfstatementAssignment_2_0 ) ) | ( ( rule__Statement__ActionAssignment_2_1 ) ) );
    public final void rule__Statement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:631:1: ( ( ( rule__Statement__IfstatementAssignment_2_0 ) ) | ( ( rule__Statement__ActionAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==56) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTDsl.g:632:2: ( ( rule__Statement__IfstatementAssignment_2_0 ) )
                    {
                    // InternalTDsl.g:632:2: ( ( rule__Statement__IfstatementAssignment_2_0 ) )
                    // InternalTDsl.g:633:3: ( rule__Statement__IfstatementAssignment_2_0 )
                    {
                     before(grammarAccess.getStatementAccess().getIfstatementAssignment_2_0()); 
                    // InternalTDsl.g:634:3: ( rule__Statement__IfstatementAssignment_2_0 )
                    // InternalTDsl.g:634:4: rule__Statement__IfstatementAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__IfstatementAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getIfstatementAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:638:2: ( ( rule__Statement__ActionAssignment_2_1 ) )
                    {
                    // InternalTDsl.g:638:2: ( ( rule__Statement__ActionAssignment_2_1 ) )
                    // InternalTDsl.g:639:3: ( rule__Statement__ActionAssignment_2_1 )
                    {
                     before(grammarAccess.getStatementAccess().getActionAssignment_2_1()); 
                    // InternalTDsl.g:640:3: ( rule__Statement__ActionAssignment_2_1 )
                    // InternalTDsl.g:640:4: rule__Statement__ActionAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__ActionAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getActionAssignment_2_1()); 

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
    // $ANTLR end "rule__Statement__Alternatives_2"


    // $ANTLR start "rule__Event__Alternatives"
    // InternalTDsl.g:648:1: rule__Event__Alternatives : ( ( ruleUpperEvent ) | ( ruleProxEvent ) | ( ruleTapEvent ) | ( ruleClapEvent ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:652:1: ( ( ruleUpperEvent ) | ( ruleProxEvent ) | ( ruleTapEvent ) | ( ruleClapEvent ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==60) ) {
                switch ( input.LA(2) ) {
                case 66:
                    {
                    alt3=3;
                    }
                    break;
                case 68:
                    {
                    alt3=2;
                    }
                    break;
                case 12:
                    {
                    int LA3_4 = input.LA(3);

                    if ( ((LA3_4>=34 && LA3_4<=35)) ) {
                        alt3=2;
                    }
                    else if ( (LA3_4==16||LA3_4==61) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 35:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==16||LA3_5==61) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==73) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 34:
                    {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==73) ) {
                        alt3=2;
                    }
                    else if ( (LA3_6==16||LA3_6==61) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 67:
                    {
                    alt3=4;
                    }
                    break;
                case 11:
                case 33:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTDsl.g:653:2: ( ruleUpperEvent )
                    {
                    // InternalTDsl.g:653:2: ( ruleUpperEvent )
                    // InternalTDsl.g:654:3: ruleUpperEvent
                    {
                     before(grammarAccess.getEventAccess().getUpperEventParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUpperEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getUpperEventParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:659:2: ( ruleProxEvent )
                    {
                    // InternalTDsl.g:659:2: ( ruleProxEvent )
                    // InternalTDsl.g:660:3: ruleProxEvent
                    {
                     before(grammarAccess.getEventAccess().getProxEventParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProxEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getProxEventParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:665:2: ( ruleTapEvent )
                    {
                    // InternalTDsl.g:665:2: ( ruleTapEvent )
                    // InternalTDsl.g:666:3: ruleTapEvent
                    {
                     before(grammarAccess.getEventAccess().getTapEventParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTapEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getTapEventParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:671:2: ( ruleClapEvent )
                    {
                    // InternalTDsl.g:671:2: ( ruleClapEvent )
                    // InternalTDsl.g:672:3: ruleClapEvent
                    {
                     before(grammarAccess.getEventAccess().getClapEventParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleClapEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getClapEventParserRuleCall_3()); 

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
    // $ANTLR end "rule__Event__Alternatives"


    // $ANTLR start "rule__Action__Alternatives_1"
    // InternalTDsl.g:681:1: rule__Action__Alternatives_1 : ( ( ruleMovementAction ) | ( ruleSoundAction ) | ( ruleColorBottomAction ) | ( ruleColorTopAction ) );
    public final void rule__Action__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:685:1: ( ( ruleMovementAction ) | ( ruleSoundAction ) | ( ruleColorBottomAction ) | ( ruleColorTopAction ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt4=1;
                }
                break;
            case 42:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==53) ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==55) ) {
                        alt4=4;
                    }
                    else if ( (LA4_6==50) ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else if ( ((LA4_2>=34 && LA4_2<=35)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                int LA4_3 = input.LA(2);

                if ( ((LA4_3>=44 && LA4_3<=45)) ) {
                    alt4=1;
                }
                else if ( (LA4_3==48) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt4=2;
                }
                break;
            case 49:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==55) ) {
                    alt4=4;
                }
                else if ( (LA4_5==50) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTDsl.g:686:2: ( ruleMovementAction )
                    {
                    // InternalTDsl.g:686:2: ( ruleMovementAction )
                    // InternalTDsl.g:687:3: ruleMovementAction
                    {
                     before(grammarAccess.getActionAccess().getMovementActionParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMovementAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getMovementActionParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:692:2: ( ruleSoundAction )
                    {
                    // InternalTDsl.g:692:2: ( ruleSoundAction )
                    // InternalTDsl.g:693:3: ruleSoundAction
                    {
                     before(grammarAccess.getActionAccess().getSoundActionParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSoundAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getSoundActionParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:698:2: ( ruleColorBottomAction )
                    {
                    // InternalTDsl.g:698:2: ( ruleColorBottomAction )
                    // InternalTDsl.g:699:3: ruleColorBottomAction
                    {
                     before(grammarAccess.getActionAccess().getColorBottomActionParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleColorBottomAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getColorBottomActionParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:704:2: ( ruleColorTopAction )
                    {
                    // InternalTDsl.g:704:2: ( ruleColorTopAction )
                    // InternalTDsl.g:705:3: ruleColorTopAction
                    {
                     before(grammarAccess.getActionAccess().getColorTopActionParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_2);
                    ruleColorTopAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getColorTopActionParserRuleCall_1_3()); 

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
    // $ANTLR end "rule__Action__Alternatives_1"


    // $ANTLR start "rule__MovementAction__Alternatives"
    // InternalTDsl.g:714:1: rule__MovementAction__Alternatives : ( ( ( rule__MovementAction__Group_0__0 ) ) | ( ( rule__MovementAction__Group_1__0 ) ) | ( ( rule__MovementAction__Group_2__0 ) ) | ( ( rule__MovementAction__Group_3__0 ) ) );
    public final void rule__MovementAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:718:1: ( ( ( rule__MovementAction__Group_0__0 ) ) | ( ( rule__MovementAction__Group_1__0 ) ) | ( ( rule__MovementAction__Group_2__0 ) ) | ( ( rule__MovementAction__Group_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case 42:
                {
                alt5=2;
                }
                break;
            case 43:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==45) ) {
                    alt5=4;
                }
                else if ( (LA5_3==44) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTDsl.g:719:2: ( ( rule__MovementAction__Group_0__0 ) )
                    {
                    // InternalTDsl.g:719:2: ( ( rule__MovementAction__Group_0__0 ) )
                    // InternalTDsl.g:720:3: ( rule__MovementAction__Group_0__0 )
                    {
                     before(grammarAccess.getMovementActionAccess().getGroup_0()); 
                    // InternalTDsl.g:721:3: ( rule__MovementAction__Group_0__0 )
                    // InternalTDsl.g:721:4: rule__MovementAction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MovementAction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMovementActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:725:2: ( ( rule__MovementAction__Group_1__0 ) )
                    {
                    // InternalTDsl.g:725:2: ( ( rule__MovementAction__Group_1__0 ) )
                    // InternalTDsl.g:726:3: ( rule__MovementAction__Group_1__0 )
                    {
                     before(grammarAccess.getMovementActionAccess().getGroup_1()); 
                    // InternalTDsl.g:727:3: ( rule__MovementAction__Group_1__0 )
                    // InternalTDsl.g:727:4: rule__MovementAction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MovementAction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMovementActionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:731:2: ( ( rule__MovementAction__Group_2__0 ) )
                    {
                    // InternalTDsl.g:731:2: ( ( rule__MovementAction__Group_2__0 ) )
                    // InternalTDsl.g:732:3: ( rule__MovementAction__Group_2__0 )
                    {
                     before(grammarAccess.getMovementActionAccess().getGroup_2()); 
                    // InternalTDsl.g:733:3: ( rule__MovementAction__Group_2__0 )
                    // InternalTDsl.g:733:4: rule__MovementAction__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MovementAction__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMovementActionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:737:2: ( ( rule__MovementAction__Group_3__0 ) )
                    {
                    // InternalTDsl.g:737:2: ( ( rule__MovementAction__Group_3__0 ) )
                    // InternalTDsl.g:738:3: ( rule__MovementAction__Group_3__0 )
                    {
                     before(grammarAccess.getMovementActionAccess().getGroup_3()); 
                    // InternalTDsl.g:739:3: ( rule__MovementAction__Group_3__0 )
                    // InternalTDsl.g:739:4: rule__MovementAction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MovementAction__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMovementActionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__MovementAction__Alternatives"


    // $ANTLR start "rule__MovementAction__DirectionAlternatives_0_1_0"
    // InternalTDsl.g:747:1: rule__MovementAction__DirectionAlternatives_0_1_0 : ( ( 'forward' ) | ( 'backward' ) );
    public final void rule__MovementAction__DirectionAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:751:1: ( ( 'forward' ) | ( 'backward' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTDsl.g:752:2: ( 'forward' )
                    {
                    // InternalTDsl.g:752:2: ( 'forward' )
                    // InternalTDsl.g:753:3: 'forward'
                    {
                     before(grammarAccess.getMovementActionAccess().getDirectionForwardKeyword_0_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMovementActionAccess().getDirectionForwardKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:758:2: ( 'backward' )
                    {
                    // InternalTDsl.g:758:2: ( 'backward' )
                    // InternalTDsl.g:759:3: 'backward'
                    {
                     before(grammarAccess.getMovementActionAccess().getDirectionBackwardKeyword_0_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMovementActionAccess().getDirectionBackwardKeyword_0_1_0_1()); 

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
    // $ANTLR end "rule__MovementAction__DirectionAlternatives_0_1_0"


    // $ANTLR start "rule__SoundAction__Alternatives"
    // InternalTDsl.g:768:1: rule__SoundAction__Alternatives : ( ( ( rule__SoundAction__Group_0__0 ) ) | ( ( rule__SoundAction__Group_1__0 ) ) );
    public final void rule__SoundAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:772:1: ( ( ( rule__SoundAction__Group_0__0 ) ) | ( ( rule__SoundAction__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==46) ) {
                alt7=1;
            }
            else if ( (LA7_0==43) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTDsl.g:773:2: ( ( rule__SoundAction__Group_0__0 ) )
                    {
                    // InternalTDsl.g:773:2: ( ( rule__SoundAction__Group_0__0 ) )
                    // InternalTDsl.g:774:3: ( rule__SoundAction__Group_0__0 )
                    {
                     before(grammarAccess.getSoundActionAccess().getGroup_0()); 
                    // InternalTDsl.g:775:3: ( rule__SoundAction__Group_0__0 )
                    // InternalTDsl.g:775:4: rule__SoundAction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SoundAction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSoundActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:779:2: ( ( rule__SoundAction__Group_1__0 ) )
                    {
                    // InternalTDsl.g:779:2: ( ( rule__SoundAction__Group_1__0 ) )
                    // InternalTDsl.g:780:3: ( rule__SoundAction__Group_1__0 )
                    {
                     before(grammarAccess.getSoundActionAccess().getGroup_1()); 
                    // InternalTDsl.g:781:3: ( rule__SoundAction__Group_1__0 )
                    // InternalTDsl.g:781:4: rule__SoundAction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SoundAction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSoundActionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SoundAction__Alternatives"


    // $ANTLR start "rule__ColorBottomAction__Alternatives"
    // InternalTDsl.g:789:1: rule__ColorBottomAction__Alternatives : ( ( ( rule__ColorBottomAction__Group_0__0 ) ) | ( ( rule__ColorBottomAction__Group_1__0 ) ) );
    public final void rule__ColorBottomAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:793:1: ( ( ( rule__ColorBottomAction__Group_0__0 ) ) | ( ( rule__ColorBottomAction__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==49) ) {
                alt8=1;
            }
            else if ( (LA8_0==42) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTDsl.g:794:2: ( ( rule__ColorBottomAction__Group_0__0 ) )
                    {
                    // InternalTDsl.g:794:2: ( ( rule__ColorBottomAction__Group_0__0 ) )
                    // InternalTDsl.g:795:3: ( rule__ColorBottomAction__Group_0__0 )
                    {
                     before(grammarAccess.getColorBottomActionAccess().getGroup_0()); 
                    // InternalTDsl.g:796:3: ( rule__ColorBottomAction__Group_0__0 )
                    // InternalTDsl.g:796:4: rule__ColorBottomAction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColorBottomAction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColorBottomActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:800:2: ( ( rule__ColorBottomAction__Group_1__0 ) )
                    {
                    // InternalTDsl.g:800:2: ( ( rule__ColorBottomAction__Group_1__0 ) )
                    // InternalTDsl.g:801:3: ( rule__ColorBottomAction__Group_1__0 )
                    {
                     before(grammarAccess.getColorBottomActionAccess().getGroup_1()); 
                    // InternalTDsl.g:802:3: ( rule__ColorBottomAction__Group_1__0 )
                    // InternalTDsl.g:802:4: rule__ColorBottomAction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColorBottomAction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColorBottomActionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ColorBottomAction__Alternatives"


    // $ANTLR start "rule__ColorTopAction__Alternatives"
    // InternalTDsl.g:810:1: rule__ColorTopAction__Alternatives : ( ( ( rule__ColorTopAction__Group_0__0 ) ) | ( ( rule__ColorTopAction__Group_1__0 ) ) );
    public final void rule__ColorTopAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:814:1: ( ( ( rule__ColorTopAction__Group_0__0 ) ) | ( ( rule__ColorTopAction__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==49) ) {
                alt9=1;
            }
            else if ( (LA9_0==42) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTDsl.g:815:2: ( ( rule__ColorTopAction__Group_0__0 ) )
                    {
                    // InternalTDsl.g:815:2: ( ( rule__ColorTopAction__Group_0__0 ) )
                    // InternalTDsl.g:816:3: ( rule__ColorTopAction__Group_0__0 )
                    {
                     before(grammarAccess.getColorTopActionAccess().getGroup_0()); 
                    // InternalTDsl.g:817:3: ( rule__ColorTopAction__Group_0__0 )
                    // InternalTDsl.g:817:4: rule__ColorTopAction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColorTopAction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColorTopActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:821:2: ( ( rule__ColorTopAction__Group_1__0 ) )
                    {
                    // InternalTDsl.g:821:2: ( ( rule__ColorTopAction__Group_1__0 ) )
                    // InternalTDsl.g:822:3: ( rule__ColorTopAction__Group_1__0 )
                    {
                     before(grammarAccess.getColorTopActionAccess().getGroup_1()); 
                    // InternalTDsl.g:823:3: ( rule__ColorTopAction__Group_1__0 )
                    // InternalTDsl.g:823:4: rule__ColorTopAction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColorTopAction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColorTopActionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ColorTopAction__Alternatives"


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalTDsl.g:831:1: rule__Sensor__Alternatives : ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:835:1: ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12||LA10_0==68) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=34 && LA10_0<=35)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTDsl.g:836:2: ( ( rule__Sensor__Group_0__0 ) )
                    {
                    // InternalTDsl.g:836:2: ( ( rule__Sensor__Group_0__0 ) )
                    // InternalTDsl.g:837:3: ( rule__Sensor__Group_0__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_0()); 
                    // InternalTDsl.g:838:3: ( rule__Sensor__Group_0__0 )
                    // InternalTDsl.g:838:4: rule__Sensor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:842:2: ( ( rule__Sensor__Group_1__0 ) )
                    {
                    // InternalTDsl.g:842:2: ( ( rule__Sensor__Group_1__0 ) )
                    // InternalTDsl.g:843:3: ( rule__Sensor__Group_1__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_1()); 
                    // InternalTDsl.g:844:3: ( rule__Sensor__Group_1__0 )
                    // InternalTDsl.g:844:4: rule__Sensor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Sensor__Alternatives"


    // $ANTLR start "rule__Sensor__Alternatives_0_4"
    // InternalTDsl.g:852:1: rule__Sensor__Alternatives_0_4 : ( ( 'proximity' ) | ( ( rule__Sensor__Group_0_4_1__0 ) ) );
    public final void rule__Sensor__Alternatives_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:856:1: ( ( 'proximity' ) | ( ( rule__Sensor__Group_0_4_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            else if ( (LA11_0==65) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTDsl.g:857:2: ( 'proximity' )
                    {
                    // InternalTDsl.g:857:2: ( 'proximity' )
                    // InternalTDsl.g:858:3: 'proximity'
                    {
                     before(grammarAccess.getSensorAccess().getProximityKeyword_0_4_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getProximityKeyword_0_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:863:2: ( ( rule__Sensor__Group_0_4_1__0 ) )
                    {
                    // InternalTDsl.g:863:2: ( ( rule__Sensor__Group_0_4_1__0 ) )
                    // InternalTDsl.g:864:3: ( rule__Sensor__Group_0_4_1__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_0_4_1()); 
                    // InternalTDsl.g:865:3: ( rule__Sensor__Group_0_4_1__0 )
                    // InternalTDsl.g:865:4: rule__Sensor__Group_0_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_0_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_0_4_1()); 

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
    // $ANTLR end "rule__Sensor__Alternatives_0_4"


    // $ANTLR start "rule__Sensor__Alternatives_1_4"
    // InternalTDsl.g:873:1: rule__Sensor__Alternatives_1_4 : ( ( 'proximity' ) | ( ( rule__Sensor__Group_1_4_1__0 ) ) | ( 'black' ) | ( 'white' ) );
    public final void rule__Sensor__Alternatives_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:877:1: ( ( 'proximity' ) | ( ( rule__Sensor__Group_1_4_1__0 ) ) | ( 'black' ) | ( 'white' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt12=1;
                }
                break;
            case 65:
                {
                alt12=2;
                }
                break;
            case 14:
                {
                alt12=3;
                }
                break;
            case 15:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTDsl.g:878:2: ( 'proximity' )
                    {
                    // InternalTDsl.g:878:2: ( 'proximity' )
                    // InternalTDsl.g:879:3: 'proximity'
                    {
                     before(grammarAccess.getSensorAccess().getProximityKeyword_1_4_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getProximityKeyword_1_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:884:2: ( ( rule__Sensor__Group_1_4_1__0 ) )
                    {
                    // InternalTDsl.g:884:2: ( ( rule__Sensor__Group_1_4_1__0 ) )
                    // InternalTDsl.g:885:3: ( rule__Sensor__Group_1_4_1__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_1_4_1()); 
                    // InternalTDsl.g:886:3: ( rule__Sensor__Group_1_4_1__0 )
                    // InternalTDsl.g:886:4: rule__Sensor__Group_1_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_1_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_1_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:890:2: ( 'black' )
                    {
                    // InternalTDsl.g:890:2: ( 'black' )
                    // InternalTDsl.g:891:3: 'black'
                    {
                     before(grammarAccess.getSensorAccess().getBlackKeyword_1_4_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getBlackKeyword_1_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:896:2: ( 'white' )
                    {
                    // InternalTDsl.g:896:2: ( 'white' )
                    // InternalTDsl.g:897:3: 'white'
                    {
                     before(grammarAccess.getSensorAccess().getWhiteKeyword_1_4_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getWhiteKeyword_1_4_3()); 

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
    // $ANTLR end "rule__Sensor__Alternatives_1_4"


    // $ANTLR start "rule__Condition__OperatorAlternatives_1_0_0"
    // InternalTDsl.g:906:1: rule__Condition__OperatorAlternatives_1_0_0 : ( ( 'and' ) | ( 'or' ) );
    public final void rule__Condition__OperatorAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:910:1: ( ( 'and' ) | ( 'or' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            else if ( (LA13_0==17) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTDsl.g:911:2: ( 'and' )
                    {
                    // InternalTDsl.g:911:2: ( 'and' )
                    // InternalTDsl.g:912:3: 'and'
                    {
                     before(grammarAccess.getConditionAccess().getOperatorAndKeyword_1_0_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getOperatorAndKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:917:2: ( 'or' )
                    {
                    // InternalTDsl.g:917:2: ( 'or' )
                    // InternalTDsl.g:918:3: 'or'
                    {
                     before(grammarAccess.getConditionAccess().getOperatorOrKeyword_1_0_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getOperatorOrKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Condition__OperatorAlternatives_1_0_0"


    // $ANTLR start "rule__ArithmeticExpression__OperatorAlternatives_1_0_0"
    // InternalTDsl.g:927:1: rule__ArithmeticExpression__OperatorAlternatives_1_0_0 : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( 'mod' ) );
    public final void rule__ArithmeticExpression__OperatorAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:931:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( 'mod' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt14=1;
                }
                break;
            case 19:
                {
                alt14=2;
                }
                break;
            case 20:
                {
                alt14=3;
                }
                break;
            case 21:
                {
                alt14=4;
                }
                break;
            case 22:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTDsl.g:932:2: ( '+' )
                    {
                    // InternalTDsl.g:932:2: ( '+' )
                    // InternalTDsl.g:933:3: '+'
                    {
                     before(grammarAccess.getArithmeticExpressionAccess().getOperatorPlusSignKeyword_1_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getArithmeticExpressionAccess().getOperatorPlusSignKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:938:2: ( '-' )
                    {
                    // InternalTDsl.g:938:2: ( '-' )
                    // InternalTDsl.g:939:3: '-'
                    {
                     before(grammarAccess.getArithmeticExpressionAccess().getOperatorHyphenMinusKeyword_1_0_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getArithmeticExpressionAccess().getOperatorHyphenMinusKeyword_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:944:2: ( '*' )
                    {
                    // InternalTDsl.g:944:2: ( '*' )
                    // InternalTDsl.g:945:3: '*'
                    {
                     before(grammarAccess.getArithmeticExpressionAccess().getOperatorAsteriskKeyword_1_0_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getArithmeticExpressionAccess().getOperatorAsteriskKeyword_1_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:950:2: ( '/' )
                    {
                    // InternalTDsl.g:950:2: ( '/' )
                    // InternalTDsl.g:951:3: '/'
                    {
                     before(grammarAccess.getArithmeticExpressionAccess().getOperatorSolidusKeyword_1_0_0_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getArithmeticExpressionAccess().getOperatorSolidusKeyword_1_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTDsl.g:956:2: ( 'mod' )
                    {
                    // InternalTDsl.g:956:2: ( 'mod' )
                    // InternalTDsl.g:957:3: 'mod'
                    {
                     before(grammarAccess.getArithmeticExpressionAccess().getOperatorModKeyword_1_0_0_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getArithmeticExpressionAccess().getOperatorModKeyword_1_0_0_4()); 

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
    // $ANTLR end "rule__ArithmeticExpression__OperatorAlternatives_1_0_0"


    // $ANTLR start "rule__Color__Alternatives_0"
    // InternalTDsl.g:966:1: rule__Color__Alternatives_0 : ( ( 'light' ) | ( 'dark' ) );
    public final void rule__Color__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:970:1: ( ( 'light' ) | ( 'dark' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            else if ( (LA15_0==24) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalTDsl.g:971:2: ( 'light' )
                    {
                    // InternalTDsl.g:971:2: ( 'light' )
                    // InternalTDsl.g:972:3: 'light'
                    {
                     before(grammarAccess.getColorAccess().getLightKeyword_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getLightKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:977:2: ( 'dark' )
                    {
                    // InternalTDsl.g:977:2: ( 'dark' )
                    // InternalTDsl.g:978:3: 'dark'
                    {
                     before(grammarAccess.getColorAccess().getDarkKeyword_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getDarkKeyword_0_1()); 

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
    // $ANTLR end "rule__Color__Alternatives_0"


    // $ANTLR start "rule__Color__Alternatives_1"
    // InternalTDsl.g:987:1: rule__Color__Alternatives_1 : ( ( 'red' ) | ( 'green' ) | ( 'blue' ) | ( 'black' ) | ( 'white' ) | ( 'yellow' ) );
    public final void rule__Color__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:991:1: ( ( 'red' ) | ( 'green' ) | ( 'blue' ) | ( 'black' ) | ( 'white' ) | ( 'yellow' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 27:
                {
                alt16=3;
                }
                break;
            case 14:
                {
                alt16=4;
                }
                break;
            case 15:
                {
                alt16=5;
                }
                break;
            case 28:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalTDsl.g:992:2: ( 'red' )
                    {
                    // InternalTDsl.g:992:2: ( 'red' )
                    // InternalTDsl.g:993:3: 'red'
                    {
                     before(grammarAccess.getColorAccess().getRedKeyword_1_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getRedKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:998:2: ( 'green' )
                    {
                    // InternalTDsl.g:998:2: ( 'green' )
                    // InternalTDsl.g:999:3: 'green'
                    {
                     before(grammarAccess.getColorAccess().getGreenKeyword_1_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getGreenKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1004:2: ( 'blue' )
                    {
                    // InternalTDsl.g:1004:2: ( 'blue' )
                    // InternalTDsl.g:1005:3: 'blue'
                    {
                     before(grammarAccess.getColorAccess().getBlueKeyword_1_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getBlueKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1010:2: ( 'black' )
                    {
                    // InternalTDsl.g:1010:2: ( 'black' )
                    // InternalTDsl.g:1011:3: 'black'
                    {
                     before(grammarAccess.getColorAccess().getBlackKeyword_1_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getBlackKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1016:2: ( 'white' )
                    {
                    // InternalTDsl.g:1016:2: ( 'white' )
                    // InternalTDsl.g:1017:3: 'white'
                    {
                     before(grammarAccess.getColorAccess().getWhiteKeyword_1_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getWhiteKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTDsl.g:1022:2: ( 'yellow' )
                    {
                    // InternalTDsl.g:1022:2: ( 'yellow' )
                    // InternalTDsl.g:1023:3: 'yellow'
                    {
                     before(grammarAccess.getColorAccess().getYellowKeyword_1_5()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getYellowKeyword_1_5()); 

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
    // $ANTLR end "rule__Color__Alternatives_1"


    // $ANTLR start "rule__Sound__Alternatives"
    // InternalTDsl.g:1032:1: rule__Sound__Alternatives : ( ( 'sound1' ) | ( 'sound2' ) | ( 'sound3' ) | ( 'sound4' ) );
    public final void rule__Sound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1036:1: ( ( 'sound1' ) | ( 'sound2' ) | ( 'sound3' ) | ( 'sound4' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            case 32:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalTDsl.g:1037:2: ( 'sound1' )
                    {
                    // InternalTDsl.g:1037:2: ( 'sound1' )
                    // InternalTDsl.g:1038:3: 'sound1'
                    {
                     before(grammarAccess.getSoundAccess().getSound1Keyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSoundAccess().getSound1Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1043:2: ( 'sound2' )
                    {
                    // InternalTDsl.g:1043:2: ( 'sound2' )
                    // InternalTDsl.g:1044:3: 'sound2'
                    {
                     before(grammarAccess.getSoundAccess().getSound2Keyword_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSoundAccess().getSound2Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1049:2: ( 'sound3' )
                    {
                    // InternalTDsl.g:1049:2: ( 'sound3' )
                    // InternalTDsl.g:1050:3: 'sound3'
                    {
                     before(grammarAccess.getSoundAccess().getSound3Keyword_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSoundAccess().getSound3Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1055:2: ( 'sound4' )
                    {
                    // InternalTDsl.g:1055:2: ( 'sound4' )
                    // InternalTDsl.g:1056:3: 'sound4'
                    {
                     before(grammarAccess.getSoundAccess().getSound4Keyword_3()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getSoundAccess().getSound4Keyword_3()); 

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
    // $ANTLR end "rule__Sound__Alternatives"


    // $ANTLR start "rule__Buttons__Alternatives"
    // InternalTDsl.g:1065:1: rule__Buttons__Alternatives : ( ( 'center' ) | ( 'right' ) | ( 'left' ) | ( 'forward' ) | ( 'backward' ) );
    public final void rule__Buttons__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1069:1: ( ( 'center' ) | ( 'right' ) | ( 'left' ) | ( 'forward' ) | ( 'backward' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            case 11:
                {
                alt18=4;
                }
                break;
            case 12:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalTDsl.g:1070:2: ( 'center' )
                    {
                    // InternalTDsl.g:1070:2: ( 'center' )
                    // InternalTDsl.g:1071:3: 'center'
                    {
                     before(grammarAccess.getButtonsAccess().getCenterKeyword_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getButtonsAccess().getCenterKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1076:2: ( 'right' )
                    {
                    // InternalTDsl.g:1076:2: ( 'right' )
                    // InternalTDsl.g:1077:3: 'right'
                    {
                     before(grammarAccess.getButtonsAccess().getRightKeyword_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getButtonsAccess().getRightKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1082:2: ( 'left' )
                    {
                    // InternalTDsl.g:1082:2: ( 'left' )
                    // InternalTDsl.g:1083:3: 'left'
                    {
                     before(grammarAccess.getButtonsAccess().getLeftKeyword_2()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getButtonsAccess().getLeftKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1088:2: ( 'forward' )
                    {
                    // InternalTDsl.g:1088:2: ( 'forward' )
                    // InternalTDsl.g:1089:3: 'forward'
                    {
                     before(grammarAccess.getButtonsAccess().getForwardKeyword_3()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getButtonsAccess().getForwardKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1094:2: ( 'backward' )
                    {
                    // InternalTDsl.g:1094:2: ( 'backward' )
                    // InternalTDsl.g:1095:3: 'backward'
                    {
                     before(grammarAccess.getButtonsAccess().getBackwardKeyword_4()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getButtonsAccess().getBackwardKeyword_4()); 

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
    // $ANTLR end "rule__Buttons__Alternatives"


    // $ANTLR start "rule__State__Alternatives"
    // InternalTDsl.g:1104:1: rule__State__Alternatives : ( ( 'touched' ) | ( 'released' ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1108:1: ( ( 'touched' ) | ( 'released' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            else if ( (LA19_0==37) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalTDsl.g:1109:2: ( 'touched' )
                    {
                    // InternalTDsl.g:1109:2: ( 'touched' )
                    // InternalTDsl.g:1110:3: 'touched'
                    {
                     before(grammarAccess.getStateAccess().getTouchedKeyword_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getTouchedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1115:2: ( 'released' )
                    {
                    // InternalTDsl.g:1115:2: ( 'released' )
                    // InternalTDsl.g:1116:3: 'released'
                    {
                     before(grammarAccess.getStateAccess().getReleasedKeyword_1()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getReleasedKeyword_1()); 

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
    // $ANTLR end "rule__State__Alternatives"


    // $ANTLR start "rule__RightLeft__Alternatives"
    // InternalTDsl.g:1125:1: rule__RightLeft__Alternatives : ( ( 'left' ) | ( 'right' ) );
    public final void rule__RightLeft__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1129:1: ( ( 'left' ) | ( 'right' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            else if ( (LA20_0==34) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalTDsl.g:1130:2: ( 'left' )
                    {
                    // InternalTDsl.g:1130:2: ( 'left' )
                    // InternalTDsl.g:1131:3: 'left'
                    {
                     before(grammarAccess.getRightLeftAccess().getLeftKeyword_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getRightLeftAccess().getLeftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1136:2: ( 'right' )
                    {
                    // InternalTDsl.g:1136:2: ( 'right' )
                    // InternalTDsl.g:1137:3: 'right'
                    {
                     before(grammarAccess.getRightLeftAccess().getRightKeyword_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getRightLeftAccess().getRightKeyword_1()); 

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
    // $ANTLR end "rule__RightLeft__Alternatives"


    // $ANTLR start "rule__HorizontalSensors__Alternatives"
    // InternalTDsl.g:1146:1: rule__HorizontalSensors__Alternatives : ( ( ( rule__HorizontalSensors__Group_0__0 ) ) | ( ( rule__HorizontalSensors__Group_1__0 ) ) | ( ( rule__HorizontalSensors__Group_2__0 ) ) | ( ( rule__HorizontalSensors__Group_3__0 ) ) | ( ( rule__HorizontalSensors__Group_4__0 ) ) | ( ( rule__HorizontalSensors__Group_5__0 ) ) | ( ( rule__HorizontalSensors__Group_6__0 ) ) );
    public final void rule__HorizontalSensors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1150:1: ( ( ( rule__HorizontalSensors__Group_0__0 ) ) | ( ( rule__HorizontalSensors__Group_1__0 ) ) | ( ( rule__HorizontalSensors__Group_2__0 ) ) | ( ( rule__HorizontalSensors__Group_3__0 ) ) | ( ( rule__HorizontalSensors__Group_4__0 ) ) | ( ( rule__HorizontalSensors__Group_5__0 ) ) | ( ( rule__HorizontalSensors__Group_6__0 ) ) )
            int alt21=7;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalTDsl.g:1151:2: ( ( rule__HorizontalSensors__Group_0__0 ) )
                    {
                    // InternalTDsl.g:1151:2: ( ( rule__HorizontalSensors__Group_0__0 ) )
                    // InternalTDsl.g:1152:3: ( rule__HorizontalSensors__Group_0__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_0()); 
                    // InternalTDsl.g:1153:3: ( rule__HorizontalSensors__Group_0__0 )
                    // InternalTDsl.g:1153:4: rule__HorizontalSensors__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HorizontalSensors__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHorizontalSensorsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1157:2: ( ( rule__HorizontalSensors__Group_1__0 ) )
                    {
                    // InternalTDsl.g:1157:2: ( ( rule__HorizontalSensors__Group_1__0 ) )
                    // InternalTDsl.g:1158:3: ( rule__HorizontalSensors__Group_1__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_1()); 
                    // InternalTDsl.g:1159:3: ( rule__HorizontalSensors__Group_1__0 )
                    // InternalTDsl.g:1159:4: rule__HorizontalSensors__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HorizontalSensors__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHorizontalSensorsAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1163:2: ( ( rule__HorizontalSensors__Group_2__0 ) )
                    {
                    // InternalTDsl.g:1163:2: ( ( rule__HorizontalSensors__Group_2__0 ) )
                    // InternalTDsl.g:1164:3: ( rule__HorizontalSensors__Group_2__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_2()); 
                    // InternalTDsl.g:1165:3: ( rule__HorizontalSensors__Group_2__0 )
                    // InternalTDsl.g:1165:4: rule__HorizontalSensors__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HorizontalSensors__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHorizontalSensorsAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1169:2: ( ( rule__HorizontalSensors__Group_3__0 ) )
                    {
                    // InternalTDsl.g:1169:2: ( ( rule__HorizontalSensors__Group_3__0 ) )
                    // InternalTDsl.g:1170:3: ( rule__HorizontalSensors__Group_3__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_3()); 
                    // InternalTDsl.g:1171:3: ( rule__HorizontalSensors__Group_3__0 )
                    // InternalTDsl.g:1171:4: rule__HorizontalSensors__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HorizontalSensors__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHorizontalSensorsAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1175:2: ( ( rule__HorizontalSensors__Group_4__0 ) )
                    {
                    // InternalTDsl.g:1175:2: ( ( rule__HorizontalSensors__Group_4__0 ) )
                    // InternalTDsl.g:1176:3: ( rule__HorizontalSensors__Group_4__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_4()); 
                    // InternalTDsl.g:1177:3: ( rule__HorizontalSensors__Group_4__0 )
                    // InternalTDsl.g:1177:4: rule__HorizontalSensors__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HorizontalSensors__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHorizontalSensorsAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTDsl.g:1181:2: ( ( rule__HorizontalSensors__Group_5__0 ) )
                    {
                    // InternalTDsl.g:1181:2: ( ( rule__HorizontalSensors__Group_5__0 ) )
                    // InternalTDsl.g:1182:3: ( rule__HorizontalSensors__Group_5__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_5()); 
                    // InternalTDsl.g:1183:3: ( rule__HorizontalSensors__Group_5__0 )
                    // InternalTDsl.g:1183:4: rule__HorizontalSensors__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HorizontalSensors__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHorizontalSensorsAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTDsl.g:1187:2: ( ( rule__HorizontalSensors__Group_6__0 ) )
                    {
                    // InternalTDsl.g:1187:2: ( ( rule__HorizontalSensors__Group_6__0 ) )
                    // InternalTDsl.g:1188:3: ( rule__HorizontalSensors__Group_6__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_6()); 
                    // InternalTDsl.g:1189:3: ( rule__HorizontalSensors__Group_6__0 )
                    // InternalTDsl.g:1189:4: rule__HorizontalSensors__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HorizontalSensors__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHorizontalSensorsAccess().getGroup_6()); 

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
    // $ANTLR end "rule__HorizontalSensors__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalTDsl.g:1197:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1201:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalTDsl.g:1202:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

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
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalTDsl.g:1209:1: rule__Statement__Group__0__Impl : ( '->' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1213:1: ( ( '->' ) )
            // InternalTDsl.g:1214:1: ( '->' )
            {
            // InternalTDsl.g:1214:1: ( '->' )
            // InternalTDsl.g:1215:2: '->'
            {
             before(grammarAccess.getStatementAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalTDsl.g:1224:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1228:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // InternalTDsl.g:1229:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__2();

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
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalTDsl.g:1236:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__EventAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1240:1: ( ( ( rule__Statement__EventAssignment_1 ) ) )
            // InternalTDsl.g:1241:1: ( ( rule__Statement__EventAssignment_1 ) )
            {
            // InternalTDsl.g:1241:1: ( ( rule__Statement__EventAssignment_1 ) )
            // InternalTDsl.g:1242:2: ( rule__Statement__EventAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getEventAssignment_1()); 
            // InternalTDsl.g:1243:2: ( rule__Statement__EventAssignment_1 )
            // InternalTDsl.g:1243:3: rule__Statement__EventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getEventAssignment_1()); 

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
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__2"
    // InternalTDsl.g:1251:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1255:1: ( rule__Statement__Group__2__Impl )
            // InternalTDsl.g:1256:2: rule__Statement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__2__Impl();

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
    // $ANTLR end "rule__Statement__Group__2"


    // $ANTLR start "rule__Statement__Group__2__Impl"
    // InternalTDsl.g:1262:1: rule__Statement__Group__2__Impl : ( ( ( rule__Statement__Alternatives_2 ) ) ( ( rule__Statement__Alternatives_2 )* ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1266:1: ( ( ( ( rule__Statement__Alternatives_2 ) ) ( ( rule__Statement__Alternatives_2 )* ) ) )
            // InternalTDsl.g:1267:1: ( ( ( rule__Statement__Alternatives_2 ) ) ( ( rule__Statement__Alternatives_2 )* ) )
            {
            // InternalTDsl.g:1267:1: ( ( ( rule__Statement__Alternatives_2 ) ) ( ( rule__Statement__Alternatives_2 )* ) )
            // InternalTDsl.g:1268:2: ( ( rule__Statement__Alternatives_2 ) ) ( ( rule__Statement__Alternatives_2 )* )
            {
            // InternalTDsl.g:1268:2: ( ( rule__Statement__Alternatives_2 ) )
            // InternalTDsl.g:1269:3: ( rule__Statement__Alternatives_2 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_2()); 
            // InternalTDsl.g:1270:3: ( rule__Statement__Alternatives_2 )
            // InternalTDsl.g:1270:4: rule__Statement__Alternatives_2
            {
            pushFollow(FOLLOW_6);
            rule__Statement__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_2()); 

            }

            // InternalTDsl.g:1273:2: ( ( rule__Statement__Alternatives_2 )* )
            // InternalTDsl.g:1274:3: ( rule__Statement__Alternatives_2 )*
            {
             before(grammarAccess.getStatementAccess().getAlternatives_2()); 
            // InternalTDsl.g:1275:3: ( rule__Statement__Alternatives_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19||LA22_0==56) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTDsl.g:1275:4: rule__Statement__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Statement__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Statement__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalTDsl.g:1285:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1289:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalTDsl.g:1290:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalTDsl.g:1297:1: rule__Action__Group__0__Impl : ( '-' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1301:1: ( ( '-' ) )
            // InternalTDsl.g:1302:1: ( '-' )
            {
            // InternalTDsl.g:1302:1: ( '-' )
            // InternalTDsl.g:1303:2: '-'
            {
             before(grammarAccess.getActionAccess().getHyphenMinusKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalTDsl.g:1312:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1316:1: ( rule__Action__Group__1__Impl )
            // InternalTDsl.g:1317:2: rule__Action__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__1__Impl();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalTDsl.g:1323:1: rule__Action__Group__1__Impl : ( ( rule__Action__Alternatives_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1327:1: ( ( ( rule__Action__Alternatives_1 ) ) )
            // InternalTDsl.g:1328:1: ( ( rule__Action__Alternatives_1 ) )
            {
            // InternalTDsl.g:1328:1: ( ( rule__Action__Alternatives_1 ) )
            // InternalTDsl.g:1329:2: ( rule__Action__Alternatives_1 )
            {
             before(grammarAccess.getActionAccess().getAlternatives_1()); 
            // InternalTDsl.g:1330:2: ( rule__Action__Alternatives_1 )
            // InternalTDsl.g:1330:3: rule__Action__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__MovementAction__Group_0__0"
    // InternalTDsl.g:1339:1: rule__MovementAction__Group_0__0 : rule__MovementAction__Group_0__0__Impl rule__MovementAction__Group_0__1 ;
    public final void rule__MovementAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1343:1: ( rule__MovementAction__Group_0__0__Impl rule__MovementAction__Group_0__1 )
            // InternalTDsl.g:1344:2: rule__MovementAction__Group_0__0__Impl rule__MovementAction__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__MovementAction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_0__1();

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
    // $ANTLR end "rule__MovementAction__Group_0__0"


    // $ANTLR start "rule__MovementAction__Group_0__0__Impl"
    // InternalTDsl.g:1351:1: rule__MovementAction__Group_0__0__Impl : ( 'drive' ) ;
    public final void rule__MovementAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1355:1: ( ( 'drive' ) )
            // InternalTDsl.g:1356:1: ( 'drive' )
            {
            // InternalTDsl.g:1356:1: ( 'drive' )
            // InternalTDsl.g:1357:2: 'drive'
            {
             before(grammarAccess.getMovementActionAccess().getDriveKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMovementActionAccess().getDriveKeyword_0_0()); 

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
    // $ANTLR end "rule__MovementAction__Group_0__0__Impl"


    // $ANTLR start "rule__MovementAction__Group_0__1"
    // InternalTDsl.g:1366:1: rule__MovementAction__Group_0__1 : rule__MovementAction__Group_0__1__Impl rule__MovementAction__Group_0__2 ;
    public final void rule__MovementAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1370:1: ( rule__MovementAction__Group_0__1__Impl rule__MovementAction__Group_0__2 )
            // InternalTDsl.g:1371:2: rule__MovementAction__Group_0__1__Impl rule__MovementAction__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__MovementAction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_0__2();

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
    // $ANTLR end "rule__MovementAction__Group_0__1"


    // $ANTLR start "rule__MovementAction__Group_0__1__Impl"
    // InternalTDsl.g:1378:1: rule__MovementAction__Group_0__1__Impl : ( ( rule__MovementAction__DirectionAssignment_0_1 ) ) ;
    public final void rule__MovementAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1382:1: ( ( ( rule__MovementAction__DirectionAssignment_0_1 ) ) )
            // InternalTDsl.g:1383:1: ( ( rule__MovementAction__DirectionAssignment_0_1 ) )
            {
            // InternalTDsl.g:1383:1: ( ( rule__MovementAction__DirectionAssignment_0_1 ) )
            // InternalTDsl.g:1384:2: ( rule__MovementAction__DirectionAssignment_0_1 )
            {
             before(grammarAccess.getMovementActionAccess().getDirectionAssignment_0_1()); 
            // InternalTDsl.g:1385:2: ( rule__MovementAction__DirectionAssignment_0_1 )
            // InternalTDsl.g:1385:3: rule__MovementAction__DirectionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__DirectionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMovementActionAccess().getDirectionAssignment_0_1()); 

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
    // $ANTLR end "rule__MovementAction__Group_0__1__Impl"


    // $ANTLR start "rule__MovementAction__Group_0__2"
    // InternalTDsl.g:1393:1: rule__MovementAction__Group_0__2 : rule__MovementAction__Group_0__2__Impl ;
    public final void rule__MovementAction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1397:1: ( rule__MovementAction__Group_0__2__Impl )
            // InternalTDsl.g:1398:2: rule__MovementAction__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_0__2__Impl();

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
    // $ANTLR end "rule__MovementAction__Group_0__2"


    // $ANTLR start "rule__MovementAction__Group_0__2__Impl"
    // InternalTDsl.g:1404:1: rule__MovementAction__Group_0__2__Impl : ( ( rule__MovementAction__Group_0_2__0 )? ) ;
    public final void rule__MovementAction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1408:1: ( ( ( rule__MovementAction__Group_0_2__0 )? ) )
            // InternalTDsl.g:1409:1: ( ( rule__MovementAction__Group_0_2__0 )? )
            {
            // InternalTDsl.g:1409:1: ( ( rule__MovementAction__Group_0_2__0 )? )
            // InternalTDsl.g:1410:2: ( rule__MovementAction__Group_0_2__0 )?
            {
             before(grammarAccess.getMovementActionAccess().getGroup_0_2()); 
            // InternalTDsl.g:1411:2: ( rule__MovementAction__Group_0_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTDsl.g:1411:3: rule__MovementAction__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MovementAction__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMovementActionAccess().getGroup_0_2()); 

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
    // $ANTLR end "rule__MovementAction__Group_0__2__Impl"


    // $ANTLR start "rule__MovementAction__Group_0_2__0"
    // InternalTDsl.g:1420:1: rule__MovementAction__Group_0_2__0 : rule__MovementAction__Group_0_2__0__Impl rule__MovementAction__Group_0_2__1 ;
    public final void rule__MovementAction__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1424:1: ( rule__MovementAction__Group_0_2__0__Impl rule__MovementAction__Group_0_2__1 )
            // InternalTDsl.g:1425:2: rule__MovementAction__Group_0_2__0__Impl rule__MovementAction__Group_0_2__1
            {
            pushFollow(FOLLOW_10);
            rule__MovementAction__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_0_2__1();

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
    // $ANTLR end "rule__MovementAction__Group_0_2__0"


    // $ANTLR start "rule__MovementAction__Group_0_2__0__Impl"
    // InternalTDsl.g:1432:1: rule__MovementAction__Group_0_2__0__Impl : ( 'with' ) ;
    public final void rule__MovementAction__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1436:1: ( ( 'with' ) )
            // InternalTDsl.g:1437:1: ( 'with' )
            {
            // InternalTDsl.g:1437:1: ( 'with' )
            // InternalTDsl.g:1438:2: 'with'
            {
             before(grammarAccess.getMovementActionAccess().getWithKeyword_0_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMovementActionAccess().getWithKeyword_0_2_0()); 

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
    // $ANTLR end "rule__MovementAction__Group_0_2__0__Impl"


    // $ANTLR start "rule__MovementAction__Group_0_2__1"
    // InternalTDsl.g:1447:1: rule__MovementAction__Group_0_2__1 : rule__MovementAction__Group_0_2__1__Impl rule__MovementAction__Group_0_2__2 ;
    public final void rule__MovementAction__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1451:1: ( rule__MovementAction__Group_0_2__1__Impl rule__MovementAction__Group_0_2__2 )
            // InternalTDsl.g:1452:2: rule__MovementAction__Group_0_2__1__Impl rule__MovementAction__Group_0_2__2
            {
            pushFollow(FOLLOW_11);
            rule__MovementAction__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_0_2__2();

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
    // $ANTLR end "rule__MovementAction__Group_0_2__1"


    // $ANTLR start "rule__MovementAction__Group_0_2__1__Impl"
    // InternalTDsl.g:1459:1: rule__MovementAction__Group_0_2__1__Impl : ( 'speed' ) ;
    public final void rule__MovementAction__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1463:1: ( ( 'speed' ) )
            // InternalTDsl.g:1464:1: ( 'speed' )
            {
            // InternalTDsl.g:1464:1: ( 'speed' )
            // InternalTDsl.g:1465:2: 'speed'
            {
             before(grammarAccess.getMovementActionAccess().getSpeedKeyword_0_2_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMovementActionAccess().getSpeedKeyword_0_2_1()); 

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
    // $ANTLR end "rule__MovementAction__Group_0_2__1__Impl"


    // $ANTLR start "rule__MovementAction__Group_0_2__2"
    // InternalTDsl.g:1474:1: rule__MovementAction__Group_0_2__2 : rule__MovementAction__Group_0_2__2__Impl ;
    public final void rule__MovementAction__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1478:1: ( rule__MovementAction__Group_0_2__2__Impl )
            // InternalTDsl.g:1479:2: rule__MovementAction__Group_0_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_0_2__2__Impl();

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
    // $ANTLR end "rule__MovementAction__Group_0_2__2"


    // $ANTLR start "rule__MovementAction__Group_0_2__2__Impl"
    // InternalTDsl.g:1485:1: rule__MovementAction__Group_0_2__2__Impl : ( ( rule__MovementAction__SpeedAssignment_0_2_2 ) ) ;
    public final void rule__MovementAction__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1489:1: ( ( ( rule__MovementAction__SpeedAssignment_0_2_2 ) ) )
            // InternalTDsl.g:1490:1: ( ( rule__MovementAction__SpeedAssignment_0_2_2 ) )
            {
            // InternalTDsl.g:1490:1: ( ( rule__MovementAction__SpeedAssignment_0_2_2 ) )
            // InternalTDsl.g:1491:2: ( rule__MovementAction__SpeedAssignment_0_2_2 )
            {
             before(grammarAccess.getMovementActionAccess().getSpeedAssignment_0_2_2()); 
            // InternalTDsl.g:1492:2: ( rule__MovementAction__SpeedAssignment_0_2_2 )
            // InternalTDsl.g:1492:3: rule__MovementAction__SpeedAssignment_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__SpeedAssignment_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMovementActionAccess().getSpeedAssignment_0_2_2()); 

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
    // $ANTLR end "rule__MovementAction__Group_0_2__2__Impl"


    // $ANTLR start "rule__MovementAction__Group_1__0"
    // InternalTDsl.g:1501:1: rule__MovementAction__Group_1__0 : rule__MovementAction__Group_1__0__Impl rule__MovementAction__Group_1__1 ;
    public final void rule__MovementAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1505:1: ( rule__MovementAction__Group_1__0__Impl rule__MovementAction__Group_1__1 )
            // InternalTDsl.g:1506:2: rule__MovementAction__Group_1__0__Impl rule__MovementAction__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MovementAction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_1__1();

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
    // $ANTLR end "rule__MovementAction__Group_1__0"


    // $ANTLR start "rule__MovementAction__Group_1__0__Impl"
    // InternalTDsl.g:1513:1: rule__MovementAction__Group_1__0__Impl : ( 'turn' ) ;
    public final void rule__MovementAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1517:1: ( ( 'turn' ) )
            // InternalTDsl.g:1518:1: ( 'turn' )
            {
            // InternalTDsl.g:1518:1: ( 'turn' )
            // InternalTDsl.g:1519:2: 'turn'
            {
             before(grammarAccess.getMovementActionAccess().getTurnKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMovementActionAccess().getTurnKeyword_1_0()); 

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
    // $ANTLR end "rule__MovementAction__Group_1__0__Impl"


    // $ANTLR start "rule__MovementAction__Group_1__1"
    // InternalTDsl.g:1528:1: rule__MovementAction__Group_1__1 : rule__MovementAction__Group_1__1__Impl ;
    public final void rule__MovementAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1532:1: ( rule__MovementAction__Group_1__1__Impl )
            // InternalTDsl.g:1533:2: rule__MovementAction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_1__1__Impl();

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
    // $ANTLR end "rule__MovementAction__Group_1__1"


    // $ANTLR start "rule__MovementAction__Group_1__1__Impl"
    // InternalTDsl.g:1539:1: rule__MovementAction__Group_1__1__Impl : ( ( rule__MovementAction__DirectionAssignment_1_1 ) ) ;
    public final void rule__MovementAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1543:1: ( ( ( rule__MovementAction__DirectionAssignment_1_1 ) ) )
            // InternalTDsl.g:1544:1: ( ( rule__MovementAction__DirectionAssignment_1_1 ) )
            {
            // InternalTDsl.g:1544:1: ( ( rule__MovementAction__DirectionAssignment_1_1 ) )
            // InternalTDsl.g:1545:2: ( rule__MovementAction__DirectionAssignment_1_1 )
            {
             before(grammarAccess.getMovementActionAccess().getDirectionAssignment_1_1()); 
            // InternalTDsl.g:1546:2: ( rule__MovementAction__DirectionAssignment_1_1 )
            // InternalTDsl.g:1546:3: rule__MovementAction__DirectionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__DirectionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMovementActionAccess().getDirectionAssignment_1_1()); 

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
    // $ANTLR end "rule__MovementAction__Group_1__1__Impl"


    // $ANTLR start "rule__MovementAction__Group_2__0"
    // InternalTDsl.g:1555:1: rule__MovementAction__Group_2__0 : rule__MovementAction__Group_2__0__Impl rule__MovementAction__Group_2__1 ;
    public final void rule__MovementAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1559:1: ( rule__MovementAction__Group_2__0__Impl rule__MovementAction__Group_2__1 )
            // InternalTDsl.g:1560:2: rule__MovementAction__Group_2__0__Impl rule__MovementAction__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__MovementAction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_2__1();

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
    // $ANTLR end "rule__MovementAction__Group_2__0"


    // $ANTLR start "rule__MovementAction__Group_2__0__Impl"
    // InternalTDsl.g:1567:1: rule__MovementAction__Group_2__0__Impl : ( () ) ;
    public final void rule__MovementAction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1571:1: ( ( () ) )
            // InternalTDsl.g:1572:1: ( () )
            {
            // InternalTDsl.g:1572:1: ( () )
            // InternalTDsl.g:1573:2: ()
            {
             before(grammarAccess.getMovementActionAccess().getMovementActionAction_2_0()); 
            // InternalTDsl.g:1574:2: ()
            // InternalTDsl.g:1574:3: 
            {
            }

             after(grammarAccess.getMovementActionAccess().getMovementActionAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovementAction__Group_2__0__Impl"


    // $ANTLR start "rule__MovementAction__Group_2__1"
    // InternalTDsl.g:1582:1: rule__MovementAction__Group_2__1 : rule__MovementAction__Group_2__1__Impl rule__MovementAction__Group_2__2 ;
    public final void rule__MovementAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1586:1: ( rule__MovementAction__Group_2__1__Impl rule__MovementAction__Group_2__2 )
            // InternalTDsl.g:1587:2: rule__MovementAction__Group_2__1__Impl rule__MovementAction__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__MovementAction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_2__2();

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
    // $ANTLR end "rule__MovementAction__Group_2__1"


    // $ANTLR start "rule__MovementAction__Group_2__1__Impl"
    // InternalTDsl.g:1594:1: rule__MovementAction__Group_2__1__Impl : ( 'stop' ) ;
    public final void rule__MovementAction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1598:1: ( ( 'stop' ) )
            // InternalTDsl.g:1599:1: ( 'stop' )
            {
            // InternalTDsl.g:1599:1: ( 'stop' )
            // InternalTDsl.g:1600:2: 'stop'
            {
             before(grammarAccess.getMovementActionAccess().getStopKeyword_2_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMovementActionAccess().getStopKeyword_2_1()); 

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
    // $ANTLR end "rule__MovementAction__Group_2__1__Impl"


    // $ANTLR start "rule__MovementAction__Group_2__2"
    // InternalTDsl.g:1609:1: rule__MovementAction__Group_2__2 : rule__MovementAction__Group_2__2__Impl ;
    public final void rule__MovementAction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1613:1: ( rule__MovementAction__Group_2__2__Impl )
            // InternalTDsl.g:1614:2: rule__MovementAction__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_2__2__Impl();

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
    // $ANTLR end "rule__MovementAction__Group_2__2"


    // $ANTLR start "rule__MovementAction__Group_2__2__Impl"
    // InternalTDsl.g:1620:1: rule__MovementAction__Group_2__2__Impl : ( 'driving' ) ;
    public final void rule__MovementAction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1624:1: ( ( 'driving' ) )
            // InternalTDsl.g:1625:1: ( 'driving' )
            {
            // InternalTDsl.g:1625:1: ( 'driving' )
            // InternalTDsl.g:1626:2: 'driving'
            {
             before(grammarAccess.getMovementActionAccess().getDrivingKeyword_2_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMovementActionAccess().getDrivingKeyword_2_2()); 

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
    // $ANTLR end "rule__MovementAction__Group_2__2__Impl"


    // $ANTLR start "rule__MovementAction__Group_3__0"
    // InternalTDsl.g:1636:1: rule__MovementAction__Group_3__0 : rule__MovementAction__Group_3__0__Impl rule__MovementAction__Group_3__1 ;
    public final void rule__MovementAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1640:1: ( rule__MovementAction__Group_3__0__Impl rule__MovementAction__Group_3__1 )
            // InternalTDsl.g:1641:2: rule__MovementAction__Group_3__0__Impl rule__MovementAction__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__MovementAction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_3__1();

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
    // $ANTLR end "rule__MovementAction__Group_3__0"


    // $ANTLR start "rule__MovementAction__Group_3__0__Impl"
    // InternalTDsl.g:1648:1: rule__MovementAction__Group_3__0__Impl : ( () ) ;
    public final void rule__MovementAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1652:1: ( ( () ) )
            // InternalTDsl.g:1653:1: ( () )
            {
            // InternalTDsl.g:1653:1: ( () )
            // InternalTDsl.g:1654:2: ()
            {
             before(grammarAccess.getMovementActionAccess().getMovementActionAction_3_0()); 
            // InternalTDsl.g:1655:2: ()
            // InternalTDsl.g:1655:3: 
            {
            }

             after(grammarAccess.getMovementActionAccess().getMovementActionAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovementAction__Group_3__0__Impl"


    // $ANTLR start "rule__MovementAction__Group_3__1"
    // InternalTDsl.g:1663:1: rule__MovementAction__Group_3__1 : rule__MovementAction__Group_3__1__Impl rule__MovementAction__Group_3__2 ;
    public final void rule__MovementAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1667:1: ( rule__MovementAction__Group_3__1__Impl rule__MovementAction__Group_3__2 )
            // InternalTDsl.g:1668:2: rule__MovementAction__Group_3__1__Impl rule__MovementAction__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__MovementAction__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_3__2();

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
    // $ANTLR end "rule__MovementAction__Group_3__1"


    // $ANTLR start "rule__MovementAction__Group_3__1__Impl"
    // InternalTDsl.g:1675:1: rule__MovementAction__Group_3__1__Impl : ( 'stop' ) ;
    public final void rule__MovementAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1679:1: ( ( 'stop' ) )
            // InternalTDsl.g:1680:1: ( 'stop' )
            {
            // InternalTDsl.g:1680:1: ( 'stop' )
            // InternalTDsl.g:1681:2: 'stop'
            {
             before(grammarAccess.getMovementActionAccess().getStopKeyword_3_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMovementActionAccess().getStopKeyword_3_1()); 

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
    // $ANTLR end "rule__MovementAction__Group_3__1__Impl"


    // $ANTLR start "rule__MovementAction__Group_3__2"
    // InternalTDsl.g:1690:1: rule__MovementAction__Group_3__2 : rule__MovementAction__Group_3__2__Impl ;
    public final void rule__MovementAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1694:1: ( rule__MovementAction__Group_3__2__Impl )
            // InternalTDsl.g:1695:2: rule__MovementAction__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__Group_3__2__Impl();

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
    // $ANTLR end "rule__MovementAction__Group_3__2"


    // $ANTLR start "rule__MovementAction__Group_3__2__Impl"
    // InternalTDsl.g:1701:1: rule__MovementAction__Group_3__2__Impl : ( 'turning' ) ;
    public final void rule__MovementAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1705:1: ( ( 'turning' ) )
            // InternalTDsl.g:1706:1: ( 'turning' )
            {
            // InternalTDsl.g:1706:1: ( 'turning' )
            // InternalTDsl.g:1707:2: 'turning'
            {
             before(grammarAccess.getMovementActionAccess().getTurningKeyword_3_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMovementActionAccess().getTurningKeyword_3_2()); 

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
    // $ANTLR end "rule__MovementAction__Group_3__2__Impl"


    // $ANTLR start "rule__SoundAction__Group_0__0"
    // InternalTDsl.g:1717:1: rule__SoundAction__Group_0__0 : rule__SoundAction__Group_0__0__Impl rule__SoundAction__Group_0__1 ;
    public final void rule__SoundAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1721:1: ( rule__SoundAction__Group_0__0__Impl rule__SoundAction__Group_0__1 )
            // InternalTDsl.g:1722:2: rule__SoundAction__Group_0__0__Impl rule__SoundAction__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__SoundAction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_0__1();

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
    // $ANTLR end "rule__SoundAction__Group_0__0"


    // $ANTLR start "rule__SoundAction__Group_0__0__Impl"
    // InternalTDsl.g:1729:1: rule__SoundAction__Group_0__0__Impl : ( 'play' ) ;
    public final void rule__SoundAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1733:1: ( ( 'play' ) )
            // InternalTDsl.g:1734:1: ( 'play' )
            {
            // InternalTDsl.g:1734:1: ( 'play' )
            // InternalTDsl.g:1735:2: 'play'
            {
             before(grammarAccess.getSoundActionAccess().getPlayKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSoundActionAccess().getPlayKeyword_0_0()); 

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
    // $ANTLR end "rule__SoundAction__Group_0__0__Impl"


    // $ANTLR start "rule__SoundAction__Group_0__1"
    // InternalTDsl.g:1744:1: rule__SoundAction__Group_0__1 : rule__SoundAction__Group_0__1__Impl rule__SoundAction__Group_0__2 ;
    public final void rule__SoundAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1748:1: ( rule__SoundAction__Group_0__1__Impl rule__SoundAction__Group_0__2 )
            // InternalTDsl.g:1749:2: rule__SoundAction__Group_0__1__Impl rule__SoundAction__Group_0__2
            {
            pushFollow(FOLLOW_18);
            rule__SoundAction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_0__2();

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
    // $ANTLR end "rule__SoundAction__Group_0__1"


    // $ANTLR start "rule__SoundAction__Group_0__1__Impl"
    // InternalTDsl.g:1756:1: rule__SoundAction__Group_0__1__Impl : ( 'sound' ) ;
    public final void rule__SoundAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1760:1: ( ( 'sound' ) )
            // InternalTDsl.g:1761:1: ( 'sound' )
            {
            // InternalTDsl.g:1761:1: ( 'sound' )
            // InternalTDsl.g:1762:2: 'sound'
            {
             before(grammarAccess.getSoundActionAccess().getSoundKeyword_0_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSoundActionAccess().getSoundKeyword_0_1()); 

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
    // $ANTLR end "rule__SoundAction__Group_0__1__Impl"


    // $ANTLR start "rule__SoundAction__Group_0__2"
    // InternalTDsl.g:1771:1: rule__SoundAction__Group_0__2 : rule__SoundAction__Group_0__2__Impl ;
    public final void rule__SoundAction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1775:1: ( rule__SoundAction__Group_0__2__Impl )
            // InternalTDsl.g:1776:2: rule__SoundAction__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_0__2__Impl();

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
    // $ANTLR end "rule__SoundAction__Group_0__2"


    // $ANTLR start "rule__SoundAction__Group_0__2__Impl"
    // InternalTDsl.g:1782:1: rule__SoundAction__Group_0__2__Impl : ( ( rule__SoundAction__SoundAssignment_0_2 ) ) ;
    public final void rule__SoundAction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1786:1: ( ( ( rule__SoundAction__SoundAssignment_0_2 ) ) )
            // InternalTDsl.g:1787:1: ( ( rule__SoundAction__SoundAssignment_0_2 ) )
            {
            // InternalTDsl.g:1787:1: ( ( rule__SoundAction__SoundAssignment_0_2 ) )
            // InternalTDsl.g:1788:2: ( rule__SoundAction__SoundAssignment_0_2 )
            {
             before(grammarAccess.getSoundActionAccess().getSoundAssignment_0_2()); 
            // InternalTDsl.g:1789:2: ( rule__SoundAction__SoundAssignment_0_2 )
            // InternalTDsl.g:1789:3: rule__SoundAction__SoundAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SoundAction__SoundAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSoundActionAccess().getSoundAssignment_0_2()); 

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
    // $ANTLR end "rule__SoundAction__Group_0__2__Impl"


    // $ANTLR start "rule__SoundAction__Group_1__0"
    // InternalTDsl.g:1798:1: rule__SoundAction__Group_1__0 : rule__SoundAction__Group_1__0__Impl rule__SoundAction__Group_1__1 ;
    public final void rule__SoundAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1802:1: ( rule__SoundAction__Group_1__0__Impl rule__SoundAction__Group_1__1 )
            // InternalTDsl.g:1803:2: rule__SoundAction__Group_1__0__Impl rule__SoundAction__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__SoundAction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_1__1();

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
    // $ANTLR end "rule__SoundAction__Group_1__0"


    // $ANTLR start "rule__SoundAction__Group_1__0__Impl"
    // InternalTDsl.g:1810:1: rule__SoundAction__Group_1__0__Impl : ( () ) ;
    public final void rule__SoundAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1814:1: ( ( () ) )
            // InternalTDsl.g:1815:1: ( () )
            {
            // InternalTDsl.g:1815:1: ( () )
            // InternalTDsl.g:1816:2: ()
            {
             before(grammarAccess.getSoundActionAccess().getSoundActionAction_1_0()); 
            // InternalTDsl.g:1817:2: ()
            // InternalTDsl.g:1817:3: 
            {
            }

             after(grammarAccess.getSoundActionAccess().getSoundActionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group_1__0__Impl"


    // $ANTLR start "rule__SoundAction__Group_1__1"
    // InternalTDsl.g:1825:1: rule__SoundAction__Group_1__1 : rule__SoundAction__Group_1__1__Impl rule__SoundAction__Group_1__2 ;
    public final void rule__SoundAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1829:1: ( rule__SoundAction__Group_1__1__Impl rule__SoundAction__Group_1__2 )
            // InternalTDsl.g:1830:2: rule__SoundAction__Group_1__1__Impl rule__SoundAction__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__SoundAction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_1__2();

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
    // $ANTLR end "rule__SoundAction__Group_1__1"


    // $ANTLR start "rule__SoundAction__Group_1__1__Impl"
    // InternalTDsl.g:1837:1: rule__SoundAction__Group_1__1__Impl : ( 'stop' ) ;
    public final void rule__SoundAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1841:1: ( ( 'stop' ) )
            // InternalTDsl.g:1842:1: ( 'stop' )
            {
            // InternalTDsl.g:1842:1: ( 'stop' )
            // InternalTDsl.g:1843:2: 'stop'
            {
             before(grammarAccess.getSoundActionAccess().getStopKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSoundActionAccess().getStopKeyword_1_1()); 

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
    // $ANTLR end "rule__SoundAction__Group_1__1__Impl"


    // $ANTLR start "rule__SoundAction__Group_1__2"
    // InternalTDsl.g:1852:1: rule__SoundAction__Group_1__2 : rule__SoundAction__Group_1__2__Impl rule__SoundAction__Group_1__3 ;
    public final void rule__SoundAction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1856:1: ( rule__SoundAction__Group_1__2__Impl rule__SoundAction__Group_1__3 )
            // InternalTDsl.g:1857:2: rule__SoundAction__Group_1__2__Impl rule__SoundAction__Group_1__3
            {
            pushFollow(FOLLOW_17);
            rule__SoundAction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_1__3();

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
    // $ANTLR end "rule__SoundAction__Group_1__2"


    // $ANTLR start "rule__SoundAction__Group_1__2__Impl"
    // InternalTDsl.g:1864:1: rule__SoundAction__Group_1__2__Impl : ( 'playing' ) ;
    public final void rule__SoundAction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1868:1: ( ( 'playing' ) )
            // InternalTDsl.g:1869:1: ( 'playing' )
            {
            // InternalTDsl.g:1869:1: ( 'playing' )
            // InternalTDsl.g:1870:2: 'playing'
            {
             before(grammarAccess.getSoundActionAccess().getPlayingKeyword_1_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSoundActionAccess().getPlayingKeyword_1_2()); 

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
    // $ANTLR end "rule__SoundAction__Group_1__2__Impl"


    // $ANTLR start "rule__SoundAction__Group_1__3"
    // InternalTDsl.g:1879:1: rule__SoundAction__Group_1__3 : rule__SoundAction__Group_1__3__Impl ;
    public final void rule__SoundAction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1883:1: ( rule__SoundAction__Group_1__3__Impl )
            // InternalTDsl.g:1884:2: rule__SoundAction__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_1__3__Impl();

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
    // $ANTLR end "rule__SoundAction__Group_1__3"


    // $ANTLR start "rule__SoundAction__Group_1__3__Impl"
    // InternalTDsl.g:1890:1: rule__SoundAction__Group_1__3__Impl : ( 'sound' ) ;
    public final void rule__SoundAction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1894:1: ( ( 'sound' ) )
            // InternalTDsl.g:1895:1: ( 'sound' )
            {
            // InternalTDsl.g:1895:1: ( 'sound' )
            // InternalTDsl.g:1896:2: 'sound'
            {
             before(grammarAccess.getSoundActionAccess().getSoundKeyword_1_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSoundActionAccess().getSoundKeyword_1_3()); 

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
    // $ANTLR end "rule__SoundAction__Group_1__3__Impl"


    // $ANTLR start "rule__ColorBottomAction__Group_0__0"
    // InternalTDsl.g:1906:1: rule__ColorBottomAction__Group_0__0 : rule__ColorBottomAction__Group_0__0__Impl rule__ColorBottomAction__Group_0__1 ;
    public final void rule__ColorBottomAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1910:1: ( rule__ColorBottomAction__Group_0__0__Impl rule__ColorBottomAction__Group_0__1 )
            // InternalTDsl.g:1911:2: rule__ColorBottomAction__Group_0__0__Impl rule__ColorBottomAction__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__ColorBottomAction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__Group_0__1();

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
    // $ANTLR end "rule__ColorBottomAction__Group_0__0"


    // $ANTLR start "rule__ColorBottomAction__Group_0__0__Impl"
    // InternalTDsl.g:1918:1: rule__ColorBottomAction__Group_0__0__Impl : ( 'set' ) ;
    public final void rule__ColorBottomAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1922:1: ( ( 'set' ) )
            // InternalTDsl.g:1923:1: ( 'set' )
            {
            // InternalTDsl.g:1923:1: ( 'set' )
            // InternalTDsl.g:1924:2: 'set'
            {
             before(grammarAccess.getColorBottomActionAccess().getSetKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getColorBottomActionAccess().getSetKeyword_0_0()); 

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
    // $ANTLR end "rule__ColorBottomAction__Group_0__0__Impl"


    // $ANTLR start "rule__ColorBottomAction__Group_0__1"
    // InternalTDsl.g:1933:1: rule__ColorBottomAction__Group_0__1 : rule__ColorBottomAction__Group_0__1__Impl rule__ColorBottomAction__Group_0__2 ;
    public final void rule__ColorBottomAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1937:1: ( rule__ColorBottomAction__Group_0__1__Impl rule__ColorBottomAction__Group_0__2 )
            // InternalTDsl.g:1938:2: rule__ColorBottomAction__Group_0__1__Impl rule__ColorBottomAction__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__ColorBottomAction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__Group_0__2();

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
    // $ANTLR end "rule__ColorBottomAction__Group_0__1"


    // $ANTLR start "rule__ColorBottomAction__Group_0__1__Impl"
    // InternalTDsl.g:1945:1: rule__ColorBottomAction__Group_0__1__Impl : ( 'bottom' ) ;
    public final void rule__ColorBottomAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1949:1: ( ( 'bottom' ) )
            // InternalTDsl.g:1950:1: ( 'bottom' )
            {
            // InternalTDsl.g:1950:1: ( 'bottom' )
            // InternalTDsl.g:1951:2: 'bottom'
            {
             before(grammarAccess.getColorBottomActionAccess().getBottomKeyword_0_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getColorBottomActionAccess().getBottomKeyword_0_1()); 

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
    // $ANTLR end "rule__ColorBottomAction__Group_0__1__Impl"


    // $ANTLR start "rule__ColorBottomAction__Group_0__2"
    // InternalTDsl.g:1960:1: rule__ColorBottomAction__Group_0__2 : rule__ColorBottomAction__Group_0__2__Impl rule__ColorBottomAction__Group_0__3 ;
    public final void rule__ColorBottomAction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1964:1: ( rule__ColorBottomAction__Group_0__2__Impl rule__ColorBottomAction__Group_0__3 )
            // InternalTDsl.g:1965:2: rule__ColorBottomAction__Group_0__2__Impl rule__ColorBottomAction__Group_0__3
            {
            pushFollow(FOLLOW_23);
            rule__ColorBottomAction__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__Group_0__3();

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
    // $ANTLR end "rule__ColorBottomAction__Group_0__2"


    // $ANTLR start "rule__ColorBottomAction__Group_0__2__Impl"
    // InternalTDsl.g:1972:1: rule__ColorBottomAction__Group_0__2__Impl : ( 'color' ) ;
    public final void rule__ColorBottomAction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1976:1: ( ( 'color' ) )
            // InternalTDsl.g:1977:1: ( 'color' )
            {
            // InternalTDsl.g:1977:1: ( 'color' )
            // InternalTDsl.g:1978:2: 'color'
            {
             before(grammarAccess.getColorBottomActionAccess().getColorKeyword_0_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getColorBottomActionAccess().getColorKeyword_0_2()); 

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
    // $ANTLR end "rule__ColorBottomAction__Group_0__2__Impl"


    // $ANTLR start "rule__ColorBottomAction__Group_0__3"
    // InternalTDsl.g:1987:1: rule__ColorBottomAction__Group_0__3 : rule__ColorBottomAction__Group_0__3__Impl rule__ColorBottomAction__Group_0__4 ;
    public final void rule__ColorBottomAction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1991:1: ( rule__ColorBottomAction__Group_0__3__Impl rule__ColorBottomAction__Group_0__4 )
            // InternalTDsl.g:1992:2: rule__ColorBottomAction__Group_0__3__Impl rule__ColorBottomAction__Group_0__4
            {
            pushFollow(FOLLOW_24);
            rule__ColorBottomAction__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__Group_0__4();

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
    // $ANTLR end "rule__ColorBottomAction__Group_0__3"


    // $ANTLR start "rule__ColorBottomAction__Group_0__3__Impl"
    // InternalTDsl.g:1999:1: rule__ColorBottomAction__Group_0__3__Impl : ( 'to' ) ;
    public final void rule__ColorBottomAction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2003:1: ( ( 'to' ) )
            // InternalTDsl.g:2004:1: ( 'to' )
            {
            // InternalTDsl.g:2004:1: ( 'to' )
            // InternalTDsl.g:2005:2: 'to'
            {
             before(grammarAccess.getColorBottomActionAccess().getToKeyword_0_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getColorBottomActionAccess().getToKeyword_0_3()); 

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
    // $ANTLR end "rule__ColorBottomAction__Group_0__3__Impl"


    // $ANTLR start "rule__ColorBottomAction__Group_0__4"
    // InternalTDsl.g:2014:1: rule__ColorBottomAction__Group_0__4 : rule__ColorBottomAction__Group_0__4__Impl ;
    public final void rule__ColorBottomAction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2018:1: ( rule__ColorBottomAction__Group_0__4__Impl )
            // InternalTDsl.g:2019:2: rule__ColorBottomAction__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__Group_0__4__Impl();

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
    // $ANTLR end "rule__ColorBottomAction__Group_0__4"


    // $ANTLR start "rule__ColorBottomAction__Group_0__4__Impl"
    // InternalTDsl.g:2025:1: rule__ColorBottomAction__Group_0__4__Impl : ( ( rule__ColorBottomAction__ColorAssignment_0_4 ) ) ;
    public final void rule__ColorBottomAction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2029:1: ( ( ( rule__ColorBottomAction__ColorAssignment_0_4 ) ) )
            // InternalTDsl.g:2030:1: ( ( rule__ColorBottomAction__ColorAssignment_0_4 ) )
            {
            // InternalTDsl.g:2030:1: ( ( rule__ColorBottomAction__ColorAssignment_0_4 ) )
            // InternalTDsl.g:2031:2: ( rule__ColorBottomAction__ColorAssignment_0_4 )
            {
             before(grammarAccess.getColorBottomActionAccess().getColorAssignment_0_4()); 
            // InternalTDsl.g:2032:2: ( rule__ColorBottomAction__ColorAssignment_0_4 )
            // InternalTDsl.g:2032:3: rule__ColorBottomAction__ColorAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__ColorAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getColorBottomActionAccess().getColorAssignment_0_4()); 

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
    // $ANTLR end "rule__ColorBottomAction__Group_0__4__Impl"


    // $ANTLR start "rule__ColorBottomAction__Group_1__0"
    // InternalTDsl.g:2041:1: rule__ColorBottomAction__Group_1__0 : rule__ColorBottomAction__Group_1__0__Impl rule__ColorBottomAction__Group_1__1 ;
    public final void rule__ColorBottomAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2045:1: ( rule__ColorBottomAction__Group_1__0__Impl rule__ColorBottomAction__Group_1__1 )
            // InternalTDsl.g:2046:2: rule__ColorBottomAction__Group_1__0__Impl rule__ColorBottomAction__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__ColorBottomAction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__Group_1__1();

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
    // $ANTLR end "rule__ColorBottomAction__Group_1__0"


    // $ANTLR start "rule__ColorBottomAction__Group_1__0__Impl"
    // InternalTDsl.g:2053:1: rule__ColorBottomAction__Group_1__0__Impl : ( () ) ;
    public final void rule__ColorBottomAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2057:1: ( ( () ) )
            // InternalTDsl.g:2058:1: ( () )
            {
            // InternalTDsl.g:2058:1: ( () )
            // InternalTDsl.g:2059:2: ()
            {
             before(grammarAccess.getColorBottomActionAccess().getColorBottomActionAction_1_0()); 
            // InternalTDsl.g:2060:2: ()
            // InternalTDsl.g:2060:3: 
            {
            }

             after(grammarAccess.getColorBottomActionAccess().getColorBottomActionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorBottomAction__Group_1__0__Impl"


    // $ANTLR start "rule__ColorBottomAction__Group_1__1"
    // InternalTDsl.g:2068:1: rule__ColorBottomAction__Group_1__1 : rule__ColorBottomAction__Group_1__1__Impl rule__ColorBottomAction__Group_1__2 ;
    public final void rule__ColorBottomAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2072:1: ( rule__ColorBottomAction__Group_1__1__Impl rule__ColorBottomAction__Group_1__2 )
            // InternalTDsl.g:2073:2: rule__ColorBottomAction__Group_1__1__Impl rule__ColorBottomAction__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__ColorBottomAction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__Group_1__2();

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
    // $ANTLR end "rule__ColorBottomAction__Group_1__1"


    // $ANTLR start "rule__ColorBottomAction__Group_1__1__Impl"
    // InternalTDsl.g:2080:1: rule__ColorBottomAction__Group_1__1__Impl : ( 'turn' ) ;
    public final void rule__ColorBottomAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2084:1: ( ( 'turn' ) )
            // InternalTDsl.g:2085:1: ( 'turn' )
            {
            // InternalTDsl.g:2085:1: ( 'turn' )
            // InternalTDsl.g:2086:2: 'turn'
            {
             before(grammarAccess.getColorBottomActionAccess().getTurnKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getColorBottomActionAccess().getTurnKeyword_1_1()); 

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
    // $ANTLR end "rule__ColorBottomAction__Group_1__1__Impl"


    // $ANTLR start "rule__ColorBottomAction__Group_1__2"
    // InternalTDsl.g:2095:1: rule__ColorBottomAction__Group_1__2 : rule__ColorBottomAction__Group_1__2__Impl rule__ColorBottomAction__Group_1__3 ;
    public final void rule__ColorBottomAction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2099:1: ( rule__ColorBottomAction__Group_1__2__Impl rule__ColorBottomAction__Group_1__3 )
            // InternalTDsl.g:2100:2: rule__ColorBottomAction__Group_1__2__Impl rule__ColorBottomAction__Group_1__3
            {
            pushFollow(FOLLOW_21);
            rule__ColorBottomAction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__Group_1__3();

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
    // $ANTLR end "rule__ColorBottomAction__Group_1__2"


    // $ANTLR start "rule__ColorBottomAction__Group_1__2__Impl"
    // InternalTDsl.g:2107:1: rule__ColorBottomAction__Group_1__2__Impl : ( 'off' ) ;
    public final void rule__ColorBottomAction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2111:1: ( ( 'off' ) )
            // InternalTDsl.g:2112:1: ( 'off' )
            {
            // InternalTDsl.g:2112:1: ( 'off' )
            // InternalTDsl.g:2113:2: 'off'
            {
             before(grammarAccess.getColorBottomActionAccess().getOffKeyword_1_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getColorBottomActionAccess().getOffKeyword_1_2()); 

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
    // $ANTLR end "rule__ColorBottomAction__Group_1__2__Impl"


    // $ANTLR start "rule__ColorBottomAction__Group_1__3"
    // InternalTDsl.g:2122:1: rule__ColorBottomAction__Group_1__3 : rule__ColorBottomAction__Group_1__3__Impl rule__ColorBottomAction__Group_1__4 ;
    public final void rule__ColorBottomAction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2126:1: ( rule__ColorBottomAction__Group_1__3__Impl rule__ColorBottomAction__Group_1__4 )
            // InternalTDsl.g:2127:2: rule__ColorBottomAction__Group_1__3__Impl rule__ColorBottomAction__Group_1__4
            {
            pushFollow(FOLLOW_27);
            rule__ColorBottomAction__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__Group_1__4();

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
    // $ANTLR end "rule__ColorBottomAction__Group_1__3"


    // $ANTLR start "rule__ColorBottomAction__Group_1__3__Impl"
    // InternalTDsl.g:2134:1: rule__ColorBottomAction__Group_1__3__Impl : ( 'bottom' ) ;
    public final void rule__ColorBottomAction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2138:1: ( ( 'bottom' ) )
            // InternalTDsl.g:2139:1: ( 'bottom' )
            {
            // InternalTDsl.g:2139:1: ( 'bottom' )
            // InternalTDsl.g:2140:2: 'bottom'
            {
             before(grammarAccess.getColorBottomActionAccess().getBottomKeyword_1_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getColorBottomActionAccess().getBottomKeyword_1_3()); 

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
    // $ANTLR end "rule__ColorBottomAction__Group_1__3__Impl"


    // $ANTLR start "rule__ColorBottomAction__Group_1__4"
    // InternalTDsl.g:2149:1: rule__ColorBottomAction__Group_1__4 : rule__ColorBottomAction__Group_1__4__Impl ;
    public final void rule__ColorBottomAction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2153:1: ( rule__ColorBottomAction__Group_1__4__Impl )
            // InternalTDsl.g:2154:2: rule__ColorBottomAction__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorBottomAction__Group_1__4__Impl();

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
    // $ANTLR end "rule__ColorBottomAction__Group_1__4"


    // $ANTLR start "rule__ColorBottomAction__Group_1__4__Impl"
    // InternalTDsl.g:2160:1: rule__ColorBottomAction__Group_1__4__Impl : ( 'leds' ) ;
    public final void rule__ColorBottomAction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2164:1: ( ( 'leds' ) )
            // InternalTDsl.g:2165:1: ( 'leds' )
            {
            // InternalTDsl.g:2165:1: ( 'leds' )
            // InternalTDsl.g:2166:2: 'leds'
            {
             before(grammarAccess.getColorBottomActionAccess().getLedsKeyword_1_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getColorBottomActionAccess().getLedsKeyword_1_4()); 

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
    // $ANTLR end "rule__ColorBottomAction__Group_1__4__Impl"


    // $ANTLR start "rule__ColorTopAction__Group_0__0"
    // InternalTDsl.g:2176:1: rule__ColorTopAction__Group_0__0 : rule__ColorTopAction__Group_0__0__Impl rule__ColorTopAction__Group_0__1 ;
    public final void rule__ColorTopAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2180:1: ( rule__ColorTopAction__Group_0__0__Impl rule__ColorTopAction__Group_0__1 )
            // InternalTDsl.g:2181:2: rule__ColorTopAction__Group_0__0__Impl rule__ColorTopAction__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__ColorTopAction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorTopAction__Group_0__1();

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
    // $ANTLR end "rule__ColorTopAction__Group_0__0"


    // $ANTLR start "rule__ColorTopAction__Group_0__0__Impl"
    // InternalTDsl.g:2188:1: rule__ColorTopAction__Group_0__0__Impl : ( 'set' ) ;
    public final void rule__ColorTopAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2192:1: ( ( 'set' ) )
            // InternalTDsl.g:2193:1: ( 'set' )
            {
            // InternalTDsl.g:2193:1: ( 'set' )
            // InternalTDsl.g:2194:2: 'set'
            {
             before(grammarAccess.getColorTopActionAccess().getSetKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getColorTopActionAccess().getSetKeyword_0_0()); 

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
    // $ANTLR end "rule__ColorTopAction__Group_0__0__Impl"


    // $ANTLR start "rule__ColorTopAction__Group_0__1"
    // InternalTDsl.g:2203:1: rule__ColorTopAction__Group_0__1 : rule__ColorTopAction__Group_0__1__Impl rule__ColorTopAction__Group_0__2 ;
    public final void rule__ColorTopAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2207:1: ( rule__ColorTopAction__Group_0__1__Impl rule__ColorTopAction__Group_0__2 )
            // InternalTDsl.g:2208:2: rule__ColorTopAction__Group_0__1__Impl rule__ColorTopAction__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__ColorTopAction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorTopAction__Group_0__2();

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
    // $ANTLR end "rule__ColorTopAction__Group_0__1"


    // $ANTLR start "rule__ColorTopAction__Group_0__1__Impl"
    // InternalTDsl.g:2215:1: rule__ColorTopAction__Group_0__1__Impl : ( 'top' ) ;
    public final void rule__ColorTopAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2219:1: ( ( 'top' ) )
            // InternalTDsl.g:2220:1: ( 'top' )
            {
            // InternalTDsl.g:2220:1: ( 'top' )
            // InternalTDsl.g:2221:2: 'top'
            {
             before(grammarAccess.getColorTopActionAccess().getTopKeyword_0_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getColorTopActionAccess().getTopKeyword_0_1()); 

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
    // $ANTLR end "rule__ColorTopAction__Group_0__1__Impl"


    // $ANTLR start "rule__ColorTopAction__Group_0__2"
    // InternalTDsl.g:2230:1: rule__ColorTopAction__Group_0__2 : rule__ColorTopAction__Group_0__2__Impl rule__ColorTopAction__Group_0__3 ;
    public final void rule__ColorTopAction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2234:1: ( rule__ColorTopAction__Group_0__2__Impl rule__ColorTopAction__Group_0__3 )
            // InternalTDsl.g:2235:2: rule__ColorTopAction__Group_0__2__Impl rule__ColorTopAction__Group_0__3
            {
            pushFollow(FOLLOW_23);
            rule__ColorTopAction__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorTopAction__Group_0__3();

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
    // $ANTLR end "rule__ColorTopAction__Group_0__2"


    // $ANTLR start "rule__ColorTopAction__Group_0__2__Impl"
    // InternalTDsl.g:2242:1: rule__ColorTopAction__Group_0__2__Impl : ( 'color' ) ;
    public final void rule__ColorTopAction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2246:1: ( ( 'color' ) )
            // InternalTDsl.g:2247:1: ( 'color' )
            {
            // InternalTDsl.g:2247:1: ( 'color' )
            // InternalTDsl.g:2248:2: 'color'
            {
             before(grammarAccess.getColorTopActionAccess().getColorKeyword_0_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getColorTopActionAccess().getColorKeyword_0_2()); 

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
    // $ANTLR end "rule__ColorTopAction__Group_0__2__Impl"


    // $ANTLR start "rule__ColorTopAction__Group_0__3"
    // InternalTDsl.g:2257:1: rule__ColorTopAction__Group_0__3 : rule__ColorTopAction__Group_0__3__Impl rule__ColorTopAction__Group_0__4 ;
    public final void rule__ColorTopAction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2261:1: ( rule__ColorTopAction__Group_0__3__Impl rule__ColorTopAction__Group_0__4 )
            // InternalTDsl.g:2262:2: rule__ColorTopAction__Group_0__3__Impl rule__ColorTopAction__Group_0__4
            {
            pushFollow(FOLLOW_24);
            rule__ColorTopAction__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorTopAction__Group_0__4();

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
    // $ANTLR end "rule__ColorTopAction__Group_0__3"


    // $ANTLR start "rule__ColorTopAction__Group_0__3__Impl"
    // InternalTDsl.g:2269:1: rule__ColorTopAction__Group_0__3__Impl : ( 'to' ) ;
    public final void rule__ColorTopAction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2273:1: ( ( 'to' ) )
            // InternalTDsl.g:2274:1: ( 'to' )
            {
            // InternalTDsl.g:2274:1: ( 'to' )
            // InternalTDsl.g:2275:2: 'to'
            {
             before(grammarAccess.getColorTopActionAccess().getToKeyword_0_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getColorTopActionAccess().getToKeyword_0_3()); 

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
    // $ANTLR end "rule__ColorTopAction__Group_0__3__Impl"


    // $ANTLR start "rule__ColorTopAction__Group_0__4"
    // InternalTDsl.g:2284:1: rule__ColorTopAction__Group_0__4 : rule__ColorTopAction__Group_0__4__Impl ;
    public final void rule__ColorTopAction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2288:1: ( rule__ColorTopAction__Group_0__4__Impl )
            // InternalTDsl.g:2289:2: rule__ColorTopAction__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorTopAction__Group_0__4__Impl();

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
    // $ANTLR end "rule__ColorTopAction__Group_0__4"


    // $ANTLR start "rule__ColorTopAction__Group_0__4__Impl"
    // InternalTDsl.g:2295:1: rule__ColorTopAction__Group_0__4__Impl : ( ( rule__ColorTopAction__ColorAssignment_0_4 ) ) ;
    public final void rule__ColorTopAction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2299:1: ( ( ( rule__ColorTopAction__ColorAssignment_0_4 ) ) )
            // InternalTDsl.g:2300:1: ( ( rule__ColorTopAction__ColorAssignment_0_4 ) )
            {
            // InternalTDsl.g:2300:1: ( ( rule__ColorTopAction__ColorAssignment_0_4 ) )
            // InternalTDsl.g:2301:2: ( rule__ColorTopAction__ColorAssignment_0_4 )
            {
             before(grammarAccess.getColorTopActionAccess().getColorAssignment_0_4()); 
            // InternalTDsl.g:2302:2: ( rule__ColorTopAction__ColorAssignment_0_4 )
            // InternalTDsl.g:2302:3: rule__ColorTopAction__ColorAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__ColorTopAction__ColorAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getColorTopActionAccess().getColorAssignment_0_4()); 

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
    // $ANTLR end "rule__ColorTopAction__Group_0__4__Impl"


    // $ANTLR start "rule__ColorTopAction__Group_1__0"
    // InternalTDsl.g:2311:1: rule__ColorTopAction__Group_1__0 : rule__ColorTopAction__Group_1__0__Impl rule__ColorTopAction__Group_1__1 ;
    public final void rule__ColorTopAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2315:1: ( rule__ColorTopAction__Group_1__0__Impl rule__ColorTopAction__Group_1__1 )
            // InternalTDsl.g:2316:2: rule__ColorTopAction__Group_1__0__Impl rule__ColorTopAction__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ColorTopAction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorTopAction__Group_1__1();

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
    // $ANTLR end "rule__ColorTopAction__Group_1__0"


    // $ANTLR start "rule__ColorTopAction__Group_1__0__Impl"
    // InternalTDsl.g:2323:1: rule__ColorTopAction__Group_1__0__Impl : ( () ) ;
    public final void rule__ColorTopAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2327:1: ( ( () ) )
            // InternalTDsl.g:2328:1: ( () )
            {
            // InternalTDsl.g:2328:1: ( () )
            // InternalTDsl.g:2329:2: ()
            {
             before(grammarAccess.getColorTopActionAccess().getColorTopActionAction_1_0()); 
            // InternalTDsl.g:2330:2: ()
            // InternalTDsl.g:2330:3: 
            {
            }

             after(grammarAccess.getColorTopActionAccess().getColorTopActionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorTopAction__Group_1__0__Impl"


    // $ANTLR start "rule__ColorTopAction__Group_1__1"
    // InternalTDsl.g:2338:1: rule__ColorTopAction__Group_1__1 : rule__ColorTopAction__Group_1__1__Impl rule__ColorTopAction__Group_1__2 ;
    public final void rule__ColorTopAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2342:1: ( rule__ColorTopAction__Group_1__1__Impl rule__ColorTopAction__Group_1__2 )
            // InternalTDsl.g:2343:2: rule__ColorTopAction__Group_1__1__Impl rule__ColorTopAction__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__ColorTopAction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorTopAction__Group_1__2();

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
    // $ANTLR end "rule__ColorTopAction__Group_1__1"


    // $ANTLR start "rule__ColorTopAction__Group_1__1__Impl"
    // InternalTDsl.g:2350:1: rule__ColorTopAction__Group_1__1__Impl : ( 'turn' ) ;
    public final void rule__ColorTopAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2354:1: ( ( 'turn' ) )
            // InternalTDsl.g:2355:1: ( 'turn' )
            {
            // InternalTDsl.g:2355:1: ( 'turn' )
            // InternalTDsl.g:2356:2: 'turn'
            {
             before(grammarAccess.getColorTopActionAccess().getTurnKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getColorTopActionAccess().getTurnKeyword_1_1()); 

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
    // $ANTLR end "rule__ColorTopAction__Group_1__1__Impl"


    // $ANTLR start "rule__ColorTopAction__Group_1__2"
    // InternalTDsl.g:2365:1: rule__ColorTopAction__Group_1__2 : rule__ColorTopAction__Group_1__2__Impl rule__ColorTopAction__Group_1__3 ;
    public final void rule__ColorTopAction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2369:1: ( rule__ColorTopAction__Group_1__2__Impl rule__ColorTopAction__Group_1__3 )
            // InternalTDsl.g:2370:2: rule__ColorTopAction__Group_1__2__Impl rule__ColorTopAction__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__ColorTopAction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorTopAction__Group_1__3();

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
    // $ANTLR end "rule__ColorTopAction__Group_1__2"


    // $ANTLR start "rule__ColorTopAction__Group_1__2__Impl"
    // InternalTDsl.g:2377:1: rule__ColorTopAction__Group_1__2__Impl : ( 'off' ) ;
    public final void rule__ColorTopAction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2381:1: ( ( 'off' ) )
            // InternalTDsl.g:2382:1: ( 'off' )
            {
            // InternalTDsl.g:2382:1: ( 'off' )
            // InternalTDsl.g:2383:2: 'off'
            {
             before(grammarAccess.getColorTopActionAccess().getOffKeyword_1_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getColorTopActionAccess().getOffKeyword_1_2()); 

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
    // $ANTLR end "rule__ColorTopAction__Group_1__2__Impl"


    // $ANTLR start "rule__ColorTopAction__Group_1__3"
    // InternalTDsl.g:2392:1: rule__ColorTopAction__Group_1__3 : rule__ColorTopAction__Group_1__3__Impl rule__ColorTopAction__Group_1__4 ;
    public final void rule__ColorTopAction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2396:1: ( rule__ColorTopAction__Group_1__3__Impl rule__ColorTopAction__Group_1__4 )
            // InternalTDsl.g:2397:2: rule__ColorTopAction__Group_1__3__Impl rule__ColorTopAction__Group_1__4
            {
            pushFollow(FOLLOW_27);
            rule__ColorTopAction__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorTopAction__Group_1__4();

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
    // $ANTLR end "rule__ColorTopAction__Group_1__3"


    // $ANTLR start "rule__ColorTopAction__Group_1__3__Impl"
    // InternalTDsl.g:2404:1: rule__ColorTopAction__Group_1__3__Impl : ( 'top' ) ;
    public final void rule__ColorTopAction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2408:1: ( ( 'top' ) )
            // InternalTDsl.g:2409:1: ( 'top' )
            {
            // InternalTDsl.g:2409:1: ( 'top' )
            // InternalTDsl.g:2410:2: 'top'
            {
             before(grammarAccess.getColorTopActionAccess().getTopKeyword_1_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getColorTopActionAccess().getTopKeyword_1_3()); 

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
    // $ANTLR end "rule__ColorTopAction__Group_1__3__Impl"


    // $ANTLR start "rule__ColorTopAction__Group_1__4"
    // InternalTDsl.g:2419:1: rule__ColorTopAction__Group_1__4 : rule__ColorTopAction__Group_1__4__Impl ;
    public final void rule__ColorTopAction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2423:1: ( rule__ColorTopAction__Group_1__4__Impl )
            // InternalTDsl.g:2424:2: rule__ColorTopAction__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorTopAction__Group_1__4__Impl();

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
    // $ANTLR end "rule__ColorTopAction__Group_1__4"


    // $ANTLR start "rule__ColorTopAction__Group_1__4__Impl"
    // InternalTDsl.g:2430:1: rule__ColorTopAction__Group_1__4__Impl : ( 'leds' ) ;
    public final void rule__ColorTopAction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2434:1: ( ( 'leds' ) )
            // InternalTDsl.g:2435:1: ( 'leds' )
            {
            // InternalTDsl.g:2435:1: ( 'leds' )
            // InternalTDsl.g:2436:2: 'leds'
            {
             before(grammarAccess.getColorTopActionAccess().getLedsKeyword_1_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getColorTopActionAccess().getLedsKeyword_1_4()); 

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
    // $ANTLR end "rule__ColorTopAction__Group_1__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalTDsl.g:2446:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2450:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalTDsl.g:2451:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

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
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalTDsl.g:2458:1: rule__IfStatement__Group__0__Impl : ( 'If' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2462:1: ( ( 'If' ) )
            // InternalTDsl.g:2463:1: ( 'If' )
            {
            // InternalTDsl.g:2463:1: ( 'If' )
            // InternalTDsl.g:2464:2: 'If'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalTDsl.g:2473:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2477:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalTDsl.g:2478:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

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
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalTDsl.g:2485:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ConditionAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2489:1: ( ( ( rule__IfStatement__ConditionAssignment_1 ) ) )
            // InternalTDsl.g:2490:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            {
            // InternalTDsl.g:2490:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            // InternalTDsl.g:2491:2: ( rule__IfStatement__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_1()); 
            // InternalTDsl.g:2492:2: ( rule__IfStatement__ConditionAssignment_1 )
            // InternalTDsl.g:2492:3: rule__IfStatement__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getConditionAssignment_1()); 

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
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalTDsl.g:2500:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2504:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalTDsl.g:2505:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

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
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalTDsl.g:2512:1: rule__IfStatement__Group__2__Impl : ( ':' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2516:1: ( ( ':' ) )
            // InternalTDsl.g:2517:1: ( ':' )
            {
            // InternalTDsl.g:2517:1: ( ':' )
            // InternalTDsl.g:2518:2: ':'
            {
             before(grammarAccess.getIfStatementAccess().getColonKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalTDsl.g:2527:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2531:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalTDsl.g:2532:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

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
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalTDsl.g:2539:1: rule__IfStatement__Group__3__Impl : ( ( ( rule__IfStatement__ActionAssignment_3 ) ) ( ( rule__IfStatement__ActionAssignment_3 )* ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2543:1: ( ( ( ( rule__IfStatement__ActionAssignment_3 ) ) ( ( rule__IfStatement__ActionAssignment_3 )* ) ) )
            // InternalTDsl.g:2544:1: ( ( ( rule__IfStatement__ActionAssignment_3 ) ) ( ( rule__IfStatement__ActionAssignment_3 )* ) )
            {
            // InternalTDsl.g:2544:1: ( ( ( rule__IfStatement__ActionAssignment_3 ) ) ( ( rule__IfStatement__ActionAssignment_3 )* ) )
            // InternalTDsl.g:2545:2: ( ( rule__IfStatement__ActionAssignment_3 ) ) ( ( rule__IfStatement__ActionAssignment_3 )* )
            {
            // InternalTDsl.g:2545:2: ( ( rule__IfStatement__ActionAssignment_3 ) )
            // InternalTDsl.g:2546:3: ( rule__IfStatement__ActionAssignment_3 )
            {
             before(grammarAccess.getIfStatementAccess().getActionAssignment_3()); 
            // InternalTDsl.g:2547:3: ( rule__IfStatement__ActionAssignment_3 )
            // InternalTDsl.g:2547:4: rule__IfStatement__ActionAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__IfStatement__ActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getActionAssignment_3()); 

            }

            // InternalTDsl.g:2550:2: ( ( rule__IfStatement__ActionAssignment_3 )* )
            // InternalTDsl.g:2551:3: ( rule__IfStatement__ActionAssignment_3 )*
            {
             before(grammarAccess.getIfStatementAccess().getActionAssignment_3()); 
            // InternalTDsl.g:2552:3: ( rule__IfStatement__ActionAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTDsl.g:2552:4: rule__IfStatement__ActionAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__IfStatement__ActionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getActionAssignment_3()); 

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
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalTDsl.g:2561:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2565:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalTDsl.g:2566:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

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
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalTDsl.g:2573:1: rule__IfStatement__Group__4__Impl : ( 'End' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2577:1: ( ( 'End' ) )
            // InternalTDsl.g:2578:1: ( 'End' )
            {
            // InternalTDsl.g:2578:1: ( 'End' )
            // InternalTDsl.g:2579:2: 'End'
            {
             before(grammarAccess.getIfStatementAccess().getEndKeyword_4()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getEndKeyword_4()); 

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
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalTDsl.g:2588:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2592:1: ( rule__IfStatement__Group__5__Impl )
            // InternalTDsl.g:2593:2: rule__IfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5__Impl();

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
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalTDsl.g:2599:1: rule__IfStatement__Group__5__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2603:1: ( ( 'if' ) )
            // InternalTDsl.g:2604:1: ( 'if' )
            {
            // InternalTDsl.g:2604:1: ( 'if' )
            // InternalTDsl.g:2605:2: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_5()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getIfKeyword_5()); 

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
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__UpperEvent__Group__0"
    // InternalTDsl.g:2615:1: rule__UpperEvent__Group__0 : rule__UpperEvent__Group__0__Impl rule__UpperEvent__Group__1 ;
    public final void rule__UpperEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2619:1: ( rule__UpperEvent__Group__0__Impl rule__UpperEvent__Group__1 )
            // InternalTDsl.g:2620:2: rule__UpperEvent__Group__0__Impl rule__UpperEvent__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__UpperEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group__1();

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
    // $ANTLR end "rule__UpperEvent__Group__0"


    // $ANTLR start "rule__UpperEvent__Group__0__Impl"
    // InternalTDsl.g:2627:1: rule__UpperEvent__Group__0__Impl : ( 'On' ) ;
    public final void rule__UpperEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2631:1: ( ( 'On' ) )
            // InternalTDsl.g:2632:1: ( 'On' )
            {
            // InternalTDsl.g:2632:1: ( 'On' )
            // InternalTDsl.g:2633:2: 'On'
            {
             before(grammarAccess.getUpperEventAccess().getOnKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getUpperEventAccess().getOnKeyword_0()); 

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
    // $ANTLR end "rule__UpperEvent__Group__0__Impl"


    // $ANTLR start "rule__UpperEvent__Group__1"
    // InternalTDsl.g:2642:1: rule__UpperEvent__Group__1 : rule__UpperEvent__Group__1__Impl rule__UpperEvent__Group__2 ;
    public final void rule__UpperEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2646:1: ( rule__UpperEvent__Group__1__Impl rule__UpperEvent__Group__2 )
            // InternalTDsl.g:2647:2: rule__UpperEvent__Group__1__Impl rule__UpperEvent__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__UpperEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group__2();

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
    // $ANTLR end "rule__UpperEvent__Group__1"


    // $ANTLR start "rule__UpperEvent__Group__1__Impl"
    // InternalTDsl.g:2654:1: rule__UpperEvent__Group__1__Impl : ( ( rule__UpperEvent__ButtonsAssignment_1 ) ) ;
    public final void rule__UpperEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2658:1: ( ( ( rule__UpperEvent__ButtonsAssignment_1 ) ) )
            // InternalTDsl.g:2659:1: ( ( rule__UpperEvent__ButtonsAssignment_1 ) )
            {
            // InternalTDsl.g:2659:1: ( ( rule__UpperEvent__ButtonsAssignment_1 ) )
            // InternalTDsl.g:2660:2: ( rule__UpperEvent__ButtonsAssignment_1 )
            {
             before(grammarAccess.getUpperEventAccess().getButtonsAssignment_1()); 
            // InternalTDsl.g:2661:2: ( rule__UpperEvent__ButtonsAssignment_1 )
            // InternalTDsl.g:2661:3: rule__UpperEvent__ButtonsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UpperEvent__ButtonsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUpperEventAccess().getButtonsAssignment_1()); 

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
    // $ANTLR end "rule__UpperEvent__Group__1__Impl"


    // $ANTLR start "rule__UpperEvent__Group__2"
    // InternalTDsl.g:2669:1: rule__UpperEvent__Group__2 : rule__UpperEvent__Group__2__Impl rule__UpperEvent__Group__3 ;
    public final void rule__UpperEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2673:1: ( rule__UpperEvent__Group__2__Impl rule__UpperEvent__Group__3 )
            // InternalTDsl.g:2674:2: rule__UpperEvent__Group__2__Impl rule__UpperEvent__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__UpperEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group__3();

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
    // $ANTLR end "rule__UpperEvent__Group__2"


    // $ANTLR start "rule__UpperEvent__Group__2__Impl"
    // InternalTDsl.g:2681:1: rule__UpperEvent__Group__2__Impl : ( ( rule__UpperEvent__Group_2__0 )* ) ;
    public final void rule__UpperEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2685:1: ( ( ( rule__UpperEvent__Group_2__0 )* ) )
            // InternalTDsl.g:2686:1: ( ( rule__UpperEvent__Group_2__0 )* )
            {
            // InternalTDsl.g:2686:1: ( ( rule__UpperEvent__Group_2__0 )* )
            // InternalTDsl.g:2687:2: ( rule__UpperEvent__Group_2__0 )*
            {
             before(grammarAccess.getUpperEventAccess().getGroup_2()); 
            // InternalTDsl.g:2688:2: ( rule__UpperEvent__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTDsl.g:2688:3: rule__UpperEvent__Group_2__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__UpperEvent__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getUpperEventAccess().getGroup_2()); 

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
    // $ANTLR end "rule__UpperEvent__Group__2__Impl"


    // $ANTLR start "rule__UpperEvent__Group__3"
    // InternalTDsl.g:2696:1: rule__UpperEvent__Group__3 : rule__UpperEvent__Group__3__Impl rule__UpperEvent__Group__4 ;
    public final void rule__UpperEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2700:1: ( rule__UpperEvent__Group__3__Impl rule__UpperEvent__Group__4 )
            // InternalTDsl.g:2701:2: rule__UpperEvent__Group__3__Impl rule__UpperEvent__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__UpperEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group__4();

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
    // $ANTLR end "rule__UpperEvent__Group__3"


    // $ANTLR start "rule__UpperEvent__Group__3__Impl"
    // InternalTDsl.g:2708:1: rule__UpperEvent__Group__3__Impl : ( 'button' ) ;
    public final void rule__UpperEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2712:1: ( ( 'button' ) )
            // InternalTDsl.g:2713:1: ( 'button' )
            {
            // InternalTDsl.g:2713:1: ( 'button' )
            // InternalTDsl.g:2714:2: 'button'
            {
             before(grammarAccess.getUpperEventAccess().getButtonKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getUpperEventAccess().getButtonKeyword_3()); 

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
    // $ANTLR end "rule__UpperEvent__Group__3__Impl"


    // $ANTLR start "rule__UpperEvent__Group__4"
    // InternalTDsl.g:2723:1: rule__UpperEvent__Group__4 : rule__UpperEvent__Group__4__Impl rule__UpperEvent__Group__5 ;
    public final void rule__UpperEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2727:1: ( rule__UpperEvent__Group__4__Impl rule__UpperEvent__Group__5 )
            // InternalTDsl.g:2728:2: rule__UpperEvent__Group__4__Impl rule__UpperEvent__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__UpperEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group__5();

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
    // $ANTLR end "rule__UpperEvent__Group__4"


    // $ANTLR start "rule__UpperEvent__Group__4__Impl"
    // InternalTDsl.g:2735:1: rule__UpperEvent__Group__4__Impl : ( ( rule__UpperEvent__StateAssignment_4 ) ) ;
    public final void rule__UpperEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2739:1: ( ( ( rule__UpperEvent__StateAssignment_4 ) ) )
            // InternalTDsl.g:2740:1: ( ( rule__UpperEvent__StateAssignment_4 ) )
            {
            // InternalTDsl.g:2740:1: ( ( rule__UpperEvent__StateAssignment_4 ) )
            // InternalTDsl.g:2741:2: ( rule__UpperEvent__StateAssignment_4 )
            {
             before(grammarAccess.getUpperEventAccess().getStateAssignment_4()); 
            // InternalTDsl.g:2742:2: ( rule__UpperEvent__StateAssignment_4 )
            // InternalTDsl.g:2742:3: rule__UpperEvent__StateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UpperEvent__StateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUpperEventAccess().getStateAssignment_4()); 

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
    // $ANTLR end "rule__UpperEvent__Group__4__Impl"


    // $ANTLR start "rule__UpperEvent__Group__5"
    // InternalTDsl.g:2750:1: rule__UpperEvent__Group__5 : rule__UpperEvent__Group__5__Impl rule__UpperEvent__Group__6 ;
    public final void rule__UpperEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2754:1: ( rule__UpperEvent__Group__5__Impl rule__UpperEvent__Group__6 )
            // InternalTDsl.g:2755:2: rule__UpperEvent__Group__5__Impl rule__UpperEvent__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__UpperEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group__6();

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
    // $ANTLR end "rule__UpperEvent__Group__5"


    // $ANTLR start "rule__UpperEvent__Group__5__Impl"
    // InternalTDsl.g:2762:1: rule__UpperEvent__Group__5__Impl : ( 'do' ) ;
    public final void rule__UpperEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2766:1: ( ( 'do' ) )
            // InternalTDsl.g:2767:1: ( 'do' )
            {
            // InternalTDsl.g:2767:1: ( 'do' )
            // InternalTDsl.g:2768:2: 'do'
            {
             before(grammarAccess.getUpperEventAccess().getDoKeyword_5()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getUpperEventAccess().getDoKeyword_5()); 

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
    // $ANTLR end "rule__UpperEvent__Group__5__Impl"


    // $ANTLR start "rule__UpperEvent__Group__6"
    // InternalTDsl.g:2777:1: rule__UpperEvent__Group__6 : rule__UpperEvent__Group__6__Impl ;
    public final void rule__UpperEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2781:1: ( rule__UpperEvent__Group__6__Impl )
            // InternalTDsl.g:2782:2: rule__UpperEvent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group__6__Impl();

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
    // $ANTLR end "rule__UpperEvent__Group__6"


    // $ANTLR start "rule__UpperEvent__Group__6__Impl"
    // InternalTDsl.g:2788:1: rule__UpperEvent__Group__6__Impl : ( ':' ) ;
    public final void rule__UpperEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2792:1: ( ( ':' ) )
            // InternalTDsl.g:2793:1: ( ':' )
            {
            // InternalTDsl.g:2793:1: ( ':' )
            // InternalTDsl.g:2794:2: ':'
            {
             before(grammarAccess.getUpperEventAccess().getColonKeyword_6()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getUpperEventAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__UpperEvent__Group__6__Impl"


    // $ANTLR start "rule__UpperEvent__Group_2__0"
    // InternalTDsl.g:2804:1: rule__UpperEvent__Group_2__0 : rule__UpperEvent__Group_2__0__Impl rule__UpperEvent__Group_2__1 ;
    public final void rule__UpperEvent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2808:1: ( rule__UpperEvent__Group_2__0__Impl rule__UpperEvent__Group_2__1 )
            // InternalTDsl.g:2809:2: rule__UpperEvent__Group_2__0__Impl rule__UpperEvent__Group_2__1
            {
            pushFollow(FOLLOW_33);
            rule__UpperEvent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group_2__1();

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
    // $ANTLR end "rule__UpperEvent__Group_2__0"


    // $ANTLR start "rule__UpperEvent__Group_2__0__Impl"
    // InternalTDsl.g:2816:1: rule__UpperEvent__Group_2__0__Impl : ( 'and' ) ;
    public final void rule__UpperEvent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2820:1: ( ( 'and' ) )
            // InternalTDsl.g:2821:1: ( 'and' )
            {
            // InternalTDsl.g:2821:1: ( 'and' )
            // InternalTDsl.g:2822:2: 'and'
            {
             before(grammarAccess.getUpperEventAccess().getAndKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUpperEventAccess().getAndKeyword_2_0()); 

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
    // $ANTLR end "rule__UpperEvent__Group_2__0__Impl"


    // $ANTLR start "rule__UpperEvent__Group_2__1"
    // InternalTDsl.g:2831:1: rule__UpperEvent__Group_2__1 : rule__UpperEvent__Group_2__1__Impl ;
    public final void rule__UpperEvent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2835:1: ( rule__UpperEvent__Group_2__1__Impl )
            // InternalTDsl.g:2836:2: rule__UpperEvent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group_2__1__Impl();

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
    // $ANTLR end "rule__UpperEvent__Group_2__1"


    // $ANTLR start "rule__UpperEvent__Group_2__1__Impl"
    // InternalTDsl.g:2842:1: rule__UpperEvent__Group_2__1__Impl : ( ( rule__UpperEvent__ButtonsAssignment_2_1 ) ) ;
    public final void rule__UpperEvent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2846:1: ( ( ( rule__UpperEvent__ButtonsAssignment_2_1 ) ) )
            // InternalTDsl.g:2847:1: ( ( rule__UpperEvent__ButtonsAssignment_2_1 ) )
            {
            // InternalTDsl.g:2847:1: ( ( rule__UpperEvent__ButtonsAssignment_2_1 ) )
            // InternalTDsl.g:2848:2: ( rule__UpperEvent__ButtonsAssignment_2_1 )
            {
             before(grammarAccess.getUpperEventAccess().getButtonsAssignment_2_1()); 
            // InternalTDsl.g:2849:2: ( rule__UpperEvent__ButtonsAssignment_2_1 )
            // InternalTDsl.g:2849:3: rule__UpperEvent__ButtonsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UpperEvent__ButtonsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUpperEventAccess().getButtonsAssignment_2_1()); 

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
    // $ANTLR end "rule__UpperEvent__Group_2__1__Impl"


    // $ANTLR start "rule__ProxEvent__Group__0"
    // InternalTDsl.g:2858:1: rule__ProxEvent__Group__0 : rule__ProxEvent__Group__0__Impl rule__ProxEvent__Group__1 ;
    public final void rule__ProxEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2862:1: ( rule__ProxEvent__Group__0__Impl rule__ProxEvent__Group__1 )
            // InternalTDsl.g:2863:2: rule__ProxEvent__Group__0__Impl rule__ProxEvent__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__ProxEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxEvent__Group__1();

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
    // $ANTLR end "rule__ProxEvent__Group__0"


    // $ANTLR start "rule__ProxEvent__Group__0__Impl"
    // InternalTDsl.g:2870:1: rule__ProxEvent__Group__0__Impl : ( 'On' ) ;
    public final void rule__ProxEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2874:1: ( ( 'On' ) )
            // InternalTDsl.g:2875:1: ( 'On' )
            {
            // InternalTDsl.g:2875:1: ( 'On' )
            // InternalTDsl.g:2876:2: 'On'
            {
             before(grammarAccess.getProxEventAccess().getOnKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getProxEventAccess().getOnKeyword_0()); 

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
    // $ANTLR end "rule__ProxEvent__Group__0__Impl"


    // $ANTLR start "rule__ProxEvent__Group__1"
    // InternalTDsl.g:2885:1: rule__ProxEvent__Group__1 : rule__ProxEvent__Group__1__Impl rule__ProxEvent__Group__2 ;
    public final void rule__ProxEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2889:1: ( rule__ProxEvent__Group__1__Impl rule__ProxEvent__Group__2 )
            // InternalTDsl.g:2890:2: rule__ProxEvent__Group__1__Impl rule__ProxEvent__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__ProxEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxEvent__Group__2();

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
    // $ANTLR end "rule__ProxEvent__Group__1"


    // $ANTLR start "rule__ProxEvent__Group__1__Impl"
    // InternalTDsl.g:2897:1: rule__ProxEvent__Group__1__Impl : ( ( rule__ProxEvent__SensorAssignment_1 ) ) ;
    public final void rule__ProxEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2901:1: ( ( ( rule__ProxEvent__SensorAssignment_1 ) ) )
            // InternalTDsl.g:2902:1: ( ( rule__ProxEvent__SensorAssignment_1 ) )
            {
            // InternalTDsl.g:2902:1: ( ( rule__ProxEvent__SensorAssignment_1 ) )
            // InternalTDsl.g:2903:2: ( rule__ProxEvent__SensorAssignment_1 )
            {
             before(grammarAccess.getProxEventAccess().getSensorAssignment_1()); 
            // InternalTDsl.g:2904:2: ( rule__ProxEvent__SensorAssignment_1 )
            // InternalTDsl.g:2904:3: rule__ProxEvent__SensorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxEvent__SensorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProxEventAccess().getSensorAssignment_1()); 

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
    // $ANTLR end "rule__ProxEvent__Group__1__Impl"


    // $ANTLR start "rule__ProxEvent__Group__2"
    // InternalTDsl.g:2912:1: rule__ProxEvent__Group__2 : rule__ProxEvent__Group__2__Impl rule__ProxEvent__Group__3 ;
    public final void rule__ProxEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2916:1: ( rule__ProxEvent__Group__2__Impl rule__ProxEvent__Group__3 )
            // InternalTDsl.g:2917:2: rule__ProxEvent__Group__2__Impl rule__ProxEvent__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__ProxEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxEvent__Group__3();

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
    // $ANTLR end "rule__ProxEvent__Group__2"


    // $ANTLR start "rule__ProxEvent__Group__2__Impl"
    // InternalTDsl.g:2924:1: rule__ProxEvent__Group__2__Impl : ( 'do' ) ;
    public final void rule__ProxEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2928:1: ( ( 'do' ) )
            // InternalTDsl.g:2929:1: ( 'do' )
            {
            // InternalTDsl.g:2929:1: ( 'do' )
            // InternalTDsl.g:2930:2: 'do'
            {
             before(grammarAccess.getProxEventAccess().getDoKeyword_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getProxEventAccess().getDoKeyword_2()); 

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
    // $ANTLR end "rule__ProxEvent__Group__2__Impl"


    // $ANTLR start "rule__ProxEvent__Group__3"
    // InternalTDsl.g:2939:1: rule__ProxEvent__Group__3 : rule__ProxEvent__Group__3__Impl ;
    public final void rule__ProxEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2943:1: ( rule__ProxEvent__Group__3__Impl )
            // InternalTDsl.g:2944:2: rule__ProxEvent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxEvent__Group__3__Impl();

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
    // $ANTLR end "rule__ProxEvent__Group__3"


    // $ANTLR start "rule__ProxEvent__Group__3__Impl"
    // InternalTDsl.g:2950:1: rule__ProxEvent__Group__3__Impl : ( ':' ) ;
    public final void rule__ProxEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2954:1: ( ( ':' ) )
            // InternalTDsl.g:2955:1: ( ':' )
            {
            // InternalTDsl.g:2955:1: ( ':' )
            // InternalTDsl.g:2956:2: ':'
            {
             before(grammarAccess.getProxEventAccess().getColonKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getProxEventAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__ProxEvent__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group_0__0"
    // InternalTDsl.g:2966:1: rule__Sensor__Group_0__0 : rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 ;
    public final void rule__Sensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2970:1: ( rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 )
            // InternalTDsl.g:2971:2: rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__Sensor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__1();

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
    // $ANTLR end "rule__Sensor__Group_0__0"


    // $ANTLR start "rule__Sensor__Group_0__0__Impl"
    // InternalTDsl.g:2978:1: rule__Sensor__Group_0__0__Impl : ( ruleHorizontalSensors ) ;
    public final void rule__Sensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2982:1: ( ( ruleHorizontalSensors ) )
            // InternalTDsl.g:2983:1: ( ruleHorizontalSensors )
            {
            // InternalTDsl.g:2983:1: ( ruleHorizontalSensors )
            // InternalTDsl.g:2984:2: ruleHorizontalSensors
            {
             before(grammarAccess.getSensorAccess().getHorizontalSensorsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHorizontalSensors();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getHorizontalSensorsParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Sensor__Group_0__0__Impl"


    // $ANTLR start "rule__Sensor__Group_0__1"
    // InternalTDsl.g:2993:1: rule__Sensor__Group_0__1 : rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 ;
    public final void rule__Sensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2997:1: ( rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 )
            // InternalTDsl.g:2998:2: rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2
            {
            pushFollow(FOLLOW_39);
            rule__Sensor__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__2();

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
    // $ANTLR end "rule__Sensor__Group_0__1"


    // $ANTLR start "rule__Sensor__Group_0__1__Impl"
    // InternalTDsl.g:3005:1: rule__Sensor__Group_0__1__Impl : ( ( rule__Sensor__Sensor_typeAssignment_0_1 ) ) ;
    public final void rule__Sensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3009:1: ( ( ( rule__Sensor__Sensor_typeAssignment_0_1 ) ) )
            // InternalTDsl.g:3010:1: ( ( rule__Sensor__Sensor_typeAssignment_0_1 ) )
            {
            // InternalTDsl.g:3010:1: ( ( rule__Sensor__Sensor_typeAssignment_0_1 ) )
            // InternalTDsl.g:3011:2: ( rule__Sensor__Sensor_typeAssignment_0_1 )
            {
             before(grammarAccess.getSensorAccess().getSensor_typeAssignment_0_1()); 
            // InternalTDsl.g:3012:2: ( rule__Sensor__Sensor_typeAssignment_0_1 )
            // InternalTDsl.g:3012:3: rule__Sensor__Sensor_typeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Sensor_typeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensor_typeAssignment_0_1()); 

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
    // $ANTLR end "rule__Sensor__Group_0__1__Impl"


    // $ANTLR start "rule__Sensor__Group_0__2"
    // InternalTDsl.g:3020:1: rule__Sensor__Group_0__2 : rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 ;
    public final void rule__Sensor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3024:1: ( rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 )
            // InternalTDsl.g:3025:2: rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3
            {
            pushFollow(FOLLOW_40);
            rule__Sensor__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__3();

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
    // $ANTLR end "rule__Sensor__Group_0__2"


    // $ANTLR start "rule__Sensor__Group_0__2__Impl"
    // InternalTDsl.g:3032:1: rule__Sensor__Group_0__2__Impl : ( 'sensor' ) ;
    public final void rule__Sensor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3036:1: ( ( 'sensor' ) )
            // InternalTDsl.g:3037:1: ( 'sensor' )
            {
            // InternalTDsl.g:3037:1: ( 'sensor' )
            // InternalTDsl.g:3038:2: 'sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0_2()); 

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
    // $ANTLR end "rule__Sensor__Group_0__2__Impl"


    // $ANTLR start "rule__Sensor__Group_0__3"
    // InternalTDsl.g:3047:1: rule__Sensor__Group_0__3 : rule__Sensor__Group_0__3__Impl rule__Sensor__Group_0__4 ;
    public final void rule__Sensor__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3051:1: ( rule__Sensor__Group_0__3__Impl rule__Sensor__Group_0__4 )
            // InternalTDsl.g:3052:2: rule__Sensor__Group_0__3__Impl rule__Sensor__Group_0__4
            {
            pushFollow(FOLLOW_41);
            rule__Sensor__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__4();

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
    // $ANTLR end "rule__Sensor__Group_0__3"


    // $ANTLR start "rule__Sensor__Group_0__3__Impl"
    // InternalTDsl.g:3059:1: rule__Sensor__Group_0__3__Impl : ( 'detecting' ) ;
    public final void rule__Sensor__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3063:1: ( ( 'detecting' ) )
            // InternalTDsl.g:3064:1: ( 'detecting' )
            {
            // InternalTDsl.g:3064:1: ( 'detecting' )
            // InternalTDsl.g:3065:2: 'detecting'
            {
             before(grammarAccess.getSensorAccess().getDetectingKeyword_0_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getDetectingKeyword_0_3()); 

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
    // $ANTLR end "rule__Sensor__Group_0__3__Impl"


    // $ANTLR start "rule__Sensor__Group_0__4"
    // InternalTDsl.g:3074:1: rule__Sensor__Group_0__4 : rule__Sensor__Group_0__4__Impl ;
    public final void rule__Sensor__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3078:1: ( rule__Sensor__Group_0__4__Impl )
            // InternalTDsl.g:3079:2: rule__Sensor__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__4__Impl();

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
    // $ANTLR end "rule__Sensor__Group_0__4"


    // $ANTLR start "rule__Sensor__Group_0__4__Impl"
    // InternalTDsl.g:3085:1: rule__Sensor__Group_0__4__Impl : ( ( rule__Sensor__Alternatives_0_4 ) ) ;
    public final void rule__Sensor__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3089:1: ( ( ( rule__Sensor__Alternatives_0_4 ) ) )
            // InternalTDsl.g:3090:1: ( ( rule__Sensor__Alternatives_0_4 ) )
            {
            // InternalTDsl.g:3090:1: ( ( rule__Sensor__Alternatives_0_4 ) )
            // InternalTDsl.g:3091:2: ( rule__Sensor__Alternatives_0_4 )
            {
             before(grammarAccess.getSensorAccess().getAlternatives_0_4()); 
            // InternalTDsl.g:3092:2: ( rule__Sensor__Alternatives_0_4 )
            // InternalTDsl.g:3092:3: rule__Sensor__Alternatives_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives_0_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives_0_4()); 

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
    // $ANTLR end "rule__Sensor__Group_0__4__Impl"


    // $ANTLR start "rule__Sensor__Group_0_4_1__0"
    // InternalTDsl.g:3101:1: rule__Sensor__Group_0_4_1__0 : rule__Sensor__Group_0_4_1__0__Impl rule__Sensor__Group_0_4_1__1 ;
    public final void rule__Sensor__Group_0_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3105:1: ( rule__Sensor__Group_0_4_1__0__Impl rule__Sensor__Group_0_4_1__1 )
            // InternalTDsl.g:3106:2: rule__Sensor__Group_0_4_1__0__Impl rule__Sensor__Group_0_4_1__1
            {
            pushFollow(FOLLOW_42);
            rule__Sensor__Group_0_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0_4_1__1();

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
    // $ANTLR end "rule__Sensor__Group_0_4_1__0"


    // $ANTLR start "rule__Sensor__Group_0_4_1__0__Impl"
    // InternalTDsl.g:3113:1: rule__Sensor__Group_0_4_1__0__Impl : ( 'no' ) ;
    public final void rule__Sensor__Group_0_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3117:1: ( ( 'no' ) )
            // InternalTDsl.g:3118:1: ( 'no' )
            {
            // InternalTDsl.g:3118:1: ( 'no' )
            // InternalTDsl.g:3119:2: 'no'
            {
             before(grammarAccess.getSensorAccess().getNoKeyword_0_4_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNoKeyword_0_4_1_0()); 

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
    // $ANTLR end "rule__Sensor__Group_0_4_1__0__Impl"


    // $ANTLR start "rule__Sensor__Group_0_4_1__1"
    // InternalTDsl.g:3128:1: rule__Sensor__Group_0_4_1__1 : rule__Sensor__Group_0_4_1__1__Impl ;
    public final void rule__Sensor__Group_0_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3132:1: ( rule__Sensor__Group_0_4_1__1__Impl )
            // InternalTDsl.g:3133:2: rule__Sensor__Group_0_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0_4_1__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_0_4_1__1"


    // $ANTLR start "rule__Sensor__Group_0_4_1__1__Impl"
    // InternalTDsl.g:3139:1: rule__Sensor__Group_0_4_1__1__Impl : ( 'proximity' ) ;
    public final void rule__Sensor__Group_0_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3143:1: ( ( 'proximity' ) )
            // InternalTDsl.g:3144:1: ( 'proximity' )
            {
            // InternalTDsl.g:3144:1: ( 'proximity' )
            // InternalTDsl.g:3145:2: 'proximity'
            {
             before(grammarAccess.getSensorAccess().getProximityKeyword_0_4_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getProximityKeyword_0_4_1_1()); 

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
    // $ANTLR end "rule__Sensor__Group_0_4_1__1__Impl"


    // $ANTLR start "rule__Sensor__Group_1__0"
    // InternalTDsl.g:3155:1: rule__Sensor__Group_1__0 : rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 ;
    public final void rule__Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3159:1: ( rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 )
            // InternalTDsl.g:3160:2: rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1
            {
            pushFollow(FOLLOW_43);
            rule__Sensor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__1();

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
    // $ANTLR end "rule__Sensor__Group_1__0"


    // $ANTLR start "rule__Sensor__Group_1__0__Impl"
    // InternalTDsl.g:3167:1: rule__Sensor__Group_1__0__Impl : ( ruleRightLeft ) ;
    public final void rule__Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3171:1: ( ( ruleRightLeft ) )
            // InternalTDsl.g:3172:1: ( ruleRightLeft )
            {
            // InternalTDsl.g:3172:1: ( ruleRightLeft )
            // InternalTDsl.g:3173:2: ruleRightLeft
            {
             before(grammarAccess.getSensorAccess().getRightLeftParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRightLeft();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getRightLeftParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sensor__Group_1__0__Impl"


    // $ANTLR start "rule__Sensor__Group_1__1"
    // InternalTDsl.g:3182:1: rule__Sensor__Group_1__1 : rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 ;
    public final void rule__Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3186:1: ( rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 )
            // InternalTDsl.g:3187:2: rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2
            {
            pushFollow(FOLLOW_39);
            rule__Sensor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__2();

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
    // $ANTLR end "rule__Sensor__Group_1__1"


    // $ANTLR start "rule__Sensor__Group_1__1__Impl"
    // InternalTDsl.g:3194:1: rule__Sensor__Group_1__1__Impl : ( ( rule__Sensor__Sensor_typeAssignment_1_1 ) ) ;
    public final void rule__Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3198:1: ( ( ( rule__Sensor__Sensor_typeAssignment_1_1 ) ) )
            // InternalTDsl.g:3199:1: ( ( rule__Sensor__Sensor_typeAssignment_1_1 ) )
            {
            // InternalTDsl.g:3199:1: ( ( rule__Sensor__Sensor_typeAssignment_1_1 ) )
            // InternalTDsl.g:3200:2: ( rule__Sensor__Sensor_typeAssignment_1_1 )
            {
             before(grammarAccess.getSensorAccess().getSensor_typeAssignment_1_1()); 
            // InternalTDsl.g:3201:2: ( rule__Sensor__Sensor_typeAssignment_1_1 )
            // InternalTDsl.g:3201:3: rule__Sensor__Sensor_typeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Sensor_typeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensor_typeAssignment_1_1()); 

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
    // $ANTLR end "rule__Sensor__Group_1__1__Impl"


    // $ANTLR start "rule__Sensor__Group_1__2"
    // InternalTDsl.g:3209:1: rule__Sensor__Group_1__2 : rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 ;
    public final void rule__Sensor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3213:1: ( rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 )
            // InternalTDsl.g:3214:2: rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3
            {
            pushFollow(FOLLOW_40);
            rule__Sensor__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__3();

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
    // $ANTLR end "rule__Sensor__Group_1__2"


    // $ANTLR start "rule__Sensor__Group_1__2__Impl"
    // InternalTDsl.g:3221:1: rule__Sensor__Group_1__2__Impl : ( 'sensor' ) ;
    public final void rule__Sensor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3225:1: ( ( 'sensor' ) )
            // InternalTDsl.g:3226:1: ( 'sensor' )
            {
            // InternalTDsl.g:3226:1: ( 'sensor' )
            // InternalTDsl.g:3227:2: 'sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_1_2()); 

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
    // $ANTLR end "rule__Sensor__Group_1__2__Impl"


    // $ANTLR start "rule__Sensor__Group_1__3"
    // InternalTDsl.g:3236:1: rule__Sensor__Group_1__3 : rule__Sensor__Group_1__3__Impl rule__Sensor__Group_1__4 ;
    public final void rule__Sensor__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3240:1: ( rule__Sensor__Group_1__3__Impl rule__Sensor__Group_1__4 )
            // InternalTDsl.g:3241:2: rule__Sensor__Group_1__3__Impl rule__Sensor__Group_1__4
            {
            pushFollow(FOLLOW_44);
            rule__Sensor__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__4();

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
    // $ANTLR end "rule__Sensor__Group_1__3"


    // $ANTLR start "rule__Sensor__Group_1__3__Impl"
    // InternalTDsl.g:3248:1: rule__Sensor__Group_1__3__Impl : ( 'detecting' ) ;
    public final void rule__Sensor__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3252:1: ( ( 'detecting' ) )
            // InternalTDsl.g:3253:1: ( 'detecting' )
            {
            // InternalTDsl.g:3253:1: ( 'detecting' )
            // InternalTDsl.g:3254:2: 'detecting'
            {
             before(grammarAccess.getSensorAccess().getDetectingKeyword_1_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getDetectingKeyword_1_3()); 

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
    // $ANTLR end "rule__Sensor__Group_1__3__Impl"


    // $ANTLR start "rule__Sensor__Group_1__4"
    // InternalTDsl.g:3263:1: rule__Sensor__Group_1__4 : rule__Sensor__Group_1__4__Impl ;
    public final void rule__Sensor__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3267:1: ( rule__Sensor__Group_1__4__Impl )
            // InternalTDsl.g:3268:2: rule__Sensor__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__4__Impl();

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
    // $ANTLR end "rule__Sensor__Group_1__4"


    // $ANTLR start "rule__Sensor__Group_1__4__Impl"
    // InternalTDsl.g:3274:1: rule__Sensor__Group_1__4__Impl : ( ( rule__Sensor__Alternatives_1_4 ) ) ;
    public final void rule__Sensor__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3278:1: ( ( ( rule__Sensor__Alternatives_1_4 ) ) )
            // InternalTDsl.g:3279:1: ( ( rule__Sensor__Alternatives_1_4 ) )
            {
            // InternalTDsl.g:3279:1: ( ( rule__Sensor__Alternatives_1_4 ) )
            // InternalTDsl.g:3280:2: ( rule__Sensor__Alternatives_1_4 )
            {
             before(grammarAccess.getSensorAccess().getAlternatives_1_4()); 
            // InternalTDsl.g:3281:2: ( rule__Sensor__Alternatives_1_4 )
            // InternalTDsl.g:3281:3: rule__Sensor__Alternatives_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives_1_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives_1_4()); 

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
    // $ANTLR end "rule__Sensor__Group_1__4__Impl"


    // $ANTLR start "rule__Sensor__Group_1_4_1__0"
    // InternalTDsl.g:3290:1: rule__Sensor__Group_1_4_1__0 : rule__Sensor__Group_1_4_1__0__Impl rule__Sensor__Group_1_4_1__1 ;
    public final void rule__Sensor__Group_1_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3294:1: ( rule__Sensor__Group_1_4_1__0__Impl rule__Sensor__Group_1_4_1__1 )
            // InternalTDsl.g:3295:2: rule__Sensor__Group_1_4_1__0__Impl rule__Sensor__Group_1_4_1__1
            {
            pushFollow(FOLLOW_42);
            rule__Sensor__Group_1_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1_4_1__1();

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
    // $ANTLR end "rule__Sensor__Group_1_4_1__0"


    // $ANTLR start "rule__Sensor__Group_1_4_1__0__Impl"
    // InternalTDsl.g:3302:1: rule__Sensor__Group_1_4_1__0__Impl : ( 'no' ) ;
    public final void rule__Sensor__Group_1_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3306:1: ( ( 'no' ) )
            // InternalTDsl.g:3307:1: ( 'no' )
            {
            // InternalTDsl.g:3307:1: ( 'no' )
            // InternalTDsl.g:3308:2: 'no'
            {
             before(grammarAccess.getSensorAccess().getNoKeyword_1_4_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNoKeyword_1_4_1_0()); 

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
    // $ANTLR end "rule__Sensor__Group_1_4_1__0__Impl"


    // $ANTLR start "rule__Sensor__Group_1_4_1__1"
    // InternalTDsl.g:3317:1: rule__Sensor__Group_1_4_1__1 : rule__Sensor__Group_1_4_1__1__Impl ;
    public final void rule__Sensor__Group_1_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3321:1: ( rule__Sensor__Group_1_4_1__1__Impl )
            // InternalTDsl.g:3322:2: rule__Sensor__Group_1_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1_4_1__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_1_4_1__1"


    // $ANTLR start "rule__Sensor__Group_1_4_1__1__Impl"
    // InternalTDsl.g:3328:1: rule__Sensor__Group_1_4_1__1__Impl : ( 'proximity' ) ;
    public final void rule__Sensor__Group_1_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3332:1: ( ( 'proximity' ) )
            // InternalTDsl.g:3333:1: ( 'proximity' )
            {
            // InternalTDsl.g:3333:1: ( 'proximity' )
            // InternalTDsl.g:3334:2: 'proximity'
            {
             before(grammarAccess.getSensorAccess().getProximityKeyword_1_4_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getProximityKeyword_1_4_1_1()); 

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
    // $ANTLR end "rule__Sensor__Group_1_4_1__1__Impl"


    // $ANTLR start "rule__TapEvent__Group__0"
    // InternalTDsl.g:3344:1: rule__TapEvent__Group__0 : rule__TapEvent__Group__0__Impl rule__TapEvent__Group__1 ;
    public final void rule__TapEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3348:1: ( rule__TapEvent__Group__0__Impl rule__TapEvent__Group__1 )
            // InternalTDsl.g:3349:2: rule__TapEvent__Group__0__Impl rule__TapEvent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TapEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TapEvent__Group__1();

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
    // $ANTLR end "rule__TapEvent__Group__0"


    // $ANTLR start "rule__TapEvent__Group__0__Impl"
    // InternalTDsl.g:3356:1: rule__TapEvent__Group__0__Impl : ( () ) ;
    public final void rule__TapEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3360:1: ( ( () ) )
            // InternalTDsl.g:3361:1: ( () )
            {
            // InternalTDsl.g:3361:1: ( () )
            // InternalTDsl.g:3362:2: ()
            {
             before(grammarAccess.getTapEventAccess().getEventAction_0()); 
            // InternalTDsl.g:3363:2: ()
            // InternalTDsl.g:3363:3: 
            {
            }

             after(grammarAccess.getTapEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TapEvent__Group__0__Impl"


    // $ANTLR start "rule__TapEvent__Group__1"
    // InternalTDsl.g:3371:1: rule__TapEvent__Group__1 : rule__TapEvent__Group__1__Impl rule__TapEvent__Group__2 ;
    public final void rule__TapEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3375:1: ( rule__TapEvent__Group__1__Impl rule__TapEvent__Group__2 )
            // InternalTDsl.g:3376:2: rule__TapEvent__Group__1__Impl rule__TapEvent__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__TapEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TapEvent__Group__2();

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
    // $ANTLR end "rule__TapEvent__Group__1"


    // $ANTLR start "rule__TapEvent__Group__1__Impl"
    // InternalTDsl.g:3383:1: rule__TapEvent__Group__1__Impl : ( 'On' ) ;
    public final void rule__TapEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3387:1: ( ( 'On' ) )
            // InternalTDsl.g:3388:1: ( 'On' )
            {
            // InternalTDsl.g:3388:1: ( 'On' )
            // InternalTDsl.g:3389:2: 'On'
            {
             before(grammarAccess.getTapEventAccess().getOnKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTapEventAccess().getOnKeyword_1()); 

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
    // $ANTLR end "rule__TapEvent__Group__1__Impl"


    // $ANTLR start "rule__TapEvent__Group__2"
    // InternalTDsl.g:3398:1: rule__TapEvent__Group__2 : rule__TapEvent__Group__2__Impl rule__TapEvent__Group__3 ;
    public final void rule__TapEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3402:1: ( rule__TapEvent__Group__2__Impl rule__TapEvent__Group__3 )
            // InternalTDsl.g:3403:2: rule__TapEvent__Group__2__Impl rule__TapEvent__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__TapEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TapEvent__Group__3();

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
    // $ANTLR end "rule__TapEvent__Group__2"


    // $ANTLR start "rule__TapEvent__Group__2__Impl"
    // InternalTDsl.g:3410:1: rule__TapEvent__Group__2__Impl : ( 'tap' ) ;
    public final void rule__TapEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3414:1: ( ( 'tap' ) )
            // InternalTDsl.g:3415:1: ( 'tap' )
            {
            // InternalTDsl.g:3415:1: ( 'tap' )
            // InternalTDsl.g:3416:2: 'tap'
            {
             before(grammarAccess.getTapEventAccess().getTapKeyword_2()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getTapEventAccess().getTapKeyword_2()); 

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
    // $ANTLR end "rule__TapEvent__Group__2__Impl"


    // $ANTLR start "rule__TapEvent__Group__3"
    // InternalTDsl.g:3425:1: rule__TapEvent__Group__3 : rule__TapEvent__Group__3__Impl rule__TapEvent__Group__4 ;
    public final void rule__TapEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3429:1: ( rule__TapEvent__Group__3__Impl rule__TapEvent__Group__4 )
            // InternalTDsl.g:3430:2: rule__TapEvent__Group__3__Impl rule__TapEvent__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__TapEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TapEvent__Group__4();

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
    // $ANTLR end "rule__TapEvent__Group__3"


    // $ANTLR start "rule__TapEvent__Group__3__Impl"
    // InternalTDsl.g:3437:1: rule__TapEvent__Group__3__Impl : ( 'do' ) ;
    public final void rule__TapEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3441:1: ( ( 'do' ) )
            // InternalTDsl.g:3442:1: ( 'do' )
            {
            // InternalTDsl.g:3442:1: ( 'do' )
            // InternalTDsl.g:3443:2: 'do'
            {
             before(grammarAccess.getTapEventAccess().getDoKeyword_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getTapEventAccess().getDoKeyword_3()); 

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
    // $ANTLR end "rule__TapEvent__Group__3__Impl"


    // $ANTLR start "rule__TapEvent__Group__4"
    // InternalTDsl.g:3452:1: rule__TapEvent__Group__4 : rule__TapEvent__Group__4__Impl ;
    public final void rule__TapEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3456:1: ( rule__TapEvent__Group__4__Impl )
            // InternalTDsl.g:3457:2: rule__TapEvent__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TapEvent__Group__4__Impl();

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
    // $ANTLR end "rule__TapEvent__Group__4"


    // $ANTLR start "rule__TapEvent__Group__4__Impl"
    // InternalTDsl.g:3463:1: rule__TapEvent__Group__4__Impl : ( ':' ) ;
    public final void rule__TapEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3467:1: ( ( ':' ) )
            // InternalTDsl.g:3468:1: ( ':' )
            {
            // InternalTDsl.g:3468:1: ( ':' )
            // InternalTDsl.g:3469:2: ':'
            {
             before(grammarAccess.getTapEventAccess().getColonKeyword_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTapEventAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__TapEvent__Group__4__Impl"


    // $ANTLR start "rule__ClapEvent__Group__0"
    // InternalTDsl.g:3479:1: rule__ClapEvent__Group__0 : rule__ClapEvent__Group__0__Impl rule__ClapEvent__Group__1 ;
    public final void rule__ClapEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3483:1: ( rule__ClapEvent__Group__0__Impl rule__ClapEvent__Group__1 )
            // InternalTDsl.g:3484:2: rule__ClapEvent__Group__0__Impl rule__ClapEvent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ClapEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClapEvent__Group__1();

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
    // $ANTLR end "rule__ClapEvent__Group__0"


    // $ANTLR start "rule__ClapEvent__Group__0__Impl"
    // InternalTDsl.g:3491:1: rule__ClapEvent__Group__0__Impl : ( () ) ;
    public final void rule__ClapEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3495:1: ( ( () ) )
            // InternalTDsl.g:3496:1: ( () )
            {
            // InternalTDsl.g:3496:1: ( () )
            // InternalTDsl.g:3497:2: ()
            {
             before(grammarAccess.getClapEventAccess().getEventAction_0()); 
            // InternalTDsl.g:3498:2: ()
            // InternalTDsl.g:3498:3: 
            {
            }

             after(grammarAccess.getClapEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClapEvent__Group__0__Impl"


    // $ANTLR start "rule__ClapEvent__Group__1"
    // InternalTDsl.g:3506:1: rule__ClapEvent__Group__1 : rule__ClapEvent__Group__1__Impl rule__ClapEvent__Group__2 ;
    public final void rule__ClapEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3510:1: ( rule__ClapEvent__Group__1__Impl rule__ClapEvent__Group__2 )
            // InternalTDsl.g:3511:2: rule__ClapEvent__Group__1__Impl rule__ClapEvent__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__ClapEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClapEvent__Group__2();

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
    // $ANTLR end "rule__ClapEvent__Group__1"


    // $ANTLR start "rule__ClapEvent__Group__1__Impl"
    // InternalTDsl.g:3518:1: rule__ClapEvent__Group__1__Impl : ( 'On' ) ;
    public final void rule__ClapEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3522:1: ( ( 'On' ) )
            // InternalTDsl.g:3523:1: ( 'On' )
            {
            // InternalTDsl.g:3523:1: ( 'On' )
            // InternalTDsl.g:3524:2: 'On'
            {
             before(grammarAccess.getClapEventAccess().getOnKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getClapEventAccess().getOnKeyword_1()); 

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
    // $ANTLR end "rule__ClapEvent__Group__1__Impl"


    // $ANTLR start "rule__ClapEvent__Group__2"
    // InternalTDsl.g:3533:1: rule__ClapEvent__Group__2 : rule__ClapEvent__Group__2__Impl rule__ClapEvent__Group__3 ;
    public final void rule__ClapEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3537:1: ( rule__ClapEvent__Group__2__Impl rule__ClapEvent__Group__3 )
            // InternalTDsl.g:3538:2: rule__ClapEvent__Group__2__Impl rule__ClapEvent__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__ClapEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClapEvent__Group__3();

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
    // $ANTLR end "rule__ClapEvent__Group__2"


    // $ANTLR start "rule__ClapEvent__Group__2__Impl"
    // InternalTDsl.g:3545:1: rule__ClapEvent__Group__2__Impl : ( 'clap' ) ;
    public final void rule__ClapEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3549:1: ( ( 'clap' ) )
            // InternalTDsl.g:3550:1: ( 'clap' )
            {
            // InternalTDsl.g:3550:1: ( 'clap' )
            // InternalTDsl.g:3551:2: 'clap'
            {
             before(grammarAccess.getClapEventAccess().getClapKeyword_2()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getClapEventAccess().getClapKeyword_2()); 

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
    // $ANTLR end "rule__ClapEvent__Group__2__Impl"


    // $ANTLR start "rule__ClapEvent__Group__3"
    // InternalTDsl.g:3560:1: rule__ClapEvent__Group__3 : rule__ClapEvent__Group__3__Impl rule__ClapEvent__Group__4 ;
    public final void rule__ClapEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3564:1: ( rule__ClapEvent__Group__3__Impl rule__ClapEvent__Group__4 )
            // InternalTDsl.g:3565:2: rule__ClapEvent__Group__3__Impl rule__ClapEvent__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__ClapEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClapEvent__Group__4();

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
    // $ANTLR end "rule__ClapEvent__Group__3"


    // $ANTLR start "rule__ClapEvent__Group__3__Impl"
    // InternalTDsl.g:3572:1: rule__ClapEvent__Group__3__Impl : ( 'do' ) ;
    public final void rule__ClapEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3576:1: ( ( 'do' ) )
            // InternalTDsl.g:3577:1: ( 'do' )
            {
            // InternalTDsl.g:3577:1: ( 'do' )
            // InternalTDsl.g:3578:2: 'do'
            {
             before(grammarAccess.getClapEventAccess().getDoKeyword_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getClapEventAccess().getDoKeyword_3()); 

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
    // $ANTLR end "rule__ClapEvent__Group__3__Impl"


    // $ANTLR start "rule__ClapEvent__Group__4"
    // InternalTDsl.g:3587:1: rule__ClapEvent__Group__4 : rule__ClapEvent__Group__4__Impl ;
    public final void rule__ClapEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3591:1: ( rule__ClapEvent__Group__4__Impl )
            // InternalTDsl.g:3592:2: rule__ClapEvent__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClapEvent__Group__4__Impl();

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
    // $ANTLR end "rule__ClapEvent__Group__4"


    // $ANTLR start "rule__ClapEvent__Group__4__Impl"
    // InternalTDsl.g:3598:1: rule__ClapEvent__Group__4__Impl : ( ':' ) ;
    public final void rule__ClapEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3602:1: ( ( ':' ) )
            // InternalTDsl.g:3603:1: ( ':' )
            {
            // InternalTDsl.g:3603:1: ( ':' )
            // InternalTDsl.g:3604:2: ':'
            {
             before(grammarAccess.getClapEventAccess().getColonKeyword_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getClapEventAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__ClapEvent__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalTDsl.g:3614:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3618:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalTDsl.g:3619:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalTDsl.g:3626:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LeftSensorAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3630:1: ( ( ( rule__Condition__LeftSensorAssignment_0 ) ) )
            // InternalTDsl.g:3631:1: ( ( rule__Condition__LeftSensorAssignment_0 ) )
            {
            // InternalTDsl.g:3631:1: ( ( rule__Condition__LeftSensorAssignment_0 ) )
            // InternalTDsl.g:3632:2: ( rule__Condition__LeftSensorAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLeftSensorAssignment_0()); 
            // InternalTDsl.g:3633:2: ( rule__Condition__LeftSensorAssignment_0 )
            // InternalTDsl.g:3633:3: rule__Condition__LeftSensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__LeftSensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getLeftSensorAssignment_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalTDsl.g:3641:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3645:1: ( rule__Condition__Group__1__Impl )
            // InternalTDsl.g:3646:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalTDsl.g:3652:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Group_1__0 )? ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3656:1: ( ( ( rule__Condition__Group_1__0 )? ) )
            // InternalTDsl.g:3657:1: ( ( rule__Condition__Group_1__0 )? )
            {
            // InternalTDsl.g:3657:1: ( ( rule__Condition__Group_1__0 )? )
            // InternalTDsl.g:3658:2: ( rule__Condition__Group_1__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_1()); 
            // InternalTDsl.g:3659:2: ( rule__Condition__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=16 && LA26_0<=17)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTDsl.g:3659:3: rule__Condition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group_1__0"
    // InternalTDsl.g:3668:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3672:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // InternalTDsl.g:3673:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Condition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__1();

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
    // $ANTLR end "rule__Condition__Group_1__0"


    // $ANTLR start "rule__Condition__Group_1__0__Impl"
    // InternalTDsl.g:3680:1: rule__Condition__Group_1__0__Impl : ( ( rule__Condition__OperatorAssignment_1_0 ) ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3684:1: ( ( ( rule__Condition__OperatorAssignment_1_0 ) ) )
            // InternalTDsl.g:3685:1: ( ( rule__Condition__OperatorAssignment_1_0 ) )
            {
            // InternalTDsl.g:3685:1: ( ( rule__Condition__OperatorAssignment_1_0 ) )
            // InternalTDsl.g:3686:2: ( rule__Condition__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_1_0()); 
            // InternalTDsl.g:3687:2: ( rule__Condition__OperatorAssignment_1_0 )
            // InternalTDsl.g:3687:3: rule__Condition__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperatorAssignment_1_0()); 

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
    // $ANTLR end "rule__Condition__Group_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_1__1"
    // InternalTDsl.g:3695:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3699:1: ( rule__Condition__Group_1__1__Impl )
            // InternalTDsl.g:3700:2: rule__Condition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__1__Impl();

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
    // $ANTLR end "rule__Condition__Group_1__1"


    // $ANTLR start "rule__Condition__Group_1__1__Impl"
    // InternalTDsl.g:3706:1: rule__Condition__Group_1__1__Impl : ( ( rule__Condition__RightSensorAssignment_1_1 ) ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3710:1: ( ( ( rule__Condition__RightSensorAssignment_1_1 ) ) )
            // InternalTDsl.g:3711:1: ( ( rule__Condition__RightSensorAssignment_1_1 ) )
            {
            // InternalTDsl.g:3711:1: ( ( rule__Condition__RightSensorAssignment_1_1 ) )
            // InternalTDsl.g:3712:2: ( rule__Condition__RightSensorAssignment_1_1 )
            {
             before(grammarAccess.getConditionAccess().getRightSensorAssignment_1_1()); 
            // InternalTDsl.g:3713:2: ( rule__Condition__RightSensorAssignment_1_1 )
            // InternalTDsl.g:3713:3: rule__Condition__RightSensorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__RightSensorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getRightSensorAssignment_1_1()); 

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
    // $ANTLR end "rule__Condition__Group_1__1__Impl"


    // $ANTLR start "rule__ArithmeticExpression__Group__0"
    // InternalTDsl.g:3722:1: rule__ArithmeticExpression__Group__0 : rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1 ;
    public final void rule__ArithmeticExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3726:1: ( rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1 )
            // InternalTDsl.g:3727:2: rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__ArithmeticExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__Group__1();

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
    // $ANTLR end "rule__ArithmeticExpression__Group__0"


    // $ANTLR start "rule__ArithmeticExpression__Group__0__Impl"
    // InternalTDsl.g:3734:1: rule__ArithmeticExpression__Group__0__Impl : ( ( rule__ArithmeticExpression__LeftAssignment_0 ) ) ;
    public final void rule__ArithmeticExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3738:1: ( ( ( rule__ArithmeticExpression__LeftAssignment_0 ) ) )
            // InternalTDsl.g:3739:1: ( ( rule__ArithmeticExpression__LeftAssignment_0 ) )
            {
            // InternalTDsl.g:3739:1: ( ( rule__ArithmeticExpression__LeftAssignment_0 ) )
            // InternalTDsl.g:3740:2: ( rule__ArithmeticExpression__LeftAssignment_0 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getLeftAssignment_0()); 
            // InternalTDsl.g:3741:2: ( rule__ArithmeticExpression__LeftAssignment_0 )
            // InternalTDsl.g:3741:3: rule__ArithmeticExpression__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticExpressionAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__ArithmeticExpression__Group__0__Impl"


    // $ANTLR start "rule__ArithmeticExpression__Group__1"
    // InternalTDsl.g:3749:1: rule__ArithmeticExpression__Group__1 : rule__ArithmeticExpression__Group__1__Impl ;
    public final void rule__ArithmeticExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3753:1: ( rule__ArithmeticExpression__Group__1__Impl )
            // InternalTDsl.g:3754:2: rule__ArithmeticExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__Group__1__Impl();

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
    // $ANTLR end "rule__ArithmeticExpression__Group__1"


    // $ANTLR start "rule__ArithmeticExpression__Group__1__Impl"
    // InternalTDsl.g:3760:1: rule__ArithmeticExpression__Group__1__Impl : ( ( rule__ArithmeticExpression__Group_1__0 )? ) ;
    public final void rule__ArithmeticExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3764:1: ( ( ( rule__ArithmeticExpression__Group_1__0 )? ) )
            // InternalTDsl.g:3765:1: ( ( rule__ArithmeticExpression__Group_1__0 )? )
            {
            // InternalTDsl.g:3765:1: ( ( rule__ArithmeticExpression__Group_1__0 )? )
            // InternalTDsl.g:3766:2: ( rule__ArithmeticExpression__Group_1__0 )?
            {
             before(grammarAccess.getArithmeticExpressionAccess().getGroup_1()); 
            // InternalTDsl.g:3767:2: ( rule__ArithmeticExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18||(LA27_0>=20 && LA27_0<=22)) ) {
                alt27=1;
            }
            else if ( (LA27_0==19) ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==RULE_INT||LA27_2==19) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalTDsl.g:3767:3: rule__ArithmeticExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArithmeticExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArithmeticExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ArithmeticExpression__Group__1__Impl"


    // $ANTLR start "rule__ArithmeticExpression__Group_1__0"
    // InternalTDsl.g:3776:1: rule__ArithmeticExpression__Group_1__0 : rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1 ;
    public final void rule__ArithmeticExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3780:1: ( rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1 )
            // InternalTDsl.g:3781:2: rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ArithmeticExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__Group_1__1();

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
    // $ANTLR end "rule__ArithmeticExpression__Group_1__0"


    // $ANTLR start "rule__ArithmeticExpression__Group_1__0__Impl"
    // InternalTDsl.g:3788:1: rule__ArithmeticExpression__Group_1__0__Impl : ( ( rule__ArithmeticExpression__OperatorAssignment_1_0 ) ) ;
    public final void rule__ArithmeticExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3792:1: ( ( ( rule__ArithmeticExpression__OperatorAssignment_1_0 ) ) )
            // InternalTDsl.g:3793:1: ( ( rule__ArithmeticExpression__OperatorAssignment_1_0 ) )
            {
            // InternalTDsl.g:3793:1: ( ( rule__ArithmeticExpression__OperatorAssignment_1_0 ) )
            // InternalTDsl.g:3794:2: ( rule__ArithmeticExpression__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getOperatorAssignment_1_0()); 
            // InternalTDsl.g:3795:2: ( rule__ArithmeticExpression__OperatorAssignment_1_0 )
            // InternalTDsl.g:3795:3: rule__ArithmeticExpression__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticExpressionAccess().getOperatorAssignment_1_0()); 

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
    // $ANTLR end "rule__ArithmeticExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ArithmeticExpression__Group_1__1"
    // InternalTDsl.g:3803:1: rule__ArithmeticExpression__Group_1__1 : rule__ArithmeticExpression__Group_1__1__Impl ;
    public final void rule__ArithmeticExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3807:1: ( rule__ArithmeticExpression__Group_1__1__Impl )
            // InternalTDsl.g:3808:2: rule__ArithmeticExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__ArithmeticExpression__Group_1__1"


    // $ANTLR start "rule__ArithmeticExpression__Group_1__1__Impl"
    // InternalTDsl.g:3814:1: rule__ArithmeticExpression__Group_1__1__Impl : ( ( rule__ArithmeticExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ArithmeticExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3818:1: ( ( ( rule__ArithmeticExpression__RightAssignment_1_1 ) ) )
            // InternalTDsl.g:3819:1: ( ( rule__ArithmeticExpression__RightAssignment_1_1 ) )
            {
            // InternalTDsl.g:3819:1: ( ( rule__ArithmeticExpression__RightAssignment_1_1 ) )
            // InternalTDsl.g:3820:2: ( rule__ArithmeticExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getRightAssignment_1_1()); 
            // InternalTDsl.g:3821:2: ( rule__ArithmeticExpression__RightAssignment_1_1 )
            // InternalTDsl.g:3821:3: rule__ArithmeticExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticExpressionAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__ArithmeticExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__0"
    // InternalTDsl.g:3830:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3834:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // InternalTDsl.g:3835:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EIntegerObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__1();

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
    // $ANTLR end "rule__EIntegerObject__Group__0"


    // $ANTLR start "rule__EIntegerObject__Group__0__Impl"
    // InternalTDsl.g:3842:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3846:1: ( ( ( '-' )? ) )
            // InternalTDsl.g:3847:1: ( ( '-' )? )
            {
            // InternalTDsl.g:3847:1: ( ( '-' )? )
            // InternalTDsl.g:3848:2: ( '-' )?
            {
             before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalTDsl.g:3849:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTDsl.g:3849:3: '-'
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EIntegerObject__Group__0__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__1"
    // InternalTDsl.g:3857:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3861:1: ( rule__EIntegerObject__Group__1__Impl )
            // InternalTDsl.g:3862:2: rule__EIntegerObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__1__Impl();

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
    // $ANTLR end "rule__EIntegerObject__Group__1"


    // $ANTLR start "rule__EIntegerObject__Group__1__Impl"
    // InternalTDsl.g:3868:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3872:1: ( ( RULE_INT ) )
            // InternalTDsl.g:3873:1: ( RULE_INT )
            {
            // InternalTDsl.g:3873:1: ( RULE_INT )
            // InternalTDsl.g:3874:2: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EIntegerObject__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalTDsl.g:3884:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3888:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalTDsl.g:3889:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

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
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalTDsl.g:3896:1: rule__Color__Group__0__Impl : ( ( rule__Color__Alternatives_0 )? ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3900:1: ( ( ( rule__Color__Alternatives_0 )? ) )
            // InternalTDsl.g:3901:1: ( ( rule__Color__Alternatives_0 )? )
            {
            // InternalTDsl.g:3901:1: ( ( rule__Color__Alternatives_0 )? )
            // InternalTDsl.g:3902:2: ( rule__Color__Alternatives_0 )?
            {
             before(grammarAccess.getColorAccess().getAlternatives_0()); 
            // InternalTDsl.g:3903:2: ( rule__Color__Alternatives_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=23 && LA29_0<=24)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTDsl.g:3903:3: rule__Color__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalTDsl.g:3911:1: rule__Color__Group__1 : rule__Color__Group__1__Impl ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3915:1: ( rule__Color__Group__1__Impl )
            // InternalTDsl.g:3916:2: rule__Color__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__1__Impl();

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
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalTDsl.g:3922:1: rule__Color__Group__1__Impl : ( ( rule__Color__Alternatives_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3926:1: ( ( ( rule__Color__Alternatives_1 ) ) )
            // InternalTDsl.g:3927:1: ( ( rule__Color__Alternatives_1 ) )
            {
            // InternalTDsl.g:3927:1: ( ( rule__Color__Alternatives_1 ) )
            // InternalTDsl.g:3928:2: ( rule__Color__Alternatives_1 )
            {
             before(grammarAccess.getColorAccess().getAlternatives_1()); 
            // InternalTDsl.g:3929:2: ( rule__Color__Alternatives_1 )
            // InternalTDsl.g:3929:3: rule__Color__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_0__0"
    // InternalTDsl.g:3938:1: rule__HorizontalSensors__Group_0__0 : rule__HorizontalSensors__Group_0__0__Impl rule__HorizontalSensors__Group_0__1 ;
    public final void rule__HorizontalSensors__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3942:1: ( rule__HorizontalSensors__Group_0__0__Impl rule__HorizontalSensors__Group_0__1 )
            // InternalTDsl.g:3943:2: rule__HorizontalSensors__Group_0__0__Impl rule__HorizontalSensors__Group_0__1
            {
            pushFollow(FOLLOW_49);
            rule__HorizontalSensors__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_0__1();

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
    // $ANTLR end "rule__HorizontalSensors__Group_0__0"


    // $ANTLR start "rule__HorizontalSensors__Group_0__0__Impl"
    // InternalTDsl.g:3950:1: rule__HorizontalSensors__Group_0__0__Impl : ( 'front' ) ;
    public final void rule__HorizontalSensors__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3954:1: ( ( 'front' ) )
            // InternalTDsl.g:3955:1: ( 'front' )
            {
            // InternalTDsl.g:3955:1: ( 'front' )
            // InternalTDsl.g:3956:2: 'front'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_0_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_0_0()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_0__0__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_0__1"
    // InternalTDsl.g:3965:1: rule__HorizontalSensors__Group_0__1 : rule__HorizontalSensors__Group_0__1__Impl ;
    public final void rule__HorizontalSensors__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3969:1: ( rule__HorizontalSensors__Group_0__1__Impl )
            // InternalTDsl.g:3970:2: rule__HorizontalSensors__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_0__1__Impl();

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
    // $ANTLR end "rule__HorizontalSensors__Group_0__1"


    // $ANTLR start "rule__HorizontalSensors__Group_0__1__Impl"
    // InternalTDsl.g:3976:1: rule__HorizontalSensors__Group_0__1__Impl : ( 'left' ) ;
    public final void rule__HorizontalSensors__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3980:1: ( ( 'left' ) )
            // InternalTDsl.g:3981:1: ( 'left' )
            {
            // InternalTDsl.g:3981:1: ( 'left' )
            // InternalTDsl.g:3982:2: 'left'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getLeftKeyword_0_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getLeftKeyword_0_1()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_0__1__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_1__0"
    // InternalTDsl.g:3992:1: rule__HorizontalSensors__Group_1__0 : rule__HorizontalSensors__Group_1__0__Impl rule__HorizontalSensors__Group_1__1 ;
    public final void rule__HorizontalSensors__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3996:1: ( rule__HorizontalSensors__Group_1__0__Impl rule__HorizontalSensors__Group_1__1 )
            // InternalTDsl.g:3997:2: rule__HorizontalSensors__Group_1__0__Impl rule__HorizontalSensors__Group_1__1
            {
            pushFollow(FOLLOW_50);
            rule__HorizontalSensors__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_1__1();

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
    // $ANTLR end "rule__HorizontalSensors__Group_1__0"


    // $ANTLR start "rule__HorizontalSensors__Group_1__0__Impl"
    // InternalTDsl.g:4004:1: rule__HorizontalSensors__Group_1__0__Impl : ( 'front' ) ;
    public final void rule__HorizontalSensors__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4008:1: ( ( 'front' ) )
            // InternalTDsl.g:4009:1: ( 'front' )
            {
            // InternalTDsl.g:4009:1: ( 'front' )
            // InternalTDsl.g:4010:2: 'front'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_1_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_1_0()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_1__0__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_1__1"
    // InternalTDsl.g:4019:1: rule__HorizontalSensors__Group_1__1 : rule__HorizontalSensors__Group_1__1__Impl ;
    public final void rule__HorizontalSensors__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4023:1: ( rule__HorizontalSensors__Group_1__1__Impl )
            // InternalTDsl.g:4024:2: rule__HorizontalSensors__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_1__1__Impl();

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
    // $ANTLR end "rule__HorizontalSensors__Group_1__1"


    // $ANTLR start "rule__HorizontalSensors__Group_1__1__Impl"
    // InternalTDsl.g:4030:1: rule__HorizontalSensors__Group_1__1__Impl : ( 'left/middle' ) ;
    public final void rule__HorizontalSensors__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4034:1: ( ( 'left/middle' ) )
            // InternalTDsl.g:4035:1: ( 'left/middle' )
            {
            // InternalTDsl.g:4035:1: ( 'left/middle' )
            // InternalTDsl.g:4036:2: 'left/middle'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getLeftMiddleKeyword_1_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getLeftMiddleKeyword_1_1()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_1__1__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_2__0"
    // InternalTDsl.g:4046:1: rule__HorizontalSensors__Group_2__0 : rule__HorizontalSensors__Group_2__0__Impl rule__HorizontalSensors__Group_2__1 ;
    public final void rule__HorizontalSensors__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4050:1: ( rule__HorizontalSensors__Group_2__0__Impl rule__HorizontalSensors__Group_2__1 )
            // InternalTDsl.g:4051:2: rule__HorizontalSensors__Group_2__0__Impl rule__HorizontalSensors__Group_2__1
            {
            pushFollow(FOLLOW_51);
            rule__HorizontalSensors__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_2__1();

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
    // $ANTLR end "rule__HorizontalSensors__Group_2__0"


    // $ANTLR start "rule__HorizontalSensors__Group_2__0__Impl"
    // InternalTDsl.g:4058:1: rule__HorizontalSensors__Group_2__0__Impl : ( 'front' ) ;
    public final void rule__HorizontalSensors__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4062:1: ( ( 'front' ) )
            // InternalTDsl.g:4063:1: ( 'front' )
            {
            // InternalTDsl.g:4063:1: ( 'front' )
            // InternalTDsl.g:4064:2: 'front'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_2_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_2_0()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_2__0__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_2__1"
    // InternalTDsl.g:4073:1: rule__HorizontalSensors__Group_2__1 : rule__HorizontalSensors__Group_2__1__Impl ;
    public final void rule__HorizontalSensors__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4077:1: ( rule__HorizontalSensors__Group_2__1__Impl )
            // InternalTDsl.g:4078:2: rule__HorizontalSensors__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_2__1__Impl();

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
    // $ANTLR end "rule__HorizontalSensors__Group_2__1"


    // $ANTLR start "rule__HorizontalSensors__Group_2__1__Impl"
    // InternalTDsl.g:4084:1: rule__HorizontalSensors__Group_2__1__Impl : ( 'middle' ) ;
    public final void rule__HorizontalSensors__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4088:1: ( ( 'middle' ) )
            // InternalTDsl.g:4089:1: ( 'middle' )
            {
            // InternalTDsl.g:4089:1: ( 'middle' )
            // InternalTDsl.g:4090:2: 'middle'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getMiddleKeyword_2_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getMiddleKeyword_2_1()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_2__1__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_3__0"
    // InternalTDsl.g:4100:1: rule__HorizontalSensors__Group_3__0 : rule__HorizontalSensors__Group_3__0__Impl rule__HorizontalSensors__Group_3__1 ;
    public final void rule__HorizontalSensors__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4104:1: ( rule__HorizontalSensors__Group_3__0__Impl rule__HorizontalSensors__Group_3__1 )
            // InternalTDsl.g:4105:2: rule__HorizontalSensors__Group_3__0__Impl rule__HorizontalSensors__Group_3__1
            {
            pushFollow(FOLLOW_52);
            rule__HorizontalSensors__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_3__1();

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
    // $ANTLR end "rule__HorizontalSensors__Group_3__0"


    // $ANTLR start "rule__HorizontalSensors__Group_3__0__Impl"
    // InternalTDsl.g:4112:1: rule__HorizontalSensors__Group_3__0__Impl : ( 'front' ) ;
    public final void rule__HorizontalSensors__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4116:1: ( ( 'front' ) )
            // InternalTDsl.g:4117:1: ( 'front' )
            {
            // InternalTDsl.g:4117:1: ( 'front' )
            // InternalTDsl.g:4118:2: 'front'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_3_0()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_3__0__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_3__1"
    // InternalTDsl.g:4127:1: rule__HorizontalSensors__Group_3__1 : rule__HorizontalSensors__Group_3__1__Impl ;
    public final void rule__HorizontalSensors__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4131:1: ( rule__HorizontalSensors__Group_3__1__Impl )
            // InternalTDsl.g:4132:2: rule__HorizontalSensors__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_3__1__Impl();

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
    // $ANTLR end "rule__HorizontalSensors__Group_3__1"


    // $ANTLR start "rule__HorizontalSensors__Group_3__1__Impl"
    // InternalTDsl.g:4138:1: rule__HorizontalSensors__Group_3__1__Impl : ( 'right/middle' ) ;
    public final void rule__HorizontalSensors__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4142:1: ( ( 'right/middle' ) )
            // InternalTDsl.g:4143:1: ( 'right/middle' )
            {
            // InternalTDsl.g:4143:1: ( 'right/middle' )
            // InternalTDsl.g:4144:2: 'right/middle'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getRightMiddleKeyword_3_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getRightMiddleKeyword_3_1()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_3__1__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_4__0"
    // InternalTDsl.g:4154:1: rule__HorizontalSensors__Group_4__0 : rule__HorizontalSensors__Group_4__0__Impl rule__HorizontalSensors__Group_4__1 ;
    public final void rule__HorizontalSensors__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4158:1: ( rule__HorizontalSensors__Group_4__0__Impl rule__HorizontalSensors__Group_4__1 )
            // InternalTDsl.g:4159:2: rule__HorizontalSensors__Group_4__0__Impl rule__HorizontalSensors__Group_4__1
            {
            pushFollow(FOLLOW_53);
            rule__HorizontalSensors__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_4__1();

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
    // $ANTLR end "rule__HorizontalSensors__Group_4__0"


    // $ANTLR start "rule__HorizontalSensors__Group_4__0__Impl"
    // InternalTDsl.g:4166:1: rule__HorizontalSensors__Group_4__0__Impl : ( 'front' ) ;
    public final void rule__HorizontalSensors__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4170:1: ( ( 'front' ) )
            // InternalTDsl.g:4171:1: ( 'front' )
            {
            // InternalTDsl.g:4171:1: ( 'front' )
            // InternalTDsl.g:4172:2: 'front'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_4_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_4_0()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_4__0__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_4__1"
    // InternalTDsl.g:4181:1: rule__HorizontalSensors__Group_4__1 : rule__HorizontalSensors__Group_4__1__Impl ;
    public final void rule__HorizontalSensors__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4185:1: ( rule__HorizontalSensors__Group_4__1__Impl )
            // InternalTDsl.g:4186:2: rule__HorizontalSensors__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_4__1__Impl();

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
    // $ANTLR end "rule__HorizontalSensors__Group_4__1"


    // $ANTLR start "rule__HorizontalSensors__Group_4__1__Impl"
    // InternalTDsl.g:4192:1: rule__HorizontalSensors__Group_4__1__Impl : ( 'right' ) ;
    public final void rule__HorizontalSensors__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4196:1: ( ( 'right' ) )
            // InternalTDsl.g:4197:1: ( 'right' )
            {
            // InternalTDsl.g:4197:1: ( 'right' )
            // InternalTDsl.g:4198:2: 'right'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getRightKeyword_4_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getRightKeyword_4_1()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_4__1__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_5__0"
    // InternalTDsl.g:4208:1: rule__HorizontalSensors__Group_5__0 : rule__HorizontalSensors__Group_5__0__Impl rule__HorizontalSensors__Group_5__1 ;
    public final void rule__HorizontalSensors__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4212:1: ( rule__HorizontalSensors__Group_5__0__Impl rule__HorizontalSensors__Group_5__1 )
            // InternalTDsl.g:4213:2: rule__HorizontalSensors__Group_5__0__Impl rule__HorizontalSensors__Group_5__1
            {
            pushFollow(FOLLOW_49);
            rule__HorizontalSensors__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_5__1();

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
    // $ANTLR end "rule__HorizontalSensors__Group_5__0"


    // $ANTLR start "rule__HorizontalSensors__Group_5__0__Impl"
    // InternalTDsl.g:4220:1: rule__HorizontalSensors__Group_5__0__Impl : ( 'backward' ) ;
    public final void rule__HorizontalSensors__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4224:1: ( ( 'backward' ) )
            // InternalTDsl.g:4225:1: ( 'backward' )
            {
            // InternalTDsl.g:4225:1: ( 'backward' )
            // InternalTDsl.g:4226:2: 'backward'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getBackwardKeyword_5_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getBackwardKeyword_5_0()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_5__0__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_5__1"
    // InternalTDsl.g:4235:1: rule__HorizontalSensors__Group_5__1 : rule__HorizontalSensors__Group_5__1__Impl ;
    public final void rule__HorizontalSensors__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4239:1: ( rule__HorizontalSensors__Group_5__1__Impl )
            // InternalTDsl.g:4240:2: rule__HorizontalSensors__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_5__1__Impl();

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
    // $ANTLR end "rule__HorizontalSensors__Group_5__1"


    // $ANTLR start "rule__HorizontalSensors__Group_5__1__Impl"
    // InternalTDsl.g:4246:1: rule__HorizontalSensors__Group_5__1__Impl : ( 'left' ) ;
    public final void rule__HorizontalSensors__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4250:1: ( ( 'left' ) )
            // InternalTDsl.g:4251:1: ( 'left' )
            {
            // InternalTDsl.g:4251:1: ( 'left' )
            // InternalTDsl.g:4252:2: 'left'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getLeftKeyword_5_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getLeftKeyword_5_1()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_5__1__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_6__0"
    // InternalTDsl.g:4262:1: rule__HorizontalSensors__Group_6__0 : rule__HorizontalSensors__Group_6__0__Impl rule__HorizontalSensors__Group_6__1 ;
    public final void rule__HorizontalSensors__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4266:1: ( rule__HorizontalSensors__Group_6__0__Impl rule__HorizontalSensors__Group_6__1 )
            // InternalTDsl.g:4267:2: rule__HorizontalSensors__Group_6__0__Impl rule__HorizontalSensors__Group_6__1
            {
            pushFollow(FOLLOW_53);
            rule__HorizontalSensors__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_6__1();

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
    // $ANTLR end "rule__HorizontalSensors__Group_6__0"


    // $ANTLR start "rule__HorizontalSensors__Group_6__0__Impl"
    // InternalTDsl.g:4274:1: rule__HorizontalSensors__Group_6__0__Impl : ( 'backward' ) ;
    public final void rule__HorizontalSensors__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4278:1: ( ( 'backward' ) )
            // InternalTDsl.g:4279:1: ( 'backward' )
            {
            // InternalTDsl.g:4279:1: ( 'backward' )
            // InternalTDsl.g:4280:2: 'backward'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getBackwardKeyword_6_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getBackwardKeyword_6_0()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_6__0__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_6__1"
    // InternalTDsl.g:4289:1: rule__HorizontalSensors__Group_6__1 : rule__HorizontalSensors__Group_6__1__Impl ;
    public final void rule__HorizontalSensors__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4293:1: ( rule__HorizontalSensors__Group_6__1__Impl )
            // InternalTDsl.g:4294:2: rule__HorizontalSensors__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalSensors__Group_6__1__Impl();

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
    // $ANTLR end "rule__HorizontalSensors__Group_6__1"


    // $ANTLR start "rule__HorizontalSensors__Group_6__1__Impl"
    // InternalTDsl.g:4300:1: rule__HorizontalSensors__Group_6__1__Impl : ( 'right' ) ;
    public final void rule__HorizontalSensors__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4304:1: ( ( 'right' ) )
            // InternalTDsl.g:4305:1: ( 'right' )
            {
            // InternalTDsl.g:4305:1: ( 'right' )
            // InternalTDsl.g:4306:2: 'right'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getRightKeyword_6_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHorizontalSensorsAccess().getRightKeyword_6_1()); 

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
    // $ANTLR end "rule__HorizontalSensors__Group_6__1__Impl"


    // $ANTLR start "rule__ThymioDSL__StatementAssignment"
    // InternalTDsl.g:4316:1: rule__ThymioDSL__StatementAssignment : ( ruleStatement ) ;
    public final void rule__ThymioDSL__StatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4320:1: ( ( ruleStatement ) )
            // InternalTDsl.g:4321:2: ( ruleStatement )
            {
            // InternalTDsl.g:4321:2: ( ruleStatement )
            // InternalTDsl.g:4322:3: ruleStatement
            {
             before(grammarAccess.getThymioDSLAccess().getStatementStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getThymioDSLAccess().getStatementStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__ThymioDSL__StatementAssignment"


    // $ANTLR start "rule__Statement__EventAssignment_1"
    // InternalTDsl.g:4331:1: rule__Statement__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Statement__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4335:1: ( ( ruleEvent ) )
            // InternalTDsl.g:4336:2: ( ruleEvent )
            {
            // InternalTDsl.g:4336:2: ( ruleEvent )
            // InternalTDsl.g:4337:3: ruleEvent
            {
             before(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Statement__EventAssignment_1"


    // $ANTLR start "rule__Statement__IfstatementAssignment_2_0"
    // InternalTDsl.g:4346:1: rule__Statement__IfstatementAssignment_2_0 : ( ruleIfStatement ) ;
    public final void rule__Statement__IfstatementAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4350:1: ( ( ruleIfStatement ) )
            // InternalTDsl.g:4351:2: ( ruleIfStatement )
            {
            // InternalTDsl.g:4351:2: ( ruleIfStatement )
            // InternalTDsl.g:4352:3: ruleIfStatement
            {
             before(grammarAccess.getStatementAccess().getIfstatementIfStatementParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getIfstatementIfStatementParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Statement__IfstatementAssignment_2_0"


    // $ANTLR start "rule__Statement__ActionAssignment_2_1"
    // InternalTDsl.g:4361:1: rule__Statement__ActionAssignment_2_1 : ( ruleAction ) ;
    public final void rule__Statement__ActionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4365:1: ( ( ruleAction ) )
            // InternalTDsl.g:4366:2: ( ruleAction )
            {
            // InternalTDsl.g:4366:2: ( ruleAction )
            // InternalTDsl.g:4367:3: ruleAction
            {
             before(grammarAccess.getStatementAccess().getActionActionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getActionActionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Statement__ActionAssignment_2_1"


    // $ANTLR start "rule__MovementAction__DirectionAssignment_0_1"
    // InternalTDsl.g:4376:1: rule__MovementAction__DirectionAssignment_0_1 : ( ( rule__MovementAction__DirectionAlternatives_0_1_0 ) ) ;
    public final void rule__MovementAction__DirectionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4380:1: ( ( ( rule__MovementAction__DirectionAlternatives_0_1_0 ) ) )
            // InternalTDsl.g:4381:2: ( ( rule__MovementAction__DirectionAlternatives_0_1_0 ) )
            {
            // InternalTDsl.g:4381:2: ( ( rule__MovementAction__DirectionAlternatives_0_1_0 ) )
            // InternalTDsl.g:4382:3: ( rule__MovementAction__DirectionAlternatives_0_1_0 )
            {
             before(grammarAccess.getMovementActionAccess().getDirectionAlternatives_0_1_0()); 
            // InternalTDsl.g:4383:3: ( rule__MovementAction__DirectionAlternatives_0_1_0 )
            // InternalTDsl.g:4383:4: rule__MovementAction__DirectionAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__DirectionAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMovementActionAccess().getDirectionAlternatives_0_1_0()); 

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
    // $ANTLR end "rule__MovementAction__DirectionAssignment_0_1"


    // $ANTLR start "rule__MovementAction__SpeedAssignment_0_2_2"
    // InternalTDsl.g:4391:1: rule__MovementAction__SpeedAssignment_0_2_2 : ( ruleArithmeticExpression ) ;
    public final void rule__MovementAction__SpeedAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4395:1: ( ( ruleArithmeticExpression ) )
            // InternalTDsl.g:4396:2: ( ruleArithmeticExpression )
            {
            // InternalTDsl.g:4396:2: ( ruleArithmeticExpression )
            // InternalTDsl.g:4397:3: ruleArithmeticExpression
            {
             before(grammarAccess.getMovementActionAccess().getSpeedArithmeticExpressionParserRuleCall_0_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getMovementActionAccess().getSpeedArithmeticExpressionParserRuleCall_0_2_2_0()); 

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
    // $ANTLR end "rule__MovementAction__SpeedAssignment_0_2_2"


    // $ANTLR start "rule__MovementAction__DirectionAssignment_1_1"
    // InternalTDsl.g:4406:1: rule__MovementAction__DirectionAssignment_1_1 : ( ruleRightLeft ) ;
    public final void rule__MovementAction__DirectionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4410:1: ( ( ruleRightLeft ) )
            // InternalTDsl.g:4411:2: ( ruleRightLeft )
            {
            // InternalTDsl.g:4411:2: ( ruleRightLeft )
            // InternalTDsl.g:4412:3: ruleRightLeft
            {
             before(grammarAccess.getMovementActionAccess().getDirectionRightLeftParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRightLeft();

            state._fsp--;

             after(grammarAccess.getMovementActionAccess().getDirectionRightLeftParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MovementAction__DirectionAssignment_1_1"


    // $ANTLR start "rule__SoundAction__SoundAssignment_0_2"
    // InternalTDsl.g:4421:1: rule__SoundAction__SoundAssignment_0_2 : ( ruleSound ) ;
    public final void rule__SoundAction__SoundAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4425:1: ( ( ruleSound ) )
            // InternalTDsl.g:4426:2: ( ruleSound )
            {
            // InternalTDsl.g:4426:2: ( ruleSound )
            // InternalTDsl.g:4427:3: ruleSound
            {
             before(grammarAccess.getSoundActionAccess().getSoundSoundParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSound();

            state._fsp--;

             after(grammarAccess.getSoundActionAccess().getSoundSoundParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__SoundAction__SoundAssignment_0_2"


    // $ANTLR start "rule__ColorBottomAction__ColorAssignment_0_4"
    // InternalTDsl.g:4436:1: rule__ColorBottomAction__ColorAssignment_0_4 : ( ruleColor ) ;
    public final void rule__ColorBottomAction__ColorAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4440:1: ( ( ruleColor ) )
            // InternalTDsl.g:4441:2: ( ruleColor )
            {
            // InternalTDsl.g:4441:2: ( ruleColor )
            // InternalTDsl.g:4442:3: ruleColor
            {
             before(grammarAccess.getColorBottomActionAccess().getColorColorParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorBottomActionAccess().getColorColorParserRuleCall_0_4_0()); 

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
    // $ANTLR end "rule__ColorBottomAction__ColorAssignment_0_4"


    // $ANTLR start "rule__ColorTopAction__ColorAssignment_0_4"
    // InternalTDsl.g:4451:1: rule__ColorTopAction__ColorAssignment_0_4 : ( ruleColor ) ;
    public final void rule__ColorTopAction__ColorAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4455:1: ( ( ruleColor ) )
            // InternalTDsl.g:4456:2: ( ruleColor )
            {
            // InternalTDsl.g:4456:2: ( ruleColor )
            // InternalTDsl.g:4457:3: ruleColor
            {
             before(grammarAccess.getColorTopActionAccess().getColorColorParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorTopActionAccess().getColorColorParserRuleCall_0_4_0()); 

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
    // $ANTLR end "rule__ColorTopAction__ColorAssignment_0_4"


    // $ANTLR start "rule__IfStatement__ConditionAssignment_1"
    // InternalTDsl.g:4466:1: rule__IfStatement__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__IfStatement__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4470:1: ( ( ruleCondition ) )
            // InternalTDsl.g:4471:2: ( ruleCondition )
            {
            // InternalTDsl.g:4471:2: ( ruleCondition )
            // InternalTDsl.g:4472:3: ruleCondition
            {
             before(grammarAccess.getIfStatementAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getConditionConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__IfStatement__ConditionAssignment_1"


    // $ANTLR start "rule__IfStatement__ActionAssignment_3"
    // InternalTDsl.g:4481:1: rule__IfStatement__ActionAssignment_3 : ( ruleAction ) ;
    public final void rule__IfStatement__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4485:1: ( ( ruleAction ) )
            // InternalTDsl.g:4486:2: ( ruleAction )
            {
            // InternalTDsl.g:4486:2: ( ruleAction )
            // InternalTDsl.g:4487:3: ruleAction
            {
             before(grammarAccess.getIfStatementAccess().getActionActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getActionActionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__IfStatement__ActionAssignment_3"


    // $ANTLR start "rule__UpperEvent__ButtonsAssignment_1"
    // InternalTDsl.g:4496:1: rule__UpperEvent__ButtonsAssignment_1 : ( ruleButtons ) ;
    public final void rule__UpperEvent__ButtonsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4500:1: ( ( ruleButtons ) )
            // InternalTDsl.g:4501:2: ( ruleButtons )
            {
            // InternalTDsl.g:4501:2: ( ruleButtons )
            // InternalTDsl.g:4502:3: ruleButtons
            {
             before(grammarAccess.getUpperEventAccess().getButtonsButtonsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleButtons();

            state._fsp--;

             after(grammarAccess.getUpperEventAccess().getButtonsButtonsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UpperEvent__ButtonsAssignment_1"


    // $ANTLR start "rule__UpperEvent__ButtonsAssignment_2_1"
    // InternalTDsl.g:4511:1: rule__UpperEvent__ButtonsAssignment_2_1 : ( ruleButtons ) ;
    public final void rule__UpperEvent__ButtonsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4515:1: ( ( ruleButtons ) )
            // InternalTDsl.g:4516:2: ( ruleButtons )
            {
            // InternalTDsl.g:4516:2: ( ruleButtons )
            // InternalTDsl.g:4517:3: ruleButtons
            {
             before(grammarAccess.getUpperEventAccess().getButtonsButtonsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleButtons();

            state._fsp--;

             after(grammarAccess.getUpperEventAccess().getButtonsButtonsParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__UpperEvent__ButtonsAssignment_2_1"


    // $ANTLR start "rule__UpperEvent__StateAssignment_4"
    // InternalTDsl.g:4526:1: rule__UpperEvent__StateAssignment_4 : ( ruleState ) ;
    public final void rule__UpperEvent__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4530:1: ( ( ruleState ) )
            // InternalTDsl.g:4531:2: ( ruleState )
            {
            // InternalTDsl.g:4531:2: ( ruleState )
            // InternalTDsl.g:4532:3: ruleState
            {
             before(grammarAccess.getUpperEventAccess().getStateStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getUpperEventAccess().getStateStateParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__UpperEvent__StateAssignment_4"


    // $ANTLR start "rule__ProxEvent__SensorAssignment_1"
    // InternalTDsl.g:4541:1: rule__ProxEvent__SensorAssignment_1 : ( ruleSensor ) ;
    public final void rule__ProxEvent__SensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4545:1: ( ( ruleSensor ) )
            // InternalTDsl.g:4546:2: ( ruleSensor )
            {
            // InternalTDsl.g:4546:2: ( ruleSensor )
            // InternalTDsl.g:4547:3: ruleSensor
            {
             before(grammarAccess.getProxEventAccess().getSensorSensorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getProxEventAccess().getSensorSensorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ProxEvent__SensorAssignment_1"


    // $ANTLR start "rule__Sensor__Sensor_typeAssignment_0_1"
    // InternalTDsl.g:4556:1: rule__Sensor__Sensor_typeAssignment_0_1 : ( ( 'horizontal' ) ) ;
    public final void rule__Sensor__Sensor_typeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4560:1: ( ( ( 'horizontal' ) ) )
            // InternalTDsl.g:4561:2: ( ( 'horizontal' ) )
            {
            // InternalTDsl.g:4561:2: ( ( 'horizontal' ) )
            // InternalTDsl.g:4562:3: ( 'horizontal' )
            {
             before(grammarAccess.getSensorAccess().getSensor_typeHorizontalKeyword_0_1_0()); 
            // InternalTDsl.g:4563:3: ( 'horizontal' )
            // InternalTDsl.g:4564:4: 'horizontal'
            {
             before(grammarAccess.getSensorAccess().getSensor_typeHorizontalKeyword_0_1_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensor_typeHorizontalKeyword_0_1_0()); 

            }

             after(grammarAccess.getSensorAccess().getSensor_typeHorizontalKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Sensor__Sensor_typeAssignment_0_1"


    // $ANTLR start "rule__Sensor__Sensor_typeAssignment_1_1"
    // InternalTDsl.g:4575:1: rule__Sensor__Sensor_typeAssignment_1_1 : ( ( 'ground' ) ) ;
    public final void rule__Sensor__Sensor_typeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4579:1: ( ( ( 'ground' ) ) )
            // InternalTDsl.g:4580:2: ( ( 'ground' ) )
            {
            // InternalTDsl.g:4580:2: ( ( 'ground' ) )
            // InternalTDsl.g:4581:3: ( 'ground' )
            {
             before(grammarAccess.getSensorAccess().getSensor_typeGroundKeyword_1_1_0()); 
            // InternalTDsl.g:4582:3: ( 'ground' )
            // InternalTDsl.g:4583:4: 'ground'
            {
             before(grammarAccess.getSensorAccess().getSensor_typeGroundKeyword_1_1_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensor_typeGroundKeyword_1_1_0()); 

            }

             after(grammarAccess.getSensorAccess().getSensor_typeGroundKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Sensor__Sensor_typeAssignment_1_1"


    // $ANTLR start "rule__Condition__LeftSensorAssignment_0"
    // InternalTDsl.g:4594:1: rule__Condition__LeftSensorAssignment_0 : ( ruleSensor ) ;
    public final void rule__Condition__LeftSensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4598:1: ( ( ruleSensor ) )
            // InternalTDsl.g:4599:2: ( ruleSensor )
            {
            // InternalTDsl.g:4599:2: ( ruleSensor )
            // InternalTDsl.g:4600:3: ruleSensor
            {
             before(grammarAccess.getConditionAccess().getLeftSensorSensorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getLeftSensorSensorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Condition__LeftSensorAssignment_0"


    // $ANTLR start "rule__Condition__OperatorAssignment_1_0"
    // InternalTDsl.g:4609:1: rule__Condition__OperatorAssignment_1_0 : ( ( rule__Condition__OperatorAlternatives_1_0_0 ) ) ;
    public final void rule__Condition__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4613:1: ( ( ( rule__Condition__OperatorAlternatives_1_0_0 ) ) )
            // InternalTDsl.g:4614:2: ( ( rule__Condition__OperatorAlternatives_1_0_0 ) )
            {
            // InternalTDsl.g:4614:2: ( ( rule__Condition__OperatorAlternatives_1_0_0 ) )
            // InternalTDsl.g:4615:3: ( rule__Condition__OperatorAlternatives_1_0_0 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAlternatives_1_0_0()); 
            // InternalTDsl.g:4616:3: ( rule__Condition__OperatorAlternatives_1_0_0 )
            // InternalTDsl.g:4616:4: rule__Condition__OperatorAlternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OperatorAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperatorAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__Condition__OperatorAssignment_1_0"


    // $ANTLR start "rule__Condition__RightSensorAssignment_1_1"
    // InternalTDsl.g:4624:1: rule__Condition__RightSensorAssignment_1_1 : ( ruleSensor ) ;
    public final void rule__Condition__RightSensorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4628:1: ( ( ruleSensor ) )
            // InternalTDsl.g:4629:2: ( ruleSensor )
            {
            // InternalTDsl.g:4629:2: ( ruleSensor )
            // InternalTDsl.g:4630:3: ruleSensor
            {
             before(grammarAccess.getConditionAccess().getRightSensorSensorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getRightSensorSensorParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Condition__RightSensorAssignment_1_1"


    // $ANTLR start "rule__ArithmeticExpression__LeftAssignment_0"
    // InternalTDsl.g:4639:1: rule__ArithmeticExpression__LeftAssignment_0 : ( ruleEIntegerObject ) ;
    public final void rule__ArithmeticExpression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4643:1: ( ( ruleEIntegerObject ) )
            // InternalTDsl.g:4644:2: ( ruleEIntegerObject )
            {
            // InternalTDsl.g:4644:2: ( ruleEIntegerObject )
            // InternalTDsl.g:4645:3: ruleEIntegerObject
            {
             before(grammarAccess.getArithmeticExpressionAccess().getLeftEIntegerObjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionAccess().getLeftEIntegerObjectParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ArithmeticExpression__LeftAssignment_0"


    // $ANTLR start "rule__ArithmeticExpression__OperatorAssignment_1_0"
    // InternalTDsl.g:4654:1: rule__ArithmeticExpression__OperatorAssignment_1_0 : ( ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 ) ) ;
    public final void rule__ArithmeticExpression__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4658:1: ( ( ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 ) ) )
            // InternalTDsl.g:4659:2: ( ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 ) )
            {
            // InternalTDsl.g:4659:2: ( ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 ) )
            // InternalTDsl.g:4660:3: ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getOperatorAlternatives_1_0_0()); 
            // InternalTDsl.g:4661:3: ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 )
            // InternalTDsl.g:4661:4: rule__ArithmeticExpression__OperatorAlternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__OperatorAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticExpressionAccess().getOperatorAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__ArithmeticExpression__OperatorAssignment_1_0"


    // $ANTLR start "rule__ArithmeticExpression__RightAssignment_1_1"
    // InternalTDsl.g:4669:1: rule__ArithmeticExpression__RightAssignment_1_1 : ( ruleEIntegerObject ) ;
    public final void rule__ArithmeticExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4673:1: ( ( ruleEIntegerObject ) )
            // InternalTDsl.g:4674:2: ( ruleEIntegerObject )
            {
            // InternalTDsl.g:4674:2: ( ruleEIntegerObject )
            // InternalTDsl.g:4675:3: ruleEIntegerObject
            {
             before(grammarAccess.getArithmeticExpressionAccess().getRightEIntegerObjectParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionAccess().getRightEIntegerObjectParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ArithmeticExpression__RightAssignment_1_1"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\14\2\42\7\uffff";
    static final String dfa_3s = "\1\104\1\107\1\43\7\uffff";
    static final String dfa_4s = "\3\uffff\1\5\1\2\1\4\1\1\1\3\1\7\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\67\uffff\1\1",
            "\1\3\1\6\41\uffff\1\4\1\7\1\5",
            "\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1146:1: rule__HorizontalSensors__Alternatives : ( ( ( rule__HorizontalSensors__Group_0__0 ) ) | ( ( rule__HorizontalSensors__Group_1__0 ) ) | ( ( rule__HorizontalSensors__Group_2__0 ) ) | ( ( rule__HorizontalSensors__Group_3__0 ) ) | ( ( rule__HorizontalSensors__Group_4__0 ) ) | ( ( rule__HorizontalSensors__Group_5__0 ) ) | ( ( rule__HorizontalSensors__Group_6__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0100000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0100000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00024C8000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000C8000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000001F80C000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C00001000L,0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000E00001800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x2000000000010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000000000E000L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000400000000L});

}