public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("             SARPRASKU");
        System.out.println("       PROJECT-AKHIR-VERSI-01");
        System.out.println("       SISTEM PENGELOLAAN KOST");
        System.out.println("======================================");

        Inventaris inventaris = new Inventaris(
            "Kipas",
            "Kamar 12",
            "Baik",
            1
        );

        inventaris.tampilkanInfo();
        inventaris.cekKondisi();
        inventaris.tampilkanStatus();
        inventaris.tambahInventaris(1);

        System.out.println();

        LaporanKerusakan laporan = new LaporanKerusakan(
            "Kipas",
            "Kamar 12",
            "Rusak",
            "Arsel",
            "Kipas tidak berputar"
        );

        laporan.tampilkanInfo();
        laporan.buatLaporan();
        laporan.laporkanKerusakan();
        laporan.lihatStatusLaporan();
        laporan.cekKondisi();

        System.out.println();

        Teknisi teknisi = new Teknisi(
            "Budi",
            "Perbaikan fasilitas kost"
        );

        teknisi.tampilkanTeknisi();
        teknisi.perbaikiKerusakan();
        teknisi.updateStatusPerbaikan();

        System.out.println();

        Admin admin = new Admin("Admin Kost");

        admin.laporkanKerusakan();
        admin.lihatStatusLaporan();
        admin.perbaikiKerusakan();
        admin.updateStatusPerbaikan();

        System.out.println();

        System.out.println("======================================");
        System.out.println("        PROGRAM SELESAI DIJALANKAN");
        System.out.println("======================================");
    }
}