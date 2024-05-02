package client;

import bank.Memento;
import java.util.LinkedList;

/**
 * @author richardwalker
 * @version 28/03/2013
 */
public class Caretaker {

    public LinkedList<Memento> history = new LinkedList();

    /**
     * Adds a memento to the history.
     * 
     * @param   memento The memento to be added. 
     */
    public void add(Memento memento) {
        history.add(memento);
    }

    /**
     * Remove and return the most recent add memento.
     *
     * @return The most recently added memento.
     */
    public Memento last() {
        return history.removeLast();
    }

}
