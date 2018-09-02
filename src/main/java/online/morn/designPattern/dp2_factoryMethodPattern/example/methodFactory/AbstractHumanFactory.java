package online.morn.designPattern.dp2_factoryMethodPattern.example.methodFactory;

import online.morn.designPattern.dp2_factoryMethodPattern.example.Human;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
