import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;
        do{
            System.out.print( " Masukkan Nilai Mahasiswa: ");
            int nilai = input.nextInt();
            input.nextLine();

            System.out.println(" Nilai yang dimasukkan: " + nilai);

            System.out.print(" Apakah Anda ingin mengulangi? (y/n): ");
            ulangi = input.next().charAt(0);
            input.nextLine();
        } while (ulangi == 'y' || ulangi == 'Y');
        System.out.print(" Terima Kasih!");
        input.close();
    }
}

