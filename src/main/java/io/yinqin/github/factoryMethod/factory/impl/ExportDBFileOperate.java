package io.yinqin.github.factoryMethod.factory.impl;

import io.yinqin.github.factoryMethod.factory.ExportOperate;
import io.yinqin.github.factoryMethod.service.ExportFileApi;
import io.yinqin.github.factoryMethod.service.impl.ExportDBFile;
import io.yinqin.github.factoryMethod.service.impl.ExportTxtFile;

/**
 * DB文件方式导出工厂
 *
 * @author YinQin
 * @createDate 2023年11月30日
 * @since 1.0.00
 */
public class ExportDBFileOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDBFile();
    }
}
