package cn.codeyoung.FactoryMethod.pattern;

/**
 * @Data 19:39 2021/11/12
 * @Author ZhangJR
 * @Description
 */
public class ConcreteProduct1 extends Product{

    @Override
    public void absMethod() {
        System.out.println("这是产品1特有的功能");
    }

}
