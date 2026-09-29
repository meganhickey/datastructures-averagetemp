import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many days? ");
        int numberOfDays = scanner.nextInt();

        double[][] temperatures = new double[1][numberOfDays];

        for (int i = 0; i < numberOfDays; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[0][i] = scanner.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < numberOfDays; i++) {
            sum = sum + temperatures[0][i];
        }

        double average = sum / numberOfDays;

        System.out.println("Average temperature: " + average);

        int daysAboveAverage = 0;

        for (int i = 0; i < numberOfDays; i++) {

            if (temperatures[0][i] > average) {
                daysAboveAverage++;
            }
        }

        System.out.println("Days above average: " + daysAboveAverage);
    }
}
