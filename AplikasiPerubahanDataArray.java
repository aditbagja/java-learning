import java.util.Scanner;

public class AplikasiPerubahanDataArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = { 3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5 };
        int findNumber, newNumber;

        System.out.println("Array numbers saat ini :");
        System.out.print("{3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5}");

        System.out.println("\nMerubah nilai dari arrays number");
        System.out.print("Masukkan posisi yang ingin diganti (1 - 13) : ");
        findNumber = input.nextInt();

        if (findNumber >= 1 && findNumber < numbers.length + 1) {
            System.out.print("Masukkan angka baru: ");
            newNumber = input.nextInt();
            numbers[findNumber - 1] = newNumber;

            System.out.println("\nArray setelah perubahan:");
            System.out.print("{");
            for (int n : numbers) {
                System.out.print(n + " ");
            }
            System.out.print("}");
        } else {
            System.out.println("Posisi index tidak valid.");
        }

    }
}
