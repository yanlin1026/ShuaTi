package 真题练习;

/**
 * @auther: yanlin
 * @date: 2018/9/10 22:06
 * @description:
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class clazz = classLoader.loadClass("真题练习.A");
        System.out.print("Main");
        clazz.forName("真题练习.A");
    }

}

class A {

    static {
        System.out.println("父类静态块");
    }

}


