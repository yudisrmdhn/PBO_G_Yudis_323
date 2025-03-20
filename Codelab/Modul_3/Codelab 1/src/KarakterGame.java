public class KarakterGame {

    // Mendeklarasikan atribut 'nama' dan 'kesehatan' dengan tipe data String dan akses private
    private String nama;
    private int kesehatan;

    // Konstruktor untuk kelas KarakterGame, dengan parameter nama dan kesehatan
    public KarakterGame(String nama, int kesehatan) {
        // Menginisialisasi atribut 'nama' dengan nilai parameter 'nama'
        this.nama = nama;
        // Menginisialisasi atribut 'kesehatan' dengan nilai parameter 'kesehatan'
        this.kesehatan = kesehatan;
    }

    // Metode getter untuk mengambil nilai atribut 'nama'
    public String getNama() {
        // Mengembalikan nilai atribut 'nama'
        return nama;
    }

    // Metode setter untuk mengatur nilai atribut 'nama'
    public void setNama(String nama) {
        // Mengatur nilai atribut 'nama' dengan nilai parameter 'nama'
        this.nama = nama;
    }

    // Metode getter untuk mengambil nilai atribut 'kesehatan'
    public int getKesehatan() {
        // Mengembalikan nilai atribut 'kesehatan'
        return kesehatan;
    }

    // Metode setter untuk mengatur nilai atribut 'kesehatan'
    public void setKesehatan(int kesehatan) {
        // Mengatur nilai atribut 'kesehatan' dengan nilai parameter 'kesehatan'
        this.kesehatan = kesehatan;
    }

    // Metode 'serang' yang akan di-override oleh kelas-kelas turunan
    // Metode ini tidak memiliki implementasi di kelas dasar
    public void serang(KarakterGame target) {
    }
}