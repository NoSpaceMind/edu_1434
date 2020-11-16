/*
* Дана коллекция имён.
* 1) удалить все повторяющиеся имена из коллекции
* 2) вывести коллекцию на экран
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");
        Collections.sort(names);
        int index = 0;
        for (int i = 0; i < names.size()-1; i++) {
            index = i;
            if (names.get(index) == names.get(index + 1)) {
                names.remove(index);
            }
        }
        System.out.println(names);
    }
}
