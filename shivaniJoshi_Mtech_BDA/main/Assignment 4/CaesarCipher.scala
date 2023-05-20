/*
The Caesar cipher is one of the earliest known and simplest ciphers. It is a type of substitution
cipher in which each letter in the plaintext is ‘shifted’ a certain number of places down the alphabet.
For example, with a shift of 1, A would be replaced by B, B would become C, and so on. The
method is named after Julius Caesar, who apparently used it to communicate with his generals.

1.Implement Encryption and Decryption functions of Caesar cipher. 2. Then implement a Cipher
function which take Encryption and Decryption functions to process the data.
 */
object CaesarCipher {

    def encrypt(text: String, shift: Int): String = {
      val normalizedShift = shift % 26
      text.map { c =>
        if (c.isLetter) {
          val base = if (c.isLower) 'a' else 'A'
          val shiftedChar = ((c - base + normalizedShift) % 26 + base).toChar
          shiftedChar
        } else {
          c
        }
      }
    }

    def decrypt(ciphertext: String, shift: Int): String = {
      encrypt(ciphertext, -shift)
    }

    def cipher(data: String, shift: Int, operation: (String, Int) => String): String = {
      operation(data, shift)
    }

    def main(args: Array[String]): Unit = {
      val plaintext = "Hello, World!"
      val shift = 3

      val encryptedText = cipher(plaintext, shift, encrypt)
      println("Encrypted Text: " + encryptedText)

      val decryptedText = cipher(encryptedText, shift, decrypt)
      println("Decrypted Text: " + decryptedText)
    }



}
