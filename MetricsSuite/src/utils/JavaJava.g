
grammar JavaJava;
options {backtrack=true; memoize=true;
	
	output='AST';
	
	}
//@parser::namespace {OOPIES}
//@lexer::namespace {OOPIES}
@header {
package metricssuite;
}

@lexer::header {
package metricssuite;

}
@members {

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
 }
@lexer::members {
	public int ws = 0;
	public int commentcount = 0;
	
	
	public int constantcount = 0;
	//public int keywordCount = 0;
 // protected boolean enumIsKeyword = true;
  //protected boolean assertIsKeyword = true;
}

// starting point for parsing a java file
/* The annotations are separated out to make parsing faster, but must be associated with
   a packageDeclaration or a typeDeclaration (and not an empty one). */
compilationUnit
    :   annotations
        (   packageDeclaration importDeclaration* typeDeclaration*
        |   classOrInterfaceDeclaration typeDeclaration*
        )
    |   packageDeclaration? importDeclaration* typeDeclaration*
    ;

packageDeclaration
    :   'package'{importKWCount++;} qualifiedName ';' { s(";"); importIDCount++; packageName = myID;}
    ;
    
importDeclaration
    :   'import' {importKWCount++;} 'static'? qualifiedName {importIDCount++;} ('.' {s(".");} '*' {s("*");})? ';' {s(";");}
    ;
    
typeDeclaration
    :   classOrInterfaceDeclaration
    |   ';'{s(";");}
    ;
    
classOrInterfaceDeclaration
    :   classOrInterfaceModifiers (classDeclaration | interfaceDeclaration)
    ;
    
classOrInterfaceModifiers
    :   classOrInterfaceModifier*
    ;

classOrInterfaceModifier
    :   annotation   // class or interface
    |   'public'     {keywordCount++;JavaMetrics.uniqueKeywords.add("public");}// class or interface
    |   'protected'  {keywordCount++;JavaMetrics.uniqueKeywords.add("protected");}// class or interface
    |   'private'    {keywordCount++; JavaMetrics.uniqueKeywords.add("private");}// class or interface
    |   'abstract'   {keywordCount++;JavaMetrics.uniqueKeywords.add("abstract");}// class or interface
    |   'static'     {keywordCount++;JavaMetrics.uniqueKeywords.add("static");}// class or interface
    |   'final'      {keywordCount++;JavaMetrics.uniqueKeywords.add("final");}// class only -- does not apply to interfaces
    |   'strictfp'   {keywordCount++;JavaMetrics.uniqueKeywords.add("strictfp");}// class or interface
    ;

modifiers
    :   modifier*
    ;

classDeclaration
    :   normalClassDeclaration
    |   enumDeclaration
    ;
    
normalClassDeclaration
    :   'class' Identifier { className=$Identifier.text; classCount++;
    	if(!JavaMetrics.inheritanceTree.containsKey(className)){
    		JavaMetrics.inheritanceTree.put(className, null);
    	}
    	
    	}{keywordCount++; JavaMetrics.uniqueKeywords.add("class"); id($Identifier.text);} typeParameters?
        //('extends' {keywordCount++;JavaMetrics.uniqueKeywords.add("extends");}type)? 
        (typeExt {keywordCount++;JavaMetrics.uniqueKeywords.add("extends");}type)? 
        ('implements' {keywordCount++;JavaMetrics.uniqueKeywords.add("implements");} typeList )?
        classBody
    ;
    
typeParameters
    :   '<'{s("<");} typeParameter (','{s(",");} typeParameter)* '>' {s(">");}
        ;

typeParameter
    :   Identifier('extends'{keywordCount++;JavaMetrics.uniqueKeywords.add("extends");} typeBound)?
    ;

typeExt
    : 'extends' Identifier {extendsClass =$Identifier.text;
    	JavaMetrics.inheritanceTree.put(className,extendsClass);
    	
    	if(JavaMetrics.classNames.containsKey(extendsClass)){
    		JavaMetrics.classNames.put(extendsClass, JavaMetrics.classNames.get(extendsClass)+1);
    	}else{
    		JavaMetrics.classNames.put(extendsClass, 1);
    	}
    }
    ;
        
