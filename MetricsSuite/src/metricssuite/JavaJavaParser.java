// $ANTLR 3.5.1 /home/tony/Downloads/JavaJava.g 2018-05-05 21:13:13

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
		this.state.ruleMemo = new HashMap[408+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return JavaJavaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/tony/Downloads/JavaJava.g"; }



	    String extendsClass;
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
	        // System.out.println(sp);
	         JavaMetrics.uniqueSpecial.add(sp);
	    }
	    void id(String s){
	    	identcount++;
	    	JavaMetrics.uniqueIdentifiers.add(s);
	    	//System.out.println("ID=====>" + s);
	    }
	    
	    //count methods in class
	  
	  //  public int methodNameCount =0;
	    //void methodNames(String s){
	    //	methodNameCount++;
	    //	JavaMetrics.methodNames.add(s);
	    
	    //}
	    
	    
	    //void id(Symbol s){
	    //	identcount++;
	    //	JavaMetrics.uIDSym.add(s);
	    	//System.out.println("ID=====>" + s);
	    //}
	 

	public static class compilationUnit_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compilationUnit"
	// /home/tony/Downloads/JavaJava.g:95:1: compilationUnit : ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* );
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

			// /home/tony/Downloads/JavaJava.g:96:5: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
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
					// /home/tony/Downloads/JavaJava.g:96:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotations_in_compilationUnit73);
					annotations1=annotations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotations1.getTree());

					// /home/tony/Downloads/JavaJava.g:97:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
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
							// /home/tony/Downloads/JavaJava.g:97:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
							{
							pushFollow(FOLLOW_packageDeclaration_in_compilationUnit87);
							packageDeclaration2=packageDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, packageDeclaration2.getTree());

							// /home/tony/Downloads/JavaJava.g:97:32: ( importDeclaration )*
							loop1:
							while (true) {
								int alt1=2;
								int LA1_0 = input.LA(1);
								if ( (LA1_0==80) ) {
									alt1=1;
								}

								switch (alt1) {
								case 1 :
									// /home/tony/Downloads/JavaJava.g:97:32: importDeclaration
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

							// /home/tony/Downloads/JavaJava.g:97:51: ( typeDeclaration )*
							loop2:
							while (true) {
								int alt2=2;
								int LA2_0 = input.LA(1);
								if ( (LA2_0==ENUM||LA2_0==48||LA2_0==54||LA2_0==59||LA2_0==66||LA2_0==74||LA2_0==83||(LA2_0 >= 89 && LA2_0 <= 91)||(LA2_0 >= 94 && LA2_0 <= 95)) ) {
									alt2=1;
								}

								switch (alt2) {
								case 1 :
									// /home/tony/Downloads/JavaJava.g:97:51: typeDeclaration
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
							// /home/tony/Downloads/JavaJava.g:98:13: classOrInterfaceDeclaration ( typeDeclaration )*
							{
							pushFollow(FOLLOW_classOrInterfaceDeclaration_in_compilationUnit107);
							classOrInterfaceDeclaration5=classOrInterfaceDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration5.getTree());

							// /home/tony/Downloads/JavaJava.g:98:41: ( typeDeclaration )*
							loop3:
							while (true) {
								int alt3=2;
								int LA3_0 = input.LA(1);
								if ( (LA3_0==ENUM||LA3_0==48||LA3_0==54||LA3_0==59||LA3_0==66||LA3_0==74||LA3_0==83||(LA3_0 >= 89 && LA3_0 <= 91)||(LA3_0 >= 94 && LA3_0 <= 95)) ) {
									alt3=1;
								}

								switch (alt3) {
								case 1 :
									// /home/tony/Downloads/JavaJava.g:98:41: typeDeclaration
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
					// /home/tony/Downloads/JavaJava.g:100:9: ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )*
					{
					root_0 = (Object)adaptor.nil();


					// /home/tony/Downloads/JavaJava.g:100:9: ( packageDeclaration )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==88) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:100:9: packageDeclaration
							{
							pushFollow(FOLLOW_packageDeclaration_in_compilationUnit130);
							packageDeclaration7=packageDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, packageDeclaration7.getTree());

							}
							break;

					}

					// /home/tony/Downloads/JavaJava.g:100:29: ( importDeclaration )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==80) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:100:29: importDeclaration
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

					// /home/tony/Downloads/JavaJava.g:100:48: ( typeDeclaration )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ENUM||LA7_0==48||LA7_0==54||LA7_0==59||LA7_0==66||LA7_0==74||LA7_0==83||(LA7_0 >= 89 && LA7_0 <= 91)||(LA7_0 >= 94 && LA7_0 <= 95)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:100:48: typeDeclaration
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
	// /home/tony/Downloads/JavaJava.g:103:1: packageDeclaration : 'package' qualifiedName ';' ;
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

			// /home/tony/Downloads/JavaJava.g:104:5: ( 'package' qualifiedName ';' )
			// /home/tony/Downloads/JavaJava.g:104:9: 'package' qualifiedName ';'
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
	// /home/tony/Downloads/JavaJava.g:107:1: importDeclaration : 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';' ;
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

			// /home/tony/Downloads/JavaJava.g:108:5: ( 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';' )
			// /home/tony/Downloads/JavaJava.g:108:9: 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal13=(Token)match(input,80,FOLLOW_80_in_importDeclaration186); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal13_tree = (Object)adaptor.create(string_literal13);
			adaptor.addChild(root_0, string_literal13_tree);
			}

			if ( state.backtracking==0 ) {importKWCount++;}
			// /home/tony/Downloads/JavaJava.g:108:37: ( 'static' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==94) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:108:37: 'static'
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
			// /home/tony/Downloads/JavaJava.g:108:80: ( '.' '*' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==43) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:108:81: '.' '*'
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
	// /home/tony/Downloads/JavaJava.g:111:1: typeDeclaration : ( classOrInterfaceDeclaration | ';' );
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

			// /home/tony/Downloads/JavaJava.g:112:5: ( classOrInterfaceDeclaration | ';' )
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
					// /home/tony/Downloads/JavaJava.g:112:9: classOrInterfaceDeclaration
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
					// /home/tony/Downloads/JavaJava.g:113:9: ';'
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
	// /home/tony/Downloads/JavaJava.g:116:1: classOrInterfaceDeclaration : classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) ;
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

			// /home/tony/Downloads/JavaJava.g:117:5: ( classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) )
			// /home/tony/Downloads/JavaJava.g:117:9: classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration267);
			classOrInterfaceModifiers21=classOrInterfaceModifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceModifiers21.getTree());

			// /home/tony/Downloads/JavaJava.g:117:35: ( classDeclaration | interfaceDeclaration )
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
					// /home/tony/Downloads/JavaJava.g:117:36: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration270);
					classDeclaration22=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration22.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:117:55: interfaceDeclaration
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
	// /home/tony/Downloads/JavaJava.g:120:1: classOrInterfaceModifiers : ( classOrInterfaceModifier )* ;
	public final JavaJavaParser.classOrInterfaceModifiers_return classOrInterfaceModifiers() throws RecognitionException {
		JavaJavaParser.classOrInterfaceModifiers_return retval = new JavaJavaParser.classOrInterfaceModifiers_return();
		retval.start = input.LT(1);
		int classOrInterfaceModifiers_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope classOrInterfaceModifier24 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:121:5: ( ( classOrInterfaceModifier )* )
			// /home/tony/Downloads/JavaJava.g:121:9: ( classOrInterfaceModifier )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/tony/Downloads/JavaJava.g:121:9: ( classOrInterfaceModifier )*
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
					// /home/tony/Downloads/JavaJava.g:121:9: classOrInterfaceModifier
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
	// /home/tony/Downloads/JavaJava.g:124:1: classOrInterfaceModifier : ( annotation | 'public' | 'protected' | 'private' | 'abstract' | 'static' | 'final' | 'strictfp' );
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

			// /home/tony/Downloads/JavaJava.g:125:5: ( annotation | 'public' | 'protected' | 'private' | 'abstract' | 'static' | 'final' | 'strictfp' )
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
					// /home/tony/Downloads/JavaJava.g:125:9: annotation
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
					// /home/tony/Downloads/JavaJava.g:126:9: 'public'
					{
					root_0 = (Object)adaptor.nil();


					string_literal26=(Token)match(input,91,FOLLOW_91_in_classOrInterfaceModifier331); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal26_tree = (Object)adaptor.create(string_literal26);
					adaptor.addChild(root_0, string_literal26_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("public");}
					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:127:9: 'protected'
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
					// /home/tony/Downloads/JavaJava.g:128:9: 'private'
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
					// /home/tony/Downloads/JavaJava.g:129:9: 'abstract'
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
					// /home/tony/Downloads/JavaJava.g:130:9: 'static'
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
					// /home/tony/Downloads/JavaJava.g:131:9: 'final'
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
					// /home/tony/Downloads/JavaJava.g:132:9: 'strictfp'
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
	// /home/tony/Downloads/JavaJava.g:135:1: modifiers : ( modifier )* ;
	public final JavaJavaParser.modifiers_return modifiers() throws RecognitionException {
		JavaJavaParser.modifiers_return retval = new JavaJavaParser.modifiers_return();
		retval.start = input.LT(1);
		int modifiers_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope modifier33 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:136:5: ( ( modifier )* )
			// /home/tony/Downloads/JavaJava.g:136:9: ( modifier )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/tony/Downloads/JavaJava.g:136:9: ( modifier )*
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
					// /home/tony/Downloads/JavaJava.g:136:9: modifier
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
	// /home/tony/Downloads/JavaJava.g:139:1: classDeclaration : ( normalClassDeclaration | enumDeclaration );
	public final JavaJavaParser.classDeclaration_return classDeclaration() throws RecognitionException {
		JavaJavaParser.classDeclaration_return retval = new JavaJavaParser.classDeclaration_return();
		retval.start = input.LT(1);
		int classDeclaration_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope normalClassDeclaration34 =null;
		ParserRuleReturnScope enumDeclaration35 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:140:5: ( normalClassDeclaration | enumDeclaration )
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
					// /home/tony/Downloads/JavaJava.g:140:9: normalClassDeclaration
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
					// /home/tony/Downloads/JavaJava.g:141:9: enumDeclaration
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
	// /home/tony/Downloads/JavaJava.g:144:1: normalClassDeclaration : 'class' Identifier ( typeParameters )? ( typeExt type )? ( 'implements' typeList )? classBody ;
	public final JavaJavaParser.normalClassDeclaration_return normalClassDeclaration() throws RecognitionException {
		JavaJavaParser.normalClassDeclaration_return retval = new JavaJavaParser.normalClassDeclaration_return();
		retval.start = input.LT(1);
		int normalClassDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal36=null;
		Token Identifier37=null;
		Token string_literal41=null;
		ParserRuleReturnScope typeParameters38 =null;
		ParserRuleReturnScope typeExt39 =null;
		ParserRuleReturnScope type40 =null;
		ParserRuleReturnScope typeList42 =null;
		ParserRuleReturnScope classBody43 =null;

		Object string_literal36_tree=null;
		Object Identifier37_tree=null;
		Object string_literal41_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:145:5: ( 'class' Identifier ( typeParameters )? ( typeExt type )? ( 'implements' typeList )? classBody )
			// /home/tony/Downloads/JavaJava.g:145:9: 'class' Identifier ( typeParameters )? ( typeExt type )? ( 'implements' typeList )? classBody
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

			if ( state.backtracking==0 ) { className=(Identifier37!=null?Identifier37.getText():null); classCount++;
			    	if(!JavaMetrics.inheritanceTree.containsKey(className)){
			    		JavaMetrics.inheritanceTree.put(className, null);
			    	}
			    	
			    	}
			if ( state.backtracking==0 ) {keywordCount++; JavaMetrics.uniqueKeywords.add("class"); id((Identifier37!=null?Identifier37.getText():null));}
			// /home/tony/Downloads/JavaJava.g:150:88: ( typeParameters )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==49) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:150:88: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalClassDeclaration505);
					typeParameters38=typeParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters38.getTree());

					}
					break;

			}

			// /home/tony/Downloads/JavaJava.g:152:9: ( typeExt type )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==72) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:152:10: typeExt type
					{
					pushFollow(FOLLOW_typeExt_in_normalClassDeclaration526);
					typeExt39=typeExt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExt39.getTree());

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("extends");}
					pushFollow(FOLLOW_type_in_normalClassDeclaration529);
					type40=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type40.getTree());

					}
					break;

			}

			// /home/tony/Downloads/JavaJava.g:153:9: ( 'implements' typeList )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==79) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:153:10: 'implements' typeList
					{
					string_literal41=(Token)match(input,79,FOLLOW_79_in_normalClassDeclaration543); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal41_tree = (Object)adaptor.create(string_literal41);
					adaptor.addChild(root_0, string_literal41_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("implements");}
					pushFollow(FOLLOW_typeList_in_normalClassDeclaration547);
					typeList42=typeList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList42.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_classBody_in_normalClassDeclaration560);
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
	// /home/tony/Downloads/JavaJava.g:157:1: typeParameters : '<' typeParameter ( ',' typeParameter )* '>' ;
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

			// /home/tony/Downloads/JavaJava.g:158:5: ( '<' typeParameter ( ',' typeParameter )* '>' )
			// /home/tony/Downloads/JavaJava.g:158:9: '<' typeParameter ( ',' typeParameter )* '>'
			{
			root_0 = (Object)adaptor.nil();


			char_literal44=(Token)match(input,49,FOLLOW_49_in_typeParameters583); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = (Object)adaptor.create(char_literal44);
			adaptor.addChild(root_0, char_literal44_tree);
			}

			if ( state.backtracking==0 ) {s("<");}
			pushFollow(FOLLOW_typeParameter_in_typeParameters586);
			typeParameter45=typeParameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameter45.getTree());

			// /home/tony/Downloads/JavaJava.g:158:36: ( ',' typeParameter )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==39) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:158:37: ',' typeParameter
					{
					char_literal46=(Token)match(input,39,FOLLOW_39_in_typeParameters589); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal46_tree = (Object)adaptor.create(char_literal46);
					adaptor.addChild(root_0, char_literal46_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_typeParameter_in_typeParameters592);
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

			char_literal48=(Token)match(input,52,FOLLOW_52_in_typeParameters596); if (state.failed) return retval;
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
	// /home/tony/Downloads/JavaJava.g:161:1: typeParameter : Identifier ( 'extends' typeBound )? ;
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

			// /home/tony/Downloads/JavaJava.g:162:5: ( Identifier ( 'extends' typeBound )? )
			// /home/tony/Downloads/JavaJava.g:162:9: Identifier ( 'extends' typeBound )?
			{
			root_0 = (Object)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_typeParameter621); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = (Object)adaptor.create(Identifier49);
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// /home/tony/Downloads/JavaJava.g:162:19: ( 'extends' typeBound )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==72) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:162:20: 'extends' typeBound
					{
					string_literal50=(Token)match(input,72,FOLLOW_72_in_typeParameter623); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal50_tree = (Object)adaptor.create(string_literal50);
					adaptor.addChild(root_0, string_literal50_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("extends");}
					pushFollow(FOLLOW_typeBound_in_typeParameter626);
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


	public static class typeExt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeExt"
	// /home/tony/Downloads/JavaJava.g:165:1: typeExt : 'extends' Identifier ;
	public final JavaJavaParser.typeExt_return typeExt() throws RecognitionException {
		JavaJavaParser.typeExt_return retval = new JavaJavaParser.typeExt_return();
		retval.start = input.LT(1);
		int typeExt_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal52=null;
		Token Identifier53=null;

		Object string_literal52_tree=null;
		Object Identifier53_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:166:5: ( 'extends' Identifier )
			// /home/tony/Downloads/JavaJava.g:166:7: 'extends' Identifier
			{
			root_0 = (Object)adaptor.nil();


			string_literal52=(Token)match(input,72,FOLLOW_72_in_typeExt645); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal52_tree = (Object)adaptor.create(string_literal52);
			adaptor.addChild(root_0, string_literal52_tree);
			}

			Identifier53=(Token)match(input,Identifier,FOLLOW_Identifier_in_typeExt647); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier53_tree = (Object)adaptor.create(Identifier53);
			adaptor.addChild(root_0, Identifier53_tree);
			}

			if ( state.backtracking==0 ) {extendsClass =(Identifier53!=null?Identifier53.getText():null);
			    	JavaMetrics.inheritanceTree.put(className,extendsClass);
			    	
			    	if(JavaMetrics.classNames.containsKey(extendsClass)){
			    		JavaMetrics.classNames.put(extendsClass, JavaMetrics.classNames.get(extendsClass)+1);
			    	}else{
			    		JavaMetrics.classNames.put(extendsClass, 1);
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
			if ( state.backtracking>0 ) { memoize(input, 13, typeExt_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeExt"


	public static class typeBound_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeBound"
	// /home/tony/Downloads/JavaJava.g:177:1: typeBound : type ( '&' type )* ;
	public final JavaJavaParser.typeBound_return typeBound() throws RecognitionException {
		JavaJavaParser.typeBound_return retval = new JavaJavaParser.typeBound_return();
		retval.start = input.LT(1);
		int typeBound_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal55=null;
		ParserRuleReturnScope type54 =null;
		ParserRuleReturnScope type56 =null;

		Object char_literal55_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:178:5: ( type ( '&' type )* )
			// /home/tony/Downloads/JavaJava.g:178:9: type ( '&' type )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_typeBound676);
			type54=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type54.getTree());

			// /home/tony/Downloads/JavaJava.g:178:14: ( '&' type )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==30) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:178:15: '&' type
					{
					char_literal55=(Token)match(input,30,FOLLOW_30_in_typeBound679); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal55_tree = (Object)adaptor.create(char_literal55);
					adaptor.addChild(root_0, char_literal55_tree);
					}

					pushFollow(FOLLOW_type_in_typeBound681);
					type56=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type56.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 14, typeBound_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:181:1: enumDeclaration : ENUM Identifier ( 'implements' typeList )? enumBody ;
	public final JavaJavaParser.enumDeclaration_return enumDeclaration() throws RecognitionException {
		JavaJavaParser.enumDeclaration_return retval = new JavaJavaParser.enumDeclaration_return();
		retval.start = input.LT(1);
		int enumDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token ENUM57=null;
		Token Identifier58=null;
		Token string_literal59=null;
		ParserRuleReturnScope typeList60 =null;
		ParserRuleReturnScope enumBody61 =null;

		Object ENUM57_tree=null;
		Object Identifier58_tree=null;
		Object string_literal59_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:182:5: ( ENUM Identifier ( 'implements' typeList )? enumBody )
			// /home/tony/Downloads/JavaJava.g:182:9: ENUM Identifier ( 'implements' typeList )? enumBody
			{
			root_0 = (Object)adaptor.nil();


			ENUM57=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration702); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ENUM57_tree = (Object)adaptor.create(ENUM57);
			adaptor.addChild(root_0, ENUM57_tree);
			}

			Identifier58=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumDeclaration704); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier58_tree = (Object)adaptor.create(Identifier58);
			adaptor.addChild(root_0, Identifier58_tree);
			}

			// /home/tony/Downloads/JavaJava.g:182:25: ( 'implements' typeList )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==79) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:182:26: 'implements' typeList
					{
					string_literal59=(Token)match(input,79,FOLLOW_79_in_enumDeclaration707); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal59_tree = (Object)adaptor.create(string_literal59);
					adaptor.addChild(root_0, string_literal59_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("implements");}
					pushFollow(FOLLOW_typeList_in_enumDeclaration711);
					typeList60=typeList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList60.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_enumBody_in_enumDeclaration715);
			enumBody61=enumBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, enumBody61.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 15, enumDeclaration_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:185:1: enumBody : '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' ;
	public final JavaJavaParser.enumBody_return enumBody() throws RecognitionException {
		JavaJavaParser.enumBody_return retval = new JavaJavaParser.enumBody_return();
		retval.start = input.LT(1);
		int enumBody_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal62=null;
		Token char_literal64=null;
		Token char_literal66=null;
		ParserRuleReturnScope enumConstants63 =null;
		ParserRuleReturnScope enumBodyDeclarations65 =null;

		Object char_literal62_tree=null;
		Object char_literal64_tree=null;
		Object char_literal66_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:186:5: ( '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' )
			// /home/tony/Downloads/JavaJava.g:186:9: '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal62=(Token)match(input,108,FOLLOW_108_in_enumBody734); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal62_tree = (Object)adaptor.create(char_literal62);
			adaptor.addChild(root_0, char_literal62_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /home/tony/Downloads/JavaJava.g:186:23: ( enumConstants )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==Identifier||LA24_0==54) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:186:23: enumConstants
					{
					pushFollow(FOLLOW_enumConstants_in_enumBody738);
					enumConstants63=enumConstants();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstants63.getTree());

					}
					break;

			}

			// /home/tony/Downloads/JavaJava.g:186:38: ( ',' )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==39) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:186:38: ','
					{
					char_literal64=(Token)match(input,39,FOLLOW_39_in_enumBody741); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal64_tree = (Object)adaptor.create(char_literal64);
					adaptor.addChild(root_0, char_literal64_tree);
					}

					}
					break;

			}

			// /home/tony/Downloads/JavaJava.g:186:43: ( enumBodyDeclarations )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==48) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:186:43: enumBodyDeclarations
					{
					pushFollow(FOLLOW_enumBodyDeclarations_in_enumBody744);
					enumBodyDeclarations65=enumBodyDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumBodyDeclarations65.getTree());

					}
					break;

			}

			char_literal66=(Token)match(input,112,FOLLOW_112_in_enumBody747); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal66_tree = (Object)adaptor.create(char_literal66);
			adaptor.addChild(root_0, char_literal66_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 16, enumBody_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:189:1: enumConstants : enumConstant ( ',' enumConstant )* ;
	public final JavaJavaParser.enumConstants_return enumConstants() throws RecognitionException {
		JavaJavaParser.enumConstants_return retval = new JavaJavaParser.enumConstants_return();
		retval.start = input.LT(1);
		int enumConstants_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal68=null;
		ParserRuleReturnScope enumConstant67 =null;
		ParserRuleReturnScope enumConstant69 =null;

		Object char_literal68_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:190:5: ( enumConstant ( ',' enumConstant )* )
			// /home/tony/Downloads/JavaJava.g:190:9: enumConstant ( ',' enumConstant )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_enumConstant_in_enumConstants768);
			enumConstant67=enumConstant();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstant67.getTree());

			// /home/tony/Downloads/JavaJava.g:190:22: ( ',' enumConstant )*
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
					// /home/tony/Downloads/JavaJava.g:190:23: ',' enumConstant
					{
					char_literal68=(Token)match(input,39,FOLLOW_39_in_enumConstants771); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal68_tree = (Object)adaptor.create(char_literal68);
					adaptor.addChild(root_0, char_literal68_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_enumConstant_in_enumConstants775);
					enumConstant69=enumConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstant69.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 17, enumConstants_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:193:1: enumConstant : ( annotations )? Identifier ( arguments )? ( classBody )? ;
	public final JavaJavaParser.enumConstant_return enumConstant() throws RecognitionException {
		JavaJavaParser.enumConstant_return retval = new JavaJavaParser.enumConstant_return();
		retval.start = input.LT(1);
		int enumConstant_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier71=null;
		ParserRuleReturnScope annotations70 =null;
		ParserRuleReturnScope arguments72 =null;
		ParserRuleReturnScope classBody73 =null;

		Object Identifier71_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:194:5: ( ( annotations )? Identifier ( arguments )? ( classBody )? )
			// /home/tony/Downloads/JavaJava.g:194:9: ( annotations )? Identifier ( arguments )? ( classBody )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/tony/Downloads/JavaJava.g:194:9: ( annotations )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==54) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:194:9: annotations
					{
					pushFollow(FOLLOW_annotations_in_enumConstant800);
					annotations70=annotations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotations70.getTree());

					}
					break;

			}

			Identifier71=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumConstant803); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier71_tree = (Object)adaptor.create(Identifier71);
			adaptor.addChild(root_0, Identifier71_tree);
			}

			// /home/tony/Downloads/JavaJava.g:194:33: ( arguments )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==32) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:194:33: arguments
					{
					pushFollow(FOLLOW_arguments_in_enumConstant805);
					arguments72=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments72.getTree());

					}
					break;

			}

			// /home/tony/Downloads/JavaJava.g:194:44: ( classBody )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==108) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:194:44: classBody
					{
					pushFollow(FOLLOW_classBody_in_enumConstant808);
					classBody73=classBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody73.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 18, enumConstant_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:197:1: enumBodyDeclarations : ';' ( classBodyDeclaration )* ;
	public final JavaJavaParser.enumBodyDeclarations_return enumBodyDeclarations() throws RecognitionException {
		JavaJavaParser.enumBodyDeclarations_return retval = new JavaJavaParser.enumBodyDeclarations_return();
		retval.start = input.LT(1);
		int enumBodyDeclarations_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal74=null;
		ParserRuleReturnScope classBodyDeclaration75 =null;

		Object char_literal74_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:198:5: ( ';' ( classBodyDeclaration )* )
			// /home/tony/Downloads/JavaJava.g:198:9: ';' ( classBodyDeclaration )*
			{
			root_0 = (Object)adaptor.nil();


			char_literal74=(Token)match(input,48,FOLLOW_48_in_enumBodyDeclarations832); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal74_tree = (Object)adaptor.create(char_literal74);
			adaptor.addChild(root_0, char_literal74_tree);
			}

			// /home/tony/Downloads/JavaJava.g:198:13: ( classBodyDeclaration )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==ENUM||LA31_0==Identifier||(LA31_0 >= 48 && LA31_0 <= 49)||LA31_0==54||(LA31_0 >= 59 && LA31_0 <= 60)||LA31_0==62||(LA31_0 >= 65 && LA31_0 <= 66)||LA31_0==70||LA31_0==74||LA31_0==76||(LA31_0 >= 82 && LA31_0 <= 85)||(LA31_0 >= 89 && LA31_0 <= 91)||(LA31_0 >= 93 && LA31_0 <= 95)||LA31_0==98||LA31_0==102||(LA31_0 >= 105 && LA31_0 <= 106)||LA31_0==108) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:198:14: classBodyDeclaration
					{
					pushFollow(FOLLOW_classBodyDeclaration_in_enumBodyDeclarations835);
					classBodyDeclaration75=classBodyDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBodyDeclaration75.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 19, enumBodyDeclarations_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:201:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );
	public final JavaJavaParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		JavaJavaParser.interfaceDeclaration_return retval = new JavaJavaParser.interfaceDeclaration_return();
		retval.start = input.LT(1);
		int interfaceDeclaration_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope normalInterfaceDeclaration76 =null;
		ParserRuleReturnScope annotationTypeDeclaration77 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:202:5: ( normalInterfaceDeclaration | annotationTypeDeclaration )
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
					// /home/tony/Downloads/JavaJava.g:202:9: normalInterfaceDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration860);
					normalInterfaceDeclaration76=normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, normalInterfaceDeclaration76.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:203:9: annotationTypeDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration870);
					annotationTypeDeclaration77=annotationTypeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeDeclaration77.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 20, interfaceDeclaration_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:206:1: normalInterfaceDeclaration : 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody ;
	public final JavaJavaParser.normalInterfaceDeclaration_return normalInterfaceDeclaration() throws RecognitionException {
		JavaJavaParser.normalInterfaceDeclaration_return retval = new JavaJavaParser.normalInterfaceDeclaration_return();
		retval.start = input.LT(1);
		int normalInterfaceDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal78=null;
		Token Identifier79=null;
		Token string_literal81=null;
		ParserRuleReturnScope typeParameters80 =null;
		ParserRuleReturnScope typeList82 =null;
		ParserRuleReturnScope interfaceBody83 =null;

		Object string_literal78_tree=null;
		Object Identifier79_tree=null;
		Object string_literal81_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:207:5: ( 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody )
			// /home/tony/Downloads/JavaJava.g:207:9: 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody
			{
			root_0 = (Object)adaptor.nil();


			string_literal78=(Token)match(input,83,FOLLOW_83_in_normalInterfaceDeclaration893); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal78_tree = (Object)adaptor.create(string_literal78);
			adaptor.addChild(root_0, string_literal78_tree);
			}

			if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("interface");}
			Identifier79=(Token)match(input,Identifier,FOLLOW_Identifier_in_normalInterfaceDeclaration897); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier79_tree = (Object)adaptor.create(Identifier79);
			adaptor.addChild(root_0, Identifier79_tree);
			}

			if ( state.backtracking==0 ) {id((Identifier79!=null?Identifier79.getText():null));}
			// /home/tony/Downloads/JavaJava.g:207:118: ( typeParameters )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==49) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:207:118: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalInterfaceDeclaration901);
					typeParameters80=typeParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters80.getTree());

					}
					break;

			}

			// /home/tony/Downloads/JavaJava.g:207:134: ( 'extends' typeList )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==72) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:207:135: 'extends' typeList
					{
					string_literal81=(Token)match(input,72,FOLLOW_72_in_normalInterfaceDeclaration905); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal81_tree = (Object)adaptor.create(string_literal81);
					adaptor.addChild(root_0, string_literal81_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("extends");}
					pushFollow(FOLLOW_typeList_in_normalInterfaceDeclaration908);
					typeList82=typeList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList82.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_interfaceBody_in_normalInterfaceDeclaration912);
			interfaceBody83=interfaceBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody83.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 21, normalInterfaceDeclaration_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:210:1: typeList : type ( ',' type )* ;
	public final JavaJavaParser.typeList_return typeList() throws RecognitionException {
		JavaJavaParser.typeList_return retval = new JavaJavaParser.typeList_return();
		retval.start = input.LT(1);
		int typeList_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal85=null;
		ParserRuleReturnScope type84 =null;
		ParserRuleReturnScope type86 =null;

		Object char_literal85_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:211:5: ( type ( ',' type )* )
			// /home/tony/Downloads/JavaJava.g:211:9: type ( ',' type )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_typeList935);
			type84=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type84.getTree());

			// /home/tony/Downloads/JavaJava.g:211:14: ( ',' type )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==39) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:211:15: ',' type
					{
					char_literal85=(Token)match(input,39,FOLLOW_39_in_typeList938); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal85_tree = (Object)adaptor.create(char_literal85);
					adaptor.addChild(root_0, char_literal85_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_type_in_typeList942);
					type86=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type86.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 22, typeList_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:214:1: classBody : '{' ( classBodyDeclaration )* '}' ;
	public final JavaJavaParser.classBody_return classBody() throws RecognitionException {
		JavaJavaParser.classBody_return retval = new JavaJavaParser.classBody_return();
		retval.start = input.LT(1);
		int classBody_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal87=null;
		Token char_literal89=null;
		ParserRuleReturnScope classBodyDeclaration88 =null;

		Object char_literal87_tree=null;
		Object char_literal89_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:215:5: ( '{' ( classBodyDeclaration )* '}' )
			// /home/tony/Downloads/JavaJava.g:215:9: '{' ( classBodyDeclaration )* '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal87=(Token)match(input,108,FOLLOW_108_in_classBody967); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal87_tree = (Object)adaptor.create(char_literal87);
			adaptor.addChild(root_0, char_literal87_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /home/tony/Downloads/JavaJava.g:215:23: ( classBodyDeclaration )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==ENUM||LA36_0==Identifier||(LA36_0 >= 48 && LA36_0 <= 49)||LA36_0==54||(LA36_0 >= 59 && LA36_0 <= 60)||LA36_0==62||(LA36_0 >= 65 && LA36_0 <= 66)||LA36_0==70||LA36_0==74||LA36_0==76||(LA36_0 >= 82 && LA36_0 <= 85)||(LA36_0 >= 89 && LA36_0 <= 91)||(LA36_0 >= 93 && LA36_0 <= 95)||LA36_0==98||LA36_0==102||(LA36_0 >= 105 && LA36_0 <= 106)||LA36_0==108) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:215:23: classBodyDeclaration
					{
					pushFollow(FOLLOW_classBodyDeclaration_in_classBody971);
					classBodyDeclaration88=classBodyDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBodyDeclaration88.getTree());

					}
					break;

				default :
					break loop36;
				}
			}

			char_literal89=(Token)match(input,112,FOLLOW_112_in_classBody974); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal89_tree = (Object)adaptor.create(char_literal89);
			adaptor.addChild(root_0, char_literal89_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 23, classBody_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:218:1: interfaceBody : '{' ( interfaceBodyDeclaration )* '}' ;
	public final JavaJavaParser.interfaceBody_return interfaceBody() throws RecognitionException {
		JavaJavaParser.interfaceBody_return retval = new JavaJavaParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal90=null;
		Token char_literal92=null;
		ParserRuleReturnScope interfaceBodyDeclaration91 =null;

		Object char_literal90_tree=null;
		Object char_literal92_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:219:5: ( '{' ( interfaceBodyDeclaration )* '}' )
			// /home/tony/Downloads/JavaJava.g:219:9: '{' ( interfaceBodyDeclaration )* '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal90=(Token)match(input,108,FOLLOW_108_in_interfaceBody998); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal90_tree = (Object)adaptor.create(char_literal90);
			adaptor.addChild(root_0, char_literal90_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /home/tony/Downloads/JavaJava.g:219:22: ( interfaceBodyDeclaration )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==ENUM||LA37_0==Identifier||(LA37_0 >= 48 && LA37_0 <= 49)||LA37_0==54||(LA37_0 >= 59 && LA37_0 <= 60)||LA37_0==62||(LA37_0 >= 65 && LA37_0 <= 66)||LA37_0==70||LA37_0==74||LA37_0==76||(LA37_0 >= 82 && LA37_0 <= 85)||(LA37_0 >= 89 && LA37_0 <= 91)||(LA37_0 >= 93 && LA37_0 <= 95)||LA37_0==98||LA37_0==102||(LA37_0 >= 105 && LA37_0 <= 106)) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:219:22: interfaceBodyDeclaration
					{
					pushFollow(FOLLOW_interfaceBodyDeclaration_in_interfaceBody1001);
					interfaceBodyDeclaration91=interfaceBodyDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBodyDeclaration91.getTree());

					}
					break;

				default :
					break loop37;
				}
			}

			char_literal92=(Token)match(input,112,FOLLOW_112_in_interfaceBody1004); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal92_tree = (Object)adaptor.create(char_literal92);
			adaptor.addChild(root_0, char_literal92_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 24, interfaceBody_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:222:1: classBodyDeclaration : ( ';' | ( 'static' )? block | modifiers memberDecl );
	public final JavaJavaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
		JavaJavaParser.classBodyDeclaration_return retval = new JavaJavaParser.classBodyDeclaration_return();
		retval.start = input.LT(1);
		int classBodyDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal93=null;
		Token string_literal94=null;
		ParserRuleReturnScope block95 =null;
		ParserRuleReturnScope modifiers96 =null;
		ParserRuleReturnScope memberDecl97 =null;

		Object char_literal93_tree=null;
		Object string_literal94_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:223:5: ( ';' | ( 'static' )? block | modifiers memberDecl )
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
					// /home/tony/Downloads/JavaJava.g:223:9: ';'
					{
					root_0 = (Object)adaptor.nil();


					char_literal93=(Token)match(input,48,FOLLOW_48_in_classBodyDeclaration1024); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal93_tree = (Object)adaptor.create(char_literal93);
					adaptor.addChild(root_0, char_literal93_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:224:9: ( 'static' )? block
					{
					root_0 = (Object)adaptor.nil();


					// /home/tony/Downloads/JavaJava.g:224:9: ( 'static' )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==94) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:224:9: 'static'
							{
							string_literal94=(Token)match(input,94,FOLLOW_94_in_classBodyDeclaration1036); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal94_tree = (Object)adaptor.create(string_literal94);
							adaptor.addChild(root_0, string_literal94_tree);
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("static");}
					pushFollow(FOLLOW_block_in_classBodyDeclaration1043);
					block95=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block95.getTree());

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:225:9: modifiers memberDecl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_modifiers_in_classBodyDeclaration1053);
					modifiers96=modifiers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers96.getTree());

					pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration1055);
					memberDecl97=memberDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberDecl97.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 25, classBodyDeclaration_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:228:1: memberDecl : ( genericMethodOrConstructorDecl | memberDeclaration | 'void' Identifier voidMethodDeclaratorRest | Identifier constructorDeclaratorRest | interfaceDeclaration | classDeclaration );
	public final JavaJavaParser.memberDecl_return memberDecl() throws RecognitionException {
		JavaJavaParser.memberDecl_return retval = new JavaJavaParser.memberDecl_return();
		retval.start = input.LT(1);
		int memberDecl_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal100=null;
		Token Identifier101=null;
		Token Identifier103=null;
		ParserRuleReturnScope genericMethodOrConstructorDecl98 =null;
		ParserRuleReturnScope memberDeclaration99 =null;
		ParserRuleReturnScope voidMethodDeclaratorRest102 =null;
		ParserRuleReturnScope constructorDeclaratorRest104 =null;
		ParserRuleReturnScope interfaceDeclaration105 =null;
		ParserRuleReturnScope classDeclaration106 =null;

		Object string_literal100_tree=null;
		Object Identifier101_tree=null;
		Object Identifier103_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:229:5: ( genericMethodOrConstructorDecl | memberDeclaration | 'void' Identifier voidMethodDeclaratorRest | Identifier constructorDeclaratorRest | interfaceDeclaration | classDeclaration )
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
					// /home/tony/Downloads/JavaJava.g:229:9: genericMethodOrConstructorDecl
					{
					root_0 = (Object)adaptor.nil();


					if ( state.backtracking==0 ) {inMethod=true;}
					pushFollow(FOLLOW_genericMethodOrConstructorDecl_in_memberDecl1080);
					genericMethodOrConstructorDecl98=genericMethodOrConstructorDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, genericMethodOrConstructorDecl98.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:230:9: memberDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_memberDeclaration_in_memberDecl1090);
					memberDeclaration99=memberDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberDeclaration99.getTree());

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:231:9: 'void' Identifier voidMethodDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					if ( state.backtracking==0 ) {inMethod=true;}
					string_literal100=(Token)match(input,105,FOLLOW_105_in_memberDecl1102); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal100_tree = (Object)adaptor.create(string_literal100);
					adaptor.addChild(root_0, string_literal100_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("void");}
					Identifier101=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl1105); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier101_tree = (Object)adaptor.create(Identifier101);
					adaptor.addChild(root_0, Identifier101_tree);
					}

					if ( state.backtracking==0 ) {id((Identifier101!=null?Identifier101.getText():null)); methodName = (Identifier101!=null?Identifier101.getText():null);}
					pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDecl1110);
					voidMethodDeclaratorRest102=voidMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, voidMethodDeclaratorRest102.getTree());

					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:232:9: Identifier constructorDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					if ( state.backtracking==0 ) {inMethod=true;}
					Identifier103=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl1122); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier103_tree = (Object)adaptor.create(Identifier103);
					adaptor.addChild(root_0, Identifier103_tree);
					}

					if ( state.backtracking==0 ) {{id((Identifier103!=null?Identifier103.getText():null));} methodName = (Identifier103!=null?Identifier103.getText():null);}
					pushFollow(FOLLOW_constructorDeclaratorRest_in_memberDecl1127);
					constructorDeclaratorRest104=constructorDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorDeclaratorRest104.getTree());

					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:233:9: interfaceDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_memberDecl1137);
					interfaceDeclaration105=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration105.getTree());

					}
					break;
				case 6 :
					// /home/tony/Downloads/JavaJava.g:234:9: classDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_memberDecl1147);
					classDeclaration106=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration106.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 26, memberDecl_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:237:1: memberDeclaration : type ( methodDeclaration | fieldDeclaration ) ;
	public final JavaJavaParser.memberDeclaration_return memberDeclaration() throws RecognitionException {
		JavaJavaParser.memberDeclaration_return retval = new JavaJavaParser.memberDeclaration_return();
		retval.start = input.LT(1);
		int memberDeclaration_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope type107 =null;
		ParserRuleReturnScope methodDeclaration108 =null;
		ParserRuleReturnScope fieldDeclaration109 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:238:5: ( type ( methodDeclaration | fieldDeclaration ) )
			// /home/tony/Downloads/JavaJava.g:238:9: type ( methodDeclaration | fieldDeclaration )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_memberDeclaration1170);
			type107=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type107.getTree());

			// /home/tony/Downloads/JavaJava.g:238:14: ( methodDeclaration | fieldDeclaration )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==Identifier) ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1==32) ) {
					alt41=1;
				}
				else if ( (LA41_1==39||LA41_1==48||LA41_1==50||LA41_1==55) ) {
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
					// /home/tony/Downloads/JavaJava.g:238:15: methodDeclaration
					{
					if ( state.backtracking==0 ) {inMethod=true;}
					pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration1175);
					methodDeclaration108=methodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration108.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:238:54: fieldDeclaration
					{
					if ( state.backtracking==0 ) {inMethod=false;}
					pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration1183);
					fieldDeclaration109=fieldDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDeclaration109.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 27, memberDeclaration_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:241:1: genericMethodOrConstructorDecl : typeParameters genericMethodOrConstructorRest ;
	public final JavaJavaParser.genericMethodOrConstructorDecl_return genericMethodOrConstructorDecl() throws RecognitionException {
		JavaJavaParser.genericMethodOrConstructorDecl_return retval = new JavaJavaParser.genericMethodOrConstructorDecl_return();
		retval.start = input.LT(1);
		int genericMethodOrConstructorDecl_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope typeParameters110 =null;
		ParserRuleReturnScope genericMethodOrConstructorRest111 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:242:5: ( typeParameters genericMethodOrConstructorRest )
			// /home/tony/Downloads/JavaJava.g:242:9: typeParameters genericMethodOrConstructorRest
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1203);
			typeParameters110=typeParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters110.getTree());

			pushFollow(FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1205);
			genericMethodOrConstructorRest111=genericMethodOrConstructorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, genericMethodOrConstructorRest111.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 28, genericMethodOrConstructorDecl_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:245:1: genericMethodOrConstructorRest : ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest );
	public final JavaJavaParser.genericMethodOrConstructorRest_return genericMethodOrConstructorRest() throws RecognitionException {
		JavaJavaParser.genericMethodOrConstructorRest_return retval = new JavaJavaParser.genericMethodOrConstructorRest_return();
		retval.start = input.LT(1);
		int genericMethodOrConstructorRest_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal113=null;
		Token Identifier114=null;
		Token Identifier116=null;
		ParserRuleReturnScope type112 =null;
		ParserRuleReturnScope methodDeclaratorRest115 =null;
		ParserRuleReturnScope constructorDeclaratorRest117 =null;

		Object string_literal113_tree=null;
		Object Identifier114_tree=null;
		Object Identifier116_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:246:5: ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest )
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
					// /home/tony/Downloads/JavaJava.g:246:9: ( type | 'void' ) Identifier methodDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					// /home/tony/Downloads/JavaJava.g:246:9: ( type | 'void' )
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
							// /home/tony/Downloads/JavaJava.g:246:10: type
							{
							pushFollow(FOLLOW_type_in_genericMethodOrConstructorRest1229);
							type112=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type112.getTree());

							}
							break;
						case 2 :
							// /home/tony/Downloads/JavaJava.g:246:17: 'void'
							{
							string_literal113=(Token)match(input,105,FOLLOW_105_in_genericMethodOrConstructorRest1233); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal113_tree = (Object)adaptor.create(string_literal113);
							adaptor.addChild(root_0, string_literal113_tree);
							}

							}
							break;

					}

					Identifier114=(Token)match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1236); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier114_tree = (Object)adaptor.create(Identifier114);
					adaptor.addChild(root_0, Identifier114_tree);
					}

					if ( state.backtracking==0 ) {if(primitive){id((Identifier114!=null?Identifier114.getText():null)); }}
					pushFollow(FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1240);
					methodDeclaratorRest115=methodDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaratorRest115.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:247:9: Identifier constructorDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					Identifier116=(Token)match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1250); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier116_tree = (Object)adaptor.create(Identifier116);
					adaptor.addChild(root_0, Identifier116_tree);
					}

					if ( state.backtracking==0 ) {id((Identifier116!=null?Identifier116.getText():null)); methodName = (Identifier116!=null?Identifier116.getText():null);}
					pushFollow(FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1254);
					constructorDeclaratorRest117=constructorDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorDeclaratorRest117.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 29, genericMethodOrConstructorRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:250:1: methodDeclaration : Identifier methodDeclaratorRest ;
	public final JavaJavaParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
		JavaJavaParser.methodDeclaration_return retval = new JavaJavaParser.methodDeclaration_return();
		retval.start = input.LT(1);
		int methodDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier118=null;
		ParserRuleReturnScope methodDeclaratorRest119 =null;

		Object Identifier118_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:251:5: ( Identifier methodDeclaratorRest )
			// /home/tony/Downloads/JavaJava.g:251:9: Identifier methodDeclaratorRest
			{
			root_0 = (Object)adaptor.nil();


			Identifier118=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1273); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier118_tree = (Object)adaptor.create(Identifier118);
			adaptor.addChild(root_0, Identifier118_tree);
			}

			if ( state.backtracking==0 ) {// System.out.println("Method=" + (Identifier118!=null?Identifier118.getText():null)); 
			                     inMethod = true;
			                     methodName = (Identifier118!=null?Identifier118.getText():null);
			                    // if(primitive){
			                         id((Identifier118!=null?Identifier118.getText():null));
			                         primitive=false;
			                    // }
			                   }
			pushFollow(FOLLOW_methodDeclaratorRest_in_methodDeclaration1277);
			methodDeclaratorRest119=methodDeclaratorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaratorRest119.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 30, methodDeclaration_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:261:1: fieldDeclaration : variableDeclarators ';' ;
	public final JavaJavaParser.fieldDeclaration_return fieldDeclaration() throws RecognitionException {
		JavaJavaParser.fieldDeclaration_return retval = new JavaJavaParser.fieldDeclaration_return();
		retval.start = input.LT(1);
		int fieldDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal121=null;
		ParserRuleReturnScope variableDeclarators120 =null;

		Object char_literal121_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:262:5: ( variableDeclarators ';' )
			// /home/tony/Downloads/JavaJava.g:262:8: variableDeclarators ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableDeclarators_in_fieldDeclaration1295);
			variableDeclarators120=variableDeclarators();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarators120.getTree());

			char_literal121=(Token)match(input,48,FOLLOW_48_in_fieldDeclaration1297); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal121_tree = (Object)adaptor.create(char_literal121);
			adaptor.addChild(root_0, char_literal121_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 31, fieldDeclaration_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:265:1: interfaceBodyDeclaration : ( modifiers interfaceMemberDecl | ';' );
	public final JavaJavaParser.interfaceBodyDeclaration_return interfaceBodyDeclaration() throws RecognitionException {
		JavaJavaParser.interfaceBodyDeclaration_return retval = new JavaJavaParser.interfaceBodyDeclaration_return();
		retval.start = input.LT(1);
		int interfaceBodyDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal124=null;
		ParserRuleReturnScope modifiers122 =null;
		ParserRuleReturnScope interfaceMemberDecl123 =null;

		Object char_literal124_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:266:5: ( modifiers interfaceMemberDecl | ';' )
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
					// /home/tony/Downloads/JavaJava.g:266:9: modifiers interfaceMemberDecl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_modifiers_in_interfaceBodyDeclaration1325);
					modifiers122=modifiers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers122.getTree());

					pushFollow(FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1327);
					interfaceMemberDecl123=interfaceMemberDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMemberDecl123.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:267:9: ';'
					{
					root_0 = (Object)adaptor.nil();


					char_literal124=(Token)match(input,48,FOLLOW_48_in_interfaceBodyDeclaration1337); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal124_tree = (Object)adaptor.create(char_literal124);
					adaptor.addChild(root_0, char_literal124_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 32, interfaceBodyDeclaration_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:270:1: interfaceMemberDecl : ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration );
	public final JavaJavaParser.interfaceMemberDecl_return interfaceMemberDecl() throws RecognitionException {
		JavaJavaParser.interfaceMemberDecl_return retval = new JavaJavaParser.interfaceMemberDecl_return();
		retval.start = input.LT(1);
		int interfaceMemberDecl_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal127=null;
		Token Identifier128=null;
		ParserRuleReturnScope interfaceMethodOrFieldDecl125 =null;
		ParserRuleReturnScope interfaceGenericMethodDecl126 =null;
		ParserRuleReturnScope voidInterfaceMethodDeclaratorRest129 =null;
		ParserRuleReturnScope interfaceDeclaration130 =null;
		ParserRuleReturnScope classDeclaration131 =null;

		Object string_literal127_tree=null;
		Object Identifier128_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:271:5: ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration )
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
					// /home/tony/Downloads/JavaJava.g:271:9: interfaceMethodOrFieldDecl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1356);
					interfaceMethodOrFieldDecl125=interfaceMethodOrFieldDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodOrFieldDecl125.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:272:9: interfaceGenericMethodDecl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1366);
					interfaceGenericMethodDecl126=interfaceGenericMethodDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceGenericMethodDecl126.getTree());

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:273:9: 'void' Identifier voidInterfaceMethodDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					string_literal127=(Token)match(input,105,FOLLOW_105_in_interfaceMemberDecl1376); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal127_tree = (Object)adaptor.create(string_literal127);
					adaptor.addChild(root_0, string_literal127_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("void");}
					Identifier128=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMemberDecl1379); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier128_tree = (Object)adaptor.create(Identifier128);
					adaptor.addChild(root_0, Identifier128_tree);
					}

					if ( state.backtracking==0 ) { id((Identifier128!=null?Identifier128.getText():null));  methodName = (Identifier128!=null?Identifier128.getText():null);}
					pushFollow(FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1383);
					voidInterfaceMethodDeclaratorRest129=voidInterfaceMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, voidInterfaceMethodDeclaratorRest129.getTree());

					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:274:9: interfaceDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_interfaceMemberDecl1393);
					interfaceDeclaration130=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration130.getTree());

					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:275:9: classDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_interfaceMemberDecl1403);
					classDeclaration131=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration131.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 33, interfaceMemberDecl_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:278:1: interfaceMethodOrFieldDecl : type Identifier interfaceMethodOrFieldRest ;
	public final JavaJavaParser.interfaceMethodOrFieldDecl_return interfaceMethodOrFieldDecl() throws RecognitionException {
		JavaJavaParser.interfaceMethodOrFieldDecl_return retval = new JavaJavaParser.interfaceMethodOrFieldDecl_return();
		retval.start = input.LT(1);
		int interfaceMethodOrFieldDecl_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier133=null;
		ParserRuleReturnScope type132 =null;
		ParserRuleReturnScope interfaceMethodOrFieldRest134 =null;

		Object Identifier133_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:279:5: ( type Identifier interfaceMethodOrFieldRest )
			// /home/tony/Downloads/JavaJava.g:279:9: type Identifier interfaceMethodOrFieldRest
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_interfaceMethodOrFieldDecl1426);
			type132=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type132.getTree());

			Identifier133=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodOrFieldDecl1428); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier133_tree = (Object)adaptor.create(Identifier133);
			adaptor.addChild(root_0, Identifier133_tree);
			}

			if ( state.backtracking==0 ) { id((Identifier133!=null?Identifier133.getText():null));}
			pushFollow(FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl1432);
			interfaceMethodOrFieldRest134=interfaceMethodOrFieldRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodOrFieldRest134.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 34, interfaceMethodOrFieldDecl_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:282:1: interfaceMethodOrFieldRest : ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest );
	public final JavaJavaParser.interfaceMethodOrFieldRest_return interfaceMethodOrFieldRest() throws RecognitionException {
		JavaJavaParser.interfaceMethodOrFieldRest_return retval = new JavaJavaParser.interfaceMethodOrFieldRest_return();
		retval.start = input.LT(1);
		int interfaceMethodOrFieldRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal136=null;
		ParserRuleReturnScope constantDeclaratorsRest135 =null;
		ParserRuleReturnScope interfaceMethodDeclaratorRest137 =null;

		Object char_literal136_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:283:5: ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest )
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
					// /home/tony/Downloads/JavaJava.g:283:9: constantDeclaratorsRest ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest1456);
					constantDeclaratorsRest135=constantDeclaratorsRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaratorsRest135.getTree());

					char_literal136=(Token)match(input,48,FOLLOW_48_in_interfaceMethodOrFieldRest1458); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal136_tree = (Object)adaptor.create(char_literal136);
					adaptor.addChild(root_0, char_literal136_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:284:9: interfaceMethodDeclaratorRest
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest1470);
					interfaceMethodDeclaratorRest137=interfaceMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaratorRest137.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 35, interfaceMethodOrFieldRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:287:1: methodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
	public final JavaJavaParser.methodDeclaratorRest_return methodDeclaratorRest() throws RecognitionException {
		JavaJavaParser.methodDeclaratorRest_return retval = new JavaJavaParser.methodDeclaratorRest_return();
		retval.start = input.LT(1);
		int methodDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal139=null;
		Token char_literal140=null;
		Token string_literal141=null;
		Token char_literal144=null;
		ParserRuleReturnScope formalParameters138 =null;
		ParserRuleReturnScope qualifiedNameList142 =null;
		ParserRuleReturnScope methodBody143 =null;

		Object char_literal139_tree=null;
		Object char_literal140_tree=null;
		Object string_literal141_tree=null;
		Object char_literal144_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:288:5: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
			// /home/tony/Downloads/JavaJava.g:288:9: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_formalParameters_in_methodDeclaratorRest1493);
			formalParameters138=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters138.getTree());

			// /home/tony/Downloads/JavaJava.g:288:26: ( '[' ']' )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==55) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:288:27: '[' ']'
					{
					char_literal139=(Token)match(input,55,FOLLOW_55_in_methodDeclaratorRest1496); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal139_tree = (Object)adaptor.create(char_literal139);
					adaptor.addChild(root_0, char_literal139_tree);
					}

					if ( state.backtracking==0 ) {s("[");}
					char_literal140=(Token)match(input,56,FOLLOW_56_in_methodDeclaratorRest1500); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal140_tree = (Object)adaptor.create(char_literal140);
					adaptor.addChild(root_0, char_literal140_tree);
					}

					if ( state.backtracking==0 ) {s("]");}
					}
					break;

				default :
					break loop47;
				}
			}

			// /home/tony/Downloads/JavaJava.g:289:9: ( 'throws' qualifiedNameList )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==101) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:289:10: 'throws' qualifiedNameList
					{
					string_literal141=(Token)match(input,101,FOLLOW_101_in_methodDeclaratorRest1514); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal141_tree = (Object)adaptor.create(string_literal141);
					adaptor.addChild(root_0, string_literal141_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");}
					pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaratorRest1518);
					qualifiedNameList142=qualifiedNameList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList142.getTree());

					}
					break;

			}

			// /home/tony/Downloads/JavaJava.g:290:9: ( methodBody | ';' )
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
					// /home/tony/Downloads/JavaJava.g:290:13: methodBody
					{
					pushFollow(FOLLOW_methodBody_in_methodDeclaratorRest1534);
					methodBody143=methodBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody143.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:291:13: ';'
					{
					char_literal144=(Token)match(input,48,FOLLOW_48_in_methodDeclaratorRest1548); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal144_tree = (Object)adaptor.create(char_literal144);
					adaptor.addChild(root_0, char_literal144_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 36, methodDeclaratorRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:295:1: voidMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
	public final JavaJavaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest() throws RecognitionException {
		JavaJavaParser.voidMethodDeclaratorRest_return retval = new JavaJavaParser.voidMethodDeclaratorRest_return();
		retval.start = input.LT(1);
		int voidMethodDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal146=null;
		Token char_literal149=null;
		ParserRuleReturnScope formalParameters145 =null;
		ParserRuleReturnScope qualifiedNameList147 =null;
		ParserRuleReturnScope methodBody148 =null;

		Object string_literal146_tree=null;
		Object char_literal149_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:296:5: ( formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
			// /home/tony/Downloads/JavaJava.g:296:9: formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest1581);
			formalParameters145=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters145.getTree());

			// /home/tony/Downloads/JavaJava.g:296:26: ( 'throws' qualifiedNameList )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==101) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:296:27: 'throws' qualifiedNameList
					{
					string_literal146=(Token)match(input,101,FOLLOW_101_in_voidMethodDeclaratorRest1584); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal146_tree = (Object)adaptor.create(string_literal146);
					adaptor.addChild(root_0, string_literal146_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");}
					pushFollow(FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1587);
					qualifiedNameList147=qualifiedNameList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList147.getTree());

					}
					break;

			}

			// /home/tony/Downloads/JavaJava.g:297:9: ( methodBody | ';' )
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
					// /home/tony/Downloads/JavaJava.g:297:13: methodBody
					{
					pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest1603);
					methodBody148=methodBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody148.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:298:13: ';'
					{
					char_literal149=(Token)match(input,48,FOLLOW_48_in_voidMethodDeclaratorRest1617); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal149_tree = (Object)adaptor.create(char_literal149);
					adaptor.addChild(root_0, char_literal149_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 37, voidMethodDeclaratorRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:302:1: interfaceMethodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' ;
	public final JavaJavaParser.interfaceMethodDeclaratorRest_return interfaceMethodDeclaratorRest() throws RecognitionException {
		JavaJavaParser.interfaceMethodDeclaratorRest_return retval = new JavaJavaParser.interfaceMethodDeclaratorRest_return();
		retval.start = input.LT(1);
		int interfaceMethodDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal151=null;
		Token char_literal152=null;
		Token string_literal153=null;
		Token char_literal155=null;
		ParserRuleReturnScope formalParameters150 =null;
		ParserRuleReturnScope qualifiedNameList154 =null;

		Object char_literal151_tree=null;
		Object char_literal152_tree=null;
		Object string_literal153_tree=null;
		Object char_literal155_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:303:5: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' )
			// /home/tony/Downloads/JavaJava.g:303:8: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest1651);
			formalParameters150=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters150.getTree());

			// /home/tony/Downloads/JavaJava.g:303:25: ( '[' ']' )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==55) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:303:26: '[' ']'
					{
					char_literal151=(Token)match(input,55,FOLLOW_55_in_interfaceMethodDeclaratorRest1654); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal151_tree = (Object)adaptor.create(char_literal151);
					adaptor.addChild(root_0, char_literal151_tree);
					}

					if ( state.backtracking==0 ) {s("[");}
					char_literal152=(Token)match(input,56,FOLLOW_56_in_interfaceMethodDeclaratorRest1658); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal152_tree = (Object)adaptor.create(char_literal152);
					adaptor.addChild(root_0, char_literal152_tree);
					}

					if ( state.backtracking==0 ) {s("]");}
					}
					break;

				default :
					break loop52;
				}
			}

			// /home/tony/Downloads/JavaJava.g:303:56: ( 'throws' qualifiedNameList )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==101) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:303:57: 'throws' qualifiedNameList
					{
					string_literal153=(Token)match(input,101,FOLLOW_101_in_interfaceMethodDeclaratorRest1665); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal153_tree = (Object)adaptor.create(string_literal153);
					adaptor.addChild(root_0, string_literal153_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");}
					pushFollow(FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest1668);
					qualifiedNameList154=qualifiedNameList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList154.getTree());

					}
					break;

			}

			char_literal155=(Token)match(input,48,FOLLOW_48_in_interfaceMethodDeclaratorRest1672); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal155_tree = (Object)adaptor.create(char_literal155);
			adaptor.addChild(root_0, char_literal155_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 38, interfaceMethodDeclaratorRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:306:1: interfaceGenericMethodDecl : typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest ;
	public final JavaJavaParser.interfaceGenericMethodDecl_return interfaceGenericMethodDecl() throws RecognitionException {
		JavaJavaParser.interfaceGenericMethodDecl_return retval = new JavaJavaParser.interfaceGenericMethodDecl_return();
		retval.start = input.LT(1);
		int interfaceGenericMethodDecl_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal158=null;
		Token Identifier159=null;
		ParserRuleReturnScope typeParameters156 =null;
		ParserRuleReturnScope type157 =null;
		ParserRuleReturnScope interfaceMethodDeclaratorRest160 =null;

		Object string_literal158_tree=null;
		Object Identifier159_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:307:5: ( typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest )
			// /home/tony/Downloads/JavaJava.g:307:9: typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_typeParameters_in_interfaceGenericMethodDecl1697);
			typeParameters156=typeParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters156.getTree());

			// /home/tony/Downloads/JavaJava.g:307:24: ( type | 'void' )
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
					// /home/tony/Downloads/JavaJava.g:307:25: type
					{
					pushFollow(FOLLOW_type_in_interfaceGenericMethodDecl1700);
					type157=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type157.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:307:32: 'void'
					{
					string_literal158=(Token)match(input,105,FOLLOW_105_in_interfaceGenericMethodDecl1704); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal158_tree = (Object)adaptor.create(string_literal158);
					adaptor.addChild(root_0, string_literal158_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("void");}
					}
					break;

			}

			Identifier159=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceGenericMethodDecl1709); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier159_tree = (Object)adaptor.create(Identifier159);
			adaptor.addChild(root_0, Identifier159_tree);
			}

			if ( state.backtracking==0 ) {if(primitive) id((Identifier159!=null?Identifier159.getText():null));}
			pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl1721);
			interfaceMethodDeclaratorRest160=interfaceMethodDeclaratorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaratorRest160.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 39, interfaceGenericMethodDecl_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:311:1: voidInterfaceMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ';' ;
	public final JavaJavaParser.voidInterfaceMethodDeclaratorRest_return voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		JavaJavaParser.voidInterfaceMethodDeclaratorRest_return retval = new JavaJavaParser.voidInterfaceMethodDeclaratorRest_return();
		retval.start = input.LT(1);
		int voidInterfaceMethodDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal162=null;
		Token char_literal164=null;
		ParserRuleReturnScope formalParameters161 =null;
		ParserRuleReturnScope qualifiedNameList163 =null;

		Object string_literal162_tree=null;
		Object char_literal164_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:312:5: ( formalParameters ( 'throws' qualifiedNameList )? ';' )
			// /home/tony/Downloads/JavaJava.g:312:8: formalParameters ( 'throws' qualifiedNameList )? ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest1743);
			formalParameters161=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters161.getTree());

			// /home/tony/Downloads/JavaJava.g:312:25: ( 'throws' qualifiedNameList )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==101) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:312:26: 'throws' qualifiedNameList
					{
					string_literal162=(Token)match(input,101,FOLLOW_101_in_voidInterfaceMethodDeclaratorRest1746); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal162_tree = (Object)adaptor.create(string_literal162);
					adaptor.addChild(root_0, string_literal162_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");}
					pushFollow(FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest1749);
					qualifiedNameList163=qualifiedNameList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList163.getTree());

					}
					break;

			}

			char_literal164=(Token)match(input,48,FOLLOW_48_in_voidInterfaceMethodDeclaratorRest1753); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal164_tree = (Object)adaptor.create(char_literal164);
			adaptor.addChild(root_0, char_literal164_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 40, voidInterfaceMethodDeclaratorRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:315:1: constructorDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? constructorBody ;
	public final JavaJavaParser.constructorDeclaratorRest_return constructorDeclaratorRest() throws RecognitionException {
		JavaJavaParser.constructorDeclaratorRest_return retval = new JavaJavaParser.constructorDeclaratorRest_return();
		retval.start = input.LT(1);
		int constructorDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal166=null;
		ParserRuleReturnScope formalParameters165 =null;
		ParserRuleReturnScope qualifiedNameList167 =null;
		ParserRuleReturnScope constructorBody168 =null;

		Object string_literal166_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:316:5: ( formalParameters ( 'throws' qualifiedNameList )? constructorBody )
			// /home/tony/Downloads/JavaJava.g:316:9: formalParameters ( 'throws' qualifiedNameList )? constructorBody
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_formalParameters_in_constructorDeclaratorRest1778);
			formalParameters165=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters165.getTree());

			// /home/tony/Downloads/JavaJava.g:316:26: ( 'throws' qualifiedNameList )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==101) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:316:27: 'throws' qualifiedNameList
					{
					string_literal166=(Token)match(input,101,FOLLOW_101_in_constructorDeclaratorRest1781); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal166_tree = (Object)adaptor.create(string_literal166);
					adaptor.addChild(root_0, string_literal166_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");}
					pushFollow(FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1785);
					qualifiedNameList167=qualifiedNameList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList167.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_constructorBody_in_constructorDeclaratorRest1789);
			constructorBody168=constructorBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorBody168.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 41, constructorDeclaratorRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:319:1: constantDeclarator : Identifier constantDeclaratorRest ;
	public final JavaJavaParser.constantDeclarator_return constantDeclarator() throws RecognitionException {
		JavaJavaParser.constantDeclarator_return retval = new JavaJavaParser.constantDeclarator_return();
		retval.start = input.LT(1);
		int constantDeclarator_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier169=null;
		ParserRuleReturnScope constantDeclaratorRest170 =null;

		Object Identifier169_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:320:5: ( Identifier constantDeclaratorRest )
			// /home/tony/Downloads/JavaJava.g:320:9: Identifier constantDeclaratorRest
			{
			root_0 = (Object)adaptor.nil();


			Identifier169=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantDeclarator1808); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier169_tree = (Object)adaptor.create(Identifier169);
			adaptor.addChild(root_0, Identifier169_tree);
			}

			if ( state.backtracking==0 ) {if(primitive && !inMethod) {id((Identifier169!=null?Identifier169.getText():null)); /*JavaMetrics.ssc.push(new Symbol((Identifier169!=null?Identifier169.getText():null), PrimitiveType, className)); */}}
			pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclarator1812);
			constantDeclaratorRest170=constantDeclaratorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaratorRest170.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 42, constantDeclarator_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:323:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* ;
	public final JavaJavaParser.variableDeclarators_return variableDeclarators() throws RecognitionException {
		JavaJavaParser.variableDeclarators_return retval = new JavaJavaParser.variableDeclarators_return();
		retval.start = input.LT(1);
		int variableDeclarators_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal172=null;
		ParserRuleReturnScope variableDeclarator171 =null;
		ParserRuleReturnScope variableDeclarator173 =null;

		Object char_literal172_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:324:5: ( variableDeclarator ( ',' variableDeclarator )* )
			// /home/tony/Downloads/JavaJava.g:324:9: variableDeclarator ( ',' variableDeclarator )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1835);
			variableDeclarator171=variableDeclarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator171.getTree());

			// /home/tony/Downloads/JavaJava.g:324:28: ( ',' variableDeclarator )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==39) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:324:29: ',' variableDeclarator
					{
					char_literal172=(Token)match(input,39,FOLLOW_39_in_variableDeclarators1838); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal172_tree = (Object)adaptor.create(char_literal172);
					adaptor.addChild(root_0, char_literal172_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1842);
					variableDeclarator173=variableDeclarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator173.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 43, variableDeclarators_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:327:1: variableDeclarator : variableDeclaratorId ( '=' variableInitializer )? ;
	public final JavaJavaParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
		JavaJavaParser.variableDeclarator_return retval = new JavaJavaParser.variableDeclarator_return();
		retval.start = input.LT(1);
		int variableDeclarator_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal175=null;
		ParserRuleReturnScope variableDeclaratorId174 =null;
		ParserRuleReturnScope variableInitializer176 =null;

		Object char_literal175_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:328:5: ( variableDeclaratorId ( '=' variableInitializer )? )
			// /home/tony/Downloads/JavaJava.g:328:9: variableDeclaratorId ( '=' variableInitializer )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator1865);
			variableDeclaratorId174=variableDeclaratorId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId174.getTree());

			// /home/tony/Downloads/JavaJava.g:328:30: ( '=' variableInitializer )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==50) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:328:31: '=' variableInitializer
					{
					char_literal175=(Token)match(input,50,FOLLOW_50_in_variableDeclarator1868); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal175_tree = (Object)adaptor.create(char_literal175);
					adaptor.addChild(root_0, char_literal175_tree);
					}

					pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1870);
					variableInitializer176=variableInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer176.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 44, variableDeclarator_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:331:1: constantDeclaratorsRest : constantDeclaratorRest ( ',' constantDeclarator )* ;
	public final JavaJavaParser.constantDeclaratorsRest_return constantDeclaratorsRest() throws RecognitionException {
		JavaJavaParser.constantDeclaratorsRest_return retval = new JavaJavaParser.constantDeclaratorsRest_return();
		retval.start = input.LT(1);
		int constantDeclaratorsRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal178=null;
		ParserRuleReturnScope constantDeclaratorRest177 =null;
		ParserRuleReturnScope constantDeclarator179 =null;

		Object char_literal178_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:332:5: ( constantDeclaratorRest ( ',' constantDeclarator )* )
			// /home/tony/Downloads/JavaJava.g:332:9: constantDeclaratorRest ( ',' constantDeclarator )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1895);
			constantDeclaratorRest177=constantDeclaratorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaratorRest177.getTree());

			// /home/tony/Downloads/JavaJava.g:332:32: ( ',' constantDeclarator )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==39) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:332:33: ',' constantDeclarator
					{
					char_literal178=(Token)match(input,39,FOLLOW_39_in_constantDeclaratorsRest1898); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal178_tree = (Object)adaptor.create(char_literal178);
					adaptor.addChild(root_0, char_literal178_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_constantDeclarator_in_constantDeclaratorsRest1902);
					constantDeclarator179=constantDeclarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclarator179.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 45, constantDeclaratorsRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:335:1: constantDeclaratorRest : ( '[' ']' )* '=' variableInitializer ;
	public final JavaJavaParser.constantDeclaratorRest_return constantDeclaratorRest() throws RecognitionException {
		JavaJavaParser.constantDeclaratorRest_return retval = new JavaJavaParser.constantDeclaratorRest_return();
		retval.start = input.LT(1);
		int constantDeclaratorRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal180=null;
		Token char_literal181=null;
		Token char_literal182=null;
		ParserRuleReturnScope variableInitializer183 =null;

		Object char_literal180_tree=null;
		Object char_literal181_tree=null;
		Object char_literal182_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:336:5: ( ( '[' ']' )* '=' variableInitializer )
			// /home/tony/Downloads/JavaJava.g:336:9: ( '[' ']' )* '=' variableInitializer
			{
			root_0 = (Object)adaptor.nil();


			// /home/tony/Downloads/JavaJava.g:336:9: ( '[' ']' )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==55) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:336:10: '[' ']'
					{
					char_literal180=(Token)match(input,55,FOLLOW_55_in_constantDeclaratorRest1924); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal180_tree = (Object)adaptor.create(char_literal180);
					adaptor.addChild(root_0, char_literal180_tree);
					}

					if ( state.backtracking==0 ) {s("[");}
					char_literal181=(Token)match(input,56,FOLLOW_56_in_constantDeclaratorRest1928); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal181_tree = (Object)adaptor.create(char_literal181);
					adaptor.addChild(root_0, char_literal181_tree);
					}

					if ( state.backtracking==0 ) {s("]");}
					}
					break;

				default :
					break loop60;
				}
			}

			char_literal182=(Token)match(input,50,FOLLOW_50_in_constantDeclaratorRest1935); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal182_tree = (Object)adaptor.create(char_literal182);
			adaptor.addChild(root_0, char_literal182_tree);
			}

			pushFollow(FOLLOW_variableInitializer_in_constantDeclaratorRest1937);
			variableInitializer183=variableInitializer();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer183.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 46, constantDeclaratorRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:339:1: variableDeclaratorId : Identifier ( '[' ']' )* ;
	public final JavaJavaParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
		JavaJavaParser.variableDeclaratorId_return retval = new JavaJavaParser.variableDeclaratorId_return();
		retval.start = input.LT(1);
		int variableDeclaratorId_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier184=null;
		Token char_literal185=null;
		Token char_literal186=null;

		Object Identifier184_tree=null;
		Object char_literal185_tree=null;
		Object char_literal186_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:340:5: ( Identifier ( '[' ']' )* )
			// /home/tony/Downloads/JavaJava.g:340:9: Identifier ( '[' ']' )*
			{
			root_0 = (Object)adaptor.nil();


			Identifier184=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaratorId1960); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier184_tree = (Object)adaptor.create(Identifier184);
			adaptor.addChild(root_0, Identifier184_tree);
			}

			if ( state.backtracking==0 ) {if(!inMethod) 
			                       {
			                       	 identcount++;
			                         //id(new Symbol((Identifier184!=null?Identifier184.getText():null),PrimitiveType, className)); 
			                         /*JavaMetrics.ssc.push(new Symbol((Identifier184!=null?Identifier184.getText():null),"unknown", className));*/ 
			                        }
			                      else if(inMethod) {
						 identcount++;
			//                       		id(new Symbol((Identifier184!=null?Identifier184.getText():null),PrimitiveType, methodName)); 
			                         	/*JavaMetrics.ssm.push(new Symbol((Identifier184!=null?Identifier184.getText():null),"unknown", methodName)); */
			                                         
			                      }    
			                    }
			// /home/tony/Downloads/JavaJava.g:352:23: ( '[' ']' )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==55) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:352:24: '[' ']'
					{
					char_literal185=(Token)match(input,55,FOLLOW_55_in_variableDeclaratorId1966); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal185_tree = (Object)adaptor.create(char_literal185);
					adaptor.addChild(root_0, char_literal185_tree);
					}

					if ( state.backtracking==0 ) {s("[");}
					char_literal186=(Token)match(input,56,FOLLOW_56_in_variableDeclaratorId1969); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal186_tree = (Object)adaptor.create(char_literal186);
					adaptor.addChild(root_0, char_literal186_tree);
					}

					if ( state.backtracking==0 ) {s("]");}
					}
					break;

				default :
					break loop61;
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
			if ( state.backtracking>0 ) { memoize(input, 47, variableDeclaratorId_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:355:1: variableInitializer : ( arrayInitializer | expression );
	public final JavaJavaParser.variableInitializer_return variableInitializer() throws RecognitionException {
		JavaJavaParser.variableInitializer_return retval = new JavaJavaParser.variableInitializer_return();
		retval.start = input.LT(1);
		int variableInitializer_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope arrayInitializer187 =null;
		ParserRuleReturnScope expression188 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:356:5: ( arrayInitializer | expression )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==108) ) {
				alt62=1;
			}
			else if ( ((LA62_0 >= CharacterLiteral && LA62_0 <= DecimalLiteral)||LA62_0==FloatingPointLiteral||(LA62_0 >= HexLiteral && LA62_0 <= Identifier)||(LA62_0 >= OctalLiteral && LA62_0 <= StringLiteral)||LA62_0==25||LA62_0==32||(LA62_0 >= 36 && LA62_0 <= 37)||(LA62_0 >= 40 && LA62_0 <= 41)||LA62_0==60||LA62_0==62||LA62_0==65||LA62_0==70||LA62_0==73||LA62_0==76||LA62_0==82||LA62_0==84||(LA62_0 >= 86 && LA62_0 <= 87)||LA62_0==93||LA62_0==96||LA62_0==99||LA62_0==103||LA62_0==105||LA62_0==113) ) {
				alt62=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:356:9: arrayInitializer
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1992);
					arrayInitializer187=arrayInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer187.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:357:9: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_variableInitializer2002);
					expression188=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression188.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 48, variableInitializer_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:360:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' ;
	public final JavaJavaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
		JavaJavaParser.arrayInitializer_return retval = new JavaJavaParser.arrayInitializer_return();
		retval.start = input.LT(1);
		int arrayInitializer_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal189=null;
		Token char_literal191=null;
		Token char_literal193=null;
		Token char_literal194=null;
		ParserRuleReturnScope variableInitializer190 =null;
		ParserRuleReturnScope variableInitializer192 =null;

		Object char_literal189_tree=null;
		Object char_literal191_tree=null;
		Object char_literal193_tree=null;
		Object char_literal194_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:361:5: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' )
			// /home/tony/Downloads/JavaJava.g:361:9: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal189=(Token)match(input,108,FOLLOW_108_in_arrayInitializer2029); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal189_tree = (Object)adaptor.create(char_literal189);
			adaptor.addChild(root_0, char_literal189_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /home/tony/Downloads/JavaJava.g:361:22: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( ((LA65_0 >= CharacterLiteral && LA65_0 <= DecimalLiteral)||LA65_0==FloatingPointLiteral||(LA65_0 >= HexLiteral && LA65_0 <= Identifier)||(LA65_0 >= OctalLiteral && LA65_0 <= StringLiteral)||LA65_0==25||LA65_0==32||(LA65_0 >= 36 && LA65_0 <= 37)||(LA65_0 >= 40 && LA65_0 <= 41)||LA65_0==60||LA65_0==62||LA65_0==65||LA65_0==70||LA65_0==73||LA65_0==76||LA65_0==82||LA65_0==84||(LA65_0 >= 86 && LA65_0 <= 87)||LA65_0==93||LA65_0==96||LA65_0==99||LA65_0==103||LA65_0==105||LA65_0==108||LA65_0==113) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:361:23: variableInitializer ( ',' variableInitializer )* ( ',' )?
					{
					pushFollow(FOLLOW_variableInitializer_in_arrayInitializer2033);
					variableInitializer190=variableInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer190.getTree());

					// /home/tony/Downloads/JavaJava.g:361:43: ( ',' variableInitializer )*
					loop63:
					while (true) {
						int alt63=2;
						int LA63_0 = input.LA(1);
						if ( (LA63_0==39) ) {
							int LA63_1 = input.LA(2);
							if ( ((LA63_1 >= CharacterLiteral && LA63_1 <= DecimalLiteral)||LA63_1==FloatingPointLiteral||(LA63_1 >= HexLiteral && LA63_1 <= Identifier)||(LA63_1 >= OctalLiteral && LA63_1 <= StringLiteral)||LA63_1==25||LA63_1==32||(LA63_1 >= 36 && LA63_1 <= 37)||(LA63_1 >= 40 && LA63_1 <= 41)||LA63_1==60||LA63_1==62||LA63_1==65||LA63_1==70||LA63_1==73||LA63_1==76||LA63_1==82||LA63_1==84||(LA63_1 >= 86 && LA63_1 <= 87)||LA63_1==93||LA63_1==96||LA63_1==99||LA63_1==103||LA63_1==105||LA63_1==108||LA63_1==113) ) {
								alt63=1;
							}

						}

						switch (alt63) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:361:44: ',' variableInitializer
							{
							char_literal191=(Token)match(input,39,FOLLOW_39_in_arrayInitializer2036); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal191_tree = (Object)adaptor.create(char_literal191);
							adaptor.addChild(root_0, char_literal191_tree);
							}

							if ( state.backtracking==0 ) {s(",");}
							pushFollow(FOLLOW_variableInitializer_in_arrayInitializer2040);
							variableInitializer192=variableInitializer();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer192.getTree());

							}
							break;

						default :
							break loop63;
						}
					}

					// /home/tony/Downloads/JavaJava.g:361:80: ( ',' )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==39) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:361:81: ','
							{
							char_literal193=(Token)match(input,39,FOLLOW_39_in_arrayInitializer2045); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal193_tree = (Object)adaptor.create(char_literal193);
							adaptor.addChild(root_0, char_literal193_tree);
							}

							}
							break;

					}

					}
					break;

			}

			char_literal194=(Token)match(input,112,FOLLOW_112_in_arrayInitializer2052); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal194_tree = (Object)adaptor.create(char_literal194);
			adaptor.addChild(root_0, char_literal194_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 49, arrayInitializer_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:364:1: modifier : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' );
	public final JavaJavaParser.modifier_return modifier() throws RecognitionException {
		JavaJavaParser.modifier_return retval = new JavaJavaParser.modifier_return();
		retval.start = input.LT(1);
		int modifier_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal196=null;
		Token string_literal197=null;
		Token string_literal198=null;
		Token string_literal199=null;
		Token string_literal200=null;
		Token string_literal201=null;
		Token string_literal202=null;
		Token string_literal203=null;
		Token string_literal204=null;
		Token string_literal205=null;
		Token string_literal206=null;
		ParserRuleReturnScope annotation195 =null;

		Object string_literal196_tree=null;
		Object string_literal197_tree=null;
		Object string_literal198_tree=null;
		Object string_literal199_tree=null;
		Object string_literal200_tree=null;
		Object string_literal201_tree=null;
		Object string_literal202_tree=null;
		Object string_literal203_tree=null;
		Object string_literal204_tree=null;
		Object string_literal205_tree=null;
		Object string_literal206_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:365:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )
			int alt66=12;
			switch ( input.LA(1) ) {
			case 54:
				{
				alt66=1;
				}
				break;
			case 91:
				{
				alt66=2;
				}
				break;
			case 90:
				{
				alt66=3;
				}
				break;
			case 89:
				{
				alt66=4;
				}
				break;
			case 94:
				{
				alt66=5;
				}
				break;
			case 59:
				{
				alt66=6;
				}
				break;
			case 74:
				{
				alt66=7;
				}
				break;
			case 85:
				{
				alt66=8;
				}
				break;
			case 98:
				{
				alt66=9;
				}
				break;
			case 102:
				{
				alt66=10;
				}
				break;
			case 106:
				{
				alt66=11;
				}
				break;
			case 95:
				{
				alt66=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:365:9: annotation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotation_in_modifier2072);
					annotation195=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation195.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:366:9: 'public'
					{
					root_0 = (Object)adaptor.nil();


					string_literal196=(Token)match(input,91,FOLLOW_91_in_modifier2082); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal196_tree = (Object)adaptor.create(string_literal196);
					adaptor.addChild(root_0, string_literal196_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("public");}
					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:367:9: 'protected'
					{
					root_0 = (Object)adaptor.nil();


					string_literal197=(Token)match(input,90,FOLLOW_90_in_modifier2095); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal197_tree = (Object)adaptor.create(string_literal197);
					adaptor.addChild(root_0, string_literal197_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("protected");}
					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:368:9: 'private'
					{
					root_0 = (Object)adaptor.nil();


					string_literal198=(Token)match(input,89,FOLLOW_89_in_modifier2107); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal198_tree = (Object)adaptor.create(string_literal198);
					adaptor.addChild(root_0, string_literal198_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++; JavaMetrics.uniqueKeywords.add("private");}
					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:369:9: 'static'
					{
					root_0 = (Object)adaptor.nil();


					string_literal199=(Token)match(input,94,FOLLOW_94_in_modifier2119); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal199_tree = (Object)adaptor.create(string_literal199);
					adaptor.addChild(root_0, string_literal199_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++; JavaMetrics.uniqueKeywords.add("static");}
					}
					break;
				case 6 :
					// /home/tony/Downloads/JavaJava.g:370:9: 'abstract'
					{
					root_0 = (Object)adaptor.nil();


					string_literal200=(Token)match(input,59,FOLLOW_59_in_modifier2132); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal200_tree = (Object)adaptor.create(string_literal200);
					adaptor.addChild(root_0, string_literal200_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("abstract");}
					}
					break;
				case 7 :
					// /home/tony/Downloads/JavaJava.g:371:9: 'final'
					{
					root_0 = (Object)adaptor.nil();


					string_literal201=(Token)match(input,74,FOLLOW_74_in_modifier2144); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal201_tree = (Object)adaptor.create(string_literal201);
					adaptor.addChild(root_0, string_literal201_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("final");}
					}
					break;
				case 8 :
					// /home/tony/Downloads/JavaJava.g:372:9: 'native'
					{
					root_0 = (Object)adaptor.nil();


					string_literal202=(Token)match(input,85,FOLLOW_85_in_modifier2157); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal202_tree = (Object)adaptor.create(string_literal202);
					adaptor.addChild(root_0, string_literal202_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("native");}
					}
					break;
				case 9 :
					// /home/tony/Downloads/JavaJava.g:373:9: 'synchronized'
					{
					root_0 = (Object)adaptor.nil();


					string_literal203=(Token)match(input,98,FOLLOW_98_in_modifier2172); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal203_tree = (Object)adaptor.create(string_literal203);
					adaptor.addChild(root_0, string_literal203_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("synchronized");}
					}
					break;
				case 10 :
					// /home/tony/Downloads/JavaJava.g:374:9: 'transient'
					{
					root_0 = (Object)adaptor.nil();


					string_literal204=(Token)match(input,102,FOLLOW_102_in_modifier2184); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal204_tree = (Object)adaptor.create(string_literal204);
					adaptor.addChild(root_0, string_literal204_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("transient");}
					}
					break;
				case 11 :
					// /home/tony/Downloads/JavaJava.g:375:9: 'volatile'
					{
					root_0 = (Object)adaptor.nil();


					string_literal205=(Token)match(input,106,FOLLOW_106_in_modifier2198); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal205_tree = (Object)adaptor.create(string_literal205);
					adaptor.addChild(root_0, string_literal205_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("volatile");}
					}
					break;
				case 12 :
					// /home/tony/Downloads/JavaJava.g:376:9: 'strictfp'
					{
					root_0 = (Object)adaptor.nil();


					string_literal206=(Token)match(input,95,FOLLOW_95_in_modifier2211); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal206_tree = (Object)adaptor.create(string_literal206);
					adaptor.addChild(root_0, string_literal206_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 50, modifier_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:379:1: packageOrTypeName : qualifiedName ;
	public final JavaJavaParser.packageOrTypeName_return packageOrTypeName() throws RecognitionException {
		JavaJavaParser.packageOrTypeName_return retval = new JavaJavaParser.packageOrTypeName_return();
		retval.start = input.LT(1);
		int packageOrTypeName_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope qualifiedName207 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:380:5: ( qualifiedName )
			// /home/tony/Downloads/JavaJava.g:380:9: qualifiedName
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualifiedName_in_packageOrTypeName2233);
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
			if ( state.backtracking>0 ) { memoize(input, 51, packageOrTypeName_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:383:1: enumConstantName : Identifier ;
	public final JavaJavaParser.enumConstantName_return enumConstantName() throws RecognitionException {
		JavaJavaParser.enumConstantName_return retval = new JavaJavaParser.enumConstantName_return();
		retval.start = input.LT(1);
		int enumConstantName_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier208=null;

		Object Identifier208_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:384:5: ( Identifier )
			// /home/tony/Downloads/JavaJava.g:384:9: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier208=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumConstantName2252); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier208_tree = (Object)adaptor.create(Identifier208);
			adaptor.addChild(root_0, Identifier208_tree);
			}

			if ( state.backtracking==0 ) {if(primitive) id((Identifier208!=null?Identifier208.getText():null));}
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
			if ( state.backtracking>0 ) { memoize(input, 52, enumConstantName_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:387:1: typeName : qualifiedName ;
	public final JavaJavaParser.typeName_return typeName() throws RecognitionException {
		JavaJavaParser.typeName_return retval = new JavaJavaParser.typeName_return();
		retval.start = input.LT(1);
		int typeName_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope qualifiedName209 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:388:5: ( qualifiedName )
			// /home/tony/Downloads/JavaJava.g:388:9: qualifiedName
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualifiedName_in_typeName2273);
			qualifiedName209=qualifiedName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName209.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 53, typeName_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:391:1: type : ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* );
	public final JavaJavaParser.type_return type() throws RecognitionException {
		JavaJavaParser.type_return retval = new JavaJavaParser.type_return();
		retval.start = input.LT(1);
		int type_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal211=null;
		Token char_literal212=null;
		Token char_literal214=null;
		Token char_literal215=null;
		ParserRuleReturnScope classOrInterfaceType210 =null;
		ParserRuleReturnScope primitiveType213 =null;

		Object char_literal211_tree=null;
		Object char_literal212_tree=null;
		Object char_literal214_tree=null;
		Object char_literal215_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:392:2: ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==Identifier) ) {
				alt69=1;
			}
			else if ( (LA69_0==60||LA69_0==62||LA69_0==65||LA69_0==70||LA69_0==76||LA69_0==82||LA69_0==84||LA69_0==93) ) {
				alt69=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:392:4: classOrInterfaceType ( '[' ']' )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classOrInterfaceType_in_type2287);
					classOrInterfaceType210=classOrInterfaceType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceType210.getTree());

					// /home/tony/Downloads/JavaJava.g:392:25: ( '[' ']' )*
					loop67:
					while (true) {
						int alt67=2;
						int LA67_0 = input.LA(1);
						if ( (LA67_0==55) ) {
							alt67=1;
						}

						switch (alt67) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:392:26: '[' ']'
							{
							char_literal211=(Token)match(input,55,FOLLOW_55_in_type2290); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal211_tree = (Object)adaptor.create(char_literal211);
							adaptor.addChild(root_0, char_literal211_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal212=(Token)match(input,56,FOLLOW_56_in_type2294); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal212_tree = (Object)adaptor.create(char_literal212);
							adaptor.addChild(root_0, char_literal212_tree);
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
				case 2 :
					// /home/tony/Downloads/JavaJava.g:393:4: primitiveType ( '[' ']' )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveType_in_type2304);
					primitiveType213=primitiveType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType213.getTree());

					if ( state.backtracking==0 ) {primitive=true;}
					// /home/tony/Downloads/JavaJava.g:393:35: ( '[' ']' )*
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==55) ) {
							alt68=1;
						}

						switch (alt68) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:393:36: '[' ']'
							{
							char_literal214=(Token)match(input,55,FOLLOW_55_in_type2308); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal214_tree = (Object)adaptor.create(char_literal214);
							adaptor.addChild(root_0, char_literal214_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal215=(Token)match(input,56,FOLLOW_56_in_type2312); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal215_tree = (Object)adaptor.create(char_literal215);
							adaptor.addChild(root_0, char_literal215_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							break loop68;
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
			if ( state.backtracking>0 ) { memoize(input, 54, type_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:398:1: classOrInterfaceType : I7= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* ;
	public final JavaJavaParser.classOrInterfaceType_return classOrInterfaceType() throws RecognitionException {
		JavaJavaParser.classOrInterfaceType_return retval = new JavaJavaParser.classOrInterfaceType_return();
		retval.start = input.LT(1);
		int classOrInterfaceType_StartIndex = input.index();

		Object root_0 = null;

		Token I7=null;
		Token char_literal217=null;
		Token Identifier218=null;
		ParserRuleReturnScope typeArguments216 =null;
		ParserRuleReturnScope typeArguments219 =null;

		Object I7_tree=null;
		Object char_literal217_tree=null;
		Object Identifier218_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:399:2: (I7= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* )
			// /home/tony/Downloads/JavaJava.g:399:4: I7= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )*
			{
			root_0 = (Object)adaptor.nil();


			I7=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType2331); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			I7_tree = (Object)adaptor.create(I7);
			adaptor.addChild(root_0, I7_tree);
			}

			if ( state.backtracking==0 ) { id((I7!=null?I7.getText():null));}
			// /home/tony/Downloads/JavaJava.g:399:35: ( typeArguments )?
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
					// /home/tony/Downloads/JavaJava.g:399:35: typeArguments
					{
					pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2335);
					typeArguments216=typeArguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArguments216.getTree());

					}
					break;

			}

			// /home/tony/Downloads/JavaJava.g:399:50: ( '.' Identifier ( typeArguments )? )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==43) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:399:51: '.' Identifier ( typeArguments )?
					{
					char_literal217=(Token)match(input,43,FOLLOW_43_in_classOrInterfaceType2339); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal217_tree = (Object)adaptor.create(char_literal217);
					adaptor.addChild(root_0, char_literal217_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					Identifier218=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType2343); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier218_tree = (Object)adaptor.create(Identifier218);
					adaptor.addChild(root_0, Identifier218_tree);
					}

					// /home/tony/Downloads/JavaJava.g:399:76: ( typeArguments )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==49) ) {
						int LA71_1 = input.LA(2);
						if ( (LA71_1==Identifier||LA71_1==53||LA71_1==60||LA71_1==62||LA71_1==65||LA71_1==70||LA71_1==76||LA71_1==82||LA71_1==84||LA71_1==93) ) {
							alt71=1;
						}
					}
					switch (alt71) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:399:76: typeArguments
							{
							pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2345);
							typeArguments219=typeArguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArguments219.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop72;
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
			if ( state.backtracking>0 ) { memoize(input, 55, classOrInterfaceType_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:402:1: primitiveType : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
	public final JavaJavaParser.primitiveType_return primitiveType() throws RecognitionException {
		JavaJavaParser.primitiveType_return retval = new JavaJavaParser.primitiveType_return();
		retval.start = input.LT(1);
		int primitiveType_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal220=null;
		Token string_literal221=null;
		Token string_literal222=null;
		Token string_literal223=null;
		Token string_literal224=null;
		Token string_literal225=null;
		Token string_literal226=null;
		Token string_literal227=null;

		Object string_literal220_tree=null;
		Object string_literal221_tree=null;
		Object string_literal222_tree=null;
		Object string_literal223_tree=null;
		Object string_literal224_tree=null;
		Object string_literal225_tree=null;
		Object string_literal226_tree=null;
		Object string_literal227_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:403:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
			int alt73=8;
			switch ( input.LA(1) ) {
			case 60:
				{
				alt73=1;
				}
				break;
			case 65:
				{
				alt73=2;
				}
				break;
			case 62:
				{
				alt73=3;
				}
				break;
			case 93:
				{
				alt73=4;
				}
				break;
			case 82:
				{
				alt73=5;
				}
				break;
			case 84:
				{
				alt73=6;
				}
				break;
			case 76:
				{
				alt73=7;
				}
				break;
			case 70:
				{
				alt73=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:403:9: 'boolean'
					{
					root_0 = (Object)adaptor.nil();


					string_literal220=(Token)match(input,60,FOLLOW_60_in_primitiveType2366); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal220_tree = (Object)adaptor.create(string_literal220);
					adaptor.addChild(root_0, string_literal220_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++; PrimitiveType = "boolean"; JavaMetrics.uniqueKeywords.add("boolean");}
					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:404:9: 'char'
					{
					root_0 = (Object)adaptor.nil();


					string_literal221=(Token)match(input,65,FOLLOW_65_in_primitiveType2378); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal221_tree = (Object)adaptor.create(string_literal221);
					adaptor.addChild(root_0, string_literal221_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "char";  JavaMetrics.uniqueKeywords.add("char");}
					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:405:9: 'byte'
					{
					root_0 = (Object)adaptor.nil();


					string_literal222=(Token)match(input,62,FOLLOW_62_in_primitiveType2391); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal222_tree = (Object)adaptor.create(string_literal222);
					adaptor.addChild(root_0, string_literal222_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "byte"; JavaMetrics.uniqueKeywords.add("byte");}
					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:406:9: 'short'
					{
					root_0 = (Object)adaptor.nil();


					string_literal223=(Token)match(input,93,FOLLOW_93_in_primitiveType2404); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal223_tree = (Object)adaptor.create(string_literal223);
					adaptor.addChild(root_0, string_literal223_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "short"; JavaMetrics.uniqueKeywords.add("short");}
					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:407:9: 'int'
					{
					root_0 = (Object)adaptor.nil();


					string_literal224=(Token)match(input,82,FOLLOW_82_in_primitiveType2417); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal224_tree = (Object)adaptor.create(string_literal224);
					adaptor.addChild(root_0, string_literal224_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "int"; JavaMetrics.uniqueKeywords.add("int");}
					}
					break;
				case 6 :
					// /home/tony/Downloads/JavaJava.g:408:9: 'long'
					{
					root_0 = (Object)adaptor.nil();


					string_literal225=(Token)match(input,84,FOLLOW_84_in_primitiveType2431); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal225_tree = (Object)adaptor.create(string_literal225);
					adaptor.addChild(root_0, string_literal225_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "long"; JavaMetrics.uniqueKeywords.add("long");}
					}
					break;
				case 7 :
					// /home/tony/Downloads/JavaJava.g:409:9: 'float'
					{
					root_0 = (Object)adaptor.nil();


					string_literal226=(Token)match(input,76,FOLLOW_76_in_primitiveType2444); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal226_tree = (Object)adaptor.create(string_literal226);
					adaptor.addChild(root_0, string_literal226_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;  PrimitiveType = "float"; JavaMetrics.uniqueKeywords.add("float");}
					}
					break;
				case 8 :
					// /home/tony/Downloads/JavaJava.g:410:9: 'double'
					{
					root_0 = (Object)adaptor.nil();


					string_literal227=(Token)match(input,70,FOLLOW_70_in_primitiveType2457); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal227_tree = (Object)adaptor.create(string_literal227);
					adaptor.addChild(root_0, string_literal227_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 56, primitiveType_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:413:1: variableModifier : ( 'final' | annotation );
	public final JavaJavaParser.variableModifier_return variableModifier() throws RecognitionException {
		JavaJavaParser.variableModifier_return retval = new JavaJavaParser.variableModifier_return();
		retval.start = input.LT(1);
		int variableModifier_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal228=null;
		ParserRuleReturnScope annotation229 =null;

		Object string_literal228_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:414:5: ( 'final' | annotation )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==74) ) {
				alt74=1;
			}
			else if ( (LA74_0==54) ) {
				alt74=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:414:9: 'final'
					{
					root_0 = (Object)adaptor.nil();


					string_literal228=(Token)match(input,74,FOLLOW_74_in_variableModifier2479); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal228_tree = (Object)adaptor.create(string_literal228);
					adaptor.addChild(root_0, string_literal228_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("final");}
					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:415:9: annotation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotation_in_variableModifier2490);
					annotation229=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation229.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 57, variableModifier_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:418:1: typeArguments : '<' typeArgument ( ',' typeArgument )* '>' ;
	public final JavaJavaParser.typeArguments_return typeArguments() throws RecognitionException {
		JavaJavaParser.typeArguments_return retval = new JavaJavaParser.typeArguments_return();
		retval.start = input.LT(1);
		int typeArguments_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal230=null;
		Token char_literal232=null;
		Token char_literal234=null;
		ParserRuleReturnScope typeArgument231 =null;
		ParserRuleReturnScope typeArgument233 =null;

		Object char_literal230_tree=null;
		Object char_literal232_tree=null;
		Object char_literal234_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:419:5: ( '<' typeArgument ( ',' typeArgument )* '>' )
			// /home/tony/Downloads/JavaJava.g:419:9: '<' typeArgument ( ',' typeArgument )* '>'
			{
			root_0 = (Object)adaptor.nil();


			char_literal230=(Token)match(input,49,FOLLOW_49_in_typeArguments2509); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal230_tree = (Object)adaptor.create(char_literal230);
			adaptor.addChild(root_0, char_literal230_tree);
			}

			if ( state.backtracking==0 ) {s("<");}
			pushFollow(FOLLOW_typeArgument_in_typeArguments2513);
			typeArgument231=typeArgument();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArgument231.getTree());

			// /home/tony/Downloads/JavaJava.g:419:36: ( ',' typeArgument )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==39) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:419:37: ',' typeArgument
					{
					char_literal232=(Token)match(input,39,FOLLOW_39_in_typeArguments2516); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal232_tree = (Object)adaptor.create(char_literal232);
					adaptor.addChild(root_0, char_literal232_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_typeArgument_in_typeArguments2519);
					typeArgument233=typeArgument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArgument233.getTree());

					}
					break;

				default :
					break loop75;
				}
			}

			char_literal234=(Token)match(input,52,FOLLOW_52_in_typeArguments2523); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal234_tree = (Object)adaptor.create(char_literal234);
			adaptor.addChild(root_0, char_literal234_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 58, typeArguments_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:422:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );
	public final JavaJavaParser.typeArgument_return typeArgument() throws RecognitionException {
		JavaJavaParser.typeArgument_return retval = new JavaJavaParser.typeArgument_return();
		retval.start = input.LT(1);
		int typeArgument_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal236=null;
		Token string_literal237=null;
		Token string_literal238=null;
		ParserRuleReturnScope type235 =null;
		ParserRuleReturnScope type239 =null;

		Object char_literal236_tree=null;
		Object string_literal237_tree=null;
		Object string_literal238_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:423:5: ( type | '?' ( ( 'extends' | 'super' ) type )? )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==Identifier||LA78_0==60||LA78_0==62||LA78_0==65||LA78_0==70||LA78_0==76||LA78_0==82||LA78_0==84||LA78_0==93) ) {
				alt78=1;
			}
			else if ( (LA78_0==53) ) {
				alt78=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:423:9: type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_in_typeArgument2547);
					type235=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type235.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:424:9: '?' ( ( 'extends' | 'super' ) type )?
					{
					root_0 = (Object)adaptor.nil();


					char_literal236=(Token)match(input,53,FOLLOW_53_in_typeArgument2557); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal236_tree = (Object)adaptor.create(char_literal236);
					adaptor.addChild(root_0, char_literal236_tree);
					}

					// /home/tony/Downloads/JavaJava.g:424:13: ( ( 'extends' | 'super' ) type )?
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( (LA77_0==72||LA77_0==96) ) {
						alt77=1;
					}
					switch (alt77) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:424:14: ( 'extends' | 'super' ) type
							{
							// /home/tony/Downloads/JavaJava.g:424:14: ( 'extends' | 'super' )
							int alt76=2;
							int LA76_0 = input.LA(1);
							if ( (LA76_0==72) ) {
								alt76=1;
							}
							else if ( (LA76_0==96) ) {
								alt76=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 76, 0, input);
								throw nvae;
							}

							switch (alt76) {
								case 1 :
									// /home/tony/Downloads/JavaJava.g:424:15: 'extends'
									{
									string_literal237=(Token)match(input,72,FOLLOW_72_in_typeArgument2561); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal237_tree = (Object)adaptor.create(string_literal237);
									adaptor.addChild(root_0, string_literal237_tree);
									}

									if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("extends");}
									}
									break;
								case 2 :
									// /home/tony/Downloads/JavaJava.g:424:86: 'super'
									{
									string_literal238=(Token)match(input,96,FOLLOW_96_in_typeArgument2566); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal238_tree = (Object)adaptor.create(string_literal238);
									adaptor.addChild(root_0, string_literal238_tree);
									}

									if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
									}
									break;

							}

							pushFollow(FOLLOW_type_in_typeArgument2571);
							type239=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type239.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 59, typeArgument_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:427:1: qualifiedNameList : qualifiedName ( ',' qualifiedName )* ;
	public final JavaJavaParser.qualifiedNameList_return qualifiedNameList() throws RecognitionException {
		JavaJavaParser.qualifiedNameList_return retval = new JavaJavaParser.qualifiedNameList_return();
		retval.start = input.LT(1);
		int qualifiedNameList_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal241=null;
		ParserRuleReturnScope qualifiedName240 =null;
		ParserRuleReturnScope qualifiedName242 =null;

		Object char_literal241_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:428:5: ( qualifiedName ( ',' qualifiedName )* )
			// /home/tony/Downloads/JavaJava.g:428:9: qualifiedName ( ',' qualifiedName )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList2597);
			qualifiedName240=qualifiedName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName240.getTree());

			// /home/tony/Downloads/JavaJava.g:428:23: ( ',' qualifiedName )*
			loop79:
			while (true) {
				int alt79=2;
				int LA79_0 = input.LA(1);
				if ( (LA79_0==39) ) {
					alt79=1;
				}

				switch (alt79) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:428:24: ',' qualifiedName
					{
					char_literal241=(Token)match(input,39,FOLLOW_39_in_qualifiedNameList2600); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal241_tree = (Object)adaptor.create(char_literal241);
					adaptor.addChild(root_0, char_literal241_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList2604);
					qualifiedName242=qualifiedName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName242.getTree());

					}
					break;

				default :
					break loop79;
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
			if ( state.backtracking>0 ) { memoize(input, 60, qualifiedNameList_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:431:1: formalParameters : '(' ( formalParameterDecls )? ')' ;
	public final JavaJavaParser.formalParameters_return formalParameters() throws RecognitionException {
		JavaJavaParser.formalParameters_return retval = new JavaJavaParser.formalParameters_return();
		retval.start = input.LT(1);
		int formalParameters_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal243=null;
		Token char_literal245=null;
		ParserRuleReturnScope formalParameterDecls244 =null;

		Object char_literal243_tree=null;
		Object char_literal245_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:432:5: ( '(' ( formalParameterDecls )? ')' )
			// /home/tony/Downloads/JavaJava.g:432:9: '(' ( formalParameterDecls )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal243=(Token)match(input,32,FOLLOW_32_in_formalParameters2625); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal243_tree = (Object)adaptor.create(char_literal243);
			adaptor.addChild(root_0, char_literal243_tree);
			}

			if ( state.backtracking==0 ) {s("(");}
			// /home/tony/Downloads/JavaJava.g:432:23: ( formalParameterDecls )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==Identifier||LA80_0==54||LA80_0==60||LA80_0==62||LA80_0==65||LA80_0==70||LA80_0==74||LA80_0==76||LA80_0==82||LA80_0==84||LA80_0==93) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:432:23: formalParameterDecls
					{
					pushFollow(FOLLOW_formalParameterDecls_in_formalParameters2629);
					formalParameterDecls244=formalParameterDecls();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDecls244.getTree());

					}
					break;

			}

			char_literal245=(Token)match(input,33,FOLLOW_33_in_formalParameters2632); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal245_tree = (Object)adaptor.create(char_literal245);
			adaptor.addChild(root_0, char_literal245_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 61, formalParameters_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:435:1: formalParameterDecls : variableModifiers type formalParameterDeclsRest ;
	public final JavaJavaParser.formalParameterDecls_return formalParameterDecls() throws RecognitionException {
		JavaJavaParser.formalParameterDecls_return retval = new JavaJavaParser.formalParameterDecls_return();
		retval.start = input.LT(1);
		int formalParameterDecls_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope variableModifiers246 =null;
		ParserRuleReturnScope type247 =null;
		ParserRuleReturnScope formalParameterDeclsRest248 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:436:5: ( variableModifiers type formalParameterDeclsRest )
			// /home/tony/Downloads/JavaJava.g:436:9: variableModifiers type formalParameterDeclsRest
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableModifiers_in_formalParameterDecls2658);
			variableModifiers246=variableModifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers246.getTree());

			pushFollow(FOLLOW_type_in_formalParameterDecls2660);
			type247=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type247.getTree());

			pushFollow(FOLLOW_formalParameterDeclsRest_in_formalParameterDecls2662);
			formalParameterDeclsRest248=formalParameterDeclsRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDeclsRest248.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 62, formalParameterDecls_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:439:1: formalParameterDeclsRest : ( variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId );
	public final JavaJavaParser.formalParameterDeclsRest_return formalParameterDeclsRest() throws RecognitionException {
		JavaJavaParser.formalParameterDeclsRest_return retval = new JavaJavaParser.formalParameterDeclsRest_return();
		retval.start = input.LT(1);
		int formalParameterDeclsRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal250=null;
		Token string_literal252=null;
		ParserRuleReturnScope variableDeclaratorId249 =null;
		ParserRuleReturnScope formalParameterDecls251 =null;
		ParserRuleReturnScope variableDeclaratorId253 =null;

		Object char_literal250_tree=null;
		Object string_literal252_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:440:5: ( variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId )
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==Identifier) ) {
				alt82=1;
			}
			else if ( (LA82_0==44) ) {
				alt82=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:440:9: variableDeclaratorId ( ',' formalParameterDecls )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2687);
					variableDeclaratorId249=variableDeclaratorId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId249.getTree());

					// /home/tony/Downloads/JavaJava.g:440:30: ( ',' formalParameterDecls )?
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==39) ) {
						alt81=1;
					}
					switch (alt81) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:440:31: ',' formalParameterDecls
							{
							char_literal250=(Token)match(input,39,FOLLOW_39_in_formalParameterDeclsRest2690); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal250_tree = (Object)adaptor.create(char_literal250);
							adaptor.addChild(root_0, char_literal250_tree);
							}

							if ( state.backtracking==0 ) {s(",");}
							pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDeclsRest2694);
							formalParameterDecls251=formalParameterDecls();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDecls251.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:441:9: '...' variableDeclaratorId
					{
					root_0 = (Object)adaptor.nil();


					string_literal252=(Token)match(input,44,FOLLOW_44_in_formalParameterDeclsRest2706); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal252_tree = (Object)adaptor.create(string_literal252);
					adaptor.addChild(root_0, string_literal252_tree);
					}

					pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2708);
					variableDeclaratorId253=variableDeclaratorId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId253.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 63, formalParameterDeclsRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:444:1: methodBody : block ;
	public final JavaJavaParser.methodBody_return methodBody() throws RecognitionException {
		JavaJavaParser.methodBody_return retval = new JavaJavaParser.methodBody_return();
		retval.start = input.LT(1);
		int methodBody_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope block254 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:445:5: ( block )
			// /home/tony/Downloads/JavaJava.g:445:8: block
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_block_in_methodBody2730);
			block254=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block254.getTree());

			if ( state.backtracking==0 ) {System.out.println("McCabe for " + methodName + " = " + (mmc+1)); JavaMetrics.mccabeValues.add(methodName + " = " + (mmc+1));mmc = 0;
			    		JavaMetrics.methodNames.add(methodName);}
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
			if ( state.backtracking>0 ) { memoize(input, 64, methodBody_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:449:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' ;
	public final JavaJavaParser.constructorBody_return constructorBody() throws RecognitionException {
		JavaJavaParser.constructorBody_return retval = new JavaJavaParser.constructorBody_return();
		retval.start = input.LT(1);
		int constructorBody_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal255=null;
		Token char_literal258=null;
		ParserRuleReturnScope explicitConstructorInvocation256 =null;
		ParserRuleReturnScope blockStatement257 =null;

		Object char_literal255_tree=null;
		Object char_literal258_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:450:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
			// /home/tony/Downloads/JavaJava.g:450:9: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal255=(Token)match(input,108,FOLLOW_108_in_constructorBody2751); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal255_tree = (Object)adaptor.create(char_literal255);
			adaptor.addChild(root_0, char_literal255_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /home/tony/Downloads/JavaJava.g:450:22: ( explicitConstructorInvocation )?
			int alt83=2;
			switch ( input.LA(1) ) {
				case 49:
					{
					alt83=1;
					}
					break;
				case 99:
					{
					int LA83_2 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 96:
					{
					int LA83_3 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 32:
					{
					int LA83_4 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case HexLiteral:
					{
					int LA83_5 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case OctalLiteral:
					{
					int LA83_6 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case DecimalLiteral:
					{
					int LA83_7 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case FloatingPointLiteral:
					{
					int LA83_8 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case CharacterLiteral:
					{
					int LA83_9 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case StringLiteral:
					{
					int LA83_10 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 103:
					{
					int LA83_11 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 73:
					{
					int LA83_12 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 87:
					{
					int LA83_13 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 86:
					{
					int LA83_14 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case Identifier:
					{
					int LA83_15 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 60:
					{
					int LA83_16 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 65:
					{
					int LA83_17 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 62:
					{
					int LA83_18 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 93:
					{
					int LA83_19 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 82:
					{
					int LA83_20 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 84:
					{
					int LA83_21 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 76:
					{
					int LA83_22 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 70:
					{
					int LA83_23 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
				case 105:
					{
					int LA83_24 = input.LA(2);
					if ( (synpred113_JavaJava()) ) {
						alt83=1;
					}
					}
					break;
			}
			switch (alt83) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:450:22: explicitConstructorInvocation
					{
					pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody2754);
					explicitConstructorInvocation256=explicitConstructorInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitConstructorInvocation256.getTree());

					}
					break;

			}

			// /home/tony/Downloads/JavaJava.g:450:53: ( blockStatement )*
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( (LA84_0==ASSERT||(LA84_0 >= CharacterLiteral && LA84_0 <= ENUM)||LA84_0==FloatingPointLiteral||(LA84_0 >= HexLiteral && LA84_0 <= Identifier)||(LA84_0 >= OctalLiteral && LA84_0 <= StringLiteral)||LA84_0==25||LA84_0==32||(LA84_0 >= 36 && LA84_0 <= 37)||(LA84_0 >= 40 && LA84_0 <= 41)||LA84_0==48||LA84_0==54||(LA84_0 >= 59 && LA84_0 <= 62)||(LA84_0 >= 65 && LA84_0 <= 67)||(LA84_0 >= 69 && LA84_0 <= 70)||(LA84_0 >= 73 && LA84_0 <= 74)||(LA84_0 >= 76 && LA84_0 <= 78)||(LA84_0 >= 82 && LA84_0 <= 84)||(LA84_0 >= 86 && LA84_0 <= 87)||(LA84_0 >= 89 && LA84_0 <= 100)||(LA84_0 >= 103 && LA84_0 <= 105)||(LA84_0 >= 107 && LA84_0 <= 108)||LA84_0==113) ) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:450:53: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_constructorBody2757);
					blockStatement257=blockStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement257.getTree());

					}
					break;

				default :
					break loop84;
				}
			}

			char_literal258=(Token)match(input,112,FOLLOW_112_in_constructorBody2760); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal258_tree = (Object)adaptor.create(char_literal258);
			adaptor.addChild(root_0, char_literal258_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 65, constructorBody_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:453:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' );
	public final JavaJavaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
		JavaJavaParser.explicitConstructorInvocation_return retval = new JavaJavaParser.explicitConstructorInvocation_return();
		retval.start = input.LT(1);
		int explicitConstructorInvocation_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal260=null;
		Token string_literal261=null;
		Token char_literal263=null;
		Token char_literal265=null;
		Token string_literal267=null;
		Token char_literal269=null;
		ParserRuleReturnScope nonWildcardTypeArguments259 =null;
		ParserRuleReturnScope arguments262 =null;
		ParserRuleReturnScope primary264 =null;
		ParserRuleReturnScope nonWildcardTypeArguments266 =null;
		ParserRuleReturnScope arguments268 =null;

		Object string_literal260_tree=null;
		Object string_literal261_tree=null;
		Object char_literal263_tree=null;
		Object char_literal265_tree=null;
		Object string_literal267_tree=null;
		Object char_literal269_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:454:5: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' )
			int alt88=2;
			switch ( input.LA(1) ) {
			case 49:
				{
				alt88=1;
				}
				break;
			case 99:
				{
				int LA88_2 = input.LA(2);
				if ( (synpred117_JavaJava()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case 96:
				{
				int LA88_3 = input.LA(2);
				if ( (synpred117_JavaJava()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
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
				alt88=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}
			switch (alt88) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:454:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
					{
					root_0 = (Object)adaptor.nil();


					// /home/tony/Downloads/JavaJava.g:454:9: ( nonWildcardTypeArguments )?
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==49) ) {
						alt85=1;
					}
					switch (alt85) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:454:9: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2781);
							nonWildcardTypeArguments259=nonWildcardTypeArguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments259.getTree());

							}
							break;

					}

					// /home/tony/Downloads/JavaJava.g:454:35: ( 'this' | 'super' )
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==99) ) {
						alt86=1;
					}
					else if ( (LA86_0==96) ) {
						alt86=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 86, 0, input);
						throw nvae;
					}

					switch (alt86) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:454:36: 'this'
							{
							string_literal260=(Token)match(input,99,FOLLOW_99_in_explicitConstructorInvocation2785); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal260_tree = (Object)adaptor.create(string_literal260);
							adaptor.addChild(root_0, string_literal260_tree);
							}

							if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("this");}
							}
							break;
						case 2 :
							// /home/tony/Downloads/JavaJava.g:454:101: 'super'
							{
							string_literal261=(Token)match(input,96,FOLLOW_96_in_explicitConstructorInvocation2790); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal261_tree = (Object)adaptor.create(string_literal261);
							adaptor.addChild(root_0, string_literal261_tree);
							}

							if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
							}
							break;

					}

					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation2795);
					arguments262=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments262.getTree());

					char_literal263=(Token)match(input,48,FOLLOW_48_in_explicitConstructorInvocation2797); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal263_tree = (Object)adaptor.create(char_literal263);
					adaptor.addChild(root_0, char_literal263_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:455:9: primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primary_in_explicitConstructorInvocation2809);
					primary264=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary264.getTree());

					char_literal265=(Token)match(input,43,FOLLOW_43_in_explicitConstructorInvocation2811); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal265_tree = (Object)adaptor.create(char_literal265);
					adaptor.addChild(root_0, char_literal265_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					// /home/tony/Downloads/JavaJava.g:455:30: ( nonWildcardTypeArguments )?
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==49) ) {
						alt87=1;
					}
					switch (alt87) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:455:30: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2814);
							nonWildcardTypeArguments266=nonWildcardTypeArguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments266.getTree());

							}
							break;

					}

					string_literal267=(Token)match(input,96,FOLLOW_96_in_explicitConstructorInvocation2817); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal267_tree = (Object)adaptor.create(string_literal267);
					adaptor.addChild(root_0, string_literal267_tree);
					}

					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation2819);
					arguments268=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments268.getTree());

					char_literal269=(Token)match(input,48,FOLLOW_48_in_explicitConstructorInvocation2821); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal269_tree = (Object)adaptor.create(char_literal269);
					adaptor.addChild(root_0, char_literal269_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 66, explicitConstructorInvocation_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:459:1: qualifiedName : I1= Identifier ( '.' I2= Identifier )* ;
	public final JavaJavaParser.qualifiedName_return qualifiedName() throws RecognitionException {
		JavaJavaParser.qualifiedName_return retval = new JavaJavaParser.qualifiedName_return();
		retval.start = input.LT(1);
		int qualifiedName_StartIndex = input.index();

		Object root_0 = null;

		Token I1=null;
		Token I2=null;
		Token char_literal270=null;

		Object I1_tree=null;
		Object I2_tree=null;
		Object char_literal270_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:460:5: (I1= Identifier ( '.' I2= Identifier )* )
			// /home/tony/Downloads/JavaJava.g:460:9: I1= Identifier ( '.' I2= Identifier )*
			{
			root_0 = (Object)adaptor.nil();


			I1=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName2845); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			I1_tree = (Object)adaptor.create(I1);
			adaptor.addChild(root_0, I1_tree);
			}

			if ( state.backtracking==0 ) {myID  = (I1!=null?I1.getText():null);}
			// /home/tony/Downloads/JavaJava.g:460:43: ( '.' I2= Identifier )*
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==43) ) {
					int LA89_2 = input.LA(2);
					if ( (LA89_2==Identifier) ) {
						alt89=1;
					}

				}

				switch (alt89) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:460:44: '.' I2= Identifier
					{
					char_literal270=(Token)match(input,43,FOLLOW_43_in_qualifiedName2850); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal270_tree = (Object)adaptor.create(char_literal270);
					adaptor.addChild(root_0, char_literal270_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					I2=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName2856); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					I2_tree = (Object)adaptor.create(I2);
					adaptor.addChild(root_0, I2_tree);
					}

					if ( state.backtracking==0 ) {myID+="."+(I2!=null?I2.getText():null);}
					}
					break;

				default :
					break loop89;
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
			if ( state.backtracking>0 ) { memoize(input, 67, qualifiedName_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:463:1: literal : ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );
	public final JavaJavaParser.literal_return literal() throws RecognitionException {
		JavaJavaParser.literal_return retval = new JavaJavaParser.literal_return();
		retval.start = input.LT(1);
		int literal_StartIndex = input.index();

		Object root_0 = null;

		Token FloatingPointLiteral272=null;
		Token CharacterLiteral273=null;
		Token StringLiteral274=null;
		Token string_literal276=null;
		ParserRuleReturnScope integerLiteral271 =null;
		ParserRuleReturnScope booleanLiteral275 =null;

		Object FloatingPointLiteral272_tree=null;
		Object CharacterLiteral273_tree=null;
		Object StringLiteral274_tree=null;
		Object string_literal276_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:464:5: ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
			int alt90=6;
			switch ( input.LA(1) ) {
			case DecimalLiteral:
			case HexLiteral:
			case OctalLiteral:
				{
				alt90=1;
				}
				break;
			case FloatingPointLiteral:
				{
				alt90=2;
				}
				break;
			case CharacterLiteral:
				{
				alt90=3;
				}
				break;
			case StringLiteral:
				{
				alt90=4;
				}
				break;
			case 73:
			case 103:
				{
				alt90=5;
				}
				break;
			case 87:
				{
				alt90=6;
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
					// /home/tony/Downloads/JavaJava.g:464:9: integerLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_integerLiteral_in_literal2885);
					integerLiteral271=integerLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteral271.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:465:9: FloatingPointLiteral
					{
					root_0 = (Object)adaptor.nil();


					FloatingPointLiteral272=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal2895); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FloatingPointLiteral272_tree = (Object)adaptor.create(FloatingPointLiteral272);
					adaptor.addChild(root_0, FloatingPointLiteral272_tree);
					}

					if ( state.backtracking==0 ) {JavaMetrics.uniqueConstants.add((FloatingPointLiteral272!=null?FloatingPointLiteral272.getText():null));}
					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:466:9: CharacterLiteral
					{
					root_0 = (Object)adaptor.nil();


					CharacterLiteral273=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal2908); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CharacterLiteral273_tree = (Object)adaptor.create(CharacterLiteral273);
					adaptor.addChild(root_0, CharacterLiteral273_tree);
					}

					if ( state.backtracking==0 ) {JavaMetrics.uniqueConstants.add((CharacterLiteral273!=null?CharacterLiteral273.getText():null));}
					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:467:9: StringLiteral
					{
					root_0 = (Object)adaptor.nil();


					StringLiteral274=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2921); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					StringLiteral274_tree = (Object)adaptor.create(StringLiteral274);
					adaptor.addChild(root_0, StringLiteral274_tree);
					}

					if ( state.backtracking==0 ) {JavaMetrics.uniqueConstants.add((StringLiteral274!=null?StringLiteral274.getText():null));}
					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:468:9: booleanLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_booleanLiteral_in_literal2933);
					booleanLiteral275=booleanLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral275.getTree());

					}
					break;
				case 6 :
					// /home/tony/Downloads/JavaJava.g:469:9: 'null'
					{
					root_0 = (Object)adaptor.nil();


					string_literal276=(Token)match(input,87,FOLLOW_87_in_literal2943); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal276_tree = (Object)adaptor.create(string_literal276);
					adaptor.addChild(root_0, string_literal276_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 68, literal_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:472:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
	public final JavaJavaParser.integerLiteral_return integerLiteral() throws RecognitionException {
		JavaJavaParser.integerLiteral_return retval = new JavaJavaParser.integerLiteral_return();
		retval.start = input.LT(1);
		int integerLiteral_StartIndex = input.index();

		Object root_0 = null;

		Token HexLiteral277=null;
		Token OctalLiteral278=null;
		Token DecimalLiteral279=null;

		Object HexLiteral277_tree=null;
		Object OctalLiteral278_tree=null;
		Object DecimalLiteral279_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:473:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
			int alt91=3;
			switch ( input.LA(1) ) {
			case HexLiteral:
				{
				alt91=1;
				}
				break;
			case OctalLiteral:
				{
				alt91=2;
				}
				break;
			case DecimalLiteral:
				{
				alt91=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:473:9: HexLiteral
					{
					root_0 = (Object)adaptor.nil();


					HexLiteral277=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerLiteral2964); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					HexLiteral277_tree = (Object)adaptor.create(HexLiteral277);
					adaptor.addChild(root_0, HexLiteral277_tree);
					}

					if ( state.backtracking==0 ) { JavaMetrics.uniqueConstants.add((HexLiteral277!=null?HexLiteral277.getText():null));}
					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:474:9: OctalLiteral
					{
					root_0 = (Object)adaptor.nil();


					OctalLiteral278=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerLiteral2976); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OctalLiteral278_tree = (Object)adaptor.create(OctalLiteral278);
					adaptor.addChild(root_0, OctalLiteral278_tree);
					}

					if ( state.backtracking==0 ) { JavaMetrics.uniqueConstants.add((OctalLiteral278!=null?OctalLiteral278.getText():null));}
					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:475:9: DecimalLiteral
					{
					root_0 = (Object)adaptor.nil();


					DecimalLiteral279=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerLiteral2988); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DecimalLiteral279_tree = (Object)adaptor.create(DecimalLiteral279);
					adaptor.addChild(root_0, DecimalLiteral279_tree);
					}

					if ( state.backtracking==0 ) {JavaMetrics.uniqueConstants.add((DecimalLiteral279!=null?DecimalLiteral279.getText():null));}
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
			if ( state.backtracking>0 ) { memoize(input, 69, integerLiteral_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:478:1: booleanLiteral : ( 'true' | 'false' );
	public final JavaJavaParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
		JavaJavaParser.booleanLiteral_return retval = new JavaJavaParser.booleanLiteral_return();
		retval.start = input.LT(1);
		int booleanLiteral_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal280=null;
		Token string_literal281=null;

		Object string_literal280_tree=null;
		Object string_literal281_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:479:5: ( 'true' | 'false' )
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==103) ) {
				alt92=1;
			}
			else if ( (LA92_0==73) ) {
				alt92=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:479:9: 'true'
					{
					root_0 = (Object)adaptor.nil();


					string_literal280=(Token)match(input,103,FOLLOW_103_in_booleanLiteral3009); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal280_tree = (Object)adaptor.create(string_literal280);
					adaptor.addChild(root_0, string_literal280_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("true");}
					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:480:9: 'false'
					{
					root_0 = (Object)adaptor.nil();


					string_literal281=(Token)match(input,73,FOLLOW_73_in_booleanLiteral3021); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal281_tree = (Object)adaptor.create(string_literal281);
					adaptor.addChild(root_0, string_literal281_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 70, booleanLiteral_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:485:1: annotations : ( annotation )+ ;
	public final JavaJavaParser.annotations_return annotations() throws RecognitionException {
		JavaJavaParser.annotations_return retval = new JavaJavaParser.annotations_return();
		retval.start = input.LT(1);
		int annotations_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope annotation282 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:486:5: ( ( annotation )+ )
			// /home/tony/Downloads/JavaJava.g:486:9: ( annotation )+
			{
			root_0 = (Object)adaptor.nil();


			// /home/tony/Downloads/JavaJava.g:486:9: ( annotation )+
			int cnt93=0;
			loop93:
			while (true) {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==54) ) {
					int LA93_2 = input.LA(2);
					if ( (LA93_2==Identifier) ) {
						int LA93_3 = input.LA(3);
						if ( (synpred128_JavaJava()) ) {
							alt93=1;
						}

					}

				}

				switch (alt93) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:486:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_annotations3043);
					annotation282=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation282.getTree());

					}
					break;

				default :
					if ( cnt93 >= 1 ) break loop93;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(93, input);
					throw eee;
				}
				cnt93++;
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
			if ( state.backtracking>0 ) { memoize(input, 71, annotations_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:489:1: annotation : '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )? ;
	public final JavaJavaParser.annotation_return annotation() throws RecognitionException {
		JavaJavaParser.annotation_return retval = new JavaJavaParser.annotation_return();
		retval.start = input.LT(1);
		int annotation_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal283=null;
		Token char_literal285=null;
		Token char_literal288=null;
		ParserRuleReturnScope annotationName284 =null;
		ParserRuleReturnScope elementValuePairs286 =null;
		ParserRuleReturnScope elementValue287 =null;

		Object char_literal283_tree=null;
		Object char_literal285_tree=null;
		Object char_literal288_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:490:5: ( '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )? )
			// /home/tony/Downloads/JavaJava.g:490:9: '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
			{
			root_0 = (Object)adaptor.nil();


			char_literal283=(Token)match(input,54,FOLLOW_54_in_annotation3063); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal283_tree = (Object)adaptor.create(char_literal283);
			adaptor.addChild(root_0, char_literal283_tree);
			}

			pushFollow(FOLLOW_annotationName_in_annotation3065);
			annotationName284=annotationName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationName284.getTree());

			// /home/tony/Downloads/JavaJava.g:490:28: ( '(' ( elementValuePairs | elementValue )? ')' )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==32) ) {
				alt95=1;
			}
			switch (alt95) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:490:30: '(' ( elementValuePairs | elementValue )? ')'
					{
					char_literal285=(Token)match(input,32,FOLLOW_32_in_annotation3069); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal285_tree = (Object)adaptor.create(char_literal285);
					adaptor.addChild(root_0, char_literal285_tree);
					}

					if ( state.backtracking==0 ) {s("(");}
					// /home/tony/Downloads/JavaJava.g:490:44: ( elementValuePairs | elementValue )?
					int alt94=3;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==Identifier) ) {
						int LA94_1 = input.LA(2);
						if ( (LA94_1==50) ) {
							alt94=1;
						}
						else if ( ((LA94_1 >= 26 && LA94_1 <= 27)||(LA94_1 >= 29 && LA94_1 <= 30)||(LA94_1 >= 32 && LA94_1 <= 34)||(LA94_1 >= 36 && LA94_1 <= 37)||(LA94_1 >= 40 && LA94_1 <= 41)||LA94_1==43||LA94_1==45||LA94_1==49||(LA94_1 >= 51 && LA94_1 <= 53)||LA94_1==55||LA94_1==57||LA94_1==81||LA94_1==109||LA94_1==111) ) {
							alt94=2;
						}
					}
					else if ( ((LA94_0 >= CharacterLiteral && LA94_0 <= DecimalLiteral)||LA94_0==FloatingPointLiteral||LA94_0==HexLiteral||(LA94_0 >= OctalLiteral && LA94_0 <= StringLiteral)||LA94_0==25||LA94_0==32||(LA94_0 >= 36 && LA94_0 <= 37)||(LA94_0 >= 40 && LA94_0 <= 41)||LA94_0==54||LA94_0==60||LA94_0==62||LA94_0==65||LA94_0==70||LA94_0==73||LA94_0==76||LA94_0==82||LA94_0==84||(LA94_0 >= 86 && LA94_0 <= 87)||LA94_0==93||LA94_0==96||LA94_0==99||LA94_0==103||LA94_0==105||LA94_0==108||LA94_0==113) ) {
						alt94=2;
					}
					switch (alt94) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:490:46: elementValuePairs
							{
							pushFollow(FOLLOW_elementValuePairs_in_annotation3075);
							elementValuePairs286=elementValuePairs();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePairs286.getTree());

							}
							break;
						case 2 :
							// /home/tony/Downloads/JavaJava.g:490:66: elementValue
							{
							pushFollow(FOLLOW_elementValue_in_annotation3079);
							elementValue287=elementValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue287.getTree());

							}
							break;

					}

					char_literal288=(Token)match(input,33,FOLLOW_33_in_annotation3084); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal288_tree = (Object)adaptor.create(char_literal288);
					adaptor.addChild(root_0, char_literal288_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 72, annotation_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:493:1: annotationName : t1= Identifier ( '.' Identifier )* ;
	public final JavaJavaParser.annotationName_return annotationName() throws RecognitionException {
		JavaJavaParser.annotationName_return retval = new JavaJavaParser.annotationName_return();
		retval.start = input.LT(1);
		int annotationName_StartIndex = input.index();

		Object root_0 = null;

		Token t1=null;
		Token char_literal289=null;
		Token Identifier290=null;

		Object t1_tree=null;
		Object char_literal289_tree=null;
		Object Identifier290_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:494:5: (t1= Identifier ( '.' Identifier )* )
			// /home/tony/Downloads/JavaJava.g:494:7: t1= Identifier ( '.' Identifier )*
			{
			root_0 = (Object)adaptor.nil();


			t1=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationName3114); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			t1_tree = (Object)adaptor.create(t1);
			adaptor.addChild(root_0, t1_tree);
			}

			if ( state.backtracking==0 ) {id((t1!=null?t1.getText():null)); }
			// /home/tony/Downloads/JavaJava.g:494:38: ( '.' Identifier )*
			loop96:
			while (true) {
				int alt96=2;
				int LA96_0 = input.LA(1);
				if ( (LA96_0==43) ) {
					alt96=1;
				}

				switch (alt96) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:494:39: '.' Identifier
					{
					char_literal289=(Token)match(input,43,FOLLOW_43_in_annotationName3118); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal289_tree = (Object)adaptor.create(char_literal289);
					adaptor.addChild(root_0, char_literal289_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					Identifier290=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationName3122); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier290_tree = (Object)adaptor.create(Identifier290);
					adaptor.addChild(root_0, Identifier290_tree);
					}

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
			if ( state.backtracking>0 ) { memoize(input, 73, annotationName_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:497:1: elementValuePairs : elementValuePair ( ',' elementValuePair )* ;
	public final JavaJavaParser.elementValuePairs_return elementValuePairs() throws RecognitionException {
		JavaJavaParser.elementValuePairs_return retval = new JavaJavaParser.elementValuePairs_return();
		retval.start = input.LT(1);
		int elementValuePairs_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal292=null;
		ParserRuleReturnScope elementValuePair291 =null;
		ParserRuleReturnScope elementValuePair293 =null;

		Object char_literal292_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:498:5: ( elementValuePair ( ',' elementValuePair )* )
			// /home/tony/Downloads/JavaJava.g:498:9: elementValuePair ( ',' elementValuePair )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_elementValuePair_in_elementValuePairs3143);
			elementValuePair291=elementValuePair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePair291.getTree());

			// /home/tony/Downloads/JavaJava.g:498:26: ( ',' elementValuePair )*
			loop97:
			while (true) {
				int alt97=2;
				int LA97_0 = input.LA(1);
				if ( (LA97_0==39) ) {
					alt97=1;
				}

				switch (alt97) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:498:27: ',' elementValuePair
					{
					char_literal292=(Token)match(input,39,FOLLOW_39_in_elementValuePairs3146); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal292_tree = (Object)adaptor.create(char_literal292);
					adaptor.addChild(root_0, char_literal292_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_elementValuePair_in_elementValuePairs3150);
					elementValuePair293=elementValuePair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePair293.getTree());

					}
					break;

				default :
					break loop97;
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
			if ( state.backtracking>0 ) { memoize(input, 74, elementValuePairs_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:501:1: elementValuePair : Identifier '=' elementValue ;
	public final JavaJavaParser.elementValuePair_return elementValuePair() throws RecognitionException {
		JavaJavaParser.elementValuePair_return retval = new JavaJavaParser.elementValuePair_return();
		retval.start = input.LT(1);
		int elementValuePair_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier294=null;
		Token char_literal295=null;
		ParserRuleReturnScope elementValue296 =null;

		Object Identifier294_tree=null;
		Object char_literal295_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:502:5: ( Identifier '=' elementValue )
			// /home/tony/Downloads/JavaJava.g:502:9: Identifier '=' elementValue
			{
			root_0 = (Object)adaptor.nil();


			Identifier294=(Token)match(input,Identifier,FOLLOW_Identifier_in_elementValuePair3171); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier294_tree = (Object)adaptor.create(Identifier294);
			adaptor.addChild(root_0, Identifier294_tree);
			}

			if ( state.backtracking==0 ) { id((Identifier294!=null?Identifier294.getText():null));}
			char_literal295=(Token)match(input,50,FOLLOW_50_in_elementValuePair3175); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal295_tree = (Object)adaptor.create(char_literal295);
			adaptor.addChild(root_0, char_literal295_tree);
			}

			if ( state.backtracking==0 ) {s("=");}
			pushFollow(FOLLOW_elementValue_in_elementValuePair3179);
			elementValue296=elementValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue296.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 75, elementValuePair_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:505:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );
	public final JavaJavaParser.elementValue_return elementValue() throws RecognitionException {
		JavaJavaParser.elementValue_return retval = new JavaJavaParser.elementValue_return();
		retval.start = input.LT(1);
		int elementValue_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope conditionalExpression297 =null;
		ParserRuleReturnScope annotation298 =null;
		ParserRuleReturnScope elementValueArrayInitializer299 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:506:5: ( conditionalExpression | annotation | elementValueArrayInitializer )
			int alt98=3;
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
				alt98=1;
				}
				break;
			case 54:
				{
				alt98=2;
				}
				break;
			case 108:
				{
				alt98=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}
			switch (alt98) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:506:9: conditionalExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_conditionalExpression_in_elementValue3202);
					conditionalExpression297=conditionalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression297.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:507:9: annotation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotation_in_elementValue3212);
					annotation298=annotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotation298.getTree());

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:508:9: elementValueArrayInitializer
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue3222);
					elementValueArrayInitializer299=elementValueArrayInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValueArrayInitializer299.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 76, elementValue_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:511:1: elementValueArrayInitializer : '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' ;
	public final JavaJavaParser.elementValueArrayInitializer_return elementValueArrayInitializer() throws RecognitionException {
		JavaJavaParser.elementValueArrayInitializer_return retval = new JavaJavaParser.elementValueArrayInitializer_return();
		retval.start = input.LT(1);
		int elementValueArrayInitializer_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal300=null;
		Token char_literal302=null;
		Token char_literal304=null;
		Token char_literal305=null;
		ParserRuleReturnScope elementValue301 =null;
		ParserRuleReturnScope elementValue303 =null;

		Object char_literal300_tree=null;
		Object char_literal302_tree=null;
		Object char_literal304_tree=null;
		Object char_literal305_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:512:5: ( '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' )
			// /home/tony/Downloads/JavaJava.g:512:9: '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal300=(Token)match(input,108,FOLLOW_108_in_elementValueArrayInitializer3245); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal300_tree = (Object)adaptor.create(char_literal300);
			adaptor.addChild(root_0, char_literal300_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /home/tony/Downloads/JavaJava.g:512:22: ( elementValue ( ',' elementValue )* )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( ((LA100_0 >= CharacterLiteral && LA100_0 <= DecimalLiteral)||LA100_0==FloatingPointLiteral||(LA100_0 >= HexLiteral && LA100_0 <= Identifier)||(LA100_0 >= OctalLiteral && LA100_0 <= StringLiteral)||LA100_0==25||LA100_0==32||(LA100_0 >= 36 && LA100_0 <= 37)||(LA100_0 >= 40 && LA100_0 <= 41)||LA100_0==54||LA100_0==60||LA100_0==62||LA100_0==65||LA100_0==70||LA100_0==73||LA100_0==76||LA100_0==82||LA100_0==84||(LA100_0 >= 86 && LA100_0 <= 87)||LA100_0==93||LA100_0==96||LA100_0==99||LA100_0==103||LA100_0==105||LA100_0==108||LA100_0==113) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:512:23: elementValue ( ',' elementValue )*
					{
					pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer3249);
					elementValue301=elementValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue301.getTree());

					// /home/tony/Downloads/JavaJava.g:512:36: ( ',' elementValue )*
					loop99:
					while (true) {
						int alt99=2;
						int LA99_0 = input.LA(1);
						if ( (LA99_0==39) ) {
							int LA99_1 = input.LA(2);
							if ( ((LA99_1 >= CharacterLiteral && LA99_1 <= DecimalLiteral)||LA99_1==FloatingPointLiteral||(LA99_1 >= HexLiteral && LA99_1 <= Identifier)||(LA99_1 >= OctalLiteral && LA99_1 <= StringLiteral)||LA99_1==25||LA99_1==32||(LA99_1 >= 36 && LA99_1 <= 37)||(LA99_1 >= 40 && LA99_1 <= 41)||LA99_1==54||LA99_1==60||LA99_1==62||LA99_1==65||LA99_1==70||LA99_1==73||LA99_1==76||LA99_1==82||LA99_1==84||(LA99_1 >= 86 && LA99_1 <= 87)||LA99_1==93||LA99_1==96||LA99_1==99||LA99_1==103||LA99_1==105||LA99_1==108||LA99_1==113) ) {
								alt99=1;
							}

						}

						switch (alt99) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:512:37: ',' elementValue
							{
							char_literal302=(Token)match(input,39,FOLLOW_39_in_elementValueArrayInitializer3252); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal302_tree = (Object)adaptor.create(char_literal302);
							adaptor.addChild(root_0, char_literal302_tree);
							}

							if ( state.backtracking==0 ) {s(",");}
							pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer3255);
							elementValue303=elementValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue303.getTree());

							}
							break;

						default :
							break loop99;
						}
					}

					}
					break;

			}

			// /home/tony/Downloads/JavaJava.g:512:67: ( ',' )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==39) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:512:68: ','
					{
					char_literal304=(Token)match(input,39,FOLLOW_39_in_elementValueArrayInitializer3262); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal304_tree = (Object)adaptor.create(char_literal304);
					adaptor.addChild(root_0, char_literal304_tree);
					}

					}
					break;

			}

			char_literal305=(Token)match(input,112,FOLLOW_112_in_elementValueArrayInitializer3267); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal305_tree = (Object)adaptor.create(char_literal305);
			adaptor.addChild(root_0, char_literal305_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 77, elementValueArrayInitializer_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:515:1: annotationTypeDeclaration : '@' 'interface' Identifier annotationTypeBody ;
	public final JavaJavaParser.annotationTypeDeclaration_return annotationTypeDeclaration() throws RecognitionException {
		JavaJavaParser.annotationTypeDeclaration_return retval = new JavaJavaParser.annotationTypeDeclaration_return();
		retval.start = input.LT(1);
		int annotationTypeDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal306=null;
		Token string_literal307=null;
		Token Identifier308=null;
		ParserRuleReturnScope annotationTypeBody309 =null;

		Object char_literal306_tree=null;
		Object string_literal307_tree=null;
		Object Identifier308_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:516:5: ( '@' 'interface' Identifier annotationTypeBody )
			// /home/tony/Downloads/JavaJava.g:516:9: '@' 'interface' Identifier annotationTypeBody
			{
			root_0 = (Object)adaptor.nil();


			char_literal306=(Token)match(input,54,FOLLOW_54_in_annotationTypeDeclaration3291); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal306_tree = (Object)adaptor.create(char_literal306);
			adaptor.addChild(root_0, char_literal306_tree);
			}

			string_literal307=(Token)match(input,83,FOLLOW_83_in_annotationTypeDeclaration3293); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal307_tree = (Object)adaptor.create(string_literal307);
			adaptor.addChild(root_0, string_literal307_tree);
			}

			Identifier308=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationTypeDeclaration3295); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier308_tree = (Object)adaptor.create(Identifier308);
			adaptor.addChild(root_0, Identifier308_tree);
			}

			if ( state.backtracking==0 ) { id((Identifier308!=null?Identifier308.getText():null));}
			pushFollow(FOLLOW_annotationTypeBody_in_annotationTypeDeclaration3299);
			annotationTypeBody309=annotationTypeBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeBody309.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 78, annotationTypeDeclaration_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:519:1: annotationTypeBody : '{' ( annotationTypeElementDeclaration )* '}' ;
	public final JavaJavaParser.annotationTypeBody_return annotationTypeBody() throws RecognitionException {
		JavaJavaParser.annotationTypeBody_return retval = new JavaJavaParser.annotationTypeBody_return();
		retval.start = input.LT(1);
		int annotationTypeBody_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal310=null;
		Token char_literal312=null;
		ParserRuleReturnScope annotationTypeElementDeclaration311 =null;

		Object char_literal310_tree=null;
		Object char_literal312_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:520:5: ( '{' ( annotationTypeElementDeclaration )* '}' )
			// /home/tony/Downloads/JavaJava.g:520:9: '{' ( annotationTypeElementDeclaration )* '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal310=(Token)match(input,108,FOLLOW_108_in_annotationTypeBody3322); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal310_tree = (Object)adaptor.create(char_literal310);
			adaptor.addChild(root_0, char_literal310_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /home/tony/Downloads/JavaJava.g:520:22: ( annotationTypeElementDeclaration )*
			loop102:
			while (true) {
				int alt102=2;
				int LA102_0 = input.LA(1);
				if ( (LA102_0==ENUM||LA102_0==Identifier||LA102_0==49||LA102_0==54||(LA102_0 >= 59 && LA102_0 <= 60)||LA102_0==62||(LA102_0 >= 65 && LA102_0 <= 66)||LA102_0==70||LA102_0==74||LA102_0==76||(LA102_0 >= 82 && LA102_0 <= 85)||(LA102_0 >= 89 && LA102_0 <= 91)||(LA102_0 >= 93 && LA102_0 <= 95)||LA102_0==98||LA102_0==102||(LA102_0 >= 105 && LA102_0 <= 106)) ) {
					alt102=1;
				}

				switch (alt102) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:520:23: annotationTypeElementDeclaration
					{
					pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody3326);
					annotationTypeElementDeclaration311=annotationTypeElementDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeElementDeclaration311.getTree());

					}
					break;

				default :
					break loop102;
				}
			}

			char_literal312=(Token)match(input,112,FOLLOW_112_in_annotationTypeBody3330); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal312_tree = (Object)adaptor.create(char_literal312);
			adaptor.addChild(root_0, char_literal312_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 79, annotationTypeBody_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:523:1: annotationTypeElementDeclaration : modifiers annotationTypeElementRest ;
	public final JavaJavaParser.annotationTypeElementDeclaration_return annotationTypeElementDeclaration() throws RecognitionException {
		JavaJavaParser.annotationTypeElementDeclaration_return retval = new JavaJavaParser.annotationTypeElementDeclaration_return();
		retval.start = input.LT(1);
		int annotationTypeElementDeclaration_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope modifiers313 =null;
		ParserRuleReturnScope annotationTypeElementRest314 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:524:5: ( modifiers annotationTypeElementRest )
			// /home/tony/Downloads/JavaJava.g:524:9: modifiers annotationTypeElementRest
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_modifiers_in_annotationTypeElementDeclaration3354);
			modifiers313=modifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers313.getTree());

			pushFollow(FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration3356);
			annotationTypeElementRest314=annotationTypeElementRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeElementRest314.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 80, annotationTypeElementDeclaration_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:527:1: annotationTypeElementRest : ( type annotationMethodOrConstantRest ';' | normalClassDeclaration ( ';' )? | normalInterfaceDeclaration ( ';' )? | enumDeclaration ( ';' )? | annotationTypeDeclaration ( ';' )? );
	public final JavaJavaParser.annotationTypeElementRest_return annotationTypeElementRest() throws RecognitionException {
		JavaJavaParser.annotationTypeElementRest_return retval = new JavaJavaParser.annotationTypeElementRest_return();
		retval.start = input.LT(1);
		int annotationTypeElementRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal317=null;
		Token char_literal319=null;
		Token char_literal321=null;
		Token char_literal323=null;
		Token char_literal325=null;
		ParserRuleReturnScope type315 =null;
		ParserRuleReturnScope annotationMethodOrConstantRest316 =null;
		ParserRuleReturnScope normalClassDeclaration318 =null;
		ParserRuleReturnScope normalInterfaceDeclaration320 =null;
		ParserRuleReturnScope enumDeclaration322 =null;
		ParserRuleReturnScope annotationTypeDeclaration324 =null;

		Object char_literal317_tree=null;
		Object char_literal319_tree=null;
		Object char_literal321_tree=null;
		Object char_literal323_tree=null;
		Object char_literal325_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:528:5: ( type annotationMethodOrConstantRest ';' | normalClassDeclaration ( ';' )? | normalInterfaceDeclaration ( ';' )? | enumDeclaration ( ';' )? | annotationTypeDeclaration ( ';' )? )
			int alt107=5;
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
				alt107=1;
				}
				break;
			case 66:
				{
				alt107=2;
				}
				break;
			case 83:
				{
				alt107=3;
				}
				break;
			case ENUM:
				{
				alt107=4;
				}
				break;
			case 54:
				{
				alt107=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:528:9: type annotationMethodOrConstantRest ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_in_annotationTypeElementRest3379);
					type315=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type315.getTree());

					pushFollow(FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest3381);
					annotationMethodOrConstantRest316=annotationMethodOrConstantRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationMethodOrConstantRest316.getTree());

					char_literal317=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3383); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal317_tree = (Object)adaptor.create(char_literal317);
					adaptor.addChild(root_0, char_literal317_tree);
					}

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:529:9: normalClassDeclaration ( ';' )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_normalClassDeclaration_in_annotationTypeElementRest3393);
					normalClassDeclaration318=normalClassDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, normalClassDeclaration318.getTree());

					// /home/tony/Downloads/JavaJava.g:529:32: ( ';' )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==48) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:529:32: ';'
							{
							char_literal319=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3395); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal319_tree = (Object)adaptor.create(char_literal319);
							adaptor.addChild(root_0, char_literal319_tree);
							}

							}
							break;

					}

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:530:9: normalInterfaceDeclaration ( ';' )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest3406);
					normalInterfaceDeclaration320=normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, normalInterfaceDeclaration320.getTree());

					// /home/tony/Downloads/JavaJava.g:530:36: ( ';' )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==48) ) {
						alt104=1;
					}
					switch (alt104) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:530:36: ';'
							{
							char_literal321=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3408); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal321_tree = (Object)adaptor.create(char_literal321);
							adaptor.addChild(root_0, char_literal321_tree);
							}

							}
							break;

					}

					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:531:9: enumDeclaration ( ';' )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enumDeclaration_in_annotationTypeElementRest3419);
					enumDeclaration322=enumDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDeclaration322.getTree());

					// /home/tony/Downloads/JavaJava.g:531:25: ( ';' )?
					int alt105=2;
					int LA105_0 = input.LA(1);
					if ( (LA105_0==48) ) {
						alt105=1;
					}
					switch (alt105) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:531:25: ';'
							{
							char_literal323=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3421); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal323_tree = (Object)adaptor.create(char_literal323);
							adaptor.addChild(root_0, char_literal323_tree);
							}

							}
							break;

					}

					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:532:9: annotationTypeDeclaration ( ';' )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest3432);
					annotationTypeDeclaration324=annotationTypeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationTypeDeclaration324.getTree());

					// /home/tony/Downloads/JavaJava.g:532:35: ( ';' )?
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==48) ) {
						alt106=1;
					}
					switch (alt106) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:532:35: ';'
							{
							char_literal325=(Token)match(input,48,FOLLOW_48_in_annotationTypeElementRest3434); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal325_tree = (Object)adaptor.create(char_literal325);
							adaptor.addChild(root_0, char_literal325_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 81, annotationTypeElementRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:535:1: annotationMethodOrConstantRest : ( annotationMethodRest | annotationConstantRest );
	public final JavaJavaParser.annotationMethodOrConstantRest_return annotationMethodOrConstantRest() throws RecognitionException {
		JavaJavaParser.annotationMethodOrConstantRest_return retval = new JavaJavaParser.annotationMethodOrConstantRest_return();
		retval.start = input.LT(1);
		int annotationMethodOrConstantRest_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope annotationMethodRest326 =null;
		ParserRuleReturnScope annotationConstantRest327 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:536:5: ( annotationMethodRest | annotationConstantRest )
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==Identifier) ) {
				int LA108_1 = input.LA(2);
				if ( (LA108_1==32) ) {
					alt108=1;
				}
				else if ( (LA108_1==39||LA108_1==48||LA108_1==50||LA108_1==55) ) {
					alt108=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 108, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 108, 0, input);
				throw nvae;
			}

			switch (alt108) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:536:9: annotationMethodRest
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest3458);
					annotationMethodRest326=annotationMethodRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationMethodRest326.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:537:9: annotationConstantRest
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest3468);
					annotationConstantRest327=annotationConstantRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationConstantRest327.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 82, annotationMethodOrConstantRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:540:1: annotationMethodRest : Identifier '(' ')' ( defaultValue )? ;
	public final JavaJavaParser.annotationMethodRest_return annotationMethodRest() throws RecognitionException {
		JavaJavaParser.annotationMethodRest_return retval = new JavaJavaParser.annotationMethodRest_return();
		retval.start = input.LT(1);
		int annotationMethodRest_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier328=null;
		Token char_literal329=null;
		Token char_literal330=null;
		ParserRuleReturnScope defaultValue331 =null;

		Object Identifier328_tree=null;
		Object char_literal329_tree=null;
		Object char_literal330_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:541:5: ( Identifier '(' ')' ( defaultValue )? )
			// /home/tony/Downloads/JavaJava.g:541:9: Identifier '(' ')' ( defaultValue )?
			{
			root_0 = (Object)adaptor.nil();


			Identifier328=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationMethodRest3491); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier328_tree = (Object)adaptor.create(Identifier328);
			adaptor.addChild(root_0, Identifier328_tree);
			}

			if ( state.backtracking==0 ) {id((Identifier328!=null?Identifier328.getText():null));}
			char_literal329=(Token)match(input,32,FOLLOW_32_in_annotationMethodRest3495); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal329_tree = (Object)adaptor.create(char_literal329);
			adaptor.addChild(root_0, char_literal329_tree);
			}

			if ( state.backtracking==0 ) {s("(");}
			char_literal330=(Token)match(input,33,FOLLOW_33_in_annotationMethodRest3500); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal330_tree = (Object)adaptor.create(char_literal330);
			adaptor.addChild(root_0, char_literal330_tree);
			}

			if ( state.backtracking==0 ) {s(")");}
			// /home/tony/Downloads/JavaJava.g:541:73: ( defaultValue )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==68) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:541:73: defaultValue
					{
					pushFollow(FOLLOW_defaultValue_in_annotationMethodRest3504);
					defaultValue331=defaultValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultValue331.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 83, annotationMethodRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:544:1: annotationConstantRest : variableDeclarators ;
	public final JavaJavaParser.annotationConstantRest_return annotationConstantRest() throws RecognitionException {
		JavaJavaParser.annotationConstantRest_return retval = new JavaJavaParser.annotationConstantRest_return();
		retval.start = input.LT(1);
		int annotationConstantRest_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope variableDeclarators332 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:545:5: ( variableDeclarators )
			// /home/tony/Downloads/JavaJava.g:545:9: variableDeclarators
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableDeclarators_in_annotationConstantRest3528);
			variableDeclarators332=variableDeclarators();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarators332.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 84, annotationConstantRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:548:1: defaultValue : 'default' elementValue ;
	public final JavaJavaParser.defaultValue_return defaultValue() throws RecognitionException {
		JavaJavaParser.defaultValue_return retval = new JavaJavaParser.defaultValue_return();
		retval.start = input.LT(1);
		int defaultValue_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal333=null;
		ParserRuleReturnScope elementValue334 =null;

		Object string_literal333_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:549:5: ( 'default' elementValue )
			// /home/tony/Downloads/JavaJava.g:549:9: 'default' elementValue
			{
			root_0 = (Object)adaptor.nil();


			string_literal333=(Token)match(input,68,FOLLOW_68_in_defaultValue3551); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal333_tree = (Object)adaptor.create(string_literal333);
			adaptor.addChild(root_0, string_literal333_tree);
			}

			if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("default");}
			pushFollow(FOLLOW_elementValue_in_defaultValue3555);
			elementValue334=elementValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue334.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 85, defaultValue_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:554:1: block : '{' ( blockStatement )* '}' ;
	public final JavaJavaParser.block_return block() throws RecognitionException {
		JavaJavaParser.block_return retval = new JavaJavaParser.block_return();
		retval.start = input.LT(1);
		int block_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal335=null;
		Token char_literal337=null;
		ParserRuleReturnScope blockStatement336 =null;

		Object char_literal335_tree=null;
		Object char_literal337_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:555:5: ( '{' ( blockStatement )* '}' )
			// /home/tony/Downloads/JavaJava.g:555:9: '{' ( blockStatement )* '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal335=(Token)match(input,108,FOLLOW_108_in_block3576); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal335_tree = (Object)adaptor.create(char_literal335);
			adaptor.addChild(root_0, char_literal335_tree);
			}

			if ( state.backtracking==0 ) {s("{");}
			// /home/tony/Downloads/JavaJava.g:555:23: ( blockStatement )*
			loop110:
			while (true) {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==ASSERT||(LA110_0 >= CharacterLiteral && LA110_0 <= ENUM)||LA110_0==FloatingPointLiteral||(LA110_0 >= HexLiteral && LA110_0 <= Identifier)||(LA110_0 >= OctalLiteral && LA110_0 <= StringLiteral)||LA110_0==25||LA110_0==32||(LA110_0 >= 36 && LA110_0 <= 37)||(LA110_0 >= 40 && LA110_0 <= 41)||LA110_0==48||LA110_0==54||(LA110_0 >= 59 && LA110_0 <= 62)||(LA110_0 >= 65 && LA110_0 <= 67)||(LA110_0 >= 69 && LA110_0 <= 70)||(LA110_0 >= 73 && LA110_0 <= 74)||(LA110_0 >= 76 && LA110_0 <= 78)||(LA110_0 >= 82 && LA110_0 <= 84)||(LA110_0 >= 86 && LA110_0 <= 87)||(LA110_0 >= 89 && LA110_0 <= 100)||(LA110_0 >= 103 && LA110_0 <= 105)||(LA110_0 >= 107 && LA110_0 <= 108)||LA110_0==113) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:555:23: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_block3580);
					blockStatement336=blockStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement336.getTree());

					}
					break;

				default :
					break loop110;
				}
			}

			char_literal337=(Token)match(input,112,FOLLOW_112_in_block3583); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal337_tree = (Object)adaptor.create(char_literal337);
			adaptor.addChild(root_0, char_literal337_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 86, block_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:558:1: blockStatement : ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement );
	public final JavaJavaParser.blockStatement_return blockStatement() throws RecognitionException {
		JavaJavaParser.blockStatement_return retval = new JavaJavaParser.blockStatement_return();
		retval.start = input.LT(1);
		int blockStatement_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope localVariableDeclarationStatement338 =null;
		ParserRuleReturnScope classOrInterfaceDeclaration339 =null;
		ParserRuleReturnScope statement340 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:559:5: ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement )
			int alt111=3;
			switch ( input.LA(1) ) {
			case 74:
				{
				int LA111_1 = input.LA(2);
				if ( (synpred151_JavaJava()) ) {
					alt111=1;
				}
				else if ( (synpred152_JavaJava()) ) {
					alt111=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 111, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 54:
				{
				int LA111_2 = input.LA(2);
				if ( (synpred151_JavaJava()) ) {
					alt111=1;
				}
				else if ( (synpred152_JavaJava()) ) {
					alt111=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 111, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA111_3 = input.LA(2);
				if ( (synpred151_JavaJava()) ) {
					alt111=1;
				}
				else if ( (true) ) {
					alt111=3;
				}

				}
				break;
			case 60:
				{
				int LA111_4 = input.LA(2);
				if ( (synpred151_JavaJava()) ) {
					alt111=1;
				}
				else if ( (true) ) {
					alt111=3;
				}

				}
				break;
			case 65:
				{
				int LA111_5 = input.LA(2);
				if ( (synpred151_JavaJava()) ) {
					alt111=1;
				}
				else if ( (true) ) {
					alt111=3;
				}

				}
				break;
			case 62:
				{
				int LA111_6 = input.LA(2);
				if ( (synpred151_JavaJava()) ) {
					alt111=1;
				}
				else if ( (true) ) {
					alt111=3;
				}

				}
				break;
			case 93:
				{
				int LA111_7 = input.LA(2);
				if ( (synpred151_JavaJava()) ) {
					alt111=1;
				}
				else if ( (true) ) {
					alt111=3;
				}

				}
				break;
			case 82:
				{
				int LA111_8 = input.LA(2);
				if ( (synpred151_JavaJava()) ) {
					alt111=1;
				}
				else if ( (true) ) {
					alt111=3;
				}

				}
				break;
			case 84:
				{
				int LA111_9 = input.LA(2);
				if ( (synpred151_JavaJava()) ) {
					alt111=1;
				}
				else if ( (true) ) {
					alt111=3;
				}

				}
				break;
			case 76:
				{
				int LA111_10 = input.LA(2);
				if ( (synpred151_JavaJava()) ) {
					alt111=1;
				}
				else if ( (true) ) {
					alt111=3;
				}

				}
				break;
			case 70:
				{
				int LA111_11 = input.LA(2);
				if ( (synpred151_JavaJava()) ) {
					alt111=1;
				}
				else if ( (true) ) {
					alt111=3;
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
				alt111=2;
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
				alt111=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}
			switch (alt111) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:559:10: localVariableDeclarationStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement3609);
					localVariableDeclarationStatement338=localVariableDeclarationStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement338.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:560:9: classOrInterfaceDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement3619);
					classOrInterfaceDeclaration339=classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration339.getTree());

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:561:8: statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_statement_in_blockStatement3628);
					statement340=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement340.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 87, blockStatement_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:564:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
	public final JavaJavaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement() throws RecognitionException {
		JavaJavaParser.localVariableDeclarationStatement_return retval = new JavaJavaParser.localVariableDeclarationStatement_return();
		retval.start = input.LT(1);
		int localVariableDeclarationStatement_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal342=null;
		ParserRuleReturnScope localVariableDeclaration341 =null;

		Object char_literal342_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:565:5: ( localVariableDeclaration ';' )
			// /home/tony/Downloads/JavaJava.g:565:10: localVariableDeclaration ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement3653);
			localVariableDeclaration341=localVariableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration341.getTree());

			if ( state.backtracking==0 ) {primitive=false;}
			char_literal342=(Token)match(input,48,FOLLOW_48_in_localVariableDeclarationStatement3656); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal342_tree = (Object)adaptor.create(char_literal342);
			adaptor.addChild(root_0, char_literal342_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 88, localVariableDeclarationStatement_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:568:1: localVariableDeclaration : variableModifiers type variableDeclarators ;
	public final JavaJavaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
		JavaJavaParser.localVariableDeclaration_return retval = new JavaJavaParser.localVariableDeclaration_return();
		retval.start = input.LT(1);
		int localVariableDeclaration_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope variableModifiers343 =null;
		ParserRuleReturnScope type344 =null;
		ParserRuleReturnScope variableDeclarators345 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:569:5: ( variableModifiers type variableDeclarators )
			// /home/tony/Downloads/JavaJava.g:569:9: variableModifiers type variableDeclarators
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableModifiers_in_localVariableDeclaration3677);
			variableModifiers343=variableModifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers343.getTree());

			pushFollow(FOLLOW_type_in_localVariableDeclaration3679);
			type344=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type344.getTree());

			pushFollow(FOLLOW_variableDeclarators_in_localVariableDeclaration3681);
			variableDeclarators345=variableDeclarators();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarators345.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 89, localVariableDeclaration_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:572:1: variableModifiers : ( variableModifier )* ;
	public final JavaJavaParser.variableModifiers_return variableModifiers() throws RecognitionException {
		JavaJavaParser.variableModifiers_return retval = new JavaJavaParser.variableModifiers_return();
		retval.start = input.LT(1);
		int variableModifiers_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope variableModifier346 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:573:5: ( ( variableModifier )* )
			// /home/tony/Downloads/JavaJava.g:573:9: ( variableModifier )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/tony/Downloads/JavaJava.g:573:9: ( variableModifier )*
			loop112:
			while (true) {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==54||LA112_0==74) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:573:9: variableModifier
					{
					pushFollow(FOLLOW_variableModifier_in_variableModifiers3706);
					variableModifier346=variableModifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifier346.getTree());

					}
					break;

				default :
					break loop112;
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
			if ( state.backtracking>0 ) { memoize(input, 90, variableModifiers_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:576:1: statement : ( block | ASSERT expression ( ':' expression )? ';' | 'if' parExpression statement ( options {k=1; } : 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement );
	public final JavaJavaParser.statement_return statement() throws RecognitionException {
		JavaJavaParser.statement_return retval = new JavaJavaParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		Object root_0 = null;

		Token ASSERT348=null;
		Token char_literal350=null;
		Token char_literal352=null;
		Token string_literal353=null;
		Token string_literal356=null;
		Token string_literal358=null;
		Token char_literal359=null;
		Token char_literal361=null;
		Token string_literal363=null;
		Token string_literal366=null;
		Token string_literal368=null;
		Token char_literal370=null;
		Token string_literal371=null;
		Token string_literal374=null;
		Token string_literal377=null;
		Token string_literal379=null;
		Token char_literal381=null;
		Token char_literal383=null;
		Token string_literal384=null;
		Token string_literal387=null;
		Token char_literal389=null;
		Token string_literal390=null;
		Token char_literal392=null;
		Token string_literal393=null;
		Token Identifier394=null;
		Token char_literal395=null;
		Token string_literal396=null;
		Token Identifier397=null;
		Token char_literal398=null;
		Token char_literal399=null;
		Token char_literal401=null;
		Token Identifier402=null;
		Token char_literal403=null;
		ParserRuleReturnScope block347 =null;
		ParserRuleReturnScope expression349 =null;
		ParserRuleReturnScope expression351 =null;
		ParserRuleReturnScope parExpression354 =null;
		ParserRuleReturnScope statement355 =null;
		ParserRuleReturnScope statement357 =null;
		ParserRuleReturnScope forControl360 =null;
		ParserRuleReturnScope statement362 =null;
		ParserRuleReturnScope parExpression364 =null;
		ParserRuleReturnScope statement365 =null;
		ParserRuleReturnScope statement367 =null;
		ParserRuleReturnScope parExpression369 =null;
		ParserRuleReturnScope block372 =null;
		ParserRuleReturnScope catches373 =null;
		ParserRuleReturnScope block375 =null;
		ParserRuleReturnScope catches376 =null;
		ParserRuleReturnScope block378 =null;
		ParserRuleReturnScope parExpression380 =null;
		ParserRuleReturnScope switchBlockStatementGroups382 =null;
		ParserRuleReturnScope parExpression385 =null;
		ParserRuleReturnScope block386 =null;
		ParserRuleReturnScope expression388 =null;
		ParserRuleReturnScope expression391 =null;
		ParserRuleReturnScope statementExpression400 =null;
		ParserRuleReturnScope statement404 =null;

		Object ASSERT348_tree=null;
		Object char_literal350_tree=null;
		Object char_literal352_tree=null;
		Object string_literal353_tree=null;
		Object string_literal356_tree=null;
		Object string_literal358_tree=null;
		Object char_literal359_tree=null;
		Object char_literal361_tree=null;
		Object string_literal363_tree=null;
		Object string_literal366_tree=null;
		Object string_literal368_tree=null;
		Object char_literal370_tree=null;
		Object string_literal371_tree=null;
		Object string_literal374_tree=null;
		Object string_literal377_tree=null;
		Object string_literal379_tree=null;
		Object char_literal381_tree=null;
		Object char_literal383_tree=null;
		Object string_literal384_tree=null;
		Object string_literal387_tree=null;
		Object char_literal389_tree=null;
		Object string_literal390_tree=null;
		Object char_literal392_tree=null;
		Object string_literal393_tree=null;
		Object Identifier394_tree=null;
		Object char_literal395_tree=null;
		Object string_literal396_tree=null;
		Object Identifier397_tree=null;
		Object char_literal398_tree=null;
		Object char_literal399_tree=null;
		Object char_literal401_tree=null;
		Object Identifier402_tree=null;
		Object char_literal403_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:577:5: ( block | ASSERT expression ( ':' expression )? ';' | 'if' parExpression statement ( options {k=1; } : 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement )
			int alt119=16;
			switch ( input.LA(1) ) {
			case 108:
				{
				alt119=1;
				}
				break;
			case ASSERT:
				{
				alt119=2;
				}
				break;
			case 78:
				{
				alt119=3;
				}
				break;
			case 77:
				{
				alt119=4;
				}
				break;
			case 107:
				{
				alt119=5;
				}
				break;
			case 69:
				{
				alt119=6;
				}
				break;
			case 104:
				{
				alt119=7;
				}
				break;
			case 97:
				{
				alt119=8;
				}
				break;
			case 98:
				{
				alt119=9;
				}
				break;
			case 92:
				{
				alt119=10;
				}
				break;
			case 100:
				{
				alt119=11;
				}
				break;
			case 61:
				{
				alt119=12;
				}
				break;
			case 67:
				{
				alt119=13;
				}
				break;
			case 48:
				{
				alt119=14;
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
				alt119=15;
				}
				break;
			case Identifier:
				{
				int LA119_16 = input.LA(2);
				if ( ((LA119_16 >= 26 && LA119_16 <= 32)||(LA119_16 >= 34 && LA119_16 <= 38)||(LA119_16 >= 40 && LA119_16 <= 43)||(LA119_16 >= 45 && LA119_16 <= 46)||(LA119_16 >= 48 && LA119_16 <= 53)||LA119_16==55||(LA119_16 >= 57 && LA119_16 <= 58)||LA119_16==81||(LA119_16 >= 109 && LA119_16 <= 111)) ) {
					alt119=15;
				}
				else if ( (LA119_16==47) ) {
					alt119=16;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 119, 16, input);
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
					new NoViableAltException("", 119, 0, input);
				throw nvae;
			}
			switch (alt119) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:577:7: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_statement3724);
					block347=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block347.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:578:9: ASSERT expression ( ':' expression )? ';'
					{
					root_0 = (Object)adaptor.nil();


					ASSERT348=(Token)match(input,ASSERT,FOLLOW_ASSERT_in_statement3734); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSERT348_tree = (Object)adaptor.create(ASSERT348);
					adaptor.addChild(root_0, ASSERT348_tree);
					}

					pushFollow(FOLLOW_expression_in_statement3736);
					expression349=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression349.getTree());

					// /home/tony/Downloads/JavaJava.g:578:27: ( ':' expression )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==47) ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:578:28: ':' expression
							{
							char_literal350=(Token)match(input,47,FOLLOW_47_in_statement3739); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal350_tree = (Object)adaptor.create(char_literal350);
							adaptor.addChild(root_0, char_literal350_tree);
							}

							pushFollow(FOLLOW_expression_in_statement3741);
							expression351=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression351.getTree());

							}
							break;

					}

					char_literal352=(Token)match(input,48,FOLLOW_48_in_statement3745); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal352_tree = (Object)adaptor.create(char_literal352);
					adaptor.addChild(root_0, char_literal352_tree);
					}

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:579:9: 'if' parExpression statement ( options {k=1; } : 'else' statement )?
					{
					root_0 = (Object)adaptor.nil();


					string_literal353=(Token)match(input,78,FOLLOW_78_in_statement3755); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal353_tree = (Object)adaptor.create(string_literal353);
					adaptor.addChild(root_0, string_literal353_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("if"); mmc++;}
					pushFollow(FOLLOW_parExpression_in_statement3758);
					parExpression354=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression354.getTree());

					pushFollow(FOLLOW_statement_in_statement3760);
					statement355=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement355.getTree());

					// /home/tony/Downloads/JavaJava.g:579:99: ( options {k=1; } : 'else' statement )?
					int alt114=2;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==71) ) {
						int LA114_1 = input.LA(2);
						if ( (synpred157_JavaJava()) ) {
							alt114=1;
						}
					}
					switch (alt114) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:579:115: 'else' statement
							{
							string_literal356=(Token)match(input,71,FOLLOW_71_in_statement3770); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal356_tree = (Object)adaptor.create(string_literal356);
							adaptor.addChild(root_0, string_literal356_tree);
							}

							if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("else");}
							pushFollow(FOLLOW_statement_in_statement3774);
							statement357=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, statement357.getTree());

							}
							break;

					}

					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:580:9: 'for' '(' forControl ')' statement
					{
					root_0 = (Object)adaptor.nil();


					string_literal358=(Token)match(input,77,FOLLOW_77_in_statement3786); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal358_tree = (Object)adaptor.create(string_literal358);
					adaptor.addChild(root_0, string_literal358_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("for");mmc++;}
					char_literal359=(Token)match(input,32,FOLLOW_32_in_statement3790); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal359_tree = (Object)adaptor.create(char_literal359);
					adaptor.addChild(root_0, char_literal359_tree);
					}

					if ( state.backtracking==0 ) {s("(");}
					pushFollow(FOLLOW_forControl_in_statement3794);
					forControl360=forControl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forControl360.getTree());

					char_literal361=(Token)match(input,33,FOLLOW_33_in_statement3796); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal361_tree = (Object)adaptor.create(char_literal361);
					adaptor.addChild(root_0, char_literal361_tree);
					}

					if ( state.backtracking==0 ) {s("}");}
					pushFollow(FOLLOW_statement_in_statement3800);
					statement362=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement362.getTree());

					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:581:9: 'while' parExpression statement
					{
					root_0 = (Object)adaptor.nil();


					string_literal363=(Token)match(input,107,FOLLOW_107_in_statement3810); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal363_tree = (Object)adaptor.create(string_literal363);
					adaptor.addChild(root_0, string_literal363_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("while"); mmc++;}
					pushFollow(FOLLOW_parExpression_in_statement3813);
					parExpression364=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression364.getTree());

					pushFollow(FOLLOW_statement_in_statement3816);
					statement365=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement365.getTree());

					}
					break;
				case 6 :
					// /home/tony/Downloads/JavaJava.g:582:9: 'do' statement 'while' parExpression ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal366=(Token)match(input,69,FOLLOW_69_in_statement3826); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal366_tree = (Object)adaptor.create(string_literal366);
					adaptor.addChild(root_0, string_literal366_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("do");mmc++;}
					pushFollow(FOLLOW_statement_in_statement3829);
					statement367=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement367.getTree());

					string_literal368=(Token)match(input,107,FOLLOW_107_in_statement3831); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal368_tree = (Object)adaptor.create(string_literal368);
					adaptor.addChild(root_0, string_literal368_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("while");}
					pushFollow(FOLLOW_parExpression_in_statement3835);
					parExpression369=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression369.getTree());

					char_literal370=(Token)match(input,48,FOLLOW_48_in_statement3837); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal370_tree = (Object)adaptor.create(char_literal370);
					adaptor.addChild(root_0, char_literal370_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 7 :
					// /home/tony/Downloads/JavaJava.g:583:9: 'try' block ( catches 'finally' block | catches | 'finally' block )
					{
					root_0 = (Object)adaptor.nil();


					string_literal371=(Token)match(input,104,FOLLOW_104_in_statement3849); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal371_tree = (Object)adaptor.create(string_literal371);
					adaptor.addChild(root_0, string_literal371_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("try");}
					pushFollow(FOLLOW_block_in_statement3852);
					block372=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block372.getTree());

					// /home/tony/Downloads/JavaJava.g:584:9: ( catches 'finally' block | catches | 'finally' block )
					int alt115=3;
					int LA115_0 = input.LA(1);
					if ( (LA115_0==64) ) {
						int LA115_1 = input.LA(2);
						if ( (synpred162_JavaJava()) ) {
							alt115=1;
						}
						else if ( (synpred163_JavaJava()) ) {
							alt115=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 115, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA115_0==75) ) {
						alt115=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 115, 0, input);
						throw nvae;
					}

					switch (alt115) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:584:11: catches 'finally' block
							{
							pushFollow(FOLLOW_catches_in_statement3864);
							catches373=catches();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, catches373.getTree());

							string_literal374=(Token)match(input,75,FOLLOW_75_in_statement3866); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal374_tree = (Object)adaptor.create(string_literal374);
							adaptor.addChild(root_0, string_literal374_tree);
							}

							if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("finally");}
							pushFollow(FOLLOW_block_in_statement3869);
							block375=block();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, block375.getTree());

							}
							break;
						case 2 :
							// /home/tony/Downloads/JavaJava.g:585:11: catches
							{
							pushFollow(FOLLOW_catches_in_statement3881);
							catches376=catches();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, catches376.getTree());

							}
							break;
						case 3 :
							// /home/tony/Downloads/JavaJava.g:586:13: 'finally' block
							{
							string_literal377=(Token)match(input,75,FOLLOW_75_in_statement3895); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal377_tree = (Object)adaptor.create(string_literal377);
							adaptor.addChild(root_0, string_literal377_tree);
							}

							if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("finally");}
							pushFollow(FOLLOW_block_in_statement3898);
							block378=block();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, block378.getTree());

							}
							break;

					}

					}
					break;
				case 8 :
					// /home/tony/Downloads/JavaJava.g:588:9: 'switch' parExpression '{' switchBlockStatementGroups '}'
					{
					root_0 = (Object)adaptor.nil();


					string_literal379=(Token)match(input,97,FOLLOW_97_in_statement3918); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal379_tree = (Object)adaptor.create(string_literal379);
					adaptor.addChild(root_0, string_literal379_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("switch");}
					pushFollow(FOLLOW_parExpression_in_statement3922);
					parExpression380=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression380.getTree());

					char_literal381=(Token)match(input,108,FOLLOW_108_in_statement3924); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal381_tree = (Object)adaptor.create(char_literal381);
					adaptor.addChild(root_0, char_literal381_tree);
					}

					pushFollow(FOLLOW_switchBlockStatementGroups_in_statement3926);
					switchBlockStatementGroups382=switchBlockStatementGroups();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlockStatementGroups382.getTree());

					char_literal383=(Token)match(input,112,FOLLOW_112_in_statement3928); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal383_tree = (Object)adaptor.create(char_literal383);
					adaptor.addChild(root_0, char_literal383_tree);
					}

					}
					break;
				case 9 :
					// /home/tony/Downloads/JavaJava.g:589:9: 'synchronized' parExpression block
					{
					root_0 = (Object)adaptor.nil();


					string_literal384=(Token)match(input,98,FOLLOW_98_in_statement3938); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal384_tree = (Object)adaptor.create(string_literal384);
					adaptor.addChild(root_0, string_literal384_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("synchronized");}
					pushFollow(FOLLOW_parExpression_in_statement3941);
					parExpression385=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression385.getTree());

					pushFollow(FOLLOW_block_in_statement3943);
					block386=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block386.getTree());

					}
					break;
				case 10 :
					// /home/tony/Downloads/JavaJava.g:590:9: 'return' ( expression )? ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal387=(Token)match(input,92,FOLLOW_92_in_statement3953); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal387_tree = (Object)adaptor.create(string_literal387);
					adaptor.addChild(root_0, string_literal387_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("return");}
					// /home/tony/Downloads/JavaJava.g:590:77: ( expression )?
					int alt116=2;
					int LA116_0 = input.LA(1);
					if ( ((LA116_0 >= CharacterLiteral && LA116_0 <= DecimalLiteral)||LA116_0==FloatingPointLiteral||(LA116_0 >= HexLiteral && LA116_0 <= Identifier)||(LA116_0 >= OctalLiteral && LA116_0 <= StringLiteral)||LA116_0==25||LA116_0==32||(LA116_0 >= 36 && LA116_0 <= 37)||(LA116_0 >= 40 && LA116_0 <= 41)||LA116_0==60||LA116_0==62||LA116_0==65||LA116_0==70||LA116_0==73||LA116_0==76||LA116_0==82||LA116_0==84||(LA116_0 >= 86 && LA116_0 <= 87)||LA116_0==93||LA116_0==96||LA116_0==99||LA116_0==103||LA116_0==105||LA116_0==113) ) {
						alt116=1;
					}
					switch (alt116) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:590:77: expression
							{
							pushFollow(FOLLOW_expression_in_statement3957);
							expression388=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression388.getTree());

							}
							break;

					}

					char_literal389=(Token)match(input,48,FOLLOW_48_in_statement3960); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal389_tree = (Object)adaptor.create(char_literal389);
					adaptor.addChild(root_0, char_literal389_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 11 :
					// /home/tony/Downloads/JavaJava.g:591:9: 'throw' expression ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal390=(Token)match(input,100,FOLLOW_100_in_statement3972); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal390_tree = (Object)adaptor.create(string_literal390);
					adaptor.addChild(root_0, string_literal390_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("throw");}
					pushFollow(FOLLOW_expression_in_statement3975);
					expression391=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression391.getTree());

					char_literal392=(Token)match(input,48,FOLLOW_48_in_statement3977); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal392_tree = (Object)adaptor.create(char_literal392);
					adaptor.addChild(root_0, char_literal392_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 12 :
					// /home/tony/Downloads/JavaJava.g:592:9: 'break' ( Identifier )? ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal393=(Token)match(input,61,FOLLOW_61_in_statement3989); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal393_tree = (Object)adaptor.create(string_literal393);
					adaptor.addChild(root_0, string_literal393_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("break"); System.out.println("FOUND BREAK");}
					// /home/tony/Downloads/JavaJava.g:592:109: ( Identifier )?
					int alt117=2;
					int LA117_0 = input.LA(1);
					if ( (LA117_0==Identifier) ) {
						alt117=1;
					}
					switch (alt117) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:592:109: Identifier
							{
							Identifier394=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement3992); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Identifier394_tree = (Object)adaptor.create(Identifier394);
							adaptor.addChild(root_0, Identifier394_tree);
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {if(primitive) id((Identifier394!=null?Identifier394.getText():null));}
					char_literal395=(Token)match(input,48,FOLLOW_48_in_statement3996); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal395_tree = (Object)adaptor.create(char_literal395);
					adaptor.addChild(root_0, char_literal395_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 13 :
					// /home/tony/Downloads/JavaJava.g:593:9: 'continue' ( Identifier )? ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal396=(Token)match(input,67,FOLLOW_67_in_statement4008); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal396_tree = (Object)adaptor.create(string_literal396);
					adaptor.addChild(root_0, string_literal396_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("continue");}
					// /home/tony/Downloads/JavaJava.g:593:81: ( Identifier )?
					int alt118=2;
					int LA118_0 = input.LA(1);
					if ( (LA118_0==Identifier) ) {
						alt118=1;
					}
					switch (alt118) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:593:81: Identifier
							{
							Identifier397=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement4012); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Identifier397_tree = (Object)adaptor.create(Identifier397);
							adaptor.addChild(root_0, Identifier397_tree);
							}

							}
							break;

					}

					if ( state.backtracking==0 ) { id((Identifier397!=null?Identifier397.getText():null));}
					char_literal398=(Token)match(input,48,FOLLOW_48_in_statement4017); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal398_tree = (Object)adaptor.create(char_literal398);
					adaptor.addChild(root_0, char_literal398_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 14 :
					// /home/tony/Downloads/JavaJava.g:594:9: ';'
					{
					root_0 = (Object)adaptor.nil();


					char_literal399=(Token)match(input,48,FOLLOW_48_in_statement4029); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal399_tree = (Object)adaptor.create(char_literal399);
					adaptor.addChild(root_0, char_literal399_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 15 :
					// /home/tony/Downloads/JavaJava.g:595:9: statementExpression ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_statementExpression_in_statement4041);
					statementExpression400=statementExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statementExpression400.getTree());

					char_literal401=(Token)match(input,48,FOLLOW_48_in_statement4043); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal401_tree = (Object)adaptor.create(char_literal401);
					adaptor.addChild(root_0, char_literal401_tree);
					}

					if ( state.backtracking==0 ) {s(";");}
					}
					break;
				case 16 :
					// /home/tony/Downloads/JavaJava.g:596:9: Identifier ':' statement
					{
					root_0 = (Object)adaptor.nil();


					Identifier402=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement4056); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier402_tree = (Object)adaptor.create(Identifier402);
					adaptor.addChild(root_0, Identifier402_tree);
					}

					if ( state.backtracking==0 ) {if(primitive) id((Identifier402!=null?Identifier402.getText():null));}
					char_literal403=(Token)match(input,47,FOLLOW_47_in_statement4060); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal403_tree = (Object)adaptor.create(char_literal403);
					adaptor.addChild(root_0, char_literal403_tree);
					}

					pushFollow(FOLLOW_statement_in_statement4062);
					statement404=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement404.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 91, statement_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:599:1: catches : catchClause ( catchClause )* ;
	public final JavaJavaParser.catches_return catches() throws RecognitionException {
		JavaJavaParser.catches_return retval = new JavaJavaParser.catches_return();
		retval.start = input.LT(1);
		int catches_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope catchClause405 =null;
		ParserRuleReturnScope catchClause406 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:600:5: ( catchClause ( catchClause )* )
			// /home/tony/Downloads/JavaJava.g:600:9: catchClause ( catchClause )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_catchClause_in_catches4085);
			catchClause405=catchClause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClause405.getTree());

			// /home/tony/Downloads/JavaJava.g:600:21: ( catchClause )*
			loop120:
			while (true) {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==64) ) {
					alt120=1;
				}

				switch (alt120) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:600:22: catchClause
					{
					pushFollow(FOLLOW_catchClause_in_catches4088);
					catchClause406=catchClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClause406.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 92, catches_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:603:1: catchClause : 'catch' '(' formalParameter ')' block ;
	public final JavaJavaParser.catchClause_return catchClause() throws RecognitionException {
		JavaJavaParser.catchClause_return retval = new JavaJavaParser.catchClause_return();
		retval.start = input.LT(1);
		int catchClause_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal407=null;
		Token char_literal408=null;
		Token char_literal410=null;
		ParserRuleReturnScope formalParameter409 =null;
		ParserRuleReturnScope block411 =null;

		Object string_literal407_tree=null;
		Object char_literal408_tree=null;
		Object char_literal410_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:604:5: ( 'catch' '(' formalParameter ')' block )
			// /home/tony/Downloads/JavaJava.g:604:9: 'catch' '(' formalParameter ')' block
			{
			root_0 = (Object)adaptor.nil();


			string_literal407=(Token)match(input,64,FOLLOW_64_in_catchClause4113); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal407_tree = (Object)adaptor.create(string_literal407);
			adaptor.addChild(root_0, string_literal407_tree);
			}

			if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("catch");}
			char_literal408=(Token)match(input,32,FOLLOW_32_in_catchClause4116); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal408_tree = (Object)adaptor.create(char_literal408);
			adaptor.addChild(root_0, char_literal408_tree);
			}

			if ( state.backtracking==0 ) {s("(");}
			pushFollow(FOLLOW_formalParameter_in_catchClause4120);
			formalParameter409=formalParameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameter409.getTree());

			char_literal410=(Token)match(input,33,FOLLOW_33_in_catchClause4122); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal410_tree = (Object)adaptor.create(char_literal410);
			adaptor.addChild(root_0, char_literal410_tree);
			}

			if ( state.backtracking==0 ) {s(")");}
			pushFollow(FOLLOW_block_in_catchClause4126);
			block411=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block411.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 93, catchClause_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:607:1: formalParameter : variableModifiers type variableDeclaratorId ;
	public final JavaJavaParser.formalParameter_return formalParameter() throws RecognitionException {
		JavaJavaParser.formalParameter_return retval = new JavaJavaParser.formalParameter_return();
		retval.start = input.LT(1);
		int formalParameter_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope variableModifiers412 =null;
		ParserRuleReturnScope type413 =null;
		ParserRuleReturnScope variableDeclaratorId414 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:608:5: ( variableModifiers type variableDeclaratorId )
			// /home/tony/Downloads/JavaJava.g:608:9: variableModifiers type variableDeclaratorId
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableModifiers_in_formalParameter4145);
			variableModifiers412=variableModifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers412.getTree());

			pushFollow(FOLLOW_type_in_formalParameter4147);
			type413=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type413.getTree());

			pushFollow(FOLLOW_variableDeclaratorId_in_formalParameter4149);
			variableDeclaratorId414=variableDeclaratorId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId414.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 94, formalParameter_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:611:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
	public final JavaJavaParser.switchBlockStatementGroups_return switchBlockStatementGroups() throws RecognitionException {
		JavaJavaParser.switchBlockStatementGroups_return retval = new JavaJavaParser.switchBlockStatementGroups_return();
		retval.start = input.LT(1);
		int switchBlockStatementGroups_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope switchBlockStatementGroup415 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:612:5: ( ( switchBlockStatementGroup )* )
			// /home/tony/Downloads/JavaJava.g:612:9: ( switchBlockStatementGroup )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/tony/Downloads/JavaJava.g:612:9: ( switchBlockStatementGroup )*
			loop121:
			while (true) {
				int alt121=2;
				int LA121_0 = input.LA(1);
				if ( (LA121_0==63||LA121_0==68) ) {
					alt121=1;
				}

				switch (alt121) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:612:10: switchBlockStatementGroup
					{
					pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups4177);
					switchBlockStatementGroup415=switchBlockStatementGroup();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlockStatementGroup415.getTree());

					}
					break;

				default :
					break loop121;
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
			if ( state.backtracking>0 ) { memoize(input, 95, switchBlockStatementGroups_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:619:1: switchBlockStatementGroup : ( switchLabel )+ ( blockStatement )* ;
	public final JavaJavaParser.switchBlockStatementGroup_return switchBlockStatementGroup() throws RecognitionException {
		JavaJavaParser.switchBlockStatementGroup_return retval = new JavaJavaParser.switchBlockStatementGroup_return();
		retval.start = input.LT(1);
		int switchBlockStatementGroup_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope switchLabel416 =null;
		ParserRuleReturnScope blockStatement417 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:620:5: ( ( switchLabel )+ ( blockStatement )* )
			// /home/tony/Downloads/JavaJava.g:620:9: ( switchLabel )+ ( blockStatement )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/tony/Downloads/JavaJava.g:620:9: ( switchLabel )+
			int cnt122=0;
			loop122:
			while (true) {
				int alt122=2;
				int LA122_0 = input.LA(1);
				if ( (LA122_0==63) ) {
					int LA122_2 = input.LA(2);
					if ( (synpred178_JavaJava()) ) {
						alt122=1;
					}

				}
				else if ( (LA122_0==68) ) {
					int LA122_3 = input.LA(2);
					if ( (synpred178_JavaJava()) ) {
						alt122=1;
					}

				}

				switch (alt122) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:620:9: switchLabel
					{
					pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup4204);
					switchLabel416=switchLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchLabel416.getTree());

					}
					break;

				default :
					if ( cnt122 >= 1 ) break loop122;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(122, input);
					throw eee;
				}
				cnt122++;
			}

			// /home/tony/Downloads/JavaJava.g:620:22: ( blockStatement )*
			loop123:
			while (true) {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==ASSERT||(LA123_0 >= CharacterLiteral && LA123_0 <= ENUM)||LA123_0==FloatingPointLiteral||(LA123_0 >= HexLiteral && LA123_0 <= Identifier)||(LA123_0 >= OctalLiteral && LA123_0 <= StringLiteral)||LA123_0==25||LA123_0==32||(LA123_0 >= 36 && LA123_0 <= 37)||(LA123_0 >= 40 && LA123_0 <= 41)||LA123_0==48||LA123_0==54||(LA123_0 >= 59 && LA123_0 <= 62)||(LA123_0 >= 65 && LA123_0 <= 67)||(LA123_0 >= 69 && LA123_0 <= 70)||(LA123_0 >= 73 && LA123_0 <= 74)||(LA123_0 >= 76 && LA123_0 <= 78)||(LA123_0 >= 82 && LA123_0 <= 84)||(LA123_0 >= 86 && LA123_0 <= 87)||(LA123_0 >= 89 && LA123_0 <= 100)||(LA123_0 >= 103 && LA123_0 <= 105)||(LA123_0 >= 107 && LA123_0 <= 108)||LA123_0==113) ) {
					alt123=1;
				}

				switch (alt123) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:620:22: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup4207);
					blockStatement417=blockStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement417.getTree());

					}
					break;

				default :
					break loop123;
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
			if ( state.backtracking>0 ) { memoize(input, 96, switchBlockStatementGroup_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:623:1: switchLabel : ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' );
	public final JavaJavaParser.switchLabel_return switchLabel() throws RecognitionException {
		JavaJavaParser.switchLabel_return retval = new JavaJavaParser.switchLabel_return();
		retval.start = input.LT(1);
		int switchLabel_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal418=null;
		Token char_literal420=null;
		Token string_literal421=null;
		Token char_literal423=null;
		Token string_literal424=null;
		Token char_literal425=null;
		ParserRuleReturnScope constantExpression419 =null;
		ParserRuleReturnScope enumConstantName422 =null;

		Object string_literal418_tree=null;
		Object char_literal420_tree=null;
		Object string_literal421_tree=null;
		Object char_literal423_tree=null;
		Object string_literal424_tree=null;
		Object char_literal425_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:624:5: ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' )
			int alt124=3;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==63) ) {
				int LA124_1 = input.LA(2);
				if ( ((LA124_1 >= CharacterLiteral && LA124_1 <= DecimalLiteral)||LA124_1==FloatingPointLiteral||LA124_1==HexLiteral||(LA124_1 >= OctalLiteral && LA124_1 <= StringLiteral)||LA124_1==25||LA124_1==32||(LA124_1 >= 36 && LA124_1 <= 37)||(LA124_1 >= 40 && LA124_1 <= 41)||LA124_1==60||LA124_1==62||LA124_1==65||LA124_1==70||LA124_1==73||LA124_1==76||LA124_1==82||LA124_1==84||(LA124_1 >= 86 && LA124_1 <= 87)||LA124_1==93||LA124_1==96||LA124_1==99||LA124_1==103||LA124_1==105||LA124_1==113) ) {
					alt124=1;
				}
				else if ( (LA124_1==Identifier) ) {
					int LA124_4 = input.LA(3);
					if ( ((LA124_4 >= 26 && LA124_4 <= 32)||(LA124_4 >= 34 && LA124_4 <= 38)||(LA124_4 >= 40 && LA124_4 <= 43)||(LA124_4 >= 45 && LA124_4 <= 46)||(LA124_4 >= 49 && LA124_4 <= 53)||LA124_4==55||(LA124_4 >= 57 && LA124_4 <= 58)||LA124_4==81||(LA124_4 >= 109 && LA124_4 <= 111)) ) {
						alt124=1;
					}
					else if ( (LA124_4==47) ) {
						int LA124_5 = input.LA(4);
						if ( (synpred180_JavaJava()) ) {
							alt124=1;
						}
						else if ( (synpred181_JavaJava()) ) {
							alt124=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 124, 5, input);
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
								new NoViableAltException("", 124, 4, input);
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
							new NoViableAltException("", 124, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA124_0==68) ) {
				alt124=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}

			switch (alt124) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:624:9: 'case' constantExpression ':'
					{
					root_0 = (Object)adaptor.nil();


					string_literal418=(Token)match(input,63,FOLLOW_63_in_switchLabel4231); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal418_tree = (Object)adaptor.create(string_literal418);
					adaptor.addChild(root_0, string_literal418_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("case");mmc++;}
					pushFollow(FOLLOW_constantExpression_in_switchLabel4234);
					constantExpression419=constantExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constantExpression419.getTree());

					char_literal420=(Token)match(input,47,FOLLOW_47_in_switchLabel4236); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal420_tree = (Object)adaptor.create(char_literal420);
					adaptor.addChild(root_0, char_literal420_tree);
					}

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:625:9: 'case' enumConstantName ':'
					{
					root_0 = (Object)adaptor.nil();


					string_literal421=(Token)match(input,63,FOLLOW_63_in_switchLabel4246); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal421_tree = (Object)adaptor.create(string_literal421);
					adaptor.addChild(root_0, string_literal421_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("case");mmc++;}
					pushFollow(FOLLOW_enumConstantName_in_switchLabel4250);
					enumConstantName422=enumConstantName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumConstantName422.getTree());

					char_literal423=(Token)match(input,47,FOLLOW_47_in_switchLabel4252); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal423_tree = (Object)adaptor.create(char_literal423);
					adaptor.addChild(root_0, char_literal423_tree);
					}

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:626:9: 'default' ':'
					{
					root_0 = (Object)adaptor.nil();


					string_literal424=(Token)match(input,68,FOLLOW_68_in_switchLabel4262); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal424_tree = (Object)adaptor.create(string_literal424);
					adaptor.addChild(root_0, string_literal424_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("defult");mmc++;}
					char_literal425=(Token)match(input,47,FOLLOW_47_in_switchLabel4266); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal425_tree = (Object)adaptor.create(char_literal425);
					adaptor.addChild(root_0, char_literal425_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 97, switchLabel_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:629:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );
	public final JavaJavaParser.forControl_return forControl() throws RecognitionException {
		JavaJavaParser.forControl_return retval = new JavaJavaParser.forControl_return();
		retval.start = input.LT(1);
		int forControl_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal428=null;
		Token char_literal430=null;
		ParserRuleReturnScope enhancedForControl426 =null;
		ParserRuleReturnScope forInit427 =null;
		ParserRuleReturnScope expression429 =null;
		ParserRuleReturnScope forUpdate431 =null;

		Object char_literal428_tree=null;
		Object char_literal430_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:631:5: ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? )
			int alt128=2;
			alt128 = dfa128.predict(input);
			switch (alt128) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:631:9: enhancedForControl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enhancedForControl_in_forControl4297);
					enhancedForControl426=enhancedForControl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enhancedForControl426.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:632:9: ( forInit )? ';' ( expression )? ';' ( forUpdate )?
					{
					root_0 = (Object)adaptor.nil();


					// /home/tony/Downloads/JavaJava.g:632:9: ( forInit )?
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( ((LA125_0 >= CharacterLiteral && LA125_0 <= DecimalLiteral)||LA125_0==FloatingPointLiteral||(LA125_0 >= HexLiteral && LA125_0 <= Identifier)||(LA125_0 >= OctalLiteral && LA125_0 <= StringLiteral)||LA125_0==25||LA125_0==32||(LA125_0 >= 36 && LA125_0 <= 37)||(LA125_0 >= 40 && LA125_0 <= 41)||LA125_0==54||LA125_0==60||LA125_0==62||LA125_0==65||LA125_0==70||(LA125_0 >= 73 && LA125_0 <= 74)||LA125_0==76||LA125_0==82||LA125_0==84||(LA125_0 >= 86 && LA125_0 <= 87)||LA125_0==93||LA125_0==96||LA125_0==99||LA125_0==103||LA125_0==105||LA125_0==113) ) {
						alt125=1;
					}
					switch (alt125) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:632:9: forInit
							{
							pushFollow(FOLLOW_forInit_in_forControl4307);
							forInit427=forInit();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit427.getTree());

							}
							break;

					}

					char_literal428=(Token)match(input,48,FOLLOW_48_in_forControl4310); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal428_tree = (Object)adaptor.create(char_literal428);
					adaptor.addChild(root_0, char_literal428_tree);
					}

					// /home/tony/Downloads/JavaJava.g:632:22: ( expression )?
					int alt126=2;
					int LA126_0 = input.LA(1);
					if ( ((LA126_0 >= CharacterLiteral && LA126_0 <= DecimalLiteral)||LA126_0==FloatingPointLiteral||(LA126_0 >= HexLiteral && LA126_0 <= Identifier)||(LA126_0 >= OctalLiteral && LA126_0 <= StringLiteral)||LA126_0==25||LA126_0==32||(LA126_0 >= 36 && LA126_0 <= 37)||(LA126_0 >= 40 && LA126_0 <= 41)||LA126_0==60||LA126_0==62||LA126_0==65||LA126_0==70||LA126_0==73||LA126_0==76||LA126_0==82||LA126_0==84||(LA126_0 >= 86 && LA126_0 <= 87)||LA126_0==93||LA126_0==96||LA126_0==99||LA126_0==103||LA126_0==105||LA126_0==113) ) {
						alt126=1;
					}
					switch (alt126) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:632:22: expression
							{
							pushFollow(FOLLOW_expression_in_forControl4312);
							expression429=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression429.getTree());

							}
							break;

					}

					char_literal430=(Token)match(input,48,FOLLOW_48_in_forControl4315); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal430_tree = (Object)adaptor.create(char_literal430);
					adaptor.addChild(root_0, char_literal430_tree);
					}

					// /home/tony/Downloads/JavaJava.g:632:38: ( forUpdate )?
					int alt127=2;
					int LA127_0 = input.LA(1);
					if ( ((LA127_0 >= CharacterLiteral && LA127_0 <= DecimalLiteral)||LA127_0==FloatingPointLiteral||(LA127_0 >= HexLiteral && LA127_0 <= Identifier)||(LA127_0 >= OctalLiteral && LA127_0 <= StringLiteral)||LA127_0==25||LA127_0==32||(LA127_0 >= 36 && LA127_0 <= 37)||(LA127_0 >= 40 && LA127_0 <= 41)||LA127_0==60||LA127_0==62||LA127_0==65||LA127_0==70||LA127_0==73||LA127_0==76||LA127_0==82||LA127_0==84||(LA127_0 >= 86 && LA127_0 <= 87)||LA127_0==93||LA127_0==96||LA127_0==99||LA127_0==103||LA127_0==105||LA127_0==113) ) {
						alt127=1;
					}
					switch (alt127) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:632:38: forUpdate
							{
							pushFollow(FOLLOW_forUpdate_in_forControl4317);
							forUpdate431=forUpdate();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate431.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 98, forControl_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:635:1: forInit : ( localVariableDeclaration | expressionList );
	public final JavaJavaParser.forInit_return forInit() throws RecognitionException {
		JavaJavaParser.forInit_return retval = new JavaJavaParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope localVariableDeclaration432 =null;
		ParserRuleReturnScope expressionList433 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:636:5: ( localVariableDeclaration | expressionList )
			int alt129=2;
			switch ( input.LA(1) ) {
			case 54:
			case 74:
				{
				alt129=1;
				}
				break;
			case Identifier:
				{
				int LA129_3 = input.LA(2);
				if ( (synpred186_JavaJava()) ) {
					alt129=1;
				}
				else if ( (true) ) {
					alt129=2;
				}

				}
				break;
			case 60:
				{
				int LA129_4 = input.LA(2);
				if ( (synpred186_JavaJava()) ) {
					alt129=1;
				}
				else if ( (true) ) {
					alt129=2;
				}

				}
				break;
			case 65:
				{
				int LA129_5 = input.LA(2);
				if ( (synpred186_JavaJava()) ) {
					alt129=1;
				}
				else if ( (true) ) {
					alt129=2;
				}

				}
				break;
			case 62:
				{
				int LA129_6 = input.LA(2);
				if ( (synpred186_JavaJava()) ) {
					alt129=1;
				}
				else if ( (true) ) {
					alt129=2;
				}

				}
				break;
			case 93:
				{
				int LA129_7 = input.LA(2);
				if ( (synpred186_JavaJava()) ) {
					alt129=1;
				}
				else if ( (true) ) {
					alt129=2;
				}

				}
				break;
			case 82:
				{
				int LA129_8 = input.LA(2);
				if ( (synpred186_JavaJava()) ) {
					alt129=1;
				}
				else if ( (true) ) {
					alt129=2;
				}

				}
				break;
			case 84:
				{
				int LA129_9 = input.LA(2);
				if ( (synpred186_JavaJava()) ) {
					alt129=1;
				}
				else if ( (true) ) {
					alt129=2;
				}

				}
				break;
			case 76:
				{
				int LA129_10 = input.LA(2);
				if ( (synpred186_JavaJava()) ) {
					alt129=1;
				}
				else if ( (true) ) {
					alt129=2;
				}

				}
				break;
			case 70:
				{
				int LA129_11 = input.LA(2);
				if ( (synpred186_JavaJava()) ) {
					alt129=1;
				}
				else if ( (true) ) {
					alt129=2;
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
				alt129=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}
			switch (alt129) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:636:9: localVariableDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_localVariableDeclaration_in_forInit4337);
					localVariableDeclaration432=localVariableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration432.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:637:9: expressionList
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expressionList_in_forInit4348);
					expressionList433=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList433.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 99, forInit_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:640:1: enhancedForControl : variableModifiers type Identifier ':' expression ;
	public final JavaJavaParser.enhancedForControl_return enhancedForControl() throws RecognitionException {
		JavaJavaParser.enhancedForControl_return retval = new JavaJavaParser.enhancedForControl_return();
		retval.start = input.LT(1);
		int enhancedForControl_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier436=null;
		Token char_literal437=null;
		ParserRuleReturnScope variableModifiers434 =null;
		ParserRuleReturnScope type435 =null;
		ParserRuleReturnScope expression438 =null;

		Object Identifier436_tree=null;
		Object char_literal437_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:641:5: ( variableModifiers type Identifier ':' expression )
			// /home/tony/Downloads/JavaJava.g:641:9: variableModifiers type Identifier ':' expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableModifiers_in_enhancedForControl4371);
			variableModifiers434=variableModifiers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers434.getTree());

			pushFollow(FOLLOW_type_in_enhancedForControl4373);
			type435=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type435.getTree());

			Identifier436=(Token)match(input,Identifier,FOLLOW_Identifier_in_enhancedForControl4375); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier436_tree = (Object)adaptor.create(Identifier436);
			adaptor.addChild(root_0, Identifier436_tree);
			}

			if ( state.backtracking==0 ) { id((Identifier436!=null?Identifier436.getText():null));}
			char_literal437=(Token)match(input,47,FOLLOW_47_in_enhancedForControl4379); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal437_tree = (Object)adaptor.create(char_literal437);
			adaptor.addChild(root_0, char_literal437_tree);
			}

			pushFollow(FOLLOW_expression_in_enhancedForControl4381);
			expression438=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression438.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 100, enhancedForControl_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:644:1: forUpdate : expressionList ;
	public final JavaJavaParser.forUpdate_return forUpdate() throws RecognitionException {
		JavaJavaParser.forUpdate_return retval = new JavaJavaParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope expressionList439 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:645:5: ( expressionList )
			// /home/tony/Downloads/JavaJava.g:645:9: expressionList
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expressionList_in_forUpdate4400);
			expressionList439=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList439.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 101, forUpdate_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:650:1: parExpression : '(' expression ')' ;
	public final JavaJavaParser.parExpression_return parExpression() throws RecognitionException {
		JavaJavaParser.parExpression_return retval = new JavaJavaParser.parExpression_return();
		retval.start = input.LT(1);
		int parExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal440=null;
		Token char_literal442=null;
		ParserRuleReturnScope expression441 =null;

		Object char_literal440_tree=null;
		Object char_literal442_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:651:5: ( '(' expression ')' )
			// /home/tony/Downloads/JavaJava.g:651:9: '(' expression ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal440=(Token)match(input,32,FOLLOW_32_in_parExpression4421); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal440_tree = (Object)adaptor.create(char_literal440);
			adaptor.addChild(root_0, char_literal440_tree);
			}

			if ( state.backtracking==0 ) {s("(");}
			pushFollow(FOLLOW_expression_in_parExpression4424);
			expression441=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression441.getTree());

			char_literal442=(Token)match(input,33,FOLLOW_33_in_parExpression4426); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal442_tree = (Object)adaptor.create(char_literal442);
			adaptor.addChild(root_0, char_literal442_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 102, parExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:654:1: expressionList : expression ( ',' expression )* ;
	public final JavaJavaParser.expressionList_return expressionList() throws RecognitionException {
		JavaJavaParser.expressionList_return retval = new JavaJavaParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal444=null;
		ParserRuleReturnScope expression443 =null;
		ParserRuleReturnScope expression445 =null;

		Object char_literal444_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:655:5: ( expression ( ',' expression )* )
			// /home/tony/Downloads/JavaJava.g:655:9: expression ( ',' expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList4451);
			expression443=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression443.getTree());

			// /home/tony/Downloads/JavaJava.g:655:20: ( ',' expression )*
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==39) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:655:21: ',' expression
					{
					char_literal444=(Token)match(input,39,FOLLOW_39_in_expressionList4454); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal444_tree = (Object)adaptor.create(char_literal444);
					adaptor.addChild(root_0, char_literal444_tree);
					}

					if ( state.backtracking==0 ) {s(",");}
					pushFollow(FOLLOW_expression_in_expressionList4457);
					expression445=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression445.getTree());

					}
					break;

				default :
					break loop130;
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
			if ( state.backtracking>0 ) { memoize(input, 103, expressionList_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:658:1: statementExpression : expression ;
	public final JavaJavaParser.statementExpression_return statementExpression() throws RecognitionException {
		JavaJavaParser.statementExpression_return retval = new JavaJavaParser.statementExpression_return();
		retval.start = input.LT(1);
		int statementExpression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope expression446 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:659:5: ( expression )
			// /home/tony/Downloads/JavaJava.g:659:9: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_statementExpression4478);
			expression446=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression446.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 104, statementExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:662:1: constantExpression : expression ;
	public final JavaJavaParser.constantExpression_return constantExpression() throws RecognitionException {
		JavaJavaParser.constantExpression_return retval = new JavaJavaParser.constantExpression_return();
		retval.start = input.LT(1);
		int constantExpression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope expression447 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:663:5: ( expression )
			// /home/tony/Downloads/JavaJava.g:663:9: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_constantExpression4502);
			expression447=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression447.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 105, constantExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:666:1: expression : conditionalExpression ( assignmentOperator expression )? ;
	public final JavaJavaParser.expression_return expression() throws RecognitionException {
		JavaJavaParser.expression_return retval = new JavaJavaParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope conditionalExpression448 =null;
		ParserRuleReturnScope assignmentOperator449 =null;
		ParserRuleReturnScope expression450 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:667:5: ( conditionalExpression ( assignmentOperator expression )? )
			// /home/tony/Downloads/JavaJava.g:667:9: conditionalExpression ( assignmentOperator expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_conditionalExpression_in_expression4525);
			conditionalExpression448=conditionalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression448.getTree());

			// /home/tony/Downloads/JavaJava.g:667:31: ( assignmentOperator expression )?
			int alt131=2;
			switch ( input.LA(1) ) {
				case 50:
					{
					int LA131_1 = input.LA(2);
					if ( (synpred188_JavaJava()) ) {
						alt131=1;
					}
					}
					break;
				case 38:
					{
					int LA131_2 = input.LA(2);
					if ( (synpred188_JavaJava()) ) {
						alt131=1;
					}
					}
					break;
				case 42:
					{
					int LA131_3 = input.LA(2);
					if ( (synpred188_JavaJava()) ) {
						alt131=1;
					}
					}
					break;
				case 35:
					{
					int LA131_4 = input.LA(2);
					if ( (synpred188_JavaJava()) ) {
						alt131=1;
					}
					}
					break;
				case 46:
					{
					int LA131_5 = input.LA(2);
					if ( (synpred188_JavaJava()) ) {
						alt131=1;
					}
					}
					break;
				case 31:
					{
					int LA131_6 = input.LA(2);
					if ( (synpred188_JavaJava()) ) {
						alt131=1;
					}
					}
					break;
				case 110:
					{
					int LA131_7 = input.LA(2);
					if ( (synpred188_JavaJava()) ) {
						alt131=1;
					}
					}
					break;
				case 58:
					{
					int LA131_8 = input.LA(2);
					if ( (synpred188_JavaJava()) ) {
						alt131=1;
					}
					}
					break;
				case 28:
					{
					int LA131_9 = input.LA(2);
					if ( (synpred188_JavaJava()) ) {
						alt131=1;
					}
					}
					break;
				case 49:
					{
					int LA131_10 = input.LA(2);
					if ( (synpred188_JavaJava()) ) {
						alt131=1;
					}
					}
					break;
				case 52:
					{
					int LA131_11 = input.LA(2);
					if ( (synpred188_JavaJava()) ) {
						alt131=1;
					}
					}
					break;
			}
			switch (alt131) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:667:32: assignmentOperator expression
					{
					pushFollow(FOLLOW_assignmentOperator_in_expression4528);
					assignmentOperator449=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOperator449.getTree());

					pushFollow(FOLLOW_expression_in_expression4530);
					expression450=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression450.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 106, expression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:670:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?| ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?| ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?);
	public final JavaJavaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		JavaJavaParser.assignmentOperator_return retval = new JavaJavaParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		Object root_0 = null;

		Token t1=null;
		Token t2=null;
		Token t3=null;
		Token t4=null;
		Token char_literal451=null;
		Token string_literal452=null;
		Token string_literal453=null;
		Token string_literal454=null;
		Token string_literal455=null;
		Token string_literal456=null;
		Token string_literal457=null;
		Token string_literal458=null;
		Token string_literal459=null;

		Object t1_tree=null;
		Object t2_tree=null;
		Object t3_tree=null;
		Object t4_tree=null;
		Object char_literal451_tree=null;
		Object string_literal452_tree=null;
		Object string_literal453_tree=null;
		Object string_literal454_tree=null;
		Object string_literal455_tree=null;
		Object string_literal456_tree=null;
		Object string_literal457_tree=null;
		Object string_literal458_tree=null;
		Object string_literal459_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:671:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?| ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?| ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?)
			int alt132=12;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==50) ) {
				alt132=1;
			}
			else if ( (LA132_0==38) ) {
				alt132=2;
			}
			else if ( (LA132_0==42) ) {
				alt132=3;
			}
			else if ( (LA132_0==35) ) {
				alt132=4;
			}
			else if ( (LA132_0==46) ) {
				alt132=5;
			}
			else if ( (LA132_0==31) ) {
				alt132=6;
			}
			else if ( (LA132_0==110) ) {
				alt132=7;
			}
			else if ( (LA132_0==58) ) {
				alt132=8;
			}
			else if ( (LA132_0==28) ) {
				alt132=9;
			}
			else if ( (LA132_0==49) && (synpred198_JavaJava())) {
				alt132=10;
			}
			else if ( (LA132_0==52) ) {
				int LA132_11 = input.LA(2);
				if ( (LA132_11==52) ) {
					int LA132_12 = input.LA(3);
					if ( (LA132_12==52) && (synpred199_JavaJava())) {
						alt132=11;
					}
					else if ( (LA132_12==50) && (synpred200_JavaJava())) {
						alt132=12;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 132, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}

			switch (alt132) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:671:9: '='
					{
					root_0 = (Object)adaptor.nil();


					char_literal451=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4555); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal451_tree = (Object)adaptor.create(char_literal451);
					adaptor.addChild(root_0, char_literal451_tree);
					}

					if ( state.backtracking==0 ) {s("=");}
					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:672:9: '+='
					{
					root_0 = (Object)adaptor.nil();


					string_literal452=(Token)match(input,38,FOLLOW_38_in_assignmentOperator4567); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal452_tree = (Object)adaptor.create(string_literal452);
					adaptor.addChild(root_0, string_literal452_tree);
					}

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:673:9: '-='
					{
					root_0 = (Object)adaptor.nil();


					string_literal453=(Token)match(input,42,FOLLOW_42_in_assignmentOperator4577); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal453_tree = (Object)adaptor.create(string_literal453);
					adaptor.addChild(root_0, string_literal453_tree);
					}

					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:674:9: '*='
					{
					root_0 = (Object)adaptor.nil();


					string_literal454=(Token)match(input,35,FOLLOW_35_in_assignmentOperator4587); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal454_tree = (Object)adaptor.create(string_literal454);
					adaptor.addChild(root_0, string_literal454_tree);
					}

					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:675:9: '/='
					{
					root_0 = (Object)adaptor.nil();


					string_literal455=(Token)match(input,46,FOLLOW_46_in_assignmentOperator4597); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal455_tree = (Object)adaptor.create(string_literal455);
					adaptor.addChild(root_0, string_literal455_tree);
					}

					}
					break;
				case 6 :
					// /home/tony/Downloads/JavaJava.g:676:9: '&='
					{
					root_0 = (Object)adaptor.nil();


					string_literal456=(Token)match(input,31,FOLLOW_31_in_assignmentOperator4607); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal456_tree = (Object)adaptor.create(string_literal456);
					adaptor.addChild(root_0, string_literal456_tree);
					}

					}
					break;
				case 7 :
					// /home/tony/Downloads/JavaJava.g:677:9: '|='
					{
					root_0 = (Object)adaptor.nil();


					string_literal457=(Token)match(input,110,FOLLOW_110_in_assignmentOperator4617); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal457_tree = (Object)adaptor.create(string_literal457);
					adaptor.addChild(root_0, string_literal457_tree);
					}

					}
					break;
				case 8 :
					// /home/tony/Downloads/JavaJava.g:678:9: '^='
					{
					root_0 = (Object)adaptor.nil();


					string_literal458=(Token)match(input,58,FOLLOW_58_in_assignmentOperator4627); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal458_tree = (Object)adaptor.create(string_literal458);
					adaptor.addChild(root_0, string_literal458_tree);
					}

					}
					break;
				case 9 :
					// /home/tony/Downloads/JavaJava.g:679:9: '%='
					{
					root_0 = (Object)adaptor.nil();


					string_literal459=(Token)match(input,28,FOLLOW_28_in_assignmentOperator4637); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal459_tree = (Object)adaptor.create(string_literal459);
					adaptor.addChild(root_0, string_literal459_tree);
					}

					}
					break;
				case 10 :
					// /home/tony/Downloads/JavaJava.g:680:9: ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,49,FOLLOW_49_in_assignmentOperator4658); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,49,FOLLOW_49_in_assignmentOperator4662); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					t3=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4666); if (state.failed) return retval;
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
					// /home/tony/Downloads/JavaJava.g:685:9: ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4700); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4704); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					t3=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4708); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t3_tree = (Object)adaptor.create(t3);
					adaptor.addChild(root_0, t3_tree);
					}

					t4=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4712); if (state.failed) return retval;
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
					// /home/tony/Downloads/JavaJava.g:692:9: ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4743); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4747); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					t3=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4751); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 107, assignmentOperator_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:699:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' expression )? ;
	public final JavaJavaParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		JavaJavaParser.conditionalExpression_return retval = new JavaJavaParser.conditionalExpression_return();
		retval.start = input.LT(1);
		int conditionalExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal461=null;
		Token char_literal463=null;
		ParserRuleReturnScope conditionalOrExpression460 =null;
		ParserRuleReturnScope expression462 =null;
		ParserRuleReturnScope expression464 =null;

		Object char_literal461_tree=null;
		Object char_literal463_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:700:5: ( conditionalOrExpression ( '?' expression ':' expression )? )
			// /home/tony/Downloads/JavaJava.g:700:9: conditionalOrExpression ( '?' expression ':' expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression4780);
			conditionalOrExpression460=conditionalOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression460.getTree());

			// /home/tony/Downloads/JavaJava.g:700:33: ( '?' expression ':' expression )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==53) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:700:35: '?' expression ':' expression
					{
					char_literal461=(Token)match(input,53,FOLLOW_53_in_conditionalExpression4784); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal461_tree = (Object)adaptor.create(char_literal461);
					adaptor.addChild(root_0, char_literal461_tree);
					}

					pushFollow(FOLLOW_expression_in_conditionalExpression4786);
					expression462=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression462.getTree());

					char_literal463=(Token)match(input,47,FOLLOW_47_in_conditionalExpression4788); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal463_tree = (Object)adaptor.create(char_literal463);
					adaptor.addChild(root_0, char_literal463_tree);
					}

					pushFollow(FOLLOW_expression_in_conditionalExpression4790);
					expression464=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression464.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 108, conditionalExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:703:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
	public final JavaJavaParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
		JavaJavaParser.conditionalOrExpression_return retval = new JavaJavaParser.conditionalOrExpression_return();
		retval.start = input.LT(1);
		int conditionalOrExpression_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal466=null;
		ParserRuleReturnScope conditionalAndExpression465 =null;
		ParserRuleReturnScope conditionalAndExpression467 =null;

		Object string_literal466_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:704:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
			// /home/tony/Downloads/JavaJava.g:704:9: conditionalAndExpression ( '||' conditionalAndExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression4812);
			conditionalAndExpression465=conditionalAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression465.getTree());

			// /home/tony/Downloads/JavaJava.g:704:34: ( '||' conditionalAndExpression )*
			loop134:
			while (true) {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==111) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:704:36: '||' conditionalAndExpression
					{
					string_literal466=(Token)match(input,111,FOLLOW_111_in_conditionalOrExpression4816); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal466_tree = (Object)adaptor.create(string_literal466);
					adaptor.addChild(root_0, string_literal466_tree);
					}

					if ( state.backtracking==0 ) {s("||"); mmc++;}
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression4820);
					conditionalAndExpression467=conditionalAndExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression467.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 109, conditionalOrExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:707:1: conditionalAndExpression : inclusiveOrExpression ( '&&' inclusiveOrExpression )* ;
	public final JavaJavaParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
		JavaJavaParser.conditionalAndExpression_return retval = new JavaJavaParser.conditionalAndExpression_return();
		retval.start = input.LT(1);
		int conditionalAndExpression_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal469=null;
		ParserRuleReturnScope inclusiveOrExpression468 =null;
		ParserRuleReturnScope inclusiveOrExpression470 =null;

		Object string_literal469_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:708:5: ( inclusiveOrExpression ( '&&' inclusiveOrExpression )* )
			// /home/tony/Downloads/JavaJava.g:708:9: inclusiveOrExpression ( '&&' inclusiveOrExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4842);
			inclusiveOrExpression468=inclusiveOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression468.getTree());

			// /home/tony/Downloads/JavaJava.g:708:31: ( '&&' inclusiveOrExpression )*
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==29) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:708:33: '&&' inclusiveOrExpression
					{
					string_literal469=(Token)match(input,29,FOLLOW_29_in_conditionalAndExpression4846); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal469_tree = (Object)adaptor.create(string_literal469);
					adaptor.addChild(root_0, string_literal469_tree);
					}

					if ( state.backtracking==0 ) {s("&&"); mmc++;}
					pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4850);
					inclusiveOrExpression470=inclusiveOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression470.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 110, conditionalAndExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:711:1: inclusiveOrExpression : exclusiveOrExpression ( '|' exclusiveOrExpression )* ;
	public final JavaJavaParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
		JavaJavaParser.inclusiveOrExpression_return retval = new JavaJavaParser.inclusiveOrExpression_return();
		retval.start = input.LT(1);
		int inclusiveOrExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal472=null;
		ParserRuleReturnScope exclusiveOrExpression471 =null;
		ParserRuleReturnScope exclusiveOrExpression473 =null;

		Object char_literal472_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:712:5: ( exclusiveOrExpression ( '|' exclusiveOrExpression )* )
			// /home/tony/Downloads/JavaJava.g:712:9: exclusiveOrExpression ( '|' exclusiveOrExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4872);
			exclusiveOrExpression471=exclusiveOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression471.getTree());

			// /home/tony/Downloads/JavaJava.g:712:31: ( '|' exclusiveOrExpression )*
			loop136:
			while (true) {
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==109) ) {
					alt136=1;
				}

				switch (alt136) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:712:33: '|' exclusiveOrExpression
					{
					char_literal472=(Token)match(input,109,FOLLOW_109_in_inclusiveOrExpression4876); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal472_tree = (Object)adaptor.create(char_literal472);
					adaptor.addChild(root_0, char_literal472_tree);
					}

					if ( state.backtracking==0 ) {s("|"); }
					pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4880);
					exclusiveOrExpression473=exclusiveOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression473.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 111, inclusiveOrExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:715:1: exclusiveOrExpression : andExpression ( '^' andExpression )* ;
	public final JavaJavaParser.exclusiveOrExpression_return exclusiveOrExpression() throws RecognitionException {
		JavaJavaParser.exclusiveOrExpression_return retval = new JavaJavaParser.exclusiveOrExpression_return();
		retval.start = input.LT(1);
		int exclusiveOrExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal475=null;
		ParserRuleReturnScope andExpression474 =null;
		ParserRuleReturnScope andExpression476 =null;

		Object char_literal475_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:716:5: ( andExpression ( '^' andExpression )* )
			// /home/tony/Downloads/JavaJava.g:716:9: andExpression ( '^' andExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression4902);
			andExpression474=andExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression474.getTree());

			// /home/tony/Downloads/JavaJava.g:716:23: ( '^' andExpression )*
			loop137:
			while (true) {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==57) ) {
					alt137=1;
				}

				switch (alt137) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:716:25: '^' andExpression
					{
					char_literal475=(Token)match(input,57,FOLLOW_57_in_exclusiveOrExpression4906); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal475_tree = (Object)adaptor.create(char_literal475);
					adaptor.addChild(root_0, char_literal475_tree);
					}

					pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression4908);
					andExpression476=andExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression476.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 112, exclusiveOrExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:719:1: andExpression : equalityExpression ( '&' equalityExpression )* ;
	public final JavaJavaParser.andExpression_return andExpression() throws RecognitionException {
		JavaJavaParser.andExpression_return retval = new JavaJavaParser.andExpression_return();
		retval.start = input.LT(1);
		int andExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal478=null;
		ParserRuleReturnScope equalityExpression477 =null;
		ParserRuleReturnScope equalityExpression479 =null;

		Object char_literal478_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:720:5: ( equalityExpression ( '&' equalityExpression )* )
			// /home/tony/Downloads/JavaJava.g:720:9: equalityExpression ( '&' equalityExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_andExpression4930);
			equalityExpression477=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression477.getTree());

			// /home/tony/Downloads/JavaJava.g:720:28: ( '&' equalityExpression )*
			loop138:
			while (true) {
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==30) ) {
					alt138=1;
				}

				switch (alt138) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:720:30: '&' equalityExpression
					{
					char_literal478=(Token)match(input,30,FOLLOW_30_in_andExpression4934); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal478_tree = (Object)adaptor.create(char_literal478);
					adaptor.addChild(root_0, char_literal478_tree);
					}

					if ( state.backtracking==0 ) {s("&");}
					pushFollow(FOLLOW_equalityExpression_in_andExpression4938);
					equalityExpression479=equalityExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression479.getTree());

					}
					break;

				default :
					break loop138;
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
			if ( state.backtracking>0 ) { memoize(input, 113, andExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:723:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
	public final JavaJavaParser.equalityExpression_return equalityExpression() throws RecognitionException {
		JavaJavaParser.equalityExpression_return retval = new JavaJavaParser.equalityExpression_return();
		retval.start = input.LT(1);
		int equalityExpression_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal481=null;
		Token string_literal482=null;
		ParserRuleReturnScope instanceOfExpression480 =null;
		ParserRuleReturnScope instanceOfExpression483 =null;

		Object string_literal481_tree=null;
		Object string_literal482_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:724:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
			// /home/tony/Downloads/JavaJava.g:724:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression4960);
			instanceOfExpression480=instanceOfExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression480.getTree());

			// /home/tony/Downloads/JavaJava.g:724:30: ( ( '==' | '!=' ) instanceOfExpression )*
			loop140:
			while (true) {
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==26||LA140_0==51) ) {
					alt140=1;
				}

				switch (alt140) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:724:32: ( '==' | '!=' ) instanceOfExpression
					{
					// /home/tony/Downloads/JavaJava.g:724:32: ( '==' | '!=' )
					int alt139=2;
					int LA139_0 = input.LA(1);
					if ( (LA139_0==51) ) {
						alt139=1;
					}
					else if ( (LA139_0==26) ) {
						alt139=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 139, 0, input);
						throw nvae;
					}

					switch (alt139) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:724:33: '=='
							{
							string_literal481=(Token)match(input,51,FOLLOW_51_in_equalityExpression4965); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal481_tree = (Object)adaptor.create(string_literal481);
							adaptor.addChild(root_0, string_literal481_tree);
							}

							if ( state.backtracking==0 ) {s("==");}
							}
							break;
						case 2 :
							// /home/tony/Downloads/JavaJava.g:724:50: '!='
							{
							string_literal482=(Token)match(input,26,FOLLOW_26_in_equalityExpression4970); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal482_tree = (Object)adaptor.create(string_literal482);
							adaptor.addChild(root_0, string_literal482_tree);
							}

							if ( state.backtracking==0 ) {s("!=");}
							}
							break;

					}

					pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression4975);
					instanceOfExpression483=instanceOfExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression483.getTree());

					}
					break;

				default :
					break loop140;
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
			if ( state.backtracking>0 ) { memoize(input, 114, equalityExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:727:1: instanceOfExpression : relationalExpression ( 'instanceof' type )? ;
	public final JavaJavaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
		JavaJavaParser.instanceOfExpression_return retval = new JavaJavaParser.instanceOfExpression_return();
		retval.start = input.LT(1);
		int instanceOfExpression_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal485=null;
		ParserRuleReturnScope relationalExpression484 =null;
		ParserRuleReturnScope type486 =null;

		Object string_literal485_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:728:5: ( relationalExpression ( 'instanceof' type )? )
			// /home/tony/Downloads/JavaJava.g:728:9: relationalExpression ( 'instanceof' type )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression4997);
			relationalExpression484=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression484.getTree());

			// /home/tony/Downloads/JavaJava.g:728:30: ( 'instanceof' type )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==81) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:728:31: 'instanceof' type
					{
					string_literal485=(Token)match(input,81,FOLLOW_81_in_instanceOfExpression5000); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal485_tree = (Object)adaptor.create(string_literal485);
					adaptor.addChild(root_0, string_literal485_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("instanceof");}
					pushFollow(FOLLOW_type_in_instanceOfExpression5003);
					type486=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type486.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 115, instanceOfExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:731:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
	public final JavaJavaParser.relationalExpression_return relationalExpression() throws RecognitionException {
		JavaJavaParser.relationalExpression_return retval = new JavaJavaParser.relationalExpression_return();
		retval.start = input.LT(1);
		int relationalExpression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope shiftExpression487 =null;
		ParserRuleReturnScope relationalOp488 =null;
		ParserRuleReturnScope shiftExpression489 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:732:5: ( shiftExpression ( relationalOp shiftExpression )* )
			// /home/tony/Downloads/JavaJava.g:732:9: shiftExpression ( relationalOp shiftExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_shiftExpression_in_relationalExpression5024);
			shiftExpression487=shiftExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression487.getTree());

			// /home/tony/Downloads/JavaJava.g:732:25: ( relationalOp shiftExpression )*
			loop142:
			while (true) {
				int alt142=2;
				int LA142_0 = input.LA(1);
				if ( (LA142_0==49) ) {
					int LA142_2 = input.LA(2);
					if ( ((LA142_2 >= CharacterLiteral && LA142_2 <= DecimalLiteral)||LA142_2==FloatingPointLiteral||(LA142_2 >= HexLiteral && LA142_2 <= Identifier)||(LA142_2 >= OctalLiteral && LA142_2 <= StringLiteral)||LA142_2==25||LA142_2==32||(LA142_2 >= 36 && LA142_2 <= 37)||(LA142_2 >= 40 && LA142_2 <= 41)||LA142_2==50||LA142_2==60||LA142_2==62||LA142_2==65||LA142_2==70||LA142_2==73||LA142_2==76||LA142_2==82||LA142_2==84||(LA142_2 >= 86 && LA142_2 <= 87)||LA142_2==93||LA142_2==96||LA142_2==99||LA142_2==103||LA142_2==105||LA142_2==113) ) {
						alt142=1;
					}

				}
				else if ( (LA142_0==52) ) {
					int LA142_3 = input.LA(2);
					if ( ((LA142_3 >= CharacterLiteral && LA142_3 <= DecimalLiteral)||LA142_3==FloatingPointLiteral||(LA142_3 >= HexLiteral && LA142_3 <= Identifier)||(LA142_3 >= OctalLiteral && LA142_3 <= StringLiteral)||LA142_3==25||LA142_3==32||(LA142_3 >= 36 && LA142_3 <= 37)||(LA142_3 >= 40 && LA142_3 <= 41)||LA142_3==50||LA142_3==60||LA142_3==62||LA142_3==65||LA142_3==70||LA142_3==73||LA142_3==76||LA142_3==82||LA142_3==84||(LA142_3 >= 86 && LA142_3 <= 87)||LA142_3==93||LA142_3==96||LA142_3==99||LA142_3==103||LA142_3==105||LA142_3==113) ) {
						alt142=1;
					}

				}

				switch (alt142) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:732:27: relationalOp shiftExpression
					{
					pushFollow(FOLLOW_relationalOp_in_relationalExpression5028);
					relationalOp488=relationalOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalOp488.getTree());

					pushFollow(FOLLOW_shiftExpression_in_relationalExpression5030);
					shiftExpression489=shiftExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression489.getTree());

					}
					break;

				default :
					break loop142;
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
			if ( state.backtracking>0 ) { memoize(input, 116, relationalExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:735:1: relationalOp : ( ( '<' '=' )=>t1= '<' t2= '=' {...}?| ( '>' '=' )=>t1= '>' t2= '=' {...}?| '<' | '>' );
	public final JavaJavaParser.relationalOp_return relationalOp() throws RecognitionException {
		JavaJavaParser.relationalOp_return retval = new JavaJavaParser.relationalOp_return();
		retval.start = input.LT(1);
		int relationalOp_StartIndex = input.index();

		Object root_0 = null;

		Token t1=null;
		Token t2=null;
		Token char_literal490=null;
		Token char_literal491=null;

		Object t1_tree=null;
		Object t2_tree=null;
		Object char_literal490_tree=null;
		Object char_literal491_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:736:5: ( ( '<' '=' )=>t1= '<' t2= '=' {...}?| ( '>' '=' )=>t1= '>' t2= '=' {...}?| '<' | '>' )
			int alt143=4;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==49) ) {
				int LA143_1 = input.LA(2);
				if ( (LA143_1==50) && (synpred211_JavaJava())) {
					alt143=1;
				}
				else if ( ((LA143_1 >= CharacterLiteral && LA143_1 <= DecimalLiteral)||LA143_1==FloatingPointLiteral||(LA143_1 >= HexLiteral && LA143_1 <= Identifier)||(LA143_1 >= OctalLiteral && LA143_1 <= StringLiteral)||LA143_1==25||LA143_1==32||(LA143_1 >= 36 && LA143_1 <= 37)||(LA143_1 >= 40 && LA143_1 <= 41)||LA143_1==60||LA143_1==62||LA143_1==65||LA143_1==70||LA143_1==73||LA143_1==76||LA143_1==82||LA143_1==84||(LA143_1 >= 86 && LA143_1 <= 87)||LA143_1==93||LA143_1==96||LA143_1==99||LA143_1==103||LA143_1==105||LA143_1==113) ) {
					alt143=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 143, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA143_0==52) ) {
				int LA143_2 = input.LA(2);
				if ( (LA143_2==50) && (synpred212_JavaJava())) {
					alt143=2;
				}
				else if ( ((LA143_2 >= CharacterLiteral && LA143_2 <= DecimalLiteral)||LA143_2==FloatingPointLiteral||(LA143_2 >= HexLiteral && LA143_2 <= Identifier)||(LA143_2 >= OctalLiteral && LA143_2 <= StringLiteral)||LA143_2==25||LA143_2==32||(LA143_2 >= 36 && LA143_2 <= 37)||(LA143_2 >= 40 && LA143_2 <= 41)||LA143_2==60||LA143_2==62||LA143_2==65||LA143_2==70||LA143_2==73||LA143_2==76||LA143_2==82||LA143_2==84||(LA143_2 >= 86 && LA143_2 <= 87)||LA143_2==93||LA143_2==96||LA143_2==99||LA143_2==103||LA143_2==105||LA143_2==113) ) {
					alt143=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 143, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 143, 0, input);
				throw nvae;
			}

			switch (alt143) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:736:9: ( '<' '=' )=>t1= '<' t2= '=' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,49,FOLLOW_49_in_relationalOp5065); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,50,FOLLOW_50_in_relationalOp5069); if (state.failed) return retval;
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
					// /home/tony/Downloads/JavaJava.g:739:9: ( '>' '=' )=>t1= '>' t2= '=' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,52,FOLLOW_52_in_relationalOp5099); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,50,FOLLOW_50_in_relationalOp5103); if (state.failed) return retval;
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
					// /home/tony/Downloads/JavaJava.g:742:9: '<'
					{
					root_0 = (Object)adaptor.nil();


					char_literal490=(Token)match(input,49,FOLLOW_49_in_relationalOp5124); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal490_tree = (Object)adaptor.create(char_literal490);
					adaptor.addChild(root_0, char_literal490_tree);
					}

					if ( state.backtracking==0 ) {s("<");}
					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:743:9: '>'
					{
					root_0 = (Object)adaptor.nil();


					char_literal491=(Token)match(input,52,FOLLOW_52_in_relationalOp5136); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal491_tree = (Object)adaptor.create(char_literal491);
					adaptor.addChild(root_0, char_literal491_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 117, relationalOp_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:746:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
	public final JavaJavaParser.shiftExpression_return shiftExpression() throws RecognitionException {
		JavaJavaParser.shiftExpression_return retval = new JavaJavaParser.shiftExpression_return();
		retval.start = input.LT(1);
		int shiftExpression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope additiveExpression492 =null;
		ParserRuleReturnScope shiftOp493 =null;
		ParserRuleReturnScope additiveExpression494 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:747:5: ( additiveExpression ( shiftOp additiveExpression )* )
			// /home/tony/Downloads/JavaJava.g:747:9: additiveExpression ( shiftOp additiveExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_shiftExpression5157);
			additiveExpression492=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression492.getTree());

			// /home/tony/Downloads/JavaJava.g:747:28: ( shiftOp additiveExpression )*
			loop144:
			while (true) {
				int alt144=2;
				int LA144_0 = input.LA(1);
				if ( (LA144_0==49) ) {
					int LA144_1 = input.LA(2);
					if ( (LA144_1==49) ) {
						int LA144_4 = input.LA(3);
						if ( ((LA144_4 >= CharacterLiteral && LA144_4 <= DecimalLiteral)||LA144_4==FloatingPointLiteral||(LA144_4 >= HexLiteral && LA144_4 <= Identifier)||(LA144_4 >= OctalLiteral && LA144_4 <= StringLiteral)||LA144_4==25||LA144_4==32||(LA144_4 >= 36 && LA144_4 <= 37)||(LA144_4 >= 40 && LA144_4 <= 41)||LA144_4==60||LA144_4==62||LA144_4==65||LA144_4==70||LA144_4==73||LA144_4==76||LA144_4==82||LA144_4==84||(LA144_4 >= 86 && LA144_4 <= 87)||LA144_4==93||LA144_4==96||LA144_4==99||LA144_4==103||LA144_4==105||LA144_4==113) ) {
							alt144=1;
						}

					}

				}
				else if ( (LA144_0==52) ) {
					int LA144_2 = input.LA(2);
					if ( (LA144_2==52) ) {
						int LA144_5 = input.LA(3);
						if ( (LA144_5==52) ) {
							int LA144_7 = input.LA(4);
							if ( ((LA144_7 >= CharacterLiteral && LA144_7 <= DecimalLiteral)||LA144_7==FloatingPointLiteral||(LA144_7 >= HexLiteral && LA144_7 <= Identifier)||(LA144_7 >= OctalLiteral && LA144_7 <= StringLiteral)||LA144_7==25||LA144_7==32||(LA144_7 >= 36 && LA144_7 <= 37)||(LA144_7 >= 40 && LA144_7 <= 41)||LA144_7==60||LA144_7==62||LA144_7==65||LA144_7==70||LA144_7==73||LA144_7==76||LA144_7==82||LA144_7==84||(LA144_7 >= 86 && LA144_7 <= 87)||LA144_7==93||LA144_7==96||LA144_7==99||LA144_7==103||LA144_7==105||LA144_7==113) ) {
								alt144=1;
							}

						}
						else if ( ((LA144_5 >= CharacterLiteral && LA144_5 <= DecimalLiteral)||LA144_5==FloatingPointLiteral||(LA144_5 >= HexLiteral && LA144_5 <= Identifier)||(LA144_5 >= OctalLiteral && LA144_5 <= StringLiteral)||LA144_5==25||LA144_5==32||(LA144_5 >= 36 && LA144_5 <= 37)||(LA144_5 >= 40 && LA144_5 <= 41)||LA144_5==60||LA144_5==62||LA144_5==65||LA144_5==70||LA144_5==73||LA144_5==76||LA144_5==82||LA144_5==84||(LA144_5 >= 86 && LA144_5 <= 87)||LA144_5==93||LA144_5==96||LA144_5==99||LA144_5==103||LA144_5==105||LA144_5==113) ) {
							alt144=1;
						}

					}

				}

				switch (alt144) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:747:30: shiftOp additiveExpression
					{
					pushFollow(FOLLOW_shiftOp_in_shiftExpression5161);
					shiftOp493=shiftOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftOp493.getTree());

					pushFollow(FOLLOW_additiveExpression_in_shiftExpression5163);
					additiveExpression494=additiveExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression494.getTree());

					}
					break;

				default :
					break loop144;
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
			if ( state.backtracking>0 ) { memoize(input, 118, shiftExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:750:1: shiftOp : ( ( '<' '<' )=>t1= '<' t2= '<' {...}?| ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?| ( '>' '>' )=>t1= '>' t2= '>' {...}?);
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:751:5: ( ( '<' '<' )=>t1= '<' t2= '<' {...}?| ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?| ( '>' '>' )=>t1= '>' t2= '>' {...}?)
			int alt145=3;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==49) && (synpred215_JavaJava())) {
				alt145=1;
			}
			else if ( (LA145_0==52) ) {
				int LA145_2 = input.LA(2);
				if ( (LA145_2==52) ) {
					int LA145_3 = input.LA(3);
					if ( (LA145_3==52) && (synpred216_JavaJava())) {
						alt145=2;
					}
					else if ( (LA145_3==36) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==40) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==37) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==41) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==113) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==25) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==32) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==99) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==96) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==HexLiteral) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==OctalLiteral) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==DecimalLiteral) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==FloatingPointLiteral) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==CharacterLiteral) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==StringLiteral) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==103) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==73) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==87) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==86) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==Identifier) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==60) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==65) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==62) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==93) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==82) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==84) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==76) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==70) && (synpred217_JavaJava())) {
						alt145=3;
					}
					else if ( (LA145_3==105) && (synpred217_JavaJava())) {
						alt145=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}

			switch (alt145) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:751:9: ( '<' '<' )=>t1= '<' t2= '<' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,49,FOLLOW_49_in_shiftOp5194); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,49,FOLLOW_49_in_shiftOp5198); if (state.failed) return retval;
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
					// /home/tony/Downloads/JavaJava.g:754:9: ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,52,FOLLOW_52_in_shiftOp5230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,52,FOLLOW_52_in_shiftOp5234); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t2_tree = (Object)adaptor.create(t2);
					adaptor.addChild(root_0, t2_tree);
					}

					t3=(Token)match(input,52,FOLLOW_52_in_shiftOp5238); if (state.failed) return retval;
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
					// /home/tony/Downloads/JavaJava.g:759:9: ( '>' '>' )=>t1= '>' t2= '>' {...}?
					{
					root_0 = (Object)adaptor.nil();


					t1=(Token)match(input,52,FOLLOW_52_in_shiftOp5268); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t1_tree = (Object)adaptor.create(t1);
					adaptor.addChild(root_0, t1_tree);
					}

					t2=(Token)match(input,52,FOLLOW_52_in_shiftOp5272); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 119, shiftOp_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:765:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
	public final JavaJavaParser.additiveExpression_return additiveExpression() throws RecognitionException {
		JavaJavaParser.additiveExpression_return retval = new JavaJavaParser.additiveExpression_return();
		retval.start = input.LT(1);
		int additiveExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal496=null;
		Token char_literal497=null;
		ParserRuleReturnScope multiplicativeExpression495 =null;
		ParserRuleReturnScope multiplicativeExpression498 =null;

		Object char_literal496_tree=null;
		Object char_literal497_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:766:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
			// /home/tony/Downloads/JavaJava.g:766:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5302);
			multiplicativeExpression495=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression495.getTree());

			// /home/tony/Downloads/JavaJava.g:766:34: ( ( '+' | '-' ) multiplicativeExpression )*
			loop147:
			while (true) {
				int alt147=2;
				int LA147_0 = input.LA(1);
				if ( (LA147_0==36||LA147_0==40) ) {
					alt147=1;
				}

				switch (alt147) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:766:36: ( '+' | '-' ) multiplicativeExpression
					{
					// /home/tony/Downloads/JavaJava.g:766:36: ( '+' | '-' )
					int alt146=2;
					int LA146_0 = input.LA(1);
					if ( (LA146_0==36) ) {
						alt146=1;
					}
					else if ( (LA146_0==40) ) {
						alt146=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 146, 0, input);
						throw nvae;
					}

					switch (alt146) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:766:37: '+'
							{
							char_literal496=(Token)match(input,36,FOLLOW_36_in_additiveExpression5307); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal496_tree = (Object)adaptor.create(char_literal496);
							adaptor.addChild(root_0, char_literal496_tree);
							}

							if ( state.backtracking==0 ) {s("+");}
							}
							break;
						case 2 :
							// /home/tony/Downloads/JavaJava.g:766:52: '-'
							{
							char_literal497=(Token)match(input,40,FOLLOW_40_in_additiveExpression5312); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal497_tree = (Object)adaptor.create(char_literal497);
							adaptor.addChild(root_0, char_literal497_tree);
							}

							if ( state.backtracking==0 ) {s("-");}
							}
							break;

					}

					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5317);
					multiplicativeExpression498=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression498.getTree());

					}
					break;

				default :
					break loop147;
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
			if ( state.backtracking>0 ) { memoize(input, 120, additiveExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:769:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
	public final JavaJavaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		JavaJavaParser.multiplicativeExpression_return retval = new JavaJavaParser.multiplicativeExpression_return();
		retval.start = input.LT(1);
		int multiplicativeExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal500=null;
		Token char_literal501=null;
		Token char_literal502=null;
		ParserRuleReturnScope unaryExpression499 =null;
		ParserRuleReturnScope unaryExpression503 =null;

		Object char_literal500_tree=null;
		Object char_literal501_tree=null;
		Object char_literal502_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:770:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
			// /home/tony/Downloads/JavaJava.g:770:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5339);
			unaryExpression499=unaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression499.getTree());

			// /home/tony/Downloads/JavaJava.g:770:25: ( ( '*' | '/' | '%' ) unaryExpression )*
			loop149:
			while (true) {
				int alt149=2;
				int LA149_0 = input.LA(1);
				if ( (LA149_0==27||LA149_0==34||LA149_0==45) ) {
					alt149=1;
				}

				switch (alt149) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:770:27: ( '*' | '/' | '%' ) unaryExpression
					{
					// /home/tony/Downloads/JavaJava.g:770:27: ( '*' | '/' | '%' )
					int alt148=3;
					switch ( input.LA(1) ) {
					case 34:
						{
						alt148=1;
						}
						break;
					case 45:
						{
						alt148=2;
						}
						break;
					case 27:
						{
						alt148=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 148, 0, input);
						throw nvae;
					}
					switch (alt148) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:770:29: '*'
							{
							char_literal500=(Token)match(input,34,FOLLOW_34_in_multiplicativeExpression5345); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal500_tree = (Object)adaptor.create(char_literal500);
							adaptor.addChild(root_0, char_literal500_tree);
							}

							if ( state.backtracking==0 ) {s("*");}
							}
							break;
						case 2 :
							// /home/tony/Downloads/JavaJava.g:770:45: '/'
							{
							char_literal501=(Token)match(input,45,FOLLOW_45_in_multiplicativeExpression5351); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal501_tree = (Object)adaptor.create(char_literal501);
							adaptor.addChild(root_0, char_literal501_tree);
							}

							if ( state.backtracking==0 ) {s("/");}
							}
							break;
						case 3 :
							// /home/tony/Downloads/JavaJava.g:770:61: '%'
							{
							char_literal502=(Token)match(input,27,FOLLOW_27_in_multiplicativeExpression5357); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal502_tree = (Object)adaptor.create(char_literal502);
							adaptor.addChild(root_0, char_literal502_tree);
							}

							if ( state.backtracking==0 ) {s("%");}
							}
							break;

					}

					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5362);
					unaryExpression503=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression503.getTree());

					}
					break;

				default :
					break loop149;
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
			if ( state.backtracking>0 ) { memoize(input, 121, multiplicativeExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:773:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
	public final JavaJavaParser.unaryExpression_return unaryExpression() throws RecognitionException {
		JavaJavaParser.unaryExpression_return retval = new JavaJavaParser.unaryExpression_return();
		retval.start = input.LT(1);
		int unaryExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal504=null;
		Token char_literal506=null;
		Token string_literal508=null;
		Token string_literal510=null;
		ParserRuleReturnScope unaryExpression505 =null;
		ParserRuleReturnScope unaryExpression507 =null;
		ParserRuleReturnScope unaryExpression509 =null;
		ParserRuleReturnScope unaryExpression511 =null;
		ParserRuleReturnScope unaryExpressionNotPlusMinus512 =null;

		Object char_literal504_tree=null;
		Object char_literal506_tree=null;
		Object string_literal508_tree=null;
		Object string_literal510_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:774:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
			int alt150=5;
			switch ( input.LA(1) ) {
			case 36:
				{
				alt150=1;
				}
				break;
			case 40:
				{
				alt150=2;
				}
				break;
			case 37:
				{
				alt150=3;
				}
				break;
			case 41:
				{
				alt150=4;
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
				alt150=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 150, 0, input);
				throw nvae;
			}
			switch (alt150) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:774:9: '+' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					char_literal504=(Token)match(input,36,FOLLOW_36_in_unaryExpression5388); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal504_tree = (Object)adaptor.create(char_literal504);
					adaptor.addChild(root_0, char_literal504_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5390);
					unaryExpression505=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression505.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:775:9: '-' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					char_literal506=(Token)match(input,40,FOLLOW_40_in_unaryExpression5400); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal506_tree = (Object)adaptor.create(char_literal506);
					adaptor.addChild(root_0, char_literal506_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5402);
					unaryExpression507=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression507.getTree());

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:776:9: '++' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					string_literal508=(Token)match(input,37,FOLLOW_37_in_unaryExpression5412); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal508_tree = (Object)adaptor.create(string_literal508);
					adaptor.addChild(root_0, string_literal508_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5414);
					unaryExpression509=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression509.getTree());

					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:777:9: '--' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					string_literal510=(Token)match(input,41,FOLLOW_41_in_unaryExpression5424); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal510_tree = (Object)adaptor.create(string_literal510);
					adaptor.addChild(root_0, string_literal510_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5426);
					unaryExpression511=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression511.getTree());

					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:778:9: unaryExpressionNotPlusMinus
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression5436);
					unaryExpressionNotPlusMinus512=unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus512.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 122, unaryExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:781:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );
	public final JavaJavaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
		JavaJavaParser.unaryExpressionNotPlusMinus_return retval = new JavaJavaParser.unaryExpressionNotPlusMinus_return();
		retval.start = input.LT(1);
		int unaryExpressionNotPlusMinus_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal513=null;
		Token char_literal515=null;
		Token string_literal520=null;
		Token string_literal521=null;
		ParserRuleReturnScope unaryExpression514 =null;
		ParserRuleReturnScope unaryExpression516 =null;
		ParserRuleReturnScope castExpression517 =null;
		ParserRuleReturnScope primary518 =null;
		ParserRuleReturnScope selector519 =null;

		Object char_literal513_tree=null;
		Object char_literal515_tree=null;
		Object string_literal520_tree=null;
		Object string_literal521_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:782:5: ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? )
			int alt153=4;
			switch ( input.LA(1) ) {
			case 113:
				{
				alt153=1;
				}
				break;
			case 25:
				{
				alt153=2;
				}
				break;
			case 32:
				{
				int LA153_3 = input.LA(2);
				if ( (synpred229_JavaJava()) ) {
					alt153=3;
				}
				else if ( (true) ) {
					alt153=4;
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
				alt153=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 153, 0, input);
				throw nvae;
			}
			switch (alt153) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:782:9: '~' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					char_literal513=(Token)match(input,113,FOLLOW_113_in_unaryExpressionNotPlusMinus5455); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal513_tree = (Object)adaptor.create(char_literal513);
					adaptor.addChild(root_0, char_literal513_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5457);
					unaryExpression514=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression514.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:783:9: '!' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					char_literal515=(Token)match(input,25,FOLLOW_25_in_unaryExpressionNotPlusMinus5467); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal515_tree = (Object)adaptor.create(char_literal515);
					adaptor.addChild(root_0, char_literal515_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5469);
					unaryExpression516=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression516.getTree());

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:784:9: castExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus5479);
					castExpression517=castExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpression517.getTree());

					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:785:9: primary ( selector )* ( '++' | '--' )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus5489);
					primary518=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary518.getTree());

					// /home/tony/Downloads/JavaJava.g:785:17: ( selector )*
					loop151:
					while (true) {
						int alt151=2;
						int LA151_0 = input.LA(1);
						if ( (LA151_0==43||LA151_0==55) ) {
							alt151=1;
						}

						switch (alt151) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:785:17: selector
							{
							pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus5491);
							selector519=selector();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, selector519.getTree());

							}
							break;

						default :
							break loop151;
						}
					}

					// /home/tony/Downloads/JavaJava.g:785:27: ( '++' | '--' )?
					int alt152=3;
					int LA152_0 = input.LA(1);
					if ( (LA152_0==37) ) {
						alt152=1;
					}
					else if ( (LA152_0==41) ) {
						alt152=2;
					}
					switch (alt152) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:785:28: '++'
							{
							string_literal520=(Token)match(input,37,FOLLOW_37_in_unaryExpressionNotPlusMinus5495); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal520_tree = (Object)adaptor.create(string_literal520);
							adaptor.addChild(root_0, string_literal520_tree);
							}

							if ( state.backtracking==0 ) {s("++");}
							}
							break;
						case 2 :
							// /home/tony/Downloads/JavaJava.g:785:44: '--'
							{
							string_literal521=(Token)match(input,41,FOLLOW_41_in_unaryExpressionNotPlusMinus5499); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal521_tree = (Object)adaptor.create(string_literal521);
							adaptor.addChild(root_0, string_literal521_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 123, unaryExpressionNotPlusMinus_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:788:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus );
	public final JavaJavaParser.castExpression_return castExpression() throws RecognitionException {
		JavaJavaParser.castExpression_return retval = new JavaJavaParser.castExpression_return();
		retval.start = input.LT(1);
		int castExpression_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal522=null;
		Token char_literal524=null;
		Token char_literal526=null;
		Token char_literal529=null;
		ParserRuleReturnScope primitiveType523 =null;
		ParserRuleReturnScope unaryExpression525 =null;
		ParserRuleReturnScope type527 =null;
		ParserRuleReturnScope expression528 =null;
		ParserRuleReturnScope unaryExpressionNotPlusMinus530 =null;

		Object char_literal522_tree=null;
		Object char_literal524_tree=null;
		Object char_literal526_tree=null;
		Object char_literal529_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:789:5: ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus )
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==32) ) {
				int LA155_1 = input.LA(2);
				if ( (synpred233_JavaJava()) ) {
					alt155=1;
				}
				else if ( (true) ) {
					alt155=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 155, 0, input);
				throw nvae;
			}

			switch (alt155) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:789:8: '(' primitiveType ')' unaryExpression
					{
					root_0 = (Object)adaptor.nil();


					char_literal522=(Token)match(input,32,FOLLOW_32_in_castExpression5521); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal522_tree = (Object)adaptor.create(char_literal522);
					adaptor.addChild(root_0, char_literal522_tree);
					}

					if ( state.backtracking==0 ) {s("(");}
					pushFollow(FOLLOW_primitiveType_in_castExpression5524);
					primitiveType523=primitiveType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType523.getTree());

					char_literal524=(Token)match(input,33,FOLLOW_33_in_castExpression5526); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal524_tree = (Object)adaptor.create(char_literal524);
					adaptor.addChild(root_0, char_literal524_tree);
					}

					pushFollow(FOLLOW_unaryExpression_in_castExpression5528);
					unaryExpression525=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression525.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:790:8: '(' ( type | expression ) ')' unaryExpressionNotPlusMinus
					{
					root_0 = (Object)adaptor.nil();


					char_literal526=(Token)match(input,32,FOLLOW_32_in_castExpression5537); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal526_tree = (Object)adaptor.create(char_literal526);
					adaptor.addChild(root_0, char_literal526_tree);
					}

					if ( state.backtracking==0 ) {s("(");}
					// /home/tony/Downloads/JavaJava.g:790:21: ( type | expression )
					int alt154=2;
					alt154 = dfa154.predict(input);
					switch (alt154) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:790:22: type
							{
							pushFollow(FOLLOW_type_in_castExpression5541);
							type527=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type527.getTree());

							}
							break;
						case 2 :
							// /home/tony/Downloads/JavaJava.g:790:29: expression
							{
							pushFollow(FOLLOW_expression_in_castExpression5545);
							expression528=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression528.getTree());

							}
							break;

					}

					char_literal529=(Token)match(input,33,FOLLOW_33_in_castExpression5548); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal529_tree = (Object)adaptor.create(char_literal529);
					adaptor.addChild(root_0, char_literal529_tree);
					}

					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression5550);
					unaryExpressionNotPlusMinus530=unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus530.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 124, castExpression_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:793:1: primary : ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator |I1= Identifier ( '.' I4= Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );
	public final JavaJavaParser.primary_return primary() throws RecognitionException {
		JavaJavaParser.primary_return retval = new JavaJavaParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		Object root_0 = null;

		Token I1=null;
		Token I4=null;
		Token string_literal532=null;
		Token char_literal533=null;
		Token Identifier534=null;
		Token string_literal536=null;
		Token string_literal539=null;
		Token char_literal541=null;
		Token char_literal544=null;
		Token char_literal545=null;
		Token char_literal546=null;
		Token string_literal547=null;
		Token string_literal548=null;
		Token char_literal549=null;
		Token string_literal550=null;
		ParserRuleReturnScope parExpression531 =null;
		ParserRuleReturnScope identifierSuffix535 =null;
		ParserRuleReturnScope superSuffix537 =null;
		ParserRuleReturnScope literal538 =null;
		ParserRuleReturnScope creator540 =null;
		ParserRuleReturnScope identifierSuffix542 =null;
		ParserRuleReturnScope primitiveType543 =null;

		Object I1_tree=null;
		Object I4_tree=null;
		Object string_literal532_tree=null;
		Object char_literal533_tree=null;
		Object Identifier534_tree=null;
		Object string_literal536_tree=null;
		Object string_literal539_tree=null;
		Object char_literal541_tree=null;
		Object char_literal544_tree=null;
		Object char_literal545_tree=null;
		Object char_literal546_tree=null;
		Object string_literal547_tree=null;
		Object string_literal548_tree=null;
		Object char_literal549_tree=null;
		Object string_literal550_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:794:5: ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator |I1= Identifier ( '.' I4= Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' )
			int alt161=8;
			switch ( input.LA(1) ) {
			case 32:
				{
				alt161=1;
				}
				break;
			case 99:
				{
				alt161=2;
				}
				break;
			case 96:
				{
				alt161=3;
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
				alt161=4;
				}
				break;
			case 86:
				{
				alt161=5;
				}
				break;
			case Identifier:
				{
				alt161=6;
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
				alt161=7;
				}
				break;
			case 105:
				{
				alt161=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 161, 0, input);
				throw nvae;
			}
			switch (alt161) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:794:9: parExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_parExpression_in_primary5569);
					parExpression531=parExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression531.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:795:9: 'this' ( '.' Identifier )* ( identifierSuffix )?
					{
					root_0 = (Object)adaptor.nil();


					string_literal532=(Token)match(input,99,FOLLOW_99_in_primary5579); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal532_tree = (Object)adaptor.create(string_literal532);
					adaptor.addChild(root_0, string_literal532_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("this");}
					// /home/tony/Downloads/JavaJava.g:795:72: ( '.' Identifier )*
					loop156:
					while (true) {
						int alt156=2;
						int LA156_0 = input.LA(1);
						if ( (LA156_0==43) ) {
							int LA156_2 = input.LA(2);
							if ( (LA156_2==Identifier) ) {
								int LA156_3 = input.LA(3);
								if ( (synpred236_JavaJava()) ) {
									alt156=1;
								}

							}

						}

						switch (alt156) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:795:73: '.' Identifier
							{
							char_literal533=(Token)match(input,43,FOLLOW_43_in_primary5583); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal533_tree = (Object)adaptor.create(char_literal533);
							adaptor.addChild(root_0, char_literal533_tree);
							}

							if ( state.backtracking==0 ) {s(".");}
							Identifier534=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary5587); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Identifier534_tree = (Object)adaptor.create(Identifier534);
							adaptor.addChild(root_0, Identifier534_tree);
							}

							}
							break;

						default :
							break loop156;
						}
					}

					// /home/tony/Downloads/JavaJava.g:795:100: ( identifierSuffix )?
					int alt157=2;
					switch ( input.LA(1) ) {
						case 55:
							{
							int LA157_1 = input.LA(2);
							if ( (synpred237_JavaJava()) ) {
								alt157=1;
							}
							}
							break;
						case 32:
							{
							alt157=1;
							}
							break;
						case 43:
							{
							int LA157_3 = input.LA(2);
							if ( (synpred237_JavaJava()) ) {
								alt157=1;
							}
							}
							break;
					}
					switch (alt157) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:795:100: identifierSuffix
							{
							pushFollow(FOLLOW_identifierSuffix_in_primary5591);
							identifierSuffix535=identifierSuffix();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierSuffix535.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:796:9: 'super' superSuffix
					{
					root_0 = (Object)adaptor.nil();


					string_literal536=(Token)match(input,96,FOLLOW_96_in_primary5603); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal536_tree = (Object)adaptor.create(string_literal536);
					adaptor.addChild(root_0, string_literal536_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
					pushFollow(FOLLOW_superSuffix_in_primary5606);
					superSuffix537=superSuffix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix537.getTree());

					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:797:9: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_primary5616);
					literal538=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal538.getTree());

					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:798:9: 'new' creator
					{
					root_0 = (Object)adaptor.nil();


					string_literal539=(Token)match(input,86,FOLLOW_86_in_primary5626); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal539_tree = (Object)adaptor.create(string_literal539);
					adaptor.addChild(root_0, string_literal539_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("new");}
					pushFollow(FOLLOW_creator_in_primary5629);
					creator540=creator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, creator540.getTree());

					}
					break;
				case 6 :
					// /home/tony/Downloads/JavaJava.g:799:9: I1= Identifier ( '.' I4= Identifier )* ( identifierSuffix )?
					{
					root_0 = (Object)adaptor.nil();


					I1=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary5641); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					I1_tree = (Object)adaptor.create(I1);
					adaptor.addChild(root_0, I1_tree);
					}

					id((I1!=null?I1.getText():null));
					// /home/tony/Downloads/JavaJava.g:799:41: ( '.' I4= Identifier )*
					loop158:
					while (true) {
						int alt158=2;
						int LA158_0 = input.LA(1);
						if ( (LA158_0==43) ) {
							int LA158_2 = input.LA(2);
							if ( (LA158_2==Identifier) ) {
								int LA158_3 = input.LA(3);
								if ( (synpred242_JavaJava()) ) {
									alt158=1;
								}

							}

						}

						switch (alt158) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:799:42: '.' I4= Identifier
							{
							char_literal541=(Token)match(input,43,FOLLOW_43_in_primary5646); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal541_tree = (Object)adaptor.create(char_literal541);
							adaptor.addChild(root_0, char_literal541_tree);
							}

							if ( state.backtracking==0 ) {s(".");}
							I4=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary5652); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							I4_tree = (Object)adaptor.create(I4);
							adaptor.addChild(root_0, I4_tree);
							}

							}
							break;

						default :
							break loop158;
						}
					}

					// /home/tony/Downloads/JavaJava.g:799:73: ( identifierSuffix )?
					int alt159=2;
					switch ( input.LA(1) ) {
						case 55:
							{
							int LA159_1 = input.LA(2);
							if ( (synpred243_JavaJava()) ) {
								alt159=1;
							}
							}
							break;
						case 32:
							{
							alt159=1;
							}
							break;
						case 43:
							{
							int LA159_3 = input.LA(2);
							if ( (synpred243_JavaJava()) ) {
								alt159=1;
							}
							}
							break;
					}
					switch (alt159) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:799:73: identifierSuffix
							{
							pushFollow(FOLLOW_identifierSuffix_in_primary5657);
							identifierSuffix542=identifierSuffix();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierSuffix542.getTree());

							}
							break;

					}

					}
					break;
				case 7 :
					// /home/tony/Downloads/JavaJava.g:800:9: primitiveType ( '[' ']' )* '.' 'class'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveType_in_primary5669);
					primitiveType543=primitiveType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType543.getTree());

					// /home/tony/Downloads/JavaJava.g:800:23: ( '[' ']' )*
					loop160:
					while (true) {
						int alt160=2;
						int LA160_0 = input.LA(1);
						if ( (LA160_0==55) ) {
							alt160=1;
						}

						switch (alt160) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:800:24: '[' ']'
							{
							char_literal544=(Token)match(input,55,FOLLOW_55_in_primary5672); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal544_tree = (Object)adaptor.create(char_literal544);
							adaptor.addChild(root_0, char_literal544_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal545=(Token)match(input,56,FOLLOW_56_in_primary5675); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal545_tree = (Object)adaptor.create(char_literal545);
							adaptor.addChild(root_0, char_literal545_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							break loop160;
						}
					}

					char_literal546=(Token)match(input,43,FOLLOW_43_in_primary5680); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal546_tree = (Object)adaptor.create(char_literal546);
					adaptor.addChild(root_0, char_literal546_tree);
					}

					string_literal547=(Token)match(input,66,FOLLOW_66_in_primary5682); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal547_tree = (Object)adaptor.create(string_literal547);
					adaptor.addChild(root_0, string_literal547_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("class");}
					}
					break;
				case 8 :
					// /home/tony/Downloads/JavaJava.g:801:9: 'void' '.' 'class'
					{
					root_0 = (Object)adaptor.nil();


					string_literal548=(Token)match(input,105,FOLLOW_105_in_primary5694); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal548_tree = (Object)adaptor.create(string_literal548);
					adaptor.addChild(root_0, string_literal548_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("void");}
					char_literal549=(Token)match(input,43,FOLLOW_43_in_primary5697); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal549_tree = (Object)adaptor.create(char_literal549);
					adaptor.addChild(root_0, char_literal549_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal550=(Token)match(input,66,FOLLOW_66_in_primary5701); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal550_tree = (Object)adaptor.create(string_literal550);
					adaptor.addChild(root_0, string_literal550_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 125, primary_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:804:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator );
	public final JavaJavaParser.identifierSuffix_return identifierSuffix() throws RecognitionException {
		JavaJavaParser.identifierSuffix_return retval = new JavaJavaParser.identifierSuffix_return();
		retval.start = input.LT(1);
		int identifierSuffix_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal551=null;
		Token char_literal552=null;
		Token char_literal553=null;
		Token string_literal554=null;
		Token char_literal555=null;
		Token char_literal557=null;
		Token char_literal559=null;
		Token string_literal560=null;
		Token char_literal561=null;
		Token char_literal563=null;
		Token string_literal564=null;
		Token char_literal565=null;
		Token string_literal566=null;
		Token char_literal568=null;
		Token string_literal569=null;
		ParserRuleReturnScope expression556 =null;
		ParserRuleReturnScope arguments558 =null;
		ParserRuleReturnScope explicitGenericInvocation562 =null;
		ParserRuleReturnScope arguments567 =null;
		ParserRuleReturnScope innerCreator570 =null;

		Object char_literal551_tree=null;
		Object char_literal552_tree=null;
		Object char_literal553_tree=null;
		Object string_literal554_tree=null;
		Object char_literal555_tree=null;
		Object char_literal557_tree=null;
		Object char_literal559_tree=null;
		Object string_literal560_tree=null;
		Object char_literal561_tree=null;
		Object char_literal563_tree=null;
		Object string_literal564_tree=null;
		Object char_literal565_tree=null;
		Object string_literal566_tree=null;
		Object char_literal568_tree=null;
		Object string_literal569_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:805:5: ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator )
			int alt164=8;
			switch ( input.LA(1) ) {
			case 55:
				{
				int LA164_1 = input.LA(2);
				if ( (LA164_1==56) ) {
					alt164=1;
				}
				else if ( ((LA164_1 >= CharacterLiteral && LA164_1 <= DecimalLiteral)||LA164_1==FloatingPointLiteral||(LA164_1 >= HexLiteral && LA164_1 <= Identifier)||(LA164_1 >= OctalLiteral && LA164_1 <= StringLiteral)||LA164_1==25||LA164_1==32||(LA164_1 >= 36 && LA164_1 <= 37)||(LA164_1 >= 40 && LA164_1 <= 41)||LA164_1==60||LA164_1==62||LA164_1==65||LA164_1==70||LA164_1==73||LA164_1==76||LA164_1==82||LA164_1==84||(LA164_1 >= 86 && LA164_1 <= 87)||LA164_1==93||LA164_1==96||LA164_1==99||LA164_1==103||LA164_1==105||LA164_1==113) ) {
					alt164=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 164, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 32:
				{
				alt164=3;
				}
				break;
			case 43:
				{
				switch ( input.LA(2) ) {
				case 66:
					{
					alt164=4;
					}
					break;
				case 49:
					{
					alt164=5;
					}
					break;
				case 99:
					{
					alt164=6;
					}
					break;
				case 96:
					{
					alt164=7;
					}
					break;
				case 86:
					{
					alt164=8;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 164, 3, input);
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
					new NoViableAltException("", 164, 0, input);
				throw nvae;
			}
			switch (alt164) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:805:9: ( '[' ']' )+ '.' 'class'
					{
					root_0 = (Object)adaptor.nil();


					// /home/tony/Downloads/JavaJava.g:805:9: ( '[' ']' )+
					int cnt162=0;
					loop162:
					while (true) {
						int alt162=2;
						int LA162_0 = input.LA(1);
						if ( (LA162_0==55) ) {
							alt162=1;
						}

						switch (alt162) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:805:10: '[' ']'
							{
							char_literal551=(Token)match(input,55,FOLLOW_55_in_identifierSuffix5722); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal551_tree = (Object)adaptor.create(char_literal551);
							adaptor.addChild(root_0, char_literal551_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal552=(Token)match(input,56,FOLLOW_56_in_identifierSuffix5726); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal552_tree = (Object)adaptor.create(char_literal552);
							adaptor.addChild(root_0, char_literal552_tree);
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

					char_literal553=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5732); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal553_tree = (Object)adaptor.create(char_literal553);
					adaptor.addChild(root_0, char_literal553_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal554=(Token)match(input,66,FOLLOW_66_in_identifierSuffix5736); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal554_tree = (Object)adaptor.create(string_literal554);
					adaptor.addChild(root_0, string_literal554_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("class");}
					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:806:9: ( '[' expression ']' )+
					{
					root_0 = (Object)adaptor.nil();


					// /home/tony/Downloads/JavaJava.g:806:9: ( '[' expression ']' )+
					int cnt163=0;
					loop163:
					while (true) {
						int alt163=2;
						int LA163_0 = input.LA(1);
						if ( (LA163_0==55) ) {
							int LA163_2 = input.LA(2);
							if ( (synpred249_JavaJava()) ) {
								alt163=1;
							}

						}

						switch (alt163) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:806:10: '[' expression ']'
							{
							char_literal555=(Token)match(input,55,FOLLOW_55_in_identifierSuffix5748); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal555_tree = (Object)adaptor.create(char_literal555);
							adaptor.addChild(root_0, char_literal555_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							pushFollow(FOLLOW_expression_in_identifierSuffix5752);
							expression556=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression556.getTree());

							char_literal557=(Token)match(input,56,FOLLOW_56_in_identifierSuffix5754); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal557_tree = (Object)adaptor.create(char_literal557);
							adaptor.addChild(root_0, char_literal557_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							if ( cnt163 >= 1 ) break loop163;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(163, input);
							throw eee;
						}
						cnt163++;
					}

					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:807:9: arguments
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arguments_in_identifierSuffix5769);
					arguments558=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments558.getTree());

					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:808:9: '.' 'class'
					{
					root_0 = (Object)adaptor.nil();


					char_literal559=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5780); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal559_tree = (Object)adaptor.create(char_literal559);
					adaptor.addChild(root_0, char_literal559_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal560=(Token)match(input,66,FOLLOW_66_in_identifierSuffix5784); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal560_tree = (Object)adaptor.create(string_literal560);
					adaptor.addChild(root_0, string_literal560_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("class");}
					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:809:9: '.' explicitGenericInvocation
					{
					root_0 = (Object)adaptor.nil();


					char_literal561=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5795); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal561_tree = (Object)adaptor.create(char_literal561);
					adaptor.addChild(root_0, char_literal561_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					pushFollow(FOLLOW_explicitGenericInvocation_in_identifierSuffix5799);
					explicitGenericInvocation562=explicitGenericInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitGenericInvocation562.getTree());

					}
					break;
				case 6 :
					// /home/tony/Downloads/JavaJava.g:810:9: '.' 'this'
					{
					root_0 = (Object)adaptor.nil();


					char_literal563=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5809); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal563_tree = (Object)adaptor.create(char_literal563);
					adaptor.addChild(root_0, char_literal563_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal564=(Token)match(input,99,FOLLOW_99_in_identifierSuffix5813); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal564_tree = (Object)adaptor.create(string_literal564);
					adaptor.addChild(root_0, string_literal564_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("this");}
					}
					break;
				case 7 :
					// /home/tony/Downloads/JavaJava.g:811:9: '.' 'super' arguments
					{
					root_0 = (Object)adaptor.nil();


					char_literal565=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5824); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal565_tree = (Object)adaptor.create(char_literal565);
					adaptor.addChild(root_0, char_literal565_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal566=(Token)match(input,96,FOLLOW_96_in_identifierSuffix5828); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal566_tree = (Object)adaptor.create(string_literal566);
					adaptor.addChild(root_0, string_literal566_tree);
					}

					pushFollow(FOLLOW_arguments_in_identifierSuffix5830);
					arguments567=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments567.getTree());

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
					}
					break;
				case 8 :
					// /home/tony/Downloads/JavaJava.g:812:9: '.' 'new' innerCreator
					{
					root_0 = (Object)adaptor.nil();


					char_literal568=(Token)match(input,43,FOLLOW_43_in_identifierSuffix5842); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal568_tree = (Object)adaptor.create(char_literal568);
					adaptor.addChild(root_0, char_literal568_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal569=(Token)match(input,86,FOLLOW_86_in_identifierSuffix5846); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal569_tree = (Object)adaptor.create(string_literal569);
					adaptor.addChild(root_0, string_literal569_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("new");}
					pushFollow(FOLLOW_innerCreator_in_identifierSuffix5849);
					innerCreator570=innerCreator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, innerCreator570.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 126, identifierSuffix_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:815:1: creator : ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) );
	public final JavaJavaParser.creator_return creator() throws RecognitionException {
		JavaJavaParser.creator_return retval = new JavaJavaParser.creator_return();
		retval.start = input.LT(1);
		int creator_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope nonWildcardTypeArguments571 =null;
		ParserRuleReturnScope createdName572 =null;
		ParserRuleReturnScope classCreatorRest573 =null;
		ParserRuleReturnScope createdName574 =null;
		ParserRuleReturnScope arrayCreatorRest575 =null;
		ParserRuleReturnScope classCreatorRest576 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:816:5: ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) )
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==49) ) {
				alt166=1;
			}
			else if ( (LA166_0==Identifier||LA166_0==60||LA166_0==62||LA166_0==65||LA166_0==70||LA166_0==76||LA166_0==82||LA166_0==84||LA166_0==93) ) {
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
					// /home/tony/Downloads/JavaJava.g:816:9: nonWildcardTypeArguments createdName classCreatorRest
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator5868);
					nonWildcardTypeArguments571=nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments571.getTree());

					pushFollow(FOLLOW_createdName_in_creator5870);
					createdName572=createdName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName572.getTree());

					pushFollow(FOLLOW_classCreatorRest_in_creator5872);
					classCreatorRest573=classCreatorRest();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest573.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:817:9: createdName ( arrayCreatorRest | classCreatorRest )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_createdName_in_creator5882);
					createdName574=createdName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName574.getTree());

					// /home/tony/Downloads/JavaJava.g:817:21: ( arrayCreatorRest | classCreatorRest )
					int alt165=2;
					int LA165_0 = input.LA(1);
					if ( (LA165_0==55) ) {
						alt165=1;
					}
					else if ( (LA165_0==32) ) {
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
							// /home/tony/Downloads/JavaJava.g:817:22: arrayCreatorRest
							{
							pushFollow(FOLLOW_arrayCreatorRest_in_creator5885);
							arrayCreatorRest575=arrayCreatorRest();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreatorRest575.getTree());

							}
							break;
						case 2 :
							// /home/tony/Downloads/JavaJava.g:817:41: classCreatorRest
							{
							pushFollow(FOLLOW_classCreatorRest_in_creator5889);
							classCreatorRest576=classCreatorRest();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest576.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 127, creator_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:820:1: createdName : ( classOrInterfaceType | primitiveType );
	public final JavaJavaParser.createdName_return createdName() throws RecognitionException {
		JavaJavaParser.createdName_return retval = new JavaJavaParser.createdName_return();
		retval.start = input.LT(1);
		int createdName_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope classOrInterfaceType577 =null;
		ParserRuleReturnScope primitiveType578 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:821:5: ( classOrInterfaceType | primitiveType )
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==Identifier) ) {
				alt167=1;
			}
			else if ( (LA167_0==60||LA167_0==62||LA167_0==65||LA167_0==70||LA167_0==76||LA167_0==82||LA167_0==84||LA167_0==93) ) {
				alt167=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 167, 0, input);
				throw nvae;
			}

			switch (alt167) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:821:8: classOrInterfaceType
					{
					root_0 = (Object)adaptor.nil();


					if ( state.backtracking==0 ) {constructorcall=true;}
					pushFollow(FOLLOW_classOrInterfaceType_in_createdName5911);
					classOrInterfaceType577=classOrInterfaceType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceType577.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:822:9: primitiveType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveType_in_createdName5921);
					primitiveType578=primitiveType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType578.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 128, createdName_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:825:1: innerCreator : ( nonWildcardTypeArguments )? Identifier classCreatorRest ;
	public final JavaJavaParser.innerCreator_return innerCreator() throws RecognitionException {
		JavaJavaParser.innerCreator_return retval = new JavaJavaParser.innerCreator_return();
		retval.start = input.LT(1);
		int innerCreator_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier580=null;
		ParserRuleReturnScope nonWildcardTypeArguments579 =null;
		ParserRuleReturnScope classCreatorRest581 =null;

		Object Identifier580_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:826:5: ( ( nonWildcardTypeArguments )? Identifier classCreatorRest )
			// /home/tony/Downloads/JavaJava.g:826:9: ( nonWildcardTypeArguments )? Identifier classCreatorRest
			{
			root_0 = (Object)adaptor.nil();


			// /home/tony/Downloads/JavaJava.g:826:9: ( nonWildcardTypeArguments )?
			int alt168=2;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==49) ) {
				alt168=1;
			}
			switch (alt168) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:826:9: nonWildcardTypeArguments
					{
					pushFollow(FOLLOW_nonWildcardTypeArguments_in_innerCreator5946);
					nonWildcardTypeArguments579=nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments579.getTree());

					}
					break;

			}

			Identifier580=(Token)match(input,Identifier,FOLLOW_Identifier_in_innerCreator5949); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier580_tree = (Object)adaptor.create(Identifier580);
			adaptor.addChild(root_0, Identifier580_tree);
			}

			pushFollow(FOLLOW_classCreatorRest_in_innerCreator5951);
			classCreatorRest581=classCreatorRest();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest581.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 129, innerCreator_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:829:1: arrayCreatorRest : '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) ;
	public final JavaJavaParser.arrayCreatorRest_return arrayCreatorRest() throws RecognitionException {
		JavaJavaParser.arrayCreatorRest_return retval = new JavaJavaParser.arrayCreatorRest_return();
		retval.start = input.LT(1);
		int arrayCreatorRest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal582=null;
		Token char_literal583=null;
		Token char_literal584=null;
		Token char_literal585=null;
		Token char_literal588=null;
		Token char_literal589=null;
		Token char_literal591=null;
		Token char_literal592=null;
		Token char_literal593=null;
		ParserRuleReturnScope arrayInitializer586 =null;
		ParserRuleReturnScope expression587 =null;
		ParserRuleReturnScope expression590 =null;

		Object char_literal582_tree=null;
		Object char_literal583_tree=null;
		Object char_literal584_tree=null;
		Object char_literal585_tree=null;
		Object char_literal588_tree=null;
		Object char_literal589_tree=null;
		Object char_literal591_tree=null;
		Object char_literal592_tree=null;
		Object char_literal593_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:830:5: ( '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) )
			// /home/tony/Downloads/JavaJava.g:830:9: '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
			{
			root_0 = (Object)adaptor.nil();


			char_literal582=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest5970); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal582_tree = (Object)adaptor.create(char_literal582);
			adaptor.addChild(root_0, char_literal582_tree);
			}

			if ( state.backtracking==0 ) {s("[");}
			// /home/tony/Downloads/JavaJava.g:831:9: ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==56) ) {
				alt172=1;
			}
			else if ( ((LA172_0 >= CharacterLiteral && LA172_0 <= DecimalLiteral)||LA172_0==FloatingPointLiteral||(LA172_0 >= HexLiteral && LA172_0 <= Identifier)||(LA172_0 >= OctalLiteral && LA172_0 <= StringLiteral)||LA172_0==25||LA172_0==32||(LA172_0 >= 36 && LA172_0 <= 37)||(LA172_0 >= 40 && LA172_0 <= 41)||LA172_0==60||LA172_0==62||LA172_0==65||LA172_0==70||LA172_0==73||LA172_0==76||LA172_0==82||LA172_0==84||(LA172_0 >= 86 && LA172_0 <= 87)||LA172_0==93||LA172_0==96||LA172_0==99||LA172_0==103||LA172_0==105||LA172_0==113) ) {
				alt172=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 172, 0, input);
				throw nvae;
			}

			switch (alt172) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:831:13: ']' ( '[' ']' )* arrayInitializer
					{
					char_literal583=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest5985); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal583_tree = (Object)adaptor.create(char_literal583);
					adaptor.addChild(root_0, char_literal583_tree);
					}

					// /home/tony/Downloads/JavaJava.g:831:17: ( '[' ']' )*
					loop169:
					while (true) {
						int alt169=2;
						int LA169_0 = input.LA(1);
						if ( (LA169_0==55) ) {
							alt169=1;
						}

						switch (alt169) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:831:18: '[' ']'
							{
							char_literal584=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest5988); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal584_tree = (Object)adaptor.create(char_literal584);
							adaptor.addChild(root_0, char_literal584_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal585=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest5991); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal585_tree = (Object)adaptor.create(char_literal585);
							adaptor.addChild(root_0, char_literal585_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							break loop169;
						}
					}

					pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest5997);
					arrayInitializer586=arrayInitializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer586.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:832:13: expression ']' ( '[' expression ']' )* ( '[' ']' )*
					{
					pushFollow(FOLLOW_expression_in_arrayCreatorRest6011);
					expression587=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression587.getTree());

					char_literal588=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest6013); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal588_tree = (Object)adaptor.create(char_literal588);
					adaptor.addChild(root_0, char_literal588_tree);
					}

					if ( state.backtracking==0 ) {s("]");}
					// /home/tony/Downloads/JavaJava.g:832:38: ( '[' expression ']' )*
					loop170:
					while (true) {
						int alt170=2;
						int LA170_0 = input.LA(1);
						if ( (LA170_0==55) ) {
							int LA170_1 = input.LA(2);
							if ( (synpred262_JavaJava()) ) {
								alt170=1;
							}

						}

						switch (alt170) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:832:39: '[' expression ']'
							{
							char_literal589=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest6018); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal589_tree = (Object)adaptor.create(char_literal589);
							adaptor.addChild(root_0, char_literal589_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							pushFollow(FOLLOW_expression_in_arrayCreatorRest6021);
							expression590=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression590.getTree());

							char_literal591=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest6023); if (state.failed) return retval;
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

					// /home/tony/Downloads/JavaJava.g:832:79: ( '[' ']' )*
					loop171:
					while (true) {
						int alt171=2;
						int LA171_0 = input.LA(1);
						if ( (LA171_0==55) ) {
							int LA171_2 = input.LA(2);
							if ( (LA171_2==56) ) {
								alt171=1;
							}

						}

						switch (alt171) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:832:80: '[' ']'
							{
							char_literal592=(Token)match(input,55,FOLLOW_55_in_arrayCreatorRest6030); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal592_tree = (Object)adaptor.create(char_literal592);
							adaptor.addChild(root_0, char_literal592_tree);
							}

							if ( state.backtracking==0 ) {s("[");}
							char_literal593=(Token)match(input,56,FOLLOW_56_in_arrayCreatorRest6033); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal593_tree = (Object)adaptor.create(char_literal593);
							adaptor.addChild(root_0, char_literal593_tree);
							}

							if ( state.backtracking==0 ) {s("]");}
							}
							break;

						default :
							break loop171;
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
			if ( state.backtracking>0 ) { memoize(input, 130, arrayCreatorRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:836:1: classCreatorRest : arguments ( classBody )? ;
	public final JavaJavaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
		JavaJavaParser.classCreatorRest_return retval = new JavaJavaParser.classCreatorRest_return();
		retval.start = input.LT(1);
		int classCreatorRest_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope arguments594 =null;
		ParserRuleReturnScope classBody595 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:837:5: ( arguments ( classBody )? )
			// /home/tony/Downloads/JavaJava.g:837:8: arguments ( classBody )?
			{
			root_0 = (Object)adaptor.nil();


			if ( state.backtracking==0 ) {constructorcall=false;}
			pushFollow(FOLLOW_arguments_in_classCreatorRest6066);
			arguments594=arguments();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments594.getTree());

			// /home/tony/Downloads/JavaJava.g:837:43: ( classBody )?
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==108) ) {
				alt173=1;
			}
			switch (alt173) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:837:43: classBody
					{
					pushFollow(FOLLOW_classBody_in_classCreatorRest6068);
					classBody595=classBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody595.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 131, classCreatorRest_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:840:1: explicitGenericInvocation : nonWildcardTypeArguments Identifier arguments ;
	public final JavaJavaParser.explicitGenericInvocation_return explicitGenericInvocation() throws RecognitionException {
		JavaJavaParser.explicitGenericInvocation_return retval = new JavaJavaParser.explicitGenericInvocation_return();
		retval.start = input.LT(1);
		int explicitGenericInvocation_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier597=null;
		ParserRuleReturnScope nonWildcardTypeArguments596 =null;
		ParserRuleReturnScope arguments598 =null;

		Object Identifier597_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:841:5: ( nonWildcardTypeArguments Identifier arguments )
			// /home/tony/Downloads/JavaJava.g:841:9: nonWildcardTypeArguments Identifier arguments
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation6092);
			nonWildcardTypeArguments596=nonWildcardTypeArguments();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments596.getTree());

			Identifier597=(Token)match(input,Identifier,FOLLOW_Identifier_in_explicitGenericInvocation6094); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier597_tree = (Object)adaptor.create(Identifier597);
			adaptor.addChild(root_0, Identifier597_tree);
			}

			if ( state.backtracking==0 ) {if(primitive) id((Identifier597!=null?Identifier597.getText():null));}
			pushFollow(FOLLOW_arguments_in_explicitGenericInvocation6097);
			arguments598=arguments();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments598.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 132, explicitGenericInvocation_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:844:1: nonWildcardTypeArguments : '<' typeList '>' ;
	public final JavaJavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments() throws RecognitionException {
		JavaJavaParser.nonWildcardTypeArguments_return retval = new JavaJavaParser.nonWildcardTypeArguments_return();
		retval.start = input.LT(1);
		int nonWildcardTypeArguments_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal599=null;
		Token char_literal601=null;
		ParserRuleReturnScope typeList600 =null;

		Object char_literal599_tree=null;
		Object char_literal601_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:845:5: ( '<' typeList '>' )
			// /home/tony/Downloads/JavaJava.g:845:9: '<' typeList '>'
			{
			root_0 = (Object)adaptor.nil();


			char_literal599=(Token)match(input,49,FOLLOW_49_in_nonWildcardTypeArguments6120); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal599_tree = (Object)adaptor.create(char_literal599);
			adaptor.addChild(root_0, char_literal599_tree);
			}

			if ( state.backtracking==0 ) {s("<");}
			pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments6124);
			typeList600=typeList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList600.getTree());

			char_literal601=(Token)match(input,52,FOLLOW_52_in_nonWildcardTypeArguments6126); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal601_tree = (Object)adaptor.create(char_literal601);
			adaptor.addChild(root_0, char_literal601_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 133, nonWildcardTypeArguments_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:848:1: selector : ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' );
	public final JavaJavaParser.selector_return selector() throws RecognitionException {
		JavaJavaParser.selector_return retval = new JavaJavaParser.selector_return();
		retval.start = input.LT(1);
		int selector_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal602=null;
		Token Identifier603=null;
		Token char_literal605=null;
		Token string_literal606=null;
		Token char_literal607=null;
		Token string_literal608=null;
		Token char_literal610=null;
		Token string_literal611=null;
		Token char_literal613=null;
		Token char_literal615=null;
		ParserRuleReturnScope arguments604 =null;
		ParserRuleReturnScope superSuffix609 =null;
		ParserRuleReturnScope innerCreator612 =null;
		ParserRuleReturnScope expression614 =null;

		Object char_literal602_tree=null;
		Object Identifier603_tree=null;
		Object char_literal605_tree=null;
		Object string_literal606_tree=null;
		Object char_literal607_tree=null;
		Object string_literal608_tree=null;
		Object char_literal610_tree=null;
		Object string_literal611_tree=null;
		Object char_literal613_tree=null;
		Object char_literal615_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:849:5: ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' )
			int alt175=5;
			int LA175_0 = input.LA(1);
			if ( (LA175_0==43) ) {
				switch ( input.LA(2) ) {
				case Identifier:
					{
					alt175=1;
					}
					break;
				case 99:
					{
					alt175=2;
					}
					break;
				case 96:
					{
					alt175=3;
					}
					break;
				case 86:
					{
					alt175=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 175, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA175_0==55) ) {
				alt175=5;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 175, 0, input);
				throw nvae;
			}

			switch (alt175) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:849:9: '.' Identifier ( arguments )?
					{
					root_0 = (Object)adaptor.nil();


					char_literal602=(Token)match(input,43,FOLLOW_43_in_selector6151); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal602_tree = (Object)adaptor.create(char_literal602);
					adaptor.addChild(root_0, char_literal602_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					Identifier603=(Token)match(input,Identifier,FOLLOW_Identifier_in_selector6155); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier603_tree = (Object)adaptor.create(Identifier603);
					adaptor.addChild(root_0, Identifier603_tree);
					}

					if ( state.backtracking==0 ) {if(primitive) id((Identifier603!=null?Identifier603.getText():null));}
					// /home/tony/Downloads/JavaJava.g:849:73: ( arguments )?
					int alt174=2;
					int LA174_0 = input.LA(1);
					if ( (LA174_0==32) ) {
						alt174=1;
					}
					switch (alt174) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:849:73: arguments
							{
							pushFollow(FOLLOW_arguments_in_selector6160);
							arguments604=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments604.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:850:9: '.' 'this'
					{
					root_0 = (Object)adaptor.nil();


					char_literal605=(Token)match(input,43,FOLLOW_43_in_selector6171); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal605_tree = (Object)adaptor.create(char_literal605);
					adaptor.addChild(root_0, char_literal605_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal606=(Token)match(input,99,FOLLOW_99_in_selector6175); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal606_tree = (Object)adaptor.create(string_literal606);
					adaptor.addChild(root_0, string_literal606_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("this");}
					}
					break;
				case 3 :
					// /home/tony/Downloads/JavaJava.g:851:9: '.' 'super' superSuffix
					{
					root_0 = (Object)adaptor.nil();


					char_literal607=(Token)match(input,43,FOLLOW_43_in_selector6187); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal607_tree = (Object)adaptor.create(char_literal607);
					adaptor.addChild(root_0, char_literal607_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal608=(Token)match(input,96,FOLLOW_96_in_selector6191); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal608_tree = (Object)adaptor.create(string_literal608);
					adaptor.addChild(root_0, string_literal608_tree);
					}

					pushFollow(FOLLOW_superSuffix_in_selector6193);
					superSuffix609=superSuffix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix609.getTree());

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
					}
					break;
				case 4 :
					// /home/tony/Downloads/JavaJava.g:852:9: '.' 'new' innerCreator
					{
					root_0 = (Object)adaptor.nil();


					char_literal610=(Token)match(input,43,FOLLOW_43_in_selector6205); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal610_tree = (Object)adaptor.create(char_literal610);
					adaptor.addChild(root_0, char_literal610_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					string_literal611=(Token)match(input,86,FOLLOW_86_in_selector6209); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal611_tree = (Object)adaptor.create(string_literal611);
					adaptor.addChild(root_0, string_literal611_tree);
					}

					if ( state.backtracking==0 ) {keywordCount++;JavaMetrics.uniqueKeywords.add("new");}
					pushFollow(FOLLOW_innerCreator_in_selector6214);
					innerCreator612=innerCreator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, innerCreator612.getTree());

					}
					break;
				case 5 :
					// /home/tony/Downloads/JavaJava.g:853:9: '[' expression ']'
					{
					root_0 = (Object)adaptor.nil();


					char_literal613=(Token)match(input,55,FOLLOW_55_in_selector6224); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal613_tree = (Object)adaptor.create(char_literal613);
					adaptor.addChild(root_0, char_literal613_tree);
					}

					if ( state.backtracking==0 ) {s("[");}
					pushFollow(FOLLOW_expression_in_selector6228);
					expression614=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression614.getTree());

					char_literal615=(Token)match(input,56,FOLLOW_56_in_selector6230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal615_tree = (Object)adaptor.create(char_literal615);
					adaptor.addChild(root_0, char_literal615_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 134, selector_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:856:1: superSuffix : ( arguments | '.' Identifier ( arguments )? );
	public final JavaJavaParser.superSuffix_return superSuffix() throws RecognitionException {
		JavaJavaParser.superSuffix_return retval = new JavaJavaParser.superSuffix_return();
		retval.start = input.LT(1);
		int superSuffix_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal617=null;
		Token Identifier618=null;
		ParserRuleReturnScope arguments616 =null;
		ParserRuleReturnScope arguments619 =null;

		Object char_literal617_tree=null;
		Object Identifier618_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:857:5: ( arguments | '.' Identifier ( arguments )? )
			int alt177=2;
			int LA177_0 = input.LA(1);
			if ( (LA177_0==32) ) {
				alt177=1;
			}
			else if ( (LA177_0==43) ) {
				alt177=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 177, 0, input);
				throw nvae;
			}

			switch (alt177) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:857:9: arguments
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arguments_in_superSuffix6255);
					arguments616=arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments616.getTree());

					}
					break;
				case 2 :
					// /home/tony/Downloads/JavaJava.g:858:9: '.' Identifier ( arguments )?
					{
					root_0 = (Object)adaptor.nil();


					char_literal617=(Token)match(input,43,FOLLOW_43_in_superSuffix6265); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal617_tree = (Object)adaptor.create(char_literal617);
					adaptor.addChild(root_0, char_literal617_tree);
					}

					if ( state.backtracking==0 ) {s(".");}
					Identifier618=(Token)match(input,Identifier,FOLLOW_Identifier_in_superSuffix6269); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier618_tree = (Object)adaptor.create(Identifier618);
					adaptor.addChild(root_0, Identifier618_tree);
					}

					if ( state.backtracking==0 ) {if(primitive) id((Identifier618!=null?Identifier618.getText():null));}
					// /home/tony/Downloads/JavaJava.g:858:72: ( arguments )?
					int alt176=2;
					int LA176_0 = input.LA(1);
					if ( (LA176_0==32) ) {
						alt176=1;
					}
					switch (alt176) {
						case 1 :
							// /home/tony/Downloads/JavaJava.g:858:72: arguments
							{
							pushFollow(FOLLOW_arguments_in_superSuffix6273);
							arguments619=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments619.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 135, superSuffix_StartIndex); }

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
	// /home/tony/Downloads/JavaJava.g:861:1: arguments : '(' ( expressionList )? ')' ;
	public final JavaJavaParser.arguments_return arguments() throws RecognitionException {
		JavaJavaParser.arguments_return retval = new JavaJavaParser.arguments_return();
		retval.start = input.LT(1);
		int arguments_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal620=null;
		Token char_literal622=null;
		ParserRuleReturnScope expressionList621 =null;

		Object char_literal620_tree=null;
		Object char_literal622_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }

			// /home/tony/Downloads/JavaJava.g:862:5: ( '(' ( expressionList )? ')' )
			// /home/tony/Downloads/JavaJava.g:862:9: '(' ( expressionList )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal620=(Token)match(input,32,FOLLOW_32_in_arguments6293); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal620_tree = (Object)adaptor.create(char_literal620);
			adaptor.addChild(root_0, char_literal620_tree);
			}

			if ( state.backtracking==0 ) {s("(");}
			// /home/tony/Downloads/JavaJava.g:862:22: ( expressionList )?
			int alt178=2;
			int LA178_0 = input.LA(1);
			if ( ((LA178_0 >= CharacterLiteral && LA178_0 <= DecimalLiteral)||LA178_0==FloatingPointLiteral||(LA178_0 >= HexLiteral && LA178_0 <= Identifier)||(LA178_0 >= OctalLiteral && LA178_0 <= StringLiteral)||LA178_0==25||LA178_0==32||(LA178_0 >= 36 && LA178_0 <= 37)||(LA178_0 >= 40 && LA178_0 <= 41)||LA178_0==60||LA178_0==62||LA178_0==65||LA178_0==70||LA178_0==73||LA178_0==76||LA178_0==82||LA178_0==84||(LA178_0 >= 86 && LA178_0 <= 87)||LA178_0==93||LA178_0==96||LA178_0==99||LA178_0==103||LA178_0==105||LA178_0==113) ) {
				alt178=1;
			}
			switch (alt178) {
				case 1 :
					// /home/tony/Downloads/JavaJava.g:862:22: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_arguments6296);
					expressionList621=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList621.getTree());

					}
					break;

			}

			char_literal622=(Token)match(input,33,FOLLOW_33_in_arguments6299); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal622_tree = (Object)adaptor.create(char_literal622);
			adaptor.addChild(root_0, char_literal622_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 136, arguments_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arguments"

	// $ANTLR start synpred5_JavaJava
	public final void synpred5_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:96:9: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) )
		// /home/tony/Downloads/JavaJava.g:96:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
		{
		pushFollow(FOLLOW_annotations_in_synpred5_JavaJava73);
		annotations();
		state._fsp--;
		if (state.failed) return;

		// /home/tony/Downloads/JavaJava.g:97:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
		int alt184=2;
		int LA184_0 = input.LA(1);
		if ( (LA184_0==88) ) {
			alt184=1;
		}
		else if ( (LA184_0==ENUM||LA184_0==54||LA184_0==59||LA184_0==66||LA184_0==74||LA184_0==83||(LA184_0 >= 89 && LA184_0 <= 91)||(LA184_0 >= 94 && LA184_0 <= 95)) ) {
			alt184=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 184, 0, input);
			throw nvae;
		}

		switch (alt184) {
			case 1 :
				// /home/tony/Downloads/JavaJava.g:97:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
				{
				pushFollow(FOLLOW_packageDeclaration_in_synpred5_JavaJava87);
				packageDeclaration();
				state._fsp--;
				if (state.failed) return;

				// /home/tony/Downloads/JavaJava.g:97:32: ( importDeclaration )*
				loop181:
				while (true) {
					int alt181=2;
					int LA181_0 = input.LA(1);
					if ( (LA181_0==80) ) {
						alt181=1;
					}

					switch (alt181) {
					case 1 :
						// /home/tony/Downloads/JavaJava.g:97:32: importDeclaration
						{
						pushFollow(FOLLOW_importDeclaration_in_synpred5_JavaJava89);
						importDeclaration();
						state._fsp--;
						if (state.failed) return;

						}
						break;

					default :
						break loop181;
					}
				}

				// /home/tony/Downloads/JavaJava.g:97:51: ( typeDeclaration )*
				loop182:
				while (true) {
					int alt182=2;
					int LA182_0 = input.LA(1);
					if ( (LA182_0==ENUM||LA182_0==48||LA182_0==54||LA182_0==59||LA182_0==66||LA182_0==74||LA182_0==83||(LA182_0 >= 89 && LA182_0 <= 91)||(LA182_0 >= 94 && LA182_0 <= 95)) ) {
						alt182=1;
					}

					switch (alt182) {
					case 1 :
						// /home/tony/Downloads/JavaJava.g:97:51: typeDeclaration
						{
						pushFollow(FOLLOW_typeDeclaration_in_synpred5_JavaJava92);
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
			case 2 :
				// /home/tony/Downloads/JavaJava.g:98:13: classOrInterfaceDeclaration ( typeDeclaration )*
				{
				pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred5_JavaJava107);
				classOrInterfaceDeclaration();
				state._fsp--;
				if (state.failed) return;

				// /home/tony/Downloads/JavaJava.g:98:41: ( typeDeclaration )*
				loop183:
				while (true) {
					int alt183=2;
					int LA183_0 = input.LA(1);
					if ( (LA183_0==ENUM||LA183_0==48||LA183_0==54||LA183_0==59||LA183_0==66||LA183_0==74||LA183_0==83||(LA183_0 >= 89 && LA183_0 <= 91)||(LA183_0 >= 94 && LA183_0 <= 95)) ) {
						alt183=1;
					}

					switch (alt183) {
					case 1 :
						// /home/tony/Downloads/JavaJava.g:98:41: typeDeclaration
						{
						pushFollow(FOLLOW_typeDeclaration_in_synpred5_JavaJava109);
						typeDeclaration();
						state._fsp--;
						if (state.failed) return;

						}
						break;

					default :
						break loop183;
					}
				}

				}
				break;

		}

		}

	}
	// $ANTLR end synpred5_JavaJava

	// $ANTLR start synpred113_JavaJava
	public final void synpred113_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:450:22: ( explicitConstructorInvocation )
		// /home/tony/Downloads/JavaJava.g:450:22: explicitConstructorInvocation
		{
		pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred113_JavaJava2754);
		explicitConstructorInvocation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred113_JavaJava

	// $ANTLR start synpred117_JavaJava
	public final void synpred117_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:454:9: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' )
		// /home/tony/Downloads/JavaJava.g:454:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
		{
		// /home/tony/Downloads/JavaJava.g:454:9: ( nonWildcardTypeArguments )?
		int alt192=2;
		int LA192_0 = input.LA(1);
		if ( (LA192_0==49) ) {
			alt192=1;
		}
		switch (alt192) {
			case 1 :
				// /home/tony/Downloads/JavaJava.g:454:9: nonWildcardTypeArguments
				{
				pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred117_JavaJava2781);
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
		pushFollow(FOLLOW_arguments_in_synpred117_JavaJava2795);
		arguments();
		state._fsp--;
		if (state.failed) return;

		match(input,48,FOLLOW_48_in_synpred117_JavaJava2797); if (state.failed) return;

		}

	}
	// $ANTLR end synpred117_JavaJava

	// $ANTLR start synpred128_JavaJava
	public final void synpred128_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:486:9: ( annotation )
		// /home/tony/Downloads/JavaJava.g:486:9: annotation
		{
		pushFollow(FOLLOW_annotation_in_synpred128_JavaJava3043);
		annotation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred128_JavaJava

	// $ANTLR start synpred151_JavaJava
	public final void synpred151_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:559:10: ( localVariableDeclarationStatement )
		// /home/tony/Downloads/JavaJava.g:559:10: localVariableDeclarationStatement
		{
		pushFollow(FOLLOW_localVariableDeclarationStatement_in_synpred151_JavaJava3609);
		localVariableDeclarationStatement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred151_JavaJava

	// $ANTLR start synpred152_JavaJava
	public final void synpred152_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:560:9: ( classOrInterfaceDeclaration )
		// /home/tony/Downloads/JavaJava.g:560:9: classOrInterfaceDeclaration
		{
		pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred152_JavaJava3619);
		classOrInterfaceDeclaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred152_JavaJava

	// $ANTLR start synpred157_JavaJava
	public final void synpred157_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:579:115: ( 'else' statement )
		// /home/tony/Downloads/JavaJava.g:579:115: 'else' statement
		{
		match(input,71,FOLLOW_71_in_synpred157_JavaJava3770); if (state.failed) return;

		pushFollow(FOLLOW_statement_in_synpred157_JavaJava3774);
		statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred157_JavaJava

	// $ANTLR start synpred162_JavaJava
	public final void synpred162_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:584:11: ( catches 'finally' block )
		// /home/tony/Downloads/JavaJava.g:584:11: catches 'finally' block
		{
		pushFollow(FOLLOW_catches_in_synpred162_JavaJava3864);
		catches();
		state._fsp--;
		if (state.failed) return;

		match(input,75,FOLLOW_75_in_synpred162_JavaJava3866); if (state.failed) return;

		pushFollow(FOLLOW_block_in_synpred162_JavaJava3869);
		block();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred162_JavaJava

	// $ANTLR start synpred163_JavaJava
	public final void synpred163_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:585:11: ( catches )
		// /home/tony/Downloads/JavaJava.g:585:11: catches
		{
		pushFollow(FOLLOW_catches_in_synpred163_JavaJava3881);
		catches();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred163_JavaJava

	// $ANTLR start synpred178_JavaJava
	public final void synpred178_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:620:9: ( switchLabel )
		// /home/tony/Downloads/JavaJava.g:620:9: switchLabel
		{
		pushFollow(FOLLOW_switchLabel_in_synpred178_JavaJava4204);
		switchLabel();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred178_JavaJava

	// $ANTLR start synpred180_JavaJava
	public final void synpred180_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:624:9: ( 'case' constantExpression ':' )
		// /home/tony/Downloads/JavaJava.g:624:9: 'case' constantExpression ':'
		{
		match(input,63,FOLLOW_63_in_synpred180_JavaJava4231); if (state.failed) return;

		pushFollow(FOLLOW_constantExpression_in_synpred180_JavaJava4234);
		constantExpression();
		state._fsp--;
		if (state.failed) return;

		match(input,47,FOLLOW_47_in_synpred180_JavaJava4236); if (state.failed) return;

		}

	}
	// $ANTLR end synpred180_JavaJava

	// $ANTLR start synpred181_JavaJava
	public final void synpred181_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:625:9: ( 'case' enumConstantName ':' )
		// /home/tony/Downloads/JavaJava.g:625:9: 'case' enumConstantName ':'
		{
		match(input,63,FOLLOW_63_in_synpred181_JavaJava4246); if (state.failed) return;

		pushFollow(FOLLOW_enumConstantName_in_synpred181_JavaJava4250);
		enumConstantName();
		state._fsp--;
		if (state.failed) return;

		match(input,47,FOLLOW_47_in_synpred181_JavaJava4252); if (state.failed) return;

		}

	}
	// $ANTLR end synpred181_JavaJava

	// $ANTLR start synpred182_JavaJava
	public final void synpred182_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:631:9: ( enhancedForControl )
		// /home/tony/Downloads/JavaJava.g:631:9: enhancedForControl
		{
		pushFollow(FOLLOW_enhancedForControl_in_synpred182_JavaJava4297);
		enhancedForControl();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred182_JavaJava

	// $ANTLR start synpred186_JavaJava
	public final void synpred186_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:636:9: ( localVariableDeclaration )
		// /home/tony/Downloads/JavaJava.g:636:9: localVariableDeclaration
		{
		pushFollow(FOLLOW_localVariableDeclaration_in_synpred186_JavaJava4337);
		localVariableDeclaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred186_JavaJava

	// $ANTLR start synpred188_JavaJava
	public final void synpred188_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:667:32: ( assignmentOperator expression )
		// /home/tony/Downloads/JavaJava.g:667:32: assignmentOperator expression
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred188_JavaJava4528);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred188_JavaJava4530);
		expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred188_JavaJava

	// $ANTLR start synpred198_JavaJava
	public final void synpred198_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:680:9: ( '<' '<' '=' )
		// /home/tony/Downloads/JavaJava.g:680:10: '<' '<' '='
		{
		match(input,49,FOLLOW_49_in_synpred198_JavaJava4648); if (state.failed) return;

		match(input,49,FOLLOW_49_in_synpred198_JavaJava4650); if (state.failed) return;

		match(input,50,FOLLOW_50_in_synpred198_JavaJava4652); if (state.failed) return;

		}

	}
	// $ANTLR end synpred198_JavaJava

	// $ANTLR start synpred199_JavaJava
	public final void synpred199_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:685:9: ( '>' '>' '>' '=' )
		// /home/tony/Downloads/JavaJava.g:685:10: '>' '>' '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred199_JavaJava4688); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred199_JavaJava4690); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred199_JavaJava4692); if (state.failed) return;

		match(input,50,FOLLOW_50_in_synpred199_JavaJava4694); if (state.failed) return;

		}

	}
	// $ANTLR end synpred199_JavaJava

	// $ANTLR start synpred200_JavaJava
	public final void synpred200_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:692:9: ( '>' '>' '=' )
		// /home/tony/Downloads/JavaJava.g:692:10: '>' '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred200_JavaJava4733); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred200_JavaJava4735); if (state.failed) return;

		match(input,50,FOLLOW_50_in_synpred200_JavaJava4737); if (state.failed) return;

		}

	}
	// $ANTLR end synpred200_JavaJava

	// $ANTLR start synpred211_JavaJava
	public final void synpred211_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:736:9: ( '<' '=' )
		// /home/tony/Downloads/JavaJava.g:736:10: '<' '='
		{
		match(input,49,FOLLOW_49_in_synpred211_JavaJava5057); if (state.failed) return;

		match(input,50,FOLLOW_50_in_synpred211_JavaJava5059); if (state.failed) return;

		}

	}
	// $ANTLR end synpred211_JavaJava

	// $ANTLR start synpred212_JavaJava
	public final void synpred212_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:739:9: ( '>' '=' )
		// /home/tony/Downloads/JavaJava.g:739:10: '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred212_JavaJava5091); if (state.failed) return;

		match(input,50,FOLLOW_50_in_synpred212_JavaJava5093); if (state.failed) return;

		}

	}
	// $ANTLR end synpred212_JavaJava

	// $ANTLR start synpred215_JavaJava
	public final void synpred215_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:751:9: ( '<' '<' )
		// /home/tony/Downloads/JavaJava.g:751:10: '<' '<'
		{
		match(input,49,FOLLOW_49_in_synpred215_JavaJava5186); if (state.failed) return;

		match(input,49,FOLLOW_49_in_synpred215_JavaJava5188); if (state.failed) return;

		}

	}
	// $ANTLR end synpred215_JavaJava

	// $ANTLR start synpred216_JavaJava
	public final void synpred216_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:754:9: ( '>' '>' '>' )
		// /home/tony/Downloads/JavaJava.g:754:10: '>' '>' '>'
		{
		match(input,52,FOLLOW_52_in_synpred216_JavaJava5220); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred216_JavaJava5222); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred216_JavaJava5224); if (state.failed) return;

		}

	}
	// $ANTLR end synpred216_JavaJava

	// $ANTLR start synpred217_JavaJava
	public final void synpred217_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:759:9: ( '>' '>' )
		// /home/tony/Downloads/JavaJava.g:759:10: '>' '>'
		{
		match(input,52,FOLLOW_52_in_synpred217_JavaJava5260); if (state.failed) return;

		match(input,52,FOLLOW_52_in_synpred217_JavaJava5262); if (state.failed) return;

		}

	}
	// $ANTLR end synpred217_JavaJava

	// $ANTLR start synpred229_JavaJava
	public final void synpred229_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:784:9: ( castExpression )
		// /home/tony/Downloads/JavaJava.g:784:9: castExpression
		{
		pushFollow(FOLLOW_castExpression_in_synpred229_JavaJava5479);
		castExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred229_JavaJava

	// $ANTLR start synpred233_JavaJava
	public final void synpred233_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:789:8: ( '(' primitiveType ')' unaryExpression )
		// /home/tony/Downloads/JavaJava.g:789:8: '(' primitiveType ')' unaryExpression
		{
		match(input,32,FOLLOW_32_in_synpred233_JavaJava5521); if (state.failed) return;

		pushFollow(FOLLOW_primitiveType_in_synpred233_JavaJava5524);
		primitiveType();
		state._fsp--;
		if (state.failed) return;

		match(input,33,FOLLOW_33_in_synpred233_JavaJava5526); if (state.failed) return;

		pushFollow(FOLLOW_unaryExpression_in_synpred233_JavaJava5528);
		unaryExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred233_JavaJava

	// $ANTLR start synpred234_JavaJava
	public final void synpred234_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:790:22: ( type )
		// /home/tony/Downloads/JavaJava.g:790:22: type
		{
		pushFollow(FOLLOW_type_in_synpred234_JavaJava5541);
		type();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred234_JavaJava

	// $ANTLR start synpred236_JavaJava
	public final void synpred236_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:795:73: ( '.' Identifier )
		// /home/tony/Downloads/JavaJava.g:795:73: '.' Identifier
		{
		match(input,43,FOLLOW_43_in_synpred236_JavaJava5583); if (state.failed) return;

		match(input,Identifier,FOLLOW_Identifier_in_synpred236_JavaJava5587); if (state.failed) return;

		}

	}
	// $ANTLR end synpred236_JavaJava

	// $ANTLR start synpred237_JavaJava
	public final void synpred237_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:795:100: ( identifierSuffix )
		// /home/tony/Downloads/JavaJava.g:795:100: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred237_JavaJava5591);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred237_JavaJava

	// $ANTLR start synpred242_JavaJava
	public final void synpred242_JavaJava_fragment() throws RecognitionException {
		Token I4=null;


		// /home/tony/Downloads/JavaJava.g:799:42: ( '.' I4= Identifier )
		// /home/tony/Downloads/JavaJava.g:799:42: '.' I4= Identifier
		{
		match(input,43,FOLLOW_43_in_synpred242_JavaJava5646); if (state.failed) return;

		I4=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred242_JavaJava5652); if (state.failed) return;

		}

	}
	// $ANTLR end synpred242_JavaJava

	// $ANTLR start synpred243_JavaJava
	public final void synpred243_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:799:73: ( identifierSuffix )
		// /home/tony/Downloads/JavaJava.g:799:73: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred243_JavaJava5657);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred243_JavaJava

	// $ANTLR start synpred249_JavaJava
	public final void synpred249_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:806:10: ( '[' expression ']' )
		// /home/tony/Downloads/JavaJava.g:806:10: '[' expression ']'
		{
		match(input,55,FOLLOW_55_in_synpred249_JavaJava5748); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred249_JavaJava5752);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input,56,FOLLOW_56_in_synpred249_JavaJava5754); if (state.failed) return;

		}

	}
	// $ANTLR end synpred249_JavaJava

	// $ANTLR start synpred262_JavaJava
	public final void synpred262_JavaJava_fragment() throws RecognitionException {
		// /home/tony/Downloads/JavaJava.g:832:39: ( '[' expression ']' )
		// /home/tony/Downloads/JavaJava.g:832:39: '[' expression ']'
		{
		match(input,55,FOLLOW_55_in_synpred262_JavaJava6018); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred262_JavaJava6021);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input,56,FOLLOW_56_in_synpred262_JavaJava6023); if (state.failed) return;

		}

	}
	// $ANTLR end synpred262_JavaJava

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
	public final boolean synpred163_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred163_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred200_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred200_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred229_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred229_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred178_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred178_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred217_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred217_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred249_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred249_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred128_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred128_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred152_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred152_JavaJava_fragment(); // can never throw exception
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
	public final boolean synpred212_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred212_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred117_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred117_JavaJava_fragment(); // can never throw exception
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
	public final boolean synpred262_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred262_JavaJava_fragment(); // can never throw exception
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
	public final boolean synpred182_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred182_JavaJava_fragment(); // can never throw exception
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
	public final boolean synpred188_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred188_JavaJava_fragment(); // can never throw exception
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
	public final boolean synpred234_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred234_JavaJava_fragment(); // can never throw exception
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
	public final boolean synpred157_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred157_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred186_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred186_JavaJava_fragment(); // can never throw exception
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
	public final boolean synpred243_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred243_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred113_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred113_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred237_JavaJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred237_JavaJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA128 dfa128 = new DFA128(this);
	protected DFA154 dfa154 = new DFA154(this);
	static final String DFA128_eotS =
		"\u010c\uffff";
	static final String DFA128_eofS =
		"\u010c\uffff";
	static final String DFA128_minS =
		"\1\6\13\17\25\uffff\14\17\1\6\1\17\1\6\1\47\35\uffff\1\70\1\47\1\uffff"+
		"\1\70\1\47\1\uffff\1\70\1\47\1\uffff\1\70\1\47\1\uffff\1\70\1\47\1\uffff"+
		"\1\70\1\47\1\uffff\1\70\1\47\1\uffff\1\70\1\47\1\uffff\55\0\2\uffff\12"+
		"\0\24\uffff\1\0\5\uffff\1\0\42\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff"+
		"\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff";
	static final String DFA128_maxS =
		"\1\161\1\135\1\17\1\157\10\67\25\uffff\11\67\1\135\1\17\1\135\1\161\1"+
		"\143\1\161\1\67\35\uffff\1\70\1\67\1\uffff\1\70\1\67\1\uffff\1\70\1\67"+
		"\1\uffff\1\70\1\67\1\uffff\1\70\1\67\1\uffff\1\70\1\67\1\uffff\1\70\1"+
		"\67\1\uffff\1\70\1\67\1\uffff\55\0\2\uffff\12\0\24\uffff\1\0\5\uffff\1"+
		"\0\42\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff"+
		"\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff";
	static final String DFA128_acceptS =
		"\14\uffff\1\2\u00ca\uffff\1\1\64\uffff";
	static final String DFA128_specialS =
		"\146\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
		"\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1"+
		"\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1"+
		"\51\1\52\1\53\1\54\2\uffff\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65"+
		"\1\66\24\uffff\1\67\5\uffff\1\70\42\uffff\1\71\5\uffff\1\72\5\uffff\1"+
		"\73\5\uffff\1\74\5\uffff\1\75\5\uffff\1\76\5\uffff\1\77\5\uffff\1\100"+
		"\5\uffff}>";
	static final String[] DFA128_transitionS = {
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
			"\1\14\7\uffff\1\u00d7\1\14\1\uffff\1\14\4\uffff\1\14",
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
			"\1\u00dc",
			"\1\14\7\uffff\1\u00d7\1\14\1\uffff\1\14\4\uffff\1\14",
			"",
			"\1\u00e2",
			"\1\14\7\uffff\1\u00d7\1\14\1\uffff\1\14\4\uffff\1\14",
			"",
			"\1\u00e8",
			"\1\14\7\uffff\1\u00d7\1\14\1\uffff\1\14\4\uffff\1\14",
			"",
			"\1\u00ee",
			"\1\14\7\uffff\1\u00d7\1\14\1\uffff\1\14\4\uffff\1\14",
			"",
			"\1\u00f4",
			"\1\14\7\uffff\1\u00d7\1\14\1\uffff\1\14\4\uffff\1\14",
			"",
			"\1\u00fa",
			"\1\14\7\uffff\1\u00d7\1\14\1\uffff\1\14\4\uffff\1\14",
			"",
			"\1\u0100",
			"\1\14\7\uffff\1\u00d7\1\14\1\uffff\1\14\4\uffff\1\14",
			"",
			"\1\u0106",
			"\1\14\7\uffff\1\u00d7\1\14\1\uffff\1\14\4\uffff\1\14",
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
			""
	};

	static final short[] DFA128_eot = DFA.unpackEncodedString(DFA128_eotS);
	static final short[] DFA128_eof = DFA.unpackEncodedString(DFA128_eofS);
	static final char[] DFA128_min = DFA.unpackEncodedStringToUnsignedChars(DFA128_minS);
	static final char[] DFA128_max = DFA.unpackEncodedStringToUnsignedChars(DFA128_maxS);
	static final short[] DFA128_accept = DFA.unpackEncodedString(DFA128_acceptS);
	static final short[] DFA128_special = DFA.unpackEncodedString(DFA128_specialS);
	static final short[][] DFA128_transition;

	static {
		int numStates = DFA128_transitionS.length;
		DFA128_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA128_transition[i] = DFA.unpackEncodedString(DFA128_transitionS[i]);
		}
	}

	protected class DFA128 extends DFA {

		public DFA128(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 128;
			this.eot = DFA128_eot;
			this.eof = DFA128_eof;
			this.min = DFA128_min;
			this.max = DFA128_max;
			this.accept = DFA128_accept;
			this.special = DFA128_special;
			this.transition = DFA128_transition;
		}
		@Override
		public String getDescription() {
			return "629:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA128_102 = input.LA(1);
						 
						int index128_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_102);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA128_103 = input.LA(1);
						 
						int index128_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_103);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA128_104 = input.LA(1);
						 
						int index128_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_104);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA128_105 = input.LA(1);
						 
						int index128_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_105);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA128_106 = input.LA(1);
						 
						int index128_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_106);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA128_107 = input.LA(1);
						 
						int index128_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_107);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA128_108 = input.LA(1);
						 
						int index128_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_108);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA128_109 = input.LA(1);
						 
						int index128_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_109);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA128_110 = input.LA(1);
						 
						int index128_110 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_110);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA128_111 = input.LA(1);
						 
						int index128_111 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_111);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA128_112 = input.LA(1);
						 
						int index128_112 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_112);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA128_113 = input.LA(1);
						 
						int index128_113 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_113);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA128_114 = input.LA(1);
						 
						int index128_114 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_114);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA128_115 = input.LA(1);
						 
						int index128_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_115);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA128_116 = input.LA(1);
						 
						int index128_116 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_116);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA128_117 = input.LA(1);
						 
						int index128_117 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_117);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA128_118 = input.LA(1);
						 
						int index128_118 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_118);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA128_119 = input.LA(1);
						 
						int index128_119 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_119);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA128_120 = input.LA(1);
						 
						int index128_120 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_120);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA128_121 = input.LA(1);
						 
						int index128_121 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_121);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA128_122 = input.LA(1);
						 
						int index128_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_122);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA128_123 = input.LA(1);
						 
						int index128_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_123);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA128_124 = input.LA(1);
						 
						int index128_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_124);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA128_125 = input.LA(1);
						 
						int index128_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_125);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA128_126 = input.LA(1);
						 
						int index128_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_126);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA128_127 = input.LA(1);
						 
						int index128_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_127);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA128_128 = input.LA(1);
						 
						int index128_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_128);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA128_129 = input.LA(1);
						 
						int index128_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_129);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA128_130 = input.LA(1);
						 
						int index128_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_130);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA128_131 = input.LA(1);
						 
						int index128_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_131);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA128_132 = input.LA(1);
						 
						int index128_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_132);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA128_133 = input.LA(1);
						 
						int index128_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_133);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA128_134 = input.LA(1);
						 
						int index128_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_134);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA128_135 = input.LA(1);
						 
						int index128_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_135);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA128_136 = input.LA(1);
						 
						int index128_136 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_136);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA128_137 = input.LA(1);
						 
						int index128_137 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_137);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA128_138 = input.LA(1);
						 
						int index128_138 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_138);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA128_139 = input.LA(1);
						 
						int index128_139 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_139);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA128_140 = input.LA(1);
						 
						int index128_140 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_140);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA128_141 = input.LA(1);
						 
						int index128_141 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_141);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA128_142 = input.LA(1);
						 
						int index128_142 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_142);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA128_143 = input.LA(1);
						 
						int index128_143 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_143);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA128_144 = input.LA(1);
						 
						int index128_144 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_144);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA128_145 = input.LA(1);
						 
						int index128_145 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_145);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA128_146 = input.LA(1);
						 
						int index128_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_146);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA128_149 = input.LA(1);
						 
						int index128_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_149);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA128_150 = input.LA(1);
						 
						int index128_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_150);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA128_151 = input.LA(1);
						 
						int index128_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_151);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA128_152 = input.LA(1);
						 
						int index128_152 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_152);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA128_153 = input.LA(1);
						 
						int index128_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_153);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA128_154 = input.LA(1);
						 
						int index128_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_154);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA128_155 = input.LA(1);
						 
						int index128_155 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_155);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA128_156 = input.LA(1);
						 
						int index128_156 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_156);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA128_157 = input.LA(1);
						 
						int index128_157 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_157);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA128_158 = input.LA(1);
						 
						int index128_158 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_158);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA128_179 = input.LA(1);
						 
						int index128_179 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_179);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA128_185 = input.LA(1);
						 
						int index128_185 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_185);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA128_220 = input.LA(1);
						 
						int index128_220 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_220);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA128_226 = input.LA(1);
						 
						int index128_226 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_226);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA128_232 = input.LA(1);
						 
						int index128_232 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_232);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA128_238 = input.LA(1);
						 
						int index128_238 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_238);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA128_244 = input.LA(1);
						 
						int index128_244 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_244);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA128_250 = input.LA(1);
						 
						int index128_250 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_250);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA128_256 = input.LA(1);
						 
						int index128_256 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_256);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA128_262 = input.LA(1);
						 
						int index128_262 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_JavaJava()) ) {s = 215;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index128_262);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 128, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA154_eotS =
		"\16\uffff";
	static final String DFA154_eofS =
		"\16\uffff";
	static final String DFA154_minS =
		"\1\6\1\0\10\41\2\uffff\1\70\1\41";
	static final String DFA154_maxS =
		"\1\161\1\0\10\67\2\uffff\1\70\1\67";
	static final String DFA154_acceptS =
		"\12\uffff\1\2\1\1\2\uffff";
	static final String DFA154_specialS =
		"\1\uffff\1\0\14\uffff}>";
	static final String[] DFA154_transitionS = {
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

	static final short[] DFA154_eot = DFA.unpackEncodedString(DFA154_eotS);
	static final short[] DFA154_eof = DFA.unpackEncodedString(DFA154_eofS);
	static final char[] DFA154_min = DFA.unpackEncodedStringToUnsignedChars(DFA154_minS);
	static final char[] DFA154_max = DFA.unpackEncodedStringToUnsignedChars(DFA154_maxS);
	static final short[] DFA154_accept = DFA.unpackEncodedString(DFA154_acceptS);
	static final short[] DFA154_special = DFA.unpackEncodedString(DFA154_specialS);
	static final short[][] DFA154_transition;

	static {
		int numStates = DFA154_transitionS.length;
		DFA154_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA154_transition[i] = DFA.unpackEncodedString(DFA154_transitionS[i]);
		}
	}

	protected class DFA154 extends DFA {

		public DFA154(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 154;
			this.eot = DFA154_eot;
			this.eof = DFA154_eof;
			this.min = DFA154_min;
			this.max = DFA154_max;
			this.accept = DFA154_accept;
			this.special = DFA154_special;
			this.transition = DFA154_transition;
		}
		@Override
		public String getDescription() {
			return "790:21: ( type | expression )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA154_1 = input.LA(1);
						 
						int index154_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred234_JavaJava()) ) {s = 11;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index154_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 154, _s, input);
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
	public static final BitSet FOLLOW_typeExt_in_normalClassDeclaration526 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_normalClassDeclaration529 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008000L});
	public static final BitSet FOLLOW_79_in_normalClassDeclaration543 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_normalClassDeclaration547 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_classBody_in_normalClassDeclaration560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_typeParameters583 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_typeParameter_in_typeParameters586 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_39_in_typeParameters589 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_typeParameter_in_typeParameters592 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_52_in_typeParameters596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_typeParameter621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_typeParameter623 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeBound_in_typeParameter626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_typeExt645 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_typeExt647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeBound676 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_typeBound679 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_typeBound681 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ENUM_in_enumDeclaration702 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_enumDeclaration704 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008000L});
	public static final BitSet FOLLOW_79_in_enumDeclaration707 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_enumDeclaration711 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_enumBody_in_enumDeclaration715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_enumBody734 = new BitSet(new long[]{0x0041008000008000L,0x0001000000000000L});
	public static final BitSet FOLLOW_enumConstants_in_enumBody738 = new BitSet(new long[]{0x0001008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_enumBody741 = new BitSet(new long[]{0x0001000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_enumBodyDeclarations_in_enumBody744 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_enumBody747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants768 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_enumConstants771 = new BitSet(new long[]{0x0040000000008000L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants775 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_annotations_in_enumConstant800 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_enumConstant803 = new BitSet(new long[]{0x0000000100000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_arguments_in_enumConstant805 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_classBody_in_enumConstant808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_enumBodyDeclarations832 = new BitSet(new long[]{0x5843000000008102L,0x00001644EE3C1446L});
	public static final BitSet FOLLOW_classBodyDeclaration_in_enumBodyDeclarations835 = new BitSet(new long[]{0x5843000000008102L,0x00001644EE3C1446L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_normalInterfaceDeclaration893 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_normalInterfaceDeclaration897 = new BitSet(new long[]{0x0002000000000000L,0x0000100000000100L});
	public static final BitSet FOLLOW_typeParameters_in_normalInterfaceDeclaration901 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000100L});
	public static final BitSet FOLLOW_72_in_normalInterfaceDeclaration905 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_normalInterfaceDeclaration908 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_normalInterfaceDeclaration912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeList935 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_typeList938 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_typeList942 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_108_in_classBody967 = new BitSet(new long[]{0x5843000000008100L,0x00011644EE3C1446L});
	public static final BitSet FOLLOW_classBodyDeclaration_in_classBody971 = new BitSet(new long[]{0x5843000000008100L,0x00011644EE3C1446L});
	public static final BitSet FOLLOW_112_in_classBody974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_interfaceBody998 = new BitSet(new long[]{0x5843000000008100L,0x00010644EE3C1446L});
	public static final BitSet FOLLOW_interfaceBodyDeclaration_in_interfaceBody1001 = new BitSet(new long[]{0x5843000000008100L,0x00010644EE3C1446L});
	public static final BitSet FOLLOW_112_in_interfaceBody1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_classBodyDeclaration1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_classBodyDeclaration1036 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_classBodyDeclaration1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_classBodyDeclaration1053 = new BitSet(new long[]{0x5042000000008100L,0x00000200201C1046L});
	public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericMethodOrConstructorDecl_in_memberDecl1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberDeclaration_in_memberDecl1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_memberDecl1102 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_memberDecl1105 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDecl1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_memberDecl1122 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_constructorDeclaratorRest_in_memberDecl1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_memberDecl1137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_memberDecl1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_memberDeclaration1170 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_methodDeclaration_in_memberDeclaration1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1203 = new BitSet(new long[]{0x5000000000008000L,0x0000020020141042L});
	public static final BitSet FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_genericMethodOrConstructorRest1229 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_105_in_genericMethodOrConstructorRest1233 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1236 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1250 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_methodDeclaration1273 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_methodDeclaratorRest_in_methodDeclaration1277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarators_in_fieldDeclaration1295 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_fieldDeclaration1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_interfaceBodyDeclaration1325 = new BitSet(new long[]{0x5042000000008100L,0x00000200201C1046L});
	public static final BitSet FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_interfaceBodyDeclaration1337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_interfaceMemberDecl1376 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMemberDecl1379 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_interfaceMemberDecl1393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_interfaceMemberDecl1403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_interfaceMethodOrFieldDecl1426 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMethodOrFieldDecl1428 = new BitSet(new long[]{0x0084000100000000L});
	public static final BitSet FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest1456 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_interfaceMethodOrFieldRest1458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest1470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaratorRest1493 = new BitSet(new long[]{0x0081000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_55_in_methodDeclaratorRest1496 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_methodDeclaratorRest1500 = new BitSet(new long[]{0x0081000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_methodDeclaratorRest1514 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaratorRest1518 = new BitSet(new long[]{0x0001000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_methodBody_in_methodDeclaratorRest1534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_methodDeclaratorRest1548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest1581 = new BitSet(new long[]{0x0001000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_voidMethodDeclaratorRest1584 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1587 = new BitSet(new long[]{0x0001000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest1603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_voidMethodDeclaratorRest1617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest1651 = new BitSet(new long[]{0x0081000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_55_in_interfaceMethodDeclaratorRest1654 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_interfaceMethodDeclaratorRest1658 = new BitSet(new long[]{0x0081000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_interfaceMethodDeclaratorRest1665 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest1668 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_interfaceMethodDeclaratorRest1672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameters_in_interfaceGenericMethodDecl1697 = new BitSet(new long[]{0x5000000000008000L,0x0000020020141042L});
	public static final BitSet FOLLOW_type_in_interfaceGenericMethodDecl1700 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_105_in_interfaceGenericMethodDecl1704 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceGenericMethodDecl1709 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl1721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest1743 = new BitSet(new long[]{0x0001000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_voidInterfaceMethodDeclaratorRest1746 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest1749 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_voidInterfaceMethodDeclaratorRest1753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_constructorDeclaratorRest1778 = new BitSet(new long[]{0x0000000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_constructorDeclaratorRest1781 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1785 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_constructorBody_in_constructorDeclaratorRest1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantDeclarator1808 = new BitSet(new long[]{0x0084000000000000L});
	public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclarator1812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1835 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_variableDeclarators1838 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1842 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator1865 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_50_in_variableDeclarator1868 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1895 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_constantDeclaratorsRest1898 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_constantDeclarator_in_constantDeclaratorsRest1902 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_55_in_constantDeclaratorRest1924 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_constantDeclaratorRest1928 = new BitSet(new long[]{0x0084000000000000L});
	public static final BitSet FOLLOW_50_in_constantDeclaratorRest1935 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_constantDeclaratorRest1937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableDeclaratorId1960 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_variableDeclaratorId1966 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_variableDeclaratorId1969 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableInitializer2002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_arrayInitializer2029 = new BitSet(new long[]{0x500003310260D0C0L,0x0003128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer2033 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_arrayInitializer2036 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer2040 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_arrayInitializer2045 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_arrayInitializer2052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_modifier2072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_modifier2082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_modifier2095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_modifier2107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_modifier2119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_modifier2132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_modifier2144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_modifier2157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_modifier2172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_modifier2184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_modifier2198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_modifier2211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_packageOrTypeName2233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_enumConstantName2252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_typeName2273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_type2287 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_type2290 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_type2294 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_type2304 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_type2308 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_type2312 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType2331 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2335 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_classOrInterfaceType2339 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType2343 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2345 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_60_in_primitiveType2366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_primitiveType2378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_primitiveType2391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_primitiveType2404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_primitiveType2417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_primitiveType2431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_primitiveType2444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_primitiveType2457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_variableModifier2479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_variableModifier2490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_typeArguments2509 = new BitSet(new long[]{0x5020000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments2513 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_39_in_typeArguments2516 = new BitSet(new long[]{0x5020000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments2519 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_52_in_typeArguments2523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeArgument2547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_typeArgument2557 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000100L});
	public static final BitSet FOLLOW_72_in_typeArgument2561 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_96_in_typeArgument2566 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_typeArgument2571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList2597 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_qualifiedNameList2600 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList2604 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_32_in_formalParameters2625 = new BitSet(new long[]{0x5040000200008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters2629 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_formalParameters2632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_formalParameterDecls2658 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_formalParameterDecls2660 = new BitSet(new long[]{0x0000100000008000L});
	public static final BitSet FOLLOW_formalParameterDeclsRest_in_formalParameterDecls2662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2687 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_formalParameterDeclsRest2690 = new BitSet(new long[]{0x5040000000008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDeclsRest2694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_formalParameterDeclsRest2706 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_methodBody2730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_constructorBody2751 = new BitSet(new long[]{0x784303310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody2754 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_blockStatement_in_constructorBody2757 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_112_in_constructorBody2760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2781 = new BitSet(new long[]{0x0000000000000000L,0x0000000900000000L});
	public static final BitSet FOLLOW_99_in_explicitConstructorInvocation2785 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_explicitConstructorInvocation2790 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation2795 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_explicitConstructorInvocation2797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_explicitConstructorInvocation2809 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_explicitConstructorInvocation2811 = new BitSet(new long[]{0x0002000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2814 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_explicitConstructorInvocation2817 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation2819 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_explicitConstructorInvocation2821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualifiedName2845 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_qualifiedName2850 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_qualifiedName2856 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_integerLiteral_in_literal2885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FloatingPointLiteral_in_literal2895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CharacterLiteral_in_literal2908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_literal2921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_literal2933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_literal2943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HexLiteral_in_integerLiteral2964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OctalLiteral_in_integerLiteral2976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DecimalLiteral_in_integerLiteral2988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_booleanLiteral3009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_booleanLiteral3021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_annotations3043 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_annotation3063 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_annotationName_in_annotation3065 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_annotation3069 = new BitSet(new long[]{0x504003330260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValuePairs_in_annotation3075 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_elementValue_in_annotation3079 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_annotation3084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationName3114 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_annotationName3118 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_annotationName3122 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs3143 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_elementValuePairs3146 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs3150 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_Identifier_in_elementValuePair3171 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_elementValuePair3175 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValuePair3179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_elementValue3202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_elementValue3212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue3222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_elementValueArrayInitializer3245 = new BitSet(new long[]{0x504003B10260D0C0L,0x0003128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer3249 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_elementValueArrayInitializer3252 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer3255 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_elementValueArrayInitializer3262 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_elementValueArrayInitializer3267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_annotationTypeDeclaration3291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_annotationTypeDeclaration3293 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_annotationTypeDeclaration3295 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_annotationTypeBody_in_annotationTypeDeclaration3299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_annotationTypeBody3322 = new BitSet(new long[]{0x5840000000008100L,0x00010444EE3C1446L});
	public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody3326 = new BitSet(new long[]{0x5840000000008100L,0x00010444EE3C1446L});
	public static final BitSet FOLLOW_112_in_annotationTypeBody3330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_annotationTypeElementDeclaration3354 = new BitSet(new long[]{0x5040000000008100L,0x00000000201C1046L});
	public static final BitSet FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration3356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_annotationTypeElementRest3379 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest3381 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_annotationTypeElementRest3393 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest3406 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_annotationTypeElementRest3419 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest3432 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest3458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest3468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationMethodRest3491 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_annotationMethodRest3495 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_annotationMethodRest3500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_defaultValue_in_annotationMethodRest3504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarators_in_annotationConstantRest3528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_defaultValue3551 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_defaultValue3555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_block3576 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_blockStatement_in_block3580 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_112_in_block3583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement3609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement3619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_blockStatement3628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement3653 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_localVariableDeclarationStatement3656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_localVariableDeclaration3677 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_localVariableDeclaration3679 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclarators_in_localVariableDeclaration3681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifier_in_variableModifiers3706 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_statement3724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSERT_in_statement3734 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3736 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_47_in_statement3739 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3741 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_statement3755 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3758 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3760 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_statement3770 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_statement3786 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_statement3790 = new BitSet(new long[]{0x504103310260D0C0L,0x0002028920D41642L});
	public static final BitSet FOLLOW_forControl_in_statement3794 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement3796 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_statement3810 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3813 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_statement3826 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3829 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_107_in_statement3831 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3835 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_statement3849 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000801L});
	public static final BitSet FOLLOW_catches_in_statement3864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_statement3866 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_statement3881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_statement3895 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_statement3918 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3922 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_statement3924 = new BitSet(new long[]{0x8000000000000000L,0x0001000000000010L});
	public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement3926 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_statement3928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_statement3938 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3941 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_statement3953 = new BitSet(new long[]{0x500103310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3957 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_statement3972 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3975 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_statement3989 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_Identifier_in_statement3992 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_statement4008 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_Identifier_in_statement4012 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement4017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_statement4029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statementExpression_in_statement4041 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement4043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement4056 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement4060 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement4062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catchClause_in_catches4085 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_catchClause_in_catches4088 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_catchClause4113 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_catchClause4116 = new BitSet(new long[]{0x5040000000008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameter_in_catchClause4120 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_catchClause4122 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_catchClause4126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_formalParameter4145 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_formalParameter4147 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameter4149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups4177 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup4204 = new BitSet(new long[]{0xF84103310260D1D2L,0x00021B9FFEDC767EL});
	public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup4207 = new BitSet(new long[]{0x784103310260D1D2L,0x00021B9FFEDC766EL});
	public static final BitSet FOLLOW_63_in_switchLabel4231 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_constantExpression_in_switchLabel4234 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel4236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_switchLabel4246 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_enumConstantName_in_switchLabel4250 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel4252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_switchLabel4262 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel4266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enhancedForControl_in_forControl4297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_forControl4307 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_forControl4310 = new BitSet(new long[]{0x500103310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_forControl4312 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_forControl4315 = new BitSet(new long[]{0x500003310260D0C2L,0x0002028920D41242L});
	public static final BitSet FOLLOW_forUpdate_in_forControl4317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_forInit4337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit4348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_enhancedForControl4371 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_enhancedForControl4373 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_enhancedForControl4375 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_enhancedForControl4379 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_enhancedForControl4381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forUpdate4400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_parExpression4421 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_parExpression4424 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_parExpression4426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList4451 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_expressionList4454 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_expressionList4457 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_expression_in_statementExpression4478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_constantExpression4502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_expression4525 = new BitSet(new long[]{0x0416444890000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_assignmentOperator_in_expression4528 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_expression4530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_assignmentOperator4567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_assignmentOperator4577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_assignmentOperator4587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_assignmentOperator4597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_assignmentOperator4607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_assignmentOperator4617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_assignmentOperator4627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignmentOperator4637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_assignmentOperator4658 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_assignmentOperator4662 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4700 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4704 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4708 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4743 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4747 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression4780 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_conditionalExpression4784 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression4786 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_conditionalExpression4788 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression4790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression4812 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_conditionalOrExpression4816 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression4820 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4842 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_conditionalAndExpression4846 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4850 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4872 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_inclusiveOrExpression4876 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4880 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression4902 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_exclusiveOrExpression4906 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression4908 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression4930 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_andExpression4934 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression4938 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression4960 = new BitSet(new long[]{0x0008000004000002L});
	public static final BitSet FOLLOW_51_in_equalityExpression4965 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_26_in_equalityExpression4970 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression4975 = new BitSet(new long[]{0x0008000004000002L});
	public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression4997 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_instanceOfExpression5000 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_instanceOfExpression5003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression5024 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_relationalOp_in_relationalExpression5028 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression5030 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_49_in_relationalOp5065 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_relationalOp5069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_relationalOp5099 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_relationalOp5103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_relationalOp5124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_relationalOp5136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression5157 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_shiftOp_in_shiftExpression5161 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression5163 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_49_in_shiftOp5194 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_shiftOp5198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_shiftOp5230 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp5234 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp5238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_shiftOp5268 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp5272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5302 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_36_in_additiveExpression5307 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_40_in_additiveExpression5312 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5317 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5339 = new BitSet(new long[]{0x0000200408000002L});
	public static final BitSet FOLLOW_34_in_multiplicativeExpression5345 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_45_in_multiplicativeExpression5351 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_27_in_multiplicativeExpression5357 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5362 = new BitSet(new long[]{0x0000200408000002L});
	public static final BitSet FOLLOW_36_in_unaryExpression5388 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_unaryExpression5400 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_unaryExpression5412 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unaryExpression5424 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression5436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_unaryExpressionNotPlusMinus5455 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_unaryExpressionNotPlusMinus5467 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus5479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus5489 = new BitSet(new long[]{0x00800A2000000002L});
	public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus5491 = new BitSet(new long[]{0x00800A2000000002L});
	public static final BitSet FOLLOW_37_in_unaryExpressionNotPlusMinus5495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unaryExpressionNotPlusMinus5499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_castExpression5521 = new BitSet(new long[]{0x5000000000000000L,0x0000000020141042L});
	public static final BitSet FOLLOW_primitiveType_in_castExpression5524 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_castExpression5526 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_castExpression5528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_castExpression5537 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_type_in_castExpression5541 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_expression_in_castExpression5545 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_castExpression5548 = new BitSet(new long[]{0x500000010260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression5550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parExpression_in_primary5569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_primary5579 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_43_in_primary5583 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_primary5587 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_primary5591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_primary5603 = new BitSet(new long[]{0x0000080100000000L});
	public static final BitSet FOLLOW_superSuffix_in_primary5606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primary5616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_primary5626 = new BitSet(new long[]{0x5002000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_creator_in_primary5629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primary5641 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_43_in_primary5646 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_primary5652 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_primary5657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_primary5669 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_55_in_primary5672 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_primary5675 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_43_in_primary5680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_primary5682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_primary5694 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_primary5697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_primary5701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_identifierSuffix5722 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_identifierSuffix5726 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_identifierSuffix5736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_identifierSuffix5748 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_identifierSuffix5752 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_identifierSuffix5754 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix5769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_identifierSuffix5784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5795 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_explicitGenericInvocation_in_identifierSuffix5799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5809 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_identifierSuffix5813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5824 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_identifierSuffix5828 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix5830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_identifierSuffix5846 = new BitSet(new long[]{0x0002000000008000L});
	public static final BitSet FOLLOW_innerCreator_in_identifierSuffix5849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator5868 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_createdName_in_creator5870 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator5872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createdName_in_creator5882 = new BitSet(new long[]{0x0080000100000000L});
	public static final BitSet FOLLOW_arrayCreatorRest_in_creator5885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator5889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_createdName5911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_createdName5921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_innerCreator5946 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_innerCreator5949 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_classCreatorRest_in_innerCreator5951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5970 = new BitSet(new long[]{0x510003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5985 = new BitSet(new long[]{0x0080000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5988 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5991 = new BitSet(new long[]{0x0080000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest5997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayCreatorRest6011 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest6013 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest6018 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_arrayCreatorRest6021 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest6023 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest6030 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest6033 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_arguments_in_classCreatorRest6066 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_classBody_in_classCreatorRest6068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation6092 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_explicitGenericInvocation6094 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitGenericInvocation6097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_nonWildcardTypeArguments6120 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments6124 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_nonWildcardTypeArguments6126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector6151 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_selector6155 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_arguments_in_selector6160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector6171 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_selector6175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector6187 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_selector6191 = new BitSet(new long[]{0x0000080100000000L});
	public static final BitSet FOLLOW_superSuffix_in_selector6193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector6205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_selector6209 = new BitSet(new long[]{0x0002000000008000L});
	public static final BitSet FOLLOW_innerCreator_in_selector6214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_selector6224 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_selector6228 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_selector6230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arguments_in_superSuffix6255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_superSuffix6265 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_superSuffix6269 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_arguments_in_superSuffix6273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_arguments6293 = new BitSet(new long[]{0x500003330260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expressionList_in_arguments6296 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_arguments6299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotations_in_synpred5_JavaJava73 = new BitSet(new long[]{0x0840000000000100L,0x00000000CF080404L});
	public static final BitSet FOLLOW_packageDeclaration_in_synpred5_JavaJava87 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_importDeclaration_in_synpred5_JavaJava89 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred5_JavaJava92 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred5_JavaJava107 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred5_JavaJava109 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred113_JavaJava2754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred117_JavaJava2781 = new BitSet(new long[]{0x0000000000000000L,0x0000000900000000L});
	public static final BitSet FOLLOW_set_in_synpred117_JavaJava2784 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_synpred117_JavaJava2795 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_synpred117_JavaJava2797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_synpred128_JavaJava3043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_synpred151_JavaJava3609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred152_JavaJava3619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_synpred157_JavaJava3770 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_synpred157_JavaJava3774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred162_JavaJava3864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_synpred162_JavaJava3866 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_synpred162_JavaJava3869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred163_JavaJava3881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchLabel_in_synpred178_JavaJava4204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_synpred180_JavaJava4231 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_constantExpression_in_synpred180_JavaJava4234 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred180_JavaJava4236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_synpred181_JavaJava4246 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_enumConstantName_in_synpred181_JavaJava4250 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred181_JavaJava4252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enhancedForControl_in_synpred182_JavaJava4297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_synpred186_JavaJava4337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred188_JavaJava4528 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred188_JavaJava4530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred198_JavaJava4648 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred198_JavaJava4650 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred198_JavaJava4652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred199_JavaJava4688 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred199_JavaJava4690 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred199_JavaJava4692 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred199_JavaJava4694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred200_JavaJava4733 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred200_JavaJava4735 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred200_JavaJava4737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred211_JavaJava5057 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred211_JavaJava5059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred212_JavaJava5091 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred212_JavaJava5093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred215_JavaJava5186 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred215_JavaJava5188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred216_JavaJava5220 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred216_JavaJava5222 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred216_JavaJava5224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred217_JavaJava5260 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred217_JavaJava5262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_synpred229_JavaJava5479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_synpred233_JavaJava5521 = new BitSet(new long[]{0x5000000000000000L,0x0000000020141042L});
	public static final BitSet FOLLOW_primitiveType_in_synpred233_JavaJava5524 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_synpred233_JavaJava5526 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_synpred233_JavaJava5528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred234_JavaJava5541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_synpred236_JavaJava5583 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_synpred236_JavaJava5587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred237_JavaJava5591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_synpred242_JavaJava5646 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_synpred242_JavaJava5652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred243_JavaJava5657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred249_JavaJava5748 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred249_JavaJava5752 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred249_JavaJava5754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred262_JavaJava6018 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred262_JavaJava6021 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred262_JavaJava6023 = new BitSet(new long[]{0x0000000000000002L});
}
