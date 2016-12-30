package com.lingdu;

import com.alibaba.fastjson.JSONArray;
import com.lingdu.driver.ResultSet;
import com.lingdu.parser.Query;

public class SqlExecutor {
    
    public ResultSet executeSql(Query query){
        //TODO 拼接查询条件和所需要查询的字段
        makeCondition(query);
        //TODO QUERY DATA
        JSONArray data = getDataFromDB(query);
        //DO FUNCTION INVOCATION
        data = dealWithFunction(data,query);
        return null;
    }

    private JSONArray dealWithFunction(JSONArray data, Query query) {
        // TODO Auto-generated method stub
        return null;
    }

    private JSONArray getDataFromDB(Query query) {
        //  Auto-generated method stub
        return null;
    }

    private void makeCondition(Query query) {
        query.getCondation();
        query.getColumnList();
        
    }
}
