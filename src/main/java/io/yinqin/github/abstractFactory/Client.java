package io.yinqin.github.abstractFactory;

import io.yinqin.github.abstractFactory.factory.AbstractFactory;
import io.yinqin.github.abstractFactory.factory.Schema1;

/**
 * 客户
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2024年02月06日
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {
        ComputerEngineer engineer =new ComputerEngineer();
        AbstractFactory schema1 = new Schema1();
        engineer.makeComputer(schema1);
    }
}
