/**
 * @auther: yanlin
 * @date: 2018/9/3 21:53
 * @description:
 */
public class T{


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1+runing"+System.currentTimeMillis());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2+runing"+System.currentTimeMillis());
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t3+runing"+System.currentTimeMillis());
            }
        });

        System.out.println("创建完成"+System.currentTimeMillis());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("运行完成"+System.currentTimeMillis());

    }
}
