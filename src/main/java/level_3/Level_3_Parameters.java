package level_3;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Level_3_Parameters {

    @Getter
    @AllArgsConstructor
    public enum Param77486 {

        param1(new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"}
                ,new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"}
                , new String[]{"young", "john", "tod", "emily", "mary"}
                , new int[]{12, 4, 2, 5, 10},
                new int[]{360, 958, 108, 0, 450, 18, 180, 1080}),
        param2(new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"}
                ,new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"}
                , new String[]{"sam", "emily", "jaimie", "edward"}
                , new int[]{2, 3, 5, 4},
                new int[]{0, 110, 378, 180, 270, 450, 0, 0});

        private final String[] enroll;
        private final String[] referral;
        private final String[] seller;
        private final int[] amount;
        private final int[] answer;
    }
}
