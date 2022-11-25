package level_2;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Level_2_Parameters {

    @Getter
    @AllArgsConstructor
    public enum Param138476 {

        param1(6, new int[]{1,3,2,5,4,5,2,3}, 3),
        param2(4, new int[]{1,3,2,5,4,5,2,3}, 2),
        param3(2, new int[]{1,1,1,1,2,2,2,3}, 1);

        private final int k;
        private final int[] tangerine;
        private final int answer;
    }
}
