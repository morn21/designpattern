package online.morn.designPattern.dp2_factoryMethodPattern.example.multiFactory;

import online.morn.designPattern.dp2_factoryMethodPattern.example.Human;

/**
 * 女娲类（多工厂模式）
 */
public class NvWa {
    public static void main(String[] args){
        //第一次造人，火候不足，于是白人产生了
        System.out.println("--造出第一批人是白色人种--");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        //第二次造人，火候过足，于是黑人产生了
        System.out.println("--造出第二批人是黑色人种--");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();
        //第三次造人，火候刚刚好，于是黄色人种产生了
        System.out.println("--造出第三批人是黄色人种--");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
