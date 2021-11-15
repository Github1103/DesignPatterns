package cn.codeyoung.ObserverPattern.Observer.JUMP;

/**
 * @Description //书店只是一个中间商，出版社每次推出新书都会直接送往合作书店，然后出版商通知用户出版了，书迷会第一时间来买书。
 * @Data 9:42 2021/11/2
 * @Author zhangjunrong
 */
public class BookStore  {

    private JUMP jump;

    /**
     * 卖出
     * @return
     */
    public JUMP sell() {
        return jump;
    }

    /**
     * 进货
     * @param jump
     */
    public void setJump(JUMP jump) {
        System.out.println("BookStore:最新一版JUMP到货了！");
        this.jump = jump;
    }
}
