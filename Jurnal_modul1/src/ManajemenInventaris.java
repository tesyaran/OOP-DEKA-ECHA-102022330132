// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    private ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    private ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items

    public void tambahMakananKering() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Makanan Kering: ");
        String nama = input.nextLine();
        System.out.print("Jumlah: ");
        int jumlah = input.nextInt();
        System.out.print("Harga: ");
        double harga = input.nextDouble();
        input.nextLine();  // Consume newline
        System.out.print("Brand: ");
        String brand = input.nextLine();

        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        MakananKering makananKering = new MakananKering(nama, jumlah, harga, brand);
        // Todo : Create a new object for MakananKering
        daftarMakananKering.add(makananKering);
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan Kering berhasil ditambahkan.");
    }

    public void tambahMakananBasah() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Makanan Basah: ");
        String nama = input.nextLine();
        System.out.print("Jumlah: ");
        int jumlah = input.nextInt();
        System.out.print("Harga: ");
        double harga = input.nextDouble();
        input.nextLine();  // Consume newline
        System.out.print("Bahan: ");
        String bahan = input.nextLine();

        MakananBasah makananBasah = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(makananBasah);
        System.out.println("Makanan Basah berhasil ditambahkan.");
    }
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan

        // Todo : Create a new object for MakananBasah
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    }

    public void tampilkanSemuaMakanan() {
        System.out.println("Daftar Makanan Kering:");
        if (daftarMakananKering.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (MakananKering mk : daftarMakananKering) {
                mk.tampilkanData();
                System.out.println();
            }
        }

        System.out.println("Daftar Makanan Basah:");
        if (daftarMakananBasah.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (MakananBasah mb : daftarMakananBasah) {
                mb.tampilkanData();
                System.out.println();
            // Todo : Create Print Notification "Tidak ada makanan disini"
        
            // Todo : Create print notification for Makanan Kering  
        
            // Todo : Create print notification for  Makanan Basah
        }
    }
}
