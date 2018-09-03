package online.morn.designPattern.dp5_builderPattern.common;

public class Client {
    public static void main(String[] args){
        Director director = new Director();
        //批量构建
        for(int i  = 0; i < 100; i++){
            director.getAproduct();
        }
    }
}
