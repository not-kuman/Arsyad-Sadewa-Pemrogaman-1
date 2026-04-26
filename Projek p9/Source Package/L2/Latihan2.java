import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;
        do {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            System.out.println(" Data yang dimasukkan:");
            System.out.println(" Nama: " + nama);
            System.out.println(" NIM: " + nim);

            System.out.print("Apakah Anda ingin mengulangi? (y/n): ");
            ulangi = input.next().charAt(0);
            input.nextLine(); // Consume the newline character
        } while (ulangi == 'y' || ulangi == 'Y');
        input.close();
    }
    
}
