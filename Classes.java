public class Classes {

    static class Box {
        double width;
        double height;
        double depth;

        double vol() {
            return width * height * depth;
        }

//        void setdimension(double h, double d, double w){
//            height = h;
//            width = w;
//            depth = d;
//        }

        //using constructor
        Box(double width, double height, double depth){
            this.width = width;
            this.height = height;
            this.depth = depth;
//            width = width;
//            height = height;
//            depth = depth;
        }
    }

    public static void main(String[] args) {
            Box mybox1 = new Box(10,20,15);
            Box mybox2 = new Box(4,16,40);

//            mybox1.setdimension(10,20,15);
//            mybox2.setdimension(3,6,9);
//        mybox1.width = 10;
//        mybox1.height = 20;
//        mybox1.depth = 15;
//
//        mybox2.width = 3;
//        mybox2.height = 6;
//        mybox2.depth = 9;

        System.out.println(mybox1.vol());
        System.out.println(mybox2.vol());
//        double vol;
//        vol = mybox1.width * mybox1.height * mybox1.depth;
//        System.out.println("Volume is " + vol);
//
//        vol = mybox2.width * mybox2.height * mybox2.depth;
//        System.out.println("Volume is " + vol);
    }
}
