package online.morn.designPattern.dp1_singletonPattern.example;

/**
 * 皇帝类
 */
public class Emperor {
    public static final Emperor emperor = new Emperor();//初始化一个皇帝
    private Emperor(){
        //世俗和道德的约束你，目的就是不希望产生第二个皇帝
    }
    public static Emperor getInstance(){
        return emperor;
    }
    public static void say(){
        System.out.println("我就是皇帝某某某....");
    }
}
