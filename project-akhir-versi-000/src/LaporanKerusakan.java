public class LaporanKerusakan extends Sarpras
        implements DapatDilaporkan {

    private String pelapor;
    private String deskripsi;
    private String statusLaporan;

    public LaporanKerusakan(
            String nama,
            String lokasi,
            String kondisi,
            String pelapor,
            String deskripsi) {

        super(nama, lokasi, kondisi);

        this.pelapor = pelapor;
        this.deskripsi = deskripsi;
        this.statusLaporan = "Menunggu";
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== LAPORAN KERUSAKAN ===");
        System.out.println("Fasilitas : " + nama);
        System.out.println("Lokasi    : " + lokasi);
        System.out.println("Pelapor   : " + pelapor);
        System.out.println("Kerusakan : " + deskripsi);
        System.out.println("Status    : " + statusLaporan);
    }

    @Override
    public void cekKondisi() {
        System.out.println(
            "Kondisi fasilitas: " + kondisi
        );
    }

    public void buatLaporan() {
        statusLaporan = "Laporan dibuat";

        System.out.println(
            "Laporan berhasil dibuat oleh " + pelapor
        );
    }

    @Override
    public void laporkanKerusakan() {
        statusLaporan = "Dilaporkan";

        System.out.println(
            "Kerusakan " + nama +
            " berhasil dilaporkan."
        );
    }

    @Override
    public void lihatStatusLaporan() {
        System.out.println(
            "Status laporan: " + statusLaporan
        );
    }
}