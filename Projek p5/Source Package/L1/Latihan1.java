import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Cek pembayaran");

        System.out.print("Masukkan harga makanan: ");
        int hargaMakanan = input.nextInt();

        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        int uangBayar = input.nextInt();

        System.out.println("-----------------------------");
        if (uangBayar < hargaMakanan) {
            System.out.println("Uang yang dibayarkan kurang. Silakan bayar dengan jumlah yang cukup.");
        } else if (uangBayar == hargaMakanan) {
            System.out.println("Pembayaran berhasil. Terima kasih!");
        } else {
            int kembalian = uangBayar - hargaMakanan;
            System.out.println("Pembayaran berhasil. Kembalian Anda: " + kembalian);
        }
        input.close();
    }
}
