package designPatterns.design.patterns;

import designPatterns.design.model.Order;
import designPatterns.design.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderFactory implements ProductOrder {
    private List<Product> products = new ArrayList<>();
    public Order createOrder() {
        return new Order("34-O-567", products);
    }
    public void createProduct(String name, String id, double price) {
        products.add(new Product(name, id, price));
    }
    public void generateBill() {}


}
