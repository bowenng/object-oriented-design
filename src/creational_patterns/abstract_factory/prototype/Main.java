package creational_patterns.abstract_factory.prototype;

import creational_patterns.abstract_factory.factory_method.AdultFighterFactory;
import creational_patterns.abstract_factory.factory_method.FighterFactory;
import creational_patterns.abstract_factory.products.AdultFighter;
import creational_patterns.abstract_factory.products.Fighter;

public class Main {
    public static void main(String[] args) {
        FighterFactory fighterFactory = new PrototypeFighterFactory(new AdultFighter(""));
        Fighter bryan = fighterFactory.makeFighter("Bowen");
        Fighter justin = fighterFactory.makeFighter("Justin");
        Fighter nikita = fighterFactory.makeFighter("Nikita");
        bryan.punch(justin);
        bryan.punch(nikita);
        nikita.punch(justin);
        justin.punch(bryan);
    }
}
