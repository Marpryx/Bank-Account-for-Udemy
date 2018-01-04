package com.prykhodko;

public class Main {

    public static void main(String[] args) {

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

    }
}
