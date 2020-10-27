package com.ybq.mybatis.mapper;

import com.ybq.mybatis.entity.Order;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 *  //一对一保存
 *         //映射关系 先保存主表获取主表的id 将主表的id值设置给从表的外键
 *         //更新
 *
 *
 *
 * 多对多  一定有第三张中间表
 *  权限表
 *      论坛
 *      管理员     删除帖子
 *      普通  用户 只能查看
 *      权限  删除权限    查看权限  对记录的增删改查
 *
 *      角色 权限的集合 admin user guest
 *
 *      权限表
 *      name  add  del  view
 *      declare
 *
 *
 */

public class OrderMapperTest {
    SqlSession sqlSession;
    OrderMapper mapper;

    @Before
    public void before(){
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(OrderMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        sqlSession = factory.openSession(true);
        mapper = sqlSession.getMapper(OrderMapper.class);
    }
    @After
    public void after(){
        sqlSession.close();
    }
    @Test
    public void selectOrderByOrderNo(){
        //一对一的查询
        Order order = mapper.selectOrderByOrderNo(123);
        System.out.println(order);
        //一对一保存
        //映射关系 先保存主表获取主表的id 将主表的id值设置给从表的外键
        //更新
        //删除 假删除
        //从表数据如何处理 要么一起删除
        //一对一
    }

    @Test
    public void selectOrderByUserId(){
        List<Order> orders = mapper.selectOrderByUserId(3);
        System.out.println(orders);
    }
}
