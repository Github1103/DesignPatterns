package cn.codeyoung.PubSubPattern.PubSub.pattern;

/**
 * @Description //控制层，控制发布者
 * @Data 10:36 2021/11/2
 * @Author zhangjunrong
 */
public class PublisherController {
    private SubPubCentral subPubCentral;  //订阅发布中心。

    public PublisherController(SubPubCentral subPubCentral) {
        this.subPubCentral = subPubCentral;
    }

    /**
     * @=-= 发布数据，假设前端传递的是一个id对象和一个内容对象。简单化，实际上会传递一个包装数据过来.
     * @param publisherId
     * @param message
     */
    public void publish(Integer publisherId,String message){
        subPubCentral.publish(new Publisher(publisherId),message);
    }
}
