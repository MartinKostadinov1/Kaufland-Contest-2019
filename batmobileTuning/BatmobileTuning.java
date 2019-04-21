package KauflandContest2019.batmobileTuning;

import java.util.Scanner;

/**
 * @author: Martin Kostadinov
 * @date: 25-03-2019
 */

public class BatmobileTuning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        if (firstLine.equals("OVER")){
            return;
        }
        String[] line1 = firstLine.split("=|,");

        int x1 = Integer.parseInt(line1[1]);
        int y1 = Integer.parseInt(line1[3]);
        int r = Integer.parseInt(line1[5]);

        while(true) {

            String line = scanner.nextLine();
            if (line.equals("OVER")) {
                break;
            }
            String[] line2 = line.split("=|,");


            double x2 = Double.parseDouble(line2[1]);
            double y2 = Double.parseDouble(line2[3]);


            double d = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));


            if (r - d > 0) {
                System.out.println("Inside");
            } else if (r - d == 0) {
                System.out.println("Border");
            } else {
                System.out.println("Outside");
            }
        }

    }
}
