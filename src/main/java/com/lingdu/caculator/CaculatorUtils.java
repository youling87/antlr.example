package com.lingdu.caculator;

import java.sql.SQLException;

import com.alibaba.fastjson.JSONArray;
import com.lingdu.driver.ResultSet;
import com.lingdu.parser.Query;

public class CaculatorUtils {

    public static ResultSet caculat(ResultSet sourcecData, Query query) throws SQLException {
        // 1、第一步做过滤
        JSONArray afterFilterJsonArray = new JSONArray();
        query.getFilterClause();
        while (sourcecData.next()) {
            if(DataCaculator.booleanExpression(query.getFilterClause(),sourcecData.getCurrentLine())){
                afterFilterJsonArray.add(sourcecData.getCurrentLine());
            }
        }
        // 2、第二步做计算
        JSONArray resultJsonArray = DataCaculator.executeDataList(afterFilterJsonArray,query.getColumns());
        return new ResultSet(resultJsonArray);
    }
}
