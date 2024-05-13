package DesignPatterns.CodeToInterface;

public class DuckClass {
    public void swim (){
        System.out.println("I will swim no matter what");
    }
    public void display(){
        System.out.println("I am able to showcase my abilities");
    }
    FlyBehaviours flyBehaviours;
    QuackBehaviour quackBehaviour;

    public void performFly(){
        flyBehaviours.Fly();
    }

    public void makeSound(){
        quackBehaviour.MakeSound();
    }

}
