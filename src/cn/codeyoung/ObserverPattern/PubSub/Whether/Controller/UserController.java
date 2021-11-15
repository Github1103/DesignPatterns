package cn.codeyoung.ObserverPattern.PubSub.Whether.Controller;

import cn.codeyoung.ObserverPattern.PubSub.Whether.WhetherCentral;
import cn.codeyoung.ObserverPattern.PubSub.Whether.entity.Station;
import cn.codeyoung.ObserverPattern.PubSub.Whether.entity.User;

/**
 * @Description //用户控制
 * @Data 12:20 2021/11/2
 * @Author zhangjunrong
 */
public class UserController {
    private WhetherCentral whetherCentral;

    public UserController(WhetherCentral whetherCentral){
        this.whetherCentral = whetherCentral;
    }

    public void subscribe(Station station, User user){
        whetherCentral.subscribe(station,user);
    }

    public void unsubscribe(Station station, User user){
        whetherCentral.unsubscribe(station, user);
    }
}
