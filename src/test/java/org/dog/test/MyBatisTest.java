package org.dog.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.dog.entity.User;
import org.dog.mapper.UserMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/06/29/11:45 PM
 */


public class MyBatisTest {

  @Test
  public void insertTest() throws IOException {
    // 加载配置文件
    InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
    // 获取 SqlSessionFactoryBuilder
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    // 获取SqlSessionFactory
    SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
    // 获取sqlSession(获取sqlSession默认不设置自动提交) autoCommit - 设置自动提交
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    // 获取mapper接口对象
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    // 测试功能
    int result = userMapper.insertUser();
    // 提交事务
    sqlSession.commit();
    System.out.println("result:"+result);
  }

  @Test
  public void updateTest() throws IOException {
    InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
    SqlSession sqlSession = build.openSession(true);
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    userMapper.updateUser();
    System.out.println("更新成功");
  }

  @Test
  public void deleteTest() throws IOException {
    InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
    SqlSession sqlSession = build.openSession(true);
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    userMapper.deleteUser();
    System.out.println("删除成功");
  }

  @Test
  public void getUserByIdTest() throws IOException {
    InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
    SqlSession sqlSession = build.openSession(true);
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    List<User> allUser = userMapper.getAllUser();
    allUser.forEach(list -> System.out.println(list));
    System.out.println("查询成功");
  }
}
