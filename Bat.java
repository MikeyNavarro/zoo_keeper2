public class Bat extends Mammal{

  public Bat(){
    super(300);
  }

  public void fly(){
    System.out.println("the bat flaps its wings and takes off");
    changeEnergy(-50);
  }

  public void eatHumans(){
    changeEnergy(25);
  }

  public void attackTown(){
    System.out.println("The city is on fire from the bat attack");
    changeEnergy(-100);

  }
}