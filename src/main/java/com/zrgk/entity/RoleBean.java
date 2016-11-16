package com.zrgk.entity;

public class RoleBean {
	private int roleId;
	private String roleName;
	private int roleState;
	public RoleBean(int roleId, String roleName, int roleState) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleState = roleState;
	}
	public RoleBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getRoleState() {
		return roleState;
	}
	public void setRoleState(int roleState) {
		this.roleState = roleState;
	}
}
