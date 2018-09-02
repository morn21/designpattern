package online.morn.designPattern.dp1_singletonPattern.example;

/**
 * 臣子类
 */
public class Minister {
    public static void main(String[] args){
        for (int day = 0 ; day < 3 ; day ++){
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
