public class ExceptionHandling {
    static class exception{
        static void subroutine() {//throws Exception{
            int d = 0;
            int a = 10 / d;
            //throw new ArithmeticException("madarchod");
        }
    }
    public static void main(String[] args) {//throws Exception {
        try {
            exception.subroutine();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("bhosdike");
        }

         exception.subroutine();
    }
}