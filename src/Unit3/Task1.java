package Unit3;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        char ch;

        System.out.println("Input char: ");
        do {
            ch = (char) System.in.read();
            if (ch == ' ') count++;
        } while (ch != '.');
        System.out.println("Space count = " + count);
    }
}
