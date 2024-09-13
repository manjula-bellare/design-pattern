package designPatterns.design.patterns;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String orderStatus) {
        // to send email, sms notifications
    }

}



