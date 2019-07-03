package com.example.demo.service;

/**
 * 计算服务
 */
public interface CalculateService {

    /**
     * sum multiple integer number
     * @param values multiple integer number
     * @return sum
     */
    Integer sum(Integer... values);
}
