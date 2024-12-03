package pertemuan2;

class Hewan {
    // Encapsulation
    private String nama;
    
    // Konstruktor
    public Hewan(String nama) {
        this.nama = nama;
    }
    
    // Getter untuk nama
    public String getNama() {
        return nama;
    }
    
    // Metode untuk suara hewan
    public void bersuara() {
        System.out.println("Hewan ini bersuara");
    }
}

// Kelas turunan (inheritance)
class Kucing extends Hewan {
    // Konstruktor
    public Kucing(String nama){
        super(nama); // Memanggil konstruktor kelas dasar
    }
    
    // Polymorphism
    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkata: Meow!");
    }
}

// Kelas turunan lainnya
class Anjing extends Hewan {
    // Konstruktor
    public Anjing(String nama) {
        super(nama); // Memanggil konstruktor kelas dasar
    }
    
    // Polymorphism
    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkata: Bark!");
    }
}

public class Pertemuan2 {

    public static void main(String[] args) {
        Hewan kucing = new Kucing("Kitty");
        Hewan anjing = new Anjing("Buddy");
        
        kucing.bersuara();
        anjing.bersuara();
    }
    
}