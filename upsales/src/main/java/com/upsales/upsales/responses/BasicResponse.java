package com.upsales.upsales.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class BasicResponse {
    private String message;
    private String statusCode;
    private Object data;
    
}
