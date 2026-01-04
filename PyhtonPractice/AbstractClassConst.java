abstract class Animal {
 private int noofLeg;
 public abstract void makeSound();
 
 public Animal(int noofLeg){
  this.noofLeg = noofLeg;
 }
 public void sleep(){
   System.out.println("Zzz");
 }
 public void legCount(){
   System.out.println(noofLeg);
 }
}

class Dog extends Animal {
  public Dog(int noofLeg) {
  super(noofLeg);
  }
  public void makeSound(){
    System.out.println("Bark!!!");
  }
}

class Duck extends Animal {
  public Duck(int noofLeg) {
  super(noofLeg);
  }
  public void makeSound(){
    System.out.println("Pack!!!");
  }
}

public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello World");
    Animal dog = new Dog(4);
    dog.makeSound();
    dog.sleep();
    dog.legCount();
    Animal duck = new Duck(2);
    duck.makeSound();
    duck.sleep();
    duck.legCount();
  }
}