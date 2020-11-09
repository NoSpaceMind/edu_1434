/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int num[] = {2, 3, 4, 5};
        int mult = num [0];
        for (int i = 1; i < num.length; i++) {
            mult = mult * num[i];
            System.out.println(mult);
        }
    }
}
