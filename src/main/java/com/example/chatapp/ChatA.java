package com.example.chatapp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatA{
    public String message;
    public ChatA(String m){
        message=m;
    }

    public static void main(String[] args) throws IOException {

       Thread t1=new Thread(new ChatThred());
        t1.start();
//        Thread t2=new Thread(new ChatThred());
//        t2.start();

        try {
            ServerSocket serverSocket=new ServerSocket(3304);
            Socket ss=serverSocket.accept();
            DataInputStream din=new DataInputStream(ss.getInputStream());
            DataOutputStream dos=new DataOutputStream(ss.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str="",str2="";
            while (!str.equals("stop")){
                System.out.println("chat main\n");
                str=br.readLine();
                dos.writeUTF(str);
                str2=din.readUTF();
                System.out.println("client:"+str2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
