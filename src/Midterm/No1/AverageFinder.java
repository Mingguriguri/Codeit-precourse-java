package Midterm.No1;

public class AverageFinder {
    double computeAverage(int[] intArray) {
        int sum = 0;
        double average;
        for (int a : intArray) {
            sum += a;
        }
        average = (double) sum / intArray.length;
        return average;
    }
}