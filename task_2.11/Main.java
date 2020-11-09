/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 4, 3, 2, 1};
        int mult = num[0];
        for (int i = 1; i < num.length; i++) {
            mult = mult + num[i];
            int element = i + 1;
            if (mult > 10) {
                System.out.println("Понадобилось " + element + " элементов массива. Сумма больше 10");
                break;
            }
        }
    }
}
