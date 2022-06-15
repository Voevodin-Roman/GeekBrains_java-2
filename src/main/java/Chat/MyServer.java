package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//1. Написать консольный вариант клиент\серверного приложения, в котором пользователь может писать сообщения,
// как на клиентской стороне, так и на серверной. Т.е. если на клиентской стороне написать "Привет", нажать Enter
// то сообщение должно передаться на сервер и там отпечататься в консоли. Если сделать то же самое на серверной стороне,
// сообщение соответственно передается клиенту и печатается у него в консоли. Есть одна особенность, которую нужно учитывать:
// клиент или сервер может написать несколько сообщений подряд, такую ситуацию необходимо корректно обработать
//Разобраться с кодом с занятия, он является фундаментом проекта-чата

public class MyServer {
    private DataInputStream in;
    private DataOutputStream out;
    Socket socket;

    public static void main(String[] args) {
        new MyServer().chatLogic();
    }
    public void chatLogic(){
        try (ServerSocket serverSocket = new  ServerSocket(38989)){
            System.out.println("Ждем подключения клиента");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Thread serverThread;
            serverThread = new Thread(() -> {
                while (true){
                    String message = null;
                    try {
                        message = in.readUTF();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if ("/end".equalsIgnoreCase(message)){
                        try {
                            out.writeUTF("/end");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Сервер завершил работу");
                        break;
                    }
                    System.out.println("Сообщение от клиента: " + message);
                }
            });
            serverThread.start();
            while (serverThread.isAlive()) {
                Scanner scanner = new Scanner(System.in);
                out.writeUTF(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
