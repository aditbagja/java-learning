import java.util.Scanner;

public class AplikasiPencarianArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = { 3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5 };
        int findNumber, totalNumber = 0;
        boolean numberFound = false;

        System.out.println("Mencari angka dari Array Numbers");
        System.out.print("Masukkan angka yang anda cari : ");
        findNumber = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (findNumber == numbers[i]) {
                totalNumber++;
                System.out.println(
                        "Angka " + findNumber + " yang ke " + totalNumber + " ada di dalam array numbers index ke- "
                                + i);
                numberFound = true;
            }
        }

        if (!numberFound) {
            System.out.println("Angka " + findNumber + " tidak ada di array numbers");
        }

    }
}
