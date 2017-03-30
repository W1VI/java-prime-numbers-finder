package StoreX;

import java.util.Scanner;

public class PrimeLoads {

    Scanner input = new Scanner(System.in);

    public void justOne() {
        int numberX = 0, divideX = 1, countX = 0, f = 4;
        String numberY = "0";
        System.out.println("Enter Your Number");

        sidika:

        while (f == 4) {
            try {
                numberY = input.nextLine();
                numberX = Integer.parseInt(numberY);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Input!Enter a valid integer!");
                continue sidika;
            }
        }
        while (divideX < numberX) {
            if (numberX % divideX == 0) {
                countX += 1;
            }
            divideX += 1;
        }
        if ((countX > 1) || (numberX == 1)) {
            System.out.println(numberX + " is not a prime number");
        } else {
            System.out.println(numberX + " is a prime number");
        }

    }

    public void range() {

        int fromX = 0, toX = 0, divideX = 1, countX = 0, tyga = 8, lion = 4, camel = 5;
        String fromY = "0";
        String toY = "0";

        natalie:
        do {
            try {
                if (tyga == 8) {
                    System.out.println("Enter Lower Limit");
                    fromY = input.nextLine();
                    fromX = Integer.parseInt(fromY);
                    tyga = 5;
                }

                if (lion == 4) {
                    System.out.println("Enter Upper Limit");
                    toY = input.nextLine();
                    toX = Integer.parseInt(toY);
                    lion = 9;
                }
                camel = 6;

            } catch (Exception e) {
                System.out.println("Invalid Input!Enter a valid integer!");
                continue natalie;
            }
        } while (camel == 5);
        /* System.out.println("Enter Lower Limit");
         fromX = input.nextInt();
         System.out.println("Enter Upper Limit");
         toX = input.nextInt();*/
        while (fromX <= toX) {
            boolean jik = checker(fromX);
            if (jik == true) {
                System.out.println(" " + fromX);
            } else {

            }
            fromX += 1;
        }

    }

    public boolean checker(int vc) {
        int numberX = 0, divideX = 1, countX = 0;
        int xxx = 0;

        numberX = vc;
        while (divideX < numberX) {
            if (numberX % divideX == 0) {
                countX += 1;
            }
            divideX += 1;
        }
        if ((countX > 1) || (numberX == 1)) {
            xxx = 1;
        } else {
            xxx = 5;
        }
        if (xxx == 1) {
            return false;
        } else {
            return true;
        }

    }
}
