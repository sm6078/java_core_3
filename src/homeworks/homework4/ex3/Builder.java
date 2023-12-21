package homeworks.homework4.ex3;

public class Builder implements Sound {
    private Sound human;

    public Builder() {
        this.human = new Human();
    }

    @Override
    public String makeSound() {
        return String.format("%s. %s", "Я строитель", human.makeSound());
    }
}
