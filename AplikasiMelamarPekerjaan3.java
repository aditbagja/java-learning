import java.util.Scanner;

public class AplikasiMelamarPekerjaan3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, jk, lulusan, posisiLamar;
        int umur, pengalaman;
        double penampilan;

        System.out.println("Selamat Datang di PT. Secret Semut 79");
        System.out.println("=====================================\n");
        System.out.println("Silahkan Input Data Anda :\n");

        System.out.println("Nama : ");
        nama = input.next();
        System.out.println("Umur : ");
        umur = input.nextInt();
        System.out.println("Jenis Kelamin (Pria/Wanita) :");
        jk = input.next();
        System.out.println("Lulusan (SMK/D3/S1) :");
        lulusan = input.next();
        System.out.println("Pengalaman (Tahun) :");
        pengalaman = input.nextInt();
        System.out.println("Penampilan (1 - 10) :");
        penampilan = input.nextDouble();
        System.out.println("Posisi yang dilamar (SPV, Admin, atau Koordinator) :");
        posisiLamar = input.next();

        System.out.println();
        System.out.println(nama + ", Terima kasih sudah mengikuti Lowongan Kerja di PT. Secret Semut 79 \n");
        System.out.println("Berikut adalah Hasil dari Rekrutmen untuk posisi " + posisiLamar);

        boolean isQualified = isQualifiedCandidate(jk, umur, lulusan, pengalaman, penampilan, posisiLamar);
        hasil(isQualified, nama, posisiLamar);
    }

    public static boolean isQualifiedCandidate(String jk, int umur, String lulusan, int pengalaman, double penampilan,
            String posisiLamar) {
        boolean koordinator1 = (jk.equalsIgnoreCase("Pria")) && (umur >= 21 && umur <= 30)
                && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && (pengalaman >= 2);
        boolean koordinator2 = (jk.equalsIgnoreCase("Pria")) && (umur > 30) && (lulusan.equalsIgnoreCase("S1"))
                && (pengalaman >= 5);

        boolean admin1 = (jk.equalsIgnoreCase("Wanita")) && (umur >= 20 && umur <= 25)
                && (lulusan.equalsIgnoreCase("D3"))
                && (penampilan >= 8.5 || pengalaman >= 1);
        boolean admin2 = (jk.equalsIgnoreCase("Wanita")) && (umur > 25) && (lulusan.equalsIgnoreCase("S1"))
                && (penampilan >= 8.5) && (pengalaman >= 3);
        boolean admin3 = (jk.equalsIgnoreCase("Pria")) && (umur >= 20 && umur <= 30) && (penampilan >= 8.5)
                && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && (pengalaman >= 2);

        boolean spv1 = (umur >= 23 && umur <= 30) && (lulusan.equalsIgnoreCase("S1")) && (pengalaman >= 1);
        boolean spv2 = (umur >= 25 && umur <= 35) && (lulusan.equalsIgnoreCase("D3")) && (pengalaman >= 4);

        if (posisiLamar.equalsIgnoreCase("Koordinator")) {
            return koordinator1 || koordinator2;
        } else if (posisiLamar.equalsIgnoreCase("Admin")) {
            return admin1 || admin2 || admin3;
        } else if (posisiLamar.equalsIgnoreCase("SPV")) {
            return spv1 || spv2;
        } else {
            return false;
        }
    }

    public static void hasil(boolean isQualified, String nama, String posisiLamar) {
        if (isQualified) {
            System.out.println("Selamat, " + nama);
            System.out.println("Anda Memenuhi syarat untuk posisi " + posisiLamar);
            System.out.println("Dan akan masuk ke Tahap Selanjutnya");
        } else {
            System.out.println("Maaf, " + nama);
            System.out.println("Anda tidak memenuhi syarat untuk posisi " + posisiLamar);
            System.out.println("Dan tidak akan masuk ke Tahap Selanjutnya");
        }
    }
}
