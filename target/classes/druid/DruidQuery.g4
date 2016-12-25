parser grammar DruidQuery;

options {
	tokenVocab = DruidLexer;
}

prog
:
	SELECT columList FROM tableRef
	(
		whereCluaster
	)?
	(
		groupCluaster
	)?
	(
		orderCluaster
	)?
	(
		limitCluaster
	)? EOF
;

columList
:
	nameOprand
	(
		COMMA nameOprand
	)*
;

nameOprand
:
	(
		tableName = ID DOT
	)? columnName = name
	(
		AS alias = ID
	)?
;

name
:
	LPAREN name RPAREN # LRName
	| left = name op =
	(
		STAR
		| SLASH
		| MOD
	) right = name # MulName
	| left = name op =
	(
		PLUS
		| SUB
	) right = name # AddName
	| ID LPAREN argument_list RPAREN # AggregationName
	| (identity DOT)? identity # columnName
;

argument_list:(argument (COMMA argument)*)?;

argument:identity|name
;

identity:ID # idEle
	| INT # intEle
	| FLOAT # floatEle
	| STRING # stringEle
;

tableRef
:
	tableName = ID
	(
		AS alias = ID
	)?
;

whereCluaster
:
	WHERE boolExpr
;

boolExpr
:
	LPAREN boolExpr RPAREN # lrExpr
	| left = boolExpr EQ right = boolExpr # eqOpr
	| left = boolExpr AND right = boolExpr # andOpr
	| left = boolExpr OR right = boolExpr # orOpr
	| name # nameOpr
;

groupCluaster
:
	GROUP BY name
	(
		COMMA name
	)*
;

orderCluaster
:
	ORDER BY order
	(
		COMMA order
	)*
;

order
:
	name type =
	(
		ASC
		| DESC
	)?
;

limitCluaster
:
	LIMIT
	(
		offset = INT
	)? resultCount = INT
;