typeBound
    :   type ('&' type)*
    ;

enumDeclaration
    :   ENUM Identifier ('implements' {keywordCount++;JavaMetrics.uniqueKeywords.add("implements");} typeList)? enumBody
    ;

enumBody
    :   '{' {s("{");} enumConstants? ','? enumBodyDeclarations? '}' {s("}");}
    ;

enumConstants
    :   enumConstant (',' {s(",");} enumConstant)*
    ;
    
enumConstant
    :   annotations? Identifier arguments? classBody?
    ;
    
enumBodyDeclarations
    :   ';' (classBodyDeclaration)*
    ;
    
interfaceDeclaration
    :   normalInterfaceDeclaration
    |   annotationTypeDeclaration
    ;
    
normalInterfaceDeclaration
    :   'interface' {keywordCount++;JavaMetrics.uniqueKeywords.add("interface");} Identifier {id($Identifier.text);} typeParameters? ('extends'{keywordCount++;JavaMetrics.uniqueKeywords.add("extends");} typeList)? interfaceBody
    ;
    
typeList
    :   type (',' {s(",");} type)*
    ;
    
classBody
    :   '{'{s("{");}  classBodyDeclaration* '}'{s("}");}
    ;
    
interfaceBody
    :   '{'{s("{");} interfaceBodyDeclaration* '}'{s("}");}
    ;

classBodyDeclaration
    :   ';' {s(";");}
    |   'static' ?{keywordCount++;JavaMetrics.uniqueKeywords.add("static");}   block
    |   modifiers memberDecl
    ;
    
memberDecl
    :   {inMethod=true;} genericMethodOrConstructorDecl
    |   memberDeclaration
    |   {inMethod=true;} 'void'{keywordCount++;JavaMetrics.uniqueKeywords.add("void");} Identifier {id($Identifier.text); methodName = $Identifier.text;}  voidMethodDeclaratorRest
    |   {inMethod=true;} Identifier {{id($Identifier.text);} methodName = $Identifier.text;}  constructorDeclaratorRest
    |   interfaceDeclaration
    |   classDeclaration
    ;
    
memberDeclaration
    :   type ({inMethod=true;} methodDeclaration   | {inMethod=false;} fieldDeclaration)
    ;

genericMethodOrConstructorDecl
    :   typeParameters genericMethodOrConstructorRest
    ;
    
genericMethodOrConstructorRest
    :   (type | 'void') Identifier {if(primitive){id($Identifier.text); }} methodDeclaratorRest
    |   Identifier {id($Identifier.text); methodName = $Identifier.text;} constructorDeclaratorRest
    ;

methodDeclaration
    :   Identifier {// System.out.println("Method=" + $Identifier.text); 
                     inMethod = true;
                     methodName = $Identifier.text;
                    // if(primitive){
                         id($Identifier.text);
                         primitive=false;
                    // }
                   } methodDeclaratorRest
    ;

fieldDeclaration
    :  variableDeclarators ';'{primitive=false; inMethod=false; s(";");}
    ;
        
interfaceBodyDeclaration
    :   modifiers interfaceMemberDecl
    |   ';'
    ;

interfaceMemberDecl
    :   interfaceMethodOrFieldDecl
    |   interfaceGenericMethodDecl
    |   'void'{keywordCount++;JavaMetrics.uniqueKeywords.add("void");} Identifier { id($Identifier.text);  methodName = $Identifier.text;} voidInterfaceMethodDeclaratorRest
    |   interfaceDeclaration
    |   classDeclaration
    ;
    
interfaceMethodOrFieldDecl
    :   type Identifier { id($Identifier.text);} interfaceMethodOrFieldRest
    ;
    
interfaceMethodOrFieldRest 
    :   constantDeclaratorsRest ';' {s(";");}
    |   interfaceMethodDeclaratorRest
    ;
    
