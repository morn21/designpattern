package online.morn.designPattern.dp4_templateMethodPattern.example;

public class Client {
    public static void main(String[] args){
        //XX公司要H1模型的悍马
        HummerModel h1 = new HummerH1Model();
        //H1模型演示
        h1.run();
    }
}
