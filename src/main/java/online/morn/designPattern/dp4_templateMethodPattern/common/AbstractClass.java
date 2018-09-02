package online.morn.designPattern.dp4_templateMethodPattern.common;

public abstract class AbstractClass {
    //基本方法
    public abstract void doSomething();
    //基本方法
    public abstract void doAnything();
    //模板方法
    public void templateMethod(){
        //调用基本方法，完成相关的逻辑
        this.doAnything();
        this.doSomething();
    }
}
