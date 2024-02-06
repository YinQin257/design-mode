package io.yinqin.github.abstractFactory.product.impl;

import io.yinqin.github.abstractFactory.product.CPUApi;

/**
 * AMD的CPU实现
 *
 * @author YinQin
 * @createDate 2024年02月06日
 * @since 1.0.0
 */
public class AMDCPU implements CPUApi {

    @Override
    public String brand() {
        return "AMD";
    }

    @Override
    public int pins() {
        return 939;
    }
}
