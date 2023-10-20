package com.example.boot3ssmstart.util;

public class Response<T> {
  
    private int code; // 状态码  
    private String message; // 信息  
    private T data; // 返回数据  
  
    // 构造方法  
    public Response(int code, String message, T data) {  
        this.code = code;  
        this.message = message;  
        this.data = data;  
    }  
  
    // 状态码获取方法  
    public int getCode() {  
        return code;  
    }  
  
    // 信息获取方法  
    public String getMessage() {  
        return message;  
    }  
  
    // 返回数据获取方法  
    public T getData() {  
        return data;  
    }  
  
    // 判断请求是否成功  
    public boolean isSuccess() {  
        return code == 200;  
    }  
}