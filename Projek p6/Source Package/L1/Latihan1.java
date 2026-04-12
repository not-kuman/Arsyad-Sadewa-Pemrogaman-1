import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan harga makanan: ");
        int hargaMakanan = input.nextInt();
        System.out.print(" Apakah Anda memiliki kartu member? (y/t): ");
        char member = input.next().toLowerCase().charAt(0);

        double hargafinal = hargaMakanan;
        if (member == 'y') {
            if (hargaMakanan >= 50000) {
                System.out.println( " Selamat! Anda adalah member dan telah belanja lebih dari 50.000, diskon 10% telah diterapkan.");
                hargafinal = hargaMakanan - (hargaMakanan * 0.1);
            }else {
                System.out.println(" Maaf, Anda adalah member tetapi belum mencapai batas minimum belanja untuk mendapatkan diskon.");
            }
        }
        System.out.println(" Total harga yang harus dibayar setelah diskon: " + hargafinal);
        System.out.print(" Masukkan jumlah uang yang dibayarkan: ");
        double uangBayar = input.nextDouble();

        System.out.println("-----------------------------");
        
        if (uangBayar < hargafinal) {
            System.out.println("Uang yang dibayarkan kurang. Silakan bayar dengan jumlah yang cukup.");
        } else if (uangBayar == hargafinal) {
            System.out.println("Pembayaran berhasil. Terima kasih!");
        } else {
            double kembalian = uangBayar - hargafinal;
            System.out.println("Pembayaran berhasil. Kembalian Anda: " + kembalian);
        }
        input.close();
    }
}
