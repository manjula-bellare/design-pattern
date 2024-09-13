package designPatterns.design.patterns;

public interface Transaction {
    public double getBalanceAmount();
    public void commitTransaction(double amount);
}
