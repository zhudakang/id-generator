package com.pmdream.service;

/**
 * @desc: id生成工厂
 * @author: pmdream
 * @date: 2020/10/8 2:55 下午
 */
public interface IdGeneratorFactory {

    /**
     * 根据bizType和timeout创建id生成器
     */
    IdGenerator getIdGenerator(String bizType, Integer timeout);
}
