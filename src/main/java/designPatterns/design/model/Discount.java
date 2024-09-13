package designPatterns.design.model;

import java.util.Date;

public class Discount {
    private int id;
    private String description;
    private double percentage;
    private Date startDate;
    private Date endDate;

    public boolean isApplicable(Date date) {
        return true;
    }

    public double calculateDiscount(double originalAmount) {
        return originalAmount * percentage;
    }
}
