package cn.codeyoung.FactoryMethod.pattern;

/**
 * @Data 19:43 2021/11/12
 * @Author ZhangJR
 * @Description
 */
public class concreteFactory extends Factory{
    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product)Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) product;
    }
}
