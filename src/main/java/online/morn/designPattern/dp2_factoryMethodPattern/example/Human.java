package online.morn.designPattern.dp2_factoryMethodPattern.example;

/**
 * 人类总称
 */
public interface Human {
    //每个人种的皮肤都有相应的颜色
    public void getColor();
    //人类会说话
    public void talk();
}
