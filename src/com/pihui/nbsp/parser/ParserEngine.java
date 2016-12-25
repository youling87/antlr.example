package com.pihui.nbsp.parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.lang3.StringUtils;

import com.pihui.nbsp.parser.impl.SQLQueryVisitorImpl;
import com.pihui.nbsp.parser.impl.SqlAntlrErrorStrategy;
import com.pihui.nbsp.parser.impl.SyntaxErrorListener;

public class ParserEngine
{
  public static Query parse(String sql)
  {
    if (StringUtils.isBlank(sql)) {
      throw new RuntimeException();
    }
    SyntaxErrorListener listener = new SyntaxErrorListener();
    
    ANTLRInputStream input = new ANTLRInputStream(sql);
    
    SQLLexer lexer = new SQLLexer(input);
    lexer.removeErrorListeners();
    
    lexer.addErrorListener(listener);
    
    CommonTokenStream token = new CommonTokenStream(lexer);
    
    SQLQuery query = new SQLQuery(token);
    
    query.setErrorHandler(new SqlAntlrErrorStrategy());
    
    SQLQuery.ProgContext progTree = query.prog();
    SQLQueryVisitorImpl visitor = new SQLQueryVisitorImpl();
    if (visitor.visit(progTree)) {
      return visitor.getQuery();
    }
    throw new RuntimeException("SQL parser error!!!");
  }
  public static void main(String args[]){
      String s = "select max(t1.c1  ,toInt(t1.c2)) as max from "
              + "tableName1 as t1 "
              + "where a(c1)=a(b(1),c()) "
              + "group by a1 "
              + "order by a1 ";
      ParserEngine e = new ParserEngine();
      Query q = e.parse(s);
      System.out.println(q);
      
  }
}
