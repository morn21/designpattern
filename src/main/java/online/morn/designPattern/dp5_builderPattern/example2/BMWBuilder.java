package online.morn.designPattern.dp5_builderPattern.example2;

import online.morn.designPattern.dp5_builderPattern.example.BMWModel;
import online.morn.designPattern.dp5_builderPattern.example.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.bmw;
    }
}
