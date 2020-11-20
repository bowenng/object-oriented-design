package creational_patterns.factory_methods;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<E> extends ListBasedStack<E> {
    @Override
    protected List<E> instantiateData() {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ListBasedStack<Integer> stack = new ArrayListStack<>();
        Test.run(stack);
    }
}
