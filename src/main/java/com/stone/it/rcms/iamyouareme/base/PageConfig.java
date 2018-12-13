package com.stone.it.rcms.iamyouareme.base;

import java.io.Serializable;

/**
 * 分页默认信息
 * @author jichen
 *
 */
public class PageConfig implements Serializable{

	private static final long serialVersionUID = 846942587477481699L;
	
	public static final PageConfig DEFAULT = new PageConfig();
	//默认分页大小
	private Integer defaultPage = 15;
	//最大分页大小
	private Integer maxPageSize = 3000;
	
	public Integer getDefaultPage() {
		return defaultPage;
	}
	public void setDefaultPage(Integer defaultPage) {
		this.defaultPage = defaultPage;
	}
	public Integer getMaxPageSize() {
		return maxPageSize;
	}
	public void setMaxPageSize(Integer maxPageSize) {
		this.maxPageSize = maxPageSize;
	}
	
}
