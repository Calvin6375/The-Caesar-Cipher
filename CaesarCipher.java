import java.util.Scanner;

public class CaesarCipher {

    // Encrypts a message using the Caesar Cipher
    public static String encrypt(String message, int shift) {
        StringBuilder encryptedMessage = new StringBuilder();
        
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) ((character - base + shift) % 26 + base);
            }
            encryptedMessage.append(character);
        }
        
        return encryptedMessage.toString();
    }

    // Decrypts a message using the Caesar Cipher
    public static String decrypt(String message, int shift) {
        return encrypt(message, 26 - shift);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a message:");
        String message = scanner.nextLine();

        System.out.println("Enter a shift value:");
        int shift = scanner.nextInt();

        String encryptedMessage = encrypt(message, shift);
        System.out.println("Encrypted Message: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, shift);
        System.out.println("Decrypted Message: " + decryptedMessage);

        scanner.close();
    }
}
