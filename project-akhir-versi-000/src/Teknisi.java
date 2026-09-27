public class Teknisi implements DapatDiperbaiki {

    private String namaTeknisi;
    private String spesialisasi;
    private String statusPerbaikan;

    public Teknisi(String namaTeknisi, String spesialisasi) {
        this.namaTeknisi = namaTeknisi;
        this.spesialisasi = spesialisasi;
        this.statusPerbaikan = "Belum ada pekerjaan";
    }

    @Override
    public void perbaikiKerusakan() {
        statusPerbaikan = "Sedang diperbaiki";

        System.out.println(
            "Teknisi " + namaTeknisi +
            " sedang memperbaiki fasilitas kost."
        );
    }

    @Override
    public void updateStatusPerbaikan() {
        statusPerbaikan = "Selesai diperbaiki";

        System.out.println(
            "Status perbaikan: " + statusPerbaikan
        );
    }

    public void tampilkanTeknisi() {
        System.out.println("=== DATA TEKNISI ===");
        System.out.println("Nama         : " + namaTeknisi);
        System.out.println("Spesialisasi : " + spesialisasi);
        System.out.println("Status       : " + statusPerbaikan);
    }
}