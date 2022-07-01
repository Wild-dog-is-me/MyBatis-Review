package org.dog.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/06/30/11:07 AM
 */

public class SqlSessionUtils {

  public static SqlSession getSqlSession() {
    SqlSession sqlSession = null;
    try {
      InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
       sqlSession = sqlSessionFactory.openSession(true);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sqlSession;
  }
}
