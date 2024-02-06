package io.yinqin.github.abstractFactory.factory;

import io.yinqin.github.abstractFactory.product.CPUApi;
import io.yinqin.github.abstractFactory.product.MainboardApi;
import io.yinqin.github.abstractFactory.product.impl.AMDCPU;
import io.yinqin.github.abstractFactory.product.impl.MSIMainboard;

/**
 * 组装方案二
 * AMD的CPU+微星的主板
 *
 * @author YinQin
 * @createDate 2024年02月06日
 * @since 1.0.0
 */
public class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU();
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new MSIMainboard();
    }
}
