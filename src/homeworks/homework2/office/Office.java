package homeworks.homework2.office;

public class Office {
    private final Boss boss;
    private final Manager manager;
    private final Security security;
    private final Secretary secretary;

    public Office(Boss boss, Manager manager, Security security, Secretary secretary) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    public void startWorkingDay() {
        System.out.println("Начинается рабочий день:");
        boss.pushManager(manager);
        manager.scream();
        security.asks();
        secretary.speakWithWorks(boss, manager, security);
    }
}
