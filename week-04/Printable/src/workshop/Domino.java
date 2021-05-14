package workshop;

public class Domino implements Printable{
 int sideA;
 int sideB;

 public Domino(){
  sideA = 3;
  sideB = 2;
 }


 @Override
 public void printAllFields() {
    System.out.println("Domino A side: "+sideA+", B side: "+sideB);
 }
}
