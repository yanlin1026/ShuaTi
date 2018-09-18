/**
 * @author yanlin
 */
public class Main {


    public static void main(String[] args) {

        try {
            System.out.println("try");
            int a = 6 / 0;
            System.out.println("lllll");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }

        System.out.println("end");
    }

}
