package cn.codeyoung.FactoryMethod.pattern;

/**
 * @Data 19:41 2021/11/12
 * @Author ZhangJR
 * @Description
 */
public class ConcreteProduct2 extends Product{
    @Override
    public void absMethod() {
        System.out.println("这是产品2特有的功能");
    }
}
