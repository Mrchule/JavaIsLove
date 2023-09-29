package Java.Practice;

interface Animal {
    void eat();
}
interface Cat{
    void eat();
}

class Dog implements Animal ,Cat {
    @Override
  public void eat() {
        System.out.println("Dog eating");
    }
 
}

public class Mainn {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Prints "Dog eating"
    }
}
