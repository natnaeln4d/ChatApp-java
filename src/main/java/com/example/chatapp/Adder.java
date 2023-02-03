package com.example.chatapp;
import java.rmi.*;

public interface Adder extends Remote{
    public int adder(int x,int y) throws RemoteException;
}
