package days.day8;

class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public String toString() {
        return ("Producer: " + producer + ", year: " + year + ", length: " + length + ", weight: " + weight + ", fuel: " + fuel);
    }

    public void  fillUp(double fuel) {
        this.fuel = this.fuel + fuel;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Konkord", 1955, 1560, 1000);
        System.out.println(airplane);
    }
}
