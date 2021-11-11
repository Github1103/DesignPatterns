package cn.codeyoung.SingletonPattern.Emperor;

/**
 * @Data 15:48 2021/11/11
 * @Author ZhangJR
 * @Description
 */
public class Minister {
    public static void main(String[] args) {
        for(int day = 0;day<3;day++){
            Emperor emperor = Emperor.getInstance();
            System.out.println(emperor.say());
        }
    }
}
