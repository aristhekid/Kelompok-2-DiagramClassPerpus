public class BukuFisik extends Buku {
    
    public BukuFisik(int id, String judul, String author) {
        super(id, judul, author);
    }

    @Override
    public void infoBuku() {
        System.out.println("[Buku Fisik] " + judul + " oleh " + author);
    }
}
