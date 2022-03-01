package Unit10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task8 {
    public static void main(String[] args) {
        int i;

        try (FileReader fin = new FileReader("./txt/source.txt");
             FileWriter fout = new FileWriter("./txt/target.txt")) {
            do {
                i = fin.read();
                if ((char) i == ' ') {
                    i = '-';
                }
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Input-output error : " + exc);
        }
    }
}
