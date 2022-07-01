package org.dog.test;

import org.apache.ibatis.session.SqlSession;
import org.dog.mapper.SelectMapper;
import org.dog.utils.SqlSessionUtils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/06/30/3:40 PM
 */

public class SelectMapperTest {

  @Test
  public void getUserById() {
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
    System.out.println(mapper.getUserById(11));
  }

  @Test
  public void getCountTest() {
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
    int count = mapper.getCount();
    System.out.println("count:"+count);
  }

  @Test
  public void getUserByIdToMap() {
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
    System.out.println(mapper.getUserByIdToMap(5));
  }

  @Test
  public void getAllUserToMapList() {
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
    System.out.println(mapper.getAllUser());
  }

}
