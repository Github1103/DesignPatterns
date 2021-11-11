package cn.codeyoung.Principle.LSP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
  *@Data 2021/11/11
  *@Author ZhangJR
  *@Description
  */
public class Son extends Father{
    public HashMap doSomething(HashMap map){
        System.out.println("Son is doing something!");
        return map;
    }
}
