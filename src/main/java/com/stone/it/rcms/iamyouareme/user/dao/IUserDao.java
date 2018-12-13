package com.stone.it.rcms.iamyouareme.user.dao;

import java.util.List;

import com.stone.it.rcms.iamyouareme.base.PageEntity;
import com.stone.it.rcms.iamyouareme.base.PageResult;
import com.stone.it.rcms.iamyouareme.user.entity.UserEntity;

public interface IUserDao {
	
	public UserEntity findUserInfo(String userId) throws Exception;
	public List<UserEntity> findUserList(UserEntity userEntity) throws Exception;
	public PageResult<UserEntity> findPageResultUsers(UserEntity userEntity,PageEntity pageEntitys) throws Exception;
	
}
