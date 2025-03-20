public class Pahlawan extends KarakterGame {

    // Konstruktor kelas Pahlawan, menerima nama dan kesehatan sebagai parameter
    public Pahlawan(String nama, int kesehatan) {
        // Memanggil konstruktor superclass (KarakterGame) untuk menginisialisasi atribut nama dan kesehatan
        super(nama, kesehatan);
    }

    // Override metode serang dari superclass KarakterGame
    @Override
    public void serang(KarakterGame target) {
        // Mencetak pesan serangan dengan nama pahlawan dan target, menggunakan serangan "Orbital Strike"
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Orbital Strike!");
        // Mengurangi kesehatan target sebesar 20 poin
        target.setKesehatan(target.getKesehatan() - 20);
        // Mencetak pesan yang menunjukkan kesehatan terbaru target
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}