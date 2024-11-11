package src;

import java.util.Scanner;

public class UserInterface {
    public void run() {

        //variable for program while loop.
        boolean run = true;

        System.out.println("Hello, welcome to Ryan's Caesar Cipher: ");

        while(run) {

            //variable that updates when user is asked if they would like to run the program again.
            boolean runCheck = true;

            Scanner sc = new Scanner(System.in);

            //get text from input
            System.out.println("Please enter your text: ");
            String text = sc.nextLine();

            //get key value.
            System.out.println("Please enter a key value: ");
            int shift = sc.nextInt();

            //create cypher object
            CaesarCipher cipher = new CaesarCipher(shift, text);

            //encrypt text
            String encryptedText = cipher.encrypt();
            System.out.println("Encrypted: " + encryptedText);

            //clear sc
            sc.nextLine();

            //decrypt text
            System.out.print("enter a message you would like to decrypt: ");
            String message = sc.nextLine();

            //get key value
            System.out.print("Please enter key value: ");
            shift = sc.nextInt();
            CaesarCipher decipher = new CaesarCipher(shift, message);

            //decrypt text
            String decryptedText = decipher.decrypt();
            System.out.println("Decrypted: " + decryptedText);

            //clear sc
            sc.nextLine();

            //run again check
            while(runCheck) {

                System.out.println("Would you like to run again? (Y/N)");
                String answer = sc.nextLine();
                answer = answer.toUpperCase();

                if (answer.equals("N")) {

                    run = false;
                    System.out.println("Have a great day!");
                    runCheck = false;

                } else if (answer.equals("Y")) {

                    runCheck = false;

                } else {

                    System.out.println("Wrong input. Try again.");
                }
            }
        }
    }
}
