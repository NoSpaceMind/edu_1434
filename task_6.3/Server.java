package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        int port;
        ArrayList<Socket> clients = new ArrayList<>();
        Socket socket = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8282);
            System.out.println("INFO: Сервер запущен");
            while (true) {
                socket = serverSocket.accept(); // Ожидаем клиента
                port = socket.getPort();           
                DataInputStream in = new DataInputStream(socket.getInputStream()); // Поток ввода
                DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // Поток вывода
                clients.add(socket); //Добавляем клиента в список
                System.out.println("Клиент подключился по " + port + " порту");
                Thread thread = new Thread(new Runnable() { 
                    @Override
                    public void run() {
                        try {
                            while (true) {

                                System.out.println("Ожидаем сообщение...");
                                String request = in.readUTF();   
                                System.out.println("Клиент прислал сообщение: " + request);

                                for (Socket socket : clients) { 
                                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                                    out.writeUTF(request);
                                }
                            }
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
