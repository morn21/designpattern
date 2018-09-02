package online.morn.designPattern.dp2_factoryMethodPattern.example.multiFactory;

import online.morn.designPattern.dp2_factoryMethodPattern.example.Human;
import online.morn.designPattern.dp2_factoryMethodPattern.example.YellowHuman;

/**
 * 黄色人种创建工厂实现
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    public Human createHuman() {
        return new YellowHuman();
    }
}
