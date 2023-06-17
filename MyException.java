public class MyException {
    static class myexception extends Throwable {
        public myexception(String msg){
            super(msg);
        }
    }
    public static void main(String[] args) throws myexception {
        String name = "bhavin";
        if (name.equals("bhavin")) {
            throw new myexception("name is bhavin");
        }
    }
}