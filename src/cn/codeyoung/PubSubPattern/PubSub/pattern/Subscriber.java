package cn.codeyoung.PubSubPattern.PubSub.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description //订阅者
 * @Data 10:29 2021/11/2
 * @Author zhangjunrong
 */
@Data
@AllArgsConstructor
public class Subscriber {
    private Integer id;  //唯一。每个订阅者的id都不相同
}
