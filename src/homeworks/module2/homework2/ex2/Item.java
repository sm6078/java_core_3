package homeworks.module2.homework2.ex2;

public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Item item)) {
            return false;
        }
        return getName() != null ? getName().equals(item.getName()) : item.getName() == null;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
