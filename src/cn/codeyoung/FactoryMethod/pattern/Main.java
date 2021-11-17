package cn.codeyoung.FactoryMethod.pattern;

/**
 * @Data 16:06 2021/11/17
 * @Author ZhangJR
 * @Description 工厂方法创建产品
 */
public class Main {
    public static void main(String[] args) {
        concreteFactory concreteFactory = new concreteFactory();
        System.out.println("生产第一个商品");
        Product product = concreteFactory.createProduct(ConcreteProduct1.class);
        product.pubMethod();
        product.absMethod();
        System.out.println("创建第二个商品");
        ConcreteProduct2 product1 = concreteFactory.createProduct(ConcreteProduct2.class);
        product1.pubMethod();
        product1.absMethod();
    }
}
