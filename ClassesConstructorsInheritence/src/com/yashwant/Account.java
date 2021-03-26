package com.yashwant;

public class Account {



    //overloaded constructor
    public Account(){

        // when no parameters are assigned to the constructor, it automatically calls this empty constructor containing default values.
        this("178390", 100, "Default name", "Default email", "Default Phone Number");
        System.out.println("Empty Constructor called");
    }



    // updates all the code
    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber){

        System.out.println("Calling overloaded Account constructor with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName =customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;


    }

    public Account(String customerName, String email, String phoneNumber) {
        this("98102938", 100.00, customerName, email, phoneNumber);
    }

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }



    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email =email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    public void depositfunds(double deposit){

        this.balance +=deposit;
        System.out.println("Deposit of " + deposit + " successfully processed");
        System.out.println("Current Balance : " + this.balance);

    }

    public void withdrawfunds(double withdraw){

        if(this.balance-withdraw<0){
            System.out.println("Insufficient Funds");
        }
        else{
            this.balance -=withdraw;
            System.out.println("Withdrawal of: " + withdraw + " successfully processed");
            System.out.println("New Balance : " + this.balance);
        }

    }






}
