package com.pmdream.service;

import java.util.List;

import com.pmdream.exception.GeneratorException;

/**
 * @desc: id生成器接口，用于标识是增长器
 * @author: pmdream
 * @date: 2020/10/08 14:40 下午
 */
public interface IdGenerator {
    /**
     * 取下一个值
     * @return
     */
    Long nextId() throws GeneratorException;

    /**
     * 去除一批值
     * @param batchSize
     * @return
     */
    List<Long> nextId(Integer batchSize) throws GeneratorException;
}
