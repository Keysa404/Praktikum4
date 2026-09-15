import java.util.Scanner;

public class Kafe14 {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan menu: ");
        menu = key.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        ukuranCup = key.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = key.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = key.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()){
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            default:
                System.out.println("Menu yang tidak tersedia.");
        }

        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup){
            case 'S':
            case 's':
                break;
            case 'M':
            case 'm':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
            case 'l':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("Ukuran cup yang dipilih tidak tersedia.");
        }
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item Pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);
        
        }
    }
