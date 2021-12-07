package Unit2;

public class Task11 {
    public static void main(String[] args) {
        int i, j;
        boolean bol;

        for (i = 2; i <= 100; i++){
            bol = true;
            for (j = 2; j <= i / 2; j++){
                if ((i % j) == 0){
                    bol = false;
                }
            }
            if (bol){
                System.out.println(i);
            }
        }
    }
}
