package base;

public class Produk {
    private String nama;
    String kategori;
    protected double harga;
    public int stok;

    public Produk(String nama, double harga, int stok, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }
    
    public void tampilINfo() {
        System.out.println("produk   : " + nama);
        System.out.println("kategori : " + kategori);
        System.out.println("harga    : " + harga);
        System.out.println("stok     : " + stok);
        System.out.println("----------------------------");
    }
}
