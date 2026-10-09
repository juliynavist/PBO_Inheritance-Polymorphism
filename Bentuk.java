public class Bentuk {
    protected String warna;

    //Constructor
    public Bentuk(String warna) {
        this.warna = warna;
    }

    //Accessor
    public String getWarna() {
        return warna;
    }

    //Mutator
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void printInfo() {
        System.out.println("Bentuk berwarna " + "[" + warna + "]");
    }
}