package chapter11.sectionfiveto14;
/**Chapter 9.7)**/

import java.util.Date;

public class Account {
    private int id;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account(){
                id = 0;
                balance = 0;
                annualInterestRate = 0;
                dateCreated = new Date();
    }


     Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

}
