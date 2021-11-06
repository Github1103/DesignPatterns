package cn.codeyoung.PubSubPattern.Observer.JUMP;

/**
 * @Description //TODO
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
