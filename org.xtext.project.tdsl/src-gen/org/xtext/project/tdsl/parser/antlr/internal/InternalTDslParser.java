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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'-'", "'drive'", "'forward'", "'backward'", "'with'", "'speed'", "'turn'", "'stop'", "'driving'", "'turning'", "'play'", "'sound'", "'playing'", "'set'", "'bottom'", "'color'", "'to'", "'off'", "'leds'", "'top'", "'If'", "':'", "'End'", "'if'", "'On'", "'and'", "'button'", "'do'", "'horizontal'", "'sensor'", "'detecting'", "'ground'", "'tap'", "'clap'", "'or'", "'+'", "'*'", "'/'", "'mod'", "'light'", "'dark'", "'red'", "'green'", "'blue'", "'black'", "'white'", "'yellow'", "'sound1'", "'sound2'", "'sound3'", "'sound4'", "'proximity'", "'no'", "'center'", "'right'", "'left'", "'touched'", "'released'", "'front'", "'left/middle'", "'middle'", "'right/middle'"
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
                case 70:
                    {
                    alt3=2;
                    }
                    break;
                case 15:
                    {
                    int LA3_3 = input.LA(3);

                    if ( ((LA3_3>=66 && LA3_3<=67)) ) {
                        alt3=2;
                    }
                    else if ( ((LA3_3>=37 && LA3_3<=38)) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 67:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==43) ) {
                        alt3=2;
                    }
                    else if ( ((LA3_4>=37 && LA3_4<=38)) ) {
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
                    int LA3_5 = input.LA(3);

                    if ( ((LA3_5>=37 && LA3_5<=38)) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==43) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 45:
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
                case 44:
                    {
                    alt3=3;
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

                if ( ((LA4_2>=66 && LA4_2<=67)) ) {
                    alt4=1;
                }
                else if ( (LA4_2==29) ) {
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
    // InternalTDsl.g:304:1: ruleMovementAction returns [EObject current=null] : ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) ) | ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) ) ) ;
    public final EObject ruleMovementAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_direction_1_1=null;
        Token lv_direction_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token lv_direction_9_0=null;
        Token otherlv_11=null;
        Token lv_direction_12_0=null;
        EObject lv_speed_4_0 = null;

        AntlrDatatypeRuleToken lv_direction_6_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:310:2: ( ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) ) | ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) ) ) )
            // InternalTDsl.g:311:2: ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) ) | ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) ) )
            {
            // InternalTDsl.g:311:2: ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) ) | ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) ) )
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

                if ( (LA7_3==20) ) {
                    alt7=3;
                }
                else if ( (LA7_3==21) ) {
                    alt7=4;
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
                    // InternalTDsl.g:401:3: ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) )
                    {
                    // InternalTDsl.g:401:3: ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) )
                    // InternalTDsl.g:402:4: () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) )
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
                    			
                    // InternalTDsl.g:413:4: ( (lv_direction_9_0= 'driving' ) )
                    // InternalTDsl.g:414:5: (lv_direction_9_0= 'driving' )
                    {
                    // InternalTDsl.g:414:5: (lv_direction_9_0= 'driving' )
                    // InternalTDsl.g:415:6: lv_direction_9_0= 'driving'
                    {
                    lv_direction_9_0=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_direction_9_0, grammarAccess.getMovementActionAccess().getDirectionDrivingKeyword_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMovementActionRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_9_0, "driving");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:429:3: ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) )
                    {
                    // InternalTDsl.g:429:3: ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) )
                    // InternalTDsl.g:430:4: () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) )
                    {
                    // InternalTDsl.g:430:4: ()
                    // InternalTDsl.g:431:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMovementActionAccess().getMovementActionAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getMovementActionAccess().getStopKeyword_3_1());
                    			
                    // InternalTDsl.g:441:4: ( (lv_direction_12_0= 'turning' ) )
                    // InternalTDsl.g:442:5: (lv_direction_12_0= 'turning' )
                    {
                    // InternalTDsl.g:442:5: (lv_direction_12_0= 'turning' )
                    // InternalTDsl.g:443:6: lv_direction_12_0= 'turning'
                    {
                    lv_direction_12_0=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_direction_12_0, grammarAccess.getMovementActionAccess().getDirectionTurningKeyword_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMovementActionRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_12_0, "turning");
                    					

                    }


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
    // $ANTLR end "ruleMovementAction"


    // $ANTLR start "entryRuleSoundAction"
    // InternalTDsl.g:460:1: entryRuleSoundAction returns [EObject current=null] : iv_ruleSoundAction= ruleSoundAction EOF ;
    public final EObject entryRuleSoundAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoundAction = null;


        try {
            // InternalTDsl.g:460:52: (iv_ruleSoundAction= ruleSoundAction EOF )
            // InternalTDsl.g:461:2: iv_ruleSoundAction= ruleSoundAction EOF
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
    // InternalTDsl.g:467:1: ruleSoundAction returns [EObject current=null] : ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) ) ;
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
            // InternalTDsl.g:473:2: ( ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) ) )
            // InternalTDsl.g:474:2: ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) )
            {
            // InternalTDsl.g:474:2: ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) )
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
                    // InternalTDsl.g:475:3: (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) )
                    {
                    // InternalTDsl.g:475:3: (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) )
                    // InternalTDsl.g:476:4: otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getSoundActionAccess().getPlayKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getSoundActionAccess().getSoundKeyword_0_1());
                    			
                    // InternalTDsl.g:484:4: ( (lv_sound_2_0= ruleSound ) )
                    // InternalTDsl.g:485:5: (lv_sound_2_0= ruleSound )
                    {
                    // InternalTDsl.g:485:5: (lv_sound_2_0= ruleSound )
                    // InternalTDsl.g:486:6: lv_sound_2_0= ruleSound
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
                    // InternalTDsl.g:505:3: ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' )
                    {
                    // InternalTDsl.g:505:3: ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' )
                    // InternalTDsl.g:506:4: () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound'
                    {
                    // InternalTDsl.g:506:4: ()
                    // InternalTDsl.g:507:5: 
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
    // InternalTDsl.g:530:1: entryRuleColorBottomAction returns [EObject current=null] : iv_ruleColorBottomAction= ruleColorBottomAction EOF ;
    public final EObject entryRuleColorBottomAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorBottomAction = null;


        try {
            // InternalTDsl.g:530:58: (iv_ruleColorBottomAction= ruleColorBottomAction EOF )
            // InternalTDsl.g:531:2: iv_ruleColorBottomAction= ruleColorBottomAction EOF
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
    // InternalTDsl.g:537:1: ruleColorBottomAction returns [EObject current=null] : ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) ) ;
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
            // InternalTDsl.g:543:2: ( ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) ) )
            // InternalTDsl.g:544:2: ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) )
            {
            // InternalTDsl.g:544:2: ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) )
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
                    // InternalTDsl.g:545:3: (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    {
                    // InternalTDsl.g:545:3: (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    // InternalTDsl.g:546:4: otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getColorBottomActionAccess().getSetKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getColorBottomActionAccess().getBottomKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getColorBottomActionAccess().getColorKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorBottomActionAccess().getToKeyword_0_3());
                    			
                    // InternalTDsl.g:562:4: ( (lv_color_4_0= ruleColor ) )
                    // InternalTDsl.g:563:5: (lv_color_4_0= ruleColor )
                    {
                    // InternalTDsl.g:563:5: (lv_color_4_0= ruleColor )
                    // InternalTDsl.g:564:6: lv_color_4_0= ruleColor
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
                    // InternalTDsl.g:583:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' )
                    {
                    // InternalTDsl.g:583:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' )
                    // InternalTDsl.g:584:4: () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds'
                    {
                    // InternalTDsl.g:584:4: ()
                    // InternalTDsl.g:585:5: 
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
    // InternalTDsl.g:612:1: entryRuleColorTopAction returns [EObject current=null] : iv_ruleColorTopAction= ruleColorTopAction EOF ;
    public final EObject entryRuleColorTopAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorTopAction = null;


        try {
            // InternalTDsl.g:612:55: (iv_ruleColorTopAction= ruleColorTopAction EOF )
            // InternalTDsl.g:613:2: iv_ruleColorTopAction= ruleColorTopAction EOF
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
    // InternalTDsl.g:619:1: ruleColorTopAction returns [EObject current=null] : ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) ) ;
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
            // InternalTDsl.g:625:2: ( ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) ) )
            // InternalTDsl.g:626:2: ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) )
            {
            // InternalTDsl.g:626:2: ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) )
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
                    // InternalTDsl.g:627:3: (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    {
                    // InternalTDsl.g:627:3: (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    // InternalTDsl.g:628:4: otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getColorTopActionAccess().getSetKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,31,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getColorTopActionAccess().getTopKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getColorTopActionAccess().getColorKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorTopActionAccess().getToKeyword_0_3());
                    			
                    // InternalTDsl.g:644:4: ( (lv_color_4_0= ruleColor ) )
                    // InternalTDsl.g:645:5: (lv_color_4_0= ruleColor )
                    {
                    // InternalTDsl.g:645:5: (lv_color_4_0= ruleColor )
                    // InternalTDsl.g:646:6: lv_color_4_0= ruleColor
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
                    // InternalTDsl.g:665:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' )
                    {
                    // InternalTDsl.g:665:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' )
                    // InternalTDsl.g:666:4: () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds'
                    {
                    // InternalTDsl.g:666:4: ()
                    // InternalTDsl.g:667:5: 
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
    // InternalTDsl.g:694:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalTDsl.g:694:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalTDsl.g:695:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalTDsl.g:701:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' ) ;
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
            // InternalTDsl.g:707:2: ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' ) )
            // InternalTDsl.g:708:2: (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' )
            {
            // InternalTDsl.g:708:2: (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' )
            // InternalTDsl.g:709:3: otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalTDsl.g:713:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalTDsl.g:714:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalTDsl.g:714:4: (lv_condition_1_0= ruleCondition )
            // InternalTDsl.g:715:5: lv_condition_1_0= ruleCondition
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
            		
            // InternalTDsl.g:736:3: ( (lv_action_3_0= ruleAction ) )+
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
            	    // InternalTDsl.g:737:4: (lv_action_3_0= ruleAction )
            	    {
            	    // InternalTDsl.g:737:4: (lv_action_3_0= ruleAction )
            	    // InternalTDsl.g:738:5: lv_action_3_0= ruleAction
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
    // InternalTDsl.g:767:1: entryRuleUpperEvent returns [EObject current=null] : iv_ruleUpperEvent= ruleUpperEvent EOF ;
    public final EObject entryRuleUpperEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperEvent = null;


        try {
            // InternalTDsl.g:767:51: (iv_ruleUpperEvent= ruleUpperEvent EOF )
            // InternalTDsl.g:768:2: iv_ruleUpperEvent= ruleUpperEvent EOF
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
    // InternalTDsl.g:774:1: ruleUpperEvent returns [EObject current=null] : (otherlv_0= 'On' ( (lv_button_1_0= ruleButton ) ) (otherlv_2= 'and' ( (lv_button_3_0= ruleButton ) ) )* otherlv_4= 'button' ( (lv_state_5_0= ruleState ) ) otherlv_6= 'do' otherlv_7= ':' ) ;
    public final EObject ruleUpperEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_button_1_0 = null;

        EObject lv_button_3_0 = null;

        AntlrDatatypeRuleToken lv_state_5_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:780:2: ( (otherlv_0= 'On' ( (lv_button_1_0= ruleButton ) ) (otherlv_2= 'and' ( (lv_button_3_0= ruleButton ) ) )* otherlv_4= 'button' ( (lv_state_5_0= ruleState ) ) otherlv_6= 'do' otherlv_7= ':' ) )
            // InternalTDsl.g:781:2: (otherlv_0= 'On' ( (lv_button_1_0= ruleButton ) ) (otherlv_2= 'and' ( (lv_button_3_0= ruleButton ) ) )* otherlv_4= 'button' ( (lv_state_5_0= ruleState ) ) otherlv_6= 'do' otherlv_7= ':' )
            {
            // InternalTDsl.g:781:2: (otherlv_0= 'On' ( (lv_button_1_0= ruleButton ) ) (otherlv_2= 'and' ( (lv_button_3_0= ruleButton ) ) )* otherlv_4= 'button' ( (lv_state_5_0= ruleState ) ) otherlv_6= 'do' otherlv_7= ':' )
            // InternalTDsl.g:782:3: otherlv_0= 'On' ( (lv_button_1_0= ruleButton ) ) (otherlv_2= 'and' ( (lv_button_3_0= ruleButton ) ) )* otherlv_4= 'button' ( (lv_state_5_0= ruleState ) ) otherlv_6= 'do' otherlv_7= ':'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperEventAccess().getOnKeyword_0());
            		
            // InternalTDsl.g:786:3: ( (lv_button_1_0= ruleButton ) )
            // InternalTDsl.g:787:4: (lv_button_1_0= ruleButton )
            {
            // InternalTDsl.g:787:4: (lv_button_1_0= ruleButton )
            // InternalTDsl.g:788:5: lv_button_1_0= ruleButton
            {

            					newCompositeNode(grammarAccess.getUpperEventAccess().getButtonButtonParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_button_1_0=ruleButton();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpperEventRule());
            					}
            					add(
            						current,
            						"button",
            						lv_button_1_0,
            						"org.xtext.project.tdsl.TDsl.Button");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTDsl.g:805:3: (otherlv_2= 'and' ( (lv_button_3_0= ruleButton ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTDsl.g:806:4: otherlv_2= 'and' ( (lv_button_3_0= ruleButton ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUpperEventAccess().getAndKeyword_2_0());
            	    			
            	    // InternalTDsl.g:810:4: ( (lv_button_3_0= ruleButton ) )
            	    // InternalTDsl.g:811:5: (lv_button_3_0= ruleButton )
            	    {
            	    // InternalTDsl.g:811:5: (lv_button_3_0= ruleButton )
            	    // InternalTDsl.g:812:6: lv_button_3_0= ruleButton
            	    {

            	    						newCompositeNode(grammarAccess.getUpperEventAccess().getButtonButtonParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_button_3_0=ruleButton();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpperEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"button",
            	    							lv_button_3_0,
            	    							"org.xtext.project.tdsl.TDsl.Button");
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
            		
            // InternalTDsl.g:834:3: ( (lv_state_5_0= ruleState ) )
            // InternalTDsl.g:835:4: (lv_state_5_0= ruleState )
            {
            // InternalTDsl.g:835:4: (lv_state_5_0= ruleState )
            // InternalTDsl.g:836:5: lv_state_5_0= ruleState
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


    // $ANTLR start "entryRuleButton"
    // InternalTDsl.g:865:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalTDsl.g:865:47: (iv_ruleButton= ruleButton EOF )
            // InternalTDsl.g:866:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalTDsl.g:872:1: ruleButton returns [EObject current=null] : ( (lv_name_0_0= ruleButtons ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:878:2: ( ( (lv_name_0_0= ruleButtons ) ) )
            // InternalTDsl.g:879:2: ( (lv_name_0_0= ruleButtons ) )
            {
            // InternalTDsl.g:879:2: ( (lv_name_0_0= ruleButtons ) )
            // InternalTDsl.g:880:3: (lv_name_0_0= ruleButtons )
            {
            // InternalTDsl.g:880:3: (lv_name_0_0= ruleButtons )
            // InternalTDsl.g:881:4: lv_name_0_0= ruleButtons
            {

            				newCompositeNode(grammarAccess.getButtonAccess().getNameButtonsParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleButtons();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getButtonRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.project.tdsl.TDsl.Buttons");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleProxEvent"
    // InternalTDsl.g:901:1: entryRuleProxEvent returns [EObject current=null] : iv_ruleProxEvent= ruleProxEvent EOF ;
    public final EObject entryRuleProxEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProxEvent = null;


        try {
            // InternalTDsl.g:901:50: (iv_ruleProxEvent= ruleProxEvent EOF )
            // InternalTDsl.g:902:2: iv_ruleProxEvent= ruleProxEvent EOF
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
    // InternalTDsl.g:908:1: ruleProxEvent returns [EObject current=null] : (otherlv_0= 'On' ( (lv_sensor_1_0= ruleSensor ) ) otherlv_2= 'do' otherlv_3= ':' ) ;
    public final EObject ruleProxEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_sensor_1_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:914:2: ( (otherlv_0= 'On' ( (lv_sensor_1_0= ruleSensor ) ) otherlv_2= 'do' otherlv_3= ':' ) )
            // InternalTDsl.g:915:2: (otherlv_0= 'On' ( (lv_sensor_1_0= ruleSensor ) ) otherlv_2= 'do' otherlv_3= ':' )
            {
            // InternalTDsl.g:915:2: (otherlv_0= 'On' ( (lv_sensor_1_0= ruleSensor ) ) otherlv_2= 'do' otherlv_3= ':' )
            // InternalTDsl.g:916:3: otherlv_0= 'On' ( (lv_sensor_1_0= ruleSensor ) ) otherlv_2= 'do' otherlv_3= ':'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getProxEventAccess().getOnKeyword_0());
            		
            // InternalTDsl.g:920:3: ( (lv_sensor_1_0= ruleSensor ) )
            // InternalTDsl.g:921:4: (lv_sensor_1_0= ruleSensor )
            {
            // InternalTDsl.g:921:4: (lv_sensor_1_0= ruleSensor )
            // InternalTDsl.g:922:5: lv_sensor_1_0= ruleSensor
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
    // InternalTDsl.g:951:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalTDsl.g:951:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalTDsl.g:952:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalTDsl.g:958:1: ruleSensor returns [EObject current=null] : ( ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) ) | ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token lv_sensor_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_sensor_type_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_state_4_0 = null;

        AntlrDatatypeRuleToken lv_direction_5_0 = null;

        AntlrDatatypeRuleToken lv_state_9_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:964:2: ( ( ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) ) | ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) ) ) )
            // InternalTDsl.g:965:2: ( ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) ) | ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) ) )
            {
            // InternalTDsl.g:965:2: ( ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) ) | ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15||LA13_0==70) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=66 && LA13_0<=67)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTDsl.g:966:3: ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) )
                    {
                    // InternalTDsl.g:966:3: ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) )
                    // InternalTDsl.g:967:4: ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) )
                    {
                    // InternalTDsl.g:967:4: ( (lv_direction_0_0= ruleHorizontalSensors ) )
                    // InternalTDsl.g:968:5: (lv_direction_0_0= ruleHorizontalSensors )
                    {
                    // InternalTDsl.g:968:5: (lv_direction_0_0= ruleHorizontalSensors )
                    // InternalTDsl.g:969:6: lv_direction_0_0= ruleHorizontalSensors
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getDirectionHorizontalSensorsParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_direction_0_0=ruleHorizontalSensors();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_0_0,
                    							"org.xtext.project.tdsl.TDsl.HorizontalSensors");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTDsl.g:986:4: ( (lv_sensor_type_1_0= 'horizontal' ) )
                    // InternalTDsl.g:987:5: (lv_sensor_type_1_0= 'horizontal' )
                    {
                    // InternalTDsl.g:987:5: (lv_sensor_type_1_0= 'horizontal' )
                    // InternalTDsl.g:988:6: lv_sensor_type_1_0= 'horizontal'
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
                    			
                    // InternalTDsl.g:1008:4: ( (lv_state_4_0= ruleState_Horizontal_Sensor ) )
                    // InternalTDsl.g:1009:5: (lv_state_4_0= ruleState_Horizontal_Sensor )
                    {
                    // InternalTDsl.g:1009:5: (lv_state_4_0= ruleState_Horizontal_Sensor )
                    // InternalTDsl.g:1010:6: lv_state_4_0= ruleState_Horizontal_Sensor
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getStateState_Horizontal_SensorParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_state_4_0=ruleState_Horizontal_Sensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_4_0,
                    							"org.xtext.project.tdsl.TDsl.State_Horizontal_Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1029:3: ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) )
                    {
                    // InternalTDsl.g:1029:3: ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) )
                    // InternalTDsl.g:1030:4: ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) )
                    {
                    // InternalTDsl.g:1030:4: ( (lv_direction_5_0= ruleRightLeft ) )
                    // InternalTDsl.g:1031:5: (lv_direction_5_0= ruleRightLeft )
                    {
                    // InternalTDsl.g:1031:5: (lv_direction_5_0= ruleRightLeft )
                    // InternalTDsl.g:1032:6: lv_direction_5_0= ruleRightLeft
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getDirectionRightLeftParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_direction_5_0=ruleRightLeft();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_5_0,
                    							"org.xtext.project.tdsl.TDsl.RightLeft");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTDsl.g:1049:4: ( (lv_sensor_type_6_0= 'ground' ) )
                    // InternalTDsl.g:1050:5: (lv_sensor_type_6_0= 'ground' )
                    {
                    // InternalTDsl.g:1050:5: (lv_sensor_type_6_0= 'ground' )
                    // InternalTDsl.g:1051:6: lv_sensor_type_6_0= 'ground'
                    {
                    lv_sensor_type_6_0=(Token)match(input,43,FOLLOW_34); 

                    						newLeafNode(lv_sensor_type_6_0, grammarAccess.getSensorAccess().getSensor_typeGroundKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensor_type", lv_sensor_type_6_0, "ground");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,41,FOLLOW_35); 

                    				newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getSensorKeyword_1_2());
                    			
                    otherlv_8=(Token)match(input,42,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getDetectingKeyword_1_3());
                    			
                    // InternalTDsl.g:1071:4: ( (lv_state_9_0= ruleState_Ground_Sensor ) )
                    // InternalTDsl.g:1072:5: (lv_state_9_0= ruleState_Ground_Sensor )
                    {
                    // InternalTDsl.g:1072:5: (lv_state_9_0= ruleState_Ground_Sensor )
                    // InternalTDsl.g:1073:6: lv_state_9_0= ruleState_Ground_Sensor
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getStateState_Ground_SensorParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_state_9_0=ruleState_Ground_Sensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_9_0,
                    							"org.xtext.project.tdsl.TDsl.State_Ground_Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // InternalTDsl.g:1095:1: entryRuleTapEvent returns [EObject current=null] : iv_ruleTapEvent= ruleTapEvent EOF ;
    public final EObject entryRuleTapEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTapEvent = null;


        try {
            // InternalTDsl.g:1095:49: (iv_ruleTapEvent= ruleTapEvent EOF )
            // InternalTDsl.g:1096:2: iv_ruleTapEvent= ruleTapEvent EOF
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
    // InternalTDsl.g:1102:1: ruleTapEvent returns [EObject current=null] : ( () otherlv_1= 'On' otherlv_2= 'tap' otherlv_3= 'do' otherlv_4= ':' ) ;
    public final EObject ruleTapEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTDsl.g:1108:2: ( ( () otherlv_1= 'On' otherlv_2= 'tap' otherlv_3= 'do' otherlv_4= ':' ) )
            // InternalTDsl.g:1109:2: ( () otherlv_1= 'On' otherlv_2= 'tap' otherlv_3= 'do' otherlv_4= ':' )
            {
            // InternalTDsl.g:1109:2: ( () otherlv_1= 'On' otherlv_2= 'tap' otherlv_3= 'do' otherlv_4= ':' )
            // InternalTDsl.g:1110:3: () otherlv_1= 'On' otherlv_2= 'tap' otherlv_3= 'do' otherlv_4= ':'
            {
            // InternalTDsl.g:1110:3: ()
            // InternalTDsl.g:1111:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTapEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getTapEventAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_32); 

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
    // InternalTDsl.g:1137:1: entryRuleClapEvent returns [EObject current=null] : iv_ruleClapEvent= ruleClapEvent EOF ;
    public final EObject entryRuleClapEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClapEvent = null;


        try {
            // InternalTDsl.g:1137:50: (iv_ruleClapEvent= ruleClapEvent EOF )
            // InternalTDsl.g:1138:2: iv_ruleClapEvent= ruleClapEvent EOF
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
    // InternalTDsl.g:1144:1: ruleClapEvent returns [EObject current=null] : ( () otherlv_1= 'On' otherlv_2= 'clap' otherlv_3= 'do' otherlv_4= ':' ) ;
    public final EObject ruleClapEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTDsl.g:1150:2: ( ( () otherlv_1= 'On' otherlv_2= 'clap' otherlv_3= 'do' otherlv_4= ':' ) )
            // InternalTDsl.g:1151:2: ( () otherlv_1= 'On' otherlv_2= 'clap' otherlv_3= 'do' otherlv_4= ':' )
            {
            // InternalTDsl.g:1151:2: ( () otherlv_1= 'On' otherlv_2= 'clap' otherlv_3= 'do' otherlv_4= ':' )
            // InternalTDsl.g:1152:3: () otherlv_1= 'On' otherlv_2= 'clap' otherlv_3= 'do' otherlv_4= ':'
            {
            // InternalTDsl.g:1152:3: ()
            // InternalTDsl.g:1153:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClapEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getClapEventAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_32); 

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
    // InternalTDsl.g:1179:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalTDsl.g:1179:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalTDsl.g:1180:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalTDsl.g:1186:1: ruleCondition returns [EObject current=null] : ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        EObject lv_leftSensor_0_0 = null;

        EObject lv_rightSensor_2_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:1192:2: ( ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? ) )
            // InternalTDsl.g:1193:2: ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? )
            {
            // InternalTDsl.g:1193:2: ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? )
            // InternalTDsl.g:1194:3: ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )?
            {
            // InternalTDsl.g:1194:3: ( (lv_leftSensor_0_0= ruleSensor ) )
            // InternalTDsl.g:1195:4: (lv_leftSensor_0_0= ruleSensor )
            {
            // InternalTDsl.g:1195:4: (lv_leftSensor_0_0= ruleSensor )
            // InternalTDsl.g:1196:5: lv_leftSensor_0_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getLeftSensorSensorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalTDsl.g:1213:3: ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37||LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTDsl.g:1214:4: ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) )
                    {
                    // InternalTDsl.g:1214:4: ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) )
                    // InternalTDsl.g:1215:5: ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) )
                    {
                    // InternalTDsl.g:1215:5: ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) )
                    // InternalTDsl.g:1216:6: (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' )
                    {
                    // InternalTDsl.g:1216:6: (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==37) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==46) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalTDsl.g:1217:7: lv_operator_1_1= 'and'
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
                            // InternalTDsl.g:1228:7: lv_operator_1_2= 'or'
                            {
                            lv_operator_1_2=(Token)match(input,46,FOLLOW_25); 

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

                    // InternalTDsl.g:1241:4: ( (lv_rightSensor_2_0= ruleSensor ) )
                    // InternalTDsl.g:1242:5: (lv_rightSensor_2_0= ruleSensor )
                    {
                    // InternalTDsl.g:1242:5: (lv_rightSensor_2_0= ruleSensor )
                    // InternalTDsl.g:1243:6: lv_rightSensor_2_0= ruleSensor
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
    // InternalTDsl.g:1265:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalTDsl.g:1265:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalTDsl.g:1266:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
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
    // InternalTDsl.g:1272:1: ruleArithmeticExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? ) ;
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
            // InternalTDsl.g:1278:2: ( ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? ) )
            // InternalTDsl.g:1279:2: ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? )
            {
            // InternalTDsl.g:1279:2: ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? )
            // InternalTDsl.g:1280:3: ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )?
            {
            // InternalTDsl.g:1280:3: ( (lv_left_0_0= ruleEIntegerObject ) )
            // InternalTDsl.g:1281:4: (lv_left_0_0= ruleEIntegerObject )
            {
            // InternalTDsl.g:1281:4: (lv_left_0_0= ruleEIntegerObject )
            // InternalTDsl.g:1282:5: lv_left_0_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getLeftEIntegerObjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalTDsl.g:1299:3: ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=47 && LA17_0<=50)) ) {
                alt17=1;
            }
            else if ( (LA17_0==12) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==RULE_INT||LA17_2==12) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalTDsl.g:1300:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) )
                    {
                    // InternalTDsl.g:1300:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) )
                    // InternalTDsl.g:1301:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) )
                    {
                    // InternalTDsl.g:1301:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) )
                    // InternalTDsl.g:1302:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' )
                    {
                    // InternalTDsl.g:1302:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' )
                    int alt16=5;
                    switch ( input.LA(1) ) {
                    case 47:
                        {
                        alt16=1;
                        }
                        break;
                    case 12:
                        {
                        alt16=2;
                        }
                        break;
                    case 48:
                        {
                        alt16=3;
                        }
                        break;
                    case 49:
                        {
                        alt16=4;
                        }
                        break;
                    case 50:
                        {
                        alt16=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // InternalTDsl.g:1303:7: lv_operator_1_1= '+'
                            {
                            lv_operator_1_1=(Token)match(input,47,FOLLOW_11); 

                            							newLeafNode(lv_operator_1_1, grammarAccess.getArithmeticExpressionAccess().getOperatorPlusSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTDsl.g:1314:7: lv_operator_1_2= '-'
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
                            // InternalTDsl.g:1325:7: lv_operator_1_3= '*'
                            {
                            lv_operator_1_3=(Token)match(input,48,FOLLOW_11); 

                            							newLeafNode(lv_operator_1_3, grammarAccess.getArithmeticExpressionAccess().getOperatorAsteriskKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalTDsl.g:1336:7: lv_operator_1_4= '/'
                            {
                            lv_operator_1_4=(Token)match(input,49,FOLLOW_11); 

                            							newLeafNode(lv_operator_1_4, grammarAccess.getArithmeticExpressionAccess().getOperatorSolidusKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalTDsl.g:1347:7: lv_operator_1_5= 'mod'
                            {
                            lv_operator_1_5=(Token)match(input,50,FOLLOW_11); 

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

                    // InternalTDsl.g:1360:4: ( (lv_right_2_0= ruleEIntegerObject ) )
                    // InternalTDsl.g:1361:5: (lv_right_2_0= ruleEIntegerObject )
                    {
                    // InternalTDsl.g:1361:5: (lv_right_2_0= ruleEIntegerObject )
                    // InternalTDsl.g:1362:6: lv_right_2_0= ruleEIntegerObject
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
    // InternalTDsl.g:1384:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalTDsl.g:1384:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalTDsl.g:1385:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalTDsl.g:1391:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTDsl.g:1397:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTDsl.g:1398:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTDsl.g:1398:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTDsl.g:1399:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTDsl.g:1399:3: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTDsl.g:1400:4: kw= '-'
                    {
                    kw=(Token)match(input,12,FOLLOW_43); 

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
    // InternalTDsl.g:1417:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalTDsl.g:1417:45: (iv_ruleColor= ruleColor EOF )
            // InternalTDsl.g:1418:2: iv_ruleColor= ruleColor EOF
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
    // InternalTDsl.g:1424:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'light' | kw= 'dark' )? (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' ) ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1430:2: ( ( (kw= 'light' | kw= 'dark' )? (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' ) ) )
            // InternalTDsl.g:1431:2: ( (kw= 'light' | kw= 'dark' )? (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' ) )
            {
            // InternalTDsl.g:1431:2: ( (kw= 'light' | kw= 'dark' )? (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' ) )
            // InternalTDsl.g:1432:3: (kw= 'light' | kw= 'dark' )? (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' )
            {
            // InternalTDsl.g:1432:3: (kw= 'light' | kw= 'dark' )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==51) ) {
                alt19=1;
            }
            else if ( (LA19_0==52) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalTDsl.g:1433:4: kw= 'light'
                    {
                    kw=(Token)match(input,51,FOLLOW_44); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getLightKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1439:4: kw= 'dark'
                    {
                    kw=(Token)match(input,52,FOLLOW_44); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getDarkKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalTDsl.g:1445:3: (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt20=1;
                }
                break;
            case 54:
                {
                alt20=2;
                }
                break;
            case 55:
                {
                alt20=3;
                }
                break;
            case 56:
                {
                alt20=4;
                }
                break;
            case 57:
                {
                alt20=5;
                }
                break;
            case 58:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalTDsl.g:1446:4: kw= 'red'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getRedKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1452:4: kw= 'green'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getGreenKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1458:4: kw= 'blue'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getBlueKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1464:4: kw= 'black'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getBlackKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1470:4: kw= 'white'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getColorAccess().getWhiteKeyword_1_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalTDsl.g:1476:4: kw= 'yellow'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

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
    // InternalTDsl.g:1486:1: entryRuleSound returns [String current=null] : iv_ruleSound= ruleSound EOF ;
    public final String entryRuleSound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSound = null;


        try {
            // InternalTDsl.g:1486:45: (iv_ruleSound= ruleSound EOF )
            // InternalTDsl.g:1487:2: iv_ruleSound= ruleSound EOF
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
    // InternalTDsl.g:1493:1: ruleSound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' ) ;
    public final AntlrDatatypeRuleToken ruleSound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1499:2: ( (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' ) )
            // InternalTDsl.g:1500:2: (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' )
            {
            // InternalTDsl.g:1500:2: (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt21=1;
                }
                break;
            case 60:
                {
                alt21=2;
                }
                break;
            case 61:
                {
                alt21=3;
                }
                break;
            case 62:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalTDsl.g:1501:3: kw= 'sound1'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSoundAccess().getSound1Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1507:3: kw= 'sound2'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSoundAccess().getSound2Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1513:3: kw= 'sound3'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSoundAccess().getSound3Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1519:3: kw= 'sound4'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

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


    // $ANTLR start "entryRuleState_Horizontal_Sensor"
    // InternalTDsl.g:1528:1: entryRuleState_Horizontal_Sensor returns [String current=null] : iv_ruleState_Horizontal_Sensor= ruleState_Horizontal_Sensor EOF ;
    public final String entryRuleState_Horizontal_Sensor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState_Horizontal_Sensor = null;


        try {
            // InternalTDsl.g:1528:63: (iv_ruleState_Horizontal_Sensor= ruleState_Horizontal_Sensor EOF )
            // InternalTDsl.g:1529:2: iv_ruleState_Horizontal_Sensor= ruleState_Horizontal_Sensor EOF
            {
             newCompositeNode(grammarAccess.getState_Horizontal_SensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState_Horizontal_Sensor=ruleState_Horizontal_Sensor();

            state._fsp--;

             current =iv_ruleState_Horizontal_Sensor.getText(); 
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
    // $ANTLR end "entryRuleState_Horizontal_Sensor"


    // $ANTLR start "ruleState_Horizontal_Sensor"
    // InternalTDsl.g:1535:1: ruleState_Horizontal_Sensor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) ) ;
    public final AntlrDatatypeRuleToken ruleState_Horizontal_Sensor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1541:2: ( (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) ) )
            // InternalTDsl.g:1542:2: (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) )
            {
            // InternalTDsl.g:1542:2: (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==63) ) {
                alt22=1;
            }
            else if ( (LA22_0==64) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalTDsl.g:1543:3: kw= 'proximity'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getState_Horizontal_SensorAccess().getProximityKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1549:3: (kw= 'no' kw= 'proximity' )
                    {
                    // InternalTDsl.g:1549:3: (kw= 'no' kw= 'proximity' )
                    // InternalTDsl.g:1550:4: kw= 'no' kw= 'proximity'
                    {
                    kw=(Token)match(input,64,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getState_Horizontal_SensorAccess().getNoKeyword_1_0());
                    			
                    kw=(Token)match(input,63,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getState_Horizontal_SensorAccess().getProximityKeyword_1_1());
                    			

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
    // $ANTLR end "ruleState_Horizontal_Sensor"


    // $ANTLR start "entryRuleState_Ground_Sensor"
    // InternalTDsl.g:1565:1: entryRuleState_Ground_Sensor returns [String current=null] : iv_ruleState_Ground_Sensor= ruleState_Ground_Sensor EOF ;
    public final String entryRuleState_Ground_Sensor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState_Ground_Sensor = null;


        try {
            // InternalTDsl.g:1565:59: (iv_ruleState_Ground_Sensor= ruleState_Ground_Sensor EOF )
            // InternalTDsl.g:1566:2: iv_ruleState_Ground_Sensor= ruleState_Ground_Sensor EOF
            {
             newCompositeNode(grammarAccess.getState_Ground_SensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState_Ground_Sensor=ruleState_Ground_Sensor();

            state._fsp--;

             current =iv_ruleState_Ground_Sensor.getText(); 
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
    // $ANTLR end "entryRuleState_Ground_Sensor"


    // $ANTLR start "ruleState_Ground_Sensor"
    // InternalTDsl.g:1572:1: ruleState_Ground_Sensor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) | kw= 'black' | kw= 'white' ) ;
    public final AntlrDatatypeRuleToken ruleState_Ground_Sensor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1578:2: ( (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) | kw= 'black' | kw= 'white' ) )
            // InternalTDsl.g:1579:2: (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) | kw= 'black' | kw= 'white' )
            {
            // InternalTDsl.g:1579:2: (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) | kw= 'black' | kw= 'white' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt23=1;
                }
                break;
            case 64:
                {
                alt23=2;
                }
                break;
            case 56:
                {
                alt23=3;
                }
                break;
            case 57:
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
                    // InternalTDsl.g:1580:3: kw= 'proximity'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getState_Ground_SensorAccess().getProximityKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1586:3: (kw= 'no' kw= 'proximity' )
                    {
                    // InternalTDsl.g:1586:3: (kw= 'no' kw= 'proximity' )
                    // InternalTDsl.g:1587:4: kw= 'no' kw= 'proximity'
                    {
                    kw=(Token)match(input,64,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getState_Ground_SensorAccess().getNoKeyword_1_0());
                    			
                    kw=(Token)match(input,63,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getState_Ground_SensorAccess().getProximityKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1599:3: kw= 'black'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getState_Ground_SensorAccess().getBlackKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1605:3: kw= 'white'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getState_Ground_SensorAccess().getWhiteKeyword_3());
                    		

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
    // $ANTLR end "ruleState_Ground_Sensor"


    // $ANTLR start "entryRuleButtons"
    // InternalTDsl.g:1614:1: entryRuleButtons returns [String current=null] : iv_ruleButtons= ruleButtons EOF ;
    public final String entryRuleButtons() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleButtons = null;


        try {
            // InternalTDsl.g:1614:47: (iv_ruleButtons= ruleButtons EOF )
            // InternalTDsl.g:1615:2: iv_ruleButtons= ruleButtons EOF
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
    // InternalTDsl.g:1621:1: ruleButtons returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' ) ;
    public final AntlrDatatypeRuleToken ruleButtons() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1627:2: ( (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' ) )
            // InternalTDsl.g:1628:2: (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' )
            {
            // InternalTDsl.g:1628:2: (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' )
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
                    // InternalTDsl.g:1629:3: kw= 'center'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getCenterKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1635:3: kw= 'right'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getRightKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1641:3: kw= 'left'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getLeftKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1647:3: kw= 'forward'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getForwardKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1653:3: kw= 'backward'
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
    // InternalTDsl.g:1662:1: entryRuleState returns [String current=null] : iv_ruleState= ruleState EOF ;
    public final String entryRuleState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState = null;


        try {
            // InternalTDsl.g:1662:45: (iv_ruleState= ruleState EOF )
            // InternalTDsl.g:1663:2: iv_ruleState= ruleState EOF
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
    // InternalTDsl.g:1669:1: ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'touched' | kw= 'released' ) ;
    public final AntlrDatatypeRuleToken ruleState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1675:2: ( (kw= 'touched' | kw= 'released' ) )
            // InternalTDsl.g:1676:2: (kw= 'touched' | kw= 'released' )
            {
            // InternalTDsl.g:1676:2: (kw= 'touched' | kw= 'released' )
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
                    // InternalTDsl.g:1677:3: kw= 'touched'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateAccess().getTouchedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1683:3: kw= 'released'
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
    // InternalTDsl.g:1692:1: entryRuleRightLeft returns [String current=null] : iv_ruleRightLeft= ruleRightLeft EOF ;
    public final String entryRuleRightLeft() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightLeft = null;


        try {
            // InternalTDsl.g:1692:49: (iv_ruleRightLeft= ruleRightLeft EOF )
            // InternalTDsl.g:1693:2: iv_ruleRightLeft= ruleRightLeft EOF
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
    // InternalTDsl.g:1699:1: ruleRightLeft returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'left' | kw= 'right' ) ;
    public final AntlrDatatypeRuleToken ruleRightLeft() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1705:2: ( (kw= 'left' | kw= 'right' ) )
            // InternalTDsl.g:1706:2: (kw= 'left' | kw= 'right' )
            {
            // InternalTDsl.g:1706:2: (kw= 'left' | kw= 'right' )
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
                    // InternalTDsl.g:1707:3: kw= 'left'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRightLeftAccess().getLeftKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1713:3: kw= 'right'
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
    // InternalTDsl.g:1722:1: entryRuleHorizontalSensors returns [String current=null] : iv_ruleHorizontalSensors= ruleHorizontalSensors EOF ;
    public final String entryRuleHorizontalSensors() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHorizontalSensors = null;


        try {
            // InternalTDsl.g:1722:57: (iv_ruleHorizontalSensors= ruleHorizontalSensors EOF )
            // InternalTDsl.g:1723:2: iv_ruleHorizontalSensors= ruleHorizontalSensors EOF
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
    // InternalTDsl.g:1729:1: ruleHorizontalSensors returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) ) ;
    public final AntlrDatatypeRuleToken ruleHorizontalSensors() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1735:2: ( ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) ) )
            // InternalTDsl.g:1736:2: ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) )
            {
            // InternalTDsl.g:1736:2: ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) )
            int alt27=7;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalTDsl.g:1737:3: (kw= 'front' kw= 'left' )
                    {
                    // InternalTDsl.g:1737:3: (kw= 'front' kw= 'left' )
                    // InternalTDsl.g:1738:4: kw= 'front' kw= 'left'
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
                    // InternalTDsl.g:1750:3: (kw= 'front' kw= 'left/middle' )
                    {
                    // InternalTDsl.g:1750:3: (kw= 'front' kw= 'left/middle' )
                    // InternalTDsl.g:1751:4: kw= 'front' kw= 'left/middle'
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
                    // InternalTDsl.g:1763:3: (kw= 'front' kw= 'middle' )
                    {
                    // InternalTDsl.g:1763:3: (kw= 'front' kw= 'middle' )
                    // InternalTDsl.g:1764:4: kw= 'front' kw= 'middle'
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
                    // InternalTDsl.g:1776:3: (kw= 'front' kw= 'right/middle' )
                    {
                    // InternalTDsl.g:1776:3: (kw= 'front' kw= 'right/middle' )
                    // InternalTDsl.g:1777:4: kw= 'front' kw= 'right/middle'
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
                    // InternalTDsl.g:1789:3: (kw= 'front' kw= 'right' )
                    {
                    // InternalTDsl.g:1789:3: (kw= 'front' kw= 'right' )
                    // InternalTDsl.g:1790:4: kw= 'front' kw= 'right'
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
                    // InternalTDsl.g:1802:3: (kw= 'backward' kw= 'left' )
                    {
                    // InternalTDsl.g:1802:3: (kw= 'backward' kw= 'left' )
                    // InternalTDsl.g:1803:4: kw= 'backward' kw= 'left'
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
                    // InternalTDsl.g:1815:3: (kw= 'backward' kw= 'right' )
                    {
                    // InternalTDsl.g:1815:3: (kw= 'backward' kw= 'right' )
                    // InternalTDsl.g:1816:4: kw= 'backward' kw= 'right'
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
    static final String dfa_4s = "\3\uffff\1\3\1\5\1\2\1\4\1\1\1\6\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\66\uffff\1\1",
            "\1\4\1\7\3\uffff\1\5\1\3\1\6",
            "\1\11\1\10",
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
            return "1736:2: ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) )";
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x7800000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x07F8000000000000L});
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
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8300000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000402000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0007800000001002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});

}