package bank;

/**
 * Memento records a snapshot of the BankAccount's state without breaking the
 * latter's encapsulation
 *
 * @author richardwalker
 * @version 28/03/2013
 */
public final class Memento {

    final int balance;

    Memento(int balance) {
        this.balance = balance;
    }
    
}
