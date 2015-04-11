package com.company.TutorialOnConstructors;

/**
 * Created by Babatunde on 11/04/2015.
 */
public class TestBankAccount {

    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount();
//
//       System.out.println(myAccount.accountNumber);
//       System.out.println(myAccount.sortCode);
//       System.out.println(myAccount.withDrawCash());

        BankAccount myOtherAccount = new BankAccount(34567890, "45-56-54");

               System.out.println(myOtherAccount.accountNumber);
       System.out.println(myOtherAccount.sortCode);


    }
}
