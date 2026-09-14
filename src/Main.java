public class Main {
    public static void main(String[] args) {
        Genre genre1 = new Genre(1, "Fiksi", "Cerita tidak nyata");
        genre1.tambahGenre();

        Buku buku1 = new Buku(101, "Rongawi Anti Suki", "Ambarawuhi");
        buku1.genreBuku.add(genre1);
        buku1.tambahBuku();

        // Inheritance: Bukudigital turunan dari Buku
        BukuDigital ebook1 = new BukuDigital(102, "Pemrograman Java Dasar", "Pak Dosen", 4.5, "PDF");
        ebook1.genreBuku.add(genre1);
        ebook1.tambahBuku();
        ebook1.unduhBuku();

        Member m1 = new Member(1, "Rusdi", 20);
        m1.pinjamBuku(buku1);
        m1.kembalikanBuku(buku1);
    }
}
