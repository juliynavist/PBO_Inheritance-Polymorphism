public class BujurSangkar extends Bentuk {
    private double sisi;

    //Constructor
    public BujurSangkar(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    //Accessor
    public double getSisi() {
        return sisi;
    }

    //Mutator
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public void printInfo() { //override
        System.out.println("Bujursangkar berwarna [" + warna + "], luas = [" + hitungLuas() + "]");
    }
}