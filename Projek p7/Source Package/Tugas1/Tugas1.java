import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("===============================");
            System.out.println("== Data Mahasiswa ==");
            System.out.println("===============================");
            System.out.println("1. Menu Nilai ");
            System.out.println("2. Menu Keuangan ");
            System.out.println("3. Keluar ");
            System.out.println("Piliha Menu (1/2/3): ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    DataNilai(in);
                    break;
                case 2:
                    DataKeuangan(in);
                    break;
                case 3:
                    running = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                }
            }
        }
            public static void DataNilai(Scanner in) {
                System.out.println("==== Data Mahasiswa ==== ");

                int kehadiran = 0;
                boolean inputValid = false;
                while (!inputValid) {
                    System.out.print(" Jumlah Kehadiran (Maks 21): ");
                    kehadiran = in.nextInt();
                    if (kehadiran >= 0 && kehadiran <= 21) {
                        inputValid = true;
                    } else {
                        System.out.println("Input tidak valid. Harap masukkan jumlah kehadiran antara 0 dan 21.");
                    }
                }
                System.out.print(" Jumlah Nilai Akhir: ");
                int nilaiAkhir = in.nextInt();

                boolean memenuhiKehadiran = kehadiran >= (21 * 75/100);
                if (!memenuhiKehadiran && nilaiAkhir >= 55) nilaiAkhir = 55;

                char grade = 'E';
                if (nilaiAkhir >= 80) {
                    grade = 'A';
                } else if (nilaiAkhir >= 70) {
                    grade = 'B';
                } else if (nilaiAkhir >= 60) {
                    grade = 'C';
                } else if (nilaiAkhir >= 55) {
                    grade = 'D';
                }
                System.out.println("Syarat Hadir : " + (memenuhiKehadiran ? "Memenuhi" : "Tidak Memenuhi"));
                System.out.println("Hasil Akhir : NIlai " + nilaiAkhir + " ( grade " + grade + " )");

                BacktoMenu(in);
            }
            public static void DataKeuangan(Scanner in) {
                System.out.println(" Data keuangan");
                String[] kategori = {"Makanan", "Transport", "Belanja"};
                double[] total = new double[3];

                for (int i =0; i< 7; i++) {
                    System.out.println(" Pengeluaran Hari " + (i+1) + "---");
                    double sum = 0;

                    for (int j =0; j < 3; j++){
                        System.out.print(" Total Harga " + kategori[j] + "\t ");
                        double harian = in.nextDouble();
                        total[j] += harian;
                        sum += harian;
                    }
                    if (sum > 0) {
                        System.out.printf(" Total harian\t: %.1f\n\n", sum);
                    }
            }
            double totalPengeluaran = total[0] + total[1] + total[2];
            System.out.println(" Total Pengeluaran Selama 7 Hari: " );
            for (int i = 0; i < 3; i++) {
                System.out.printf(" Total %-9s: %.1f\n", kategori[i], total[i], (total[i] / totalPengeluaran) * 100);
            }
        System.out.println(" Total Keseluruhan: " + totalPengeluaran );

        BacktoMenu(in);
        }

        public static void BacktoMenu(Scanner in) {
            System.out.print("Kembali ke menu utama? (y/n): ");
            String back = in.next();
            if (back.equalsIgnoreCase("y")) {
                return;
            } else {
                System.out.println("Terima kasih!");
                System.exit(0);
            }
        }
    }
