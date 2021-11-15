package cn.codeyoung.ObserverPattern.Observer.pattern;

public interface Observer {
    /**
     * 更新接口
     * @param state 更新状态
     */
    void update(String state);

}
