package com.example.chatapp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerA {

    public ServerSocket serverSocket;
    public Socket socket;
    public DataOutputStream dout;
    public DataInputStream din;
    public BufferedReader bin;
    public String str="",str2="";
    ServerA() throws IOException {
        serverSocket=new ServerSocket(3309);
        socket=serverSocket.accept();
    }
    public void sendData() throws IOException {
        dout=new DataOutputStream(socket.getOutputStream());
        din=new DataInputStream(socket.getInputStream());
        bin=new BufferedReader(new InputStreamReader(System.in));
        while (!str.equals("stop")){
            str=bin.readLine();
            dout.writeUTF(str);
            str2=din.readUTF();
            System.out.println("->"+str2);
        }

    }
    public String revData() throws IOException {


          return str2;
    }

    public static void main(String[] args) throws IOException {
        ServerA s1=new ServerA();
        s1.sendData();
        s1.revData();
    }

}

