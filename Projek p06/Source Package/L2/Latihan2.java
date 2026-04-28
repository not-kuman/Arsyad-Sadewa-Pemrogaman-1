public class Latihan2 {

    private double tinggi;
    private double alas;

    public void settinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public void setalas(double alas){
        this.alas = alas;
    }
    public double gettinggi(){
        return tinggi;
    }
    public double getalas(){
        return alas;
    }
    public double getLuas(){
        return (this.tinggi * this.alas * 0.5);
    }

    public static void main(String[] args) {
        Latihan2[] segitiga = new Latihan2[2];

        segitiga[0] = new Latihan2();
        segitiga[1] = new Latihan2();

        segitiga[0].settinggi(12.0);
        segitiga[0].setalas(8.0);
        segitiga[1].settinggi(11.23);
        segitiga[1].setalas(7.7);

        for (int i = 0; i < 2; i++) {
            System.out.println("Segitiga ke-" + (i+1) );
            System.out.println("Tinggi: " + segitiga[i].gettinggi());
            System.out.println("Alas: " + segitiga[i].getalas());
            System.out.println("Luas: " + segitiga[i].getLuas());
            System.out.println();
        }
    }
}