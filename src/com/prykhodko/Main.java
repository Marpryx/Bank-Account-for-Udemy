 //////////////////////////////////////////////////////////////////////////
 // The Main program to test the Bank Account's features.                //
 //                                                                      //
 // The author: MarPryx                                                  //
 //////////////////////////////////////////////////////////////////////////

package com.prykhodko;

public class Main {

    public static void main(String[] args) {

         //new object of BankAccount initialized by using the constructor
        //BankAccount customerFirst = new BankAccount(123, 0.00, "Bob Ivankin", "bobovich@gmail.com", "43788907483");

        //new object of BankAccount
        BankAccount customerFirst = new BankAccount();

        //set all fields of the object
        customerFirst.setAccountNumber(1);
        //customerFirst.setBalance(345);
        customerFirst.setCustomerName("Nick");
        customerFirst.setEmail("nick@gmail.com");
        customerFirst.setPhoneNumber("4389987493");

        //to test the fields of the BankAccount
        System.out.println("Account number " + customerFirst.getAccountNumber());
        System.out.println("Balance " + customerFirst.getBalance());
        System.out.println("Customer name " + customerFirst.getCustomerName());
        System.out.println("Email" + customerFirst.getEmail());
        System.out.println("Phone number " + customerFirst.getPhoneNumber());

        //to test the DepositFunds method
        System.out.println(" ");
        System.out.println("Deposit");
        double newBalanceDeposit = customerFirst.depositFunds(customerFirst.getBalance(), 50.0);
        customerFirst.setBalance(newBalanceDeposit);
        System.out.println("Account number " + customerFirst.getAccountNumber());
        System.out.println("Balance " + customerFirst.getBalance());
        System.out.println("Customer name " + customerFirst.getCustomerName());
        System.out.println("Email" + customerFirst.getEmail());
        System.out.println("Phone number " + customerFirst.getPhoneNumber());

        //to test the withdrawFunds method
        System.out.println(" ");
        System.out.println("Withdraw");
        double newBalanceWithdraw = customerFirst.withdrawFunds(customerFirst.getBalance(), 100.0);
        customerFirst.setBalance(newBalanceWithdraw);
        System.out.println("Account number " + customerFirst.getAccountNumber());
        System.out.println("Balance " + customerFirst.getBalance());
        System.out.println("Customer name " + customerFirst.getCustomerName());
        System.out.println("Email" + customerFirst.getEmail());
        System.out.println("Phone number " + customerFirst.getPhoneNumber());
        System.out.println(" ");


       //to test the work of the VipCustomer class
        System.out.println("Vip Customers");
        VipCustomer customerOne = new VipCustomer();
        System.out.println("The customerOne name is: " + customerOne.getName());

        VipCustomer customerTwo = new VipCustomer("Lee", 333.0);
        System.out.println("The customerTwo name is: " + customerTwo.getName());
        System.out.println("The customerTwo credit limit is: " + customerTwo.getCreditLimit());

        VipCustomer customerThree = new VipCustomer("Mila", 12000.0, "mila@gmail.com");
        System.out.println("The customerThree name is: " + customerThree.getName());
        System.out.println("The customerThree credit limit is: " + customerThree.getCreditLimit());
        System.out.println("The customerThree email is: " + customerThree.getEmailAddress());



    }
}
