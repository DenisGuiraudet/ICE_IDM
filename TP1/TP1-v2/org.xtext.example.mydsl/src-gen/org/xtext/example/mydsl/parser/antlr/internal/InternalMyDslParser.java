package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'state'", "'and'", "'}'", "'transition'", "'State'", "'Transition'", "':'", "'from'", "'('", "')'", "'to'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalMyDsl.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalMyDsl.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalMyDsl.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalMyDsl.g:71:1: ruleStateMachine returns [EObject current=null] : ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' otherlv_5= '{' ( (lv_state_6_0= ruleState ) ) (otherlv_7= 'and' ( (lv_state_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transition' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= 'and' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_6_0 = null;

        EObject lv_state_8_0 = null;

        EObject lv_transition_12_0 = null;

        EObject lv_transition_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' otherlv_5= '{' ( (lv_state_6_0= ruleState ) ) (otherlv_7= 'and' ( (lv_state_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transition' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= 'and' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' otherlv_5= '{' ( (lv_state_6_0= ruleState ) ) (otherlv_7= 'and' ( (lv_state_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transition' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= 'and' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' otherlv_5= '{' ( (lv_state_6_0= ruleState ) ) (otherlv_7= 'and' ( (lv_state_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transition' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= 'and' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' otherlv_5= '{' ( (lv_state_6_0= ruleState ) ) (otherlv_7= 'and' ( (lv_state_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transition' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= 'and' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:113:3: (otherlv_4= 'state' otherlv_5= '{' ( (lv_state_6_0= ruleState ) ) (otherlv_7= 'and' ( (lv_state_8_0= ruleState ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:114:4: otherlv_4= 'state' otherlv_5= '{' ( (lv_state_6_0= ruleState ) ) (otherlv_7= 'and' ( (lv_state_8_0= ruleState ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getStateKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:122:4: ( (lv_state_6_0= ruleState ) )
                    // InternalMyDsl.g:123:5: (lv_state_6_0= ruleState )
                    {
                    // InternalMyDsl.g:123:5: (lv_state_6_0= ruleState )
                    // InternalMyDsl.g:124:6: lv_state_6_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_state_6_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    						}
                    						add(
                    							current,
                    							"state",
                    							lv_state_6_0,
                    							"org.xtext.example.mydsl.MyDsl.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:141:4: (otherlv_7= 'and' ( (lv_state_8_0= ruleState ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:142:5: otherlv_7= 'and' ( (lv_state_8_0= ruleState ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getAndKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:146:5: ( (lv_state_8_0= ruleState ) )
                    	    // InternalMyDsl.g:147:6: (lv_state_8_0= ruleState )
                    	    {
                    	    // InternalMyDsl.g:147:6: (lv_state_8_0= ruleState )
                    	    // InternalMyDsl.g:148:7: lv_state_8_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_state_8_0=ruleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"state",
                    	    								lv_state_8_0,
                    	    								"org.xtext.example.mydsl.MyDsl.State");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:171:3: (otherlv_10= 'transition' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= 'and' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:172:4: otherlv_10= 'transition' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= 'and' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getTransitionKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:180:4: ( (lv_transition_12_0= ruleTransition ) )
                    // InternalMyDsl.g:181:5: (lv_transition_12_0= ruleTransition )
                    {
                    // InternalMyDsl.g:181:5: (lv_transition_12_0= ruleTransition )
                    // InternalMyDsl.g:182:6: lv_transition_12_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_transition_12_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    						}
                    						add(
                    							current,
                    							"transition",
                    							lv_transition_12_0,
                    							"org.xtext.example.mydsl.MyDsl.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:199:4: (otherlv_13= 'and' ( (lv_transition_14_0= ruleTransition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:200:5: otherlv_13= 'and' ( (lv_transition_14_0= ruleTransition ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getAndKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:204:5: ( (lv_transition_14_0= ruleTransition ) )
                    	    // InternalMyDsl.g:205:6: (lv_transition_14_0= ruleTransition )
                    	    {
                    	    // InternalMyDsl.g:205:6: (lv_transition_14_0= ruleTransition )
                    	    // InternalMyDsl.g:206:7: lv_transition_14_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_transition_14_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transition",
                    	    								lv_transition_14_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:237:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:237:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:238:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // InternalMyDsl.g:244:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:250:2: ( (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:251:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:251:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:252:3: otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalMyDsl.g:256:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:257:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:257:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:258:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:279:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:279:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:280:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:286:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'from' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'to' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= 'and' ( ( ruleEString ) ) )* otherlv_15= ')' )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:292:2: ( ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'from' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'to' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= 'and' ( ( ruleEString ) ) )* otherlv_15= ')' )? ) )
            // InternalMyDsl.g:293:2: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'from' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'to' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= 'and' ( ( ruleEString ) ) )* otherlv_15= ')' )? )
            {
            // InternalMyDsl.g:293:2: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'from' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'to' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= 'and' ( ( ruleEString ) ) )* otherlv_15= ')' )? )
            // InternalMyDsl.g:294:3: () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'from' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'to' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= 'and' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            {
            // InternalMyDsl.g:294:3: ()
            // InternalMyDsl.g:295:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            // InternalMyDsl.g:305:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:306:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:306:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:307:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:328:3: (otherlv_4= 'from' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:329:4: otherlv_4= 'from' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getFromKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMyDsl.g:337:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:338:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:338:5: ( ruleEString )
                    // InternalMyDsl.g:339:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getOutgoingStateCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:353:4: (otherlv_7= 'and' ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:354:5: otherlv_7= 'and' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getAndKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:358:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:359:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:359:6: ( ruleEString )
                    	    // InternalMyDsl.g:360:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTransitionAccess().getOutgoingStateCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:380:3: (otherlv_10= 'to' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= 'and' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:381:4: otherlv_10= 'to' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= 'and' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getToKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:389:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:390:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:390:5: ( ruleEString )
                    // InternalMyDsl.g:391:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getIncomingStateCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:405:4: (otherlv_13= 'and' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:406:5: otherlv_13= 'and' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getAndKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:410:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:411:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:411:6: ( ruleEString )
                    	    // InternalMyDsl.g:412:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTransitionAccess().getIncomingStateCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_5_4());
                    			

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:436:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:436:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:437:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:443:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:449:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:450:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:450:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:451:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:459:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});

}