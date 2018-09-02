import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author yanlin
 */
public class Main {

    final static int corePoolSize = 5;
    //池中允许的最大线程数。
    final static int maximumPoolSize = 10;
    //当线程数大于核心线程时，此为终止前多余的空闲线程等待新任务的最长时间
    final static long keepAliveTime = 200;
    //执行前用于保持任务的队列5，即任务缓存队列
    final static ArrayBlockingQueue<Runnable> workQueue =new ArrayBlockingQueue<Runnable>(5);


    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("测试");
        System.out.println("windows测试");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.MINUTES,	workQueue);

        //线程池去执行15个任务
        for (int i = 0; i < 15; i++) {
            MyRunnable myRunnable = new MyRunnable(i);
            threadPoolExecutor.execute(myRunnable);
            System.out.println("线程池中现在的线程数目是："+threadPoolExecutor.getPoolSize()+",  队列中正在等待执行的任务数量为："+
                    threadPoolExecutor.getQueue().size());
        }
        //关掉线程池
        threadPoolExecutor.shutdown();
    }

    private static class MyRunnable implements Runnable {
        private int num;
        public MyRunnable(int num) {
            this.num = num;

        }

        @Override
        public void run() {
            System.out.println("正在执行的MyRunnable " + num);
            try {
                Thread t1 = Thread.currentThread();
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyRunnable " + num + "执行完毕");
        }
    }
}
