class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected String namaWarnet;
    protected int jumlahKomputer;
    protected float hargaPerJam;
    // To do: Buatlah constructor pada class Komputer
    public Komputer(String namaWarnet, int jumlahKomputer, float hargaPerJam) {
        this.namaWarnet = namaWarnet;
        this.jumlahKomputer = jumlahKomputer;
        this.hargaPerJam = hargaPerJam;
    }
    // To do: Bzuatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void informasi() {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Nama Warnet     : " + namaWarnet);
        System.out.println("Harga Per Jam   : Rp" + hargaPerJam);
    }

}