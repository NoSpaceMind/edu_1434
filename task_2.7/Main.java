/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы. То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30. Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/

public class Main {
    public static void main(String[] args) {
        int num = 31;
        for (int i = 1; i < num; i++) {
            if(num%i == 0) System.out.println("true, число  делится на " + i);
            else System.out.println("false, число не делится на " + i);
        }
    }
}