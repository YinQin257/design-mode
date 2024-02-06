package io.yinqin.github.abstractFactory.product.impl;

import io.yinqin.github.abstractFactory.product.MainboardApi;

/**
 * 技嘉的主板
 *
 * @author YinQin
 * @createDate 2024年02月06日
 * @since 1.0.0
 */
public class GAMainboard implements MainboardApi {

    @Override
    public String brand() {
        return "技嘉";
    }

    @Override
    public int cpuHoles() {
        return 1156;
    }
}
