# Caesar Cipher Program

This program implements the Caesar Cipher algorithm, allowing users to both encrypt and decrypt text using a shift key. The program provides an interactive command-line interface (CLI) that prompts users for input and displays the results of encryption and decryption.

## Features
- **Encryption**: Encrypts a given text string using a Caesar Cipher with a user-defined shift value.
- **Decryption**: Decrypts an encrypted text string using the same shift value used for encryption.
- **Command-Line Interface**: Provides a simple CLI where users can input their text, key values, and choose to run the program multiple times.

## Structure

This project is divided into two main classes:

### 1. `CaesarCipher`
This class handles the core functionality of the Caesar Cipher algorithm, including the logic for both encryption and decryption.

#### Key Features:
- **Encrypt**: Takes a string and shift value, and returns an encrypted string.
- **Decrypt**: Takes a string and shift value, and returns a decrypted string.
- **Shift Handling**: Handles both lowercase and uppercase letters and ensures that non-alphabet characters are left unchanged.

#### Methods:
- `encrypt()`: Encrypts the input text using the provided shift key and returns the encrypted string.
- `decrypt()`: Decrypts the input text using the provided shift key and returns the decrypted string.

### 2. `UserInterface`
This class provides an interactive user interface for the Caesar Cipher program. It allows users to input text, enter a shift key, and then perform encryption and decryption tasks.

#### Key Features:
- **User Input**: Prompts the user to input text and shift values.
- **Encryption/Decryption**: Encrypts and decrypts the text based on user inputs.
- **Repeatability**: After performing encryption and decryption, asks the user if they want to run the program again.

#### Methods:
- `run()`: Runs the interactive program, guiding the user through encryption and decryption steps, and allows the user to choose if they want to repeat the process.

## Usage

### Running the Program
1. **Run the Program**: Create an instance of `UserInterface` and call the `run()` method to start the interactive process.
2. **Input Text and Shift**: The program will prompt you to input a string of text and a shift value (key) for the Caesar Cipher encryption.
3. **Encrypt and Decrypt**: After encryption, the program will allow you to input an encrypted message and decrypt it using the same shift key.
4. **Repeat or Exit**: You will be asked if you want to run the program again. If you input `Y`, the process repeats. If you input `N`, the program exits.

### Example

```java
public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.run(); // Start the program
    }
}
