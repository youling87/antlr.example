package druid;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.pihui.nbsp.parser.SQLLexer;
import com.pihui.nbsp.parser.SQLQuery;
import com.pihui.nbsp.parser.SQLQueryBaseListener;
import com.pihui.nbsp.parser.impl.SQLQueryVisitorImpl;

public class SQLRunner {
    public static void main(String[] args) throws Exception {
        String s = "select max(min(1,2),ttt,min(t1.c2,1)) as max from "
                + "tableName1 as t1 "
                + "where max(c1)=min(min(1),min()) "
                + "group by a1 "
                + "order by a1 ";
        System.out.println(s);
        ANTLRInputStream input = new ANTLRInputStream(s);
        DruidLexer lexer = new DruidLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DruidQuery parser = new DruidQuery(tokens);
        ParseTree tree = parser.prog(); // parse; start at prog
        System.out.println(tree.toStringTree(parser)); // print tree as text
        DruidQueryBaseVisitor eval = new DruidQueryBaseVisitor();
        eval.visit(tree);
        //System.out.println(eval.getQuery());
        //ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        //DruidQueryBaseListener extractor = new DruidQueryBaseListener(parser);
        //walker.walk(extractor, tree); // initiate walk of tree with listener
    }
}
