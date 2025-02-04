package gr.aueb.cf.ch19.deq_queue;

import javax.swing.plaf.PanelUI;
import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * FIFO impl with Deque (first in first out)
 */

public class MyQueue<T> {
    private final Deque<T> myQueue = new LinkedList<>();

    public MyQueue() {

    }

    public Deque<T> getMyQueue() {
        return myQueue;
    }

    public void enQueue(T t){
        myQueue.addLast(t);
    }

    public T deQueue() {
        return myQueue.poll();
    }

    public void forEach(Consumer<T> action) {
        myQueue.forEach(action);
    }
}
