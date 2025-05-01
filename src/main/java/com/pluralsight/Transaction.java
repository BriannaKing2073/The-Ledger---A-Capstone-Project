package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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

    public String getEncodedTransactionString() {
        //todo: return a value that looks like:
        // 2024-09-30|22:05:34|LARP Equipment Upgrade|Medieval Collectibles|-245.00
        //this.date.format()
        String formattedDate = this.date.toString();
        String formattedTime;

        DateTimeFormatter formatterDate;
        DateTimeFormatter formatterTime;

//        formattedDate = String.valueOf(getDate());
//        formatterDate = DateTimeFormatter.ofPattern("yyyy-dd-MM");
//
        formattedTime = String.valueOf(getTime());
        formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//        LocalDate date = LocalDate.parse(formattedDate,formatterDate);
        LocalTime time = LocalTime.parse(formattedTime, formatterTime);


        return String.format("%s|%s|%s|%s|%f", formattedDate, time, this.description, this.vendor, this.amount);

    }

    //Formating Transaction Text
    //
    public String getFormattedTransactionsText() {
        //this.date.format()
        String formattedDate = this.date.toString();
        String formattedTime;

        DateTimeFormatter formatterDate;
        DateTimeFormatter formatterTime;

//        formattedDate = String.valueOf(getDate());
//        formatterDate = DateTimeFormatter.ofPattern("yyyy-dd-MM");
//
        formattedTime = String.valueOf(getTime());
        formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//        LocalDate date = LocalDate.parse(formattedDate,formatterDate);
        LocalTime time = LocalTime.parse(formattedTime, formatterTime);

        return String.format("%-12s |  %-10s | %-40s | %-30s | %-10f", formattedDate, time, this.description, this.vendor, this.amount);
    }
    public static String getFormattedTransactionsTextHeader(){
        return   "DATE        TIME      DESCRIPTION                             VENDOR                          AMOUNT    \n"
                +"___________ _________ _______________________________________ _______________________________ __________";
    }
}
