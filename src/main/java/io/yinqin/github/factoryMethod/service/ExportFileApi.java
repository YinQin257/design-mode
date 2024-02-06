package io.yinqin.github.factoryMethod.service;

/**
 * 导出的文件对象的接口
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月30日
 * @since 1.0.0
 */
public interface ExportFileApi {

    /**
     * 导出内容为文件
     * @param data 数据
     * @return 是否成功
     */
    public boolean export(String data);
}
