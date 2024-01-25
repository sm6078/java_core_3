package homeworks.module2.homework2.ex1;

public class Runner {
    public static void main(String[] args) {
        LuggageCompartment luggageCompartment = new LuggageCompartment(new Worker("Василий"),
                new Worker("Иван"), new Worker("Джон"));

        luggageCompartment.arrivalPlane("SU-077");
        luggageCompartment.arrivalPlane("AO-222");

        luggageCompartment.unload();

    }

}
