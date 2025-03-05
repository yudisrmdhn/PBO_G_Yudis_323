import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals("Admin323") && password.equals("Password323")) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();  // Membaca input nama dari pengguna
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();  // Membaca input NIM dari pengguna

            // Validasi login Mahasiswa
            if (nama.equals("Gagah Yudhistira Ramadhan") && nim.equals("202410370110323")) {
                System.out.println("Login Mahasiswa berhasil!");  // Jika nama dan NIM sesuai, login berhasil
                System.out.println("Nama: " + nama);  // Menampilkan nama yang diinput oleh pengguna
                System.out.println("NIM: " + nim);  // Menampilkan NIM yang diinput oleh pengguna
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");  // Jika nama atau NIM salah, login gagal
            }
        } else {
            // Jika pengguna memasukkan pilihan yang tidak valid
            System.out.println("Pilihan tidak valid.");  // Menampilkan pesan bahwa pilihan tidak valid
        }

        // Menutup Scanner setelah selesai digunakan
        scanner.close();
    }
}