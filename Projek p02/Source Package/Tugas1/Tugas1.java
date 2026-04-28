import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String NamaLengkap, Universitas, ProgamStudi;
        int Umur;

        System.out.print(" Selamat Datang");
        System.out.print("Masukkan Nama Lengkap");
        NamaLengkap = inputScanner.nextLine();

        System.out.print(" Masukkan Umur: ");
        Umur = inputScanner.nextInt();
        System.out.print(" Masukkan Universitas: ");
        Universitas = inputScanner.next();

        System.out.print(" Masukkan Progam Studi: ");
        ProgamStudi = inputScanner.next();

        System.out.println("========================================");
        System.out.println("          Detail Data Diri"              );
        System.out.println("========================================");
        System.out.println(" => Nama         : " + NamaLengkap);
        System.out.println(" => Umur         : " + Umur);
        System.out.println(" => Universitas  : " +Universitas);
        System.out.println(" => Progam Studi : " +ProgamStudi);
        System.out.println("=========================================");
        inputScanner.close();
    }
}
