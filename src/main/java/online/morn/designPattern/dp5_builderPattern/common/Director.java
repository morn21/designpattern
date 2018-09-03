package online.morn.designPattern.dp5_builderPattern.common;

public class Director {
    private Builder builder = new ConcreteBuilder();
    //构建不同的产品
    public Product getAproduct(){
        builder.setPart();
        /*
         * 设置不同的零件，产生不同的产品
         */
        return builder.buildProduct();
    }
}
