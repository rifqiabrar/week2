public class Main {
    public static void main(String[] args) {
        Produk p = new Produk("Indomie Goreng", 20000, 3, "Makanan");

        System.out.println(p.stok); // public - boleh
        System.out.println(p.harga); // ERROR - protected, bukan subclass
        System.out.println(p.kategori); // ERORR - default
        System.out.println(p.nama); // ERROR - private

        p.tampilINfo(); // public method (boleh)
    }
    
}
