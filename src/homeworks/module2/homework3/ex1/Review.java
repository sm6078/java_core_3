package homeworks.module2.homework3.ex1;

import java.time.LocalDateTime;
import java.util.Objects;

public class Review {
    private final long id;
    private final String text;

    private final int countLike;

    private final LocalDateTime createDatetime;

    public Review(long id, String text, int countLike, LocalDateTime createDatetime) {
        this.id = id;
        this.text = text;
        this.countLike = countLike;
        this.createDatetime = createDatetime;
    }

    public int getCountLike() {
        return countLike;
    }

    public LocalDateTime getCreateDatetime() {
        return createDatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Review review = (Review) o;
        return id == review.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Review{"
                + "id=" + id
                + ", text='" + text + '\''
                + ", countLike=" + countLike
                + ", createDatetime=" + createDatetime
                + '}';
    }
}
