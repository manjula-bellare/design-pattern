package designPatterns.design.patterns;

public class DiscountStrategy {
    private Discount discount;
    public DiscountStrategy(Discount discount) {
        this.discount = discount;
    }
    public double getDiscountedPrice(double amount) {
        return discount.applyDiscount(amount);
    }

}
