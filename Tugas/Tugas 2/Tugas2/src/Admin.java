public class Admin {
    String username = "Admin323";
    String password = "password323";

    void login(String userInput, String passInput) {
        if ((userInput.equals(username)) && (passInput.equals(password))){
            System.out.println("Login admin berhasil");
        } else {
            System.out.println("login admin gagal, username atau nim salah");
        }
    }
}