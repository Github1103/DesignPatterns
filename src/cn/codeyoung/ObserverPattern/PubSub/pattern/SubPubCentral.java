package cn.codeyoung.ObserverPattern.PubSub.pattern;

/**
 * @Description //TODO
 * @Data 10:31 2021/11/2
 * @Author zhangjunrong
 */
public interface SubPubCentral {

    boolean subscribe(Publisher publisher, Subscriber subscriber);

    boolean unsubscribe(Publisher publisher, Subscriber subscriber);

    void publish(Publisher publisher, String message);

}
