package online.morn.designPattern.dp4_templateMethodPattern.extend;

public abstract class HummerModel {
    /**
     * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正是要能够发动起来，那这个实现要在实现类里面了
     */
    public abstract void start();
    //能够发动，还要能够停下来，那才是真本事
    public abstract void stop();
    //喇叭会发出声音，是滴滴叫，还是哔哔叫
    public abstract void alarm();
    //引擎会轰隆隆地响，不响那是假的
    public abstract void engineBoom();
    //那模型应该会跑吧，别管是人推的，还是电力驱动的，总之要会跑
    public void run(){
        //发动汽车
        this.start();
        //引擎开始轰鸣
        this.engineBoom();
        //要它叫它就叫，不想让它响就不响了
        if(this.isAlarm()){
            this.alarm();
        }
        //到达目的地就停车
        this.stop();
    }
    protected boolean isAlarm(){
        return true;
    }
}
