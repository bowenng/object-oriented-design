package creational_patterns.abstract_factory.factory_method;

import creational_patterns.abstract_factory.products.ChildFighter;
import creational_patterns.abstract_factory.products.Fighter;

public class ChildFighterFactory implements FighterFactory {
    @Override
    public Fighter makeFighter(String name) {
        return new ChildFighter(name);
    }
}
