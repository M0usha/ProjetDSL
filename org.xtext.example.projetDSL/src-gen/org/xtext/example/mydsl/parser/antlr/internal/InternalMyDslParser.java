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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start'", "'end'", "'open browser'", "'['", "', '", "']'", "'countResult'", "'readtext('", "')'", "'readurl('", "'var'", "'='", "'verify'", "'=='", "'contains'", "'link'", "'text'", "'button'", "'image'", "'all'", "'title'", "'combobox'", "'everything'", "'click'", "'uncheck'", "'search'", "'choose'", "'url'", "'check'", "'foreach'", "'endforeach'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
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
        	return "Automate";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAutomate"
    // InternalMyDsl.g:64:1: entryRuleAutomate returns [EObject current=null] : iv_ruleAutomate= ruleAutomate EOF ;
    public final EObject entryRuleAutomate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomate = null;


        try {
            // InternalMyDsl.g:64:49: (iv_ruleAutomate= ruleAutomate EOF )
            // InternalMyDsl.g:65:2: iv_ruleAutomate= ruleAutomate EOF
            {
             newCompositeNode(grammarAccess.getAutomateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutomate=ruleAutomate();

            state._fsp--;

             current =iv_ruleAutomate; 
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
    // $ANTLR end "entryRuleAutomate"


    // $ANTLR start "ruleAutomate"
    // InternalMyDsl.g:71:1: ruleAutomate returns [EObject current=null] : ( (lv_program_0_0= ruleProgram ) ) ;
    public final EObject ruleAutomate() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_program_0_0= ruleProgram ) ) )
            // InternalMyDsl.g:78:2: ( (lv_program_0_0= ruleProgram ) )
            {
            // InternalMyDsl.g:78:2: ( (lv_program_0_0= ruleProgram ) )
            // InternalMyDsl.g:79:3: (lv_program_0_0= ruleProgram )
            {
            // InternalMyDsl.g:79:3: (lv_program_0_0= ruleProgram )
            // InternalMyDsl.g:80:4: lv_program_0_0= ruleProgram
            {

            				newCompositeNode(grammarAccess.getAutomateAccess().getProgramProgramParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_program_0_0=ruleProgram();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAutomateRule());
            				}
            				set(
            					current,
            					"program",
            					lv_program_0_0,
            					"org.xtext.example.mydsl.MyDsl.Program");
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
    // $ANTLR end "ruleAutomate"


    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:100:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:101:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:107:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'start' ruleInit ( (lv_stats_2_0= ruleStatement ) )* otherlv_3= 'end' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_stats_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'start' ruleInit ( (lv_stats_2_0= ruleStatement ) )* otherlv_3= 'end' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'start' ruleInit ( (lv_stats_2_0= ruleStatement ) )* otherlv_3= 'end' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'start' ruleInit ( (lv_stats_2_0= ruleStatement ) )* otherlv_3= 'end' )
            // InternalMyDsl.g:115:3: otherlv_0= 'start' ruleInit ( (lv_stats_2_0= ruleStatement ) )* otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getStartKeyword_0());
            		

            			newCompositeNode(grammarAccess.getProgramAccess().getInitParserRuleCall_1());
            		
            pushFollow(FOLLOW_4);
            ruleInit();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:126:3: ( (lv_stats_2_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==21||LA1_0==23||(LA1_0>=34 && LA1_0<=40)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:127:4: (lv_stats_2_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:127:4: (lv_stats_2_0= ruleStatement )
            	    // InternalMyDsl.g:128:5: lv_stats_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getStatsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_stats_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stats",
            	    						lv_stats_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getEndKeyword_3());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleInit"
    // InternalMyDsl.g:153:1: entryRuleInit returns [String current=null] : iv_ruleInit= ruleInit EOF ;
    public final String entryRuleInit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInit = null;


        try {
            // InternalMyDsl.g:153:44: (iv_ruleInit= ruleInit EOF )
            // InternalMyDsl.g:154:2: iv_ruleInit= ruleInit EOF
            {
             newCompositeNode(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;

             current =iv_ruleInit.getText(); 
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
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalMyDsl.g:160:1: ruleInit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'open browser' ;
    public final AntlrDatatypeRuleToken ruleInit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:166:2: (kw= 'open browser' )
            // InternalMyDsl.g:167:2: kw= 'open browser'
            {
            kw=(Token)match(input,13,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInitAccess().getOpenBrowserKeyword());
            	

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
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:175:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:175:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:176:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyDsl.g:182:1: ruleStatement returns [EObject current=null] : (this_Instruction_0= ruleInstruction | this_Tab_1= ruleTab | this_Fonction_2= ruleFonction | this_Verify_3= ruleVerify | this_Foreach_4= ruleForeach ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Instruction_0 = null;

        EObject this_Tab_1 = null;

        EObject this_Fonction_2 = null;

        EObject this_Verify_3 = null;

        EObject this_Foreach_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:188:2: ( (this_Instruction_0= ruleInstruction | this_Tab_1= ruleTab | this_Fonction_2= ruleFonction | this_Verify_3= ruleVerify | this_Foreach_4= ruleForeach ) )
            // InternalMyDsl.g:189:2: (this_Instruction_0= ruleInstruction | this_Tab_1= ruleTab | this_Fonction_2= ruleFonction | this_Verify_3= ruleVerify | this_Foreach_4= ruleForeach )
            {
            // InternalMyDsl.g:189:2: (this_Instruction_0= ruleInstruction | this_Tab_1= ruleTab | this_Fonction_2= ruleFonction | this_Verify_3= ruleVerify | this_Foreach_4= ruleForeach )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==22) ) {
                        int LA2_6 = input.LA(4);

                        if ( ((LA2_6>=17 && LA2_6<=18)||LA2_6==20) ) {
                            alt2=3;
                        }
                        else if ( (LA2_6==14) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==22) ) {
                    int LA2_6 = input.LA(3);

                    if ( ((LA2_6>=17 && LA2_6<=18)||LA2_6==20) ) {
                        alt2=3;
                    }
                    else if ( (LA2_6==14) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 40:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:190:3: this_Instruction_0= ruleInstruction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getInstructionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instruction_0=ruleInstruction();

                    state._fsp--;


                    			current = this_Instruction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:199:3: this_Tab_1= ruleTab
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTabParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tab_1=ruleTab();

                    state._fsp--;


                    			current = this_Tab_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:208:3: this_Fonction_2= ruleFonction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFonctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fonction_2=ruleFonction();

                    state._fsp--;


                    			current = this_Fonction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:217:3: this_Verify_3= ruleVerify
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVerifyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Verify_3=ruleVerify();

                    state._fsp--;


                    			current = this_Verify_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:226:3: this_Foreach_4= ruleForeach
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getForeachParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Foreach_4=ruleForeach();

                    state._fsp--;


                    			current = this_Foreach_4;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleTab"
    // InternalMyDsl.g:238:1: entryRuleTab returns [EObject current=null] : iv_ruleTab= ruleTab EOF ;
    public final EObject entryRuleTab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTab = null;


        try {
            // InternalMyDsl.g:238:44: (iv_ruleTab= ruleTab EOF )
            // InternalMyDsl.g:239:2: iv_ruleTab= ruleTab EOF
            {
             newCompositeNode(grammarAccess.getTabRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTab=ruleTab();

            state._fsp--;

             current =iv_ruleTab; 
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
    // $ANTLR end "entryRuleTab"


    // $ANTLR start "ruleTab"
    // InternalMyDsl.g:245:1: ruleTab returns [EObject current=null] : ( ( (lv_v_0_0= ruleVariable ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ', ' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleTab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;
        EObject lv_v_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:251:2: ( ( ( (lv_v_0_0= ruleVariable ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ', ' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) )
            // InternalMyDsl.g:252:2: ( ( (lv_v_0_0= ruleVariable ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ', ' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            {
            // InternalMyDsl.g:252:2: ( ( (lv_v_0_0= ruleVariable ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ', ' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            // InternalMyDsl.g:253:3: ( (lv_v_0_0= ruleVariable ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ', ' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']'
            {
            // InternalMyDsl.g:253:3: ( (lv_v_0_0= ruleVariable ) )
            // InternalMyDsl.g:254:4: (lv_v_0_0= ruleVariable )
            {
            // InternalMyDsl.g:254:4: (lv_v_0_0= ruleVariable )
            // InternalMyDsl.g:255:5: lv_v_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getTabAccess().getVVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_v_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTabRule());
            					}
            					set(
            						current,
            						"v",
            						lv_v_0_0,
            						"org.xtext.example.mydsl.MyDsl.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTabAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:276:3: ( (lv_values_2_0= RULE_STRING ) )
            // InternalMyDsl.g:277:4: (lv_values_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:277:4: (lv_values_2_0= RULE_STRING )
            // InternalMyDsl.g:278:5: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_values_2_0, grammarAccess.getTabAccess().getValuesSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTabRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:294:3: (otherlv_3= ', ' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:295:4: otherlv_3= ', ' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTabAccess().getCommaSpaceKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:299:4: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalMyDsl.g:300:5: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:300:5: (lv_values_4_0= RULE_STRING )
            	    // InternalMyDsl.g:301:6: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    						newLeafNode(lv_values_4_0, grammarAccess.getTabAccess().getValuesSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTabRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTabAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTab"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:326:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyDsl.g:326:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyDsl.g:327:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:333:1: ruleInstruction returns [EObject current=null] : ( ( (lv_cmd_0_0= ruleCommande ) ) ( (lv_obj_1_0= ruleObjet ) )? ( ( (lv_param_2_0= RULE_STRING ) ) | ( (lv_param_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_param_2_0=null;
        Token lv_param_3_0=null;
        AntlrDatatypeRuleToken lv_cmd_0_0 = null;

        AntlrDatatypeRuleToken lv_obj_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:339:2: ( ( ( (lv_cmd_0_0= ruleCommande ) ) ( (lv_obj_1_0= ruleObjet ) )? ( ( (lv_param_2_0= RULE_STRING ) ) | ( (lv_param_3_0= RULE_ID ) ) )? ) )
            // InternalMyDsl.g:340:2: ( ( (lv_cmd_0_0= ruleCommande ) ) ( (lv_obj_1_0= ruleObjet ) )? ( ( (lv_param_2_0= RULE_STRING ) ) | ( (lv_param_3_0= RULE_ID ) ) )? )
            {
            // InternalMyDsl.g:340:2: ( ( (lv_cmd_0_0= ruleCommande ) ) ( (lv_obj_1_0= ruleObjet ) )? ( ( (lv_param_2_0= RULE_STRING ) ) | ( (lv_param_3_0= RULE_ID ) ) )? )
            // InternalMyDsl.g:341:3: ( (lv_cmd_0_0= ruleCommande ) ) ( (lv_obj_1_0= ruleObjet ) )? ( ( (lv_param_2_0= RULE_STRING ) ) | ( (lv_param_3_0= RULE_ID ) ) )?
            {
            // InternalMyDsl.g:341:3: ( (lv_cmd_0_0= ruleCommande ) )
            // InternalMyDsl.g:342:4: (lv_cmd_0_0= ruleCommande )
            {
            // InternalMyDsl.g:342:4: (lv_cmd_0_0= ruleCommande )
            // InternalMyDsl.g:343:5: lv_cmd_0_0= ruleCommande
            {

            					newCompositeNode(grammarAccess.getInstructionAccess().getCmdCommandeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_cmd_0_0=ruleCommande();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstructionRule());
            					}
            					set(
            						current,
            						"cmd",
            						lv_cmd_0_0,
            						"org.xtext.example.mydsl.MyDsl.Commande");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:360:3: ( (lv_obj_1_0= ruleObjet ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=26 && LA4_0<=33)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:361:4: (lv_obj_1_0= ruleObjet )
                    {
                    // InternalMyDsl.g:361:4: (lv_obj_1_0= ruleObjet )
                    // InternalMyDsl.g:362:5: lv_obj_1_0= ruleObjet
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getObjObjetParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_obj_1_0=ruleObjet();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"obj",
                    						lv_obj_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Objet");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:379:3: ( ( (lv_param_2_0= RULE_STRING ) ) | ( (lv_param_3_0= RULE_ID ) ) )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||LA5_2==RULE_ID||LA5_2==12||LA5_2==21||LA5_2==23||(LA5_2>=34 && LA5_2<=41)) ) {
                    alt5=2;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:380:4: ( (lv_param_2_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:380:4: ( (lv_param_2_0= RULE_STRING ) )
                    // InternalMyDsl.g:381:5: (lv_param_2_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:381:5: (lv_param_2_0= RULE_STRING )
                    // InternalMyDsl.g:382:6: lv_param_2_0= RULE_STRING
                    {
                    lv_param_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_param_2_0, grammarAccess.getInstructionAccess().getParamSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInstructionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"param",
                    							lv_param_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:399:4: ( (lv_param_3_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:399:4: ( (lv_param_3_0= RULE_ID ) )
                    // InternalMyDsl.g:400:5: (lv_param_3_0= RULE_ID )
                    {
                    // InternalMyDsl.g:400:5: (lv_param_3_0= RULE_ID )
                    // InternalMyDsl.g:401:6: lv_param_3_0= RULE_ID
                    {
                    lv_param_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_param_3_0, grammarAccess.getInstructionAccess().getParamIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInstructionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"param",
                    							lv_param_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleFonction"
    // InternalMyDsl.g:422:1: entryRuleFonction returns [EObject current=null] : iv_ruleFonction= ruleFonction EOF ;
    public final EObject entryRuleFonction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonction = null;


        try {
            // InternalMyDsl.g:422:49: (iv_ruleFonction= ruleFonction EOF )
            // InternalMyDsl.g:423:2: iv_ruleFonction= ruleFonction EOF
            {
             newCompositeNode(grammarAccess.getFonctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFonction=ruleFonction();

            state._fsp--;

             current =iv_ruleFonction; 
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
    // $ANTLR end "entryRuleFonction"


    // $ANTLR start "ruleFonction"
    // InternalMyDsl.g:429:1: ruleFonction returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) (otherlv_1= 'countResult' | (otherlv_2= 'readtext(' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) | (otherlv_5= 'readurl(' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' ) ) ) ;
    public final EObject ruleFonction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;
        Token otherlv_7=null;
        EObject lv_var_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:435:2: ( ( ( (lv_var_0_0= ruleVariable ) ) (otherlv_1= 'countResult' | (otherlv_2= 'readtext(' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) | (otherlv_5= 'readurl(' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' ) ) ) )
            // InternalMyDsl.g:436:2: ( ( (lv_var_0_0= ruleVariable ) ) (otherlv_1= 'countResult' | (otherlv_2= 'readtext(' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) | (otherlv_5= 'readurl(' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' ) ) )
            {
            // InternalMyDsl.g:436:2: ( ( (lv_var_0_0= ruleVariable ) ) (otherlv_1= 'countResult' | (otherlv_2= 'readtext(' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) | (otherlv_5= 'readurl(' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' ) ) )
            // InternalMyDsl.g:437:3: ( (lv_var_0_0= ruleVariable ) ) (otherlv_1= 'countResult' | (otherlv_2= 'readtext(' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) | (otherlv_5= 'readurl(' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' ) )
            {
            // InternalMyDsl.g:437:3: ( (lv_var_0_0= ruleVariable ) )
            // InternalMyDsl.g:438:4: (lv_var_0_0= ruleVariable )
            {
            // InternalMyDsl.g:438:4: (lv_var_0_0= ruleVariable )
            // InternalMyDsl.g:439:5: lv_var_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getFonctionAccess().getVarVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_var_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFonctionRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.xtext.example.mydsl.MyDsl.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:456:3: (otherlv_1= 'countResult' | (otherlv_2= 'readtext(' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) | (otherlv_5= 'readurl(' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:457:4: otherlv_1= 'countResult'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getFonctionAccess().getCountResultKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:462:4: (otherlv_2= 'readtext(' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    {
                    // InternalMyDsl.g:462:4: (otherlv_2= 'readtext(' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    // InternalMyDsl.g:463:5: otherlv_2= 'readtext(' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getFonctionAccess().getReadtextKeyword_1_1_0());
                    				
                    // InternalMyDsl.g:467:5: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:468:6: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:468:6: (lv_value_3_0= RULE_STRING )
                    // InternalMyDsl.g:469:7: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    							newLeafNode(lv_value_3_0, grammarAccess.getFonctionAccess().getValueSTRINGTerminalRuleCall_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFonctionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_3_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getFonctionAccess().getRightParenthesisKeyword_1_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:491:4: (otherlv_5= 'readurl(' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' )
                    {
                    // InternalMyDsl.g:491:4: (otherlv_5= 'readurl(' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' )
                    // InternalMyDsl.g:492:5: otherlv_5= 'readurl(' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getFonctionAccess().getReadurlKeyword_1_2_0());
                    				
                    // InternalMyDsl.g:496:5: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalMyDsl.g:497:6: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:497:6: (lv_value_6_0= RULE_STRING )
                    // InternalMyDsl.g:498:7: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    							newLeafNode(lv_value_6_0, grammarAccess.getFonctionAccess().getValueSTRINGTerminalRuleCall_1_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFonctionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_6_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getFonctionAccess().getRightParenthesisKeyword_1_2_2());
                    				

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
    // $ANTLR end "ruleFonction"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:524:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:524:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:525:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:531:1: ruleVariable returns [EObject current=null] : ( (otherlv_0= 'var' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:537:2: ( ( (otherlv_0= 'var' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ) )
            // InternalMyDsl.g:538:2: ( (otherlv_0= 'var' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )
            {
            // InternalMyDsl.g:538:2: ( (otherlv_0= 'var' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )
            // InternalMyDsl.g:539:3: (otherlv_0= 'var' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '='
            {
            // InternalMyDsl.g:539:3: (otherlv_0= 'var' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:540:4: otherlv_0= 'var'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:545:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:546:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:546:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:547:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
            		

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVerify"
    // InternalMyDsl.g:571:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalMyDsl.g:571:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalMyDsl.g:572:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
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
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalMyDsl.g:578:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify' ( ( (lv_compare_1_0= ruleCompare ) ) | ( (lv_contains_2_0= ruleContains ) ) ) ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_compare_1_0 = null;

        EObject lv_contains_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:584:2: ( (otherlv_0= 'verify' ( ( (lv_compare_1_0= ruleCompare ) ) | ( (lv_contains_2_0= ruleContains ) ) ) ) )
            // InternalMyDsl.g:585:2: (otherlv_0= 'verify' ( ( (lv_compare_1_0= ruleCompare ) ) | ( (lv_contains_2_0= ruleContains ) ) ) )
            {
            // InternalMyDsl.g:585:2: (otherlv_0= 'verify' ( ( (lv_compare_1_0= ruleCompare ) ) | ( (lv_contains_2_0= ruleContains ) ) ) )
            // InternalMyDsl.g:586:3: otherlv_0= 'verify' ( ( (lv_compare_1_0= ruleCompare ) ) | ( (lv_contains_2_0= ruleContains ) ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
            		
            // InternalMyDsl.g:590:3: ( ( (lv_compare_1_0= ruleCompare ) ) | ( (lv_contains_2_0= ruleContains ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:591:4: ( (lv_compare_1_0= ruleCompare ) )
                    {
                    // InternalMyDsl.g:591:4: ( (lv_compare_1_0= ruleCompare ) )
                    // InternalMyDsl.g:592:5: (lv_compare_1_0= ruleCompare )
                    {
                    // InternalMyDsl.g:592:5: (lv_compare_1_0= ruleCompare )
                    // InternalMyDsl.g:593:6: lv_compare_1_0= ruleCompare
                    {

                    						newCompositeNode(grammarAccess.getVerifyAccess().getCompareCompareParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_compare_1_0=ruleCompare();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerifyRule());
                    						}
                    						set(
                    							current,
                    							"compare",
                    							lv_compare_1_0,
                    							"org.xtext.example.mydsl.MyDsl.Compare");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:611:4: ( (lv_contains_2_0= ruleContains ) )
                    {
                    // InternalMyDsl.g:611:4: ( (lv_contains_2_0= ruleContains ) )
                    // InternalMyDsl.g:612:5: (lv_contains_2_0= ruleContains )
                    {
                    // InternalMyDsl.g:612:5: (lv_contains_2_0= ruleContains )
                    // InternalMyDsl.g:613:6: lv_contains_2_0= ruleContains
                    {

                    						newCompositeNode(grammarAccess.getVerifyAccess().getContainsContainsParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_contains_2_0=ruleContains();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerifyRule());
                    						}
                    						set(
                    							current,
                    							"contains",
                    							lv_contains_2_0,
                    							"org.xtext.example.mydsl.MyDsl.Contains");
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
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleCompare"
    // InternalMyDsl.g:635:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalMyDsl.g:635:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalMyDsl.g:636:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalMyDsl.g:642:1: ruleCompare returns [EObject current=null] : ( ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '==' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:648:2: ( ( ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '==' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // InternalMyDsl.g:649:2: ( ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '==' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // InternalMyDsl.g:649:2: ( ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '==' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:650:3: ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '==' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:650:3: ( (lv_variable_0_0= RULE_ID ) )
            // InternalMyDsl.g:651:4: (lv_variable_0_0= RULE_ID )
            {
            // InternalMyDsl.g:651:4: (lv_variable_0_0= RULE_ID )
            // InternalMyDsl.g:652:5: lv_variable_0_0= RULE_ID
            {
            lv_variable_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_variable_0_0, grammarAccess.getCompareAccess().getVariableIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompareRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCompareAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:672:3: ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:673:4: ( (lv_value_2_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:673:4: ( (lv_value_2_0= RULE_ID ) )
                    // InternalMyDsl.g:674:5: (lv_value_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:674:5: (lv_value_2_0= RULE_ID )
                    // InternalMyDsl.g:675:6: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getCompareAccess().getValueIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompareRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:692:4: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:692:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:693:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:693:5: (lv_value_3_0= RULE_STRING )
                    // InternalMyDsl.g:694:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getCompareAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompareRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleContains"
    // InternalMyDsl.g:715:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalMyDsl.g:715:49: (iv_ruleContains= ruleContains EOF )
            // InternalMyDsl.g:716:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
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
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // InternalMyDsl.g:722:1: ruleContains returns [EObject current=null] : (otherlv_0= 'contains' ( (lv_obj_1_0= ruleObjet ) ) ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        AntlrDatatypeRuleToken lv_obj_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:728:2: ( (otherlv_0= 'contains' ( (lv_obj_1_0= ruleObjet ) ) ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // InternalMyDsl.g:729:2: (otherlv_0= 'contains' ( (lv_obj_1_0= ruleObjet ) ) ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // InternalMyDsl.g:729:2: (otherlv_0= 'contains' ( (lv_obj_1_0= ruleObjet ) ) ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:730:3: otherlv_0= 'contains' ( (lv_obj_1_0= ruleObjet ) ) ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getContainsKeyword_0());
            		
            // InternalMyDsl.g:734:3: ( (lv_obj_1_0= ruleObjet ) )
            // InternalMyDsl.g:735:4: (lv_obj_1_0= ruleObjet )
            {
            // InternalMyDsl.g:735:4: (lv_obj_1_0= ruleObjet )
            // InternalMyDsl.g:736:5: lv_obj_1_0= ruleObjet
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getObjObjetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_obj_1_0=ruleObjet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"obj",
            						lv_obj_1_0,
            						"org.xtext.example.mydsl.MyDsl.Objet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:753:3: ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:754:4: ( (lv_value_2_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:754:4: ( (lv_value_2_0= RULE_ID ) )
                    // InternalMyDsl.g:755:5: (lv_value_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:755:5: (lv_value_2_0= RULE_ID )
                    // InternalMyDsl.g:756:6: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getContainsAccess().getValueIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:773:4: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:773:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:774:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:774:5: (lv_value_3_0= RULE_STRING )
                    // InternalMyDsl.g:775:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getContainsAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleObjet"
    // InternalMyDsl.g:796:1: entryRuleObjet returns [String current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final String entryRuleObjet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObjet = null;


        try {
            // InternalMyDsl.g:796:45: (iv_ruleObjet= ruleObjet EOF )
            // InternalMyDsl.g:797:2: iv_ruleObjet= ruleObjet EOF
            {
             newCompositeNode(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjet=ruleObjet();

            state._fsp--;

             current =iv_ruleObjet.getText(); 
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
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalMyDsl.g:803:1: ruleObjet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'link' | kw= 'text' | kw= 'button' | kw= 'image' | kw= 'all' | kw= 'title' | kw= 'combobox' | kw= 'everything' ) ;
    public final AntlrDatatypeRuleToken ruleObjet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:809:2: ( (kw= 'link' | kw= 'text' | kw= 'button' | kw= 'image' | kw= 'all' | kw= 'title' | kw= 'combobox' | kw= 'everything' ) )
            // InternalMyDsl.g:810:2: (kw= 'link' | kw= 'text' | kw= 'button' | kw= 'image' | kw= 'all' | kw= 'title' | kw= 'combobox' | kw= 'everything' )
            {
            // InternalMyDsl.g:810:2: (kw= 'link' | kw= 'text' | kw= 'button' | kw= 'image' | kw= 'all' | kw= 'title' | kw= 'combobox' | kw= 'everything' )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 29:
                {
                alt11=4;
                }
                break;
            case 30:
                {
                alt11=5;
                }
                break;
            case 31:
                {
                alt11=6;
                }
                break;
            case 32:
                {
                alt11=7;
                }
                break;
            case 33:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:811:3: kw= 'link'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjetAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:817:3: kw= 'text'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjetAccess().getTextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:823:3: kw= 'button'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjetAccess().getButtonKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:829:3: kw= 'image'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjetAccess().getImageKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:835:3: kw= 'all'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjetAccess().getAllKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:841:3: kw= 'title'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjetAccess().getTitleKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:847:3: kw= 'combobox'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjetAccess().getComboboxKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:853:3: kw= 'everything'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjetAccess().getEverythingKeyword_7());
                    		

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
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleCommande"
    // InternalMyDsl.g:862:1: entryRuleCommande returns [String current=null] : iv_ruleCommande= ruleCommande EOF ;
    public final String entryRuleCommande() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommande = null;


        try {
            // InternalMyDsl.g:862:48: (iv_ruleCommande= ruleCommande EOF )
            // InternalMyDsl.g:863:2: iv_ruleCommande= ruleCommande EOF
            {
             newCompositeNode(grammarAccess.getCommandeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommande=ruleCommande();

            state._fsp--;

             current =iv_ruleCommande.getText(); 
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
    // $ANTLR end "entryRuleCommande"


    // $ANTLR start "ruleCommande"
    // InternalMyDsl.g:869:1: ruleCommande returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'click' | kw= 'uncheck' | kw= 'search' | kw= 'choose' | kw= 'url' | kw= 'check' ) ;
    public final AntlrDatatypeRuleToken ruleCommande() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:875:2: ( (kw= 'click' | kw= 'uncheck' | kw= 'search' | kw= 'choose' | kw= 'url' | kw= 'check' ) )
            // InternalMyDsl.g:876:2: (kw= 'click' | kw= 'uncheck' | kw= 'search' | kw= 'choose' | kw= 'url' | kw= 'check' )
            {
            // InternalMyDsl.g:876:2: (kw= 'click' | kw= 'uncheck' | kw= 'search' | kw= 'choose' | kw= 'url' | kw= 'check' )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 35:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            case 37:
                {
                alt12=4;
                }
                break;
            case 38:
                {
                alt12=5;
                }
                break;
            case 39:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:877:3: kw= 'click'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCommandeAccess().getClickKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:883:3: kw= 'uncheck'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCommandeAccess().getUncheckKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:889:3: kw= 'search'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCommandeAccess().getSearchKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:895:3: kw= 'choose'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCommandeAccess().getChooseKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:901:3: kw= 'url'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCommandeAccess().getUrlKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:907:3: kw= 'check'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCommandeAccess().getCheckKeyword_5());
                    		

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
    // $ANTLR end "ruleCommande"


    // $ANTLR start "entryRuleForeach"
    // InternalMyDsl.g:916:1: entryRuleForeach returns [EObject current=null] : iv_ruleForeach= ruleForeach EOF ;
    public final EObject entryRuleForeach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeach = null;


        try {
            // InternalMyDsl.g:916:48: (iv_ruleForeach= ruleForeach EOF )
            // InternalMyDsl.g:917:2: iv_ruleForeach= ruleForeach EOF
            {
             newCompositeNode(grammarAccess.getForeachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeach=ruleForeach();

            state._fsp--;

             current =iv_ruleForeach; 
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
    // $ANTLR end "entryRuleForeach"


    // $ANTLR start "ruleForeach"
    // InternalMyDsl.g:923:1: ruleForeach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_value_1_0= RULE_ID ) ) ( (lv_stats_2_0= ruleStatement ) )* otherlv_3= 'endforeach' ) ;
    public final EObject ruleForeach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_3=null;
        EObject lv_stats_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:929:2: ( (otherlv_0= 'foreach' ( (lv_value_1_0= RULE_ID ) ) ( (lv_stats_2_0= ruleStatement ) )* otherlv_3= 'endforeach' ) )
            // InternalMyDsl.g:930:2: (otherlv_0= 'foreach' ( (lv_value_1_0= RULE_ID ) ) ( (lv_stats_2_0= ruleStatement ) )* otherlv_3= 'endforeach' )
            {
            // InternalMyDsl.g:930:2: (otherlv_0= 'foreach' ( (lv_value_1_0= RULE_ID ) ) ( (lv_stats_2_0= ruleStatement ) )* otherlv_3= 'endforeach' )
            // InternalMyDsl.g:931:3: otherlv_0= 'foreach' ( (lv_value_1_0= RULE_ID ) ) ( (lv_stats_2_0= ruleStatement ) )* otherlv_3= 'endforeach'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getForeachAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:935:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalMyDsl.g:936:4: (lv_value_1_0= RULE_ID )
            {
            // InternalMyDsl.g:936:4: (lv_value_1_0= RULE_ID )
            // InternalMyDsl.g:937:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_value_1_0, grammarAccess.getForeachAccess().getValueIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeachRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:953:3: ( (lv_stats_2_0= ruleStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==21||LA13_0==23||(LA13_0>=34 && LA13_0<=40)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:954:4: (lv_stats_2_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:954:4: (lv_stats_2_0= ruleStatement )
            	    // InternalMyDsl.g:955:5: lv_stats_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getForeachAccess().getStatsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_stats_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForeachRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stats",
            	    						lv_stats_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getForeachAccess().getEndforeachKeyword_3());
            		

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
    // $ANTLR end "ruleForeach"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000001FC00A01020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000003FC000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000160000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000003FC000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000003FC00A00020L});

}