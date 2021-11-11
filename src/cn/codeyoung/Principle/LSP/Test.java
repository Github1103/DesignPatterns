package cn.codeyoung.Principle.LSP;

import java.util.HashMap;
import java.util.Map;

/**
  *@Data 2021/11/11
  *@Author ZhangJR
  *@Description 测试里氏替换原则，父类的范围要比子类传入参数的范围小。如果子类的传入范围比父类大，那么就会
  */
public class Test {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        Father f = new Father();
        Father s = new Son();
        f.doSomething(map);
        s.doSomething(map);
        /*
        Father:Map doSomething(Map map)
        SonP:HashMap doSomething(HashMap map)
        result:
        Father is doing something!
        Father is doing something!
         */
    }
}
