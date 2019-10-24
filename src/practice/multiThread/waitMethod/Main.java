package practice.multiThread.waitMethod;

public class Main {

    /**
     * 此用例说明xxx.wait()方法只释放xxx锁
     *
     * @author yangfubo
     * @param
     * @return
     */
    public static void main(String[] args) throws InterruptedException {
        String lock = "lock";
        WaitThread waitThread = new WaitThread(lock);
        waitThread.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        for (int i=0;i<5;i++){
            FixedLockThread fixedLockThread = new FixedLockThread();
            fixedLockThread.start();
        }
        System.out.println("所有线程启动完毕："+System.currentTimeMillis());
        Thread.sleep(1000);
        waitThread.anotherFixedLock();
        waitThread.join();
        System.out.println("main方法完成！");
    }

    /**
     Thread-0:进入fixedLock锁区块。1545289872026
     Thread-0:进入lock锁区块。1545289872026
     Thread-0:调用wait。1545289872026
     所有线程启动完毕：1545289872027
     Thread-1:进入lock锁区块。1545289877026
     Thread-1:调用了notify()。1545289877026
     Thread-1:退出lock锁区块。1545289877026
     Thread-0:被唤醒。1545289877026
     Thread-0:离开lock锁区块。1545289877026
     Thread-0:离开fixedLock锁区块。1545289877026
     main:another进入fixedLock锁区块。1545289877026
     main:2s后another退出fixedLock锁区块。1545289879027
     main方法完成！
     Thread-6:进入fixedLock锁区块。1545289879027
     Thread-6:退出fixedLock锁区块。1545289880027
     Thread-5:进入fixedLock锁区块。1545289880027
     Thread-5:退出fixedLock锁区块。1545289881028
     Thread-4:进入fixedLock锁区块。1545289881028
     Thread-4:退出fixedLock锁区块。1545289882028
     Thread-3:进入fixedLock锁区块。1545289882028
     Thread-3:退出fixedLock锁区块。1545289883029
     Thread-2:进入fixedLock锁区块。1545289883029
     Thread-2:退出fixedLock锁区块。1545289884030
     */
}
