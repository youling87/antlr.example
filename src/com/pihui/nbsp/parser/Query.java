package com.pihui.nbsp.parser;

import java.beans.ConstructorProperties;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.misc.Pair;

import com.pihui.nbsp.booleanExprs.IBooleanExpr;
import com.pihui.nbsp.operands.LimitOprand;
import com.pihui.nbsp.operands.Oprand;
import com.pihui.nbsp.operands.OrderByOprand;

public class Query {
    private final String table;
    private final List<Oprand> columns;
    private final IBooleanExpr whereClause;
    private final IBooleanExpr filterClause;
    private final List<OrderByOprand> orderBy;
    private final List<Oprand> groupBys;
    private final LimitOprand limit;
    private final Set<String> selectedColumnNameSet;
    private final Map<String, Pair<String, String>> condationMap;

    public String toString() {
        return "Query(table=" + getTable() + ", columns=" + getColumns() + ", whereClause=" + getWhereClause()
                +"filterClause=" + getFilterClause()+ ", orderBy=" + getOrderBy() + ", groupBys=" + getGroupBys() + ",limit=" + getLimit()
                + ",selectedColumnNameSet=" + selectedColumnNameSet + ",condationMap=" + condationMap + ")";
        //
    }

    @ConstructorProperties({ "table", "columns", "whereClause", "orderBy", "groupBys", "limit",
            "selectedColumnNameList", "condationMap" })
    public Query(String table, List<Oprand> columns, IBooleanExpr whereClause,IBooleanExpr filterClause, List<OrderByOprand> orderBy,
            List<Oprand> groupBys, LimitOprand limit, Set<String> selectedColumnNameList,
            Map<String, Pair<String, String>> condationMap) {//
        this.table = table;
        this.columns = columns;
        this.whereClause = whereClause;
        this.orderBy = orderBy;
        this.groupBys = groupBys;
        this.limit = limit;
        this.selectedColumnNameSet = selectedColumnNameList;
        this.condationMap = condationMap;
        this.filterClause = filterClause;
    }

    public static class QueryBuilder {
        private String table;
        private List<Oprand> columns;
        private IBooleanExpr whereClause;
        private IBooleanExpr filterClause;
        private List<OrderByOprand> orderBy;
        private List<Oprand> groupBys;
        private LimitOprand limit;
        private Set<String> selectedColumnNameSet = new HashSet<>();
        private Map<String, Pair<String, String>> condationMap = new HashMap<>();

        public void addSelectedColumnNameList(String columnName) {
            selectedColumnNameSet.add(columnName);
        }

        public void addCondation(String columnName, Pair<String, String> pair) {
            condationMap.put(columnName, pair);
        }

        public String toString() {
            return "Query.QueryBuilder(table=" + this.table + ", columns=" + this.columns + ", whereClause="
                    + this.whereClause + ",filterClause="+this.filterClause+", orderBy=" + this.orderBy + ", groupBys=" + this.groupBys + ", limit="
                    + this.limit + ")";
        }

        public Query build() {
            return new Query(this.table, this.columns, this.whereClause,this.filterClause, this.orderBy, this.groupBys, this.limit,
                    selectedColumnNameSet, condationMap);//
        }

        public QueryBuilder limit(LimitOprand limit) {
            this.limit = limit;
            return this;
        }

        public QueryBuilder groupBys(List<Oprand> groupBys) {
            this.groupBys = groupBys;
            return this;
        }

        public QueryBuilder orderBy(List<OrderByOprand> orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public QueryBuilder whereClause(IBooleanExpr whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public QueryBuilder filterClause(IBooleanExpr filterClause) {
            this.filterClause = filterClause;
            return this;
        }

        public QueryBuilder columns(List<Oprand> columns) {
            this.columns = columns;
            return this;
        }

        public QueryBuilder table(String table) {
            this.table = table;
            return this;
        }
    }

    public static QueryBuilder builder() {
        return new QueryBuilder();
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Query)) {
            return false;
        }
        Query other = (Query) o;
        if (!other.canEqual(this)) {
            return false;
        }
        Object thistable = getTable();
        Object othertable = other.getTable();
        if (thistable == null ? othertable != null : !thistable.equals(othertable)) {
            return false;
        }
        Object thiscolumns = getColumns();
        Object othercolumns = other.getColumns();
        if (thiscolumns == null ? othercolumns != null : !thiscolumns.equals(othercolumns)) {
            return false;
        }
        Object thiswhereClause = getWhereClause();
        Object otherwhereClause = other.getWhereClause();
        if (thiswhereClause == null ? otherwhereClause != null : !thiswhereClause.equals(otherwhereClause)) {
            return false;
        }
        Object thisorderBy = getOrderBy();
        Object otherorderBy = other.getOrderBy();
        if (thisorderBy == null ? otherorderBy != null : !thisorderBy.equals(otherorderBy)) {
            return false;
        }
        Object thisgroupBys = getGroupBys();
        Object othergroupBys = other.getGroupBys();
        if (thisgroupBys == null ? othergroupBys != null : !thisgroupBys.equals(othergroupBys)) {
            return false;
        }

        Object thislimit = getLimit();
        Object otherlimit = other.getLimit();
        if (thislimit == null ? otherlimit != null : !thislimit.equals(otherlimit)) {
            return false;
        }
        return true;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Query;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object table = getTable();
        result = result * 59 + (table == null ? 0 : table.hashCode());
        Object columns = getColumns();
        result = result * 59 + (columns == null ? 0 : columns.hashCode());
        Object whereClause = getWhereClause();
        result = result * 59 + (whereClause == null ? 0 : whereClause.hashCode());
        Object orderBy = getOrderBy();
        result = result * 59 + (orderBy == null ? 0 : orderBy.hashCode());
        Object groupBys = getGroupBys();
        result = result * 59 + (groupBys == null ? 0 : groupBys.hashCode());
        Object limit = getLimit();
        result = result * 59 + (limit == null ? 0 : limit.hashCode());
        return result;
    }

    public String getTable() {
        return this.table;
    }

    public List<Oprand> getColumns() {
        return this.columns;
    }

    public IBooleanExpr getWhereClause() {
        return this.whereClause;
    }
    public IBooleanExpr getFilterClause() {
        return this.filterClause;
    }

    public List<OrderByOprand> getOrderBy() {
        return this.orderBy;
    }

    public List<Oprand> getGroupBys() {
        return this.groupBys;
    }

    public LimitOprand getLimit() {
        return this.limit;
    }

    public Map<String, Pair<String, String>> getCondation() {
        // this.whereClause.
        return null;
    }

    public List<String> getColumnList() {
        return this.getColumnList();
    }

}
