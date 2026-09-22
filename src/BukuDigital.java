public class BukuDigital extends Buku {
    double ukuranFile; 
    String formatFile; 

    public BukuDigital(int id, String judul, String author, double ukuranFile, String formatFile) {
        super(id, judul, author);
        this.ukuranFile = ukuranFile;
        this.formatFile = formatFile;
    }

    public void unduhBuku() {
        System.out.println("Mengunduh file buku " + judul + " (" + formatFile + ", " + ukuranFile + " MB)...");
    }

    @Override
    public void tambahBuku() {
        System.out.println("Buku digital " + judul + " (" + formatFile + ") berhasil ditambahkan.");
    }

    @Override
    public void infoBuku() {
        System.out.println("[E-Book] " + judul + " oleh " + author + " (" + formatFile + ", " + ukuranFile + "MB)");
    }
}
