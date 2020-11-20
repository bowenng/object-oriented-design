package structural_patterns.adapter;

import java.util.List;

public class StackSort {
    /*
        Returns a sorted Stack<E> in ascending order
        Uses 2 stacks to simulate selection sort
        i.e. the first element polled will be the smallest
     */
    public static <E extends Comparable<E>> Stack<E> sort(List<E> list) {
        Stack<E> remainder = new StackAdapter<>();
        Stack<E> bufferAndResult = new StackAdapter<>();

        for (E element:
             list) {
            remainder.push(element);
        }

        int sortedCount = 0;
        while (!remainder.isEmpty()) {
            E max = null;

            while (!remainder.isEmpty()) {
                E element = remainder.pull();
                if (max == null) {
                    max = element;
                } else {
                    max = element.compareTo(max) >= 0 ? element : max;
                }
                bufferAndResult.push(element);
            }

            for (int i = 0; i < list.size() - sortedCount; i++) {
                E element = bufferAndResult.pull();
                if (element != max) {
                    remainder.push(element);
                }
            }

            bufferAndResult.push(max);
            sortedCount++;
        }

        return bufferAndResult;
    }

    public static void main(String[] args) {
        List<Integer> inputs = List.of(5, 1, 3, 2, 4);
        Stack<Integer> sorted = StackSort.sort(inputs);
        while (!sorted.isEmpty()) {
            System.out.println(sorted.pull());
        }
    }
}
