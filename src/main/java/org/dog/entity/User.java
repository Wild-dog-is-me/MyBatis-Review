package org.dog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/06/29/11:28 PM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

  private Integer id;

  private String username;

  private String password;

  private int age;

  private String sex;

  private String email;

}
