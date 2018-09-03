package online.morn.designPattern.dp5_builderPattern.example;

import java.util.ArrayList;

public abstract class CarModel {
    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    //模型是启动开始跑了
    public abstract void start();
    //能够发动，还要能够停下来，那才是真本事
    public abstract void stop();
    //喇叭会发出声音，是滴滴叫，还是哔哔叫
    public abstract void alarm();
    //引擎会轰隆隆地响，不响那是假的
    public abstract void engineBoom();
    //那模型应该会跑吧，别管是人推的，还是电力驱动的，总之要会跑
    public final void run(){
        //循环一遍谁在前面谁先执行
        for(int i = 0 ; i  < this.sequence.size(); i++){
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();//启动汽车
            } else if(actionName.equalsIgnoreCase("stop")){
                this.stop();//停止汽车
            } else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();//喇叭开始叫了
            } else if(actionName.equalsIgnoreCase("engine boom")){
                this.engineBoom();//引擎开始轰鸣
            }
        }
    }

    public final void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
