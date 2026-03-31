import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Nilai Mahasiswa ===");

        System.out.print("Masukkan jumlah SKS (2 atau 3): ");
        int sks = input.nextInt();
        
        double realisasi = 0;
        if (sks == 3) {
            realisasi = 21;
        } else if (sks == 2) {
            realisasi = 14;
        } else {
            System.out.println("Error: Jumlah SKS tidak valid! Harap masukkan 2 atau 3.");
            System.exit(0); 
        }

        System.out.print("Masukkan jumlah kehadiran: ");
        double kehadiran = input.nextDouble();

        System.out.print("Masukkan Total Nilai Tugas (skala 0-100): ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS (skala 0-100): ");
        double nilaiUts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS (skala 0-100): ");
        double nilaiUas = input.nextDouble();
        double presentasi = (kehadiran / realisasi) * 100;
        double skorKehadiran = presentasi * 10 / 100; 
        double skorTugas = nilaiTugas * 20 / 100;
        double skorUts = nilaiUts * 30 / 100;
        double skorUas = nilaiUas * 40 / 100;

        double nilaiAkhir = skorKehadiran + skorTugas + skorUts + skorUas;

        System.out.println("\n=== Hasil Perhitungan Nilai ===");
        System.out.println("Nilai Kehadiran (10%) : " + skorKehadiran);
        System.out.println("Nilai Tugas (20%)     : " + skorTugas);
        System.out.println("Nilai UTS (30%)       : " + skorUts);
        System.out.println("Nilai UAS (40%)       : " + skorUas);
        System.out.println("-----------------------------------");
        System.out.println("Total Nilai Akhir     : " + nilaiAkhir);

        input.close();
    }
} 
