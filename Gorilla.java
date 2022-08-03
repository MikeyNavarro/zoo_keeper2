public class Gorilla extends Mammal {

  public void throwSomething(){
    System.out.println("Gorilla has thrown an item");
    changeEnergy(-5);
  }

  public void eatBannas(){
    System.out.println("Gorilla is satisfied");
    changeEnergy(10);
  }

  public void climb(){
    System.out.print("The Gorilla has climbed up a tree");
    changeEnergy(-10);
  }
}
