package cn.codeyoung.Principle.LSP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
  *@Data 2021/11/11
  *@Author ZhangJR
  *@Description 测试里氏替换原则中父类方法的输出参数要比子类方法的传入参数小
  */
public class Father {
    public Map doSomething(Map map){
        System.out.println("Father is doing something!");
        return map;
    }
}
