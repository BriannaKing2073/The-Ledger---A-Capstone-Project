package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class FileManager {

    private String fileName;


    //Constructor
    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    //Getter and Setter
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<Transaction> getTransactionsFromFile(){
        ArrayList<Transaction> result = new ArrayList<Transaction>();

        try{

            FileReader fileReader = new FileReader(fileName);

            //read through every line in the file, and for each line create a transaction, and then
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String thisLine;

            while ((thisLine = bufferedReader.readLine()) != null) {

               // System.out.println(thisLine);

                Transaction createdTransaction = getTransactionFromEncodedString(thisLine);// = ?

                 result.add(createdTransaction);
            }

            bufferedReader.close();


        } catch (IOException e) {
            System.out.println("There was an error reading from the file.");
        }

        return result;
    }

    private static Transaction getTransactionFromEncodedString(String encodedTransaction) {

        String[] temp = encodedTransaction.split(Pattern.quote("|"));
        System.out.println(encodedTransaction);
        String date = temp[0].trim();
        String time = temp[1].trim();
        String description = temp[2].trim();
        String vendor = temp[3].trim();
        double amount = Double.parseDouble(temp[4].trim());

        Transaction result = new Transaction(date, time, description, vendor, amount);
        return result;
    }

}




