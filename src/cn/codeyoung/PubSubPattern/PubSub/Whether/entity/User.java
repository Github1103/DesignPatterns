package cn.codeyoung.PubSubPattern.PubSub.Whether.entity;

/**
 * @Description //用户
 * @Data 11:11 2021/11/2
 * @Author zhangjunrong
 */
public class User {
    private Integer id;
    private String Name;

    public User(Integer id, String name) {
        this.id = id;
        Name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
