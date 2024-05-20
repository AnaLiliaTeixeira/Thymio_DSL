package org.xtext.project.tdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.project.tdsl.services.TDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'-'", "'drive'", "'forward'", "'backward'", "'with'", "'speed'", "'turn'", "'stop'", "'driving'", "'turning'", "'play'", "'sound'", "'playing'", "'set'", "'bottom'", "'color'", "'to'", "'off'", "'leds'", "'top'", "'If'", "':'", "'End'", "'if'", "'On'", "'and'", "'button'", "'do'", "'horizontal'", "'sensor'", "'detecting'", "'proximity'", "'no'", "'ground'", "'black'", "'white'", "'tap'", "'clap'", "'or'", "'+'", "'*'", "'/'", "'mod'", "'light'", "'dark'", "'red'", "'green'", "'blue'", "'yellow'", "'sound1'", "'sound2'", "'sound3'", "'sound4'", "'center'", "'right'", "'left'", "'touched'", "'released'", "'front'", "'left/middle'", "'middle'", "'right/middle'"
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

        public InternalTDslParser(TokenStream input, TDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ThymioDSL";
       	}

       	@Override
       	protected TDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleThymioDSL"
    // InternalTDsl.g:64:1: entryRuleThymioDSL returns [EObject current=null] : iv_ruleThymioDSL= ruleThymioDSL EOF ;
    public final EObject entryRuleThymioDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThymioDSL = null;


        try {
            // InternalTDsl.g:64:50: (iv_ruleThymioDSL= ruleThymioDSL EOF )
            // InternalTDsl.g:65:2: iv_ruleThymioDSL= ruleThymioDSL EOF
            {
             newCompositeNode(grammarAccess.getThymioDSLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThymioDSL=ruleThymioDSL();

            state._fsp--;

             current =iv_ruleThymioDSL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThymioDSL"


    // $ANTLR start "ruleThymioDSL"
    // InternalTDsl.g:71:1: ruleThymioDSL returns [EObject current=null] : ( (lv_statement_0_0= ruleStatement ) )* ;
    public final EObject ruleThymioDSL() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:77:2: ( ( (lv_statement_0_0= ruleStatement ) )* )
            // InternalTDsl.g:78:2: ( (lv_statement_0_0= ruleStatement ) )*
            {
            // InternalTDsl.g:78:2: ( (lv_statement_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTDsl.g:79:3: (lv_statement_0_0= ruleStatement )
            	    {
            	    // InternalTDsl.g:79:3: (lv_statement_0_0= ruleStatement )
            	    // InternalTDsl.g:80:4: lv_statement_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getThymioDSLAccess().getStatementStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statement_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getThymioDSLRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statement",
            	    					lv_statement_0_0,
            	    					"org.xtext.project.tdsl.TDsl.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThymioDSL"


    // $ANTLR start "entryRuleStatement"
    // InternalTDsl.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTDsl.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTDsl.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTDsl.g:107:1: ruleStatement returns [EObject current=null] : (otherlv_0= '->' ( (lv_event_1_0= ruleEvent ) ) ( ( (lv_ifstatement_2_0= ruleIfStatement ) ) | ( (lv_action_3_0= ruleAction ) ) )+ ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_event_1_0 = null;

        EObject lv_ifstatement_2_0 = null;

        EObject lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:113:2: ( (otherlv_0= '->' ( (lv_event_1_0= ruleEvent ) ) ( ( (lv_ifstatement_2_0= ruleIfStatement ) ) | ( (lv_action_3_0= ruleAction ) ) )+ ) )
            // InternalTDsl.g:114:2: (otherlv_0= '->' ( (lv_event_1_0= ruleEvent ) ) ( ( (lv_ifstatement_2_0= ruleIfStatement ) ) | ( (lv_action_3_0= ruleAction ) ) )+ )
            {
            // InternalTDsl.g:114:2: (otherlv_0= '->' ( (lv_event_1_0= ruleEvent ) ) ( ( (lv_ifstatement_2_0= ruleIfStatement ) ) | ( (lv_action_3_0= ruleAction ) ) )+ )
            // InternalTDsl.g:115:3: otherlv_0= '->' ( (lv_event_1_0= ruleEvent ) ) ( ( (lv_ifstatement_2_0= ruleIfStatement ) ) | ( (lv_action_3_0= ruleAction ) ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalTDsl.g:119:3: ( (lv_event_1_0= ruleEvent ) )
            // InternalTDsl.g:120:4: (lv_event_1_0= ruleEvent )
            {
            // InternalTDsl.g:120:4: (lv_event_1_0= ruleEvent )
            // InternalTDsl.g:121:5: lv_event_1_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_event_1_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_1_0,
            						"org.xtext.project.tdsl.TDsl.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTDsl.g:138:3: ( ( (lv_ifstatement_2_0= ruleIfStatement ) ) | ( (lv_action_3_0= ruleAction ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==32) ) {
                    alt2=1;
                }
                else if ( (LA2_0==12) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTDsl.g:139:4: ( (lv_ifstatement_2_0= ruleIfStatement ) )
            	    {
            	    // InternalTDsl.g:139:4: ( (lv_ifstatement_2_0= ruleIfStatement ) )
            	    // InternalTDsl.g:140:5: (lv_ifstatement_2_0= ruleIfStatement )
            	    {
            	    // InternalTDsl.g:140:5: (lv_ifstatement_2_0= ruleIfStatement )
            	    // InternalTDsl.g:141:6: lv_ifstatement_2_0= ruleIfStatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatementAccess().getIfstatementIfStatementParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_ifstatement_2_0=ruleIfStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ifstatement",
            	    							lv_ifstatement_2_0,
            	    							"org.xtext.project.tdsl.TDsl.IfStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTDsl.g:159:4: ( (lv_action_3_0= ruleAction ) )
            	    {
            	    // InternalTDsl.g:159:4: ( (lv_action_3_0= ruleAction ) )
            	    // InternalTDsl.g:160:5: (lv_action_3_0= ruleAction )
            	    {
            	    // InternalTDsl.g:160:5: (lv_action_3_0= ruleAction )
            	    // InternalTDsl.g:161:6: lv_action_3_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getStatementAccess().getActionActionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_action_3_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_3_0,
            	    							"org.xtext.project.tdsl.TDsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEvent"
    // InternalTDsl.g:183:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalTDsl.g:183:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalTDsl.g:184:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalTDsl.g:190:1: ruleEvent returns [EObject current=null] : (this_UpperEvent_0= ruleUpperEvent | this_ProxEvent_1= ruleProxEvent | this_TapEvent_2= ruleTapEvent | this_ClapEvent_3= ruleClapEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_UpperEvent_0 = null;

        EObject this_ProxEvent_1 = null;

        EObject this_TapEvent_2 = null;

        EObject this_ClapEvent_3 = null;



        	enterRule();

        try {
            // InternalTDsl.g:196:2: ( (this_UpperEvent_0= ruleUpperEvent | this_ProxEvent_1= ruleProxEvent | this_TapEvent_2= ruleTapEvent | this_ClapEvent_3= ruleClapEvent ) )
            // InternalTDsl.g:197:2: (this_UpperEvent_0= ruleUpperEvent | this_ProxEvent_1= ruleProxEvent | this_TapEvent_2= ruleTapEvent | this_ClapEvent_3= ruleClapEvent )
            {
            // InternalTDsl.g:197:2: (this_UpperEvent_0= ruleUpperEvent | this_ProxEvent_1= ruleProxEvent | this_TapEvent_2= ruleTapEvent | this_ClapEvent_3= ruleClapEvent )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
                switch ( input.LA(2) ) {
                case 48:
                    {
                    alt3=3;
                    }
                    break;
                case 49:
                    {
                    alt3=4;
                    }
                    break;
                case 14:
                case 65:
                    {
                    alt3=1;
                    }
                    break;
                case 66:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==45) ) {
                        alt3=2;
                    }
                    else if ( ((LA3_5>=37 && LA3_5<=38)) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 67:
                    {
                    int LA3_6 = input.LA(3);

                    if ( ((LA3_6>=37 && LA3_6<=38)) ) {
                        alt3=1;
                    }
                    else if ( (LA3_6==45) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 15:
                    {
                    int LA3_7 = input.LA(3);

                    if ( ((LA3_7>=66 && LA3_7<=67)) ) {
                        alt3=2;
                    }
                    else if ( ((LA3_7>=37 && LA3_7<=38)) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 70:
                    {
                    alt3=2;
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
                    // InternalTDsl.g:198:3: this_UpperEvent_0= ruleUpperEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getUpperEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpperEvent_0=ruleUpperEvent();

                    state._fsp--;


                    			current = this_UpperEvent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:207:3: this_ProxEvent_1= ruleProxEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getProxEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProxEvent_1=ruleProxEvent();

                    state._fsp--;


                    			current = this_ProxEvent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:216:3: this_TapEvent_2= ruleTapEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getTapEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TapEvent_2=ruleTapEvent();

                    state._fsp--;


                    			current = this_TapEvent_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:225:3: this_ClapEvent_3= ruleClapEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getClapEventParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClapEvent_3=ruleClapEvent();

                    state._fsp--;


                    			current = this_ClapEvent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAction"
    // InternalTDsl.g:237:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalTDsl.g:237:47: (iv_ruleAction= ruleAction EOF )
            // InternalTDsl.g:238:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalTDsl.g:244:1: ruleAction returns [EObject current=null] : (otherlv_0= '-' (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_MovementAction_1 = null;

        EObject this_SoundAction_2 = null;

        EObject this_ColorBottomAction_3 = null;

        EObject this_ColorTopAction_4 = null;



        	enterRule();

        try {
            // InternalTDsl.g:250:2: ( (otherlv_0= '-' (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction ) ) )
            // InternalTDsl.g:251:2: (otherlv_0= '-' (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction ) )
            {
            // InternalTDsl.g:251:2: (otherlv_0= '-' (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction ) )
            // InternalTDsl.g:252:3: otherlv_0= '-' (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getHyphenMinusKeyword_0());
            		
            // InternalTDsl.g:256:3: (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==29) ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==31) ) {
                        alt4=4;
                    }
                    else if ( (LA4_6==26) ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else if ( ((LA4_2>=66 && LA4_2<=67)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA4_3 = input.LA(2);

                if ( ((LA4_3>=20 && LA4_3<=21)) ) {
                    alt4=1;
                }
                else if ( (LA4_3==24) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==31) ) {
                    alt4=4;
                }
                else if ( (LA4_5==26) ) {
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
                    // InternalTDsl.g:257:4: this_MovementAction_1= ruleMovementAction
                    {

                    				newCompositeNode(grammarAccess.getActionAccess().getMovementActionParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_MovementAction_1=ruleMovementAction();

                    state._fsp--;


                    				current = this_MovementAction_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:266:4: this_SoundAction_2= ruleSoundAction
                    {

                    				newCompositeNode(grammarAccess.getActionAccess().getSoundActionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_SoundAction_2=ruleSoundAction();

                    state._fsp--;


                    				current = this_SoundAction_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:275:4: this_ColorBottomAction_3= ruleColorBottomAction
                    {

                    				newCompositeNode(grammarAccess.getActionAccess().getColorBottomActionParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_ColorBottomAction_3=ruleColorBottomAction();

                    state._fsp--;


                    				current = this_ColorBottomAction_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:284:4: this_ColorTopAction_4= ruleColorTopAction
                    {

                    				newCompositeNode(grammarAccess.getActionAccess().getColorTopActionParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_ColorTopAction_4=ruleColorTopAction();

                    state._fsp--;


                    				current = this_ColorTopAction_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleMovementAction"
    // InternalTDsl.g:297:1: entryRuleMovementAction returns [EObject current=null] : iv_ruleMovementAction= ruleMovementAction EOF ;
    public final EObject entryRuleMovementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovementAction = null;


        try {
            // InternalTDsl.g:297:55: (iv_ruleMovementAction= ruleMovementAction EOF )
            // InternalTDsl.g:298:2: iv_ruleMovementAction= ruleMovementAction EOF
            {
             newCompositeNode(grammarAccess.getMovementActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovementAction=ruleMovementAction();

            state._fsp--;

             current =iv_ruleMovementAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMovementAction"


    // $ANTLR start "ruleMovementAction"
    // InternalTDsl.g:304:1: ruleMovementAction returns [EObject current=null] : ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' otherlv_9= 'driving' ) | ( () otherlv_11= 'stop' otherlv_12= 'turning' ) ) ;
    public final EObject ruleMovementAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_direction_1_1=null;
        Token lv_direction_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_speed_4_0 = null;

        AntlrDatatypeRuleToken lv_direction_6_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:310:2: ( ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' otherlv_9= 'driving' ) | ( () otherlv_11= 'stop' otherlv_12= 'turning' ) ) )
            // InternalTDsl.g:311:2: ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' otherlv_9= 'driving' ) | ( () otherlv_11= 'stop' otherlv_12= 'turning' ) )
            {
            // InternalTDsl.g:311:2: ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' otherlv_9= 'driving' ) | ( () otherlv_11= 'stop' otherlv_12= 'turning' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==21) ) {
                    alt7=4;
                }
                else if ( (LA7_3==20) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTDsl.g:312:3: (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? )
                    {
                    // InternalTDsl.g:312:3: (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? )
                    // InternalTDsl.g:313:4: otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )?
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getMovementActionAccess().getDriveKeyword_0_0());
                    			
                    // InternalTDsl.g:317:4: ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) )
                    // InternalTDsl.g:318:5: ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) )
                    {
                    // InternalTDsl.g:318:5: ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) )
                    // InternalTDsl.g:319:6: (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' )
                    {
                    // InternalTDsl.g:319:6: (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==14) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==15) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalTDsl.g:320:7: lv_direction_1_1= 'forward'
                            {
                            lv_direction_1_1=(Token)match(input,14,FOLLOW_9); 

                            							newLeafNode(lv_direction_1_1, grammarAccess.getMovementActionAccess().getDirectionForwardKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMovementActionRule());
                            							}
                            							setWithLastConsumed(current, "direction", lv_direction_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTDsl.g:331:7: lv_direction_1_2= 'backward'
                            {
                            lv_direction_1_2=(Token)match(input,15,FOLLOW_9); 

                            							newLeafNode(lv_direction_1_2, grammarAccess.getMovementActionAccess().getDirectionBackwardKeyword_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMovementActionRule());
                            							}
                            							setWithLastConsumed(current, "direction", lv_direction_1_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalTDsl.g:344:4: (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==16) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalTDsl.g:345:5: otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) )
                            {
                            otherlv_2=(Token)match(input,16,FOLLOW_10); 

                            					newLeafNode(otherlv_2, grammarAccess.getMovementActionAccess().getWithKeyword_0_2_0());
                            				
                            otherlv_3=(Token)match(input,17,FOLLOW_11); 

                            					newLeafNode(otherlv_3, grammarAccess.getMovementActionAccess().getSpeedKeyword_0_2_1());
                            				
                            // InternalTDsl.g:353:5: ( (lv_speed_4_0= ruleArithmeticExpression ) )
                            // InternalTDsl.g:354:6: (lv_speed_4_0= ruleArithmeticExpression )
                            {
                            // InternalTDsl.g:354:6: (lv_speed_4_0= ruleArithmeticExpression )
                            // InternalTDsl.g:355:7: lv_speed_4_0= ruleArithmeticExpression
                            {

                            							newCompositeNode(grammarAccess.getMovementActionAccess().getSpeedArithmeticExpressionParserRuleCall_0_2_2_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_speed_4_0=ruleArithmeticExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMovementActionRule());
                            							}
                            							set(
                            								current,
                            								"speed",
                            								lv_speed_4_0,
                            								"org.xtext.project.tdsl.TDsl.ArithmeticExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:375:3: (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) )
                    {
                    // InternalTDsl.g:375:3: (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) )
                    // InternalTDsl.g:376:4: otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getMovementActionAccess().getTurnKeyword_1_0());
                    			
                    // InternalTDsl.g:380:4: ( (lv_direction_6_0= ruleRightLeft ) )
                    // InternalTDsl.g:381:5: (lv_direction_6_0= ruleRightLeft )
                    {
                    // InternalTDsl.g:381:5: (lv_direction_6_0= ruleRightLeft )
                    // InternalTDsl.g:382:6: lv_direction_6_0= ruleRightLeft
                    {

                    						newCompositeNode(grammarAccess.getMovementActionAccess().getDirectionRightLeftParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_direction_6_0=ruleRightLeft();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMovementActionRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_6_0,
                    							"org.xtext.project.tdsl.TDsl.RightLeft");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:401:3: ( () otherlv_8= 'stop' otherlv_9= 'driving' )
                    {
                    // InternalTDsl.g:401:3: ( () otherlv_8= 'stop' otherlv_9= 'driving' )
                    // InternalTDsl.g:402:4: () otherlv_8= 'stop' otherlv_9= 'driving'
                    {
                    // InternalTDsl.g:402:4: ()
                    // InternalTDsl.g:403:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMovementActionAccess().getMovementActionAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getMovementActionAccess().getStopKeyword_2_1());
                    			
                    otherlv_9=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getMovementActionAccess().getDrivingKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:419:3: ( () otherlv_11= 'stop' otherlv_12= 'turning' )
                    {
                    // InternalTDsl.g:419:3: ( () otherlv_11= 'stop' otherlv_12= 'turning' )
                    // InternalTDsl.g:420:4: () otherlv_11= 'stop' otherlv_12= 'turning'
                    {
                    // InternalTDsl.g:420:4: ()
                    // InternalTDsl.g:421:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMovementActionAccess().getMovementActionAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getMovementActionAccess().getStopKeyword_3_1());
                    			
                    otherlv_12=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getMovementActionAccess().getTurningKeyword_3_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMovementAction"


    // $ANTLR start "entryRuleSoundAction"
    // InternalTDsl.g:440:1: entryRuleSoundAction returns [EObject current=null] : iv_ruleSoundAction= ruleSoundAction EOF ;
    public final EObject entryRuleSoundAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoundAction = null;


        try {
            // InternalTDsl.g:440:52: (iv_ruleSoundAction= ruleSoundAction EOF )
            // InternalTDsl.g:441:2: iv_ruleSoundAction= ruleSoundAction EOF
            {
             newCompositeNode(grammarAccess.getSoundActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoundAction=ruleSoundAction();

            state._fsp--;

             current =iv_ruleSoundAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSoundAction"


    // $ANTLR start "ruleSoundAction"
    // InternalTDsl.g:447:1: ruleSoundAction returns [EObject current=null] : ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) ) ;
    public final EObject ruleSoundAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_sound_2_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:453:2: ( ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) ) )
            // InternalTDsl.g:454:2: ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) )
            {
            // InternalTDsl.g:454:2: ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTDsl.g:455:3: (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) )
                    {
                    // InternalTDsl.g:455:3: (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) )
                    // InternalTDsl.g:456:4: otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getSoundActionAccess().getPlayKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getSoundActionAccess().getSoundKeyword_0_1());
                    			
                    // InternalTDsl.g:464:4: ( (lv_sound_2_0= ruleSound ) )
                    // InternalTDsl.g:465:5: (lv_sound_2_0= ruleSound )
                    {
                    // InternalTDsl.g:465:5: (lv_sound_2_0= ruleSound )
                    // InternalTDsl.g:466:6: lv_sound_2_0= ruleSound
                    {

                    						newCompositeNode(grammarAccess.getSoundActionAccess().getSoundSoundParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sound_2_0=ruleSound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSoundActionRule());
                    						}
                    						set(
                    							current,
                    							"sound",
                    							lv_sound_2_0,
                    							"org.xtext.project.tdsl.TDsl.Sound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:485:3: ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' )
                    {
                    // InternalTDsl.g:485:3: ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' )
                    // InternalTDsl.g:486:4: () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound'
                    {
                    // InternalTDsl.g:486:4: ()
                    // InternalTDsl.g:487:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSoundActionAccess().getSoundActionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getSoundActionAccess().getStopKeyword_1_1());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getSoundActionAccess().getPlayingKeyword_1_2());
                    			
                    otherlv_6=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSoundActionAccess().getSoundKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSoundAction"


    // $ANTLR start "entryRuleColorBottomAction"
    // InternalTDsl.g:510:1: entryRuleColorBottomAction returns [EObject current=null] : iv_ruleColorBottomAction= ruleColorBottomAction EOF ;
    public final EObject entryRuleColorBottomAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorBottomAction = null;


        try {
            // InternalTDsl.g:510:58: (iv_ruleColorBottomAction= ruleColorBottomAction EOF )
            // InternalTDsl.g:511:2: iv_ruleColorBottomAction= ruleColorBottomAction EOF
            {
             newCompositeNode(grammarAccess.getColorBottomActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorBottomAction=ruleColorBottomAction();

            state._fsp--;

             current =iv_ruleColorBottomAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorBottomAction"


    // $ANTLR start "ruleColorBottomAction"
    // InternalTDsl.g:517:1: ruleColorBottomAction returns [EObject current=null] : ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) ) ;
    public final EObject ruleColorBottomAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_color_4_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:523:2: ( ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) ) )
            // InternalTDsl.g:524:2: ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) )
            {
            // InternalTDsl.g:524:2: ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTDsl.g:525:3: (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    {
                    // InternalTDsl.g:525:3: (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    // InternalTDsl.g:526:4: otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getColorBottomActionAccess().getSetKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getColorBottomActionAccess().getBottomKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getColorBottomActionAccess().getColorKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorBottomActionAccess().getToKeyword_0_3());
                    			
                    // InternalTDsl.g:542:4: ( (lv_color_4_0= ruleColor ) )
                    // InternalTDsl.g:543:5: (lv_color_4_0= ruleColor )
                    {
                    // InternalTDsl.g:543:5: (lv_color_4_0= ruleColor )
                    // InternalTDsl.g:544:6: lv_color_4_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getColorBottomActionAccess().getColorColorParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_color_4_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorBottomActionRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_4_0,
                    							"org.xtext.project.tdsl.TDsl.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:563:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' )
                    {
                    // InternalTDsl.g:563:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' )
                    // InternalTDsl.g:564:4: () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds'
                    {
                    // InternalTDsl.g:564:4: ()
                    // InternalTDsl.g:565:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorBottomActionAccess().getColorBottomActionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getColorBottomActionAccess().getTurnKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getColorBottomActionAccess().getOffKeyword_1_2());
                    			
                    otherlv_8=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getColorBottomActionAccess().getBottomKeyword_1_3());
                    			
                    otherlv_9=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getColorBottomActionAccess().getLedsKeyword_1_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorBottomAction"


    // $ANTLR start "entryRuleColorTopAction"
    // InternalTDsl.g:592:1: entryRuleColorTopAction returns [EObject current=null] : iv_ruleColorTopAction= ruleColorTopAction EOF ;
    public final EObject entryRuleColorTopAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorTopAction = null;


        try {
            // InternalTDsl.g:592:55: (iv_ruleColorTopAction= ruleColorTopAction EOF )
            // InternalTDsl.g:593:2: iv_ruleColorTopAction= ruleColorTopAction EOF
            {
             newCompositeNode(grammarAccess.getColorTopActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorTopAction=ruleColorTopAction();

            state._fsp--;

             current =iv_ruleColorTopAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorTopAction"


    // $ANTLR start "ruleColorTopAction"
    // InternalTDsl.g:599:1: ruleColorTopAction returns [EObject current=null] : ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) ) ;
    public final EObject ruleColorTopAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_color_4_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:605:2: ( ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) ) )
            // InternalTDsl.g:606:2: ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) )
            {
            // InternalTDsl.g:606:2: ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==18) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTDsl.g:607:3: (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    {
                    // InternalTDsl.g:607:3: (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    // InternalTDsl.g:608:4: otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getColorTopActionAccess().getSetKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,31,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getColorTopActionAccess().getTopKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getColorTopActionAccess().getColorKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorTopActionAccess().getToKeyword_0_3());
                    			
                    // InternalTDsl.g:624:4: ( (lv_color_4_0= ruleColor ) )
                    // InternalTDsl.g:625:5: (lv_color_4_0= ruleColor )
                    {
                    // InternalTDsl.g:625:5: (lv_color_4_0= ruleColor )
                    // InternalTDsl.g:626:6: lv_color_4_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getColorTopActionAccess().getColorColorParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_color_4_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorTopActionRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_4_0,
                    							"org.xtext.project.tdsl.TDsl.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:645:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' )
                    {
                    // InternalTDsl.g:645:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' )
                    // InternalTDsl.g:646:4: () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds'
                    {
                    // InternalTDsl.g:646:4: ()
                    // InternalTDsl.g:647:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorTopActionAccess().getColorTopActionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getColorTopActionAccess().getTurnKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getColorTopActionAccess().getOffKeyword_1_2());
                    			
                    otherlv_8=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getColorTopActionAccess().getTopKeyword_1_3());
                    			
                    otherlv_9=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getColorTopActionAccess().getLedsKeyword_1_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorTopAction"


    // $ANTLR start "entryRuleIfStatement"
    // InternalTDsl.g:674:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalTDsl.g:674:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalTDsl.g:675:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalTDsl.g:681:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_condition_1_0 = null;

        EObject lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:687:2: ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' ) )
            // InternalTDsl.g:688:2: (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' )
            {
            // InternalTDsl.g:688:2: (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' )
            // InternalTDsl.g:689:3: otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalTDsl.g:693:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalTDsl.g:694:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalTDsl.g:694:4: (lv_condition_1_0= ruleCondition )
            // InternalTDsl.g:695:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.xtext.project.tdsl.TDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getColonKeyword_2());
            		
            // InternalTDsl.g:716:3: ( (lv_action_3_0= ruleAction ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTDsl.g:717:4: (lv_action_3_0= ruleAction )
            	    {
            	    // InternalTDsl.g:717:4: (lv_action_3_0= ruleAction )
            	    // InternalTDsl.g:718:5: lv_action_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementAccess().getActionActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_action_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"action",
            	    						lv_action_3_0,
            	    						"org.xtext.project.tdsl.TDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getEndKeyword_4());
            		
            otherlv_5=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getIfKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleUpperEvent"
    // InternalTDsl.g:747:1: entryRuleUpperEvent returns [EObject current=null] : iv_ruleUpperEvent= ruleUpperEvent EOF ;
    public final EObject entryRuleUpperEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperEvent = null;


        try {
            // InternalTDsl.g:747:51: (iv_ruleUpperEvent= ruleUpperEvent EOF )
            // InternalTDsl.g:748:2: iv_ruleUpperEvent= ruleUpperEvent EOF
            {
             newCompositeNode(grammarAccess.getUpperEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpperEvent=ruleUpperEvent();

            state._fsp--;

             current =iv_ruleUpperEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpperEvent"


    // $ANTLR start "ruleUpperEvent"
    // InternalTDsl.g:754:1: ruleUpperEvent returns [EObject current=null] : (otherlv_0= 'On' ( (lv_buttons_1_0= ruleButtons ) ) (otherlv_2= 'and' ( (lv_buttons_3_0= ruleButtons ) ) )* otherlv_4= 'button' ( (lv_state_5_0= ruleState ) ) otherlv_6= 'do' otherlv_7= ':' ) ;
    public final EObject ruleUpperEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_buttons_1_0 = null;

        AntlrDatatypeRuleToken lv_buttons_3_0 = null;

        AntlrDatatypeRuleToken lv_state_5_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:760:2: ( (otherlv_0= 'On' ( (lv_buttons_1_0= ruleButtons ) ) (otherlv_2= 'and' ( (lv_buttons_3_0= ruleButtons ) ) )* otherlv_4= 'button' ( (lv_state_5_0= ruleState ) ) otherlv_6= 'do' otherlv_7= ':' ) )
            // InternalTDsl.g:761:2: (otherlv_0= 'On' ( (lv_buttons_1_0= ruleButtons ) ) (otherlv_2= 'and' ( (lv_buttons_3_0= ruleButtons ) ) )* otherlv_4= 'button' ( (lv_state_5_0= ruleState ) ) otherlv_6= 'do' otherlv_7= ':' )
            {
            // InternalTDsl.g:761:2: (otherlv_0= 'On' ( (lv_buttons_1_0= ruleButtons ) ) (otherlv_2= 'and' ( (lv_buttons_3_0= ruleButtons ) ) )* otherlv_4= 'button' ( (lv_state_5_0= ruleState ) ) otherlv_6= 'do' otherlv_7= ':' )
            // InternalTDsl.g:762:3: otherlv_0= 'On' ( (lv_buttons_1_0= ruleButtons ) ) (otherlv_2= 'and' ( (lv_buttons_3_0= ruleButtons ) ) )* otherlv_4= 'button' ( (lv_state_5_0= ruleState ) ) otherlv_6= 'do' otherlv_7= ':'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperEventAccess().getOnKeyword_0());
            		
            // InternalTDsl.g:766:3: ( (lv_buttons_1_0= ruleButtons ) )
            // InternalTDsl.g:767:4: (lv_buttons_1_0= ruleButtons )
            {
            // InternalTDsl.g:767:4: (lv_buttons_1_0= ruleButtons )
            // InternalTDsl.g:768:5: lv_buttons_1_0= ruleButtons
            {

            					newCompositeNode(grammarAccess.getUpperEventAccess().getButtonsButtonsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_buttons_1_0=ruleButtons();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpperEventRule());
            					}
            					add(
            						current,
            						"buttons",
            						lv_buttons_1_0,
            						"org.xtext.project.tdsl.TDsl.Buttons");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTDsl.g:785:3: (otherlv_2= 'and' ( (lv_buttons_3_0= ruleButtons ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTDsl.g:786:4: otherlv_2= 'and' ( (lv_buttons_3_0= ruleButtons ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUpperEventAccess().getAndKeyword_2_0());
            	    			
            	    // InternalTDsl.g:790:4: ( (lv_buttons_3_0= ruleButtons ) )
            	    // InternalTDsl.g:791:5: (lv_buttons_3_0= ruleButtons )
            	    {
            	    // InternalTDsl.g:791:5: (lv_buttons_3_0= ruleButtons )
            	    // InternalTDsl.g:792:6: lv_buttons_3_0= ruleButtons
            	    {

            	    						newCompositeNode(grammarAccess.getUpperEventAccess().getButtonsButtonsParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_buttons_3_0=ruleButtons();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpperEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"buttons",
            	    							lv_buttons_3_0,
            	    							"org.xtext.project.tdsl.TDsl.Buttons");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getUpperEventAccess().getButtonKeyword_3());
            		
            // InternalTDsl.g:814:3: ( (lv_state_5_0= ruleState ) )
            // InternalTDsl.g:815:4: (lv_state_5_0= ruleState )
            {
            // InternalTDsl.g:815:4: (lv_state_5_0= ruleState )
            // InternalTDsl.g:816:5: lv_state_5_0= ruleState
            {

            					newCompositeNode(grammarAccess.getUpperEventAccess().getStateStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
            lv_state_5_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpperEventRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_5_0,
            						"org.xtext.project.tdsl.TDsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getUpperEventAccess().getDoKeyword_5());
            		
            otherlv_7=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getUpperEventAccess().getColonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpperEvent"


    // $ANTLR start "entryRuleProxEvent"
    // InternalTDsl.g:845:1: entryRuleProxEvent returns [EObject current=null] : iv_ruleProxEvent= ruleProxEvent EOF ;
    public final EObject entryRuleProxEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProxEvent = null;


        try {
            // InternalTDsl.g:845:50: (iv_ruleProxEvent= ruleProxEvent EOF )
            // InternalTDsl.g:846:2: iv_ruleProxEvent= ruleProxEvent EOF
            {
             newCompositeNode(grammarAccess.getProxEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProxEvent=ruleProxEvent();

            state._fsp--;

             current =iv_ruleProxEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProxEvent"


    // $ANTLR start "ruleProxEvent"
    // InternalTDsl.g:852:1: ruleProxEvent returns [EObject current=null] : (otherlv_0= 'On' ( (lv_sensor_1_0= ruleSensor ) ) otherlv_2= 'do' otherlv_3= ':' ) ;
    public final EObject ruleProxEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_sensor_1_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:858:2: ( (otherlv_0= 'On' ( (lv_sensor_1_0= ruleSensor ) ) otherlv_2= 'do' otherlv_3= ':' ) )
            // InternalTDsl.g:859:2: (otherlv_0= 'On' ( (lv_sensor_1_0= ruleSensor ) ) otherlv_2= 'do' otherlv_3= ':' )
            {
            // InternalTDsl.g:859:2: (otherlv_0= 'On' ( (lv_sensor_1_0= ruleSensor ) ) otherlv_2= 'do' otherlv_3= ':' )
            // InternalTDsl.g:860:3: otherlv_0= 'On' ( (lv_sensor_1_0= ruleSensor ) ) otherlv_2= 'do' otherlv_3= ':'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getProxEventAccess().getOnKeyword_0());
            		
            // InternalTDsl.g:864:3: ( (lv_sensor_1_0= ruleSensor ) )
            // InternalTDsl.g:865:4: (lv_sensor_1_0= ruleSensor )
            {
            // InternalTDsl.g:865:4: (lv_sensor_1_0= ruleSensor )
            // InternalTDsl.g:866:5: lv_sensor_1_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getProxEventAccess().getSensorSensorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_sensor_1_0=ruleSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProxEventRule());
            					}
            					set(
            						current,
            						"sensor",
            						lv_sensor_1_0,
            						"org.xtext.project.tdsl.TDsl.Sensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getProxEventAccess().getDoKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProxEventAccess().getColonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProxEvent"


    // $ANTLR start "entryRuleSensor"
    // InternalTDsl.g:895:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalTDsl.g:895:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalTDsl.g:896:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalTDsl.g:902:1: ruleSensor returns [EObject current=null] : ( ( ruleHorizontalSensors ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' (otherlv_4= 'proximity' | (otherlv_5= 'no' otherlv_6= 'proximity' ) ) ) | ( ruleRightLeft ( (lv_sensor_type_8_0= 'ground' ) ) otherlv_9= 'sensor' otherlv_10= 'detecting' (otherlv_11= 'proximity' | (otherlv_12= 'no' otherlv_13= 'proximity' ) | otherlv_14= 'black' | otherlv_15= 'white' ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token lv_sensor_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_sensor_type_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalTDsl.g:908:2: ( ( ( ruleHorizontalSensors ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' (otherlv_4= 'proximity' | (otherlv_5= 'no' otherlv_6= 'proximity' ) ) ) | ( ruleRightLeft ( (lv_sensor_type_8_0= 'ground' ) ) otherlv_9= 'sensor' otherlv_10= 'detecting' (otherlv_11= 'proximity' | (otherlv_12= 'no' otherlv_13= 'proximity' ) | otherlv_14= 'black' | otherlv_15= 'white' ) ) ) )
            // InternalTDsl.g:909:2: ( ( ruleHorizontalSensors ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' (otherlv_4= 'proximity' | (otherlv_5= 'no' otherlv_6= 'proximity' ) ) ) | ( ruleRightLeft ( (lv_sensor_type_8_0= 'ground' ) ) otherlv_9= 'sensor' otherlv_10= 'detecting' (otherlv_11= 'proximity' | (otherlv_12= 'no' otherlv_13= 'proximity' ) | otherlv_14= 'black' | otherlv_15= 'white' ) ) )
            {
            // InternalTDsl.g:909:2: ( ( ruleHorizontalSensors ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' (otherlv_4= 'proximity' | (otherlv_5= 'no' otherlv_6= 'proximity' ) ) ) | ( ruleRightLeft ( (lv_sensor_type_8_0= 'ground' ) ) otherlv_9= 'sensor' otherlv_10= 'detecting' (otherlv_11= 'proximity' | (otherlv_12= 'no' otherlv_13= 'proximity' ) | otherlv_14= 'black' | otherlv_15= 'white' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15||LA15_0==70) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=66 && LA15_0<=67)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalTDsl.g:910:3: ( ruleHorizontalSensors ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' (otherlv_4= 'proximity' | (otherlv_5= 'no' otherlv_6= 'proximity' ) ) )
                    {
                    // InternalTDsl.g:910:3: ( ruleHorizontalSensors ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' (otherlv_4= 'proximity' | (otherlv_5= 'no' otherlv_6= 'proximity' ) ) )
                    // InternalTDsl.g:911:4: ruleHorizontalSensors ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' (otherlv_4= 'proximity' | (otherlv_5= 'no' otherlv_6= 'proximity' ) )
                    {

                    				newCompositeNode(grammarAccess.getSensorAccess().getHorizontalSensorsParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_33);
                    ruleHorizontalSensors();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalTDsl.g:918:4: ( (lv_sensor_type_1_0= 'horizontal' ) )
                    // InternalTDsl.g:919:5: (lv_sensor_type_1_0= 'horizontal' )
                    {
                    // InternalTDsl.g:919:5: (lv_sensor_type_1_0= 'horizontal' )
                    // InternalTDsl.g:920:6: lv_sensor_type_1_0= 'horizontal'
                    {
                    lv_sensor_type_1_0=(Token)match(input,40,FOLLOW_34); 

                    						newLeafNode(lv_sensor_type_1_0, grammarAccess.getSensorAccess().getSensor_typeHorizontalKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensor_type", lv_sensor_type_1_0, "horizontal");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_35); 

                    				newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getSensorKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,42,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getDetectingKeyword_0_3());
                    			
                    // InternalTDsl.g:940:4: (otherlv_4= 'proximity' | (otherlv_5= 'no' otherlv_6= 'proximity' ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==43) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==44) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalTDsl.g:941:5: otherlv_4= 'proximity'
                            {
                            otherlv_4=(Token)match(input,43,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getProximityKeyword_0_4_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTDsl.g:946:5: (otherlv_5= 'no' otherlv_6= 'proximity' )
                            {
                            // InternalTDsl.g:946:5: (otherlv_5= 'no' otherlv_6= 'proximity' )
                            // InternalTDsl.g:947:6: otherlv_5= 'no' otherlv_6= 'proximity'
                            {
                            otherlv_5=(Token)match(input,44,FOLLOW_37); 

                            						newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getNoKeyword_0_4_1_0());
                            					
                            otherlv_6=(Token)match(input,43,FOLLOW_2); 

                            						newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getProximityKeyword_0_4_1_1());
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:959:3: ( ruleRightLeft ( (lv_sensor_type_8_0= 'ground' ) ) otherlv_9= 'sensor' otherlv_10= 'detecting' (otherlv_11= 'proximity' | (otherlv_12= 'no' otherlv_13= 'proximity' ) | otherlv_14= 'black' | otherlv_15= 'white' ) )
                    {
                    // InternalTDsl.g:959:3: ( ruleRightLeft ( (lv_sensor_type_8_0= 'ground' ) ) otherlv_9= 'sensor' otherlv_10= 'detecting' (otherlv_11= 'proximity' | (otherlv_12= 'no' otherlv_13= 'proximity' ) | otherlv_14= 'black' | otherlv_15= 'white' ) )
                    // InternalTDsl.g:960:4: ruleRightLeft ( (lv_sensor_type_8_0= 'ground' ) ) otherlv_9= 'sensor' otherlv_10= 'detecting' (otherlv_11= 'proximity' | (otherlv_12= 'no' otherlv_13= 'proximity' ) | otherlv_14= 'black' | otherlv_15= 'white' )
                    {

                    				newCompositeNode(grammarAccess.getSensorAccess().getRightLeftParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_38);
                    ruleRightLeft();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalTDsl.g:967:4: ( (lv_sensor_type_8_0= 'ground' ) )
                    // InternalTDsl.g:968:5: (lv_sensor_type_8_0= 'ground' )
                    {
                    // InternalTDsl.g:968:5: (lv_sensor_type_8_0= 'ground' )
                    // InternalTDsl.g:969:6: lv_sensor_type_8_0= 'ground'
                    {
                    lv_sensor_type_8_0=(Token)match(input,45,FOLLOW_34); 

                    						newLeafNode(lv_sensor_type_8_0, grammarAccess.getSensorAccess().getSensor_typeGroundKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensor_type", lv_sensor_type_8_0, "ground");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,41,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getSensorAccess().getSensorKeyword_1_2());
                    			
                    otherlv_10=(Token)match(input,42,FOLLOW_39); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getDetectingKeyword_1_3());
                    			
                    // InternalTDsl.g:989:4: (otherlv_11= 'proximity' | (otherlv_12= 'no' otherlv_13= 'proximity' ) | otherlv_14= 'black' | otherlv_15= 'white' )
                    int alt14=4;
                    switch ( input.LA(1) ) {
                    case 43:
                        {
                        alt14=1;
                        }
                        break;
                    case 44:
                        {
                        alt14=2;
                        }
                        break;
                    case 46:
                        {
                        alt14=3;
                        }
                        break;
                    case 47:
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
                            // InternalTDsl.g:990:5: otherlv_11= 'proximity'
                            {
                            otherlv_11=(Token)match(input,43,FOLLOW_2); 

                            					newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getProximityKeyword_1_4_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTDsl.g:995:5: (otherlv_12= 'no' otherlv_13= 'proximity' )
                            {
                            // InternalTDsl.g:995:5: (otherlv_12= 'no' otherlv_13= 'proximity' )
                            // InternalTDsl.g:996:6: otherlv_12= 'no' otherlv_13= 'proximity'
                            {
                            otherlv_12=(Token)match(input,44,FOLLOW_37); 

                            						newLeafNode(otherlv_12, grammarAccess.getSensorAccess().getNoKeyword_1_4_1_0());
                            					
                            otherlv_13=(Token)match(input,43,FOLLOW_2); 

                            						newLeafNode(otherlv_13, grammarAccess.getSensorAccess().getProximityKeyword_1_4_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalTDsl.g:1006:5: otherlv_14= 'black'
                            {
                            otherlv_14=(Token)match(input,46,FOLLOW_2); 

                            					newLeafNode(otherlv_14, grammarAccess.getSensorAccess().getBlackKeyword_1_4_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalTDsl.g:1011:5: otherlv_15= 'white'
                            {
                            otherlv_15=(Token)match(input,47,FOLLOW_2); 

                            					newLeafNode(otherlv_15, grammarAccess.getSensorAccess().getWhiteKeyword_1_4_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleTapEvent"
    // InternalTDsl.g:1021:1: entryRuleTapEvent returns [EObject current=null] : iv_ruleTapEvent= ruleTapEvent EOF ;
    public final EObject entryRuleTapEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTapEvent = null;


        try {
            // InternalTDsl.g:1021:49: (iv_ruleTapEvent= ruleTapEvent EOF )
            // InternalTDsl.g:1022:2: iv_ruleTapEvent= ruleTapEvent EOF
            {
             newCompositeNode(grammarAccess.getTapEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTapEvent=ruleTapEvent();

            state._fsp--;

             current =iv_ruleTapEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTapEvent"


    // $ANTLR start "ruleTapEvent"
    // InternalTDsl.g:1028:1: ruleTapEvent returns [EObject current=null] : ( () otherlv_1= 'On' otherlv_2= 'tap' otherlv_3= 'do' otherlv_4= ':' ) ;
    public final EObject ruleTapEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTDsl.g:1034:2: ( ( () otherlv_1= 'On' otherlv_2= 'tap' otherlv_3= 'do' otherlv_4= ':' ) )
            // InternalTDsl.g:1035:2: ( () otherlv_1= 'On' otherlv_2= 'tap' otherlv_3= 'do' otherlv_4= ':' )
            {
            // InternalTDsl.g:1035:2: ( () otherlv_1= 'On' otherlv_2= 'tap' otherlv_3= 'do' otherlv_4= ':' )
            // InternalTDsl.g:1036:3: () otherlv_1= 'On' otherlv_2= 'tap' otherlv_3= 'do' otherlv_4= ':'
            {
            // InternalTDsl.g:1036:3: ()
            // InternalTDsl.g:1037:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTapEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getTapEventAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getTapEventAccess().getTapKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getTapEventAccess().getDoKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTapEventAccess().getColonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTapEvent"


    // $ANTLR start "entryRuleClapEvent"
    // InternalTDsl.g:1063:1: entryRuleClapEvent returns [EObject current=null] : iv_ruleClapEvent= ruleClapEvent EOF ;
    public final EObject entryRuleClapEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClapEvent = null;


        try {
            // InternalTDsl.g:1063:50: (iv_ruleClapEvent= ruleClapEvent EOF )
            // InternalTDsl.g:1064:2: iv_ruleClapEvent= ruleClapEvent EOF
            {
             newCompositeNode(grammarAccess.getClapEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClapEvent=ruleClapEvent();

            state._fsp--;

             current =iv_ruleClapEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClapEvent"


    // $ANTLR start "ruleClapEvent"
    // InternalTDsl.g:1070:1: ruleClapEvent returns [EObject current=null] : ( () otherlv_1= 'On' otherlv_2= 'clap' otherlv_3= 'do' otherlv_4= ':' ) ;
    public final EObject ruleClapEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTDsl.g:1076:2: ( ( () otherlv_1= 'On' otherlv_2= 'clap' otherlv_3= 'do' otherlv_4= ':' ) )
            // InternalTDsl.g:1077:2: ( () otherlv_1= 'On' otherlv_2= 'clap' otherlv_3= 'do' otherlv_4= ':' )
            {
            // InternalTDsl.g:1077:2: ( () otherlv_1= 'On' otherlv_2= 'clap' otherlv_3= 'do' otherlv_4= ':' )
            // InternalTDsl.g:1078:3: () otherlv_1= 'On' otherlv_2= 'clap' otherlv_3= 'do' otherlv_4= ':'
            {
            // InternalTDsl.g:1078:3: ()
            // InternalTDsl.g:1079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClapEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getClapEventAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getClapEventAccess().getClapKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getClapEventAccess().getDoKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getClapEventAccess().getColonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClapEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalTDsl.g:1105:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalTDsl.g:1105:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalTDsl.g:1106:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalTDsl.g:1112:1: ruleCondition returns [EObject current=null] : ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        EObject lv_leftSensor_0_0 = null;

        EObject lv_rightSensor_2_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:1118:2: ( ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? ) )
            // InternalTDsl.g:1119:2: ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? )
            {
            // InternalTDsl.g:1119:2: ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? )
            // InternalTDsl.g:1120:3: ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )?
            {
            // InternalTDsl.g:1120:3: ( (lv_leftSensor_0_0= ruleSensor ) )
            // InternalTDsl.g:1121:4: (lv_leftSensor_0_0= ruleSensor )
            {
            // InternalTDsl.g:1121:4: (lv_leftSensor_0_0= ruleSensor )
            // InternalTDsl.g:1122:5: lv_leftSensor_0_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getLeftSensorSensorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_leftSensor_0_0=ruleSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"leftSensor",
            						lv_leftSensor_0_0,
            						"org.xtext.project.tdsl.TDsl.Sensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTDsl.g:1139:3: ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37||LA17_0==50) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTDsl.g:1140:4: ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) )
                    {
                    // InternalTDsl.g:1140:4: ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) )
                    // InternalTDsl.g:1141:5: ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) )
                    {
                    // InternalTDsl.g:1141:5: ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) )
                    // InternalTDsl.g:1142:6: (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' )
                    {
                    // InternalTDsl.g:1142:6: (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==37) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==50) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalTDsl.g:1143:7: lv_operator_1_1= 'and'
                            {
                            lv_operator_1_1=(Token)match(input,37,FOLLOW_25); 

                            							newLeafNode(lv_operator_1_1, grammarAccess.getConditionAccess().getOperatorAndKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTDsl.g:1154:7: lv_operator_1_2= 'or'
                            {
                            lv_operator_1_2=(Token)match(input,50,FOLLOW_25); 

                            							newLeafNode(lv_operator_1_2, grammarAccess.getConditionAccess().getOperatorOrKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalTDsl.g:1167:4: ( (lv_rightSensor_2_0= ruleSensor ) )
                    // InternalTDsl.g:1168:5: (lv_rightSensor_2_0= ruleSensor )
                    {
                    // InternalTDsl.g:1168:5: (lv_rightSensor_2_0= ruleSensor )
                    // InternalTDsl.g:1169:6: lv_rightSensor_2_0= ruleSensor
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getRightSensorSensorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightSensor_2_0=ruleSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"rightSensor",
                    							lv_rightSensor_2_0,
                    							"org.xtext.project.tdsl.TDsl.Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalTDsl.g:1191:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalTDsl.g:1191:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalTDsl.g:1192:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalTDsl.g:1198:1: ruleArithmeticExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? ) ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token lv_operator_1_3=null;
        Token lv_operator_1_4=null;
        Token lv_operator_1_5=null;
        AntlrDatatypeRuleToken lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:1204:2: ( ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? ) )
            // InternalTDsl.g:1205:2: ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? )
            {
            // InternalTDsl.g:1205:2: ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? )
            // InternalTDsl.g:1206:3: ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )?
            {
            // InternalTDsl.g:1206:3: ( (lv_left_0_0= ruleEIntegerObject ) )
            // InternalTDsl.g:1207:4: (lv_left_0_0= ruleEIntegerObject )
            {
            // InternalTDsl.g:1207:4: (lv_left_0_0= ruleEIntegerObject )
            // InternalTDsl.g:1208:5: lv_left_0_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getLeftEIntegerObjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
            lv_left_0_0=ruleEIntegerObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.project.tdsl.TDsl.EIntegerObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTDsl.g:1225:3: ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=51 && LA19_0<=54)) ) {
                alt19=1;
            }
            else if ( (LA19_0==12) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==RULE_INT||LA19_2==12) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalTDsl.g:1226:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) )
                    {
                    // InternalTDsl.g:1226:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) )
                    // InternalTDsl.g:1227:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) )
                    {
                    // InternalTDsl.g:1227:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) )
                    // InternalTDsl.g:1228:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' )
                    {
                    // InternalTDsl.g:1228:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' )
                    int alt18=5;
                    switch ( input.LA(1) ) {
                    case 51:
                        {
                        alt18=1;
                        }
                        break;
                    case 12:
                        {
                        alt18=2;
                        }
                        break;
                    case 52:
                        {
                        alt18=3;
                        }
                        break;
                    case 53:
                        {
                        alt18=4;
                        }
                        break;
                    case 54:
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
                            // InternalTDsl.g:1229:7: lv_operator_1_1= '+'
                            {
                            lv_operator_1_1=(Token)match(input,51,FOLLOW_11); 

                            							newLeafNode(lv_operator_1_1, grammarAccess.getArithmeticExpressionAccess().getOperatorPlusSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTDsl.g:1240:7: lv_operator_1_2= '-'
                            {
                            lv_operator_1_2=(Token)match(input,12,FOLLOW_11); 

                            							newLeafNode(lv_operator_1_2, grammarAccess.getArithmeticExpressionAccess().getOperatorHyphenMinusKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalTDsl.g:1251:7: lv_operator_1_3= '*'
                            {
                            lv_operator_1_3=(Token)match(input,52,FOLLOW_11); 

                            							newLeafNode(lv_operator_1_3, grammarAccess.getArithmeticExpressionAccess().getOperatorAsteriskKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalTDsl.g:1262:7: lv_operator_1_4= '/'
                            {
                            lv_operator_1_4=(Token)match(input,53,FOLLOW_11); 

                            							newLeafNode(lv_operator_1_4, grammarAccess.getArithmeticExpressionAccess().getOperatorSolidusKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalTDsl.g:1273:7: lv_operator_1_5= 'mod'
                            {
                            lv_operator_1_5=(Token)match(input,54,FOLLOW_11); 

                            							newLeafNode(lv_operator_1_5, grammarAccess.getArithmeticExpressionAccess().getOperatorModKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_5, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalTDsl.g:1286:4: ( (lv_right_2_0= ruleEIntegerObject ) )
                    // InternalTDsl.g:1287:5: (lv_right_2_0= ruleEIntegerObject )
                    {
                    // InternalTDsl.g:1287:5: (lv_right_2_0= ruleEIntegerObject )
                    // InternalTDsl.g:1288:6: lv_right_2_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getRightEIntegerObjectParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.xtext.project.tdsl.TDsl.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalTDsl.g:1310:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalTDsl.g:1310:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalTDsl.g:1311:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalTDsl.g:1317:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTDsl.g:1323:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTDsl.g:1324:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTDsl.g:1324:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTDsl.g:1325:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTDsl.g:1325:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTDsl.g:1326:4: kw= '-'
                    {
                    kw=(Token)match(input,12,FOLLOW_44); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleColor"
    // InternalTDsl.g:1343:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalTDsl.g:1343:45: (iv_ruleColor= ruleColor EOF )
            // InternalTDsl.g:1344:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalTDsl.g:1350:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'light' | kw= 'dark' )? (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' ) ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1356:2: ( ( (kw= 'light' | kw= 'dark' )? (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' ) ) )
            // InternalTDsl.g:1357:2: ( (kw= 'light' | kw= 'dark' )? (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' ) )
            {
            // InternalTDsl.g:1357:2: ( (kw= 'light' | kw= 'dark' )? (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' ) )
            // InternalTDsl.g:1358:3: (kw= 'light' | kw= 'dark' )? (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' )
            {
            // InternalTDsl.g:1358:3: (kw= 'light' | kw= 'dark' )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==55) ) {
                alt21=1;
            }
            else if ( (LA21_0==56) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalTDsl.g:1359:4: kw= 'light'
                    {
                    kw=(Token)match(input,55,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getLightKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1365:4: kw= 'dark'
                    {
                    kw=(Token)match(input,56,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getDarkKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalTDsl.g:1371:3: (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt22=1;
                }
                break;
            case 58:
                {
                alt22=2;
                }
                break;
            case 59:
                {
                alt22=3;
                }
                break;
            case 46:
                {
                alt22=4;
                }
                break;
            case 47:
                {
                alt22=5;
                }
                break;
            case 60:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalTDsl.g:1372:4: kw= 'red'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getRedKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1378:4: kw= 'green'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getGreenKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1384:4: kw= 'blue'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getBlueKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1390:4: kw= 'black'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getBlackKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1396:4: kw= 'white'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getWhiteKeyword_1_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalTDsl.g:1402:4: kw= 'yellow'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getYellowKeyword_1_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleSound"
    // InternalTDsl.g:1412:1: entryRuleSound returns [String current=null] : iv_ruleSound= ruleSound EOF ;
    public final String entryRuleSound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSound = null;


        try {
            // InternalTDsl.g:1412:45: (iv_ruleSound= ruleSound EOF )
            // InternalTDsl.g:1413:2: iv_ruleSound= ruleSound EOF
            {
             newCompositeNode(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSound=ruleSound();

            state._fsp--;

             current =iv_ruleSound.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSound"


    // $ANTLR start "ruleSound"
    // InternalTDsl.g:1419:1: ruleSound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' ) ;
    public final AntlrDatatypeRuleToken ruleSound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1425:2: ( (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' ) )
            // InternalTDsl.g:1426:2: (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' )
            {
            // InternalTDsl.g:1426:2: (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt23=1;
                }
                break;
            case 62:
                {
                alt23=2;
                }
                break;
            case 63:
                {
                alt23=3;
                }
                break;
            case 64:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalTDsl.g:1427:3: kw= 'sound1'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSoundAccess().getSound1Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1433:3: kw= 'sound2'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSoundAccess().getSound2Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1439:3: kw= 'sound3'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSoundAccess().getSound3Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1445:3: kw= 'sound4'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSoundAccess().getSound4Keyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRuleButtons"
    // InternalTDsl.g:1454:1: entryRuleButtons returns [String current=null] : iv_ruleButtons= ruleButtons EOF ;
    public final String entryRuleButtons() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleButtons = null;


        try {
            // InternalTDsl.g:1454:47: (iv_ruleButtons= ruleButtons EOF )
            // InternalTDsl.g:1455:2: iv_ruleButtons= ruleButtons EOF
            {
             newCompositeNode(grammarAccess.getButtonsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtons=ruleButtons();

            state._fsp--;

             current =iv_ruleButtons.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtons"


    // $ANTLR start "ruleButtons"
    // InternalTDsl.g:1461:1: ruleButtons returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' ) ;
    public final AntlrDatatypeRuleToken ruleButtons() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1467:2: ( (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' ) )
            // InternalTDsl.g:1468:2: (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' )
            {
            // InternalTDsl.g:1468:2: (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt24=1;
                }
                break;
            case 66:
                {
                alt24=2;
                }
                break;
            case 67:
                {
                alt24=3;
                }
                break;
            case 14:
                {
                alt24=4;
                }
                break;
            case 15:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalTDsl.g:1469:3: kw= 'center'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getCenterKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1475:3: kw= 'right'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getRightKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1481:3: kw= 'left'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getLeftKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1487:3: kw= 'forward'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getForwardKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1493:3: kw= 'backward'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getBackwardKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtons"


    // $ANTLR start "entryRuleState"
    // InternalTDsl.g:1502:1: entryRuleState returns [String current=null] : iv_ruleState= ruleState EOF ;
    public final String entryRuleState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState = null;


        try {
            // InternalTDsl.g:1502:45: (iv_ruleState= ruleState EOF )
            // InternalTDsl.g:1503:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalTDsl.g:1509:1: ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'touched' | kw= 'released' ) ;
    public final AntlrDatatypeRuleToken ruleState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1515:2: ( (kw= 'touched' | kw= 'released' ) )
            // InternalTDsl.g:1516:2: (kw= 'touched' | kw= 'released' )
            {
            // InternalTDsl.g:1516:2: (kw= 'touched' | kw= 'released' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==68) ) {
                alt25=1;
            }
            else if ( (LA25_0==69) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalTDsl.g:1517:3: kw= 'touched'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateAccess().getTouchedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1523:3: kw= 'released'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateAccess().getReleasedKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleRightLeft"
    // InternalTDsl.g:1532:1: entryRuleRightLeft returns [String current=null] : iv_ruleRightLeft= ruleRightLeft EOF ;
    public final String entryRuleRightLeft() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightLeft = null;


        try {
            // InternalTDsl.g:1532:49: (iv_ruleRightLeft= ruleRightLeft EOF )
            // InternalTDsl.g:1533:2: iv_ruleRightLeft= ruleRightLeft EOF
            {
             newCompositeNode(grammarAccess.getRightLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightLeft=ruleRightLeft();

            state._fsp--;

             current =iv_ruleRightLeft.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightLeft"


    // $ANTLR start "ruleRightLeft"
    // InternalTDsl.g:1539:1: ruleRightLeft returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'left' | kw= 'right' ) ;
    public final AntlrDatatypeRuleToken ruleRightLeft() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1545:2: ( (kw= 'left' | kw= 'right' ) )
            // InternalTDsl.g:1546:2: (kw= 'left' | kw= 'right' )
            {
            // InternalTDsl.g:1546:2: (kw= 'left' | kw= 'right' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==67) ) {
                alt26=1;
            }
            else if ( (LA26_0==66) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalTDsl.g:1547:3: kw= 'left'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRightLeftAccess().getLeftKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1553:3: kw= 'right'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRightLeftAccess().getRightKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightLeft"


    // $ANTLR start "entryRuleHorizontalSensors"
    // InternalTDsl.g:1562:1: entryRuleHorizontalSensors returns [String current=null] : iv_ruleHorizontalSensors= ruleHorizontalSensors EOF ;
    public final String entryRuleHorizontalSensors() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHorizontalSensors = null;


        try {
            // InternalTDsl.g:1562:57: (iv_ruleHorizontalSensors= ruleHorizontalSensors EOF )
            // InternalTDsl.g:1563:2: iv_ruleHorizontalSensors= ruleHorizontalSensors EOF
            {
             newCompositeNode(grammarAccess.getHorizontalSensorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHorizontalSensors=ruleHorizontalSensors();

            state._fsp--;

             current =iv_ruleHorizontalSensors.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHorizontalSensors"


    // $ANTLR start "ruleHorizontalSensors"
    // InternalTDsl.g:1569:1: ruleHorizontalSensors returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) ) ;
    public final AntlrDatatypeRuleToken ruleHorizontalSensors() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1575:2: ( ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) ) )
            // InternalTDsl.g:1576:2: ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) )
            {
            // InternalTDsl.g:1576:2: ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) )
            int alt27=7;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalTDsl.g:1577:3: (kw= 'front' kw= 'left' )
                    {
                    // InternalTDsl.g:1577:3: (kw= 'front' kw= 'left' )
                    // InternalTDsl.g:1578:4: kw= 'front' kw= 'left'
                    {
                    kw=(Token)match(input,70,FOLLOW_46); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_0_0());
                    			
                    kw=(Token)match(input,67,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getLeftKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1590:3: (kw= 'front' kw= 'left/middle' )
                    {
                    // InternalTDsl.g:1590:3: (kw= 'front' kw= 'left/middle' )
                    // InternalTDsl.g:1591:4: kw= 'front' kw= 'left/middle'
                    {
                    kw=(Token)match(input,70,FOLLOW_47); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_1_0());
                    			
                    kw=(Token)match(input,71,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getLeftMiddleKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1603:3: (kw= 'front' kw= 'middle' )
                    {
                    // InternalTDsl.g:1603:3: (kw= 'front' kw= 'middle' )
                    // InternalTDsl.g:1604:4: kw= 'front' kw= 'middle'
                    {
                    kw=(Token)match(input,70,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_2_0());
                    			
                    kw=(Token)match(input,72,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getMiddleKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1616:3: (kw= 'front' kw= 'right/middle' )
                    {
                    // InternalTDsl.g:1616:3: (kw= 'front' kw= 'right/middle' )
                    // InternalTDsl.g:1617:4: kw= 'front' kw= 'right/middle'
                    {
                    kw=(Token)match(input,70,FOLLOW_49); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_3_0());
                    			
                    kw=(Token)match(input,73,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getRightMiddleKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1629:3: (kw= 'front' kw= 'right' )
                    {
                    // InternalTDsl.g:1629:3: (kw= 'front' kw= 'right' )
                    // InternalTDsl.g:1630:4: kw= 'front' kw= 'right'
                    {
                    kw=(Token)match(input,70,FOLLOW_50); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_4_0());
                    			
                    kw=(Token)match(input,66,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getRightKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTDsl.g:1642:3: (kw= 'backward' kw= 'left' )
                    {
                    // InternalTDsl.g:1642:3: (kw= 'backward' kw= 'left' )
                    // InternalTDsl.g:1643:4: kw= 'backward' kw= 'left'
                    {
                    kw=(Token)match(input,15,FOLLOW_46); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getBackwardKeyword_5_0());
                    			
                    kw=(Token)match(input,67,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getLeftKeyword_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTDsl.g:1655:3: (kw= 'backward' kw= 'right' )
                    {
                    // InternalTDsl.g:1655:3: (kw= 'backward' kw= 'right' )
                    // InternalTDsl.g:1656:4: kw= 'backward' kw= 'right'
                    {
                    kw=(Token)match(input,15,FOLLOW_50); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getBackwardKeyword_6_0());
                    			
                    kw=(Token)match(input,66,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getRightKeyword_6_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHorizontalSensors"

    // Delegated rules


    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\17\2\102\7\uffff";
    static final String dfa_3s = "\1\106\1\111\1\103\7\uffff";
    static final String dfa_4s = "\3\uffff\1\3\1\5\1\2\1\4\1\1\1\7\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\66\uffff\1\1",
            "\1\4\1\7\3\uffff\1\5\1\3\1\6",
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

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1576:2: ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000024C2000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1F80C00000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008000L,0x000000000000004CL});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000500001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000000C000L,0x000000000000000EL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000D80000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004002000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0078000000001002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1E00C00000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});

}