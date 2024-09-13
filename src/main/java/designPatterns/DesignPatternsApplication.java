package designPatterns;

import designPatterns.design.model.Account;
import designPatterns.design.model.OrderStatus;
import designPatterns.design.patterns.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);
        // Builder pattern
        DepositTransactionBuilder depositTransactionBuilder = new DepositTransactionBuilder(new Account());
        TransactionDirector director = new TransactionDirector(depositTransactionBuilder);
        director.commitTransaction(true, 100.00);
        depositTransactionBuilder.getBalanceAmount();

        // Abstract Factory pattern
        ProductOrderFactory productOrderFactory = new ProductOrderFactory();
        productOrderFactory.createProduct("outdoor camera", "XXC-345-2345", 99.99);
        productOrderFactory.createOrder();
        productOrderFactory.generateBill();

        // Strategy pattern
        Discount discount = new ConcreteDiscount();
        DiscountStrategy discountStrategy = new DiscountStrategy(discount);
        discountStrategy.getDiscountedPrice(55.00);

        // Observer pattern
        CustomerOrder order = new CustomerOrder();
        order.addObserver(new Customer("FirstCustomer"));
        order.addObserver(new Customer("SecondCustomer"));

        order.setOrderStatus(OrderStatus.Pending.name());
        order.setOrderStatus(OrderStatus.Shipped.name());

    }
}
