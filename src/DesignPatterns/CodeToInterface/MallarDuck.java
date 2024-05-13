package DesignPatterns.CodeToInterface;
// Kind of dynamic but not fully
public class MallarDuck extends DuckClass{
    MallarDuck(){
        flyBehaviours = new FlyWithWIngs();
        quackBehaviour = new Squeak();
    }

    public static void main(String[] args) {
        MallarDuck md = new MallarDuck();
        md.swim();
        md.display();
        md.makeSound();
        md.performFly();
    }
}
