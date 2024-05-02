package bank;

/**
 * @author richardwalker
 * @version 28/03/2013
 */
public class BankAccount {

    private int balance; 
    
    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int credit) {
        balance = balance + credit;
    }

    public void debit(int debit) {
        balance = balance - debit;
    }

    /**
     * Return memento of BankAccount's current state.
     */
    public Memento saveBalance() {
        return new Memento(this.balance);
    }

    /**
     * Restore BankAccount's state from memento.
     */
    public void restoreBalance(Memento memento) {
        this.balance = memento.balance;
    }

}
