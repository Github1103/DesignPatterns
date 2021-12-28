package cn.codeyoung.FactoryMethod.pattern;

/**
 * @Data 19:41 2021/11/12
 * @Author ZhangJR
 * @Description 抽象工厂类方法
 */
public abstract class AbstractFactory {

    // 抽象的产品生产方法
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
