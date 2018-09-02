package online.morn.designPattern.dp3_abstractFactoryPattern.common;

public class Creator1 extends AbstractCreator {
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
