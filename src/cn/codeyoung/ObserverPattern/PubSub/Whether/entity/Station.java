package cn.codeyoung.ObserverPattern.PubSub.Whether.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description //气象站
 * @Data 11:15 2021/11/2
 * @Author zhangjunrong
 */
@Data
@AllArgsConstructor
public class Station {
    private Integer id;
    private String place;
}
