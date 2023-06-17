public class PrimeException {
//    static class myexception extends Throwable{
//        public String toString() {
//            return "exception";
//            //return new String("exception");
//        }
        static class check{
            public static void logic(int n) throws Exception {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0){
                        System.out.println("prime number");
                    }
                    else {
                        throw new Exception("not prime");
                    }
                }
            }
        }
//    }

    public static void main(String[] args) throws Exception {
        try{
            check.logic(12);
        }//catch (Exception e){
            //System.out.println(e);
        finally {

        }
    }
}