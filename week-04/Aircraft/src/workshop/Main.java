package workshop;

public class Main {

    public static void main(String[] args) {
	// write your code here
  Aircraft val = new F16();
    System.out.println(val.baseDamage);
    //val.refillAmmo(300);
    //val.fight();
    //System.out.println(val.getStatus());
    Carrier carrier = new Carrier(300,200);
    carrier.add(val);
    System.out.println(carrier.getStatus());
    }
}
