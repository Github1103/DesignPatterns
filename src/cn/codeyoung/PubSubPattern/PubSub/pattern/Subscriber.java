package cn.codeyoung.PubSubPattern.PubSub.pattern;

/**
 * @Description //订阅者
 * @Data 10:29 2021/11/2
 * @Author zhangjunrong
 */
public class Subscriber {
    private Integer id;  //唯一。每个订阅者的id都不相同

    public Subscriber(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
