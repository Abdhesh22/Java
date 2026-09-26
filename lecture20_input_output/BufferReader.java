package lecture20_input_output;

import java.io.*;

public class BufferReader {
    public static void main(String[] args) throws IOException {

        /**
         * To take input from the keyboard, we use System.in, which is an InputStream.
         *
         * InputStream works with a stream of bytes, but BufferedReader works with
         * characters.
         *
         * InputStreamReader comes into the picture here.
         * It converts the byte stream into a character stream.
         *
         * BufferedReader:
         * - Reads a chunk of characters from the underlying stream.
         * - Stores them in an internal buffer in memory.
         * - Provides the characters to the program when required.
         * - Read all the input to strings for we need to type casted it.
         * - To solve problem java introduced the java 1.5 version
         */

        InputStreamReader isr = new InputStreamReader(System.in);
        // Converts byte stream (System.in) into character stream.

        BufferedReader br = new BufferedReader(isr);
        // Buffers the character stream for efficient reading.

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.println("Hello, " + name);
    }
}
