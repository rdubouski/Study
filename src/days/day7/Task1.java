package days.day7;

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

    public void info() {
        System.out.println("Producer: " + producer + ", year: " + year + ", length: " + length + ", weight: " + weight + ", fuel: " + fuel);
    }

    public void fillUp(double fuel) {
        this.fuel = this.fuel + fuel;
    }

    public static void compareAirplanes(Airplane a1, Airplane a2) {
        if (a1.length > a2.length) {
            a1.info();
        } else a2.info();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Airplane concord = new Airplane("Concord", 1955, 158, 3000);
        Airplane aerobus = new Airplane("Aerobus", 1960, 170, 2000);
        Airplane.compareAirplanes(concord, aerobus);
        concord.setLength(200);
        Airplane.compareAirplanes(concord, aerobus);
    }
}
