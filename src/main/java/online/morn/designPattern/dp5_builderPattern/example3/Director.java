package online.morn.designPattern.dp5_builderPattern.example3;

import online.morn.designPattern.dp5_builderPattern.example.BMWModel;
import online.morn.designPattern.dp5_builderPattern.example.BenzModel;
import online.morn.designPattern.dp5_builderPattern.example2.BMWBuilder;
import online.morn.designPattern.dp5_builderPattern.example2.BenzBuilder;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * A类型奔驰车模型，先start，然后stop，其他什么引擎、喇叭一概没有
     * @return
     */
    public BenzModel getABenzModel(){
        //清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        //ABenzModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    /**
     * B类型奔驰车模型，是先发动引擎，然后启动，然后停车，没有喇叭
     * @return
     */
    public BenzModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    /**
     * C类型宝马模型，是先按下喇叭（炫富嘛），然后启动，然后停止
     * @return
     */
    public BMWModel getCBMWModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel)this.bmwBuilder.getCarModel();
    }

    /**
     * D类型宝马模型，只有一个功能，就是跑，启动起来就跑，永不停止
     * @return
     */
    public BMWModel getDBMWModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel)this.bmwBuilder.getCarModel();
    }

    /*
     * 这里还可以有很多方法，你可以停止，然后再启动，或者一直停着不动，静态的嘛
     * 导演类嘛，按照什么顺序是导演说了算
     */
}
