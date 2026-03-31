import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println(" Selamat Datang!!");
        System.out.print(" Masukkan Nama Lengkap: ");
        String NamaLengkap = inputScanner.nextLine();
        int Umur = 0;
        while (true){
            System.out.print(" Masukkan Umur: ");
            if (inputScanner.hasNextInt()){
                Umur = inputScanner.nextInt();
                inputScanner.nextLine();
                break;
            } else {
                System.out.println(" Mohon masukkan angka!! ");
                inputScanner.nextLine();
            }
        }
        System.out.print("Masukkan Nama Universitas: ");
        String Universitas = inputScanner.nextLine();

        System.out.print(" Masukkan Progam Studi: ");
        String ProgamStudi = inputScanner.nextLine();

        System.out.println("\n========================================");
        System.out.println("      Detail Informasi     ");
        System.out.println("========================================");
        System.out.printf(" => Nama: %s\n ", NamaLengkap);
        System.out.printf(" => Umur: %d\n ", Umur);
        System.out.printf(" => Universitas: %s\n", Universitas);
        System.out.printf(" => Progam Study: %s\n", ProgamStudi);
        System.out.println("========================================");
        inputScanner.close();

    }
}