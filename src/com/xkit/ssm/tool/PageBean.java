package com.xkit.ssm.tool;

import java.util.List;


public class PageBean {
	//页面数量
	private int pageCount;
	//页面大小
	private int pageSize;
	//页面下标
	private int pageIndex;
	//记录数
	private int record;
	//list集合
	private List list;
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
}
