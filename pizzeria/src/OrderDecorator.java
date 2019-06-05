public class OrderDecorator extends Product{
    public static void addProduct(Order order, Product product) {
        order.addProduct(product);
    }
}
