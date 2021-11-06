package cn.codeyoung.PubSubPattern.Observer.JUMP;

/**
 * @Description //JUMP书店的观察者模式设计测试
 * @Data 9:56 2021/11/2
 * @Author zhangjunrong
 */
public class JUMPTest {
    public static void main(String[] args) {
        //1.全世界唯一一家JUMP书店开张了
        BookStore bookStore = new BookStore();
        //2.JUMP出版商
        JUMPPublisher jumpPublisher = new JUMPPublisher(bookStore);
        //3.JUMP粉丝
        JUMPFans jumpFans = new JUMPFans(bookStore);
        //4.JUMP粉丝关注JUMP出版商官网，观察JUMP书最新动态
        jumpPublisher.attach(jumpFans);
        //5.第一期JUMP
        JUMP jump1 = new JUMP("龙珠",29.9);
        //6.出版商发布JUMP
        jumpPublisher.publisherNewJUMP(jump1);
        //7.第二期JUMP
        JUMP jump2 = new JUMP("乌龙派出所",30.1);
        //8.出版商发布新JUMP
        jumpPublisher.publisherNewJUMP(jump2);
        //9.粉丝展示自己的收藏
        jumpFans.showList();
    }
}
