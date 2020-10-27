package com.ybq.mybatis.service;

import com.ybq.mybatis.entity.Roles;
import com.ybq.mybatis.entity.User;
import com.ybq.mybatis.mapper.RolesMapper;
import com.ybq.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.concurrent.atomic.AtomicBoolean;

public class UserServiceImpl implements UserService {

    public static final String DELETE = "del";
    UserMapper userMapper;
    RolesMapper rolesMapper;

    public UserServiceImpl(SqlSession sqlSession) {
        userMapper = sqlSession.getMapper(UserMapper.class);
        rolesMapper = sqlSession.getMapper(RolesMapper.class);

    }

    /**
     * 根据用户id删除用户
     *
     * @param userId 用户id
     * @return
     */
    @Override
    public int removeUser(int userId) {
        //判断是否有删除权限权限
        if (hasPrivilege(userId, DELETE)) {
            int i = userMapper.deleteById(userId);
        }else {
            System.out.println("没有删除权限");
        }
        return 0;
    }

    /**
     * 根据用户id判断是否有指定的权限
     *
     * @param userId 用户id
     * @param pri    用于判断是否有该权限
     * @return 有指定权限则返回true 没有则返回 false
     */
    public boolean hasPrivilege(int userId, String pri) {
        //用户返回结果的一个保存默认为false
        AtomicBoolean flag = new AtomicBoolean(false);
        //根据用户id获取角色信息
        Roles roles = rolesMapper.selectByUserId(userId);
        //遍历角色的所有权限
        roles.getPrivileges().forEach(privilege -> {
            //获取角色的权限名称
            String privilegeName = privilege.getPrivilegeName();
            if (pri.equals(privilegeName)) {
                flag.set(true);
            }
        });
        return flag.get();
    }
}
