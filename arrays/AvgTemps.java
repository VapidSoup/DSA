package arrays;

import java.util.Scanner;

public class AvgTemps {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of days: ");
            int numDays = scanner.nextInt();
            double[] temperatures = collectTemperatures(scanner, numDays);
            double averageTemperature = calculateAverage(temperatures);
            System.out.printf("The average temperature is: %.2f\n", averageTemperature);
            int countAboveAverage = countDaysAboveAverage(temperatures, averageTemperature);
            System.out.println(countAboveAverage + " day(s) were above the average temperature.");
        }
    }

    private static double[] collectTemperatures(Scanner scanner, int numDays) {
        double[] temperatures = new double[numDays];
        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter the temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }
        return temperatures;
    }

    private static double calculateAverage(double[] temperatures) {
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.length;
    }

    private static int countDaysAboveAverage(double[] temperatures, double averageTemperature) {
        int count = 0;
        for (double temp : temperatures) {
            if (temp > averageTemperature) {
                count++;
            }
        }
        return count;
    }
}