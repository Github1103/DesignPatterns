package cn.codeyoung.PubSubPattern.PubSub.pattern;

/**
 * @Description //TODO
 * @Data 10:34 2021/11/2
 * @Author zhangjunrong
 */
public class SubscriberController {

    private SubPubCentral subPubCentral;

    public SubscriberController(SubPubCentral subPubCentral) {
        this.subPubCentral = subPubCentral;
    }

    public void subscribe(Integer subscriberId,Integer publisherId){
        subPubCentral.subscribe(new Publisher(publisherId),new Subscriber(subscriberId));
    }

    public void unsubscribe(Integer subscriberId,Integer publisherId){
        subPubCentral.unsubscribe(new Publisher(publisherId),new Subscriber(subscriberId));
    }

}
