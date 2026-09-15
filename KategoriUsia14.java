import java.util.Scanner;

public class KategoriUsia14 {
    public static void main(String [] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Masukkan usia anda :");

        int usia = key.nextInt();

        //Validasi apakah angka positif (termasuk 0)
        if (usia < 0){
            System.out.println("Error: Usia harus berupa angka positif!");  
        } else if (usia <= 12){
            System.out.println("Ktegori Usia: Anak");
        } else if (usia <= 19){
            System.out.println("Kategori Usia: Remaja");
        } else if (usia <=64){
            System.out.println("Kategori Usia Dewasa");
        } else {
            System.out.println("Kategori Usia Lansia");
        } 
        key.close();
    } 
}
