package src;

public class CaesarCipher {

    //necessary fields
    private int shift;
    private String text;

    public CaesarCipher(int shift, String text) {

        // Normalize shift to a positive number within 0-25
        this.shift = (shift % 26 + 26) % 26;
        this.text = text;
    }

    private char shiftChar(char c, int shift) {

        if (Character.isLowerCase(c)) {

            //returns ASCII 97-122
            return (char) ('a' + (c - 'a' + shift + 26) % 26);

        } else if (Character.isUpperCase(c)) {

            //returns ASCII 65-90
            return (char) ('A' + (c - 'A' + shift + 26) % 26);

        } else {

            //Case for non-alphabet character
            return c;
        }
    }

    public String encrypt() {

        StringBuilder encryptedText = new StringBuilder();

        for (char c : text.toCharArray()) {

            //for every character in text, shift char
            encryptedText.append(shiftChar(c, shift));
        }
        return encryptedText.toString();
    }

    public String decrypt() {

        StringBuilder decryptedText = new StringBuilder();

        for (char c : text.toCharArray()) {

            //for every character in text, shift char
            decryptedText.append(shiftChar(c, -shift));
        }
        return decryptedText.toString();
    }

}
