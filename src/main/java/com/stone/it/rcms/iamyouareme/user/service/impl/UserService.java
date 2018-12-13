package com.stone.it.rcms.iamyouareme.user.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.stone.it.rcms.iamyouareme.base.PageEntity;
import com.stone.it.rcms.iamyouareme.base.PageResult;
import com.stone.it.rcms.iamyouareme.user.dao.IUserDao;
import com.stone.it.rcms.iamyouareme.user.entity.UserEntity;
import com.stone.it.rcms.iamyouareme.user.service.IUserService;


@Named
public class UserService implements IUserService{

	@Inject
	private IUserDao userDao;

	public UserEntity findUserInfo(String userId) throws Exception {
		return userDao.findUserInfo(userId);
	}

	public List<UserEntity> findUserList(UserEntity userEntity) throws Exception {
		return userDao.findUserList(userEntity);
	}

	public PageResult<UserEntity> findPageResultUsers(UserEntity userEntity, PageEntity pageEntity) throws Exception {
		return userDao.findPageResultUsers(userEntity, pageEntity);
	}
	
}
