/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/

public class Main {
    public static void main(String[] args) {
        int num[] = {4, 2, 6, 2, 65};
        int index = num.length-1;
        printNum(num, index);
    }

    public static void printNum(int numX[], int index) {
        if (index >= 0) {
            System.out.println(numX[index]);
            index--;
            printNum(numX, index);
        }
    }
}
