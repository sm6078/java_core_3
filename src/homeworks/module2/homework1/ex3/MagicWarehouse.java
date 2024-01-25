package homeworks.module2.homework1.ex3;

import java.util.ArrayList;
import java.util.List;

public class MagicWarehouse {
    private final List<Item> listItem = new ArrayList<>();

    public MagicWarehouse(List<Item> items) {
        listItem.addAll(items);
    }

    public MagicWarehouse() {
    }

    public List<Item> getListItem() {
        return listItem;
    }

    public boolean add(List<Item> items) {
        return listItem.addAll(items);
    }

    public List<Item> getAll() {
        List<Item> resultList = new ArrayList<>(listItem.size() / 2);
        for (int i = 0; i < listItem.size(); i++) {
            if (i % 2 == 0) {
                resultList.add(listItem.get(i));
            }

        }
        return resultList;
    }

    public void leaveLastItem() {
        Item item = putItem(listItem.size() - 1);
        listItem.clear();
        listItem.add(item);
    }

    public Item putItem(int index) {
        return listItem.remove(index);
    }
}
