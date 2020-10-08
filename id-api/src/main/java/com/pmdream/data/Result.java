package com.pmdream.data;

import java.io.Serializable;

/**
 * @desc: Result
 * @author: zhudakang@baijiahulian.com
 * @date: 2020/10/8 3:06 下午
 */
public class Result<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;
}
