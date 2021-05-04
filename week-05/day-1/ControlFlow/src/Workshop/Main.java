package Workshop;

public class Main {

    public static void main(String[] args) {

        double length = 8;
        double width = 6;
        double height = 5;
        cuboidVolume(length,width,height);
        cuboidSurface(length,width,height);
    }
    public static void cuboidVolume(double length,double width, double height){
       double volume = length*width*height;
        System.out.println(volume);
    }
    public static void cuboidSurface(double length,double width, double height){
      double surface =0;
      surface=2*(length*width+width*height+height*length);
    System.out.println(surface);
    }
}
