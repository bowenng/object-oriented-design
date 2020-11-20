package creational_patterns.builder;

import java.util.List;

public class WordOnlyBuilder extends Builder {
    private StringBuilder sb = new StringBuilder();
    @Override
    public void processWord(String word) {
        sb.append(word);
    }

    public String getSentence() {
        return sb.toString();
    }

    public static void main(String[] args) {
        WordOnlyBuilder builder = new WordOnlyBuilder();
        TextStreamParser parser = new LeftToRightParser(builder);
        parser.parse(List.of("123", "I", "456", "Love", "789", "You"));
        System.out.println(builder.getSentence());;
    }
}
