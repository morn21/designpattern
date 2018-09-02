package online.morn.designPattern.dp3_abstractFactoryPattern.common;

/**
 * 抽象工厂
 */
public abstract class AbstractCreator {
    //创建A产品家族
    public abstract AbstractProductA createProductA();
    //创建B产品家族
    public abstract AbstractProductB createProductB();
}
