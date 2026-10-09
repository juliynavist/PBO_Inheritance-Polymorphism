public class Main {
    public static void main(String[] args) {
        Bentuk bentuk = new Bentuk("merah");
        System.out.println(); 
        bentuk.printInfo();

        BujurSangkar bujurSang = new BujurSangkar(5, "kuning");
        bujurSang.printInfo();

        Lingkaran lingkaran = new Lingkaran(10, "hijau");
        lingkaran.printInfo();

        Silinder silinder = new Silinder(10, 5, "biru");
        silinder.printInfo();
        System.out.println();

        System.out.println("Pergantian data Bujur Sangkar");
        bujurSang.setSisi(8);
        bujurSang.setWarna("ungu");
        bujurSang.printInfo();
        System.out.println();

    }
}