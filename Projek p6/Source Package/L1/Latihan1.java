public class Latihan1 {
    
    private String name;
    private String address;
    private int age;
    private double mathgrade;
    private double englishgrade;
    private double sciencegrade;
    private static int studentCount;

    public String getName(){ return name; }
    public double getMathGrade(){ return mathgrade; }
    public double getEnglishGrade(){ return englishgrade; }
    public double getScienceGrade(){ return sciencegrade; }

    public double getAverage(){
        return (mathgrade + englishgrade + sciencegrade) / 3;
    }
    public static int getStudentCount(){
        return studentCount;
    }

    public void setName(String temp){ name = temp; }
    public void setAddress(String temp){ address = temp; }

    public void setAge(int age){ this.age = age; }

    public void setMathGrade(double mathgrade){ this.mathgrade = mathgrade; }
    public void setEnglishGrade(double englishgrade){ this.englishgrade = englishgrade; }    
    public void setScienceGrade(double sciencegrade){ this.sciencegrade = sciencegrade; }

    public void print(String temp){
        System.out.println("Name:"+ name);
        System.out.println("Address:"+ address);
        System.out.println("Age:"+ age);
    }
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name:"+ name);
        System.out.println("Math Grade:"+ mGrade);
        System.out.println("English Grade:"+ eGrade);
        System.out.println("Science Grade:"+ sGrade);
    }
    public static void main(String[] args) {
        Latihan1 annaRecord = new Latihan1();

        annaRecord.setName("Anna");
        annaRecord.setAddress("Philippines");
        annaRecord.setAge(15);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(95.5);
        annaRecord.setScienceGrade(100);

        System.out.println("--- Cetak Versi 1 ---");
        annaRecord.print(annaRecord.getName());

        System.out.println("--- Cetak Versi 2 ---");
        annaRecord.print(annaRecord.getEnglishGrade(), annaRecord.getMathGrade(), annaRecord.getScienceGrade());    
    }
}
