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
}
