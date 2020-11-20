package creational_patterns.abstract_factory.prototype;

import creational_patterns.abstract_factory.factory_method.FighterFactory;
import creational_patterns.abstract_factory.products.Fighter;

public class PrototypeFighterFactory implements FighterFactory {
    private Fighter prototype;

    public PrototypeFighterFactory(Fighter prototype) {
        this.prototype = prototype;
    }

    @Override
    public Fighter makeFighter(String name) {
        try {
            Fighter fighter = (Fighter) prototype.clone();
            fighter.setName(name);
            return fighter;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
