import java.util.Scanner;

public class LatihanDiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dadu, totalPoint;
        int comPoint = 0;
        int playerPoint = 0;
        String pilihan = "";

        System.out.println("Welcome to Dice Game");
        System.out.println("Computer will start first");
        System.out.println("=========================");

        do {
            totalPoint = 0;
            System.out.println(">> Computer has " + comPoint + " points <<\n");
            do {
                dadu = (int) (Math.random() * 6) + 1;
                System.out.println("Computer rolled a " + dadu + ".");
                if (dadu == 1) {
                    System.out.println();
                    System.out.println("Computer get number 1 dice");
                    System.out.println("Thats mean ends the turn");
                    totalPoint = 0;
                } else {
                    totalPoint += dadu;
                    System.out.println("\nComputer has " + totalPoint + " point so far this round");
                    if (totalPoint < 10) {
                        System.out.println("Computer will roll again");
                    }
                }
            } while (dadu != 1 && totalPoint < 10);

            comPoint += totalPoint;
            System.out.println("Computer ends the round with " + comPoint + " points");
            System.out.println("================================================\n");

            totalPoint = 0;
            System.out.println(">> You have " + playerPoint + " points <<\n");

            do {
                dadu = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled a " + dadu + ".");
                if (dadu == 1) {
                    System.out.println();
                    System.out.println("You get number 1 dice");
                    System.out.println("Thats mean ends the turn");
                    totalPoint = 0;
                } else {
                    totalPoint += dadu;
                    System.out.println("\nYou have " + totalPoint + " points so far this round");
                    System.out.println("Would you like to roll again or hold ? ");
                    pilihan = input.nextLine();
                }
            } while (dadu != 1 && pilihan.equals("roll"));

            playerPoint += totalPoint;
            System.out.println("You end the round with " + playerPoint + " points");
            System.out.println("================================================\n");
        } while (playerPoint < 50 && comPoint < 50);

        if (playerPoint > comPoint) {
            System.out.println("YOU WIN!!");
        } else {
            System.out.println("Computer wins");
        }

    }
}
