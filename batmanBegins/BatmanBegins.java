package KauflandContest2019.batmanBegins;

import java.util.Scanner;

/**
 * @author: Martin Kostadinov
 * @date: 25-03-2019
 */

public class BatmanBegins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] lineArgs = line.split(" ");

        int[] totalPeople = new int[lineArgs.length];

        for (int i = 0; i <lineArgs.length ; i++) {
            totalPeople[i] = Integer.parseInt(lineArgs[i]);
        }

        int min = totalPeople[0];
        int max = 0;
        double avg = 0;
        int sum = 0;


        for (int i = 0; i <totalPeople.length ; i++) {
            if (totalPeople[i]<=min){
                min = totalPeople[i];
            }

            if (totalPeople[i]>max){
                max = totalPeople[i];
            }

        }
        for (int i = 0; i < totalPeople.length; i++) {
            sum+=totalPeople[i];
            avg = sum/totalPeople.length;
        }



        System.out.printf("Count: %d%n",totalPeople.length);
        System.out.printf("Min: %d%n",min);
        System.out.printf("Max: %d%n",max);
        System.out.printf("Avg: %.2f%n",avg);

        System.out.printf("Sum: %d%n",sum);

    }
}
