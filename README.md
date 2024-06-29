# The-Caesar-Cipher
javac CaesarCipher.java
java CaesarCipher
How It Works
Encrypt Function:

Iterates through each character in the message.
If the character is a letter, it shifts it by the specified amount, preserving the case (uppercase or lowercase).
Adds the shifted character to the encrypted message.
Decrypt Function:

Calls the encrypt function with a shift value of 26 - shift, effectively reversing the encryption process.
Main Function:

Prompts the user for a message and a shift value.
Encrypts the message and prints the encrypted text.
Decrypts the encrypted message and prints the decrypted text to verify correctness.
