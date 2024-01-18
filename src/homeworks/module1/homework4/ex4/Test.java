package homeworks.module1.homework4.ex4;

public interface Test {
    void test1();
    void test1(int  age);

//    default void test1(String str) {
//        System.out.println(str);
//    }

    private int getAge() {
        return 9;
    }
}
