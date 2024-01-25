package homeworks.module2.homework2.ex1;

public class Suitcase {
    private final String flightNumber;

    public String getFlightNumber() {
        return flightNumber;
    }

    public Suitcase(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return  "flightNumber='"
                + flightNumber + '\'';
    }
}
