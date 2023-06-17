public class Recursion {
    public static void main(String[] args) {

        recursion(1);
        // for understanding recursion
//        call1(1);
//    }
//
//    public static void call1(int n){
//        System.out.println(n);
//        call2(2);
//    }
//    public static void call2(int n){
//        System.out.println(n);
//        call3(3);
//    }
//    public static void call3(int n){
//        System.out.println(n);
    }

        // now basic recursion code
        static void recursion(int n){
//            if (n == 6){
//                System.out.println(n);
//                return;
//            }
            System.out.println(n);
            recursion(n + 1);
        }
}
