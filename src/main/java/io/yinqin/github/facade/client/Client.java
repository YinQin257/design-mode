package io.yinqin.github.facade.client;

import io.yinqin.github.facade.facade.Facade;
import io.yinqin.github.facade.service.impl.AModuleApiImpl;
import io.yinqin.github.facade.service.impl.BModuleApiImpl;
import io.yinqin.github.facade.service.impl.CModuleApiImpl;

/**
 * 客户端
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月29日
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        // 当ABC三个模块的提供的方法均不相同，并且我们不能直接修改这三个模块
        // 此时的调用方法是这样的
        new AModuleApiImpl().testA();
        new BModuleApiImpl().testB();
        new CModuleApiImpl().testC();
        // 如果我们使用外观模式，将这三个模块包装起来
        new Facade().test();
    }
}
