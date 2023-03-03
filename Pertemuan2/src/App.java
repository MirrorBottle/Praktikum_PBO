import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();

    public static void create() throws IOException {
        
    }
    public static void main(String[] args) throws IOException {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("+++ SIA +++");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = Integer.parseInt(br.readLine());

            switch (pilihan) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }

    }
}
