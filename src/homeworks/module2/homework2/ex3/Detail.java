package homeworks.module2.homework2.ex3;

import java.util.Objects;

public class Detail {
    private String name;

    public Detail(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detail detail = (Detail) o;
        this.name = detail.name;
        return true;
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
