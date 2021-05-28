package com.koteswara.singletonapplication;

public class SingletonSyncronised {
    //Above implementation works fine and provides thread-safety but it reduces the performance because of the cost associated with the synchronized method, although we need it only for the first few threads who might create the separate instances
    private static SingletonSyncronised singletonInstance;
    private SingletonSyncronised(){}
    synchronized public static  SingletonSyncronised   getSingletonInstance(){
        if (singletonInstance==null){
            singletonInstance=new SingletonSyncronised();
        }
        return singletonInstance;
    }
}
