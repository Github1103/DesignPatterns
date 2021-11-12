package cn.codeyoung.PubSubPattern.PubSub.pattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description //发布者和订阅者的中转中心，负责管理双方
 * @Data 10:32 2021/11/2
 * @Author zhangjunrong
 */
public class SubPubCentralImpl implements SubPubCentral {
    private static Map<Integer, Set<Integer>> PubSubMap ;  //存放所有的发布者的对应订阅者。

    static{
        PubSubMap = new HashMap<>();
    }

    /**
     * 为发布者和订阅者创建链接，通过对比是否存在这个发布者，如果不存在则添加，存在则不添加
     * @param publisher
     * @param subscriber
     * @return
     */
    @Override
    public boolean subscribe(Publisher publisher, Subscriber subscriber) {

        try{
            Set<Integer>  subscriberSet = PubSubMap.get(publisher.getId()); //拿到当前发布者的所有订阅者
            if(subscriberSet == null)  //为空，之前不存在订阅者
                subscriberSet = new HashSet<>();
            boolean added = subscriberSet.add(subscriber.getId()); //添加订阅者
            if(added)  //添加订阅者成功。
                return PubSubMap.put(publisher.getId(),subscriberSet) != null;
            return false;  //订阅者添加失败或者该订阅之前则订阅了发布者
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 解除发布者的订阅信息，有则订阅成功，没有则订阅失败
     * @param publisher
     * @param subscriber
     * @return
     */
    @Override
    public boolean unsubscribe(Publisher publisher, Subscriber subscriber) {

        try{
            Set<Integer>  subscriberSet = PubSubMap.get(publisher.getId());
            if(subscriberSet == null)
                return false;
            boolean removed = subscriberSet.remove(subscriber.getId());       //删除取消订阅者
            if(removed)
                PubSubMap.put(publisher.getId(),subscriberSet); //更新订阅者列表
            return removed;
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

    /**
     * 发布者发布信息，转发通知所有订阅这个发布者服务的订阅者。
     * @param publisher
     * @param message
     */
    @Override
    public void publish(Publisher publisher, String message) {

        Set<Integer> subscriberSet =  PubSubMap.get(publisher.getId());

        //遍历订阅者发送消息。 此处简单实现： 只需要打印出拿到的所有订阅者即可
        for (Integer subscriber : subscriberSet) {
            System.out.println("向发布者[" + publisher.getId()
                    +"]的订阅者[" + subscriber + "]发送消息: " +  message);
        }
    }
}
