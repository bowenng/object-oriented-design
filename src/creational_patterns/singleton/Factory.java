package creational_patterns.singleton;

public class Factory {
    private static Factory instance = null;

    protected Factory() {

    }

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public static void main(String[] args) {
        Factory x = Factory.getInstance();
        Factory y = Factory.getInstance();
        System.out.println(x == y);
    }
}
