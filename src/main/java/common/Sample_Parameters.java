package common;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Sample_Parameters {

    @Getter
    @AllArgsConstructor
    public enum Par {

        param1(1);

        private final int answer;
    }
}
