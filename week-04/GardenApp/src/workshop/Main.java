package workshop;

public class Main {

    public static void main(String[] args) {
    Plants daisy = new Flower("yellow");
    Plants tulip = new Flower("blue");
    Plants oak = new Tree("purple");
    Plants willow = new Tree("orange");

    Garden myGarden = new Garden();
    myGarden.addPlant(daisy);
    myGarden.addPlant(tulip);
    myGarden.addPlant(oak);
    myGarden.addPlant(willow);
    System.out.println(myGarden);
    myGarden.watering(40);
    System.out.println(myGarden);
    myGarden.watering(70);
    System.out.println(myGarden);
     }

}
