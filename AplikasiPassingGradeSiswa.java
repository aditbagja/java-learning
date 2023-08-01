import java.util.Scanner;

public class LatihanPassingGradeSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilaiMTK, nilaiBInd, nilaiBIng, nilaiIPA, totalNilai, totalNilaiBahasa;
        int jumlahMapel = 4;
        boolean lulus, lulusSastra, lulusTKJ;
        Double rataNilai, rataNilaiBahasa;

        System.out.println("Masukkan nilai Ujian Matematika: ");
        nilaiMTK = input.nextInt();
        System.out.println("Masukkan nilai Ujian Bhs. Indonesia: ");
        nilaiBInd = input.nextInt();
        System.out.println("Masukkan nilai Ujian Bhs. Inggris: ");
        nilaiBIng = input.nextInt();
        System.out.println("Masukkan nilai Ujian IPA: ");
        nilaiIPA = input.nextInt();

        System.out.println(
                "\nHasil dari Simulasi untuk Persyaratan Penerimaan Calon Siswa di SMK Padepokan 79 adalah sebagai berikut: ");
        System.out.println(
                "=========================================================================================================");

        totalNilai = nilaiMTK + nilaiBInd + nilaiBIng + nilaiIPA;
        rataNilai = (double) totalNilai / jumlahMapel;
        lulus = rataNilai >= 73.0;

        totalNilaiBahasa = nilaiBInd + nilaiBIng;
        rataNilaiBahasa = (double) totalNilaiBahasa / 2;
        lulusSastra = rataNilaiBahasa >= 75.0;

        lulusTKJ = nilaiMTK > 80;

        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke SMK Padepokan 79 : " + lulus);
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Sastra : " + lulusSastra);
        System.out.println(
                "Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Teknik Komputer dan Jaringan : " + lulusTKJ);
    }
}
