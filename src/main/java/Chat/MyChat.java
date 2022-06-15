package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyChat{
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public static void main(String[] args) {
        new MyChat().start();
    }
    public void start(){
        try {
            openConnection();
            Scanner scanner = new Scanner(System.in);
            while (true){
                String scannerText = scanner.nextLine();
                if(scannerText.equals("/end")){
                    sendMessage(scannerText);
                    break;
                }else {
                    sendMessage(scannerText);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage(String message) {
        try {
            out.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openConnection() throws IOException {
        socket = new Socket("127.0.0.1",38989);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        new Thread(() -> {
            try {
                while (true){
                    final String message = in.readUTF();
                    if ("/end".equalsIgnoreCase(message)){
                        System.out.println("Сообщение от сервера:  " + message);
                        break;
                    }
                    System.out.println("Сообщение от сервера:  " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                closeConnection();
            }
        }).start();
    }

    private void closeConnection() {
        if (in != null){
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (out != null){
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (socket != null){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
