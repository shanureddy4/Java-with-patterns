package DesignPatterns.CodeToInterface;

public class Seaduck extends DuckClass{
//    Seaduck(){
//        flyBehaviours = new FlyWithWIngs();
//        quackBehaviour = new Squeak();
//    }
    void setFly(FlyBehaviours fly){
        this.flyBehaviours = fly;
    }
    void setQuack(QuackBehaviour quack){
        this.quackBehaviour = quack;
    }

    public static void main(String[] args) {
        Seaduck sd = new Seaduck();
        sd.setFly(new FlyWithWIngs());
        sd.setQuack(new Squeak());
        sd.makeSound();
        sd.performFly();
    }
}