methodDeclaratorRest
    :   formalParameters ('[' {s("[");} ']'{s("]");})*
        ('throws' {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");} qualifiedNameList)?
        (   methodBody
        |   ';'
        )
    ;
    
voidMethodDeclaratorRest
    :   formalParameters ('throws'{keywordCount++;JavaMetrics.uniqueKeywords.add("throws");} qualifiedNameList)?
        (   methodBody
        |   ';' {s(";");}
        )
    ;
    
interfaceMethodDeclaratorRest
    :  formalParameters ('[' {s("[");} ']' {s("]");})* ('throws'{keywordCount++;JavaMetrics.uniqueKeywords.add("throws");} qualifiedNameList)? ';' {s(";");}
    ;
    
interfaceGenericMethodDecl
    :   typeParameters (type | 'void' {keywordCount++;JavaMetrics.uniqueKeywords.add("void");}) Identifier {if(primitive) id($Identifier.text);}
        interfaceMethodDeclaratorRest
    ;
    
voidInterfaceMethodDeclaratorRest
    :  formalParameters ('throws'{keywordCount++;JavaMetrics.uniqueKeywords.add("throws");} qualifiedNameList)? ';' {s(";");}
    ;
    
constructorDeclaratorRest
    :   formalParameters ('throws' {keywordCount++;JavaMetrics.uniqueKeywords.add("throws");} qualifiedNameList)? constructorBody
    ;

constantDeclarator
    :   Identifier {if(primitive && !inMethod) {id($Identifier.text); /*JavaMetrics.ssc.push(new Symbol($Identifier.text, PrimitiveType, className)); */}} constantDeclaratorRest
    ;
    
variableDeclarators
    :   variableDeclarator (',' {s(",");} variableDeclarator)* {primitive=false;}
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;
    
constantDeclaratorsRest
    :   constantDeclaratorRest (',' {s(",");} constantDeclarator)*
    ;

constantDeclaratorRest
    :   ('[' {s("[");} ']' {s("]");})*  '=' variableInitializer
    ;
    
variableDeclaratorId
    :   Identifier  {if(!inMethod) 
                       {
                       	 identcount++;
                         //id(new Symbol($Identifier.text,PrimitiveType, className)); 
                         /*JavaMetrics.ssc.push(new Symbol($Identifier.text,"unknown", className));*/ 
                        }
                      else if(inMethod) {
			 identcount++;
//                       		id(new Symbol($Identifier.text,PrimitiveType, methodName)); 
                         	/*JavaMetrics.ssm.push(new Symbol($Identifier.text,"unknown", methodName)); */
                                         
                      }    
                    } ('['{s("[");} ']' {s("]");})*
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;
        
arrayInitializer
    :   '{' {s("{");}(variableInitializer (',' {s(",");} variableInitializer)* (',')? )? '}'{s("}");}
    ;

modifier
    :   annotation
    |   'public'  {keywordCount++;JavaMetrics.uniqueKeywords.add("public");}
    |   'protected' {keywordCount++;JavaMetrics.uniqueKeywords.add("protected");}
    |   'private' {keywordCount++; JavaMetrics.uniqueKeywords.add("private");}
    |   'static' 	{keywordCount++; JavaMetrics.uniqueKeywords.add("static");}
    |   'abstract'	{keywordCount++;JavaMetrics.uniqueKeywords.add("abstract");}
    |   'final'		{keywordCount++;JavaMetrics.uniqueKeywords.add("final");}
    |   'native'    {keywordCount++;JavaMetrics.uniqueKeywords.add("native");}
    |   'synchronized' {keywordCount++;JavaMetrics.uniqueKeywords.add("synchronized");}
    |   'transient'   {keywordCount++;JavaMetrics.uniqueKeywords.add("transient");}
    |   'volatile'  {keywordCount++;JavaMetrics.uniqueKeywords.add("volatile");}
    |   'strictfp'  {keywordCount++;JavaMetrics.uniqueKeywords.add("strictfp");}
    ;

packageOrTypeName
    :   qualifiedName
    ;

enumConstantName
    :   Identifier {if(primitive) id($Identifier.text);}
    ;

typeName
    :   qualifiedName
    ;

type
	:	classOrInterfaceType ('[' {s("[");} ']' {s("]");})* 
	|	primitiveType {primitive=true;}('[' {s("[");} ']' {s("]");})*
	;



classOrInterfaceType
	:	I7=Identifier { id($I7.text);} typeArguments? ('.' {s(".");} Identifier typeArguments? )* 
	;

primitiveType
    :   'boolean'	{keywordCount++; PrimitiveType = "boolean"; JavaMetrics.uniqueKeywords.add("boolean");}
    |   'char'		{keywordCount++;  PrimitiveType = "char";  JavaMetrics.uniqueKeywords.add("char");}
    |   'byte'		{keywordCount++;  PrimitiveType = "byte"; JavaMetrics.uniqueKeywords.add("byte");}
    |   'short'		{keywordCount++;  PrimitiveType = "short"; JavaMetrics.uniqueKeywords.add("short");}
    |   'int' 		{keywordCount++;  PrimitiveType = "int"; JavaMetrics.uniqueKeywords.add("int");}
    |   'long'		{keywordCount++;  PrimitiveType = "long"; JavaMetrics.uniqueKeywords.add("long");}
    |   'float'		{keywordCount++;  PrimitiveType = "float"; JavaMetrics.uniqueKeywords.add("float");}
    |   'double' 	{keywordCount++;  PrimitiveType = "double"; JavaMetrics.uniqueKeywords.add("double");}
    ;

variableModifier
    :   'final'{keywordCount++;JavaMetrics.uniqueKeywords.add("final");}
    |   annotation
    ;

typeArguments
    :   '<' {s("<");} typeArgument (','{s(",");} typeArgument)* '>'{s(">");}
    ;
    
typeArgument
    :   type
    |   '?' (('extends'{keywordCount++;JavaMetrics.uniqueKeywords.add("extends");} | 'super' {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}) type)? 
    ;
    
qualifiedNameList
    :   qualifiedName (',' {s(",");} qualifiedName)*
    ;

formalParameters
    :   '(' {s("(");} formalParameterDecls? ')' {s(")");} 
    ;
    
formalParameterDecls
    :   variableModifiers type formalParameterDeclsRest {primitive = false;}
    ;
    
formalParameterDeclsRest
    :   variableDeclaratorId (',' {s(",");} formalParameterDecls)?
    |   '...' variableDeclaratorId
    ;
    
methodBody
    :  block {System.out.println("McCabe for " + methodName + " = " + (mmc+1)); JavaMetrics.mccabeValues.add(methodName + " = " + (mmc+1));mmc = 0;
    		JavaMetrics.methodNames.add(methodName);}
    ;

constructorBody
    :   '{'{s("{");} explicitConstructorInvocation? blockStatement* '}' {s("}");System.out.println("McCabe for " + methodName + " = " + (mmc+1)); JavaMetrics.mccabeValues.add(methodName + " = " + (mmc+1)); mmc = 0;}
    ;

explicitConstructorInvocation
    :   nonWildcardTypeArguments? ('this'{keywordCount++;JavaMetrics.uniqueKeywords.add("this");} | 'super' {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}) arguments ';' {s(";");}
    |   primary '.' {s(".");}nonWildcardTypeArguments? 'super' arguments ';' {s(";");}
    ;


qualifiedName
    :   I1=Identifier {myID  = $I1.text;} ('.' {s(".");} I2=Identifier {myID+="."+$I2.text;})* 
    ;
    
literal 
    :   integerLiteral
    |   FloatingPointLiteral  {JavaMetrics.uniqueConstants.add($FloatingPointLiteral.text);}
    |   CharacterLiteral {JavaMetrics.uniqueConstants.add($CharacterLiteral.text);} 
    |   StringLiteral {JavaMetrics.uniqueConstants.add($StringLiteral.text);}
    |   booleanLiteral
    |   'null' {keywordCount++;JavaMetrics.uniqueKeywords.add("null");}
    ;

integerLiteral
    :   HexLiteral { JavaMetrics.uniqueConstants.add($HexLiteral.text);}
    |   OctalLiteral { JavaMetrics.uniqueConstants.add($OctalLiteral.text);}
    |   DecimalLiteral {JavaMetrics.uniqueConstants.add($DecimalLiteral.text);}
    ;

booleanLiteral
    :   'true' {keywordCount++;JavaMetrics.uniqueKeywords.add("true");}
    |   'false'{keywordCount++;JavaMetrics.uniqueKeywords.add("false");}
    ;

// ANNOTATIONS

annotations
    :   annotation+
    ;

annotation
    :   '@' annotationName ( '(' {s("(");} ( elementValuePairs | elementValue )? ')' {s(")");}  )?
    ;
    
annotationName
    : t1= Identifier {id($t1.text); }('.' {s(".");} Identifier)*
    ;

elementValuePairs
    :   elementValuePair (',' {s(",");} elementValuePair)*
    ;

elementValuePair
    :   Identifier { id($Identifier.text);} '=' {s("=");} elementValue
    ;
    
elementValue
    :   conditionalExpression
    |   annotation
    |   elementValueArrayInitializer
    ;
    
elementValueArrayInitializer
    :   '{' {s("{");}(elementValue (','{s(",");} elementValue)*)? (',')?  '}'{s("}");}
    ;
    
annotationTypeDeclaration
    :   '@' 'interface' Identifier { id($Identifier.text);} annotationTypeBody
    ;
    
annotationTypeBody
    :   '{' {s("{");}(annotationTypeElementDeclaration)* '}'{s("}");}
    ;
    
annotationTypeElementDeclaration
    :   modifiers annotationTypeElementRest
    ;
    
annotationTypeElementRest
    :   type annotationMethodOrConstantRest ';'
    |   normalClassDeclaration ';'?
    |   normalInterfaceDeclaration ';'?
    |   enumDeclaration ';'?
    |   annotationTypeDeclaration ';'?
    ;
    
annotationMethodOrConstantRest
    :   annotationMethodRest
    |   annotationConstantRest
    ;
    
annotationMethodRest
    :   Identifier {id($Identifier.text);} '(' {s("(");}  ')'{s(")");}  defaultValue?
    ;
    
annotationConstantRest
    :   variableDeclarators
    ;
    
defaultValue
    :   'default' {keywordCount++;JavaMetrics.uniqueKeywords.add("default");} elementValue
    ;

// STATEMENTS / BLOCKS

block
    :   '{' {s("{");} blockStatement* '}' {s("}");}
    ;
    
blockStatement
    :    localVariableDeclarationStatement
    |   classOrInterfaceDeclaration
    |  statement 
    ;
    
localVariableDeclarationStatement
    :    localVariableDeclaration {primitive=false;}';' {s(";");}
    ;

localVariableDeclaration
    :   variableModifiers type variableDeclarators {primitive = false;}
    ;
    
variableModifiers
    :   variableModifier*
    ;

statement
    : block
    |   ASSERT expression (':' expression)? ';'
    |   'if'{keywordCount++;JavaMetrics.uniqueKeywords.add("if"); mmc++;} parExpression statement (options {k=1;}:'else' {keywordCount++;JavaMetrics.uniqueKeywords.add("else");} statement)?
    |   'for' {keywordCount++;JavaMetrics.uniqueKeywords.add("for");mmc++;} '(' {s("(");} forControl ')' {s("}");} statement
    |   'while'{keywordCount++;JavaMetrics.uniqueKeywords.add("while"); mmc++;} parExpression  statement
    |   'do'{keywordCount++;JavaMetrics.uniqueKeywords.add("do");mmc++;} statement 'while' {keywordCount++;JavaMetrics.uniqueKeywords.add("while");} parExpression ';' {s(";");}
    |   'try'{keywordCount++;JavaMetrics.uniqueKeywords.add("try");} block
        ( catches 'finally' {keywordCount++;JavaMetrics.uniqueKeywords.add("finally");}block
        | catches
        |   'finally'{keywordCount++;JavaMetrics.uniqueKeywords.add("finally");} block
        )
    |   'switch'{keywordCount++;JavaMetrics.uniqueKeywords.add("switch");}  parExpression '{' switchBlockStatementGroups '}'
    |   'synchronized'{keywordCount++;JavaMetrics.uniqueKeywords.add("synchronized");} parExpression block
    |   'return' {keywordCount++;JavaMetrics.uniqueKeywords.add("return");} expression? ';' {s(";");}
    |   'throw'{keywordCount++;JavaMetrics.uniqueKeywords.add("throw");} expression ';' {s(";");}
    |   'break' {keywordCount++;JavaMetrics.uniqueKeywords.add("break"); System.out.println("FOUND BREAK");}Identifier? {if(primitive) id($Identifier.text);}';' {s(";");}
    |   'continue' {keywordCount++;JavaMetrics.uniqueKeywords.add("continue");} Identifier?  { id($Identifier.text);}';' {s(";");}
    |   ';' {s(";");}
    |   statementExpression ';'  {s(";");}
    |   Identifier {if(primitive) id($Identifier.text);} ':' statement
    ;
    
catches
    :   catchClause (catchClause)*
    ;
    
catchClause
    :   'catch' {keywordCount++;JavaMetrics.uniqueKeywords.add("catch");}'(' {s("(");} formalParameter ')'{s(")");}  block
    ;

formalParameter
    :   variableModifiers type variableDeclaratorId
    ;
        
switchBlockStatementGroups
    :   (switchBlockStatementGroup)*
    ;
    
/* The change here (switchLabel -> switchLabel+) technically makes this grammar
   ambiguous; but with appropriately greedy parsing it yields the most
   appropriate AST, one in which each group, except possibly the last one, has
   labels and statements. */
switchBlockStatementGroup
    :   switchLabel+ blockStatement*
    ;
    
switchLabel
    :   'case'{keywordCount++;JavaMetrics.uniqueKeywords.add("case");mmc++;} constantExpression ':'
    |   'case' {keywordCount++;JavaMetrics.uniqueKeywords.add("case");mmc++;} enumConstantName ':'
    |   'default' {keywordCount++;JavaMetrics.uniqueKeywords.add("defult");mmc++;} ':'
    ;
    
forControl
options {k=3;} // be efficient for common case: for (ID ID : ID) ...
    :   enhancedForControl
    |   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration 
    |   expressionList
    ;
    
enhancedForControl
    :   variableModifiers type Identifier { id($Identifier.text);} ':' expression
    ;

forUpdate
    :   expressionList
    ;

// EXPRESSIONS

parExpression
    :   '('{s("(");} expression ')'{s(")");} 
    ;
    
expressionList
    :   expression (','{s(",");} expression)*
    ;

statementExpression
    :   expression 
    ;
    
constantExpression
    :   expression
    ;
    
expression
    :   conditionalExpression (assignmentOperator expression)?
    ;
    
assignmentOperator
    :   '=' {s("=");}
    |   '+='
    |   '-='
    |   '*='
    |   '/='
    |   '&='
    |   '|='
    |   '^='
    |   '%='
    |   ('<' '<' '=')=> t1='<' t2='<' t3='=' 
        {true /*$t1.Line == $t2.Line &&
          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine && 
          $t2.Line == $t3.Line && 
          $t2.CharPositionInLine + 1 == $t3.CharPositionInLine */}?
    |   ('>' '>' '>' '=')=> t1='>' t2='>' t3='>' t4='='
        { true/*$t1.Line == $t2.Line && 
          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine &&
          $t2.Line == $t3.Line && 
          $t2.CharPositionInLine + 1 == $t3.CharPositionInLine &&
          $t3.Line == $t4.Line && 
          $t3.CharPositionInLine + 1 == $t4.CharPositionInLine */}?
    |   ('>' '>' '=')=> t1='>' t2='>' t3='='
        {true /*$t1.Line == $t2.Line && 
          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine && 
          $t2.Line == $t3.Line && 
          $t2.CharPositionInLine + 1 == $t3.CharPositionInLine*/ }?
    ;

conditionalExpression
    :   conditionalOrExpression ( '?' expression ':' expression )?
    ;

conditionalOrExpression
    :   conditionalAndExpression ( '||' {s("||"); mmc++;} conditionalAndExpression )*
    ;

conditionalAndExpression
    :   inclusiveOrExpression ( '&&' {s("&&"); mmc++;} inclusiveOrExpression )*
    ;

inclusiveOrExpression
    :   exclusiveOrExpression ( '|' {s("|"); } exclusiveOrExpression )*
    ;

exclusiveOrExpression
    :   andExpression ( '^' andExpression )*
    ;

andExpression
    :   equalityExpression ( '&' {s("&");} equalityExpression )*
    ;

equalityExpression
    :   instanceOfExpression ( ('==' {s("==");}| '!=' {s("!=");}) instanceOfExpression )*
    ;

instanceOfExpression
    :   relationalExpression ('instanceof' {keywordCount++;JavaMetrics.uniqueKeywords.add("instanceof");}type)?
    ;

relationalExpression
    :   shiftExpression ( relationalOp shiftExpression )*
    ;
    
relationalOp
    :   ('<' '=')=> t1='<' t2='=' 
        {true/* $t1.Line == $t2.Line && 
          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine*/ }?
    |   ('>' '=')=> t1='>' t2='=' 
        {true/* $t1.Line == $t2.Line && 
          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine*/ }?
    |   '<' {s("<");}
    |   '>' {s(">");}
    ;

shiftExpression
    :   additiveExpression ( shiftOp additiveExpression )*
    ;

shiftOp
    :   ('<' '<')=> t1='<' t2='<' 
        {true/* $t1.Line == $t2.Line && 
          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine*/ }?
    |   ('>' '>' '>')=> t1='>' t2='>' t3='>' 
        { true/*$t1.Line == $t2.Line && 
          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine &&
          $t2.Line == $t3.Line && 
          $t2.CharPositionInLine + 1 == $t3.CharPositionInLine */}?
    |   ('>' '>')=> t1='>' t2='>'
        {true/* $t1.Line == $t2.Line && 
          $t1.CharPositionInLine + 1 == $t2.CharPositionInLine*/ }?
    ;


additiveExpression
    :   multiplicativeExpression ( ('+' {s("+");}| '-' {s("-");}) multiplicativeExpression )*
    ;

multiplicativeExpression
    :   unaryExpression ( ( '*' {s("*");} | '/' {s("/");} | '%' {s("\%");}) unaryExpression )*
    ;
    
unaryExpression
    :   '+' unaryExpression
    |   '-' unaryExpression
    |   '++' unaryExpression
    |   '--' unaryExpression
    |   unaryExpressionNotPlusMinus
    ;

unaryExpressionNotPlusMinus
    :   '~' unaryExpression
    |   '!' unaryExpression
    |   castExpression
    |   primary selector* ('++' {s("++");}|'--' {s("--");})?
    ;
//the big weenie
castExpression
    :  '('{s("(");} primitiveType ')' unaryExpression
    |  '('{s("(");} (type | expression) ')' unaryExpressionNotPlusMinus
    ;

primary
    :   parExpression
    |   'this' {keywordCount++;JavaMetrics.uniqueKeywords.add("this");}('.' {s(".");} Identifier)* identifierSuffix? 
    |   'super'{keywordCount++;JavaMetrics.uniqueKeywords.add("super");} superSuffix
    |   literal
    |   'new'{keywordCount++;JavaMetrics.uniqueKeywords.add("new");} creator
    |   I1=Identifier {{id($I1.text);}} ('.' {s(".");} I4=Identifier)*  identifierSuffix? 
    |   primitiveType ('['{s("[");} ']'{s("]");})* '.' 'class' {keywordCount++;JavaMetrics.uniqueKeywords.add("class");}
    |   'void'{keywordCount++;JavaMetrics.uniqueKeywords.add("void");} '.' {s(".");} 'class'{keywordCount++;JavaMetrics.uniqueKeywords.add("class");}
    ;

identifierSuffix
    :   ('[' {s("[");} ']' {s("]");})+ '.' {s(".");} 'class'{keywordCount++;JavaMetrics.uniqueKeywords.add("class");}
    |   ('[' {s("[");} expression ']' {s("]");})+ // can also be matched by selector, but do here
    |   arguments 
    |   '.' {s(".");} 'class'{keywordCount++;JavaMetrics.uniqueKeywords.add("class");}
    |   '.' {s(".");} explicitGenericInvocation
    |   '.' {s(".");} 'this'{keywordCount++;JavaMetrics.uniqueKeywords.add("this");}
    |   '.' {s(".");} 'super' arguments {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
    |   '.' {s(".");} 'new' {keywordCount++;JavaMetrics.uniqueKeywords.add("new");}innerCreator
    ;

creator
    :   nonWildcardTypeArguments createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :  {constructorcall=true;}  classOrInterfaceType
    |   primitiveType {primitive = true;}
    ;
    
innerCreator
    :   nonWildcardTypeArguments? Identifier classCreatorRest
    ;

arrayCreatorRest
    :   '['{s("[");}
        (   ']' ('['{s("[");} ']' {s("]");})* arrayInitializer
        |   expression ']' {s("]");} ('['{s("[");} expression ']' {s("]");})* ('['{s("[");} ']'{s("]");})*
        )
    ;

classCreatorRest
    :  {constructorcall=false;} arguments classBody?
    ;
    
explicitGenericInvocation
    :   nonWildcardTypeArguments Identifier{if(primitive) id($Identifier.text);} arguments
    ;
    
nonWildcardTypeArguments
    :   '<' {s("<");} typeList '>' {s(">");}
    ;
    
selector
    :   '.' {s(".");} Identifier  {if(primitive) id($Identifier.text);} arguments?
    |   '.' {s(".");} 'this' {keywordCount++;JavaMetrics.uniqueKeywords.add("this");}
    |   '.' {s(".");} 'super' superSuffix {keywordCount++;JavaMetrics.uniqueKeywords.add("super");}
    |   '.' {s(".");} 'new'  {keywordCount++;JavaMetrics.uniqueKeywords.add("new");} innerCreator
    |   '[' {s("[");} expression ']' {s("]");}
    ;
    
superSuffix
    :   arguments
    |   '.' {s(".");} Identifier {if(primitive) id($Identifier.text);} arguments?
    ;

arguments
    :   '(' {s("(");}expressionList? ')'{s(")");} 
    ;

// LEXER

HexLiteral : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? {constantcount++;} ;

DecimalLiteral : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? {constantcount++; };

OctalLiteral : '0' ('0'..'7')+ IntegerTypeSuffix? {constantcount++;};

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
IntegerTypeSuffix : ('l'|'L') ;

FloatingPointLiteral
    :   ('0'..'9')+ '.'  ('0'..'9')* Exponent? FloatTypeSuffix? {constantcount++;}
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix? {constantcount++;}
    |   ('0'..'9')+ Exponent FloatTypeSuffix? {constantcount++;}
    |   ('0'..'9')+ FloatTypeSuffix {constantcount++;}
    ;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

CharacterLiteral
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\'' {constantcount++; }
    ;

StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"' {constantcount++;}
    ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

ENUM:   'enum' 
    ;
    
ASSERT
    :   'assert' 
    ;
    
Identifier 
    :  Letter (Letter |JavaIDDigit)* 
        ;

/**I found this char range in JavaCC's grammar, but Letter and Digit overlap.
   Still works, but...
 */
fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0660'..'\u0669' |
       '\u06f0'..'\u06f9' |
       '\u0966'..'\u096f' |
       '\u09e6'..'\u09ef' |
       '\u0a66'..'\u0a6f' |
       '\u0ae6'..'\u0aef' |
       '\u0b66'..'\u0b6f' |
       '\u0be7'..'\u0bef' |
       '\u0c66'..'\u0c6f' |
       '\u0ce6'..'\u0cef' |
       '\u0d66'..'\u0d6f' |
       '\u0e50'..'\u0e59' |
       '\u0ed0'..'\u0ed9' |
       '\u1040'..'\u1049'
   ;

WS  :  (' '{ws++;}|'\r'{ws++;}|'\t'{ws++;}|'\u000C'{ws++;}|'\n'{ws++;}) {$channel=HIDDEN;}
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : .{commentcount++;} )* '*/' {$channel=2;}
    	{System.out.println("long commment" + commentcount);}
    ;

LINE_COMMENT
    : '//' ( ~('\n' |'\r'){commentcount++;/*INSERT COUNT*/})*  '\r'? '\n' {$channel=2;}
    	{System.out.println("line commment" + commentcount);}
    ;