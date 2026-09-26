package lecture20_input_output;

import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        // using this we can since data from os coming in buffer that mean it can use
        // take the first byte only
        // int x = System.in.read();
        // System.out.println(x);
        // System.out.println((char) x);

        // To Take the all string.
        String s = "";
        int y = System.in.read();

        // end of string now there is issue in this for every byte we need to take it
        // from the OS buffer. to solve this problem we use bufferReader
        while (y != '\n') {
            s += (char) y;
            y = System.in.read();
        }

        System.out.println(s);

    }
}
