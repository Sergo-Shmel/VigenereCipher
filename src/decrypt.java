public class decrypt {

 public static String decrypt(String ciphertext, String key) {
        StringBuilder plaintext = new StringBuilder();
        int keyLength = key.length();
        int keyIndex = 0;

        for (char c : ciphertext.toCharArray()) {
            if (Character.isLetter(c)) {
                int shift = key.charAt(keyIndex) - 'A';
                char decryptedChar = (char) ((c - 'A' - shift + 26) % 26 + 'A');
                plaintext.append(decryptedChar);
                keyIndex = (keyIndex + 1) % keyLength;
            } else {
                plaintext.append(c);
            }
        }

        return plaintext.toString();
    }
}
