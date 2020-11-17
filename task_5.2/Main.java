/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Заполните базу данных (город/фамилия) ");

        List<String> citys = new ArrayList<>();
        List<String> familys = new ArrayList<>();

        while (true) {
            System.out.print("Введите город: ");
            String answerCity = scanner.nextLine();
            System.out.print("Введите фамилию: ");
            String answerFamily = scanner.nextLine();

            if (answerCity.isEmpty() || answerFamily.isEmpty()) {
                System.out.println("-Конец-записи-");
                break;
            }
            citys.add(answerCity);
            familys.add(answerFamily);
            System.out.println("Доступные города: " + citys);
        }

        System.out.println("Доступные города: " + citys);
        System.out.print("Введите интересующий Вас город: ");
        String answerCity = scanner.nextLine();


        if (citys.indexOf(answerCity) == -1) {
            System.out.println("Такого города нет в списке");
        } else System.out.println(familys.get(citys.indexOf(answerCity)));
    }
}
