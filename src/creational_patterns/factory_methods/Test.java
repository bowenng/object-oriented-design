package creational_patterns.factory_methods;

public class Test {
    public static void run(ListBasedStack<Integer> stack) {
        stack.push(3);
        stack.push(5);
        System.out.println(stack.poll());
        System.out.println(stack.poll());
    }
}
