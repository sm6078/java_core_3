package homeworks.homework2.office;

public class Office {
    private Boss boss;
    private Manager manager;
    private Security security;
    private Secretary secretary;

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
