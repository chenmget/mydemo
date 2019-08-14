package io;

import java.io.IOException;
import java.net.Socket;

public class IOClient {
    public static void main(String[] args) {
        new Thread(()->{
            try {
                Socket socket = new Socket("127.0.0.1" ,8000);
                while(true){
                    socket.getOutputStream().write((System.currentTimeMillis()+"hello").getBytes());
                    socket.getOutputStream().flush();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
