package creational_patterns.abstract_factory.factory_method;

import creational_patterns.abstract_factory.products.Fighter;

public interface FighterFactory {
    Fighter makeFighter(String name);
}
