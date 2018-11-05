package com.chain.calf.exception;

/**
 * @Author bangquan.qian
 * @Date 2018/11/5 6:46 PM
 */

public class BaseCalfException extends Exception {

    private static final long serialVersionUID = -1733178577290378848L;

    private String code;

    public BaseCalfException() {
        super();
    }

    public BaseCalfException(String message) {
        super(message);
    }

    public BaseCalfException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseCalfException(Throwable cause) {
        super(cause);
    }

    protected BaseCalfException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
