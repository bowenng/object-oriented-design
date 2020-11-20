package creational_patterns.factory_methods;

import java.util.LinkedList;
import java.util.List;

public class LinkedListStack<E> extends ListBasedStack<E> {
    @Override
    protected List<E> instantiateData() {
        return new LinkedList<>();
    }

    public static void main(String[] args) {
        ListBasedStack<Integer> stack = new LinkedListStack<>();
        Test.run(stack);
    }
}
