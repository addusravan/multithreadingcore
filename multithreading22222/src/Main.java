public class Main {
    public static void main(String[] args)  throws InterruptedException{
        InterThreadCommunication b=new  InterThreadCommunication();
        b.start();
        Thread.sleep(10000);

        synchronized (b) {
            System.out.println("MAIN THREAD IS TRYING TO CALL WAIT METHOD");
            b.wait();
            System.out.println("MAIN THREAD IS WAITING FOR NOTIFICATION");
            System.out.println(b.Total);


        }




    }
}