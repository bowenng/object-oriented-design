package creational_patterns.abstract_factory.products;

public class ChildFighter extends Fighter {
    public ChildFighter(String name) {
        super(name);
    }

    @Override
    public void punch(Fighter enemy) {
        System.out.println(String.format("%s :I'm gonna beat you up, %s!", name, enemy.getName()));
        enemy.getPunched(this);
    }

    @Override
    public void getPunched(Fighter attacker) {
        System.out.println(String.format("%s :You are so mean, %s!", name, attacker.getName()));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new AdultFighter(name);
    }
}
