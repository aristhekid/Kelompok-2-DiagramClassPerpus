import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        ArrayList<Member> daftarMember = new ArrayList<>();
        boolean jalan = true;

        while (jalan) {
            System.out.println("\nSISTEM PERPUSTAKAAN:");
            System.out.println("1. Tambah Buku Fisik");
            System.out.println("2. Tambah Buku Digital");
            System.out.println("3. Tambah Member");
            System.out.println("4. Tampilkan Daftar Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Buku: "); int idF = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Judul: "); String judulF = scanner.nextLine();
                    System.out.print("Author: "); String authorF = scanner.nextLine();
                    
                    BukuFisik bf = new BukuFisik(idF, judulF, authorF);
                    daftarBuku.add(bf);
                    bf.tambahBuku();
                    break;

                case 2:
                    System.out.print("ID Buku: "); int idD = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Judul: "); String judulD = scanner.nextLine();
                    System.out.print("Author: "); String authorD = scanner.nextLine();
                    System.out.print("Ukuran File (MB): "); double ukuran = scanner.nextDouble(); scanner.nextLine();
                    System.out.print("Format File (PDF/EPUB): "); String format = scanner.nextLine();
                    
                    BukuDigital bd = new BukuDigital(idD, judulD, authorD, ukuran, format);
                    daftarBuku.add(bd);
                    bd.tambahBuku();
                    break;

                case 3:
                    System.out.print("ID Member: "); int idM = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Nama: "); String namaM = scanner.nextLine();
                    System.out.print("Umur: "); int umurM = scanner.nextInt(); scanner.nextLine();
                    
                    Member m = new Member(idM, namaM, umurM);
                    daftarMember.add(m);
                    System.out.println("Member " + namaM + " berhasil ditambahkan.");
                    break;

                case 4:
                    System.out.println("\nDAFTAR BUKU: ");
                    if (daftarBuku.isEmpty()) {
                        System.out.println("Belum ada buku di perpustakaan.");
                    } else {
                        for (Buku b : daftarBuku) {
                            b.infoBuku();
                        }
                    }
                    break;

                case 5:
                    jalan = false;
                    System.out.println("Sistem dihentikan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}
