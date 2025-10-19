// 1. HEWAN UMUM (Superclass)
class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara: *suara umum*");
    }
}

// 2. ANJING (Subclass pertama)
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Anjing: WOOF! WOOF!");
    }
}

// 3. KUCING (Subclass kedua)
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Kucing: MEOW! MEOW!");
    }
}

// 4. PROGRAM UTAMA
public class PolimorfismeDemo {
    public static void main(String[] args) {
        System.out.println("=== DEMO POLIMORFISME ===");
        System.out.println();
        
        // TANPA POLIMORFISME (susah!)
        System.out.println("--- TANPA POLIMORFISME ---");
        Anjing myDog = new Anjing();
        myDog.bersuara();  // Harus tulis "Anjing" spesifik
        
        Kucing myCat = new Kucing();
        myCat.bersuara();  // Harus tulis "Kucing" spesifik
        System.out.println();
        
        // DENGAN POLIMORFISME (MUDAH!)
        System.out.println("--- DENGAN POLIMORFISME ---");
        
        // Kotak bertuliskan "HEWAN", isinya ANJING
        Hewan kotak1 = new Anjing();
        kotak1.bersuara();  // Output: "Anjing: WOOF! WOOF!"
        
        // Kotak bertuliskan "HEWAN", isinya KUCING  
        Hewan kotak2 = new Kucing();
        kotak2.bersuara();  // Output: "Kucing: MEOW! MEOW!"
        
        System.out.println();
        System.out.println("*** LIHAT! Satu kotak HEWAN bisa berubah bentuk! ***");
    }
}
