package LA_50421874;

// Kelas dasar Hewan
class Hewan {
    private String nama;
    private int energi; // Atribut energi

    // Konstruktor
    public Hewan(String nama, int energi) {
        this.nama = nama;
        this.energi = energi;
    }

    public String getNama() {
        return nama;
    }

    public int getEnergi() {
        return energi;
    }

    // Metode untuk berjalan
    public void berjalan() {
        if (energi >= 5) {
            energi -= 5;
            System.out.println(nama + " berjalan. Energi tersisa: " + energi);
        } else {
            System.out.println(nama + " tidak cukup energi untuk berjalan.");
        }
    }

    // Metode untuk makan
    public void makan() {
        energi += 4;
        System.out.println(nama + " makan. Energi sekarang: " + energi);
    }
}

// Kelas turunan Kucing
class Kucing extends Hewan {
    // Konstruktor
    public Kucing(String nama, int energi) {
        super(nama, energi); // Memanggil konstruktor kelas dasar
    }
}

// Kelas turunan Anjing
class Anjing extends Hewan {
    // Konstruktor
    public Anjing(String nama, int energi) {
        super(nama, energi); // Memanggil konstruktor kelas dasar
    }
}

// Kelas utama
public class LA2 {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Kitty", 20);
        Hewan anjing = new Anjing("Buddy", 15);

        // Aktivitas kucing
        kucing.berjalan();
        kucing.makan();
        kucing.berjalan();
        kucing.berjalan();
        
        System.out.println();

        // Aktivitas anjing
        anjing.berjalan();
        anjing.makan();
        anjing.berjalan();
    }
}
