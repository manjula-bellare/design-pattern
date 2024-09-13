package designPatterns.design.model;

import java.util.Date;

public class Account {
    private String accountNumber;
    private String customerName;
    private double balanceAmount;
    private Date transactionDate;

    public double getBalanceAmount() {
        return this.balanceAmount;
    }
    public void setBalanceAmount(double amount) {
        this.balanceAmount = amount;
    }
}
