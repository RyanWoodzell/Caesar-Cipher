package src;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, welcome to Ryan's Caesar Cipher: ");
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();

        System.out.println("Please enter a shift value: ");

        int shift = sc.nextInt();

        CaesarCipher cipher = new CaesarCipher(shift, text);
        cipher.encrypt();
    }
}
