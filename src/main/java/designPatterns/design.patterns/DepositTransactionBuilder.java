package designPatterns.design.patterns;

import designPatterns.design.model.Account;

public class DepositTransactionBuilder implements Transaction {
    private Account account;
    public DepositTransactionBuilder(Account account) {
        this.account = account;
    }
    public void commitTransaction(double amount) {}
    public double getBalanceAmount() {
        return account.getBalanceAmount();
    }

}
