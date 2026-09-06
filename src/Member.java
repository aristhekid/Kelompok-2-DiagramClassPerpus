import java.util.ArrayList;

public class Member {
    int id_member;
    String nama;
    int umur;
    ArrayList<Buku> bukuPinjaman = new ArrayList<>();

    public Member(int id, String nama, int umur) {
        this.id_member = id;
        this.nama = nama;
        this.umur = umur;
    }

    public void pinjamBuku(Buku buku) {
        bukuPinjaman.add(buku);
        System.out.println(nama + " meminjam buku " + buku.judul);
    }

    public void kembalikanBuku(Buku buku) {
        bukuPinjaman.remove(buku);
        System.out.println(nama + " mengembalikan buku " + buku.judul);
    }
}
