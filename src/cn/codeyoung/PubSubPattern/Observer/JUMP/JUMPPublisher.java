package cn.codeyoung.PubSubPattern.Observer.JUMP;

import cn.codeyoung.PubSubPattern.Observer.pattern.Subject;

/**
 * @Description //TODO
 * @Data 9:24 2021/11/2
 * @Author zhangjunrong
 */
public class JUMPPublisher extends Subject {
    private JUMP jump;

    private BookStore bookStore;

    /**
     * 确定分销商
     * @param bookStore
     */
    JUMPPublisher(BookStore bookStore){
        this.bookStore = bookStore;
    }

    void publisherNewJUMP(JUMP newJUMP){
        this.jump = newJUMP;
        System.out.println("Publisher:新JUMP发布了:"+newJUMP.getName());
        bookStore.setJump(newJUMP);
        nodifyObserver(jump.getName());
    }

    JUMP getJUMP(){
        return jump;
    }

}
