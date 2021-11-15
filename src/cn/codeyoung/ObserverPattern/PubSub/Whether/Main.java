package cn.codeyoung.ObserverPattern.PubSub.Whether;

import cn.codeyoung.ObserverPattern.PubSub.Whether.Controller.StationController;
import cn.codeyoung.ObserverPattern.PubSub.Whether.Controller.UserController;
import cn.codeyoung.ObserverPattern.PubSub.Whether.entity.Station;
import cn.codeyoung.ObserverPattern.PubSub.Whether.entity.User;

/**
 * @Description //主方法
 * @Data 12:25 2021/11/2
 * @Author zhangjunrong
 */
public class Main {
    public static void main(String[] args) {
        //1.创建气象站1
        Station station = new Station(1,"上海");
        //2.创建多个用户
        User user1 = new User(1,"张三");
        User user2 = new User(2,"李四");
        //3.创建控制器
        WhetherCentralImpl wci = new WhetherCentralImpl();
        StationController sc = new StationController(wci);
        UserController uc = new UserController(wci);
        //4.用户关注气象站
        uc.subscribe(station,user1);
        uc.subscribe(station,user2);
        //5.气象站发布最新天气信息
        sc.publish(station,"晴天");
        sc.publish(station,"阴天");
    }
}
