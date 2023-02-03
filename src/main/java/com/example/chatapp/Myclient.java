package com.example.chatapp;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Myclient {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        Adder stub=(Adder) Naming.lookup("rmi://localhost:5000/sonoo");
        System.out.println(stub.adder(2,7));
    }
}
