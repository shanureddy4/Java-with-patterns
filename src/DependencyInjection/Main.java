package DependencyInjection;

public class Main {
    public static void main(String[] args) {

        drawShape ds = new drawShape();
        ds.setShape(new Circle());
        ds.drawnow();
    }
}
