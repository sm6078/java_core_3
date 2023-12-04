package homeworks.homework2.office;

public class Secretary {

    public void speakWithWorks(Boss boss, Manager manager, Security security) {
        System.out.print(boss.getName() + ", не волнуйтесь! ");
        System.out.print(manager.getName() + " все успеет. ");
        System.out.println(security.getName() + ", подождите.");
    }
}
