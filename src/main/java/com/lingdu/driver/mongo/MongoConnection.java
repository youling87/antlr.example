package com.lingdu.driver.mongo;


import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

import com.lingdu.SQLRunner;
import com.lingdu.driver.wrap.ConnectionWrap;

public class MongoConnection
  extends ConnectionWrap{
  private Properties properties;
  private SQLRunner sqlRunner;
  private String url;
  private CountDownLatch latch;
  private SQLException ex;
  
//  public MongoConnection(JDBCURL url)
//  {
//    this.sqlRunner = new SqlRunner(this.properties);
//    this.url = url.toUrl();
//    this.client = HttpUtil.getHttpClient();
//    if (logger.isDebugEnabled()) {
//      logger.debug("query address is %s", this.url);
//    }
//  }
//  
//  public Object query(String sql)
//    throws SQLException
//  {
//    if (logger.isDebugEnabled()) {
//      logger.debug("query sql is: %s", sql);
//    }
//    StringTokenizer token = new StringTokenizer(sql, " ");
//    while (token.hasMoreTokens())
//    {
//      String t = token.nextToken();
//      if ("DUAL".equals(t))
//      {
//        JSONArray array = (JSONArray)JSON.parse("[{\"timestamp\":\"2012-01-01T00:00:00.000Z\",\"result\":{\"sample_name1\":\"sample_name1\",\"sample_name2\":\"sample_name1\",\"sample_divide\":\"sample_name1\"}},{\"timestamp\":\"2012-01-02T00:00:00.000Z\",\"result\":{\"sample_name1\":\"sample_name1\",\"sample_name2\":\"sample_name1\",\"sample_divide\":\"sample_name1\"}}]");
//        if (logger.isInfoEnabled()) {
//          logger.info("test sql :" + sql + " \t result:" + array);
//        }
//        return array;
//      }
//    }
//    JSONObject params = this.sqlRunner.parseSql(sql);
//    Future<HttpResponse> future = HttpUtil.get(this.url, params, this, this.client);
//    this.latch = new CountDownLatch(1);
//    if (future != null)
//    {
//      if (!future.isDone()) {
//        try
//        {
//          this.latch.await();
//        }
//        catch (Exception e)
//        {
//          throw new SQLException(e);
//        }
//      }
//      try
//      {
//        if (this.ex != null)
//        {
//          SQLException exception = this.ex;
//          this.ex = null;
//          throw exception;
//        }
//        HttpResponse response = (HttpResponse)future.get();
//        return HttpUtil.response2JsonObject(response);
//      }
//      catch (SQLException e)
//      {
//        throw e;
//      }
//      catch (Exception e)
//      {
//        throw new SQLException(e);
//      }
//    }
//    return new SQLException("unkonw exception!!!");
//  }
//  
//  public PreparedStatement prepareStatement(String sql)
//    throws SQLException
//  {
//    return new RestfulPreparedStatement(sql, this, this.properties);
//  }
//  
//  public Statement createStatement()
//    throws SQLException
//  {
//    return new RestfulPreparedStatement(null, this, this.properties);
//  }
//  
//  public void close()
//    throws SQLException
//  {
//    try
//    {
//      this.client.close();
//    }
//    catch (IOException e)
//    {
//      throw new SQLException(e);
//    }
//  }
//  
//  public void completed(HttpResponse result)
//  {
//    this.latch.countDown();
//  }
//  
//  public void failed(Exception ex)
//  {
//    this.ex = new SQLException(ex);
//    this.latch.countDown();
//  }
//  
//  public void cancelled()
//  {
//    this.latch.countDown();
//  }
}

