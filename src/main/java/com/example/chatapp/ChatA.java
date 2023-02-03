package com.example.chatapp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatA{
public   ServerSocket serverSocket;
public Socket ss;
public  DataInputStream din;
public DataOutputStream dos;
public BufferedReader br;
public  String str="",str2="";



    public void connectToServer() throws IOException {
        serverSocket=new ServerSocket(3304);
        ss=serverSocket.accept();
        din=new DataInputStream(ss.getInputStream());
        dos=new DataOutputStream(ss.getOutputStream());
        br=new BufferedReader(new InputStreamReader(System.in));

    }
    public void senddata(String message) {
        while (!str.equals("stop")) {
            try {
                System.out.println("chat main\n");
                str = message;
                dos.writeUTF(str);
            } catch (IOException E) {
                System.out.println(E.getMessage());
            }


        }
    }
    public String readdata(){
        try {
            while(str2=="stop") {
                str2 = din.readUTF();
            }

        }catch (IOException E){
            System.out.println(E.getMessage());
        }
        return str2;
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new ChatThred());
        t1.start();
        ChatA chatA=new ChatA();
        chatA.readdata();


    }

}

