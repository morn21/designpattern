package online.morn.designPattern.dp5_builderPattern.example2;

import online.morn.designPattern.dp5_builderPattern.example.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {
    //建造一个模型，你要给我一个顺序要求，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);
    //设置完毕后，就可以直接拿到这个车辆的模型
    public abstract CarModel getCarModel();
}
