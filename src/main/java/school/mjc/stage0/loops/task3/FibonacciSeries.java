package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int currentFibonacci = 0;
        int nextFibonacci = 1;

        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(currentFibonacci);
            int temp = currentFibonacci;
            currentFibonacci += nextFibonacci;
            nextFibonacci = temp;
        }
    }
}
