public class Mahasiswa {
    String nama = "gagah yudhistira ramadhan";
    long nim = 202410370110323L;

    void displayInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    void login(String namaInput, long nimInput){
        if ((namaInput.equalsIgnoreCase(nama)) && (nimInput == nim)){
            System.out.println("login berhasil");
            displayInfo();
        } else {
            System.out.println("login mahasiswa gagal. nama atau nim salah");
        }
    }
}