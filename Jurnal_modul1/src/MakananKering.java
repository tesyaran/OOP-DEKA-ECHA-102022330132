// Don't delete any comments below!!!

public class MakananKering {
    private String nama;
    private int jumlah;
    private double harga;
    private String brand;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void tampilkanData() {
        System.out.println("Nama Makanan: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
    }
    

    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)

    // Todo : Create Constructor of MakananKering

    // Todo : Create Getter and Setter

    // Todo : Create Method ShowData

}
