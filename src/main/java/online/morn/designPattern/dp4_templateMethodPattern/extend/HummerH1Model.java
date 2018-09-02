package online.morn.designPattern.dp4_templateMethodPattern.extend;

public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;
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
    public boolean isAlarm(){
        return this.alarmFlag;
    }
    //要不要响喇叭，是由客户来决定
    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
