package io.yinqin.github.simpleFactory.factory;

import io.yinqin.github.simpleFactory.service.impl.ApiImplA;
import io.yinqin.github.simpleFactory.service.impl.ApiImplB;
import io.yinqin.github.simpleFactory.service.Api;

/**
 * api工厂
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月28日
 * @since 1.0.0
 */
public class ApiFactory {
    public static Api createApi(int condition) {
        if (condition == 1) {
            return new ApiImplA();
        } else if (condition == 2){
            return new ApiImplB();
        } else {
            return null;
        }
    }
}
