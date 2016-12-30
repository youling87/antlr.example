package com.lingdu;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.lingdu.parser.SQLLexer;
import com.lingdu.parser.SQLQuery;
import com.lingdu.parser.impl.SQLQueryVisitorImpl;

public class SQLRunner {
    public static void main(String[] args) throws Exception {
        String s = "select max(min(1,2),ttt,min(t1.c2,1)) as max from "
                + "tableName1 as t1 "
                + "where max(c1)=min(min(1),min()) "
                + "group by a1 "
                + "order by a1 ";
        s = "select 123,idCardNum,phoneNum from OpenlineStore where idCardNum=123 and phoneNum=1357999";
        s = "select 1 as finalnum,count(1) as count,sum(num) as num_sum,idCardNum  as idCardNum from OpenlineStore where idCardNum=123 and phoneNum=1357999 group by idCardNum";
        System.out.println(s);
        ANTLRInputStream input = new ANTLRInputStream(s);
        SQLLexer lexer = new SQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLQuery parser = new SQLQuery(tokens);
        ParseTree tree = parser.prog(); // parse; start at prog
        System.out.println(tree.toStringTree(parser)); // print tree as text
        SQLQueryVisitorImpl eval = new SQLQueryVisitorImpl();
        eval.visit(tree);
        System.out.println(eval.getQuery());
        //TODO 1、查询数据得到结果类数据
        
        //Connection conn = DriverManager.getConnection("");
        //ResultSet sourcecData =null;//= conn.executeQuery(conn);
        //TODO 2、根据返回的返回结果集合，解析结果集合根据结果做计算
        //ResultSet set = CaculatorUtils.caculat(sourcecData,eval.getQuery());
        //ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        //SQLQueryBaseListener extractor = new SQLQueryBaseListener(parser);
        //walker.walk(extractor, tree); // initiate walk of tree with listener
    }
}
