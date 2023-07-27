package com.java.demo.pack;

public class BankDetails {
    String name;
    double totalBalance;
    int debitCount;
    static int totalDebitCount;
    void setDetails(String custName,double initialBalance ){
        name = custName;
        totalBalance=initialBalance;
    }

    void debitAmount(int amount){
        if(amount<=totalBalance) {
            totalBalance = totalBalance - amount;
            debitCount++;
            totalDebitCount++;
        }
    }

    void displayBalance(){
        System.out.println("Total balance for "+name +" account is "+totalBalance);
    }

    void printCount(){
        System.out.println("Debit count is "+debitCount);
    }

    void displayTotalDebitCount(){
        System.out.println("Total debit count for all customer is "+ totalDebitCount);
    }

    public static void main(String[] args) {
        BankDetails bankdetails = new BankDetails();
        bankdetails.setDetails("Aniket",10000);
        bankdetails.debitAmount(1000);
        bankdetails.displayBalance();
        bankdetails.printCount();
        BankDetails bankDetails_1 = new BankDetails();
        bankDetails_1.setDetails("Sushama",20000);
        bankDetails_1.debitAmount(2000);
        bankDetails_1.displayBalance();
        bankDetails_1.printCount();
        bankdetails.displayTotalDebitCount();
    }
}
