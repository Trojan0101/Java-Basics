public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Creating a thread by extending 'Thread' class.
        myThread thread1 = new myThread();

        //Creating a thread by using a class that implements 'Runnable' interface.
        myRunnable runnable1 = new myRunnable();
        Thread thread2 = new Thread(runnable1);

        //Start the threads
        thread1.start();
        thread1.join(3000);
        //Thread 2 will only start after Thread 1 dies because of join method.
        thread2.start();

    }
}
