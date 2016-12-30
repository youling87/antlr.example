package LabeledExpr;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Calc {

    public static void main(String[] args) throws Exception {
        String inputFile = "E:/workspace1/antlr4/src/LabeledExpr/t.txt";
        InputStream is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        LableExprLexer lexer = new LableExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LableExprParser parser = new LableExprParser(tokens);
        ParseTree tree = parser.prog(); // parse
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }

}
