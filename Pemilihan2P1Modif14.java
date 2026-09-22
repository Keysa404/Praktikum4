import java.util.Scanner;

public class Pemilihan2P1Modif14 {
    public static void main(String[] args) {
        Scanner key14 = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun : ");
        int tahun = key14.nextInt();
        
        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
        
        key14.close();
    }
} 
