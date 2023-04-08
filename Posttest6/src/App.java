import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class App {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<DokumenKTP> daftarDokumenKTP = new ArrayList<DokumenKTP>();
    static ArrayList<DokumenKK> daftarDokumenKK = new ArrayList<DokumenKK>();

    public final static void flush() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String insert(String label) throws IOException {
        System.out.print(label);
        String val = br.readLine();
        return val;
    }

    public static void keypress() throws IOException {
        System.out.print("Tekan untuk melanjutkan . . . ");
        br.readLine();
    }

    // * KTP
    public static void createDokumenKTP() throws IOException {
        flush();
        System.out.println("|========= Tambah Data KTP =========|");
        String name = insert("Masukkan Nama: ");
        String NIK = insert("Masukkan NIK: ");
        String birthPlaceDate = insert("Masukkan Tempat, Tanggal Lahir: ");
        String gender = insert("Masukkan Jenis Kelamin (L/P): ");
        String address = insert("Masukkan Alamat: ");
        String job = insert("Masukkan Pekerjaan: ");
        String nationality = insert("Masukkan Kebangsaan (WNI/WNA): ");
        DokumenKTP dokumenKTP = new DokumenKTP(name, NIK, birthPlaceDate, gender, address, job, nationality);
        daftarDokumenKTP.add(dokumenKTP);
        System.out.println("Berhasil menambah data baru!");
        keypress();
    }

    public static void listDokumenKTP() throws IOException {
        flush();
        System.out.println("|========= Daftar Data KTP =========|");
        System.out.println("Total Data: " + daftarDokumenKTP.size());
        System.out.println("====================================|");
        int idx = 1;
        for (DokumenKTP dokumen : daftarDokumenKTP) {
            System.out.println("Data Ke-" + idx);
            System.out.println("NIK: " + dokumen.getNIK());
            System.out.println("Nama: " + dokumen.getName());
            System.out.println("Tempat, Tgl Lahir: " + dokumen.getBirthPlaceDate());
            System.out.println("Jenis Kelamin: " + dokumen.getGender());
            System.out.println("Alamat: " + dokumen.getAddress());
            System.out.println("Pekerjaan: " + dokumen.getJob());
            System.out.println("Kewarganegaraan: " + dokumen.getNationality());
            System.out.println("====================================|");
            idx++;
        }
        keypress();
    }

    public static void editDokumenKTP() throws IOException {
        flush();
        System.out.println("|========= Ubah Data KTP =========|");
        System.out.print("=> Masukkan Indeks Data: ");
        int idx = Integer.parseInt(br.readLine());

        if (idx > 0 && idx <= daftarDokumenKTP.size()) {
            String name = insert("\nMasukkan Nama: ");
            String NIK = insert("Masukkan NIK: ");
            String birthPlaceDate = insert("Masukkan Tempat, Tanggal Lahir: ");
            String gender = insert("Masukkan Jenis Kelamin (L/P): ");
            String address = insert("Masukkan Alamat: ");
            String job = insert("Masukkan Pekerjaan: ");
            String nationality = insert("Masukkan Kewarganegaraan (WNI/WNA): ");
            DokumenKTP dokumenKTP = new DokumenKTP(name, NIK, birthPlaceDate, gender, address, job, nationality);
            daftarDokumenKTP.set(idx - 1, dokumenKTP);
            System.out.println("Berhasil mengubah data!");
        } else {
            System.out.println("Data tidak ada!");
        }
        keypress();
    }

    public static void deleteDokumenKTP() throws IOException {
        flush();
        System.out.println("|========= Hapus Data KTP =========|");
        System.out.print("=> Masukkan Indeks Data: ");
        int idx = Integer.parseInt(br.readLine());

        if (idx > 0 && idx <= daftarDokumenKTP.size()) {
            daftarDokumenKTP.remove(idx - 1);
            System.out.println("Berhasil menghapus data!");
        } else {
            System.out.println("Data tidak ada!");
        }
        keypress();
    }

    public static void aboutDokumenKTP() throws IOException {
        flush();
        DokumenKTP dokumenKTP = new DokumenKTP();
        System.out.println("|========= Tentang Pengajuan Perekaman KTP =========|\n");
        dokumenKTP.description();
        System.out.println("\nApabila Pengajuan Diterima: ");
        dokumenKTP.description(true);
        System.out.println("\nApabila Pengajuan Ditolak: ");
        dokumenKTP.description(false);
        keypress();
    }

    public static void menuDokumenKTP() throws IOException {
        boolean isRunning = true;
        while (isRunning) {
            flush();
            System.out.println("|========= Perekaman KTP =========|");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Daftar Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Tentang");
            System.out.println("6. Kembali");
            System.out.print("=> Masukkan Pilihan: ");
            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    createDokumenKTP();
                    break;
                case 2:
                    listDokumenKTP();
                    break;
                case 3:
                    editDokumenKTP();
                    break;
                case 4:
                    deleteDokumenKTP();
                    break;
                case 5:
                    aboutDokumenKTP();
                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
                    break;
            }
        }
    }

    // * KK
    public static void createDokumenKK() throws IOException {
        flush();
        System.out.println("|========= Tambah Data KK =========|");
        String reason = insert("Masukkan Alasan: ");
        String prevIdNumber = insert("Masukkan No. KK Sebelumnya: ");
        String name = insert("Masukkan Nama: ");
        String NIK = insert("Masukkan NIK: ");
        String phoneNumber = insert("Masukkan No. HP: ");
        String address = insert("Masukkan Alamat: ");
        int totalFamilyMember = Integer.parseInt(insert("Masukkan Total Anggota Keluarga: "));
        DokumenKK dokumenKK = new DokumenKK(reason, prevIdNumber, name, NIK, phoneNumber, address, totalFamilyMember);
        daftarDokumenKK.add(dokumenKK);
        System.out.println("Berhasil menambah data baru!");
        keypress();
    }

    public static void listDokumenKK() throws IOException {
        flush();
        System.out.println("|========= Daftar Data KK =========|");
        System.out.println("Total Data: " + daftarDokumenKK.size());
        System.out.println("====================================|");
        int idx = 1;
        for (DokumenKK dokumen : daftarDokumenKK) {
            System.out.println("Data Ke-" + idx);
            System.out.println("NIK: " + dokumen.getNIK());
            System.out.println("Nama: " + dokumen.getName());
            System.out.println("Alasan: " + dokumen.getReason());
            System.out.println("No. KK Sebelumnya: " + dokumen.getPrevIdNumber());
            System.out.println("No. HP: " + dokumen.getPhoneNumber());
            System.out.println("Alamat: " + dokumen.getAddress());
            System.out.println("Total Anggota Keluarga: " + dokumen.getTotalFamilyMember());
            System.out.println("====================================|");
            idx++;
        }
        keypress();
    }

    public static void editDokumenKK() throws IOException {
        flush();
        System.out.println("|========= Ubah Data KK =========|");
        System.out.print("=> Masukkan Indeks Data: ");
        int idx = Integer.parseInt(br.readLine());

        if (idx > 0 && idx <= daftarDokumenKK.size()) {
            String reason = insert("\nMasukkan Alasan: ");
            String prevIdNumber = insert("Masukkan No. KK Sebelumnya: ");
            String name = insert("Masukkan Nama: ");
            String NIK = insert("Masukkan NIK: ");
            String phoneNumber = insert("Masukkan No. HP: ");
            String address = insert("Masukkan Alamat: ");
            int totalFamilyMember = Integer.parseInt(insert("Masukkan Total Anggota Keluarga: "));
            DokumenKK dokumenKK = new DokumenKK(reason, prevIdNumber, name, NIK, phoneNumber, address,
                    totalFamilyMember);
            daftarDokumenKK.set(idx - 1, dokumenKK);
            System.out.println("Berhasil mengubah data!");
        } else {
            System.out.println("Data tidak ada!");
        }
        keypress();
    }

    public static void deleteDokumenKK() throws IOException {
        flush();
        System.out.println("|========= Hapus Data KK =========|");
        System.out.print("=> Masukkan Indeks Data: ");
        int idx = Integer.parseInt(br.readLine());

        if (idx > 0 && idx <= daftarDokumenKK.size()) {
            daftarDokumenKK.remove(idx - 1);
            System.out.println("Berhasil menghapus data!");
        } else {
            System.out.println("Data tidak ada!");
        }
        keypress();
    }

    public static void aboutDokumenKK() throws IOException {
        flush();
        DokumenKK dokumenKK = new DokumenKK();
        System.out.println("|========= Tentang Pengajuan Pengganti KK =========|\n");
        dokumenKK.description();
        System.out.println("\nApabila Pengajuan Diterima: ");
        dokumenKK.description(true);
        System.out.println("\nApabila Pengajuan Ditolak: ");
        dokumenKK.description(false);
        keypress();
    }

    public static void menuDokumenKK() throws IOException {
        boolean isRunning = true;
        while (isRunning) {
            flush();
            System.out.println("|========= Pengajuan Pengganti KK =========|");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Daftar Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Tentang");
            System.out.println("6. Kembali");
            System.out.print("=> Masukkan Pilihan: ");
            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    createDokumenKK();
                    break;
                case 2:
                    listDokumenKK();
                    break;
                case 3:
                    editDokumenKK();
                    break;
                case 4:
                    deleteDokumenKK();
                    break;
                case 5:
                    aboutDokumenKK();
                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            flush();
            System.out.println("|========= OS - OnlineSamarinda, Disdukcapil =========|");
            System.out.println("1. Perekaman KTP");
            System.out.println("2. Pengajuan Pengganti KK");
            System.out.println("3. Tentang");
            System.out.println("4. Keluar");
            System.out.print("=> Masukkan Pilihan: ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    menuDokumenKTP();
                    break;
                case 2:
                    menuDokumenKK();
                    break;
                case 3:
                    flush();
                    System.out.println("|========= Tentang =========|");

                    Dokumen.about();
                    keypress();
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak ada!");
                    break;
            }
            System.out.println("Hello, World!");
        }
    }
}
