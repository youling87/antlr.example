package com.pihui.nbsp.caculator;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.pihui.nbsp.booleanExprs.BooleanExprAnd;
import com.pihui.nbsp.booleanExprs.BooleanExprEq;
import com.pihui.nbsp.booleanExprs.BooleanExprOr;
import com.pihui.nbsp.booleanExprs.ExpressionType;
import com.pihui.nbsp.booleanExprs.IBooleanExpr;
import com.pihui.nbsp.booleanExprs.SimpleBooleanExpr;
import com.pihui.nbsp.operands.Oprand;

public class DataCaculator {
    /**
     * 根据给定的IBooleanExpr计算出该行数据是否是满足过滤条件
     * 
     * @param filterClause
     * @param currentLine
     * @return
     */
    public static boolean booleanExpression(IBooleanExpr filterClause, Object currentLine) {
        if(filterClause instanceof BooleanExprAnd){
            BooleanExprAnd and  = (BooleanExprAnd)filterClause;
            //  1、计算表达式的left值
                boolean left = booleanExpression(and.getLeft(),currentLine);
            //  2、计算表达式的right值    
                boolean right = booleanExpression(and.getRight(),currentLine);
            return left&&right;
        }else if(filterClause instanceof BooleanExprOr){
            BooleanExprOr or  = (BooleanExprOr)filterClause;
            //  1、计算表达式的left值
                boolean left = booleanExpression(or.getLeft(),currentLine);
            //  2、计算表达式的right值    
                boolean right = booleanExpression(or.getRight(),currentLine);
            return left||right;
        }else if(filterClause instanceof BooleanExprEq){
            BooleanExprEq or  = (BooleanExprEq)filterClause;
            //  1、计算表达式的left值
                Object left = executeData(or.getLeft(),currentLine);
            //  2、计算表达式的right值    
                Object right = executeData(or.getRight(),currentLine);
            if(left==null&&right==null)
                return true;
            else if(left==null||right==null){
                return false;
            }else {
                return left.equals(right);
            }
        }else if(filterClause instanceof SimpleBooleanExpr){
            SimpleBooleanExpr simple  = (SimpleBooleanExpr)filterClause;
            if(simple.getType().equals(ExpressionType.BETWEEN_AND)){
                
            }else if(simple.getType().equals(ExpressionType.GREAT_EQUALS_THAN)){
                
            } else if(simple.getType().equals(ExpressionType.GREAT_THAN)){
                
            } else if(simple.getType().equals(ExpressionType.IN)){
                
            } else if(simple.getType().equals(ExpressionType.LESS_EQUALS_THAN)){
                
            } else if(simple.getType().equals(ExpressionType.LESS_THEN)){
                
            } else if(simple.getType().equals(ExpressionType.NOT_NULL)){
                
            } 
        }
        return false;
    }

    private static Object executeData(Oprand right, Object currentLine) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * 根据给定的List<Oprand>计算描述符和给定的元数据 计算出需要的输出结果
     * 
     * @param filterClause
     * @param currentLine
     * @return
     */
    public static JSONArray executeDataList(JSONArray afterFilterJsonArray, List<Oprand> columns) {
        // TODO 1、根据给定的List<Oprand>计算描述符和给定的元数据 计算出需要的输出结果
        return null;
    }
}
