// Don't delete any comments below!!!
public class MakananBasah {
    private String nama;
    private int jumlah;
    private double harga;
    private String bahan;
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
        return bahan;
    }
    public void setBrand(String brand) {
        this.bahan = bahan;
    }
    public void tampilkanData() {
        System.out.println("Nama Makanan: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
        System.out.println("bahan: " + bahan);
    }

    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)

    // Todo : Create Constructor of MakananBasah

    // Todo : Create Getter and Setter

    // Todo : Create Method ShowData

}
