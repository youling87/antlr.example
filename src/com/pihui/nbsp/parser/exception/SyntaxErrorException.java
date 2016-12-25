package com.pihui.nbsp.parser.exception;

public class SyntaxErrorException
extends RuntimeException
{
private static final long serialVersionUID = 1L;

public SyntaxErrorException(String msg)
{
  super(msg);
}

public SyntaxErrorException(String msg, Throwable inner)
{
  super(msg, inner);
}
}
