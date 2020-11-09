/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму вклада:");
        float a = scan.nextInt();
        System.out.print("Введите процент вклада:");
        float b = scan.nextInt();
        float sum = a;
        float percent = b / 100;
        for (int i = 1; i < 6; i++) {
            sum = sum + sum * percent;
            DecimalFormat f = new DecimalFormat("##.00");
            System.out.println("Капитализация на "+ i +" год будет равна "+ f.format(sum) + " у.е.");
        }
    }
}
