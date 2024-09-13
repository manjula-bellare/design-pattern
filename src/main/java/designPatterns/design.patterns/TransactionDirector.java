package designPatterns.design.patterns;

public class TransactionDirector {
    Transaction transaction;
    public TransactionDirector(Transaction transaction) {
        this.transaction = transaction;
    }

    public void commitTransaction(boolean isDeposit, double amount) {
        if(isDeposit) {
            transaction.commitTransaction(amount);
        }

    }
}
