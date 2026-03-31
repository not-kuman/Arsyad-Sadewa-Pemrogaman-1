import java.util.Scanner;

public class Latihan {
    
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah presentasi");
        int jumlahPresentasi = inputScanner.nextInt();
        System.out.println(" Masukkan Nilai Tugas ");
        int nilaiTugas = inputScanner.nextInt();
        System.out.println("Masukkan Nilai UTS");
        int nilaiUTS = inputScanner.nextInt();
        System.out.println("Masukkan Nilai UAS");
        int nilaiUAS = inputScanner.nextInt();

        System.out.println("Jumlah presentasi: " + jumlahPresentasi);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);

    }
}
