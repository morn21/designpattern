package online.morn.designPattern.dp2_factoryMethodPattern.example.simpleFactory;

import online.morn.designPattern.dp2_factoryMethodPattern.example.Human;

public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> c){
        //定义一个生产出的人种
        Human human = null;
        try {
            //产生一个人种
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T)human;
    }
}
