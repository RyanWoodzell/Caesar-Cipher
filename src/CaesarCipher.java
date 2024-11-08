package src;

import java.util.ArrayList;

public class CaesarCipher {
    int shift;
    String text;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] seperatedString;
    String encryptedString;
    //int[] numbers = java.util.stream.IntStream.rangeClosed(1, 26).toArray();



    public CaesarCipher(int shift, String text) {
        this.shift = shift;
        this.text = text;
        seperatedString = text.toCharArray();

    }

    public void encrypt() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < seperatedString.length-1; i++) {
            if(seperatedString[i]==' '){
                continue;
            } else {
                int positionInAlphabet = seperatedString[i];
                seperatedString[i]= alphabet[(shift + positionInAlphabet)  % alphabet.length];
            }

            stringBuilder.append(seperatedString[i]);
            //encryption algorithm
        }
        System.out.println(stringBuilder.toString());
    }

}
