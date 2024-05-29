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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'On'", "'do'", "':'", "'-'", "'drive'", "'forward'", "'backward'", "'with'", "'speed'", "'turn'", "'stop'", "'driving'", "'turning'", "'play'", "'sound'", "'playing'", "'set'", "'bottom'", "'color'", "'to'", "'off'", "'leds'", "'top'", "'If'", "'End'", "'if'", "'and'", "'button'", "'horizontal'", "'sensor'", "'detecting'", "'ground'", "'tap'", "'clap'", "'or'", "'+'", "'*'", "'/'", "'mod'", "'red'", "'green'", "'blue'", "'black'", "'white'", "'yellow'", "'pink'", "'orange'", "'sound1'", "'sound2'", "'sound3'", "'sound4'", "'proximity'", "'no'", "'center'", "'right'", "'left'", "'touched'", "'released'", "'front'", "'left/middle'", "'middle'", "'right/middle'"
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

                if ( (LA2_0==35) ) {
                    alt2=1;
                }
                else if ( (LA2_0==15) ) {
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
    // InternalTDsl.g:190:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'On' (this_UpperEvent_1= ruleUpperEvent | this_ProxEvent_2= ruleProxEvent | this_TapEvent_3= ruleTapEvent | this_ClapEvent_4= ruleClapEvent ) otherlv_5= 'do' otherlv_6= ':' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject this_UpperEvent_1 = null;

        EObject this_ProxEvent_2 = null;

        EObject this_TapEvent_3 = null;

        EObject this_ClapEvent_4 = null;



        	enterRule();

        try {
            // InternalTDsl.g:196:2: ( (otherlv_0= 'On' (this_UpperEvent_1= ruleUpperEvent | this_ProxEvent_2= ruleProxEvent | this_TapEvent_3= ruleTapEvent | this_ClapEvent_4= ruleClapEvent ) otherlv_5= 'do' otherlv_6= ':' ) )
            // InternalTDsl.g:197:2: (otherlv_0= 'On' (this_UpperEvent_1= ruleUpperEvent | this_ProxEvent_2= ruleProxEvent | this_TapEvent_3= ruleTapEvent | this_ClapEvent_4= ruleClapEvent ) otherlv_5= 'do' otherlv_6= ':' )
            {
            // InternalTDsl.g:197:2: (otherlv_0= 'On' (this_UpperEvent_1= ruleUpperEvent | this_ProxEvent_2= ruleProxEvent | this_TapEvent_3= ruleTapEvent | this_ClapEvent_4= ruleClapEvent ) otherlv_5= 'do' otherlv_6= ':' )
            // InternalTDsl.g:198:3: otherlv_0= 'On' (this_UpperEvent_1= ruleUpperEvent | this_ProxEvent_2= ruleProxEvent | this_TapEvent_3= ruleTapEvent | this_ClapEvent_4= ruleClapEvent ) otherlv_5= 'do' otherlv_6= ':'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getOnKeyword_0());
            		
            // InternalTDsl.g:202:3: (this_UpperEvent_1= ruleUpperEvent | this_ProxEvent_2= ruleProxEvent | this_TapEvent_3= ruleTapEvent | this_ClapEvent_4= ruleClapEvent )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
            case 65:
                {
                alt3=1;
                }
                break;
            case 66:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==43) ) {
                    alt3=2;
                }
                else if ( ((LA3_2>=38 && LA3_2<=39)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==43) ) {
                    alt3=2;
                }
                else if ( ((LA3_3>=38 && LA3_3<=39)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=66 && LA3_4<=67)) ) {
                    alt3=2;
                }
                else if ( ((LA3_4>=38 && LA3_4<=39)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 70:
                {
                alt3=2;
                }
                break;
            case 44:
                {
                alt3=3;
                }
                break;
            case 45:
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
                    // InternalTDsl.g:203:4: this_UpperEvent_1= ruleUpperEvent
                    {

                    				newCompositeNode(grammarAccess.getEventAccess().getUpperEventParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_8);
                    this_UpperEvent_1=ruleUpperEvent();

                    state._fsp--;


                    				current = this_UpperEvent_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:212:4: this_ProxEvent_2= ruleProxEvent
                    {

                    				newCompositeNode(grammarAccess.getEventAccess().getProxEventParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_ProxEvent_2=ruleProxEvent();

                    state._fsp--;


                    				current = this_ProxEvent_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:221:4: this_TapEvent_3= ruleTapEvent
                    {

                    				newCompositeNode(grammarAccess.getEventAccess().getTapEventParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_TapEvent_3=ruleTapEvent();

                    state._fsp--;


                    				current = this_TapEvent_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:230:4: this_ClapEvent_4= ruleClapEvent
                    {

                    				newCompositeNode(grammarAccess.getEventAccess().getClapEventParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_8);
                    this_ClapEvent_4=ruleClapEvent();

                    state._fsp--;


                    				current = this_ClapEvent_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getEventAccess().getDoKeyword_2());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEventAccess().getColonKeyword_3());
            		

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
    // InternalTDsl.g:251:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalTDsl.g:251:47: (iv_ruleAction= ruleAction EOF )
            // InternalTDsl.g:252:2: iv_ruleAction= ruleAction EOF
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
    // InternalTDsl.g:258:1: ruleAction returns [EObject current=null] : (otherlv_0= '-' (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_MovementAction_1 = null;

        EObject this_SoundAction_2 = null;

        EObject this_ColorBottomAction_3 = null;

        EObject this_ColorTopAction_4 = null;



        	enterRule();

        try {
            // InternalTDsl.g:264:2: ( (otherlv_0= '-' (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction ) ) )
            // InternalTDsl.g:265:2: (otherlv_0= '-' (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction ) )
            {
            // InternalTDsl.g:265:2: (otherlv_0= '-' (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction ) )
            // InternalTDsl.g:266:3: otherlv_0= '-' (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getHyphenMinusKeyword_0());
            		
            // InternalTDsl.g:270:3: (this_MovementAction_1= ruleMovementAction | this_SoundAction_2= ruleSoundAction | this_ColorBottomAction_3= ruleColorBottomAction | this_ColorTopAction_4= ruleColorTopAction )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==32) ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==29) ) {
                        alt4=3;
                    }
                    else if ( (LA4_6==34) ) {
                        alt4=4;
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
            case 22:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==27) ) {
                    alt4=2;
                }
                else if ( ((LA4_3>=23 && LA4_3<=24)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==29) ) {
                    alt4=3;
                }
                else if ( (LA4_5==34) ) {
                    alt4=4;
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
                    // InternalTDsl.g:271:4: this_MovementAction_1= ruleMovementAction
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
                    // InternalTDsl.g:280:4: this_SoundAction_2= ruleSoundAction
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
                    // InternalTDsl.g:289:4: this_ColorBottomAction_3= ruleColorBottomAction
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
                    // InternalTDsl.g:298:4: this_ColorTopAction_4= ruleColorTopAction
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
    // InternalTDsl.g:311:1: entryRuleMovementAction returns [EObject current=null] : iv_ruleMovementAction= ruleMovementAction EOF ;
    public final EObject entryRuleMovementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovementAction = null;


        try {
            // InternalTDsl.g:311:55: (iv_ruleMovementAction= ruleMovementAction EOF )
            // InternalTDsl.g:312:2: iv_ruleMovementAction= ruleMovementAction EOF
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
    // InternalTDsl.g:318:1: ruleMovementAction returns [EObject current=null] : ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) ) | ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) ) ) ;
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
            // InternalTDsl.g:324:2: ( ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) ) | ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) ) ) )
            // InternalTDsl.g:325:2: ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) ) | ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) ) )
            {
            // InternalTDsl.g:325:2: ( (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? ) | (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) ) | ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) ) | ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==23) ) {
                    alt7=3;
                }
                else if ( (LA7_3==24) ) {
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
                    // InternalTDsl.g:326:3: (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? )
                    {
                    // InternalTDsl.g:326:3: (otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )? )
                    // InternalTDsl.g:327:4: otherlv_0= 'drive' ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) ) (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )?
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getMovementActionAccess().getDriveKeyword_0_0());
                    			
                    // InternalTDsl.g:331:4: ( ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) ) )
                    // InternalTDsl.g:332:5: ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) )
                    {
                    // InternalTDsl.g:332:5: ( (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' ) )
                    // InternalTDsl.g:333:6: (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' )
                    {
                    // InternalTDsl.g:333:6: (lv_direction_1_1= 'forward' | lv_direction_1_2= 'backward' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==17) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==18) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalTDsl.g:334:7: lv_direction_1_1= 'forward'
                            {
                            lv_direction_1_1=(Token)match(input,17,FOLLOW_12); 

                            							newLeafNode(lv_direction_1_1, grammarAccess.getMovementActionAccess().getDirectionForwardKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMovementActionRule());
                            							}
                            							setWithLastConsumed(current, "direction", lv_direction_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTDsl.g:345:7: lv_direction_1_2= 'backward'
                            {
                            lv_direction_1_2=(Token)match(input,18,FOLLOW_12); 

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

                    // InternalTDsl.g:358:4: (otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==19) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalTDsl.g:359:5: otherlv_2= 'with' otherlv_3= 'speed' ( (lv_speed_4_0= ruleArithmeticExpression ) )
                            {
                            otherlv_2=(Token)match(input,19,FOLLOW_13); 

                            					newLeafNode(otherlv_2, grammarAccess.getMovementActionAccess().getWithKeyword_0_2_0());
                            				
                            otherlv_3=(Token)match(input,20,FOLLOW_14); 

                            					newLeafNode(otherlv_3, grammarAccess.getMovementActionAccess().getSpeedKeyword_0_2_1());
                            				
                            // InternalTDsl.g:367:5: ( (lv_speed_4_0= ruleArithmeticExpression ) )
                            // InternalTDsl.g:368:6: (lv_speed_4_0= ruleArithmeticExpression )
                            {
                            // InternalTDsl.g:368:6: (lv_speed_4_0= ruleArithmeticExpression )
                            // InternalTDsl.g:369:7: lv_speed_4_0= ruleArithmeticExpression
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
                    // InternalTDsl.g:389:3: (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) )
                    {
                    // InternalTDsl.g:389:3: (otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) ) )
                    // InternalTDsl.g:390:4: otherlv_5= 'turn' ( (lv_direction_6_0= ruleRightLeft ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getMovementActionAccess().getTurnKeyword_1_0());
                    			
                    // InternalTDsl.g:394:4: ( (lv_direction_6_0= ruleRightLeft ) )
                    // InternalTDsl.g:395:5: (lv_direction_6_0= ruleRightLeft )
                    {
                    // InternalTDsl.g:395:5: (lv_direction_6_0= ruleRightLeft )
                    // InternalTDsl.g:396:6: lv_direction_6_0= ruleRightLeft
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
                    // InternalTDsl.g:415:3: ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) )
                    {
                    // InternalTDsl.g:415:3: ( () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) ) )
                    // InternalTDsl.g:416:4: () otherlv_8= 'stop' ( (lv_direction_9_0= 'driving' ) )
                    {
                    // InternalTDsl.g:416:4: ()
                    // InternalTDsl.g:417:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMovementActionAccess().getMovementActionAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getMovementActionAccess().getStopKeyword_2_1());
                    			
                    // InternalTDsl.g:427:4: ( (lv_direction_9_0= 'driving' ) )
                    // InternalTDsl.g:428:5: (lv_direction_9_0= 'driving' )
                    {
                    // InternalTDsl.g:428:5: (lv_direction_9_0= 'driving' )
                    // InternalTDsl.g:429:6: lv_direction_9_0= 'driving'
                    {
                    lv_direction_9_0=(Token)match(input,23,FOLLOW_2); 

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
                    // InternalTDsl.g:443:3: ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) )
                    {
                    // InternalTDsl.g:443:3: ( () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) ) )
                    // InternalTDsl.g:444:4: () otherlv_11= 'stop' ( (lv_direction_12_0= 'turning' ) )
                    {
                    // InternalTDsl.g:444:4: ()
                    // InternalTDsl.g:445:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMovementActionAccess().getMovementActionAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getMovementActionAccess().getStopKeyword_3_1());
                    			
                    // InternalTDsl.g:455:4: ( (lv_direction_12_0= 'turning' ) )
                    // InternalTDsl.g:456:5: (lv_direction_12_0= 'turning' )
                    {
                    // InternalTDsl.g:456:5: (lv_direction_12_0= 'turning' )
                    // InternalTDsl.g:457:6: lv_direction_12_0= 'turning'
                    {
                    lv_direction_12_0=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTDsl.g:474:1: entryRuleSoundAction returns [EObject current=null] : iv_ruleSoundAction= ruleSoundAction EOF ;
    public final EObject entryRuleSoundAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoundAction = null;


        try {
            // InternalTDsl.g:474:52: (iv_ruleSoundAction= ruleSoundAction EOF )
            // InternalTDsl.g:475:2: iv_ruleSoundAction= ruleSoundAction EOF
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
    // InternalTDsl.g:481:1: ruleSoundAction returns [EObject current=null] : ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) ) ;
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
            // InternalTDsl.g:487:2: ( ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) ) )
            // InternalTDsl.g:488:2: ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) )
            {
            // InternalTDsl.g:488:2: ( (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) ) | ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTDsl.g:489:3: (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) )
                    {
                    // InternalTDsl.g:489:3: (otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) ) )
                    // InternalTDsl.g:490:4: otherlv_0= 'play' otherlv_1= 'sound' ( (lv_sound_2_0= ruleSound ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getSoundActionAccess().getPlayKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getSoundActionAccess().getSoundKeyword_0_1());
                    			
                    // InternalTDsl.g:498:4: ( (lv_sound_2_0= ruleSound ) )
                    // InternalTDsl.g:499:5: (lv_sound_2_0= ruleSound )
                    {
                    // InternalTDsl.g:499:5: (lv_sound_2_0= ruleSound )
                    // InternalTDsl.g:500:6: lv_sound_2_0= ruleSound
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
                    // InternalTDsl.g:519:3: ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' )
                    {
                    // InternalTDsl.g:519:3: ( () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound' )
                    // InternalTDsl.g:520:4: () otherlv_4= 'stop' otherlv_5= 'playing' otherlv_6= 'sound'
                    {
                    // InternalTDsl.g:520:4: ()
                    // InternalTDsl.g:521:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSoundActionAccess().getSoundActionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getSoundActionAccess().getStopKeyword_1_1());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getSoundActionAccess().getPlayingKeyword_1_2());
                    			
                    otherlv_6=(Token)match(input,26,FOLLOW_2); 

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
    // InternalTDsl.g:544:1: entryRuleColorBottomAction returns [EObject current=null] : iv_ruleColorBottomAction= ruleColorBottomAction EOF ;
    public final EObject entryRuleColorBottomAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorBottomAction = null;


        try {
            // InternalTDsl.g:544:58: (iv_ruleColorBottomAction= ruleColorBottomAction EOF )
            // InternalTDsl.g:545:2: iv_ruleColorBottomAction= ruleColorBottomAction EOF
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
    // InternalTDsl.g:551:1: ruleColorBottomAction returns [EObject current=null] : ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) ) ;
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
            // InternalTDsl.g:557:2: ( ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) ) )
            // InternalTDsl.g:558:2: ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) )
            {
            // InternalTDsl.g:558:2: ( (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTDsl.g:559:3: (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    {
                    // InternalTDsl.g:559:3: (otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    // InternalTDsl.g:560:4: otherlv_0= 'set' otherlv_1= 'bottom' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getColorBottomActionAccess().getSetKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getColorBottomActionAccess().getBottomKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getColorBottomActionAccess().getColorKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorBottomActionAccess().getToKeyword_0_3());
                    			
                    // InternalTDsl.g:576:4: ( (lv_color_4_0= ruleColor ) )
                    // InternalTDsl.g:577:5: (lv_color_4_0= ruleColor )
                    {
                    // InternalTDsl.g:577:5: (lv_color_4_0= ruleColor )
                    // InternalTDsl.g:578:6: lv_color_4_0= ruleColor
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
                    // InternalTDsl.g:597:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' )
                    {
                    // InternalTDsl.g:597:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds' )
                    // InternalTDsl.g:598:4: () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'bottom' otherlv_9= 'leds'
                    {
                    // InternalTDsl.g:598:4: ()
                    // InternalTDsl.g:599:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorBottomActionAccess().getColorBottomActionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getColorBottomActionAccess().getTurnKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,32,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getColorBottomActionAccess().getOffKeyword_1_2());
                    			
                    otherlv_8=(Token)match(input,29,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getColorBottomActionAccess().getBottomKeyword_1_3());
                    			
                    otherlv_9=(Token)match(input,33,FOLLOW_2); 

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
    // InternalTDsl.g:626:1: entryRuleColorTopAction returns [EObject current=null] : iv_ruleColorTopAction= ruleColorTopAction EOF ;
    public final EObject entryRuleColorTopAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorTopAction = null;


        try {
            // InternalTDsl.g:626:55: (iv_ruleColorTopAction= ruleColorTopAction EOF )
            // InternalTDsl.g:627:2: iv_ruleColorTopAction= ruleColorTopAction EOF
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
    // InternalTDsl.g:633:1: ruleColorTopAction returns [EObject current=null] : ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) ) ;
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
            // InternalTDsl.g:639:2: ( ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) ) )
            // InternalTDsl.g:640:2: ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) )
            {
            // InternalTDsl.g:640:2: ( (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) ) | ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTDsl.g:641:3: (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    {
                    // InternalTDsl.g:641:3: (otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) ) )
                    // InternalTDsl.g:642:4: otherlv_0= 'set' otherlv_1= 'top' otherlv_2= 'color' otherlv_3= 'to' ( (lv_color_4_0= ruleColor ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getColorTopActionAccess().getSetKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,34,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getColorTopActionAccess().getTopKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getColorTopActionAccess().getColorKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorTopActionAccess().getToKeyword_0_3());
                    			
                    // InternalTDsl.g:658:4: ( (lv_color_4_0= ruleColor ) )
                    // InternalTDsl.g:659:5: (lv_color_4_0= ruleColor )
                    {
                    // InternalTDsl.g:659:5: (lv_color_4_0= ruleColor )
                    // InternalTDsl.g:660:6: lv_color_4_0= ruleColor
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
                    // InternalTDsl.g:679:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' )
                    {
                    // InternalTDsl.g:679:3: ( () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds' )
                    // InternalTDsl.g:680:4: () otherlv_6= 'turn' otherlv_7= 'off' otherlv_8= 'top' otherlv_9= 'leds'
                    {
                    // InternalTDsl.g:680:4: ()
                    // InternalTDsl.g:681:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorTopActionAccess().getColorTopActionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getColorTopActionAccess().getTurnKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getColorTopActionAccess().getOffKeyword_1_2());
                    			
                    otherlv_8=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getColorTopActionAccess().getTopKeyword_1_3());
                    			
                    otherlv_9=(Token)match(input,33,FOLLOW_2); 

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
    // InternalTDsl.g:708:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalTDsl.g:708:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalTDsl.g:709:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalTDsl.g:715:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' ) ;
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
            // InternalTDsl.g:721:2: ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' ) )
            // InternalTDsl.g:722:2: (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' )
            {
            // InternalTDsl.g:722:2: (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if' )
            // InternalTDsl.g:723:3: otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ':' ( (lv_action_3_0= ruleAction ) )+ otherlv_4= 'End' otherlv_5= 'if'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalTDsl.g:727:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalTDsl.g:728:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalTDsl.g:728:4: (lv_condition_1_0= ruleCondition )
            // InternalTDsl.g:729:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getColonKeyword_2());
            		
            // InternalTDsl.g:750:3: ( (lv_action_3_0= ruleAction ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTDsl.g:751:4: (lv_action_3_0= ruleAction )
            	    {
            	    // InternalTDsl.g:751:4: (lv_action_3_0= ruleAction )
            	    // InternalTDsl.g:752:5: lv_action_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementAccess().getActionActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
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

            otherlv_4=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getEndKeyword_4());
            		
            otherlv_5=(Token)match(input,37,FOLLOW_2); 

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
    // InternalTDsl.g:781:1: entryRuleUpperEvent returns [EObject current=null] : iv_ruleUpperEvent= ruleUpperEvent EOF ;
    public final EObject entryRuleUpperEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperEvent = null;


        try {
            // InternalTDsl.g:781:51: (iv_ruleUpperEvent= ruleUpperEvent EOF )
            // InternalTDsl.g:782:2: iv_ruleUpperEvent= ruleUpperEvent EOF
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
    // InternalTDsl.g:788:1: ruleUpperEvent returns [EObject current=null] : ( ( (lv_button_0_0= ruleButton ) ) (otherlv_1= 'and' ( (lv_button_2_0= ruleButton ) ) )* otherlv_3= 'button' ( (lv_state_4_0= ruleState ) ) ) ;
    public final EObject ruleUpperEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_button_0_0 = null;

        EObject lv_button_2_0 = null;

        AntlrDatatypeRuleToken lv_state_4_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:794:2: ( ( ( (lv_button_0_0= ruleButton ) ) (otherlv_1= 'and' ( (lv_button_2_0= ruleButton ) ) )* otherlv_3= 'button' ( (lv_state_4_0= ruleState ) ) ) )
            // InternalTDsl.g:795:2: ( ( (lv_button_0_0= ruleButton ) ) (otherlv_1= 'and' ( (lv_button_2_0= ruleButton ) ) )* otherlv_3= 'button' ( (lv_state_4_0= ruleState ) ) )
            {
            // InternalTDsl.g:795:2: ( ( (lv_button_0_0= ruleButton ) ) (otherlv_1= 'and' ( (lv_button_2_0= ruleButton ) ) )* otherlv_3= 'button' ( (lv_state_4_0= ruleState ) ) )
            // InternalTDsl.g:796:3: ( (lv_button_0_0= ruleButton ) ) (otherlv_1= 'and' ( (lv_button_2_0= ruleButton ) ) )* otherlv_3= 'button' ( (lv_state_4_0= ruleState ) )
            {
            // InternalTDsl.g:796:3: ( (lv_button_0_0= ruleButton ) )
            // InternalTDsl.g:797:4: (lv_button_0_0= ruleButton )
            {
            // InternalTDsl.g:797:4: (lv_button_0_0= ruleButton )
            // InternalTDsl.g:798:5: lv_button_0_0= ruleButton
            {

            					newCompositeNode(grammarAccess.getUpperEventAccess().getButtonButtonParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_button_0_0=ruleButton();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpperEventRule());
            					}
            					add(
            						current,
            						"button",
            						lv_button_0_0,
            						"org.xtext.project.tdsl.TDsl.Button");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTDsl.g:815:3: (otherlv_1= 'and' ( (lv_button_2_0= ruleButton ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTDsl.g:816:4: otherlv_1= 'and' ( (lv_button_2_0= ruleButton ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_31); 

            	    				newLeafNode(otherlv_1, grammarAccess.getUpperEventAccess().getAndKeyword_1_0());
            	    			
            	    // InternalTDsl.g:820:4: ( (lv_button_2_0= ruleButton ) )
            	    // InternalTDsl.g:821:5: (lv_button_2_0= ruleButton )
            	    {
            	    // InternalTDsl.g:821:5: (lv_button_2_0= ruleButton )
            	    // InternalTDsl.g:822:6: lv_button_2_0= ruleButton
            	    {

            	    						newCompositeNode(grammarAccess.getUpperEventAccess().getButtonButtonParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_button_2_0=ruleButton();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpperEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"button",
            	    							lv_button_2_0,
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

            otherlv_3=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getUpperEventAccess().getButtonKeyword_2());
            		
            // InternalTDsl.g:844:3: ( (lv_state_4_0= ruleState ) )
            // InternalTDsl.g:845:4: (lv_state_4_0= ruleState )
            {
            // InternalTDsl.g:845:4: (lv_state_4_0= ruleState )
            // InternalTDsl.g:846:5: lv_state_4_0= ruleState
            {

            					newCompositeNode(grammarAccess.getUpperEventAccess().getStateStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_4_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpperEventRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_4_0,
            						"org.xtext.project.tdsl.TDsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleUpperEvent"


    // $ANTLR start "entryRuleButton"
    // InternalTDsl.g:867:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalTDsl.g:867:47: (iv_ruleButton= ruleButton EOF )
            // InternalTDsl.g:868:2: iv_ruleButton= ruleButton EOF
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
    // InternalTDsl.g:874:1: ruleButton returns [EObject current=null] : ( (lv_name_0_0= ruleButtons ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:880:2: ( ( (lv_name_0_0= ruleButtons ) ) )
            // InternalTDsl.g:881:2: ( (lv_name_0_0= ruleButtons ) )
            {
            // InternalTDsl.g:881:2: ( (lv_name_0_0= ruleButtons ) )
            // InternalTDsl.g:882:3: (lv_name_0_0= ruleButtons )
            {
            // InternalTDsl.g:882:3: (lv_name_0_0= ruleButtons )
            // InternalTDsl.g:883:4: lv_name_0_0= ruleButtons
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
    // InternalTDsl.g:903:1: entryRuleProxEvent returns [EObject current=null] : iv_ruleProxEvent= ruleProxEvent EOF ;
    public final EObject entryRuleProxEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProxEvent = null;


        try {
            // InternalTDsl.g:903:50: (iv_ruleProxEvent= ruleProxEvent EOF )
            // InternalTDsl.g:904:2: iv_ruleProxEvent= ruleProxEvent EOF
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
    // InternalTDsl.g:910:1: ruleProxEvent returns [EObject current=null] : ( (lv_sensor_0_0= ruleSensor ) ) ;
    public final EObject ruleProxEvent() throws RecognitionException {
        EObject current = null;

        EObject lv_sensor_0_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:916:2: ( ( (lv_sensor_0_0= ruleSensor ) ) )
            // InternalTDsl.g:917:2: ( (lv_sensor_0_0= ruleSensor ) )
            {
            // InternalTDsl.g:917:2: ( (lv_sensor_0_0= ruleSensor ) )
            // InternalTDsl.g:918:3: (lv_sensor_0_0= ruleSensor )
            {
            // InternalTDsl.g:918:3: (lv_sensor_0_0= ruleSensor )
            // InternalTDsl.g:919:4: lv_sensor_0_0= ruleSensor
            {

            				newCompositeNode(grammarAccess.getProxEventAccess().getSensorSensorParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_sensor_0_0=ruleSensor();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getProxEventRule());
            				}
            				set(
            					current,
            					"sensor",
            					lv_sensor_0_0,
            					"org.xtext.project.tdsl.TDsl.Sensor");
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
    // $ANTLR end "ruleProxEvent"


    // $ANTLR start "entryRuleSensor"
    // InternalTDsl.g:939:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalTDsl.g:939:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalTDsl.g:940:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalTDsl.g:946:1: ruleSensor returns [EObject current=null] : ( ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) ) | ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) ) ) ;
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
            // InternalTDsl.g:952:2: ( ( ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) ) | ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) ) ) )
            // InternalTDsl.g:953:2: ( ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) ) | ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) ) )
            {
            // InternalTDsl.g:953:2: ( ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) ) | ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18||LA13_0==70) ) {
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
                    // InternalTDsl.g:954:3: ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) )
                    {
                    // InternalTDsl.g:954:3: ( ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) ) )
                    // InternalTDsl.g:955:4: ( (lv_direction_0_0= ruleHorizontalSensors ) ) ( (lv_sensor_type_1_0= 'horizontal' ) ) otherlv_2= 'sensor' otherlv_3= 'detecting' ( (lv_state_4_0= ruleState_Horizontal_Sensor ) )
                    {
                    // InternalTDsl.g:955:4: ( (lv_direction_0_0= ruleHorizontalSensors ) )
                    // InternalTDsl.g:956:5: (lv_direction_0_0= ruleHorizontalSensors )
                    {
                    // InternalTDsl.g:956:5: (lv_direction_0_0= ruleHorizontalSensors )
                    // InternalTDsl.g:957:6: lv_direction_0_0= ruleHorizontalSensors
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

                    // InternalTDsl.g:974:4: ( (lv_sensor_type_1_0= 'horizontal' ) )
                    // InternalTDsl.g:975:5: (lv_sensor_type_1_0= 'horizontal' )
                    {
                    // InternalTDsl.g:975:5: (lv_sensor_type_1_0= 'horizontal' )
                    // InternalTDsl.g:976:6: lv_sensor_type_1_0= 'horizontal'
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
                    			
                    // InternalTDsl.g:996:4: ( (lv_state_4_0= ruleState_Horizontal_Sensor ) )
                    // InternalTDsl.g:997:5: (lv_state_4_0= ruleState_Horizontal_Sensor )
                    {
                    // InternalTDsl.g:997:5: (lv_state_4_0= ruleState_Horizontal_Sensor )
                    // InternalTDsl.g:998:6: lv_state_4_0= ruleState_Horizontal_Sensor
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
                    // InternalTDsl.g:1017:3: ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) )
                    {
                    // InternalTDsl.g:1017:3: ( ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) ) )
                    // InternalTDsl.g:1018:4: ( (lv_direction_5_0= ruleRightLeft ) ) ( (lv_sensor_type_6_0= 'ground' ) ) otherlv_7= 'sensor' otherlv_8= 'detecting' ( (lv_state_9_0= ruleState_Ground_Sensor ) )
                    {
                    // InternalTDsl.g:1018:4: ( (lv_direction_5_0= ruleRightLeft ) )
                    // InternalTDsl.g:1019:5: (lv_direction_5_0= ruleRightLeft )
                    {
                    // InternalTDsl.g:1019:5: (lv_direction_5_0= ruleRightLeft )
                    // InternalTDsl.g:1020:6: lv_direction_5_0= ruleRightLeft
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

                    // InternalTDsl.g:1037:4: ( (lv_sensor_type_6_0= 'ground' ) )
                    // InternalTDsl.g:1038:5: (lv_sensor_type_6_0= 'ground' )
                    {
                    // InternalTDsl.g:1038:5: (lv_sensor_type_6_0= 'ground' )
                    // InternalTDsl.g:1039:6: lv_sensor_type_6_0= 'ground'
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
                    			
                    // InternalTDsl.g:1059:4: ( (lv_state_9_0= ruleState_Ground_Sensor ) )
                    // InternalTDsl.g:1060:5: (lv_state_9_0= ruleState_Ground_Sensor )
                    {
                    // InternalTDsl.g:1060:5: (lv_state_9_0= ruleState_Ground_Sensor )
                    // InternalTDsl.g:1061:6: lv_state_9_0= ruleState_Ground_Sensor
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
    // InternalTDsl.g:1083:1: entryRuleTapEvent returns [EObject current=null] : iv_ruleTapEvent= ruleTapEvent EOF ;
    public final EObject entryRuleTapEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTapEvent = null;


        try {
            // InternalTDsl.g:1083:49: (iv_ruleTapEvent= ruleTapEvent EOF )
            // InternalTDsl.g:1084:2: iv_ruleTapEvent= ruleTapEvent EOF
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
    // InternalTDsl.g:1090:1: ruleTapEvent returns [EObject current=null] : ( () otherlv_1= 'tap' ) ;
    public final EObject ruleTapEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTDsl.g:1096:2: ( ( () otherlv_1= 'tap' ) )
            // InternalTDsl.g:1097:2: ( () otherlv_1= 'tap' )
            {
            // InternalTDsl.g:1097:2: ( () otherlv_1= 'tap' )
            // InternalTDsl.g:1098:3: () otherlv_1= 'tap'
            {
            // InternalTDsl.g:1098:3: ()
            // InternalTDsl.g:1099:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTapEventAccess().getTapEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTapEventAccess().getTapKeyword_1());
            		

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
    // InternalTDsl.g:1113:1: entryRuleClapEvent returns [EObject current=null] : iv_ruleClapEvent= ruleClapEvent EOF ;
    public final EObject entryRuleClapEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClapEvent = null;


        try {
            // InternalTDsl.g:1113:50: (iv_ruleClapEvent= ruleClapEvent EOF )
            // InternalTDsl.g:1114:2: iv_ruleClapEvent= ruleClapEvent EOF
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
    // InternalTDsl.g:1120:1: ruleClapEvent returns [EObject current=null] : ( () otherlv_1= 'clap' ) ;
    public final EObject ruleClapEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTDsl.g:1126:2: ( ( () otherlv_1= 'clap' ) )
            // InternalTDsl.g:1127:2: ( () otherlv_1= 'clap' )
            {
            // InternalTDsl.g:1127:2: ( () otherlv_1= 'clap' )
            // InternalTDsl.g:1128:3: () otherlv_1= 'clap'
            {
            // InternalTDsl.g:1128:3: ()
            // InternalTDsl.g:1129:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClapEventAccess().getClapEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getClapEventAccess().getClapKeyword_1());
            		

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
    // InternalTDsl.g:1143:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalTDsl.g:1143:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalTDsl.g:1144:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalTDsl.g:1150:1: ruleCondition returns [EObject current=null] : ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        EObject lv_leftSensor_0_0 = null;

        EObject lv_rightSensor_2_0 = null;



        	enterRule();

        try {
            // InternalTDsl.g:1156:2: ( ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? ) )
            // InternalTDsl.g:1157:2: ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? )
            {
            // InternalTDsl.g:1157:2: ( ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )? )
            // InternalTDsl.g:1158:3: ( (lv_leftSensor_0_0= ruleSensor ) ) ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )?
            {
            // InternalTDsl.g:1158:3: ( (lv_leftSensor_0_0= ruleSensor ) )
            // InternalTDsl.g:1159:4: (lv_leftSensor_0_0= ruleSensor )
            {
            // InternalTDsl.g:1159:4: (lv_leftSensor_0_0= ruleSensor )
            // InternalTDsl.g:1160:5: lv_leftSensor_0_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getLeftSensorSensorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_39);
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

            // InternalTDsl.g:1177:3: ( ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38||LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTDsl.g:1178:4: ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) ) ( (lv_rightSensor_2_0= ruleSensor ) )
                    {
                    // InternalTDsl.g:1178:4: ( ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) ) )
                    // InternalTDsl.g:1179:5: ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) )
                    {
                    // InternalTDsl.g:1179:5: ( (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' ) )
                    // InternalTDsl.g:1180:6: (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' )
                    {
                    // InternalTDsl.g:1180:6: (lv_operator_1_1= 'and' | lv_operator_1_2= 'or' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==38) ) {
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
                            // InternalTDsl.g:1181:7: lv_operator_1_1= 'and'
                            {
                            lv_operator_1_1=(Token)match(input,38,FOLLOW_15); 

                            							newLeafNode(lv_operator_1_1, grammarAccess.getConditionAccess().getOperatorAndKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTDsl.g:1192:7: lv_operator_1_2= 'or'
                            {
                            lv_operator_1_2=(Token)match(input,46,FOLLOW_15); 

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

                    // InternalTDsl.g:1205:4: ( (lv_rightSensor_2_0= ruleSensor ) )
                    // InternalTDsl.g:1206:5: (lv_rightSensor_2_0= ruleSensor )
                    {
                    // InternalTDsl.g:1206:5: (lv_rightSensor_2_0= ruleSensor )
                    // InternalTDsl.g:1207:6: lv_rightSensor_2_0= ruleSensor
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
    // InternalTDsl.g:1229:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalTDsl.g:1229:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalTDsl.g:1230:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
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
    // InternalTDsl.g:1236:1: ruleArithmeticExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? ) ;
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
            // InternalTDsl.g:1242:2: ( ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? ) )
            // InternalTDsl.g:1243:2: ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? )
            {
            // InternalTDsl.g:1243:2: ( ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )? )
            // InternalTDsl.g:1244:3: ( (lv_left_0_0= ruleEIntegerObject ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )?
            {
            // InternalTDsl.g:1244:3: ( (lv_left_0_0= ruleEIntegerObject ) )
            // InternalTDsl.g:1245:4: (lv_left_0_0= ruleEIntegerObject )
            {
            // InternalTDsl.g:1245:4: (lv_left_0_0= ruleEIntegerObject )
            // InternalTDsl.g:1246:5: lv_left_0_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getLeftEIntegerObjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalTDsl.g:1263:3: ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=47 && LA17_0<=50)) ) {
                alt17=1;
            }
            else if ( (LA17_0==15) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==RULE_INT||LA17_2==15) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalTDsl.g:1264:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) ) ( (lv_right_2_0= ruleEIntegerObject ) )
                    {
                    // InternalTDsl.g:1264:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) ) )
                    // InternalTDsl.g:1265:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) )
                    {
                    // InternalTDsl.g:1265:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' ) )
                    // InternalTDsl.g:1266:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' )
                    {
                    // InternalTDsl.g:1266:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '*' | lv_operator_1_4= '/' | lv_operator_1_5= 'mod' )
                    int alt16=5;
                    switch ( input.LA(1) ) {
                    case 47:
                        {
                        alt16=1;
                        }
                        break;
                    case 15:
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
                            // InternalTDsl.g:1267:7: lv_operator_1_1= '+'
                            {
                            lv_operator_1_1=(Token)match(input,47,FOLLOW_14); 

                            							newLeafNode(lv_operator_1_1, grammarAccess.getArithmeticExpressionAccess().getOperatorPlusSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTDsl.g:1278:7: lv_operator_1_2= '-'
                            {
                            lv_operator_1_2=(Token)match(input,15,FOLLOW_14); 

                            							newLeafNode(lv_operator_1_2, grammarAccess.getArithmeticExpressionAccess().getOperatorHyphenMinusKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalTDsl.g:1289:7: lv_operator_1_3= '*'
                            {
                            lv_operator_1_3=(Token)match(input,48,FOLLOW_14); 

                            							newLeafNode(lv_operator_1_3, grammarAccess.getArithmeticExpressionAccess().getOperatorAsteriskKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalTDsl.g:1300:7: lv_operator_1_4= '/'
                            {
                            lv_operator_1_4=(Token)match(input,49,FOLLOW_14); 

                            							newLeafNode(lv_operator_1_4, grammarAccess.getArithmeticExpressionAccess().getOperatorSolidusKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithmeticExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalTDsl.g:1311:7: lv_operator_1_5= 'mod'
                            {
                            lv_operator_1_5=(Token)match(input,50,FOLLOW_14); 

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

                    // InternalTDsl.g:1324:4: ( (lv_right_2_0= ruleEIntegerObject ) )
                    // InternalTDsl.g:1325:5: (lv_right_2_0= ruleEIntegerObject )
                    {
                    // InternalTDsl.g:1325:5: (lv_right_2_0= ruleEIntegerObject )
                    // InternalTDsl.g:1326:6: lv_right_2_0= ruleEIntegerObject
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
    // InternalTDsl.g:1348:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalTDsl.g:1348:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalTDsl.g:1349:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalTDsl.g:1355:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTDsl.g:1361:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTDsl.g:1362:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTDsl.g:1362:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTDsl.g:1363:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTDsl.g:1363:3: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTDsl.g:1364:4: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_41); 

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
    // InternalTDsl.g:1381:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalTDsl.g:1381:45: (iv_ruleColor= ruleColor EOF )
            // InternalTDsl.g:1382:2: iv_ruleColor= ruleColor EOF
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
    // InternalTDsl.g:1388:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' | kw= 'pink' | kw= 'orange' ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1394:2: ( (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' | kw= 'pink' | kw= 'orange' ) )
            // InternalTDsl.g:1395:2: (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' | kw= 'pink' | kw= 'orange' )
            {
            // InternalTDsl.g:1395:2: (kw= 'red' | kw= 'green' | kw= 'blue' | kw= 'black' | kw= 'white' | kw= 'yellow' | kw= 'pink' | kw= 'orange' )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt19=1;
                }
                break;
            case 52:
                {
                alt19=2;
                }
                break;
            case 53:
                {
                alt19=3;
                }
                break;
            case 54:
                {
                alt19=4;
                }
                break;
            case 55:
                {
                alt19=5;
                }
                break;
            case 56:
                {
                alt19=6;
                }
                break;
            case 57:
                {
                alt19=7;
                }
                break;
            case 58:
                {
                alt19=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalTDsl.g:1396:3: kw= 'red'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getRedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1402:3: kw= 'green'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getGreenKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1408:3: kw= 'blue'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getBlueKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1414:3: kw= 'black'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getBlackKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1420:3: kw= 'white'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getWhiteKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalTDsl.g:1426:3: kw= 'yellow'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getYellowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalTDsl.g:1432:3: kw= 'pink'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getPinkKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalTDsl.g:1438:3: kw= 'orange'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getOrangeKeyword_7());
                    		

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleSound"
    // InternalTDsl.g:1447:1: entryRuleSound returns [String current=null] : iv_ruleSound= ruleSound EOF ;
    public final String entryRuleSound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSound = null;


        try {
            // InternalTDsl.g:1447:45: (iv_ruleSound= ruleSound EOF )
            // InternalTDsl.g:1448:2: iv_ruleSound= ruleSound EOF
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
    // InternalTDsl.g:1454:1: ruleSound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' ) ;
    public final AntlrDatatypeRuleToken ruleSound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1460:2: ( (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' ) )
            // InternalTDsl.g:1461:2: (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' )
            {
            // InternalTDsl.g:1461:2: (kw= 'sound1' | kw= 'sound2' | kw= 'sound3' | kw= 'sound4' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt20=1;
                }
                break;
            case 60:
                {
                alt20=2;
                }
                break;
            case 61:
                {
                alt20=3;
                }
                break;
            case 62:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalTDsl.g:1462:3: kw= 'sound1'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSoundAccess().getSound1Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1468:3: kw= 'sound2'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSoundAccess().getSound2Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1474:3: kw= 'sound3'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSoundAccess().getSound3Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1480:3: kw= 'sound4'
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
    // InternalTDsl.g:1489:1: entryRuleState_Horizontal_Sensor returns [String current=null] : iv_ruleState_Horizontal_Sensor= ruleState_Horizontal_Sensor EOF ;
    public final String entryRuleState_Horizontal_Sensor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState_Horizontal_Sensor = null;


        try {
            // InternalTDsl.g:1489:63: (iv_ruleState_Horizontal_Sensor= ruleState_Horizontal_Sensor EOF )
            // InternalTDsl.g:1490:2: iv_ruleState_Horizontal_Sensor= ruleState_Horizontal_Sensor EOF
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
    // InternalTDsl.g:1496:1: ruleState_Horizontal_Sensor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) ) ;
    public final AntlrDatatypeRuleToken ruleState_Horizontal_Sensor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1502:2: ( (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) ) )
            // InternalTDsl.g:1503:2: (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) )
            {
            // InternalTDsl.g:1503:2: (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==63) ) {
                alt21=1;
            }
            else if ( (LA21_0==64) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTDsl.g:1504:3: kw= 'proximity'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getState_Horizontal_SensorAccess().getProximityKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1510:3: (kw= 'no' kw= 'proximity' )
                    {
                    // InternalTDsl.g:1510:3: (kw= 'no' kw= 'proximity' )
                    // InternalTDsl.g:1511:4: kw= 'no' kw= 'proximity'
                    {
                    kw=(Token)match(input,64,FOLLOW_42); 

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
    // InternalTDsl.g:1526:1: entryRuleState_Ground_Sensor returns [String current=null] : iv_ruleState_Ground_Sensor= ruleState_Ground_Sensor EOF ;
    public final String entryRuleState_Ground_Sensor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState_Ground_Sensor = null;


        try {
            // InternalTDsl.g:1526:59: (iv_ruleState_Ground_Sensor= ruleState_Ground_Sensor EOF )
            // InternalTDsl.g:1527:2: iv_ruleState_Ground_Sensor= ruleState_Ground_Sensor EOF
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
    // InternalTDsl.g:1533:1: ruleState_Ground_Sensor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) | kw= 'black' | kw= 'white' ) ;
    public final AntlrDatatypeRuleToken ruleState_Ground_Sensor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1539:2: ( (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) | kw= 'black' | kw= 'white' ) )
            // InternalTDsl.g:1540:2: (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) | kw= 'black' | kw= 'white' )
            {
            // InternalTDsl.g:1540:2: (kw= 'proximity' | (kw= 'no' kw= 'proximity' ) | kw= 'black' | kw= 'white' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt22=1;
                }
                break;
            case 64:
                {
                alt22=2;
                }
                break;
            case 54:
                {
                alt22=3;
                }
                break;
            case 55:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalTDsl.g:1541:3: kw= 'proximity'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getState_Ground_SensorAccess().getProximityKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1547:3: (kw= 'no' kw= 'proximity' )
                    {
                    // InternalTDsl.g:1547:3: (kw= 'no' kw= 'proximity' )
                    // InternalTDsl.g:1548:4: kw= 'no' kw= 'proximity'
                    {
                    kw=(Token)match(input,64,FOLLOW_42); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getState_Ground_SensorAccess().getNoKeyword_1_0());
                    			
                    kw=(Token)match(input,63,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getState_Ground_SensorAccess().getProximityKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1560:3: kw= 'black'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getState_Ground_SensorAccess().getBlackKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1566:3: kw= 'white'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalTDsl.g:1575:1: entryRuleButtons returns [String current=null] : iv_ruleButtons= ruleButtons EOF ;
    public final String entryRuleButtons() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleButtons = null;


        try {
            // InternalTDsl.g:1575:47: (iv_ruleButtons= ruleButtons EOF )
            // InternalTDsl.g:1576:2: iv_ruleButtons= ruleButtons EOF
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
    // InternalTDsl.g:1582:1: ruleButtons returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' ) ;
    public final AntlrDatatypeRuleToken ruleButtons() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1588:2: ( (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' ) )
            // InternalTDsl.g:1589:2: (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' )
            {
            // InternalTDsl.g:1589:2: (kw= 'center' | kw= 'right' | kw= 'left' | kw= 'forward' | kw= 'backward' )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt23=1;
                }
                break;
            case 66:
                {
                alt23=2;
                }
                break;
            case 67:
                {
                alt23=3;
                }
                break;
            case 17:
                {
                alt23=4;
                }
                break;
            case 18:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalTDsl.g:1590:3: kw= 'center'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getCenterKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1596:3: kw= 'right'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getRightKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1602:3: kw= 'left'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getLeftKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1608:3: kw= 'forward'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getButtonsAccess().getForwardKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1614:3: kw= 'backward'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

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
    // InternalTDsl.g:1623:1: entryRuleState returns [String current=null] : iv_ruleState= ruleState EOF ;
    public final String entryRuleState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState = null;


        try {
            // InternalTDsl.g:1623:45: (iv_ruleState= ruleState EOF )
            // InternalTDsl.g:1624:2: iv_ruleState= ruleState EOF
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
    // InternalTDsl.g:1630:1: ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'touched' | kw= 'released' ) ;
    public final AntlrDatatypeRuleToken ruleState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1636:2: ( (kw= 'touched' | kw= 'released' ) )
            // InternalTDsl.g:1637:2: (kw= 'touched' | kw= 'released' )
            {
            // InternalTDsl.g:1637:2: (kw= 'touched' | kw= 'released' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==68) ) {
                alt24=1;
            }
            else if ( (LA24_0==69) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalTDsl.g:1638:3: kw= 'touched'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateAccess().getTouchedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1644:3: kw= 'released'
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
    // InternalTDsl.g:1653:1: entryRuleRightLeft returns [String current=null] : iv_ruleRightLeft= ruleRightLeft EOF ;
    public final String entryRuleRightLeft() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightLeft = null;


        try {
            // InternalTDsl.g:1653:49: (iv_ruleRightLeft= ruleRightLeft EOF )
            // InternalTDsl.g:1654:2: iv_ruleRightLeft= ruleRightLeft EOF
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
    // InternalTDsl.g:1660:1: ruleRightLeft returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'left' | kw= 'right' ) ;
    public final AntlrDatatypeRuleToken ruleRightLeft() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1666:2: ( (kw= 'left' | kw= 'right' ) )
            // InternalTDsl.g:1667:2: (kw= 'left' | kw= 'right' )
            {
            // InternalTDsl.g:1667:2: (kw= 'left' | kw= 'right' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==67) ) {
                alt25=1;
            }
            else if ( (LA25_0==66) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalTDsl.g:1668:3: kw= 'left'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRightLeftAccess().getLeftKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1674:3: kw= 'right'
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
    // InternalTDsl.g:1683:1: entryRuleHorizontalSensors returns [String current=null] : iv_ruleHorizontalSensors= ruleHorizontalSensors EOF ;
    public final String entryRuleHorizontalSensors() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHorizontalSensors = null;


        try {
            // InternalTDsl.g:1683:57: (iv_ruleHorizontalSensors= ruleHorizontalSensors EOF )
            // InternalTDsl.g:1684:2: iv_ruleHorizontalSensors= ruleHorizontalSensors EOF
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
    // InternalTDsl.g:1690:1: ruleHorizontalSensors returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) ) ;
    public final AntlrDatatypeRuleToken ruleHorizontalSensors() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTDsl.g:1696:2: ( ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) ) )
            // InternalTDsl.g:1697:2: ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) )
            {
            // InternalTDsl.g:1697:2: ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) )
            int alt26=7;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalTDsl.g:1698:3: (kw= 'front' kw= 'left' )
                    {
                    // InternalTDsl.g:1698:3: (kw= 'front' kw= 'left' )
                    // InternalTDsl.g:1699:4: kw= 'front' kw= 'left'
                    {
                    kw=(Token)match(input,70,FOLLOW_43); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_0_0());
                    			
                    kw=(Token)match(input,67,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getLeftKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTDsl.g:1711:3: (kw= 'front' kw= 'left/middle' )
                    {
                    // InternalTDsl.g:1711:3: (kw= 'front' kw= 'left/middle' )
                    // InternalTDsl.g:1712:4: kw= 'front' kw= 'left/middle'
                    {
                    kw=(Token)match(input,70,FOLLOW_44); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_1_0());
                    			
                    kw=(Token)match(input,71,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getLeftMiddleKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTDsl.g:1724:3: (kw= 'front' kw= 'middle' )
                    {
                    // InternalTDsl.g:1724:3: (kw= 'front' kw= 'middle' )
                    // InternalTDsl.g:1725:4: kw= 'front' kw= 'middle'
                    {
                    kw=(Token)match(input,70,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_2_0());
                    			
                    kw=(Token)match(input,72,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getMiddleKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTDsl.g:1737:3: (kw= 'front' kw= 'right/middle' )
                    {
                    // InternalTDsl.g:1737:3: (kw= 'front' kw= 'right/middle' )
                    // InternalTDsl.g:1738:4: kw= 'front' kw= 'right/middle'
                    {
                    kw=(Token)match(input,70,FOLLOW_46); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_3_0());
                    			
                    kw=(Token)match(input,73,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getRightMiddleKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTDsl.g:1750:3: (kw= 'front' kw= 'right' )
                    {
                    // InternalTDsl.g:1750:3: (kw= 'front' kw= 'right' )
                    // InternalTDsl.g:1751:4: kw= 'front' kw= 'right'
                    {
                    kw=(Token)match(input,70,FOLLOW_47); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getFrontKeyword_4_0());
                    			
                    kw=(Token)match(input,66,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getRightKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTDsl.g:1763:3: (kw= 'backward' kw= 'left' )
                    {
                    // InternalTDsl.g:1763:3: (kw= 'backward' kw= 'left' )
                    // InternalTDsl.g:1764:4: kw= 'backward' kw= 'left'
                    {
                    kw=(Token)match(input,18,FOLLOW_43); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getBackwardKeyword_5_0());
                    			
                    kw=(Token)match(input,67,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getHorizontalSensorsAccess().getLeftKeyword_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTDsl.g:1776:3: (kw= 'backward' kw= 'right' )
                    {
                    // InternalTDsl.g:1776:3: (kw= 'backward' kw= 'right' )
                    // InternalTDsl.g:1777:4: kw= 'backward' kw= 'right'
                    {
                    kw=(Token)match(input,18,FOLLOW_47); 

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


    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\22\2\102\7\uffff";
    static final String dfa_3s = "\1\106\1\111\1\103\7\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\4\1\1\1\3\1\5\1\7\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\63\uffff\1\1",
            "\1\7\1\5\3\uffff\1\3\1\6\1\4",
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

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1697:2: ( (kw= 'front' kw= 'left' ) | (kw= 'front' kw= 'left/middle' ) | (kw= 'front' kw= 'middle' ) | (kw= 'front' kw= 'right/middle' ) | (kw= 'front' kw= 'right' ) | (kw= 'backward' kw= 'left' ) | (kw= 'backward' kw= 'right' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000300000060000L,0x000000000000004EL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000012610000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L,0x000000000000004CL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x7800000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x07F8000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000060000L,0x000000000000000EL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x80C0000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000404000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0007800000008002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});

}