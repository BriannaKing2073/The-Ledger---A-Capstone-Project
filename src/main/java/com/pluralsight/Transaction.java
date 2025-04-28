package com.pluralsight;

import java.util.regex.Pattern;

public class Transaction {

    private String date;{
        String[] parts = date.split(Pattern.quote("-"));
        String Year = parts[0];
        String Month = parts[1];
        String Day = parts[2];
    };
    private String time;
    private String description;
    private String vendor;
    private int amount;


    //Constructors
    public Transaction(String date, String time, String description, String vendor, int amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    //Getters and Setters

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
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

    public int getAmount() {

        return amount;
    }

    public void setAmount(int amount) {

        this.amount = amount;
    }
    //Formating Transaction Text
    //
    public String getFormattedTransactionsText(){
        return String.format("%-12s %-10s %-40s %-20s %-10", this.date, this.time, this.description, this.vendor, this.amount);
    }
    public static String getFormattedTransactionsTextHeader(){
        return   "DATE        TIME      DESCRIPTION                             VENDOR              AMOUNT    \n"
                +"___________ _________ _______________________________________ ___________________ ___________";
    }
}
