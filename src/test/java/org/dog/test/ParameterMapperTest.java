package org.dog.test;

import org.apache.ibatis.session.SqlSession;
import org.dog.entity.User;
import org.dog.mapper.ParameterMapper;
import org.dog.utils.SqlSessionUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/06/30/11:06 AM
 */

public class ParameterMapperTest {

  @Test
  public void getAllUser() {
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
    for (User user : mapper.getAllUser()) {
      System.out.println(user);
    }
  }

  @Test
  public void getUser() {
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
    User admin = mapper.getUserByName("admin");
    System.out.println(admin);
  }

  @Test
  public void checkLogin() {
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
    User user = mapper.checkLogin("admin", "123456");
    System.out.println(user);
  }

  @Test
  public void checkLoginByMap() {
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
    Map<String, String> map = new HashMap<>();
    map.put("username", "admin");
    map.put("password", "123456");
    System.out.println(mapper.checkLoginByMap(map));
  }

  @Test
  public void insertUser() {
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
    int i = mapper.insertUser(new User(null, "王伟", "123456", 10, "男", "12345@qq.com"));
    System.out.println("result" + i);
  }
}
