package online.morn.designPattern.dp4_templateMethodPattern.extend;

public class HummerH2Model extends HummerModel {
    public void start() {
        System.out.println("悍马H2发动...");
    }

    public void stop() {
        System.out.println("悍马H2停车...");
    }

    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    public void engineBoom() {
        System.out.println("悍马H2引擎的声音是这样的...");
    }
    //默认没有喇叭
    public boolean isAlarm(){
        return false;
    }
}
