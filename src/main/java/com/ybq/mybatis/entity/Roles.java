package com.ybq.mybatis.entity;

import java.util.List;

public class Roles {
    /**
     *
     */
    private Integer roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色的说明
     */
    private String roleDeclare;

    /**
     * 0表示未删除 1表示删除
     */
    private Integer isDel;
    private List<Privilege> privileges;

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDeclare() {
        return roleDeclare;
    }

    public void setRoleDeclare(String roleDeclare) {
        this.roleDeclare = roleDeclare;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleDeclare='" + roleDeclare + '\'' +
                ", isDel=" + isDel +
                ", privileges=" + privileges +
                '}';
    }
}

