package cn.codeyoung.PubSubPattern.PubSub.pattern;

/**
 * @Description //发布者
 * @Data 10:28 2021/11/2
 * @Author zhangjunrong
 */

public class Publisher {
    private Integer id;  //唯一。每个发布者的id都不相同

    public Publisher(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
