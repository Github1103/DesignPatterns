package cn.codeyoung.ObserverPattern.Observer.pattern;

/**
 * @Description //观察者模式测试类
 * @Data 9:15 2021/11/2
 * @Author zhangjunrong
 */
public class Test {

    public static void main(String[] args) {
        ConcreteObserver concreteObserver1 = new ConcreteObserver();
        ConcreteObserver concreteObserver2 = new ConcreteObserver();
        ConcreteSubject concreteSubject = new ConcreteSubject("星空");
        //注册观察者
        concreteSubject.attach(concreteObserver1);
        concreteSubject.attach(concreteObserver2);
        //主题发生变化
        concreteSubject.changeState("世界");
    }
}
