package online.morn.designPattern.dp2_factoryMethodPattern.example.simpleFactory;

import online.morn.designPattern.dp2_factoryMethodPattern.example.BlackHuman;
import online.morn.designPattern.dp2_factoryMethodPattern.example.Human;
import online.morn.designPattern.dp2_factoryMethodPattern.example.WhiteHuman;
import online.morn.designPattern.dp2_factoryMethodPattern.example.YellowHuman;

/**
 * 女娲类（简单工厂模式）
 */
public class NvWa {
    public static void main(String[] args){
        //第一次造人，火候不足，于是白人产生了
        System.out.println("--造出第一批人是白色人种--");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        //第二次造人，火候过足，于是黑人产生了
        System.out.println("--造出第二批人是黑色人种--");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //第三次造人，火候刚刚好，于是黄色人种产生了
        System.out.println("--造出第三批人是黄色人种--");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
