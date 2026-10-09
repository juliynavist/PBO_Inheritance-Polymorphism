public class Silinder extends Lingkaran {
    private double tinggi;

    //Constructor
    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    //Accessor
    public double getTinggi() {
        return tinggi;
    }

    //Mutator
    public void setTinggi(double t) {
        this.tinggi = t;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi; // Volume = luas alas (lingkaran) x tinggi
    }

    public void printInfo() { //Override
        System.out.println("Silinder warna [" + warna + "], volume = [" + hitungVolume() + "]");
    }
}