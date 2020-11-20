public class MultiThread {
    public static void main(String[] args) {

// Способ #1
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.task = "Стираем бельё";
        t2.task = "Моем посуду";
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    String task;
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.task+" выполнен на "+i+"%");
        }
    }
}

/*
// Способ #2
        Thread t1 = new Thread(new MyRunnableClass("Стираем бельё"));
        Thread t2 = new Thread(new MyRunnableClass("Моем посуду"));
        t1.start();
        t2.start();
    }
}
class MyRunnableClass implements Runnable{

    String task;
    public MyRunnableClass(String task){
        this.task = task;
    }
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(this.task+" выполнен на "+i+"%");
        }
    }
}
*/

/*
// Способ #3
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run(){
                for (int i = 0; i < 100; i++) {
                    System.out.println("Стираем бельё выполнен на "+i+"%");
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Моем посуду выполнен на "+i+"%");
                }
            }
        });
        t1.start();
        t2.start();
    }
}

class MyRunnableClass implements Runnable{

    String task;
    public MyRunnableClass(String task){
        this.task = task;
    }
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(this.task+" выполнен на "+i+"%");
        }
    }
}
*/
