import java.util.ArrayList;
import java.util.Scanner;


class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;


    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan,
                       String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    // Getters
    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public String getWaktuKedatangan() {
        return waktuKedatangan;
    }

    public float getHargaTiket() {
        return hargaTiket;
    }

    // Method to display flight details
    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan);
        System.out.println("Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan);
        System.out.println("Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: " + hargaTiket);
    }
}

// Class Penumpang (Passenger)
class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    // Constructor
    public Penumpang(String NIK, String namaDepan, String namaBelakang ) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    // Getters
    public String getNIK() {
        return NIK;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void tampilDaftarPenumpang() {
        System.out.println("NIK: " + NIK);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang: " + namaBelakang);
    }
}

// Class Pembelian (Purchase)
class Pembelian {
    private ArrayList<Penerbangan> penerbanganTersedia;
    private Penumpang penumpang;
    private Penerbangan penerbanganDipilih;

    // Constructor
    public Pembelian(ArrayList<Penerbangan> penerbanganTersedia) {
        this.penerbanganTersedia = penerbanganTersedia;
    }

    // Method to display available flights
    public void tampilkanDaftarPenerbangan() {
        System.out.println("===== Daftar Penerbangan =====");
        for (int i = 0; i < penerbanganTersedia.size(); i++) {
            System.out.println("[" + (i + 1) + "]");
            penerbanganTersedia.get(i).tampilDaftarPenerbangan();
            System.out.println("-----------------------------");
        }
    }

    // Method to choose a flight
    public void beliTiket(Scanner scanner) {
        System.out.print("Pilih penerbangan yang ingin dipesan (1, 2, 3, dst.): ");
        int pilihan = scanner.nextInt();
        if (pilihan > 0 && pilihan <= penerbanganTersedia.size()) {
            penerbanganDipilih = penerbanganTersedia.get(pilihan - 1);
            scanner.nextLine(); // clear input buffer

            System.out.println("Masukkan data penumpang:");
            System.out.print("NIK: ");
            String NIK = scanner.nextLine();
            System.out.print("Nama Depan: ");
            String namaDepan = scanner.nextLine();
            System.out.print("Nama Belakang: ");
            String namaBelakang = scanner.nextLine();

            penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
            System.out.println("Tiket berhasil dipesan!");
        } else {
            System.out.println("Penerbangan tidak ditemukan.");
        }
    }

    // Method to display ticket details
    public void tampilkanTiket() {
        if (penumpang == null || penerbanganDipilih == null) {
            System.out.println("Pembelian Tiket Tidak Ada");
        } else {
            System.out.println("===== Detail Tiket Penerbangan =====");
            penumpang.tampilDaftarPenumpang();
            penerbanganDipilih.tampilDaftarPenerbangan();
        }
    }
}

// Main class with a menu system
public class PenerbanganMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create some flight objects
        Penerbangan flight1 = new Penerbangan("GA123", "Jakarta", "Surabaya", "08:00", "09:30", 1500000);
        Penerbangan flight2 = new Penerbangan("SJ456", "Jakarta", "Bali", "10:00", "11:30", 2000000);
        Penerbangan flight3 = new Penerbangan("AK789", "Jakarta", "Yogyakarta", "12:00", "13:30", 1000000);

        // Create a list of available flights
        ArrayList<Penerbangan> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);

        // Create a purchase object
        Pembelian purchase = new Pembelian(flights);

        // Simple menu system
        int choice = 0;
        do {
            System.out.println("\n===== EAD Ticket Booking System =====");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    purchase.tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    purchase.beliTiket(scanner);
                    break;
                case 3:
                    purchase.tampilkanTiket();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (choice != 4);

        scanner.close();
    }
}