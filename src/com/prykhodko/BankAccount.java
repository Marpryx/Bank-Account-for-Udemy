//////////////////////////////////////////////////////////////////////////
// The Bank Account is a simple program that demonstrates OOP in Java.  //
//                                                                      //
// There are some features:                                             //
// - The customer may check the balance of the bank account;            //
// - The customer may deposit the funds;                                //
// - The customer may withdraw funds;                                   //
//                                                                      //
// The author: MarPryx                                                  //
//////////////////////////////////////////////////////////////////////////

package com.prykhodko;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


//    /**
//     * Constructor to use instead of setters to initialize the fields
//     * @param accountNumber
//     * @param balance
//     * @param customerName
//     * @param email
//     * @param phoneNumber
//     */
//    public BankAccount(int accountNumber, double balance, String customerName,
//                       String email, String phoneNumber){
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//
//    }


    //  Setters for the private fields
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getters for the private fields
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * The method allows the customer to deposit funds
     * @param balance - initial balance of the account
     * @param depositAmount - amount to deposit to the account
     * @return new balance of the account
     */

    public static double depositFunds(double balance, double depositAmount) {

        return balance += depositAmount;
    }

    /**
     * The method allows the customer to withdraw funds
     * @param balance - initial balance of the account
     * @param withdrawAmount - amount to withdraw from the account
     * @return new balance of the account
     */

    public static double withdrawFunds(double balance, double withdrawAmount) {
        if ((balance - withdrawAmount) < 0) {
            System.out.println("Operation denied. Insufficient funds. ");
        } else {
            balance -= withdrawAmount;
        }
        return balance;
    }
}
