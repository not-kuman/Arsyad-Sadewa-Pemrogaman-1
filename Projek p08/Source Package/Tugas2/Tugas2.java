import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;
        double total = 0;
        int count = 0;

        do{
            System.out.print(" Masukkan Nilai Mahasiswa: ");
            double nilai = input.nextDouble();
            input.nextLine();

            total += nilai;
            count++;

            System.out.print(" Apakah Anda ingin mwnambah nilai? (y/n): ");
            ulangi = input.next().charAt(0);
            input.nextLine();
        } while (ulangi == 'y' || ulangi == 'Y');

        if (count > 0) {
            System.out.println("=====================");
            System.out.println(" Jumlah Nilai: " + count);
            System.out.println(" Total Nilai " + total);
        } else {
            System.out.println(" Tidak ada nilai yang dimasukkan.");
        }

        input.close();
    }
}
