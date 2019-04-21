package KauflandContest2019.catwoman;

import java.util.Scanner;

/**
 * @author: Martin Kostadinov
 * @date: 25-03-2019
 */

public class Catwoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] bag = new int[size];
        boolean[] flag = new boolean[size];
        for (int i = 0; i < bag.length; i++) {
            bag[i] = 0;
            flag[i] = false;
        }
        int countForCheck = 0;


        while (true) {
            for (int i = 0; i < flag.length; i++) {
                if (flag[i]) {
                    countForCheck++;
                }
            }
            if (countForCheck == bag.length) {
                break;
            } else {
                countForCheck = 0;
            }

            String command = scanner.nextLine();
            String[] commands = command.split(" ");
            int poss = Integer.parseInt(commands[0]);
            int value = Integer.parseInt(commands[1]);

            if (poss < bag.length && poss >= 0) {
                if (value >= 0 && !flag[poss]) {
                    bag[poss] = value;
                    flag[poss]=true;

                } else {
                    try {
                        if (value >=0 && !flag[poss+1]) {
                            bag[poss + 1] = value;
                            flag[poss + 1] = true;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        continue;
                    }
                }
            }
            //Print the array
            System.out.print("[");
            for (int i = 0; i < bag.length-1; i++) {
                System.out.printf("%d, ", bag[i]);
            }
            System.out.printf("%d]",bag[bag.length-1]);
            System.out.println();

        }
        int sum = 0;
        for (int i = 0; i < bag.length; i++) {
            sum += bag[i];
        }
        System.out.println(sum);
    }
}
