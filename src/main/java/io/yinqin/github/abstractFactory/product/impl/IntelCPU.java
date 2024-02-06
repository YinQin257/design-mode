package io.yinqin.github.abstractFactory.product.impl;

import io.yinqin.github.abstractFactory.product.CPUApi;

/**
 * Intel的CPU实现
 *
 * @author YinQin
 * @createDate 2024年02月06日
 * @since 1.0.0
 */
public class IntelCPU implements CPUApi {

    @Override
    public String brand() {
        return "英特尔";
    }

    @Override
    public int pins() {
        return 1156;
    }
}
