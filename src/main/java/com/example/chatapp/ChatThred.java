package com.example.chatapp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatThred implements Runnable{



    @Override
    public void run() {
        Socket socket= null;
        try {
            socket = new Socket("localhost",3304);
            DataInputStream din=new DataInputStream(socket.getInputStream());
            DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str="",str2="";
            while (!str.equals("stop")){
                System.out.println("Chat client\n");
                str=br.readLine();
                dos.writeUTF(str);
                str2=din.readUTF();
                System.out.println("server:"+str2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
