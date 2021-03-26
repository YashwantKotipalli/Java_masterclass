package com.yashwant;

public class Main {

    public static void main(String[] args){


        // while creating classes and initializing them, make sure it is not NULL
//        Car merc = new Car(); // constructor
//        Car jeep = new Car();
//
//
//        merc.setModel("GLC");
//        jeep.setModel("Wrangler");
//        System.out.println("Model is " + merc.getModel());

        Account bobsAccount = new Account();//("1234554", 0.00, "Bob Brown", "emial@bob.com", "8210931083");

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getEmail());
        System.out.println(bobsAccount.getPhoneNumber());
        bobsAccount.depositfunds(5000.00);
        bobsAccount.withdrawfunds(200.00);



    }
}
