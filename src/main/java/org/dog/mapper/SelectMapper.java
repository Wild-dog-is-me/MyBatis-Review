package org.dog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.dog.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/06/30/3:37 PM
 */

@Mapper
public interface SelectMapper {
  List<User> getUserById(@Param("id") Integer id);

  /**
   * 查询用户总记录数
   */
  int getCount();

  /**
   * 根据id查询用户信息，返回集合为一个map
   */
  Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

  /**
   * 查询所有用户集合为map
   */
  List<Map<String, Object>> getAllUser();
}
