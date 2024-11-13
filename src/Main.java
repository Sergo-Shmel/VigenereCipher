public class Main {
    public static void main(String[] args) {
        String plaintext = "HELLO WORLD";
        String key = "KEY";

        String encryptedText = encrypt.encrypt(plaintext, key);
        System.out.println("Зашифрованный текст: " + encryptedText);

        String decryptedText = decrypt.decrypt(encryptedText, key);
        System.out.println("Расшифрованный текст: " + decryptedText);
    }
}
