public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer("Warnet GG X", 20, 5000.0f);
        
        // To do: Panggillah Method Informasi dari class Komputer
        komputer.informasi();

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP vipUser = new KomputerVIP("Warnet GG X", 15, 7000.0f, true);
        
        // To do: Panggillah Method Informasi dari class KomputerVIP
        vipUser.informasi();
        // To do: Panggillah Method Login
        vipUser.login("Asep");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        vipUser.bermain(2);
        vipUser.bermain(2, 3);
        
        KomputerVIP nonVipUser = new KomputerVIP("Warnet GG X", 15, 7000.0f, false);
        nonVipUser.informasi();
        nonVipUser.login("Asep");
        nonVipUser.bermain(2);
        nonVipUser.bermain(2, 3);

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium premiumUser = new KomputerPremium("Warnet GG X", 5, 10000.0f, true);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        premiumUser.informasi();
        // To do: Panggillah Method Pesan
        premiumUser.pesan(5);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        premiumUser.tambahLayanan("Mie Goreng");
        premiumUser.tambahLayanan("Mie Goreng", "Es Teh");

        KomputerPremium standardUser = new KomputerPremium("Warnet GG X", 5, 10000.0f, false);
        standardUser.informasi();
        standardUser.pesan(5);
        standardUser.tambahLayanan("Mie Goreng");
        standardUser.tambahLayanan("Mie Goreng", "Es Teh");
    }
}
