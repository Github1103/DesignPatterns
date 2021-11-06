package cn.codeyoung.PubSubPattern.Observer.JUMP;

/**
 * @Description //TODO
 * @Data 9:25 2021/11/2
 * @Author zhangjunrong
 */
public class JUMP {
    private String name;
    private Double price;

    public JUMP(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
