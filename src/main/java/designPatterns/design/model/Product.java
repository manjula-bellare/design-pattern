package designPatterns.design.model;

public class Product {
    private String Id;
    private String name;
    private String description;
    private double price;
    private ProductCategory category;
    private int itemAvailableCount;
    private CustomerAccount account;

    public Product(String name, String id, double price) {
    }
    public int getItemAvailableCount() {
        return itemAvailableCount;
    }
    public int updateItemAvailableCount() {
        return itemAvailableCount;
    }

}
