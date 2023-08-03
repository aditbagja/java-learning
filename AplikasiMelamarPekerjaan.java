import java.util.Scanner;

public class AplikasiMelamarPekerjaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jk, lulusan;
        int umur, pengalaman;
        double penampilan;
        boolean koordinator, admin;

        System.out.println("Selamat datang di PT Secret Semut 79");
        System.out.println("====================================");
        System.out.println("\nSilahkan input Data Anda");
        System.out.println("Nama : ");
        nama = input.nextLine();

        System.out.println("Umur : ");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        jk = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();

        System.out.println("Pengalaman (Tahun) : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan (1 - 10) : ");
        penampilan = input.nextDouble();

        System.out.println("====================================");
        System.out.println(nama + ", terima kasih sudah mengikuti lowongan kerja di PT Secret Semut 79");
        System.out.println("\nBerikut Hasil dari Rekrutmen :");

        koordinator = (jk.equalsIgnoreCase("Pria")
                && (((lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && umur >= 21 && umur <= 30
                        && pengalaman >= 2)
                        || (lulusan.equalsIgnoreCase("S1")) && umur >= 30 && pengalaman >= 5));
        admin = (jk.equalsIgnoreCase("Wanita")
                && ((lulusan.equalsIgnoreCase("D3") && umur >= 20 && umur <= 25
                        && (penampilan >= 8.5 || pengalaman >= 1))
                        || (lulusan.equalsIgnoreCase("S1") && umur >= 25 && penampilan >= 8.5 && pengalaman >= 5)));

        System.out.println("Hasil Kelulusan untuk Koordinator : " + koordinator);
        System.out.println("Hasil Kelulusan untuk Admin : " + admin);
    }
}
