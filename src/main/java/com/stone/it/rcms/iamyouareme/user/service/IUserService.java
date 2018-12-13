package com.stone.it.rcms.iamyouareme.user.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.stone.it.rcms.iamyouareme.base.PageEntity;
import com.stone.it.rcms.iamyouareme.base.PageResult;
import com.stone.it.rcms.iamyouareme.user.entity.UserEntity;

@Path("/userService") 
@Produces("application/json")
public interface IUserService {

	@GET
	@Path("/find/single/{userId}")
	public UserEntity findUserInfo(@PathParam("userId")String userId) throws Exception;
	
	@GET
	@Path("/find/list/users")
	public List<UserEntity> findUserList(@QueryParam("")UserEntity userEntity) throws Exception;
	
	@GET
	@Path("/find/list/page/{curPage}/{pageSize}")
	public PageResult<UserEntity> findPageResultUsers(@QueryParam("")UserEntity userEntity,@PathParam("")PageEntity pageEntitys) throws Exception;
	
}
