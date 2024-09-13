package designPatterns.design.model;

public class CreditCard extends Payment {
    private String nameOnCard;
    private String cardNumber;
    private String billingAddress;
    private int transactionCode;

    public PaymentStatus submitPayment() {
        return PaymentStatus.Declined;
    }
}
