public class MultiThread2 {
    public static void main(String[] args) {
        java.util.ArrayList<Thread> threadList = new java.util.ArrayList<Thread>();

<<<<<<< HEAD
        Thread th = new Thread(new SampleX(1));
        th.setPriority(10);
=======
        //an ArrayList with Threads as data type to store Thread objects, each have a SampleX's object
        ArrayList<Thread> threadList = new ArrayList<Thread>();

        Thread th = new Thread(new SampleX(1));
        th.setPriority(10);

        threadList.add(th); //for thread named 1
        threadList.add(new Thread(new SampleX(2))); //for thread named 2
        threadList.add(new Thread(new SampleX(3))); //for thread named 3
        threadList.add(new Thread(new SampleX(4))); //for thread named 4
        threadList.add(new Thread(new SampleX(5))); //for thread named 5
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3

		threadList.add(th);
        threadList.add(new Thread(new SampleX(2)));
        threadList.add(new Thread(new SampleX(3)));
        threadList.add(new Thread(new SampleX(4)));
        threadList.add(new Thread(new SampleX(5)));

        for (Thread eachItem : threadList) {
            eachItem.start();
            try {
                eachItem.sleep(2000);
            } catch (Exception ex) {
                System.err.println(ex);
            }
        }
    }
}

class SampleX implements Runnable {
    int threadNum;

    SampleX(int a) {
        threadNum = a;
    }

    @Override
    public void run() {
        while (true) {
            for (int counter = 1; counter <= threadNum; counter++)
                System.out.print("\t");
            System.out.println(threadNum);
        }
    }
}