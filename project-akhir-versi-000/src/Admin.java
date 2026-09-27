public class Admin implements DapatDilaporkan, DapatDiperbaiki {

    private String namaAdmin;

    public Admin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    @Override
    public void laporkanKerusakan() {
        System.out.println(
            "Admin " + namaAdmin +
            " mengelola laporan kerusakan."
        );
    }

    @Override
    public void lihatStatusLaporan() {
        System.out.println(
            "Admin " + namaAdmin +
            " melihat status laporan."
        );
    }

    @Override
    public void perbaikiKerusakan() {
        System.out.println(
            "Admin " + namaAdmin +
            " mengelola proses perbaikan."
        );
    }

    @Override
    public void updateStatusPerbaikan() {
        System.out.println(
            "Admin " + namaAdmin +
            " memperbarui status perbaikan."
        );
    }
}