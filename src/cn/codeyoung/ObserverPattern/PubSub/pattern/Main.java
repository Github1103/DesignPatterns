package cn.codeyoung.ObserverPattern.PubSub.pattern;

/**
 * @Description //测试
 * @Data 10:38 2021/11/2
 * @Author zhangjunrong
 */
public class Main {
    public static void main(String[] args) {
        //1.创建发布者，订阅者调度中心
        SubPubCentral subPubCentral =  new SubPubCentralImpl();
        //2.创建发布者，订阅者
        PublisherController publisherController = new PublisherController(subPubCentral);
        SubscriberController subscriberController = new SubscriberController(subPubCentral);
        //3.调度中心，注册发布者和对应的订阅者
        subscriberController.subscribe(1,1);
        subscriberController.subscribe(2,1);
        //4.发布者发布消息
        publisherController.publish(1,"JUMP漫画发售啦！");
        System.out.println("------------------------------------------");
        //5.移除订阅者测试
        subscriberController.unsubscribe(1,1);
        publisherController.publish(1,"JUMP第二期发布啦");
    }
}
