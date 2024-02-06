package io.yinqin.github.factoryMethod.service.impl;

import io.yinqin.github.factoryMethod.service.ExportFileApi;

/**
 * 导出到TXT文本中
 *
 * @author YinQin
 * @createDate 2023年11月30日
 * @since 1.0.0
 */
public class ExportTxtFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到文本文件");
        return false;
    }
}
