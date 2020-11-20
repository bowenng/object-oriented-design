package creational_patterns.factory_methods;

import java.util.List;

public abstract class ListBasedStack<E> {
    private List<E> data;

    /*
        Using factory methods not only allows subclasses to decide the concrete class (generic can do the same),
        it also allows the subclasses to customize the creation process.
     */
    protected abstract List<E> instantiateData();

    public ListBasedStack() {
        this.data = instantiateData();
    }

    public void push(E element) {
        data.add(element);
    }

    public E poll() {
        if (data.isEmpty()) {
            return null;
        }
        return data.remove(data.size() - 1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
