package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int total = lengthOfLastNumber < 1 ? 0 : 9;
        int rank = 100;

        for (int i = 0; i < lengthOfLastNumber-1; i++) {
            total = total + (rank- 1);
            rank *= 10;
        }
        System.out.println(total);
    }
}
