package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        t = t < 0 ? -t : t;
        int total = 0;
        while (t > 0) {
            int remainder = t % 10;
            total += remainder;
            t = (t-remainder)/10;
        }
        System.out.println(total);
    }
}
