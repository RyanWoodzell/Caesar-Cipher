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

### Example Usage

When the program is executed, the user is prompted to enter a message they would like to encrypt, and to input a key value. The program encrypts this message based on the key value.

![image](https://github.com/user-attachments/assets/cbf8b829-fec5-4b45-9168-ef994d9c8369)

After the encryption, the user is promted to enter a message they would like to decrypt, along with the associated key value. The program then decrypts the message based on the key value and asks the user if they would like to run the program again. 

![image](https://github.com/user-attachments/assets/2257ef79-8372-46ed-9aaf-9149d1b91458)


## Lessons Learned

- **Cryptography Fundamentals**:  This project was my first experience with cryptography, and it provided a solid foundation in understanding the principles behind encryption and decryption. It sparked my interest in exploring more advanced cryptographic techniques and their real-world applications.
- **Caesar Cipher Implentation**: I learned how to implement the Caesar Cipher, one of the most basic encryption algorithms. This project allowed me to gain hands-on experience with the mechanics of shifting letters in the alphabet and how simple mathematical operations can be used for data encryption and decryption.
- **Problem-Solving with Algorithms**: Through this project, I developed a better understanding of how algorithms can be used to solve complex problems in a structured way. I learned how to implement and modify algorithms to meet specific requirements, such as handling non-alphabetic characters or ensuring shift values remain within a valid range.

## Future Enhancements

There are a few things I would like to add to this project:

- **Explicit Operations**: I plan to further develop the user interface to allow users to select different types of operations (e.g., encrypt, decrypt, and possibly even options for more advanced ciphers). This will make the tool more flexible and user-friendly.
- **Graphical User Interface (GUI)**: In the future, I plan on learning a Java GUI framework, such as Swing or JavaFX, to create a more interactive and visually appealing interface. A GUI would allow users to interact with the program through buttons, text fields, and other graphical elements, improving the overall user experience.
