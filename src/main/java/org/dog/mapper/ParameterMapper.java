package org.dog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dog.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/06/30/11:01 AM
 */

@Mapper
public interface ParameterMapper {

  /**
   * 查询所有用户信息
   * @return
   */
  List<User> getAllUser();

  /**
   * 根据用户名查询信息
   */
  User getUserByName(String username);

  /**
   * 验证登陆
   * @param username
   * @param password
   * @return
   */
  User checkLogin(String username, String password);

  /**
   * 验证用户登陆（自定义map）
   */
  User checkLoginByMap(Map<String, String> map);

  /**
   * 添加用户信息
   */
  int insertUser(User user);


}
