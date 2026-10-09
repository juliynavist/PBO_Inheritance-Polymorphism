public class Lingkaran extends Bentuk {
    public static final double PHI = 3.14;
    private double radius;

    //Constructor
    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    //Accessor
    public double getRadius() {
        return radius;
    }

    //Mutator
    public void setRadius(double r) {
        this.radius = r;
    }

    public double hitungLuas() {
        return PHI * radius * radius;
    }

    public void printInfo() { //override
        System.out.println("Lingkaran [" + warna + "], luas = [" + hitungLuas() + "]");
    }
}