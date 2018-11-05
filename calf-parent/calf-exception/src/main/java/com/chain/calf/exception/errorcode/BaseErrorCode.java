package com.chain.calf.exception.errorcode;

/**
 * @Author bangquan.qian
 * @Date 2018/11/5 6:46 PM
 */

public enum BaseErrorCode {

    SUCCESS("000000", "SUCCESS"),
    FAILURE("999999", "FAILURE");

    private String code;
    private String message;

    BaseErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static BaseErrorCode getErrorCode(String code) {
        if (code == null) {
            return null;
        }

        for (BaseErrorCode errorCode : values()) {
            if (errorCode.code.equals(code)) {
                return errorCode;
            }
        }

        return null;
    }
}
