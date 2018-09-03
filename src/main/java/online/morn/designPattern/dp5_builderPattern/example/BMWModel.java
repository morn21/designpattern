package online.morn.designPattern.dp5_builderPattern.example;

public class BMWModel extends CarModel {
    public void start() {
        System.out.println("宝马车跑起来是这个样子的...");
    }

    public void stop() {
        System.out.println("宝马车应该这样停车...");
    }

    public void alarm() {
        System.out.println("宝马车的喇叭声音是这个样子的...");
    }

    public void engineBoom() {
        System.out.println("宝马车的引擎是这个声音的...");
    }
}
