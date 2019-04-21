package KauflandContest2019.whySoSerious;

import java.util.Scanner;

/**
 * @author: Martin Kostadinov
 * @date: 25-03-2019
 */

public class WhySoSerious {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] gotham = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                gotham[i][j] = 100;
            }
        }
        int times = 1;
        while (times <=5) {

            String[] attack = scanner.nextLine().split(" ");
            int x = Integer.parseInt(attack[0]);
            int y = Integer.parseInt(attack[1]);
            int damage = Integer.parseInt(attack[2]);
            int doubleDamage = Integer.parseInt(attack[2]) * 2;
            int neighborsDamage = (int) Math.ceil(damage*0.1);
            int neighborsDoubleDamage = (int) Math.ceil(doubleDamage*0.1);
            boolean flag = false;
            times++;
            try {
                if (gotham[x][y]!=100 && damage>=0) {
                    gotham[x][y] -= doubleDamage;
                    if (gotham[x][y] < 0) gotham[x][y] = 0;
                    flag = true;
                }else{
                    if (damage>=0) gotham[x][y] -= damage;
                        if (gotham[x][y] < 0) gotham[x][y] = 0;

                }

            } catch (IndexOutOfBoundsException e) {
                continue;
            }


            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (!(i == 0 && j == 0)) {
                        try {
                            if(x<5&&y<5 && damage>=0){
                                if(flag){
                                    gotham[x + i][y + j] -= neighborsDoubleDamage;
                                    if (gotham[x + i][y + j] < 0) gotham[x + i][y + j] = 0;
                                }else{
                                    gotham[x + i][y + j] -= neighborsDamage;
                                    if (gotham[x + i][y + j] < 0) gotham[x + i][y + j] = 0;
                                }
                            }

                        } catch (IndexOutOfBoundsException e) {
                            continue;
                        }

                    }


                }
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {

                    System.out.print(gotham[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            }
        int totalHealth = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    totalHealth+=gotham[i][j];
                    System.out.print(gotham[i][j] + " ");
                }
                System.out.println();
            }
        System.out.println();
        System.out.println(totalHealth);
        }
    }


