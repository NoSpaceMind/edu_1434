/*
* Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
* Коллекции вы создаёте сами
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbersFirst = new ArrayList();
        numbersFirst.add(5);
        numbersFirst.add(11);
        numbersFirst.add(10);
        numbersFirst.add(9);
        numbersFirst.add(111);
        numbersFirst.add(-23);
        numbersFirst.add(8);
        numbersFirst.add(-100500);
        ArrayList<Integer> numbersSecond = new ArrayList();
        int index = 0;
        for (int i = 0; i < numbersFirst.size() - 1; i++) {
            index = i;
            if (numbersFirst.get(index) > 0 && numbersFirst.get(index) < 10) {
                numbersSecond.add(numbersFirst.get(index));
            }
        }
        System.out.println(numbersSecond);
    }
}
