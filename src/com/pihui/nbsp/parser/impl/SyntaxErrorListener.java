package com.pihui.nbsp.parser.impl;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import com.pihui.nbsp.parser.exception.SyntaxErrorException;

public class SyntaxErrorListener
extends BaseErrorListener
{
public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
{
  RuntimeException ex = new SyntaxErrorException(msg);
  throw ex;
}
}
