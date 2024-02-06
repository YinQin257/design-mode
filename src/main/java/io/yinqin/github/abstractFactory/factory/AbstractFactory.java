package io.yinqin.github.abstractFactory.factory;

import io.yinqin.github.abstractFactory.product.CPUApi;
import io.yinqin.github.abstractFactory.product.MainboardApi;

/**
 * 抽象工厂
 *
 * @author YinQin
 * @createDate 2024年02月06日
 * @since
 */
public interface AbstractFactory {

    public CPUApi createCPUApi();
    public MainboardApi createMainboardApi();
}
