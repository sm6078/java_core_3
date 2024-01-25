package homeworks.module2.homework1.ex3;

import java.util.Arrays;
import java.util.List;

public class RunnerCheck {
    public static void main(String[] args) {

        MagicWarehouse magicWarehouse = new MagicWarehouse();
        magicWarehouse.add(List.of(new Item("вещь 1"),
        new Item("вещь 2"), new Item("вещь 3"),
        new Item("вещь 4"), new Item("вещь 5")));
        System.out.println(Arrays.toString(magicWarehouse.getListItem().toArray()));

        magicWarehouse.putItem(0);
        System.out.println(Arrays.toString(magicWarehouse.getListItem().toArray()));

        System.out.println(Arrays.toString(magicWarehouse.getAll().toArray()));

        magicWarehouse.add(List.of(new Item("вещь 6"),
                new Item("вещь 7"), new Item("вещь 8"),
                new Item("вещь 9"), new Item("вещь 10")));
        System.out.println(Arrays.toString(magicWarehouse.getListItem().toArray()));

        magicWarehouse.leaveLastItem();
        System.out.println(Arrays.toString(magicWarehouse.getListItem().toArray()));
    }
}
