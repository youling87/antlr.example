package druid;

// Generated from DruidQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DruidQuery extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, DELETE=2, INSERT=3, UPDATE=4, FROM=5, HAVING=6, WHERE=7, ORDER=8, 
		BY=9, GROUP=10, INTO=11, AS=12, SOUNDS=13, REGEXP=14, CREATE=15, ALTER=16, 
		DROP=17, SET=18, NULL=19, NOT=20, DISTINCT=21, DISTINCTROW=22, HIGH_PRIORITY=23, 
		MAX_STATEMENT_TIME=24, TABLE=25, TABLESPACE=26, VIEW=27, SEQUENCE=28, 
		TRIGGER=29, USER=30, INDEX=31, SESSION=32, PROCEDURE=33, FUNCTION=34, 
		PRIMARY=35, KEY=36, DEFAULT=37, CONSTRAINT=38, CHECK=39, UNIQUE=40, FOREIGN=41, 
		REFERENCES=42, EXPLAIN=43, FOR=44, IF=45, ALL=46, UNION=47, EXCEPT=48, 
		INTERSECT=49, MINUS=50, INNER=51, LEFT=52, RIGHT=53, FULL=54, OUTER=55, 
		JOIN=56, ON=57, SCHEMA=58, CAST=59, COLUMN=60, USE=61, DATABASE=62, TO=63, 
		AND=64, OR=65, XOR=66, CASE=67, WHEN=68, THEN=69, ELSE=70, END=71, EXISTS=72, 
		IN=73, NEW=74, ASC=75, DESC=76, IS=77, LIKE=78, ESCAPE=79, BETWEEN=80, 
		VALUES=81, INTERVAL=82, TRUE=83, FALSE=84, LIMIT=85, BREAK=86, NONE=87, 
		MINUTE=88, FIFTEEN_MINUTE=89, THIRTY_MINUTE=90, HOUR=91, DAY=92, LPAREN=93, 
		RPAREN=94, LBRACE=95, RBRACE=96, LBRACKET=97, RBRACKET=98, SEMI=99, COMMA=100, 
		DOT=101, DOTDOT=102, DOTDOTDOT=103, EQ=104, GT=105, LT=106, BANG=107, 
		BANGBANG=108, TILDE=109, QUES=110, COLON=111, COLONCOLON=112, COLONEQ=113, 
		EQEQ=114, LTEQ=115, LTEQGT=116, LTGT=117, GTEQ=118, BANGEQ=119, BANGGT=120, 
		BANGLT=121, AMPAMP=122, BARBAR=123, BARBARSLASH=124, BARSLASH=125, PLUS=126, 
		SUB=127, STAR=128, SLASH=129, AMP=130, BAR=131, CARET=132, PERCENT=133, 
		LTLT=134, GTGT=135, MONKEYS_AT=136, POUND=137, DIV=138, MOD=139, UNDERLINE=140, 
		QUOTES=141, INT=142, FLOAT=143, STRING=144, ID=145, WS=146;
	public static final int
		RULE_prog = 0, RULE_columList = 1, RULE_nameOprand = 2, RULE_name = 3, 
		RULE_argument_list = 4, RULE_argument = 5, RULE_identity = 6, RULE_tableRef = 7, 
		RULE_whereCluaster = 8, RULE_boolExpr = 9, RULE_groupCluaster = 10, RULE_orderCluaster = 11, 
		RULE_order = 12, RULE_limitCluaster = 13;
	public static final String[] ruleNames = {
		"prog", "columList", "nameOprand", "name", "argument_list", "argument", 
		"identity", "tableRef", "whereCluaster", "boolExpr", "groupCluaster", 
		"orderCluaster", "order", "limitCluaster"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'..'", "'..,'", "'='", "'>'", 
		"'<'", "'!'", "'!!'", "'~'", "'?'", null, null, "':='", "'=='", "'<='", 
		"'<=>'", null, "'>='", null, "'!>'", "'!<'", "'&&'", "'||'", "'||/'", 
		"'|/'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", null, "'<<'", 
		"'>>'", "'@'", "'#'", null, null, "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "DELETE", "INSERT", "UPDATE", "FROM", "HAVING", "WHERE", 
		"ORDER", "BY", "GROUP", "INTO", "AS", "SOUNDS", "REGEXP", "CREATE", "ALTER", 
		"DROP", "SET", "NULL", "NOT", "DISTINCT", "DISTINCTROW", "HIGH_PRIORITY", 
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
	public String getGrammarFileName() { return "DruidQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DruidQuery(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(DruidQuery.SELECT, 0); }
		public ColumListContext columList() {
			return getRuleContext(ColumListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(DruidQuery.FROM, 0); }
		public TableRefContext tableRef() {
			return getRuleContext(TableRefContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DruidQuery.EOF, 0); }
		public WhereCluasterContext whereCluaster() {
			return getRuleContext(WhereCluasterContext.class,0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(SELECT);
			setState(29);
			columList();
			setState(30);
			match(FROM);
			setState(31);
			tableRef();
			setState(33);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(32);
				whereCluaster();
				}
			}

			setState(36);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(35);
				groupCluaster();
				}
			}

			setState(39);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(38);
				orderCluaster();
				}
			}

			setState(42);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(41);
				limitCluaster();
				}
			}

			setState(44);
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
		public List<TerminalNode> COMMA() { return getTokens(DruidQuery.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DruidQuery.COMMA, i);
		}
		public ColumListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterColumList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitColumList(this);
		}
	}

	public final ColumListContext columList() throws RecognitionException {
		ColumListContext _localctx = new ColumListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_columList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			nameOprand();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(47);
				match(COMMA);
				setState(48);
				nameOprand();
				}
				}
				setState(53);
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
		public TerminalNode DOT() { return getToken(DruidQuery.DOT, 0); }
		public TerminalNode AS() { return getToken(DruidQuery.AS, 0); }
		public List<TerminalNode> ID() { return getTokens(DruidQuery.ID); }
		public TerminalNode ID(int i) {
			return getToken(DruidQuery.ID, i);
		}
		public NameOprandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameOprand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterNameOprand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitNameOprand(this);
		}
	}

	public final NameOprandContext nameOprand() throws RecognitionException {
		NameOprandContext _localctx = new NameOprandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nameOprand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(54);
				((NameOprandContext)_localctx).tableName = match(ID);
				setState(55);
				match(DOT);
				}
				break;
			}
			setState(58);
			((NameOprandContext)_localctx).columnName = name(0);
			setState(61);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(59);
				match(AS);
				setState(60);
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
		public TerminalNode STAR() { return getToken(DruidQuery.STAR, 0); }
		public TerminalNode SLASH() { return getToken(DruidQuery.SLASH, 0); }
		public TerminalNode MOD() { return getToken(DruidQuery.MOD, 0); }
		public MulNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterMulName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitMulName(this);
		}
	}
	public static class AggregationNameContext extends NameContext {
		public TerminalNode ID() { return getToken(DruidQuery.ID, 0); }
		public TerminalNode LPAREN() { return getToken(DruidQuery.LPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DruidQuery.RPAREN, 0); }
		public AggregationNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterAggregationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitAggregationName(this);
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
		public TerminalNode PLUS() { return getToken(DruidQuery.PLUS, 0); }
		public TerminalNode SUB() { return getToken(DruidQuery.SUB, 0); }
		public AddNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterAddName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitAddName(this);
		}
	}
	public static class LRNameContext extends NameContext {
		public TerminalNode LPAREN() { return getToken(DruidQuery.LPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DruidQuery.RPAREN, 0); }
		public LRNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterLRName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitLRName(this);
		}
	}
	public static class ColumnNameContext extends NameContext {
		public List<IdentityContext> identity() {
			return getRuleContexts(IdentityContext.class);
		}
		public IdentityContext identity(int i) {
			return getRuleContext(IdentityContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DruidQuery.DOT, 0); }
		public ColumnNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitColumnName(this);
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
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new LRNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(64);
				match(LPAREN);
				setState(65);
				name(0);
				setState(66);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new AggregationNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(ID);
				setState(69);
				match(LPAREN);
				setState(70);
				argument_list();
				setState(71);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new ColumnNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(73);
					identity();
					setState(74);
					match(DOT);
					}
					break;
				}
				setState(78);
				identity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MulNameContext(new NameContext(_parentctx, _parentState));
						((MulNameContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_name);
						setState(81);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(82);
						((MulNameContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (STAR - 128)) | (1L << (SLASH - 128)) | (1L << (MOD - 128)))) != 0)) ) {
							((MulNameContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(83);
						((MulNameContext)_localctx).right = name(5);
						}
						break;
					case 2:
						{
						_localctx = new AddNameContext(new NameContext(_parentctx, _parentState));
						((AddNameContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_name);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						((AddNameContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
							((AddNameContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(86);
						((AddNameContext)_localctx).right = name(4);
						}
						break;
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(DruidQuery.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DruidQuery.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (LPAREN - 93)) | (1L << (INT - 93)) | (1L << (FLOAT - 93)) | (1L << (STRING - 93)) | (1L << (ID - 93)))) != 0)) {
				{
				setState(92);
				argument();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(93);
					match(COMMA);
					setState(94);
					argument();
					}
					}
					setState(99);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				identity();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
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
		public TerminalNode ID() { return getToken(DruidQuery.ID, 0); }
		public IdEleContext(IdentityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterIdEle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitIdEle(this);
		}
	}
	public static class StringEleContext extends IdentityContext {
		public TerminalNode STRING() { return getToken(DruidQuery.STRING, 0); }
		public StringEleContext(IdentityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterStringEle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitStringEle(this);
		}
	}
	public static class FloatEleContext extends IdentityContext {
		public TerminalNode FLOAT() { return getToken(DruidQuery.FLOAT, 0); }
		public FloatEleContext(IdentityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterFloatEle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitFloatEle(this);
		}
	}
	public static class IntEleContext extends IdentityContext {
		public TerminalNode INT() { return getToken(DruidQuery.INT, 0); }
		public IntEleContext(IdentityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterIntEle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitIntEle(this);
		}
	}

	public final IdentityContext identity() throws RecognitionException {
		IdentityContext _localctx = new IdentityContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identity);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdEleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(ID);
				}
				break;
			case INT:
				_localctx = new IntEleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatEleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringEleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
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
		public List<TerminalNode> ID() { return getTokens(DruidQuery.ID); }
		public TerminalNode ID(int i) {
			return getToken(DruidQuery.ID, i);
		}
		public TerminalNode AS() { return getToken(DruidQuery.AS, 0); }
		public TableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterTableRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitTableRef(this);
		}
	}

	public final TableRefContext tableRef() throws RecognitionException {
		TableRefContext _localctx = new TableRefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((TableRefContext)_localctx).tableName = match(ID);
			setState(115);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(113);
				match(AS);
				setState(114);
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
		public TerminalNode WHERE() { return getToken(DruidQuery.WHERE, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public WhereCluasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCluaster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterWhereCluaster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitWhereCluaster(this);
		}
	}

	public final WhereCluasterContext whereCluaster() throws RecognitionException {
		WhereCluasterContext _localctx = new WhereCluasterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whereCluaster);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(WHERE);
			setState(118);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterNameOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitNameOpr(this);
		}
	}
	public static class EqOprContext extends BoolExprContext {
		public BoolExprContext left;
		public BoolExprContext right;
		public TerminalNode EQ() { return getToken(DruidQuery.EQ, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public EqOprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterEqOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitEqOpr(this);
		}
	}
	public static class LrExprContext extends BoolExprContext {
		public TerminalNode LPAREN() { return getToken(DruidQuery.LPAREN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DruidQuery.RPAREN, 0); }
		public LrExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterLrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitLrExpr(this);
		}
	}
	public static class AndOprContext extends BoolExprContext {
		public BoolExprContext left;
		public BoolExprContext right;
		public TerminalNode AND() { return getToken(DruidQuery.AND, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public AndOprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterAndOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitAndOpr(this);
		}
	}
	public static class OrOprContext extends BoolExprContext {
		public BoolExprContext left;
		public BoolExprContext right;
		public TerminalNode OR() { return getToken(DruidQuery.OR, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public OrOprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterOrOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitOrOpr(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new LrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(121);
				match(LPAREN);
				setState(122);
				boolExpr(0);
				setState(123);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NameOprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				name(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new EqOprContext(new BoolExprContext(_parentctx, _parentState));
						((EqOprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(128);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(129);
						match(EQ);
						setState(130);
						((EqOprContext)_localctx).right = boolExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new AndOprContext(new BoolExprContext(_parentctx, _parentState));
						((AndOprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(131);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(132);
						match(AND);
						setState(133);
						((AndOprContext)_localctx).right = boolExpr(4);
						}
						break;
					case 3:
						{
						_localctx = new OrOprContext(new BoolExprContext(_parentctx, _parentState));
						((OrOprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(134);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(135);
						match(OR);
						setState(136);
						((OrOprContext)_localctx).right = boolExpr(3);
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public TerminalNode GROUP() { return getToken(DruidQuery.GROUP, 0); }
		public TerminalNode BY() { return getToken(DruidQuery.BY, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DruidQuery.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DruidQuery.COMMA, i);
		}
		public GroupCluasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupCluaster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterGroupCluaster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitGroupCluaster(this);
		}
	}

	public final GroupCluasterContext groupCluaster() throws RecognitionException {
		GroupCluasterContext _localctx = new GroupCluasterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_groupCluaster);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(GROUP);
			setState(143);
			match(BY);
			setState(144);
			name(0);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(145);
				match(COMMA);
				setState(146);
				name(0);
				}
				}
				setState(151);
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
		public TerminalNode ORDER() { return getToken(DruidQuery.ORDER, 0); }
		public TerminalNode BY() { return getToken(DruidQuery.BY, 0); }
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DruidQuery.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DruidQuery.COMMA, i);
		}
		public OrderCluasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderCluaster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterOrderCluaster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitOrderCluaster(this);
		}
	}

	public final OrderCluasterContext orderCluaster() throws RecognitionException {
		OrderCluasterContext _localctx = new OrderCluasterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orderCluaster);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ORDER);
			setState(153);
			match(BY);
			setState(154);
			order();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155);
				match(COMMA);
				setState(156);
				order();
				}
				}
				setState(161);
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
		public TerminalNode ASC() { return getToken(DruidQuery.ASC, 0); }
		public TerminalNode DESC() { return getToken(DruidQuery.DESC, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitOrder(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			name(0);
			setState(164);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(163);
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
		public TerminalNode LIMIT() { return getToken(DruidQuery.LIMIT, 0); }
		public List<TerminalNode> INT() { return getTokens(DruidQuery.INT); }
		public TerminalNode INT(int i) {
			return getToken(DruidQuery.INT, i);
		}
		public LimitCluasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitCluaster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).enterLimitCluaster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DruidQueryListener ) ((DruidQueryListener)listener).exitLimitCluaster(this);
		}
	}

	public final LimitCluasterContext limitCluaster() throws RecognitionException {
		LimitCluasterContext _localctx = new LimitCluasterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_limitCluaster);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LIMIT);
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(167);
				((LimitCluasterContext)_localctx).offset = match(INT);
				}
				break;
			}
			setState(170);
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
		case 9:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0094\u00af\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\5\2$\n\2"+
		"\3\2\5\2\'\n\2\3\2\5\2*\n\2\3\2\5\2-\n\2\3\2\3\2\3\3\3\3\3\3\7\3\64\n"+
		"\3\f\3\16\3\67\13\3\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\5\5\5R\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\6\3\6\3\6\7\6b\n\6\f\6\16\6"+
		"e\13\6\5\6g\n\6\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\3\t"+
		"\5\tv\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0081\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008c\n\13\f\13\16\13"+
		"\u008f\13\13\3\f\3\f\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00a0\n\r\f\r\16\r\u00a3\13\r\3\16\3\16\5\16\u00a7"+
		"\n\16\3\17\3\17\5\17\u00ab\n\17\3\17\3\17\3\17\2\4\b\24\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\5\4\2\u0082\u0083\u008d\u008d\3\2\u0080\u0081"+
		"\3\2MN\u00bb\2\36\3\2\2\2\4\60\3\2\2\2\6:\3\2\2\2\bQ\3\2\2\2\nf\3\2\2"+
		"\2\fj\3\2\2\2\16p\3\2\2\2\20r\3\2\2\2\22w\3\2\2\2\24\u0080\3\2\2\2\26"+
		"\u0090\3\2\2\2\30\u009a\3\2\2\2\32\u00a4\3\2\2\2\34\u00a8\3\2\2\2\36\37"+
		"\7\3\2\2\37 \5\4\3\2 !\7\7\2\2!#\5\20\t\2\"$\5\22\n\2#\"\3\2\2\2#$\3\2"+
		"\2\2$&\3\2\2\2%\'\5\26\f\2&%\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(*\5\30\r\2"+
		")(\3\2\2\2)*\3\2\2\2*,\3\2\2\2+-\5\34\17\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2"+
		"\2./\7\2\2\3/\3\3\2\2\2\60\65\5\6\4\2\61\62\7f\2\2\62\64\5\6\4\2\63\61"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65"+
		"\3\2\2\289\7\u0093\2\29;\7g\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<?\5\b\5"+
		"\2=>\7\16\2\2>@\7\u0093\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2AB\b\5\1\2B"+
		"C\7_\2\2CD\5\b\5\2DE\7`\2\2ER\3\2\2\2FG\7\u0093\2\2GH\7_\2\2HI\5\n\6\2"+
		"IJ\7`\2\2JR\3\2\2\2KL\5\16\b\2LM\7g\2\2MO\3\2\2\2NK\3\2\2\2NO\3\2\2\2"+
		"OP\3\2\2\2PR\5\16\b\2QA\3\2\2\2QF\3\2\2\2QN\3\2\2\2R[\3\2\2\2ST\f\6\2"+
		"\2TU\t\2\2\2UZ\5\b\5\7VW\f\5\2\2WX\t\3\2\2XZ\5\b\5\6YS\3\2\2\2YV\3\2\2"+
		"\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\t\3\2\2\2][\3\2\2\2^c\5\f\7\2_`\7"+
		"f\2\2`b\5\f\7\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3"+
		"\2\2\2f^\3\2\2\2fg\3\2\2\2g\13\3\2\2\2hk\5\16\b\2ik\5\b\5\2jh\3\2\2\2"+
		"ji\3\2\2\2k\r\3\2\2\2lq\7\u0093\2\2mq\7\u0090\2\2nq\7\u0091\2\2oq\7\u0092"+
		"\2\2pl\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\17\3\2\2\2ru\7\u0093\2\2"+
		"st\7\16\2\2tv\7\u0093\2\2us\3\2\2\2uv\3\2\2\2v\21\3\2\2\2wx\7\t\2\2xy"+
		"\5\24\13\2y\23\3\2\2\2z{\b\13\1\2{|\7_\2\2|}\5\24\13\2}~\7`\2\2~\u0081"+
		"\3\2\2\2\177\u0081\5\b\5\2\u0080z\3\2\2\2\u0080\177\3\2\2\2\u0081\u008d"+
		"\3\2\2\2\u0082\u0083\f\6\2\2\u0083\u0084\7j\2\2\u0084\u008c\5\24\13\7"+
		"\u0085\u0086\f\5\2\2\u0086\u0087\7B\2\2\u0087\u008c\5\24\13\6\u0088\u0089"+
		"\f\4\2\2\u0089\u008a\7C\2\2\u008a\u008c\5\24\13\5\u008b\u0082\3\2\2\2"+
		"\u008b\u0085\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\25\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\f\2\2\u0091\u0092\7\13\2\2\u0092\u0097\5\b\5\2\u0093\u0094\7"+
		"f\2\2\u0094\u0096\5\b\5\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\27\3\2\2\2\u0099\u0097\3\2\2"+
		"\2\u009a\u009b\7\n\2\2\u009b\u009c\7\13\2\2\u009c\u00a1\5\32\16\2\u009d"+
		"\u009e\7f\2\2\u009e\u00a0\5\32\16\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\31\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a6\5\b\5\2\u00a5\u00a7\t\4\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00aa\7W\2\2\u00a9\u00ab"+
		"\7\u0090\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2"+
		"\2\u00ac\u00ad\7\u0090\2\2\u00ad\35\3\2\2\2\31#&),\65:?NQY[cfjpu\u0080"+
		"\u008b\u008d\u0097\u00a1\u00a6\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}