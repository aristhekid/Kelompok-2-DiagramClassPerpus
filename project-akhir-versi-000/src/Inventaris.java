public class Inventaris extends Sarpras {

    private int jumlah;

    public Inventaris(String nama, String lokasi, String kondisi, int jumlah) {
        super(nama, lokasi, kondisi);
        this.jumlah = jumlah;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== DATA INVENTARIS KOST ===");
        System.out.println("Nama    : " + nama);
        System.out.println("Lokasi  : " + lokasi);
        System.out.println("Kondisi : " + kondisi);
        System.out.println("Jumlah  : " + jumlah);
    }

    @Override
    public void cekKondisi() {
        System.out.println(
            "Kondisi " + nama + ": " + kondisi
        );
    }

    // Method khusus Inventaris
    public void tambahInventaris(int jumlahTambahan) {
        jumlah += jumlahTambahan;

        System.out.println(
            "Jumlah " + nama +
            " sekarang: " + jumlah
        );
    }
}