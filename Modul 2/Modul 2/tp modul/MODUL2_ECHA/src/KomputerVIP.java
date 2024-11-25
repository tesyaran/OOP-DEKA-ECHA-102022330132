class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(String namaWarnet, int jumlahKomputer, float hargaPerJam, boolean vipCard) {
        super(namaWarnet, jumlahKomputer, hargaPerJam);
        this.vipCard = vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status          : " + (vipCard ? "Member VIP" : "Non VIP"));
        if (vipCard) {
            System.out.println("Benefit Member VIP:");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
        } else {
            System.out.println("Benefit Member VIP: jgn ngarep benefit, maaf :)");
        }
    }
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void login(String username) {
        System.out.println("Login dengan username: " + username);
    }
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void bermain(int jam, int menitTambahan) {
        System.out.println("Nambah billing selama " + jam + " jam " + menitTambahan + " menit");
    }
}