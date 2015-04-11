package com.company.TutorialOnConstructors;

/**
 * Created by Babatunde on 11/04/2015.
 */
public class BankAccount {


    int accountNumber = 0;
    String sortCode = "67-09-98";


    //The constructor
    public BankAccount(){

    }

    public BankAccount(int myAccounNumber, String mySortCode){
       accountNumber = myAccounNumber;
        sortCode = mySortCode;
    }


    public int withDrawCash(){
       return 120;
    }

    public String checkBalance(){
        return "";
    }
}
