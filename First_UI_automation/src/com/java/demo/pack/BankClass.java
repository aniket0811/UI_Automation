package com.java.demo.pack;

public class BankClass {

    int debCnt;
    int credCnt;
    String customerName;
    static String bankName = "State Bank of India ";

    void debitAmt(){
        debCnt++;

    }

    void creditAmt(){
        credCnt++;
    }

    void setCustName(String custName){
        customerName = custName;
    }

    void displayTransactHistory(){
        System.out.println(customerName + " total debit count is from "+bankName +"is "+ debCnt);
        System.out.println(customerName + " total credit count is from "+bankName +"is "+ credCnt);

    }

    public static void main(String[] args) {

            BankClass bk = new BankClass();
            bk.creditAmt();
            bk.debitAmt();
            bk.setCustName("Aniket");
            bk.displayTransactHistory();
            BankClass bk1 = new BankClass();
            bk1.creditAmt();
            bk1.debitAmt();
            bk1.setCustName("Ranee");
            bk1.displayTransactHistory();

    }

}
