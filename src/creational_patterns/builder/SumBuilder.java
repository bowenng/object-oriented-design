package creational_patterns.builder;

import java.util.List;

public class SumBuilder extends Builder {
    private double sum = 0;

    @Override
    public void processNumber(Double number) {
        sum += number;
    }

    public Double getSum() {
        return sum;
    }

    public static void main(String[] args) {
        SumBuilder builder = new SumBuilder();
        TextStreamParser parser = new LeftToRightParser(builder);
        parser.parse(List.of("123", "I", "456", "Love", "789", "You"));
        System.out.println(builder.getSum());
    }
}
