public class RekeningBank {  // Kelas untuk merepresentasikan rekening bank

    private String nomorRekening;  // Atribut untuk nomor rekening
    private String namaPemilik;    // Atribut untuk nama pemilik rekening
    private double saldo;          // Atribut untuk saldo di rekening

    //Untuk menginisialisasi atribut rekening
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;  // Menginisialisasi nomor rekening
        this.namaPemilik = namaPemilik;      // Menginisialisasi nama pemilik
        this.saldo = saldo;                  // Menginisialisasi saldo awal
    }

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);  // Cetak nomor rekening
        System.out.println("Nama Pemilik: " + namaPemilik);      // Cetak nama pemilik
        System.out.println("Saldo: Rp " + saldo);               // Cetak saldo
    }

    // Method untuk menyetor uang ke rekening
    public void setorUang(double jumlah) {
        saldo += jumlah;  // Menambahkan jumlah yang disetor ke saldo
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);  // Cetak informasi transaksi
    }

    // Method untuk menarik uang dari rekening
    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {  // Cek apakah saldo mencukupi untuk penarikan
            saldo -= jumlah;  // Kurangi saldo dengan jumlah yang ditarik
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);  // Cetak informasi sukses
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);  // Cetak informasi gagal
        }
    }
}