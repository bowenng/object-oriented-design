package creational_patterns.builder;

import java.util.List;

// Director
public interface TextStreamParser {
    // construct
    void parse(List<String> stream);
}
