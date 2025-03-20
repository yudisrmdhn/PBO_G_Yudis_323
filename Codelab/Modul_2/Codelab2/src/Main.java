public class Main {  // Kelas utama bernama Main untuk menjalankan program
    public static void main(String[] args) {  // Metode utama sebagai titik masuk eksekusi program

        // Membuat objek RekeningBank pertama dengan atribut nomor rekening, nama pemilik, dan saldo awal
        RekeningBank yudhistira = new RekeningBank("202410370110323", "yudhistira", 200000.0);

        // Membuat objek RekeningBank kedua dengan atribut nomor rekening, nama pemilik, dan saldo awal
        RekeningBank aurelia = new RekeningBank("202410370110283", "aurelia", 1000000.0);

        // Menampilkan informasi rekening pertama
        yudhistira.tampilkanInfo();
        System.out.println();

        // Menampilkan informasi rekening kedua
        aurelia.tampilkanInfo();
        System.out.println();

        // Melakukan setoran uang pada rekening pertama
        yudhistira.setorUang(500000.0);

        // Melakukan setoran uang pada rekening kedua
        aurelia.setorUang(500000.0);
        System.out.println();

        // Melakukan penarikan uang pada rekening pertama
        yudhistira.tarikUang(800000.0);

        // Melakukan penarikan uang pada rekening kedua
        aurelia.tarikUang(300000.0);
        System.out.println();

        // Menampilkan informasi rekening pertama setelah transaksi
        yudhistira.tampilkanInfo();
        System.out.println();

        // Menampilkan informasi rekening kedua setelah transaksi
        aurelia.tampilkanInfo();
    }
}