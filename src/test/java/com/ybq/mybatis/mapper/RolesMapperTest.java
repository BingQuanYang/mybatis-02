package com.ybq.mybatis.mapper;

import com.ybq.mybatis.entity.Roles;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *  多对多查询  == 两个一对多
 */
public class RolesMapperTest {
    SqlSession sqlSession;
    RolesMapper mapper;

    @Before
    public void before(){
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(OrderMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        sqlSession = factory.openSession(true);
        mapper = sqlSession.getMapper(RolesMapper.class);
    }
    @After
    public void after(){
        sqlSession.close();
    }
    @Test
    public void selectByUserId(){
        Roles roles = mapper.selectByUserId(3);
        System.out.println(roles);
    }
}
