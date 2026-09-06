public class Main {
    public static void main(String[] args) {
        Genre genre1 = new Genre(1, "Fiksi", "Cerita tidak nyata");
        genre1.tambahGenre();

        Buku buku1 = new Buku(101, "Rongawi Anti Suki", "Ambarawuhi");
        buku1.genreBuku.add(genre1);
        buku1.tambahBuku();

        Member m1 = new Member(1, "Rusdi", 20);
        m1.pinjamBuku(buku1);
        m1.kembalikanBuku(buku1);
    }
}
