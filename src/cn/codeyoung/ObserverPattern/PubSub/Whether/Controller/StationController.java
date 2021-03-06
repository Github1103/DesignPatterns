package cn.codeyoung.ObserverPattern.PubSub.Whether.Controller;

import cn.codeyoung.ObserverPattern.PubSub.Whether.WhetherCentral;
import cn.codeyoung.ObserverPattern.PubSub.Whether.entity.Station;

/**
 * @Description //气象站控制
 * @Data 12:20 2021/11/2
 * @Author zhangjunrong
 */
public class StationController {

    private WhetherCentral whetherCentral;

    public StationController(WhetherCentral whetherCentral) {
        this.whetherCentral = whetherCentral;
    }

    public void publish(Station station, String whetherMsg) {
        whetherCentral.publish(station, whetherMsg);
    }
}
