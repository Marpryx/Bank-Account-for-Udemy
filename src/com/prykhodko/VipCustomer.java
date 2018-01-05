//////////////////////////////////////////////////////////////////////////
// In the VipCustomer class the three constructors were created in order//
// to initialize the three private fields.                              //
//                                                                      //
//                                                                      //
// The author: MarPryx                                                  //
//////////////////////////////////////////////////////////////////////////

package com.prykhodko;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    // Constructors to initialize the fields
    public VipCustomer(){
    this("John Doe ", 5000.0, "default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit){
    this(name, creditLimit, "default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }

    //getters to get value from the fields
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
