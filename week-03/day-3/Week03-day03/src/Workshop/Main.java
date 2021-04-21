package Workshop;

public class Main {

  public static void main(String[] args) {

    PostIt p = new PostIt("orange", "Idea 1", "blue");
    PostIt a = new PostIt("pink", "Awsome", "blue");
    PostIt b = new PostIt("yellow", "Superb!", "green");

    System.out.println();

    BlogPost lorem =
        new BlogPost("Jhon Doe", "Lorem Ipsum", "Lorem Ipsum dolor sit amet", "2000.05.04");
    BlogPost wait =
        new BlogPost(
            "Tim Urban",
            "Wait but why?",
            "A popular long-form, stick-figure-illustrated blog.",
            "2010.10.10");
    BlogPost one =
        new BlogPost(
            "William Turton",
            "One Engineer Is Trying to Get IBM to Reckon With Trump",
            "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.",
            "2017.03.28");
    System.out.println(one.getPublicationDate());

    Animal lion = new Animal();
    lion.eat();
    System.out.println(lion.hunger);

    Sharpie marker = new Sharpie("black", 10.2f);
  }
}
