package cn.codeyoung.PubSubPattern.Observer.pattern;

/**
 * @Description //主题实现，更具有抽象化的实现，可以具体一点，比如杂志
 * @Data 9:07 2021/11/2
 * @Author zhangjunrong
 */
public class ConcreteSubject extends Subject {
    private String state;

    ConcreteSubject(String state){
        this.state = state;
        System.out.println("这次的主题是:"+state);
    }

    String getState(){
        return state;
    }

    void changeState(String newState){
        this.state = newState;
        System.out.println("主题发生变更，变更为:"+ state);
        this.nodifyObserver(newState);
    }

}
