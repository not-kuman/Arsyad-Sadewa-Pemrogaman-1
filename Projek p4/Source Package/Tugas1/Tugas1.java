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

        System.out.println(" Hari 2");
        double makanan2, transport2, belanja2;
        System.out.println(" Total Harga Makanan:");
        makanan2 = input.nextDouble();
        System.out.println(" Total Harga Transport:");
        transport2 = input.nextDouble();
        System.out.println(" Total Harga Belanja:");
        belanja2 = input.nextDouble();
        double total2 = makanan2 + transport2 + belanja2;
        double presentaseMakanan2 = (makanan2 / total2) * 100;
        double presentasiTransport2 = ( transport2 / total2) * 100;
        double presentaseBelanja2 = (belanja2 / total2) * 100;

        System.out.println(" Hasil Pesentase makanan 2: "+ presentaseMakanan2 + "%");
        System.out.println(" Hasil Pesentase transport 2: "+ presentasiTransport2 + "%");
        System.out.println(" Hasil Pesentase belanja 2: "+ presentaseBelanja2 + "%");
        
        System.out.println(" Hari 3");
        double makanan3, transport3, belanja3;
        System.out.println(" Total Harga Makanan:");
        makanan3 = input.nextDouble();
        System.out.println(" Total Harga Transport:");
        transport3 = input.nextDouble();
        System.out.println(" Total Harga Belanja:");
        belanja3 = input.nextDouble();
        double total3 = makanan3 + transport3 + belanja3;
        double presentaseMakanan3 = (makanan3 / total3) * 100;
        double presentasiTransport3 = ( transport3 / total3) * 100;
        double presentaseBelanja3 = (belanja3 / total3) * 100;

        System.out.println(" Hasil Pesentase makanan 3: "+ presentaseMakanan3 + "%");
        System.out.println(" Hasil Pesentase transport 3: "+ presentasiTransport3 + "%");
        System.out.println(" Hasil Pesentase belanja 3: "+ presentaseBelanja3 + "%");

        input.close();
    }
}
