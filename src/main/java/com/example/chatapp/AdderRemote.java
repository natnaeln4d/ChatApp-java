package com.example.chatapp;

import java.rmi.RemoteException;
import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject  implements Adder {
    AdderRemote()throws RemoteException{
        super();
    }
    @Override
    public int adder(int x, int y) throws RemoteException {
        return x+y;
    }
}
