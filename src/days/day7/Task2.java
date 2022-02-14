package days.day7;

class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
    }

    public int getStamina() {
        return  stamina;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        if (stamina > MIN_STAMINA) {
            stamina = stamina - 1;
        }
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if(countPlayers < 6) {
            System.out.println("Teams not full. Last " + (6 - countPlayers) + " free place");
        } else {
            System.out.println("Teams is full");
        }
    }

}

public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player(90);
        Player p2 = new Player(91);
        Player p3 = new Player(92);
        Player p4 = new Player(93);
        Player p5 = new Player(94);
        Player p6 = new Player(95);
        Player.info();

        Player p7 = new Player(96);
        Player p8 = new Player(97);
        Player.info();

        while (p6.getStamina() != 0){
            p6.run();
        }
        p6.run();
        Player.info();

        Player p9 = new Player(98);
        Player.info();
    }
}
