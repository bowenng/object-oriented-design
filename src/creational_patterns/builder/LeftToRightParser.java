package creational_patterns.builder;

import java.util.List;

public class LeftToRightParser implements TextStreamParser {
    private Builder builder;

    public LeftToRightParser(Builder builder) {
        this.builder = builder;
    }

    public void parse(List<String> stream) {
        for (String s:
             stream) {
            if (isNumeric(s)) {
                Double number = Double.parseDouble(s);
                builder.processNumber(number);
            } else {
                builder.processWord(s);
            }
        }
    }

    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
