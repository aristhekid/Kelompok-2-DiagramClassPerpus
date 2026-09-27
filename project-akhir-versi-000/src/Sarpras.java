public abstract class Sarpras {

    protected String nama;
    protected String lokasi;
    protected String kondisi;

    public Sarpras(String nama, String lokasi, String kondisi) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.kondisi = kondisi;
    }

    // Abstract method 1
    public abstract void tampilkanInfo();

    // Abstract method 2
    public abstract void cekKondisi();

    // Method standard
    public void tampilkanStatus() {
        System.out.println("Status fasilitas: " + kondisi);
    }
}