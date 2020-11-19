public class MultiThread {                              // Класс дл многопоточности
    public static void main(String[] args) {            // основной код данного класса
/*

        // Способ #1
        MyThread t1 = new MyThread();                   //Создаём объект t1 для класса MyThread
        MyThread t2 = new MyThread();                   //Создаём объект t2 для класса MyThread
        t1.task = "Стираем бельё";                      // t1 с параметрами task равными "Стираем бельё"
        t2.task = "Моем посуду";                        // t2 с параметрами task равными "Моем посуду"
        t1.start();                                     // заменяем метод run на start для работы многопоточности
        t2.start();                                     // запускаем метод run(start)
*/

        /*
        // Способ #2
        Thread t1 = new Thread(new MyRunnableClass("Стриаем бельё"));   // создаем поток t1 new Thread с аргументом new MyRunnableClass
        Thread t2 = new Thread(new MyRunnableClass("Моем посуду"));     // создаем поток t2 new Thread с аргументом new MyRunnableClass
        t1.start();                                                     // Стираем бельё
        t2.start();                                                     // Моем посуду
        */


       // Способ #3
        Thread t1 = new Thread(new Runnable() {                 // реализуем метод new Runnable()
            @Override                                           // Переопределяем метод, т.к. run в Thread уже есть
            public void run(){                                  // публичный метод run для запуска потока
                for (int i = 0; i < 100; i++) {                 // выведем 100 раз
                    System.out.println("Стриаем бельё выполнен на "+i+"%");// сообщение
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {                 // реализуем метод new Runnable()
            @Override                                           // Переопределяем метод, т.к. run в Thread уже есть
            public void run() {                                 // публичный метод run для запуска потока
                for (int i = 0; i < 100; i++) {                 // выведем 100 раз
                    System.out.println("Моем посуду выполнен на "+i+"%");// сообщение
                }
            }
        });
        t1.start();                                             // t1.ПУСК
        t2.start();                                             // t2.ПУСК
    }
}


// Класс Способа #2
class MyRunnableClass implements Runnable{          // объявляем Класс MyRunnableClass который исполняет класс Thread (вывод чисел на экран)

    String task;                                    // создаём Строковую переменную "task"
    public MyRunnableClass(String task){            // Создаём конструктор MyRunnableClass принимающий task из main ("Стриаем бельё"и"Моем посуду")
        this.task = task;                           // Этот task = String task, что взяли из main
    }
    @Override                                       // Переопределяем метод, т.к. run в Thread уже есть
    public void run(){                              // публичный метод run для запуска потока
        for (int i = 0; i < 100; i++) {             // выведем 100 раз
            System.out.println(this.task+" выполнен на "+i+"%"); // сообщение
        }
    }
}


/*
// Класс Способа #1
class MyThread extends Thread {                         // бъявляем Класс MyThread который расширяет класс Thread (вывод чисел на экран)
    String task;                                        // создаём Строковую переменную "task"
    @Override                                           // Переопределяем метод, т.к. run в Thread уже есть
    public void run(){                                  // публичный метод run для запуска потока
        for (int i = 0; i < 100; i++) {                 // выведем 100 раз
            System.out.println(this.task+" выполнен на "+i+"%"); // сообщение
        }
    }
}
*/
