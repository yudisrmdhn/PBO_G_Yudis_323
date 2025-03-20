package perpustakaan;

public interface peminjaman {
    void pinjamBuku(String judulBuku);
    void pinjamBuku(String judulBuku, int durasi);
    void kembalikanBuku(String judulBuku);
}