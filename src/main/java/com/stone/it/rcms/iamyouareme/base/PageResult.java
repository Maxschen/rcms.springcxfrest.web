package com.stone.it.rcms.iamyouareme.base;

import java.io.Serializable;
import java.util.List;


/**
 * 分页返回对象
 * @author jichen
 *
 * @param <T>
 */
public class PageResult<T> implements Serializable{

	private static final long serialVersionUID = 1796901678661119501L;
	//分页信息
	private PageEntity pageEntity;
	//对象list
	private List<T> result;
	
	public PageResult(){}
	
	public PageResult(PageEntity pageEntity,List<T> result){
		this.pageEntity = pageEntity;
		this.result = result;
	}
	
	public PageEntity getPageVO() {
		return pageEntity;
	}
	public void setPageVO(PageEntity pageEntity) {
		this.pageEntity = pageEntity;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
}
