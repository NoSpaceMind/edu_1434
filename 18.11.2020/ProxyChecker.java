import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class ProxyChecker {                                                 // класс ProxyChecker
    public static void main(String[] args) {                                // основной код данного класса
        ArrayList<String> ipList = new ArrayList<>();
        try {                                                               // исключаем ошибку (ввода/вывода)
                                                                            // создаём для чтения файлов объект reader через класс FileReader
            FileReader reader = new FileReader("C://java/ip.txt");  // читаем ip.txt со списком адресов
            int c;                                                          // создаём переменную
            String proxy = "";                                              // создаём пустую ("") Строку для переменной "proxy"
            while ((c=reader.read()) != -1){                                // счиваем reader посимвольно (до -1  при окончании всех символов)
                if (c == 13){                                               // Если "c" будет равна "13"
                    continue;                                               // пропустить участок кода
                }else if (c == 10){                                         // Или Если "c" будет равна "10"
                    ipList.add(proxy);                                      // в ipList добавляем содержимое proxy
                    proxy="";                                               // далее очищаем("") содежимое proxy
                }else if( c != 9) // 9 - это табуляция                      // Или Если "c" не равна "9"
                    proxy = proxy + (char) c;                               // (char) - преобразование порядкового числа "с" к символу (по таблице ASCII)
                else                                                        // или
                    proxy += ":";                                           //Если "c = 9" запишем в "proxy" знак ":" (на место этой 9)
            }
            for (String ipString: ipList) {                                 // Из ipList берем ipString и делим его по ":", получая массив 2х эл-в
                String ip = ipString.split(":")[0];                    // [0]й эл-т из ipString будет ip
                int port = Integer.parseInt(ipString.split(":")[1]);   // [1]й эл-т из ipString будет port. port переводим из строки в Integer(число)
                MyThread t1 = new MyThread(ip,port);                        // создаём объект MyThread(поток) с названием "t1" и констркутором с параметрами (ip,port)
                t1.start();                                                 // ПУСК
            }
        } catch (IOException e) {                                           // IO - все ошибки Input и Output (ввода/вывода)
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread{                                              // объявляем Класс MyThread который расширяет класс Thread
    String ip;                                                              // объявляем Строковую переменную ip
    int port;                                                               // объявляем Числовую переменную port
    public MyThread(String ip,int port){                                    // создаём конструктор MyThread принимающий Строковую переменную ip и Числовую port
        this.ip = ip;                                                       // эта ip = String ip, что взяли из MyThread
        this.port = port;                                                   // этот port = int port, что взяли из MyThread
    }
    @Override                                                               // Переопределяем, т.к. run в Thread уже есть
    public void run(){                                                      // метод run для запуска потока
        System.out.println("Проверяю "+ip+":"+port);                        // выводим что проверяем
        try {                                                               // исключаем ошибку (ввода/вывода)
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip,port)); //
            URLConnection connection = new URL("https://www.google.ru/").openConnection(proxy); // принимем Методом URLConnection на вход ip и port. openConnection - для подключения
            InputStream is = connection.getInputStream();                   // getInputStream принимает поток данных из connection в "is" (в байтах)
            InputStreamReader reader = new InputStreamReader(is);           // reader перечитывает на вход поток данных из InputStreamReader(is)
            char[] buffer = new char[256];                                  // массив(buffer) символов для входящих страниц на [256] символов
            int c;                                                          // переменная для хранения символов

                                                                            //StringBuilder в Java — класс, представляющий последовательность символов
            StringBuilder stringBuilder = new StringBuilder();              // создаём объект stringBuilder (изменяющуюся строку)

            while ((c = reader.read(buffer)) != -1){                        // До тех пор, пока из buffer не закончатся идти данные, мы будем считывать
                stringBuilder.append(buffer,0,c);                      // в stringBuilder.добавляем(строку из buffer,начиная писать с "0", длинной "с")
            }
            reader.close();                                                 // закрываем reader
            System.out.println(stringBuilder+"РАБОТАЕТ!!!!!!!!!!");         // Ввыводим в консоль всё полученное через stringBuilder

        } catch (IOException e) {                                           // IO - все ошибки Input и Output (ввода/вывода)
            System.out.println("ip: "+ip+" не работает");                   // Ввыводим в консоль нерабочий ip
        }
    }
}
