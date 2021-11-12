package cn.codeyoung.PubSubPattern.Observer.JUMP;

import cn.codeyoung.PubSubPattern.Observer.pattern.Observer;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description //书迷，其实就是观察者，观察出版社出书的情况，一出书，第一时间去买
 * @Data 9:34 2021/11/2
 * @Author zhangjunrong
 */
public class JUMPFans implements Observer {

    /**
     * JUMP书迷的JUMP漫画收藏夹
     */
    private List<JUMP> JUMPlist = new ArrayList<>();

    /**
     * 世界唯一一家书店
     */
    private BookStore bookStore;

    JUMPFans(BookStore bookStore){
        this.bookStore = bookStore;
    }

    @Override
    public void update(String state) {
        System.out.println("JUMPFans:新JUMP发布啦！买！");
        this.buy();
    }

    private void buy() {
        JUMP jump = bookStore.sell();
        System.out.println("JUMPFans:买到最新的JUMP！");
        JUMPlist.add(jump);
    }

    /**
     * 展示一下收藏
     */
    void showList(){
        System.out.println("------- JUMPFans:展示收藏！-------");
        for (JUMP jump : JUMPlist) {
            System.out.println(jump.getName()+","+jump.getPrice());
        }
    }
}
