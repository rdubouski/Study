package Unit3;

import java.io.IOException;

public class Task10 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        char ch;

        System.out.println("Input char: ");
        do {
            ch = (char) System.in.read();
            if (ch > 'A' && ch < 'Z'){
                ch += 32;
                count++;
            } else if (ch > 'a' && ch < 'z'){
                ch -= 32;
                count++;
            }
            System.out.println(ch);
        } while (ch != '.');
        System.out.println("Change count = " + count);
    }
}
