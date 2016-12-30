package com.lingdu.parser;// Generated from SQLQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;


// Generated from SQLQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLQuery extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, DELETE=2, INSERT=3, UPDATE=4, FROM=5, HAVING=6, WHERE=7, FILTER=8, 
		ORDER=9, BY=10, GROUP=11, INTO=12, AS=13, SOUNDS=14, REGEXP=15, CREATE=16, 
		ALTER=17, DROP=18, SET=19, NULL=20, NOT=21, DISTINCT=22, DISTINCTROW=23, 
		HIGH_PRIORITY=24, MAX_STATEMENT_TIME=25, TABLE=26, TABLESPACE=27, VIEW=28, 
		SEQUENCE=29, TRIGGER=30, USER=31, INDEX=32, SESSION=33, PROCEDURE=34, 
		FUNCTION=35, PRIMARY=36, KEY=37, DEFAULT=38, CONSTRAINT=39, CHECK=40, 
		UNIQUE=41, FOREIGN=42, REFERENCES=43, EXPLAIN=44, FOR=45, IF=46, ALL=47, 
		UNION=48, EXCEPT=49, INTERSECT=50, MINUS=51, INNER=52, LEFT=53, RIGHT=54, 
		FULL=55, OUTER=56, JOIN=57, ON=58, SCHEMA=59, CAST=60, COLUMN=61, USE=62, 
		DATABASE=63, TO=64, AND=65, OR=66, XOR=67, CASE=68, WHEN=69, THEN=70, 
		ELSE=71, END=72, EXISTS=73, IN=74, NEW=75, ASC=76, DESC=77, IS=78, LIKE=79, 
		ESCAPE=80, BETWEEN=81, VALUES=82, INTERVAL=83, TRUE=84, FALSE=85, LIMIT=86, 
		BREAK=87, NONE=88, MINUTE=89, FIFTEEN_MINUTE=90, THIRTY_MINUTE=91, HOUR=92, 
		DAY=93, LPAREN=94, RPAREN=95, LBRACE=96, RBRACE=97, LBRACKET=98, RBRACKET=99, 
		SEMI=100, COMMA=101, DOT=102, DOTDOT=103, DOTDOTDOT=104, EQ=105, GT=106, 
		LT=107, BANG=108, BANGBANG=109, TILDE=110, QUES=111, COLON=112, COLONCOLON=113, 
		COLONEQ=114, EQEQ=115, LTEQ=116, LTEQGT=117, LTGT=118, GTEQ=119, BANGEQ=120, 
		BANGGT=121, BANGLT=122, AMPAMP=123, BARBAR=124, BARBARSLASH=125, BARSLASH=126, 
		PLUS=127, SUB=128, STAR=129, SLASH=130, AMP=131, BAR=132, CARET=133, PERCENT=134, 
		LTLT=135, GTGT=136, MONKEYS_AT=137, POUND=138, DIV=139, MOD=140, UNDERLINE=141, 
		QUOTES=142, INT=143, FLOAT=144, STRING=145, ID=146, WS=147;
	public static final int
		RULE_prog = 0, RULE_columList = 1, RULE_nameOprand = 2, RULE_name = 3, 
		RULE_argument_list = 4, RULE_argument = 5, RULE_identity = 6, RULE_tableRef = 7, 
		RULE_whereCluaster = 8, RULE_filterCluaster = 9, RULE_boolExpr = 10, RULE_groupCluaster = 11, 
		RULE_orderCluaster = 12, RULE_order = 13, RULE_limitCluaster = 14;
	public static final String[] ruleNames = {
		"prog", "columList", "nameOprand", "name", "argument_list", "argument", 
		"identity", "tableRef", "whereCluaster", "filterCluaster", "boolExpr", 
		"groupCluaster", "orderCluaster", "order", "limitCluaster"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'..'", "'..,'", "'='", 
		"'>'", "'<'", "'!'", "'!!'", "'~'", "'?'", null, null, "':='", "'=='", 
		"'<='", "'<=>'", null, "'>='", null, "'!>'", "'!<'", "'&&'", "'||'", "'||/'", 
		"'|/'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", null, "'<<'", 
		"'>>'", "'@'", "'#'", null, null, "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "DELETE", "INSERT", "UPDATE", "FROM", "HAVING", "WHERE", 
		"FILTER", "ORDER", "BY", "GROUP", "INTO", "AS", "SOUNDS", "REGEXP", "CREATE", 
		"ALTER", "DROP", "SET", "NULL", "NOT", "DISTINCT", "DISTINCTROW", "HIGH_PRIORITY", 
		"MAX_STATEMENT_TIME", "TABLE", "TABLESPACE", "VIEW", "SEQUENCE", "TRIGGER", 
		"USER", "INDEX", "SESSION", "PROCEDURE", "FUNCTION", "PRIMARY", "KEY", 
		"DEFAULT", "CONSTRAINT", "CHECK", "UNIQUE", "FOREIGN", "REFERENCES", "EXPLAIN", 
		"FOR", "IF", "ALL", "UNION", "EXCEPT", "INTERSECT", "MINUS", "INNER", 
		"LEFT", "RIGHT", "FULL", "OUTER", "JOIN", "ON", "SCHEMA", "CAST", "COLUMN", 
		"USE", "DATABASE", "TO", "AND", "OR", "XOR", "CASE", "WHEN", "THEN", "ELSE", 
		"END", "EXISTS", "IN", "NEW", "ASC", "DESC", "IS", "LIKE", "ESCAPE", "BETWEEN", 
		"VALUES", "INTERVAL", "TRUE", "FALSE", "LIMIT", "BREAK", "NONE", "MINUTE", 
		"FIFTEEN_MINUTE", "THIRTY_MINUTE", "HOUR", "DAY", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "DOTDOT", 
		"DOTDOTDOT", "EQ", "GT", "LT", "BANG", "BANGBANG", "TILDE", "QUES", "COLON", 
		"COLONCOLON", "COLONEQ", "EQEQ", "LTEQ", "LTEQGT", "LTGT", "GTEQ", "BANGEQ", 
		"BANGGT", "BANGLT", "AMPAMP", "BARBAR", "BARBARSLASH", "BARSLASH", "PLUS", 
		"SUB", "STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", "LTLT", "GTGT", 
		"MONKEYS_AT", "POUND", "DIV", "MOD", "UNDERLINE", "QUOTES", "INT", "FLOAT", 
		"STRING", "ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLQuery(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLQuery.SELECT, 0); }
		public ColumListContext columList() {
			return getRuleContext(ColumListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLQuery.FROM, 0); }
		public TableRefContext tableRef() {
			return getRuleContext(TableRefContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SQLQuery.EOF, 0); }
		public WhereCluasterContext whereCluaster() {
			return getRuleContext(WhereCluasterContext.class,0);
		}
		public FilterCluasterContext filterCluaster() {
			return getRuleContext(FilterCluasterContext.class,0);
		}
		public GroupCluasterContext groupCluaster() {
			return getRuleContext(GroupCluasterContext.class,0);
		}
		public OrderCluasterContext orderCluaster() {
			return getRuleContext(OrderCluasterContext.class,0);
		}
		public LimitCluasterContext limitCluaster() {
			return getRuleContext(LimitCluasterContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(SELECT);
			setState(31);
			columList();
			setState(32);
			match(FROM);
			setState(33);
			tableRef();
			setState(35);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(34);
				whereCluaster();
				}
			}

			setState(38);
			_la = _input.LA(1);
			if (_la==FILTER) {
				{
				setState(37);
				filterCluaster();
				}
			}

			setState(41);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(40);
				groupCluaster();
				}
			}

			setState(44);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(43);
				orderCluaster();
				}
			}

			setState(47);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(46);
				limitCluaster();
				}
			}

			setState(49);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumListContext extends ParserRuleContext {
		public List<NameOprandContext> nameOprand() {
			return getRuleContexts(NameOprandContext.class);
		}
		public NameOprandContext nameOprand(int i) {
			return getRuleContext(NameOprandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLQuery.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLQuery.COMMA, i);
		}
		public ColumListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitColumList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumListContext columList() throws RecognitionException {
		ColumListContext _localctx = new ColumListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_columList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			nameOprand();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(52);
				match(COMMA);
				setState(53);
				nameOprand();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameOprandContext extends ParserRuleContext {
		public Token tableName;
		public NameContext columnName;
		public Token alias;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLQuery.DOT, 0); }
		public TerminalNode AS() { return getToken(SQLQuery.AS, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLQuery.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLQuery.ID, i);
		}
		public NameOprandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameOprand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitNameOprand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameOprandContext nameOprand() throws RecognitionException {
		NameOprandContext _localctx = new NameOprandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nameOprand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(59);
				((NameOprandContext)_localctx).tableName = match(ID);
				setState(60);
				match(DOT);
				}
				break;
			}
			setState(63);
			((NameOprandContext)_localctx).columnName = name(0);
			setState(66);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(64);
				match(AS);
				setState(65);
				((NameOprandContext)_localctx).alias = match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	 
		public NameContext() { }
		public void copyFrom(NameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulNameContext extends NameContext {
		public NameContext left;
		public Token op;
		public NameContext right;
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLQuery.STAR, 0); }
		public TerminalNode SLASH() { return getToken(SQLQuery.SLASH, 0); }
		public TerminalNode MOD() { return getToken(SQLQuery.MOD, 0); }
		public MulNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitMulName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AggregationNameContext extends NameContext {
		public TerminalNode ID() { return getToken(SQLQuery.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SQLQuery.LPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLQuery.RPAREN, 0); }
		public AggregationNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitAggregationName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddNameContext extends NameContext {
		public NameContext left;
		public Token op;
		public NameContext right;
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SQLQuery.PLUS, 0); }
		public TerminalNode SUB() { return getToken(SQLQuery.SUB, 0); }
		public AddNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitAddName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LRNameContext extends NameContext {
		public TerminalNode LPAREN() { return getToken(SQLQuery.LPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLQuery.RPAREN, 0); }
		public LRNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitLRName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnNameContext extends NameContext {
		public List<IdentityContext> identity() {
			return getRuleContexts(IdentityContext.class);
		}
		public IdentityContext identity(int i) {
			return getRuleContext(IdentityContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SQLQuery.DOT, 0); }
		public ColumnNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		return name(0);
	}

	private NameContext name(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NameContext _localctx = new NameContext(_ctx, _parentState);
		NameContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_name, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new LRNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(69);
				match(LPAREN);
				setState(70);
				name(0);
				setState(71);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new AggregationNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(ID);
				setState(74);
				match(LPAREN);
				setState(75);
				argument_list();
				setState(76);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new ColumnNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(78);
					identity();
					setState(79);
					match(DOT);
					}
					break;
				}
				setState(83);
				identity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulNameContext(new NameContext(_parentctx, _parentState));
						((MulNameContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_name);
						setState(86);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(87);
						((MulNameContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (STAR - 129)) | (1L << (SLASH - 129)) | (1L << (MOD - 129)))) != 0)) ) {
							((MulNameContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(88);
						((MulNameContext)_localctx).right = name(5);
						}
						break;
					case 2:
						{
						_localctx = new AddNameContext(new NameContext(_parentctx, _parentState));
						((AddNameContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_name);
						setState(89);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(90);
						((AddNameContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
							((AddNameContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(91);
						((AddNameContext)_localctx).right = name(4);
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLQuery.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLQuery.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (LPAREN - 94)) | (1L << (INT - 94)) | (1L << (FLOAT - 94)) | (1L << (STRING - 94)) | (1L << (ID - 94)))) != 0)) {
				{
				setState(97);
				argument();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(98);
					match(COMMA);
					setState(99);
					argument();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public IdentityContext identity() {
			return getRuleContext(IdentityContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		try {
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				identity();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				name(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentityContext extends ParserRuleContext {
		public IdentityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identity; }
	 
		public IdentityContext() { }
		public void copyFrom(IdentityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdEleContext extends IdentityContext {
		public TerminalNode ID() { return getToken(SQLQuery.ID, 0); }
		public IdEleContext(IdentityContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitIdEle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringEleContext extends IdentityContext {
		public TerminalNode STRING() { return getToken(SQLQuery.STRING, 0); }
		public StringEleContext(IdentityContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitStringEle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatEleContext extends IdentityContext {
		public TerminalNode FLOAT() { return getToken(SQLQuery.FLOAT, 0); }
		public FloatEleContext(IdentityContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitFloatEle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntEleContext extends IdentityContext {
		public TerminalNode INT() { return getToken(SQLQuery.INT, 0); }
		public IntEleContext(IdentityContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitIntEle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityContext identity() throws RecognitionException {
		IdentityContext _localctx = new IdentityContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identity);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdEleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ID);
				}
				break;
			case INT:
				_localctx = new IntEleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatEleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringEleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRefContext extends ParserRuleContext {
		public Token tableName;
		public Token alias;
		public List<TerminalNode> ID() { return getTokens(SQLQuery.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLQuery.ID, i);
		}
		public TerminalNode AS() { return getToken(SQLQuery.AS, 0); }
		public TableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitTableRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRefContext tableRef() throws RecognitionException {
		TableRefContext _localctx = new TableRefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((TableRefContext)_localctx).tableName = match(ID);
			setState(120);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(118);
				match(AS);
				setState(119);
				((TableRefContext)_localctx).alias = match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereCluasterContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLQuery.WHERE, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public WhereCluasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCluaster; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitWhereCluaster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereCluasterContext whereCluaster() throws RecognitionException {
		WhereCluasterContext _localctx = new WhereCluasterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whereCluaster);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(WHERE);
			setState(123);
			boolExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterCluasterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(SQLQuery.FILTER, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public FilterCluasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterCluaster; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitFilterCluaster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterCluasterContext filterCluaster() throws RecognitionException {
		FilterCluasterContext _localctx = new FilterCluasterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_filterCluaster);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(FILTER);
			setState(126);
			boolExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprContext extends ParserRuleContext {
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameOprContext extends BoolExprContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameOprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitNameOpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqOprContext extends BoolExprContext {
		public BoolExprContext left;
		public BoolExprContext right;
		public TerminalNode EQ() { return getToken(SQLQuery.EQ, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public EqOprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitEqOpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LrExprContext extends BoolExprContext {
		public TerminalNode LPAREN() { return getToken(SQLQuery.LPAREN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLQuery.RPAREN, 0); }
		public LrExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitLrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOprContext extends BoolExprContext {
		public BoolExprContext left;
		public BoolExprContext right;
		public TerminalNode AND() { return getToken(SQLQuery.AND, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public AndOprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitAndOpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrOprContext extends BoolExprContext {
		public BoolExprContext left;
		public BoolExprContext right;
		public TerminalNode OR() { return getToken(SQLQuery.OR, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public OrOprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitOrOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new LrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(129);
				match(LPAREN);
				setState(130);
				boolExpr(0);
				setState(131);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NameOprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				name(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new EqOprContext(new BoolExprContext(_parentctx, _parentState));
						((EqOprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						match(EQ);
						setState(138);
						((EqOprContext)_localctx).right = boolExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new AndOprContext(new BoolExprContext(_parentctx, _parentState));
						((AndOprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(139);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(140);
						match(AND);
						setState(141);
						((AndOprContext)_localctx).right = boolExpr(4);
						}
						break;
					case 3:
						{
						_localctx = new OrOprContext(new BoolExprContext(_parentctx, _parentState));
						((OrOprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(142);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(143);
						match(OR);
						setState(144);
						((OrOprContext)_localctx).right = boolExpr(3);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GroupCluasterContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SQLQuery.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQLQuery.BY, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLQuery.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLQuery.COMMA, i);
		}
		public GroupCluasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupCluaster; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitGroupCluaster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupCluasterContext groupCluaster() throws RecognitionException {
		GroupCluasterContext _localctx = new GroupCluasterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_groupCluaster);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(GROUP);
			setState(151);
			match(BY);
			setState(152);
			name(0);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				name(0);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderCluasterContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLQuery.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLQuery.BY, 0); }
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLQuery.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLQuery.COMMA, i);
		}
		public OrderCluasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderCluaster; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitOrderCluaster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderCluasterContext orderCluaster() throws RecognitionException {
		OrderCluasterContext _localctx = new OrderCluasterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderCluaster);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ORDER);
			setState(161);
			match(BY);
			setState(162);
			order();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(163);
				match(COMMA);
				setState(164);
				order();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderContext extends ParserRuleContext {
		public Token type;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLQuery.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLQuery.DESC, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			name(0);
			setState(172);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(171);
				((OrderContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitCluasterContext extends ParserRuleContext {
		public Token offset;
		public Token resultCount;
		public TerminalNode LIMIT() { return getToken(SQLQuery.LIMIT, 0); }
		public List<TerminalNode> INT() { return getTokens(SQLQuery.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLQuery.INT, i);
		}
		public LimitCluasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitCluaster; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitLimitCluaster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitCluasterContext limitCluaster() throws RecognitionException {
		LimitCluasterContext _localctx = new LimitCluasterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_limitCluaster);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LIMIT);
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(175);
				((LimitCluasterContext)_localctx).offset = match(INT);
				}
				break;
			}
			setState(178);
			((LimitCluasterContext)_localctx).resultCount = match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return name_sempred((NameContext)_localctx, predIndex);
		case 10:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean name_sempred(NameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0095\u00b7\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\5\2&\n\2\3\2\5\2)\n\2\3\2\5\2,\n\2\3\2\5\2/\n\2\3\2\5\2\62\n\2\3\2"+
		"\3\2\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\5\4@\n\4\3\4\3\4\3\4"+
		"\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n\5"+
		"\3\5\5\5W\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13\5\3\6\3\6"+
		"\3\6\7\6g\n\6\f\6\16\6j\13\6\5\6l\n\6\3\7\3\7\5\7p\n\7\3\b\3\b\3\b\3\b"+
		"\5\bv\n\b\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0089\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0094"+
		"\n\f\f\f\16\f\u0097\13\f\3\r\3\r\3\r\3\r\3\r\7\r\u009e\n\r\f\r\16\r\u00a1"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\7\16\u00a8\n\16\f\16\16\16\u00ab\13\16"+
		"\3\17\3\17\5\17\u00af\n\17\3\20\3\20\5\20\u00b3\n\20\3\20\3\20\3\20\2"+
		"\4\b\26\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\4\2\u0083\u0084"+
		"\u008e\u008e\3\2\u0081\u0082\3\2NO\u00c3\2 \3\2\2\2\4\65\3\2\2\2\6?\3"+
		"\2\2\2\bV\3\2\2\2\nk\3\2\2\2\fo\3\2\2\2\16u\3\2\2\2\20w\3\2\2\2\22|\3"+
		"\2\2\2\24\177\3\2\2\2\26\u0088\3\2\2\2\30\u0098\3\2\2\2\32\u00a2\3\2\2"+
		"\2\34\u00ac\3\2\2\2\36\u00b0\3\2\2\2 !\7\3\2\2!\"\5\4\3\2\"#\7\7\2\2#"+
		"%\5\20\t\2$&\5\22\n\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2\')\5\24\13\2(\'\3"+
		"\2\2\2()\3\2\2\2)+\3\2\2\2*,\5\30\r\2+*\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/"+
		"\5\32\16\2.-\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60\62\5\36\20\2\61\60\3\2\2"+
		"\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\2\2\3\64\3\3\2\2\2\65:\5\6\4\2"+
		"\66\67\7g\2\2\679\5\6\4\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5"+
		"\3\2\2\2<:\3\2\2\2=>\7\u0094\2\2>@\7h\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2"+
		"\2AD\5\b\5\2BC\7\17\2\2CE\7\u0094\2\2DB\3\2\2\2DE\3\2\2\2E\7\3\2\2\2F"+
		"G\b\5\1\2GH\7`\2\2HI\5\b\5\2IJ\7a\2\2JW\3\2\2\2KL\7\u0094\2\2LM\7`\2\2"+
		"MN\5\n\6\2NO\7a\2\2OW\3\2\2\2PQ\5\16\b\2QR\7h\2\2RT\3\2\2\2SP\3\2\2\2"+
		"ST\3\2\2\2TU\3\2\2\2UW\5\16\b\2VF\3\2\2\2VK\3\2\2\2VS\3\2\2\2W`\3\2\2"+
		"\2XY\f\6\2\2YZ\t\2\2\2Z_\5\b\5\7[\\\f\5\2\2\\]\t\3\2\2]_\5\b\5\6^X\3\2"+
		"\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\t\3\2\2\2b`\3\2\2\2ch\5"+
		"\f\7\2de\7g\2\2eg\5\f\7\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2kc\3\2\2\2kl\3\2\2\2l\13\3\2\2\2mp\5\16\b\2np\5\b\5\2"+
		"om\3\2\2\2on\3\2\2\2p\r\3\2\2\2qv\7\u0094\2\2rv\7\u0091\2\2sv\7\u0092"+
		"\2\2tv\7\u0093\2\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\17\3\2\2\2"+
		"wz\7\u0094\2\2xy\7\17\2\2y{\7\u0094\2\2zx\3\2\2\2z{\3\2\2\2{\21\3\2\2"+
		"\2|}\7\t\2\2}~\5\26\f\2~\23\3\2\2\2\177\u0080\7\n\2\2\u0080\u0081\5\26"+
		"\f\2\u0081\25\3\2\2\2\u0082\u0083\b\f\1\2\u0083\u0084\7`\2\2\u0084\u0085"+
		"\5\26\f\2\u0085\u0086\7a\2\2\u0086\u0089\3\2\2\2\u0087\u0089\5\b\5\2\u0088"+
		"\u0082\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u0095\3\2\2\2\u008a\u008b\f\6"+
		"\2\2\u008b\u008c\7k\2\2\u008c\u0094\5\26\f\7\u008d\u008e\f\5\2\2\u008e"+
		"\u008f\7C\2\2\u008f\u0094\5\26\f\6\u0090\u0091\f\4\2\2\u0091\u0092\7D"+
		"\2\2\u0092\u0094\5\26\f\5\u0093\u008a\3\2\2\2\u0093\u008d\3\2\2\2\u0093"+
		"\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\27\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\r\2\2\u0099\u009a"+
		"\7\f\2\2\u009a\u009f\5\b\5\2\u009b\u009c\7g\2\2\u009c\u009e\5\b\5\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\31\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\13\2\2\u00a3\u00a4"+
		"\7\f\2\2\u00a4\u00a9\5\34\17\2\u00a5\u00a6\7g\2\2\u00a6\u00a8\5\34\17"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\33\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5\b\5\2\u00ad"+
		"\u00af\t\4\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\35\3\2\2"+
		"\2\u00b0\u00b2\7X\2\2\u00b1\u00b3\7\u0091\2\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\u0091\2\2\u00b5\37\3"+
		"\2\2\2\32%(+.\61:?DSV^`hkouz\u0088\u0093\u0095\u009f\u00a9\u00ae\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}