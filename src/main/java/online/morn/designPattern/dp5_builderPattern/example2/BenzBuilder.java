package online.morn.designPattern.dp5_builderPattern.example2;

import online.morn.designPattern.dp5_builderPattern.example.BenzModel;
import online.morn.designPattern.dp5_builderPattern.example.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.benz;
    }
}
