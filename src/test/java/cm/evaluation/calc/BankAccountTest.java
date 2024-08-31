/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.evaluation.calc;

import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author bryan
 */
public class BankAccountTest {

    @Test
    public void testSavingsAccount() {
        // Create a SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount("54321", 2000, "Jane Smith", 0.05);

        // Verify initial state
        Assertions.assertEquals("54321", savingsAccount.getAccountNumber());
        Assertions.assertEquals(2000, savingsAccount.getBalance(), 0.001);
        Assertions.assertEquals("Jane Smith", savingsAccount.getAccountHolderName());
        Assertions.assertEquals(0.05, savingsAccount.getInterestRate(), 0.001);

        // Test deposit method
        savingsAccount.deposit(1000);
        Assertions.assertEquals(3000, savingsAccount.getBalance(), 0.001);

        // Test withdraw method with sufficient balance
        savingsAccount.withdraw(500);
        Assertions.assertEquals(2500, savingsAccount.getBalance(), 0.001);

        // Test calculateInterest method
        double interest = savingsAccount.calculateInterest();
        Assertions.assertEquals(125.0, interest, 0.001);
    }

    @Test
    public void testCurrentAccount() {
        // Create a CurrentAccount instance
        CurrentAccount currentAccount = new CurrentAccount("98765", 5000, "Robert Johnson", -2000);

        // Verify initial state
        Assertions.assertEquals("98765", currentAccount.getAccountNumber());
        Assertions.assertEquals(5000, currentAccount.getBalance(), 0.001);
        Assertions.assertEquals("Robert Johnson", currentAccount.getAccountHolderName());
        Assertions.assertEquals(-2000, currentAccount.getOverdraftLimit(), 0.001);

        // Test deposit method
        currentAccount.deposit(2000);
        Assertions.assertEquals(7000, currentAccount.getBalance(), 0.001);

        // Test withdraw method with insufficient balance
        currentAccount.withdraw(8000);
        Assertions.assertEquals(7000, currentAccount.getBalance(), 0.001);

        // Test calculateInterest method
        double interest = currentAccount.calculateInterest();
        Assertions.assertEquals(0.0, interest, 0.001);
    }
 }