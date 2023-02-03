package com.example.chatapp;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Myserver {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Adder stub=new AdderRemote();
        Naming.rebind("rmi://localhost:5000/sonoo",stub);
    }
}
