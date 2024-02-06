package io.yinqin.github.factoryMethod.factory.impl;

import io.yinqin.github.factoryMethod.factory.ExportOperate;
import io.yinqin.github.factoryMethod.service.ExportFileApi;
import io.yinqin.github.factoryMethod.service.impl.ExportTxtFile;

/**
 * TXT文本方式导出工厂
 *
 * @author YinQin
 * @createDate 2023年11月30日
 * @since 1.0.0
 */
public class ExportTxtFileOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}
