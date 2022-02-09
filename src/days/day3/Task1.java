package days.day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String city, country;
        while (true){
            System.out.println("Input city: ");
            Scanner scanner = new Scanner(System.in);
            city = scanner.nextLine();
            switch (city){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кельн":
                    System.out.println("Германия");
                    break;
                case "Stop": return;
                default:
                    System.out.println("incorrect city");
            }
        }
    }
}