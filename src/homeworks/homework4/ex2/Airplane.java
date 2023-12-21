package homeworks.homework4.ex2;

public class Airplane implements Flying {

    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Ошибка. Пассажиров в самолете меньше 0.");
        }
        System.out.println("Самолет летит.");
    }
}
