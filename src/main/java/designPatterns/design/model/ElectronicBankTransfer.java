package designPatterns.design.model;

public class ElectronicBankTransfer extends CreditCard {
    private String bankName;
    private String routingNumber;
    private String accountNumber;
    private String billingAddress;
    public PaymentStatus submitPayment() {
        return PaymentStatus.Completed;
    }
}
