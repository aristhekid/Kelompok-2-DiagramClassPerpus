import java.util.ArrayList;

public class Buku {
    int id_buku;
    String judul;
    String author;
    ArrayList<Genre> genreBuku = new ArrayList<>();

    public Buku(int id, String judul, String author) {
        this.id_buku = id;
        this.judul = judul;
        this.author = author;
    }

    public void tambahBuku() {
        System.out.println("Buku " + judul + " ditambahkan.");
    }

    public void updateBuku(String judulBaru) {
        this.judul = judulBaru;
        System.out.println("Buku diupdate.");
    }
}
