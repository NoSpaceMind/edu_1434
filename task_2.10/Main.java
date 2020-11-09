/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 4, 3, 2, 1};
        for (int i = 0; i < num.length-1; i++) {
            if (num[i] == (num[i+1]) ) {
                System.out.println("да");
                break;
            }
            else if (i == num.length-2)
                System.out.println("нет");
        }
    }
}
