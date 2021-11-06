package cn.codeyoung.PubSubPattern.PubSub.Whether;

import PubSubPattern.PubSub.Whether.entity.Station;
import PubSubPattern.PubSub.Whether.entity.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description //TODO
 * @Data 11:44 2021/11/2
 * @Author zhangjunrong
 */
public class WhetherCentralImpl implements WhetherCentral {
    private static Map<Station, Set<User>> PubSubMap;  //存放所有的发布者的对应订阅者。

    static{
        PubSubMap = new HashMap<>();
    }


    @Override
    public boolean subscribe(Station station, User user) {
        try {
            //1.拿到当前气象站所有订阅者名单
            Set<User> userSet = PubSubMap.get(station);
            if (userSet == null){
                //订阅者为空，则该气象站还没有订阅者，则创建一个订阅者
                userSet = new HashSet<>();
            }
            //2.添加添加用户订阅当前气象站
            boolean add = userSet.add(user);
            //3.判断是否添加成功
            if (add){
                return PubSubMap.put(station, userSet) != null;
            }else {
                System.out.println("添加失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return false;
        }
    }

    @Override
    public boolean unsubscribe(Station station, User user) {
        try {
            //1.取出订阅者集合
            Set<User> userSet = PubSubMap.get(station);
            //2.判断订阅者是否为空
            if (userSet != null){
                boolean remove = userSet.remove(user);
                if (remove) {
                    return PubSubMap.put(station,userSet) != null;
                }else {
                    System.out.println("没有该订阅者");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return false;
        }
    }

    @Override
    public void publish(Station station, String whetherMsg) {
        //1.获取订阅者
        Set<User> userSet = PubSubMap.get(station);
        for (User user : userSet) {
            System.out.println("向发布者[" + station.getPlace()
                    +"]的订阅者[" + user.getName() + "]发送消息: " + "现在的天气是:" + whetherMsg);
        }
    }
}
