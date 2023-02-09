package human;


import animal.air.Bird;
import animal.Dog;


public class Trainer {
    public String teach(Dog dog) {
        return dog.bark();
    }

    public String trainBird(Bird bird) {
        return bird.speak();
    }
}
