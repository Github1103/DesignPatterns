package cn.codeyoung.FactoryMethod.pattern;

/**
 * @Data 19:37 2021/11/12
 * @Author ZhangJR
 * @Description 抽象产品类
 */
public abstract class Product {

    // 产品的公共方法
    public void pubMethod(){
        System.out.println("所有产品都共同拥有的功能");
    }

    // 产品特有的抽象方法
    public abstract void absMethod();
}
