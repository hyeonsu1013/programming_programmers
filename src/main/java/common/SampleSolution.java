package common;

public class SampleSolution implements SolutionInterface {

    @Override
    public void solution() {
        Sample_Parameters.Par[] values = Sample_Parameters.Par.values();
        for(Sample_Parameters.Par p : values){
            long stTime = System.currentTimeMillis();
            int sAnswer = p.getAnswer();
            int pAnswer = solution(p.getAnswer());
            long edTime = System.currentTimeMillis();
            double milliseconds = edTime - stTime;

            System.out.println(sAnswer == pAnswer ? "정답!!" : "오답!!");
            System.out.println("sAnswer : " + sAnswer + ", pAnswer : " + pAnswer);
            System.out.println("소요시간 : " + (milliseconds / 1000) + "초\r\n");
        }
    }

    public int solution(int a) {
        return a;
    }
}