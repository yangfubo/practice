package practice.multiThread.waitMethod;

public class NotifyThread extends Thread {
    /**
     *
     */
    private String lock;

    public NotifyThread(String lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock){
            System.out.println(Thread.currentThread().getName()+":进入lock锁区块。"+System.currentTimeMillis());
            lock.notify();
            System.out.println(Thread.currentThread().getName()+":调用了notify()。"+System.currentTimeMillis());
            System.out.println(Thread.currentThread().getName()+":退出lock锁区块。"+System.currentTimeMillis());
        }
    }
}
