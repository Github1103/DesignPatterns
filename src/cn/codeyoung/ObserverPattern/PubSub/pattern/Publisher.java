package cn.codeyoung.ObserverPattern.PubSub.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description //发布者
 * @Data 10:28 2021/11/2
 * @Author zhangjunrong
 */
@Data
@AllArgsConstructor
public class Publisher {
    private Integer id;  //唯一。每个发布者的id都不相同
}
