// $ANTLR 3.5.1 /media/tony/disk2/_git/cs543/JavaJava.g 2018-03-20 20:46:17

package metricssuite;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class JavaJavaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSERT", "COMMENT", "CharacterLiteral", 
		"DecimalLiteral", "ENUM", "EscapeSequence", "Exponent", "FloatTypeSuffix", 
		"FloatingPointLiteral", "HexDigit", "HexLiteral", "Identifier", "IntegerTypeSuffix", 
		"JavaIDDigit", "LINE_COMMENT", "Letter", "OctalEscape", "OctalLiteral", 
		"StringLiteral", "UnicodeEscape", "WS", "'!'", "'!='", "'%'", "'%='", 
		"'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", 
		"','", "'-'", "'--'", "'-='", "'.'", "'...'", "'/'", "'/='", "':'", "';'", 
		"'<'", "'='", "'=='", "'>'", "'?'", "'@'", "'['", "']'", "'^'", "'^='", 
		"'abstract'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'extends'", 
		"'false'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'implements'", 
		"'import'", "'instanceof'", "'int'", "'interface'", "'long'", "'native'", 
		"'new'", "'null'", "'package'", "'private'", "'protected'", "'public'", 
		"'return'", "'short'", "'static'", "'strictfp'", "'super'", "'switch'", 
		"'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'true'", 
		"'try'", "'void'", "'volatile'", "'while'", "'{'", "'|'", "'|='", "'||'", 
		"'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int ASSERT=4;
	public static final int COMMENT=5;
	public static final int CharacterLiteral=6;
	public static final int DecimalLiteral=7;
	public static final int ENUM=8;
	public static final int EscapeSequence=9;
	public static final int Exponent=10;
	public static final int FloatTypeSuffix=11;
	public static final int FloatingPointLiteral=12;
	public static final int HexDigit=13;
	public static final int HexLiteral=14;
	public static final int Identifier=15;
	public static final int IntegerTypeSuffix=16;
	public static final int JavaIDDigit=17;
	public static final int LINE_COMMENT=18;
	public static final int Letter=19;
	public static final int OctalEscape=20;
	public static final int OctalLiteral=21;
	public static final int StringLiteral=22;
	public static final int UnicodeEscape=23;
	public static final int WS=24;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JavaJavaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaJavaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[406+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return JavaJavaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/media/tony/disk2/_git/cs543/JavaJava.g"; }


	    public int cc = 0, ec=0;
	    String ca;
	    static public int linecount=0;
	    boolean bextends = false, field=false, param=false;
	    boolean primitive=false, classtype=false, local=false;
	    boolean methodcall = false, constructorcall = false;
	    boolean bimplements;
	    
	    boolean	inPackage = false;
	    ////
	    boolean	inMethod=false;
	    ////
	    
	    //McCabe var
	    int mmc = 0;
	    String methodName;
	    String PrimitiveType = "default";
	    String ClassType = "default";
	    String one, two;
	    String interfacemethodname;
	    int InterfaceFieldLine;
	    boolean RHS=false, Assignment=false;
	    int LastKnownLine=0;
	    int classCount = 0;
	    public int keywordCount = 0;
	    public int specialcount = 0;
	    public int identcount = 0;
	    ////////////////imports separate
	    public int importKWCount=0;
	    public int importIDCount=0;
	    /////////////////////////////////
	    String myID;
	    String packageName, className;
	    void s(String sp){ 
	         specialcount++; 
	         System.out.println(sp);
	         JavaMetrics.uniqueSpecial.add(sp);
	    }
	    void id(String s){
	    	identcount++;
	    	JavaMetrics.uniqueIdentifiers.add(s);
	    	//System.out.println("ID=====>" + s);
	    }
	   /* void id(Symbol s){
	    	identcount++;
	    	JavaMetrics.uIDSym.add(s);
	    	//System.out.println("ID=====>" + s);
	    }*/
	 

	public static class compilationUnit_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compilationUnit"
	// /media/tony/disk2/_git/cs543/JavaJava.g:83:1: compilationUnit : ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* );
	public final JavaJavaParser.compilationUnit_return compilationUnit() throws RecognitionException {
		JavaJavaParser.compilationUnit_return retval = new JavaJavaParser.compilationUnit_return();
		retval.start = input.LT(1);
		int compilationUnit_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope annotations1 =null;
		ParserRuleReturnScope packageDeclaration2 =null;
		ParserRuleReturnScope importDeclaration3 =null;
		ParserRuleReturnScope typeDeclaration4 =null;
		ParserRuleReturnScope classOrInterfaceDeclaration5 =null;
		ParserRuleReturnScope typeDeclaration6 =null;
		ParserRuleReturnScope packageDeclaration7 =null;
		ParserRuleReturnScope importDeclaration8 =null;
		ParserRuleReturnScope typeDeclaration9 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:84:5: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==54) ) {
				int LA8_1 = input.LA(2);
				if ( (synpred5_JavaJava()) ) {
					alt8=1;
				}
				else if ( (true) ) {
					alt8=2;
				}

			}
			else if ( (LA8_0==EOF||LA8_0==ENUM||LA8_0==48||LA8_0==59||LA8_0==66||LA8_0==74||LA8_0==80||LA8_0==83||(LA8_0 >= 88 && LA8_0 <= 91)||(LA8_0 >= 94 && LA8_0 <= 95)) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:84:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotations_in_compilationUnit73);
					annotations1=annotations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotations1.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:85:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==88) ) {
						alt4=1;
					}
					else if ( (LA4_0==ENUM||LA4_0==54||LA4_0==59||LA4_0==66||LA4_0==74||LA4_0==83||(LA4_0 >= 89 && LA4_0 <= 91)||(LA4_0 >= 94 && LA4_0 <= 95)) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:85:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
							{
							pushFollow(FOLLOW_packageDeclaration_in_compilationUnit87);
							packageDeclaration2=packageDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, packageDeclaration2.getTree());

							// /media/tony/disk2/_git/cs543/JavaJava.g:85:32: ( importDeclaration )*
							loop1:
							while (true) {
								int alt1=2;
								int LA1_0 = input.LA(1);
								if ( (LA1_0==80) ) {
									alt1=1;
								}

								switch (alt1) {
								case 1 :
									// /media/tony/disk2/_git/cs543/JavaJava.g:85:32: importDeclaration
									{
									pushFollow(FOLLOW_importDeclaration_in_compilationUnit89);
									importDeclaration3=importDeclaration();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, importDeclaration3.getTree());

									}
									break;

								default :
									break loop1;
								}
							}

							// /media/tony/disk2/_git/cs543/JavaJava.g:85:51: ( typeDeclaration )*
							loop2:
							while (true) {
								int alt2=2;
								int LA2_0 = input.LA(1);
								if ( (LA2_0==ENUM||LA2_0==48||LA2_0==54||LA2_0==59||LA2_0==66||LA2_0==74||LA2_0==83||(LA2_0 >= 89 && LA2_0 <= 91)||(LA2_0 >= 94 && LA2_0 <= 95)) ) {
									alt2=1;
								}

								switch (alt2) {
								case 1 :
									// /media/tony/disk2/_git/cs543/JavaJava.g:85:51: typeDeclaration
									{
									pushFollow(FOLLOW_typeDeclaration_in_compilationUnit92);
									typeDeclaration4=typeDeclaration();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration4.getTree());

									}
									break;

								default :
									break loop2;
								}
							}

							}
							break;
						case 2 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:86:13: classOrInterfaceDeclaration ( typeDeclaration )*
							{
							pushFollow(FOLLOW_classOrInterfaceDeclaration_in_compilationUnit107);
							classOrInterfaceDeclaration5=classOrInterfaceDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration5.getTree());

							// /media/tony/disk2/_git/cs543/JavaJava.g:86:41: ( typeDeclaration )*
							loop3:
							while (true) {
								int alt3=2;
								int LA3_0 = input.LA(1);
								if ( (LA3_0==ENUM||LA3_0==48||LA3_0==54||LA3_0==59||LA3_0==66||LA3_0==74||LA3_0==83||(LA3_0 >= 89 && LA3_0 <= 91)||(LA3_0 >= 94 && LA3_0 <= 95)) ) {
									alt3=1;
								}

								switch (alt3) {
								case 1 :
									// /media/tony/disk2/_git/cs543/JavaJava.g:86:41: typeDeclaration
									{
									pushFollow(FOLLOW_typeDeclaration_in_compilationUnit109);
									typeDeclaration6=typeDeclaration();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration6.getTree());

									}
									break;

								default :
									break loop3;
								}
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:88:9: ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )*
					{
					root_0 = (Object)adaptor.nil();


					// /media/tony/disk2/_git/cs543/JavaJava.g:88:9: ( packageDeclaration )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==88) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:88:9: packageDeclaration
							{
							pushFollow(FOLLOW_packageDeclaration_in_compilationUnit130);
							packageDeclaration7=packageDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, packageDeclaration7.getTree());

							}
							break;

					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:88:29: ( importDeclaration )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==80) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:88:29: importDeclaration
							{
							pushFollow(FOLLOW_importDeclaration_in_compilationUnit133);
							importDeclaration8=importDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, importDeclaration8.getTree());

							}
							break;

						default :
							break loop6;
						}
					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:88:48: ( typeDeclaration )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ENUM||LA7_0==48||LA7_0==54||LA7_0==59||LA7_0==66||LA7_0==74||LA7_0==83||(LA7_0 >= 89 && LA7_0 <= 91)||(LA7_0 >= 94 && LA7_0 <= 95)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:88:48: typeDeclaration
							{
							pushFollow(FOLLOW_typeDeclaration_in_compilationUnit136);
							typeDeclaration9=typeDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration9.getTree());

							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "compilationUnit"


	public static class packageDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "packageDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:91:1: packageDeclaration : 'package' qualifiedName ';' ;
	public final JavaJavaParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
		JavaJavaParser.packageDeclaration_return retval = new JavaJavaParser.packageDeclaration_return();
		retval.start = input.LT(1);
		int packageDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal10=null;
		Token char_literal12=null;
		ParserRuleReturnScope qualifiedName11 =null;

		Object string_literal10_tree=null;
		Object char_literal12_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:92:5: ( 'package' qualifiedName ';' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:92:9: 'package' qualifiedName ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal10=(Token)match(input,88,FOLLOW_88_in_packageDeclaration156); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal10_tree = (Object)adaptor.create(string_literal10);
			adaptor.addChild(root_0, string_literal10_tree);
			}

			if ( state.backtracking==0 ) {importKWCount++;}
			pushFollow(FOLLOW_qualifiedName_in_packageDeclaration159);
			qualifiedName11=qualifiedName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName11.getTree());

			char_literal12=(Token)match(input,48,FOLLOW_48_in_packageDeclaration161); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal12_tree = (Object)adaptor.create(char_literal12);
			adaptor.addChild(root_0, char_literal12_tree);
			}

			if ( state.backtracking==0 ) { s(";"); importIDCount++; packageName = myID;}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "packageDeclaration"


	public static class importDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "importDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:95:1: importDeclaration : 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';' ;
	public final JavaJavaParser.importDeclaration_return importDeclaration() throws RecognitionException {
		JavaJavaParser.importDeclaration_return retval = new JavaJavaParser.importDeclaration_return();
		retval.start = input.LT(1);
		int importDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal13=null;
		Token string_literal14=null;
		Token char_literal16=null;
		Token char_literal17=null;
		Token char_literal18=null;
		ParserRuleReturnScope qualifiedName15 =null;

		Object string_literal13_tree=null;
		Object string_literal14_tree=null;
		Object char_literal16_tree=null;
		Object char_literal17_tree=null;
		Object char_literal18_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:96:5: ( 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:96:9: 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal13=(Token)match(input,80,FOLLOW_80_in_importDeclaration186); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal13_tree = (Object)adaptor.create(string_literal13);
			adaptor.addChild(root_0, string_literal13_tree);
			}

			if ( state.backtracking==0 ) {importKWCount++;}
			// /media/tony/disk2/_git/cs543/JavaJava.g:96:37: ( 'static' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==94) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:96:37: 'static'
					{
					string_literal14=(Token)match(input,94,FOLLOW_94_in_importDeclaration190); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal14_tree = (Object)adaptor.create(string_literal14);
					adaptor.addChild(root_0, string_literal14_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_qualifiedName_in_importDeclaration193);
			qualifiedName15=qualifiedName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName15.getTree());

			if ( state.backtracking==0 ) {importIDCount++;}
			// /media/tony/disk2/_git/cs543/JavaJava.g:96:80: ( '.' '*' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==43) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:96:81: '.' '*'
					{
					char_literal16=(Token)match(input,43,FOLLOW_43_in_importDeclaration198); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal16_tree = (Object)adaptor.create(char_literal16);
					adaptor.addChild(root_0, char_literal16_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					char_literal17=(Token)match(input,34,FOLLOW_34_in_importDeclaration202); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal17_tree = (Object)adaptor.create(char_literal17);
					adaptor.addChild(root_0, char_literal17_tree);
					}

					if ( state.backtracking==0 ) {s("*");}
					}
					break;

			}

			char_literal18=(Token)match(input,48,FOLLOW_48_in_importDeclaration208); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal18_tree = (Object)adaptor.create(char_literal18);
			adaptor.addChild(root_0, char_literal18_tree);
			}

			if ( state.backtracking==0 ) {s(";");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "importDeclaration"


	public static class typeDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:99:1: typeDeclaration : ( classOrInterfaceDeclaration | ';' );
	public final JavaJavaParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
		JavaJavaParser.typeDeclaration_return retval = new JavaJavaParser.typeDeclaration_return();
		retval.start = input.LT(1);
		int typeDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal20=null;
		ParserRuleReturnScope classOrInterfaceDeclaration19 =null;

		Object char_literal20_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:100:5: ( classOrInterfaceDeclaration | ';' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ENUM||LA11_0==54||LA11_0==59||LA11_0==66||LA11_0==74||LA11_0==83||(LA11_0 >= 89 && LA11_0 <= 91)||(LA11_0 >= 94 && LA11_0 <= 95)) ) {
				alt11=1;
			}
			else if ( (LA11_0==48) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:100:9: classOrInterfaceDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration233);
					classOrInterfaceDeclaration19=classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration19.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:101:9: ';'
					{
					root_0 = (Object)adaptor.nil();


					char_literal20=(Token)match(input,48,FOLLOW_48_in_typeDeclaration243); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal20_tree = (Object)adaptor.create(char_literal20);
					adaptor.addChild(root_0, char_literal20_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, typeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeDeclaration"


	public static class classOrInterfaceDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classOrInterfaceDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:104:1: classOrInterfaceDeclaration : classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) ;
	public final JavaJavaParser.classOrInterfaceDeclaration_return classOrInterfaceDeclaration() throws RecognitionException {
		JavaJavaParser.classOrInterfaceDeclaration_return retval = new JavaJavaParser.classOrInterfaceDeclaration_return();
		retval.start = input.LT(1);
		int classOrInterfaceDeclaration_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope classOrInterfaceModifiers21 =null;
		ParserRuleReturnScope classDeclaration22 =null;
		ParserRuleReturnScope interfaceDeclaration23 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:105:5: ( classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) )
			// /media/tony/disk2/_git/cs543/JavaJava.g:105:9: classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration267);
			classOrInterfaceModifiers21=classOrInterfaceModifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceModifiers21.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:105:35: ( classDeclaration | interfaceDeclaration )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ENUM||LA12_0==66) ) {
				alt12=1;
			}
			else if ( (LA12_0==54||LA12_0==83) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:105:36: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration270);
					classDeclaration22=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration22.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:105:55: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration274);
					interfaceDeclaration23=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration23.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, classOrInterfaceDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classOrInterfaceDeclaration"


	public static class classOrInterfaceModifiers_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classOrInterfaceModifiers"
	// /media/tony/disk2/_git/cs543/JavaJava.g:108:1: classOrInterfaceModifiers : ( classOrInterfaceModifier )* ;
	public final JavaJavaParser.classOrInterfaceModifiers_return classOrInterfaceModifiers() throws RecognitionException {
		JavaJavaParser.classOrInterfaceModifiers_return retval = new JavaJavaParser.classOrInterfaceModifiers_return();
		retval.start = input.LT(1);
		int classOrInterfaceModifiers_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope classOrInterfaceModifier24 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:109:5: ( ( classOrInterfaceModifier )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:109:9: ( classOrInterfaceModifier )*
			{
			root_0 = (Object)adaptor.nil();


			// /media/tony/disk2/_git/cs543/JavaJava.g:109:9: ( classOrInterfaceModifier )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==54) ) {
					int LA13_2 = input.LA(2);
					if ( (LA13_2==Identifier) ) {
						alt13=1;
					}

				}
				else if ( (LA13_0==59||LA13_0==74||(LA13_0 >= 89 && LA13_0 <= 91)||(LA13_0 >= 94 && LA13_0 <= 95)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:109:9: classOrInterfaceModifier
					{
					pushFollow(FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers298);
					classOrInterfaceModifier24=classOrInterfaceModifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceModifier24.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, classOrInterfaceModifiers_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classOrInterfaceModifiers"


	public static class classOrInterfaceModifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classOrInterfaceModifier"
	// /media/tony/disk2/_git/cs543/JavaJava.g:112:1: classOrInterfaceModifier : ( annotation | 'public' | 'protected' | 'private' | 'abstract' | 'static' | 'final' | 'strictfp' );
	public final JavaJavaParser.classOrInterfaceModifier_return classOrInterfaceModifier() throws RecognitionException {
		JavaJavaParser.classOrInterfaceModifier_return retval = new JavaJavaParser.classOrInterfaceModifier_return();
		retval.start = input.LT(1);
		int classOrInterfaceModifier_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal26=null;
		Token string_literal27=null;
		Token string_literal28=null;
		Token string_literal29=null;
		Token string_literal30=null;
		Token string_literal31=null;
		Token string_literal32=null;
		ParserRuleReturnScope annotation25 =null;

		Object string_literal26_tree=null;
		Object string_literal27_tree=null;
		Object string_literal28_tree=null;
		Object string_literal29_tree=null;
		Object string_literal30_tree=null;
		Object string_literal31_tree=null;
		Object string_literal32_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:113:5: ( annotation | 'public' | 'protected' | 'private' | 'abstract' | 'static' | 'final' | 'strictfp' )
			int alt14=8;
			switch ( input.LA(1) ) {
			case 54:
				{
				alt14=1;
				}
				break;
			case 91:
				{
				alt14=2;
				}
				break;
			case 90:
				{
				alt14=3;
				}
				break;
			case 89:
				{
				alt14=4;
				}
				break;
			case 59:
				{
				alt14=5;
				}
				break;
			case 94:
				{
				alt14=6;
				}
				break;
			case 74:
				{
				alt14=7;
				}
				break;
			case 95:
				{
				alt14=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:113:9: annotation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotation_in_classOrInterfaceModifier318);
					annotation25=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation25.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:114:9: 'public'
					{
					root_0 = (Object)adaptor.nil();


					string_literal26=(Token)match(input,91,FOLLOW_91_in_classOrInterfaceModifier331); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal26_tree = (Object)adaptor.create(string_literal26);
					adaptor.addChild(root_0, string_literal26_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("public");
					    		      System.out.println("PUBLIC has been found");}
					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:116:9: 'protected'
					{
					root_0 = (Object)adaptor.nil();


					string_literal27=(Token)match(input,90,FOLLOW_90_in_classOrInterfaceModifier347); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal27_tree = (Object)adaptor.create(string_literal27);
					adaptor.addChild(root_0, string_literal27_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("protected");}
					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:117:9: 'private'
					{
					root_0 = (Object)adaptor.nil();


					string_literal28=(Token)match(input,89,FOLLOW_89_in_classOrInterfaceModifier360); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal28_tree = (Object)adaptor.create(string_literal28);
					adaptor.addChild(root_0, string_literal28_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++; JavaMetrics.uniqueKeywords.add("private");}
					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:118:9: 'abstract'
					{
					root_0 = (Object)adaptor.nil();


					string_literal29=(Token)match(input,59,FOLLOW_59_in_classOrInterfaceModifier375); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal29_tree = (Object)adaptor.create(string_literal29);
					adaptor.addChild(root_0, string_literal29_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("abstract");}
					}
					break;
				case 6 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:119:9: 'static'
					{
					root_0 = (Object)adaptor.nil();


					string_literal30=(Token)match(input,94,FOLLOW_94_in_classOrInterfaceModifier389); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal30_tree = (Object)adaptor.create(string_literal30);
					adaptor.addChild(root_0, string_literal30_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("static");}
					}
					break;
				case 7 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:120:9: 'final'
					{
					root_0 = (Object)adaptor.nil();


					string_literal31=(Token)match(input,74,FOLLOW_74_in_classOrInterfaceModifier405); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal31_tree = (Object)adaptor.create(string_literal31);
					adaptor.addChild(root_0, string_literal31_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("final");}
					}
					break;
				case 8 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:121:9: 'strictfp'
					{
					root_0 = (Object)adaptor.nil();


					string_literal32=(Token)match(input,95,FOLLOW_95_in_classOrInterfaceModifier422); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal32_tree = (Object)adaptor.create(string_literal32);
					adaptor.addChild(root_0, string_literal32_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("strictfp");}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, classOrInterfaceModifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classOrInterfaceModifier"


	public static class modifiers_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "modifiers"
	// /media/tony/disk2/_git/cs543/JavaJava.g:124:1: modifiers : ( modifier )* ;
	public final JavaJavaParser.modifiers_return modifiers() throws RecognitionException {
		JavaJavaParser.modifiers_return retval = new JavaJavaParser.modifiers_return();
		retval.start = input.LT(1);
		int modifiers_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope modifier33 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:125:5: ( ( modifier )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:125:9: ( modifier )*
			{
			root_0 = (Object)adaptor.nil();


			// /media/tony/disk2/_git/cs543/JavaJava.g:125:9: ( modifier )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==54) ) {
					int LA15_2 = input.LA(2);
					if ( (LA15_2==Identifier) ) {
						alt15=1;
					}

				}
				else if ( (LA15_0==59||LA15_0==74||LA15_0==85||(LA15_0 >= 89 && LA15_0 <= 91)||(LA15_0 >= 94 && LA15_0 <= 95)||LA15_0==98||LA15_0==102||LA15_0==106) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:125:9: modifier
					{
					pushFollow(FOLLOW_modifier_in_modifiers445);
					modifier33=modifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier33.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, modifiers_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "modifiers"


	public static class classDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:128:1: classDeclaration : ( normalClassDeclaration | enumDeclaration );
	public final JavaJavaParser.classDeclaration_return classDeclaration() throws RecognitionException {
		JavaJavaParser.classDeclaration_return retval = new JavaJavaParser.classDeclaration_return();
		retval.start = input.LT(1);
		int classDeclaration_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope normalClassDeclaration34 =null;
		ParserRuleReturnScope enumDeclaration35 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:129:5: ( normalClassDeclaration | enumDeclaration )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==66) ) {
				alt16=1;
			}
			else if ( (LA16_0==ENUM) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:129:9: normalClassDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_normalClassDeclaration_in_classDeclaration465);
					normalClassDeclaration34=normalClassDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, normalClassDeclaration34.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:130:9: enumDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enumDeclaration_in_classDeclaration475);
					enumDeclaration35=enumDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDeclaration35.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, classDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classDeclaration"


	public static class normalClassDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalClassDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:133:1: normalClassDeclaration : 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody ;
	public final JavaJavaParser.normalClassDeclaration_return normalClassDeclaration() throws RecognitionException {
		JavaJavaParser.normalClassDeclaration_return retval = new JavaJavaParser.normalClassDeclaration_return();
		retval.start = input.LT(1);
		int normalClassDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal36=null;
		Token Identifier37=null;
		Token string_literal39=null;
		Token string_literal41=null;
		ParserRuleReturnScope typeParameters38 =null;
		ParserRuleReturnScope type40 =null;
		ParserRuleReturnScope typeList42 =null;
		ParserRuleReturnScope classBody43 =null;

		Object string_literal36_tree=null;
		Object Identifier37_tree=null;
		Object string_literal39_tree=null;
		Object string_literal41_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:134:5: ( 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody )
			// /media/tony/disk2/_git/cs543/JavaJava.g:134:9: 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody
			{
			root_0 = (Object)adaptor.nil();


			string_literal36=(Token)match(input,66,FOLLOW_66_in_normalClassDeclaration498); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal36_tree = (Object)adaptor.create(string_literal36);
			adaptor.addChild(root_0, string_literal36_tree);
			}

			Identifier37=(Token)match(input,Identifier,FOLLOW_Identifier_in_normalClassDeclaration500); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier37_tree = (Object)adaptor.create(Identifier37);
			adaptor.addChild(root_0, Identifier37_tree);
			}

			if ( state.backtracking==0 ) { className=(Identifier37!=null?Identifier37.getText():null); classCount++;}
			if ( state.backtracking==0 ) {keywordCount++; JavaMetrics.uniqueKeywords.add("class"); id((Identifier37!=null?Identifier37.getText():null));}
			// /media/tony/disk2/_git/cs543/JavaJava.g:134:153: ( typeParameters )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==49) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:134:153: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalClassDeclaration505);
					typeParameters38=typeParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters38.getTree());

					}
					break;

			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:135:9: ( 'extends' type )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==72) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:135:10: 'extends' type
					{
					string_literal39=(Token)match(input,72,FOLLOW_72_in_normalClassDeclaration517); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal39_tree = (Object)adaptor.create(string_literal39);
					adaptor.addChild(root_0, string_literal39_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("extends");}
					pushFollow(FOLLOW_type_in_normalClassDeclaration520);
					type40=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type40.getTree());

					}
					break;

			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:136:9: ( 'implements' typeList )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==79) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:136:10: 'implements' typeList
					{
					string_literal41=(Token)match(input,79,FOLLOW_79_in_normalClassDeclaration534); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal41_tree = (Object)adaptor.create(string_literal41);
					adaptor.addChild(root_0, string_literal41_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("implements");}
					pushFollow(FOLLOW_typeList_in_normalClassDeclaration538);
					typeList42=typeList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList42.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_classBody_in_normalClassDeclaration551);
			classBody43=classBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody43.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, normalClassDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalClassDeclaration"


	public static class typeParameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeParameters"
	// /media/tony/disk2/_git/cs543/JavaJava.g:140:1: typeParameters : '<' typeParameter ( ',' typeParameter )* '>' ;
	public final JavaJavaParser.typeParameters_return typeParameters() throws RecognitionException {
		JavaJavaParser.typeParameters_return retval = new JavaJavaParser.typeParameters_return();
		retval.start = input.LT(1);
		int typeParameters_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal44=null;
		Token char_literal46=null;
		Token char_literal48=null;
		ParserRuleReturnScope typeParameter45 =null;
		ParserRuleReturnScope typeParameter47 =null;

		Object char_literal44_tree=null;
		Object char_literal46_tree=null;
		Object char_literal48_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:141:5: ( '<' typeParameter ( ',' typeParameter )* '>' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:141:9: '<' typeParameter ( ',' typeParameter )* '>'
			{
			root_0 = (Object)adaptor.nil();


			char_literal44=(Token)match(input,49,FOLLOW_49_in_typeParameters574); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = (Object)adaptor.create(char_literal44);
			adaptor.addChild(root_0, char_literal44_tree);
			}

			if ( state.backtracking==0 ) {s("<");}
			pushFollow(FOLLOW_typeParameter_in_typeParameters577);
			typeParameter45=typeParameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameter45.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:141:36: ( ',' typeParameter )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==39) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:141:37: ',' typeParameter
					{
					char_literal46=(Token)match(input,39,FOLLOW_39_in_typeParameters580); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal46_tree = (Object)adaptor.create(char_literal46);
					adaptor.addChild(root_0, char_literal46_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_typeParameter_in_typeParameters583);
					typeParameter47=typeParameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameter47.getTree());

					}
					break;

				default :
					break loop20;
				}
			}

			char_literal48=(Token)match(input,52,FOLLOW_52_in_typeParameters587); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal48_tree = (Object)adaptor.create(char_literal48);
			adaptor.addChild(root_0, char_literal48_tree);
			}

			if ( state.backtracking==0 ) {s(">");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, typeParameters_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeParameters"


	public static class typeParameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeParameter"
	// /media/tony/disk2/_git/cs543/JavaJava.g:144:1: typeParameter : Identifier ( 'extends' typeBound )? ;
	public final JavaJavaParser.typeParameter_return typeParameter() throws RecognitionException {
		JavaJavaParser.typeParameter_return retval = new JavaJavaParser.typeParameter_return();
		retval.start = input.LT(1);
		int typeParameter_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier49=null;
		Token string_literal50=null;
		ParserRuleReturnScope typeBound51 =null;

		Object Identifier49_tree=null;
		Object string_literal50_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:145:5: ( Identifier ( 'extends' typeBound )? )
			// /media/tony/disk2/_git/cs543/JavaJava.g:145:9: Identifier ( 'extends' typeBound )?
			{
			root_0 = (Object)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_typeParameter612); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = (Object)adaptor.create(Identifier49);
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:145:19: ( 'extends' typeBound )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==72) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:145:20: 'extends' typeBound
					{
					string_literal50=(Token)match(input,72,FOLLOW_72_in_typeParameter614); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal50_tree = (Object)adaptor.create(string_literal50);
					adaptor.addChild(root_0, string_literal50_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("extends");}
					pushFollow(FOLLOW_typeBound_in_typeParameter617);
					typeBound51=typeBound();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeBound51.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, typeParameter_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeParameter"


	public static class typeBound_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeBound"
	// /media/tony/disk2/_git/cs543/JavaJava.g:148:1: typeBound : type ( '&' type )* ;
	public final JavaJavaParser.typeBound_return typeBound() throws RecognitionException {
		JavaJavaParser.typeBound_return retval = new JavaJavaParser.typeBound_return();
		retval.start = input.LT(1);
		int typeBound_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal53=null;
		ParserRuleReturnScope type52 =null;
		ParserRuleReturnScope type54 =null;

		Object char_literal53_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:149:5: ( type ( '&' type )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:149:9: type ( '&' type )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_typeBound646);
			type52=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type52.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:149:14: ( '&' type )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==30) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:149:15: '&' type
					{
					char_literal53=(Token)match(input,30,FOLLOW_30_in_typeBound649); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal53_tree = (Object)adaptor.create(char_literal53);
					adaptor.addChild(root_0, char_literal53_tree);
					}

					pushFollow(FOLLOW_type_in_typeBound651);
					type54=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type54.getTree());

					}
					break;

				default :
					break loop22;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, typeBound_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeBound"


	public static class enumDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enumDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:152:1: enumDeclaration : ENUM Identifier ( 'implements' typeList )? enumBody ;
	public final JavaJavaParser.enumDeclaration_return enumDeclaration() throws RecognitionException {
		JavaJavaParser.enumDeclaration_return retval = new JavaJavaParser.enumDeclaration_return();
		retval.start = input.LT(1);
		int enumDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token ENUM55=null;
		Token Identifier56=null;
		Token string_literal57=null;
		ParserRuleReturnScope typeList58 =null;
		ParserRuleReturnScope enumBody59 =null;

		Object ENUM55_tree=null;
		Object Identifier56_tree=null;
		Object string_literal57_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:153:5: ( ENUM Identifier ( 'implements' typeList )? enumBody )
			// /media/tony/disk2/_git/cs543/JavaJava.g:153:9: ENUM Identifier ( 'implements' typeList )? enumBody
			{
			root_0 = (Object)adaptor.nil();


			ENUM55=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration672); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ENUM55_tree = (Object)adaptor.create(ENUM55);
			adaptor.addChild(root_0, ENUM55_tree);
			}

			Identifier56=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumDeclaration674); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier56_tree = (Object)adaptor.create(Identifier56);
			adaptor.addChild(root_0, Identifier56_tree);
			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:153:25: ( 'implements' typeList )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==79) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:153:26: 'implements' typeList
					{
					string_literal57=(Token)match(input,79,FOLLOW_79_in_enumDeclaration677); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal57_tree = (Object)adaptor.create(string_literal57);
					adaptor.addChild(root_0, string_literal57_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("implements");}
					pushFollow(FOLLOW_typeList_in_enumDeclaration681);
					typeList58=typeList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList58.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_enumBody_in_enumDeclaration685);
			enumBody59=enumBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, enumBody59.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, enumDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumDeclaration"


	public static class enumBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enumBody"
	// /media/tony/disk2/_git/cs543/JavaJava.g:156:1: enumBody : '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' ;
	public final JavaJavaParser.enumBody_return enumBody() throws RecognitionException {
		JavaJavaParser.enumBody_return retval = new JavaJavaParser.enumBody_return();
		retval.start = input.LT(1);
		int enumBody_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal60=null;
		Token char_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope enumConstants61 =null;
		ParserRuleReturnScope enumBodyDeclarations63 =null;

		Object char_literal60_tree=null;
		Object char_literal62_tree=null;
		Object char_literal64_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:157:5: ( '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:157:9: '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal60=(Token)match(input,108,FOLLOW_108_in_enumBody704); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal60_tree = (Object)adaptor.create(char_literal60);
			adaptor.addChild(root_0, char_literal60_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:157:23: ( enumConstants )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==Identifier||LA24_0==54) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:157:23: enumConstants
					{
					pushFollow(FOLLOW_enumConstants_in_enumBody708);
					enumConstants61=enumConstants();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstants61.getTree());

					}
					break;

			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:157:38: ( ',' )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==39) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:157:38: ','
					{
					char_literal62=(Token)match(input,39,FOLLOW_39_in_enumBody711); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal62_tree = (Object)adaptor.create(char_literal62);
					adaptor.addChild(root_0, char_literal62_tree);
					}

					}
					break;

			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:157:43: ( enumBodyDeclarations )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==48) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:157:43: enumBodyDeclarations
					{
					pushFollow(FOLLOW_enumBodyDeclarations_in_enumBody714);
					enumBodyDeclarations63=enumBodyDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumBodyDeclarations63.getTree());

					}
					break;

			}

			char_literal64=(Token)match(input,112,FOLLOW_112_in_enumBody717); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal64_tree = (Object)adaptor.create(char_literal64);
			adaptor.addChild(root_0, char_literal64_tree);
			}

			if ( state.backtracking==0 ) {s("}");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, enumBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumBody"


	public static class enumConstants_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enumConstants"
	// /media/tony/disk2/_git/cs543/JavaJava.g:160:1: enumConstants : enumConstant ( ',' enumConstant )* ;
	public final JavaJavaParser.enumConstants_return enumConstants() throws RecognitionException {
		JavaJavaParser.enumConstants_return retval = new JavaJavaParser.enumConstants_return();
		retval.start = input.LT(1);
		int enumConstants_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal66=null;
		ParserRuleReturnScope enumConstant65 =null;
		ParserRuleReturnScope enumConstant67 =null;

		Object char_literal66_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:161:5: ( enumConstant ( ',' enumConstant )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:161:9: enumConstant ( ',' enumConstant )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_enumConstant_in_enumConstants738);
			enumConstant65=enumConstant();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstant65.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:161:22: ( ',' enumConstant )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==39) ) {
					int LA27_1 = input.LA(2);
					if ( (LA27_1==Identifier||LA27_1==54) ) {
						alt27=1;
					}

				}

				switch (alt27) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:161:23: ',' enumConstant
					{
					char_literal66=(Token)match(input,39,FOLLOW_39_in_enumConstants741); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal66_tree = (Object)adaptor.create(char_literal66);
					adaptor.addChild(root_0, char_literal66_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_enumConstant_in_enumConstants745);
					enumConstant67=enumConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstant67.getTree());

					}
					break;

				default :
					break loop27;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, enumConstants_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumConstants"


	public static class enumConstant_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enumConstant"
	// /media/tony/disk2/_git/cs543/JavaJava.g:164:1: enumConstant : ( annotations )? Identifier ( arguments )? ( classBody )? ;
	public final JavaJavaParser.enumConstant_return enumConstant() throws RecognitionException {
		JavaJavaParser.enumConstant_return retval = new JavaJavaParser.enumConstant_return();
		retval.start = input.LT(1);
		int enumConstant_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier69=null;
		ParserRuleReturnScope annotations68 =null;
		ParserRuleReturnScope arguments70 =null;
		ParserRuleReturnScope classBody71 =null;

		Object Identifier69_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:165:5: ( ( annotations )? Identifier ( arguments )? ( classBody )? )
			// /media/tony/disk2/_git/cs543/JavaJava.g:165:9: ( annotations )? Identifier ( arguments )? ( classBody )?
			{
			root_0 = (Object)adaptor.nil();


			// /media/tony/disk2/_git/cs543/JavaJava.g:165:9: ( annotations )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==54) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:165:9: annotations
					{
					pushFollow(FOLLOW_annotations_in_enumConstant770);
					annotations68=annotations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotations68.getTree());

					}
					break;

			}

			Identifier69=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumConstant773); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier69_tree = (Object)adaptor.create(Identifier69);
			adaptor.addChild(root_0, Identifier69_tree);
			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:165:33: ( arguments )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==32) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:165:33: arguments
					{
					pushFollow(FOLLOW_arguments_in_enumConstant775);
					arguments70=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments70.getTree());

					}
					break;

			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:165:44: ( classBody )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==108) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:165:44: classBody
					{
					pushFollow(FOLLOW_classBody_in_enumConstant778);
					classBody71=classBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody71.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, enumConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumConstant"


	public static class enumBodyDeclarations_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enumBodyDeclarations"
	// /media/tony/disk2/_git/cs543/JavaJava.g:168:1: enumBodyDeclarations : ';' ( classBodyDeclaration )* ;
	public final JavaJavaParser.enumBodyDeclarations_return enumBodyDeclarations() throws RecognitionException {
		JavaJavaParser.enumBodyDeclarations_return retval = new JavaJavaParser.enumBodyDeclarations_return();
		retval.start = input.LT(1);
		int enumBodyDeclarations_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal72=null;
		ParserRuleReturnScope classBodyDeclaration73 =null;

		Object char_literal72_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:169:5: ( ';' ( classBodyDeclaration )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:169:9: ';' ( classBodyDeclaration )*
			{
			root_0 = (Object)adaptor.nil();


			char_literal72=(Token)match(input,48,FOLLOW_48_in_enumBodyDeclarations802); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal72_tree = (Object)adaptor.create(char_literal72);
			adaptor.addChild(root_0, char_literal72_tree);
			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:169:13: ( classBodyDeclaration )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==ENUM||LA31_0==Identifier||(LA31_0 >= 48 && LA31_0 <= 49)||LA31_0==54||(LA31_0 >= 59 && LA31_0 <= 60)||LA31_0==62||(LA31_0 >= 65 && LA31_0 <= 66)||LA31_0==70||LA31_0==74||LA31_0==76||(LA31_0 >= 82 && LA31_0 <= 85)||(LA31_0 >= 89 && LA31_0 <= 91)||(LA31_0 >= 93 && LA31_0 <= 95)||LA31_0==98||LA31_0==102||(LA31_0 >= 105 && LA31_0 <= 106)||LA31_0==108) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:169:14: classBodyDeclaration
					{
					pushFollow(FOLLOW_classBodyDeclaration_in_enumBodyDeclarations805);
					classBodyDeclaration73=classBodyDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBodyDeclaration73.getTree());

					}
					break;

				default :
					break loop31;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, enumBodyDeclarations_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumBodyDeclarations"


	public static class interfaceDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:172:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );
	public final JavaJavaParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		JavaJavaParser.interfaceDeclaration_return retval = new JavaJavaParser.interfaceDeclaration_return();
		retval.start = input.LT(1);
		int interfaceDeclaration_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope normalInterfaceDeclaration74 =null;
		ParserRuleReturnScope annotationTypeDeclaration75 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:173:5: ( normalInterfaceDeclaration | annotationTypeDeclaration )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==83) ) {
				alt32=1;
			}
			else if ( (LA32_0==54) ) {
				alt32=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:173:9: normalInterfaceDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration830);
					normalInterfaceDeclaration74=normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, normalInterfaceDeclaration74.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:174:9: annotationTypeDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration840);
					annotationTypeDeclaration75=annotationTypeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeDeclaration75.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, interfaceDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceDeclaration"


	public static class normalInterfaceDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalInterfaceDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:177:1: normalInterfaceDeclaration : 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody ;
	public final JavaJavaParser.normalInterfaceDeclaration_return normalInterfaceDeclaration() throws RecognitionException {
		JavaJavaParser.normalInterfaceDeclaration_return retval = new JavaJavaParser.normalInterfaceDeclaration_return();
		retval.start = input.LT(1);
		int normalInterfaceDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal76=null;
		Token Identifier77=null;
		Token string_literal79=null;
		ParserRuleReturnScope typeParameters78 =null;
		ParserRuleReturnScope typeList80 =null;
		ParserRuleReturnScope interfaceBody81 =null;

		Object string_literal76_tree=null;
		Object Identifier77_tree=null;
		Object string_literal79_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:178:5: ( 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody )
			// /media/tony/disk2/_git/cs543/JavaJava.g:178:9: 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody
			{
			root_0 = (Object)adaptor.nil();


			string_literal76=(Token)match(input,83,FOLLOW_83_in_normalInterfaceDeclaration863); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal76_tree = (Object)adaptor.create(string_literal76);
			adaptor.addChild(root_0, string_literal76_tree);
			}

			if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("interface");}
			Identifier77=(Token)match(input,Identifier,FOLLOW_Identifier_in_normalInterfaceDeclaration867); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier77_tree = (Object)adaptor.create(Identifier77);
			adaptor.addChild(root_0, Identifier77_tree);
			}

			if ( state.backtracking==0 ) {id((Identifier77!=null?Identifier77.getText():null));}
			// /media/tony/disk2/_git/cs543/JavaJava.g:178:118: ( typeParameters )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==49) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:178:118: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalInterfaceDeclaration871);
					typeParameters78=typeParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters78.getTree());

					}
					break;

			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:178:134: ( 'extends' typeList )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==72) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:178:135: 'extends' typeList
					{
					string_literal79=(Token)match(input,72,FOLLOW_72_in_normalInterfaceDeclaration875); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal79_tree = (Object)adaptor.create(string_literal79);
					adaptor.addChild(root_0, string_literal79_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("extends");}
					pushFollow(FOLLOW_typeList_in_normalInterfaceDeclaration878);
					typeList80=typeList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList80.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_interfaceBody_in_normalInterfaceDeclaration882);
			interfaceBody81=interfaceBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody81.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, normalInterfaceDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalInterfaceDeclaration"


	public static class typeList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeList"
	// /media/tony/disk2/_git/cs543/JavaJava.g:181:1: typeList : type ( ',' type )* ;
	public final JavaJavaParser.typeList_return typeList() throws RecognitionException {
		JavaJavaParser.typeList_return retval = new JavaJavaParser.typeList_return();
		retval.start = input.LT(1);
		int typeList_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal83=null;
		ParserRuleReturnScope type82 =null;
		ParserRuleReturnScope type84 =null;

		Object char_literal83_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:182:5: ( type ( ',' type )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:182:9: type ( ',' type )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_typeList905);
			type82=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type82.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:182:14: ( ',' type )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==39) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:182:15: ',' type
					{
					char_literal83=(Token)match(input,39,FOLLOW_39_in_typeList908); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal83_tree = (Object)adaptor.create(char_literal83);
					adaptor.addChild(root_0, char_literal83_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_type_in_typeList912);
					type84=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type84.getTree());

					}
					break;

				default :
					break loop35;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, typeList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeList"


	public static class classBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classBody"
	// /media/tony/disk2/_git/cs543/JavaJava.g:185:1: classBody : '{' ( classBodyDeclaration )* '}' ;
	public final JavaJavaParser.classBody_return classBody() throws RecognitionException {
		JavaJavaParser.classBody_return retval = new JavaJavaParser.classBody_return();
		retval.start = input.LT(1);
		int classBody_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal85=null;
		Token char_literal87=null;
		ParserRuleReturnScope classBodyDeclaration86 =null;

		Object char_literal85_tree=null;
		Object char_literal87_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:186:5: ( '{' ( classBodyDeclaration )* '}' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:186:9: '{' ( classBodyDeclaration )* '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal85=(Token)match(input,108,FOLLOW_108_in_classBody937); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal85_tree = (Object)adaptor.create(char_literal85);
			adaptor.addChild(root_0, char_literal85_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:186:23: ( classBodyDeclaration )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==ENUM||LA36_0==Identifier||(LA36_0 >= 48 && LA36_0 <= 49)||LA36_0==54||(LA36_0 >= 59 && LA36_0 <= 60)||LA36_0==62||(LA36_0 >= 65 && LA36_0 <= 66)||LA36_0==70||LA36_0==74||LA36_0==76||(LA36_0 >= 82 && LA36_0 <= 85)||(LA36_0 >= 89 && LA36_0 <= 91)||(LA36_0 >= 93 && LA36_0 <= 95)||LA36_0==98||LA36_0==102||(LA36_0 >= 105 && LA36_0 <= 106)||LA36_0==108) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:186:23: classBodyDeclaration
					{
					pushFollow(FOLLOW_classBodyDeclaration_in_classBody941);
					classBodyDeclaration86=classBodyDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBodyDeclaration86.getTree());

					}
					break;

				default :
					break loop36;
				}
			}

			char_literal87=(Token)match(input,112,FOLLOW_112_in_classBody944); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal87_tree = (Object)adaptor.create(char_literal87);
			adaptor.addChild(root_0, char_literal87_tree);
			}

			if ( state.backtracking==0 ) {s("}");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, classBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classBody"


	public static class interfaceBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceBody"
	// /media/tony/disk2/_git/cs543/JavaJava.g:189:1: interfaceBody : '{' ( interfaceBodyDeclaration )* '}' ;
	public final JavaJavaParser.interfaceBody_return interfaceBody() throws RecognitionException {
		JavaJavaParser.interfaceBody_return retval = new JavaJavaParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope interfaceBodyDeclaration89 =null;

		Object char_literal88_tree=null;
		Object char_literal90_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:190:5: ( '{' ( interfaceBodyDeclaration )* '}' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:190:9: '{' ( interfaceBodyDeclaration )* '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal88=(Token)match(input,108,FOLLOW_108_in_interfaceBody968); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal88_tree = (Object)adaptor.create(char_literal88);
			adaptor.addChild(root_0, char_literal88_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:190:22: ( interfaceBodyDeclaration )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==ENUM||LA37_0==Identifier||(LA37_0 >= 48 && LA37_0 <= 49)||LA37_0==54||(LA37_0 >= 59 && LA37_0 <= 60)||LA37_0==62||(LA37_0 >= 65 && LA37_0 <= 66)||LA37_0==70||LA37_0==74||LA37_0==76||(LA37_0 >= 82 && LA37_0 <= 85)||(LA37_0 >= 89 && LA37_0 <= 91)||(LA37_0 >= 93 && LA37_0 <= 95)||LA37_0==98||LA37_0==102||(LA37_0 >= 105 && LA37_0 <= 106)) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:190:22: interfaceBodyDeclaration
					{
					pushFollow(FOLLOW_interfaceBodyDeclaration_in_interfaceBody971);
					interfaceBodyDeclaration89=interfaceBodyDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBodyDeclaration89.getTree());

					}
					break;

				default :
					break loop37;
				}
			}

			char_literal90=(Token)match(input,112,FOLLOW_112_in_interfaceBody974); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal90_tree = (Object)adaptor.create(char_literal90);
			adaptor.addChild(root_0, char_literal90_tree);
			}

			if ( state.backtracking==0 ) {s("}");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, interfaceBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceBody"


	public static class classBodyDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classBodyDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:193:1: classBodyDeclaration : ( ';' | ( 'static' )? block | modifiers memberDecl );
	public final JavaJavaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
		JavaJavaParser.classBodyDeclaration_return retval = new JavaJavaParser.classBodyDeclaration_return();
		retval.start = input.LT(1);
		int classBodyDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal91=null;
		Token string_literal92=null;
		ParserRuleReturnScope block93 =null;
		ParserRuleReturnScope modifiers94 =null;
		ParserRuleReturnScope memberDecl95 =null;

		Object char_literal91_tree=null;
		Object string_literal92_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:194:5: ( ';' | ( 'static' )? block | modifiers memberDecl )
			int alt39=3;
			switch ( input.LA(1) ) {
			case 48:
				{
				alt39=1;
				}
				break;
			case 94:
				{
				int LA39_2 = input.LA(2);
				if ( (LA39_2==108) ) {
					alt39=2;
				}
				else if ( (LA39_2==ENUM||LA39_2==Identifier||LA39_2==49||LA39_2==54||(LA39_2 >= 59 && LA39_2 <= 60)||LA39_2==62||(LA39_2 >= 65 && LA39_2 <= 66)||LA39_2==70||LA39_2==74||LA39_2==76||(LA39_2 >= 82 && LA39_2 <= 85)||(LA39_2 >= 89 && LA39_2 <= 91)||(LA39_2 >= 93 && LA39_2 <= 95)||LA39_2==98||LA39_2==102||(LA39_2 >= 105 && LA39_2 <= 106)) ) {
					alt39=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 108:
				{
				alt39=2;
				}
				break;
			case ENUM:
			case Identifier:
			case 49:
			case 54:
			case 59:
			case 60:
			case 62:
			case 65:
			case 66:
			case 70:
			case 74:
			case 76:
			case 82:
			case 83:
			case 84:
			case 85:
			case 89:
			case 90:
			case 91:
			case 93:
			case 95:
			case 98:
			case 102:
			case 105:
			case 106:
				{
				alt39=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:194:9: ';'
					{
					root_0 = (Object)adaptor.nil();


					char_literal91=(Token)match(input,48,FOLLOW_48_in_classBodyDeclaration994); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal91_tree = (Object)adaptor.create(char_literal91);
					adaptor.addChild(root_0, char_literal91_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:195:9: ( 'static' )? block
					{
					root_0 = (Object)adaptor.nil();


					// /media/tony/disk2/_git/cs543/JavaJava.g:195:9: ( 'static' )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==94) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:195:9: 'static'
							{
							string_literal92=(Token)match(input,94,FOLLOW_94_in_classBodyDeclaration1006); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal92_tree = (Object)adaptor.create(string_literal92);
							adaptor.addChild(root_0, string_literal92_tree);
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("static");}
					pushFollow(FOLLOW_block_in_classBodyDeclaration1013);
					block93=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block93.getTree());

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:196:9: modifiers memberDecl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_modifiers_in_classBodyDeclaration1023);
					modifiers94=modifiers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers94.getTree());

					pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration1025);
					memberDecl95=memberDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberDecl95.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, classBodyDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classBodyDeclaration"


	public static class memberDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "memberDecl"
	// /media/tony/disk2/_git/cs543/JavaJava.g:199:1: memberDecl : ( genericMethodOrConstructorDecl | memberDeclaration | 'void' Identifier voidMethodDeclaratorRest | Identifier constructorDeclaratorRest | interfaceDeclaration | classDeclaration );
	public final JavaJavaParser.memberDecl_return memberDecl() throws RecognitionException {
		JavaJavaParser.memberDecl_return retval = new JavaJavaParser.memberDecl_return();
		retval.start = input.LT(1);
		int memberDecl_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal98=null;
		Token Identifier99=null;
		Token Identifier101=null;
		ParserRuleReturnScope genericMethodOrConstructorDecl96 =null;
		ParserRuleReturnScope memberDeclaration97 =null;
		ParserRuleReturnScope voidMethodDeclaratorRest100 =null;
		ParserRuleReturnScope constructorDeclaratorRest102 =null;
		ParserRuleReturnScope interfaceDeclaration103 =null;
		ParserRuleReturnScope classDeclaration104 =null;

		Object string_literal98_tree=null;
		Object Identifier99_tree=null;
		Object Identifier101_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:200:5: ( genericMethodOrConstructorDecl | memberDeclaration | 'void' Identifier voidMethodDeclaratorRest | Identifier constructorDeclaratorRest | interfaceDeclaration | classDeclaration )
			int alt40=6;
			switch ( input.LA(1) ) {
			case 49:
				{
				alt40=1;
				}
				break;
			case Identifier:
				{
				int LA40_2 = input.LA(2);
				if ( (LA40_2==Identifier||LA40_2==43||LA40_2==49||LA40_2==55) ) {
					alt40=2;
				}
				else if ( (LA40_2==32) ) {
					alt40=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 60:
			case 62:
			case 65:
			case 70:
			case 76:
			case 82:
			case 84:
			case 93:
				{
				alt40=2;
				}
				break;
			case 105:
				{
				alt40=3;
				}
				break;
			case 54:
			case 83:
				{
				alt40=5;
				}
				break;
			case ENUM:
			case 66:
				{
				alt40=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:200:9: genericMethodOrConstructorDecl
					{
					root_0 = (Object)adaptor.nil();


					if ( state.backtracking==0 ) {inMethod=true;}
					pushFollow(FOLLOW_genericMethodOrConstructorDecl_in_memberDecl1050);
					genericMethodOrConstructorDecl96=genericMethodOrConstructorDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, genericMethodOrConstructorDecl96.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:201:9: memberDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_memberDeclaration_in_memberDecl1060);
					memberDeclaration97=memberDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberDeclaration97.getTree());

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:202:9: 'void' Identifier voidMethodDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					if ( state.backtracking==0 ) {inMethod=true;}
					string_literal98=(Token)match(input,105,FOLLOW_105_in_memberDecl1072); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal98_tree = (Object)adaptor.create(string_literal98);
					adaptor.addChild(root_0, string_literal98_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("void");}
					Identifier99=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl1075); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier99_tree = (Object)adaptor.create(Identifier99);
					adaptor.addChild(root_0, Identifier99_tree);
					}

					if ( state.backtracking==0 ) {id((Identifier99!=null?Identifier99.getText():null)); methodName = (Identifier99!=null?Identifier99.getText():null);}
					pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDecl1080);
					voidMethodDeclaratorRest100=voidMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, voidMethodDeclaratorRest100.getTree());

					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:203:9: Identifier constructorDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					if ( state.backtracking==0 ) {inMethod=true;}
					Identifier101=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl1092); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier101_tree = (Object)adaptor.create(Identifier101);
					adaptor.addChild(root_0, Identifier101_tree);
					}

					if ( state.backtracking==0 ) {{id((Identifier101!=null?Identifier101.getText():null));} methodName = (Identifier101!=null?Identifier101.getText():null);}
					pushFollow(FOLLOW_constructorDeclaratorRest_in_memberDecl1097);
					constructorDeclaratorRest102=constructorDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorDeclaratorRest102.getTree());

					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:204:9: interfaceDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_memberDecl1107);
					interfaceDeclaration103=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration103.getTree());

					}
					break;
				case 6 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:205:9: classDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_memberDecl1117);
					classDeclaration104=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration104.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, memberDecl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberDecl"


	public static class memberDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "memberDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:208:1: memberDeclaration : type ( methodDeclaration | fieldDeclaration ) ;
	public final JavaJavaParser.memberDeclaration_return memberDeclaration() throws RecognitionException {
		JavaJavaParser.memberDeclaration_return retval = new JavaJavaParser.memberDeclaration_return();
		retval.start = input.LT(1);
		int memberDeclaration_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope type105 =null;
		ParserRuleReturnScope methodDeclaration106 =null;
		ParserRuleReturnScope fieldDeclaration107 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:209:5: ( type ( methodDeclaration | fieldDeclaration ) )
			// /media/tony/disk2/_git/cs543/JavaJava.g:209:9: type ( methodDeclaration | fieldDeclaration )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_memberDeclaration1140);
			type105=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type105.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:209:14: ( methodDeclaration | fieldDeclaration )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==Identifier) ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1==32) ) {
					alt41=1;
				}
				else if ( (LA41_1==55) ) {
					alt41=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:209:15: methodDeclaration
					{
					if ( state.backtracking==0 ) {inMethod=true;}
					pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration1145);
					methodDeclaration106=methodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration106.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:209:54: fieldDeclaration
					{
					if ( state.backtracking==0 ) {inMethod=false;}
					pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration1153);
					fieldDeclaration107=fieldDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDeclaration107.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, memberDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberDeclaration"


	public static class genericMethodOrConstructorDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "genericMethodOrConstructorDecl"
	// /media/tony/disk2/_git/cs543/JavaJava.g:212:1: genericMethodOrConstructorDecl : typeParameters genericMethodOrConstructorRest ;
	public final JavaJavaParser.genericMethodOrConstructorDecl_return genericMethodOrConstructorDecl() throws RecognitionException {
		JavaJavaParser.genericMethodOrConstructorDecl_return retval = new JavaJavaParser.genericMethodOrConstructorDecl_return();
		retval.start = input.LT(1);
		int genericMethodOrConstructorDecl_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope typeParameters108 =null;
		ParserRuleReturnScope genericMethodOrConstructorRest109 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:213:5: ( typeParameters genericMethodOrConstructorRest )
			// /media/tony/disk2/_git/cs543/JavaJava.g:213:9: typeParameters genericMethodOrConstructorRest
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1173);
			typeParameters108=typeParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters108.getTree());

			pushFollow(FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1175);
			genericMethodOrConstructorRest109=genericMethodOrConstructorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, genericMethodOrConstructorRest109.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, genericMethodOrConstructorDecl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "genericMethodOrConstructorDecl"


	public static class genericMethodOrConstructorRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "genericMethodOrConstructorRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:216:1: genericMethodOrConstructorRest : ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest );
	public final JavaJavaParser.genericMethodOrConstructorRest_return genericMethodOrConstructorRest() throws RecognitionException {
		JavaJavaParser.genericMethodOrConstructorRest_return retval = new JavaJavaParser.genericMethodOrConstructorRest_return();
		retval.start = input.LT(1);
		int genericMethodOrConstructorRest_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal111=null;
		Token Identifier112=null;
		Token Identifier114=null;
		ParserRuleReturnScope type110 =null;
		ParserRuleReturnScope methodDeclaratorRest113 =null;
		ParserRuleReturnScope constructorDeclaratorRest115 =null;

		Object string_literal111_tree=null;
		Object Identifier112_tree=null;
		Object Identifier114_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:217:5: ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Identifier) ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1==Identifier||LA43_1==43||LA43_1==49||LA43_1==55) ) {
					alt43=1;
				}
				else if ( (LA43_1==32) ) {
					alt43=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA43_0==60||LA43_0==62||LA43_0==65||LA43_0==70||LA43_0==76||LA43_0==82||LA43_0==84||LA43_0==93||LA43_0==105) ) {
				alt43=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:217:9: ( type | 'void' ) Identifier methodDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					// /media/tony/disk2/_git/cs543/JavaJava.g:217:9: ( type | 'void' )
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==Identifier||LA42_0==60||LA42_0==62||LA42_0==65||LA42_0==70||LA42_0==76||LA42_0==82||LA42_0==84||LA42_0==93) ) {
						alt42=1;
					}
					else if ( (LA42_0==105) ) {
						alt42=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 42, 0, input);
						throw nvae;
					}

					switch (alt42) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:217:10: type
							{
							pushFollow(FOLLOW_type_in_genericMethodOrConstructorRest1199);
							type110=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type110.getTree());

							}
							break;
						case 2 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:217:17: 'void'
							{
							string_literal111=(Token)match(input,105,FOLLOW_105_in_genericMethodOrConstructorRest1203); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal111_tree = (Object)adaptor.create(string_literal111);
							adaptor.addChild(root_0, string_literal111_tree);
							}

							}
							break;

					}

					Identifier112=(Token)match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1206); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier112_tree = (Object)adaptor.create(Identifier112);
					adaptor.addChild(root_0, Identifier112_tree);
					}

					if ( state.backtracking==0 ) {if(primitive){id((Identifier112!=null?Identifier112.getText():null)); }}
					pushFollow(FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1210);
					methodDeclaratorRest113=methodDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaratorRest113.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:218:9: Identifier constructorDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					Identifier114=(Token)match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1220); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier114_tree = (Object)adaptor.create(Identifier114);
					adaptor.addChild(root_0, Identifier114_tree);
					}

					if ( state.backtracking==0 ) {id((Identifier114!=null?Identifier114.getText():null)); methodName = (Identifier114!=null?Identifier114.getText():null);}
					pushFollow(FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1224);
					constructorDeclaratorRest115=constructorDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorDeclaratorRest115.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, genericMethodOrConstructorRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "genericMethodOrConstructorRest"


	public static class methodDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:221:1: methodDeclaration : Identifier methodDeclaratorRest ;
	public final JavaJavaParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
		JavaJavaParser.methodDeclaration_return retval = new JavaJavaParser.methodDeclaration_return();
		retval.start = input.LT(1);
		int methodDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier116=null;
		ParserRuleReturnScope methodDeclaratorRest117 =null;

		Object Identifier116_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:222:5: ( Identifier methodDeclaratorRest )
			// /media/tony/disk2/_git/cs543/JavaJava.g:222:9: Identifier methodDeclaratorRest
			{
			root_0 = (Object)adaptor.nil();


			Identifier116=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1243); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier116_tree = (Object)adaptor.create(Identifier116);
			adaptor.addChild(root_0, Identifier116_tree);
			}

			if ( state.backtracking==0 ) {// System.out.println("Method=" + (Identifier116!=null?Identifier116.getText():null)); 
			                     inMethod = true;
			                     methodName = (Identifier116!=null?Identifier116.getText():null);
			                    // if(primitive){
			                         id((Identifier116!=null?Identifier116.getText():null));
			                         primitive=false;
			                    // }
			                   }
			pushFollow(FOLLOW_methodDeclaratorRest_in_methodDeclaration1247);
			methodDeclaratorRest117=methodDeclaratorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaratorRest117.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, methodDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodDeclaration"


	public static class fieldDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fieldDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:232:1: fieldDeclaration : variableDeclarators ';' ;
	public final JavaJavaParser.fieldDeclaration_return fieldDeclaration() throws RecognitionException {
		JavaJavaParser.fieldDeclaration_return retval = new JavaJavaParser.fieldDeclaration_return();
		retval.start = input.LT(1);
		int fieldDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal119=null;
		ParserRuleReturnScope variableDeclarators118 =null;

		Object char_literal119_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:233:5: ( variableDeclarators ';' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:233:8: variableDeclarators ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableDeclarators_in_fieldDeclaration1265);
			variableDeclarators118=variableDeclarators();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarators118.getTree());

			char_literal119=(Token)match(input,48,FOLLOW_48_in_fieldDeclaration1267); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal119_tree = (Object)adaptor.create(char_literal119);
			adaptor.addChild(root_0, char_literal119_tree);
			}

			if ( state.backtracking==0 ) {primitive=false; inMethod=false; s(";");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, fieldDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fieldDeclaration"


	public static class interfaceBodyDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceBodyDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:236:1: interfaceBodyDeclaration : ( modifiers interfaceMemberDecl | ';' );
	public final JavaJavaParser.interfaceBodyDeclaration_return interfaceBodyDeclaration() throws RecognitionException {
		JavaJavaParser.interfaceBodyDeclaration_return retval = new JavaJavaParser.interfaceBodyDeclaration_return();
		retval.start = input.LT(1);
		int interfaceBodyDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal122=null;
		ParserRuleReturnScope modifiers120 =null;
		ParserRuleReturnScope interfaceMemberDecl121 =null;

		Object char_literal122_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:237:5: ( modifiers interfaceMemberDecl | ';' )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==ENUM||LA44_0==Identifier||LA44_0==49||LA44_0==54||(LA44_0 >= 59 && LA44_0 <= 60)||LA44_0==62||(LA44_0 >= 65 && LA44_0 <= 66)||LA44_0==70||LA44_0==74||LA44_0==76||(LA44_0 >= 82 && LA44_0 <= 85)||(LA44_0 >= 89 && LA44_0 <= 91)||(LA44_0 >= 93 && LA44_0 <= 95)||LA44_0==98||LA44_0==102||(LA44_0 >= 105 && LA44_0 <= 106)) ) {
				alt44=1;
			}
			else if ( (LA44_0==48) ) {
				alt44=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:237:9: modifiers interfaceMemberDecl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_modifiers_in_interfaceBodyDeclaration1295);
					modifiers120=modifiers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers120.getTree());

					pushFollow(FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1297);
					interfaceMemberDecl121=interfaceMemberDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMemberDecl121.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:238:9: ';'
					{
					root_0 = (Object)adaptor.nil();


					char_literal122=(Token)match(input,48,FOLLOW_48_in_interfaceBodyDeclaration1307); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal122_tree = (Object)adaptor.create(char_literal122);
					adaptor.addChild(root_0, char_literal122_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, interfaceBodyDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceBodyDeclaration"


	public static class interfaceMemberDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceMemberDecl"
	// /media/tony/disk2/_git/cs543/JavaJava.g:241:1: interfaceMemberDecl : ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration );
	public final JavaJavaParser.interfaceMemberDecl_return interfaceMemberDecl() throws RecognitionException {
		JavaJavaParser.interfaceMemberDecl_return retval = new JavaJavaParser.interfaceMemberDecl_return();
		retval.start = input.LT(1);
		int interfaceMemberDecl_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal125=null;
		Token Identifier126=null;
		ParserRuleReturnScope interfaceMethodOrFieldDecl123 =null;
		ParserRuleReturnScope interfaceGenericMethodDecl124 =null;
		ParserRuleReturnScope voidInterfaceMethodDeclaratorRest127 =null;
		ParserRuleReturnScope interfaceDeclaration128 =null;
		ParserRuleReturnScope classDeclaration129 =null;

		Object string_literal125_tree=null;
		Object Identifier126_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:242:5: ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration )
			int alt45=5;
			switch ( input.LA(1) ) {
			case Identifier:
			case 60:
			case 62:
			case 65:
			case 70:
			case 76:
			case 82:
			case 84:
			case 93:
				{
				alt45=1;
				}
				break;
			case 49:
				{
				alt45=2;
				}
				break;
			case 105:
				{
				alt45=3;
				}
				break;
			case 54:
			case 83:
				{
				alt45=4;
				}
				break;
			case ENUM:
			case 66:
				{
				alt45=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:242:9: interfaceMethodOrFieldDecl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1326);
					interfaceMethodOrFieldDecl123=interfaceMethodOrFieldDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodOrFieldDecl123.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:243:9: interfaceGenericMethodDecl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1336);
					interfaceGenericMethodDecl124=interfaceGenericMethodDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceGenericMethodDecl124.getTree());

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:244:9: 'void' Identifier voidInterfaceMethodDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					string_literal125=(Token)match(input,105,FOLLOW_105_in_interfaceMemberDecl1346); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal125_tree = (Object)adaptor.create(string_literal125);
					adaptor.addChild(root_0, string_literal125_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("void");}
					Identifier126=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMemberDecl1349); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier126_tree = (Object)adaptor.create(Identifier126);
					adaptor.addChild(root_0, Identifier126_tree);
					}

					if ( state.backtracking==0 ) { id((Identifier126!=null?Identifier126.getText():null));  methodName = (Identifier126!=null?Identifier126.getText():null);}
					pushFollow(FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1353);
					voidInterfaceMethodDeclaratorRest127=voidInterfaceMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, voidInterfaceMethodDeclaratorRest127.getTree());

					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:245:9: interfaceDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_interfaceMemberDecl1363);
					interfaceDeclaration128=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration128.getTree());

					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:246:9: classDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_interfaceMemberDecl1373);
					classDeclaration129=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration129.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, interfaceMemberDecl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceMemberDecl"


	public static class interfaceMethodOrFieldDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceMethodOrFieldDecl"
	// /media/tony/disk2/_git/cs543/JavaJava.g:249:1: interfaceMethodOrFieldDecl : type Identifier interfaceMethodOrFieldRest ;
	public final JavaJavaParser.interfaceMethodOrFieldDecl_return interfaceMethodOrFieldDecl() throws RecognitionException {
		JavaJavaParser.interfaceMethodOrFieldDecl_return retval = new JavaJavaParser.interfaceMethodOrFieldDecl_return();
		retval.start = input.LT(1);
		int interfaceMethodOrFieldDecl_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier131=null;
		ParserRuleReturnScope type130 =null;
		ParserRuleReturnScope interfaceMethodOrFieldRest132 =null;

		Object Identifier131_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:250:5: ( type Identifier interfaceMethodOrFieldRest )
			// /media/tony/disk2/_git/cs543/JavaJava.g:250:9: type Identifier interfaceMethodOrFieldRest
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_interfaceMethodOrFieldDecl1396);
			type130=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type130.getTree());

			Identifier131=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodOrFieldDecl1398); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier131_tree = (Object)adaptor.create(Identifier131);
			adaptor.addChild(root_0, Identifier131_tree);
			}

			if ( state.backtracking==0 ) { id((Identifier131!=null?Identifier131.getText():null));}
			pushFollow(FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl1402);
			interfaceMethodOrFieldRest132=interfaceMethodOrFieldRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodOrFieldRest132.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, interfaceMethodOrFieldDecl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceMethodOrFieldDecl"


	public static class interfaceMethodOrFieldRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceMethodOrFieldRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:253:1: interfaceMethodOrFieldRest : ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest );
	public final JavaJavaParser.interfaceMethodOrFieldRest_return interfaceMethodOrFieldRest() throws RecognitionException {
		JavaJavaParser.interfaceMethodOrFieldRest_return retval = new JavaJavaParser.interfaceMethodOrFieldRest_return();
		retval.start = input.LT(1);
		int interfaceMethodOrFieldRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal134=null;
		ParserRuleReturnScope constantDeclaratorsRest133 =null;
		ParserRuleReturnScope interfaceMethodDeclaratorRest135 =null;

		Object char_literal134_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:254:5: ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==50||LA46_0==55) ) {
				alt46=1;
			}
			else if ( (LA46_0==32) ) {
				alt46=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:254:9: constantDeclaratorsRest ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest1426);
					constantDeclaratorsRest133=constantDeclaratorsRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaratorsRest133.getTree());

					char_literal134=(Token)match(input,48,FOLLOW_48_in_interfaceMethodOrFieldRest1428); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal134_tree = (Object)adaptor.create(char_literal134);
					adaptor.addChild(root_0, char_literal134_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:255:9: interfaceMethodDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest1440);
					interfaceMethodDeclaratorRest135=interfaceMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaratorRest135.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, interfaceMethodOrFieldRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceMethodOrFieldRest"


	public static class methodDeclaratorRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodDeclaratorRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:258:1: methodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
	public final JavaJavaParser.methodDeclaratorRest_return methodDeclaratorRest() throws RecognitionException {
		JavaJavaParser.methodDeclaratorRest_return retval = new JavaJavaParser.methodDeclaratorRest_return();
		retval.start = input.LT(1);
		int methodDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal137=null;
		Token char_literal138=null;
		Token string_literal139=null;
		Token char_literal142=null;
		ParserRuleReturnScope formalParameters136 =null;
		ParserRuleReturnScope qualifiedNameList140 =null;
		ParserRuleReturnScope methodBody141 =null;

		Object char_literal137_tree=null;
		Object char_literal138_tree=null;
		Object string_literal139_tree=null;
		Object char_literal142_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:259:5: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
			// /media/tony/disk2/_git/cs543/JavaJava.g:259:9: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_formalParameters_in_methodDeclaratorRest1463);
			formalParameters136=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters136.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:259:26: ( '[' ']' )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==55) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:259:27: '[' ']'
					{
					char_literal137=(Token)match(input,55,FOLLOW_55_in_methodDeclaratorRest1466); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal137_tree = (Object)adaptor.create(char_literal137);
					adaptor.addChild(root_0, char_literal137_tree);
					}

					if ( state.backtracking==0 ) {s("[");}
					char_literal138=(Token)match(input,56,FOLLOW_56_in_methodDeclaratorRest1470); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal138_tree = (Object)adaptor.create(char_literal138);
					adaptor.addChild(root_0, char_literal138_tree);
					}

					if ( state.backtracking==0 ) {s("]");}
					}
					break;

				default :
					break loop47;
				}
			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:260:9: ( 'throws' qualifiedNameList )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==101) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:260:10: 'throws' qualifiedNameList
					{
					string_literal139=(Token)match(input,101,FOLLOW_101_in_methodDeclaratorRest1484); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal139_tree = (Object)adaptor.create(string_literal139);
					adaptor.addChild(root_0, string_literal139_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");}
					pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaratorRest1488);
					qualifiedNameList140=qualifiedNameList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList140.getTree());

					}
					break;

			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:261:9: ( methodBody | ';' )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==108) ) {
				alt49=1;
			}
			else if ( (LA49_0==48) ) {
				alt49=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:261:13: methodBody
					{
					pushFollow(FOLLOW_methodBody_in_methodDeclaratorRest1504);
					methodBody141=methodBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody141.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:262:13: ';'
					{
					char_literal142=(Token)match(input,48,FOLLOW_48_in_methodDeclaratorRest1518); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal142_tree = (Object)adaptor.create(char_literal142);
					adaptor.addChild(root_0, char_literal142_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, methodDeclaratorRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodDeclaratorRest"


	public static class voidMethodDeclaratorRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "voidMethodDeclaratorRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:266:1: voidMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
	public final JavaJavaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest() throws RecognitionException {
		JavaJavaParser.voidMethodDeclaratorRest_return retval = new JavaJavaParser.voidMethodDeclaratorRest_return();
		retval.start = input.LT(1);
		int voidMethodDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal144=null;
		Token char_literal147=null;
		ParserRuleReturnScope formalParameters143 =null;
		ParserRuleReturnScope qualifiedNameList145 =null;
		ParserRuleReturnScope methodBody146 =null;

		Object string_literal144_tree=null;
		Object char_literal147_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:267:5: ( formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
			// /media/tony/disk2/_git/cs543/JavaJava.g:267:9: formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest1551);
			formalParameters143=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters143.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:267:26: ( 'throws' qualifiedNameList )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==101) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:267:27: 'throws' qualifiedNameList
					{
					string_literal144=(Token)match(input,101,FOLLOW_101_in_voidMethodDeclaratorRest1554); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal144_tree = (Object)adaptor.create(string_literal144);
					adaptor.addChild(root_0, string_literal144_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");}
					pushFollow(FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1557);
					qualifiedNameList145=qualifiedNameList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList145.getTree());

					}
					break;

			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:268:9: ( methodBody | ';' )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==108) ) {
				alt51=1;
			}
			else if ( (LA51_0==48) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:268:13: methodBody
					{
					pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest1573);
					methodBody146=methodBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody146.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:269:13: ';'
					{
					char_literal147=(Token)match(input,48,FOLLOW_48_in_voidMethodDeclaratorRest1587); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal147_tree = (Object)adaptor.create(char_literal147);
					adaptor.addChild(root_0, char_literal147_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, voidMethodDeclaratorRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "voidMethodDeclaratorRest"


	public static class interfaceMethodDeclaratorRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceMethodDeclaratorRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:273:1: interfaceMethodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' ;
	public final JavaJavaParser.interfaceMethodDeclaratorRest_return interfaceMethodDeclaratorRest() throws RecognitionException {
		JavaJavaParser.interfaceMethodDeclaratorRest_return retval = new JavaJavaParser.interfaceMethodDeclaratorRest_return();
		retval.start = input.LT(1);
		int interfaceMethodDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal149=null;
		Token char_literal150=null;
		Token string_literal151=null;
		Token char_literal153=null;
		ParserRuleReturnScope formalParameters148 =null;
		ParserRuleReturnScope qualifiedNameList152 =null;

		Object char_literal149_tree=null;
		Object char_literal150_tree=null;
		Object string_literal151_tree=null;
		Object char_literal153_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:274:5: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:274:8: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest1621);
			formalParameters148=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters148.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:274:25: ( '[' ']' )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==55) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:274:26: '[' ']'
					{
					char_literal149=(Token)match(input,55,FOLLOW_55_in_interfaceMethodDeclaratorRest1624); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal149_tree = (Object)adaptor.create(char_literal149);
					adaptor.addChild(root_0, char_literal149_tree);
					}

					if ( state.backtracking==0 ) {s("[");}
					char_literal150=(Token)match(input,56,FOLLOW_56_in_interfaceMethodDeclaratorRest1628); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal150_tree = (Object)adaptor.create(char_literal150);
					adaptor.addChild(root_0, char_literal150_tree);
					}

					if ( state.backtracking==0 ) {s("]");}
					}
					break;

				default :
					break loop52;
				}
			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:274:56: ( 'throws' qualifiedNameList )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==101) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:274:57: 'throws' qualifiedNameList
					{
					string_literal151=(Token)match(input,101,FOLLOW_101_in_interfaceMethodDeclaratorRest1635); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal151_tree = (Object)adaptor.create(string_literal151);
					adaptor.addChild(root_0, string_literal151_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");}
					pushFollow(FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest1638);
					qualifiedNameList152=qualifiedNameList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList152.getTree());

					}
					break;

			}

			char_literal153=(Token)match(input,48,FOLLOW_48_in_interfaceMethodDeclaratorRest1642); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal153_tree = (Object)adaptor.create(char_literal153);
			adaptor.addChild(root_0, char_literal153_tree);
			}

			if ( state.backtracking==0 ) {s(";");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, interfaceMethodDeclaratorRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceMethodDeclaratorRest"


	public static class interfaceGenericMethodDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceGenericMethodDecl"
	// /media/tony/disk2/_git/cs543/JavaJava.g:277:1: interfaceGenericMethodDecl : typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest ;
	public final JavaJavaParser.interfaceGenericMethodDecl_return interfaceGenericMethodDecl() throws RecognitionException {
		JavaJavaParser.interfaceGenericMethodDecl_return retval = new JavaJavaParser.interfaceGenericMethodDecl_return();
		retval.start = input.LT(1);
		int interfaceGenericMethodDecl_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal156=null;
		Token Identifier157=null;
		ParserRuleReturnScope typeParameters154 =null;
		ParserRuleReturnScope type155 =null;
		ParserRuleReturnScope interfaceMethodDeclaratorRest158 =null;

		Object string_literal156_tree=null;
		Object Identifier157_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:278:5: ( typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest )
			// /media/tony/disk2/_git/cs543/JavaJava.g:278:9: typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_typeParameters_in_interfaceGenericMethodDecl1667);
			typeParameters154=typeParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters154.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:278:24: ( type | 'void' )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==Identifier||LA54_0==60||LA54_0==62||LA54_0==65||LA54_0==70||LA54_0==76||LA54_0==82||LA54_0==84||LA54_0==93) ) {
				alt54=1;
			}
			else if ( (LA54_0==105) ) {
				alt54=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:278:25: type
					{
					pushFollow(FOLLOW_type_in_interfaceGenericMethodDecl1670);
					type155=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type155.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:278:32: 'void'
					{
					string_literal156=(Token)match(input,105,FOLLOW_105_in_interfaceGenericMethodDecl1674); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal156_tree = (Object)adaptor.create(string_literal156);
					adaptor.addChild(root_0, string_literal156_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("void");}
					}
					break;

			}

			Identifier157=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceGenericMethodDecl1679); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier157_tree = (Object)adaptor.create(Identifier157);
			adaptor.addChild(root_0, Identifier157_tree);
			}

			if ( state.backtracking==0 ) {if(primitive) id((Identifier157!=null?Identifier157.getText():null));}
			pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl1691);
			interfaceMethodDeclaratorRest158=interfaceMethodDeclaratorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaratorRest158.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, interfaceGenericMethodDecl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceGenericMethodDecl"


	public static class voidInterfaceMethodDeclaratorRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "voidInterfaceMethodDeclaratorRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:282:1: voidInterfaceMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ';' ;
	public final JavaJavaParser.voidInterfaceMethodDeclaratorRest_return voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		JavaJavaParser.voidInterfaceMethodDeclaratorRest_return retval = new JavaJavaParser.voidInterfaceMethodDeclaratorRest_return();
		retval.start = input.LT(1);
		int voidInterfaceMethodDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal160=null;
		Token char_literal162=null;
		ParserRuleReturnScope formalParameters159 =null;
		ParserRuleReturnScope qualifiedNameList161 =null;

		Object string_literal160_tree=null;
		Object char_literal162_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:283:5: ( formalParameters ( 'throws' qualifiedNameList )? ';' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:283:8: formalParameters ( 'throws' qualifiedNameList )? ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest1713);
			formalParameters159=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters159.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:283:25: ( 'throws' qualifiedNameList )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==101) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:283:26: 'throws' qualifiedNameList
					{
					string_literal160=(Token)match(input,101,FOLLOW_101_in_voidInterfaceMethodDeclaratorRest1716); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal160_tree = (Object)adaptor.create(string_literal160);
					adaptor.addChild(root_0, string_literal160_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");}
					pushFollow(FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest1719);
					qualifiedNameList161=qualifiedNameList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList161.getTree());

					}
					break;

			}

			char_literal162=(Token)match(input,48,FOLLOW_48_in_voidInterfaceMethodDeclaratorRest1723); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal162_tree = (Object)adaptor.create(char_literal162);
			adaptor.addChild(root_0, char_literal162_tree);
			}

			if ( state.backtracking==0 ) {s(";");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, voidInterfaceMethodDeclaratorRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "voidInterfaceMethodDeclaratorRest"


	public static class constructorDeclaratorRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constructorDeclaratorRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:286:1: constructorDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? constructorBody ;
	public final JavaJavaParser.constructorDeclaratorRest_return constructorDeclaratorRest() throws RecognitionException {
		JavaJavaParser.constructorDeclaratorRest_return retval = new JavaJavaParser.constructorDeclaratorRest_return();
		retval.start = input.LT(1);
		int constructorDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal164=null;
		ParserRuleReturnScope formalParameters163 =null;
		ParserRuleReturnScope qualifiedNameList165 =null;
		ParserRuleReturnScope constructorBody166 =null;

		Object string_literal164_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:287:5: ( formalParameters ( 'throws' qualifiedNameList )? constructorBody )
			// /media/tony/disk2/_git/cs543/JavaJava.g:287:9: formalParameters ( 'throws' qualifiedNameList )? constructorBody
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_formalParameters_in_constructorDeclaratorRest1748);
			formalParameters163=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters163.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:287:26: ( 'throws' qualifiedNameList )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==101) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:287:27: 'throws' qualifiedNameList
					{
					string_literal164=(Token)match(input,101,FOLLOW_101_in_constructorDeclaratorRest1751); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal164_tree = (Object)adaptor.create(string_literal164);
					adaptor.addChild(root_0, string_literal164_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");}
					pushFollow(FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1755);
					qualifiedNameList165=qualifiedNameList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList165.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_constructorBody_in_constructorDeclaratorRest1759);
			constructorBody166=constructorBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorBody166.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, constructorDeclaratorRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constructorDeclaratorRest"


	public static class constantDeclarator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantDeclarator"
	// /media/tony/disk2/_git/cs543/JavaJava.g:290:1: constantDeclarator : Identifier constantDeclaratorRest ;
	public final JavaJavaParser.constantDeclarator_return constantDeclarator() throws RecognitionException {
		JavaJavaParser.constantDeclarator_return retval = new JavaJavaParser.constantDeclarator_return();
		retval.start = input.LT(1);
		int constantDeclarator_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier167=null;
		ParserRuleReturnScope constantDeclaratorRest168 =null;

		Object Identifier167_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:291:5: ( Identifier constantDeclaratorRest )
			// /media/tony/disk2/_git/cs543/JavaJava.g:291:9: Identifier constantDeclaratorRest
			{
			root_0 = (Object)adaptor.nil();


			Identifier167=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantDeclarator1778); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier167_tree = (Object)adaptor.create(Identifier167);
			adaptor.addChild(root_0, Identifier167_tree);
			}

			if ( state.backtracking==0 ) {if(primitive && !inMethod) {id((Identifier167!=null?Identifier167.getText():null)); /*JavaMetrics.ssc.push(new Symbol((Identifier167!=null?Identifier167.getText():null), PrimitiveType, className)); */}}
			pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclarator1782);
			constantDeclaratorRest168=constantDeclaratorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaratorRest168.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, constantDeclarator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constantDeclarator"


	public static class variableDeclarators_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarators"
	// /media/tony/disk2/_git/cs543/JavaJava.g:294:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* ;
	public final JavaJavaParser.variableDeclarators_return variableDeclarators() throws RecognitionException {
		JavaJavaParser.variableDeclarators_return retval = new JavaJavaParser.variableDeclarators_return();
		retval.start = input.LT(1);
		int variableDeclarators_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal170=null;
		ParserRuleReturnScope variableDeclarator169 =null;
		ParserRuleReturnScope variableDeclarator171 =null;

		Object char_literal170_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:295:5: ( variableDeclarator ( ',' variableDeclarator )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:295:9: variableDeclarator ( ',' variableDeclarator )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1805);
			variableDeclarator169=variableDeclarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator169.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:295:28: ( ',' variableDeclarator )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==39) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:295:29: ',' variableDeclarator
					{
					char_literal170=(Token)match(input,39,FOLLOW_39_in_variableDeclarators1808); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal170_tree = (Object)adaptor.create(char_literal170);
					adaptor.addChild(root_0, char_literal170_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1812);
					variableDeclarator171=variableDeclarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator171.getTree());

					}
					break;

				default :
					break loop57;
				}
			}

			if ( state.backtracking==0 ) {primitive=false;}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, variableDeclarators_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarators"


	public static class variableDeclarator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarator"
	// /media/tony/disk2/_git/cs543/JavaJava.g:298:1: variableDeclarator : variableDeclaratorId ( '=' variableInitializer )? ;
	public final JavaJavaParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
		JavaJavaParser.variableDeclarator_return retval = new JavaJavaParser.variableDeclarator_return();
		retval.start = input.LT(1);
		int variableDeclarator_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal173=null;
		ParserRuleReturnScope variableDeclaratorId172 =null;
		ParserRuleReturnScope variableInitializer174 =null;

		Object char_literal173_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:299:5: ( variableDeclaratorId ( '=' variableInitializer )? )
			// /media/tony/disk2/_git/cs543/JavaJava.g:299:9: variableDeclaratorId ( '=' variableInitializer )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator1835);
			variableDeclaratorId172=variableDeclaratorId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId172.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:299:30: ( '=' variableInitializer )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==50) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:299:31: '=' variableInitializer
					{
					char_literal173=(Token)match(input,50,FOLLOW_50_in_variableDeclarator1838); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal173_tree = (Object)adaptor.create(char_literal173);
					adaptor.addChild(root_0, char_literal173_tree);
					}

					pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1840);
					variableInitializer174=variableInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer174.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, variableDeclarator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarator"


	public static class constantDeclaratorsRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantDeclaratorsRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:302:1: constantDeclaratorsRest : constantDeclaratorRest ( ',' constantDeclarator )* ;
	public final JavaJavaParser.constantDeclaratorsRest_return constantDeclaratorsRest() throws RecognitionException {
		JavaJavaParser.constantDeclaratorsRest_return retval = new JavaJavaParser.constantDeclaratorsRest_return();
		retval.start = input.LT(1);
		int constantDeclaratorsRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal176=null;
		ParserRuleReturnScope constantDeclaratorRest175 =null;
		ParserRuleReturnScope constantDeclarator177 =null;

		Object char_literal176_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:303:5: ( constantDeclaratorRest ( ',' constantDeclarator )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:303:9: constantDeclaratorRest ( ',' constantDeclarator )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1865);
			constantDeclaratorRest175=constantDeclaratorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaratorRest175.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:303:32: ( ',' constantDeclarator )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==39) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:303:33: ',' constantDeclarator
					{
					char_literal176=(Token)match(input,39,FOLLOW_39_in_constantDeclaratorsRest1868); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal176_tree = (Object)adaptor.create(char_literal176);
					adaptor.addChild(root_0, char_literal176_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_constantDeclarator_in_constantDeclaratorsRest1872);
					constantDeclarator177=constantDeclarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclarator177.getTree());

					}
					break;

				default :
					break loop59;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, constantDeclaratorsRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constantDeclaratorsRest"


	public static class constantDeclaratorRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantDeclaratorRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:306:1: constantDeclaratorRest : ( '[' ']' )* '=' variableInitializer ;
	public final JavaJavaParser.constantDeclaratorRest_return constantDeclaratorRest() throws RecognitionException {
		JavaJavaParser.constantDeclaratorRest_return retval = new JavaJavaParser.constantDeclaratorRest_return();
		retval.start = input.LT(1);
		int constantDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal178=null;
		Token char_literal179=null;
		Token char_literal180=null;
		ParserRuleReturnScope variableInitializer181 =null;

		Object char_literal178_tree=null;
		Object char_literal179_tree=null;
		Object char_literal180_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:307:5: ( ( '[' ']' )* '=' variableInitializer )
			// /media/tony/disk2/_git/cs543/JavaJava.g:307:9: ( '[' ']' )* '=' variableInitializer
			{
			root_0 = (Object)adaptor.nil();


			// /media/tony/disk2/_git/cs543/JavaJava.g:307:9: ( '[' ']' )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==55) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:307:10: '[' ']'
					{
					char_literal178=(Token)match(input,55,FOLLOW_55_in_constantDeclaratorRest1894); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal178_tree = (Object)adaptor.create(char_literal178);
					adaptor.addChild(root_0, char_literal178_tree);
					}

					if ( state.backtracking==0 ) {s("[");}
					char_literal179=(Token)match(input,56,FOLLOW_56_in_constantDeclaratorRest1898); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal179_tree = (Object)adaptor.create(char_literal179);
					adaptor.addChild(root_0, char_literal179_tree);
					}

					if ( state.backtracking==0 ) {s("]");}
					}
					break;

				default :
					break loop60;
				}
			}

			char_literal180=(Token)match(input,50,FOLLOW_50_in_constantDeclaratorRest1905); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal180_tree = (Object)adaptor.create(char_literal180);
			adaptor.addChild(root_0, char_literal180_tree);
			}

			pushFollow(FOLLOW_variableInitializer_in_constantDeclaratorRest1907);
			variableInitializer181=variableInitializer();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer181.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, constantDeclaratorRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constantDeclaratorRest"


	public static class variableDeclaratorId_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaratorId"
	// /media/tony/disk2/_git/cs543/JavaJava.g:310:1: variableDeclaratorId : Identifier ( '[' ']' ) ;
	public final JavaJavaParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
		JavaJavaParser.variableDeclaratorId_return retval = new JavaJavaParser.variableDeclaratorId_return();
		retval.start = input.LT(1);
		int variableDeclaratorId_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier182=null;
		Token char_literal183=null;
		Token char_literal184=null;

		Object Identifier182_tree=null;
		Object char_literal183_tree=null;
		Object char_literal184_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:311:5: ( Identifier ( '[' ']' ) )
			// /media/tony/disk2/_git/cs543/JavaJava.g:311:9: Identifier ( '[' ']' )
			{
			root_0 = (Object)adaptor.nil();


			Identifier182=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaratorId1929); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier182_tree = (Object)adaptor.create(Identifier182);
			adaptor.addChild(root_0, Identifier182_tree);
			}

			if ( state.backtracking==0 ) {if(!inMethod) 
			                       {
			                       	identcount++;
			                        //id(new Symbol((Identifier182!=null?Identifier182.getText():null),PrimitiveType, className)); 
			                        // JavaMetrics.ssc.push(new Symbol((Identifier182!=null?Identifier182.getText():null),"unknown", className));
			                        }
			                      else if(inMethod) {
			                       		identcount++;
			                       		//id(new Symbol((Identifier182!=null?Identifier182.getText():null),PrimitiveType, methodName)); 
			                         //	JavaMetrics.ssm.push(new Symbol((Identifier182!=null?Identifier182.getText():null),"unknown", methodName)); 
			                                         
			                      }
			                    }
			// /media/tony/disk2/_git/cs543/JavaJava.g:323:23: ( '[' ']' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:323:24: '[' ']'
			{
			char_literal183=(Token)match(input,55,FOLLOW_55_in_variableDeclaratorId1935); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal183_tree = (Object)adaptor.create(char_literal183);
			adaptor.addChild(root_0, char_literal183_tree);
			}

			if ( state.backtracking==0 ) {s("[");}
			char_literal184=(Token)match(input,56,FOLLOW_56_in_variableDeclaratorId1938); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal184_tree = (Object)adaptor.create(char_literal184);
			adaptor.addChild(root_0, char_literal184_tree);
			}

			if ( state.backtracking==0 ) {s("]");}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, variableDeclaratorId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaratorId"


	public static class variableInitializer_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableInitializer"
	// /media/tony/disk2/_git/cs543/JavaJava.g:326:1: variableInitializer : ( arrayInitializer | expression );
	public final JavaJavaParser.variableInitializer_return variableInitializer() throws RecognitionException {
		JavaJavaParser.variableInitializer_return retval = new JavaJavaParser.variableInitializer_return();
		retval.start = input.LT(1);
		int variableInitializer_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope arrayInitializer185 =null;
		ParserRuleReturnScope expression186 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:327:5: ( arrayInitializer | expression )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==108) ) {
				alt61=1;
			}
			else if ( ((LA61_0 >= CharacterLiteral && LA61_0 <= DecimalLiteral)||LA61_0==FloatingPointLiteral||(LA61_0 >= HexLiteral && LA61_0 <= Identifier)||(LA61_0 >= OctalLiteral && LA61_0 <= StringLiteral)||LA61_0==25||LA61_0==32||(LA61_0 >= 36 && LA61_0 <= 37)||(LA61_0 >= 40 && LA61_0 <= 41)||LA61_0==60||LA61_0==62||LA61_0==65||LA61_0==70||LA61_0==73||LA61_0==76||LA61_0==82||LA61_0==84||(LA61_0 >= 86 && LA61_0 <= 87)||LA61_0==93||LA61_0==96||LA61_0==99||LA61_0==103||LA61_0==105||LA61_0==113) ) {
				alt61=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:327:9: arrayInitializer
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1960);
					arrayInitializer185=arrayInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer185.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:328:9: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_variableInitializer1970);
					expression186=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression186.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, variableInitializer_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableInitializer"


	public static class arrayInitializer_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayInitializer"
	// /media/tony/disk2/_git/cs543/JavaJava.g:331:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' ;
	public final JavaJavaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
		JavaJavaParser.arrayInitializer_return retval = new JavaJavaParser.arrayInitializer_return();
		retval.start = input.LT(1);
		int arrayInitializer_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal187=null;
		Token char_literal189=null;
		Token char_literal191=null;
		Token char_literal192=null;
		ParserRuleReturnScope variableInitializer188 =null;
		ParserRuleReturnScope variableInitializer190 =null;

		Object char_literal187_tree=null;
		Object char_literal189_tree=null;
		Object char_literal191_tree=null;
		Object char_literal192_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:332:5: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:332:9: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal187=(Token)match(input,108,FOLLOW_108_in_arrayInitializer1997); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal187_tree = (Object)adaptor.create(char_literal187);
			adaptor.addChild(root_0, char_literal187_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:332:22: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( ((LA64_0 >= CharacterLiteral && LA64_0 <= DecimalLiteral)||LA64_0==FloatingPointLiteral||(LA64_0 >= HexLiteral && LA64_0 <= Identifier)||(LA64_0 >= OctalLiteral && LA64_0 <= StringLiteral)||LA64_0==25||LA64_0==32||(LA64_0 >= 36 && LA64_0 <= 37)||(LA64_0 >= 40 && LA64_0 <= 41)||LA64_0==60||LA64_0==62||LA64_0==65||LA64_0==70||LA64_0==73||LA64_0==76||LA64_0==82||LA64_0==84||(LA64_0 >= 86 && LA64_0 <= 87)||LA64_0==93||LA64_0==96||LA64_0==99||LA64_0==103||LA64_0==105||LA64_0==108||LA64_0==113) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:332:23: variableInitializer ( ',' variableInitializer )* ( ',' )?
					{
					pushFollow(FOLLOW_variableInitializer_in_arrayInitializer2001);
					variableInitializer188=variableInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer188.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:332:43: ( ',' variableInitializer )*
					loop62:
					while (true) {
						int alt62=2;
						int LA62_0 = input.LA(1);
						if ( (LA62_0==39) ) {
							int LA62_1 = input.LA(2);
							if ( ((LA62_1 >= CharacterLiteral && LA62_1 <= DecimalLiteral)||LA62_1==FloatingPointLiteral||(LA62_1 >= HexLiteral && LA62_1 <= Identifier)||(LA62_1 >= OctalLiteral && LA62_1 <= StringLiteral)||LA62_1==25||LA62_1==32||(LA62_1 >= 36 && LA62_1 <= 37)||(LA62_1 >= 40 && LA62_1 <= 41)||LA62_1==60||LA62_1==62||LA62_1==65||LA62_1==70||LA62_1==73||LA62_1==76||LA62_1==82||LA62_1==84||(LA62_1 >= 86 && LA62_1 <= 87)||LA62_1==93||LA62_1==96||LA62_1==99||LA62_1==103||LA62_1==105||LA62_1==108||LA62_1==113) ) {
								alt62=1;
							}

						}

						switch (alt62) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:332:44: ',' variableInitializer
							{
							char_literal189=(Token)match(input,39,FOLLOW_39_in_arrayInitializer2004); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal189_tree = (Object)adaptor.create(char_literal189);
							adaptor.addChild(root_0, char_literal189_tree);
							}

							if ( state.backtracking==0 ) {s(",");}
							pushFollow(FOLLOW_variableInitializer_in_arrayInitializer2008);
							variableInitializer190=variableInitializer();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer190.getTree());

							}
							break;

						default :
							break loop62;
						}
					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:332:80: ( ',' )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==39) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:332:81: ','
							{
							char_literal191=(Token)match(input,39,FOLLOW_39_in_arrayInitializer2013); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal191_tree = (Object)adaptor.create(char_literal191);
							adaptor.addChild(root_0, char_literal191_tree);
							}

							}
							break;

					}

					}
					break;

			}

			char_literal192=(Token)match(input,112,FOLLOW_112_in_arrayInitializer2020); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal192_tree = (Object)adaptor.create(char_literal192);
			adaptor.addChild(root_0, char_literal192_tree);
			}

			if ( state.backtracking==0 ) {s("}");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, arrayInitializer_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayInitializer"


	public static class modifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "modifier"
	// /media/tony/disk2/_git/cs543/JavaJava.g:335:1: modifier : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' );
	public final JavaJavaParser.modifier_return modifier() throws RecognitionException {
		JavaJavaParser.modifier_return retval = new JavaJavaParser.modifier_return();
		retval.start = input.LT(1);
		int modifier_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal194=null;
		Token string_literal195=null;
		Token string_literal196=null;
		Token string_literal197=null;
		Token string_literal198=null;
		Token string_literal199=null;
		Token string_literal200=null;
		Token string_literal201=null;
		Token string_literal202=null;
		Token string_literal203=null;
		Token string_literal204=null;
		ParserRuleReturnScope annotation193 =null;

		Object string_literal194_tree=null;
		Object string_literal195_tree=null;
		Object string_literal196_tree=null;
		Object string_literal197_tree=null;
		Object string_literal198_tree=null;
		Object string_literal199_tree=null;
		Object string_literal200_tree=null;
		Object string_literal201_tree=null;
		Object string_literal202_tree=null;
		Object string_literal203_tree=null;
		Object string_literal204_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:336:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )
			int alt65=12;
			switch ( input.LA(1) ) {
			case 54:
				{
				alt65=1;
				}
				break;
			case 91:
				{
				alt65=2;
				}
				break;
			case 90:
				{
				alt65=3;
				}
				break;
			case 89:
				{
				alt65=4;
				}
				break;
			case 94:
				{
				alt65=5;
				}
				break;
			case 59:
				{
				alt65=6;
				}
				break;
			case 74:
				{
				alt65=7;
				}
				break;
			case 85:
				{
				alt65=8;
				}
				break;
			case 98:
				{
				alt65=9;
				}
				break;
			case 102:
				{
				alt65=10;
				}
				break;
			case 106:
				{
				alt65=11;
				}
				break;
			case 95:
				{
				alt65=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:336:9: annotation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotation_in_modifier2040);
					annotation193=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation193.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:337:9: 'public'
					{
					root_0 = (Object)adaptor.nil();


					string_literal194=(Token)match(input,91,FOLLOW_91_in_modifier2050); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal194_tree = (Object)adaptor.create(string_literal194);
					adaptor.addChild(root_0, string_literal194_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("public");}
					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:338:9: 'protected'
					{
					root_0 = (Object)adaptor.nil();


					string_literal195=(Token)match(input,90,FOLLOW_90_in_modifier2063); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal195_tree = (Object)adaptor.create(string_literal195);
					adaptor.addChild(root_0, string_literal195_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("protected");}
					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:339:9: 'private'
					{
					root_0 = (Object)adaptor.nil();


					string_literal196=(Token)match(input,89,FOLLOW_89_in_modifier2075); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal196_tree = (Object)adaptor.create(string_literal196);
					adaptor.addChild(root_0, string_literal196_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++; JavaMetrics.uniqueKeywords.add("private");}
					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:340:9: 'static'
					{
					root_0 = (Object)adaptor.nil();


					string_literal197=(Token)match(input,94,FOLLOW_94_in_modifier2087); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal197_tree = (Object)adaptor.create(string_literal197);
					adaptor.addChild(root_0, string_literal197_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++; JavaMetrics.uniqueKeywords.add("static");}
					}
					break;
				case 6 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:341:9: 'abstract'
					{
					root_0 = (Object)adaptor.nil();


					string_literal198=(Token)match(input,59,FOLLOW_59_in_modifier2100); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal198_tree = (Object)adaptor.create(string_literal198);
					adaptor.addChild(root_0, string_literal198_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("abstract");}
					}
					break;
				case 7 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:342:9: 'final'
					{
					root_0 = (Object)adaptor.nil();


					string_literal199=(Token)match(input,74,FOLLOW_74_in_modifier2112); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal199_tree = (Object)adaptor.create(string_literal199);
					adaptor.addChild(root_0, string_literal199_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("final");}
					}
					break;
				case 8 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:343:9: 'native'
					{
					root_0 = (Object)adaptor.nil();


					string_literal200=(Token)match(input,85,FOLLOW_85_in_modifier2125); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal200_tree = (Object)adaptor.create(string_literal200);
					adaptor.addChild(root_0, string_literal200_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("native");}
					}
					break;
				case 9 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:344:9: 'synchronized'
					{
					root_0 = (Object)adaptor.nil();


					string_literal201=(Token)match(input,98,FOLLOW_98_in_modifier2140); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal201_tree = (Object)adaptor.create(string_literal201);
					adaptor.addChild(root_0, string_literal201_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("synchronized");}
					}
					break;
				case 10 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:345:9: 'transient'
					{
					root_0 = (Object)adaptor.nil();


					string_literal202=(Token)match(input,102,FOLLOW_102_in_modifier2152); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal202_tree = (Object)adaptor.create(string_literal202);
					adaptor.addChild(root_0, string_literal202_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("transient");}
					}
					break;
				case 11 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:346:9: 'volatile'
					{
					root_0 = (Object)adaptor.nil();


					string_literal203=(Token)match(input,106,FOLLOW_106_in_modifier2166); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal203_tree = (Object)adaptor.create(string_literal203);
					adaptor.addChild(root_0, string_literal203_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("volatile");}
					}
					break;
				case 12 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:347:9: 'strictfp'
					{
					root_0 = (Object)adaptor.nil();


					string_literal204=(Token)match(input,95,FOLLOW_95_in_modifier2179); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal204_tree = (Object)adaptor.create(string_literal204);
					adaptor.addChild(root_0, string_literal204_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("strictfp");}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, modifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "modifier"


	public static class packageOrTypeName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "packageOrTypeName"
	// /media/tony/disk2/_git/cs543/JavaJava.g:350:1: packageOrTypeName : qualifiedName ;
	public final JavaJavaParser.packageOrTypeName_return packageOrTypeName() throws RecognitionException {
		JavaJavaParser.packageOrTypeName_return retval = new JavaJavaParser.packageOrTypeName_return();
		retval.start = input.LT(1);
		int packageOrTypeName_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope qualifiedName205 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:351:5: ( qualifiedName )
			// /media/tony/disk2/_git/cs543/JavaJava.g:351:9: qualifiedName
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualifiedName_in_packageOrTypeName2201);
			qualifiedName205=qualifiedName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName205.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, packageOrTypeName_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "packageOrTypeName"


	public static class enumConstantName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enumConstantName"
	// /media/tony/disk2/_git/cs543/JavaJava.g:354:1: enumConstantName : Identifier ;
	public final JavaJavaParser.enumConstantName_return enumConstantName() throws RecognitionException {
		JavaJavaParser.enumConstantName_return retval = new JavaJavaParser.enumConstantName_return();
		retval.start = input.LT(1);
		int enumConstantName_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier206=null;

		Object Identifier206_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:355:5: ( Identifier )
			// /media/tony/disk2/_git/cs543/JavaJava.g:355:9: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier206=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumConstantName2220); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier206_tree = (Object)adaptor.create(Identifier206);
			adaptor.addChild(root_0, Identifier206_tree);
			}

			if ( state.backtracking==0 ) {if(primitive) id((Identifier206!=null?Identifier206.getText():null));}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, enumConstantName_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumConstantName"


	public static class typeName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeName"
	// /media/tony/disk2/_git/cs543/JavaJava.g:358:1: typeName : qualifiedName ;
	public final JavaJavaParser.typeName_return typeName() throws RecognitionException {
		JavaJavaParser.typeName_return retval = new JavaJavaParser.typeName_return();
		retval.start = input.LT(1);
		int typeName_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope qualifiedName207 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:359:5: ( qualifiedName )
			// /media/tony/disk2/_git/cs543/JavaJava.g:359:9: qualifiedName
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualifiedName_in_typeName2241);
			qualifiedName207=qualifiedName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName207.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, typeName_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeName"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /media/tony/disk2/_git/cs543/JavaJava.g:362:1: type : ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* );
	public final JavaJavaParser.type_return type() throws RecognitionException {
		JavaJavaParser.type_return retval = new JavaJavaParser.type_return();
		retval.start = input.LT(1);
		int type_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal209=null;
		Token char_literal210=null;
		Token char_literal212=null;
		Token char_literal213=null;
		ParserRuleReturnScope classOrInterfaceType208 =null;
		ParserRuleReturnScope primitiveType211 =null;

		Object char_literal209_tree=null;
		Object char_literal210_tree=null;
		Object char_literal212_tree=null;
		Object char_literal213_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:363:2: ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==Identifier) ) {
				alt68=1;
			}
			else if ( (LA68_0==60||LA68_0==62||LA68_0==65||LA68_0==70||LA68_0==76||LA68_0==82||LA68_0==84||LA68_0==93) ) {
				alt68=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:363:4: classOrInterfaceType ( '[' ']' )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classOrInterfaceType_in_type2255);
					classOrInterfaceType208=classOrInterfaceType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceType208.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:363:25: ( '[' ']' )*
					loop66:
					while (true) {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( (LA66_0==55) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:363:26: '[' ']'
							{
							char_literal209=(Token)match(input,55,FOLLOW_55_in_type2258); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal209_tree = (Object)adaptor.create(char_literal209);
							adaptor.addChild(root_0, char_literal209_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal210=(Token)match(input,56,FOLLOW_56_in_type2262); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal210_tree = (Object)adaptor.create(char_literal210);
							adaptor.addChild(root_0, char_literal210_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							break loop66;
						}
					}

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:364:4: primitiveType ( '[' ']' )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveType_in_type2272);
					primitiveType211=primitiveType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType211.getTree());

					if ( state.backtracking==0 ) {primitive=true;}
					// /media/tony/disk2/_git/cs543/JavaJava.g:364:35: ( '[' ']' )*
					loop67:
					while (true) {
						int alt67=2;
						int LA67_0 = input.LA(1);
						if ( (LA67_0==55) ) {
							alt67=1;
						}

						switch (alt67) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:364:36: '[' ']'
							{
							char_literal212=(Token)match(input,55,FOLLOW_55_in_type2276); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal212_tree = (Object)adaptor.create(char_literal212);
							adaptor.addChild(root_0, char_literal212_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal213=(Token)match(input,56,FOLLOW_56_in_type2280); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal213_tree = (Object)adaptor.create(char_literal213);
							adaptor.addChild(root_0, char_literal213_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							break loop67;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "type"


	public static class classOrInterfaceType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classOrInterfaceType"
	// /media/tony/disk2/_git/cs543/JavaJava.g:369:1: classOrInterfaceType : I7= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* ;
	public final JavaJavaParser.classOrInterfaceType_return classOrInterfaceType() throws RecognitionException {
		JavaJavaParser.classOrInterfaceType_return retval = new JavaJavaParser.classOrInterfaceType_return();
		retval.start = input.LT(1);
		int classOrInterfaceType_StartIndex = input.index();

		Object root_0 = null;

		Token I7=null;
		Token char_literal215=null;
		Token Identifier216=null;
		ParserRuleReturnScope typeArguments214 =null;
		ParserRuleReturnScope typeArguments217 =null;

		Object I7_tree=null;
		Object char_literal215_tree=null;
		Object Identifier216_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:370:2: (I7= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:370:4: I7= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )*
			{
			root_0 = (Object)adaptor.nil();


			I7=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType2299); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			I7_tree = (Object)adaptor.create(I7);
			adaptor.addChild(root_0, I7_tree);
			}

			if ( state.backtracking==0 ) { id((I7!=null?I7.getText():null));}
			// /media/tony/disk2/_git/cs543/JavaJava.g:370:35: ( typeArguments )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==49) ) {
				int LA69_1 = input.LA(2);
				if ( (LA69_1==Identifier||LA69_1==53||LA69_1==60||LA69_1==62||LA69_1==65||LA69_1==70||LA69_1==76||LA69_1==82||LA69_1==84||LA69_1==93) ) {
					alt69=1;
				}
			}
			switch (alt69) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:370:35: typeArguments
					{
					pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2303);
					typeArguments214=typeArguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArguments214.getTree());

					}
					break;

			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:370:50: ( '.' Identifier ( typeArguments )? )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==43) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:370:51: '.' Identifier ( typeArguments )?
					{
					char_literal215=(Token)match(input,43,FOLLOW_43_in_classOrInterfaceType2307); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal215_tree = (Object)adaptor.create(char_literal215);
					adaptor.addChild(root_0, char_literal215_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					Identifier216=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType2311); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier216_tree = (Object)adaptor.create(Identifier216);
					adaptor.addChild(root_0, Identifier216_tree);
					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:370:76: ( typeArguments )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==49) ) {
						int LA70_1 = input.LA(2);
						if ( (LA70_1==Identifier||LA70_1==53||LA70_1==60||LA70_1==62||LA70_1==65||LA70_1==70||LA70_1==76||LA70_1==82||LA70_1==84||LA70_1==93) ) {
							alt70=1;
						}
					}
					switch (alt70) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:370:76: typeArguments
							{
							pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2313);
							typeArguments217=typeArguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArguments217.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop71;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, classOrInterfaceType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classOrInterfaceType"


	public static class primitiveType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveType"
	// /media/tony/disk2/_git/cs543/JavaJava.g:373:1: primitiveType : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
	public final JavaJavaParser.primitiveType_return primitiveType() throws RecognitionException {
		JavaJavaParser.primitiveType_return retval = new JavaJavaParser.primitiveType_return();
		retval.start = input.LT(1);
		int primitiveType_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal218=null;
		Token string_literal219=null;
		Token string_literal220=null;
		Token string_literal221=null;
		Token string_literal222=null;
		Token string_literal223=null;
		Token string_literal224=null;
		Token string_literal225=null;

		Object string_literal218_tree=null;
		Object string_literal219_tree=null;
		Object string_literal220_tree=null;
		Object string_literal221_tree=null;
		Object string_literal222_tree=null;
		Object string_literal223_tree=null;
		Object string_literal224_tree=null;
		Object string_literal225_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:374:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
			int alt72=8;
			switch ( input.LA(1) ) {
			case 60:
				{
				alt72=1;
				}
				break;
			case 65:
				{
				alt72=2;
				}
				break;
			case 62:
				{
				alt72=3;
				}
				break;
			case 93:
				{
				alt72=4;
				}
				break;
			case 82:
				{
				alt72=5;
				}
				break;
			case 84:
				{
				alt72=6;
				}
				break;
			case 76:
				{
				alt72=7;
				}
				break;
			case 70:
				{
				alt72=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:374:9: 'boolean'
					{
					root_0 = (Object)adaptor.nil();


					string_literal218=(Token)match(input,60,FOLLOW_60_in_primitiveType2334); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal218_tree = (Object)adaptor.create(string_literal218);
					adaptor.addChild(root_0, string_literal218_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++; PrimitiveType = "boolean"; JavaMetrics.uniqueKeywords.add("boolean");}
					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:375:9: 'char'
					{
					root_0 = (Object)adaptor.nil();


					string_literal219=(Token)match(input,65,FOLLOW_65_in_primitiveType2346); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal219_tree = (Object)adaptor.create(string_literal219);
					adaptor.addChild(root_0, string_literal219_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "char";  JavaMetrics.uniqueKeywords.add("char");}
					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:376:9: 'byte'
					{
					root_0 = (Object)adaptor.nil();


					string_literal220=(Token)match(input,62,FOLLOW_62_in_primitiveType2359); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal220_tree = (Object)adaptor.create(string_literal220);
					adaptor.addChild(root_0, string_literal220_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "byte"; JavaMetrics.uniqueKeywords.add("byte");}
					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:377:9: 'short'
					{
					root_0 = (Object)adaptor.nil();


					string_literal221=(Token)match(input,93,FOLLOW_93_in_primitiveType2372); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal221_tree = (Object)adaptor.create(string_literal221);
					adaptor.addChild(root_0, string_literal221_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "short"; JavaMetrics.uniqueKeywords.add("short");}
					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:378:9: 'int'
					{
					root_0 = (Object)adaptor.nil();


					string_literal222=(Token)match(input,82,FOLLOW_82_in_primitiveType2385); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal222_tree = (Object)adaptor.create(string_literal222);
					adaptor.addChild(root_0, string_literal222_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "int"; JavaMetrics.uniqueKeywords.add("int");}
					}
					break;
				case 6 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:379:9: 'long'
					{
					root_0 = (Object)adaptor.nil();


					string_literal223=(Token)match(input,84,FOLLOW_84_in_primitiveType2399); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal223_tree = (Object)adaptor.create(string_literal223);
					adaptor.addChild(root_0, string_literal223_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "long"; JavaMetrics.uniqueKeywords.add("long");}
					}
					break;
				case 7 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:380:9: 'float'
					{
					root_0 = (Object)adaptor.nil();


					string_literal224=(Token)match(input,76,FOLLOW_76_in_primitiveType2412); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal224_tree = (Object)adaptor.create(string_literal224);
					adaptor.addChild(root_0, string_literal224_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "float"; JavaMetrics.uniqueKeywords.add("float");}
					}
					break;
				case 8 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:381:9: 'double'
					{
					root_0 = (Object)adaptor.nil();


					string_literal225=(Token)match(input,70,FOLLOW_70_in_primitiveType2425); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal225_tree = (Object)adaptor.create(string_literal225);
					adaptor.addChild(root_0, string_literal225_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "double"; JavaMetrics.uniqueKeywords.add("double");}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, primitiveType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveType"


	public static class variableModifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableModifier"
	// /media/tony/disk2/_git/cs543/JavaJava.g:384:1: variableModifier : ( 'final' | annotation );
	public final JavaJavaParser.variableModifier_return variableModifier() throws RecognitionException {
		JavaJavaParser.variableModifier_return retval = new JavaJavaParser.variableModifier_return();
		retval.start = input.LT(1);
		int variableModifier_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal226=null;
		ParserRuleReturnScope annotation227 =null;

		Object string_literal226_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:385:5: ( 'final' | annotation )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==74) ) {
				alt73=1;
			}
			else if ( (LA73_0==54) ) {
				alt73=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:385:9: 'final'
					{
					root_0 = (Object)adaptor.nil();


					string_literal226=(Token)match(input,74,FOLLOW_74_in_variableModifier2447); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal226_tree = (Object)adaptor.create(string_literal226);
					adaptor.addChild(root_0, string_literal226_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("final");}
					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:386:9: annotation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotation_in_variableModifier2458);
					annotation227=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation227.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, variableModifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableModifier"


	public static class typeArguments_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeArguments"
	// /media/tony/disk2/_git/cs543/JavaJava.g:389:1: typeArguments : '<' typeArgument ( ',' typeArgument )* '>' ;
	public final JavaJavaParser.typeArguments_return typeArguments() throws RecognitionException {
		JavaJavaParser.typeArguments_return retval = new JavaJavaParser.typeArguments_return();
		retval.start = input.LT(1);
		int typeArguments_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal228=null;
		Token char_literal230=null;
		Token char_literal232=null;
		ParserRuleReturnScope typeArgument229 =null;
		ParserRuleReturnScope typeArgument231 =null;

		Object char_literal228_tree=null;
		Object char_literal230_tree=null;
		Object char_literal232_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:390:5: ( '<' typeArgument ( ',' typeArgument )* '>' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:390:9: '<' typeArgument ( ',' typeArgument )* '>'
			{
			root_0 = (Object)adaptor.nil();


			char_literal228=(Token)match(input,49,FOLLOW_49_in_typeArguments2477); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal228_tree = (Object)adaptor.create(char_literal228);
			adaptor.addChild(root_0, char_literal228_tree);
			}

			if ( state.backtracking==0 ) {s("<");}
			pushFollow(FOLLOW_typeArgument_in_typeArguments2481);
			typeArgument229=typeArgument();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArgument229.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:390:36: ( ',' typeArgument )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==39) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:390:37: ',' typeArgument
					{
					char_literal230=(Token)match(input,39,FOLLOW_39_in_typeArguments2484); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal230_tree = (Object)adaptor.create(char_literal230);
					adaptor.addChild(root_0, char_literal230_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_typeArgument_in_typeArguments2487);
					typeArgument231=typeArgument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArgument231.getTree());

					}
					break;

				default :
					break loop74;
				}
			}

			char_literal232=(Token)match(input,52,FOLLOW_52_in_typeArguments2491); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal232_tree = (Object)adaptor.create(char_literal232);
			adaptor.addChild(root_0, char_literal232_tree);
			}

			if ( state.backtracking==0 ) {s(">");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, typeArguments_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeArguments"


	public static class typeArgument_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeArgument"
	// /media/tony/disk2/_git/cs543/JavaJava.g:393:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );
	public final JavaJavaParser.typeArgument_return typeArgument() throws RecognitionException {
		JavaJavaParser.typeArgument_return retval = new JavaJavaParser.typeArgument_return();
		retval.start = input.LT(1);
		int typeArgument_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal234=null;
		Token string_literal235=null;
		Token string_literal236=null;
		ParserRuleReturnScope type233 =null;
		ParserRuleReturnScope type237 =null;

		Object char_literal234_tree=null;
		Object string_literal235_tree=null;
		Object string_literal236_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:394:5: ( type | '?' ( ( 'extends' | 'super' ) type )? )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==Identifier||LA77_0==60||LA77_0==62||LA77_0==65||LA77_0==70||LA77_0==76||LA77_0==82||LA77_0==84||LA77_0==93) ) {
				alt77=1;
			}
			else if ( (LA77_0==53) ) {
				alt77=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:394:9: type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_in_typeArgument2515);
					type233=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type233.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:395:9: '?' ( ( 'extends' | 'super' ) type )?
					{
					root_0 = (Object)adaptor.nil();


					char_literal234=(Token)match(input,53,FOLLOW_53_in_typeArgument2525); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal234_tree = (Object)adaptor.create(char_literal234);
					adaptor.addChild(root_0, char_literal234_tree);
					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:395:13: ( ( 'extends' | 'super' ) type )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==72||LA76_0==96) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:395:14: ( 'extends' | 'super' ) type
							{
							// /media/tony/disk2/_git/cs543/JavaJava.g:395:14: ( 'extends' | 'super' )
							int alt75=2;
							int LA75_0 = input.LA(1);
							if ( (LA75_0==72) ) {
								alt75=1;
							}
							else if ( (LA75_0==96) ) {
								alt75=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 75, 0, input);
								throw nvae;
							}

							switch (alt75) {
								case 1 :
									// /media/tony/disk2/_git/cs543/JavaJava.g:395:15: 'extends'
									{
									string_literal235=(Token)match(input,72,FOLLOW_72_in_typeArgument2529); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal235_tree = (Object)adaptor.create(string_literal235);
									adaptor.addChild(root_0, string_literal235_tree);
									}

									if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("extends");}
									}
									break;
								case 2 :
									// /media/tony/disk2/_git/cs543/JavaJava.g:395:86: 'super'
									{
									string_literal236=(Token)match(input,96,FOLLOW_96_in_typeArgument2534); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal236_tree = (Object)adaptor.create(string_literal236);
									adaptor.addChild(root_0, string_literal236_tree);
									}

									if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
									}
									break;

							}

							pushFollow(FOLLOW_type_in_typeArgument2539);
							type237=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type237.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, typeArgument_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeArgument"


	public static class qualifiedNameList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qualifiedNameList"
	// /media/tony/disk2/_git/cs543/JavaJava.g:398:1: qualifiedNameList : qualifiedName ( ',' qualifiedName )* ;
	public final JavaJavaParser.qualifiedNameList_return qualifiedNameList() throws RecognitionException {
		JavaJavaParser.qualifiedNameList_return retval = new JavaJavaParser.qualifiedNameList_return();
		retval.start = input.LT(1);
		int qualifiedNameList_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal239=null;
		ParserRuleReturnScope qualifiedName238 =null;
		ParserRuleReturnScope qualifiedName240 =null;

		Object char_literal239_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:399:5: ( qualifiedName ( ',' qualifiedName )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:399:9: qualifiedName ( ',' qualifiedName )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList2565);
			qualifiedName238=qualifiedName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName238.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:399:23: ( ',' qualifiedName )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==39) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:399:24: ',' qualifiedName
					{
					char_literal239=(Token)match(input,39,FOLLOW_39_in_qualifiedNameList2568); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal239_tree = (Object)adaptor.create(char_literal239);
					adaptor.addChild(root_0, char_literal239_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList2572);
					qualifiedName240=qualifiedName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName240.getTree());

					}
					break;

				default :
					break loop78;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, qualifiedNameList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "qualifiedNameList"


	public static class formalParameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParameters"
	// /media/tony/disk2/_git/cs543/JavaJava.g:402:1: formalParameters : '(' ( formalParameterDecls )? ')' ;
	public final JavaJavaParser.formalParameters_return formalParameters() throws RecognitionException {
		JavaJavaParser.formalParameters_return retval = new JavaJavaParser.formalParameters_return();
		retval.start = input.LT(1);
		int formalParameters_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal241=null;
		Token char_literal243=null;
		ParserRuleReturnScope formalParameterDecls242 =null;

		Object char_literal241_tree=null;
		Object char_literal243_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:403:5: ( '(' ( formalParameterDecls )? ')' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:403:9: '(' ( formalParameterDecls )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal241=(Token)match(input,32,FOLLOW_32_in_formalParameters2593); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal241_tree = (Object)adaptor.create(char_literal241);
			adaptor.addChild(root_0, char_literal241_tree);
			}

			if ( state.backtracking==0 ) {s("(");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:403:23: ( formalParameterDecls )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==Identifier||LA79_0==54||LA79_0==60||LA79_0==62||LA79_0==65||LA79_0==70||LA79_0==74||LA79_0==76||LA79_0==82||LA79_0==84||LA79_0==93) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:403:23: formalParameterDecls
					{
					pushFollow(FOLLOW_formalParameterDecls_in_formalParameters2597);
					formalParameterDecls242=formalParameterDecls();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDecls242.getTree());

					}
					break;

			}

			char_literal243=(Token)match(input,33,FOLLOW_33_in_formalParameters2600); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal243_tree = (Object)adaptor.create(char_literal243);
			adaptor.addChild(root_0, char_literal243_tree);
			}

			if ( state.backtracking==0 ) {s(")");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, formalParameters_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formalParameters"


	public static class formalParameterDecls_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParameterDecls"
	// /media/tony/disk2/_git/cs543/JavaJava.g:406:1: formalParameterDecls : variableModifiers type formalParameterDeclsRest ;
	public final JavaJavaParser.formalParameterDecls_return formalParameterDecls() throws RecognitionException {
		JavaJavaParser.formalParameterDecls_return retval = new JavaJavaParser.formalParameterDecls_return();
		retval.start = input.LT(1);
		int formalParameterDecls_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope variableModifiers244 =null;
		ParserRuleReturnScope type245 =null;
		ParserRuleReturnScope formalParameterDeclsRest246 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:407:5: ( variableModifiers type formalParameterDeclsRest )
			// /media/tony/disk2/_git/cs543/JavaJava.g:407:9: variableModifiers type formalParameterDeclsRest
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableModifiers_in_formalParameterDecls2626);
			variableModifiers244=variableModifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers244.getTree());

			pushFollow(FOLLOW_type_in_formalParameterDecls2628);
			type245=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type245.getTree());

			pushFollow(FOLLOW_formalParameterDeclsRest_in_formalParameterDecls2630);
			formalParameterDeclsRest246=formalParameterDeclsRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDeclsRest246.getTree());

			if ( state.backtracking==0 ) {primitive = false;}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, formalParameterDecls_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formalParameterDecls"


	public static class formalParameterDeclsRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParameterDeclsRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:410:1: formalParameterDeclsRest : ( variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId );
	public final JavaJavaParser.formalParameterDeclsRest_return formalParameterDeclsRest() throws RecognitionException {
		JavaJavaParser.formalParameterDeclsRest_return retval = new JavaJavaParser.formalParameterDeclsRest_return();
		retval.start = input.LT(1);
		int formalParameterDeclsRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal248=null;
		Token string_literal250=null;
		ParserRuleReturnScope variableDeclaratorId247 =null;
		ParserRuleReturnScope formalParameterDecls249 =null;
		ParserRuleReturnScope variableDeclaratorId251 =null;

		Object char_literal248_tree=null;
		Object string_literal250_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:411:5: ( variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==Identifier) ) {
				alt81=1;
			}
			else if ( (LA81_0==44) ) {
				alt81=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:411:9: variableDeclaratorId ( ',' formalParameterDecls )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2655);
					variableDeclaratorId247=variableDeclaratorId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId247.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:411:30: ( ',' formalParameterDecls )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==39) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:411:31: ',' formalParameterDecls
							{
							char_literal248=(Token)match(input,39,FOLLOW_39_in_formalParameterDeclsRest2658); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal248_tree = (Object)adaptor.create(char_literal248);
							adaptor.addChild(root_0, char_literal248_tree);
							}

							if ( state.backtracking==0 ) {s(",");}
							pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDeclsRest2662);
							formalParameterDecls249=formalParameterDecls();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDecls249.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:412:9: '...' variableDeclaratorId
					{
					root_0 = (Object)adaptor.nil();


					string_literal250=(Token)match(input,44,FOLLOW_44_in_formalParameterDeclsRest2674); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal250_tree = (Object)adaptor.create(string_literal250);
					adaptor.addChild(root_0, string_literal250_tree);
					}

					pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2676);
					variableDeclaratorId251=variableDeclaratorId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId251.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, formalParameterDeclsRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formalParameterDeclsRest"


	public static class methodBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodBody"
	// /media/tony/disk2/_git/cs543/JavaJava.g:415:1: methodBody : block ;
	public final JavaJavaParser.methodBody_return methodBody() throws RecognitionException {
		JavaJavaParser.methodBody_return retval = new JavaJavaParser.methodBody_return();
		retval.start = input.LT(1);
		int methodBody_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope block252 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:416:5: ( block )
			// /media/tony/disk2/_git/cs543/JavaJava.g:416:8: block
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_block_in_methodBody2698);
			block252=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block252.getTree());

			if ( state.backtracking==0 ) {System.out.println("McCabe for " + methodName + " = " + (mmc+1)); JavaMetrics.mccabeValues.add(methodName + " = " + (mmc+1));mmc = 0;}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, methodBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodBody"


	public static class constructorBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constructorBody"
	// /media/tony/disk2/_git/cs543/JavaJava.g:419:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' ;
	public final JavaJavaParser.constructorBody_return constructorBody() throws RecognitionException {
		JavaJavaParser.constructorBody_return retval = new JavaJavaParser.constructorBody_return();
		retval.start = input.LT(1);
		int constructorBody_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal253=null;
		Token char_literal256=null;
		ParserRuleReturnScope explicitConstructorInvocation254 =null;
		ParserRuleReturnScope blockStatement255 =null;

		Object char_literal253_tree=null;
		Object char_literal256_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:420:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:420:9: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal253=(Token)match(input,108,FOLLOW_108_in_constructorBody2719); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal253_tree = (Object)adaptor.create(char_literal253);
			adaptor.addChild(root_0, char_literal253_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:420:22: ( explicitConstructorInvocation )?
			int alt82=2;
			switch ( input.LA(1) ) {
				case 49:
					{
					alt82=1;
					}
					break;
				case 99:
					{
					int LA82_2 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 96:
					{
					int LA82_3 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 32:
					{
					int LA82_4 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case HexLiteral:
					{
					int LA82_5 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case OctalLiteral:
					{
					int LA82_6 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case DecimalLiteral:
					{
					int LA82_7 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case FloatingPointLiteral:
					{
					int LA82_8 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case CharacterLiteral:
					{
					int LA82_9 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case StringLiteral:
					{
					int LA82_10 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 103:
					{
					int LA82_11 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 73:
					{
					int LA82_12 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 87:
					{
					int LA82_13 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 86:
					{
					int LA82_14 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case Identifier:
					{
					int LA82_15 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 60:
					{
					int LA82_16 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 65:
					{
					int LA82_17 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 62:
					{
					int LA82_18 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 93:
					{
					int LA82_19 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 82:
					{
					int LA82_20 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 84:
					{
					int LA82_21 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 76:
					{
					int LA82_22 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 70:
					{
					int LA82_23 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
				case 105:
					{
					int LA82_24 = input.LA(2);
					if ( (synpred112_JavaJava()) ) {
						alt82=1;
					}
					}
					break;
			}
			switch (alt82) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:420:22: explicitConstructorInvocation
					{
					pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody2722);
					explicitConstructorInvocation254=explicitConstructorInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitConstructorInvocation254.getTree());

					}
					break;

			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:420:53: ( blockStatement )*
			loop83:
			while (true) {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( (LA83_0==ASSERT||(LA83_0 >= CharacterLiteral && LA83_0 <= ENUM)||LA83_0==FloatingPointLiteral||(LA83_0 >= HexLiteral && LA83_0 <= Identifier)||(LA83_0 >= OctalLiteral && LA83_0 <= StringLiteral)||LA83_0==25||LA83_0==32||(LA83_0 >= 36 && LA83_0 <= 37)||(LA83_0 >= 40 && LA83_0 <= 41)||LA83_0==48||LA83_0==54||(LA83_0 >= 59 && LA83_0 <= 62)||(LA83_0 >= 65 && LA83_0 <= 67)||(LA83_0 >= 69 && LA83_0 <= 70)||(LA83_0 >= 73 && LA83_0 <= 74)||(LA83_0 >= 76 && LA83_0 <= 78)||(LA83_0 >= 82 && LA83_0 <= 84)||(LA83_0 >= 86 && LA83_0 <= 87)||(LA83_0 >= 89 && LA83_0 <= 100)||(LA83_0 >= 103 && LA83_0 <= 105)||(LA83_0 >= 107 && LA83_0 <= 108)||LA83_0==113) ) {
					alt83=1;
				}

				switch (alt83) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:420:53: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_constructorBody2725);
					blockStatement255=blockStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement255.getTree());

					}
					break;

				default :
					break loop83;
				}
			}

			char_literal256=(Token)match(input,112,FOLLOW_112_in_constructorBody2728); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal256_tree = (Object)adaptor.create(char_literal256);
			adaptor.addChild(root_0, char_literal256_tree);
			}

			if ( state.backtracking==0 ) {s("}");System.out.println("McCabe for " + methodName + " = " + (mmc+1)); JavaMetrics.mccabeValues.add(methodName + " = " + (mmc+1)); mmc = 0;}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, constructorBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constructorBody"


	public static class explicitConstructorInvocation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "explicitConstructorInvocation"
	// /media/tony/disk2/_git/cs543/JavaJava.g:423:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' );
	public final JavaJavaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
		JavaJavaParser.explicitConstructorInvocation_return retval = new JavaJavaParser.explicitConstructorInvocation_return();
		retval.start = input.LT(1);
		int explicitConstructorInvocation_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal258=null;
		Token string_literal259=null;
		Token char_literal261=null;
		Token char_literal263=null;
		Token string_literal265=null;
		Token char_literal267=null;
		ParserRuleReturnScope nonWildcardTypeArguments257 =null;
		ParserRuleReturnScope arguments260 =null;
		ParserRuleReturnScope primary262 =null;
		ParserRuleReturnScope nonWildcardTypeArguments264 =null;
		ParserRuleReturnScope arguments266 =null;

		Object string_literal258_tree=null;
		Object string_literal259_tree=null;
		Object char_literal261_tree=null;
		Object char_literal263_tree=null;
		Object string_literal265_tree=null;
		Object char_literal267_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:424:5: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' )
			int alt87=2;
			switch ( input.LA(1) ) {
			case 49:
				{
				alt87=1;
				}
				break;
			case 99:
				{
				int LA87_2 = input.LA(2);
				if ( (synpred116_JavaJava()) ) {
					alt87=1;
				}
				else if ( (true) ) {
					alt87=2;
				}

				}
				break;
			case 96:
				{
				int LA87_3 = input.LA(2);
				if ( (synpred116_JavaJava()) ) {
					alt87=1;
				}
				else if ( (true) ) {
					alt87=2;
				}

				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case Identifier:
			case OctalLiteral:
			case StringLiteral:
			case 32:
			case 60:
			case 62:
			case 65:
			case 70:
			case 73:
			case 76:
			case 82:
			case 84:
			case 86:
			case 87:
			case 93:
			case 103:
			case 105:
				{
				alt87=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}
			switch (alt87) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:424:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
					{
					root_0 = (Object)adaptor.nil();


					// /media/tony/disk2/_git/cs543/JavaJava.g:424:9: ( nonWildcardTypeArguments )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==49) ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:424:9: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2749);
							nonWildcardTypeArguments257=nonWildcardTypeArguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments257.getTree());

							}
							break;

					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:424:35: ( 'this' | 'super' )
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==99) ) {
						alt85=1;
					}
					else if ( (LA85_0==96) ) {
						alt85=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 85, 0, input);
						throw nvae;
					}

					switch (alt85) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:424:36: 'this'
							{
							string_literal258=(Token)match(input,99,FOLLOW_99_in_explicitConstructorInvocation2753); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal258_tree = (Object)adaptor.create(string_literal258);
							adaptor.addChild(root_0, string_literal258_tree);
							}

							if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("this");}
							}
							break;
						case 2 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:424:101: 'super'
							{
							string_literal259=(Token)match(input,96,FOLLOW_96_in_explicitConstructorInvocation2758); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal259_tree = (Object)adaptor.create(string_literal259);
							adaptor.addChild(root_0, string_literal259_tree);
							}

							if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
							}
							break;

					}

					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation2763);
					arguments260=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments260.getTree());

					char_literal261=(Token)match(input,48,FOLLOW_48_in_explicitConstructorInvocation2765); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal261_tree = (Object)adaptor.create(char_literal261);
					adaptor.addChild(root_0, char_literal261_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:425:9: primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primary_in_explicitConstructorInvocation2777);
					primary262=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary262.getTree());

					char_literal263=(Token)match(input,43,FOLLOW_43_in_explicitConstructorInvocation2779); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal263_tree = (Object)adaptor.create(char_literal263);
					adaptor.addChild(root_0, char_literal263_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					// /media/tony/disk2/_git/cs543/JavaJava.g:425:30: ( nonWildcardTypeArguments )?
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==49) ) {
						alt86=1;
					}
					switch (alt86) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:425:30: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2782);
							nonWildcardTypeArguments264=nonWildcardTypeArguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments264.getTree());

							}
							break;

					}

					string_literal265=(Token)match(input,96,FOLLOW_96_in_explicitConstructorInvocation2785); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal265_tree = (Object)adaptor.create(string_literal265);
					adaptor.addChild(root_0, string_literal265_tree);
					}

					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation2787);
					arguments266=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments266.getTree());

					char_literal267=(Token)match(input,48,FOLLOW_48_in_explicitConstructorInvocation2789); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal267_tree = (Object)adaptor.create(char_literal267);
					adaptor.addChild(root_0, char_literal267_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, explicitConstructorInvocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "explicitConstructorInvocation"


	public static class qualifiedName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qualifiedName"
	// /media/tony/disk2/_git/cs543/JavaJava.g:429:1: qualifiedName : I1= Identifier ( '.' I2= Identifier )* ;
	public final JavaJavaParser.qualifiedName_return qualifiedName() throws RecognitionException {
		JavaJavaParser.qualifiedName_return retval = new JavaJavaParser.qualifiedName_return();
		retval.start = input.LT(1);
		int qualifiedName_StartIndex = input.index();

		Object root_0 = null;

		Token I1=null;
		Token I2=null;
		Token char_literal268=null;

		Object I1_tree=null;
		Object I2_tree=null;
		Object char_literal268_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:430:5: (I1= Identifier ( '.' I2= Identifier )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:430:9: I1= Identifier ( '.' I2= Identifier )*
			{
			root_0 = (Object)adaptor.nil();


			I1=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName2813); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			I1_tree = (Object)adaptor.create(I1);
			adaptor.addChild(root_0, I1_tree);
			}

			if ( state.backtracking==0 ) {myID  = (I1!=null?I1.getText():null);}
			// /media/tony/disk2/_git/cs543/JavaJava.g:430:43: ( '.' I2= Identifier )*
			loop88:
			while (true) {
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==43) ) {
					int LA88_2 = input.LA(2);
					if ( (LA88_2==Identifier) ) {
						alt88=1;
					}

				}

				switch (alt88) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:430:44: '.' I2= Identifier
					{
					char_literal268=(Token)match(input,43,FOLLOW_43_in_qualifiedName2818); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal268_tree = (Object)adaptor.create(char_literal268);
					adaptor.addChild(root_0, char_literal268_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					I2=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName2824); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					I2_tree = (Object)adaptor.create(I2);
					adaptor.addChild(root_0, I2_tree);
					}

					if ( state.backtracking==0 ) {myID+="."+(I2!=null?I2.getText():null);}
					}
					break;

				default :
					break loop88;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, qualifiedName_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "qualifiedName"


	public static class literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// /media/tony/disk2/_git/cs543/JavaJava.g:433:1: literal : ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );
	public final JavaJavaParser.literal_return literal() throws RecognitionException {
		JavaJavaParser.literal_return retval = new JavaJavaParser.literal_return();
		retval.start = input.LT(1);
		int literal_StartIndex = input.index();

		Object root_0 = null;

		Token FloatingPointLiteral270=null;
		Token CharacterLiteral271=null;
		Token StringLiteral272=null;
		Token string_literal274=null;
		ParserRuleReturnScope integerLiteral269 =null;
		ParserRuleReturnScope booleanLiteral273 =null;

		Object FloatingPointLiteral270_tree=null;
		Object CharacterLiteral271_tree=null;
		Object StringLiteral272_tree=null;
		Object string_literal274_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:434:5: ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
			int alt89=6;
			switch ( input.LA(1) ) {
			case DecimalLiteral:
			case HexLiteral:
			case OctalLiteral:
				{
				alt89=1;
				}
				break;
			case FloatingPointLiteral:
				{
				alt89=2;
				}
				break;
			case CharacterLiteral:
				{
				alt89=3;
				}
				break;
			case StringLiteral:
				{
				alt89=4;
				}
				break;
			case 73:
			case 103:
				{
				alt89=5;
				}
				break;
			case 87:
				{
				alt89=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}
			switch (alt89) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:434:9: integerLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_integerLiteral_in_literal2853);
					integerLiteral269=integerLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteral269.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:435:9: FloatingPointLiteral
					{
					root_0 = (Object)adaptor.nil();


					FloatingPointLiteral270=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal2863); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FloatingPointLiteral270_tree = (Object)adaptor.create(FloatingPointLiteral270);
					adaptor.addChild(root_0, FloatingPointLiteral270_tree);
					}

					if ( state.backtracking==0 ) {JavaMetrics.uniqueConstants.add((FloatingPointLiteral270!=null?FloatingPointLiteral270.getText():null));}
					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:436:9: CharacterLiteral
					{
					root_0 = (Object)adaptor.nil();


					CharacterLiteral271=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal2876); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CharacterLiteral271_tree = (Object)adaptor.create(CharacterLiteral271);
					adaptor.addChild(root_0, CharacterLiteral271_tree);
					}

					if ( state.backtracking==0 ) {JavaMetrics.uniqueConstants.add((CharacterLiteral271!=null?CharacterLiteral271.getText():null));}
					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:437:9: StringLiteral
					{
					root_0 = (Object)adaptor.nil();


					StringLiteral272=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2889); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					StringLiteral272_tree = (Object)adaptor.create(StringLiteral272);
					adaptor.addChild(root_0, StringLiteral272_tree);
					}

					if ( state.backtracking==0 ) {JavaMetrics.uniqueConstants.add((StringLiteral272!=null?StringLiteral272.getText():null));}
					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:438:9: booleanLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_booleanLiteral_in_literal2901);
					booleanLiteral273=booleanLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral273.getTree());

					}
					break;
				case 6 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:439:9: 'null'
					{
					root_0 = (Object)adaptor.nil();


					string_literal274=(Token)match(input,87,FOLLOW_87_in_literal2911); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal274_tree = (Object)adaptor.create(string_literal274);
					adaptor.addChild(root_0, string_literal274_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("null");}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, literal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class integerLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "integerLiteral"
	// /media/tony/disk2/_git/cs543/JavaJava.g:442:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
	public final JavaJavaParser.integerLiteral_return integerLiteral() throws RecognitionException {
		JavaJavaParser.integerLiteral_return retval = new JavaJavaParser.integerLiteral_return();
		retval.start = input.LT(1);
		int integerLiteral_StartIndex = input.index();

		Object root_0 = null;

		Token HexLiteral275=null;
		Token OctalLiteral276=null;
		Token DecimalLiteral277=null;

		Object HexLiteral275_tree=null;
		Object OctalLiteral276_tree=null;
		Object DecimalLiteral277_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:443:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
			int alt90=3;
			switch ( input.LA(1) ) {
			case HexLiteral:
				{
				alt90=1;
				}
				break;
			case OctalLiteral:
				{
				alt90=2;
				}
				break;
			case DecimalLiteral:
				{
				alt90=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}
			switch (alt90) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:443:9: HexLiteral
					{
					root_0 = (Object)adaptor.nil();


					HexLiteral275=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerLiteral2932); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					HexLiteral275_tree = (Object)adaptor.create(HexLiteral275);
					adaptor.addChild(root_0, HexLiteral275_tree);
					}

					if ( state.backtracking==0 ) { JavaMetrics.uniqueConstants.add((HexLiteral275!=null?HexLiteral275.getText():null));}
					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:444:9: OctalLiteral
					{
					root_0 = (Object)adaptor.nil();


					OctalLiteral276=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerLiteral2944); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OctalLiteral276_tree = (Object)adaptor.create(OctalLiteral276);
					adaptor.addChild(root_0, OctalLiteral276_tree);
					}

					if ( state.backtracking==0 ) { JavaMetrics.uniqueConstants.add((OctalLiteral276!=null?OctalLiteral276.getText():null));}
					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:445:9: DecimalLiteral
					{
					root_0 = (Object)adaptor.nil();


					DecimalLiteral277=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerLiteral2956); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DecimalLiteral277_tree = (Object)adaptor.create(DecimalLiteral277);
					adaptor.addChild(root_0, DecimalLiteral277_tree);
					}

					if ( state.backtracking==0 ) {JavaMetrics.uniqueConstants.add((DecimalLiteral277!=null?DecimalLiteral277.getText():null));}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, integerLiteral_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "integerLiteral"


	public static class booleanLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "booleanLiteral"
	// /media/tony/disk2/_git/cs543/JavaJava.g:448:1: booleanLiteral : ( 'true' | 'false' );
	public final JavaJavaParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
		JavaJavaParser.booleanLiteral_return retval = new JavaJavaParser.booleanLiteral_return();
		retval.start = input.LT(1);
		int booleanLiteral_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal278=null;
		Token string_literal279=null;

		Object string_literal278_tree=null;
		Object string_literal279_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:449:5: ( 'true' | 'false' )
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==103) ) {
				alt91=1;
			}
			else if ( (LA91_0==73) ) {
				alt91=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}

			switch (alt91) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:449:9: 'true'
					{
					root_0 = (Object)adaptor.nil();


					string_literal278=(Token)match(input,103,FOLLOW_103_in_booleanLiteral2977); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal278_tree = (Object)adaptor.create(string_literal278);
					adaptor.addChild(root_0, string_literal278_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("true");}
					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:450:9: 'false'
					{
					root_0 = (Object)adaptor.nil();


					string_literal279=(Token)match(input,73,FOLLOW_73_in_booleanLiteral2989); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal279_tree = (Object)adaptor.create(string_literal279);
					adaptor.addChild(root_0, string_literal279_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("false");}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, booleanLiteral_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "booleanLiteral"


	public static class annotations_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "annotations"
	// /media/tony/disk2/_git/cs543/JavaJava.g:455:1: annotations : ( annotation )+ ;
	public final JavaJavaParser.annotations_return annotations() throws RecognitionException {
		JavaJavaParser.annotations_return retval = new JavaJavaParser.annotations_return();
		retval.start = input.LT(1);
		int annotations_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope annotation280 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:456:5: ( ( annotation )+ )
			// /media/tony/disk2/_git/cs543/JavaJava.g:456:9: ( annotation )+
			{
			root_0 = (Object)adaptor.nil();


			// /media/tony/disk2/_git/cs543/JavaJava.g:456:9: ( annotation )+
			int cnt92=0;
			loop92:
			while (true) {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==54) ) {
					int LA92_2 = input.LA(2);
					if ( (LA92_2==Identifier) ) {
						int LA92_3 = input.LA(3);
						if ( (synpred127_JavaJava()) ) {
							alt92=1;
						}

					}

				}

				switch (alt92) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:456:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_annotations3011);
					annotation280=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation280.getTree());

					}
					break;

				default :
					if ( cnt92 >= 1 ) break loop92;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(92, input);
					throw eee;
				}
				cnt92++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, annotations_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotations"


	public static class annotation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "annotation"
	// /media/tony/disk2/_git/cs543/JavaJava.g:459:1: annotation : '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )? ;
	public final JavaJavaParser.annotation_return annotation() throws RecognitionException {
		JavaJavaParser.annotation_return retval = new JavaJavaParser.annotation_return();
		retval.start = input.LT(1);
		int annotation_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal281=null;
		Token char_literal283=null;
		Token char_literal286=null;
		ParserRuleReturnScope annotationName282 =null;
		ParserRuleReturnScope elementValuePairs284 =null;
		ParserRuleReturnScope elementValue285 =null;

		Object char_literal281_tree=null;
		Object char_literal283_tree=null;
		Object char_literal286_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:460:5: ( '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )? )
			// /media/tony/disk2/_git/cs543/JavaJava.g:460:9: '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
			{
			root_0 = (Object)adaptor.nil();


			char_literal281=(Token)match(input,54,FOLLOW_54_in_annotation3031); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal281_tree = (Object)adaptor.create(char_literal281);
			adaptor.addChild(root_0, char_literal281_tree);
			}

			pushFollow(FOLLOW_annotationName_in_annotation3033);
			annotationName282=annotationName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationName282.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:460:28: ( '(' ( elementValuePairs | elementValue )? ')' )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==32) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:460:30: '(' ( elementValuePairs | elementValue )? ')'
					{
					char_literal283=(Token)match(input,32,FOLLOW_32_in_annotation3037); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal283_tree = (Object)adaptor.create(char_literal283);
					adaptor.addChild(root_0, char_literal283_tree);
					}

					if ( state.backtracking==0 ) {s("(");}
					// /media/tony/disk2/_git/cs543/JavaJava.g:460:44: ( elementValuePairs | elementValue )?
					int alt93=3;
					int LA93_0 = input.LA(1);
					if ( (LA93_0==Identifier) ) {
						int LA93_1 = input.LA(2);
						if ( (LA93_1==50) ) {
							alt93=1;
						}
						else if ( ((LA93_1 >= 26 && LA93_1 <= 27)||(LA93_1 >= 29 && LA93_1 <= 30)||(LA93_1 >= 32 && LA93_1 <= 34)||(LA93_1 >= 36 && LA93_1 <= 37)||(LA93_1 >= 40 && LA93_1 <= 41)||LA93_1==43||LA93_1==45||LA93_1==49||(LA93_1 >= 51 && LA93_1 <= 53)||LA93_1==55||LA93_1==57||LA93_1==81||LA93_1==109||LA93_1==111) ) {
							alt93=2;
						}
					}
					else if ( ((LA93_0 >= CharacterLiteral && LA93_0 <= DecimalLiteral)||LA93_0==FloatingPointLiteral||LA93_0==HexLiteral||(LA93_0 >= OctalLiteral && LA93_0 <= StringLiteral)||LA93_0==25||LA93_0==32||(LA93_0 >= 36 && LA93_0 <= 37)||(LA93_0 >= 40 && LA93_0 <= 41)||LA93_0==54||LA93_0==60||LA93_0==62||LA93_0==65||LA93_0==70||LA93_0==73||LA93_0==76||LA93_0==82||LA93_0==84||(LA93_0 >= 86 && LA93_0 <= 87)||LA93_0==93||LA93_0==96||LA93_0==99||LA93_0==103||LA93_0==105||LA93_0==108||LA93_0==113) ) {
						alt93=2;
					}
					switch (alt93) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:460:46: elementValuePairs
							{
							pushFollow(FOLLOW_elementValuePairs_in_annotation3043);
							elementValuePairs284=elementValuePairs();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePairs284.getTree());

							}
							break;
						case 2 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:460:66: elementValue
							{
							pushFollow(FOLLOW_elementValue_in_annotation3047);
							elementValue285=elementValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue285.getTree());

							}
							break;

					}

					char_literal286=(Token)match(input,33,FOLLOW_33_in_annotation3052); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal286_tree = (Object)adaptor.create(char_literal286);
					adaptor.addChild(root_0, char_literal286_tree);
					}

					if ( state.backtracking==0 ) {s(")");}
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, annotation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotation"


	public static class annotationName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "annotationName"
	// /media/tony/disk2/_git/cs543/JavaJava.g:463:1: annotationName : t1= Identifier ( '.' Identifier )* ;
	public final JavaJavaParser.annotationName_return annotationName() throws RecognitionException {
		JavaJavaParser.annotationName_return retval = new JavaJavaParser.annotationName_return();
		retval.start = input.LT(1);
		int annotationName_StartIndex = input.index();

		Object root_0 = null;

		Token t1=null;
		Token char_literal287=null;
		Token Identifier288=null;

		Object t1_tree=null;
		Object char_literal287_tree=null;
		Object Identifier288_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:464:5: (t1= Identifier ( '.' Identifier )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:464:7: t1= Identifier ( '.' Identifier )*
			{
			root_0 = (Object)adaptor.nil();


			t1=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationName3082); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			t1_tree = (Object)adaptor.create(t1);
			adaptor.addChild(root_0, t1_tree);
			}

			if ( state.backtracking==0 ) {id((t1!=null?t1.getText():null)); }
			// /media/tony/disk2/_git/cs543/JavaJava.g:464:38: ( '.' Identifier )*
			loop95:
			while (true) {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==43) ) {
					alt95=1;
				}

				switch (alt95) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:464:39: '.' Identifier
					{
					char_literal287=(Token)match(input,43,FOLLOW_43_in_annotationName3086); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal287_tree = (Object)adaptor.create(char_literal287);
					adaptor.addChild(root_0, char_literal287_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					Identifier288=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationName3090); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier288_tree = (Object)adaptor.create(Identifier288);
					adaptor.addChild(root_0, Identifier288_tree);
					}

					}
					break;

				default :
					break loop95;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, annotationName_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationName"


	public static class elementValuePairs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elementValuePairs"
	// /media/tony/disk2/_git/cs543/JavaJava.g:467:1: elementValuePairs : elementValuePair ( ',' elementValuePair )* ;
	public final JavaJavaParser.elementValuePairs_return elementValuePairs() throws RecognitionException {
		JavaJavaParser.elementValuePairs_return retval = new JavaJavaParser.elementValuePairs_return();
		retval.start = input.LT(1);
		int elementValuePairs_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal290=null;
		ParserRuleReturnScope elementValuePair289 =null;
		ParserRuleReturnScope elementValuePair291 =null;

		Object char_literal290_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:468:5: ( elementValuePair ( ',' elementValuePair )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:468:9: elementValuePair ( ',' elementValuePair )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_elementValuePair_in_elementValuePairs3111);
			elementValuePair289=elementValuePair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePair289.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:468:26: ( ',' elementValuePair )*
			loop96:
			while (true) {
				int alt96=2;
				int LA96_0 = input.LA(1);
				if ( (LA96_0==39) ) {
					alt96=1;
				}

				switch (alt96) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:468:27: ',' elementValuePair
					{
					char_literal290=(Token)match(input,39,FOLLOW_39_in_elementValuePairs3114); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal290_tree = (Object)adaptor.create(char_literal290);
					adaptor.addChild(root_0, char_literal290_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_elementValuePair_in_elementValuePairs3118);
					elementValuePair291=elementValuePair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePair291.getTree());

					}
					break;

				default :
					break loop96;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, elementValuePairs_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "elementValuePairs"


	public static class elementValuePair_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elementValuePair"
	// /media/tony/disk2/_git/cs543/JavaJava.g:471:1: elementValuePair : Identifier '=' elementValue ;
	public final JavaJavaParser.elementValuePair_return elementValuePair() throws RecognitionException {
		JavaJavaParser.elementValuePair_return retval = new JavaJavaParser.elementValuePair_return();
		retval.start = input.LT(1);
		int elementValuePair_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier292=null;
		Token char_literal293=null;
		ParserRuleReturnScope elementValue294 =null;

		Object Identifier292_tree=null;
		Object char_literal293_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:472:5: ( Identifier '=' elementValue )
			// /media/tony/disk2/_git/cs543/JavaJava.g:472:9: Identifier '=' elementValue
			{
			root_0 = (Object)adaptor.nil();


			Identifier292=(Token)match(input,Identifier,FOLLOW_Identifier_in_elementValuePair3139); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier292_tree = (Object)adaptor.create(Identifier292);
			adaptor.addChild(root_0, Identifier292_tree);
			}

			if ( state.backtracking==0 ) { id((Identifier292!=null?Identifier292.getText():null));}
			char_literal293=(Token)match(input,50,FOLLOW_50_in_elementValuePair3143); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal293_tree = (Object)adaptor.create(char_literal293);
			adaptor.addChild(root_0, char_literal293_tree);
			}

			if ( state.backtracking==0 ) {s("=");}
			pushFollow(FOLLOW_elementValue_in_elementValuePair3147);
			elementValue294=elementValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue294.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, elementValuePair_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "elementValuePair"


	public static class elementValue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elementValue"
	// /media/tony/disk2/_git/cs543/JavaJava.g:475:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );
	public final JavaJavaParser.elementValue_return elementValue() throws RecognitionException {
		JavaJavaParser.elementValue_return retval = new JavaJavaParser.elementValue_return();
		retval.start = input.LT(1);
		int elementValue_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope conditionalExpression295 =null;
		ParserRuleReturnScope annotation296 =null;
		ParserRuleReturnScope elementValueArrayInitializer297 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:476:5: ( conditionalExpression | annotation | elementValueArrayInitializer )
			int alt97=3;
			switch ( input.LA(1) ) {
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case Identifier:
			case OctalLiteral:
			case StringLiteral:
			case 25:
			case 32:
			case 36:
			case 37:
			case 40:
			case 41:
			case 60:
			case 62:
			case 65:
			case 70:
			case 73:
			case 76:
			case 82:
			case 84:
			case 86:
			case 87:
			case 93:
			case 96:
			case 99:
			case 103:
			case 105:
			case 113:
				{
				alt97=1;
				}
				break;
			case 54:
				{
				alt97=2;
				}
				break;
			case 108:
				{
				alt97=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}
			switch (alt97) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:476:9: conditionalExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_conditionalExpression_in_elementValue3170);
					conditionalExpression295=conditionalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression295.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:477:9: annotation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotation_in_elementValue3180);
					annotation296=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation296.getTree());

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:478:9: elementValueArrayInitializer
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue3190);
					elementValueArrayInitializer297=elementValueArrayInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValueArrayInitializer297.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, elementValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "elementValue"


	public static class elementValueArrayInitializer_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elementValueArrayInitializer"
	// /media/tony/disk2/_git/cs543/JavaJava.g:481:1: elementValueArrayInitializer : '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' ;
	public final JavaJavaParser.elementValueArrayInitializer_return elementValueArrayInitializer() throws RecognitionException {
		JavaJavaParser.elementValueArrayInitializer_return retval = new JavaJavaParser.elementValueArrayInitializer_return();
		retval.start = input.LT(1);
		int elementValueArrayInitializer_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal298=null;
		Token char_literal300=null;
		Token char_literal302=null;
		Token char_literal303=null;
		ParserRuleReturnScope elementValue299 =null;
		ParserRuleReturnScope elementValue301 =null;

		Object char_literal298_tree=null;
		Object char_literal300_tree=null;
		Object char_literal302_tree=null;
		Object char_literal303_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:482:5: ( '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:482:9: '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal298=(Token)match(input,108,FOLLOW_108_in_elementValueArrayInitializer3213); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal298_tree = (Object)adaptor.create(char_literal298);
			adaptor.addChild(root_0, char_literal298_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:482:22: ( elementValue ( ',' elementValue )* )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( ((LA99_0 >= CharacterLiteral && LA99_0 <= DecimalLiteral)||LA99_0==FloatingPointLiteral||(LA99_0 >= HexLiteral && LA99_0 <= Identifier)||(LA99_0 >= OctalLiteral && LA99_0 <= StringLiteral)||LA99_0==25||LA99_0==32||(LA99_0 >= 36 && LA99_0 <= 37)||(LA99_0 >= 40 && LA99_0 <= 41)||LA99_0==54||LA99_0==60||LA99_0==62||LA99_0==65||LA99_0==70||LA99_0==73||LA99_0==76||LA99_0==82||LA99_0==84||(LA99_0 >= 86 && LA99_0 <= 87)||LA99_0==93||LA99_0==96||LA99_0==99||LA99_0==103||LA99_0==105||LA99_0==108||LA99_0==113) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:482:23: elementValue ( ',' elementValue )*
					{
					pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer3217);
					elementValue299=elementValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue299.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:482:36: ( ',' elementValue )*
					loop98:
					while (true) {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( (LA98_0==39) ) {
							int LA98_1 = input.LA(2);
							if ( ((LA98_1 >= CharacterLiteral && LA98_1 <= DecimalLiteral)||LA98_1==FloatingPointLiteral||(LA98_1 >= HexLiteral && LA98_1 <= Identifier)||(LA98_1 >= OctalLiteral && LA98_1 <= StringLiteral)||LA98_1==25||LA98_1==32||(LA98_1 >= 36 && LA98_1 <= 37)||(LA98_1 >= 40 && LA98_1 <= 41)||LA98_1==54||LA98_1==60||LA98_1==62||LA98_1==65||LA98_1==70||LA98_1==73||LA98_1==76||LA98_1==82||LA98_1==84||(LA98_1 >= 86 && LA98_1 <= 87)||LA98_1==93||LA98_1==96||LA98_1==99||LA98_1==103||LA98_1==105||LA98_1==108||LA98_1==113) ) {
								alt98=1;
							}

						}

						switch (alt98) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:482:37: ',' elementValue
							{
							char_literal300=(Token)match(input,39,FOLLOW_39_in_elementValueArrayInitializer3220); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal300_tree = (Object)adaptor.create(char_literal300);
							adaptor.addChild(root_0, char_literal300_tree);
							}

							if ( state.backtracking==0 ) {s(",");}
							pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer3223);
							elementValue301=elementValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue301.getTree());

							}
							break;

						default :
							break loop98;
						}
					}

					}
					break;

			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:482:67: ( ',' )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==39) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:482:68: ','
					{
					char_literal302=(Token)match(input,39,FOLLOW_39_in_elementValueArrayInitializer3230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal302_tree = (Object)adaptor.create(char_literal302);
					adaptor.addChild(root_0, char_literal302_tree);
					}

					}
					break;

			}

			char_literal303=(Token)match(input,112,FOLLOW_112_in_elementValueArrayInitializer3235); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal303_tree = (Object)adaptor.create(char_literal303);
			adaptor.addChild(root_0, char_literal303_tree);
			}

			if ( state.backtracking==0 ) {s("}");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, elementValueArrayInitializer_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "elementValueArrayInitializer"


	public static class annotationTypeDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "annotationTypeDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:485:1: annotationTypeDeclaration : '@' 'interface' Identifier annotationTypeBody ;
	public final JavaJavaParser.annotationTypeDeclaration_return annotationTypeDeclaration() throws RecognitionException {
		JavaJavaParser.annotationTypeDeclaration_return retval = new JavaJavaParser.annotationTypeDeclaration_return();
		retval.start = input.LT(1);
		int annotationTypeDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal304=null;
		Token string_literal305=null;
		Token Identifier306=null;
		ParserRuleReturnScope annotationTypeBody307 =null;

		Object char_literal304_tree=null;
		Object string_literal305_tree=null;
		Object Identifier306_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:486:5: ( '@' 'interface' Identifier annotationTypeBody )
			// /media/tony/disk2/_git/cs543/JavaJava.g:486:9: '@' 'interface' Identifier annotationTypeBody
			{
			root_0 = (Object)adaptor.nil();


			char_literal304=(Token)match(input,54,FOLLOW_54_in_annotationTypeDeclaration3259); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal304_tree = (Object)adaptor.create(char_literal304);
			adaptor.addChild(root_0, char_literal304_tree);
			}

			string_literal305=(Token)match(input,83,FOLLOW_83_in_annotationTypeDeclaration3261); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal305_tree = (Object)adaptor.create(string_literal305);
			adaptor.addChild(root_0, string_literal305_tree);
			}

			Identifier306=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationTypeDeclaration3263); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier306_tree = (Object)adaptor.create(Identifier306);
			adaptor.addChild(root_0, Identifier306_tree);
			}

			if ( state.backtracking==0 ) { id((Identifier306!=null?Identifier306.getText():null));}
			pushFollow(FOLLOW_annotationTypeBody_in_annotationTypeDeclaration3267);
			annotationTypeBody307=annotationTypeBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeBody307.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, annotationTypeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationTypeDeclaration"


	public static class annotationTypeBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "annotationTypeBody"
	// /media/tony/disk2/_git/cs543/JavaJava.g:489:1: annotationTypeBody : '{' ( annotationTypeElementDeclaration )* '}' ;
	public final JavaJavaParser.annotationTypeBody_return annotationTypeBody() throws RecognitionException {
		JavaJavaParser.annotationTypeBody_return retval = new JavaJavaParser.annotationTypeBody_return();
		retval.start = input.LT(1);
		int annotationTypeBody_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal308=null;
		Token char_literal310=null;
		ParserRuleReturnScope annotationTypeElementDeclaration309 =null;

		Object char_literal308_tree=null;
		Object char_literal310_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:490:5: ( '{' ( annotationTypeElementDeclaration )* '}' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:490:9: '{' ( annotationTypeElementDeclaration )* '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal308=(Token)match(input,108,FOLLOW_108_in_annotationTypeBody3290); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal308_tree = (Object)adaptor.create(char_literal308);
			adaptor.addChild(root_0, char_literal308_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:490:22: ( annotationTypeElementDeclaration )*
			loop101:
			while (true) {
				int alt101=2;
				int LA101_0 = input.LA(1);
				if ( (LA101_0==ENUM||LA101_0==Identifier||LA101_0==49||LA101_0==54||(LA101_0 >= 59 && LA101_0 <= 60)||LA101_0==62||(LA101_0 >= 65 && LA101_0 <= 66)||LA101_0==70||LA101_0==74||LA101_0==76||(LA101_0 >= 82 && LA101_0 <= 85)||(LA101_0 >= 89 && LA101_0 <= 91)||(LA101_0 >= 93 && LA101_0 <= 95)||LA101_0==98||LA101_0==102||(LA101_0 >= 105 && LA101_0 <= 106)) ) {
					alt101=1;
				}

				switch (alt101) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:490:23: annotationTypeElementDeclaration
					{
					pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody3294);
					annotationTypeElementDeclaration309=annotationTypeElementDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeElementDeclaration309.getTree());

					}
					break;

				default :
					break loop101;
				}
			}

			char_literal310=(Token)match(input,112,FOLLOW_112_in_annotationTypeBody3298); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal310_tree = (Object)adaptor.create(char_literal310);
			adaptor.addChild(root_0, char_literal310_tree);
			}

			if ( state.backtracking==0 ) {s("}");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, annotationTypeBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationTypeBody"


	public static class annotationTypeElementDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "annotationTypeElementDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:493:1: annotationTypeElementDeclaration : modifiers annotationTypeElementRest ;
	public final JavaJavaParser.annotationTypeElementDeclaration_return annotationTypeElementDeclaration() throws RecognitionException {
		JavaJavaParser.annotationTypeElementDeclaration_return retval = new JavaJavaParser.annotationTypeElementDeclaration_return();
		retval.start = input.LT(1);
		int annotationTypeElementDeclaration_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope modifiers311 =null;
		ParserRuleReturnScope annotationTypeElementRest312 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:494:5: ( modifiers annotationTypeElementRest )
			// /media/tony/disk2/_git/cs543/JavaJava.g:494:9: modifiers annotationTypeElementRest
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_modifiers_in_annotationTypeElementDeclaration3322);
			modifiers311=modifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers311.getTree());

			pushFollow(FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration3324);
			annotationTypeElementRest312=annotationTypeElementRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeElementRest312.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, annotationTypeElementDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationTypeElementDeclaration"


	public static class annotationTypeElementRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "annotationTypeElementRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:497:1: annotationTypeElementRest : ( type annotationMethodOrConstantRest ';' | normalClassDeclaration ( ';' )? | normalInterfaceDeclaration ( ';' )? | enumDeclaration ( ';' )? | annotationTypeDeclaration ( ';' )? );
	public final JavaJavaParser.annotationTypeElementRest_return annotationTypeElementRest() throws RecognitionException {
		JavaJavaParser.annotationTypeElementRest_return retval = new JavaJavaParser.annotationTypeElementRest_return();
		retval.start = input.LT(1);
		int annotationTypeElementRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal315=null;
		Token char_literal317=null;
		Token char_literal319=null;
		Token char_literal321=null;
		Token char_literal323=null;
		ParserRuleReturnScope type313 =null;
		ParserRuleReturnScope annotationMethodOrConstantRest314 =null;
		ParserRuleReturnScope normalClassDeclaration316 =null;
		ParserRuleReturnScope normalInterfaceDeclaration318 =null;
		ParserRuleReturnScope enumDeclaration320 =null;
		ParserRuleReturnScope annotationTypeDeclaration322 =null;

		Object char_literal315_tree=null;
		Object char_literal317_tree=null;
		Object char_literal319_tree=null;
		Object char_literal321_tree=null;
		Object char_literal323_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:498:5: ( type annotationMethodOrConstantRest ';' | normalClassDeclaration ( ';' )? | normalInterfaceDeclaration ( ';' )? | enumDeclaration ( ';' )? | annotationTypeDeclaration ( ';' )? )
			int alt106=5;
			switch ( input.LA(1) ) {
			case Identifier:
			case 60:
			case 62:
			case 65:
			case 70:
			case 76:
			case 82:
			case 84:
			case 93:
				{
				alt106=1;
				}
				break;
			case 66:
				{
				alt106=2;
				}
				break;
			case 83:
				{
				alt106=3;
				}
				break;
			case ENUM:
				{
				alt106=4;
				}
				break;
			case 54:
				{
				alt106=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:498:9: type annotationMethodOrConstantRest ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_in_annotationTypeElementRest3347);
					type313=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type313.getTree());

					pushFollow(FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest3349);
					annotationMethodOrConstantRest314=annotationMethodOrConstantRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationMethodOrConstantRest314.getTree());

					char_literal315=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3351); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal315_tree = (Object)adaptor.create(char_literal315);
					adaptor.addChild(root_0, char_literal315_tree);
					}

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:499:9: normalClassDeclaration ( ';' )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_normalClassDeclaration_in_annotationTypeElementRest3361);
					normalClassDeclaration316=normalClassDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, normalClassDeclaration316.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:499:32: ( ';' )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==48) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:499:32: ';'
							{
							char_literal317=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3363); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal317_tree = (Object)adaptor.create(char_literal317);
							adaptor.addChild(root_0, char_literal317_tree);
							}

							}
							break;

					}

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:500:9: normalInterfaceDeclaration ( ';' )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest3374);
					normalInterfaceDeclaration318=normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, normalInterfaceDeclaration318.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:500:36: ( ';' )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==48) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:500:36: ';'
							{
							char_literal319=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3376); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal319_tree = (Object)adaptor.create(char_literal319);
							adaptor.addChild(root_0, char_literal319_tree);
							}

							}
							break;

					}

					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:501:9: enumDeclaration ( ';' )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enumDeclaration_in_annotationTypeElementRest3387);
					enumDeclaration320=enumDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDeclaration320.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:501:25: ( ';' )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==48) ) {
						alt104=1;
					}
					switch (alt104) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:501:25: ';'
							{
							char_literal321=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3389); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal321_tree = (Object)adaptor.create(char_literal321);
							adaptor.addChild(root_0, char_literal321_tree);
							}

							}
							break;

					}

					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:502:9: annotationTypeDeclaration ( ';' )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest3400);
					annotationTypeDeclaration322=annotationTypeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeDeclaration322.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:502:35: ( ';' )?
					int alt105=2;
					int LA105_0 = input.LA(1);
					if ( (LA105_0==48) ) {
						alt105=1;
					}
					switch (alt105) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:502:35: ';'
							{
							char_literal323=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3402); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal323_tree = (Object)adaptor.create(char_literal323);
							adaptor.addChild(root_0, char_literal323_tree);
							}

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, annotationTypeElementRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationTypeElementRest"


	public static class annotationMethodOrConstantRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "annotationMethodOrConstantRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:505:1: annotationMethodOrConstantRest : ( annotationMethodRest | annotationConstantRest );
	public final JavaJavaParser.annotationMethodOrConstantRest_return annotationMethodOrConstantRest() throws RecognitionException {
		JavaJavaParser.annotationMethodOrConstantRest_return retval = new JavaJavaParser.annotationMethodOrConstantRest_return();
		retval.start = input.LT(1);
		int annotationMethodOrConstantRest_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope annotationMethodRest324 =null;
		ParserRuleReturnScope annotationConstantRest325 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:506:5: ( annotationMethodRest | annotationConstantRest )
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==Identifier) ) {
				int LA107_1 = input.LA(2);
				if ( (LA107_1==32) ) {
					alt107=1;
				}
				else if ( (LA107_1==55) ) {
					alt107=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 107, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}

			switch (alt107) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:506:9: annotationMethodRest
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest3426);
					annotationMethodRest324=annotationMethodRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationMethodRest324.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:507:9: annotationConstantRest
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest3436);
					annotationConstantRest325=annotationConstantRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationConstantRest325.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, annotationMethodOrConstantRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationMethodOrConstantRest"


	public static class annotationMethodRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "annotationMethodRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:510:1: annotationMethodRest : Identifier '(' ')' ( defaultValue )? ;
	public final JavaJavaParser.annotationMethodRest_return annotationMethodRest() throws RecognitionException {
		JavaJavaParser.annotationMethodRest_return retval = new JavaJavaParser.annotationMethodRest_return();
		retval.start = input.LT(1);
		int annotationMethodRest_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier326=null;
		Token char_literal327=null;
		Token char_literal328=null;
		ParserRuleReturnScope defaultValue329 =null;

		Object Identifier326_tree=null;
		Object char_literal327_tree=null;
		Object char_literal328_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:511:5: ( Identifier '(' ')' ( defaultValue )? )
			// /media/tony/disk2/_git/cs543/JavaJava.g:511:9: Identifier '(' ')' ( defaultValue )?
			{
			root_0 = (Object)adaptor.nil();


			Identifier326=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationMethodRest3459); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier326_tree = (Object)adaptor.create(Identifier326);
			adaptor.addChild(root_0, Identifier326_tree);
			}

			if ( state.backtracking==0 ) {id((Identifier326!=null?Identifier326.getText():null));}
			char_literal327=(Token)match(input,32,FOLLOW_32_in_annotationMethodRest3463); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal327_tree = (Object)adaptor.create(char_literal327);
			adaptor.addChild(root_0, char_literal327_tree);
			}

			if ( state.backtracking==0 ) {s("(");}
			char_literal328=(Token)match(input,33,FOLLOW_33_in_annotationMethodRest3468); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal328_tree = (Object)adaptor.create(char_literal328);
			adaptor.addChild(root_0, char_literal328_tree);
			}

			if ( state.backtracking==0 ) {s(")");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:511:73: ( defaultValue )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==68) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:511:73: defaultValue
					{
					pushFollow(FOLLOW_defaultValue_in_annotationMethodRest3472);
					defaultValue329=defaultValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultValue329.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, annotationMethodRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationMethodRest"


	public static class annotationConstantRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "annotationConstantRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:514:1: annotationConstantRest : variableDeclarators ;
	public final JavaJavaParser.annotationConstantRest_return annotationConstantRest() throws RecognitionException {
		JavaJavaParser.annotationConstantRest_return retval = new JavaJavaParser.annotationConstantRest_return();
		retval.start = input.LT(1);
		int annotationConstantRest_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope variableDeclarators330 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:515:5: ( variableDeclarators )
			// /media/tony/disk2/_git/cs543/JavaJava.g:515:9: variableDeclarators
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableDeclarators_in_annotationConstantRest3496);
			variableDeclarators330=variableDeclarators();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarators330.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, annotationConstantRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "annotationConstantRest"


	public static class defaultValue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultValue"
	// /media/tony/disk2/_git/cs543/JavaJava.g:518:1: defaultValue : 'default' elementValue ;
	public final JavaJavaParser.defaultValue_return defaultValue() throws RecognitionException {
		JavaJavaParser.defaultValue_return retval = new JavaJavaParser.defaultValue_return();
		retval.start = input.LT(1);
		int defaultValue_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal331=null;
		ParserRuleReturnScope elementValue332 =null;

		Object string_literal331_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:519:5: ( 'default' elementValue )
			// /media/tony/disk2/_git/cs543/JavaJava.g:519:9: 'default' elementValue
			{
			root_0 = (Object)adaptor.nil();


			string_literal331=(Token)match(input,68,FOLLOW_68_in_defaultValue3519); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal331_tree = (Object)adaptor.create(string_literal331);
			adaptor.addChild(root_0, string_literal331_tree);
			}

			if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("default");}
			pushFollow(FOLLOW_elementValue_in_defaultValue3523);
			elementValue332=elementValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue332.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, defaultValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultValue"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /media/tony/disk2/_git/cs543/JavaJava.g:524:1: block : '{' ( blockStatement )* '}' ;
	public final JavaJavaParser.block_return block() throws RecognitionException {
		JavaJavaParser.block_return retval = new JavaJavaParser.block_return();
		retval.start = input.LT(1);
		int block_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal333=null;
		Token char_literal335=null;
		ParserRuleReturnScope blockStatement334 =null;

		Object char_literal333_tree=null;
		Object char_literal335_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:525:5: ( '{' ( blockStatement )* '}' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:525:9: '{' ( blockStatement )* '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal333=(Token)match(input,108,FOLLOW_108_in_block3544); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal333_tree = (Object)adaptor.create(char_literal333);
			adaptor.addChild(root_0, char_literal333_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:525:23: ( blockStatement )*
			loop109:
			while (true) {
				int alt109=2;
				int LA109_0 = input.LA(1);
				if ( (LA109_0==ASSERT||(LA109_0 >= CharacterLiteral && LA109_0 <= ENUM)||LA109_0==FloatingPointLiteral||(LA109_0 >= HexLiteral && LA109_0 <= Identifier)||(LA109_0 >= OctalLiteral && LA109_0 <= StringLiteral)||LA109_0==25||LA109_0==32||(LA109_0 >= 36 && LA109_0 <= 37)||(LA109_0 >= 40 && LA109_0 <= 41)||LA109_0==48||LA109_0==54||(LA109_0 >= 59 && LA109_0 <= 62)||(LA109_0 >= 65 && LA109_0 <= 67)||(LA109_0 >= 69 && LA109_0 <= 70)||(LA109_0 >= 73 && LA109_0 <= 74)||(LA109_0 >= 76 && LA109_0 <= 78)||(LA109_0 >= 82 && LA109_0 <= 84)||(LA109_0 >= 86 && LA109_0 <= 87)||(LA109_0 >= 89 && LA109_0 <= 100)||(LA109_0 >= 103 && LA109_0 <= 105)||(LA109_0 >= 107 && LA109_0 <= 108)||LA109_0==113) ) {
					alt109=1;
				}

				switch (alt109) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:525:23: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_block3548);
					blockStatement334=blockStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement334.getTree());

					}
					break;

				default :
					break loop109;
				}
			}

			char_literal335=(Token)match(input,112,FOLLOW_112_in_block3551); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal335_tree = (Object)adaptor.create(char_literal335);
			adaptor.addChild(root_0, char_literal335_tree);
			}

			if ( state.backtracking==0 ) {s("}");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, block_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "block"


	public static class blockStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "blockStatement"
	// /media/tony/disk2/_git/cs543/JavaJava.g:528:1: blockStatement : ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement );
	public final JavaJavaParser.blockStatement_return blockStatement() throws RecognitionException {
		JavaJavaParser.blockStatement_return retval = new JavaJavaParser.blockStatement_return();
		retval.start = input.LT(1);
		int blockStatement_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope localVariableDeclarationStatement336 =null;
		ParserRuleReturnScope classOrInterfaceDeclaration337 =null;
		ParserRuleReturnScope statement338 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:529:5: ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement )
			int alt110=3;
			switch ( input.LA(1) ) {
			case 74:
				{
				int LA110_1 = input.LA(2);
				if ( (synpred150_JavaJava()) ) {
					alt110=1;
				}
				else if ( (synpred151_JavaJava()) ) {
					alt110=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 110, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 54:
				{
				int LA110_2 = input.LA(2);
				if ( (synpred150_JavaJava()) ) {
					alt110=1;
				}
				else if ( (synpred151_JavaJava()) ) {
					alt110=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 110, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA110_3 = input.LA(2);
				if ( (synpred150_JavaJava()) ) {
					alt110=1;
				}
				else if ( (true) ) {
					alt110=3;
				}

				}
				break;
			case 60:
				{
				int LA110_4 = input.LA(2);
				if ( (synpred150_JavaJava()) ) {
					alt110=1;
				}
				else if ( (true) ) {
					alt110=3;
				}

				}
				break;
			case 65:
				{
				int LA110_5 = input.LA(2);
				if ( (synpred150_JavaJava()) ) {
					alt110=1;
				}
				else if ( (true) ) {
					alt110=3;
				}

				}
				break;
			case 62:
				{
				int LA110_6 = input.LA(2);
				if ( (synpred150_JavaJava()) ) {
					alt110=1;
				}
				else if ( (true) ) {
					alt110=3;
				}

				}
				break;
			case 93:
				{
				int LA110_7 = input.LA(2);
				if ( (synpred150_JavaJava()) ) {
					alt110=1;
				}
				else if ( (true) ) {
					alt110=3;
				}

				}
				break;
			case 82:
				{
				int LA110_8 = input.LA(2);
				if ( (synpred150_JavaJava()) ) {
					alt110=1;
				}
				else if ( (true) ) {
					alt110=3;
				}

				}
				break;
			case 84:
				{
				int LA110_9 = input.LA(2);
				if ( (synpred150_JavaJava()) ) {
					alt110=1;
				}
				else if ( (true) ) {
					alt110=3;
				}

				}
				break;
			case 76:
				{
				int LA110_10 = input.LA(2);
				if ( (synpred150_JavaJava()) ) {
					alt110=1;
				}
				else if ( (true) ) {
					alt110=3;
				}

				}
				break;
			case 70:
				{
				int LA110_11 = input.LA(2);
				if ( (synpred150_JavaJava()) ) {
					alt110=1;
				}
				else if ( (true) ) {
					alt110=3;
				}

				}
				break;
			case ENUM:
			case 59:
			case 66:
			case 83:
			case 89:
			case 90:
			case 91:
			case 94:
			case 95:
				{
				alt110=2;
				}
				break;
			case ASSERT:
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case OctalLiteral:
			case StringLiteral:
			case 25:
			case 32:
			case 36:
			case 37:
			case 40:
			case 41:
			case 48:
			case 61:
			case 67:
			case 69:
			case 73:
			case 77:
			case 78:
			case 86:
			case 87:
			case 92:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
			case 103:
			case 104:
			case 105:
			case 107:
			case 108:
			case 113:
				{
				alt110=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}
			switch (alt110) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:529:10: localVariableDeclarationStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement3577);
					localVariableDeclarationStatement336=localVariableDeclarationStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement336.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:530:9: classOrInterfaceDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement3587);
					classOrInterfaceDeclaration337=classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration337.getTree());

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:531:8: statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_statement_in_blockStatement3596);
					statement338=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement338.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, blockStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "blockStatement"


	public static class localVariableDeclarationStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "localVariableDeclarationStatement"
	// /media/tony/disk2/_git/cs543/JavaJava.g:534:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
	public final JavaJavaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement() throws RecognitionException {
		JavaJavaParser.localVariableDeclarationStatement_return retval = new JavaJavaParser.localVariableDeclarationStatement_return();
		retval.start = input.LT(1);
		int localVariableDeclarationStatement_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal340=null;
		ParserRuleReturnScope localVariableDeclaration339 =null;

		Object char_literal340_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:535:5: ( localVariableDeclaration ';' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:535:10: localVariableDeclaration ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement3621);
			localVariableDeclaration339=localVariableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration339.getTree());

			if ( state.backtracking==0 ) {primitive=false;}
			char_literal340=(Token)match(input,48,FOLLOW_48_in_localVariableDeclarationStatement3624); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal340_tree = (Object)adaptor.create(char_literal340);
			adaptor.addChild(root_0, char_literal340_tree);
			}

			if ( state.backtracking==0 ) {s(";");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, localVariableDeclarationStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "localVariableDeclarationStatement"


	public static class localVariableDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "localVariableDeclaration"
	// /media/tony/disk2/_git/cs543/JavaJava.g:538:1: localVariableDeclaration : variableModifiers type variableDeclarators ;
	public final JavaJavaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
		JavaJavaParser.localVariableDeclaration_return retval = new JavaJavaParser.localVariableDeclaration_return();
		retval.start = input.LT(1);
		int localVariableDeclaration_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope variableModifiers341 =null;
		ParserRuleReturnScope type342 =null;
		ParserRuleReturnScope variableDeclarators343 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:539:5: ( variableModifiers type variableDeclarators )
			// /media/tony/disk2/_git/cs543/JavaJava.g:539:9: variableModifiers type variableDeclarators
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableModifiers_in_localVariableDeclaration3645);
			variableModifiers341=variableModifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers341.getTree());

			pushFollow(FOLLOW_type_in_localVariableDeclaration3647);
			type342=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type342.getTree());

			pushFollow(FOLLOW_variableDeclarators_in_localVariableDeclaration3649);
			variableDeclarators343=variableDeclarators();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarators343.getTree());

			if ( state.backtracking==0 ) {primitive = false;}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, localVariableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "localVariableDeclaration"


	public static class variableModifiers_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableModifiers"
	// /media/tony/disk2/_git/cs543/JavaJava.g:542:1: variableModifiers : ( variableModifier )* ;
	public final JavaJavaParser.variableModifiers_return variableModifiers() throws RecognitionException {
		JavaJavaParser.variableModifiers_return retval = new JavaJavaParser.variableModifiers_return();
		retval.start = input.LT(1);
		int variableModifiers_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope variableModifier344 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:543:5: ( ( variableModifier )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:543:9: ( variableModifier )*
			{
			root_0 = (Object)adaptor.nil();


			// /media/tony/disk2/_git/cs543/JavaJava.g:543:9: ( variableModifier )*
			loop111:
			while (true) {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==54||LA111_0==74) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:543:9: variableModifier
					{
					pushFollow(FOLLOW_variableModifier_in_variableModifiers3674);
					variableModifier344=variableModifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifier344.getTree());

					}
					break;

				default :
					break loop111;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, variableModifiers_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableModifiers"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /media/tony/disk2/_git/cs543/JavaJava.g:546:1: statement : ( block | ASSERT expression ( ':' expression )? ';' | 'if' parExpression statement ( options {k=1; } : 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement );
	public final JavaJavaParser.statement_return statement() throws RecognitionException {
		JavaJavaParser.statement_return retval = new JavaJavaParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		Object root_0 = null;

		Token ASSERT346=null;
		Token char_literal348=null;
		Token char_literal350=null;
		Token string_literal351=null;
		Token string_literal354=null;
		Token string_literal356=null;
		Token char_literal357=null;
		Token char_literal359=null;
		Token string_literal361=null;
		Token string_literal364=null;
		Token string_literal366=null;
		Token char_literal368=null;
		Token string_literal369=null;
		Token string_literal372=null;
		Token string_literal375=null;
		Token string_literal377=null;
		Token char_literal379=null;
		Token char_literal381=null;
		Token string_literal382=null;
		Token string_literal385=null;
		Token char_literal387=null;
		Token string_literal388=null;
		Token char_literal390=null;
		Token string_literal391=null;
		Token Identifier392=null;
		Token char_literal393=null;
		Token string_literal394=null;
		Token Identifier395=null;
		Token char_literal396=null;
		Token char_literal397=null;
		Token char_literal399=null;
		Token Identifier400=null;
		Token char_literal401=null;
		ParserRuleReturnScope block345 =null;
		ParserRuleReturnScope expression347 =null;
		ParserRuleReturnScope expression349 =null;
		ParserRuleReturnScope parExpression352 =null;
		ParserRuleReturnScope statement353 =null;
		ParserRuleReturnScope statement355 =null;
		ParserRuleReturnScope forControl358 =null;
		ParserRuleReturnScope statement360 =null;
		ParserRuleReturnScope parExpression362 =null;
		ParserRuleReturnScope statement363 =null;
		ParserRuleReturnScope statement365 =null;
		ParserRuleReturnScope parExpression367 =null;
		ParserRuleReturnScope block370 =null;
		ParserRuleReturnScope catches371 =null;
		ParserRuleReturnScope block373 =null;
		ParserRuleReturnScope catches374 =null;
		ParserRuleReturnScope block376 =null;
		ParserRuleReturnScope parExpression378 =null;
		ParserRuleReturnScope switchBlockStatementGroups380 =null;
		ParserRuleReturnScope parExpression383 =null;
		ParserRuleReturnScope block384 =null;
		ParserRuleReturnScope expression386 =null;
		ParserRuleReturnScope expression389 =null;
		ParserRuleReturnScope statementExpression398 =null;
		ParserRuleReturnScope statement402 =null;

		Object ASSERT346_tree=null;
		Object char_literal348_tree=null;
		Object char_literal350_tree=null;
		Object string_literal351_tree=null;
		Object string_literal354_tree=null;
		Object string_literal356_tree=null;
		Object char_literal357_tree=null;
		Object char_literal359_tree=null;
		Object string_literal361_tree=null;
		Object string_literal364_tree=null;
		Object string_literal366_tree=null;
		Object char_literal368_tree=null;
		Object string_literal369_tree=null;
		Object string_literal372_tree=null;
		Object string_literal375_tree=null;
		Object string_literal377_tree=null;
		Object char_literal379_tree=null;
		Object char_literal381_tree=null;
		Object string_literal382_tree=null;
		Object string_literal385_tree=null;
		Object char_literal387_tree=null;
		Object string_literal388_tree=null;
		Object char_literal390_tree=null;
		Object string_literal391_tree=null;
		Object Identifier392_tree=null;
		Object char_literal393_tree=null;
		Object string_literal394_tree=null;
		Object Identifier395_tree=null;
		Object char_literal396_tree=null;
		Object char_literal397_tree=null;
		Object char_literal399_tree=null;
		Object Identifier400_tree=null;
		Object char_literal401_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:547:5: ( block | ASSERT expression ( ':' expression )? ';' | 'if' parExpression statement ( options {k=1; } : 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement )
			int alt118=16;
			switch ( input.LA(1) ) {
			case 108:
				{
				alt118=1;
				}
				break;
			case ASSERT:
				{
				alt118=2;
				}
				break;
			case 78:
				{
				alt118=3;
				}
				break;
			case 77:
				{
				alt118=4;
				}
				break;
			case 107:
				{
				alt118=5;
				}
				break;
			case 69:
				{
				alt118=6;
				}
				break;
			case 104:
				{
				alt118=7;
				}
				break;
			case 97:
				{
				alt118=8;
				}
				break;
			case 98:
				{
				alt118=9;
				}
				break;
			case 92:
				{
				alt118=10;
				}
				break;
			case 100:
				{
				alt118=11;
				}
				break;
			case 61:
				{
				alt118=12;
				}
				break;
			case 67:
				{
				alt118=13;
				}
				break;
			case 48:
				{
				alt118=14;
				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case OctalLiteral:
			case StringLiteral:
			case 25:
			case 32:
			case 36:
			case 37:
			case 40:
			case 41:
			case 60:
			case 62:
			case 65:
			case 70:
			case 73:
			case 76:
			case 82:
			case 84:
			case 86:
			case 87:
			case 93:
			case 96:
			case 99:
			case 103:
			case 105:
			case 113:
				{
				alt118=15;
				}
				break;
			case Identifier:
				{
				int LA118_16 = input.LA(2);
				if ( ((LA118_16 >= 26 && LA118_16 <= 32)||(LA118_16 >= 34 && LA118_16 <= 38)||(LA118_16 >= 40 && LA118_16 <= 43)||(LA118_16 >= 45 && LA118_16 <= 46)||(LA118_16 >= 48 && LA118_16 <= 53)||LA118_16==55||(LA118_16 >= 57 && LA118_16 <= 58)||LA118_16==81||(LA118_16 >= 109 && LA118_16 <= 111)) ) {
					alt118=15;
				}
				else if ( (LA118_16==47) ) {
					alt118=16;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 118, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}
			switch (alt118) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:547:7: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_statement3692);
					block345=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block345.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:548:9: ASSERT expression ( ':' expression )? ';'
					{
					root_0 = (Object)adaptor.nil();


					ASSERT346=(Token)match(input,ASSERT,FOLLOW_ASSERT_in_statement3702); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSERT346_tree = (Object)adaptor.create(ASSERT346);
					adaptor.addChild(root_0, ASSERT346_tree);
					}

					pushFollow(FOLLOW_expression_in_statement3704);
					expression347=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression347.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:548:27: ( ':' expression )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==47) ) {
						alt112=1;
					}
					switch (alt112) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:548:28: ':' expression
							{
							char_literal348=(Token)match(input,47,FOLLOW_47_in_statement3707); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal348_tree = (Object)adaptor.create(char_literal348);
							adaptor.addChild(root_0, char_literal348_tree);
							}

							pushFollow(FOLLOW_expression_in_statement3709);
							expression349=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression349.getTree());

							}
							break;

					}

					char_literal350=(Token)match(input,48,FOLLOW_48_in_statement3713); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal350_tree = (Object)adaptor.create(char_literal350);
					adaptor.addChild(root_0, char_literal350_tree);
					}

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:549:9: 'if' parExpression statement ( options {k=1; } : 'else' statement )?
					{
					root_0 = (Object)adaptor.nil();


					string_literal351=(Token)match(input,78,FOLLOW_78_in_statement3723); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal351_tree = (Object)adaptor.create(string_literal351);
					adaptor.addChild(root_0, string_literal351_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("if"); mmc++;}
					pushFollow(FOLLOW_parExpression_in_statement3726);
					parExpression352=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression352.getTree());

					pushFollow(FOLLOW_statement_in_statement3728);
					statement353=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement353.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:549:99: ( options {k=1; } : 'else' statement )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==71) ) {
						int LA113_1 = input.LA(2);
						if ( (synpred156_JavaJava()) ) {
							alt113=1;
						}
					}
					switch (alt113) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:549:115: 'else' statement
							{
							string_literal354=(Token)match(input,71,FOLLOW_71_in_statement3738); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal354_tree = (Object)adaptor.create(string_literal354);
							adaptor.addChild(root_0, string_literal354_tree);
							}

							if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("else");}
							pushFollow(FOLLOW_statement_in_statement3742);
							statement355=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, statement355.getTree());

							}
							break;

					}

					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:550:9: 'for' '(' forControl ')' statement
					{
					root_0 = (Object)adaptor.nil();


					string_literal356=(Token)match(input,77,FOLLOW_77_in_statement3754); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal356_tree = (Object)adaptor.create(string_literal356);
					adaptor.addChild(root_0, string_literal356_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("for");mmc++;}
					char_literal357=(Token)match(input,32,FOLLOW_32_in_statement3758); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal357_tree = (Object)adaptor.create(char_literal357);
					adaptor.addChild(root_0, char_literal357_tree);
					}

					if ( state.backtracking==0 ) {s("(");}
					pushFollow(FOLLOW_forControl_in_statement3762);
					forControl358=forControl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forControl358.getTree());

					char_literal359=(Token)match(input,33,FOLLOW_33_in_statement3764); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal359_tree = (Object)adaptor.create(char_literal359);
					adaptor.addChild(root_0, char_literal359_tree);
					}

					if ( state.backtracking==0 ) {s("}");}
					pushFollow(FOLLOW_statement_in_statement3768);
					statement360=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement360.getTree());

					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:551:9: 'while' parExpression statement
					{
					root_0 = (Object)adaptor.nil();


					string_literal361=(Token)match(input,107,FOLLOW_107_in_statement3778); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal361_tree = (Object)adaptor.create(string_literal361);
					adaptor.addChild(root_0, string_literal361_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("while"); mmc++;}
					pushFollow(FOLLOW_parExpression_in_statement3781);
					parExpression362=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression362.getTree());

					pushFollow(FOLLOW_statement_in_statement3784);
					statement363=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement363.getTree());

					}
					break;
				case 6 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:552:9: 'do' statement 'while' parExpression ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal364=(Token)match(input,69,FOLLOW_69_in_statement3794); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal364_tree = (Object)adaptor.create(string_literal364);
					adaptor.addChild(root_0, string_literal364_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("do");mmc++;}
					pushFollow(FOLLOW_statement_in_statement3797);
					statement365=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement365.getTree());

					string_literal366=(Token)match(input,107,FOLLOW_107_in_statement3799); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal366_tree = (Object)adaptor.create(string_literal366);
					adaptor.addChild(root_0, string_literal366_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("while");}
					pushFollow(FOLLOW_parExpression_in_statement3803);
					parExpression367=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression367.getTree());

					char_literal368=(Token)match(input,48,FOLLOW_48_in_statement3805); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal368_tree = (Object)adaptor.create(char_literal368);
					adaptor.addChild(root_0, char_literal368_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 7 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:553:9: 'try' block ( catches 'finally' block | catches | 'finally' block )
					{
					root_0 = (Object)adaptor.nil();


					string_literal369=(Token)match(input,104,FOLLOW_104_in_statement3817); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal369_tree = (Object)adaptor.create(string_literal369);
					adaptor.addChild(root_0, string_literal369_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("try");}
					pushFollow(FOLLOW_block_in_statement3820);
					block370=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block370.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:554:9: ( catches 'finally' block | catches | 'finally' block )
					int alt114=3;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==64) ) {
						int LA114_1 = input.LA(2);
						if ( (synpred161_JavaJava()) ) {
							alt114=1;
						}
						else if ( (synpred162_JavaJava()) ) {
							alt114=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 114, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA114_0==75) ) {
						alt114=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 114, 0, input);
						throw nvae;
					}

					switch (alt114) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:554:11: catches 'finally' block
							{
							pushFollow(FOLLOW_catches_in_statement3832);
							catches371=catches();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, catches371.getTree());

							string_literal372=(Token)match(input,75,FOLLOW_75_in_statement3834); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal372_tree = (Object)adaptor.create(string_literal372);
							adaptor.addChild(root_0, string_literal372_tree);
							}

							if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("finally");}
							pushFollow(FOLLOW_block_in_statement3837);
							block373=block();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, block373.getTree());

							}
							break;
						case 2 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:555:11: catches
							{
							pushFollow(FOLLOW_catches_in_statement3849);
							catches374=catches();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, catches374.getTree());

							}
							break;
						case 3 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:556:13: 'finally' block
							{
							string_literal375=(Token)match(input,75,FOLLOW_75_in_statement3863); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal375_tree = (Object)adaptor.create(string_literal375);
							adaptor.addChild(root_0, string_literal375_tree);
							}

							if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("finally");}
							pushFollow(FOLLOW_block_in_statement3866);
							block376=block();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, block376.getTree());

							}
							break;

					}

					}
					break;
				case 8 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:558:9: 'switch' parExpression '{' switchBlockStatementGroups '}'
					{
					root_0 = (Object)adaptor.nil();


					string_literal377=(Token)match(input,97,FOLLOW_97_in_statement3886); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal377_tree = (Object)adaptor.create(string_literal377);
					adaptor.addChild(root_0, string_literal377_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("switch");}
					pushFollow(FOLLOW_parExpression_in_statement3890);
					parExpression378=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression378.getTree());

					char_literal379=(Token)match(input,108,FOLLOW_108_in_statement3892); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal379_tree = (Object)adaptor.create(char_literal379);
					adaptor.addChild(root_0, char_literal379_tree);
					}

					pushFollow(FOLLOW_switchBlockStatementGroups_in_statement3894);
					switchBlockStatementGroups380=switchBlockStatementGroups();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlockStatementGroups380.getTree());

					char_literal381=(Token)match(input,112,FOLLOW_112_in_statement3896); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal381_tree = (Object)adaptor.create(char_literal381);
					adaptor.addChild(root_0, char_literal381_tree);
					}

					}
					break;
				case 9 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:559:9: 'synchronized' parExpression block
					{
					root_0 = (Object)adaptor.nil();


					string_literal382=(Token)match(input,98,FOLLOW_98_in_statement3906); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal382_tree = (Object)adaptor.create(string_literal382);
					adaptor.addChild(root_0, string_literal382_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("synchronized");}
					pushFollow(FOLLOW_parExpression_in_statement3909);
					parExpression383=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression383.getTree());

					pushFollow(FOLLOW_block_in_statement3911);
					block384=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block384.getTree());

					}
					break;
				case 10 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:560:9: 'return' ( expression )? ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal385=(Token)match(input,92,FOLLOW_92_in_statement3921); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal385_tree = (Object)adaptor.create(string_literal385);
					adaptor.addChild(root_0, string_literal385_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("return");}
					// /media/tony/disk2/_git/cs543/JavaJava.g:560:77: ( expression )?
					int alt115=2;
					int LA115_0 = input.LA(1);
					if ( ((LA115_0 >= CharacterLiteral && LA115_0 <= DecimalLiteral)||LA115_0==FloatingPointLiteral||(LA115_0 >= HexLiteral && LA115_0 <= Identifier)||(LA115_0 >= OctalLiteral && LA115_0 <= StringLiteral)||LA115_0==25||LA115_0==32||(LA115_0 >= 36 && LA115_0 <= 37)||(LA115_0 >= 40 && LA115_0 <= 41)||LA115_0==60||LA115_0==62||LA115_0==65||LA115_0==70||LA115_0==73||LA115_0==76||LA115_0==82||LA115_0==84||(LA115_0 >= 86 && LA115_0 <= 87)||LA115_0==93||LA115_0==96||LA115_0==99||LA115_0==103||LA115_0==105||LA115_0==113) ) {
						alt115=1;
					}
					switch (alt115) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:560:77: expression
							{
							pushFollow(FOLLOW_expression_in_statement3925);
							expression386=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression386.getTree());

							}
							break;

					}

					char_literal387=(Token)match(input,48,FOLLOW_48_in_statement3928); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal387_tree = (Object)adaptor.create(char_literal387);
					adaptor.addChild(root_0, char_literal387_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 11 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:561:9: 'throw' expression ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal388=(Token)match(input,100,FOLLOW_100_in_statement3940); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal388_tree = (Object)adaptor.create(string_literal388);
					adaptor.addChild(root_0, string_literal388_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throw");}
					pushFollow(FOLLOW_expression_in_statement3943);
					expression389=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression389.getTree());

					char_literal390=(Token)match(input,48,FOLLOW_48_in_statement3945); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal390_tree = (Object)adaptor.create(char_literal390);
					adaptor.addChild(root_0, char_literal390_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 12 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:562:9: 'break' ( Identifier )? ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal391=(Token)match(input,61,FOLLOW_61_in_statement3957); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal391_tree = (Object)adaptor.create(string_literal391);
					adaptor.addChild(root_0, string_literal391_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("break"); System.out.println("FOUND BREAK");}
					// /media/tony/disk2/_git/cs543/JavaJava.g:562:109: ( Identifier )?
					int alt116=2;
					int LA116_0 = input.LA(1);
					if ( (LA116_0==Identifier) ) {
						alt116=1;
					}
					switch (alt116) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:562:109: Identifier
							{
							Identifier392=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement3960); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Identifier392_tree = (Object)adaptor.create(Identifier392);
							adaptor.addChild(root_0, Identifier392_tree);
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {if(primitive) id((Identifier392!=null?Identifier392.getText():null));}
					char_literal393=(Token)match(input,48,FOLLOW_48_in_statement3964); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal393_tree = (Object)adaptor.create(char_literal393);
					adaptor.addChild(root_0, char_literal393_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 13 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:563:9: 'continue' ( Identifier )? ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal394=(Token)match(input,67,FOLLOW_67_in_statement3976); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal394_tree = (Object)adaptor.create(string_literal394);
					adaptor.addChild(root_0, string_literal394_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("continue");}
					// /media/tony/disk2/_git/cs543/JavaJava.g:563:81: ( Identifier )?
					int alt117=2;
					int LA117_0 = input.LA(1);
					if ( (LA117_0==Identifier) ) {
						alt117=1;
					}
					switch (alt117) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:563:81: Identifier
							{
							Identifier395=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement3980); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Identifier395_tree = (Object)adaptor.create(Identifier395);
							adaptor.addChild(root_0, Identifier395_tree);
							}

							}
							break;

					}

					if ( state.backtracking==0 ) { id((Identifier395!=null?Identifier395.getText():null));}
					char_literal396=(Token)match(input,48,FOLLOW_48_in_statement3985); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal396_tree = (Object)adaptor.create(char_literal396);
					adaptor.addChild(root_0, char_literal396_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 14 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:564:9: ';'
					{
					root_0 = (Object)adaptor.nil();


					char_literal397=(Token)match(input,48,FOLLOW_48_in_statement3997); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal397_tree = (Object)adaptor.create(char_literal397);
					adaptor.addChild(root_0, char_literal397_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 15 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:565:9: statementExpression ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_statementExpression_in_statement4009);
					statementExpression398=statementExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statementExpression398.getTree());

					char_literal399=(Token)match(input,48,FOLLOW_48_in_statement4011); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal399_tree = (Object)adaptor.create(char_literal399);
					adaptor.addChild(root_0, char_literal399_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 16 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:566:9: Identifier ':' statement
					{
					root_0 = (Object)adaptor.nil();


					Identifier400=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement4024); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier400_tree = (Object)adaptor.create(Identifier400);
					adaptor.addChild(root_0, Identifier400_tree);
					}

					if ( state.backtracking==0 ) {if(primitive) id((Identifier400!=null?Identifier400.getText():null));}
					char_literal401=(Token)match(input,47,FOLLOW_47_in_statement4028); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal401_tree = (Object)adaptor.create(char_literal401);
					adaptor.addChild(root_0, char_literal401_tree);
					}

					pushFollow(FOLLOW_statement_in_statement4030);
					statement402=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement402.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class catches_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "catches"
	// /media/tony/disk2/_git/cs543/JavaJava.g:569:1: catches : catchClause ( catchClause )* ;
	public final JavaJavaParser.catches_return catches() throws RecognitionException {
		JavaJavaParser.catches_return retval = new JavaJavaParser.catches_return();
		retval.start = input.LT(1);
		int catches_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope catchClause403 =null;
		ParserRuleReturnScope catchClause404 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:570:5: ( catchClause ( catchClause )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:570:9: catchClause ( catchClause )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_catchClause_in_catches4053);
			catchClause403=catchClause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClause403.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:570:21: ( catchClause )*
			loop119:
			while (true) {
				int alt119=2;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==64) ) {
					alt119=1;
				}

				switch (alt119) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:570:22: catchClause
					{
					pushFollow(FOLLOW_catchClause_in_catches4056);
					catchClause404=catchClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClause404.getTree());

					}
					break;

				default :
					break loop119;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, catches_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "catches"


	public static class catchClause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "catchClause"
	// /media/tony/disk2/_git/cs543/JavaJava.g:573:1: catchClause : 'catch' '(' formalParameter ')' block ;
	public final JavaJavaParser.catchClause_return catchClause() throws RecognitionException {
		JavaJavaParser.catchClause_return retval = new JavaJavaParser.catchClause_return();
		retval.start = input.LT(1);
		int catchClause_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal405=null;
		Token char_literal406=null;
		Token char_literal408=null;
		ParserRuleReturnScope formalParameter407 =null;
		ParserRuleReturnScope block409 =null;

		Object string_literal405_tree=null;
		Object char_literal406_tree=null;
		Object char_literal408_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:574:5: ( 'catch' '(' formalParameter ')' block )
			// /media/tony/disk2/_git/cs543/JavaJava.g:574:9: 'catch' '(' formalParameter ')' block
			{
			root_0 = (Object)adaptor.nil();


			string_literal405=(Token)match(input,64,FOLLOW_64_in_catchClause4081); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal405_tree = (Object)adaptor.create(string_literal405);
			adaptor.addChild(root_0, string_literal405_tree);
			}

			if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("catch");}
			char_literal406=(Token)match(input,32,FOLLOW_32_in_catchClause4084); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal406_tree = (Object)adaptor.create(char_literal406);
			adaptor.addChild(root_0, char_literal406_tree);
			}

			if ( state.backtracking==0 ) {s("(");}
			pushFollow(FOLLOW_formalParameter_in_catchClause4088);
			formalParameter407=formalParameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameter407.getTree());

			char_literal408=(Token)match(input,33,FOLLOW_33_in_catchClause4090); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal408_tree = (Object)adaptor.create(char_literal408);
			adaptor.addChild(root_0, char_literal408_tree);
			}

			if ( state.backtracking==0 ) {s(")");}
			pushFollow(FOLLOW_block_in_catchClause4094);
			block409=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block409.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 92, catchClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "catchClause"


	public static class formalParameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParameter"
	// /media/tony/disk2/_git/cs543/JavaJava.g:577:1: formalParameter : variableModifiers type variableDeclaratorId ;
	public final JavaJavaParser.formalParameter_return formalParameter() throws RecognitionException {
		JavaJavaParser.formalParameter_return retval = new JavaJavaParser.formalParameter_return();
		retval.start = input.LT(1);
		int formalParameter_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope variableModifiers410 =null;
		ParserRuleReturnScope type411 =null;
		ParserRuleReturnScope variableDeclaratorId412 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:578:5: ( variableModifiers type variableDeclaratorId )
			// /media/tony/disk2/_git/cs543/JavaJava.g:578:9: variableModifiers type variableDeclaratorId
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableModifiers_in_formalParameter4113);
			variableModifiers410=variableModifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers410.getTree());

			pushFollow(FOLLOW_type_in_formalParameter4115);
			type411=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type411.getTree());

			pushFollow(FOLLOW_variableDeclaratorId_in_formalParameter4117);
			variableDeclaratorId412=variableDeclaratorId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId412.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 93, formalParameter_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formalParameter"


	public static class switchBlockStatementGroups_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchBlockStatementGroups"
	// /media/tony/disk2/_git/cs543/JavaJava.g:581:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
	public final JavaJavaParser.switchBlockStatementGroups_return switchBlockStatementGroups() throws RecognitionException {
		JavaJavaParser.switchBlockStatementGroups_return retval = new JavaJavaParser.switchBlockStatementGroups_return();
		retval.start = input.LT(1);
		int switchBlockStatementGroups_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope switchBlockStatementGroup413 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:582:5: ( ( switchBlockStatementGroup )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:582:9: ( switchBlockStatementGroup )*
			{
			root_0 = (Object)adaptor.nil();


			// /media/tony/disk2/_git/cs543/JavaJava.g:582:9: ( switchBlockStatementGroup )*
			loop120:
			while (true) {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==63||LA120_0==68) ) {
					alt120=1;
				}

				switch (alt120) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:582:10: switchBlockStatementGroup
					{
					pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups4145);
					switchBlockStatementGroup413=switchBlockStatementGroup();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlockStatementGroup413.getTree());

					}
					break;

				default :
					break loop120;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 94, switchBlockStatementGroups_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchBlockStatementGroups"


	public static class switchBlockStatementGroup_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchBlockStatementGroup"
	// /media/tony/disk2/_git/cs543/JavaJava.g:589:1: switchBlockStatementGroup : ( switchLabel )+ ( blockStatement )* ;
	public final JavaJavaParser.switchBlockStatementGroup_return switchBlockStatementGroup() throws RecognitionException {
		JavaJavaParser.switchBlockStatementGroup_return retval = new JavaJavaParser.switchBlockStatementGroup_return();
		retval.start = input.LT(1);
		int switchBlockStatementGroup_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope switchLabel414 =null;
		ParserRuleReturnScope blockStatement415 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:590:5: ( ( switchLabel )+ ( blockStatement )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:590:9: ( switchLabel )+ ( blockStatement )*
			{
			root_0 = (Object)adaptor.nil();


			// /media/tony/disk2/_git/cs543/JavaJava.g:590:9: ( switchLabel )+
			int cnt121=0;
			loop121:
			while (true) {
				int alt121=2;
				int LA121_0 = input.LA(1);
				if ( (LA121_0==63) ) {
					int LA121_2 = input.LA(2);
					if ( (synpred177_JavaJava()) ) {
						alt121=1;
					}

				}
				else if ( (LA121_0==68) ) {
					int LA121_3 = input.LA(2);
					if ( (synpred177_JavaJava()) ) {
						alt121=1;
					}

				}

				switch (alt121) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:590:9: switchLabel
					{
					pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup4172);
					switchLabel414=switchLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchLabel414.getTree());

					}
					break;

				default :
					if ( cnt121 >= 1 ) break loop121;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(121, input);
					throw eee;
				}
				cnt121++;
			}

			// /media/tony/disk2/_git/cs543/JavaJava.g:590:22: ( blockStatement )*
			loop122:
			while (true) {
				int alt122=2;
				int LA122_0 = input.LA(1);
				if ( (LA122_0==ASSERT||(LA122_0 >= CharacterLiteral && LA122_0 <= ENUM)||LA122_0==FloatingPointLiteral||(LA122_0 >= HexLiteral && LA122_0 <= Identifier)||(LA122_0 >= OctalLiteral && LA122_0 <= StringLiteral)||LA122_0==25||LA122_0==32||(LA122_0 >= 36 && LA122_0 <= 37)||(LA122_0 >= 40 && LA122_0 <= 41)||LA122_0==48||LA122_0==54||(LA122_0 >= 59 && LA122_0 <= 62)||(LA122_0 >= 65 && LA122_0 <= 67)||(LA122_0 >= 69 && LA122_0 <= 70)||(LA122_0 >= 73 && LA122_0 <= 74)||(LA122_0 >= 76 && LA122_0 <= 78)||(LA122_0 >= 82 && LA122_0 <= 84)||(LA122_0 >= 86 && LA122_0 <= 87)||(LA122_0 >= 89 && LA122_0 <= 100)||(LA122_0 >= 103 && LA122_0 <= 105)||(LA122_0 >= 107 && LA122_0 <= 108)||LA122_0==113) ) {
					alt122=1;
				}

				switch (alt122) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:590:22: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup4175);
					blockStatement415=blockStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement415.getTree());

					}
					break;

				default :
					break loop122;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 95, switchBlockStatementGroup_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchBlockStatementGroup"


	public static class switchLabel_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchLabel"
	// /media/tony/disk2/_git/cs543/JavaJava.g:593:1: switchLabel : ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' );
	public final JavaJavaParser.switchLabel_return switchLabel() throws RecognitionException {
		JavaJavaParser.switchLabel_return retval = new JavaJavaParser.switchLabel_return();
		retval.start = input.LT(1);
		int switchLabel_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal416=null;
		Token char_literal418=null;
		Token string_literal419=null;
		Token char_literal421=null;
		Token string_literal422=null;
		Token char_literal423=null;
		ParserRuleReturnScope constantExpression417 =null;
		ParserRuleReturnScope enumConstantName420 =null;

		Object string_literal416_tree=null;
		Object char_literal418_tree=null;
		Object string_literal419_tree=null;
		Object char_literal421_tree=null;
		Object string_literal422_tree=null;
		Object char_literal423_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:594:5: ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' )
			int alt123=3;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==63) ) {
				int LA123_1 = input.LA(2);
				if ( ((LA123_1 >= CharacterLiteral && LA123_1 <= DecimalLiteral)||LA123_1==FloatingPointLiteral||LA123_1==HexLiteral||(LA123_1 >= OctalLiteral && LA123_1 <= StringLiteral)||LA123_1==25||LA123_1==32||(LA123_1 >= 36 && LA123_1 <= 37)||(LA123_1 >= 40 && LA123_1 <= 41)||LA123_1==60||LA123_1==62||LA123_1==65||LA123_1==70||LA123_1==73||LA123_1==76||LA123_1==82||LA123_1==84||(LA123_1 >= 86 && LA123_1 <= 87)||LA123_1==93||LA123_1==96||LA123_1==99||LA123_1==103||LA123_1==105||LA123_1==113) ) {
					alt123=1;
				}
				else if ( (LA123_1==Identifier) ) {
					int LA123_4 = input.LA(3);
					if ( ((LA123_4 >= 26 && LA123_4 <= 32)||(LA123_4 >= 34 && LA123_4 <= 38)||(LA123_4 >= 40 && LA123_4 <= 43)||(LA123_4 >= 45 && LA123_4 <= 46)||(LA123_4 >= 49 && LA123_4 <= 53)||LA123_4==55||(LA123_4 >= 57 && LA123_4 <= 58)||LA123_4==81||(LA123_4 >= 109 && LA123_4 <= 111)) ) {
						alt123=1;
					}
					else if ( (LA123_4==47) ) {
						int LA123_5 = input.LA(4);
						if ( (synpred179_JavaJava()) ) {
							alt123=1;
						}
						else if ( (synpred180_JavaJava()) ) {
							alt123=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 123, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 123, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 123, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA123_0==68) ) {
				alt123=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}

			switch (alt123) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:594:9: 'case' constantExpression ':'
					{
					root_0 = (Object)adaptor.nil();


					string_literal416=(Token)match(input,63,FOLLOW_63_in_switchLabel4199); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal416_tree = (Object)adaptor.create(string_literal416);
					adaptor.addChild(root_0, string_literal416_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("case");mmc++;}
					pushFollow(FOLLOW_constantExpression_in_switchLabel4202);
					constantExpression417=constantExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constantExpression417.getTree());

					char_literal418=(Token)match(input,47,FOLLOW_47_in_switchLabel4204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal418_tree = (Object)adaptor.create(char_literal418);
					adaptor.addChild(root_0, char_literal418_tree);
					}

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:595:9: 'case' enumConstantName ':'
					{
					root_0 = (Object)adaptor.nil();


					string_literal419=(Token)match(input,63,FOLLOW_63_in_switchLabel4214); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal419_tree = (Object)adaptor.create(string_literal419);
					adaptor.addChild(root_0, string_literal419_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("case");mmc++;}
					pushFollow(FOLLOW_enumConstantName_in_switchLabel4218);
					enumConstantName420=enumConstantName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstantName420.getTree());

					char_literal421=(Token)match(input,47,FOLLOW_47_in_switchLabel4220); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal421_tree = (Object)adaptor.create(char_literal421);
					adaptor.addChild(root_0, char_literal421_tree);
					}

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:596:9: 'default' ':'
					{
					root_0 = (Object)adaptor.nil();


					string_literal422=(Token)match(input,68,FOLLOW_68_in_switchLabel4230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal422_tree = (Object)adaptor.create(string_literal422);
					adaptor.addChild(root_0, string_literal422_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("defult");mmc++;}
					char_literal423=(Token)match(input,47,FOLLOW_47_in_switchLabel4234); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal423_tree = (Object)adaptor.create(char_literal423);
					adaptor.addChild(root_0, char_literal423_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, switchLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchLabel"


	public static class forControl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forControl"
	// /media/tony/disk2/_git/cs543/JavaJava.g:599:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );
	public final JavaJavaParser.forControl_return forControl() throws RecognitionException {
		JavaJavaParser.forControl_return retval = new JavaJavaParser.forControl_return();
		retval.start = input.LT(1);
		int forControl_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal426=null;
		Token char_literal428=null;
		ParserRuleReturnScope enhancedForControl424 =null;
		ParserRuleReturnScope forInit425 =null;
		ParserRuleReturnScope expression427 =null;
		ParserRuleReturnScope forUpdate429 =null;

		Object char_literal426_tree=null;
		Object char_literal428_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:601:5: ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? )
			int alt127=2;
			alt127 = dfa127.predict(input);
			switch (alt127) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:601:9: enhancedForControl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enhancedForControl_in_forControl4265);
					enhancedForControl424=enhancedForControl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enhancedForControl424.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:602:9: ( forInit )? ';' ( expression )? ';' ( forUpdate )?
					{
					root_0 = (Object)adaptor.nil();


					// /media/tony/disk2/_git/cs543/JavaJava.g:602:9: ( forInit )?
					int alt124=2;
					int LA124_0 = input.LA(1);
					if ( ((LA124_0 >= CharacterLiteral && LA124_0 <= DecimalLiteral)||LA124_0==FloatingPointLiteral||(LA124_0 >= HexLiteral && LA124_0 <= Identifier)||(LA124_0 >= OctalLiteral && LA124_0 <= StringLiteral)||LA124_0==25||LA124_0==32||(LA124_0 >= 36 && LA124_0 <= 37)||(LA124_0 >= 40 && LA124_0 <= 41)||LA124_0==54||LA124_0==60||LA124_0==62||LA124_0==65||LA124_0==70||(LA124_0 >= 73 && LA124_0 <= 74)||LA124_0==76||LA124_0==82||LA124_0==84||(LA124_0 >= 86 && LA124_0 <= 87)||LA124_0==93||LA124_0==96||LA124_0==99||LA124_0==103||LA124_0==105||LA124_0==113) ) {
						alt124=1;
					}
					switch (alt124) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:602:9: forInit
							{
							pushFollow(FOLLOW_forInit_in_forControl4275);
							forInit425=forInit();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit425.getTree());

							}
							break;

					}

					char_literal426=(Token)match(input,48,FOLLOW_48_in_forControl4278); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal426_tree = (Object)adaptor.create(char_literal426);
					adaptor.addChild(root_0, char_literal426_tree);
					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:602:22: ( expression )?
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( ((LA125_0 >= CharacterLiteral && LA125_0 <= DecimalLiteral)||LA125_0==FloatingPointLiteral||(LA125_0 >= HexLiteral && LA125_0 <= Identifier)||(LA125_0 >= OctalLiteral && LA125_0 <= StringLiteral)||LA125_0==25||LA125_0==32||(LA125_0 >= 36 && LA125_0 <= 37)||(LA125_0 >= 40 && LA125_0 <= 41)||LA125_0==60||LA125_0==62||LA125_0==65||LA125_0==70||LA125_0==73||LA125_0==76||LA125_0==82||LA125_0==84||(LA125_0 >= 86 && LA125_0 <= 87)||LA125_0==93||LA125_0==96||LA125_0==99||LA125_0==103||LA125_0==105||LA125_0==113) ) {
						alt125=1;
					}
					switch (alt125) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:602:22: expression
							{
							pushFollow(FOLLOW_expression_in_forControl4280);
							expression427=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression427.getTree());

							}
							break;

					}

					char_literal428=(Token)match(input,48,FOLLOW_48_in_forControl4283); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal428_tree = (Object)adaptor.create(char_literal428);
					adaptor.addChild(root_0, char_literal428_tree);
					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:602:38: ( forUpdate )?
					int alt126=2;
					int LA126_0 = input.LA(1);
					if ( ((LA126_0 >= CharacterLiteral && LA126_0 <= DecimalLiteral)||LA126_0==FloatingPointLiteral||(LA126_0 >= HexLiteral && LA126_0 <= Identifier)||(LA126_0 >= OctalLiteral && LA126_0 <= StringLiteral)||LA126_0==25||LA126_0==32||(LA126_0 >= 36 && LA126_0 <= 37)||(LA126_0 >= 40 && LA126_0 <= 41)||LA126_0==60||LA126_0==62||LA126_0==65||LA126_0==70||LA126_0==73||LA126_0==76||LA126_0==82||LA126_0==84||(LA126_0 >= 86 && LA126_0 <= 87)||LA126_0==93||LA126_0==96||LA126_0==99||LA126_0==103||LA126_0==105||LA126_0==113) ) {
						alt126=1;
					}
					switch (alt126) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:602:38: forUpdate
							{
							pushFollow(FOLLOW_forUpdate_in_forControl4285);
							forUpdate429=forUpdate();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate429.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, forControl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forControl"


	public static class forInit_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// /media/tony/disk2/_git/cs543/JavaJava.g:605:1: forInit : ( localVariableDeclaration | expressionList );
	public final JavaJavaParser.forInit_return forInit() throws RecognitionException {
		JavaJavaParser.forInit_return retval = new JavaJavaParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope localVariableDeclaration430 =null;
		ParserRuleReturnScope expressionList431 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:606:5: ( localVariableDeclaration | expressionList )
			int alt128=2;
			switch ( input.LA(1) ) {
			case 54:
			case 74:
				{
				alt128=1;
				}
				break;
			case Identifier:
				{
				int LA128_3 = input.LA(2);
				if ( (synpred185_JavaJava()) ) {
					alt128=1;
				}
				else if ( (true) ) {
					alt128=2;
				}

				}
				break;
			case 60:
				{
				int LA128_4 = input.LA(2);
				if ( (synpred185_JavaJava()) ) {
					alt128=1;
				}
				else if ( (true) ) {
					alt128=2;
				}

				}
				break;
			case 65:
				{
				int LA128_5 = input.LA(2);
				if ( (synpred185_JavaJava()) ) {
					alt128=1;
				}
				else if ( (true) ) {
					alt128=2;
				}

				}
				break;
			case 62:
				{
				int LA128_6 = input.LA(2);
				if ( (synpred185_JavaJava()) ) {
					alt128=1;
				}
				else if ( (true) ) {
					alt128=2;
				}

				}
				break;
			case 93:
				{
				int LA128_7 = input.LA(2);
				if ( (synpred185_JavaJava()) ) {
					alt128=1;
				}
				else if ( (true) ) {
					alt128=2;
				}

				}
				break;
			case 82:
				{
				int LA128_8 = input.LA(2);
				if ( (synpred185_JavaJava()) ) {
					alt128=1;
				}
				else if ( (true) ) {
					alt128=2;
				}

				}
				break;
			case 84:
				{
				int LA128_9 = input.LA(2);
				if ( (synpred185_JavaJava()) ) {
					alt128=1;
				}
				else if ( (true) ) {
					alt128=2;
				}

				}
				break;
			case 76:
				{
				int LA128_10 = input.LA(2);
				if ( (synpred185_JavaJava()) ) {
					alt128=1;
				}
				else if ( (true) ) {
					alt128=2;
				}

				}
				break;
			case 70:
				{
				int LA128_11 = input.LA(2);
				if ( (synpred185_JavaJava()) ) {
					alt128=1;
				}
				else if ( (true) ) {
					alt128=2;
				}

				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case OctalLiteral:
			case StringLiteral:
			case 25:
			case 32:
			case 36:
			case 37:
			case 40:
			case 41:
			case 73:
			case 86:
			case 87:
			case 96:
			case 99:
			case 103:
			case 105:
			case 113:
				{
				alt128=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}
			switch (alt128) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:606:9: localVariableDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_localVariableDeclaration_in_forInit4305);
					localVariableDeclaration430=localVariableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration430.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:607:9: expressionList
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expressionList_in_forInit4316);
					expressionList431=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList431.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 98, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class enhancedForControl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enhancedForControl"
	// /media/tony/disk2/_git/cs543/JavaJava.g:610:1: enhancedForControl : variableModifiers type Identifier ':' expression ;
	public final JavaJavaParser.enhancedForControl_return enhancedForControl() throws RecognitionException {
		JavaJavaParser.enhancedForControl_return retval = new JavaJavaParser.enhancedForControl_return();
		retval.start = input.LT(1);
		int enhancedForControl_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier434=null;
		Token char_literal435=null;
		ParserRuleReturnScope variableModifiers432 =null;
		ParserRuleReturnScope type433 =null;
		ParserRuleReturnScope expression436 =null;

		Object Identifier434_tree=null;
		Object char_literal435_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:611:5: ( variableModifiers type Identifier ':' expression )
			// /media/tony/disk2/_git/cs543/JavaJava.g:611:9: variableModifiers type Identifier ':' expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableModifiers_in_enhancedForControl4339);
			variableModifiers432=variableModifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers432.getTree());

			pushFollow(FOLLOW_type_in_enhancedForControl4341);
			type433=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type433.getTree());

			Identifier434=(Token)match(input,Identifier,FOLLOW_Identifier_in_enhancedForControl4343); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier434_tree = (Object)adaptor.create(Identifier434);
			adaptor.addChild(root_0, Identifier434_tree);
			}

			if ( state.backtracking==0 ) { id((Identifier434!=null?Identifier434.getText():null));}
			char_literal435=(Token)match(input,47,FOLLOW_47_in_enhancedForControl4347); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal435_tree = (Object)adaptor.create(char_literal435);
			adaptor.addChild(root_0, char_literal435_tree);
			}

			pushFollow(FOLLOW_expression_in_enhancedForControl4349);
			expression436=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression436.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 99, enhancedForControl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enhancedForControl"


	public static class forUpdate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forUpdate"
	// /media/tony/disk2/_git/cs543/JavaJava.g:614:1: forUpdate : expressionList ;
	public final JavaJavaParser.forUpdate_return forUpdate() throws RecognitionException {
		JavaJavaParser.forUpdate_return retval = new JavaJavaParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope expressionList437 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:615:5: ( expressionList )
			// /media/tony/disk2/_git/cs543/JavaJava.g:615:9: expressionList
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expressionList_in_forUpdate4368);
			expressionList437=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList437.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 100, forUpdate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forUpdate"


	public static class parExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:620:1: parExpression : '(' expression ')' ;
	public final JavaJavaParser.parExpression_return parExpression() throws RecognitionException {
		JavaJavaParser.parExpression_return retval = new JavaJavaParser.parExpression_return();
		retval.start = input.LT(1);
		int parExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal438=null;
		Token char_literal440=null;
		ParserRuleReturnScope expression439 =null;

		Object char_literal438_tree=null;
		Object char_literal440_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:621:5: ( '(' expression ')' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:621:9: '(' expression ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal438=(Token)match(input,32,FOLLOW_32_in_parExpression4389); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal438_tree = (Object)adaptor.create(char_literal438);
			adaptor.addChild(root_0, char_literal438_tree);
			}

			if ( state.backtracking==0 ) {s("(");}
			pushFollow(FOLLOW_expression_in_parExpression4392);
			expression439=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression439.getTree());

			char_literal440=(Token)match(input,33,FOLLOW_33_in_parExpression4394); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal440_tree = (Object)adaptor.create(char_literal440);
			adaptor.addChild(root_0, char_literal440_tree);
			}

			if ( state.backtracking==0 ) {s(")");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, parExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "parExpression"


	public static class expressionList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// /media/tony/disk2/_git/cs543/JavaJava.g:624:1: expressionList : expression ( ',' expression )* ;
	public final JavaJavaParser.expressionList_return expressionList() throws RecognitionException {
		JavaJavaParser.expressionList_return retval = new JavaJavaParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal442=null;
		ParserRuleReturnScope expression441 =null;
		ParserRuleReturnScope expression443 =null;

		Object char_literal442_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:625:5: ( expression ( ',' expression )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:625:9: expression ( ',' expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList4419);
			expression441=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression441.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:625:20: ( ',' expression )*
			loop129:
			while (true) {
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==39) ) {
					alt129=1;
				}

				switch (alt129) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:625:21: ',' expression
					{
					char_literal442=(Token)match(input,39,FOLLOW_39_in_expressionList4422); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal442_tree = (Object)adaptor.create(char_literal442);
					adaptor.addChild(root_0, char_literal442_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_expression_in_expressionList4425);
					expression443=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression443.getTree());

					}
					break;

				default :
					break loop129;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, expressionList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class statementExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statementExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:628:1: statementExpression : expression ;
	public final JavaJavaParser.statementExpression_return statementExpression() throws RecognitionException {
		JavaJavaParser.statementExpression_return retval = new JavaJavaParser.statementExpression_return();
		retval.start = input.LT(1);
		int statementExpression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope expression444 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:629:5: ( expression )
			// /media/tony/disk2/_git/cs543/JavaJava.g:629:9: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_statementExpression4446);
			expression444=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression444.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, statementExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statementExpression"


	public static class constantExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:632:1: constantExpression : expression ;
	public final JavaJavaParser.constantExpression_return constantExpression() throws RecognitionException {
		JavaJavaParser.constantExpression_return retval = new JavaJavaParser.constantExpression_return();
		retval.start = input.LT(1);
		int constantExpression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope expression445 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:633:5: ( expression )
			// /media/tony/disk2/_git/cs543/JavaJava.g:633:9: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_constantExpression4470);
			expression445=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression445.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, constantExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constantExpression"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:636:1: expression : conditionalExpression ( assignmentOperator expression )? ;
	public final JavaJavaParser.expression_return expression() throws RecognitionException {
		JavaJavaParser.expression_return retval = new JavaJavaParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope conditionalExpression446 =null;
		ParserRuleReturnScope assignmentOperator447 =null;
		ParserRuleReturnScope expression448 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:637:5: ( conditionalExpression ( assignmentOperator expression )? )
			// /media/tony/disk2/_git/cs543/JavaJava.g:637:9: conditionalExpression ( assignmentOperator expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_conditionalExpression_in_expression4493);
			conditionalExpression446=conditionalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression446.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:637:31: ( assignmentOperator expression )?
			int alt130=2;
			switch ( input.LA(1) ) {
				case 50:
					{
					int LA130_1 = input.LA(2);
					if ( (synpred187_JavaJava()) ) {
						alt130=1;
					}
					}
					break;
				case 38:
					{
					int LA130_2 = input.LA(2);
					if ( (synpred187_JavaJava()) ) {
						alt130=1;
					}
					}
					break;
				case 42:
					{
					int LA130_3 = input.LA(2);
					if ( (synpred187_JavaJava()) ) {
						alt130=1;
					}
					}
					break;
				case 35:
					{
					int LA130_4 = input.LA(2);
					if ( (synpred187_JavaJava()) ) {
						alt130=1;
					}
					}
					break;
				case 46:
					{
					int LA130_5 = input.LA(2);
					if ( (synpred187_JavaJava()) ) {
						alt130=1;
					}
					}
					break;
				case 31:
					{
					int LA130_6 = input.LA(2);
					if ( (synpred187_JavaJava()) ) {
						alt130=1;
					}
					}
					break;
				case 110:
					{
					int LA130_7 = input.LA(2);
					if ( (synpred187_JavaJava()) ) {
						alt130=1;
					}
					}
					break;
				case 58:
					{
					int LA130_8 = input.LA(2);
					if ( (synpred187_JavaJava()) ) {
						alt130=1;
					}
					}
					break;
				case 28:
					{
					int LA130_9 = input.LA(2);
					if ( (synpred187_JavaJava()) ) {
						alt130=1;
					}
					}
					break;
				case 49:
					{
					int LA130_10 = input.LA(2);
					if ( (synpred187_JavaJava()) ) {
						alt130=1;
					}
					}
					break;
				case 52:
					{
					int LA130_11 = input.LA(2);
					if ( (synpred187_JavaJava()) ) {
						alt130=1;
					}
					}
					break;
			}
			switch (alt130) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:637:32: assignmentOperator expression
					{
					pushFollow(FOLLOW_assignmentOperator_in_expression4496);
					assignmentOperator447=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOperator447.getTree());

					pushFollow(FOLLOW_expression_in_expression4498);
					expression448=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression448.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 105, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class assignmentOperator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmentOperator"
	// /media/tony/disk2/_git/cs543/JavaJava.g:640:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?| ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?| ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?);
	public final JavaJavaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		JavaJavaParser.assignmentOperator_return retval = new JavaJavaParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		Object root_0 = null;

		Token t1=null;
		Token t2=null;
		Token t3=null;
		Token t4=null;
		Token char_literal449=null;
		Token string_literal450=null;
		Token string_literal451=null;
		Token string_literal452=null;
		Token string_literal453=null;
		Token string_literal454=null;
		Token string_literal455=null;
		Token string_literal456=null;
		Token string_literal457=null;

		Object t1_tree=null;
		Object t2_tree=null;
		Object t3_tree=null;
		Object t4_tree=null;
		Object char_literal449_tree=null;
		Object string_literal450_tree=null;
		Object string_literal451_tree=null;
		Object string_literal452_tree=null;
		Object string_literal453_tree=null;
		Object string_literal454_tree=null;
		Object string_literal455_tree=null;
		Object string_literal456_tree=null;
		Object string_literal457_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:641:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?| ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?| ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?)
			int alt131=12;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==50) ) {
				alt131=1;
			}
			else if ( (LA131_0==38) ) {
				alt131=2;
			}
			else if ( (LA131_0==42) ) {
				alt131=3;
			}
			else if ( (LA131_0==35) ) {
				alt131=4;
			}
			else if ( (LA131_0==46) ) {
				alt131=5;
			}
			else if ( (LA131_0==31) ) {
				alt131=6;
			}
			else if ( (LA131_0==110) ) {
				alt131=7;
			}
			else if ( (LA131_0==58) ) {
				alt131=8;
			}
			else if ( (LA131_0==28) ) {
				alt131=9;
			}
			else if ( (LA131_0==49) && (synpred197_JavaJava())) {
				alt131=10;
			}
			else if ( (LA131_0==52) ) {
				int LA131_11 = input.LA(2);
				if ( (LA131_11==52) ) {
					int LA131_12 = input.LA(3);
					if ( (LA131_12==52) && (synpred198_JavaJava())) {
						alt131=11;
					}
					else if ( (LA131_12==50) && (synpred199_JavaJava())) {
						alt131=12;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}

			switch (alt131) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:641:9: '='
					{
					root_0 = (Object)adaptor.nil();


					char_literal449=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4523); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal449_tree = (Object)adaptor.create(char_literal449);
					adaptor.addChild(root_0, char_literal449_tree);
					}

					if ( state.backtracking==0 ) {s("=");}
					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:642:9: '+='
					{
					root_0 = (Object)adaptor.nil();


					string_literal450=(Token)match(input,38,FOLLOW_38_in_assignmentOperator4535); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal450_tree = (Object)adaptor.create(string_literal450);
					adaptor.addChild(root_0, string_literal450_tree);
					}

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:643:9: '-='
					{
					root_0 = (Object)adaptor.nil();


					string_literal451=(Token)match(input,42,FOLLOW_42_in_assignmentOperator4545); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal451_tree = (Object)adaptor.create(string_literal451);
					adaptor.addChild(root_0, string_literal451_tree);
					}

					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:644:9: '*='
					{
					root_0 = (Object)adaptor.nil();


					string_literal452=(Token)match(input,35,FOLLOW_35_in_assignmentOperator4555); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal452_tree = (Object)adaptor.create(string_literal452);
					adaptor.addChild(root_0, string_literal452_tree);
					}

					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:645:9: '/='
					{
					root_0 = (Object)adaptor.nil();


					string_literal453=(Token)match(input,46,FOLLOW_46_in_assignmentOperator4565); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal453_tree = (Object)adaptor.create(string_literal453);
					adaptor.addChild(root_0, string_literal453_tree);
					}

					}
					break;
				case 6 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:646:9: '&='
					{
					root_0 = (Object)adaptor.nil();


					string_literal454=(Token)match(input,31,FOLLOW_31_in_assignmentOperator4575); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal454_tree = (Object)adaptor.create(string_literal454);
					adaptor.addChild(root_0, string_literal454_tree);
					}

					}
					break;
				case 7 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:647:9: '|='
					{
					root_0 = (Object)adaptor.nil();


					string_literal455=(Token)match(input,110,FOLLOW_110_in_assignmentOperator4585); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal455_tree = (Object)adaptor.create(string_literal455);
					adaptor.addChild(root_0, string_literal455_tree);
					}

					}
					break;
				case 8 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:648:9: '^='
					{
					root_0 = (Object)adaptor.nil();


					string_literal456=(Token)match(input,58,FOLLOW_58_in_assignmentOperator4595); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal456_tree = (Object)adaptor.create(string_literal456);
					adaptor.addChild(root_0, string_literal456_tree);
					}

					}
					break;
				case 9 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:649:9: '%='
					{
					root_0 = (Object)adaptor.nil();


					string_literal457=(Token)match(input,28,FOLLOW_28_in_assignmentOperator4605); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal457_tree = (Object)adaptor.create(string_literal457);
					adaptor.addChild(root_0, string_literal457_tree);
					}

					}
					break;
				case 10 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:650:9: ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,49,FOLLOW_49_in_assignmentOperator4626); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,49,FOLLOW_49_in_assignmentOperator4630); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					t3=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4634); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t3_tree = (Object)adaptor.create(t3);
					adaptor.addChild(root_0, t3_tree);
					}

					if ( !((true /*t1.Line == t2.Line &&
					          t1.CharPositionInLine + 1 == t2.CharPositionInLine && 
					          t2.Line == t3.Line && 
					          t2.CharPositionInLine + 1 == t3.CharPositionInLine */)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "assignmentOperator", "true /*$t1.Line == $t2.Line &&\n          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine && \n          $t2.Line == $t3.Line && \n          $t2.CharPositionInLine + 1 == $t3.CharPositionInLine */");
					}
					}
					break;
				case 11 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:655:9: ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4668); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4672); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					t3=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4676); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t3_tree = (Object)adaptor.create(t3);
					adaptor.addChild(root_0, t3_tree);
					}

					t4=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4680); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t4_tree = (Object)adaptor.create(t4);
					adaptor.addChild(root_0, t4_tree);
					}

					if ( !(( true/*t1.Line == t2.Line && 
					          t1.CharPositionInLine + 1 == t2.CharPositionInLine &&
					          t2.Line == t3.Line && 
					          t2.CharPositionInLine + 1 == t3.CharPositionInLine &&
					          t3.Line == t4.Line && 
					          t3.CharPositionInLine + 1 == t4.CharPositionInLine */)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "assignmentOperator", " true/*$t1.Line == $t2.Line && \n          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine &&\n          $t2.Line == $t3.Line && \n          $t2.CharPositionInLine + 1 == $t3.CharPositionInLine &&\n          $t3.Line == $t4.Line && \n          $t3.CharPositionInLine + 1 == $t4.CharPositionInLine */");
					}
					}
					break;
				case 12 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:662:9: ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4711); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4715); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					t3=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4719); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t3_tree = (Object)adaptor.create(t3);
					adaptor.addChild(root_0, t3_tree);
					}

					if ( !((true /*t1.Line == t2.Line && 
					          t1.CharPositionInLine + 1 == t2.CharPositionInLine && 
					          t2.Line == t3.Line && 
					          t2.CharPositionInLine + 1 == t3.CharPositionInLine*/ )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "assignmentOperator", "true /*$t1.Line == $t2.Line && \n          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine && \n          $t2.Line == $t3.Line && \n          $t2.CharPositionInLine + 1 == $t3.CharPositionInLine*/ ");
					}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 106, assignmentOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentOperator"


	public static class conditionalExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditionalExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:669:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' expression )? ;
	public final JavaJavaParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		JavaJavaParser.conditionalExpression_return retval = new JavaJavaParser.conditionalExpression_return();
		retval.start = input.LT(1);
		int conditionalExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal459=null;
		Token char_literal461=null;
		ParserRuleReturnScope conditionalOrExpression458 =null;
		ParserRuleReturnScope expression460 =null;
		ParserRuleReturnScope expression462 =null;

		Object char_literal459_tree=null;
		Object char_literal461_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:670:5: ( conditionalOrExpression ( '?' expression ':' expression )? )
			// /media/tony/disk2/_git/cs543/JavaJava.g:670:9: conditionalOrExpression ( '?' expression ':' expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression4748);
			conditionalOrExpression458=conditionalOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression458.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:670:33: ( '?' expression ':' expression )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==53) ) {
				alt132=1;
			}
			switch (alt132) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:670:35: '?' expression ':' expression
					{
					char_literal459=(Token)match(input,53,FOLLOW_53_in_conditionalExpression4752); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal459_tree = (Object)adaptor.create(char_literal459);
					adaptor.addChild(root_0, char_literal459_tree);
					}

					pushFollow(FOLLOW_expression_in_conditionalExpression4754);
					expression460=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression460.getTree());

					char_literal461=(Token)match(input,47,FOLLOW_47_in_conditionalExpression4756); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal461_tree = (Object)adaptor.create(char_literal461);
					adaptor.addChild(root_0, char_literal461_tree);
					}

					pushFollow(FOLLOW_expression_in_conditionalExpression4758);
					expression462=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression462.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 107, conditionalExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditionalExpression"


	public static class conditionalOrExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditionalOrExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:673:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
	public final JavaJavaParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
		JavaJavaParser.conditionalOrExpression_return retval = new JavaJavaParser.conditionalOrExpression_return();
		retval.start = input.LT(1);
		int conditionalOrExpression_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal464=null;
		ParserRuleReturnScope conditionalAndExpression463 =null;
		ParserRuleReturnScope conditionalAndExpression465 =null;

		Object string_literal464_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:674:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:674:9: conditionalAndExpression ( '||' conditionalAndExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression4780);
			conditionalAndExpression463=conditionalAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression463.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:674:34: ( '||' conditionalAndExpression )*
			loop133:
			while (true) {
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==111) ) {
					alt133=1;
				}

				switch (alt133) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:674:36: '||' conditionalAndExpression
					{
					string_literal464=(Token)match(input,111,FOLLOW_111_in_conditionalOrExpression4784); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal464_tree = (Object)adaptor.create(string_literal464);
					adaptor.addChild(root_0, string_literal464_tree);
					}

					if ( state.backtracking==0 ) {s("||"); mmc++;}
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression4788);
					conditionalAndExpression465=conditionalAndExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression465.getTree());

					}
					break;

				default :
					break loop133;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 108, conditionalOrExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditionalOrExpression"


	public static class conditionalAndExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditionalAndExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:677:1: conditionalAndExpression : inclusiveOrExpression ( '&&' inclusiveOrExpression )* ;
	public final JavaJavaParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
		JavaJavaParser.conditionalAndExpression_return retval = new JavaJavaParser.conditionalAndExpression_return();
		retval.start = input.LT(1);
		int conditionalAndExpression_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal467=null;
		ParserRuleReturnScope inclusiveOrExpression466 =null;
		ParserRuleReturnScope inclusiveOrExpression468 =null;

		Object string_literal467_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:678:5: ( inclusiveOrExpression ( '&&' inclusiveOrExpression )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:678:9: inclusiveOrExpression ( '&&' inclusiveOrExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4810);
			inclusiveOrExpression466=inclusiveOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression466.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:678:31: ( '&&' inclusiveOrExpression )*
			loop134:
			while (true) {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==29) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:678:33: '&&' inclusiveOrExpression
					{
					string_literal467=(Token)match(input,29,FOLLOW_29_in_conditionalAndExpression4814); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal467_tree = (Object)adaptor.create(string_literal467);
					adaptor.addChild(root_0, string_literal467_tree);
					}

					if ( state.backtracking==0 ) {s("&&"); mmc++;}
					pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4818);
					inclusiveOrExpression468=inclusiveOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression468.getTree());

					}
					break;

				default :
					break loop134;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 109, conditionalAndExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditionalAndExpression"


	public static class inclusiveOrExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inclusiveOrExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:681:1: inclusiveOrExpression : exclusiveOrExpression ( '|' exclusiveOrExpression )* ;
	public final JavaJavaParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
		JavaJavaParser.inclusiveOrExpression_return retval = new JavaJavaParser.inclusiveOrExpression_return();
		retval.start = input.LT(1);
		int inclusiveOrExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal470=null;
		ParserRuleReturnScope exclusiveOrExpression469 =null;
		ParserRuleReturnScope exclusiveOrExpression471 =null;

		Object char_literal470_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:682:5: ( exclusiveOrExpression ( '|' exclusiveOrExpression )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:682:9: exclusiveOrExpression ( '|' exclusiveOrExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4840);
			exclusiveOrExpression469=exclusiveOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression469.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:682:31: ( '|' exclusiveOrExpression )*
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==109) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:682:33: '|' exclusiveOrExpression
					{
					char_literal470=(Token)match(input,109,FOLLOW_109_in_inclusiveOrExpression4844); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal470_tree = (Object)adaptor.create(char_literal470);
					adaptor.addChild(root_0, char_literal470_tree);
					}

					if ( state.backtracking==0 ) {s("|"); }
					pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4848);
					exclusiveOrExpression471=exclusiveOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression471.getTree());

					}
					break;

				default :
					break loop135;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 110, inclusiveOrExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "inclusiveOrExpression"


	public static class exclusiveOrExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exclusiveOrExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:685:1: exclusiveOrExpression : andExpression ( '^' andExpression )* ;
	public final JavaJavaParser.exclusiveOrExpression_return exclusiveOrExpression() throws RecognitionException {
		JavaJavaParser.exclusiveOrExpression_return retval = new JavaJavaParser.exclusiveOrExpression_return();
		retval.start = input.LT(1);
		int exclusiveOrExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal473=null;
		ParserRuleReturnScope andExpression472 =null;
		ParserRuleReturnScope andExpression474 =null;

		Object char_literal473_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:686:5: ( andExpression ( '^' andExpression )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:686:9: andExpression ( '^' andExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression4870);
			andExpression472=andExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression472.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:686:23: ( '^' andExpression )*
			loop136:
			while (true) {
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==57) ) {
					alt136=1;
				}

				switch (alt136) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:686:25: '^' andExpression
					{
					char_literal473=(Token)match(input,57,FOLLOW_57_in_exclusiveOrExpression4874); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal473_tree = (Object)adaptor.create(char_literal473);
					adaptor.addChild(root_0, char_literal473_tree);
					}

					pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression4876);
					andExpression474=andExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression474.getTree());

					}
					break;

				default :
					break loop136;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 111, exclusiveOrExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "exclusiveOrExpression"


	public static class andExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:689:1: andExpression : equalityExpression ( '&' equalityExpression )* ;
	public final JavaJavaParser.andExpression_return andExpression() throws RecognitionException {
		JavaJavaParser.andExpression_return retval = new JavaJavaParser.andExpression_return();
		retval.start = input.LT(1);
		int andExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal476=null;
		ParserRuleReturnScope equalityExpression475 =null;
		ParserRuleReturnScope equalityExpression477 =null;

		Object char_literal476_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:690:5: ( equalityExpression ( '&' equalityExpression )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:690:9: equalityExpression ( '&' equalityExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_andExpression4898);
			equalityExpression475=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression475.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:690:28: ( '&' equalityExpression )*
			loop137:
			while (true) {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==30) ) {
					alt137=1;
				}

				switch (alt137) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:690:30: '&' equalityExpression
					{
					char_literal476=(Token)match(input,30,FOLLOW_30_in_andExpression4902); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal476_tree = (Object)adaptor.create(char_literal476);
					adaptor.addChild(root_0, char_literal476_tree);
					}

					if ( state.backtracking==0 ) {s("&");}
					pushFollow(FOLLOW_equalityExpression_in_andExpression4906);
					equalityExpression477=equalityExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression477.getTree());

					}
					break;

				default :
					break loop137;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 112, andExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "andExpression"


	public static class equalityExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equalityExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:693:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
	public final JavaJavaParser.equalityExpression_return equalityExpression() throws RecognitionException {
		JavaJavaParser.equalityExpression_return retval = new JavaJavaParser.equalityExpression_return();
		retval.start = input.LT(1);
		int equalityExpression_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal479=null;
		Token string_literal480=null;
		ParserRuleReturnScope instanceOfExpression478 =null;
		ParserRuleReturnScope instanceOfExpression481 =null;

		Object string_literal479_tree=null;
		Object string_literal480_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:694:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:694:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression4928);
			instanceOfExpression478=instanceOfExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression478.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:694:30: ( ( '==' | '!=' ) instanceOfExpression )*
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==26||LA139_0==51) ) {
					alt139=1;
				}

				switch (alt139) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:694:32: ( '==' | '!=' ) instanceOfExpression
					{
					// /media/tony/disk2/_git/cs543/JavaJava.g:694:32: ( '==' | '!=' )
					int alt138=2;
					int LA138_0 = input.LA(1);
					if ( (LA138_0==51) ) {
						alt138=1;
					}
					else if ( (LA138_0==26) ) {
						alt138=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 138, 0, input);
						throw nvae;
					}

					switch (alt138) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:694:33: '=='
							{
							string_literal479=(Token)match(input,51,FOLLOW_51_in_equalityExpression4933); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal479_tree = (Object)adaptor.create(string_literal479);
							adaptor.addChild(root_0, string_literal479_tree);
							}

							if ( state.backtracking==0 ) {s("==");}
							}
							break;
						case 2 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:694:50: '!='
							{
							string_literal480=(Token)match(input,26,FOLLOW_26_in_equalityExpression4938); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal480_tree = (Object)adaptor.create(string_literal480);
							adaptor.addChild(root_0, string_literal480_tree);
							}

							if ( state.backtracking==0 ) {s("!=");}
							}
							break;

					}

					pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression4943);
					instanceOfExpression481=instanceOfExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression481.getTree());

					}
					break;

				default :
					break loop139;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 113, equalityExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityExpression"


	public static class instanceOfExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instanceOfExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:697:1: instanceOfExpression : relationalExpression ( 'instanceof' type )? ;
	public final JavaJavaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
		JavaJavaParser.instanceOfExpression_return retval = new JavaJavaParser.instanceOfExpression_return();
		retval.start = input.LT(1);
		int instanceOfExpression_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal483=null;
		ParserRuleReturnScope relationalExpression482 =null;
		ParserRuleReturnScope type484 =null;

		Object string_literal483_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:698:5: ( relationalExpression ( 'instanceof' type )? )
			// /media/tony/disk2/_git/cs543/JavaJava.g:698:9: relationalExpression ( 'instanceof' type )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression4965);
			relationalExpression482=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression482.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:698:30: ( 'instanceof' type )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==81) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:698:31: 'instanceof' type
					{
					string_literal483=(Token)match(input,81,FOLLOW_81_in_instanceOfExpression4968); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal483_tree = (Object)adaptor.create(string_literal483);
					adaptor.addChild(root_0, string_literal483_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("instanceof");}
					pushFollow(FOLLOW_type_in_instanceOfExpression4971);
					type484=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type484.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 114, instanceOfExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instanceOfExpression"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relationalExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:701:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
	public final JavaJavaParser.relationalExpression_return relationalExpression() throws RecognitionException {
		JavaJavaParser.relationalExpression_return retval = new JavaJavaParser.relationalExpression_return();
		retval.start = input.LT(1);
		int relationalExpression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope shiftExpression485 =null;
		ParserRuleReturnScope relationalOp486 =null;
		ParserRuleReturnScope shiftExpression487 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:702:5: ( shiftExpression ( relationalOp shiftExpression )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:702:9: shiftExpression ( relationalOp shiftExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_shiftExpression_in_relationalExpression4992);
			shiftExpression485=shiftExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression485.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:702:25: ( relationalOp shiftExpression )*
			loop141:
			while (true) {
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==49) ) {
					int LA141_2 = input.LA(2);
					if ( ((LA141_2 >= CharacterLiteral && LA141_2 <= DecimalLiteral)||LA141_2==FloatingPointLiteral||(LA141_2 >= HexLiteral && LA141_2 <= Identifier)||(LA141_2 >= OctalLiteral && LA141_2 <= StringLiteral)||LA141_2==25||LA141_2==32||(LA141_2 >= 36 && LA141_2 <= 37)||(LA141_2 >= 40 && LA141_2 <= 41)||LA141_2==50||LA141_2==60||LA141_2==62||LA141_2==65||LA141_2==70||LA141_2==73||LA141_2==76||LA141_2==82||LA141_2==84||(LA141_2 >= 86 && LA141_2 <= 87)||LA141_2==93||LA141_2==96||LA141_2==99||LA141_2==103||LA141_2==105||LA141_2==113) ) {
						alt141=1;
					}

				}
				else if ( (LA141_0==52) ) {
					int LA141_3 = input.LA(2);
					if ( ((LA141_3 >= CharacterLiteral && LA141_3 <= DecimalLiteral)||LA141_3==FloatingPointLiteral||(LA141_3 >= HexLiteral && LA141_3 <= Identifier)||(LA141_3 >= OctalLiteral && LA141_3 <= StringLiteral)||LA141_3==25||LA141_3==32||(LA141_3 >= 36 && LA141_3 <= 37)||(LA141_3 >= 40 && LA141_3 <= 41)||LA141_3==50||LA141_3==60||LA141_3==62||LA141_3==65||LA141_3==70||LA141_3==73||LA141_3==76||LA141_3==82||LA141_3==84||(LA141_3 >= 86 && LA141_3 <= 87)||LA141_3==93||LA141_3==96||LA141_3==99||LA141_3==103||LA141_3==105||LA141_3==113) ) {
						alt141=1;
					}

				}

				switch (alt141) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:702:27: relationalOp shiftExpression
					{
					pushFollow(FOLLOW_relationalOp_in_relationalExpression4996);
					relationalOp486=relationalOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalOp486.getTree());

					pushFollow(FOLLOW_shiftExpression_in_relationalExpression4998);
					shiftExpression487=shiftExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression487.getTree());

					}
					break;

				default :
					break loop141;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 115, relationalExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "relationalExpression"


	public static class relationalOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relationalOp"
	// /media/tony/disk2/_git/cs543/JavaJava.g:705:1: relationalOp : ( ( '<' '=' )=>t1= '<' t2= '=' {...}?| ( '>' '=' )=>t1= '>' t2= '=' {...}?| '<' | '>' );
	public final JavaJavaParser.relationalOp_return relationalOp() throws RecognitionException {
		JavaJavaParser.relationalOp_return retval = new JavaJavaParser.relationalOp_return();
		retval.start = input.LT(1);
		int relationalOp_StartIndex = input.index();

		Object root_0 = null;

		Token t1=null;
		Token t2=null;
		Token char_literal488=null;
		Token char_literal489=null;

		Object t1_tree=null;
		Object t2_tree=null;
		Object char_literal488_tree=null;
		Object char_literal489_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:706:5: ( ( '<' '=' )=>t1= '<' t2= '=' {...}?| ( '>' '=' )=>t1= '>' t2= '=' {...}?| '<' | '>' )
			int alt142=4;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==49) ) {
				int LA142_1 = input.LA(2);
				if ( (LA142_1==50) && (synpred210_JavaJava())) {
					alt142=1;
				}
				else if ( ((LA142_1 >= CharacterLiteral && LA142_1 <= DecimalLiteral)||LA142_1==FloatingPointLiteral||(LA142_1 >= HexLiteral && LA142_1 <= Identifier)||(LA142_1 >= OctalLiteral && LA142_1 <= StringLiteral)||LA142_1==25||LA142_1==32||(LA142_1 >= 36 && LA142_1 <= 37)||(LA142_1 >= 40 && LA142_1 <= 41)||LA142_1==60||LA142_1==62||LA142_1==65||LA142_1==70||LA142_1==73||LA142_1==76||LA142_1==82||LA142_1==84||(LA142_1 >= 86 && LA142_1 <= 87)||LA142_1==93||LA142_1==96||LA142_1==99||LA142_1==103||LA142_1==105||LA142_1==113) ) {
					alt142=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 142, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA142_0==52) ) {
				int LA142_2 = input.LA(2);
				if ( (LA142_2==50) && (synpred211_JavaJava())) {
					alt142=2;
				}
				else if ( ((LA142_2 >= CharacterLiteral && LA142_2 <= DecimalLiteral)||LA142_2==FloatingPointLiteral||(LA142_2 >= HexLiteral && LA142_2 <= Identifier)||(LA142_2 >= OctalLiteral && LA142_2 <= StringLiteral)||LA142_2==25||LA142_2==32||(LA142_2 >= 36 && LA142_2 <= 37)||(LA142_2 >= 40 && LA142_2 <= 41)||LA142_2==60||LA142_2==62||LA142_2==65||LA142_2==70||LA142_2==73||LA142_2==76||LA142_2==82||LA142_2==84||(LA142_2 >= 86 && LA142_2 <= 87)||LA142_2==93||LA142_2==96||LA142_2==99||LA142_2==103||LA142_2==105||LA142_2==113) ) {
					alt142=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 142, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 142, 0, input);
				throw nvae;
			}

			switch (alt142) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:706:9: ( '<' '=' )=>t1= '<' t2= '=' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,49,FOLLOW_49_in_relationalOp5033); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,50,FOLLOW_50_in_relationalOp5037); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					if ( !((true/* t1.Line == t2.Line && 
					          t1.CharPositionInLine + 1 == t2.CharPositionInLine*/ )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "relationalOp", "true/* $t1.Line == $t2.Line && \n          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine*/ ");
					}
					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:709:9: ( '>' '=' )=>t1= '>' t2= '=' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,52,FOLLOW_52_in_relationalOp5067); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,50,FOLLOW_50_in_relationalOp5071); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					if ( !((true/* t1.Line == t2.Line && 
					          t1.CharPositionInLine + 1 == t2.CharPositionInLine*/ )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "relationalOp", "true/* $t1.Line == $t2.Line && \n          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine*/ ");
					}
					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:712:9: '<'
					{
					root_0 = (Object)adaptor.nil();


					char_literal488=(Token)match(input,49,FOLLOW_49_in_relationalOp5092); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal488_tree = (Object)adaptor.create(char_literal488);
					adaptor.addChild(root_0, char_literal488_tree);
					}

					if ( state.backtracking==0 ) {s("<");}
					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:713:9: '>'
					{
					root_0 = (Object)adaptor.nil();


					char_literal489=(Token)match(input,52,FOLLOW_52_in_relationalOp5104); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal489_tree = (Object)adaptor.create(char_literal489);
					adaptor.addChild(root_0, char_literal489_tree);
					}

					if ( state.backtracking==0 ) {s(">");}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 116, relationalOp_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "relationalOp"


	public static class shiftExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "shiftExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:716:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
	public final JavaJavaParser.shiftExpression_return shiftExpression() throws RecognitionException {
		JavaJavaParser.shiftExpression_return retval = new JavaJavaParser.shiftExpression_return();
		retval.start = input.LT(1);
		int shiftExpression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope additiveExpression490 =null;
		ParserRuleReturnScope shiftOp491 =null;
		ParserRuleReturnScope additiveExpression492 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:717:5: ( additiveExpression ( shiftOp additiveExpression )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:717:9: additiveExpression ( shiftOp additiveExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_shiftExpression5125);
			additiveExpression490=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression490.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:717:28: ( shiftOp additiveExpression )*
			loop143:
			while (true) {
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==49) ) {
					int LA143_1 = input.LA(2);
					if ( (LA143_1==49) ) {
						int LA143_4 = input.LA(3);
						if ( ((LA143_4 >= CharacterLiteral && LA143_4 <= DecimalLiteral)||LA143_4==FloatingPointLiteral||(LA143_4 >= HexLiteral && LA143_4 <= Identifier)||(LA143_4 >= OctalLiteral && LA143_4 <= StringLiteral)||LA143_4==25||LA143_4==32||(LA143_4 >= 36 && LA143_4 <= 37)||(LA143_4 >= 40 && LA143_4 <= 41)||LA143_4==60||LA143_4==62||LA143_4==65||LA143_4==70||LA143_4==73||LA143_4==76||LA143_4==82||LA143_4==84||(LA143_4 >= 86 && LA143_4 <= 87)||LA143_4==93||LA143_4==96||LA143_4==99||LA143_4==103||LA143_4==105||LA143_4==113) ) {
							alt143=1;
						}

					}

				}
				else if ( (LA143_0==52) ) {
					int LA143_2 = input.LA(2);
					if ( (LA143_2==52) ) {
						int LA143_5 = input.LA(3);
						if ( (LA143_5==52) ) {
							int LA143_7 = input.LA(4);
							if ( ((LA143_7 >= CharacterLiteral && LA143_7 <= DecimalLiteral)||LA143_7==FloatingPointLiteral||(LA143_7 >= HexLiteral && LA143_7 <= Identifier)||(LA143_7 >= OctalLiteral && LA143_7 <= StringLiteral)||LA143_7==25||LA143_7==32||(LA143_7 >= 36 && LA143_7 <= 37)||(LA143_7 >= 40 && LA143_7 <= 41)||LA143_7==60||LA143_7==62||LA143_7==65||LA143_7==70||LA143_7==73||LA143_7==76||LA143_7==82||LA143_7==84||(LA143_7 >= 86 && LA143_7 <= 87)||LA143_7==93||LA143_7==96||LA143_7==99||LA143_7==103||LA143_7==105||LA143_7==113) ) {
								alt143=1;
							}

						}
						else if ( ((LA143_5 >= CharacterLiteral && LA143_5 <= DecimalLiteral)||LA143_5==FloatingPointLiteral||(LA143_5 >= HexLiteral && LA143_5 <= Identifier)||(LA143_5 >= OctalLiteral && LA143_5 <= StringLiteral)||LA143_5==25||LA143_5==32||(LA143_5 >= 36 && LA143_5 <= 37)||(LA143_5 >= 40 && LA143_5 <= 41)||LA143_5==60||LA143_5==62||LA143_5==65||LA143_5==70||LA143_5==73||LA143_5==76||LA143_5==82||LA143_5==84||(LA143_5 >= 86 && LA143_5 <= 87)||LA143_5==93||LA143_5==96||LA143_5==99||LA143_5==103||LA143_5==105||LA143_5==113) ) {
							alt143=1;
						}

					}

				}

				switch (alt143) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:717:30: shiftOp additiveExpression
					{
					pushFollow(FOLLOW_shiftOp_in_shiftExpression5129);
					shiftOp491=shiftOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftOp491.getTree());

					pushFollow(FOLLOW_additiveExpression_in_shiftExpression5131);
					additiveExpression492=additiveExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression492.getTree());

					}
					break;

				default :
					break loop143;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 117, shiftExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "shiftExpression"


	public static class shiftOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "shiftOp"
	// /media/tony/disk2/_git/cs543/JavaJava.g:720:1: shiftOp : ( ( '<' '<' )=>t1= '<' t2= '<' {...}?| ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?| ( '>' '>' )=>t1= '>' t2= '>' {...}?);
	public final JavaJavaParser.shiftOp_return shiftOp() throws RecognitionException {
		JavaJavaParser.shiftOp_return retval = new JavaJavaParser.shiftOp_return();
		retval.start = input.LT(1);
		int shiftOp_StartIndex = input.index();

		Object root_0 = null;

		Token t1=null;
		Token t2=null;
		Token t3=null;

		Object t1_tree=null;
		Object t2_tree=null;
		Object t3_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:721:5: ( ( '<' '<' )=>t1= '<' t2= '<' {...}?| ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?| ( '>' '>' )=>t1= '>' t2= '>' {...}?)
			int alt144=3;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==49) && (synpred214_JavaJava())) {
				alt144=1;
			}
			else if ( (LA144_0==52) ) {
				int LA144_2 = input.LA(2);
				if ( (LA144_2==52) ) {
					int LA144_3 = input.LA(3);
					if ( (LA144_3==52) && (synpred215_JavaJava())) {
						alt144=2;
					}
					else if ( (LA144_3==36) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==40) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==37) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==41) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==113) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==25) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==32) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==99) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==96) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==HexLiteral) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==OctalLiteral) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==DecimalLiteral) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==FloatingPointLiteral) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==CharacterLiteral) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==StringLiteral) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==103) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==73) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==87) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==86) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==Identifier) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==60) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==65) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==62) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==93) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==82) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==84) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==76) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==70) && (synpred216_JavaJava())) {
						alt144=3;
					}
					else if ( (LA144_3==105) && (synpred216_JavaJava())) {
						alt144=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 144, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 144, 0, input);
				throw nvae;
			}

			switch (alt144) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:721:9: ( '<' '<' )=>t1= '<' t2= '<' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,49,FOLLOW_49_in_shiftOp5162); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,49,FOLLOW_49_in_shiftOp5166); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					if ( !((true/* t1.Line == t2.Line && 
					          t1.CharPositionInLine + 1 == t2.CharPositionInLine*/ )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "shiftOp", "true/* $t1.Line == $t2.Line && \n          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine*/ ");
					}
					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:724:9: ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,52,FOLLOW_52_in_shiftOp5198); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,52,FOLLOW_52_in_shiftOp5202); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					t3=(Token)match(input,52,FOLLOW_52_in_shiftOp5206); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t3_tree = (Object)adaptor.create(t3);
					adaptor.addChild(root_0, t3_tree);
					}

					if ( !(( true/*t1.Line == t2.Line && 
					          t1.CharPositionInLine + 1 == t2.CharPositionInLine &&
					          t2.Line == t3.Line && 
					          t2.CharPositionInLine + 1 == t3.CharPositionInLine */)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "shiftOp", " true/*$t1.Line == $t2.Line && \n          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine &&\n          $t2.Line == $t3.Line && \n          $t2.CharPositionInLine + 1 == $t3.CharPositionInLine */");
					}
					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:729:9: ( '>' '>' )=>t1= '>' t2= '>' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,52,FOLLOW_52_in_shiftOp5236); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,52,FOLLOW_52_in_shiftOp5240); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					if ( !((true/* t1.Line == t2.Line && 
					          t1.CharPositionInLine + 1 == t2.CharPositionInLine*/ )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "shiftOp", "true/* $t1.Line == $t2.Line && \n          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine*/ ");
					}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 118, shiftOp_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "shiftOp"


	public static class additiveExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:735:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
	public final JavaJavaParser.additiveExpression_return additiveExpression() throws RecognitionException {
		JavaJavaParser.additiveExpression_return retval = new JavaJavaParser.additiveExpression_return();
		retval.start = input.LT(1);
		int additiveExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal494=null;
		Token char_literal495=null;
		ParserRuleReturnScope multiplicativeExpression493 =null;
		ParserRuleReturnScope multiplicativeExpression496 =null;

		Object char_literal494_tree=null;
		Object char_literal495_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:736:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:736:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5270);
			multiplicativeExpression493=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression493.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:736:34: ( ( '+' | '-' ) multiplicativeExpression )*
			loop146:
			while (true) {
				int alt146=2;
				int LA146_0 = input.LA(1);
				if ( (LA146_0==36||LA146_0==40) ) {
					alt146=1;
				}

				switch (alt146) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:736:36: ( '+' | '-' ) multiplicativeExpression
					{
					// /media/tony/disk2/_git/cs543/JavaJava.g:736:36: ( '+' | '-' )
					int alt145=2;
					int LA145_0 = input.LA(1);
					if ( (LA145_0==36) ) {
						alt145=1;
					}
					else if ( (LA145_0==40) ) {
						alt145=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 145, 0, input);
						throw nvae;
					}

					switch (alt145) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:736:37: '+'
							{
							char_literal494=(Token)match(input,36,FOLLOW_36_in_additiveExpression5275); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal494_tree = (Object)adaptor.create(char_literal494);
							adaptor.addChild(root_0, char_literal494_tree);
							}

							if ( state.backtracking==0 ) {s("+");}
							}
							break;
						case 2 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:736:52: '-'
							{
							char_literal495=(Token)match(input,40,FOLLOW_40_in_additiveExpression5280); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal495_tree = (Object)adaptor.create(char_literal495);
							adaptor.addChild(root_0, char_literal495_tree);
							}

							if ( state.backtracking==0 ) {s("-");}
							}
							break;

					}

					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5285);
					multiplicativeExpression496=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression496.getTree());

					}
					break;

				default :
					break loop146;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 119, additiveExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "additiveExpression"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:739:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
	public final JavaJavaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		JavaJavaParser.multiplicativeExpression_return retval = new JavaJavaParser.multiplicativeExpression_return();
		retval.start = input.LT(1);
		int multiplicativeExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal498=null;
		Token char_literal499=null;
		Token char_literal500=null;
		ParserRuleReturnScope unaryExpression497 =null;
		ParserRuleReturnScope unaryExpression501 =null;

		Object char_literal498_tree=null;
		Object char_literal499_tree=null;
		Object char_literal500_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:740:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
			// /media/tony/disk2/_git/cs543/JavaJava.g:740:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5307);
			unaryExpression497=unaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression497.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:740:25: ( ( '*' | '/' | '%' ) unaryExpression )*
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==27||LA148_0==34||LA148_0==45) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:740:27: ( '*' | '/' | '%' ) unaryExpression
					{
					// /media/tony/disk2/_git/cs543/JavaJava.g:740:27: ( '*' | '/' | '%' )
					int alt147=3;
					switch ( input.LA(1) ) {
					case 34:
						{
						alt147=1;
						}
						break;
					case 45:
						{
						alt147=2;
						}
						break;
					case 27:
						{
						alt147=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 147, 0, input);
						throw nvae;
					}
					switch (alt147) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:740:29: '*'
							{
							char_literal498=(Token)match(input,34,FOLLOW_34_in_multiplicativeExpression5313); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal498_tree = (Object)adaptor.create(char_literal498);
							adaptor.addChild(root_0, char_literal498_tree);
							}

							if ( state.backtracking==0 ) {s("*");}
							}
							break;
						case 2 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:740:45: '/'
							{
							char_literal499=(Token)match(input,45,FOLLOW_45_in_multiplicativeExpression5319); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal499_tree = (Object)adaptor.create(char_literal499);
							adaptor.addChild(root_0, char_literal499_tree);
							}

							if ( state.backtracking==0 ) {s("/");}
							}
							break;
						case 3 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:740:61: '%'
							{
							char_literal500=(Token)match(input,27,FOLLOW_27_in_multiplicativeExpression5325); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal500_tree = (Object)adaptor.create(char_literal500);
							adaptor.addChild(root_0, char_literal500_tree);
							}

							if ( state.backtracking==0 ) {s("%");}
							}
							break;

					}

					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5330);
					unaryExpression501=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression501.getTree());

					}
					break;

				default :
					break loop148;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 120, multiplicativeExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiplicativeExpression"


	public static class unaryExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:743:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
	public final JavaJavaParser.unaryExpression_return unaryExpression() throws RecognitionException {
		JavaJavaParser.unaryExpression_return retval = new JavaJavaParser.unaryExpression_return();
		retval.start = input.LT(1);
		int unaryExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal502=null;
		Token char_literal504=null;
		Token string_literal506=null;
		Token string_literal508=null;
		ParserRuleReturnScope unaryExpression503 =null;
		ParserRuleReturnScope unaryExpression505 =null;
		ParserRuleReturnScope unaryExpression507 =null;
		ParserRuleReturnScope unaryExpression509 =null;
		ParserRuleReturnScope unaryExpressionNotPlusMinus510 =null;

		Object char_literal502_tree=null;
		Object char_literal504_tree=null;
		Object string_literal506_tree=null;
		Object string_literal508_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:744:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
			int alt149=5;
			switch ( input.LA(1) ) {
			case 36:
				{
				alt149=1;
				}
				break;
			case 40:
				{
				alt149=2;
				}
				break;
			case 37:
				{
				alt149=3;
				}
				break;
			case 41:
				{
				alt149=4;
				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case Identifier:
			case OctalLiteral:
			case StringLiteral:
			case 25:
			case 32:
			case 60:
			case 62:
			case 65:
			case 70:
			case 73:
			case 76:
			case 82:
			case 84:
			case 86:
			case 87:
			case 93:
			case 96:
			case 99:
			case 103:
			case 105:
			case 113:
				{
				alt149=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 149, 0, input);
				throw nvae;
			}
			switch (alt149) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:744:9: '+' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					char_literal502=(Token)match(input,36,FOLLOW_36_in_unaryExpression5356); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal502_tree = (Object)adaptor.create(char_literal502);
					adaptor.addChild(root_0, char_literal502_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5358);
					unaryExpression503=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression503.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:745:9: '-' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					char_literal504=(Token)match(input,40,FOLLOW_40_in_unaryExpression5368); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal504_tree = (Object)adaptor.create(char_literal504);
					adaptor.addChild(root_0, char_literal504_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5370);
					unaryExpression505=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression505.getTree());

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:746:9: '++' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					string_literal506=(Token)match(input,37,FOLLOW_37_in_unaryExpression5380); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal506_tree = (Object)adaptor.create(string_literal506);
					adaptor.addChild(root_0, string_literal506_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5382);
					unaryExpression507=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression507.getTree());

					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:747:9: '--' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					string_literal508=(Token)match(input,41,FOLLOW_41_in_unaryExpression5392); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal508_tree = (Object)adaptor.create(string_literal508);
					adaptor.addChild(root_0, string_literal508_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5394);
					unaryExpression509=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression509.getTree());

					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:748:9: unaryExpressionNotPlusMinus
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression5404);
					unaryExpressionNotPlusMinus510=unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus510.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 121, unaryExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryExpression"


	public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpressionNotPlusMinus"
	// /media/tony/disk2/_git/cs543/JavaJava.g:751:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );
	public final JavaJavaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
		JavaJavaParser.unaryExpressionNotPlusMinus_return retval = new JavaJavaParser.unaryExpressionNotPlusMinus_return();
		retval.start = input.LT(1);
		int unaryExpressionNotPlusMinus_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal511=null;
		Token char_literal513=null;
		Token string_literal518=null;
		Token string_literal519=null;
		ParserRuleReturnScope unaryExpression512 =null;
		ParserRuleReturnScope unaryExpression514 =null;
		ParserRuleReturnScope castExpression515 =null;
		ParserRuleReturnScope primary516 =null;
		ParserRuleReturnScope selector517 =null;

		Object char_literal511_tree=null;
		Object char_literal513_tree=null;
		Object string_literal518_tree=null;
		Object string_literal519_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:752:5: ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? )
			int alt152=4;
			switch ( input.LA(1) ) {
			case 113:
				{
				alt152=1;
				}
				break;
			case 25:
				{
				alt152=2;
				}
				break;
			case 32:
				{
				int LA152_3 = input.LA(2);
				if ( (synpred228_JavaJava()) ) {
					alt152=3;
				}
				else if ( (true) ) {
					alt152=4;
				}

				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case Identifier:
			case OctalLiteral:
			case StringLiteral:
			case 60:
			case 62:
			case 65:
			case 70:
			case 73:
			case 76:
			case 82:
			case 84:
			case 86:
			case 87:
			case 93:
			case 96:
			case 99:
			case 103:
			case 105:
				{
				alt152=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 152, 0, input);
				throw nvae;
			}
			switch (alt152) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:752:9: '~' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					char_literal511=(Token)match(input,113,FOLLOW_113_in_unaryExpressionNotPlusMinus5423); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal511_tree = (Object)adaptor.create(char_literal511);
					adaptor.addChild(root_0, char_literal511_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5425);
					unaryExpression512=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression512.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:753:9: '!' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					char_literal513=(Token)match(input,25,FOLLOW_25_in_unaryExpressionNotPlusMinus5435); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal513_tree = (Object)adaptor.create(char_literal513);
					adaptor.addChild(root_0, char_literal513_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5437);
					unaryExpression514=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression514.getTree());

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:754:9: castExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus5447);
					castExpression515=castExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpression515.getTree());

					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:755:9: primary ( selector )* ( '++' | '--' )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus5457);
					primary516=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary516.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:755:17: ( selector )*
					loop150:
					while (true) {
						int alt150=2;
						int LA150_0 = input.LA(1);
						if ( (LA150_0==43||LA150_0==55) ) {
							alt150=1;
						}

						switch (alt150) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:755:17: selector
							{
							pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus5459);
							selector517=selector();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, selector517.getTree());

							}
							break;

						default :
							break loop150;
						}
					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:755:27: ( '++' | '--' )?
					int alt151=3;
					int LA151_0 = input.LA(1);
					if ( (LA151_0==37) ) {
						alt151=1;
					}
					else if ( (LA151_0==41) ) {
						alt151=2;
					}
					switch (alt151) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:755:28: '++'
							{
							string_literal518=(Token)match(input,37,FOLLOW_37_in_unaryExpressionNotPlusMinus5463); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal518_tree = (Object)adaptor.create(string_literal518);
							adaptor.addChild(root_0, string_literal518_tree);
							}

							if ( state.backtracking==0 ) {s("++");}
							}
							break;
						case 2 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:755:44: '--'
							{
							string_literal519=(Token)match(input,41,FOLLOW_41_in_unaryExpressionNotPlusMinus5467); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal519_tree = (Object)adaptor.create(string_literal519);
							adaptor.addChild(root_0, string_literal519_tree);
							}

							if ( state.backtracking==0 ) {s("--");}
							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 122, unaryExpressionNotPlusMinus_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryExpressionNotPlusMinus"


	public static class castExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "castExpression"
	// /media/tony/disk2/_git/cs543/JavaJava.g:758:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus );
	public final JavaJavaParser.castExpression_return castExpression() throws RecognitionException {
		JavaJavaParser.castExpression_return retval = new JavaJavaParser.castExpression_return();
		retval.start = input.LT(1);
		int castExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal520=null;
		Token char_literal522=null;
		Token char_literal524=null;
		Token char_literal527=null;
		ParserRuleReturnScope primitiveType521 =null;
		ParserRuleReturnScope unaryExpression523 =null;
		ParserRuleReturnScope type525 =null;
		ParserRuleReturnScope expression526 =null;
		ParserRuleReturnScope unaryExpressionNotPlusMinus528 =null;

		Object char_literal520_tree=null;
		Object char_literal522_tree=null;
		Object char_literal524_tree=null;
		Object char_literal527_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:759:5: ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus )
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==32) ) {
				int LA154_1 = input.LA(2);
				if ( (synpred232_JavaJava()) ) {
					alt154=1;
				}
				else if ( (true) ) {
					alt154=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 154, 0, input);
				throw nvae;
			}

			switch (alt154) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:759:8: '(' primitiveType ')' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					char_literal520=(Token)match(input,32,FOLLOW_32_in_castExpression5489); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal520_tree = (Object)adaptor.create(char_literal520);
					adaptor.addChild(root_0, char_literal520_tree);
					}

					if ( state.backtracking==0 ) {s("(");}
					pushFollow(FOLLOW_primitiveType_in_castExpression5492);
					primitiveType521=primitiveType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType521.getTree());

					char_literal522=(Token)match(input,33,FOLLOW_33_in_castExpression5494); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal522_tree = (Object)adaptor.create(char_literal522);
					adaptor.addChild(root_0, char_literal522_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_castExpression5496);
					unaryExpression523=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression523.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:760:8: '(' ( type | expression ) ')' unaryExpressionNotPlusMinus
					{
					root_0 = (Object)adaptor.nil();


					char_literal524=(Token)match(input,32,FOLLOW_32_in_castExpression5505); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal524_tree = (Object)adaptor.create(char_literal524);
					adaptor.addChild(root_0, char_literal524_tree);
					}

					if ( state.backtracking==0 ) {s("(");}
					// /media/tony/disk2/_git/cs543/JavaJava.g:760:21: ( type | expression )
					int alt153=2;
					alt153 = dfa153.predict(input);
					switch (alt153) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:760:22: type
							{
							pushFollow(FOLLOW_type_in_castExpression5509);
							type525=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type525.getTree());

							}
							break;
						case 2 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:760:29: expression
							{
							pushFollow(FOLLOW_expression_in_castExpression5513);
							expression526=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression526.getTree());

							}
							break;

					}

					char_literal527=(Token)match(input,33,FOLLOW_33_in_castExpression5516); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal527_tree = (Object)adaptor.create(char_literal527);
					adaptor.addChild(root_0, char_literal527_tree);
					}

					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression5518);
					unaryExpressionNotPlusMinus528=unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus528.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 123, castExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "castExpression"


	public static class primary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// /media/tony/disk2/_git/cs543/JavaJava.g:763:1: primary : ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator |I1= Identifier ( '.' I4= Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );
	public final JavaJavaParser.primary_return primary() throws RecognitionException {
		JavaJavaParser.primary_return retval = new JavaJavaParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		Object root_0 = null;

		Token I1=null;
		Token I4=null;
		Token string_literal530=null;
		Token char_literal531=null;
		Token Identifier532=null;
		Token string_literal534=null;
		Token string_literal537=null;
		Token char_literal539=null;
		Token char_literal542=null;
		Token char_literal543=null;
		Token char_literal544=null;
		Token string_literal545=null;
		Token string_literal546=null;
		Token char_literal547=null;
		Token string_literal548=null;
		ParserRuleReturnScope parExpression529 =null;
		ParserRuleReturnScope identifierSuffix533 =null;
		ParserRuleReturnScope superSuffix535 =null;
		ParserRuleReturnScope literal536 =null;
		ParserRuleReturnScope creator538 =null;
		ParserRuleReturnScope identifierSuffix540 =null;
		ParserRuleReturnScope primitiveType541 =null;

		Object I1_tree=null;
		Object I4_tree=null;
		Object string_literal530_tree=null;
		Object char_literal531_tree=null;
		Object Identifier532_tree=null;
		Object string_literal534_tree=null;
		Object string_literal537_tree=null;
		Object char_literal539_tree=null;
		Object char_literal542_tree=null;
		Object char_literal543_tree=null;
		Object char_literal544_tree=null;
		Object string_literal545_tree=null;
		Object string_literal546_tree=null;
		Object char_literal547_tree=null;
		Object string_literal548_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:764:5: ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator |I1= Identifier ( '.' I4= Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' )
			int alt160=8;
			switch ( input.LA(1) ) {
			case 32:
				{
				alt160=1;
				}
				break;
			case 99:
				{
				alt160=2;
				}
				break;
			case 96:
				{
				alt160=3;
				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case OctalLiteral:
			case StringLiteral:
			case 73:
			case 87:
			case 103:
				{
				alt160=4;
				}
				break;
			case 86:
				{
				alt160=5;
				}
				break;
			case Identifier:
				{
				alt160=6;
				}
				break;
			case 60:
			case 62:
			case 65:
			case 70:
			case 76:
			case 82:
			case 84:
			case 93:
				{
				alt160=7;
				}
				break;
			case 105:
				{
				alt160=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 160, 0, input);
				throw nvae;
			}
			switch (alt160) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:764:9: parExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_parExpression_in_primary5537);
					parExpression529=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression529.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:765:9: 'this' ( '.' Identifier )* ( identifierSuffix )?
					{
					root_0 = (Object)adaptor.nil();


					string_literal530=(Token)match(input,99,FOLLOW_99_in_primary5547); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal530_tree = (Object)adaptor.create(string_literal530);
					adaptor.addChild(root_0, string_literal530_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("this");}
					// /media/tony/disk2/_git/cs543/JavaJava.g:765:72: ( '.' Identifier )*
					loop155:
					while (true) {
						int alt155=2;
						int LA155_0 = input.LA(1);
						if ( (LA155_0==43) ) {
							int LA155_2 = input.LA(2);
							if ( (LA155_2==Identifier) ) {
								int LA155_3 = input.LA(3);
								if ( (synpred235_JavaJava()) ) {
									alt155=1;
								}

							}

						}

						switch (alt155) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:765:73: '.' Identifier
							{
							char_literal531=(Token)match(input,43,FOLLOW_43_in_primary5551); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal531_tree = (Object)adaptor.create(char_literal531);
							adaptor.addChild(root_0, char_literal531_tree);
							}

							if ( state.backtracking==0 ) {s(".");}
							Identifier532=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary5555); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Identifier532_tree = (Object)adaptor.create(Identifier532);
							adaptor.addChild(root_0, Identifier532_tree);
							}

							}
							break;

						default :
							break loop155;
						}
					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:765:100: ( identifierSuffix )?
					int alt156=2;
					switch ( input.LA(1) ) {
						case 55:
							{
							int LA156_1 = input.LA(2);
							if ( (synpred236_JavaJava()) ) {
								alt156=1;
							}
							}
							break;
						case 32:
							{
							alt156=1;
							}
							break;
						case 43:
							{
							int LA156_3 = input.LA(2);
							if ( (synpred236_JavaJava()) ) {
								alt156=1;
							}
							}
							break;
					}
					switch (alt156) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:765:100: identifierSuffix
							{
							pushFollow(FOLLOW_identifierSuffix_in_primary5559);
							identifierSuffix533=identifierSuffix();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierSuffix533.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:766:9: 'super' superSuffix
					{
					root_0 = (Object)adaptor.nil();


					string_literal534=(Token)match(input,96,FOLLOW_96_in_primary5571); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal534_tree = (Object)adaptor.create(string_literal534);
					adaptor.addChild(root_0, string_literal534_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
					pushFollow(FOLLOW_superSuffix_in_primary5574);
					superSuffix535=superSuffix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix535.getTree());

					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:767:9: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_primary5584);
					literal536=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal536.getTree());

					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:768:9: 'new' creator
					{
					root_0 = (Object)adaptor.nil();


					string_literal537=(Token)match(input,86,FOLLOW_86_in_primary5594); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal537_tree = (Object)adaptor.create(string_literal537);
					adaptor.addChild(root_0, string_literal537_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("new");}
					pushFollow(FOLLOW_creator_in_primary5597);
					creator538=creator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, creator538.getTree());

					}
					break;
				case 6 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:769:9: I1= Identifier ( '.' I4= Identifier )* ( identifierSuffix )?
					{
					root_0 = (Object)adaptor.nil();


					I1=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary5609); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					I1_tree = (Object)adaptor.create(I1);
					adaptor.addChild(root_0, I1_tree);
					}

					id((I1!=null?I1.getText():null));
					// /media/tony/disk2/_git/cs543/JavaJava.g:769:41: ( '.' I4= Identifier )*
					loop157:
					while (true) {
						int alt157=2;
						int LA157_0 = input.LA(1);
						if ( (LA157_0==43) ) {
							int LA157_2 = input.LA(2);
							if ( (LA157_2==Identifier) ) {
								int LA157_3 = input.LA(3);
								if ( (synpred241_JavaJava()) ) {
									alt157=1;
								}

							}

						}

						switch (alt157) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:769:42: '.' I4= Identifier
							{
							char_literal539=(Token)match(input,43,FOLLOW_43_in_primary5614); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal539_tree = (Object)adaptor.create(char_literal539);
							adaptor.addChild(root_0, char_literal539_tree);
							}

							if ( state.backtracking==0 ) {s(".");}
							I4=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary5620); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							I4_tree = (Object)adaptor.create(I4);
							adaptor.addChild(root_0, I4_tree);
							}

							}
							break;

						default :
							break loop157;
						}
					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:769:73: ( identifierSuffix )?
					int alt158=2;
					switch ( input.LA(1) ) {
						case 55:
							{
							int LA158_1 = input.LA(2);
							if ( (synpred242_JavaJava()) ) {
								alt158=1;
							}
							}
							break;
						case 32:
							{
							alt158=1;
							}
							break;
						case 43:
							{
							int LA158_3 = input.LA(2);
							if ( (synpred242_JavaJava()) ) {
								alt158=1;
							}
							}
							break;
					}
					switch (alt158) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:769:73: identifierSuffix
							{
							pushFollow(FOLLOW_identifierSuffix_in_primary5625);
							identifierSuffix540=identifierSuffix();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierSuffix540.getTree());

							}
							break;

					}

					}
					break;
				case 7 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:770:9: primitiveType ( '[' ']' )* '.' 'class'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveType_in_primary5637);
					primitiveType541=primitiveType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType541.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:770:23: ( '[' ']' )*
					loop159:
					while (true) {
						int alt159=2;
						int LA159_0 = input.LA(1);
						if ( (LA159_0==55) ) {
							alt159=1;
						}

						switch (alt159) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:770:24: '[' ']'
							{
							char_literal542=(Token)match(input,55,FOLLOW_55_in_primary5640); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal542_tree = (Object)adaptor.create(char_literal542);
							adaptor.addChild(root_0, char_literal542_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal543=(Token)match(input,56,FOLLOW_56_in_primary5643); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal543_tree = (Object)adaptor.create(char_literal543);
							adaptor.addChild(root_0, char_literal543_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							break loop159;
						}
					}

					char_literal544=(Token)match(input,43,FOLLOW_43_in_primary5648); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal544_tree = (Object)adaptor.create(char_literal544);
					adaptor.addChild(root_0, char_literal544_tree);
					}

					string_literal545=(Token)match(input,66,FOLLOW_66_in_primary5650); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal545_tree = (Object)adaptor.create(string_literal545);
					adaptor.addChild(root_0, string_literal545_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("class");}
					}
					break;
				case 8 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:771:9: 'void' '.' 'class'
					{
					root_0 = (Object)adaptor.nil();


					string_literal546=(Token)match(input,105,FOLLOW_105_in_primary5662); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal546_tree = (Object)adaptor.create(string_literal546);
					adaptor.addChild(root_0, string_literal546_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("void");}
					char_literal547=(Token)match(input,43,FOLLOW_43_in_primary5665); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal547_tree = (Object)adaptor.create(char_literal547);
					adaptor.addChild(root_0, char_literal547_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal548=(Token)match(input,66,FOLLOW_66_in_primary5669); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal548_tree = (Object)adaptor.create(string_literal548);
					adaptor.addChild(root_0, string_literal548_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("class");}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 124, primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class identifierSuffix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifierSuffix"
	// /media/tony/disk2/_git/cs543/JavaJava.g:774:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator );
	public final JavaJavaParser.identifierSuffix_return identifierSuffix() throws RecognitionException {
		JavaJavaParser.identifierSuffix_return retval = new JavaJavaParser.identifierSuffix_return();
		retval.start = input.LT(1);
		int identifierSuffix_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal549=null;
		Token char_literal550=null;
		Token char_literal551=null;
		Token string_literal552=null;
		Token char_literal553=null;
		Token char_literal555=null;
		Token char_literal557=null;
		Token string_literal558=null;
		Token char_literal559=null;
		Token char_literal561=null;
		Token string_literal562=null;
		Token char_literal563=null;
		Token string_literal564=null;
		Token char_literal566=null;
		Token string_literal567=null;
		ParserRuleReturnScope expression554 =null;
		ParserRuleReturnScope arguments556 =null;
		ParserRuleReturnScope explicitGenericInvocation560 =null;
		ParserRuleReturnScope arguments565 =null;
		ParserRuleReturnScope innerCreator568 =null;

		Object char_literal549_tree=null;
		Object char_literal550_tree=null;
		Object char_literal551_tree=null;
		Object string_literal552_tree=null;
		Object char_literal553_tree=null;
		Object char_literal555_tree=null;
		Object char_literal557_tree=null;
		Object string_literal558_tree=null;
		Object char_literal559_tree=null;
		Object char_literal561_tree=null;
		Object string_literal562_tree=null;
		Object char_literal563_tree=null;
		Object string_literal564_tree=null;
		Object char_literal566_tree=null;
		Object string_literal567_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:775:5: ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator )
			int alt163=8;
			switch ( input.LA(1) ) {
			case 55:
				{
				int LA163_1 = input.LA(2);
				if ( (LA163_1==56) ) {
					alt163=1;
				}
				else if ( ((LA163_1 >= CharacterLiteral && LA163_1 <= DecimalLiteral)||LA163_1==FloatingPointLiteral||(LA163_1 >= HexLiteral && LA163_1 <= Identifier)||(LA163_1 >= OctalLiteral && LA163_1 <= StringLiteral)||LA163_1==25||LA163_1==32||(LA163_1 >= 36 && LA163_1 <= 37)||(LA163_1 >= 40 && LA163_1 <= 41)||LA163_1==60||LA163_1==62||LA163_1==65||LA163_1==70||LA163_1==73||LA163_1==76||LA163_1==82||LA163_1==84||(LA163_1 >= 86 && LA163_1 <= 87)||LA163_1==93||LA163_1==96||LA163_1==99||LA163_1==103||LA163_1==105||LA163_1==113) ) {
					alt163=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 163, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 32:
				{
				alt163=3;
				}
				break;
			case 43:
				{
				switch ( input.LA(2) ) {
				case 66:
					{
					alt163=4;
					}
					break;
				case 49:
					{
					alt163=5;
					}
					break;
				case 99:
					{
					alt163=6;
					}
					break;
				case 96:
					{
					alt163=7;
					}
					break;
				case 86:
					{
					alt163=8;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 163, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 163, 0, input);
				throw nvae;
			}
			switch (alt163) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:775:9: ( '[' ']' )+ '.' 'class'
					{
					root_0 = (Object)adaptor.nil();


					// /media/tony/disk2/_git/cs543/JavaJava.g:775:9: ( '[' ']' )+
					int cnt161=0;
					loop161:
					while (true) {
						int alt161=2;
						int LA161_0 = input.LA(1);
						if ( (LA161_0==55) ) {
							alt161=1;
						}

						switch (alt161) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:775:10: '[' ']'
							{
							char_literal549=(Token)match(input,55,FOLLOW_55_in_identifierSuffix5690); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal549_tree = (Object)adaptor.create(char_literal549);
							adaptor.addChild(root_0, char_literal549_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal550=(Token)match(input,56,FOLLOW_56_in_identifierSuffix5694); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal550_tree = (Object)adaptor.create(char_literal550);
							adaptor.addChild(root_0, char_literal550_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							if ( cnt161 >= 1 ) break loop161;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(161, input);
							throw eee;
						}
						cnt161++;
					}

					char_literal551=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5700); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal551_tree = (Object)adaptor.create(char_literal551);
					adaptor.addChild(root_0, char_literal551_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal552=(Token)match(input,66,FOLLOW_66_in_identifierSuffix5704); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal552_tree = (Object)adaptor.create(string_literal552);
					adaptor.addChild(root_0, string_literal552_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("class");}
					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:776:9: ( '[' expression ']' )+
					{
					root_0 = (Object)adaptor.nil();


					// /media/tony/disk2/_git/cs543/JavaJava.g:776:9: ( '[' expression ']' )+
					int cnt162=0;
					loop162:
					while (true) {
						int alt162=2;
						int LA162_0 = input.LA(1);
						if ( (LA162_0==55) ) {
							int LA162_2 = input.LA(2);
							if ( (synpred248_JavaJava()) ) {
								alt162=1;
							}

						}

						switch (alt162) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:776:10: '[' expression ']'
							{
							char_literal553=(Token)match(input,55,FOLLOW_55_in_identifierSuffix5716); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal553_tree = (Object)adaptor.create(char_literal553);
							adaptor.addChild(root_0, char_literal553_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							pushFollow(FOLLOW_expression_in_identifierSuffix5720);
							expression554=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression554.getTree());

							char_literal555=(Token)match(input,56,FOLLOW_56_in_identifierSuffix5722); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal555_tree = (Object)adaptor.create(char_literal555);
							adaptor.addChild(root_0, char_literal555_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							if ( cnt162 >= 1 ) break loop162;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(162, input);
							throw eee;
						}
						cnt162++;
					}

					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:777:9: arguments
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arguments_in_identifierSuffix5737);
					arguments556=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments556.getTree());

					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:778:9: '.' 'class'
					{
					root_0 = (Object)adaptor.nil();


					char_literal557=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5748); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal557_tree = (Object)adaptor.create(char_literal557);
					adaptor.addChild(root_0, char_literal557_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal558=(Token)match(input,66,FOLLOW_66_in_identifierSuffix5752); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal558_tree = (Object)adaptor.create(string_literal558);
					adaptor.addChild(root_0, string_literal558_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("class");}
					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:779:9: '.' explicitGenericInvocation
					{
					root_0 = (Object)adaptor.nil();


					char_literal559=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5763); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal559_tree = (Object)adaptor.create(char_literal559);
					adaptor.addChild(root_0, char_literal559_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					pushFollow(FOLLOW_explicitGenericInvocation_in_identifierSuffix5767);
					explicitGenericInvocation560=explicitGenericInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitGenericInvocation560.getTree());

					}
					break;
				case 6 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:780:9: '.' 'this'
					{
					root_0 = (Object)adaptor.nil();


					char_literal561=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5777); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal561_tree = (Object)adaptor.create(char_literal561);
					adaptor.addChild(root_0, char_literal561_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal562=(Token)match(input,99,FOLLOW_99_in_identifierSuffix5781); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal562_tree = (Object)adaptor.create(string_literal562);
					adaptor.addChild(root_0, string_literal562_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("this");}
					}
					break;
				case 7 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:781:9: '.' 'super' arguments
					{
					root_0 = (Object)adaptor.nil();


					char_literal563=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5792); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal563_tree = (Object)adaptor.create(char_literal563);
					adaptor.addChild(root_0, char_literal563_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal564=(Token)match(input,96,FOLLOW_96_in_identifierSuffix5796); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal564_tree = (Object)adaptor.create(string_literal564);
					adaptor.addChild(root_0, string_literal564_tree);
					}

					pushFollow(FOLLOW_arguments_in_identifierSuffix5798);
					arguments565=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments565.getTree());

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
					}
					break;
				case 8 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:782:9: '.' 'new' innerCreator
					{
					root_0 = (Object)adaptor.nil();


					char_literal566=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5810); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal566_tree = (Object)adaptor.create(char_literal566);
					adaptor.addChild(root_0, char_literal566_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal567=(Token)match(input,86,FOLLOW_86_in_identifierSuffix5814); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal567_tree = (Object)adaptor.create(string_literal567);
					adaptor.addChild(root_0, string_literal567_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("new");}
					pushFollow(FOLLOW_innerCreator_in_identifierSuffix5817);
					innerCreator568=innerCreator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, innerCreator568.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 125, identifierSuffix_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "identifierSuffix"


	public static class creator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "creator"
	// /media/tony/disk2/_git/cs543/JavaJava.g:785:1: creator : ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) );
	public final JavaJavaParser.creator_return creator() throws RecognitionException {
		JavaJavaParser.creator_return retval = new JavaJavaParser.creator_return();
		retval.start = input.LT(1);
		int creator_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope nonWildcardTypeArguments569 =null;
		ParserRuleReturnScope createdName570 =null;
		ParserRuleReturnScope classCreatorRest571 =null;
		ParserRuleReturnScope createdName572 =null;
		ParserRuleReturnScope arrayCreatorRest573 =null;
		ParserRuleReturnScope classCreatorRest574 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:786:5: ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) )
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==49) ) {
				alt165=1;
			}
			else if ( (LA165_0==Identifier||LA165_0==60||LA165_0==62||LA165_0==65||LA165_0==70||LA165_0==76||LA165_0==82||LA165_0==84||LA165_0==93) ) {
				alt165=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 165, 0, input);
				throw nvae;
			}

			switch (alt165) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:786:9: nonWildcardTypeArguments createdName classCreatorRest
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator5836);
					nonWildcardTypeArguments569=nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments569.getTree());

					pushFollow(FOLLOW_createdName_in_creator5838);
					createdName570=createdName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName570.getTree());

					pushFollow(FOLLOW_classCreatorRest_in_creator5840);
					classCreatorRest571=classCreatorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest571.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:787:9: createdName ( arrayCreatorRest | classCreatorRest )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_createdName_in_creator5850);
					createdName572=createdName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName572.getTree());

					// /media/tony/disk2/_git/cs543/JavaJava.g:787:21: ( arrayCreatorRest | classCreatorRest )
					int alt164=2;
					int LA164_0 = input.LA(1);
					if ( (LA164_0==55) ) {
						alt164=1;
					}
					else if ( (LA164_0==32) ) {
						alt164=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 164, 0, input);
						throw nvae;
					}

					switch (alt164) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:787:22: arrayCreatorRest
							{
							pushFollow(FOLLOW_arrayCreatorRest_in_creator5853);
							arrayCreatorRest573=arrayCreatorRest();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreatorRest573.getTree());

							}
							break;
						case 2 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:787:41: classCreatorRest
							{
							pushFollow(FOLLOW_classCreatorRest_in_creator5857);
							classCreatorRest574=classCreatorRest();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest574.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 126, creator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "creator"


	public static class createdName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "createdName"
	// /media/tony/disk2/_git/cs543/JavaJava.g:790:1: createdName : ( classOrInterfaceType | primitiveType );
	public final JavaJavaParser.createdName_return createdName() throws RecognitionException {
		JavaJavaParser.createdName_return retval = new JavaJavaParser.createdName_return();
		retval.start = input.LT(1);
		int createdName_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope classOrInterfaceType575 =null;
		ParserRuleReturnScope primitiveType576 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:791:5: ( classOrInterfaceType | primitiveType )
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==Identifier) ) {
				alt166=1;
			}
			else if ( (LA166_0==60||LA166_0==62||LA166_0==65||LA166_0==70||LA166_0==76||LA166_0==82||LA166_0==84||LA166_0==93) ) {
				alt166=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 166, 0, input);
				throw nvae;
			}

			switch (alt166) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:791:8: classOrInterfaceType
					{
					root_0 = (Object)adaptor.nil();


					if ( state.backtracking==0 ) {constructorcall=true;}
					pushFollow(FOLLOW_classOrInterfaceType_in_createdName5879);
					classOrInterfaceType575=classOrInterfaceType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceType575.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:792:9: primitiveType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveType_in_createdName5889);
					primitiveType576=primitiveType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType576.getTree());

					if ( state.backtracking==0 ) {primitive = true;}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 127, createdName_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "createdName"


	public static class innerCreator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "innerCreator"
	// /media/tony/disk2/_git/cs543/JavaJava.g:795:1: innerCreator : ( nonWildcardTypeArguments )? Identifier classCreatorRest ;
	public final JavaJavaParser.innerCreator_return innerCreator() throws RecognitionException {
		JavaJavaParser.innerCreator_return retval = new JavaJavaParser.innerCreator_return();
		retval.start = input.LT(1);
		int innerCreator_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier578=null;
		ParserRuleReturnScope nonWildcardTypeArguments577 =null;
		ParserRuleReturnScope classCreatorRest579 =null;

		Object Identifier578_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:796:5: ( ( nonWildcardTypeArguments )? Identifier classCreatorRest )
			// /media/tony/disk2/_git/cs543/JavaJava.g:796:9: ( nonWildcardTypeArguments )? Identifier classCreatorRest
			{
			root_0 = (Object)adaptor.nil();


			// /media/tony/disk2/_git/cs543/JavaJava.g:796:9: ( nonWildcardTypeArguments )?
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==49) ) {
				alt167=1;
			}
			switch (alt167) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:796:9: nonWildcardTypeArguments
					{
					pushFollow(FOLLOW_nonWildcardTypeArguments_in_innerCreator5914);
					nonWildcardTypeArguments577=nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments577.getTree());

					}
					break;

			}

			Identifier578=(Token)match(input,Identifier,FOLLOW_Identifier_in_innerCreator5917); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier578_tree = (Object)adaptor.create(Identifier578);
			adaptor.addChild(root_0, Identifier578_tree);
			}

			pushFollow(FOLLOW_classCreatorRest_in_innerCreator5919);
			classCreatorRest579=classCreatorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest579.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 128, innerCreator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "innerCreator"


	public static class arrayCreatorRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayCreatorRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:799:1: arrayCreatorRest : '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) ;
	public final JavaJavaParser.arrayCreatorRest_return arrayCreatorRest() throws RecognitionException {
		JavaJavaParser.arrayCreatorRest_return retval = new JavaJavaParser.arrayCreatorRest_return();
		retval.start = input.LT(1);
		int arrayCreatorRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal580=null;
		Token char_literal581=null;
		Token char_literal582=null;
		Token char_literal583=null;
		Token char_literal586=null;
		Token char_literal587=null;
		Token char_literal589=null;
		Token char_literal590=null;
		Token char_literal591=null;
		ParserRuleReturnScope arrayInitializer584 =null;
		ParserRuleReturnScope expression585 =null;
		ParserRuleReturnScope expression588 =null;

		Object char_literal580_tree=null;
		Object char_literal581_tree=null;
		Object char_literal582_tree=null;
		Object char_literal583_tree=null;
		Object char_literal586_tree=null;
		Object char_literal587_tree=null;
		Object char_literal589_tree=null;
		Object char_literal590_tree=null;
		Object char_literal591_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:800:5: ( '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) )
			// /media/tony/disk2/_git/cs543/JavaJava.g:800:9: '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
			{
			root_0 = (Object)adaptor.nil();


			char_literal580=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest5938); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal580_tree = (Object)adaptor.create(char_literal580);
			adaptor.addChild(root_0, char_literal580_tree);
			}

			if ( state.backtracking==0 ) {s("[");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:801:9: ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==56) ) {
				alt171=1;
			}
			else if ( ((LA171_0 >= CharacterLiteral && LA171_0 <= DecimalLiteral)||LA171_0==FloatingPointLiteral||(LA171_0 >= HexLiteral && LA171_0 <= Identifier)||(LA171_0 >= OctalLiteral && LA171_0 <= StringLiteral)||LA171_0==25||LA171_0==32||(LA171_0 >= 36 && LA171_0 <= 37)||(LA171_0 >= 40 && LA171_0 <= 41)||LA171_0==60||LA171_0==62||LA171_0==65||LA171_0==70||LA171_0==73||LA171_0==76||LA171_0==82||LA171_0==84||(LA171_0 >= 86 && LA171_0 <= 87)||LA171_0==93||LA171_0==96||LA171_0==99||LA171_0==103||LA171_0==105||LA171_0==113) ) {
				alt171=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 171, 0, input);
				throw nvae;
			}

			switch (alt171) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:801:13: ']' ( '[' ']' )* arrayInitializer
					{
					char_literal581=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest5953); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal581_tree = (Object)adaptor.create(char_literal581);
					adaptor.addChild(root_0, char_literal581_tree);
					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:801:17: ( '[' ']' )*
					loop168:
					while (true) {
						int alt168=2;
						int LA168_0 = input.LA(1);
						if ( (LA168_0==55) ) {
							alt168=1;
						}

						switch (alt168) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:801:18: '[' ']'
							{
							char_literal582=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest5956); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal582_tree = (Object)adaptor.create(char_literal582);
							adaptor.addChild(root_0, char_literal582_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal583=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest5959); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal583_tree = (Object)adaptor.create(char_literal583);
							adaptor.addChild(root_0, char_literal583_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							break loop168;
						}
					}

					pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest5965);
					arrayInitializer584=arrayInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer584.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:802:13: expression ']' ( '[' expression ']' )* ( '[' ']' )*
					{
					pushFollow(FOLLOW_expression_in_arrayCreatorRest5979);
					expression585=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression585.getTree());

					char_literal586=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest5981); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal586_tree = (Object)adaptor.create(char_literal586);
					adaptor.addChild(root_0, char_literal586_tree);
					}

					if ( state.backtracking==0 ) {s("]");}
					// /media/tony/disk2/_git/cs543/JavaJava.g:802:38: ( '[' expression ']' )*
					loop169:
					while (true) {
						int alt169=2;
						int LA169_0 = input.LA(1);
						if ( (LA169_0==55) ) {
							int LA169_1 = input.LA(2);
							if ( (synpred261_JavaJava()) ) {
								alt169=1;
							}

						}

						switch (alt169) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:802:39: '[' expression ']'
							{
							char_literal587=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest5986); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal587_tree = (Object)adaptor.create(char_literal587);
							adaptor.addChild(root_0, char_literal587_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							pushFollow(FOLLOW_expression_in_arrayCreatorRest5989);
							expression588=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression588.getTree());

							char_literal589=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest5991); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal589_tree = (Object)adaptor.create(char_literal589);
							adaptor.addChild(root_0, char_literal589_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							break loop169;
						}
					}

					// /media/tony/disk2/_git/cs543/JavaJava.g:802:79: ( '[' ']' )*
					loop170:
					while (true) {
						int alt170=2;
						int LA170_0 = input.LA(1);
						if ( (LA170_0==55) ) {
							int LA170_2 = input.LA(2);
							if ( (LA170_2==56) ) {
								alt170=1;
							}

						}

						switch (alt170) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:802:80: '[' ']'
							{
							char_literal590=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest5998); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal590_tree = (Object)adaptor.create(char_literal590);
							adaptor.addChild(root_0, char_literal590_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal591=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest6001); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal591_tree = (Object)adaptor.create(char_literal591);
							adaptor.addChild(root_0, char_literal591_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							break loop170;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 129, arrayCreatorRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayCreatorRest"


	public static class classCreatorRest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classCreatorRest"
	// /media/tony/disk2/_git/cs543/JavaJava.g:806:1: classCreatorRest : arguments ( classBody )? ;
	public final JavaJavaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
		JavaJavaParser.classCreatorRest_return retval = new JavaJavaParser.classCreatorRest_return();
		retval.start = input.LT(1);
		int classCreatorRest_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope arguments592 =null;
		ParserRuleReturnScope classBody593 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:807:5: ( arguments ( classBody )? )
			// /media/tony/disk2/_git/cs543/JavaJava.g:807:8: arguments ( classBody )?
			{
			root_0 = (Object)adaptor.nil();


			if ( state.backtracking==0 ) {constructorcall=false;}
			pushFollow(FOLLOW_arguments_in_classCreatorRest6034);
			arguments592=arguments();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments592.getTree());

			// /media/tony/disk2/_git/cs543/JavaJava.g:807:43: ( classBody )?
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==108) ) {
				alt172=1;
			}
			switch (alt172) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:807:43: classBody
					{
					pushFollow(FOLLOW_classBody_in_classCreatorRest6036);
					classBody593=classBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody593.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 130, classCreatorRest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classCreatorRest"


	public static class explicitGenericInvocation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "explicitGenericInvocation"
	// /media/tony/disk2/_git/cs543/JavaJava.g:810:1: explicitGenericInvocation : nonWildcardTypeArguments Identifier arguments ;
	public final JavaJavaParser.explicitGenericInvocation_return explicitGenericInvocation() throws RecognitionException {
		JavaJavaParser.explicitGenericInvocation_return retval = new JavaJavaParser.explicitGenericInvocation_return();
		retval.start = input.LT(1);
		int explicitGenericInvocation_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier595=null;
		ParserRuleReturnScope nonWildcardTypeArguments594 =null;
		ParserRuleReturnScope arguments596 =null;

		Object Identifier595_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:811:5: ( nonWildcardTypeArguments Identifier arguments )
			// /media/tony/disk2/_git/cs543/JavaJava.g:811:9: nonWildcardTypeArguments Identifier arguments
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation6060);
			nonWildcardTypeArguments594=nonWildcardTypeArguments();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments594.getTree());

			Identifier595=(Token)match(input,Identifier,FOLLOW_Identifier_in_explicitGenericInvocation6062); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier595_tree = (Object)adaptor.create(Identifier595);
			adaptor.addChild(root_0, Identifier595_tree);
			}

			if ( state.backtracking==0 ) {if(primitive) id((Identifier595!=null?Identifier595.getText():null));}
			pushFollow(FOLLOW_arguments_in_explicitGenericInvocation6065);
			arguments596=arguments();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments596.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 131, explicitGenericInvocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "explicitGenericInvocation"


	public static class nonWildcardTypeArguments_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nonWildcardTypeArguments"
	// /media/tony/disk2/_git/cs543/JavaJava.g:814:1: nonWildcardTypeArguments : '<' typeList '>' ;
	public final JavaJavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments() throws RecognitionException {
		JavaJavaParser.nonWildcardTypeArguments_return retval = new JavaJavaParser.nonWildcardTypeArguments_return();
		retval.start = input.LT(1);
		int nonWildcardTypeArguments_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal597=null;
		Token char_literal599=null;
		ParserRuleReturnScope typeList598 =null;

		Object char_literal597_tree=null;
		Object char_literal599_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:815:5: ( '<' typeList '>' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:815:9: '<' typeList '>'
			{
			root_0 = (Object)adaptor.nil();


			char_literal597=(Token)match(input,49,FOLLOW_49_in_nonWildcardTypeArguments6088); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal597_tree = (Object)adaptor.create(char_literal597);
			adaptor.addChild(root_0, char_literal597_tree);
			}

			if ( state.backtracking==0 ) {s("<");}
			pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments6092);
			typeList598=typeList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList598.getTree());

			char_literal599=(Token)match(input,52,FOLLOW_52_in_nonWildcardTypeArguments6094); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal599_tree = (Object)adaptor.create(char_literal599);
			adaptor.addChild(root_0, char_literal599_tree);
			}

			if ( state.backtracking==0 ) {s(">");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 132, nonWildcardTypeArguments_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "nonWildcardTypeArguments"


	public static class selector_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "selector"
	// /media/tony/disk2/_git/cs543/JavaJava.g:818:1: selector : ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' );
	public final JavaJavaParser.selector_return selector() throws RecognitionException {
		JavaJavaParser.selector_return retval = new JavaJavaParser.selector_return();
		retval.start = input.LT(1);
		int selector_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal600=null;
		Token Identifier601=null;
		Token char_literal603=null;
		Token string_literal604=null;
		Token char_literal605=null;
		Token string_literal606=null;
		Token char_literal608=null;
		Token string_literal609=null;
		Token char_literal611=null;
		Token char_literal613=null;
		ParserRuleReturnScope arguments602 =null;
		ParserRuleReturnScope superSuffix607 =null;
		ParserRuleReturnScope innerCreator610 =null;
		ParserRuleReturnScope expression612 =null;

		Object char_literal600_tree=null;
		Object Identifier601_tree=null;
		Object char_literal603_tree=null;
		Object string_literal604_tree=null;
		Object char_literal605_tree=null;
		Object string_literal606_tree=null;
		Object char_literal608_tree=null;
		Object string_literal609_tree=null;
		Object char_literal611_tree=null;
		Object char_literal613_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:819:5: ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' )
			int alt174=5;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==43) ) {
				switch ( input.LA(2) ) {
				case Identifier:
					{
					alt174=1;
					}
					break;
				case 99:
					{
					alt174=2;
					}
					break;
				case 96:
					{
					alt174=3;
					}
					break;
				case 86:
					{
					alt174=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 174, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA174_0==55) ) {
				alt174=5;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 174, 0, input);
				throw nvae;
			}

			switch (alt174) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:819:9: '.' Identifier ( arguments )?
					{
					root_0 = (Object)adaptor.nil();


					char_literal600=(Token)match(input,43,FOLLOW_43_in_selector6119); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal600_tree = (Object)adaptor.create(char_literal600);
					adaptor.addChild(root_0, char_literal600_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					Identifier601=(Token)match(input,Identifier,FOLLOW_Identifier_in_selector6123); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier601_tree = (Object)adaptor.create(Identifier601);
					adaptor.addChild(root_0, Identifier601_tree);
					}

					if ( state.backtracking==0 ) {if(primitive) id((Identifier601!=null?Identifier601.getText():null));}
					// /media/tony/disk2/_git/cs543/JavaJava.g:819:73: ( arguments )?
					int alt173=2;
					int LA173_0 = input.LA(1);
					if ( (LA173_0==32) ) {
						alt173=1;
					}
					switch (alt173) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:819:73: arguments
							{
							pushFollow(FOLLOW_arguments_in_selector6128);
							arguments602=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments602.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:820:9: '.' 'this'
					{
					root_0 = (Object)adaptor.nil();


					char_literal603=(Token)match(input,43,FOLLOW_43_in_selector6139); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal603_tree = (Object)adaptor.create(char_literal603);
					adaptor.addChild(root_0, char_literal603_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal604=(Token)match(input,99,FOLLOW_99_in_selector6143); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal604_tree = (Object)adaptor.create(string_literal604);
					adaptor.addChild(root_0, string_literal604_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("this");}
					}
					break;
				case 3 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:821:9: '.' 'super' superSuffix
					{
					root_0 = (Object)adaptor.nil();


					char_literal605=(Token)match(input,43,FOLLOW_43_in_selector6155); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal605_tree = (Object)adaptor.create(char_literal605);
					adaptor.addChild(root_0, char_literal605_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal606=(Token)match(input,96,FOLLOW_96_in_selector6159); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal606_tree = (Object)adaptor.create(string_literal606);
					adaptor.addChild(root_0, string_literal606_tree);
					}

					pushFollow(FOLLOW_superSuffix_in_selector6161);
					superSuffix607=superSuffix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix607.getTree());

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
					}
					break;
				case 4 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:822:9: '.' 'new' innerCreator
					{
					root_0 = (Object)adaptor.nil();


					char_literal608=(Token)match(input,43,FOLLOW_43_in_selector6173); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal608_tree = (Object)adaptor.create(char_literal608);
					adaptor.addChild(root_0, char_literal608_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal609=(Token)match(input,86,FOLLOW_86_in_selector6177); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal609_tree = (Object)adaptor.create(string_literal609);
					adaptor.addChild(root_0, string_literal609_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("new");}
					pushFollow(FOLLOW_innerCreator_in_selector6182);
					innerCreator610=innerCreator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, innerCreator610.getTree());

					}
					break;
				case 5 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:823:9: '[' expression ']'
					{
					root_0 = (Object)adaptor.nil();


					char_literal611=(Token)match(input,55,FOLLOW_55_in_selector6192); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal611_tree = (Object)adaptor.create(char_literal611);
					adaptor.addChild(root_0, char_literal611_tree);
					}

					if ( state.backtracking==0 ) {s("[");}
					pushFollow(FOLLOW_expression_in_selector6196);
					expression612=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression612.getTree());

					char_literal613=(Token)match(input,56,FOLLOW_56_in_selector6198); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal613_tree = (Object)adaptor.create(char_literal613);
					adaptor.addChild(root_0, char_literal613_tree);
					}

					if ( state.backtracking==0 ) {s("]");}
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 133, selector_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "selector"


	public static class superSuffix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "superSuffix"
	// /media/tony/disk2/_git/cs543/JavaJava.g:826:1: superSuffix : ( arguments | '.' Identifier ( arguments )? );
	public final JavaJavaParser.superSuffix_return superSuffix() throws RecognitionException {
		JavaJavaParser.superSuffix_return retval = new JavaJavaParser.superSuffix_return();
		retval.start = input.LT(1);
		int superSuffix_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal615=null;
		Token Identifier616=null;
		ParserRuleReturnScope arguments614 =null;
		ParserRuleReturnScope arguments617 =null;

		Object char_literal615_tree=null;
		Object Identifier616_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:827:5: ( arguments | '.' Identifier ( arguments )? )
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==32) ) {
				alt176=1;
			}
			else if ( (LA176_0==43) ) {
				alt176=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 176, 0, input);
				throw nvae;
			}

			switch (alt176) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:827:9: arguments
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arguments_in_superSuffix6223);
					arguments614=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments614.getTree());

					}
					break;
				case 2 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:828:9: '.' Identifier ( arguments )?
					{
					root_0 = (Object)adaptor.nil();


					char_literal615=(Token)match(input,43,FOLLOW_43_in_superSuffix6233); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal615_tree = (Object)adaptor.create(char_literal615);
					adaptor.addChild(root_0, char_literal615_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					Identifier616=(Token)match(input,Identifier,FOLLOW_Identifier_in_superSuffix6237); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier616_tree = (Object)adaptor.create(Identifier616);
					adaptor.addChild(root_0, Identifier616_tree);
					}

					if ( state.backtracking==0 ) {if(primitive) id((Identifier616!=null?Identifier616.getText():null));}
					// /media/tony/disk2/_git/cs543/JavaJava.g:828:72: ( arguments )?
					int alt175=2;
					int LA175_0 = input.LA(1);
					if ( (LA175_0==32) ) {
						alt175=1;
					}
					switch (alt175) {
						case 1 :
							// /media/tony/disk2/_git/cs543/JavaJava.g:828:72: arguments
							{
							pushFollow(FOLLOW_arguments_in_superSuffix6241);
							arguments617=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments617.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 134, superSuffix_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "superSuffix"


	public static class arguments_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arguments"
	// /media/tony/disk2/_git/cs543/JavaJava.g:831:1: arguments : '(' ( expressionList )? ')' ;
	public final JavaJavaParser.arguments_return arguments() throws RecognitionException {
		JavaJavaParser.arguments_return retval = new JavaJavaParser.arguments_return();
		retval.start = input.LT(1);
		int arguments_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal618=null;
		Token char_literal620=null;
		ParserRuleReturnScope expressionList619 =null;

		Object char_literal618_tree=null;
		Object char_literal620_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }

			// /media/tony/disk2/_git/cs543/JavaJava.g:832:5: ( '(' ( expressionList )? ')' )
			// /media/tony/disk2/_git/cs543/JavaJava.g:832:9: '(' ( expressionList )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal618=(Token)match(input,32,FOLLOW_32_in_arguments6261); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal618_tree = (Object)adaptor.create(char_literal618);
			adaptor.addChild(root_0, char_literal618_tree);
			}

			if ( state.backtracking==0 ) {s("(");}
			// /media/tony/disk2/_git/cs543/JavaJava.g:832:22: ( expressionList )?
			int alt177=2;
			int LA177_0 = input.LA(1);
			if ( ((LA177_0 >= CharacterLiteral && LA177_0 <= DecimalLiteral)||LA177_0==FloatingPointLiteral||(LA177_0 >= HexLiteral && LA177_0 <= Identifier)||(LA177_0 >= OctalLiteral && LA177_0 <= StringLiteral)||LA177_0==25||LA177_0==32||(LA177_0 >= 36 && LA177_0 <= 37)||(LA177_0 >= 40 && LA177_0 <= 41)||LA177_0==60||LA177_0==62||LA177_0==65||LA177_0==70||LA177_0==73||LA177_0==76||LA177_0==82||LA177_0==84||(LA177_0 >= 86 && LA177_0 <= 87)||LA177_0==93||LA177_0==96||LA177_0==99||LA177_0==103||LA177_0==105||LA177_0==113) ) {
				alt177=1;
			}
			switch (alt177) {
				case 1 :
					// /media/tony/disk2/_git/cs543/JavaJava.g:832:22: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_arguments6264);
					expressionList619=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList619.getTree());

					}
					break;

			}

			char_literal620=(Token)match(input,33,FOLLOW_33_in_arguments6267); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal620_tree = (Object)adaptor.create(char_literal620);
			adaptor.addChild(root_0, char_literal620_tree);
			}

			if ( state.backtracking==0 ) {s(")");}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 135, arguments_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arguments"

	// $ANTLR start synpred5_JavaJava
	public final void synpred5_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:84:9: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) )
		// /media/tony/disk2/_git/cs543/JavaJava.g:84:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
		{
		pushFollow(FOLLOW_annotations_in_synpred5_JavaJava73);
		annotations();
		state._fsp--;
		if (state.failed) return;

		// /media/tony/disk2/_git/cs543/JavaJava.g:85:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
		int alt183=2;
		int LA183_0 = input.LA(1);
		if ( (LA183_0==88) ) {
			alt183=1;
		}
		else if ( (LA183_0==ENUM||LA183_0==54||LA183_0==59||LA183_0==66||LA183_0==74||LA183_0==83||(LA183_0 >= 89 && LA183_0 <= 91)||(LA183_0 >= 94 && LA183_0 <= 95)) ) {
			alt183=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 183, 0, input);
			throw nvae;
		}

		switch (alt183) {
			case 1 :
				// /media/tony/disk2/_git/cs543/JavaJava.g:85:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
				{
				pushFollow(FOLLOW_packageDeclaration_in_synpred5_JavaJava87);
				packageDeclaration();
				state._fsp--;
				if (state.failed) return;

				// /media/tony/disk2/_git/cs543/JavaJava.g:85:32: ( importDeclaration )*
				loop180:
				while (true) {
					int alt180=2;
					int LA180_0 = input.LA(1);
					if ( (LA180_0==80) ) {
						alt180=1;
					}

					switch (alt180) {
					case 1 :
						// /media/tony/disk2/_git/cs543/JavaJava.g:85:32: importDeclaration
						{
						pushFollow(FOLLOW_importDeclaration_in_synpred5_JavaJava89);
						importDeclaration();
						state._fsp--;
						if (state.failed) return;

						}
						break;

					default :
						break loop180;
					}
				}

				// /media/tony/disk2/_git/cs543/JavaJava.g:85:51: ( typeDeclaration )*
				loop181:
				while (true) {
					int alt181=2;
					int LA181_0 = input.LA(1);
					if ( (LA181_0==ENUM||LA181_0==48||LA181_0==54||LA181_0==59||LA181_0==66||LA181_0==74||LA181_0==83||(LA181_0 >= 89 && LA181_0 <= 91)||(LA181_0 >= 94 && LA181_0 <= 95)) ) {
						alt181=1;
					}

					switch (alt181) {
					case 1 :
						// /media/tony/disk2/_git/cs543/JavaJava.g:85:51: typeDeclaration
						{
						pushFollow(FOLLOW_typeDeclaration_in_synpred5_JavaJava92);
						typeDeclaration();
						state._fsp--;
						if (state.failed) return;

						}
						break;

					default :
						break loop181;
					}
				}

				}
				break;
			case 2 :
				// /media/tony/disk2/_git/cs543/JavaJava.g:86:13: classOrInterfaceDeclaration ( typeDeclaration )*
				{
				pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred5_JavaJava107);
				classOrInterfaceDeclaration();
				state._fsp--;
				if (state.failed) return;

				// /media/tony/disk2/_git/cs543/JavaJava.g:86:41: ( typeDeclaration )*
				loop182:
				while (true) {
					int alt182=2;
					int LA182_0 = input.LA(1);
					if ( (LA182_0==ENUM||LA182_0==48||LA182_0==54||LA182_0==59||LA182_0==66||LA182_0==74||LA182_0==83||(LA182_0 >= 89 && LA182_0 <= 91)||(LA182_0 >= 94 && LA182_0 <= 95)) ) {
						alt182=1;
					}

					switch (alt182) {
					case 1 :
						// /media/tony/disk2/_git/cs543/JavaJava.g:86:41: typeDeclaration
						{
						pushFollow(FOLLOW_typeDeclaration_in_synpred5_JavaJava109);
						typeDeclaration();
						state._fsp--;
						if (state.failed) return;

						}
						break;

					default :
						break loop182;
					}
				}

				}
				break;

		}

		}

	}
	// $ANTLR end synpred5_JavaJava

	// $ANTLR start synpred112_JavaJava
	public final void synpred112_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:420:22: ( explicitConstructorInvocation )
		// /media/tony/disk2/_git/cs543/JavaJava.g:420:22: explicitConstructorInvocation
		{
		pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred112_JavaJava2722);
		explicitConstructorInvocation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred112_JavaJava

	// $ANTLR start synpred116_JavaJava
	public final void synpred116_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:424:9: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:424:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
		{
		// /media/tony/disk2/_git/cs543/JavaJava.g:424:9: ( nonWildcardTypeArguments )?
		int alt191=2;
		int LA191_0 = input.LA(1);
		if ( (LA191_0==49) ) {
			alt191=1;
		}
		switch (alt191) {
			case 1 :
				// /media/tony/disk2/_git/cs543/JavaJava.g:424:9: nonWildcardTypeArguments
				{
				pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred116_JavaJava2749);
				nonWildcardTypeArguments();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		if ( input.LA(1)==96||input.LA(1)==99 ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_arguments_in_synpred116_JavaJava2763);
		arguments();
		state._fsp--;
		if (state.failed) return;

		match(input,48,FOLLOW_48_in_synpred116_JavaJava2765); if (state.failed) return;

		}

	}
	// $ANTLR end synpred116_JavaJava

	// $ANTLR start synpred127_JavaJava
	public final void synpred127_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:456:9: ( annotation )
		// /media/tony/disk2/_git/cs543/JavaJava.g:456:9: annotation
		{
		pushFollow(FOLLOW_annotation_in_synpred127_JavaJava3011);
		annotation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred127_JavaJava

	// $ANTLR start synpred150_JavaJava
	public final void synpred150_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:529:10: ( localVariableDeclarationStatement )
		// /media/tony/disk2/_git/cs543/JavaJava.g:529:10: localVariableDeclarationStatement
		{
		pushFollow(FOLLOW_localVariableDeclarationStatement_in_synpred150_JavaJava3577);
		localVariableDeclarationStatement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred150_JavaJava

	// $ANTLR start synpred151_JavaJava
	public final void synpred151_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:530:9: ( classOrInterfaceDeclaration )
		// /media/tony/disk2/_git/cs543/JavaJava.g:530:9: classOrInterfaceDeclaration
		{
		pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred151_JavaJava3587);
		classOrInterfaceDeclaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred151_JavaJava

	// $ANTLR start synpred156_JavaJava
	public final void synpred156_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:549:115: ( 'else' statement )
		// /media/tony/disk2/_git/cs543/JavaJava.g:549:115: 'else' statement
		{
		match(input,71,FOLLOW_71_in_synpred156_JavaJava3738); if (state.failed) return;

		pushFollow(FOLLOW_statement_in_synpred156_JavaJava3742);
		statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred156_JavaJava

	// $ANTLR start synpred161_JavaJava
	public final void synpred161_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:554:11: ( catches 'finally' block )
		// /media/tony/disk2/_git/cs543/JavaJava.g:554:11: catches 'finally' block
		{
		pushFollow(FOLLOW_catches_in_synpred161_JavaJava3832);
		catches();
		state._fsp--;
		if (state.failed) return;

		match(input,75,FOLLOW_75_in_synpred161_JavaJava3834); if (state.failed) return;

		pushFollow(FOLLOW_block_in_synpred161_JavaJava3837);
		block();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred161_JavaJava

	// $ANTLR start synpred162_JavaJava
	public final void synpred162_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:555:11: ( catches )
		// /media/tony/disk2/_git/cs543/JavaJava.g:555:11: catches
		{
		pushFollow(FOLLOW_catches_in_synpred162_JavaJava3849);
		catches();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred162_JavaJava

	// $ANTLR start synpred177_JavaJava
	public final void synpred177_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:590:9: ( switchLabel )
		// /media/tony/disk2/_git/cs543/JavaJava.g:590:9: switchLabel
		{
		pushFollow(FOLLOW_switchLabel_in_synpred177_JavaJava4172);
		switchLabel();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred177_JavaJava

	// $ANTLR start synpred179_JavaJava
	public final void synpred179_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:594:9: ( 'case' constantExpression ':' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:594:9: 'case' constantExpression ':'
		{
		match(input,63,FOLLOW_63_in_synpred179_JavaJava4199); if (state.failed) return;

		pushFollow(FOLLOW_constantExpression_in_synpred179_JavaJava4202);
		constantExpression();
		state._fsp--;
		if (state.failed) return;

		match(input,47,FOLLOW_47_in_synpred179_JavaJava4204); if (state.failed) return;

		}

	}
	// $ANTLR end synpred179_JavaJava

	// $ANTLR start synpred180_JavaJava
	public final void synpred180_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:595:9: ( 'case' enumConstantName ':' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:595:9: 'case' enumConstantName ':'
		{
		match(input,63,FOLLOW_63_in_synpred180_JavaJava4214); if (state.failed) return;

		pushFollow(FOLLOW_enumConstantName_in_synpred180_JavaJava4218);
		enumConstantName();
		state._fsp--;
		if (state.failed) return;

		match(input,47,FOLLOW_47_in_synpred180_JavaJava4220); if (state.failed) return;

		}

	}
	// $ANTLR end synpred180_JavaJava

	// $ANTLR start synpred181_JavaJava
	public final void synpred181_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:601:9: ( enhancedForControl )
		// /media/tony/disk2/_git/cs543/JavaJava.g:601:9: enhancedForControl
		{
		pushFollow(FOLLOW_enhancedForControl_in_synpred181_JavaJava4265);
		enhancedForControl();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred181_JavaJava

	// $ANTLR start synpred185_JavaJava
	public final void synpred185_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:606:9: ( localVariableDeclaration )
		// /media/tony/disk2/_git/cs543/JavaJava.g:606:9: localVariableDeclaration
		{
		pushFollow(FOLLOW_localVariableDeclaration_in_synpred185_JavaJava4305);
		localVariableDeclaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred185_JavaJava

	// $ANTLR start synpred187_JavaJava
	public final void synpred187_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:637:32: ( assignmentOperator expression )
		// /media/tony/disk2/_git/cs543/JavaJava.g:637:32: assignmentOperator expression
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred187_JavaJava4496);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred187_JavaJava4498);
		expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred187_JavaJava

	// $ANTLR start synpred197_JavaJava
	public final void synpred197_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:650:9: ( '<' '<' '=' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:650:10: '<' '<' '='
		{
		match(input,49,FOLLOW_49_in_synpred197_JavaJava4616); if (state.failed) return;

		match(input,49,FOLLOW_49_in_synpred197_JavaJava4618); if (state.failed) return;

		match(input,50,FOLLOW_50_in_synpred197_JavaJava4620); if (state.failed) return;

		}

	}
	// $ANTLR end synpred197_JavaJava

	// $ANTLR start synpred198_JavaJava
	public final void synpred198_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:655:9: ( '>' '>' '>' '=' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:655:10: '>' '>' '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred198_JavaJava4656); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred198_JavaJava4658); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred198_JavaJava4660); if (state.failed) return;

		match(input,50,FOLLOW_50_in_synpred198_JavaJava4662); if (state.failed) return;

		}

	}
	// $ANTLR end synpred198_JavaJava

	// $ANTLR start synpred199_JavaJava
	public final void synpred199_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:662:9: ( '>' '>' '=' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:662:10: '>' '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred199_JavaJava4701); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred199_JavaJava4703); if (state.failed) return;

		match(input,50,FOLLOW_50_in_synpred199_JavaJava4705); if (state.failed) return;

		}

	}
	// $ANTLR end synpred199_JavaJava

	// $ANTLR start synpred210_JavaJava
	public final void synpred210_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:706:9: ( '<' '=' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:706:10: '<' '='
		{
		match(input,49,FOLLOW_49_in_synpred210_JavaJava5025); if (state.failed) return;

		match(input,50,FOLLOW_50_in_synpred210_JavaJava5027); if (state.failed) return;

		}

	}
	// $ANTLR end synpred210_JavaJava

	// $ANTLR start synpred211_JavaJava
	public final void synpred211_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:709:9: ( '>' '=' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:709:10: '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred211_JavaJava5059); if (state.failed) return;

		match(input,50,FOLLOW_50_in_synpred211_JavaJava5061); if (state.failed) return;

		}

	}
	// $ANTLR end synpred211_JavaJava

	// $ANTLR start synpred214_JavaJava
	public final void synpred214_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:721:9: ( '<' '<' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:721:10: '<' '<'
		{
		match(input,49,FOLLOW_49_in_synpred214_JavaJava5154); if (state.failed) return;

		match(input,49,FOLLOW_49_in_synpred214_JavaJava5156); if (state.failed) return;

		}

	}
	// $ANTLR end synpred214_JavaJava

	// $ANTLR start synpred215_JavaJava
	public final void synpred215_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:724:9: ( '>' '>' '>' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:724:10: '>' '>' '>'
		{
		match(input,52,FOLLOW_52_in_synpred215_JavaJava5188); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred215_JavaJava5190); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred215_JavaJava5192); if (state.failed) return;

		}

	}
	// $ANTLR end synpred215_JavaJava

	// $ANTLR start synpred216_JavaJava
	public final void synpred216_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:729:9: ( '>' '>' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:729:10: '>' '>'
		{
		match(input,52,FOLLOW_52_in_synpred216_JavaJava5228); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred216_JavaJava5230); if (state.failed) return;

		}

	}
	// $ANTLR end synpred216_JavaJava

	// $ANTLR start synpred228_JavaJava
	public final void synpred228_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:754:9: ( castExpression )
		// /media/tony/disk2/_git/cs543/JavaJava.g:754:9: castExpression
		{
		pushFollow(FOLLOW_castExpression_in_synpred228_JavaJava5447);
		castExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred228_JavaJava

	// $ANTLR start synpred232_JavaJava
	public final void synpred232_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:759:8: ( '(' primitiveType ')' unaryExpression )
		// /media/tony/disk2/_git/cs543/JavaJava.g:759:8: '(' primitiveType ')' unaryExpression
		{
		match(input,32,FOLLOW_32_in_synpred232_JavaJava5489); if (state.failed) return;

		pushFollow(FOLLOW_primitiveType_in_synpred232_JavaJava5492);
		primitiveType();
		state._fsp--;
		if (state.failed) return;

		match(input,33,FOLLOW_33_in_synpred232_JavaJava5494); if (state.failed) return;

		pushFollow(FOLLOW_unaryExpression_in_synpred232_JavaJava5496);
		unaryExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred232_JavaJava

	// $ANTLR start synpred233_JavaJava
	public final void synpred233_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:760:22: ( type )
		// /media/tony/disk2/_git/cs543/JavaJava.g:760:22: type
		{
		pushFollow(FOLLOW_type_in_synpred233_JavaJava5509);
		type();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred233_JavaJava

	// $ANTLR start synpred235_JavaJava
	public final void synpred235_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:765:73: ( '.' Identifier )
		// /media/tony/disk2/_git/cs543/JavaJava.g:765:73: '.' Identifier
		{
		match(input,43,FOLLOW_43_in_synpred235_JavaJava5551); if (state.failed) return;

		match(input,Identifier,FOLLOW_Identifier_in_synpred235_JavaJava5555); if (state.failed) return;

		}

	}
	// $ANTLR end synpred235_JavaJava

	// $ANTLR start synpred236_JavaJava
	public final void synpred236_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:765:100: ( identifierSuffix )
		// /media/tony/disk2/_git/cs543/JavaJava.g:765:100: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred236_JavaJava5559);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred236_JavaJava

	// $ANTLR start synpred241_JavaJava
	public final void synpred241_JavaJava_fragment() throws RecognitionException {
		Token I4=null;


		// /media/tony/disk2/_git/cs543/JavaJava.g:769:42: ( '.' I4= Identifier )
		// /media/tony/disk2/_git/cs543/JavaJava.g:769:42: '.' I4= Identifier
		{
		match(input,43,FOLLOW_43_in_synpred241_JavaJava5614); if (state.failed) return;

		I4=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred241_JavaJava5620); if (state.failed) return;

		}

	}
	// $ANTLR end synpred241_JavaJava

	// $ANTLR start synpred242_JavaJava
	public final void synpred242_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:769:73: ( identifierSuffix )
		// /media/tony/disk2/_git/cs543/JavaJava.g:769:73: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred242_JavaJava5625);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred242_JavaJava

	// $ANTLR start synpred248_JavaJava
	public final void synpred248_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:776:10: ( '[' expression ']' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:776:10: '[' expression ']'
		{
		match(input,55,FOLLOW_55_in_synpred248_JavaJava5716); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred248_JavaJava5720);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input,56,FOLLOW_56_in_synpred248_JavaJava5722); if (state.failed) return;

		}

	}
	// $ANTLR end synpred248_JavaJava

	// $ANTLR start synpred261_JavaJava
	public final void synpred261_JavaJava_fragment() throws RecognitionException {
		// /media/tony/disk2/_git/cs543/JavaJava.g:802:39: ( '[' expression ']' )
		// /media/tony/disk2/_git/cs543/JavaJava.g:802:39: '[' expression ']'
		{
		match(input,55,FOLLOW_55_in_synpred261_JavaJava5986); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred261_JavaJava5989);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input,56,FOLLOW_56_in_synpred261_JavaJava5991); if (state.failed) return;

		}

	}
	// $ANTLR end synpred261_JavaJava

	// Delegated rules

	public final boolean synpred198_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred198_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred232_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred232_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred261_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred261_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred241_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred241_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred235_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred235_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred180_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred180_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred187_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred187_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred233_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred233_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred215_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred215_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred150_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred150_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred199_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred199_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred216_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred216_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred248_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred248_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred242_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred242_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred112_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred112_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred127_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred127_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred179_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred179_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred185_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred185_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred210_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred210_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred236_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred236_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred162_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred162_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred156_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred156_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred161_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred161_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred197_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred197_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred177_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred177_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred116_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred116_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred214_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred214_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred181_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred181_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred151_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred151_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred228_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred228_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred211_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred211_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA127 dfa127 = new DFA127(this);
	protected DFA153 dfa153 = new DFA153(this);
	static final String DFA127_eotS =
		"\u00f1\uffff";
	static final String DFA127_eofS =
		"\u00f1\uffff";
	static final String DFA127_minS =
		"\1\6\13\17\25\uffff\14\17\1\6\1\17\1\6\1\57\35\uffff\1\70\1\57\1\uffff"+
		"\1\70\1\57\1\uffff\1\70\1\57\1\uffff\1\70\1\57\1\uffff\1\70\1\57\1\uffff"+
		"\1\70\1\57\1\uffff\1\70\1\57\1\uffff\1\70\1\57\1\uffff\55\0\2\uffff\12"+
		"\0\24\uffff\1\0\5\uffff\1\0\37\uffff\1\0\2\uffff\1\0\2\uffff\1\0\2\uffff"+
		"\1\0\2\uffff\1\0\2\uffff\1\0\2\uffff\1\0\2\uffff\1\0\2\uffff";
	static final String DFA127_maxS =
		"\1\161\1\135\1\17\1\157\10\67\25\uffff\11\67\1\135\1\17\1\135\1\161\1"+
		"\143\1\161\1\67\35\uffff\1\70\1\67\1\uffff\1\70\1\67\1\uffff\1\70\1\67"+
		"\1\uffff\1\70\1\67\1\uffff\1\70\1\67\1\uffff\1\70\1\67\1\uffff\1\70\1"+
		"\67\1\uffff\1\70\1\67\1\uffff\55\0\2\uffff\12\0\24\uffff\1\0\5\uffff\1"+
		"\0\37\uffff\1\0\2\uffff\1\0\2\uffff\1\0\2\uffff\1\0\2\uffff\1\0\2\uffff"+
		"\1\0\2\uffff\1\0\2\uffff\1\0\2\uffff";
	static final String DFA127_acceptS =
		"\14\uffff\1\2\u00ca\uffff\1\1\31\uffff";
	static final String DFA127_specialS =
		"\146\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
		"\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1"+
		"\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1"+
		"\51\1\52\1\53\1\54\2\uffff\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65"+
		"\1\66\24\uffff\1\67\5\uffff\1\70\37\uffff\1\71\2\uffff\1\72\2\uffff\1"+
		"\73\2\uffff\1\74\2\uffff\1\75\2\uffff\1\76\2\uffff\1\77\2\uffff\1\100"+
		"\2\uffff}>";
	static final String[] DFA127_transitionS = {
			"\2\14\4\uffff\1\14\1\uffff\1\14\1\3\5\uffff\2\14\2\uffff\1\14\6\uffff"+
			"\1\14\3\uffff\2\14\2\uffff\2\14\6\uffff\1\14\5\uffff\1\2\5\uffff\1\4"+
			"\1\uffff\1\6\2\uffff\1\5\4\uffff\1\13\2\uffff\1\14\1\1\1\uffff\1\12\5"+
			"\uffff\1\10\1\uffff\1\11\1\uffff\2\14\5\uffff\1\7\2\uffff\1\14\2\uffff"+
			"\1\14\3\uffff\1\14\1\uffff\1\14\7\uffff\1\14",
			"\1\41\46\uffff\1\53\5\uffff\1\42\1\uffff\1\44\2\uffff\1\43\4\uffff\1"+
			"\51\3\uffff\1\52\1\uffff\1\50\5\uffff\1\46\1\uffff\1\47\10\uffff\1\45",
			"\1\54",
			"\1\60\12\uffff\7\14\1\uffff\11\14\1\56\1\uffff\2\14\1\uffff\1\14\1\55"+
			"\4\14\1\uffff\1\57\1\uffff\2\14\26\uffff\1\14\33\uffff\3\14",
			"\1\117\33\uffff\1\14\13\uffff\1\116",
			"\1\122\33\uffff\1\14\13\uffff\1\121",
			"\1\125\33\uffff\1\14\13\uffff\1\124",
			"\1\130\33\uffff\1\14\13\uffff\1\127",
			"\1\133\33\uffff\1\14\13\uffff\1\132",
			"\1\136\33\uffff\1\14\13\uffff\1\135",
			"\1\141\33\uffff\1\14\13\uffff\1\140",
			"\1\144\33\uffff\1\14\13\uffff\1\143",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\151\33\uffff\1\147\5\uffff\1\146\5\uffff\1\150",
			"\1\153\47\uffff\1\152",
			"\1\155\47\uffff\1\154",
			"\1\157\47\uffff\1\156",
			"\1\161\47\uffff\1\160",
			"\1\163\47\uffff\1\162",
			"\1\165\47\uffff\1\164",
			"\1\167\47\uffff\1\166",
			"\1\171\47\uffff\1\170",
			"\1\172\46\uffff\1\u0084\5\uffff\1\173\1\uffff\1\175\2\uffff\1\174\4"+
			"\uffff\1\u0082\3\uffff\1\u0083\1\uffff\1\u0081\5\uffff\1\177\1\uffff"+
			"\1\u0080\10\uffff\1\176",
			"\1\u0085",
			"\1\u0088\20\uffff\1\u0087\12\uffff\1\u0086\12\uffff\1\u0092\5\uffff"+
			"\1\u0089\1\uffff\1\u008b\2\uffff\1\u008a\4\uffff\1\u0090\3\uffff\1\u0091"+
			"\1\uffff\1\u008f\5\uffff\1\u008d\1\uffff\1\u008e\10\uffff\1\u008c",
			"\2\14\4\uffff\1\14\1\uffff\1\14\1\u0095\5\uffff\2\14\2\uffff\1\14\6"+
			"\uffff\1\14\3\uffff\2\14\2\uffff\2\14\7\uffff\2\14\2\uffff\1\u009e\6"+
			"\uffff\1\u0096\1\uffff\1\u0098\2\uffff\1\u0097\4\uffff\1\u009d\2\uffff"+
			"\1\14\2\uffff\1\u009c\5\uffff\1\u009a\1\uffff\1\u009b\1\uffff\2\14\5"+
			"\uffff\1\u0099\2\uffff\1\14\2\uffff\1\14\3\uffff\1\14\1\uffff\1\14\7"+
			"\uffff\1\14",
			"\1\u00b3\41\uffff\1\14\20\uffff\1\14\23\uffff\1\14\11\uffff\1\14\2\uffff"+
			"\1\14",
			"\2\14\4\uffff\1\14\1\uffff\2\14\5\uffff\2\14\2\uffff\1\14\6\uffff\1"+
			"\14\3\uffff\2\14\2\uffff\2\14\16\uffff\1\u00b9\3\uffff\1\14\1\uffff\1"+
			"\14\2\uffff\1\14\4\uffff\1\14\2\uffff\1\14\2\uffff\1\14\5\uffff\1\14"+
			"\1\uffff\1\14\1\uffff\2\14\5\uffff\1\14\2\uffff\1\14\2\uffff\1\14\3\uffff"+
			"\1\14\1\uffff\1\14\7\uffff\1\14",
			"\1\u00d7\7\uffff\1\14",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d9",
			"\1\u00d7\7\uffff\1\14",
			"",
			"\1\u00dc",
			"\1\u00d7\7\uffff\1\14",
			"",
			"\1\u00df",
			"\1\u00d7\7\uffff\1\14",
			"",
			"\1\u00e2",
			"\1\u00d7\7\uffff\1\14",
			"",
			"\1\u00e5",
			"\1\u00d7\7\uffff\1\14",
			"",
			"\1\u00e8",
			"\1\u00d7\7\uffff\1\14",
			"",
			"\1\u00eb",
			"\1\u00d7\7\uffff\1\14",
			"",
			"\1\u00ee",
			"\1\u00d7\7\uffff\1\14",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			""
	};

	static final short[] DFA127_eot = DFA.unpackEncodedString(DFA127_eotS);
	static final short[] DFA127_eof = DFA.unpackEncodedString(DFA127_eofS);
	static final char[] DFA127_min = DFA.unpackEncodedStringToUnsignedChars(DFA127_minS);
	static final char[] DFA127_max = DFA.unpackEncodedStringToUnsignedChars(DFA127_maxS);
	static final short[] DFA127_accept = DFA.unpackEncodedString(DFA127_acceptS);
	static final short[] DFA127_special = DFA.unpackEncodedString(DFA127_specialS);
	static final short[][] DFA127_transition;

	static {
		int numStates = DFA127_transitionS.length;
		DFA127_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA127_transition[i] = DFA.unpackEncodedString(DFA127_transitionS[i]);
		}
	}

	protected class DFA127 extends DFA {

		public DFA127(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 127;
			this.eot = DFA127_eot;
			this.eof = DFA127_eof;
			this.min = DFA127_min;
			this.max = DFA127_max;
			this.accept = DFA127_accept;
			this.special = DFA127_special;
			this.transition = DFA127_transition;
		}
		@Override
		public String getDescription() {
			return "599:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA127_102 = input.LA(1);
						 
						int index127_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_102);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA127_103 = input.LA(1);
						 
						int index127_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_103);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA127_104 = input.LA(1);
						 
						int index127_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_104);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA127_105 = input.LA(1);
						 
						int index127_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_105);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA127_106 = input.LA(1);
						 
						int index127_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_106);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA127_107 = input.LA(1);
						 
						int index127_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_107);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA127_108 = input.LA(1);
						 
						int index127_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_108);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA127_109 = input.LA(1);
						 
						int index127_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_109);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA127_110 = input.LA(1);
						 
						int index127_110 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_110);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA127_111 = input.LA(1);
						 
						int index127_111 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_111);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA127_112 = input.LA(1);
						 
						int index127_112 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_112);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA127_113 = input.LA(1);
						 
						int index127_113 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_113);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA127_114 = input.LA(1);
						 
						int index127_114 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_114);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA127_115 = input.LA(1);
						 
						int index127_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_115);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA127_116 = input.LA(1);
						 
						int index127_116 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_116);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA127_117 = input.LA(1);
						 
						int index127_117 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_117);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA127_118 = input.LA(1);
						 
						int index127_118 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_118);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA127_119 = input.LA(1);
						 
						int index127_119 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_119);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA127_120 = input.LA(1);
						 
						int index127_120 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_120);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA127_121 = input.LA(1);
						 
						int index127_121 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_121);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA127_122 = input.LA(1);
						 
						int index127_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_122);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA127_123 = input.LA(1);
						 
						int index127_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_123);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA127_124 = input.LA(1);
						 
						int index127_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_124);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA127_125 = input.LA(1);
						 
						int index127_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_125);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA127_126 = input.LA(1);
						 
						int index127_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_126);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA127_127 = input.LA(1);
						 
						int index127_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_127);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA127_128 = input.LA(1);
						 
						int index127_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_128);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA127_129 = input.LA(1);
						 
						int index127_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_129);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA127_130 = input.LA(1);
						 
						int index127_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_130);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA127_131 = input.LA(1);
						 
						int index127_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_131);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA127_132 = input.LA(1);
						 
						int index127_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_132);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA127_133 = input.LA(1);
						 
						int index127_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_133);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA127_134 = input.LA(1);
						 
						int index127_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_134);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA127_135 = input.LA(1);
						 
						int index127_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_135);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA127_136 = input.LA(1);
						 
						int index127_136 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_136);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA127_137 = input.LA(1);
						 
						int index127_137 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_137);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA127_138 = input.LA(1);
						 
						int index127_138 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_138);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA127_139 = input.LA(1);
						 
						int index127_139 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_139);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA127_140 = input.LA(1);
						 
						int index127_140 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_140);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA127_141 = input.LA(1);
						 
						int index127_141 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_141);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA127_142 = input.LA(1);
						 
						int index127_142 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_142);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA127_143 = input.LA(1);
						 
						int index127_143 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_143);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA127_144 = input.LA(1);
						 
						int index127_144 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_144);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA127_145 = input.LA(1);
						 
						int index127_145 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_145);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA127_146 = input.LA(1);
						 
						int index127_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_146);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA127_149 = input.LA(1);
						 
						int index127_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_149);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA127_150 = input.LA(1);
						 
						int index127_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_150);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA127_151 = input.LA(1);
						 
						int index127_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_151);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA127_152 = input.LA(1);
						 
						int index127_152 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_152);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA127_153 = input.LA(1);
						 
						int index127_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_153);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA127_154 = input.LA(1);
						 
						int index127_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_154);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA127_155 = input.LA(1);
						 
						int index127_155 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_155);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA127_156 = input.LA(1);
						 
						int index127_156 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_156);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA127_157 = input.LA(1);
						 
						int index127_157 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_157);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA127_158 = input.LA(1);
						 
						int index127_158 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_158);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA127_179 = input.LA(1);
						 
						int index127_179 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_179);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA127_185 = input.LA(1);
						 
						int index127_185 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_185);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA127_217 = input.LA(1);
						 
						int index127_217 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_217);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA127_220 = input.LA(1);
						 
						int index127_220 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_220);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA127_223 = input.LA(1);
						 
						int index127_223 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_223);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA127_226 = input.LA(1);
						 
						int index127_226 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_226);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA127_229 = input.LA(1);
						 
						int index127_229 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_229);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA127_232 = input.LA(1);
						 
						int index127_232 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_232);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA127_235 = input.LA(1);
						 
						int index127_235 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_235);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA127_238 = input.LA(1);
						 
						int index127_238 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred181_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index127_238);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 127, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA153_eotS =
		"\16\uffff";
	static final String DFA153_eofS =
		"\16\uffff";
	static final String DFA153_minS =
		"\1\6\1\0\10\41\2\uffff\1\70\1\41";
	static final String DFA153_maxS =
		"\1\161\1\0\10\67\2\uffff\1\70\1\67";
	static final String DFA153_acceptS =
		"\12\uffff\1\2\1\1\2\uffff";
	static final String DFA153_specialS =
		"\1\uffff\1\0\14\uffff}>";
	static final String[] DFA153_transitionS = {
			"\2\12\4\uffff\1\12\1\uffff\1\12\1\1\5\uffff\2\12\2\uffff\1\12\6\uffff"+
			"\1\12\3\uffff\2\12\2\uffff\2\12\22\uffff\1\2\1\uffff\1\4\2\uffff\1\3"+
			"\4\uffff\1\11\2\uffff\1\12\2\uffff\1\10\5\uffff\1\6\1\uffff\1\7\1\uffff"+
			"\2\12\5\uffff\1\5\2\uffff\1\12\2\uffff\1\12\3\uffff\1\12\1\uffff\1\12"+
			"\7\uffff\1\12",
			"\1\uffff",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"",
			"",
			"\1\15",
			"\1\13\11\uffff\1\12\13\uffff\1\14"
	};

	static final short[] DFA153_eot = DFA.unpackEncodedString(DFA153_eotS);
	static final short[] DFA153_eof = DFA.unpackEncodedString(DFA153_eofS);
	static final char[] DFA153_min = DFA.unpackEncodedStringToUnsignedChars(DFA153_minS);
	static final char[] DFA153_max = DFA.unpackEncodedStringToUnsignedChars(DFA153_maxS);
	static final short[] DFA153_accept = DFA.unpackEncodedString(DFA153_acceptS);
	static final short[] DFA153_special = DFA.unpackEncodedString(DFA153_specialS);
	static final short[][] DFA153_transition;

	static {
		int numStates = DFA153_transitionS.length;
		DFA153_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA153_transition[i] = DFA.unpackEncodedString(DFA153_transitionS[i]);
		}
	}

	protected class DFA153 extends DFA {

		public DFA153(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 153;
			this.eot = DFA153_eot;
			this.eof = DFA153_eof;
			this.min = DFA153_min;
			this.max = DFA153_max;
			this.accept = DFA153_accept;
			this.special = DFA153_special;
			this.transition = DFA153_transition;
		}
		@Override
		public String getDescription() {
			return "760:21: ( type | expression )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA153_1 = input.LA(1);
						 
						int index153_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred233_JavaJava()) ) {s = 11;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index153_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 153, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_annotations_in_compilationUnit73 = new BitSet(new long[]{0x0840000000000100L,0x00000000CF080404L});
	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit87 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit89 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit92 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_compilationUnit107 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit109 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit130 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit133 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit136 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_88_in_packageDeclaration156 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedName_in_packageDeclaration159 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_packageDeclaration161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_importDeclaration186 = new BitSet(new long[]{0x0000000000008000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_importDeclaration190 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedName_in_importDeclaration193 = new BitSet(new long[]{0x0001080000000000L});
	public static final BitSet FOLLOW_43_in_importDeclaration198 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_importDeclaration202 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_importDeclaration208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_typeDeclaration243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration267 = new BitSet(new long[]{0x0040000000000100L,0x0000000000080004L});
	public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers298 = new BitSet(new long[]{0x0840000000000002L,0x00000000CE000400L});
	public static final BitSet FOLLOW_annotation_in_classOrInterfaceModifier318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_classOrInterfaceModifier331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_classOrInterfaceModifier347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_classOrInterfaceModifier360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_classOrInterfaceModifier375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_classOrInterfaceModifier389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_classOrInterfaceModifier405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_classOrInterfaceModifier422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifiers445 = new BitSet(new long[]{0x0840000000000002L,0x00000444CE200400L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_classDeclaration465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_classDeclaration475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_normalClassDeclaration498 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_normalClassDeclaration500 = new BitSet(new long[]{0x0002000000000000L,0x0000100000008100L});
	public static final BitSet FOLLOW_typeParameters_in_normalClassDeclaration505 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008100L});
	public static final BitSet FOLLOW_72_in_normalClassDeclaration517 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_normalClassDeclaration520 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008000L});
	public static final BitSet FOLLOW_79_in_normalClassDeclaration534 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_normalClassDeclaration538 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_classBody_in_normalClassDeclaration551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_typeParameters574 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_typeParameter_in_typeParameters577 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_39_in_typeParameters580 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_typeParameter_in_typeParameters583 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_52_in_typeParameters587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_typeParameter612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_typeParameter614 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeBound_in_typeParameter617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeBound646 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_typeBound649 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_typeBound651 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ENUM_in_enumDeclaration672 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_enumDeclaration674 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008000L});
	public static final BitSet FOLLOW_79_in_enumDeclaration677 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_enumDeclaration681 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_enumBody_in_enumDeclaration685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_enumBody704 = new BitSet(new long[]{0x0041008000008000L,0x0001000000000000L});
	public static final BitSet FOLLOW_enumConstants_in_enumBody708 = new BitSet(new long[]{0x0001008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_enumBody711 = new BitSet(new long[]{0x0001000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_enumBodyDeclarations_in_enumBody714 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_enumBody717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants738 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_enumConstants741 = new BitSet(new long[]{0x0040000000008000L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants745 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_annotations_in_enumConstant770 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_enumConstant773 = new BitSet(new long[]{0x0000000100000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_arguments_in_enumConstant775 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_classBody_in_enumConstant778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_enumBodyDeclarations802 = new BitSet(new long[]{0x5843000000008102L,0x00001644EE3C1446L});
	public static final BitSet FOLLOW_classBodyDeclaration_in_enumBodyDeclarations805 = new BitSet(new long[]{0x5843000000008102L,0x00001644EE3C1446L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_normalInterfaceDeclaration863 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_normalInterfaceDeclaration867 = new BitSet(new long[]{0x0002000000000000L,0x0000100000000100L});
	public static final BitSet FOLLOW_typeParameters_in_normalInterfaceDeclaration871 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000100L});
	public static final BitSet FOLLOW_72_in_normalInterfaceDeclaration875 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_normalInterfaceDeclaration878 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_normalInterfaceDeclaration882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeList905 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_typeList908 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_typeList912 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_108_in_classBody937 = new BitSet(new long[]{0x5843000000008100L,0x00011644EE3C1446L});
	public static final BitSet FOLLOW_classBodyDeclaration_in_classBody941 = new BitSet(new long[]{0x5843000000008100L,0x00011644EE3C1446L});
	public static final BitSet FOLLOW_112_in_classBody944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_interfaceBody968 = new BitSet(new long[]{0x5843000000008100L,0x00010644EE3C1446L});
	public static final BitSet FOLLOW_interfaceBodyDeclaration_in_interfaceBody971 = new BitSet(new long[]{0x5843000000008100L,0x00010644EE3C1446L});
	public static final BitSet FOLLOW_112_in_interfaceBody974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_classBodyDeclaration994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_classBodyDeclaration1006 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_classBodyDeclaration1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_classBodyDeclaration1023 = new BitSet(new long[]{0x5042000000008100L,0x00000200201C1046L});
	public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericMethodOrConstructorDecl_in_memberDecl1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberDeclaration_in_memberDecl1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_memberDecl1072 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_memberDecl1075 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDecl1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_memberDecl1092 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_constructorDeclaratorRest_in_memberDecl1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_memberDecl1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_memberDecl1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_memberDeclaration1140 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_methodDeclaration_in_memberDeclaration1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1173 = new BitSet(new long[]{0x5000000000008000L,0x0000020020141042L});
	public static final BitSet FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_genericMethodOrConstructorRest1199 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_105_in_genericMethodOrConstructorRest1203 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1206 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1220 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_methodDeclaration1243 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_methodDeclaratorRest_in_methodDeclaration1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarators_in_fieldDeclaration1265 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_fieldDeclaration1267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_interfaceBodyDeclaration1295 = new BitSet(new long[]{0x5042000000008100L,0x00000200201C1046L});
	public static final BitSet FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_interfaceBodyDeclaration1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_interfaceMemberDecl1346 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMemberDecl1349 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_interfaceMemberDecl1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_interfaceMemberDecl1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_interfaceMethodOrFieldDecl1396 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMethodOrFieldDecl1398 = new BitSet(new long[]{0x0084000100000000L});
	public static final BitSet FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest1426 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_interfaceMethodOrFieldRest1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest1440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaratorRest1463 = new BitSet(new long[]{0x0081000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_55_in_methodDeclaratorRest1466 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_methodDeclaratorRest1470 = new BitSet(new long[]{0x0081000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_methodDeclaratorRest1484 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaratorRest1488 = new BitSet(new long[]{0x0001000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_methodBody_in_methodDeclaratorRest1504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_methodDeclaratorRest1518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest1551 = new BitSet(new long[]{0x0001000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_voidMethodDeclaratorRest1554 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1557 = new BitSet(new long[]{0x0001000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest1573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_voidMethodDeclaratorRest1587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest1621 = new BitSet(new long[]{0x0081000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_55_in_interfaceMethodDeclaratorRest1624 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_interfaceMethodDeclaratorRest1628 = new BitSet(new long[]{0x0081000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_interfaceMethodDeclaratorRest1635 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest1638 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_interfaceMethodDeclaratorRest1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameters_in_interfaceGenericMethodDecl1667 = new BitSet(new long[]{0x5000000000008000L,0x0000020020141042L});
	public static final BitSet FOLLOW_type_in_interfaceGenericMethodDecl1670 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_105_in_interfaceGenericMethodDecl1674 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceGenericMethodDecl1679 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl1691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest1713 = new BitSet(new long[]{0x0001000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_voidInterfaceMethodDeclaratorRest1716 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest1719 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_voidInterfaceMethodDeclaratorRest1723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_constructorDeclaratorRest1748 = new BitSet(new long[]{0x0000000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_constructorDeclaratorRest1751 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1755 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_constructorBody_in_constructorDeclaratorRest1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantDeclarator1778 = new BitSet(new long[]{0x0084000000000000L});
	public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclarator1782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1805 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_variableDeclarators1808 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1812 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator1835 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_50_in_variableDeclarator1838 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1865 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_constantDeclaratorsRest1868 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_constantDeclarator_in_constantDeclaratorsRest1872 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_55_in_constantDeclaratorRest1894 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_constantDeclaratorRest1898 = new BitSet(new long[]{0x0084000000000000L});
	public static final BitSet FOLLOW_50_in_constantDeclaratorRest1905 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_constantDeclaratorRest1907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableDeclaratorId1929 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_variableDeclaratorId1935 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_variableDeclaratorId1938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableInitializer1970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_arrayInitializer1997 = new BitSet(new long[]{0x500003310260D0C0L,0x0003128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer2001 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_arrayInitializer2004 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer2008 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_arrayInitializer2013 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_arrayInitializer2020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_modifier2040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_modifier2050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_modifier2063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_modifier2075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_modifier2087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_modifier2100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_modifier2112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_modifier2125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_modifier2140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_modifier2152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_modifier2166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_modifier2179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_packageOrTypeName2201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_enumConstantName2220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_typeName2241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_type2255 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_type2258 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_type2262 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_type2272 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_type2276 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_type2280 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType2299 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2303 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_classOrInterfaceType2307 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType2311 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2313 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_60_in_primitiveType2334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_primitiveType2346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_primitiveType2359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_primitiveType2372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_primitiveType2385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_primitiveType2399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_primitiveType2412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_primitiveType2425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_variableModifier2447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_variableModifier2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_typeArguments2477 = new BitSet(new long[]{0x5020000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments2481 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_39_in_typeArguments2484 = new BitSet(new long[]{0x5020000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments2487 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_52_in_typeArguments2491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeArgument2515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_typeArgument2525 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000100L});
	public static final BitSet FOLLOW_72_in_typeArgument2529 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_96_in_typeArgument2534 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_typeArgument2539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList2565 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_qualifiedNameList2568 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList2572 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_32_in_formalParameters2593 = new BitSet(new long[]{0x5040000200008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters2597 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_formalParameters2600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_formalParameterDecls2626 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_formalParameterDecls2628 = new BitSet(new long[]{0x0000100000008000L});
	public static final BitSet FOLLOW_formalParameterDeclsRest_in_formalParameterDecls2630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2655 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_formalParameterDeclsRest2658 = new BitSet(new long[]{0x5040000000008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDeclsRest2662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_formalParameterDeclsRest2674 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_methodBody2698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_constructorBody2719 = new BitSet(new long[]{0x784303310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody2722 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_blockStatement_in_constructorBody2725 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_112_in_constructorBody2728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2749 = new BitSet(new long[]{0x0000000000000000L,0x0000000900000000L});
	public static final BitSet FOLLOW_99_in_explicitConstructorInvocation2753 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_explicitConstructorInvocation2758 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation2763 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_explicitConstructorInvocation2765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_explicitConstructorInvocation2777 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_explicitConstructorInvocation2779 = new BitSet(new long[]{0x0002000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_explicitConstructorInvocation2785 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation2787 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_explicitConstructorInvocation2789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualifiedName2813 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_qualifiedName2818 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_qualifiedName2824 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_integerLiteral_in_literal2853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FloatingPointLiteral_in_literal2863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CharacterLiteral_in_literal2876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_literal2889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_literal2901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_literal2911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HexLiteral_in_integerLiteral2932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OctalLiteral_in_integerLiteral2944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DecimalLiteral_in_integerLiteral2956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_booleanLiteral2977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_booleanLiteral2989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_annotations3011 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_annotation3031 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_annotationName_in_annotation3033 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_annotation3037 = new BitSet(new long[]{0x504003330260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValuePairs_in_annotation3043 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_elementValue_in_annotation3047 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_annotation3052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationName3082 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_annotationName3086 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_annotationName3090 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs3111 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_elementValuePairs3114 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs3118 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_Identifier_in_elementValuePair3139 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_elementValuePair3143 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValuePair3147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_elementValue3170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_elementValue3180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue3190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_elementValueArrayInitializer3213 = new BitSet(new long[]{0x504003B10260D0C0L,0x0003128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer3217 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_elementValueArrayInitializer3220 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer3223 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_elementValueArrayInitializer3230 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_elementValueArrayInitializer3235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_annotationTypeDeclaration3259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_annotationTypeDeclaration3261 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_annotationTypeDeclaration3263 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_annotationTypeBody_in_annotationTypeDeclaration3267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_annotationTypeBody3290 = new BitSet(new long[]{0x5840000000008100L,0x00010444EE3C1446L});
	public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody3294 = new BitSet(new long[]{0x5840000000008100L,0x00010444EE3C1446L});
	public static final BitSet FOLLOW_112_in_annotationTypeBody3298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_annotationTypeElementDeclaration3322 = new BitSet(new long[]{0x5040000000008100L,0x00000000201C1046L});
	public static final BitSet FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration3324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_annotationTypeElementRest3347 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest3349 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_annotationTypeElementRest3361 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest3374 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_annotationTypeElementRest3387 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest3400 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest3426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest3436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationMethodRest3459 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_annotationMethodRest3463 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_annotationMethodRest3468 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_defaultValue_in_annotationMethodRest3472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarators_in_annotationConstantRest3496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_defaultValue3519 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_defaultValue3523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_block3544 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_blockStatement_in_block3548 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_112_in_block3551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement3577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement3587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_blockStatement3596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement3621 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_localVariableDeclarationStatement3624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_localVariableDeclaration3645 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_localVariableDeclaration3647 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclarators_in_localVariableDeclaration3649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifier_in_variableModifiers3674 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_statement3692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSERT_in_statement3702 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3704 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_47_in_statement3707 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3709 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_statement3723 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3726 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3728 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_statement3738 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_statement3754 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_statement3758 = new BitSet(new long[]{0x504103310260D0C0L,0x0002028920D41642L});
	public static final BitSet FOLLOW_forControl_in_statement3762 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement3764 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_statement3778 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3781 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_statement3794 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3797 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_107_in_statement3799 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3803 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_statement3817 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000801L});
	public static final BitSet FOLLOW_catches_in_statement3832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_statement3834 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_statement3849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_statement3863 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_statement3886 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3890 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_statement3892 = new BitSet(new long[]{0x8000000000000000L,0x0001000000000010L});
	public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement3894 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_statement3896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_statement3906 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3909 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_statement3921 = new BitSet(new long[]{0x500103310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3925 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_statement3940 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3943 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_statement3957 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_Identifier_in_statement3960 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_statement3976 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_Identifier_in_statement3980 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_statement3997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statementExpression_in_statement4009 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement4011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement4024 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement4028 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement4030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catchClause_in_catches4053 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_catchClause_in_catches4056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_catchClause4081 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_catchClause4084 = new BitSet(new long[]{0x5040000000008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameter_in_catchClause4088 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_catchClause4090 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_catchClause4094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_formalParameter4113 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_formalParameter4115 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameter4117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups4145 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup4172 = new BitSet(new long[]{0xF84103310260D1D2L,0x00021B9FFEDC767EL});
	public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup4175 = new BitSet(new long[]{0x784103310260D1D2L,0x00021B9FFEDC766EL});
	public static final BitSet FOLLOW_63_in_switchLabel4199 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_constantExpression_in_switchLabel4202 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel4204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_switchLabel4214 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_enumConstantName_in_switchLabel4218 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel4220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_switchLabel4230 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel4234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enhancedForControl_in_forControl4265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_forControl4275 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_forControl4278 = new BitSet(new long[]{0x500103310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_forControl4280 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_forControl4283 = new BitSet(new long[]{0x500003310260D0C2L,0x0002028920D41242L});
	public static final BitSet FOLLOW_forUpdate_in_forControl4285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_forInit4305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit4316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_enhancedForControl4339 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_enhancedForControl4341 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_enhancedForControl4343 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_enhancedForControl4347 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_enhancedForControl4349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forUpdate4368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_parExpression4389 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_parExpression4392 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_parExpression4394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList4419 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_expressionList4422 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_expressionList4425 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_expression_in_statementExpression4446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_constantExpression4470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_expression4493 = new BitSet(new long[]{0x0416444890000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_assignmentOperator_in_expression4496 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_expression4498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_assignmentOperator4535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_assignmentOperator4545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_assignmentOperator4555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_assignmentOperator4565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_assignmentOperator4575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_assignmentOperator4585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_assignmentOperator4595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignmentOperator4605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_assignmentOperator4626 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_assignmentOperator4630 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4668 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4672 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4676 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4711 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4715 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression4748 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_conditionalExpression4752 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression4754 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_conditionalExpression4756 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression4758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression4780 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_conditionalOrExpression4784 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression4788 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4810 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_conditionalAndExpression4814 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4818 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4840 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_inclusiveOrExpression4844 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4848 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression4870 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_exclusiveOrExpression4874 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression4876 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression4898 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_andExpression4902 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression4906 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression4928 = new BitSet(new long[]{0x0008000004000002L});
	public static final BitSet FOLLOW_51_in_equalityExpression4933 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_26_in_equalityExpression4938 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression4943 = new BitSet(new long[]{0x0008000004000002L});
	public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression4965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_instanceOfExpression4968 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_instanceOfExpression4971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4992 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_relationalOp_in_relationalExpression4996 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4998 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_49_in_relationalOp5033 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_relationalOp5037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_relationalOp5067 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_relationalOp5071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_relationalOp5092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_relationalOp5104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression5125 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_shiftOp_in_shiftExpression5129 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression5131 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_49_in_shiftOp5162 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_shiftOp5166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_shiftOp5198 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp5202 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp5206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_shiftOp5236 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp5240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5270 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_36_in_additiveExpression5275 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_40_in_additiveExpression5280 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5285 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5307 = new BitSet(new long[]{0x0000200408000002L});
	public static final BitSet FOLLOW_34_in_multiplicativeExpression5313 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_45_in_multiplicativeExpression5319 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_27_in_multiplicativeExpression5325 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5330 = new BitSet(new long[]{0x0000200408000002L});
	public static final BitSet FOLLOW_36_in_unaryExpression5356 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_unaryExpression5368 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_unaryExpression5380 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unaryExpression5392 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression5404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_unaryExpressionNotPlusMinus5423 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_unaryExpressionNotPlusMinus5435 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus5447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus5457 = new BitSet(new long[]{0x00800A2000000002L});
	public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus5459 = new BitSet(new long[]{0x00800A2000000002L});
	public static final BitSet FOLLOW_37_in_unaryExpressionNotPlusMinus5463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unaryExpressionNotPlusMinus5467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_castExpression5489 = new BitSet(new long[]{0x5000000000000000L,0x0000000020141042L});
	public static final BitSet FOLLOW_primitiveType_in_castExpression5492 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_castExpression5494 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_castExpression5496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_castExpression5505 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_type_in_castExpression5509 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_expression_in_castExpression5513 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_castExpression5516 = new BitSet(new long[]{0x500000010260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression5518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parExpression_in_primary5537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_primary5547 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_43_in_primary5551 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_primary5555 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_primary5559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_primary5571 = new BitSet(new long[]{0x0000080100000000L});
	public static final BitSet FOLLOW_superSuffix_in_primary5574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primary5584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_primary5594 = new BitSet(new long[]{0x5002000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_creator_in_primary5597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primary5609 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_43_in_primary5614 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_primary5620 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_primary5625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_primary5637 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_55_in_primary5640 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_primary5643 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_43_in_primary5648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_primary5650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_primary5662 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_primary5665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_primary5669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_identifierSuffix5690 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_identifierSuffix5694 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_identifierSuffix5704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_identifierSuffix5716 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_identifierSuffix5720 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_identifierSuffix5722 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix5737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_identifierSuffix5752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5763 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_explicitGenericInvocation_in_identifierSuffix5767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5777 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_identifierSuffix5781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5792 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_identifierSuffix5796 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix5798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_identifierSuffix5814 = new BitSet(new long[]{0x0002000000008000L});
	public static final BitSet FOLLOW_innerCreator_in_identifierSuffix5817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator5836 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_createdName_in_creator5838 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator5840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createdName_in_creator5850 = new BitSet(new long[]{0x0080000100000000L});
	public static final BitSet FOLLOW_arrayCreatorRest_in_creator5853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator5857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_createdName5879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_createdName5889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_innerCreator5914 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_innerCreator5917 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_classCreatorRest_in_innerCreator5919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5938 = new BitSet(new long[]{0x510003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5953 = new BitSet(new long[]{0x0080000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5956 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5959 = new BitSet(new long[]{0x0080000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest5965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayCreatorRest5979 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5981 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5986 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_arrayCreatorRest5989 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5991 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5998 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest6001 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_arguments_in_classCreatorRest6034 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_classBody_in_classCreatorRest6036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation6060 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_explicitGenericInvocation6062 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitGenericInvocation6065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_nonWildcardTypeArguments6088 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments6092 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_nonWildcardTypeArguments6094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector6119 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_selector6123 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_arguments_in_selector6128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector6139 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_selector6143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector6155 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_selector6159 = new BitSet(new long[]{0x0000080100000000L});
	public static final BitSet FOLLOW_superSuffix_in_selector6161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector6173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_selector6177 = new BitSet(new long[]{0x0002000000008000L});
	public static final BitSet FOLLOW_innerCreator_in_selector6182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_selector6192 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_selector6196 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_selector6198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arguments_in_superSuffix6223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_superSuffix6233 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_superSuffix6237 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_arguments_in_superSuffix6241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_arguments6261 = new BitSet(new long[]{0x500003330260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expressionList_in_arguments6264 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_arguments6267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotations_in_synpred5_JavaJava73 = new BitSet(new long[]{0x0840000000000100L,0x00000000CF080404L});
	public static final BitSet FOLLOW_packageDeclaration_in_synpred5_JavaJava87 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_importDeclaration_in_synpred5_JavaJava89 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred5_JavaJava92 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred5_JavaJava107 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred5_JavaJava109 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred112_JavaJava2722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred116_JavaJava2749 = new BitSet(new long[]{0x0000000000000000L,0x0000000900000000L});
	public static final BitSet FOLLOW_set_in_synpred116_JavaJava2752 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_synpred116_JavaJava2763 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_synpred116_JavaJava2765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_synpred127_JavaJava3011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_synpred150_JavaJava3577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred151_JavaJava3587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_synpred156_JavaJava3738 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_synpred156_JavaJava3742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred161_JavaJava3832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_synpred161_JavaJava3834 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_synpred161_JavaJava3837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred162_JavaJava3849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchLabel_in_synpred177_JavaJava4172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_synpred179_JavaJava4199 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_constantExpression_in_synpred179_JavaJava4202 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred179_JavaJava4204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_synpred180_JavaJava4214 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_enumConstantName_in_synpred180_JavaJava4218 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred180_JavaJava4220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enhancedForControl_in_synpred181_JavaJava4265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_synpred185_JavaJava4305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred187_JavaJava4496 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred187_JavaJava4498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred197_JavaJava4616 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred197_JavaJava4618 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred197_JavaJava4620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred198_JavaJava4656 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred198_JavaJava4658 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred198_JavaJava4660 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred198_JavaJava4662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred199_JavaJava4701 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred199_JavaJava4703 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred199_JavaJava4705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred210_JavaJava5025 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred210_JavaJava5027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred211_JavaJava5059 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred211_JavaJava5061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred214_JavaJava5154 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred214_JavaJava5156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred215_JavaJava5188 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred215_JavaJava5190 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred215_JavaJava5192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred216_JavaJava5228 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred216_JavaJava5230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_synpred228_JavaJava5447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_synpred232_JavaJava5489 = new BitSet(new long[]{0x5000000000000000L,0x0000000020141042L});
	public static final BitSet FOLLOW_primitiveType_in_synpred232_JavaJava5492 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_synpred232_JavaJava5494 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_synpred232_JavaJava5496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred233_JavaJava5509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_synpred235_JavaJava5551 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_synpred235_JavaJava5555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred236_JavaJava5559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_synpred241_JavaJava5614 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_synpred241_JavaJava5620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred242_JavaJava5625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred248_JavaJava5716 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred248_JavaJava5720 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred248_JavaJava5722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred261_JavaJava5986 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred261_JavaJava5989 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred261_JavaJava5991 = new BitSet(new long[]{0x0000000000000002L});
}
