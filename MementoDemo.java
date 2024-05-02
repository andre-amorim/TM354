package client;

import bank.BankAccount;

/**
 * @author richardwalker
 * @version 09/01/2024
 */
public class MementoDemo {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        // Open bank account with 100 and carry out some transacions.
        BankAccount acc = new BankAccount(100);
        System.out.println("Opening balance = " + acc.getBalance());
        System.out.println();

        // Save memento
        caretaker.add(acc.saveBalance());
        acc.credit(50);
        System.out.println("Credit 50, balance = " + acc.getBalance());
        System.out.println();
        
        // Save memento
        caretaker.add(acc.saveBalance());
        acc.debit(80);
        System.out.println("Debit 80, balance = " + acc.getBalance());
        System.out.println();
        
        // For testing
        // System.out.println(caretaker.history.size());
        // System.out.println(caretaker.history.get(1).balance);
        
        // Revert last transaction
        acc.restoreBalance(caretaker.last());
        System.out.println("Reverted transaction, balance = " 
                + acc.getBalance());
        System.out.println();
        
        // For testing
        // System.out.println(caretaker.history.size());
        // System.out.println(caretaker.history.get(0).balance);
        
        acc.restoreBalance(caretaker.last());
        System.out.println("Reverted transaction, balance = " 
                + acc.getBalance());
        System.out.println();
        
        // Add your TMA question code here
        
    }

}
