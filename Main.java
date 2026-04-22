public class Main {
    public static void main(String[] args) {
        Produk p = new Produk("baju", 20000, 5, "uniqlo");

        System.out.println(p.getnama());
        System.out.println(p.getharga());

        p.setharga(20000);
        System.out.println(p.getharga());
    }
    
}
