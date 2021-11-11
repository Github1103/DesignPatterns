package cn.codeyoung.SingletonPattern.Emperor;

/**
 * @Data 15:45 2021/11/11
 * @Author ZhangJR
 * @Description 创建一个皇帝单例，皇帝只能有唯一的一个
 */
public class Emperor {

    private static final Emperor EMPEROR = new Emperor();

    private Emperor(){
    }

    public static Emperor getInstance(){
        return EMPEROR;
    }

    public static String say(){
        return "恕瑞玛你们的皇帝回来了！";
    }
}
