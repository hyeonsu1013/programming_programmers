package level_1;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Level_1_Parameters {

    @Getter
    @AllArgsConstructor
    public enum Param135808 {

        param1(3, 4, new int[]{1, 2, 3, 4, 2, 3, 1}, 8),
        param2(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}, 33);

        private final int k;
        private final int m;
        private final int[] score;
        private final int answer;
    }

    @Getter
    @AllArgsConstructor
    public enum Param134240 {

        param1(new int[]{1, 3, 4, 6}, "1223330333221"),
        param2(new int[]{1, 7, 1, 2}, "111303111");

        private final int[] food;
        private final String answer;
    }

    @Getter
    @AllArgsConstructor
    public enum Param136798 {

        param1(5, 3, 2, 10),
        param2(10, 3, 2, 21);

        private final int number;
        private final int limit;
        private final int power;
        private final int answer;
    }

    @Getter
    @AllArgsConstructor
    public enum Param133502 {

        param1(new int[]{2,1,1,2,3,1,2,3,1}, 2),
        param2(new int[]{1,3,2,1,2,1,3,1,2}, 0),
        param3(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1, 2, 3, 1, 3, 3, 3, 2, 1, 2, 3, 1}, 5),
        param4(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1}, 3),
        param5(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1}, 3),
        param6(new int[]{1, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1}, 3),
        param7(new int[]{1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1, 2, 3, 1}, 3),
        param8(new int[]{1, 2, 1, 2, 3, 1, 3, 1, 1, 2, 3, 1}, 3);

        private final int[] ingredient;
        private final int answer;
    }
}
