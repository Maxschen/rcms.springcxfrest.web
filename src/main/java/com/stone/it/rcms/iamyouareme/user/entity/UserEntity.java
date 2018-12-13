package com.stone.it.rcms.iamyouareme.user.entity;

import com.stone.it.rcms.iamyouareme.base.BaseEntity;

public class UserEntity extends BaseEntity{

	private static final long serialVersionUID = -6103381840205507122L;

	private int id;
    private int userId;
    private String userName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
