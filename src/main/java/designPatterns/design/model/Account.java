package designPatterns.design.model;

import java.util.Date;

public class Account {
    private String accountNumber;
    private String customerName;
    private double balanceAmount;

    private Date transactionDate;
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    public double getBalanceAmount() {
        return this.balanceAmount;
    }
    public void setBalanceAmount(double amount) {
        this.balanceAmount = amount;
    }
}
