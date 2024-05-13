package Factory;
// it is literraly a factory. rather than using concrete classes, we can just use something to generate objects
public class Factory {
   static Animal AnimalFactory(String string) {
        if(string.equalsIgnoreCase("dog")) return new Dog();
        if(string.equalsIgnoreCase("cat")) return new Cat();
        else {
            throw new RuntimeException("No animal is present");
        }
    }

    public static void main(String[] args) {
        Animal animal = Factory.AnimalFactory("cat");
        animal.makeSound();
    }
}
interface Animal{
    void makeSound();
}
class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("barking");
    }
}
class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("hissing");
    }
}