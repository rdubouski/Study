package days.day6;

class Car {
    private int year;
    private String model;
    private String color;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("This is auto");
    }

    public int yearDifference(int year) {
        return  year - this.year;
    }
}

class Moto {
    private int year;
    private String model;
    private String color;

    Moto(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("This is moto");
    }

    public int yearDifference(int year) {
        return  year - this.year;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setModel("Lada");
        lada.setColor("Black");
        lada.setYear(2019);

        Moto java = new Moto("Java", "White", 2020);

        lada.info();
        java.info();

        System.out.println(lada.yearDifference(2022));
        System.out.println(java.yearDifference(2022));

    }
}
