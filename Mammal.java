public class Mammal{
  protected double energy;

  // Constructor for Mammal class that sets a default energy of 100

  public Mammal(){
    this.energy = 100;
  }
  public Mammal(int energy){
    this.energy = energy;
  }

  // Get Energy

public double getEnergy(){
  return this.energy;
}


  // an overloaded method that takes one argument and returns total energy

  public double changeEnergy(double energy){
    this.energy += energy;
    System.out.println(this.energy);
    return this.energy;
  }


}