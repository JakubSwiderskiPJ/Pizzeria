import java.util.Collection;

public class Order {
    private Float price;
    private Integer orderId;
    private Collection<Product> products;

    public Order() {}

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
