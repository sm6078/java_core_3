package homeworks.module1.homework4.ex1;

public class CarWash {

    public static final int TARIFF_LARGE_CARS = 4000;
    public static final int TARIFF_SMALL_CARS = 2000;

    public int wash(Car car) {
        int cost = 0;
        if (!car.isClean) {
            car.setClean(true);
            cost = getTariffByDimensions(car);
        }
        return cost;
    }


    public int wash(Car[] cars) {
        int sum = 0;
        for (Car car : cars) {
            sum = sum + getTariffByDimensions(car);
        }
        return sum;
    }

    private int getTariffByDimensions(Car car) {
        int tariff = 0;
        if (car.length > 6 || car.height > 2.5 || car.width > 2) {
            tariff = TARIFF_LARGE_CARS;
        } else {
            tariff = TARIFF_SMALL_CARS;
        }
        return tariff;
    }
}
