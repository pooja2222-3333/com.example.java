package com.example.java;

import static java.lang.Thread.*;

class Hi implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("Hi");
            try {
                sleep(500);
            } catch (InterruptedException e){}

        }
        }
    }


class Hello implements Runnable {
    public void run(){
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("Hello");
            try {
                sleep(500);
            } catch (InterruptedException e) {}


        }
    }
}

public class ThreadDemo {
    public static void main(String[] args)  {
        Runnable obj1=new Hi();
         Runnable obj2=new Hello();


        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);


     t1.start();
        try {
            sleep(10);
        } catch (InterruptedException e) {}
        t2.start();

    }
}
