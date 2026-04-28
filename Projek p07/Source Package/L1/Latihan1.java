import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Kehadiran: ");
        int kehadiran = input.nextInt();
        System.out.print("Masukkan Nilai Akhir: ");
        int nilaiAkhir = input.nextInt();
        System.out.println("-----------------------------");
        int p = 21 * 75/100;
        if (kehadiran>= p) {
            System.out.println("Anda memenuhi syarat kehadiran.");
            System.out.println("Nilai anda adalah: " + nilaiAkhir);
            if ( nilaiAkhir >= 80) {
                System.out.println("A.");
            } else if (nilaiAkhir >= 70) {
                System.out.println("B.");
            } else if (nilaiAkhir >= 60) {
                System.out.println("C.");
            } else if (nilaiAkhir >= 55) {
                System.out.println("D.");
            } else if (nilaiAkhir < 55) {
                System.out.println("E.");
            }else {
                
            }
        } else {
            if  ( nilaiAkhir >= 55) {
                System.out.println("Anda tidak memenuhi syarat kehadiran.");
                System.out.println(" Nilai anda adalah: 55, Grade anda D");
            } else {
                System.out.println("Anda tidak memenuhi syarat kehadiran.");
                System.out.println(" Nilai anda adalah: " + nilaiAkhir + " Grade anda E");
            } 
            
        }
        input.close();
    }
}
