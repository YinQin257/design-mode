package io.yinqin.github.facade.service.impl;

import io.yinqin.github.facade.service.AModuleApi;

/**
 * A模块接口的实现类
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月29日
 * @since 1.0.0
 */
public class AModuleApiImpl implements AModuleApi {
    @Override
    public void testA() {
        System.out.println("现在在A模块中操作testA方法");
    }
}
