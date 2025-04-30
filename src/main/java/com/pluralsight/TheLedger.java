package com.pluralsight;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;;

public class TheLedger {

    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Transaction> transactions;
    private static final FileManager fileManager = new FileManager("transactions.csv");

    // Creating a file reader

    //static BufferedReader bufferedReader = new BufferedReader(new FileReader("transactions.csv"));

    public static void main(String[] args){

        transactions = fileManager.getTransactionsFromFile();
        HomeScreen();

    }

    //Home Screen (required)
    private static void HomeScreen(){

        String homeScreenPrompt = "Welcome this is the Homepage of The Ledger\n" +
                "Please select an option from the following:\n"+
                " (D) Add Deposit\n"+
                " (P) Make a Payment\n"+
                " (L) Ledger\n"+
                " (X) Exit\n"+
                "(D,P,L,X): ";
        String option;
        do{
            System.out.println(homeScreenPrompt);
            option = scanner.nextLine();
            if(option.equalsIgnoreCase("D")){
                OpenAddDeposit();
            } else if (option.equalsIgnoreCase("P")) {
                OpenMakeAPayment();
            } else if (option.equalsIgnoreCase("L")) {
                OpenLedger();
            } else if (option.equalsIgnoreCase("X")) {
                StartProgramExit();
            }else {
                System.out.println("Sorry do not compute please try again later.");
            }
        } while (!option.equalsIgnoreCase("X"));
    }



    //Ledger (required)
        //should I add a back or exit button?
    private static void OpenLedger(){
     String ledgerScreenPrompt = "Welcome to The Ledger\n" +
             "Below is the list of ALL of your Transaction History.\n" +
             "Enter any of the following to filter your list of transaction: \n" +
             "   (A) ALL   (D) Deposits   (P) Payments   (R) Reports (H) Return To Home ";

     String ledgerOption;
        do{
            System.out.println(ledgerScreenPrompt);
            ledgerOption = scanner.nextLine();
            if(ledgerOption.equalsIgnoreCase("A")){
                showAllTransactions();
            } else if (ledgerOption.equalsIgnoreCase("D")) {
                showDeposits();
            } else if (ledgerOption.equalsIgnoreCase("P")) {
                showPayments();
            } else if (ledgerOption.equalsIgnoreCase("R")) {
                ReportsScreen();
            } else if (ledgerOption.equalsIgnoreCase("H")) {
                returnToHome();
            } else {
                System.out.println("Sorry do not compute please try again later.");
            }
        } while (ledgerOption != "R");

    }

    //Reports (required From Ledger)
    private static void ReportsScreen(){
    String ReportsScreenPrompt = "Welcome to Reports\n" +
            "These are Transaction Reports and they can be filtered by entering:\n" +
            "   (1) Month To Date   (2) Previous Month   (3) Year To Date   (4) Previous Year \n" +
            "   (5) Search By Vendor   (0) Back To Ledger   (H) Return To Home ";
    String reportOption;
        do{
            System.out.println(ReportsScreenPrompt);
            reportOption = scanner.nextLine();
            if(reportOption.equalsIgnoreCase("1")){
                showMonthToDate();
            } else if (reportOption.equalsIgnoreCase("2")) {
                showPreviousMonth();
            } else if (reportOption.equalsIgnoreCase("3")) {
                showYearToDate();
            } else if (reportOption.equalsIgnoreCase("4")) {
                showPreviousYear();
            } else if (reportOption.equalsIgnoreCase("5")) {
                searchByVendor();
            } else if (reportOption.equalsIgnoreCase("0")) {
                backToLedger();
            } else if (reportOption.equalsIgnoreCase("H")) {
                returnToHome();
            } else {
                System.out.println("Sorry do not compute please try again later.");
            }
        } while (reportOption != "H");

    }

    //ArrayList<Here > here transactions = new ArrayList<And here>();

    //Add Deposit (needed From Home)
    private static void OpenAddDeposit(){
//        System.out.println("ADD DEPOSIT\n" +
//                "Enter Date: (Ex. YYYY-MM-DD) ");
//        String addDepositDate = scanner.nextLine();
        LocalDate addDepositDate = LocalDate.now();

//        System.out.println("Enter Time: (Ex. HH:MM:SS) ");
//        String addDepositTime = scanner.nextLine();
        LocalTime addDepositTime = LocalTime.now();

        System.out.println("Enter Deposit Description:\n");
        String addDepositDescription = scanner.nextLine();

        System.out.println("Enter Vendor: ");
        String addDepositVendor = scanner.nextLine();

        System.out.println("Enter Deposit Amount: (Ex. 00.00) ");
        double addDepositAmount = scanner.nextDouble();

        Transaction theNewTransaction = new Transaction(addDepositDate, addDepositTime, addDepositDescription, addDepositVendor, addDepositAmount);
        transactions.add(theNewTransaction);
    }

