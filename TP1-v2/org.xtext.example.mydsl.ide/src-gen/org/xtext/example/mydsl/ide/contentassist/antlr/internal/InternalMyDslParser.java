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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'}'", "'state'", "'and'", "'transition'", "'State'", "'Transition'", "':'", "'from'", "'('", "')'", "'to'"
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



    // $ANTLR start "entryRuleStateMachine"
    // InternalMyDsl.g:53:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleStateMachine EOF )
            // InternalMyDsl.g:55:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalMyDsl.g:62:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__StateMachine__Group__0 )
            // InternalMyDsl.g:69:4: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:78:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleState EOF )
            // InternalMyDsl.g:80:1: ruleState EOF
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
    // InternalMyDsl.g:87:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__State__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__State__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__State__Group__0 )
            // InternalMyDsl.g:94:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:103:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleTransition EOF )
            // InternalMyDsl.g:105:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:112:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Transition__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Transition__Group__0 )
            // InternalMyDsl.g:119:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEString EOF )
            // InternalMyDsl.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    // InternalMyDsl.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    // InternalMyDsl.g:164:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__StateMachine__Group__0"
    // InternalMyDsl.g:173:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:177:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // InternalMyDsl.g:178:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // InternalMyDsl.g:185:1: rule__StateMachine__Group__0__Impl : ( () ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:189:1: ( ( () ) )
            // InternalMyDsl.g:190:1: ( () )
            {
            // InternalMyDsl.g:190:1: ( () )
            // InternalMyDsl.g:191:2: ()
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 
            // InternalMyDsl.g:192:2: ()
            // InternalMyDsl.g:192:3: 
            {
            }

             after(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // InternalMyDsl.g:200:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:204:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // InternalMyDsl.g:205:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // InternalMyDsl.g:212:1: rule__StateMachine__Group__1__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:1: ( ( 'StateMachine' ) )
            // InternalMyDsl.g:217:1: ( 'StateMachine' )
            {
            // InternalMyDsl.g:217:1: ( 'StateMachine' )
            // InternalMyDsl.g:218:2: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // InternalMyDsl.g:227:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // InternalMyDsl.g:232:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // InternalMyDsl.g:239:1: rule__StateMachine__Group__2__Impl : ( ( rule__StateMachine__NameAssignment_2 ) ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:243:1: ( ( ( rule__StateMachine__NameAssignment_2 ) ) )
            // InternalMyDsl.g:244:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:244:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            // InternalMyDsl.g:245:2: ( rule__StateMachine__NameAssignment_2 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:246:2: ( rule__StateMachine__NameAssignment_2 )
            // InternalMyDsl.g:246:3: rule__StateMachine__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // InternalMyDsl.g:254:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:258:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // InternalMyDsl.g:259:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // InternalMyDsl.g:266:1: rule__StateMachine__Group__3__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:270:1: ( ( '{' ) )
            // InternalMyDsl.g:271:1: ( '{' )
            {
            // InternalMyDsl.g:271:1: ( '{' )
            // InternalMyDsl.g:272:2: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // InternalMyDsl.g:281:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:285:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // InternalMyDsl.g:286:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // InternalMyDsl.g:293:1: rule__StateMachine__Group__4__Impl : ( ( rule__StateMachine__Group_4__0 )? ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( ( ( rule__StateMachine__Group_4__0 )? ) )
            // InternalMyDsl.g:298:1: ( ( rule__StateMachine__Group_4__0 )? )
            {
            // InternalMyDsl.g:298:1: ( ( rule__StateMachine__Group_4__0 )? )
            // InternalMyDsl.g:299:2: ( rule__StateMachine__Group_4__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_4()); 
            // InternalMyDsl.g:300:2: ( rule__StateMachine__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:300:3: rule__StateMachine__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group__5"
    // InternalMyDsl.g:308:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:312:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // InternalMyDsl.g:313:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5"


    // $ANTLR start "rule__StateMachine__Group__5__Impl"
    // InternalMyDsl.g:320:1: rule__StateMachine__Group__5__Impl : ( ( rule__StateMachine__Group_5__0 )? ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:324:1: ( ( ( rule__StateMachine__Group_5__0 )? ) )
            // InternalMyDsl.g:325:1: ( ( rule__StateMachine__Group_5__0 )? )
            {
            // InternalMyDsl.g:325:1: ( ( rule__StateMachine__Group_5__0 )? )
            // InternalMyDsl.g:326:2: ( rule__StateMachine__Group_5__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_5()); 
            // InternalMyDsl.g:327:2: ( rule__StateMachine__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:327:3: rule__StateMachine__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5__Impl"


    // $ANTLR start "rule__StateMachine__Group__6"
    // InternalMyDsl.g:335:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:339:1: ( rule__StateMachine__Group__6__Impl )
            // InternalMyDsl.g:340:2: rule__StateMachine__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6"


    // $ANTLR start "rule__StateMachine__Group__6__Impl"
    // InternalMyDsl.g:346:1: rule__StateMachine__Group__6__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:350:1: ( ( '}' ) )
            // InternalMyDsl.g:351:1: ( '}' )
            {
            // InternalMyDsl.g:351:1: ( '}' )
            // InternalMyDsl.g:352:2: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__0"
    // InternalMyDsl.g:362:1: rule__StateMachine__Group_4__0 : rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1 ;
    public final void rule__StateMachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:1: ( rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1 )
            // InternalMyDsl.g:367:2: rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__0"


    // $ANTLR start "rule__StateMachine__Group_4__0__Impl"
    // InternalMyDsl.g:374:1: rule__StateMachine__Group_4__0__Impl : ( 'state' ) ;
    public final void rule__StateMachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( ( 'state' ) )
            // InternalMyDsl.g:379:1: ( 'state' )
            {
            // InternalMyDsl.g:379:1: ( 'state' )
            // InternalMyDsl.g:380:2: 'state'
            {
             before(grammarAccess.getStateMachineAccess().getStateKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__1"
    // InternalMyDsl.g:389:1: rule__StateMachine__Group_4__1 : rule__StateMachine__Group_4__1__Impl rule__StateMachine__Group_4__2 ;
    public final void rule__StateMachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:393:1: ( rule__StateMachine__Group_4__1__Impl rule__StateMachine__Group_4__2 )
            // InternalMyDsl.g:394:2: rule__StateMachine__Group_4__1__Impl rule__StateMachine__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__StateMachine__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__1"


    // $ANTLR start "rule__StateMachine__Group_4__1__Impl"
    // InternalMyDsl.g:401:1: rule__StateMachine__Group_4__1__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( ( '{' ) )
            // InternalMyDsl.g:406:1: ( '{' )
            {
            // InternalMyDsl.g:406:1: ( '{' )
            // InternalMyDsl.g:407:2: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__2"
    // InternalMyDsl.g:416:1: rule__StateMachine__Group_4__2 : rule__StateMachine__Group_4__2__Impl rule__StateMachine__Group_4__3 ;
    public final void rule__StateMachine__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:420:1: ( rule__StateMachine__Group_4__2__Impl rule__StateMachine__Group_4__3 )
            // InternalMyDsl.g:421:2: rule__StateMachine__Group_4__2__Impl rule__StateMachine__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__StateMachine__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__2"


    // $ANTLR start "rule__StateMachine__Group_4__2__Impl"
    // InternalMyDsl.g:428:1: rule__StateMachine__Group_4__2__Impl : ( ( rule__StateMachine__StateAssignment_4_2 ) ) ;
    public final void rule__StateMachine__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( ( rule__StateMachine__StateAssignment_4_2 ) ) )
            // InternalMyDsl.g:433:1: ( ( rule__StateMachine__StateAssignment_4_2 ) )
            {
            // InternalMyDsl.g:433:1: ( ( rule__StateMachine__StateAssignment_4_2 ) )
            // InternalMyDsl.g:434:2: ( rule__StateMachine__StateAssignment_4_2 )
            {
             before(grammarAccess.getStateMachineAccess().getStateAssignment_4_2()); 
            // InternalMyDsl.g:435:2: ( rule__StateMachine__StateAssignment_4_2 )
            // InternalMyDsl.g:435:3: rule__StateMachine__StateAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__StateAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStateAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__3"
    // InternalMyDsl.g:443:1: rule__StateMachine__Group_4__3 : rule__StateMachine__Group_4__3__Impl rule__StateMachine__Group_4__4 ;
    public final void rule__StateMachine__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:447:1: ( rule__StateMachine__Group_4__3__Impl rule__StateMachine__Group_4__4 )
            // InternalMyDsl.g:448:2: rule__StateMachine__Group_4__3__Impl rule__StateMachine__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__StateMachine__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__3"


    // $ANTLR start "rule__StateMachine__Group_4__3__Impl"
    // InternalMyDsl.g:455:1: rule__StateMachine__Group_4__3__Impl : ( ( rule__StateMachine__Group_4_3__0 )* ) ;
    public final void rule__StateMachine__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:459:1: ( ( ( rule__StateMachine__Group_4_3__0 )* ) )
            // InternalMyDsl.g:460:1: ( ( rule__StateMachine__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:460:1: ( ( rule__StateMachine__Group_4_3__0 )* )
            // InternalMyDsl.g:461:2: ( rule__StateMachine__Group_4_3__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_4_3()); 
            // InternalMyDsl.g:462:2: ( rule__StateMachine__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:462:3: rule__StateMachine__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__StateMachine__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__3__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__4"
    // InternalMyDsl.g:470:1: rule__StateMachine__Group_4__4 : rule__StateMachine__Group_4__4__Impl ;
    public final void rule__StateMachine__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:474:1: ( rule__StateMachine__Group_4__4__Impl )
            // InternalMyDsl.g:475:2: rule__StateMachine__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__4"


    // $ANTLR start "rule__StateMachine__Group_4__4__Impl"
    // InternalMyDsl.g:481:1: rule__StateMachine__Group_4__4__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:485:1: ( ( '}' ) )
            // InternalMyDsl.g:486:1: ( '}' )
            {
            // InternalMyDsl.g:486:1: ( '}' )
            // InternalMyDsl.g:487:2: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__4__Impl"


    // $ANTLR start "rule__StateMachine__Group_4_3__0"
    // InternalMyDsl.g:497:1: rule__StateMachine__Group_4_3__0 : rule__StateMachine__Group_4_3__0__Impl rule__StateMachine__Group_4_3__1 ;
    public final void rule__StateMachine__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:501:1: ( rule__StateMachine__Group_4_3__0__Impl rule__StateMachine__Group_4_3__1 )
            // InternalMyDsl.g:502:2: rule__StateMachine__Group_4_3__0__Impl rule__StateMachine__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__StateMachine__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4_3__0"


    // $ANTLR start "rule__StateMachine__Group_4_3__0__Impl"
    // InternalMyDsl.g:509:1: rule__StateMachine__Group_4_3__0__Impl : ( 'and' ) ;
    public final void rule__StateMachine__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:513:1: ( ( 'and' ) )
            // InternalMyDsl.g:514:1: ( 'and' )
            {
            // InternalMyDsl.g:514:1: ( 'and' )
            // InternalMyDsl.g:515:2: 'and'
            {
             before(grammarAccess.getStateMachineAccess().getAndKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getAndKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_4_3__1"
    // InternalMyDsl.g:524:1: rule__StateMachine__Group_4_3__1 : rule__StateMachine__Group_4_3__1__Impl ;
    public final void rule__StateMachine__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( rule__StateMachine__Group_4_3__1__Impl )
            // InternalMyDsl.g:529:2: rule__StateMachine__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4_3__1"


    // $ANTLR start "rule__StateMachine__Group_4_3__1__Impl"
    // InternalMyDsl.g:535:1: rule__StateMachine__Group_4_3__1__Impl : ( ( rule__StateMachine__StateAssignment_4_3_1 ) ) ;
    public final void rule__StateMachine__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( ( ( rule__StateMachine__StateAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:540:1: ( ( rule__StateMachine__StateAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:540:1: ( ( rule__StateMachine__StateAssignment_4_3_1 ) )
            // InternalMyDsl.g:541:2: ( rule__StateMachine__StateAssignment_4_3_1 )
            {
             before(grammarAccess.getStateMachineAccess().getStateAssignment_4_3_1()); 
            // InternalMyDsl.g:542:2: ( rule__StateMachine__StateAssignment_4_3_1 )
            // InternalMyDsl.g:542:3: rule__StateMachine__StateAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__StateAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStateAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4_3__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__0"
    // InternalMyDsl.g:551:1: rule__StateMachine__Group_5__0 : rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1 ;
    public final void rule__StateMachine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1 )
            // InternalMyDsl.g:556:2: rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__0"


    // $ANTLR start "rule__StateMachine__Group_5__0__Impl"
    // InternalMyDsl.g:563:1: rule__StateMachine__Group_5__0__Impl : ( 'transition' ) ;
    public final void rule__StateMachine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( 'transition' ) )
            // InternalMyDsl.g:568:1: ( 'transition' )
            {
            // InternalMyDsl.g:568:1: ( 'transition' )
            // InternalMyDsl.g:569:2: 'transition'
            {
             before(grammarAccess.getStateMachineAccess().getTransitionKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getTransitionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__1"
    // InternalMyDsl.g:578:1: rule__StateMachine__Group_5__1 : rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2 ;
    public final void rule__StateMachine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2 )
            // InternalMyDsl.g:583:2: rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__StateMachine__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__1"


    // $ANTLR start "rule__StateMachine__Group_5__1__Impl"
    // InternalMyDsl.g:590:1: rule__StateMachine__Group_5__1__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( ( '{' ) )
            // InternalMyDsl.g:595:1: ( '{' )
            {
            // InternalMyDsl.g:595:1: ( '{' )
            // InternalMyDsl.g:596:2: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__2"
    // InternalMyDsl.g:605:1: rule__StateMachine__Group_5__2 : rule__StateMachine__Group_5__2__Impl rule__StateMachine__Group_5__3 ;
    public final void rule__StateMachine__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:609:1: ( rule__StateMachine__Group_5__2__Impl rule__StateMachine__Group_5__3 )
            // InternalMyDsl.g:610:2: rule__StateMachine__Group_5__2__Impl rule__StateMachine__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__StateMachine__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__2"


    // $ANTLR start "rule__StateMachine__Group_5__2__Impl"
    // InternalMyDsl.g:617:1: rule__StateMachine__Group_5__2__Impl : ( ( rule__StateMachine__TransitionAssignment_5_2 ) ) ;
    public final void rule__StateMachine__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( ( rule__StateMachine__TransitionAssignment_5_2 ) ) )
            // InternalMyDsl.g:622:1: ( ( rule__StateMachine__TransitionAssignment_5_2 ) )
            {
            // InternalMyDsl.g:622:1: ( ( rule__StateMachine__TransitionAssignment_5_2 ) )
            // InternalMyDsl.g:623:2: ( rule__StateMachine__TransitionAssignment_5_2 )
            {
             before(grammarAccess.getStateMachineAccess().getTransitionAssignment_5_2()); 
            // InternalMyDsl.g:624:2: ( rule__StateMachine__TransitionAssignment_5_2 )
            // InternalMyDsl.g:624:3: rule__StateMachine__TransitionAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__TransitionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getTransitionAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__3"
    // InternalMyDsl.g:632:1: rule__StateMachine__Group_5__3 : rule__StateMachine__Group_5__3__Impl rule__StateMachine__Group_5__4 ;
    public final void rule__StateMachine__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( rule__StateMachine__Group_5__3__Impl rule__StateMachine__Group_5__4 )
            // InternalMyDsl.g:637:2: rule__StateMachine__Group_5__3__Impl rule__StateMachine__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__StateMachine__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__3"


    // $ANTLR start "rule__StateMachine__Group_5__3__Impl"
    // InternalMyDsl.g:644:1: rule__StateMachine__Group_5__3__Impl : ( ( rule__StateMachine__Group_5_3__0 )* ) ;
    public final void rule__StateMachine__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( ( ( rule__StateMachine__Group_5_3__0 )* ) )
            // InternalMyDsl.g:649:1: ( ( rule__StateMachine__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:649:1: ( ( rule__StateMachine__Group_5_3__0 )* )
            // InternalMyDsl.g:650:2: ( rule__StateMachine__Group_5_3__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_5_3()); 
            // InternalMyDsl.g:651:2: ( rule__StateMachine__Group_5_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:651:3: rule__StateMachine__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__StateMachine__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__3__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__4"
    // InternalMyDsl.g:659:1: rule__StateMachine__Group_5__4 : rule__StateMachine__Group_5__4__Impl ;
    public final void rule__StateMachine__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( rule__StateMachine__Group_5__4__Impl )
            // InternalMyDsl.g:664:2: rule__StateMachine__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__4"


    // $ANTLR start "rule__StateMachine__Group_5__4__Impl"
    // InternalMyDsl.g:670:1: rule__StateMachine__Group_5__4__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( ( '}' ) )
            // InternalMyDsl.g:675:1: ( '}' )
            {
            // InternalMyDsl.g:675:1: ( '}' )
            // InternalMyDsl.g:676:2: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__4__Impl"


    // $ANTLR start "rule__StateMachine__Group_5_3__0"
    // InternalMyDsl.g:686:1: rule__StateMachine__Group_5_3__0 : rule__StateMachine__Group_5_3__0__Impl rule__StateMachine__Group_5_3__1 ;
    public final void rule__StateMachine__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( rule__StateMachine__Group_5_3__0__Impl rule__StateMachine__Group_5_3__1 )
            // InternalMyDsl.g:691:2: rule__StateMachine__Group_5_3__0__Impl rule__StateMachine__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__StateMachine__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5_3__0"


    // $ANTLR start "rule__StateMachine__Group_5_3__0__Impl"
    // InternalMyDsl.g:698:1: rule__StateMachine__Group_5_3__0__Impl : ( 'and' ) ;
    public final void rule__StateMachine__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( 'and' ) )
            // InternalMyDsl.g:703:1: ( 'and' )
            {
            // InternalMyDsl.g:703:1: ( 'and' )
            // InternalMyDsl.g:704:2: 'and'
            {
             before(grammarAccess.getStateMachineAccess().getAndKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getAndKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_5_3__1"
    // InternalMyDsl.g:713:1: rule__StateMachine__Group_5_3__1 : rule__StateMachine__Group_5_3__1__Impl ;
    public final void rule__StateMachine__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( rule__StateMachine__Group_5_3__1__Impl )
            // InternalMyDsl.g:718:2: rule__StateMachine__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5_3__1"


    // $ANTLR start "rule__StateMachine__Group_5_3__1__Impl"
    // InternalMyDsl.g:724:1: rule__StateMachine__Group_5_3__1__Impl : ( ( rule__StateMachine__TransitionAssignment_5_3_1 ) ) ;
    public final void rule__StateMachine__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( ( ( rule__StateMachine__TransitionAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:729:1: ( ( rule__StateMachine__TransitionAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:729:1: ( ( rule__StateMachine__TransitionAssignment_5_3_1 ) )
            // InternalMyDsl.g:730:2: ( rule__StateMachine__TransitionAssignment_5_3_1 )
            {
             before(grammarAccess.getStateMachineAccess().getTransitionAssignment_5_3_1()); 
            // InternalMyDsl.g:731:2: ( rule__StateMachine__TransitionAssignment_5_3_1 )
            // InternalMyDsl.g:731:3: rule__StateMachine__TransitionAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__TransitionAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getTransitionAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5_3__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalMyDsl.g:740:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalMyDsl.g:745:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalMyDsl.g:752:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( 'State' ) )
            // InternalMyDsl.g:757:1: ( 'State' )
            {
            // InternalMyDsl.g:757:1: ( 'State' )
            // InternalMyDsl.g:758:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalMyDsl.g:767:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( rule__State__Group__1__Impl )
            // InternalMyDsl.g:772:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalMyDsl.g:778:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalMyDsl.g:783:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:783:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalMyDsl.g:784:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:785:2: ( rule__State__NameAssignment_1 )
            // InternalMyDsl.g:785:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalMyDsl.g:794:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMyDsl.g:799:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalMyDsl.g:806:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( ( () ) )
            // InternalMyDsl.g:811:1: ( () )
            {
            // InternalMyDsl.g:811:1: ( () )
            // InternalMyDsl.g:812:2: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // InternalMyDsl.g:813:2: ()
            // InternalMyDsl.g:813:3: 
            {
            }

             after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalMyDsl.g:821:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMyDsl.g:826:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalMyDsl.g:833:1: rule__Transition__Group__1__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( 'Transition' ) )
            // InternalMyDsl.g:838:1: ( 'Transition' )
            {
            // InternalMyDsl.g:838:1: ( 'Transition' )
            // InternalMyDsl.g:839:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalMyDsl.g:848:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalMyDsl.g:853:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalMyDsl.g:860:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__NameAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( ( ( rule__Transition__NameAssignment_2 ) ) )
            // InternalMyDsl.g:865:1: ( ( rule__Transition__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:865:1: ( ( rule__Transition__NameAssignment_2 ) )
            // InternalMyDsl.g:866:2: ( rule__Transition__NameAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:867:2: ( rule__Transition__NameAssignment_2 )
            // InternalMyDsl.g:867:3: rule__Transition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalMyDsl.g:875:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalMyDsl.g:880:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalMyDsl.g:887:1: rule__Transition__Group__3__Impl : ( ':' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( ':' ) )
            // InternalMyDsl.g:892:1: ( ':' )
            {
            // InternalMyDsl.g:892:1: ( ':' )
            // InternalMyDsl.g:893:2: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalMyDsl.g:902:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalMyDsl.g:907:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalMyDsl.g:914:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // InternalMyDsl.g:919:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // InternalMyDsl.g:919:1: ( ( rule__Transition__Group_4__0 )? )
            // InternalMyDsl.g:920:2: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalMyDsl.g:921:2: ( rule__Transition__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:921:3: rule__Transition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalMyDsl.g:929:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( rule__Transition__Group__5__Impl )
            // InternalMyDsl.g:934:2: rule__Transition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalMyDsl.g:940:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // InternalMyDsl.g:945:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // InternalMyDsl.g:945:1: ( ( rule__Transition__Group_5__0 )? )
            // InternalMyDsl.g:946:2: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // InternalMyDsl.g:947:2: ( rule__Transition__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:947:3: rule__Transition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // InternalMyDsl.g:956:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalMyDsl.g:961:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // InternalMyDsl.g:968:1: rule__Transition__Group_4__0__Impl : ( 'from' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( 'from' ) )
            // InternalMyDsl.g:973:1: ( 'from' )
            {
            // InternalMyDsl.g:973:1: ( 'from' )
            // InternalMyDsl.g:974:2: 'from'
            {
             before(grammarAccess.getTransitionAccess().getFromKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getFromKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // InternalMyDsl.g:983:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // InternalMyDsl.g:988:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // InternalMyDsl.g:995:1: rule__Transition__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( '(' ) )
            // InternalMyDsl.g:1000:1: ( '(' )
            {
            // InternalMyDsl.g:1000:1: ( '(' )
            // InternalMyDsl.g:1001:2: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__2"
    // InternalMyDsl.g:1010:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3 ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3 )
            // InternalMyDsl.g:1015:2: rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2"


    // $ANTLR start "rule__Transition__Group_4__2__Impl"
    // InternalMyDsl.g:1022:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__OutgoingAssignment_4_2 ) ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( ( rule__Transition__OutgoingAssignment_4_2 ) ) )
            // InternalMyDsl.g:1027:1: ( ( rule__Transition__OutgoingAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1027:1: ( ( rule__Transition__OutgoingAssignment_4_2 ) )
            // InternalMyDsl.g:1028:2: ( rule__Transition__OutgoingAssignment_4_2 )
            {
             before(grammarAccess.getTransitionAccess().getOutgoingAssignment_4_2()); 
            // InternalMyDsl.g:1029:2: ( rule__Transition__OutgoingAssignment_4_2 )
            // InternalMyDsl.g:1029:3: rule__Transition__OutgoingAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OutgoingAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOutgoingAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2__Impl"


    // $ANTLR start "rule__Transition__Group_4__3"
    // InternalMyDsl.g:1037:1: rule__Transition__Group_4__3 : rule__Transition__Group_4__3__Impl rule__Transition__Group_4__4 ;
    public final void rule__Transition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__Transition__Group_4__3__Impl rule__Transition__Group_4__4 )
            // InternalMyDsl.g:1042:2: rule__Transition__Group_4__3__Impl rule__Transition__Group_4__4
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__3"


    // $ANTLR start "rule__Transition__Group_4__3__Impl"
    // InternalMyDsl.g:1049:1: rule__Transition__Group_4__3__Impl : ( ( rule__Transition__Group_4_3__0 )* ) ;
    public final void rule__Transition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( ( ( rule__Transition__Group_4_3__0 )* ) )
            // InternalMyDsl.g:1054:1: ( ( rule__Transition__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:1054:1: ( ( rule__Transition__Group_4_3__0 )* )
            // InternalMyDsl.g:1055:2: ( rule__Transition__Group_4_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_4_3()); 
            // InternalMyDsl.g:1056:2: ( rule__Transition__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1056:3: rule__Transition__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Transition__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__3__Impl"


    // $ANTLR start "rule__Transition__Group_4__4"
    // InternalMyDsl.g:1064:1: rule__Transition__Group_4__4 : rule__Transition__Group_4__4__Impl ;
    public final void rule__Transition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__Transition__Group_4__4__Impl )
            // InternalMyDsl.g:1069:2: rule__Transition__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__4"


    // $ANTLR start "rule__Transition__Group_4__4__Impl"
    // InternalMyDsl.g:1075:1: rule__Transition__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Transition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( ( ')' ) )
            // InternalMyDsl.g:1080:1: ( ')' )
            {
            // InternalMyDsl.g:1080:1: ( ')' )
            // InternalMyDsl.g:1081:2: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__4__Impl"


    // $ANTLR start "rule__Transition__Group_4_3__0"
    // InternalMyDsl.g:1091:1: rule__Transition__Group_4_3__0 : rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1 ;
    public final void rule__Transition__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1 )
            // InternalMyDsl.g:1096:2: rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__0"


    // $ANTLR start "rule__Transition__Group_4_3__0__Impl"
    // InternalMyDsl.g:1103:1: rule__Transition__Group_4_3__0__Impl : ( 'and' ) ;
    public final void rule__Transition__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( ( 'and' ) )
            // InternalMyDsl.g:1108:1: ( 'and' )
            {
            // InternalMyDsl.g:1108:1: ( 'and' )
            // InternalMyDsl.g:1109:2: 'and'
            {
             before(grammarAccess.getTransitionAccess().getAndKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getAndKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_4_3__1"
    // InternalMyDsl.g:1118:1: rule__Transition__Group_4_3__1 : rule__Transition__Group_4_3__1__Impl ;
    public final void rule__Transition__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( rule__Transition__Group_4_3__1__Impl )
            // InternalMyDsl.g:1123:2: rule__Transition__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__1"


    // $ANTLR start "rule__Transition__Group_4_3__1__Impl"
    // InternalMyDsl.g:1129:1: rule__Transition__Group_4_3__1__Impl : ( ( rule__Transition__OutgoingAssignment_4_3_1 ) ) ;
    public final void rule__Transition__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( ( ( rule__Transition__OutgoingAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:1134:1: ( ( rule__Transition__OutgoingAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:1134:1: ( ( rule__Transition__OutgoingAssignment_4_3_1 ) )
            // InternalMyDsl.g:1135:2: ( rule__Transition__OutgoingAssignment_4_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getOutgoingAssignment_4_3_1()); 
            // InternalMyDsl.g:1136:2: ( rule__Transition__OutgoingAssignment_4_3_1 )
            // InternalMyDsl.g:1136:3: rule__Transition__OutgoingAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OutgoingAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOutgoingAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_5__0"
    // InternalMyDsl.g:1145:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // InternalMyDsl.g:1150:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0"


    // $ANTLR start "rule__Transition__Group_5__0__Impl"
    // InternalMyDsl.g:1157:1: rule__Transition__Group_5__0__Impl : ( 'to' ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( ( 'to' ) )
            // InternalMyDsl.g:1162:1: ( 'to' )
            {
            // InternalMyDsl.g:1162:1: ( 'to' )
            // InternalMyDsl.g:1163:2: 'to'
            {
             before(grammarAccess.getTransitionAccess().getToKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getToKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0__Impl"


    // $ANTLR start "rule__Transition__Group_5__1"
    // InternalMyDsl.g:1172:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2 ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2 )
            // InternalMyDsl.g:1177:2: rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1"


    // $ANTLR start "rule__Transition__Group_5__1__Impl"
    // InternalMyDsl.g:1184:1: rule__Transition__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( ( '(' ) )
            // InternalMyDsl.g:1189:1: ( '(' )
            {
            // InternalMyDsl.g:1189:1: ( '(' )
            // InternalMyDsl.g:1190:2: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1__Impl"


    // $ANTLR start "rule__Transition__Group_5__2"
    // InternalMyDsl.g:1199:1: rule__Transition__Group_5__2 : rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3 ;
    public final void rule__Transition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3 )
            // InternalMyDsl.g:1204:2: rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__2"


    // $ANTLR start "rule__Transition__Group_5__2__Impl"
    // InternalMyDsl.g:1211:1: rule__Transition__Group_5__2__Impl : ( ( rule__Transition__IncomingAssignment_5_2 ) ) ;
    public final void rule__Transition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1215:1: ( ( ( rule__Transition__IncomingAssignment_5_2 ) ) )
            // InternalMyDsl.g:1216:1: ( ( rule__Transition__IncomingAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1216:1: ( ( rule__Transition__IncomingAssignment_5_2 ) )
            // InternalMyDsl.g:1217:2: ( rule__Transition__IncomingAssignment_5_2 )
            {
             before(grammarAccess.getTransitionAccess().getIncomingAssignment_5_2()); 
            // InternalMyDsl.g:1218:2: ( rule__Transition__IncomingAssignment_5_2 )
            // InternalMyDsl.g:1218:3: rule__Transition__IncomingAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__IncomingAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getIncomingAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__2__Impl"


    // $ANTLR start "rule__Transition__Group_5__3"
    // InternalMyDsl.g:1226:1: rule__Transition__Group_5__3 : rule__Transition__Group_5__3__Impl rule__Transition__Group_5__4 ;
    public final void rule__Transition__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( rule__Transition__Group_5__3__Impl rule__Transition__Group_5__4 )
            // InternalMyDsl.g:1231:2: rule__Transition__Group_5__3__Impl rule__Transition__Group_5__4
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__3"


    // $ANTLR start "rule__Transition__Group_5__3__Impl"
    // InternalMyDsl.g:1238:1: rule__Transition__Group_5__3__Impl : ( ( rule__Transition__Group_5_3__0 )* ) ;
    public final void rule__Transition__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( ( rule__Transition__Group_5_3__0 )* ) )
            // InternalMyDsl.g:1243:1: ( ( rule__Transition__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:1243:1: ( ( rule__Transition__Group_5_3__0 )* )
            // InternalMyDsl.g:1244:2: ( rule__Transition__Group_5_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_5_3()); 
            // InternalMyDsl.g:1245:2: ( rule__Transition__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1245:3: rule__Transition__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Transition__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__3__Impl"


    // $ANTLR start "rule__Transition__Group_5__4"
    // InternalMyDsl.g:1253:1: rule__Transition__Group_5__4 : rule__Transition__Group_5__4__Impl ;
    public final void rule__Transition__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( rule__Transition__Group_5__4__Impl )
            // InternalMyDsl.g:1258:2: rule__Transition__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__4"


    // $ANTLR start "rule__Transition__Group_5__4__Impl"
    // InternalMyDsl.g:1264:1: rule__Transition__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Transition__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( ( ')' ) )
            // InternalMyDsl.g:1269:1: ( ')' )
            {
            // InternalMyDsl.g:1269:1: ( ')' )
            // InternalMyDsl.g:1270:2: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__4__Impl"


    // $ANTLR start "rule__Transition__Group_5_3__0"
    // InternalMyDsl.g:1280:1: rule__Transition__Group_5_3__0 : rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1 ;
    public final void rule__Transition__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1 )
            // InternalMyDsl.g:1285:2: rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__0"


    // $ANTLR start "rule__Transition__Group_5_3__0__Impl"
    // InternalMyDsl.g:1292:1: rule__Transition__Group_5_3__0__Impl : ( 'and' ) ;
    public final void rule__Transition__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( ( 'and' ) )
            // InternalMyDsl.g:1297:1: ( 'and' )
            {
            // InternalMyDsl.g:1297:1: ( 'and' )
            // InternalMyDsl.g:1298:2: 'and'
            {
             before(grammarAccess.getTransitionAccess().getAndKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getAndKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_5_3__1"
    // InternalMyDsl.g:1307:1: rule__Transition__Group_5_3__1 : rule__Transition__Group_5_3__1__Impl ;
    public final void rule__Transition__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( rule__Transition__Group_5_3__1__Impl )
            // InternalMyDsl.g:1312:2: rule__Transition__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__1"


    // $ANTLR start "rule__Transition__Group_5_3__1__Impl"
    // InternalMyDsl.g:1318:1: rule__Transition__Group_5_3__1__Impl : ( ( rule__Transition__IncomingAssignment_5_3_1 ) ) ;
    public final void rule__Transition__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( ( ( rule__Transition__IncomingAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:1323:1: ( ( rule__Transition__IncomingAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:1323:1: ( ( rule__Transition__IncomingAssignment_5_3_1 ) )
            // InternalMyDsl.g:1324:2: ( rule__Transition__IncomingAssignment_5_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getIncomingAssignment_5_3_1()); 
            // InternalMyDsl.g:1325:2: ( rule__Transition__IncomingAssignment_5_3_1 )
            // InternalMyDsl.g:1325:3: rule__Transition__IncomingAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__IncomingAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getIncomingAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__1__Impl"


    // $ANTLR start "rule__StateMachine__NameAssignment_2"
    // InternalMyDsl.g:1334:1: rule__StateMachine__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StateMachine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1339:2: ( ruleEString )
            {
            // InternalMyDsl.g:1339:2: ( ruleEString )
            // InternalMyDsl.g:1340:3: ruleEString
            {
             before(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NameAssignment_2"


    // $ANTLR start "rule__StateMachine__StateAssignment_4_2"
    // InternalMyDsl.g:1349:1: rule__StateMachine__StateAssignment_4_2 : ( ruleState ) ;
    public final void rule__StateMachine__StateAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1353:1: ( ( ruleState ) )
            // InternalMyDsl.g:1354:2: ( ruleState )
            {
            // InternalMyDsl.g:1354:2: ( ruleState )
            // InternalMyDsl.g:1355:3: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StateAssignment_4_2"


    // $ANTLR start "rule__StateMachine__StateAssignment_4_3_1"
    // InternalMyDsl.g:1364:1: rule__StateMachine__StateAssignment_4_3_1 : ( ruleState ) ;
    public final void rule__StateMachine__StateAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( ( ruleState ) )
            // InternalMyDsl.g:1369:2: ( ruleState )
            {
            // InternalMyDsl.g:1369:2: ( ruleState )
            // InternalMyDsl.g:1370:3: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StateAssignment_4_3_1"


    // $ANTLR start "rule__StateMachine__TransitionAssignment_5_2"
    // InternalMyDsl.g:1379:1: rule__StateMachine__TransitionAssignment_5_2 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1383:1: ( ( ruleTransition ) )
            // InternalMyDsl.g:1384:2: ( ruleTransition )
            {
            // InternalMyDsl.g:1384:2: ( ruleTransition )
            // InternalMyDsl.g:1385:3: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionAssignment_5_2"


    // $ANTLR start "rule__StateMachine__TransitionAssignment_5_3_1"
    // InternalMyDsl.g:1394:1: rule__StateMachine__TransitionAssignment_5_3_1 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1398:1: ( ( ruleTransition ) )
            // InternalMyDsl.g:1399:2: ( ruleTransition )
            {
            // InternalMyDsl.g:1399:2: ( ruleTransition )
            // InternalMyDsl.g:1400:3: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionAssignment_5_3_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalMyDsl.g:1409:1: rule__State__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1414:2: ( ruleEString )
            {
            // InternalMyDsl.g:1414:2: ( ruleEString )
            // InternalMyDsl.g:1415:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__Transition__NameAssignment_2"
    // InternalMyDsl.g:1424:1: rule__Transition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1429:2: ( ruleEString )
            {
            // InternalMyDsl.g:1429:2: ( ruleEString )
            // InternalMyDsl.g:1430:3: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_2"


    // $ANTLR start "rule__Transition__OutgoingAssignment_4_2"
    // InternalMyDsl.g:1439:1: rule__Transition__OutgoingAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__OutgoingAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1443:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1444:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1444:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1445:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getOutgoingStateCrossReference_4_2_0()); 
            // InternalMyDsl.g:1446:3: ( ruleEString )
            // InternalMyDsl.g:1447:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getOutgoingStateEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getOutgoingStateEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getOutgoingStateCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__OutgoingAssignment_4_2"


    // $ANTLR start "rule__Transition__OutgoingAssignment_4_3_1"
    // InternalMyDsl.g:1458:1: rule__Transition__OutgoingAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__OutgoingAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1463:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1463:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1464:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getOutgoingStateCrossReference_4_3_1_0()); 
            // InternalMyDsl.g:1465:3: ( ruleEString )
            // InternalMyDsl.g:1466:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getOutgoingStateEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getOutgoingStateEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getOutgoingStateCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__OutgoingAssignment_4_3_1"


    // $ANTLR start "rule__Transition__IncomingAssignment_5_2"
    // InternalMyDsl.g:1477:1: rule__Transition__IncomingAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__IncomingAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1481:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1482:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1482:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1483:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getIncomingStateCrossReference_5_2_0()); 
            // InternalMyDsl.g:1484:3: ( ruleEString )
            // InternalMyDsl.g:1485:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getIncomingStateEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getIncomingStateEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getIncomingStateCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__IncomingAssignment_5_2"


    // $ANTLR start "rule__Transition__IncomingAssignment_5_3_1"
    // InternalMyDsl.g:1496:1: rule__Transition__IncomingAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__IncomingAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1501:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1501:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1502:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getIncomingStateCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:1503:3: ( ruleEString )
            // InternalMyDsl.g:1504:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getIncomingStateEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getIncomingStateEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getIncomingStateCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__IncomingAssignment_5_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000408000L});

}