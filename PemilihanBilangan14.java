package Praktikum04;
import java.util.Scanner;

public class PemilihanBilangan14 {
    public static void main (String [] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka ");
        int angka = key.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        } else {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }

        key.close();
    }

}
