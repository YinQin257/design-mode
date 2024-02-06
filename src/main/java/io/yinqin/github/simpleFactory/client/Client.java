package io.yinqin.github.simpleFactory.client;

import io.yinqin.github.simpleFactory.factory.ApiFactory;
import io.yinqin.github.simpleFactory.service.Api;

/**
 * 客户端类
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月28日
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Api api = ApiFactory.createApi(1);
        if (api != null) {
            api.operation("正在使用简单工厂");
        }
    }
}
