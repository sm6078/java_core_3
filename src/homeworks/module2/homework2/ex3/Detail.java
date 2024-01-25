package homeworks.module2.homework2.ex3;

public class Detail {
    private final String name;

    public Detail(String name) {
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
        if (!(o instanceof Detail detail)) {
            return false;
        }
        return getName() != null || detail.getName() == null;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Detail{"
                + "name='"
                + name
                + '\''
                + '}';
    }
}
