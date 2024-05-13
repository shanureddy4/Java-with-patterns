package DesignPatterns.CodeToInterface;

public class Squeak implements QuackBehaviour {
    @Override
    public void MakeSound() {
        System.out.println("I can squeak");
    }
}
