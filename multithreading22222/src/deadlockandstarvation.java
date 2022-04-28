//if two threads are waiting for each other forever is known as deadlock



import java.io.*;
import java.util.*;


class A {


    public synchronized void last()
    {

        // Print and display statement
        System.out.println("Inside A, last() method");
    }


    public synchronized void d1(B b)
    {
        System.out.println(
                "Thread1 start execution of d1() method");

        // Try block to check for exceptions
        try {


            Thread.sleep(2000);
        }


        catch (InterruptedException e) {
            // Display the exception on the console
            System.out.println(e);
        }

        // Display statement
        System.out.println(
                "Thread trying to call B's last() method");

        // Calling the method 1 of this class as created
        // above
        b.last();
    }
}


class B {


    public synchronized void last()
    {


        System.out.println("Inside B, last() method");
    }


    public synchronized void d2(A a)
    {


        System.out.println(
                "Thread2 start execution of d2() method");

        try {

            Thread.sleep(2000);


        }
        catch (InterruptedException e) {


            System.out.println(e);
        }


        System.out.println(
                "Thread2 trying to call A's last method");


        a.last();
    }
}


class GFG extends Thread {


    A a = new A();


    B b = new B();

    // Method 1
    public void m1()
    {


        this.start();


        a.d1(b);
    }


    public void run()
    {


        b.d2(a);
    }



    public static void main(String[] args)
    {


        GFG deadlock = new GFG();


        deadlock.m1();
    }
}
