package homeworks.module2.homework3.ex1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.TreeSet;


public class Runner {
    public static void run() {
        Set<Review> reviewSet = new TreeSet<>((o1, o2) -> {
            int resultLike = o2.getCountLike() - o1.getCountLike();
            int result = resultLike;
            if (resultLike == 0) {
                result = o2.getCreateDatetime().compareTo(o1.getCreateDatetime());
            }
            return result;
        });

        reviewSet.add(new Review(2, "так себе товар",
                100, Util.getFormattingData("25.01.2024 16:37")));
        reviewSet.add(new Review(1, "отличный товар",
                200, Util.getFormattingData("25.01.2024 13:37")));
        reviewSet.add(new Review(3, "плохой товар",
                100, Util.getFormattingData("25.01.2024 13:37")));

        System.out.println("------");
        System.out.println(reviewSet);
    }

    static class Util {

        private static DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        public static LocalDateTime getFormattingData(String dateTime) {
            return LocalDateTime.parse(dateTime, formatter);
        }

    }


}
