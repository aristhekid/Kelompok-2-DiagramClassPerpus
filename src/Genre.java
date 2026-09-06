public class Genre {
    int id_genre;
    String nama_genre;
    String deskripsi;

    public Genre(int id, String nama, String deskripsi) {
        this.id_genre = id;
        this.nama_genre = nama;
        this.deskripsi = deskripsi;
    }

    public void tambahGenre() {
        System.out.println("Genre " + nama_genre + " ditambahkan.");
    }

    public void updateGenre(String namaBaru) {
        this.nama_genre = namaBaru;
        System.out.println("Genre diupdate.");
    }
}
