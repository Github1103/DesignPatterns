package cn.codeyoung.PubSubPattern.PubSub.Whether.entity;

/**
 * @Description //气象站
 * @Data 11:15 2021/11/2
 * @Author zhangjunrong
 */
public class Station {
    private Integer id;
    private String place;

    public Station(Integer id, String place) {
        this.id = id;
        this.place = place;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
