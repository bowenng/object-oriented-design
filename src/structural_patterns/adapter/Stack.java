package structural_patterns.adapter;

public interface Stack<E> {
    boolean isEmpty();
    E pull();
    void push(E element);
}
