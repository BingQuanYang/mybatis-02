package com.ybq.mybatis.service;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class UserServiceTest {

   /**
    * 测试根据用户id删除用户功能
    *    用户有删除权限则删除没有则提示。
    */
   @Test
    public void removeUser(){
       SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(UserServiceTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
       UserService service = new UserServiceImpl(factory.openSession(true));
       service.removeUser(3);
   }
}
