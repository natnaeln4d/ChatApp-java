package com.example.chatapp;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientA {
    Socket ss;
    DataOutputStream out;
    DataInputStream inputStream;
    BufferedInputStream bufferedInputStream;
    String str="",str2="";

    ClientA() throws IOException {
        ss=new Socket("localhost",3309);

    }
    public void sendData(String msg) throws IOException {
        out=new DataOutputStream(ss.getOutputStream());
        inputStream=new DataInputStream(ss.getInputStream());
        while (!str.equals("stop")){
            str=msg;
            out.writeUTF(str);
            str2=inputStream.readUTF();
            System.out.println("*"+str2);

        }
    }
    public String revData() throws IOException {

        return str2;

    }
     public static void main(String[] args) throws IOException {
         System.out.println("chat with server");
         Scanner in=new Scanner(System.in);
         ClientA c1=new ClientA();
         String msg;
         msg=in.nextLine();
         c1.sendData(msg);
         c1.revData();


    }
}
