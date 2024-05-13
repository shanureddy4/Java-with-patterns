package DependencyInjection;

public class drawShape {
    Shape shape;
    public void setShape(Shape shape){
        this.shape = shape;
    }
    public void drawnow(){
        this.shape.draw();
    }
}
