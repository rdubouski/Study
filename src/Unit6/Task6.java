package Unit6;

class Backprint{
    String str;
    Backprint(String s){
        str = s;
    }

    void backprint(int i){
        if(i < str.length() - 1){
            backprint(i + 1);
        }
        System.out.print(str.charAt(i));
    }
}

public class Task6 {
    public static void main(String[] args) {
        Backprint oBack = new Backprint("test string");
        oBack.backprint(0);
    }
}
