package com.pmdream.exception;

/**
 * @desc: 生成器异常，当生成器不可用的时候抛出该异常
 * @author: pmdream
 * @date: 2020/10/8 2:49 下午
 */
public class GeneratorException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public GeneratorException(String message) {
        super(message);
    }

    public GeneratorException(String message, Throwable cause) {
        super(message, cause);
    }
}
