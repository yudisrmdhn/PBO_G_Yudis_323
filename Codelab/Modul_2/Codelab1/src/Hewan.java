public class Hewan {  // Mendeklarasikan kelas bernama Hewan, yang merupakan representasi umum dari objek hewan

    String nama;  // Mendeklarasikan variabel 'nama' untuk menyimpan nama hewan
    String jenis;  // Mendeklarasikan variabel 'jenis' untuk menyimpan jenis hewan (misalnya, mamalia, reptil)
    String suara;  // Mendeklarasikan variabel 'suara' untuk menyimpan suara yang dihasilkan oleh hewan

    public void tampilkanInfo() {  // Mendeklarasikan metode 'tampilkanInfo' untuk menampilkan informasi tentang hewan

        System.out.println("Nama: " + nama);  // Menampilkan nama hewan
        System.out.println("Jenis: " + jenis);  // Menampilkan jenis hewan
        System.out.println("Suara: " + suara);  // Menampilkan suara hewan

        System.out.println();  // Menambahkan baris kosong untuk memisahkan output dengan lebih rapi
    }
}