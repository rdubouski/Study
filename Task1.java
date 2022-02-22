package days.day11;

class Warehouse {
    private static int countOrder;
    private static int balance;

    public static int getCountOrder() {
        return countOrder;
    }

    public static void setCountOrder(int countOrder) {
        countOrder = countOrder;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        balance = balance;
    }

    public String toString() {
        return ("Count = " + countOrder + " balance = " + balance);
    }
}

class Picker implements Worker {
    private int salary;

    public int getSalary() {
        return salary;
    }

    private int counter;
    @Override
    public void doWork() {
        counter++;
        salary += 80;
        Warehouse.setCountOrder(Warehouse.getCountOrder() + 1);
        if (counter == 1500) {
            counter = 0;
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary *= 3;
    }
}

class Courier implements Worker {
    private int salary;

    public int getSalary() {
        return salary;
    }

    private int counter;
    @Override
    public void doWork() {
        counter += 1000;
        salary = salary + 100;
        Warehouse.setBalance(Warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (counter == 1000000) {
            counter = 0;
            salary *= 2;
        }
    }
}

interface Worker {
    public void doWork();
    public void bonus();
}

public class Task1 {
    public static void main(String[] args) {

    }
}
