package com.ylzh.onlineexam.vo.base;

public class BaseConditionVO {
    private int pageNumber = 1;
    private int pageSize = 10;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
