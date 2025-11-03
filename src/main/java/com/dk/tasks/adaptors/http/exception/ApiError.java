package com.dk.tasks.adaptors.http.exception;

import com.dk.tasks.service.exception.ErrorCode;
import com.dk.tasks.service.exception.ErrorType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"type", "code", "message"})
@Getter
@Setter
@ToString
@AllArgsConstructor
public class ApiError {
    private ErrorType type;
    private ErrorCode code;
    private String message;

    public ApiError(ErrorCode code, String message) {
        this.type = ErrorType.INTERNAL;
        this.code = code;
        this.message = message;
    }
}
