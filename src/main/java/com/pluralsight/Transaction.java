package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {

    private LocalDate date;
//    {
//        String[] parts = date.split(Pattern.quote("-"));
//        String Year = parts[0];
//        String Month = parts[1];
//        String Day = parts[2];
//    };
    private LocalTime time;
    private String description;
    private String vendor;
    private double amount;


    //Constructors
    public Transaction(LocalDate date, LocalTime time, String description, String vendor, double amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    //Getters and Setters

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getVendor() {

        return vendor;
    }

    public void setVendor(String vendor) {

        this.vendor = vendor;
    }

    public double getAmount() {

        return amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }



    //Formating Transaction Text
    //
//    public String getFormattedTransactionsText(){
//        return String.format("%-12l | %-10l | %-40s | %-30s | %-10d", this.date, this.time, this.description, this.vendor, this.amount);
//    }
//    public static String getFormattedTransactionsTextHeader(){
//        return   "DATE        TIME      DESCRIPTION                             VENDOR                          AMOUNT    \n"
//                +"___________ _________ _______________________________________ _______________________________ __________";
//    }
}
