package com.marketplace.project.entities.enums;

public enum RoleType {
    BUYER("BUYER"),
    SELLER("SELLER"),
    ADMIN("ADMIN");

    private String roleType;

    RoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleType() {
        return roleType;
    }
}
