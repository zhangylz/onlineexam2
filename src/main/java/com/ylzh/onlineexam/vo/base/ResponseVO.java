package com.ylzh.onlineexam.vo.base;

public class ResponseVO<T> {
    private Integer status;
    private String msg;
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseVO(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ResponseVO(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

}
