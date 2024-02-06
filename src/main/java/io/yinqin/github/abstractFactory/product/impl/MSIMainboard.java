package io.yinqin.github.abstractFactory.product.impl;

import io.yinqin.github.abstractFactory.product.MainboardApi;

/**
 * 微星的主板
 *
 * @author YinQin
 * @createDate 2024年02月06日
 * @since 1.0.0
 */
public class MSIMainboard implements MainboardApi {

    @Override
    public String brand() {
        return "微星";
    }

    @Override
    public int cpuHoles() {
        return 939;
    }
}
