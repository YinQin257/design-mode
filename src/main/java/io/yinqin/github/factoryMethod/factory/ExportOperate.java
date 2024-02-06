package io.yinqin.github.factoryMethod.factory;

import io.yinqin.github.factoryMethod.service.ExportFileApi;

/**
 * 导出方式工厂
 *
 * @author YinQin
 * @createDate 2023年11月30日
 * @since 1.0.0
 */
public abstract class ExportOperate {

    /**
     * 数据导出方法
     * @param data 数据
     * @return 结果
     */
    public boolean export(String data) {
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

    /**
     * 工厂方法
     * @return 导出方式
     */
    protected abstract ExportFileApi factoryMethod();
}
