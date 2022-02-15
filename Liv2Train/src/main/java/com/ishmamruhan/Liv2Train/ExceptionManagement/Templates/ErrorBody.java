package com.ishmamruhan.Liv2Train.ExceptionManagement.Templates;

/**
 *
 * Custom Error Body for our Custom Error Handeling Method
 *
 */

public class ErrorBody {
    private String Error_Code;
    private String Error_Message;

    public ErrorBody() {
    }

    public ErrorBody(String error_Code, String error_Message) {
        Error_Code = error_Code;
        Error_Message = error_Message;
    }

    public String getError_Code() {
        return Error_Code;
    }

    public void setError_Code(String error_Code) {
        Error_Code = error_Code;
    }

    public String getError_Message() {
        return Error_Message;
    }

    public void setError_Message(String error_Message) {
        Error_Message = error_Message;
    }
}
