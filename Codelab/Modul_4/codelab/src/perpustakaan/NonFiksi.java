package perpustakaan;

public class NonFiksi extends Buku {
    private String bidang;

    public NonFiksi(String judul, String penulis, String bidang) {
        super(judul, penulis);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    @Override
    public void displayInfo() {
        System.out.print("Buku Non-Fiksi");
        System.out.print("Judul: " + getJudul());
        System.out.print("Penulis: " + getPenulis());
        System.out.println("Bidang: " + bidang);
    }
}