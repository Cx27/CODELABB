import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class kalkulatorUmur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        String name = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String gender = scanner.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String birthDateInput = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateInput);

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);

        int ageInYears = period.getYears();
        int ageInMonths = period.getMonths() % 12;

        System.out.println("Nama : " + name);
        System.out.print("Jenis Kelamin ");
        if (gender.equalsIgnoreCase("P")) {
            System.out.println("Perempuan");
        }
        else if (gender.equalsIgnoreCase("L")) {
            System.out.println("Laki-Laki");
        }
        else {
            System.out.println("Unknow");
        }
        System.out.println("Umur Anda : " + ageInYears + " tahun " + ageInMonths + " bulan");
    }
}

