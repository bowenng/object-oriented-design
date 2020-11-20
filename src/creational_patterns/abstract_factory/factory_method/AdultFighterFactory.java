package creational_patterns.abstract_factory.factory_method;

import creational_patterns.abstract_factory.products.AdultFighter;
import creational_patterns.abstract_factory.products.Fighter;

public class AdultFighterFactory implements FighterFactory {
    @Override
    public Fighter makeFighter(String name) {
        return new AdultFighter(name);
    }
}
