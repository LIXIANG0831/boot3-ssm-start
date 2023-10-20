package com.example.boot3ssmstart.util;

public enum StateCode {
    SUCCESS(200, "成功"),  
    BAD_REQUEST(400, "请求格式错误"),  
    UNAUTHORIZED(401, "未授权"),  
    FORBIDDEN(403, "禁止访问"),  
    NOT_FOUND(404, "未找到"),  
    SERVER_ERROR(500, "服务器内部错误"),  
    SERVICE_UNAVAILABLE(503, "服务不可用");  
  
    private final int code;  
    private final String message;  
  
    StateCode(int code, String message) {  
        this.code = code;  
        this.message = message;  
    }  
  
    public int getCode() {  
        return code;  
    }  
  
    public String getMessage() {  
        return message;  
    }  
}