package online.morn.designPattern.dp3_abstractFactoryPattern.example;

public class MaleFactory implements HumanFactory {
    //生成出黄人男性
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
    //生成出白人男性
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
    //生成出黑人男性
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
