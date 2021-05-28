package com.koteswara.singletonapplication;

public class Singleton {

    //classic decalraion The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, it can cause issues if multiple threads are inside the if condition at the same time.
    private static Singleton singletonInstance;
    private Singleton(){}
    public static Singleton getSingletonInstance(){
        if (singletonInstance==null){
            singletonInstance=new Singleton();
        }
        return singletonInstance;
    }
}
