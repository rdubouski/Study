package Unit1;

public class Task10 {

    public static void main(String[] args) {

        double inch, meter;
        int counter;

        counter = 0;

        for (inch = 1; inch <= 144; inch++){
            meter = inch / 39.37;
            System.out.println(inch + " inch = " + meter + " meter");
            counter++;
            if (counter == 12){
                System.out.println();
                counter = 0;
            }
        }

    }

}
