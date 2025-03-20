import java.time.LocalDate;
import java.util.Scanner;

public class codelab {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Meminta input jenis kelamin dari pengguna
        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelamin = scanner.next();

        // Meminta input tahun lahir dari pengguna
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Mendapatkan tahun saat ini menggunakan Java API java.time.LocalDate
        int tahunSekarang = LocalDate.now().getYear();
        // Menghitung umur pengguna berdasarkan tahun lahir
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin berdasarkan input
        String jenisKelaminStr;
        if (jenisKelamin.equals("L") || jenisKelamin.equals("l")) {
            jenisKelaminStr = "Laki-laki";
        } else if (jenisKelamin.equals("P") || jenisKelamin.equals("p")) {
            jenisKelaminStr = "Perempuan";
        } else {
            jenisKelaminStr = "Tidak diketahui";
        }

        // Menutup Scanner setelah selesai digunakan
        scanner.close();

        // Menampilkan hasil data diri pengguna
        System.out.println("\nData Diri: ");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur: " + umur);
    }
}