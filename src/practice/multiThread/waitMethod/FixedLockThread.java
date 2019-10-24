package practice.multiThread.waitMethod;

public class FixedLockThread extends Thread {
    /**
     *
     */
    private String fixedLock = "fix";
    @Override
    public void run() {
        synchronized (fixedLock){
            System.out.println(Thread.currentThread().getName()+":进入fixedLock锁区块。"+System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":退出fixedLock锁区块。"+System.currentTimeMillis());
        }
    }
}
