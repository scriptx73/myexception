public class LAB3 {

    public static void main(String[] args) {
        try {
            System.out.println("Statement1");
            System.out.println(1 / 0);
            System.out.println("Statement3");
        } catch (ArithmeticException e) {
        } finally {
            System.out.println("Statement 4");
        }
        System.out.println("statement 5");

    }
}
