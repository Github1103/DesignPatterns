package cn.codeyoung.PubSubPattern.Observer.pattern;

/**
 * @Description //观察者实现
 * @Data 9:11 2021/11/2
 * @Author zhangjunrong
 */
public class ConcreteObserver implements Observer {
    /**
     * 更新观察者状态和主题同步
     * @param state 更新状态
     */

    private String observerState;

    @Override
    public void update(String state) {
        this.observerState = state;
        System.out.println("观察者状态更新为:"+state);
    }
}