    //Make A Payment (needed From Home)
    private static void OpenMakeAPayment(){
//        System.out.println("MAKE A PAYMENT\n" +
//                "Enter Date: (Ex. YYYY-MM-DD) ");
//        String makeAPaymentDate = scanner.nextLine();
        LocalDate makeAPaymentDate = LocalDate.now();

//        System.out.println("Enter Time: (Ex. HH:MM:SS) ");
//        String makeAPaymentTime = scanner.nextLine();
        LocalTime makeAPaymentTime = LocalTime.now();

        System.out.println("Enter Payment Description:\n");
        String makeAPaymentDescription = scanner.nextLine();

        System.out.println("Enter Vendor: ");
        String makeAPaymentVendor = scanner.nextLine();

        System.out.println("Enter Payment Amount: (Ex. -00.00) ");
        double makeAPaymentAmount = scanner.nextDouble();

        Transaction theNewTransaction = new Transaction(makeAPaymentDate, makeAPaymentTime, makeAPaymentDescription, makeAPaymentVendor, makeAPaymentAmount);
        transactions.add(theNewTransaction);
    }

    //show All Transactions (needed From Ledger)
    private static void showAllTransactions() {

        for(Transaction t : transactions){
                System.out.println(t.getDate() + " " +t.getTime() + " | " + t.getDescription() + " | " + t.getVendor() + "  $" + t.getAmount());
        }


    }

    //show only a list of Deposits (needed From Ledger)
    private static void showDeposits(){

        for(Transaction t : transactions){
            if(t.getAmount() > 0){
                System.out.println(t.getDate() + " " +t.getTime() + " | " + t.getDescription() + " | " + t.getVendor() + "  $" + t.getAmount());
            }
        }

    }

    //show only a list of Payments (needed From Ledger)
    private static void showPayments() {

        for(Transaction t : transactions){
            if(t.getAmount() < 0){
                System.out.println(t.getDate() + " " +t.getTime() + " | " + t.getDescription() + " | " + t.getVendor() + "  $" + t.getAmount());
            }
        }

    }

    //show Reports from Month To Date (needed From Reports)
    private static void showMonthToDate() {
        //ask for date is it only current month or 4/29/25-3/28/25
//        System.out.println("Enter Today's Date:(Ex.YYYY-MM-DD)");
//        String todaysDateMTD = scanner.nextLine();
        LocalDate todaysDateMTD = LocalDate.now();
        int year = todaysDateMTD.getYear();
        int month = todaysDateMTD.getMonthValue();
        int day = todaysDateMTD.getDayOfMonth();

        for (Transaction t : transactions) {
            if (t.getDate().getMonthValue() == month && t.getDate().getYear() == year) {
                System.out.println(t.getDate() + " " + t.getTime() + " | " + t.getDescription() + " | " + t.getVendor() + "  $" + t.getAmount());
            }
        }
    }

    //show Reports from Previous Month (needed From Reports)
    private static void showPreviousMonth(){
        //ask for date
//        System.out.println("Enter Today's Date:(Ex.YYYY-MM-DD)");
//        String todaysDatePM = scanner.nextLine();
        LocalDate todaysDatePM = LocalDate.now();
        int year = todaysDatePM.getYear();
        int month = todaysDatePM.getMonthValue();
        int day = todaysDatePM.getDayOfMonth();

        for (Transaction t : transactions) {
            if (t.getDate().getMonthValue() == month - 1  && t.getDate().getYear() == year) {
                System.out.println(t.getDate() + " " + t.getTime() + " | " + t.getDescription() + " | " + t.getVendor() + "  $" + t.getAmount());
            }
        }
    }

    //show Reports from Year To Date (needed From Reports)
    private static void showYearToDate(){
        //ask for date
//        System.out.println("Enter Today's Date:(Ex.YYYY-MM-DD)");
//        String todaysDateYTD = scanner.nextLine();
        LocalDate todaysDateYTD = LocalDate.now();
        int year = todaysDateYTD.getYear();
        int month = todaysDateYTD.getMonthValue();
        int day = todaysDateYTD.getDayOfMonth();

        for (Transaction t : transactions) {
            if (t.getDate().getYear() == year) {
                System.out.println(t.getDate() + " " + t.getTime() + " | " + t.getDescription() + " | " + t.getVendor() + "  $" + t.getAmount());
            }
        }
    }

    //show Reports from Previous Year (needed From Reports)
    private static void showPreviousYear(){
        //ask for date
        LocalDate todaysDatePY = LocalDate.now();
        int year = todaysDatePY.getYear();
        int month = todaysDatePY.getMonthValue();
        int day = todaysDatePY.getDayOfMonth();

        for (Transaction t : transactions) {
            if (t.getDate().getYear() == year - 1) {
                System.out.println(t.getDate() + " " + t.getTime() + " | " + t.getDescription() + " | " + t.getVendor() + "  $" + t.getAmount());
            }
        }
    }

    //show Reports from Search by Vendor (needed From Reports)
        //need to generate a list of vendors to chose from then create a list of transactions
    private static void searchByVendor(){

        System.out.println("Enter Vendor Name: ");
        String vendorSearch = scanner.nextLine();
        //if match get transaction list
        for (Transaction t : transactions) {
            if (t.getVendor().equalsIgnoreCase(vendorSearch) ) {
                System.out.println(t.getDate() + " " + t.getTime() + " | " + t.getDescription() + " | " + t.getVendor() + "  $" + t.getAmount());
            }//else if ask to try again
            //if yes starts search over
            //else if
        }


    }

    //go Back to Ledger Screen (needed From Reports) debating on multi use
    private static void backToLedger(){

        OpenLedger();

    }

    //return to Home Screen (needed From Reports)
    private static void returnToHome(){

        HomeScreen();

    }

    //Exit (Meh) debating on multi use
    private static void StartProgramExit(){

        System.out.println("That's All Folks");
        //System.exit(0);

        }


}

