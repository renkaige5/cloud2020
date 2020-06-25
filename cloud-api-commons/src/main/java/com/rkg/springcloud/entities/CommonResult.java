package com.rkg.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private String serverPort;
    private T data;

    public CommonResult(Integer code, String message, String serverPort) {
        this(code, message, serverPort, null);
    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
 
 
