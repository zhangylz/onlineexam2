package com.ylzh.onlineexam.vo.base;

import java.util.List;

public class PageResultVO {
    private List rows;
    private Long total;

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public PageResultVO(List rows ,Long total) {
        this.total = total;
        this.rows = rows;
    }

}
