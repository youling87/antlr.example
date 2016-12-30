package com.pihui.nbsp.parser.impl;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

import com.pihui.nbsp.parser.exception.ParseErrorException;

public class SqlAntlrErrorStrategy
extends DefaultErrorStrategy
{
public Token recoverInline(Parser recognizer)
  throws RecognitionException
{
  String msg = String.format("sql parser error,line:%s,token:%s", new Object[] { Integer.valueOf(recognizer.getCurrentToken().getLine()), recognizer.getCurrentToken().getText() });
  throw new ParseErrorException(msg);
}

public void reportError(Parser recognizer, RecognitionException e)
{
  String msg = String.format("sql parser error,line:%s,token:%s", new Object[] { Integer.valueOf(recognizer.getCurrentToken().getLine()), recognizer.getCurrentToken().getText() });
  throw new ParseErrorException(msg, e);
}
}