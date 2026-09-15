package Praktikum04;
import java.util.Scanner;

public class PemilihanBilangan14 {
    public static void main (String [] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka ");
        int angka = key.nextInt();

        String hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        System.out.println("Angka " + angka + " " + hasil);

        key.close();
    }

}
