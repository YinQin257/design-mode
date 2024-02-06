package io.yinqin.github.abstractFactory.factory;

import io.yinqin.github.abstractFactory.product.CPUApi;
import io.yinqin.github.abstractFactory.product.MainboardApi;
import io.yinqin.github.abstractFactory.product.impl.AMDCPU;
import io.yinqin.github.abstractFactory.product.impl.GAMainboard;
import io.yinqin.github.abstractFactory.product.impl.IntelCPU;
import io.yinqin.github.abstractFactory.product.impl.MSIMainboard;

/**
 * 组装方案一
 * 英特尔的CPU+技嘉的主板
 *
 * @author YinQin
 * @createDate 2024年02月06日
 * @since 1.0.0
 */
public class Schema1 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU();
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard();
    }
}
