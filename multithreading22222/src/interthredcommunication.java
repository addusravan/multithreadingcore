
// THREAD RELEASES LOCK OF OBJECT ONLY IN WAIT,NOTIFY AND NOTIFYALL METHOD
//for updation relating things its beter to go with wait and notify compared to sleep and join but we can call this methods in only syncronized area




class InterThreadCommunication  extends  Thread{
    int Total=0;

    @Override
    public void run() {

        synchronized (this) {
            System.out.println("CHILD THREAD IS EXECUTING");
        for (int i = 1; i <= 100; i++) {
            Total = Total + i;
        }

            System.out.println("CHILD THREAD  IS TRYING NOTIFY   TO MAIN");

            this.notify();




        }
        System.out.print(2*Total);


    }

}
