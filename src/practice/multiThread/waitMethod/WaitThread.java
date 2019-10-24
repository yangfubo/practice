package practice.multiThread.waitMethod;

public class WaitThread extends Thread {

    private String lock;

    /**
     *
     */
    private String fixedLock = "fix";

    public WaitThread(String lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (fixedLock){
            System.out.println(Thread.currentThread().getName()+":进入fixedLock锁区块。"+System.currentTimeMillis());
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+":进入lock锁区块。"+System.currentTimeMillis());
                try {
                    System.out.println(Thread.currentThread().getName()+":调用wait。"+System.currentTimeMillis());
                    lock.wait();
                    System.out.println(Thread.currentThread().getName()+":被唤醒。"+System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":离开lock锁区块。"+System.currentTimeMillis());
            }
            System.out.println(Thread.currentThread().getName()+":离开fixedLock锁区块。"+System.currentTimeMillis());
        }
    }

    public void anotherFixedLock() throws InterruptedException {
        synchronized (fixedLock){
            System.out.println(Thread.currentThread().getName()+":another进入fixedLock锁区块。"+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+":2s后another退出fixedLock锁区块。"+System.currentTimeMillis());
        }
    }
}
