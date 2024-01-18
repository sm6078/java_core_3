package homeworks.module2.homework1.ex1;

public class Zoo<D extends Animal, B extends Animal, T extends Animal> {

    private final D animalOne;
    private final B animalTwo;
    private final T animalThree;

    public Zoo(D animalOne, B animalTwo, T animalThree) {
        this.animalOne = animalOne;
        this.animalTwo = animalTwo;
        this.animalThree = animalThree;
    }

    public D getAnimalOne() {
        return animalOne;
    }

    public B getAnimalTwo() {
        return animalTwo;
    }

    public T getAnimalThree() {
        return animalThree;
    }
}
