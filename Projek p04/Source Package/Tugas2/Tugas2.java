import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Progam Konversi Suhu Celsius ");
        System.out.print(" Masukkan suhu dalam Celsius:");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println(" ------ Hasil Proses Konversi Suhu ------");
        System.out.println(" Suhu dalam Celsius:" + celsius + " °C");
        System.out.println(" Suhu dalam Fahrenheit: " + fahrenheit + " °F");
        System.out.println(" Suhu dalam Kelvin: " + kelvin + " K");

        input.close();
    }
}
