package homeworks.module1.homework2.office;

public class Runner {

    public void init() {
        Office office = new Office(new Boss("Петр Николаевич"), new Manager("Володя"),
                                   new Security("Петрович"), new Secretary());
        office.startWorkingDay();
    }


}
