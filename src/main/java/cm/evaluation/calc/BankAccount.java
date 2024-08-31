/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.evaluation.calc;

/**
 *
 * @author Bryan
 */
abstract class BankAccount {
// Creating Attributes of the parent class

    protected String AccountNumber;
    protected float Balance;
    protected String AccountHolderName;
// Creating the methods of the parent class

    abstract public double deposit(double depositAmount);

    abstract public double withdraw(double withdrawalAmount);

    abstract public double calculateInterest();
}

class SavingsAccount extends BankAccount {

//Inintializing the additional attribute of the subclass
    private double InterestRate;

    SavingsAccount(String AccountNumber, float Balance, String AccountHolderName, double InterestRate) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        this.AccountHolderName = AccountHolderName;
        this.InterestRate = InterestRate;
    }

    public float getBalance() {
        return Balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public double getInterestRate() {
        return InterestRate;
    }
    // Interest method
    @Override
    public double calculateInterest() {
        double interest = Balance * InterestRate;
        return interest;
    }
    // Deposit method
    @Override
    public double deposit(double depositAmount) {
        Balance += depositAmount;
        return Balance;
    }
    //Withdraw method
    @Override
    public double withdraw(double withdrawalAmount) {
        Balance -= withdrawalAmount;
        return Balance;
    }
}

class CurrentAccount extends BankAccount {

    private double OverdraftLimit;

    CurrentAccount(String AccountNumber, float Balance, String AccountHolderName, double OverdraftLimit) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        this.AccountHolderName = AccountHolderName;
        this.OverdraftLimit = OverdraftLimit;
    }

    public float getBalance() {
        return Balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public double getOverdraftLimit() {
        return OverdraftLimit;
    }

    @Override
    public double calculateInterest() {
        double interest = Balance * 10;
        return interest;
    }

    @Override
    public double deposit(double depositAmount) {
        Balance += depositAmount;
        return Balance;
    }

    @Override
    public double withdraw(double withdrawalAmount) {
        Balance -= withdrawalAmount;
        return Balance;
    }
}
