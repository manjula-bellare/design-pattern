package designPatterns.design.model;

import java.util.Date;

public abstract class Payment {
    private double amount;
    private Date timestamp;
    private PaymentStatus status;
    private Discount discount;
    public abstract PaymentStatus submitPayment();

}
