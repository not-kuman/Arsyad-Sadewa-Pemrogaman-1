import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Hari 1");
        double makanan1, transport1, belanja1;
        System.out.println(" Total Harga Makanan:");
        makanan1 = input.nextDouble();
        System.out.println(" Total Harga Transport:");
        transport1 = input.nextDouble();
        System.out.println(" Total Harga Belanja:");
        belanja1 = input.nextDouble();
        double total1 = makanan1 + transport1 + belanja1;
        double presentaseMakanan1 = (makanan1 / total1) * 100;
        double presentasiTransport1 = ( transport1 / total1) * 100;
        double presentaseBelanja1 = (belanja1 / total1) * 100;

        System.out.println(" Hasil Pesentase makanan 1: "+ presentaseMakanan1 + "%");
        System.out.println(" Hasil Pesentase transport 1: "+ presentasiTransport1 + "%");
        System.out.println(" Hasil Pesentase belanja 1: "+ presentaseBelanja1 + "%");
        input.close();
    }
}
