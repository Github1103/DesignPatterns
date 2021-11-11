package cn.codeyoung.SingletonPattern.pattern;

/**
 * @Data 15:59 2021/11/11
 * @Author ZhangJR
 * @Description 单例类模板
 */
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return SINGLETON;
    }

    public static void doSomething(){
        //单例类中的方法最好也是静态方法。
    }

}
