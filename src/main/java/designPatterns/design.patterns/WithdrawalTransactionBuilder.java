package designPatterns.design.patterns;

import designPatterns.design.model.Account;

public class WithdrawalTransactionBuilder implements Transaction {
    private Account account;
    public void commitTransaction(double amount) {

    }
    public double getBalanceAmount() {
        return account.getBalanceAmount();
    }
}
