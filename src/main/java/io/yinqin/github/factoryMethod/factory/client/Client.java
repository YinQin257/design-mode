package io.yinqin.github.factoryMethod.factory.client;

import io.yinqin.github.factoryMethod.factory.ExportOperate;
import io.yinqin.github.factoryMethod.factory.impl.ExportDBFileOperate;

/**
 * 客户端
 *
 * @author YinQin
 * @createDate 2023年11月30日
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {
        ExportOperate operate = new ExportDBFileOperate();
        operate.export("DDD");
    }
}
