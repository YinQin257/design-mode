package io.yinqin.github.facade.facade;

import io.yinqin.github.facade.service.AModuleApi;
import io.yinqin.github.facade.service.BModuleApi;
import io.yinqin.github.facade.service.CModuleApi;
import io.yinqin.github.facade.service.impl.AModuleApiImpl;
import io.yinqin.github.facade.service.impl.BModuleApiImpl;
import io.yinqin.github.facade.service.impl.CModuleApiImpl;

/**
 * 外观对象
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月29日
 * @since 1.0.0
 */
public class Facade {

    public void test() {
        AModuleApi a = new AModuleApiImpl();
        a.testA();
        BModuleApi b = new BModuleApiImpl();
        b.testB();
        CModuleApi c = new CModuleApiImpl();
        c.testC();
    }
}
