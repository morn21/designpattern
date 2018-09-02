package online.morn.designPattern.dp2_factoryMethodPattern.example.multiFactory;

import online.morn.designPattern.dp2_factoryMethodPattern.example.BlackHuman;
import online.morn.designPattern.dp2_factoryMethodPattern.example.Human;

/**
 * 黑色人种创建工厂实现
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    public Human createHuman() {
        return new BlackHuman();
    }
}
