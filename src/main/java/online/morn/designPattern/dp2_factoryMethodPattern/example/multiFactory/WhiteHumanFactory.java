package online.morn.designPattern.dp2_factoryMethodPattern.example.multiFactory;

import online.morn.designPattern.dp2_factoryMethodPattern.example.Human;
import online.morn.designPattern.dp2_factoryMethodPattern.example.WhiteHuman;

/**
 * 白色人种创建工厂实现
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    public Human createHuman() {
        return new WhiteHuman();
    }
}
