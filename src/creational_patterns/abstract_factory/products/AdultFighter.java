package creational_patterns.abstract_factory.products;

public class AdultFighter extends Fighter {
    public AdultFighter(String name) {
        super(name);
    }

    @Override
    public void punch(Fighter enemy) {
        swear(enemy);
        enemy.getPunched(this);
    }

    @Override
    public void getPunched(Fighter attacker) {
        bleed();
        scream();
    }

    private void swear(Fighter enemy) {
        System.out.println(String.format("%s: Why don't we settle it right here in the ring, %s?", name, enemy.getName()));
    }

    private void scream() {
        System.out.println(String.format("%s: Shit it hurts.", name));
    }

    private void bleed() {
        System.out.println(String.format("%s is bleeding...", name));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new AdultFighter(name);
    }
}
