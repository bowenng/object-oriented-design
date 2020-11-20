package creational_patterns.abstract_factory.products;

public abstract class Fighter implements Cloneable {
    protected String name;
    public abstract void punch(Fighter enemy);
    public abstract void getPunched(Fighter attacker);

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public Fighter(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
