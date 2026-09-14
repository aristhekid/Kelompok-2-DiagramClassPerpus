public class BukuDigital extends Buku {
    double ukuranFile; // ini dalam MB
    String formatFile; // contohnya kek: PDF, EPUB

    public BukuDigital(int id, String judul, String author, double ukuranFile, String formatFile) {
        super(id, judul, author);
        this.ukuranFile = ukuranFile;
        this.formatFile = formatFile;
    }

    // method spesifik child class
    public void unduhBuku() {
        System.out.println("Mengunduh file buku " + judul + " (" + formatFile + ", " + ukuranFile + " MB)...");
    }

    // bisa override method tambahBuku biar lebih kelihatan bedanya
    @Override
    public void tambahBuku() {
        System.out.println("Buku digital " + judul + " (" + formatFile + ") berhasil ditambahkan.");
    }
}