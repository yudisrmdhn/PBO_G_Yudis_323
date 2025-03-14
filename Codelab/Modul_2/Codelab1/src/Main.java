public class Main {  // Mendeklarasikan kelas utama bernama Main
    public static void main(String[] args) {  // Metode utama yang menjadi titik masuk program

        Hewan hewan1 = new Hewan();  // Membuat objek pertama dari kelas Hewan
        hewan1.nama = "Kucing";  // Mengatur nama untuk objek hewan1 menjadi "Kucing"
        hewan1.jenis = "Mamalia";  // Mengatur jenis hewan1 menjadi "Mamalia"
        hewan1.suara = "Nyann~~";  // Mengatur suara hewan1 menjadi "Nyann~~"

        Hewan hewan2 = new Hewan();  // Membuat objek kedua dari kelas Hewan
        hewan2.nama = "Anjing";  // Mengatur nama untuk objek hewan2 menjadi "Anjing"
        hewan2.jenis = "Mamalia";  // Mengatur jenis hewan2 menjadi "Mamalia"
        hewan2.suara = "Woof-Woof!!";  // Mengatur suara hewan2 menjadi "Woof-Woof!!"

        hewan1.tampilkanInfo();  // Memanggil metode tampilkanInfo untuk menampilkan informasi dari objek hewan1
        hewan2.tampilkanInfo();  // Memanggil metode tampilkanInfo untuk menampilkan informasi dari objek hewan2
    }
}