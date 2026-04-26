abstract class LivingThing {
    public void breath() {
        System.out.println(" Bernafas Melalui hidung");
    }

    public void eat() {
        System.out.println("Makan melalui mulut");
    }
    public abstract void walk();
}

class Human extends LivingThing{
    public void walk(){
        System.out.println("Berjalan dengan dua kaki");
    }
}

