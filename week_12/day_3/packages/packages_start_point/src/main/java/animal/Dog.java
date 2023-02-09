package animal;

public class Dog {

     String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected String bark() {
        return "Bark!";
    }
}
