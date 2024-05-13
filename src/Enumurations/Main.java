package Enumurations;

public class Main {
    public static void main(String[] args) {
//        for(Apple e : Apple.values()){
//            System.out.println(e);
//        }
        for(Mangoes m : Mangoes.values()){
            System.out.println(m.getPrice());
        }
        System.out.println( Mangoes.valueOf("Daseri"));
    }
}
