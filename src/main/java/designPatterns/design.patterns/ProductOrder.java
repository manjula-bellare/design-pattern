package designPatterns.design.patterns;

import designPatterns.design.model.Order;

public interface ProductOrder {
    public Order createOrder();
    public void createProduct(String name, String id, double price);
    public void generateBill();
}
