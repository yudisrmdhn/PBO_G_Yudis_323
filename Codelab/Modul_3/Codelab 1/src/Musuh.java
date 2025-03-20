public class Musuh extends KarakterGame {

    // Konstruktor kelas Musuh, menerima nama dan kesehatan sebagai parameter
    public Musuh(String nama, int kesehatan) {
        // Memanggil konstruktor superclass (KarakterGame) untuk menginisialisasi atribut nama dan kesehatan
        super(nama, kesehatan);
    }

    // Override metode serang dari superclass KarakterGame
    @Override
    public void serang(KarakterGame target) {
        // Mencetak pesan serangan dengan nama musuh dan target, menggunakan serangan "Snake Bite"
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Snake Bite!");
        // Mengurangi kesehatan target sebesar 15 poin
        target.setKesehatan(target.getKesehatan() - 15);
        // Mencetak pesan yang menunjukkan kesehatan terbaru target
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}