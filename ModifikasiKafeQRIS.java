import java.util.Scanner;

public class ModifikasiKafeQRIS {
    public static void main(String[] args) {
        Scanner key14 = new Scanner(System.in);
        
        String jenisMenu, jenisPembayaran;
        int harga, totalHarga, totalBayar;
        char statusMember;
        double diskon = 0;
        
        System.out.print("Masukkan jenis menu: ");
        jenisMenu = key14.nextLine();
        System.out.print("Masukkan harga: ");
        harga = key14.nextInt();
        key14.nextLine(); // Membersihkan buffer
        
        System.out.print("Apakah memiliki kartu member (y/t)? ");
        statusMember = key14.next().charAt(0);
        key14.nextLine(); // Membersihkan buffer
        
        System.out.print("Masukkan jenis pembayaran (QRIS / Tunai): ");
        jenisPembayaran = key14.nextLine();
        
        // Pengecekan diskon member menggunakan equalsIgnoreCase
        if (statusMember == 'y' || statusMember == 'Y') {
            diskon = 0.10; // Diskon member 10%
        } else {
            diskon = 0.0;
        }
        
        totalHarga = (int) (harga - (harga * diskon));
        
        // Pengecekan potongan QRIS dengan equalsIgnoreCase
        if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
            totalBayar = totalHarga - 1000;
            System.out.println("Mendapatkan potongan QRIS Rp 1.000");
        } else {
            totalBayar = totalHarga;
        }
        
        System.out.println("Menu yang dipesan : " + jenisMenu);
        System.out.println("Total yang harus dibayar : " + totalBayar);
        
        key14.close();
    }
}
    

