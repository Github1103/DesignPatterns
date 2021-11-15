package cn.codeyoung.ObserverPattern.PubSub.Whether;

import cn.codeyoung.ObserverPattern.PubSub.Whether.entity.Station;
import cn.codeyoung.ObserverPattern.PubSub.Whether.entity.User;

/**
 * @Description //天气预报中心
 * @Data 11:09 2021/11/2
 * @Author zhangjunrong
 */
public interface WhetherCentral {

    boolean subscribe(Station station, User user);

    boolean unsubscribe(Station station, User user);

    void publish(Station station, String whetherMsg);

}
