package designPatterns.design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String id;
    private Date orderDate;
    private List<Product> products;

    public Order(String id, List<Product> products) {
        this.id = id;
        this.products = new ArrayList<>();
    }
}
