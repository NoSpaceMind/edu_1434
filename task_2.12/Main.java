/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

public class Main {
    public static void main(String[] args) {
        int num[] = {2, 8, 8, 4, 6, 4, 4, 4, 4, 12, 12, 14};
        int dbl = 1;
        int x = 0;
        for (int i = 0; i < num.length-1; i++) {
            if (num[i] == num[i+1]){
               dbl++;
               if (x < dbl) {
                   x = dbl;
                   System.out.println(x);
                }
            }
            else dbl = 1;
        }
        System.out.println(x);
    }
}
