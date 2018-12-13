package com.stone.it.rcms.iamyouareme.base;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Jackson 解析json数据之忽略解析字段
 * @author jichen
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true,value="filters")
public class PageEntity implements Serializable{

	private static final long serialVersionUID = 5824156979939350412L;
	/**
	 * 总记录数
	 */
	private int totalRows;
	/**
	 * 当前页
	 */
	private int curPage;
	/**
	 * 每页条数
	 */
	private int pageSize;
	/**
	 * 起始
	 */
	private int startIndex;
	/**
	 * 结束
	 */
	private int endIndex;
	
	
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = (pageSize == 0 ? PageConfig.DEFAULT.getDefaultPage() : pageSize);
	}
	public int getStartIndex() {
		startIndex = (curPage -1) * pageSize + 1;
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getEndIndex() {
		endIndex = pageSize*curPage;
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
}
