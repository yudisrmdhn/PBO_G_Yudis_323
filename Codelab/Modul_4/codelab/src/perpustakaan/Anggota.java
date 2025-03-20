package perpustakaan;

public class Anggota implements peminjaman {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    @Override
    public void pinjamBuku(String judulBuku) {
        System.out.println(nama + " meminjam buku berjudul: " + judulBuku);
    }

    @Override
    public void pinjamBuku(String judulBuku, int durasi) {
        System.out.println(nama + " meminjam buku \"" + judulBuku + "\" selama " + durasi + " hari.");
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judulBuku);
    }
}