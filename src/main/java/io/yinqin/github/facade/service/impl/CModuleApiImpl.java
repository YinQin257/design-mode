package io.yinqin.github.facade.service.impl;

import io.yinqin.github.facade.service.CModuleApi;

/**
 * C模块接口的实现类
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月29日
 * @since 1.0.0
 */
public class CModuleApiImpl implements CModuleApi {
    @Override
    public void testC() {
        System.out.println("现在在C模块中操作testC方法");
    }
}
