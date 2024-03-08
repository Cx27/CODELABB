import java.util.Scanner;
import java.util.HashMap;

public class SystemLogin {
    private final HashMap<String, String> Mahasiswa;
    private final HashMap<String, String> adminCredentials;

    public SystemLogin() {
        Mahasiswa = new HashMap<>();
        Mahasiswa.put("202310370311442", "Mahasiswa1");

        adminCredentials = new HashMap<>();
        adminCredentials.put("admin", "admin");
    }

    public void loginAsMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan NIM mu: ");
        String nim = scanner.nextLine();
        if (nim.length() == 15 && Mahasiswa.containsKey(nim)) {
            System.out.println("Sukses Login Sebagai Mahasiswa");
        } else {
            System.out.println("User Tidak Di Temukan atau NIM Salah");
        }
    }

    public void loginAsAdmin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan username mu (admin): ");
        String username = scanner.nextLine();
        System.out.print("Masukan password mu (admin): ");
        String password = scanner.nextLine();
        if (adminCredentials.containsKey(username) && adminCredentials.get(username).equals(password)) {
            System.out.println("Sukses Login Sebagai Admin");
        } else {
            System.out.println("Admin User Tidak Ditemukan!!");
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Library System =====");
            System.out.println("1. Login Sebagai Mahasiswa");
            System.out.println("2. Login Sebagai Admin");
            System.out.println("3. Exit");
            System.out.print("Pilih Opsi (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    loginAsMahasiswa();
                    break;
                case 2:
                    loginAsAdmin();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Opsi Salah Silahkan Pilih broooo.");
            }
        }
    }

    public static void main(String[] args) {
        SystemLogin SystemLogin = new SystemLogin();
        SystemLogin.run();
    }
}


