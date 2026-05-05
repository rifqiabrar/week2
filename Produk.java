

public class Produk {
    private String nama;
    String kategori;
    private double harga;
    private int stok;

    public Produk(String nama, double harga, int stok, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    public String getnama() {
        return nama;
    }
    public double getharga() {
        return harga;
    }
    public int getstok() {
        return stok;
    }

    public void setharga(double harga) {
        this.harga = harga;
    }
    public void setstok(int stok) {
        this.stok = stok;
    }

    public void tampilInfo() {
        System.out.println("produk   : " + nama);
        System.out.println("kategori : " + kategori);
        System.out.println("harga    : " + harga);
        System.out.println("stok     : " + stok);
        System.out.println("----------------------------");
    }
}
