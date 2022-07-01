package org.dog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dog.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/06/29/11:30 PM
 */

@Mapper
public interface UserMapper {

  /**
   * 添加用户信息
   * @return
   */
  int insertUser();

  /**
   * 修改用户信息
   */
  void updateUser();

  /**
   * 删除用户信息
   */
  void deleteUser();

  /**
   * 根据id查询用户信息
   */
  User getUserById();

  /**
   * 查询所有用户信息
   */
  List<User> getAllUser();

}
