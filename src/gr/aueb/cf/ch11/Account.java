package gr.aueb.cf.ch11;

import java.awt.desktop.AboutEvent;

public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public  Account() {

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    //PUBLIC API
    /**
     *
     * deposits a certain amount of money
     * @param ammount
     *          the amount of money to be deposited
     * @throws Exception
     */

    public void deposit(double ammount) throws Exception {
        try {
            if (ammount < 0) {
                throw new Exception("Negative amount excepetion");
            }
            balance += ammount;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Checks is Ssn exists and is valid
     * @param ssn
     * @return
     */
    private boolean isSsnValid(String ssn){
        return this.ssn.equals(ssn);
    }


    /**
     * Withdras an amount of money base on a valid Ssn
     * @param amount
     *          the amount to be withdraw
     * @param ssn
     *          the given Ssn
     * @throws Exception
     *          if the ssn is not valid or the balance is not sufficient
     */

    public void withDraw(double amount,String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)){
                throw new Exception("Ssn not valid exception");
            }
            if (amount > balance){
                throw new Exception("Insufficient balance exception");
            }
            balance -= amount;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public double getAccountBalance() {
        return getBalance();
    }

    public String accountToString() {
        return "(" + id + "," + iban + "," + firstname + "," + lastname + "," + ssn + "," + balance + ")";
    }



}
