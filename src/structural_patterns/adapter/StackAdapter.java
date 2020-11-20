package structural_patterns.adapter;

import java.util.ArrayDeque;

public class StackAdapter<E> implements Stack<E> {
    ArrayDeque<E> deque = new ArrayDeque<>();

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public E pull() {
        return deque.poll();
    }

    @Override
    public void push(E element) {
        deque.push(element);
    }
}
