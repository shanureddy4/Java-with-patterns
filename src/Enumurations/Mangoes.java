package Enumurations;

/**
 * enums are just like classes but they cannot use as super class and they cannot extend others. (However all enums are extends Enum class)
 * Here Mangoes are referred as type and where as Rasapuri... all are constants
 * Enums are just like classes, Here we can call the constructor and do our jobs.
 * To access any constant we can just use type.constant -> Mangoes.Rasapuri.
 */
public enum Mangoes {
    Rasapuri(20) , Daseri(10) , Banginpalli(30) , Benisa(50), Rotten;

    private int price = -1;
    Mangoes(int price){
        this.price = price;
    }
    Mangoes(){

    }
    public int getPrice() {return price;}
}
