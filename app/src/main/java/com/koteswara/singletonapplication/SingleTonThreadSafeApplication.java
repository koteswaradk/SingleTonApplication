package com.koteswara.singletonapplication;

import android.app.Application;

public class SingleTonThreadSafeApplication extends Application {

    //because of the cost associated with the synchronized method, although we need it only for the first few threads who might create the separate instances (Read: Java Synchronization). To avoid this extra overhead every time, double checked locking principle is used. In this approach, the synchronized block is used inside the if condition with an additional check to ensure that only one instance of a singleton class is created.
    //The following code snippet provides the double-checked locking implementation.
    private static SingleTonThreadSafeApplication singleTonApplication;
    private SingleTonThreadSafeApplication(){ }

    public static SingleTonThreadSafeApplication getApplicationInstance(){
        if (singleTonApplication==null){
            synchronized (SingleTonThreadSafeApplication.class){
                if (singleTonApplication==null){
                    singleTonApplication= new SingleTonThreadSafeApplication();
                }
            }
        }
        return singleTonApplication;
    }

}




