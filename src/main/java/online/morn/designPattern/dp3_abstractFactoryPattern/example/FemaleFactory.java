package online.morn.designPattern.dp3_abstractFactoryPattern.example;

public class FemaleFactory implements HumanFactory {
    //生成出黄人女性
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
    //生成出白人女性
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
    //生成出黑人女性
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
