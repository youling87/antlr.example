package com.pihui.nbsp.driver;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pihui.nbsp.driver.mongo.ResultSetTransform;
import com.pihui.nbsp.driver.wrap.ResultSetWrap;

public class ResultSet extends ResultSetWrap {
    private Iterator<Object> it;
    private JSONObject indexObject;
    private List<String> head;
    // private RestfulResultSetMetaData resultSetMetaData;

    // public RestfulResultSet(Object obj)
    // {
    // throw new RuntimeException();
    // }

    // public RestfulResultSet(JSONObject object)
    // {
    // this(new JSONArray(Arrays.asList(new Object[] { object })));
    // }

    public ResultSet(JSONArray array) {
        array = ResultSetTransform.parser(array);
        this.head = new LinkedList();
        for (Object object : array) {
            if ((object instanceof JSONObject)) {
                JSONObject jsonObject = (JSONObject) object;
                for (Map.Entry<String, Object> resultEntity : jsonObject.entrySet()) {
                    String key = (String) resultEntity.getKey();
                    if (!this.head.contains(key)) {
                        this.head.add(key);
                    }
                }
            }
        }
        this.it = array.iterator();

    }

    public boolean next() throws SQLException {
        if (this.it.hasNext()) {
            this.indexObject = ((JSONObject) this.it.next());
            if (!(this.indexObject instanceof JSONObject)) {
                throw new RuntimeException();
            }
            return true;
        }
        return false;
    }

    public byte getByte(int columnIndex) throws SQLException {
        return getByte((String) this.head.get(getRealIndex(columnIndex)));
    }

    public byte getByte(String columnLabel) throws SQLException {
        return this.indexObject.getByteValue(columnLabel);
    }

    public short getShort(int columnIndex) throws SQLException {
        return getShort((String) this.head.get(getRealIndex(columnIndex)));
    }

    public short getShort(String columnLabel) throws SQLException {
        return this.indexObject.getShortValue(columnLabel);
    }

    public int getInt(int columnIndex) throws SQLException {
        return getInt((String) this.head.get(getRealIndex(columnIndex)));
    }

    public int getInt(String columnLabel) throws SQLException {
        return this.indexObject.getIntValue(columnLabel);
    }

    public long getLong(int columnIndex) throws SQLException {
        return getLong((String) this.head.get(getRealIndex(columnIndex)));
    }

    public long getLong(String columnLabel) throws SQLException {
        return this.indexObject.getLongValue(columnLabel);
    }

    public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
        return getBigDecimal((String) this.head.get(getRealIndex(columnIndex)));
    }

    public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
        return this.indexObject.getBigDecimal(columnLabel);
    }

    public double getDouble(int columnIndex) throws SQLException {
        return getDouble((String) this.head.get(getRealIndex(columnIndex)));
    }

    public double getDouble(String columnLabel) throws SQLException {
        return this.indexObject.getDoubleValue(columnLabel);
    }

    public float getFloat(int columnIndex) throws SQLException {
        return getFloat((String) this.head.get(getRealIndex(columnIndex)));
    }

    public float getFloat(String columnLabel) throws SQLException {
        return this.indexObject.getFloatValue(columnLabel);
    }

    public String getString(int columnIndex) throws SQLException {
        return getString((String) this.head.get(getRealIndex(columnIndex)));
    }

    public String getString(String columnLabel) throws SQLException {
        return this.indexObject.getString(columnLabel);
    }

    public java.sql.Date getDate(int columnIndex) throws SQLException {
        return getDate((String) this.head.get(getRealIndex(columnIndex)));
    }

    public java.sql.Date getDate(String columnLabel) throws SQLException {
        Long time = Long.valueOf(this.indexObject.getDate(columnLabel).getTime());
        return new java.sql.Date(time.longValue());
    }

    public Time getTime(int columnIndex) throws SQLException {
        return getTime((String) this.head.get(getRealIndex(columnIndex)));
    }

    public Time getTime(String columnLabel) throws SQLException {
        Long time = Long.valueOf(this.indexObject.getDate(columnLabel).getTime());
        return new Time(time.longValue());
    }

    public boolean getBoolean(int columnIndex) throws SQLException {
        return getBoolean((String) this.head.get(getRealIndex(columnIndex)));
    }

    public boolean getBoolean(String columnLabel) throws SQLException {
        return this.indexObject.getBooleanValue(columnLabel);
    }

    public Object getObject(int columnIndex) throws SQLException {
        return getObject((String) this.head.get(getRealIndex(columnIndex)));
    }

    public Object getObject(String columnLabel) throws SQLException {
        return this.indexObject.get(columnLabel);
    }

    public Object getCurrentLine() throws SQLException {
        return this.indexObject;
    }

    public String toString() {
        return this.it.toString();
    }

    private int getRealIndex(int columnIndex) {
        if (columnIndex <= 0) {
            return 0;
        }
        return columnIndex - 1;
    }
}
