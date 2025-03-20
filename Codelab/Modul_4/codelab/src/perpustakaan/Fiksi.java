package perpustakaan;

public class Fiksi extends Buku{
    private String genre;

    public Fiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.print("Buku Fiksi");
        System.out.print("Judul: " + getJudul());
        System.out.print("Penulis: " + getPenulis());
        System.out.println("Genre: " + genre);
    }
}