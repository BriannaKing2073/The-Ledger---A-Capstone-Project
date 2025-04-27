package com.pluralsight;

import java.util.Scanner;

public class TheLedger {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

    HomeScreen();

    }

    //Home Screen (required)
    private static void HomeScreen(){

    String homeScreenPrompt = "Please select an option from the following:\n"+
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
    } while (option != "X");


    }

    //Ledger (required)
        //should I add a back or exit button?
    private static void OpenLedger(){
     String ledgerScreenPrompt = "Welcome to The Ledger\n" +
             "Below is the list of ALL of your Transaction History.\n" +
             "Enter any of the following to filter your list of transaction: \n" +
             "   (A) ALL   (D) Deposits   (P) Payments   (R) Reports";
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
            }else {
                System.out.println("Sorry do not compute please try again later.");
            }
        } while (ledgerOption != "");

    }

    //Reports (required From Ledger)
    private static void ReportsScreen(){
    String ReportsScreenPrompt = "Reports\n" +
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
        } while (reportOption != "");

    }

    //Add Deposit (Extra From Home)
    private static void OpenAddDeposit(){

    }

    //Make A Payment (Extra From Home)
    private static void OpenMakeAPayment(){

    }

    //show All Transactions (needed From Ledger)
    private static void showAllTransactions(){

    }

    //show only a list of Deposits (Extra From Ledger)
    private static void showDeposits(){

    }

    //show only a list of Payments (Extra From Ledger)
    private static void showPayments(){

    }

    //show Reports from Month To Date (needed? From Reports)
    private static void showMonthToDate(){

    }

    //show Reports from Previous Month (needed? From Reports)
    private static void showPreviousMonth(){

    }

    //show Reports from Year To Date (needed? From Reports)
    private static void showYearToDate(){

    }

    //show Reports from Previous Year (needed? From Reports)
    private static void showPreviousYear(){

    }

    //show Reports from Search by Vendor (needed? From Reports)
        //need to generate a list of vendors to chose from then create a list of transactions
    private static void searchByVendor(){

    }

    //go Back to Ledger Screen (needed From Reports) debating on multi use
    private static void backToLedger(){

    }

    //return to Home Screen (needed From Reports)
    private static void returnToHome(){

    }

    //Exit (Meh) debating on multi use
    private static void StartProgramExit(){

    }
}
