package online.morn.designPattern.dp5_builderPattern.example;

public class BenzModel extends CarModel {
    public void start() {
        System.out.println("奔驰车跑起来是这个样子的...");
    }

    public void stop() {
        System.out.println("奔驰车应该这样停车...");
    }

    public void alarm() {
        System.out.println("奔驰车的喇叭声音是这个样子的...");
    }

    public void engineBoom() {
        System.out.println("奔驰车的引擎是这个声音的...");
    }
}
