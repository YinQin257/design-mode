package io.yinqin.github.facade.service.impl;

import io.yinqin.github.facade.service.BModuleApi;

/**
 * B模块接口的实现类
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月29日
 * @since 1.0.0
 */
public class BModuleApiImpl implements BModuleApi {
    @Override
    public void testB() {
        System.out.println("现在在B模块中操作testB方法");
    }
}
