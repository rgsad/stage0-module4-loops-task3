package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = first > second ? first : second;
        int min = first < second ? first : second;
        int divisor = 1;

        for (int i = max; i > 0; i--) {
            if (max % i == 0 && min % i == 0) {
                divisor = i;
                break;
            }
        }
        System.out.println(divisor);
    }
}
