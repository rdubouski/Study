package days.day11;

class Warehouse {
    private int countOrder;
    private int balance;

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}

class Picker implements Worker {
    private int salary;
    private final Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        if (warehouse.getCountOrder() % 1500 ==0) bonus();
    }

    @Override
    public void bonus() {
        salary *= 3;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}

class Courier implements Worker {
    private int salary;
    private final Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
        if (warehouse.getBalance() % 1000000 == 0) bonus();
    }

    @Override
    public void bonus() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}

interface Worker {
    void doWork();
    void bonus();
}

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        System.out.println(warehouse + " " + picker + " " + courier);

        picker.doWork();
        courier.doWork();
        System.out.println(warehouse + " " + picker + " " + courier);

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        System.out.println(warehouse + " " + picker + " " + courier);

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        System.out.println(warehouse + " " + picker + " " + courier);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        System.out.println(warehouse2 + " " + picker2 + " " + courier2);

        picker2.doWork();
        courier2.doWork();
        System.out.println(warehouse2 + " " + picker2 + " " + courier2);
        
        System.out.println(warehouse + " " + picker + " " + courier);

    }
}