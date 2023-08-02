import java.util.Scanner;

public class LatihanTebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tebakan;
        int kesempatan = 0;
        int batasKesempatan = 3;
        int jawaban = (int) (Math.random() * 10) + 1;

        System.out.println("I am thinking of number from 1 to 10");
        System.out.println("You must guess what it is in three tries");
        System.out.println("Enter a guess :");
        do {
            tebakan = input.nextInt();
            kesempatan++;

            if (tebakan == jawaban) {
                System.out.println("RIGHT \nYou Won the game.");
                break;
            } else {
                int jarak = Math.abs(tebakan - jawaban);
                String pesan = "";
                if (jarak >= 3 && jarak <= 3) {
                    pesan = "cold";
                } else if (jarak >= 2 && jarak <= 2) {
                    pesan = "warm";
                } else if (jarak >= 1 && jarak <= 1) {
                    pesan = "hot";
                }
                System.out.println(pesan);
            }
        } while (kesempatan < batasKesempatan);
        if (kesempatan == batasKesempatan && tebakan != jawaban) {
            System.out.println("The correct number was " + jawaban);
            System.out.println("You lost the game");
        }
    }
}
