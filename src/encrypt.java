public class encrypt {
    public static String encrypt(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();
        int keyLength = key.length();
        int keyIndex = 0;

        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                int shift = key.charAt(keyIndex) - 'A';
                char encryptedChar = (char) ((c - 'A' + shift) % 26 + 'A');
                ciphertext.append(encryptedChar);
                keyIndex = (keyIndex + 1) % keyLength;
            } else {
                ciphertext.append(c);
            }
        }

        return ciphertext.toString();
    }
}
