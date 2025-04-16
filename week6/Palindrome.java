package week6;
import java.util.Scanner; // Import Scanner untuk membaca imputan

// Kelas Main (program utama)
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner

        // Meminta input dari pengguna
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine(); // Membaca input yang kita input

        // Membuat objek TextGame dan menampilkan hasil
        TextGame game = new TextGame();
        game.displayResult(input);

        scanner.close(); // Menutup scanner
    }
}