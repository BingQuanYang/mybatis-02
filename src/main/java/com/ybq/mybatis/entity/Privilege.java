package com.ybq.mybatis.entity;

import java.util.List;

public class Privilege {
    /**
     *
     */
    private Integer privilegeId;

    /**
     * 权限的名称
     */
    private String privilegeName;

    /**
     * 权限的说明
     */
    private String privilegeDeclare;

    /**
     * 0表示未删除 1表示删除
     */
    private Integer isDel;
    private List<Roles> roles;

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getPrivilegeDeclare() {
        return privilegeDeclare;
    }

    public void setPrivilegeDeclare(String privilegeDeclare) {
        this.privilegeDeclare = privilegeDeclare;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "Privilege{" +
                "privilegeId=" + privilegeId +
                ", privilegeName='" + privilegeName + '\'' +
                ", privilegeDeclare='" + privilegeDeclare + '\'' +
                ", isDel=" + isDel +
                ", roles=" + roles +
                '}';
    }
}

