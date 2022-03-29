public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Finding the number of active threads
        System.out.println(Thread.activeCount());

        //Finding the name of the active threads
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MAIN THREAD");
        System.out.println(Thread.currentThread().getName());

        //Finding the priority of the active threads
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getPriority());

        //Finding if a thread is alive
        System.out.println(Thread.currentThread().isAlive());

        //Thread sleep
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Thread execution is done!!!");

        //Creating a thread
        myThread thread2 = new myThread();
        System.out.println(thread2.isAlive());
        thread2.start();
        System.out.println(thread2.isAlive());

        //Setting daemon thread
        System.out.println("Is Daemon: " + thread2.isDaemon());
        thread2.setDaemon(true);
        System.out.println("Is Daemon: " + thread2.isDaemon());

        System.out.println("Active: " + thread2.activeCount());
    }
}
