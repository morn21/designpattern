package online.morn.designPattern.dp4_templateMethodPattern.example;

public class HummerH1Model extends HummerModel {
    public void start() {
        System.out.println("悍马H1发动...");
    }

    public void stop() {
        System.out.println("悍马H1停车...");
    }

    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    public void engineBoom() {
        System.out.println("悍马H1引擎的声音是这样的...");
    }
}
