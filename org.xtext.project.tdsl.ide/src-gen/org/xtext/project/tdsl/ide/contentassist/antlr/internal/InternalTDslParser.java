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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'forward'", "'backward'", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'red'", "'green'", "'blue'", "'black'", "'white'", "'yellow'", "'pink'", "'orange'", "'sound1'", "'sound2'", "'sound3'", "'sound4'", "'proximity'", "'center'", "'right'", "'left'", "'touched'", "'released'", "'->'", "'On'", "'do'", "':'", "'drive'", "'with'", "'speed'", "'turn'", "'stop'", "'play'", "'sound'", "'playing'", "'set'", "'bottom'", "'color'", "'to'", "'off'", "'leds'", "'top'", "'If'", "'End'", "'if'", "'button'", "'sensor'", "'detecting'", "'tap'", "'clap'", "'no'", "'front'", "'left/middle'", "'middle'", "'right/middle'", "'driving'", "'turning'", "'horizontal'", "'ground'"
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
    // InternalTDsl.g:112:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:116:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalTDsl.g:117:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalTDsl.g:117:2: ( ( rule__Event__Group__0 ) )
            // InternalTDsl.g:118:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalTDsl.g:119:3: ( rule__Event__Group__0 )
            // InternalTDsl.g:119:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

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


    // $ANTLR start "entryRuleButton"
    // InternalTDsl.g:303:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalTDsl.g:304:1: ( ruleButton EOF )
            // InternalTDsl.g:305:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalTDsl.g:312:1: ruleButton : ( ( rule__Button__NameAssignment ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:316:2: ( ( ( rule__Button__NameAssignment ) ) )
            // InternalTDsl.g:317:2: ( ( rule__Button__NameAssignment ) )
            {
            // InternalTDsl.g:317:2: ( ( rule__Button__NameAssignment ) )
            // InternalTDsl.g:318:3: ( rule__Button__NameAssignment )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment()); 
            // InternalTDsl.g:319:3: ( rule__Button__NameAssignment )
            // InternalTDsl.g:319:4: rule__Button__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleProxEvent"
    // InternalTDsl.g:328:1: entryRuleProxEvent : ruleProxEvent EOF ;
    public final void entryRuleProxEvent() throws RecognitionException {
        try {
            // InternalTDsl.g:329:1: ( ruleProxEvent EOF )
            // InternalTDsl.g:330:1: ruleProxEvent EOF
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
    // InternalTDsl.g:337:1: ruleProxEvent : ( ( rule__ProxEvent__SensorAssignment ) ) ;
    public final void ruleProxEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:341:2: ( ( ( rule__ProxEvent__SensorAssignment ) ) )
            // InternalTDsl.g:342:2: ( ( rule__ProxEvent__SensorAssignment ) )
            {
            // InternalTDsl.g:342:2: ( ( rule__ProxEvent__SensorAssignment ) )
            // InternalTDsl.g:343:3: ( rule__ProxEvent__SensorAssignment )
            {
             before(grammarAccess.getProxEventAccess().getSensorAssignment()); 
            // InternalTDsl.g:344:3: ( rule__ProxEvent__SensorAssignment )
            // InternalTDsl.g:344:4: rule__ProxEvent__SensorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ProxEvent__SensorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProxEventAccess().getSensorAssignment()); 

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
    // InternalTDsl.g:353:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalTDsl.g:354:1: ( ruleSensor EOF )
            // InternalTDsl.g:355:1: ruleSensor EOF
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
    // InternalTDsl.g:362:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:366:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalTDsl.g:367:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalTDsl.g:367:2: ( ( rule__Sensor__Alternatives ) )
            // InternalTDsl.g:368:3: ( rule__Sensor__Alternatives )
            {
             before(grammarAccess.getSensorAccess().getAlternatives()); 
            // InternalTDsl.g:369:3: ( rule__Sensor__Alternatives )
            // InternalTDsl.g:369:4: rule__Sensor__Alternatives
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
    // InternalTDsl.g:378:1: entryRuleTapEvent : ruleTapEvent EOF ;
    public final void entryRuleTapEvent() throws RecognitionException {
        try {
            // InternalTDsl.g:379:1: ( ruleTapEvent EOF )
            // InternalTDsl.g:380:1: ruleTapEvent EOF
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
    // InternalTDsl.g:387:1: ruleTapEvent : ( ( rule__TapEvent__Group__0 ) ) ;
    public final void ruleTapEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:391:2: ( ( ( rule__TapEvent__Group__0 ) ) )
            // InternalTDsl.g:392:2: ( ( rule__TapEvent__Group__0 ) )
            {
            // InternalTDsl.g:392:2: ( ( rule__TapEvent__Group__0 ) )
            // InternalTDsl.g:393:3: ( rule__TapEvent__Group__0 )
            {
             before(grammarAccess.getTapEventAccess().getGroup()); 
            // InternalTDsl.g:394:3: ( rule__TapEvent__Group__0 )
            // InternalTDsl.g:394:4: rule__TapEvent__Group__0
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
    // InternalTDsl.g:403:1: entryRuleClapEvent : ruleClapEvent EOF ;
    public final void entryRuleClapEvent() throws RecognitionException {
        try {
            // InternalTDsl.g:404:1: ( ruleClapEvent EOF )
            // InternalTDsl.g:405:1: ruleClapEvent EOF
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
    // InternalTDsl.g:412:1: ruleClapEvent : ( ( rule__ClapEvent__Group__0 ) ) ;
    public final void ruleClapEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:416:2: ( ( ( rule__ClapEvent__Group__0 ) ) )
            // InternalTDsl.g:417:2: ( ( rule__ClapEvent__Group__0 ) )
            {
            // InternalTDsl.g:417:2: ( ( rule__ClapEvent__Group__0 ) )
            // InternalTDsl.g:418:3: ( rule__ClapEvent__Group__0 )
            {
             before(grammarAccess.getClapEventAccess().getGroup()); 
            // InternalTDsl.g:419:3: ( rule__ClapEvent__Group__0 )
            // InternalTDsl.g:419:4: rule__ClapEvent__Group__0
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
    // InternalTDsl.g:428:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalTDsl.g:429:1: ( ruleCondition EOF )
            // InternalTDsl.g:430:1: ruleCondition EOF
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
    // InternalTDsl.g:437:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:441:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalTDsl.g:442:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalTDsl.g:442:2: ( ( rule__Condition__Group__0 ) )
            // InternalTDsl.g:443:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalTDsl.g:444:3: ( rule__Condition__Group__0 )
            // InternalTDsl.g:444:4: rule__Condition__Group__0
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
    // InternalTDsl.g:453:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // InternalTDsl.g:454:1: ( ruleArithmeticExpression EOF )
            // InternalTDsl.g:455:1: ruleArithmeticExpression EOF
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
    // InternalTDsl.g:462:1: ruleArithmeticExpression : ( ( rule__ArithmeticExpression__Group__0 ) ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:466:2: ( ( ( rule__ArithmeticExpression__Group__0 ) ) )
            // InternalTDsl.g:467:2: ( ( rule__ArithmeticExpression__Group__0 ) )
            {
            // InternalTDsl.g:467:2: ( ( rule__ArithmeticExpression__Group__0 ) )
            // InternalTDsl.g:468:3: ( rule__ArithmeticExpression__Group__0 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getGroup()); 
            // InternalTDsl.g:469:3: ( rule__ArithmeticExpression__Group__0 )
            // InternalTDsl.g:469:4: rule__ArithmeticExpression__Group__0
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
    // InternalTDsl.g:478:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // InternalTDsl.g:479:1: ( ruleEIntegerObject EOF )
            // InternalTDsl.g:480:1: ruleEIntegerObject EOF
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
    // InternalTDsl.g:487:1: ruleEIntegerObject : ( ( rule__EIntegerObject__Group__0 ) ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:491:2: ( ( ( rule__EIntegerObject__Group__0 ) ) )
            // InternalTDsl.g:492:2: ( ( rule__EIntegerObject__Group__0 ) )
            {
            // InternalTDsl.g:492:2: ( ( rule__EIntegerObject__Group__0 ) )
            // InternalTDsl.g:493:3: ( rule__EIntegerObject__Group__0 )
            {
             before(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            // InternalTDsl.g:494:3: ( rule__EIntegerObject__Group__0 )
            // InternalTDsl.g:494:4: rule__EIntegerObject__Group__0
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
    // InternalTDsl.g:503:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalTDsl.g:504:1: ( ruleColor EOF )
            // InternalTDsl.g:505:1: ruleColor EOF
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
    // InternalTDsl.g:512:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:516:2: ( ( ( rule__Color__Alternatives ) ) )
            // InternalTDsl.g:517:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalTDsl.g:517:2: ( ( rule__Color__Alternatives ) )
            // InternalTDsl.g:518:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalTDsl.g:519:3: ( rule__Color__Alternatives )
            // InternalTDsl.g:519:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

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
    // InternalTDsl.g:528:1: entryRuleSound : ruleSound EOF ;
    public final void entryRuleSound() throws RecognitionException {
        try {
            // InternalTDsl.g:529:1: ( ruleSound EOF )
            // InternalTDsl.g:530:1: ruleSound EOF
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
    // InternalTDsl.g:537:1: ruleSound : ( ( rule__Sound__Alternatives ) ) ;
    public final void ruleSound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:541:2: ( ( ( rule__Sound__Alternatives ) ) )
            // InternalTDsl.g:542:2: ( ( rule__Sound__Alternatives ) )
            {
            // InternalTDsl.g:542:2: ( ( rule__Sound__Alternatives ) )
            // InternalTDsl.g:543:3: ( rule__Sound__Alternatives )
            {
             before(grammarAccess.getSoundAccess().getAlternatives()); 
            // InternalTDsl.g:544:3: ( rule__Sound__Alternatives )
            // InternalTDsl.g:544:4: rule__Sound__Alternatives
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


    // $ANTLR start "entryRuleState_Horizontal_Sensor"
    // InternalTDsl.g:553:1: entryRuleState_Horizontal_Sensor : ruleState_Horizontal_Sensor EOF ;
    public final void entryRuleState_Horizontal_Sensor() throws RecognitionException {
        try {
            // InternalTDsl.g:554:1: ( ruleState_Horizontal_Sensor EOF )
            // InternalTDsl.g:555:1: ruleState_Horizontal_Sensor EOF
            {
             before(grammarAccess.getState_Horizontal_SensorRule()); 
            pushFollow(FOLLOW_1);
            ruleState_Horizontal_Sensor();

            state._fsp--;

             after(grammarAccess.getState_Horizontal_SensorRule()); 
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
    // $ANTLR end "entryRuleState_Horizontal_Sensor"


    // $ANTLR start "ruleState_Horizontal_Sensor"
    // InternalTDsl.g:562:1: ruleState_Horizontal_Sensor : ( ( rule__State_Horizontal_Sensor__Alternatives ) ) ;
    public final void ruleState_Horizontal_Sensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:566:2: ( ( ( rule__State_Horizontal_Sensor__Alternatives ) ) )
            // InternalTDsl.g:567:2: ( ( rule__State_Horizontal_Sensor__Alternatives ) )
            {
            // InternalTDsl.g:567:2: ( ( rule__State_Horizontal_Sensor__Alternatives ) )
            // InternalTDsl.g:568:3: ( rule__State_Horizontal_Sensor__Alternatives )
            {
             before(grammarAccess.getState_Horizontal_SensorAccess().getAlternatives()); 
            // InternalTDsl.g:569:3: ( rule__State_Horizontal_Sensor__Alternatives )
            // InternalTDsl.g:569:4: rule__State_Horizontal_Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__State_Horizontal_Sensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getState_Horizontal_SensorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleState_Horizontal_Sensor"


    // $ANTLR start "entryRuleState_Ground_Sensor"
    // InternalTDsl.g:578:1: entryRuleState_Ground_Sensor : ruleState_Ground_Sensor EOF ;
    public final void entryRuleState_Ground_Sensor() throws RecognitionException {
        try {
            // InternalTDsl.g:579:1: ( ruleState_Ground_Sensor EOF )
            // InternalTDsl.g:580:1: ruleState_Ground_Sensor EOF
            {
             before(grammarAccess.getState_Ground_SensorRule()); 
            pushFollow(FOLLOW_1);
            ruleState_Ground_Sensor();

            state._fsp--;

             after(grammarAccess.getState_Ground_SensorRule()); 
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
    // $ANTLR end "entryRuleState_Ground_Sensor"


    // $ANTLR start "ruleState_Ground_Sensor"
    // InternalTDsl.g:587:1: ruleState_Ground_Sensor : ( ( rule__State_Ground_Sensor__Alternatives ) ) ;
    public final void ruleState_Ground_Sensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:591:2: ( ( ( rule__State_Ground_Sensor__Alternatives ) ) )
            // InternalTDsl.g:592:2: ( ( rule__State_Ground_Sensor__Alternatives ) )
            {
            // InternalTDsl.g:592:2: ( ( rule__State_Ground_Sensor__Alternatives ) )
            // InternalTDsl.g:593:3: ( rule__State_Ground_Sensor__Alternatives )
            {
             before(grammarAccess.getState_Ground_SensorAccess().getAlternatives()); 
            // InternalTDsl.g:594:3: ( rule__State_Ground_Sensor__Alternatives )
            // InternalTDsl.g:594:4: rule__State_Ground_Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__State_Ground_Sensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getState_Ground_SensorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleState_Ground_Sensor"


    // $ANTLR start "entryRuleButtons"
    // InternalTDsl.g:603:1: entryRuleButtons : ruleButtons EOF ;
    public final void entryRuleButtons() throws RecognitionException {
        try {
            // InternalTDsl.g:604:1: ( ruleButtons EOF )
            // InternalTDsl.g:605:1: ruleButtons EOF
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
    // InternalTDsl.g:612:1: ruleButtons : ( ( rule__Buttons__Alternatives ) ) ;
    public final void ruleButtons() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:616:2: ( ( ( rule__Buttons__Alternatives ) ) )
            // InternalTDsl.g:617:2: ( ( rule__Buttons__Alternatives ) )
            {
            // InternalTDsl.g:617:2: ( ( rule__Buttons__Alternatives ) )
            // InternalTDsl.g:618:3: ( rule__Buttons__Alternatives )
            {
             before(grammarAccess.getButtonsAccess().getAlternatives()); 
            // InternalTDsl.g:619:3: ( rule__Buttons__Alternatives )
            // InternalTDsl.g:619:4: rule__Buttons__Alternatives
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
    // InternalTDsl.g:628:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalTDsl.g:629:1: ( ruleState EOF )
            // InternalTDsl.g:630:1: ruleState EOF
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
    // InternalTDsl.g:637:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:641:2: ( ( ( rule__State__Alternatives ) ) )
            // InternalTDsl.g:642:2: ( ( rule__State__Alternatives ) )
            {
            // InternalTDsl.g:642:2: ( ( rule__State__Alternatives ) )
            // InternalTDsl.g:643:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalTDsl.g:644:3: ( rule__State__Alternatives )
            // InternalTDsl.g:644:4: rule__State__Alternatives
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
    // InternalTDsl.g:653:1: entryRuleRightLeft : ruleRightLeft EOF ;
    public final void entryRuleRightLeft() throws RecognitionException {
        try {
            // InternalTDsl.g:654:1: ( ruleRightLeft EOF )
            // InternalTDsl.g:655:1: ruleRightLeft EOF
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
    // InternalTDsl.g:662:1: ruleRightLeft : ( ( rule__RightLeft__Alternatives ) ) ;
    public final void ruleRightLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:666:2: ( ( ( rule__RightLeft__Alternatives ) ) )
            // InternalTDsl.g:667:2: ( ( rule__RightLeft__Alternatives ) )
            {
            // InternalTDsl.g:667:2: ( ( rule__RightLeft__Alternatives ) )
            // InternalTDsl.g:668:3: ( rule__RightLeft__Alternatives )
            {
             before(grammarAccess.getRightLeftAccess().getAlternatives()); 
            // InternalTDsl.g:669:3: ( rule__RightLeft__Alternatives )
            // InternalTDsl.g:669:4: rule__RightLeft__Alternatives
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
    // InternalTDsl.g:678:1: entryRuleHorizontalSensors : ruleHorizontalSensors EOF ;
    public final void entryRuleHorizontalSensors() throws RecognitionException {
        try {
            // InternalTDsl.g:679:1: ( ruleHorizontalSensors EOF )
            // InternalTDsl.g:680:1: ruleHorizontalSensors EOF
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
    // InternalTDsl.g:687:1: ruleHorizontalSensors : ( ( rule__HorizontalSensors__Alternatives ) ) ;
    public final void ruleHorizontalSensors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:691:2: ( ( ( rule__HorizontalSensors__Alternatives ) ) )
            // InternalTDsl.g:692:2: ( ( rule__HorizontalSensors__Alternatives ) )
            {
            // InternalTDsl.g:692:2: ( ( rule__HorizontalSensors__Alternatives ) )
            // InternalTDsl.g:693:3: ( rule__HorizontalSensors__Alternatives )
            {
             before(grammarAccess.getHorizontalSensorsAccess().getAlternatives()); 
            // InternalTDsl.g:694:3: ( rule__HorizontalSensors__Alternatives )
            // InternalTDsl.g:694:4: rule__HorizontalSensors__Alternatives
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
    // InternalTDsl.g:702:1: rule__Statement__Alternatives_2 : ( ( ( rule__Statement__IfstatementAssignment_2_0 ) ) | ( ( rule__Statement__ActionAssignment_2_1 ) ) );
    public final void rule__Statement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:706:1: ( ( ( rule__Statement__IfstatementAssignment_2_0 ) ) | ( ( rule__Statement__ActionAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==57) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTDsl.g:707:2: ( ( rule__Statement__IfstatementAssignment_2_0 ) )
                    {
                    // InternalTDsl.g:707:2: ( ( rule__Statement__IfstatementAssignment_2_0 ) )
                    // InternalTDsl.g:708:3: ( rule__Statement__IfstatementAssignment_2_0 )
                    {
                     before(grammarAccess.getStatementAccess().getIfstatementAssignment_2_0()); 
                    // InternalTDsl.g:709:3: ( rule__Statement__IfstatementAssignment_2_0 )
                    // InternalTDsl.g:709:4: rule__Statement__IfstatementAssignment_2_0
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
                    // InternalTDsl.g:713:2: ( ( rule__Statement__ActionAssignment_2_1 ) )
                    {
                    // InternalTDsl.g:713:2: ( ( rule__Statement__ActionAssignment_2_1 ) )
                    // InternalTDsl.g:714:3: ( rule__Statement__ActionAssignment_2_1 )
                    {
                     before(grammarAccess.getStatementAccess().getActionAssignment_2_1()); 
                    // InternalTDsl.g:715:3: ( rule__Statement__ActionAssignment_2_1 )
                    // InternalTDsl.g:715:4: rule__Statement__ActionAssignment_2_1
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


    // $ANTLR start "rule__Event__Alternatives_1"
    // InternalTDsl.g:723:1: rule__Event__Alternatives_1 : ( ( ruleUpperEvent ) | ( ruleProxEvent ) | ( ruleTapEvent ) | ( ruleClapEvent ) );
    public final void rule__Event__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:727:1: ( ( ruleUpperEvent ) | ( ruleProxEvent ) | ( ruleTapEvent ) | ( ruleClapEvent ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
            case 33:
                {
                alt3=1;
                }
                break;
            case 34:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==13||LA3_2==60) ) {
                    alt3=1;
                }
                else if ( (LA3_2==73) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==73) ) {
                    alt3=2;
                }
                else if ( (LA3_3==13||LA3_3==60) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=34 && LA3_4<=35)) ) {
                    alt3=2;
                }
                else if ( (LA3_4==13||LA3_4==60) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                alt3=2;
                }
                break;
            case 63:
                {
                alt3=3;
                }
                break;
            case 64:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTDsl.g:728:2: ( ruleUpperEvent )
                    {
                    // InternalTDsl.g:728:2: ( ruleUpperEvent )
                    // InternalTDsl.g:729:3: ruleUpperEvent
                    {
                     before(grammarAccess.getEventAccess().getUpperEventParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUpperEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getUpperEventParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:734:2: ( ruleProxEvent )
                    {
                    // InternalTDsl.g:734:2: ( ruleProxEvent )
                    // InternalTDsl.g:735:3: ruleProxEvent
                    {
                     before(grammarAccess.getEventAccess().getProxEventParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProxEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getProxEventParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:740:2: ( ruleTapEvent )
                    {
                    // InternalTDsl.g:740:2: ( ruleTapEvent )
                    // InternalTDsl.g:741:3: ruleTapEvent
                    {
                     before(grammarAccess.getEventAccess().getTapEventParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTapEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getTapEventParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:746:2: ( ruleClapEvent )
                    {
                    // InternalTDsl.g:746:2: ( ruleClapEvent )
                    // InternalTDsl.g:747:3: ruleClapEvent
                    {
                     before(grammarAccess.getEventAccess().getClapEventParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_2);
                    ruleClapEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getClapEventParserRuleCall_1_3()); 

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
    // $ANTLR end "rule__Event__Alternatives_1"


    // $ANTLR start "rule__Action__Alternatives_1"
    // InternalTDsl.g:756:1: rule__Action__Alternatives_1 : ( ( ruleMovementAction ) | ( ruleSoundAction ) | ( ruleColorBottomAction ) | ( ruleColorTopAction ) );
    public final void rule__Action__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:760:1: ( ( ruleMovementAction ) | ( ruleSoundAction ) | ( ruleColorBottomAction ) | ( ruleColorTopAction ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt4=1;
                }
                break;
            case 45:
                {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2>=34 && LA4_2<=35)) ) {
                    alt4=1;
                }
                else if ( (LA4_2==54) ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==56) ) {
                        alt4=4;
                    }
                    else if ( (LA4_6==51) ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA4_3 = input.LA(2);

                if ( ((LA4_3>=70 && LA4_3<=71)) ) {
                    alt4=1;
                }
                else if ( (LA4_3==49) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                alt4=2;
                }
                break;
            case 50:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==56) ) {
                    alt4=4;
                }
                else if ( (LA4_5==51) ) {
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
                    // InternalTDsl.g:761:2: ( ruleMovementAction )
                    {
                    // InternalTDsl.g:761:2: ( ruleMovementAction )
                    // InternalTDsl.g:762:3: ruleMovementAction
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
                    // InternalTDsl.g:767:2: ( ruleSoundAction )
                    {
                    // InternalTDsl.g:767:2: ( ruleSoundAction )
                    // InternalTDsl.g:768:3: ruleSoundAction
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
                    // InternalTDsl.g:773:2: ( ruleColorBottomAction )
                    {
                    // InternalTDsl.g:773:2: ( ruleColorBottomAction )
                    // InternalTDsl.g:774:3: ruleColorBottomAction
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
                    // InternalTDsl.g:779:2: ( ruleColorTopAction )
                    {
                    // InternalTDsl.g:779:2: ( ruleColorTopAction )
                    // InternalTDsl.g:780:3: ruleColorTopAction
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
    // InternalTDsl.g:789:1: rule__MovementAction__Alternatives : ( ( ( rule__MovementAction__Group_0__0 ) ) | ( ( rule__MovementAction__Group_1__0 ) ) | ( ( rule__MovementAction__Group_2__0 ) ) | ( ( rule__MovementAction__Group_3__0 ) ) );
    public final void rule__MovementAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:793:1: ( ( ( rule__MovementAction__Group_0__0 ) ) | ( ( rule__MovementAction__Group_1__0 ) ) | ( ( rule__MovementAction__Group_2__0 ) ) | ( ( rule__MovementAction__Group_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt5=1;
                }
                break;
            case 45:
                {
                alt5=2;
                }
                break;
            case 46:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==71) ) {
                    alt5=4;
                }
                else if ( (LA5_3==70) ) {
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
                    // InternalTDsl.g:794:2: ( ( rule__MovementAction__Group_0__0 ) )
                    {
                    // InternalTDsl.g:794:2: ( ( rule__MovementAction__Group_0__0 ) )
                    // InternalTDsl.g:795:3: ( rule__MovementAction__Group_0__0 )
                    {
                     before(grammarAccess.getMovementActionAccess().getGroup_0()); 
                    // InternalTDsl.g:796:3: ( rule__MovementAction__Group_0__0 )
                    // InternalTDsl.g:796:4: rule__MovementAction__Group_0__0
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
                    // InternalTDsl.g:800:2: ( ( rule__MovementAction__Group_1__0 ) )
                    {
                    // InternalTDsl.g:800:2: ( ( rule__MovementAction__Group_1__0 ) )
                    // InternalTDsl.g:801:3: ( rule__MovementAction__Group_1__0 )
                    {
                     before(grammarAccess.getMovementActionAccess().getGroup_1()); 
                    // InternalTDsl.g:802:3: ( rule__MovementAction__Group_1__0 )
                    // InternalTDsl.g:802:4: rule__MovementAction__Group_1__0
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
                    // InternalTDsl.g:806:2: ( ( rule__MovementAction__Group_2__0 ) )
                    {
                    // InternalTDsl.g:806:2: ( ( rule__MovementAction__Group_2__0 ) )
                    // InternalTDsl.g:807:3: ( rule__MovementAction__Group_2__0 )
                    {
                     before(grammarAccess.getMovementActionAccess().getGroup_2()); 
                    // InternalTDsl.g:808:3: ( rule__MovementAction__Group_2__0 )
                    // InternalTDsl.g:808:4: rule__MovementAction__Group_2__0
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
                    // InternalTDsl.g:812:2: ( ( rule__MovementAction__Group_3__0 ) )
                    {
                    // InternalTDsl.g:812:2: ( ( rule__MovementAction__Group_3__0 ) )
                    // InternalTDsl.g:813:3: ( rule__MovementAction__Group_3__0 )
                    {
                     before(grammarAccess.getMovementActionAccess().getGroup_3()); 
                    // InternalTDsl.g:814:3: ( rule__MovementAction__Group_3__0 )
                    // InternalTDsl.g:814:4: rule__MovementAction__Group_3__0
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
    // InternalTDsl.g:822:1: rule__MovementAction__DirectionAlternatives_0_1_0 : ( ( 'forward' ) | ( 'backward' ) );
    public final void rule__MovementAction__DirectionAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:826:1: ( ( 'forward' ) | ( 'backward' ) )
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
                    // InternalTDsl.g:827:2: ( 'forward' )
                    {
                    // InternalTDsl.g:827:2: ( 'forward' )
                    // InternalTDsl.g:828:3: 'forward'
                    {
                     before(grammarAccess.getMovementActionAccess().getDirectionForwardKeyword_0_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMovementActionAccess().getDirectionForwardKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:833:2: ( 'backward' )
                    {
                    // InternalTDsl.g:833:2: ( 'backward' )
                    // InternalTDsl.g:834:3: 'backward'
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
    // InternalTDsl.g:843:1: rule__SoundAction__Alternatives : ( ( ( rule__SoundAction__Group_0__0 ) ) | ( ( rule__SoundAction__Group_1__0 ) ) );
    public final void rule__SoundAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:847:1: ( ( ( rule__SoundAction__Group_0__0 ) ) | ( ( rule__SoundAction__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==47) ) {
                alt7=1;
            }
            else if ( (LA7_0==46) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTDsl.g:848:2: ( ( rule__SoundAction__Group_0__0 ) )
                    {
                    // InternalTDsl.g:848:2: ( ( rule__SoundAction__Group_0__0 ) )
                    // InternalTDsl.g:849:3: ( rule__SoundAction__Group_0__0 )
                    {
                     before(grammarAccess.getSoundActionAccess().getGroup_0()); 
                    // InternalTDsl.g:850:3: ( rule__SoundAction__Group_0__0 )
                    // InternalTDsl.g:850:4: rule__SoundAction__Group_0__0
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
                    // InternalTDsl.g:854:2: ( ( rule__SoundAction__Group_1__0 ) )
                    {
                    // InternalTDsl.g:854:2: ( ( rule__SoundAction__Group_1__0 ) )
                    // InternalTDsl.g:855:3: ( rule__SoundAction__Group_1__0 )
                    {
                     before(grammarAccess.getSoundActionAccess().getGroup_1()); 
                    // InternalTDsl.g:856:3: ( rule__SoundAction__Group_1__0 )
                    // InternalTDsl.g:856:4: rule__SoundAction__Group_1__0
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
    // InternalTDsl.g:864:1: rule__ColorBottomAction__Alternatives : ( ( ( rule__ColorBottomAction__Group_0__0 ) ) | ( ( rule__ColorBottomAction__Group_1__0 ) ) );
    public final void rule__ColorBottomAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:868:1: ( ( ( rule__ColorBottomAction__Group_0__0 ) ) | ( ( rule__ColorBottomAction__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==50) ) {
                alt8=1;
            }
            else if ( (LA8_0==45) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTDsl.g:869:2: ( ( rule__ColorBottomAction__Group_0__0 ) )
                    {
                    // InternalTDsl.g:869:2: ( ( rule__ColorBottomAction__Group_0__0 ) )
                    // InternalTDsl.g:870:3: ( rule__ColorBottomAction__Group_0__0 )
                    {
                     before(grammarAccess.getColorBottomActionAccess().getGroup_0()); 
                    // InternalTDsl.g:871:3: ( rule__ColorBottomAction__Group_0__0 )
                    // InternalTDsl.g:871:4: rule__ColorBottomAction__Group_0__0
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
                    // InternalTDsl.g:875:2: ( ( rule__ColorBottomAction__Group_1__0 ) )
                    {
                    // InternalTDsl.g:875:2: ( ( rule__ColorBottomAction__Group_1__0 ) )
                    // InternalTDsl.g:876:3: ( rule__ColorBottomAction__Group_1__0 )
                    {
                     before(grammarAccess.getColorBottomActionAccess().getGroup_1()); 
                    // InternalTDsl.g:877:3: ( rule__ColorBottomAction__Group_1__0 )
                    // InternalTDsl.g:877:4: rule__ColorBottomAction__Group_1__0
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
    // InternalTDsl.g:885:1: rule__ColorTopAction__Alternatives : ( ( ( rule__ColorTopAction__Group_0__0 ) ) | ( ( rule__ColorTopAction__Group_1__0 ) ) );
    public final void rule__ColorTopAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:889:1: ( ( ( rule__ColorTopAction__Group_0__0 ) ) | ( ( rule__ColorTopAction__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==50) ) {
                alt9=1;
            }
            else if ( (LA9_0==45) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTDsl.g:890:2: ( ( rule__ColorTopAction__Group_0__0 ) )
                    {
                    // InternalTDsl.g:890:2: ( ( rule__ColorTopAction__Group_0__0 ) )
                    // InternalTDsl.g:891:3: ( rule__ColorTopAction__Group_0__0 )
                    {
                     before(grammarAccess.getColorTopActionAccess().getGroup_0()); 
                    // InternalTDsl.g:892:3: ( rule__ColorTopAction__Group_0__0 )
                    // InternalTDsl.g:892:4: rule__ColorTopAction__Group_0__0
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
                    // InternalTDsl.g:896:2: ( ( rule__ColorTopAction__Group_1__0 ) )
                    {
                    // InternalTDsl.g:896:2: ( ( rule__ColorTopAction__Group_1__0 ) )
                    // InternalTDsl.g:897:3: ( rule__ColorTopAction__Group_1__0 )
                    {
                     before(grammarAccess.getColorTopActionAccess().getGroup_1()); 
                    // InternalTDsl.g:898:3: ( rule__ColorTopAction__Group_1__0 )
                    // InternalTDsl.g:898:4: rule__ColorTopAction__Group_1__0
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
    // InternalTDsl.g:906:1: rule__Sensor__Alternatives : ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:910:1: ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12||LA10_0==66) ) {
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
                    // InternalTDsl.g:911:2: ( ( rule__Sensor__Group_0__0 ) )
                    {
                    // InternalTDsl.g:911:2: ( ( rule__Sensor__Group_0__0 ) )
                    // InternalTDsl.g:912:3: ( rule__Sensor__Group_0__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_0()); 
                    // InternalTDsl.g:913:3: ( rule__Sensor__Group_0__0 )
                    // InternalTDsl.g:913:4: rule__Sensor__Group_0__0
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
                    // InternalTDsl.g:917:2: ( ( rule__Sensor__Group_1__0 ) )
                    {
                    // InternalTDsl.g:917:2: ( ( rule__Sensor__Group_1__0 ) )
                    // InternalTDsl.g:918:3: ( rule__Sensor__Group_1__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_1()); 
                    // InternalTDsl.g:919:3: ( rule__Sensor__Group_1__0 )
                    // InternalTDsl.g:919:4: rule__Sensor__Group_1__0
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


    // $ANTLR start "rule__Condition__OperatorAlternatives_1_0_0"
    // InternalTDsl.g:927:1: rule__Condition__OperatorAlternatives_1_0_0 : ( ( 'and' ) | ( 'or' ) );
    public final void rule__Condition__OperatorAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:931:1: ( ( 'and' ) | ( 'or' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTDsl.g:932:2: ( 'and' )
                    {
                    // InternalTDsl.g:932:2: ( 'and' )
                    // InternalTDsl.g:933:3: 'and'
                    {
                     before(grammarAccess.getConditionAccess().getOperatorAndKeyword_1_0_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getOperatorAndKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:938:2: ( 'or' )
                    {
                    // InternalTDsl.g:938:2: ( 'or' )
                    // InternalTDsl.g:939:3: 'or'
                    {
                     before(grammarAccess.getConditionAccess().getOperatorOrKeyword_1_0_0_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalTDsl.g:948:1: rule__ArithmeticExpression__OperatorAlternatives_1_0_0 : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( 'mod' ) );
    public final void rule__ArithmeticExpression__OperatorAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:952:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( 'mod' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt12=1;
                }
                break;
            case 16:
                {
                alt12=2;
                }
                break;
            case 17:
                {
                alt12=3;
                }
                break;
            case 18:
                {
                alt12=4;
                }
                break;
            case 19:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTDsl.g:953:2: ( '+' )
                    {
                    // InternalTDsl.g:953:2: ( '+' )
                    // InternalTDsl.g:954:3: '+'
                    {
                     before(grammarAccess.getArithmeticExpressionAccess().getOperatorPlusSignKeyword_1_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getArithmeticExpressionAccess().getOperatorPlusSignKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:959:2: ( '-' )
                    {
                    // InternalTDsl.g:959:2: ( '-' )
                    // InternalTDsl.g:960:3: '-'
                    {
                     before(grammarAccess.getArithmeticExpressionAccess().getOperatorHyphenMinusKeyword_1_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getArithmeticExpressionAccess().getOperatorHyphenMinusKeyword_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:965:2: ( '*' )
                    {
                    // InternalTDsl.g:965:2: ( '*' )
                    // InternalTDsl.g:966:3: '*'
                    {
                     before(grammarAccess.getArithmeticExpressionAccess().getOperatorAsteriskKeyword_1_0_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getArithmeticExpressionAccess().getOperatorAsteriskKeyword_1_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:971:2: ( '/' )
                    {
                    // InternalTDsl.g:971:2: ( '/' )
                    // InternalTDsl.g:972:3: '/'
                    {
                     before(grammarAccess.getArithmeticExpressionAccess().getOperatorSolidusKeyword_1_0_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getArithmeticExpressionAccess().getOperatorSolidusKeyword_1_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTDsl.g:977:2: ( 'mod' )
                    {
                    // InternalTDsl.g:977:2: ( 'mod' )
                    // InternalTDsl.g:978:3: 'mod'
                    {
                     before(grammarAccess.getArithmeticExpressionAccess().getOperatorModKeyword_1_0_0_4()); 
                    match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__Color__Alternatives"
    // InternalTDsl.g:987:1: rule__Color__Alternatives : ( ( 'red' ) | ( 'green' ) | ( 'blue' ) | ( 'black' ) | ( 'white' ) | ( 'yellow' ) | ( 'pink' ) | ( 'orange' ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:991:1: ( ( 'red' ) | ( 'green' ) | ( 'blue' ) | ( 'black' ) | ( 'white' ) | ( 'yellow' ) | ( 'pink' ) | ( 'orange' ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            case 23:
                {
                alt13=4;
                }
                break;
            case 24:
                {
                alt13=5;
                }
                break;
            case 25:
                {
                alt13=6;
                }
                break;
            case 26:
                {
                alt13=7;
                }
                break;
            case 27:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalTDsl.g:992:2: ( 'red' )
                    {
                    // InternalTDsl.g:992:2: ( 'red' )
                    // InternalTDsl.g:993:3: 'red'
                    {
                     before(grammarAccess.getColorAccess().getRedKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getRedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:998:2: ( 'green' )
                    {
                    // InternalTDsl.g:998:2: ( 'green' )
                    // InternalTDsl.g:999:3: 'green'
                    {
                     before(grammarAccess.getColorAccess().getGreenKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getGreenKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1004:2: ( 'blue' )
                    {
                    // InternalTDsl.g:1004:2: ( 'blue' )
                    // InternalTDsl.g:1005:3: 'blue'
                    {
                     before(grammarAccess.getColorAccess().getBlueKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getBlueKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1010:2: ( 'black' )
                    {
                    // InternalTDsl.g:1010:2: ( 'black' )
                    // InternalTDsl.g:1011:3: 'black'
                    {
                     before(grammarAccess.getColorAccess().getBlackKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getBlackKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1016:2: ( 'white' )
                    {
                    // InternalTDsl.g:1016:2: ( 'white' )
                    // InternalTDsl.g:1017:3: 'white'
                    {
                     before(grammarAccess.getColorAccess().getWhiteKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getWhiteKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTDsl.g:1022:2: ( 'yellow' )
                    {
                    // InternalTDsl.g:1022:2: ( 'yellow' )
                    // InternalTDsl.g:1023:3: 'yellow'
                    {
                     before(grammarAccess.getColorAccess().getYellowKeyword_5()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getYellowKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTDsl.g:1028:2: ( 'pink' )
                    {
                    // InternalTDsl.g:1028:2: ( 'pink' )
                    // InternalTDsl.g:1029:3: 'pink'
                    {
                     before(grammarAccess.getColorAccess().getPinkKeyword_6()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getPinkKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTDsl.g:1034:2: ( 'orange' )
                    {
                    // InternalTDsl.g:1034:2: ( 'orange' )
                    // InternalTDsl.g:1035:3: 'orange'
                    {
                     before(grammarAccess.getColorAccess().getOrangeKeyword_7()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getOrangeKeyword_7()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__Sound__Alternatives"
    // InternalTDsl.g:1044:1: rule__Sound__Alternatives : ( ( 'sound1' ) | ( 'sound2' ) | ( 'sound3' ) | ( 'sound4' ) );
    public final void rule__Sound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1048:1: ( ( 'sound1' ) | ( 'sound2' ) | ( 'sound3' ) | ( 'sound4' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 29:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            case 31:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTDsl.g:1049:2: ( 'sound1' )
                    {
                    // InternalTDsl.g:1049:2: ( 'sound1' )
                    // InternalTDsl.g:1050:3: 'sound1'
                    {
                     before(grammarAccess.getSoundAccess().getSound1Keyword_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSoundAccess().getSound1Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1055:2: ( 'sound2' )
                    {
                    // InternalTDsl.g:1055:2: ( 'sound2' )
                    // InternalTDsl.g:1056:3: 'sound2'
                    {
                     before(grammarAccess.getSoundAccess().getSound2Keyword_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSoundAccess().getSound2Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1061:2: ( 'sound3' )
                    {
                    // InternalTDsl.g:1061:2: ( 'sound3' )
                    // InternalTDsl.g:1062:3: 'sound3'
                    {
                     before(grammarAccess.getSoundAccess().getSound3Keyword_2()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSoundAccess().getSound3Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1067:2: ( 'sound4' )
                    {
                    // InternalTDsl.g:1067:2: ( 'sound4' )
                    // InternalTDsl.g:1068:3: 'sound4'
                    {
                     before(grammarAccess.getSoundAccess().getSound4Keyword_3()); 
                    match(input,31,FOLLOW_2); 
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


    // $ANTLR start "rule__State_Horizontal_Sensor__Alternatives"
    // InternalTDsl.g:1077:1: rule__State_Horizontal_Sensor__Alternatives : ( ( 'proximity' ) | ( ( rule__State_Horizontal_Sensor__Group_1__0 ) ) );
    public final void rule__State_Horizontal_Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1081:1: ( ( 'proximity' ) | ( ( rule__State_Horizontal_Sensor__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            else if ( (LA15_0==65) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalTDsl.g:1082:2: ( 'proximity' )
                    {
                    // InternalTDsl.g:1082:2: ( 'proximity' )
                    // InternalTDsl.g:1083:3: 'proximity'
                    {
                     before(grammarAccess.getState_Horizontal_SensorAccess().getProximityKeyword_0()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getState_Horizontal_SensorAccess().getProximityKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1088:2: ( ( rule__State_Horizontal_Sensor__Group_1__0 ) )
                    {
                    // InternalTDsl.g:1088:2: ( ( rule__State_Horizontal_Sensor__Group_1__0 ) )
                    // InternalTDsl.g:1089:3: ( rule__State_Horizontal_Sensor__Group_1__0 )
                    {
                     before(grammarAccess.getState_Horizontal_SensorAccess().getGroup_1()); 
                    // InternalTDsl.g:1090:3: ( rule__State_Horizontal_Sensor__Group_1__0 )
                    // InternalTDsl.g:1090:4: rule__State_Horizontal_Sensor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State_Horizontal_Sensor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getState_Horizontal_SensorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__State_Horizontal_Sensor__Alternatives"


    // $ANTLR start "rule__State_Ground_Sensor__Alternatives"
    // InternalTDsl.g:1098:1: rule__State_Ground_Sensor__Alternatives : ( ( 'proximity' ) | ( ( rule__State_Ground_Sensor__Group_1__0 ) ) | ( 'black' ) | ( 'white' ) );
    public final void rule__State_Ground_Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1102:1: ( ( 'proximity' ) | ( ( rule__State_Ground_Sensor__Group_1__0 ) ) | ( 'black' ) | ( 'white' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 65:
                {
                alt16=2;
                }
                break;
            case 23:
                {
                alt16=3;
                }
                break;
            case 24:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalTDsl.g:1103:2: ( 'proximity' )
                    {
                    // InternalTDsl.g:1103:2: ( 'proximity' )
                    // InternalTDsl.g:1104:3: 'proximity'
                    {
                     before(grammarAccess.getState_Ground_SensorAccess().getProximityKeyword_0()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getState_Ground_SensorAccess().getProximityKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1109:2: ( ( rule__State_Ground_Sensor__Group_1__0 ) )
                    {
                    // InternalTDsl.g:1109:2: ( ( rule__State_Ground_Sensor__Group_1__0 ) )
                    // InternalTDsl.g:1110:3: ( rule__State_Ground_Sensor__Group_1__0 )
                    {
                     before(grammarAccess.getState_Ground_SensorAccess().getGroup_1()); 
                    // InternalTDsl.g:1111:3: ( rule__State_Ground_Sensor__Group_1__0 )
                    // InternalTDsl.g:1111:4: rule__State_Ground_Sensor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State_Ground_Sensor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getState_Ground_SensorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1115:2: ( 'black' )
                    {
                    // InternalTDsl.g:1115:2: ( 'black' )
                    // InternalTDsl.g:1116:3: 'black'
                    {
                     before(grammarAccess.getState_Ground_SensorAccess().getBlackKeyword_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getState_Ground_SensorAccess().getBlackKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1121:2: ( 'white' )
                    {
                    // InternalTDsl.g:1121:2: ( 'white' )
                    // InternalTDsl.g:1122:3: 'white'
                    {
                     before(grammarAccess.getState_Ground_SensorAccess().getWhiteKeyword_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getState_Ground_SensorAccess().getWhiteKeyword_3()); 

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
    // $ANTLR end "rule__State_Ground_Sensor__Alternatives"


    // $ANTLR start "rule__Buttons__Alternatives"
    // InternalTDsl.g:1131:1: rule__Buttons__Alternatives : ( ( 'center' ) | ( 'right' ) | ( 'left' ) | ( 'forward' ) | ( 'backward' ) );
    public final void rule__Buttons__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1135:1: ( ( 'center' ) | ( 'right' ) | ( 'left' ) | ( 'forward' ) | ( 'backward' ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                alt17=2;
                }
                break;
            case 35:
                {
                alt17=3;
                }
                break;
            case 11:
                {
                alt17=4;
                }
                break;
            case 12:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalTDsl.g:1136:2: ( 'center' )
                    {
                    // InternalTDsl.g:1136:2: ( 'center' )
                    // InternalTDsl.g:1137:3: 'center'
                    {
                     before(grammarAccess.getButtonsAccess().getCenterKeyword_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getButtonsAccess().getCenterKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1142:2: ( 'right' )
                    {
                    // InternalTDsl.g:1142:2: ( 'right' )
                    // InternalTDsl.g:1143:3: 'right'
                    {
                     before(grammarAccess.getButtonsAccess().getRightKeyword_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getButtonsAccess().getRightKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1148:2: ( 'left' )
                    {
                    // InternalTDsl.g:1148:2: ( 'left' )
                    // InternalTDsl.g:1149:3: 'left'
                    {
                     before(grammarAccess.getButtonsAccess().getLeftKeyword_2()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getButtonsAccess().getLeftKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1154:2: ( 'forward' )
                    {
                    // InternalTDsl.g:1154:2: ( 'forward' )
                    // InternalTDsl.g:1155:3: 'forward'
                    {
                     before(grammarAccess.getButtonsAccess().getForwardKeyword_3()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getButtonsAccess().getForwardKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1160:2: ( 'backward' )
                    {
                    // InternalTDsl.g:1160:2: ( 'backward' )
                    // InternalTDsl.g:1161:3: 'backward'
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
    // InternalTDsl.g:1170:1: rule__State__Alternatives : ( ( 'touched' ) | ( 'released' ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1174:1: ( ( 'touched' ) | ( 'released' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            else if ( (LA18_0==37) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalTDsl.g:1175:2: ( 'touched' )
                    {
                    // InternalTDsl.g:1175:2: ( 'touched' )
                    // InternalTDsl.g:1176:3: 'touched'
                    {
                     before(grammarAccess.getStateAccess().getTouchedKeyword_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getTouchedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1181:2: ( 'released' )
                    {
                    // InternalTDsl.g:1181:2: ( 'released' )
                    // InternalTDsl.g:1182:3: 'released'
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
    // InternalTDsl.g:1191:1: rule__RightLeft__Alternatives : ( ( 'left' ) | ( 'right' ) );
    public final void rule__RightLeft__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1195:1: ( ( 'left' ) | ( 'right' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalTDsl.g:1196:2: ( 'left' )
                    {
                    // InternalTDsl.g:1196:2: ( 'left' )
                    // InternalTDsl.g:1197:3: 'left'
                    {
                     before(grammarAccess.getRightLeftAccess().getLeftKeyword_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getRightLeftAccess().getLeftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1202:2: ( 'right' )
                    {
                    // InternalTDsl.g:1202:2: ( 'right' )
                    // InternalTDsl.g:1203:3: 'right'
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
    // InternalTDsl.g:1212:1: rule__HorizontalSensors__Alternatives : ( ( ( rule__HorizontalSensors__Group_0__0 ) ) | ( ( rule__HorizontalSensors__Group_1__0 ) ) | ( ( rule__HorizontalSensors__Group_2__0 ) ) | ( ( rule__HorizontalSensors__Group_3__0 ) ) | ( ( rule__HorizontalSensors__Group_4__0 ) ) | ( ( rule__HorizontalSensors__Group_5__0 ) ) | ( ( rule__HorizontalSensors__Group_6__0 ) ) );
    public final void rule__HorizontalSensors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1216:1: ( ( ( rule__HorizontalSensors__Group_0__0 ) ) | ( ( rule__HorizontalSensors__Group_1__0 ) ) | ( ( rule__HorizontalSensors__Group_2__0 ) ) | ( ( rule__HorizontalSensors__Group_3__0 ) ) | ( ( rule__HorizontalSensors__Group_4__0 ) ) | ( ( rule__HorizontalSensors__Group_5__0 ) ) | ( ( rule__HorizontalSensors__Group_6__0 ) ) )
            int alt20=7;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalTDsl.g:1217:2: ( ( rule__HorizontalSensors__Group_0__0 ) )
                    {
                    // InternalTDsl.g:1217:2: ( ( rule__HorizontalSensors__Group_0__0 ) )
                    // InternalTDsl.g:1218:3: ( rule__HorizontalSensors__Group_0__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_0()); 
                    // InternalTDsl.g:1219:3: ( rule__HorizontalSensors__Group_0__0 )
                    // InternalTDsl.g:1219:4: rule__HorizontalSensors__Group_0__0
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
                    // InternalTDsl.g:1223:2: ( ( rule__HorizontalSensors__Group_1__0 ) )
                    {
                    // InternalTDsl.g:1223:2: ( ( rule__HorizontalSensors__Group_1__0 ) )
                    // InternalTDsl.g:1224:3: ( rule__HorizontalSensors__Group_1__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_1()); 
                    // InternalTDsl.g:1225:3: ( rule__HorizontalSensors__Group_1__0 )
                    // InternalTDsl.g:1225:4: rule__HorizontalSensors__Group_1__0
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
                    // InternalTDsl.g:1229:2: ( ( rule__HorizontalSensors__Group_2__0 ) )
                    {
                    // InternalTDsl.g:1229:2: ( ( rule__HorizontalSensors__Group_2__0 ) )
                    // InternalTDsl.g:1230:3: ( rule__HorizontalSensors__Group_2__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_2()); 
                    // InternalTDsl.g:1231:3: ( rule__HorizontalSensors__Group_2__0 )
                    // InternalTDsl.g:1231:4: rule__HorizontalSensors__Group_2__0
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
                    // InternalTDsl.g:1235:2: ( ( rule__HorizontalSensors__Group_3__0 ) )
                    {
                    // InternalTDsl.g:1235:2: ( ( rule__HorizontalSensors__Group_3__0 ) )
                    // InternalTDsl.g:1236:3: ( rule__HorizontalSensors__Group_3__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_3()); 
                    // InternalTDsl.g:1237:3: ( rule__HorizontalSensors__Group_3__0 )
                    // InternalTDsl.g:1237:4: rule__HorizontalSensors__Group_3__0
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
                    // InternalTDsl.g:1241:2: ( ( rule__HorizontalSensors__Group_4__0 ) )
                    {
                    // InternalTDsl.g:1241:2: ( ( rule__HorizontalSensors__Group_4__0 ) )
                    // InternalTDsl.g:1242:3: ( rule__HorizontalSensors__Group_4__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_4()); 
                    // InternalTDsl.g:1243:3: ( rule__HorizontalSensors__Group_4__0 )
                    // InternalTDsl.g:1243:4: rule__HorizontalSensors__Group_4__0
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
                    // InternalTDsl.g:1247:2: ( ( rule__HorizontalSensors__Group_5__0 ) )
                    {
                    // InternalTDsl.g:1247:2: ( ( rule__HorizontalSensors__Group_5__0 ) )
                    // InternalTDsl.g:1248:3: ( rule__HorizontalSensors__Group_5__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_5()); 
                    // InternalTDsl.g:1249:3: ( rule__HorizontalSensors__Group_5__0 )
                    // InternalTDsl.g:1249:4: rule__HorizontalSensors__Group_5__0
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
                    // InternalTDsl.g:1253:2: ( ( rule__HorizontalSensors__Group_6__0 ) )
                    {
                    // InternalTDsl.g:1253:2: ( ( rule__HorizontalSensors__Group_6__0 ) )
                    // InternalTDsl.g:1254:3: ( rule__HorizontalSensors__Group_6__0 )
                    {
                     before(grammarAccess.getHorizontalSensorsAccess().getGroup_6()); 
                    // InternalTDsl.g:1255:3: ( rule__HorizontalSensors__Group_6__0 )
                    // InternalTDsl.g:1255:4: rule__HorizontalSensors__Group_6__0
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
    // InternalTDsl.g:1263:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1267:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalTDsl.g:1268:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalTDsl.g:1275:1: rule__Statement__Group__0__Impl : ( '->' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1279:1: ( ( '->' ) )
            // InternalTDsl.g:1280:1: ( '->' )
            {
            // InternalTDsl.g:1280:1: ( '->' )
            // InternalTDsl.g:1281:2: '->'
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
    // InternalTDsl.g:1290:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1294:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // InternalTDsl.g:1295:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
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
    // InternalTDsl.g:1302:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__EventAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1306:1: ( ( ( rule__Statement__EventAssignment_1 ) ) )
            // InternalTDsl.g:1307:1: ( ( rule__Statement__EventAssignment_1 ) )
            {
            // InternalTDsl.g:1307:1: ( ( rule__Statement__EventAssignment_1 ) )
            // InternalTDsl.g:1308:2: ( rule__Statement__EventAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getEventAssignment_1()); 
            // InternalTDsl.g:1309:2: ( rule__Statement__EventAssignment_1 )
            // InternalTDsl.g:1309:3: rule__Statement__EventAssignment_1
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
    // InternalTDsl.g:1317:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1321:1: ( rule__Statement__Group__2__Impl )
            // InternalTDsl.g:1322:2: rule__Statement__Group__2__Impl
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
    // InternalTDsl.g:1328:1: rule__Statement__Group__2__Impl : ( ( ( rule__Statement__Alternatives_2 ) ) ( ( rule__Statement__Alternatives_2 )* ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1332:1: ( ( ( ( rule__Statement__Alternatives_2 ) ) ( ( rule__Statement__Alternatives_2 )* ) ) )
            // InternalTDsl.g:1333:1: ( ( ( rule__Statement__Alternatives_2 ) ) ( ( rule__Statement__Alternatives_2 )* ) )
            {
            // InternalTDsl.g:1333:1: ( ( ( rule__Statement__Alternatives_2 ) ) ( ( rule__Statement__Alternatives_2 )* ) )
            // InternalTDsl.g:1334:2: ( ( rule__Statement__Alternatives_2 ) ) ( ( rule__Statement__Alternatives_2 )* )
            {
            // InternalTDsl.g:1334:2: ( ( rule__Statement__Alternatives_2 ) )
            // InternalTDsl.g:1335:3: ( rule__Statement__Alternatives_2 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_2()); 
            // InternalTDsl.g:1336:3: ( rule__Statement__Alternatives_2 )
            // InternalTDsl.g:1336:4: rule__Statement__Alternatives_2
            {
            pushFollow(FOLLOW_6);
            rule__Statement__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_2()); 

            }

            // InternalTDsl.g:1339:2: ( ( rule__Statement__Alternatives_2 )* )
            // InternalTDsl.g:1340:3: ( rule__Statement__Alternatives_2 )*
            {
             before(grammarAccess.getStatementAccess().getAlternatives_2()); 
            // InternalTDsl.g:1341:3: ( rule__Statement__Alternatives_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16||LA21_0==57) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTDsl.g:1341:4: rule__Statement__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Statement__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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


    // $ANTLR start "rule__Event__Group__0"
    // InternalTDsl.g:1351:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1355:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalTDsl.g:1356:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

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
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalTDsl.g:1363:1: rule__Event__Group__0__Impl : ( 'On' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1367:1: ( ( 'On' ) )
            // InternalTDsl.g:1368:1: ( 'On' )
            {
            // InternalTDsl.g:1368:1: ( 'On' )
            // InternalTDsl.g:1369:2: 'On'
            {
             before(grammarAccess.getEventAccess().getOnKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getOnKeyword_0()); 

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
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalTDsl.g:1378:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1382:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalTDsl.g:1383:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

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
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalTDsl.g:1390:1: rule__Event__Group__1__Impl : ( ( rule__Event__Alternatives_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1394:1: ( ( ( rule__Event__Alternatives_1 ) ) )
            // InternalTDsl.g:1395:1: ( ( rule__Event__Alternatives_1 ) )
            {
            // InternalTDsl.g:1395:1: ( ( rule__Event__Alternatives_1 ) )
            // InternalTDsl.g:1396:2: ( rule__Event__Alternatives_1 )
            {
             before(grammarAccess.getEventAccess().getAlternatives_1()); 
            // InternalTDsl.g:1397:2: ( rule__Event__Alternatives_1 )
            // InternalTDsl.g:1397:3: rule__Event__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalTDsl.g:1405:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1409:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalTDsl.g:1410:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

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
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalTDsl.g:1417:1: rule__Event__Group__2__Impl : ( 'do' ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1421:1: ( ( 'do' ) )
            // InternalTDsl.g:1422:1: ( 'do' )
            {
            // InternalTDsl.g:1422:1: ( 'do' )
            // InternalTDsl.g:1423:2: 'do'
            {
             before(grammarAccess.getEventAccess().getDoKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getDoKeyword_2()); 

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
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalTDsl.g:1432:1: rule__Event__Group__3 : rule__Event__Group__3__Impl ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1436:1: ( rule__Event__Group__3__Impl )
            // InternalTDsl.g:1437:2: rule__Event__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__3__Impl();

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
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalTDsl.g:1443:1: rule__Event__Group__3__Impl : ( ':' ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1447:1: ( ( ':' ) )
            // InternalTDsl.g:1448:1: ( ':' )
            {
            // InternalTDsl.g:1448:1: ( ':' )
            // InternalTDsl.g:1449:2: ':'
            {
             before(grammarAccess.getEventAccess().getColonKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalTDsl.g:1459:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1463:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalTDsl.g:1464:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalTDsl.g:1471:1: rule__Action__Group__0__Impl : ( '-' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1475:1: ( ( '-' ) )
            // InternalTDsl.g:1476:1: ( '-' )
            {
            // InternalTDsl.g:1476:1: ( '-' )
            // InternalTDsl.g:1477:2: '-'
            {
             before(grammarAccess.getActionAccess().getHyphenMinusKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTDsl.g:1486:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1490:1: ( rule__Action__Group__1__Impl )
            // InternalTDsl.g:1491:2: rule__Action__Group__1__Impl
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
    // InternalTDsl.g:1497:1: rule__Action__Group__1__Impl : ( ( rule__Action__Alternatives_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1501:1: ( ( ( rule__Action__Alternatives_1 ) ) )
            // InternalTDsl.g:1502:1: ( ( rule__Action__Alternatives_1 ) )
            {
            // InternalTDsl.g:1502:1: ( ( rule__Action__Alternatives_1 ) )
            // InternalTDsl.g:1503:2: ( rule__Action__Alternatives_1 )
            {
             before(grammarAccess.getActionAccess().getAlternatives_1()); 
            // InternalTDsl.g:1504:2: ( rule__Action__Alternatives_1 )
            // InternalTDsl.g:1504:3: rule__Action__Alternatives_1
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
    // InternalTDsl.g:1513:1: rule__MovementAction__Group_0__0 : rule__MovementAction__Group_0__0__Impl rule__MovementAction__Group_0__1 ;
    public final void rule__MovementAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1517:1: ( rule__MovementAction__Group_0__0__Impl rule__MovementAction__Group_0__1 )
            // InternalTDsl.g:1518:2: rule__MovementAction__Group_0__0__Impl rule__MovementAction__Group_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalTDsl.g:1525:1: rule__MovementAction__Group_0__0__Impl : ( 'drive' ) ;
    public final void rule__MovementAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1529:1: ( ( 'drive' ) )
            // InternalTDsl.g:1530:1: ( 'drive' )
            {
            // InternalTDsl.g:1530:1: ( 'drive' )
            // InternalTDsl.g:1531:2: 'drive'
            {
             before(grammarAccess.getMovementActionAccess().getDriveKeyword_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalTDsl.g:1540:1: rule__MovementAction__Group_0__1 : rule__MovementAction__Group_0__1__Impl rule__MovementAction__Group_0__2 ;
    public final void rule__MovementAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1544:1: ( rule__MovementAction__Group_0__1__Impl rule__MovementAction__Group_0__2 )
            // InternalTDsl.g:1545:2: rule__MovementAction__Group_0__1__Impl rule__MovementAction__Group_0__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTDsl.g:1552:1: rule__MovementAction__Group_0__1__Impl : ( ( rule__MovementAction__DirectionAssignment_0_1 ) ) ;
    public final void rule__MovementAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1556:1: ( ( ( rule__MovementAction__DirectionAssignment_0_1 ) ) )
            // InternalTDsl.g:1557:1: ( ( rule__MovementAction__DirectionAssignment_0_1 ) )
            {
            // InternalTDsl.g:1557:1: ( ( rule__MovementAction__DirectionAssignment_0_1 ) )
            // InternalTDsl.g:1558:2: ( rule__MovementAction__DirectionAssignment_0_1 )
            {
             before(grammarAccess.getMovementActionAccess().getDirectionAssignment_0_1()); 
            // InternalTDsl.g:1559:2: ( rule__MovementAction__DirectionAssignment_0_1 )
            // InternalTDsl.g:1559:3: rule__MovementAction__DirectionAssignment_0_1
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
    // InternalTDsl.g:1567:1: rule__MovementAction__Group_0__2 : rule__MovementAction__Group_0__2__Impl ;
    public final void rule__MovementAction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1571:1: ( rule__MovementAction__Group_0__2__Impl )
            // InternalTDsl.g:1572:2: rule__MovementAction__Group_0__2__Impl
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
    // InternalTDsl.g:1578:1: rule__MovementAction__Group_0__2__Impl : ( ( rule__MovementAction__Group_0_2__0 )? ) ;
    public final void rule__MovementAction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1582:1: ( ( ( rule__MovementAction__Group_0_2__0 )? ) )
            // InternalTDsl.g:1583:1: ( ( rule__MovementAction__Group_0_2__0 )? )
            {
            // InternalTDsl.g:1583:1: ( ( rule__MovementAction__Group_0_2__0 )? )
            // InternalTDsl.g:1584:2: ( rule__MovementAction__Group_0_2__0 )?
            {
             before(grammarAccess.getMovementActionAccess().getGroup_0_2()); 
            // InternalTDsl.g:1585:2: ( rule__MovementAction__Group_0_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTDsl.g:1585:3: rule__MovementAction__Group_0_2__0
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
    // InternalTDsl.g:1594:1: rule__MovementAction__Group_0_2__0 : rule__MovementAction__Group_0_2__0__Impl rule__MovementAction__Group_0_2__1 ;
    public final void rule__MovementAction__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1598:1: ( rule__MovementAction__Group_0_2__0__Impl rule__MovementAction__Group_0_2__1 )
            // InternalTDsl.g:1599:2: rule__MovementAction__Group_0_2__0__Impl rule__MovementAction__Group_0_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalTDsl.g:1606:1: rule__MovementAction__Group_0_2__0__Impl : ( 'with' ) ;
    public final void rule__MovementAction__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1610:1: ( ( 'with' ) )
            // InternalTDsl.g:1611:1: ( 'with' )
            {
            // InternalTDsl.g:1611:1: ( 'with' )
            // InternalTDsl.g:1612:2: 'with'
            {
             before(grammarAccess.getMovementActionAccess().getWithKeyword_0_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalTDsl.g:1621:1: rule__MovementAction__Group_0_2__1 : rule__MovementAction__Group_0_2__1__Impl rule__MovementAction__Group_0_2__2 ;
    public final void rule__MovementAction__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1625:1: ( rule__MovementAction__Group_0_2__1__Impl rule__MovementAction__Group_0_2__2 )
            // InternalTDsl.g:1626:2: rule__MovementAction__Group_0_2__1__Impl rule__MovementAction__Group_0_2__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalTDsl.g:1633:1: rule__MovementAction__Group_0_2__1__Impl : ( 'speed' ) ;
    public final void rule__MovementAction__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1637:1: ( ( 'speed' ) )
            // InternalTDsl.g:1638:1: ( 'speed' )
            {
            // InternalTDsl.g:1638:1: ( 'speed' )
            // InternalTDsl.g:1639:2: 'speed'
            {
             before(grammarAccess.getMovementActionAccess().getSpeedKeyword_0_2_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalTDsl.g:1648:1: rule__MovementAction__Group_0_2__2 : rule__MovementAction__Group_0_2__2__Impl ;
    public final void rule__MovementAction__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1652:1: ( rule__MovementAction__Group_0_2__2__Impl )
            // InternalTDsl.g:1653:2: rule__MovementAction__Group_0_2__2__Impl
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
    // InternalTDsl.g:1659:1: rule__MovementAction__Group_0_2__2__Impl : ( ( rule__MovementAction__SpeedAssignment_0_2_2 ) ) ;
    public final void rule__MovementAction__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1663:1: ( ( ( rule__MovementAction__SpeedAssignment_0_2_2 ) ) )
            // InternalTDsl.g:1664:1: ( ( rule__MovementAction__SpeedAssignment_0_2_2 ) )
            {
            // InternalTDsl.g:1664:1: ( ( rule__MovementAction__SpeedAssignment_0_2_2 ) )
            // InternalTDsl.g:1665:2: ( rule__MovementAction__SpeedAssignment_0_2_2 )
            {
             before(grammarAccess.getMovementActionAccess().getSpeedAssignment_0_2_2()); 
            // InternalTDsl.g:1666:2: ( rule__MovementAction__SpeedAssignment_0_2_2 )
            // InternalTDsl.g:1666:3: rule__MovementAction__SpeedAssignment_0_2_2
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
    // InternalTDsl.g:1675:1: rule__MovementAction__Group_1__0 : rule__MovementAction__Group_1__0__Impl rule__MovementAction__Group_1__1 ;
    public final void rule__MovementAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1679:1: ( rule__MovementAction__Group_1__0__Impl rule__MovementAction__Group_1__1 )
            // InternalTDsl.g:1680:2: rule__MovementAction__Group_1__0__Impl rule__MovementAction__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalTDsl.g:1687:1: rule__MovementAction__Group_1__0__Impl : ( 'turn' ) ;
    public final void rule__MovementAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1691:1: ( ( 'turn' ) )
            // InternalTDsl.g:1692:1: ( 'turn' )
            {
            // InternalTDsl.g:1692:1: ( 'turn' )
            // InternalTDsl.g:1693:2: 'turn'
            {
             before(grammarAccess.getMovementActionAccess().getTurnKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalTDsl.g:1702:1: rule__MovementAction__Group_1__1 : rule__MovementAction__Group_1__1__Impl ;
    public final void rule__MovementAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1706:1: ( rule__MovementAction__Group_1__1__Impl )
            // InternalTDsl.g:1707:2: rule__MovementAction__Group_1__1__Impl
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
    // InternalTDsl.g:1713:1: rule__MovementAction__Group_1__1__Impl : ( ( rule__MovementAction__DirectionAssignment_1_1 ) ) ;
    public final void rule__MovementAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1717:1: ( ( ( rule__MovementAction__DirectionAssignment_1_1 ) ) )
            // InternalTDsl.g:1718:1: ( ( rule__MovementAction__DirectionAssignment_1_1 ) )
            {
            // InternalTDsl.g:1718:1: ( ( rule__MovementAction__DirectionAssignment_1_1 ) )
            // InternalTDsl.g:1719:2: ( rule__MovementAction__DirectionAssignment_1_1 )
            {
             before(grammarAccess.getMovementActionAccess().getDirectionAssignment_1_1()); 
            // InternalTDsl.g:1720:2: ( rule__MovementAction__DirectionAssignment_1_1 )
            // InternalTDsl.g:1720:3: rule__MovementAction__DirectionAssignment_1_1
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
    // InternalTDsl.g:1729:1: rule__MovementAction__Group_2__0 : rule__MovementAction__Group_2__0__Impl rule__MovementAction__Group_2__1 ;
    public final void rule__MovementAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1733:1: ( rule__MovementAction__Group_2__0__Impl rule__MovementAction__Group_2__1 )
            // InternalTDsl.g:1734:2: rule__MovementAction__Group_2__0__Impl rule__MovementAction__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalTDsl.g:1741:1: rule__MovementAction__Group_2__0__Impl : ( () ) ;
    public final void rule__MovementAction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1745:1: ( ( () ) )
            // InternalTDsl.g:1746:1: ( () )
            {
            // InternalTDsl.g:1746:1: ( () )
            // InternalTDsl.g:1747:2: ()
            {
             before(grammarAccess.getMovementActionAccess().getMovementActionAction_2_0()); 
            // InternalTDsl.g:1748:2: ()
            // InternalTDsl.g:1748:3: 
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
    // InternalTDsl.g:1756:1: rule__MovementAction__Group_2__1 : rule__MovementAction__Group_2__1__Impl rule__MovementAction__Group_2__2 ;
    public final void rule__MovementAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1760:1: ( rule__MovementAction__Group_2__1__Impl rule__MovementAction__Group_2__2 )
            // InternalTDsl.g:1761:2: rule__MovementAction__Group_2__1__Impl rule__MovementAction__Group_2__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalTDsl.g:1768:1: rule__MovementAction__Group_2__1__Impl : ( 'stop' ) ;
    public final void rule__MovementAction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1772:1: ( ( 'stop' ) )
            // InternalTDsl.g:1773:1: ( 'stop' )
            {
            // InternalTDsl.g:1773:1: ( 'stop' )
            // InternalTDsl.g:1774:2: 'stop'
            {
             before(grammarAccess.getMovementActionAccess().getStopKeyword_2_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalTDsl.g:1783:1: rule__MovementAction__Group_2__2 : rule__MovementAction__Group_2__2__Impl ;
    public final void rule__MovementAction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1787:1: ( rule__MovementAction__Group_2__2__Impl )
            // InternalTDsl.g:1788:2: rule__MovementAction__Group_2__2__Impl
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
    // InternalTDsl.g:1794:1: rule__MovementAction__Group_2__2__Impl : ( ( rule__MovementAction__DirectionAssignment_2_2 ) ) ;
    public final void rule__MovementAction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1798:1: ( ( ( rule__MovementAction__DirectionAssignment_2_2 ) ) )
            // InternalTDsl.g:1799:1: ( ( rule__MovementAction__DirectionAssignment_2_2 ) )
            {
            // InternalTDsl.g:1799:1: ( ( rule__MovementAction__DirectionAssignment_2_2 ) )
            // InternalTDsl.g:1800:2: ( rule__MovementAction__DirectionAssignment_2_2 )
            {
             before(grammarAccess.getMovementActionAccess().getDirectionAssignment_2_2()); 
            // InternalTDsl.g:1801:2: ( rule__MovementAction__DirectionAssignment_2_2 )
            // InternalTDsl.g:1801:3: rule__MovementAction__DirectionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__DirectionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMovementActionAccess().getDirectionAssignment_2_2()); 

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
    // InternalTDsl.g:1810:1: rule__MovementAction__Group_3__0 : rule__MovementAction__Group_3__0__Impl rule__MovementAction__Group_3__1 ;
    public final void rule__MovementAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1814:1: ( rule__MovementAction__Group_3__0__Impl rule__MovementAction__Group_3__1 )
            // InternalTDsl.g:1815:2: rule__MovementAction__Group_3__0__Impl rule__MovementAction__Group_3__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalTDsl.g:1822:1: rule__MovementAction__Group_3__0__Impl : ( () ) ;
    public final void rule__MovementAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1826:1: ( ( () ) )
            // InternalTDsl.g:1827:1: ( () )
            {
            // InternalTDsl.g:1827:1: ( () )
            // InternalTDsl.g:1828:2: ()
            {
             before(grammarAccess.getMovementActionAccess().getMovementActionAction_3_0()); 
            // InternalTDsl.g:1829:2: ()
            // InternalTDsl.g:1829:3: 
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
    // InternalTDsl.g:1837:1: rule__MovementAction__Group_3__1 : rule__MovementAction__Group_3__1__Impl rule__MovementAction__Group_3__2 ;
    public final void rule__MovementAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1841:1: ( rule__MovementAction__Group_3__1__Impl rule__MovementAction__Group_3__2 )
            // InternalTDsl.g:1842:2: rule__MovementAction__Group_3__1__Impl rule__MovementAction__Group_3__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTDsl.g:1849:1: rule__MovementAction__Group_3__1__Impl : ( 'stop' ) ;
    public final void rule__MovementAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1853:1: ( ( 'stop' ) )
            // InternalTDsl.g:1854:1: ( 'stop' )
            {
            // InternalTDsl.g:1854:1: ( 'stop' )
            // InternalTDsl.g:1855:2: 'stop'
            {
             before(grammarAccess.getMovementActionAccess().getStopKeyword_3_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalTDsl.g:1864:1: rule__MovementAction__Group_3__2 : rule__MovementAction__Group_3__2__Impl ;
    public final void rule__MovementAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1868:1: ( rule__MovementAction__Group_3__2__Impl )
            // InternalTDsl.g:1869:2: rule__MovementAction__Group_3__2__Impl
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
    // InternalTDsl.g:1875:1: rule__MovementAction__Group_3__2__Impl : ( ( rule__MovementAction__DirectionAssignment_3_2 ) ) ;
    public final void rule__MovementAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1879:1: ( ( ( rule__MovementAction__DirectionAssignment_3_2 ) ) )
            // InternalTDsl.g:1880:1: ( ( rule__MovementAction__DirectionAssignment_3_2 ) )
            {
            // InternalTDsl.g:1880:1: ( ( rule__MovementAction__DirectionAssignment_3_2 ) )
            // InternalTDsl.g:1881:2: ( rule__MovementAction__DirectionAssignment_3_2 )
            {
             before(grammarAccess.getMovementActionAccess().getDirectionAssignment_3_2()); 
            // InternalTDsl.g:1882:2: ( rule__MovementAction__DirectionAssignment_3_2 )
            // InternalTDsl.g:1882:3: rule__MovementAction__DirectionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__DirectionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMovementActionAccess().getDirectionAssignment_3_2()); 

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
    // InternalTDsl.g:1891:1: rule__SoundAction__Group_0__0 : rule__SoundAction__Group_0__0__Impl rule__SoundAction__Group_0__1 ;
    public final void rule__SoundAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1895:1: ( rule__SoundAction__Group_0__0__Impl rule__SoundAction__Group_0__1 )
            // InternalTDsl.g:1896:2: rule__SoundAction__Group_0__0__Impl rule__SoundAction__Group_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalTDsl.g:1903:1: rule__SoundAction__Group_0__0__Impl : ( 'play' ) ;
    public final void rule__SoundAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1907:1: ( ( 'play' ) )
            // InternalTDsl.g:1908:1: ( 'play' )
            {
            // InternalTDsl.g:1908:1: ( 'play' )
            // InternalTDsl.g:1909:2: 'play'
            {
             before(grammarAccess.getSoundActionAccess().getPlayKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalTDsl.g:1918:1: rule__SoundAction__Group_0__1 : rule__SoundAction__Group_0__1__Impl rule__SoundAction__Group_0__2 ;
    public final void rule__SoundAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1922:1: ( rule__SoundAction__Group_0__1__Impl rule__SoundAction__Group_0__2 )
            // InternalTDsl.g:1923:2: rule__SoundAction__Group_0__1__Impl rule__SoundAction__Group_0__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalTDsl.g:1930:1: rule__SoundAction__Group_0__1__Impl : ( 'sound' ) ;
    public final void rule__SoundAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1934:1: ( ( 'sound' ) )
            // InternalTDsl.g:1935:1: ( 'sound' )
            {
            // InternalTDsl.g:1935:1: ( 'sound' )
            // InternalTDsl.g:1936:2: 'sound'
            {
             before(grammarAccess.getSoundActionAccess().getSoundKeyword_0_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalTDsl.g:1945:1: rule__SoundAction__Group_0__2 : rule__SoundAction__Group_0__2__Impl ;
    public final void rule__SoundAction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1949:1: ( rule__SoundAction__Group_0__2__Impl )
            // InternalTDsl.g:1950:2: rule__SoundAction__Group_0__2__Impl
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
    // InternalTDsl.g:1956:1: rule__SoundAction__Group_0__2__Impl : ( ( rule__SoundAction__SoundAssignment_0_2 ) ) ;
    public final void rule__SoundAction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1960:1: ( ( ( rule__SoundAction__SoundAssignment_0_2 ) ) )
            // InternalTDsl.g:1961:1: ( ( rule__SoundAction__SoundAssignment_0_2 ) )
            {
            // InternalTDsl.g:1961:1: ( ( rule__SoundAction__SoundAssignment_0_2 ) )
            // InternalTDsl.g:1962:2: ( rule__SoundAction__SoundAssignment_0_2 )
            {
             before(grammarAccess.getSoundActionAccess().getSoundAssignment_0_2()); 
            // InternalTDsl.g:1963:2: ( rule__SoundAction__SoundAssignment_0_2 )
            // InternalTDsl.g:1963:3: rule__SoundAction__SoundAssignment_0_2
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
    // InternalTDsl.g:1972:1: rule__SoundAction__Group_1__0 : rule__SoundAction__Group_1__0__Impl rule__SoundAction__Group_1__1 ;
    public final void rule__SoundAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1976:1: ( rule__SoundAction__Group_1__0__Impl rule__SoundAction__Group_1__1 )
            // InternalTDsl.g:1977:2: rule__SoundAction__Group_1__0__Impl rule__SoundAction__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTDsl.g:1984:1: rule__SoundAction__Group_1__0__Impl : ( () ) ;
    public final void rule__SoundAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:1988:1: ( ( () ) )
            // InternalTDsl.g:1989:1: ( () )
            {
            // InternalTDsl.g:1989:1: ( () )
            // InternalTDsl.g:1990:2: ()
            {
             before(grammarAccess.getSoundActionAccess().getSoundActionAction_1_0()); 
            // InternalTDsl.g:1991:2: ()
            // InternalTDsl.g:1991:3: 
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
    // InternalTDsl.g:1999:1: rule__SoundAction__Group_1__1 : rule__SoundAction__Group_1__1__Impl rule__SoundAction__Group_1__2 ;
    public final void rule__SoundAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2003:1: ( rule__SoundAction__Group_1__1__Impl rule__SoundAction__Group_1__2 )
            // InternalTDsl.g:2004:2: rule__SoundAction__Group_1__1__Impl rule__SoundAction__Group_1__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalTDsl.g:2011:1: rule__SoundAction__Group_1__1__Impl : ( 'stop' ) ;
    public final void rule__SoundAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2015:1: ( ( 'stop' ) )
            // InternalTDsl.g:2016:1: ( 'stop' )
            {
            // InternalTDsl.g:2016:1: ( 'stop' )
            // InternalTDsl.g:2017:2: 'stop'
            {
             before(grammarAccess.getSoundActionAccess().getStopKeyword_1_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalTDsl.g:2026:1: rule__SoundAction__Group_1__2 : rule__SoundAction__Group_1__2__Impl rule__SoundAction__Group_1__3 ;
    public final void rule__SoundAction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2030:1: ( rule__SoundAction__Group_1__2__Impl rule__SoundAction__Group_1__3 )
            // InternalTDsl.g:2031:2: rule__SoundAction__Group_1__2__Impl rule__SoundAction__Group_1__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTDsl.g:2038:1: rule__SoundAction__Group_1__2__Impl : ( 'playing' ) ;
    public final void rule__SoundAction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2042:1: ( ( 'playing' ) )
            // InternalTDsl.g:2043:1: ( 'playing' )
            {
            // InternalTDsl.g:2043:1: ( 'playing' )
            // InternalTDsl.g:2044:2: 'playing'
            {
             before(grammarAccess.getSoundActionAccess().getPlayingKeyword_1_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalTDsl.g:2053:1: rule__SoundAction__Group_1__3 : rule__SoundAction__Group_1__3__Impl ;
    public final void rule__SoundAction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2057:1: ( rule__SoundAction__Group_1__3__Impl )
            // InternalTDsl.g:2058:2: rule__SoundAction__Group_1__3__Impl
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
    // InternalTDsl.g:2064:1: rule__SoundAction__Group_1__3__Impl : ( 'sound' ) ;
    public final void rule__SoundAction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2068:1: ( ( 'sound' ) )
            // InternalTDsl.g:2069:1: ( 'sound' )
            {
            // InternalTDsl.g:2069:1: ( 'sound' )
            // InternalTDsl.g:2070:2: 'sound'
            {
             before(grammarAccess.getSoundActionAccess().getSoundKeyword_1_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalTDsl.g:2080:1: rule__ColorBottomAction__Group_0__0 : rule__ColorBottomAction__Group_0__0__Impl rule__ColorBottomAction__Group_0__1 ;
    public final void rule__ColorBottomAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2084:1: ( rule__ColorBottomAction__Group_0__0__Impl rule__ColorBottomAction__Group_0__1 )
            // InternalTDsl.g:2085:2: rule__ColorBottomAction__Group_0__0__Impl rule__ColorBottomAction__Group_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalTDsl.g:2092:1: rule__ColorBottomAction__Group_0__0__Impl : ( 'set' ) ;
    public final void rule__ColorBottomAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2096:1: ( ( 'set' ) )
            // InternalTDsl.g:2097:1: ( 'set' )
            {
            // InternalTDsl.g:2097:1: ( 'set' )
            // InternalTDsl.g:2098:2: 'set'
            {
             before(grammarAccess.getColorBottomActionAccess().getSetKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalTDsl.g:2107:1: rule__ColorBottomAction__Group_0__1 : rule__ColorBottomAction__Group_0__1__Impl rule__ColorBottomAction__Group_0__2 ;
    public final void rule__ColorBottomAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2111:1: ( rule__ColorBottomAction__Group_0__1__Impl rule__ColorBottomAction__Group_0__2 )
            // InternalTDsl.g:2112:2: rule__ColorBottomAction__Group_0__1__Impl rule__ColorBottomAction__Group_0__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalTDsl.g:2119:1: rule__ColorBottomAction__Group_0__1__Impl : ( 'bottom' ) ;
    public final void rule__ColorBottomAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2123:1: ( ( 'bottom' ) )
            // InternalTDsl.g:2124:1: ( 'bottom' )
            {
            // InternalTDsl.g:2124:1: ( 'bottom' )
            // InternalTDsl.g:2125:2: 'bottom'
            {
             before(grammarAccess.getColorBottomActionAccess().getBottomKeyword_0_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalTDsl.g:2134:1: rule__ColorBottomAction__Group_0__2 : rule__ColorBottomAction__Group_0__2__Impl rule__ColorBottomAction__Group_0__3 ;
    public final void rule__ColorBottomAction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2138:1: ( rule__ColorBottomAction__Group_0__2__Impl rule__ColorBottomAction__Group_0__3 )
            // InternalTDsl.g:2139:2: rule__ColorBottomAction__Group_0__2__Impl rule__ColorBottomAction__Group_0__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalTDsl.g:2146:1: rule__ColorBottomAction__Group_0__2__Impl : ( 'color' ) ;
    public final void rule__ColorBottomAction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2150:1: ( ( 'color' ) )
            // InternalTDsl.g:2151:1: ( 'color' )
            {
            // InternalTDsl.g:2151:1: ( 'color' )
            // InternalTDsl.g:2152:2: 'color'
            {
             before(grammarAccess.getColorBottomActionAccess().getColorKeyword_0_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalTDsl.g:2161:1: rule__ColorBottomAction__Group_0__3 : rule__ColorBottomAction__Group_0__3__Impl rule__ColorBottomAction__Group_0__4 ;
    public final void rule__ColorBottomAction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2165:1: ( rule__ColorBottomAction__Group_0__3__Impl rule__ColorBottomAction__Group_0__4 )
            // InternalTDsl.g:2166:2: rule__ColorBottomAction__Group_0__3__Impl rule__ColorBottomAction__Group_0__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalTDsl.g:2173:1: rule__ColorBottomAction__Group_0__3__Impl : ( 'to' ) ;
    public final void rule__ColorBottomAction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2177:1: ( ( 'to' ) )
            // InternalTDsl.g:2178:1: ( 'to' )
            {
            // InternalTDsl.g:2178:1: ( 'to' )
            // InternalTDsl.g:2179:2: 'to'
            {
             before(grammarAccess.getColorBottomActionAccess().getToKeyword_0_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalTDsl.g:2188:1: rule__ColorBottomAction__Group_0__4 : rule__ColorBottomAction__Group_0__4__Impl ;
    public final void rule__ColorBottomAction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2192:1: ( rule__ColorBottomAction__Group_0__4__Impl )
            // InternalTDsl.g:2193:2: rule__ColorBottomAction__Group_0__4__Impl
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
    // InternalTDsl.g:2199:1: rule__ColorBottomAction__Group_0__4__Impl : ( ( rule__ColorBottomAction__ColorAssignment_0_4 ) ) ;
    public final void rule__ColorBottomAction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2203:1: ( ( ( rule__ColorBottomAction__ColorAssignment_0_4 ) ) )
            // InternalTDsl.g:2204:1: ( ( rule__ColorBottomAction__ColorAssignment_0_4 ) )
            {
            // InternalTDsl.g:2204:1: ( ( rule__ColorBottomAction__ColorAssignment_0_4 ) )
            // InternalTDsl.g:2205:2: ( rule__ColorBottomAction__ColorAssignment_0_4 )
            {
             before(grammarAccess.getColorBottomActionAccess().getColorAssignment_0_4()); 
            // InternalTDsl.g:2206:2: ( rule__ColorBottomAction__ColorAssignment_0_4 )
            // InternalTDsl.g:2206:3: rule__ColorBottomAction__ColorAssignment_0_4
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
    // InternalTDsl.g:2215:1: rule__ColorBottomAction__Group_1__0 : rule__ColorBottomAction__Group_1__0__Impl rule__ColorBottomAction__Group_1__1 ;
    public final void rule__ColorBottomAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2219:1: ( rule__ColorBottomAction__Group_1__0__Impl rule__ColorBottomAction__Group_1__1 )
            // InternalTDsl.g:2220:2: rule__ColorBottomAction__Group_1__0__Impl rule__ColorBottomAction__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalTDsl.g:2227:1: rule__ColorBottomAction__Group_1__0__Impl : ( () ) ;
    public final void rule__ColorBottomAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2231:1: ( ( () ) )
            // InternalTDsl.g:2232:1: ( () )
            {
            // InternalTDsl.g:2232:1: ( () )
            // InternalTDsl.g:2233:2: ()
            {
             before(grammarAccess.getColorBottomActionAccess().getColorBottomActionAction_1_0()); 
            // InternalTDsl.g:2234:2: ()
            // InternalTDsl.g:2234:3: 
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
    // InternalTDsl.g:2242:1: rule__ColorBottomAction__Group_1__1 : rule__ColorBottomAction__Group_1__1__Impl rule__ColorBottomAction__Group_1__2 ;
    public final void rule__ColorBottomAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2246:1: ( rule__ColorBottomAction__Group_1__1__Impl rule__ColorBottomAction__Group_1__2 )
            // InternalTDsl.g:2247:2: rule__ColorBottomAction__Group_1__1__Impl rule__ColorBottomAction__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalTDsl.g:2254:1: rule__ColorBottomAction__Group_1__1__Impl : ( 'turn' ) ;
    public final void rule__ColorBottomAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2258:1: ( ( 'turn' ) )
            // InternalTDsl.g:2259:1: ( 'turn' )
            {
            // InternalTDsl.g:2259:1: ( 'turn' )
            // InternalTDsl.g:2260:2: 'turn'
            {
             before(grammarAccess.getColorBottomActionAccess().getTurnKeyword_1_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalTDsl.g:2269:1: rule__ColorBottomAction__Group_1__2 : rule__ColorBottomAction__Group_1__2__Impl rule__ColorBottomAction__Group_1__3 ;
    public final void rule__ColorBottomAction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2273:1: ( rule__ColorBottomAction__Group_1__2__Impl rule__ColorBottomAction__Group_1__3 )
            // InternalTDsl.g:2274:2: rule__ColorBottomAction__Group_1__2__Impl rule__ColorBottomAction__Group_1__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalTDsl.g:2281:1: rule__ColorBottomAction__Group_1__2__Impl : ( 'off' ) ;
    public final void rule__ColorBottomAction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2285:1: ( ( 'off' ) )
            // InternalTDsl.g:2286:1: ( 'off' )
            {
            // InternalTDsl.g:2286:1: ( 'off' )
            // InternalTDsl.g:2287:2: 'off'
            {
             before(grammarAccess.getColorBottomActionAccess().getOffKeyword_1_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalTDsl.g:2296:1: rule__ColorBottomAction__Group_1__3 : rule__ColorBottomAction__Group_1__3__Impl rule__ColorBottomAction__Group_1__4 ;
    public final void rule__ColorBottomAction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2300:1: ( rule__ColorBottomAction__Group_1__3__Impl rule__ColorBottomAction__Group_1__4 )
            // InternalTDsl.g:2301:2: rule__ColorBottomAction__Group_1__3__Impl rule__ColorBottomAction__Group_1__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalTDsl.g:2308:1: rule__ColorBottomAction__Group_1__3__Impl : ( 'bottom' ) ;
    public final void rule__ColorBottomAction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2312:1: ( ( 'bottom' ) )
            // InternalTDsl.g:2313:1: ( 'bottom' )
            {
            // InternalTDsl.g:2313:1: ( 'bottom' )
            // InternalTDsl.g:2314:2: 'bottom'
            {
             before(grammarAccess.getColorBottomActionAccess().getBottomKeyword_1_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalTDsl.g:2323:1: rule__ColorBottomAction__Group_1__4 : rule__ColorBottomAction__Group_1__4__Impl ;
    public final void rule__ColorBottomAction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2327:1: ( rule__ColorBottomAction__Group_1__4__Impl )
            // InternalTDsl.g:2328:2: rule__ColorBottomAction__Group_1__4__Impl
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
    // InternalTDsl.g:2334:1: rule__ColorBottomAction__Group_1__4__Impl : ( 'leds' ) ;
    public final void rule__ColorBottomAction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2338:1: ( ( 'leds' ) )
            // InternalTDsl.g:2339:1: ( 'leds' )
            {
            // InternalTDsl.g:2339:1: ( 'leds' )
            // InternalTDsl.g:2340:2: 'leds'
            {
             before(grammarAccess.getColorBottomActionAccess().getLedsKeyword_1_4()); 
            match(input,55,FOLLOW_2); 
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
    // InternalTDsl.g:2350:1: rule__ColorTopAction__Group_0__0 : rule__ColorTopAction__Group_0__0__Impl rule__ColorTopAction__Group_0__1 ;
    public final void rule__ColorTopAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2354:1: ( rule__ColorTopAction__Group_0__0__Impl rule__ColorTopAction__Group_0__1 )
            // InternalTDsl.g:2355:2: rule__ColorTopAction__Group_0__0__Impl rule__ColorTopAction__Group_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTDsl.g:2362:1: rule__ColorTopAction__Group_0__0__Impl : ( 'set' ) ;
    public final void rule__ColorTopAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2366:1: ( ( 'set' ) )
            // InternalTDsl.g:2367:1: ( 'set' )
            {
            // InternalTDsl.g:2367:1: ( 'set' )
            // InternalTDsl.g:2368:2: 'set'
            {
             before(grammarAccess.getColorTopActionAccess().getSetKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalTDsl.g:2377:1: rule__ColorTopAction__Group_0__1 : rule__ColorTopAction__Group_0__1__Impl rule__ColorTopAction__Group_0__2 ;
    public final void rule__ColorTopAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2381:1: ( rule__ColorTopAction__Group_0__1__Impl rule__ColorTopAction__Group_0__2 )
            // InternalTDsl.g:2382:2: rule__ColorTopAction__Group_0__1__Impl rule__ColorTopAction__Group_0__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalTDsl.g:2389:1: rule__ColorTopAction__Group_0__1__Impl : ( 'top' ) ;
    public final void rule__ColorTopAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2393:1: ( ( 'top' ) )
            // InternalTDsl.g:2394:1: ( 'top' )
            {
            // InternalTDsl.g:2394:1: ( 'top' )
            // InternalTDsl.g:2395:2: 'top'
            {
             before(grammarAccess.getColorTopActionAccess().getTopKeyword_0_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalTDsl.g:2404:1: rule__ColorTopAction__Group_0__2 : rule__ColorTopAction__Group_0__2__Impl rule__ColorTopAction__Group_0__3 ;
    public final void rule__ColorTopAction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2408:1: ( rule__ColorTopAction__Group_0__2__Impl rule__ColorTopAction__Group_0__3 )
            // InternalTDsl.g:2409:2: rule__ColorTopAction__Group_0__2__Impl rule__ColorTopAction__Group_0__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalTDsl.g:2416:1: rule__ColorTopAction__Group_0__2__Impl : ( 'color' ) ;
    public final void rule__ColorTopAction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2420:1: ( ( 'color' ) )
            // InternalTDsl.g:2421:1: ( 'color' )
            {
            // InternalTDsl.g:2421:1: ( 'color' )
            // InternalTDsl.g:2422:2: 'color'
            {
             before(grammarAccess.getColorTopActionAccess().getColorKeyword_0_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalTDsl.g:2431:1: rule__ColorTopAction__Group_0__3 : rule__ColorTopAction__Group_0__3__Impl rule__ColorTopAction__Group_0__4 ;
    public final void rule__ColorTopAction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2435:1: ( rule__ColorTopAction__Group_0__3__Impl rule__ColorTopAction__Group_0__4 )
            // InternalTDsl.g:2436:2: rule__ColorTopAction__Group_0__3__Impl rule__ColorTopAction__Group_0__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalTDsl.g:2443:1: rule__ColorTopAction__Group_0__3__Impl : ( 'to' ) ;
    public final void rule__ColorTopAction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2447:1: ( ( 'to' ) )
            // InternalTDsl.g:2448:1: ( 'to' )
            {
            // InternalTDsl.g:2448:1: ( 'to' )
            // InternalTDsl.g:2449:2: 'to'
            {
             before(grammarAccess.getColorTopActionAccess().getToKeyword_0_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalTDsl.g:2458:1: rule__ColorTopAction__Group_0__4 : rule__ColorTopAction__Group_0__4__Impl ;
    public final void rule__ColorTopAction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2462:1: ( rule__ColorTopAction__Group_0__4__Impl )
            // InternalTDsl.g:2463:2: rule__ColorTopAction__Group_0__4__Impl
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
    // InternalTDsl.g:2469:1: rule__ColorTopAction__Group_0__4__Impl : ( ( rule__ColorTopAction__ColorAssignment_0_4 ) ) ;
    public final void rule__ColorTopAction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2473:1: ( ( ( rule__ColorTopAction__ColorAssignment_0_4 ) ) )
            // InternalTDsl.g:2474:1: ( ( rule__ColorTopAction__ColorAssignment_0_4 ) )
            {
            // InternalTDsl.g:2474:1: ( ( rule__ColorTopAction__ColorAssignment_0_4 ) )
            // InternalTDsl.g:2475:2: ( rule__ColorTopAction__ColorAssignment_0_4 )
            {
             before(grammarAccess.getColorTopActionAccess().getColorAssignment_0_4()); 
            // InternalTDsl.g:2476:2: ( rule__ColorTopAction__ColorAssignment_0_4 )
            // InternalTDsl.g:2476:3: rule__ColorTopAction__ColorAssignment_0_4
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
    // InternalTDsl.g:2485:1: rule__ColorTopAction__Group_1__0 : rule__ColorTopAction__Group_1__0__Impl rule__ColorTopAction__Group_1__1 ;
    public final void rule__ColorTopAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2489:1: ( rule__ColorTopAction__Group_1__0__Impl rule__ColorTopAction__Group_1__1 )
            // InternalTDsl.g:2490:2: rule__ColorTopAction__Group_1__0__Impl rule__ColorTopAction__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalTDsl.g:2497:1: rule__ColorTopAction__Group_1__0__Impl : ( () ) ;
    public final void rule__ColorTopAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2501:1: ( ( () ) )
            // InternalTDsl.g:2502:1: ( () )
            {
            // InternalTDsl.g:2502:1: ( () )
            // InternalTDsl.g:2503:2: ()
            {
             before(grammarAccess.getColorTopActionAccess().getColorTopActionAction_1_0()); 
            // InternalTDsl.g:2504:2: ()
            // InternalTDsl.g:2504:3: 
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
    // InternalTDsl.g:2512:1: rule__ColorTopAction__Group_1__1 : rule__ColorTopAction__Group_1__1__Impl rule__ColorTopAction__Group_1__2 ;
    public final void rule__ColorTopAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2516:1: ( rule__ColorTopAction__Group_1__1__Impl rule__ColorTopAction__Group_1__2 )
            // InternalTDsl.g:2517:2: rule__ColorTopAction__Group_1__1__Impl rule__ColorTopAction__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalTDsl.g:2524:1: rule__ColorTopAction__Group_1__1__Impl : ( 'turn' ) ;
    public final void rule__ColorTopAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2528:1: ( ( 'turn' ) )
            // InternalTDsl.g:2529:1: ( 'turn' )
            {
            // InternalTDsl.g:2529:1: ( 'turn' )
            // InternalTDsl.g:2530:2: 'turn'
            {
             before(grammarAccess.getColorTopActionAccess().getTurnKeyword_1_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalTDsl.g:2539:1: rule__ColorTopAction__Group_1__2 : rule__ColorTopAction__Group_1__2__Impl rule__ColorTopAction__Group_1__3 ;
    public final void rule__ColorTopAction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2543:1: ( rule__ColorTopAction__Group_1__2__Impl rule__ColorTopAction__Group_1__3 )
            // InternalTDsl.g:2544:2: rule__ColorTopAction__Group_1__2__Impl rule__ColorTopAction__Group_1__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalTDsl.g:2551:1: rule__ColorTopAction__Group_1__2__Impl : ( 'off' ) ;
    public final void rule__ColorTopAction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2555:1: ( ( 'off' ) )
            // InternalTDsl.g:2556:1: ( 'off' )
            {
            // InternalTDsl.g:2556:1: ( 'off' )
            // InternalTDsl.g:2557:2: 'off'
            {
             before(grammarAccess.getColorTopActionAccess().getOffKeyword_1_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalTDsl.g:2566:1: rule__ColorTopAction__Group_1__3 : rule__ColorTopAction__Group_1__3__Impl rule__ColorTopAction__Group_1__4 ;
    public final void rule__ColorTopAction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2570:1: ( rule__ColorTopAction__Group_1__3__Impl rule__ColorTopAction__Group_1__4 )
            // InternalTDsl.g:2571:2: rule__ColorTopAction__Group_1__3__Impl rule__ColorTopAction__Group_1__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalTDsl.g:2578:1: rule__ColorTopAction__Group_1__3__Impl : ( 'top' ) ;
    public final void rule__ColorTopAction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2582:1: ( ( 'top' ) )
            // InternalTDsl.g:2583:1: ( 'top' )
            {
            // InternalTDsl.g:2583:1: ( 'top' )
            // InternalTDsl.g:2584:2: 'top'
            {
             before(grammarAccess.getColorTopActionAccess().getTopKeyword_1_3()); 
            match(input,56,FOLLOW_2); 
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
    // InternalTDsl.g:2593:1: rule__ColorTopAction__Group_1__4 : rule__ColorTopAction__Group_1__4__Impl ;
    public final void rule__ColorTopAction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2597:1: ( rule__ColorTopAction__Group_1__4__Impl )
            // InternalTDsl.g:2598:2: rule__ColorTopAction__Group_1__4__Impl
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
    // InternalTDsl.g:2604:1: rule__ColorTopAction__Group_1__4__Impl : ( 'leds' ) ;
    public final void rule__ColorTopAction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2608:1: ( ( 'leds' ) )
            // InternalTDsl.g:2609:1: ( 'leds' )
            {
            // InternalTDsl.g:2609:1: ( 'leds' )
            // InternalTDsl.g:2610:2: 'leds'
            {
             before(grammarAccess.getColorTopActionAccess().getLedsKeyword_1_4()); 
            match(input,55,FOLLOW_2); 
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
    // InternalTDsl.g:2620:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2624:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalTDsl.g:2625:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalTDsl.g:2632:1: rule__IfStatement__Group__0__Impl : ( 'If' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2636:1: ( ( 'If' ) )
            // InternalTDsl.g:2637:1: ( 'If' )
            {
            // InternalTDsl.g:2637:1: ( 'If' )
            // InternalTDsl.g:2638:2: 'If'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalTDsl.g:2647:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2651:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalTDsl.g:2652:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTDsl.g:2659:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ConditionAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2663:1: ( ( ( rule__IfStatement__ConditionAssignment_1 ) ) )
            // InternalTDsl.g:2664:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            {
            // InternalTDsl.g:2664:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            // InternalTDsl.g:2665:2: ( rule__IfStatement__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_1()); 
            // InternalTDsl.g:2666:2: ( rule__IfStatement__ConditionAssignment_1 )
            // InternalTDsl.g:2666:3: rule__IfStatement__ConditionAssignment_1
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
    // InternalTDsl.g:2674:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2678:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalTDsl.g:2679:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
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
    // InternalTDsl.g:2686:1: rule__IfStatement__Group__2__Impl : ( ':' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2690:1: ( ( ':' ) )
            // InternalTDsl.g:2691:1: ( ':' )
            {
            // InternalTDsl.g:2691:1: ( ':' )
            // InternalTDsl.g:2692:2: ':'
            {
             before(grammarAccess.getIfStatementAccess().getColonKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTDsl.g:2701:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2705:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalTDsl.g:2706:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalTDsl.g:2713:1: rule__IfStatement__Group__3__Impl : ( ( ( rule__IfStatement__ActionAssignment_3 ) ) ( ( rule__IfStatement__ActionAssignment_3 )* ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2717:1: ( ( ( ( rule__IfStatement__ActionAssignment_3 ) ) ( ( rule__IfStatement__ActionAssignment_3 )* ) ) )
            // InternalTDsl.g:2718:1: ( ( ( rule__IfStatement__ActionAssignment_3 ) ) ( ( rule__IfStatement__ActionAssignment_3 )* ) )
            {
            // InternalTDsl.g:2718:1: ( ( ( rule__IfStatement__ActionAssignment_3 ) ) ( ( rule__IfStatement__ActionAssignment_3 )* ) )
            // InternalTDsl.g:2719:2: ( ( rule__IfStatement__ActionAssignment_3 ) ) ( ( rule__IfStatement__ActionAssignment_3 )* )
            {
            // InternalTDsl.g:2719:2: ( ( rule__IfStatement__ActionAssignment_3 ) )
            // InternalTDsl.g:2720:3: ( rule__IfStatement__ActionAssignment_3 )
            {
             before(grammarAccess.getIfStatementAccess().getActionAssignment_3()); 
            // InternalTDsl.g:2721:3: ( rule__IfStatement__ActionAssignment_3 )
            // InternalTDsl.g:2721:4: rule__IfStatement__ActionAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__IfStatement__ActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getActionAssignment_3()); 

            }

            // InternalTDsl.g:2724:2: ( ( rule__IfStatement__ActionAssignment_3 )* )
            // InternalTDsl.g:2725:3: ( rule__IfStatement__ActionAssignment_3 )*
            {
             before(grammarAccess.getIfStatementAccess().getActionAssignment_3()); 
            // InternalTDsl.g:2726:3: ( rule__IfStatement__ActionAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTDsl.g:2726:4: rule__IfStatement__ActionAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__IfStatement__ActionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalTDsl.g:2735:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2739:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalTDsl.g:2740:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalTDsl.g:2747:1: rule__IfStatement__Group__4__Impl : ( 'End' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2751:1: ( ( 'End' ) )
            // InternalTDsl.g:2752:1: ( 'End' )
            {
            // InternalTDsl.g:2752:1: ( 'End' )
            // InternalTDsl.g:2753:2: 'End'
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
    // InternalTDsl.g:2762:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2766:1: ( rule__IfStatement__Group__5__Impl )
            // InternalTDsl.g:2767:2: rule__IfStatement__Group__5__Impl
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
    // InternalTDsl.g:2773:1: rule__IfStatement__Group__5__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2777:1: ( ( 'if' ) )
            // InternalTDsl.g:2778:1: ( 'if' )
            {
            // InternalTDsl.g:2778:1: ( 'if' )
            // InternalTDsl.g:2779:2: 'if'
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
    // InternalTDsl.g:2789:1: rule__UpperEvent__Group__0 : rule__UpperEvent__Group__0__Impl rule__UpperEvent__Group__1 ;
    public final void rule__UpperEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2793:1: ( rule__UpperEvent__Group__0__Impl rule__UpperEvent__Group__1 )
            // InternalTDsl.g:2794:2: rule__UpperEvent__Group__0__Impl rule__UpperEvent__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalTDsl.g:2801:1: rule__UpperEvent__Group__0__Impl : ( ( rule__UpperEvent__ButtonAssignment_0 ) ) ;
    public final void rule__UpperEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2805:1: ( ( ( rule__UpperEvent__ButtonAssignment_0 ) ) )
            // InternalTDsl.g:2806:1: ( ( rule__UpperEvent__ButtonAssignment_0 ) )
            {
            // InternalTDsl.g:2806:1: ( ( rule__UpperEvent__ButtonAssignment_0 ) )
            // InternalTDsl.g:2807:2: ( rule__UpperEvent__ButtonAssignment_0 )
            {
             before(grammarAccess.getUpperEventAccess().getButtonAssignment_0()); 
            // InternalTDsl.g:2808:2: ( rule__UpperEvent__ButtonAssignment_0 )
            // InternalTDsl.g:2808:3: rule__UpperEvent__ButtonAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UpperEvent__ButtonAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUpperEventAccess().getButtonAssignment_0()); 

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
    // InternalTDsl.g:2816:1: rule__UpperEvent__Group__1 : rule__UpperEvent__Group__1__Impl rule__UpperEvent__Group__2 ;
    public final void rule__UpperEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2820:1: ( rule__UpperEvent__Group__1__Impl rule__UpperEvent__Group__2 )
            // InternalTDsl.g:2821:2: rule__UpperEvent__Group__1__Impl rule__UpperEvent__Group__2
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
    // InternalTDsl.g:2828:1: rule__UpperEvent__Group__1__Impl : ( ( rule__UpperEvent__Group_1__0 )* ) ;
    public final void rule__UpperEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2832:1: ( ( ( rule__UpperEvent__Group_1__0 )* ) )
            // InternalTDsl.g:2833:1: ( ( rule__UpperEvent__Group_1__0 )* )
            {
            // InternalTDsl.g:2833:1: ( ( rule__UpperEvent__Group_1__0 )* )
            // InternalTDsl.g:2834:2: ( rule__UpperEvent__Group_1__0 )*
            {
             before(grammarAccess.getUpperEventAccess().getGroup_1()); 
            // InternalTDsl.g:2835:2: ( rule__UpperEvent__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==13) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTDsl.g:2835:3: rule__UpperEvent__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__UpperEvent__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getUpperEventAccess().getGroup_1()); 

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
    // InternalTDsl.g:2843:1: rule__UpperEvent__Group__2 : rule__UpperEvent__Group__2__Impl rule__UpperEvent__Group__3 ;
    public final void rule__UpperEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2847:1: ( rule__UpperEvent__Group__2__Impl rule__UpperEvent__Group__3 )
            // InternalTDsl.g:2848:2: rule__UpperEvent__Group__2__Impl rule__UpperEvent__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalTDsl.g:2855:1: rule__UpperEvent__Group__2__Impl : ( 'button' ) ;
    public final void rule__UpperEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2859:1: ( ( 'button' ) )
            // InternalTDsl.g:2860:1: ( 'button' )
            {
            // InternalTDsl.g:2860:1: ( 'button' )
            // InternalTDsl.g:2861:2: 'button'
            {
             before(grammarAccess.getUpperEventAccess().getButtonKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getUpperEventAccess().getButtonKeyword_2()); 

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
    // InternalTDsl.g:2870:1: rule__UpperEvent__Group__3 : rule__UpperEvent__Group__3__Impl ;
    public final void rule__UpperEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2874:1: ( rule__UpperEvent__Group__3__Impl )
            // InternalTDsl.g:2875:2: rule__UpperEvent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group__3__Impl();

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
    // InternalTDsl.g:2881:1: rule__UpperEvent__Group__3__Impl : ( ( rule__UpperEvent__StateAssignment_3 ) ) ;
    public final void rule__UpperEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2885:1: ( ( ( rule__UpperEvent__StateAssignment_3 ) ) )
            // InternalTDsl.g:2886:1: ( ( rule__UpperEvent__StateAssignment_3 ) )
            {
            // InternalTDsl.g:2886:1: ( ( rule__UpperEvent__StateAssignment_3 ) )
            // InternalTDsl.g:2887:2: ( rule__UpperEvent__StateAssignment_3 )
            {
             before(grammarAccess.getUpperEventAccess().getStateAssignment_3()); 
            // InternalTDsl.g:2888:2: ( rule__UpperEvent__StateAssignment_3 )
            // InternalTDsl.g:2888:3: rule__UpperEvent__StateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UpperEvent__StateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpperEventAccess().getStateAssignment_3()); 

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


    // $ANTLR start "rule__UpperEvent__Group_1__0"
    // InternalTDsl.g:2897:1: rule__UpperEvent__Group_1__0 : rule__UpperEvent__Group_1__0__Impl rule__UpperEvent__Group_1__1 ;
    public final void rule__UpperEvent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2901:1: ( rule__UpperEvent__Group_1__0__Impl rule__UpperEvent__Group_1__1 )
            // InternalTDsl.g:2902:2: rule__UpperEvent__Group_1__0__Impl rule__UpperEvent__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__UpperEvent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group_1__1();

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
    // $ANTLR end "rule__UpperEvent__Group_1__0"


    // $ANTLR start "rule__UpperEvent__Group_1__0__Impl"
    // InternalTDsl.g:2909:1: rule__UpperEvent__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__UpperEvent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2913:1: ( ( 'and' ) )
            // InternalTDsl.g:2914:1: ( 'and' )
            {
            // InternalTDsl.g:2914:1: ( 'and' )
            // InternalTDsl.g:2915:2: 'and'
            {
             before(grammarAccess.getUpperEventAccess().getAndKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUpperEventAccess().getAndKeyword_1_0()); 

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
    // $ANTLR end "rule__UpperEvent__Group_1__0__Impl"


    // $ANTLR start "rule__UpperEvent__Group_1__1"
    // InternalTDsl.g:2924:1: rule__UpperEvent__Group_1__1 : rule__UpperEvent__Group_1__1__Impl ;
    public final void rule__UpperEvent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2928:1: ( rule__UpperEvent__Group_1__1__Impl )
            // InternalTDsl.g:2929:2: rule__UpperEvent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpperEvent__Group_1__1__Impl();

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
    // $ANTLR end "rule__UpperEvent__Group_1__1"


    // $ANTLR start "rule__UpperEvent__Group_1__1__Impl"
    // InternalTDsl.g:2935:1: rule__UpperEvent__Group_1__1__Impl : ( ( rule__UpperEvent__ButtonAssignment_1_1 ) ) ;
    public final void rule__UpperEvent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2939:1: ( ( ( rule__UpperEvent__ButtonAssignment_1_1 ) ) )
            // InternalTDsl.g:2940:1: ( ( rule__UpperEvent__ButtonAssignment_1_1 ) )
            {
            // InternalTDsl.g:2940:1: ( ( rule__UpperEvent__ButtonAssignment_1_1 ) )
            // InternalTDsl.g:2941:2: ( rule__UpperEvent__ButtonAssignment_1_1 )
            {
             before(grammarAccess.getUpperEventAccess().getButtonAssignment_1_1()); 
            // InternalTDsl.g:2942:2: ( rule__UpperEvent__ButtonAssignment_1_1 )
            // InternalTDsl.g:2942:3: rule__UpperEvent__ButtonAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UpperEvent__ButtonAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUpperEventAccess().getButtonAssignment_1_1()); 

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
    // $ANTLR end "rule__UpperEvent__Group_1__1__Impl"


    // $ANTLR start "rule__Sensor__Group_0__0"
    // InternalTDsl.g:2951:1: rule__Sensor__Group_0__0 : rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 ;
    public final void rule__Sensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2955:1: ( rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 )
            // InternalTDsl.g:2956:2: rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1
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
    // InternalTDsl.g:2963:1: rule__Sensor__Group_0__0__Impl : ( ( rule__Sensor__DirectionAssignment_0_0 ) ) ;
    public final void rule__Sensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2967:1: ( ( ( rule__Sensor__DirectionAssignment_0_0 ) ) )
            // InternalTDsl.g:2968:1: ( ( rule__Sensor__DirectionAssignment_0_0 ) )
            {
            // InternalTDsl.g:2968:1: ( ( rule__Sensor__DirectionAssignment_0_0 ) )
            // InternalTDsl.g:2969:2: ( rule__Sensor__DirectionAssignment_0_0 )
            {
             before(grammarAccess.getSensorAccess().getDirectionAssignment_0_0()); 
            // InternalTDsl.g:2970:2: ( rule__Sensor__DirectionAssignment_0_0 )
            // InternalTDsl.g:2970:3: rule__Sensor__DirectionAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__DirectionAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getDirectionAssignment_0_0()); 

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
    // InternalTDsl.g:2978:1: rule__Sensor__Group_0__1 : rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 ;
    public final void rule__Sensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2982:1: ( rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 )
            // InternalTDsl.g:2983:2: rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2
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
    // InternalTDsl.g:2990:1: rule__Sensor__Group_0__1__Impl : ( ( rule__Sensor__Sensor_typeAssignment_0_1 ) ) ;
    public final void rule__Sensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:2994:1: ( ( ( rule__Sensor__Sensor_typeAssignment_0_1 ) ) )
            // InternalTDsl.g:2995:1: ( ( rule__Sensor__Sensor_typeAssignment_0_1 ) )
            {
            // InternalTDsl.g:2995:1: ( ( rule__Sensor__Sensor_typeAssignment_0_1 ) )
            // InternalTDsl.g:2996:2: ( rule__Sensor__Sensor_typeAssignment_0_1 )
            {
             before(grammarAccess.getSensorAccess().getSensor_typeAssignment_0_1()); 
            // InternalTDsl.g:2997:2: ( rule__Sensor__Sensor_typeAssignment_0_1 )
            // InternalTDsl.g:2997:3: rule__Sensor__Sensor_typeAssignment_0_1
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
    // InternalTDsl.g:3005:1: rule__Sensor__Group_0__2 : rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 ;
    public final void rule__Sensor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3009:1: ( rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 )
            // InternalTDsl.g:3010:2: rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3
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
    // InternalTDsl.g:3017:1: rule__Sensor__Group_0__2__Impl : ( 'sensor' ) ;
    public final void rule__Sensor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3021:1: ( ( 'sensor' ) )
            // InternalTDsl.g:3022:1: ( 'sensor' )
            {
            // InternalTDsl.g:3022:1: ( 'sensor' )
            // InternalTDsl.g:3023:2: 'sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0_2()); 
            match(input,61,FOLLOW_2); 
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
    // InternalTDsl.g:3032:1: rule__Sensor__Group_0__3 : rule__Sensor__Group_0__3__Impl rule__Sensor__Group_0__4 ;
    public final void rule__Sensor__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3036:1: ( rule__Sensor__Group_0__3__Impl rule__Sensor__Group_0__4 )
            // InternalTDsl.g:3037:2: rule__Sensor__Group_0__3__Impl rule__Sensor__Group_0__4
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
    // InternalTDsl.g:3044:1: rule__Sensor__Group_0__3__Impl : ( 'detecting' ) ;
    public final void rule__Sensor__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3048:1: ( ( 'detecting' ) )
            // InternalTDsl.g:3049:1: ( 'detecting' )
            {
            // InternalTDsl.g:3049:1: ( 'detecting' )
            // InternalTDsl.g:3050:2: 'detecting'
            {
             before(grammarAccess.getSensorAccess().getDetectingKeyword_0_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalTDsl.g:3059:1: rule__Sensor__Group_0__4 : rule__Sensor__Group_0__4__Impl ;
    public final void rule__Sensor__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3063:1: ( rule__Sensor__Group_0__4__Impl )
            // InternalTDsl.g:3064:2: rule__Sensor__Group_0__4__Impl
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
    // InternalTDsl.g:3070:1: rule__Sensor__Group_0__4__Impl : ( ( rule__Sensor__StateAssignment_0_4 ) ) ;
    public final void rule__Sensor__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3074:1: ( ( ( rule__Sensor__StateAssignment_0_4 ) ) )
            // InternalTDsl.g:3075:1: ( ( rule__Sensor__StateAssignment_0_4 ) )
            {
            // InternalTDsl.g:3075:1: ( ( rule__Sensor__StateAssignment_0_4 ) )
            // InternalTDsl.g:3076:2: ( rule__Sensor__StateAssignment_0_4 )
            {
             before(grammarAccess.getSensorAccess().getStateAssignment_0_4()); 
            // InternalTDsl.g:3077:2: ( rule__Sensor__StateAssignment_0_4 )
            // InternalTDsl.g:3077:3: rule__Sensor__StateAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__StateAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getStateAssignment_0_4()); 

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


    // $ANTLR start "rule__Sensor__Group_1__0"
    // InternalTDsl.g:3086:1: rule__Sensor__Group_1__0 : rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 ;
    public final void rule__Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3090:1: ( rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 )
            // InternalTDsl.g:3091:2: rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalTDsl.g:3098:1: rule__Sensor__Group_1__0__Impl : ( ( rule__Sensor__DirectionAssignment_1_0 ) ) ;
    public final void rule__Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3102:1: ( ( ( rule__Sensor__DirectionAssignment_1_0 ) ) )
            // InternalTDsl.g:3103:1: ( ( rule__Sensor__DirectionAssignment_1_0 ) )
            {
            // InternalTDsl.g:3103:1: ( ( rule__Sensor__DirectionAssignment_1_0 ) )
            // InternalTDsl.g:3104:2: ( rule__Sensor__DirectionAssignment_1_0 )
            {
             before(grammarAccess.getSensorAccess().getDirectionAssignment_1_0()); 
            // InternalTDsl.g:3105:2: ( rule__Sensor__DirectionAssignment_1_0 )
            // InternalTDsl.g:3105:3: rule__Sensor__DirectionAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__DirectionAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getDirectionAssignment_1_0()); 

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
    // InternalTDsl.g:3113:1: rule__Sensor__Group_1__1 : rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 ;
    public final void rule__Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3117:1: ( rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 )
            // InternalTDsl.g:3118:2: rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2
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
    // InternalTDsl.g:3125:1: rule__Sensor__Group_1__1__Impl : ( ( rule__Sensor__Sensor_typeAssignment_1_1 ) ) ;
    public final void rule__Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3129:1: ( ( ( rule__Sensor__Sensor_typeAssignment_1_1 ) ) )
            // InternalTDsl.g:3130:1: ( ( rule__Sensor__Sensor_typeAssignment_1_1 ) )
            {
            // InternalTDsl.g:3130:1: ( ( rule__Sensor__Sensor_typeAssignment_1_1 ) )
            // InternalTDsl.g:3131:2: ( rule__Sensor__Sensor_typeAssignment_1_1 )
            {
             before(grammarAccess.getSensorAccess().getSensor_typeAssignment_1_1()); 
            // InternalTDsl.g:3132:2: ( rule__Sensor__Sensor_typeAssignment_1_1 )
            // InternalTDsl.g:3132:3: rule__Sensor__Sensor_typeAssignment_1_1
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
    // InternalTDsl.g:3140:1: rule__Sensor__Group_1__2 : rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 ;
    public final void rule__Sensor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3144:1: ( rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 )
            // InternalTDsl.g:3145:2: rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3
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
    // InternalTDsl.g:3152:1: rule__Sensor__Group_1__2__Impl : ( 'sensor' ) ;
    public final void rule__Sensor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3156:1: ( ( 'sensor' ) )
            // InternalTDsl.g:3157:1: ( 'sensor' )
            {
            // InternalTDsl.g:3157:1: ( 'sensor' )
            // InternalTDsl.g:3158:2: 'sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1_2()); 
            match(input,61,FOLLOW_2); 
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
    // InternalTDsl.g:3167:1: rule__Sensor__Group_1__3 : rule__Sensor__Group_1__3__Impl rule__Sensor__Group_1__4 ;
    public final void rule__Sensor__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3171:1: ( rule__Sensor__Group_1__3__Impl rule__Sensor__Group_1__4 )
            // InternalTDsl.g:3172:2: rule__Sensor__Group_1__3__Impl rule__Sensor__Group_1__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalTDsl.g:3179:1: rule__Sensor__Group_1__3__Impl : ( 'detecting' ) ;
    public final void rule__Sensor__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3183:1: ( ( 'detecting' ) )
            // InternalTDsl.g:3184:1: ( 'detecting' )
            {
            // InternalTDsl.g:3184:1: ( 'detecting' )
            // InternalTDsl.g:3185:2: 'detecting'
            {
             before(grammarAccess.getSensorAccess().getDetectingKeyword_1_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalTDsl.g:3194:1: rule__Sensor__Group_1__4 : rule__Sensor__Group_1__4__Impl ;
    public final void rule__Sensor__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3198:1: ( rule__Sensor__Group_1__4__Impl )
            // InternalTDsl.g:3199:2: rule__Sensor__Group_1__4__Impl
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
    // InternalTDsl.g:3205:1: rule__Sensor__Group_1__4__Impl : ( ( rule__Sensor__StateAssignment_1_4 ) ) ;
    public final void rule__Sensor__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3209:1: ( ( ( rule__Sensor__StateAssignment_1_4 ) ) )
            // InternalTDsl.g:3210:1: ( ( rule__Sensor__StateAssignment_1_4 ) )
            {
            // InternalTDsl.g:3210:1: ( ( rule__Sensor__StateAssignment_1_4 ) )
            // InternalTDsl.g:3211:2: ( rule__Sensor__StateAssignment_1_4 )
            {
             before(grammarAccess.getSensorAccess().getStateAssignment_1_4()); 
            // InternalTDsl.g:3212:2: ( rule__Sensor__StateAssignment_1_4 )
            // InternalTDsl.g:3212:3: rule__Sensor__StateAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__StateAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getStateAssignment_1_4()); 

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


    // $ANTLR start "rule__TapEvent__Group__0"
    // InternalTDsl.g:3221:1: rule__TapEvent__Group__0 : rule__TapEvent__Group__0__Impl rule__TapEvent__Group__1 ;
    public final void rule__TapEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3225:1: ( rule__TapEvent__Group__0__Impl rule__TapEvent__Group__1 )
            // InternalTDsl.g:3226:2: rule__TapEvent__Group__0__Impl rule__TapEvent__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalTDsl.g:3233:1: rule__TapEvent__Group__0__Impl : ( () ) ;
    public final void rule__TapEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3237:1: ( ( () ) )
            // InternalTDsl.g:3238:1: ( () )
            {
            // InternalTDsl.g:3238:1: ( () )
            // InternalTDsl.g:3239:2: ()
            {
             before(grammarAccess.getTapEventAccess().getTapEventAction_0()); 
            // InternalTDsl.g:3240:2: ()
            // InternalTDsl.g:3240:3: 
            {
            }

             after(grammarAccess.getTapEventAccess().getTapEventAction_0()); 

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
    // InternalTDsl.g:3248:1: rule__TapEvent__Group__1 : rule__TapEvent__Group__1__Impl ;
    public final void rule__TapEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3252:1: ( rule__TapEvent__Group__1__Impl )
            // InternalTDsl.g:3253:2: rule__TapEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TapEvent__Group__1__Impl();

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
    // InternalTDsl.g:3259:1: rule__TapEvent__Group__1__Impl : ( 'tap' ) ;
    public final void rule__TapEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3263:1: ( ( 'tap' ) )
            // InternalTDsl.g:3264:1: ( 'tap' )
            {
            // InternalTDsl.g:3264:1: ( 'tap' )
            // InternalTDsl.g:3265:2: 'tap'
            {
             before(grammarAccess.getTapEventAccess().getTapKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getTapEventAccess().getTapKeyword_1()); 

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


    // $ANTLR start "rule__ClapEvent__Group__0"
    // InternalTDsl.g:3275:1: rule__ClapEvent__Group__0 : rule__ClapEvent__Group__0__Impl rule__ClapEvent__Group__1 ;
    public final void rule__ClapEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3279:1: ( rule__ClapEvent__Group__0__Impl rule__ClapEvent__Group__1 )
            // InternalTDsl.g:3280:2: rule__ClapEvent__Group__0__Impl rule__ClapEvent__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTDsl.g:3287:1: rule__ClapEvent__Group__0__Impl : ( () ) ;
    public final void rule__ClapEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3291:1: ( ( () ) )
            // InternalTDsl.g:3292:1: ( () )
            {
            // InternalTDsl.g:3292:1: ( () )
            // InternalTDsl.g:3293:2: ()
            {
             before(grammarAccess.getClapEventAccess().getClapEventAction_0()); 
            // InternalTDsl.g:3294:2: ()
            // InternalTDsl.g:3294:3: 
            {
            }

             after(grammarAccess.getClapEventAccess().getClapEventAction_0()); 

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
    // InternalTDsl.g:3302:1: rule__ClapEvent__Group__1 : rule__ClapEvent__Group__1__Impl ;
    public final void rule__ClapEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3306:1: ( rule__ClapEvent__Group__1__Impl )
            // InternalTDsl.g:3307:2: rule__ClapEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClapEvent__Group__1__Impl();

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
    // InternalTDsl.g:3313:1: rule__ClapEvent__Group__1__Impl : ( 'clap' ) ;
    public final void rule__ClapEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3317:1: ( ( 'clap' ) )
            // InternalTDsl.g:3318:1: ( 'clap' )
            {
            // InternalTDsl.g:3318:1: ( 'clap' )
            // InternalTDsl.g:3319:2: 'clap'
            {
             before(grammarAccess.getClapEventAccess().getClapKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getClapEventAccess().getClapKeyword_1()); 

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


    // $ANTLR start "rule__Condition__Group__0"
    // InternalTDsl.g:3329:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3333:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalTDsl.g:3334:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalTDsl.g:3341:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LeftSensorAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3345:1: ( ( ( rule__Condition__LeftSensorAssignment_0 ) ) )
            // InternalTDsl.g:3346:1: ( ( rule__Condition__LeftSensorAssignment_0 ) )
            {
            // InternalTDsl.g:3346:1: ( ( rule__Condition__LeftSensorAssignment_0 ) )
            // InternalTDsl.g:3347:2: ( rule__Condition__LeftSensorAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLeftSensorAssignment_0()); 
            // InternalTDsl.g:3348:2: ( rule__Condition__LeftSensorAssignment_0 )
            // InternalTDsl.g:3348:3: rule__Condition__LeftSensorAssignment_0
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
    // InternalTDsl.g:3356:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3360:1: ( rule__Condition__Group__1__Impl )
            // InternalTDsl.g:3361:2: rule__Condition__Group__1__Impl
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
    // InternalTDsl.g:3367:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Group_1__0 )? ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3371:1: ( ( ( rule__Condition__Group_1__0 )? ) )
            // InternalTDsl.g:3372:1: ( ( rule__Condition__Group_1__0 )? )
            {
            // InternalTDsl.g:3372:1: ( ( rule__Condition__Group_1__0 )? )
            // InternalTDsl.g:3373:2: ( rule__Condition__Group_1__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_1()); 
            // InternalTDsl.g:3374:2: ( rule__Condition__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=13 && LA25_0<=14)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTDsl.g:3374:3: rule__Condition__Group_1__0
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
    // InternalTDsl.g:3383:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3387:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // InternalTDsl.g:3388:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalTDsl.g:3395:1: rule__Condition__Group_1__0__Impl : ( ( rule__Condition__OperatorAssignment_1_0 ) ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3399:1: ( ( ( rule__Condition__OperatorAssignment_1_0 ) ) )
            // InternalTDsl.g:3400:1: ( ( rule__Condition__OperatorAssignment_1_0 ) )
            {
            // InternalTDsl.g:3400:1: ( ( rule__Condition__OperatorAssignment_1_0 ) )
            // InternalTDsl.g:3401:2: ( rule__Condition__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_1_0()); 
            // InternalTDsl.g:3402:2: ( rule__Condition__OperatorAssignment_1_0 )
            // InternalTDsl.g:3402:3: rule__Condition__OperatorAssignment_1_0
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
    // InternalTDsl.g:3410:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3414:1: ( rule__Condition__Group_1__1__Impl )
            // InternalTDsl.g:3415:2: rule__Condition__Group_1__1__Impl
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
    // InternalTDsl.g:3421:1: rule__Condition__Group_1__1__Impl : ( ( rule__Condition__RightSensorAssignment_1_1 ) ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3425:1: ( ( ( rule__Condition__RightSensorAssignment_1_1 ) ) )
            // InternalTDsl.g:3426:1: ( ( rule__Condition__RightSensorAssignment_1_1 ) )
            {
            // InternalTDsl.g:3426:1: ( ( rule__Condition__RightSensorAssignment_1_1 ) )
            // InternalTDsl.g:3427:2: ( rule__Condition__RightSensorAssignment_1_1 )
            {
             before(grammarAccess.getConditionAccess().getRightSensorAssignment_1_1()); 
            // InternalTDsl.g:3428:2: ( rule__Condition__RightSensorAssignment_1_1 )
            // InternalTDsl.g:3428:3: rule__Condition__RightSensorAssignment_1_1
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
    // InternalTDsl.g:3437:1: rule__ArithmeticExpression__Group__0 : rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1 ;
    public final void rule__ArithmeticExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3441:1: ( rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1 )
            // InternalTDsl.g:3442:2: rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalTDsl.g:3449:1: rule__ArithmeticExpression__Group__0__Impl : ( ( rule__ArithmeticExpression__LeftAssignment_0 ) ) ;
    public final void rule__ArithmeticExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3453:1: ( ( ( rule__ArithmeticExpression__LeftAssignment_0 ) ) )
            // InternalTDsl.g:3454:1: ( ( rule__ArithmeticExpression__LeftAssignment_0 ) )
            {
            // InternalTDsl.g:3454:1: ( ( rule__ArithmeticExpression__LeftAssignment_0 ) )
            // InternalTDsl.g:3455:2: ( rule__ArithmeticExpression__LeftAssignment_0 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getLeftAssignment_0()); 
            // InternalTDsl.g:3456:2: ( rule__ArithmeticExpression__LeftAssignment_0 )
            // InternalTDsl.g:3456:3: rule__ArithmeticExpression__LeftAssignment_0
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
    // InternalTDsl.g:3464:1: rule__ArithmeticExpression__Group__1 : rule__ArithmeticExpression__Group__1__Impl ;
    public final void rule__ArithmeticExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3468:1: ( rule__ArithmeticExpression__Group__1__Impl )
            // InternalTDsl.g:3469:2: rule__ArithmeticExpression__Group__1__Impl
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
    // InternalTDsl.g:3475:1: rule__ArithmeticExpression__Group__1__Impl : ( ( rule__ArithmeticExpression__Group_1__0 )? ) ;
    public final void rule__ArithmeticExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3479:1: ( ( ( rule__ArithmeticExpression__Group_1__0 )? ) )
            // InternalTDsl.g:3480:1: ( ( rule__ArithmeticExpression__Group_1__0 )? )
            {
            // InternalTDsl.g:3480:1: ( ( rule__ArithmeticExpression__Group_1__0 )? )
            // InternalTDsl.g:3481:2: ( rule__ArithmeticExpression__Group_1__0 )?
            {
             before(grammarAccess.getArithmeticExpressionAccess().getGroup_1()); 
            // InternalTDsl.g:3482:2: ( rule__ArithmeticExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15||(LA26_0>=17 && LA26_0<=19)) ) {
                alt26=1;
            }
            else if ( (LA26_0==16) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==RULE_INT||LA26_2==16) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalTDsl.g:3482:3: rule__ArithmeticExpression__Group_1__0
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
    // InternalTDsl.g:3491:1: rule__ArithmeticExpression__Group_1__0 : rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1 ;
    public final void rule__ArithmeticExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3495:1: ( rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1 )
            // InternalTDsl.g:3496:2: rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalTDsl.g:3503:1: rule__ArithmeticExpression__Group_1__0__Impl : ( ( rule__ArithmeticExpression__OperatorAssignment_1_0 ) ) ;
    public final void rule__ArithmeticExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3507:1: ( ( ( rule__ArithmeticExpression__OperatorAssignment_1_0 ) ) )
            // InternalTDsl.g:3508:1: ( ( rule__ArithmeticExpression__OperatorAssignment_1_0 ) )
            {
            // InternalTDsl.g:3508:1: ( ( rule__ArithmeticExpression__OperatorAssignment_1_0 ) )
            // InternalTDsl.g:3509:2: ( rule__ArithmeticExpression__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getOperatorAssignment_1_0()); 
            // InternalTDsl.g:3510:2: ( rule__ArithmeticExpression__OperatorAssignment_1_0 )
            // InternalTDsl.g:3510:3: rule__ArithmeticExpression__OperatorAssignment_1_0
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
    // InternalTDsl.g:3518:1: rule__ArithmeticExpression__Group_1__1 : rule__ArithmeticExpression__Group_1__1__Impl ;
    public final void rule__ArithmeticExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3522:1: ( rule__ArithmeticExpression__Group_1__1__Impl )
            // InternalTDsl.g:3523:2: rule__ArithmeticExpression__Group_1__1__Impl
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
    // InternalTDsl.g:3529:1: rule__ArithmeticExpression__Group_1__1__Impl : ( ( rule__ArithmeticExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ArithmeticExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3533:1: ( ( ( rule__ArithmeticExpression__RightAssignment_1_1 ) ) )
            // InternalTDsl.g:3534:1: ( ( rule__ArithmeticExpression__RightAssignment_1_1 ) )
            {
            // InternalTDsl.g:3534:1: ( ( rule__ArithmeticExpression__RightAssignment_1_1 ) )
            // InternalTDsl.g:3535:2: ( rule__ArithmeticExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getRightAssignment_1_1()); 
            // InternalTDsl.g:3536:2: ( rule__ArithmeticExpression__RightAssignment_1_1 )
            // InternalTDsl.g:3536:3: rule__ArithmeticExpression__RightAssignment_1_1
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
    // InternalTDsl.g:3545:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3549:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // InternalTDsl.g:3550:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalTDsl.g:3557:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3561:1: ( ( ( '-' )? ) )
            // InternalTDsl.g:3562:1: ( ( '-' )? )
            {
            // InternalTDsl.g:3562:1: ( ( '-' )? )
            // InternalTDsl.g:3563:2: ( '-' )?
            {
             before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalTDsl.g:3564:2: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTDsl.g:3564:3: '-'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalTDsl.g:3572:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3576:1: ( rule__EIntegerObject__Group__1__Impl )
            // InternalTDsl.g:3577:2: rule__EIntegerObject__Group__1__Impl
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
    // InternalTDsl.g:3583:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3587:1: ( ( RULE_INT ) )
            // InternalTDsl.g:3588:1: ( RULE_INT )
            {
            // InternalTDsl.g:3588:1: ( RULE_INT )
            // InternalTDsl.g:3589:2: RULE_INT
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


    // $ANTLR start "rule__State_Horizontal_Sensor__Group_1__0"
    // InternalTDsl.g:3599:1: rule__State_Horizontal_Sensor__Group_1__0 : rule__State_Horizontal_Sensor__Group_1__0__Impl rule__State_Horizontal_Sensor__Group_1__1 ;
    public final void rule__State_Horizontal_Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3603:1: ( rule__State_Horizontal_Sensor__Group_1__0__Impl rule__State_Horizontal_Sensor__Group_1__1 )
            // InternalTDsl.g:3604:2: rule__State_Horizontal_Sensor__Group_1__0__Impl rule__State_Horizontal_Sensor__Group_1__1
            {
            pushFollow(FOLLOW_47);
            rule__State_Horizontal_Sensor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State_Horizontal_Sensor__Group_1__1();

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
    // $ANTLR end "rule__State_Horizontal_Sensor__Group_1__0"


    // $ANTLR start "rule__State_Horizontal_Sensor__Group_1__0__Impl"
    // InternalTDsl.g:3611:1: rule__State_Horizontal_Sensor__Group_1__0__Impl : ( 'no' ) ;
    public final void rule__State_Horizontal_Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3615:1: ( ( 'no' ) )
            // InternalTDsl.g:3616:1: ( 'no' )
            {
            // InternalTDsl.g:3616:1: ( 'no' )
            // InternalTDsl.g:3617:2: 'no'
            {
             before(grammarAccess.getState_Horizontal_SensorAccess().getNoKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getState_Horizontal_SensorAccess().getNoKeyword_1_0()); 

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
    // $ANTLR end "rule__State_Horizontal_Sensor__Group_1__0__Impl"


    // $ANTLR start "rule__State_Horizontal_Sensor__Group_1__1"
    // InternalTDsl.g:3626:1: rule__State_Horizontal_Sensor__Group_1__1 : rule__State_Horizontal_Sensor__Group_1__1__Impl ;
    public final void rule__State_Horizontal_Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3630:1: ( rule__State_Horizontal_Sensor__Group_1__1__Impl )
            // InternalTDsl.g:3631:2: rule__State_Horizontal_Sensor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State_Horizontal_Sensor__Group_1__1__Impl();

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
    // $ANTLR end "rule__State_Horizontal_Sensor__Group_1__1"


    // $ANTLR start "rule__State_Horizontal_Sensor__Group_1__1__Impl"
    // InternalTDsl.g:3637:1: rule__State_Horizontal_Sensor__Group_1__1__Impl : ( 'proximity' ) ;
    public final void rule__State_Horizontal_Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3641:1: ( ( 'proximity' ) )
            // InternalTDsl.g:3642:1: ( 'proximity' )
            {
            // InternalTDsl.g:3642:1: ( 'proximity' )
            // InternalTDsl.g:3643:2: 'proximity'
            {
             before(grammarAccess.getState_Horizontal_SensorAccess().getProximityKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getState_Horizontal_SensorAccess().getProximityKeyword_1_1()); 

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
    // $ANTLR end "rule__State_Horizontal_Sensor__Group_1__1__Impl"


    // $ANTLR start "rule__State_Ground_Sensor__Group_1__0"
    // InternalTDsl.g:3653:1: rule__State_Ground_Sensor__Group_1__0 : rule__State_Ground_Sensor__Group_1__0__Impl rule__State_Ground_Sensor__Group_1__1 ;
    public final void rule__State_Ground_Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3657:1: ( rule__State_Ground_Sensor__Group_1__0__Impl rule__State_Ground_Sensor__Group_1__1 )
            // InternalTDsl.g:3658:2: rule__State_Ground_Sensor__Group_1__0__Impl rule__State_Ground_Sensor__Group_1__1
            {
            pushFollow(FOLLOW_47);
            rule__State_Ground_Sensor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State_Ground_Sensor__Group_1__1();

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
    // $ANTLR end "rule__State_Ground_Sensor__Group_1__0"


    // $ANTLR start "rule__State_Ground_Sensor__Group_1__0__Impl"
    // InternalTDsl.g:3665:1: rule__State_Ground_Sensor__Group_1__0__Impl : ( 'no' ) ;
    public final void rule__State_Ground_Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3669:1: ( ( 'no' ) )
            // InternalTDsl.g:3670:1: ( 'no' )
            {
            // InternalTDsl.g:3670:1: ( 'no' )
            // InternalTDsl.g:3671:2: 'no'
            {
             before(grammarAccess.getState_Ground_SensorAccess().getNoKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getState_Ground_SensorAccess().getNoKeyword_1_0()); 

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
    // $ANTLR end "rule__State_Ground_Sensor__Group_1__0__Impl"


    // $ANTLR start "rule__State_Ground_Sensor__Group_1__1"
    // InternalTDsl.g:3680:1: rule__State_Ground_Sensor__Group_1__1 : rule__State_Ground_Sensor__Group_1__1__Impl ;
    public final void rule__State_Ground_Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3684:1: ( rule__State_Ground_Sensor__Group_1__1__Impl )
            // InternalTDsl.g:3685:2: rule__State_Ground_Sensor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State_Ground_Sensor__Group_1__1__Impl();

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
    // $ANTLR end "rule__State_Ground_Sensor__Group_1__1"


    // $ANTLR start "rule__State_Ground_Sensor__Group_1__1__Impl"
    // InternalTDsl.g:3691:1: rule__State_Ground_Sensor__Group_1__1__Impl : ( 'proximity' ) ;
    public final void rule__State_Ground_Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3695:1: ( ( 'proximity' ) )
            // InternalTDsl.g:3696:1: ( 'proximity' )
            {
            // InternalTDsl.g:3696:1: ( 'proximity' )
            // InternalTDsl.g:3697:2: 'proximity'
            {
             before(grammarAccess.getState_Ground_SensorAccess().getProximityKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getState_Ground_SensorAccess().getProximityKeyword_1_1()); 

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
    // $ANTLR end "rule__State_Ground_Sensor__Group_1__1__Impl"


    // $ANTLR start "rule__HorizontalSensors__Group_0__0"
    // InternalTDsl.g:3707:1: rule__HorizontalSensors__Group_0__0 : rule__HorizontalSensors__Group_0__0__Impl rule__HorizontalSensors__Group_0__1 ;
    public final void rule__HorizontalSensors__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3711:1: ( rule__HorizontalSensors__Group_0__0__Impl rule__HorizontalSensors__Group_0__1 )
            // InternalTDsl.g:3712:2: rule__HorizontalSensors__Group_0__0__Impl rule__HorizontalSensors__Group_0__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalTDsl.g:3719:1: rule__HorizontalSensors__Group_0__0__Impl : ( 'front' ) ;
    public final void rule__HorizontalSensors__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3723:1: ( ( 'front' ) )
            // InternalTDsl.g:3724:1: ( 'front' )
            {
            // InternalTDsl.g:3724:1: ( 'front' )
            // InternalTDsl.g:3725:2: 'front'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_0_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalTDsl.g:3734:1: rule__HorizontalSensors__Group_0__1 : rule__HorizontalSensors__Group_0__1__Impl ;
    public final void rule__HorizontalSensors__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3738:1: ( rule__HorizontalSensors__Group_0__1__Impl )
            // InternalTDsl.g:3739:2: rule__HorizontalSensors__Group_0__1__Impl
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
    // InternalTDsl.g:3745:1: rule__HorizontalSensors__Group_0__1__Impl : ( 'left' ) ;
    public final void rule__HorizontalSensors__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3749:1: ( ( 'left' ) )
            // InternalTDsl.g:3750:1: ( 'left' )
            {
            // InternalTDsl.g:3750:1: ( 'left' )
            // InternalTDsl.g:3751:2: 'left'
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
    // InternalTDsl.g:3761:1: rule__HorizontalSensors__Group_1__0 : rule__HorizontalSensors__Group_1__0__Impl rule__HorizontalSensors__Group_1__1 ;
    public final void rule__HorizontalSensors__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3765:1: ( rule__HorizontalSensors__Group_1__0__Impl rule__HorizontalSensors__Group_1__1 )
            // InternalTDsl.g:3766:2: rule__HorizontalSensors__Group_1__0__Impl rule__HorizontalSensors__Group_1__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalTDsl.g:3773:1: rule__HorizontalSensors__Group_1__0__Impl : ( 'front' ) ;
    public final void rule__HorizontalSensors__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3777:1: ( ( 'front' ) )
            // InternalTDsl.g:3778:1: ( 'front' )
            {
            // InternalTDsl.g:3778:1: ( 'front' )
            // InternalTDsl.g:3779:2: 'front'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_1_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalTDsl.g:3788:1: rule__HorizontalSensors__Group_1__1 : rule__HorizontalSensors__Group_1__1__Impl ;
    public final void rule__HorizontalSensors__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3792:1: ( rule__HorizontalSensors__Group_1__1__Impl )
            // InternalTDsl.g:3793:2: rule__HorizontalSensors__Group_1__1__Impl
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
    // InternalTDsl.g:3799:1: rule__HorizontalSensors__Group_1__1__Impl : ( 'left/middle' ) ;
    public final void rule__HorizontalSensors__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3803:1: ( ( 'left/middle' ) )
            // InternalTDsl.g:3804:1: ( 'left/middle' )
            {
            // InternalTDsl.g:3804:1: ( 'left/middle' )
            // InternalTDsl.g:3805:2: 'left/middle'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getLeftMiddleKeyword_1_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalTDsl.g:3815:1: rule__HorizontalSensors__Group_2__0 : rule__HorizontalSensors__Group_2__0__Impl rule__HorizontalSensors__Group_2__1 ;
    public final void rule__HorizontalSensors__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3819:1: ( rule__HorizontalSensors__Group_2__0__Impl rule__HorizontalSensors__Group_2__1 )
            // InternalTDsl.g:3820:2: rule__HorizontalSensors__Group_2__0__Impl rule__HorizontalSensors__Group_2__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalTDsl.g:3827:1: rule__HorizontalSensors__Group_2__0__Impl : ( 'front' ) ;
    public final void rule__HorizontalSensors__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3831:1: ( ( 'front' ) )
            // InternalTDsl.g:3832:1: ( 'front' )
            {
            // InternalTDsl.g:3832:1: ( 'front' )
            // InternalTDsl.g:3833:2: 'front'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_2_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalTDsl.g:3842:1: rule__HorizontalSensors__Group_2__1 : rule__HorizontalSensors__Group_2__1__Impl ;
    public final void rule__HorizontalSensors__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3846:1: ( rule__HorizontalSensors__Group_2__1__Impl )
            // InternalTDsl.g:3847:2: rule__HorizontalSensors__Group_2__1__Impl
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
    // InternalTDsl.g:3853:1: rule__HorizontalSensors__Group_2__1__Impl : ( 'middle' ) ;
    public final void rule__HorizontalSensors__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3857:1: ( ( 'middle' ) )
            // InternalTDsl.g:3858:1: ( 'middle' )
            {
            // InternalTDsl.g:3858:1: ( 'middle' )
            // InternalTDsl.g:3859:2: 'middle'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getMiddleKeyword_2_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalTDsl.g:3869:1: rule__HorizontalSensors__Group_3__0 : rule__HorizontalSensors__Group_3__0__Impl rule__HorizontalSensors__Group_3__1 ;
    public final void rule__HorizontalSensors__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3873:1: ( rule__HorizontalSensors__Group_3__0__Impl rule__HorizontalSensors__Group_3__1 )
            // InternalTDsl.g:3874:2: rule__HorizontalSensors__Group_3__0__Impl rule__HorizontalSensors__Group_3__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalTDsl.g:3881:1: rule__HorizontalSensors__Group_3__0__Impl : ( 'front' ) ;
    public final void rule__HorizontalSensors__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3885:1: ( ( 'front' ) )
            // InternalTDsl.g:3886:1: ( 'front' )
            {
            // InternalTDsl.g:3886:1: ( 'front' )
            // InternalTDsl.g:3887:2: 'front'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_3_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalTDsl.g:3896:1: rule__HorizontalSensors__Group_3__1 : rule__HorizontalSensors__Group_3__1__Impl ;
    public final void rule__HorizontalSensors__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3900:1: ( rule__HorizontalSensors__Group_3__1__Impl )
            // InternalTDsl.g:3901:2: rule__HorizontalSensors__Group_3__1__Impl
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
    // InternalTDsl.g:3907:1: rule__HorizontalSensors__Group_3__1__Impl : ( 'right/middle' ) ;
    public final void rule__HorizontalSensors__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3911:1: ( ( 'right/middle' ) )
            // InternalTDsl.g:3912:1: ( 'right/middle' )
            {
            // InternalTDsl.g:3912:1: ( 'right/middle' )
            // InternalTDsl.g:3913:2: 'right/middle'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getRightMiddleKeyword_3_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalTDsl.g:3923:1: rule__HorizontalSensors__Group_4__0 : rule__HorizontalSensors__Group_4__0__Impl rule__HorizontalSensors__Group_4__1 ;
    public final void rule__HorizontalSensors__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3927:1: ( rule__HorizontalSensors__Group_4__0__Impl rule__HorizontalSensors__Group_4__1 )
            // InternalTDsl.g:3928:2: rule__HorizontalSensors__Group_4__0__Impl rule__HorizontalSensors__Group_4__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalTDsl.g:3935:1: rule__HorizontalSensors__Group_4__0__Impl : ( 'front' ) ;
    public final void rule__HorizontalSensors__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3939:1: ( ( 'front' ) )
            // InternalTDsl.g:3940:1: ( 'front' )
            {
            // InternalTDsl.g:3940:1: ( 'front' )
            // InternalTDsl.g:3941:2: 'front'
            {
             before(grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_4_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalTDsl.g:3950:1: rule__HorizontalSensors__Group_4__1 : rule__HorizontalSensors__Group_4__1__Impl ;
    public final void rule__HorizontalSensors__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3954:1: ( rule__HorizontalSensors__Group_4__1__Impl )
            // InternalTDsl.g:3955:2: rule__HorizontalSensors__Group_4__1__Impl
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
    // InternalTDsl.g:3961:1: rule__HorizontalSensors__Group_4__1__Impl : ( 'right' ) ;
    public final void rule__HorizontalSensors__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3965:1: ( ( 'right' ) )
            // InternalTDsl.g:3966:1: ( 'right' )
            {
            // InternalTDsl.g:3966:1: ( 'right' )
            // InternalTDsl.g:3967:2: 'right'
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
    // InternalTDsl.g:3977:1: rule__HorizontalSensors__Group_5__0 : rule__HorizontalSensors__Group_5__0__Impl rule__HorizontalSensors__Group_5__1 ;
    public final void rule__HorizontalSensors__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3981:1: ( rule__HorizontalSensors__Group_5__0__Impl rule__HorizontalSensors__Group_5__1 )
            // InternalTDsl.g:3982:2: rule__HorizontalSensors__Group_5__0__Impl rule__HorizontalSensors__Group_5__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalTDsl.g:3989:1: rule__HorizontalSensors__Group_5__0__Impl : ( 'backward' ) ;
    public final void rule__HorizontalSensors__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:3993:1: ( ( 'backward' ) )
            // InternalTDsl.g:3994:1: ( 'backward' )
            {
            // InternalTDsl.g:3994:1: ( 'backward' )
            // InternalTDsl.g:3995:2: 'backward'
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
    // InternalTDsl.g:4004:1: rule__HorizontalSensors__Group_5__1 : rule__HorizontalSensors__Group_5__1__Impl ;
    public final void rule__HorizontalSensors__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4008:1: ( rule__HorizontalSensors__Group_5__1__Impl )
            // InternalTDsl.g:4009:2: rule__HorizontalSensors__Group_5__1__Impl
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
    // InternalTDsl.g:4015:1: rule__HorizontalSensors__Group_5__1__Impl : ( 'left' ) ;
    public final void rule__HorizontalSensors__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4019:1: ( ( 'left' ) )
            // InternalTDsl.g:4020:1: ( 'left' )
            {
            // InternalTDsl.g:4020:1: ( 'left' )
            // InternalTDsl.g:4021:2: 'left'
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
    // InternalTDsl.g:4031:1: rule__HorizontalSensors__Group_6__0 : rule__HorizontalSensors__Group_6__0__Impl rule__HorizontalSensors__Group_6__1 ;
    public final void rule__HorizontalSensors__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4035:1: ( rule__HorizontalSensors__Group_6__0__Impl rule__HorizontalSensors__Group_6__1 )
            // InternalTDsl.g:4036:2: rule__HorizontalSensors__Group_6__0__Impl rule__HorizontalSensors__Group_6__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalTDsl.g:4043:1: rule__HorizontalSensors__Group_6__0__Impl : ( 'backward' ) ;
    public final void rule__HorizontalSensors__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4047:1: ( ( 'backward' ) )
            // InternalTDsl.g:4048:1: ( 'backward' )
            {
            // InternalTDsl.g:4048:1: ( 'backward' )
            // InternalTDsl.g:4049:2: 'backward'
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
    // InternalTDsl.g:4058:1: rule__HorizontalSensors__Group_6__1 : rule__HorizontalSensors__Group_6__1__Impl ;
    public final void rule__HorizontalSensors__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4062:1: ( rule__HorizontalSensors__Group_6__1__Impl )
            // InternalTDsl.g:4063:2: rule__HorizontalSensors__Group_6__1__Impl
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
    // InternalTDsl.g:4069:1: rule__HorizontalSensors__Group_6__1__Impl : ( 'right' ) ;
    public final void rule__HorizontalSensors__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4073:1: ( ( 'right' ) )
            // InternalTDsl.g:4074:1: ( 'right' )
            {
            // InternalTDsl.g:4074:1: ( 'right' )
            // InternalTDsl.g:4075:2: 'right'
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
    // InternalTDsl.g:4085:1: rule__ThymioDSL__StatementAssignment : ( ruleStatement ) ;
    public final void rule__ThymioDSL__StatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4089:1: ( ( ruleStatement ) )
            // InternalTDsl.g:4090:2: ( ruleStatement )
            {
            // InternalTDsl.g:4090:2: ( ruleStatement )
            // InternalTDsl.g:4091:3: ruleStatement
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
    // InternalTDsl.g:4100:1: rule__Statement__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Statement__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4104:1: ( ( ruleEvent ) )
            // InternalTDsl.g:4105:2: ( ruleEvent )
            {
            // InternalTDsl.g:4105:2: ( ruleEvent )
            // InternalTDsl.g:4106:3: ruleEvent
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
    // InternalTDsl.g:4115:1: rule__Statement__IfstatementAssignment_2_0 : ( ruleIfStatement ) ;
    public final void rule__Statement__IfstatementAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4119:1: ( ( ruleIfStatement ) )
            // InternalTDsl.g:4120:2: ( ruleIfStatement )
            {
            // InternalTDsl.g:4120:2: ( ruleIfStatement )
            // InternalTDsl.g:4121:3: ruleIfStatement
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
    // InternalTDsl.g:4130:1: rule__Statement__ActionAssignment_2_1 : ( ruleAction ) ;
    public final void rule__Statement__ActionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4134:1: ( ( ruleAction ) )
            // InternalTDsl.g:4135:2: ( ruleAction )
            {
            // InternalTDsl.g:4135:2: ( ruleAction )
            // InternalTDsl.g:4136:3: ruleAction
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
    // InternalTDsl.g:4145:1: rule__MovementAction__DirectionAssignment_0_1 : ( ( rule__MovementAction__DirectionAlternatives_0_1_0 ) ) ;
    public final void rule__MovementAction__DirectionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4149:1: ( ( ( rule__MovementAction__DirectionAlternatives_0_1_0 ) ) )
            // InternalTDsl.g:4150:2: ( ( rule__MovementAction__DirectionAlternatives_0_1_0 ) )
            {
            // InternalTDsl.g:4150:2: ( ( rule__MovementAction__DirectionAlternatives_0_1_0 ) )
            // InternalTDsl.g:4151:3: ( rule__MovementAction__DirectionAlternatives_0_1_0 )
            {
             before(grammarAccess.getMovementActionAccess().getDirectionAlternatives_0_1_0()); 
            // InternalTDsl.g:4152:3: ( rule__MovementAction__DirectionAlternatives_0_1_0 )
            // InternalTDsl.g:4152:4: rule__MovementAction__DirectionAlternatives_0_1_0
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
    // InternalTDsl.g:4160:1: rule__MovementAction__SpeedAssignment_0_2_2 : ( ruleArithmeticExpression ) ;
    public final void rule__MovementAction__SpeedAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4164:1: ( ( ruleArithmeticExpression ) )
            // InternalTDsl.g:4165:2: ( ruleArithmeticExpression )
            {
            // InternalTDsl.g:4165:2: ( ruleArithmeticExpression )
            // InternalTDsl.g:4166:3: ruleArithmeticExpression
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
    // InternalTDsl.g:4175:1: rule__MovementAction__DirectionAssignment_1_1 : ( ruleRightLeft ) ;
    public final void rule__MovementAction__DirectionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4179:1: ( ( ruleRightLeft ) )
            // InternalTDsl.g:4180:2: ( ruleRightLeft )
            {
            // InternalTDsl.g:4180:2: ( ruleRightLeft )
            // InternalTDsl.g:4181:3: ruleRightLeft
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


    // $ANTLR start "rule__MovementAction__DirectionAssignment_2_2"
    // InternalTDsl.g:4190:1: rule__MovementAction__DirectionAssignment_2_2 : ( ( 'driving' ) ) ;
    public final void rule__MovementAction__DirectionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4194:1: ( ( ( 'driving' ) ) )
            // InternalTDsl.g:4195:2: ( ( 'driving' ) )
            {
            // InternalTDsl.g:4195:2: ( ( 'driving' ) )
            // InternalTDsl.g:4196:3: ( 'driving' )
            {
             before(grammarAccess.getMovementActionAccess().getDirectionDrivingKeyword_2_2_0()); 
            // InternalTDsl.g:4197:3: ( 'driving' )
            // InternalTDsl.g:4198:4: 'driving'
            {
             before(grammarAccess.getMovementActionAccess().getDirectionDrivingKeyword_2_2_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getMovementActionAccess().getDirectionDrivingKeyword_2_2_0()); 

            }

             after(grammarAccess.getMovementActionAccess().getDirectionDrivingKeyword_2_2_0()); 

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
    // $ANTLR end "rule__MovementAction__DirectionAssignment_2_2"


    // $ANTLR start "rule__MovementAction__DirectionAssignment_3_2"
    // InternalTDsl.g:4209:1: rule__MovementAction__DirectionAssignment_3_2 : ( ( 'turning' ) ) ;
    public final void rule__MovementAction__DirectionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4213:1: ( ( ( 'turning' ) ) )
            // InternalTDsl.g:4214:2: ( ( 'turning' ) )
            {
            // InternalTDsl.g:4214:2: ( ( 'turning' ) )
            // InternalTDsl.g:4215:3: ( 'turning' )
            {
             before(grammarAccess.getMovementActionAccess().getDirectionTurningKeyword_3_2_0()); 
            // InternalTDsl.g:4216:3: ( 'turning' )
            // InternalTDsl.g:4217:4: 'turning'
            {
             before(grammarAccess.getMovementActionAccess().getDirectionTurningKeyword_3_2_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getMovementActionAccess().getDirectionTurningKeyword_3_2_0()); 

            }

             after(grammarAccess.getMovementActionAccess().getDirectionTurningKeyword_3_2_0()); 

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
    // $ANTLR end "rule__MovementAction__DirectionAssignment_3_2"


    // $ANTLR start "rule__SoundAction__SoundAssignment_0_2"
    // InternalTDsl.g:4228:1: rule__SoundAction__SoundAssignment_0_2 : ( ruleSound ) ;
    public final void rule__SoundAction__SoundAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4232:1: ( ( ruleSound ) )
            // InternalTDsl.g:4233:2: ( ruleSound )
            {
            // InternalTDsl.g:4233:2: ( ruleSound )
            // InternalTDsl.g:4234:3: ruleSound
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
    // InternalTDsl.g:4243:1: rule__ColorBottomAction__ColorAssignment_0_4 : ( ruleColor ) ;
    public final void rule__ColorBottomAction__ColorAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4247:1: ( ( ruleColor ) )
            // InternalTDsl.g:4248:2: ( ruleColor )
            {
            // InternalTDsl.g:4248:2: ( ruleColor )
            // InternalTDsl.g:4249:3: ruleColor
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
    // InternalTDsl.g:4258:1: rule__ColorTopAction__ColorAssignment_0_4 : ( ruleColor ) ;
    public final void rule__ColorTopAction__ColorAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4262:1: ( ( ruleColor ) )
            // InternalTDsl.g:4263:2: ( ruleColor )
            {
            // InternalTDsl.g:4263:2: ( ruleColor )
            // InternalTDsl.g:4264:3: ruleColor
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
    // InternalTDsl.g:4273:1: rule__IfStatement__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__IfStatement__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4277:1: ( ( ruleCondition ) )
            // InternalTDsl.g:4278:2: ( ruleCondition )
            {
            // InternalTDsl.g:4278:2: ( ruleCondition )
            // InternalTDsl.g:4279:3: ruleCondition
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
    // InternalTDsl.g:4288:1: rule__IfStatement__ActionAssignment_3 : ( ruleAction ) ;
    public final void rule__IfStatement__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4292:1: ( ( ruleAction ) )
            // InternalTDsl.g:4293:2: ( ruleAction )
            {
            // InternalTDsl.g:4293:2: ( ruleAction )
            // InternalTDsl.g:4294:3: ruleAction
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


    // $ANTLR start "rule__UpperEvent__ButtonAssignment_0"
    // InternalTDsl.g:4303:1: rule__UpperEvent__ButtonAssignment_0 : ( ruleButton ) ;
    public final void rule__UpperEvent__ButtonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4307:1: ( ( ruleButton ) )
            // InternalTDsl.g:4308:2: ( ruleButton )
            {
            // InternalTDsl.g:4308:2: ( ruleButton )
            // InternalTDsl.g:4309:3: ruleButton
            {
             before(grammarAccess.getUpperEventAccess().getButtonButtonParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getUpperEventAccess().getButtonButtonParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__UpperEvent__ButtonAssignment_0"


    // $ANTLR start "rule__UpperEvent__ButtonAssignment_1_1"
    // InternalTDsl.g:4318:1: rule__UpperEvent__ButtonAssignment_1_1 : ( ruleButton ) ;
    public final void rule__UpperEvent__ButtonAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4322:1: ( ( ruleButton ) )
            // InternalTDsl.g:4323:2: ( ruleButton )
            {
            // InternalTDsl.g:4323:2: ( ruleButton )
            // InternalTDsl.g:4324:3: ruleButton
            {
             before(grammarAccess.getUpperEventAccess().getButtonButtonParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getUpperEventAccess().getButtonButtonParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__UpperEvent__ButtonAssignment_1_1"


    // $ANTLR start "rule__UpperEvent__StateAssignment_3"
    // InternalTDsl.g:4333:1: rule__UpperEvent__StateAssignment_3 : ( ruleState ) ;
    public final void rule__UpperEvent__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4337:1: ( ( ruleState ) )
            // InternalTDsl.g:4338:2: ( ruleState )
            {
            // InternalTDsl.g:4338:2: ( ruleState )
            // InternalTDsl.g:4339:3: ruleState
            {
             before(grammarAccess.getUpperEventAccess().getStateStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getUpperEventAccess().getStateStateParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__UpperEvent__StateAssignment_3"


    // $ANTLR start "rule__Button__NameAssignment"
    // InternalTDsl.g:4348:1: rule__Button__NameAssignment : ( ruleButtons ) ;
    public final void rule__Button__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4352:1: ( ( ruleButtons ) )
            // InternalTDsl.g:4353:2: ( ruleButtons )
            {
            // InternalTDsl.g:4353:2: ( ruleButtons )
            // InternalTDsl.g:4354:3: ruleButtons
            {
             before(grammarAccess.getButtonAccess().getNameButtonsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleButtons();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getNameButtonsParserRuleCall_0()); 

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
    // $ANTLR end "rule__Button__NameAssignment"


    // $ANTLR start "rule__ProxEvent__SensorAssignment"
    // InternalTDsl.g:4363:1: rule__ProxEvent__SensorAssignment : ( ruleSensor ) ;
    public final void rule__ProxEvent__SensorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4367:1: ( ( ruleSensor ) )
            // InternalTDsl.g:4368:2: ( ruleSensor )
            {
            // InternalTDsl.g:4368:2: ( ruleSensor )
            // InternalTDsl.g:4369:3: ruleSensor
            {
             before(grammarAccess.getProxEventAccess().getSensorSensorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getProxEventAccess().getSensorSensorParserRuleCall_0()); 

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
    // $ANTLR end "rule__ProxEvent__SensorAssignment"


    // $ANTLR start "rule__Sensor__DirectionAssignment_0_0"
    // InternalTDsl.g:4378:1: rule__Sensor__DirectionAssignment_0_0 : ( ruleHorizontalSensors ) ;
    public final void rule__Sensor__DirectionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4382:1: ( ( ruleHorizontalSensors ) )
            // InternalTDsl.g:4383:2: ( ruleHorizontalSensors )
            {
            // InternalTDsl.g:4383:2: ( ruleHorizontalSensors )
            // InternalTDsl.g:4384:3: ruleHorizontalSensors
            {
             before(grammarAccess.getSensorAccess().getDirectionHorizontalSensorsParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHorizontalSensors();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getDirectionHorizontalSensorsParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Sensor__DirectionAssignment_0_0"


    // $ANTLR start "rule__Sensor__Sensor_typeAssignment_0_1"
    // InternalTDsl.g:4393:1: rule__Sensor__Sensor_typeAssignment_0_1 : ( ( 'horizontal' ) ) ;
    public final void rule__Sensor__Sensor_typeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4397:1: ( ( ( 'horizontal' ) ) )
            // InternalTDsl.g:4398:2: ( ( 'horizontal' ) )
            {
            // InternalTDsl.g:4398:2: ( ( 'horizontal' ) )
            // InternalTDsl.g:4399:3: ( 'horizontal' )
            {
             before(grammarAccess.getSensorAccess().getSensor_typeHorizontalKeyword_0_1_0()); 
            // InternalTDsl.g:4400:3: ( 'horizontal' )
            // InternalTDsl.g:4401:4: 'horizontal'
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


    // $ANTLR start "rule__Sensor__StateAssignment_0_4"
    // InternalTDsl.g:4412:1: rule__Sensor__StateAssignment_0_4 : ( ruleState_Horizontal_Sensor ) ;
    public final void rule__Sensor__StateAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4416:1: ( ( ruleState_Horizontal_Sensor ) )
            // InternalTDsl.g:4417:2: ( ruleState_Horizontal_Sensor )
            {
            // InternalTDsl.g:4417:2: ( ruleState_Horizontal_Sensor )
            // InternalTDsl.g:4418:3: ruleState_Horizontal_Sensor
            {
             before(grammarAccess.getSensorAccess().getStateState_Horizontal_SensorParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleState_Horizontal_Sensor();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getStateState_Horizontal_SensorParserRuleCall_0_4_0()); 

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
    // $ANTLR end "rule__Sensor__StateAssignment_0_4"


    // $ANTLR start "rule__Sensor__DirectionAssignment_1_0"
    // InternalTDsl.g:4427:1: rule__Sensor__DirectionAssignment_1_0 : ( ruleRightLeft ) ;
    public final void rule__Sensor__DirectionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4431:1: ( ( ruleRightLeft ) )
            // InternalTDsl.g:4432:2: ( ruleRightLeft )
            {
            // InternalTDsl.g:4432:2: ( ruleRightLeft )
            // InternalTDsl.g:4433:3: ruleRightLeft
            {
             before(grammarAccess.getSensorAccess().getDirectionRightLeftParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRightLeft();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getDirectionRightLeftParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Sensor__DirectionAssignment_1_0"


    // $ANTLR start "rule__Sensor__Sensor_typeAssignment_1_1"
    // InternalTDsl.g:4442:1: rule__Sensor__Sensor_typeAssignment_1_1 : ( ( 'ground' ) ) ;
    public final void rule__Sensor__Sensor_typeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4446:1: ( ( ( 'ground' ) ) )
            // InternalTDsl.g:4447:2: ( ( 'ground' ) )
            {
            // InternalTDsl.g:4447:2: ( ( 'ground' ) )
            // InternalTDsl.g:4448:3: ( 'ground' )
            {
             before(grammarAccess.getSensorAccess().getSensor_typeGroundKeyword_1_1_0()); 
            // InternalTDsl.g:4449:3: ( 'ground' )
            // InternalTDsl.g:4450:4: 'ground'
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


    // $ANTLR start "rule__Sensor__StateAssignment_1_4"
    // InternalTDsl.g:4461:1: rule__Sensor__StateAssignment_1_4 : ( ruleState_Ground_Sensor ) ;
    public final void rule__Sensor__StateAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4465:1: ( ( ruleState_Ground_Sensor ) )
            // InternalTDsl.g:4466:2: ( ruleState_Ground_Sensor )
            {
            // InternalTDsl.g:4466:2: ( ruleState_Ground_Sensor )
            // InternalTDsl.g:4467:3: ruleState_Ground_Sensor
            {
             before(grammarAccess.getSensorAccess().getStateState_Ground_SensorParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleState_Ground_Sensor();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getStateState_Ground_SensorParserRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__Sensor__StateAssignment_1_4"


    // $ANTLR start "rule__Condition__LeftSensorAssignment_0"
    // InternalTDsl.g:4476:1: rule__Condition__LeftSensorAssignment_0 : ( ruleSensor ) ;
    public final void rule__Condition__LeftSensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4480:1: ( ( ruleSensor ) )
            // InternalTDsl.g:4481:2: ( ruleSensor )
            {
            // InternalTDsl.g:4481:2: ( ruleSensor )
            // InternalTDsl.g:4482:3: ruleSensor
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
    // InternalTDsl.g:4491:1: rule__Condition__OperatorAssignment_1_0 : ( ( rule__Condition__OperatorAlternatives_1_0_0 ) ) ;
    public final void rule__Condition__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4495:1: ( ( ( rule__Condition__OperatorAlternatives_1_0_0 ) ) )
            // InternalTDsl.g:4496:2: ( ( rule__Condition__OperatorAlternatives_1_0_0 ) )
            {
            // InternalTDsl.g:4496:2: ( ( rule__Condition__OperatorAlternatives_1_0_0 ) )
            // InternalTDsl.g:4497:3: ( rule__Condition__OperatorAlternatives_1_0_0 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAlternatives_1_0_0()); 
            // InternalTDsl.g:4498:3: ( rule__Condition__OperatorAlternatives_1_0_0 )
            // InternalTDsl.g:4498:4: rule__Condition__OperatorAlternatives_1_0_0
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
    // InternalTDsl.g:4506:1: rule__Condition__RightSensorAssignment_1_1 : ( ruleSensor ) ;
    public final void rule__Condition__RightSensorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4510:1: ( ( ruleSensor ) )
            // InternalTDsl.g:4511:2: ( ruleSensor )
            {
            // InternalTDsl.g:4511:2: ( ruleSensor )
            // InternalTDsl.g:4512:3: ruleSensor
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
    // InternalTDsl.g:4521:1: rule__ArithmeticExpression__LeftAssignment_0 : ( ruleEIntegerObject ) ;
    public final void rule__ArithmeticExpression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4525:1: ( ( ruleEIntegerObject ) )
            // InternalTDsl.g:4526:2: ( ruleEIntegerObject )
            {
            // InternalTDsl.g:4526:2: ( ruleEIntegerObject )
            // InternalTDsl.g:4527:3: ruleEIntegerObject
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
    // InternalTDsl.g:4536:1: rule__ArithmeticExpression__OperatorAssignment_1_0 : ( ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 ) ) ;
    public final void rule__ArithmeticExpression__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4540:1: ( ( ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 ) ) )
            // InternalTDsl.g:4541:2: ( ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 ) )
            {
            // InternalTDsl.g:4541:2: ( ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 ) )
            // InternalTDsl.g:4542:3: ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getOperatorAlternatives_1_0_0()); 
            // InternalTDsl.g:4543:3: ( rule__ArithmeticExpression__OperatorAlternatives_1_0_0 )
            // InternalTDsl.g:4543:4: rule__ArithmeticExpression__OperatorAlternatives_1_0_0
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
    // InternalTDsl.g:4551:1: rule__ArithmeticExpression__RightAssignment_1_1 : ( ruleEIntegerObject ) ;
    public final void rule__ArithmeticExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTDsl.g:4555:1: ( ( ruleEIntegerObject ) )
            // InternalTDsl.g:4556:2: ( ruleEIntegerObject )
            {
            // InternalTDsl.g:4556:2: ( ruleEIntegerObject )
            // InternalTDsl.g:4557:3: ruleEIntegerObject
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


    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\14\2\42\7\uffff";
    static final String dfa_3s = "\1\102\1\105\1\43\7\uffff";
    static final String dfa_4s = "\3\uffff\1\1\1\3\1\5\1\2\1\4\1\7\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\65\uffff\1\1",
            "\1\5\1\3\37\uffff\1\6\1\4\1\7",
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

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1212:1: rule__HorizontalSensors__Alternatives : ( ( ( rule__HorizontalSensors__Group_0__0 ) ) | ( ( rule__HorizontalSensors__Group_1__0 ) ) | ( ( rule__HorizontalSensors__Group_2__0 ) ) | ( ( rule__HorizontalSensors__Group_3__0 ) ) | ( ( rule__HorizontalSensors__Group_4__0 ) ) | ( ( rule__HorizontalSensors__Group_5__0 ) ) | ( ( rule__HorizontalSensors__Group_6__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0200000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0200000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x8000000E00001800L,0x0000000000000005L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0004E40000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000C00001000L,0x0000000000000004L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000640000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000FF00000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1000000000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000E00001800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000101800000L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000400000000L});

}