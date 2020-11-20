package creational_patterns.abstract_factory.factory_method;

import creational_patterns.abstract_factory.products.Fighter;

public class Main {
    public static void main(String[] args) {
        FighterFactory fighterFactory = new AdultFighterFactory();
        Fighter bryan = fighterFactory.makeFighter("Bowen");
        Fighter justin = fighterFactory.makeFighter("Justin");
        Fighter nikita = fighterFactory.makeFighter("Nikita");
        bryan.punch(justin);
        bryan.punch(nikita);
        nikita.punch(justin);
        justin.punch(bryan);
    }
}
