import java.util.Scanner;

public class TugasP4_14{
    public static void main(String[] args) {
        Scanner Key = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = Key.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = Key.nextLine();
        System.out.print("Masukkan kelas: ");
        char kelas = Key.next().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        int absen = Key.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = Key.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double tugas = Key.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double ujian = Key.nextDouble();

        double nilaiAkhir = (kuis + tugas + ujian) / 3;

        String nilaiHuruf = "";
        double nilaiSetara = 0;
        String kualifikasi = "";

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        } else {
            nilaiHuruf = "Tidak Valid";
            kualifikasi = "Tidak Valid";
        }

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
