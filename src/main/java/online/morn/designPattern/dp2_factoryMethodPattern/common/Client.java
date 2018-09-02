package online.morn.designPattern.dp2_factoryMethodPattern.common;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args){
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        //继续业务处理
    }
}
