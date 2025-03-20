public class Main {
    // Metode utama (main method) yang menjadi titik awal eksekusi program
    public static void main(String[] args) {
        // Membuat objek KarakterGame bernama "Karakter Umum" dengan kesehatan 100
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        // Membuat objek Pahlawan bernama "Brimstone" dengan kesehatan 150
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        // Membuat objek Musuh bernama "Viper" dengan kesehatan 200
        Musuh viper = new Musuh("Viper", 200);

        // Mencetak label "Status awal:"
        System.out.println("Status awal:");
        // Mencetak kesehatan awal Brimstone
        System.out.println("Brimstone memiliki kesehatan: " + brimstone.getKesehatan());
        // Mencetak kesehatan awal Viper
        System.out.println("Viper memiliki kesehatan: " + viper.getKesehatan());

        // Brimstone menyerang Viper
        brimstone.serang(viper);
        // Viper menyerang Brimstone
        viper.serang(brimstone);
    }
}